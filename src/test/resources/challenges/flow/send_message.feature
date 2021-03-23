Feature: Send message
    Send message to the Email Server

    Scenario Outline: User sends a message
        Given A User sends an ""<message>"" message
        When The message is converted by the Adapter
        Then The Message server should contain the ""<message>"" message in the queue

    Examples:
        | message |
        | hello   |
