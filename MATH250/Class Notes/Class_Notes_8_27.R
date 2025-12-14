# class notes for Wed. Aug 27th

library(readxl)
scooby <- read_excel('scooby.xlsx')

mean(scooby$imdb) #NA propagation

?mean #help 

#vertically align arguments for readability - R ignores white space
mean(scooby$imdb, 
     na.rm = TRUE) # ignore NAs with na.rm

# Which shows have the best imdb ratings? 

library(tidyverse)

#3 pieces needed - dataset, variables/varaible display, plot type
?ggplot 

ggplot(scooby,
       aes(y = series_name, x = imdb, colour = network) #aesthetics - specify variables
       ) + #add a layer w/ graph type
  geom_boxplot()

glimpse(scooby)

sum(scooby$captured_daphnie, na.rm = TRUE) +
  sum(scooby$captured_velma, na.rm = TRUE)

sum(scooby$captured_fred, na.rm = TRUE) +
  sum(scooby$captured_shaggy, na.rm = TRUE) +
   sum(scooby$captured_scooby, na.rm = TRUE)

sum(scooby$captured_daphnie & scooby$unmask_daphnie, na.rm = TRUE) + 
  sum(scooby$captured_velma & scooby$unmask_velma, na.rm = TRUE)

sum(scooby$captured_fred & scooby$unmask_fred, na.rm = TRUE) + 
  sum(scooby$captured_shaggy & scooby$unmask_shaggy, na.rm = TRUE) + 
  sum(scooby$captured_scooby & scooby$unmask_scooby, na.rm = TRUE)
       
