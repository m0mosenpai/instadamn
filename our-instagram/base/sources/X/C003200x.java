package X;

/* renamed from: X.00x, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C003200x {
    public int A00;
    public int A01;
    public int A02;
    public int[] A03;

    public C003200x() {
        int highestOneBit = Integer.bitCount(8) != 1 ? Integer.highestOneBit(7) << 1 : 8;
        this.A00 = highestOneBit - 1;
        this.A03 = new int[highestOneBit];
    }
}
