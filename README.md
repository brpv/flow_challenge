# Challenges

In order to complete the challenges ahead, you need to previously install the [Flow](https://github.com/sergiospinto/flow) Framework. To do that, please run the following commands in the command line:


```shell
git clone https://github.com/sergiospinto/flow
cd flow
mvn install
```


# 1. Email Test

### Scenario: User sends a message to a Message Server.

Implement code in so that the following Acceptance Criteria is met:

```gherkin
Given A User sends an "hello" message
When The message is converted by the Adapter
Then The Message server should contain the "hello" message in the queue
```

# Solution

### Feature code implementation

In order to implement the solution without changing the EmailTest class (I assumed it couldn't be edited besides sending the message) some classes needed to be developed. At the very least a UserAgent and EmailAdapter classes were necessary although I decided to develop a class for every Flow component needed in order to keep code modularity high.

### Test development

As the test description sent was based on BDD (Behaviour Driven Development) I decided to not only complete the code but to write a test using [Cucumber](https://cucumber.io/). So I wrote a *.feature file describing the test and developed the test.
