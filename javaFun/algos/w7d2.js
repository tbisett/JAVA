// adding new nodes or data to singly linked lists

class Node{
    constructor(value) {
        this.value = value;
        this.next = null;
    }
}

class SLL{
    constructor(){
        this.head = null;
    }

    isEmpty(){
        if (this.head) {
            return false;
        } else {
            console.log("is empty is true")
            return true;
        }
        
    }
    
    
    // when a pointer is to the LEFT of an equal sign, we are CHANGING it
    // when a pointer is to the RIGHT of an equal sign, we are READING it

    // add given node to the head, if it exists.
    // is the list empty?
    // does the list already have nodes?
    addToFront(node) {
        if (this.isEmpty()) {
            this.head = node
            this.head.next = null
            console.log("is true")
        } else { 
            node.next = this.head
            this.head = node
        }
        
    }

    // create a new node with given data, add it to the head. return void
    addDataToFront(data) {
        let node = new Node(data)
        if (this.isEmpty()) {
            this.head = node
            this.head.next = null
            console.log("is true")
        } else { 
            node.next = this.head
            this.head = node
        }
    }
}
let n1 = new Node(22)
var myList = new SLL();
myList.addToFront(n1)
console.log(myList.head)
console.log(myList)
myList.addDataToFront(55)
console.log(myList)
// instantiate the SLL first!

// myList.addToFront(node)

// myList.addDataToFront(data);