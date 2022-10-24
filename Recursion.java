public int recursionImproved(int p) {
  if (p > 1) {                       
   p = p * recursionImproved(--p);       
  }
  return p;
}
