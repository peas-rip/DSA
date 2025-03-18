 Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

        int maxVowels = 0; // Store the maximum number of vowels
        int currentVowels = 0;

        // Step 1: Initialize the first window of size k
        for (int i = 0; i < k; i++) {
            if (vowels.contains(s.charAt(i))) {
                currentVowels++;
            }
        }
        maxVowels = currentVowels;

        // Step 2: Slide the window across the string
        for (int i = k; i < s.length(); i++) {
            // Add new character (right side of window)
            if (vowels.contains(s.charAt(i))) {
                currentVowels++;
            }
            // Remove old character (left side of window)
            if (vowels.contains(s.charAt(i - k))) {
                currentVowels--;
            }

            // Update the maximum vowel count
            maxVowels = Math.max(maxVowels, currentVowels);
        }

        return maxVowels;
