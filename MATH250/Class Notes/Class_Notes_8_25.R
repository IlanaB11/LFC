# acting as a text file that gets opened by R
# run with command/control enter

5 + 7 

# install.packages("tidyverse")
library(tidyverse)

# read scooby data set

library(readxl)
scooby <- read_excel("scooby.xlsx")
View(scooby) #some older functions are capitialized - common to cause errors

# interacting with the scooby dataset
glimpse(scooby) #overview of the data 

mean(scooby$run_time)

mean(scooby$imdb) # results in NA since the column contains NAs - propagation
