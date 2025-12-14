#Class Notes from Fri Aug 29 2025

#load libraries
library(readxl)
library(tidyverse)

#open scooby dataset
scooby <- read_excel('scooby.xlsx')

#what is the distribution of imdb ratings
# hist(scooby$imdb)
#using ggplot
ggplot(scooby, aes(x = imdb)) + #aesthetics are an aspect of the varibles on the plot
  geom_histogram(binwidth = 0.5, #bins are an aspect of the histogram
                 color = 'black', #only colors the outline/boundry
                 fill = 'maroon') #fill colors the inside
# use colors() to view color options
#change the number of bins w/ bins or binwidth - default 30
#count is not a variable - it is computed for us so it isn't an aesthetic  

ggplot(scooby, aes(x = imdb)) +
  geom_histogram(binwidth = 0.5, 
                 color = 'black', 
                 fill = 'maroon') + 
  labs(x = 'IMDB', #labels
       y = "Frequency", 
       title = "Scooby Doo Ratings" ) + 
  theme_minimal() #theme packages make by people who know graphic design

#start with the wise scope and narrow down to the nitpicky details

#use arrows to toggle between graphs
ggplot(scooby, aes(x = imdb)) +
  geom_freqpoly() #frequency polygon

ggplot(scooby, aes(x = imdb)) +
  geom_density() 

# multiple graphs on one plot 
ggplot(scooby, aes(x = imdb)) +
  geom_histogram(alpha = 0.65) + #alpha - changes transparency
  geom_freqpoly()

#categorical variable
ggplot(scooby, aes(x = format, fill = format)) + 
  geom_bar(color = "black") + 
  labs(x = "Format", 
       y = "Frequency", 
       title = "Scooby-Doo Show Format", 
       fill = "Format" #label the legend
       ) +  
  theme_minimal()

# Two quantitative variables
ggplot(scooby, aes(x = date_aired,
                   y = imdb)) + 
  geom_point()


