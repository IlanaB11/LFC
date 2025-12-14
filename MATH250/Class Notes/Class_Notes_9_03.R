#load libraries
library(tidyverse)

#load built in dataset 
View(penguins)

#help command can be used on built in datasets
?penguins

# go to geoms
# 1 qu: geom_hist
# 1 cat: geom_bar
# 2 qu: geom_point
# 1 qu, 1 cat : geom_box

# only add a 3rd visual if it does not distract from main point - know your point

#make a scatter plot
ggplot(penguins, aes(x = bill_len,
                     y = bill_dep)) + 
  geom_point(color = "steelblue") + 
  labs(y = 'Bill Length', 
       x = 'Bill Depth', 
       title = 'Penguin Bill Size', 
       subtitle = 'Look at them go', 
       caption =' Kaye, E., Turner, H., Gorman, K. B., Horst, A. M. and Hill, A. P. (2025)') + 
  theme_minimal() 

#color by species - now color is now aes because it is coming from the data
ggplot(penguins, aes(x = bill_len, 
                     y = bill_dep, 
                     color = species)) + 
  geom_point() + 
  labs(y = 'Bill Length', 
       x = 'Bill Depth', 
       title = 'Penguin Bill Size', 
       subtitle = 'Look at them go', 
       caption =' Kaye, E., Turner, H., Gorman, K. B., Horst, A. M. and Hill, A. P. (2025)') +
  scale_color_brewer(palette = "Dark2") + # change the color palate for the color aes
  theme_minimal() 

ggplot(penguins, aes(x = bill_len, 
                     y = bill_dep, 
                     color = species)) + 
  geom_point() + 
  geom_smooth() + # start to add a regression line
  labs(y = 'Bill Length', 
       x = 'Bill Depth', 
       title = 'Penguin Bill Size', 
       subtitle = 'Look at them go', 
       caption =' Kaye, E., Turner, H., Gorman, K. B., Horst, A. M. and Hill, A. P. (2025)') +
  scale_color_brewer(palette = "Dark2") + 
  theme_minimal() 
