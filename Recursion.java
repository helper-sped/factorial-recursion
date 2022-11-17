public int recursionImprovedAgain(int i) {
  if (i == 1) return 1;                     
  return p * recursionImprovedAgain(i-1);
}
