package X;

/* renamed from: X.1xt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42651xt {
    public int A00;
    public int A01;
    public int A02;
    public Object[] A03;

    public C42651xt() {
        int numberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(15));
        this.A00 = numberOfLeadingZeros - 1;
        this.A01 = (int) (0.75f * numberOfLeadingZeros);
        this.A03 = new Object[numberOfLeadingZeros];
    }
}
