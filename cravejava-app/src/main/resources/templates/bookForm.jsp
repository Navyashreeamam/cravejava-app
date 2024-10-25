<form action="/books" method="post">
    <label>Title:</label>
    <input type="text" name="title" required>

    <label>ISBN:</label>
    <input type="text" name="isbn" required>

    <label>Author:</label>
    <select name="authorId" required>
        <c:forEach items="${authors}" var="author">
            <option value="${author.id}">${author.name}</option>
        </c:forEach>
    </select>

    <button type="submit">Add Book</button>
</form>
