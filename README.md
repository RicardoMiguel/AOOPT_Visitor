# Visitor exercise

Write a figures hierarchy (Figure, Circle, Square, Triangle - every side equal). Use the Visitor pattern to add to them the following methods: 'area', 'move', 'scale'.

How to use it.
```
Method s2 = new Scale(2);
Method s3 = new Scale(3);
Figure[] figures=...;
for (Figure f: figures)
    f.call(s2); //and not f.scale(2);
```