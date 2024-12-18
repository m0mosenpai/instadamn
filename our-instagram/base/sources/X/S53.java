package X;

/* loaded from: classes10.dex */
public abstract class S53 {
    public static final int[] A00(String str) {
        char[] charArray = str.toCharArray();
        C14360o3.A07(charArray);
        int length = charArray.length;
        int[] iArr = new int[length];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            iArr[i2] = Character.getNumericValue(charArray[i]);
            i++;
            i2++;
        }
        return iArr;
    }
}
