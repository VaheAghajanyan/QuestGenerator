# Quest Generator

This project contains a Java implementation of a quest reward generator for the game Idle Outpost. The generator produces a sequence of rewards, where each reward can either be a bronze chest ('b') or a silver chest ('s'). The probability of getting 'b' is higher at the beginning of the sequence and decreases towards the end, while the probability of getting 's' increases accordingly.

## Overview

The generator uses two `StringBuilder` objects to create the sequence of rewards. The sequence is divided into segments, and each segment has a flexible probability distribution for 'b' and 's' based on the segment's index and the total counts of 'b' and 's'. The probabilities are adjusted dynamically to ensure a gradual transition from predominantly 'b' to predominantly 's'.

## How It Works

1. **StringBuilders**:
    - The first `StringBuilder` holds the initial part of the sequence where the probability of 'b' is higher.
    - The second `StringBuilder` holds the latter part of the sequence where the probability of 's' is higher.

2. **Segment Division**:
    - The sequence is divided into several segments based on the input size `N`.
    - Each segment has a flexible probability for 'b' and 's', controlled by an index and counts of 'b' and 's'.

3. **Probability Distribution**:
    - The percentage of 'b' and 's' in each segment is determined using appropriate methods.
    - The segments are populated with 'b' and 's' according to the calculated probabilities, ensuring a smooth transition.

## Usage

To generate a sequence of quests, use the `generateQuests` method with the desired length `N`.