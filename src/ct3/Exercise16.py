import numpy as np
import matplotlib.pyplot as plt

# Define a higher resolution range of values for n
n_values = np.arange(1, 20)

# Calculate the time complexity for Program A and Program B
time_complexity_A = 1000 * n_values**2
time_complexity_B = 2**n_values

# Find the intersection point
intersection_n = next(n for n, (a, b) in enumerate(zip(time_complexity_A, time_complexity_B), start=1) if a < b)

# Plot the time complexities with higher resolution
plt.plot(n_values, time_complexity_A, label='Program A (1000 * n^2)')
plt.plot(n_values, time_complexity_B, label='Program B (2^n)')

# Mark the intersection point
plt.scatter([intersection_n], [1000 * intersection_n**2], color='red', label=f'Intersection (n={intersection_n:.2f})')

# Add labels and legend
plt.xlabel('n')
plt.ylabel('Time Complexity')
plt.title('Comparison of Time Complexities')
plt.legend()

# Show the plot
plt.show()
