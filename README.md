1. Read JSON data through HTTP get method. Give the sub string to get the data from total number of pages. created JSON objects for getting the data and convert the string to JSON data. I have used array list for collection of data for substring and atlast sorted the data by using collections sort method.
2. Give number of elements in an array(n)
   Give the array elements
   Get the answer for maximum difference in an array
3. ^(?=(?:(?:[ac]*[bd]){2})*[ac]*$)(?:(?:[bd]*[ac]){2})*[bd]*$
   Explanation:
   (?= start the lookahead
   (?:(?:[ac]*[bd]){2})* look for any number of a or c, followed by one b or d which is 2 times, so we can get an even number.
   [ac]* if there are a or c left
   $ match the end of the string
   The same flow has been repeated for starting with b and d.
