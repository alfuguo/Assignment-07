# Assignment-07
 In this assignment you'll need to apply your new knowledge of unit testing and test driven development.

Using Test Driven Development, your goal is to add new functionality (as well as refactor) your code from Assignment 5.

You will need to add to the functionality of your CustomArrayList based on this newly updated interface:

> [!NOTE]
> Q1: This method should add a new item into the <code>CustomList</code> and should return <code>true</code> if it was successfully able to insert an item.
> 
> @param item the item to be added to the <code>CustomList</code>
> 
> @return <code>true</code> if item was successfully added, <code>false</code> if the item was not successfully added (note: it should always be able to add an item to the list)


> [!NOTE]
>      *This method should add a new item into the <code>CustomList</code> at the specified index (thus shuffling the other items to the right). If the index doesn't yet exist, then you should throw an <code>IndexOutOfBoundsException</code>.
> 
>      @param index the spot in the zero-based array where you'd like to insert your new item
> 
>      @param item the item that will be inserted into the <code>CustomList</code>
> 
>      @return <code>true</code> when the item is added
> 
>      @throws IndexOutOfBoundsException

> [!NOTE]
>    This method should return the size of the <code>CustomList</code>
> 
>      based on the number of actual elements stored inside of the <code>CustomList</code>
> 
>      @return an <code>int</code> representing the number of elements stored in the <code>CustomList</code>

> [!NOTE]
>       This method will return the actual element from the <code>CustomList</code> based on the index that is passed in.
> 
>      @param index represents the position in the backing <code>Object</code> array that we want to access
> 
>      @return The element that is stored inside of the <code>CustomList</code> at the given index
> 
>      @throws IndexOutOfBoundsException

> [!NOTE]
>      This method should remove an item from the <code>CustomList</code> at the specified index. This will NOT leave an empty <code>null</code> where the item was removed, instead all other items to the right will be shuffled to the left.
> 
>      * @param index the index of the item to remove
> 
>      * @return the actual item that was removed from the list
> 
>      * @throws IndexOutOfBoundsException
![Screenshot 2024-03-30 110533](https://github.com/alfuguo/Assignment-07/assets/137233519/719cbeba-cb5c-4f37-94ce-4f375b9aa5fa)


