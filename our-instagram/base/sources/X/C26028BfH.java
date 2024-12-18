package X;

/* renamed from: X.BfH, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26028BfH extends C0T6 {
    public final float A00;
    public final float A01;
    public final float A02;
    public final C41551w4 A03;
    public final C141596ac A04;
    public final String A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26028BfH) {
                C26028BfH c26028BfH = (C26028BfH) obj;
                if (!C14360o3.A0K(this.A03, c26028BfH.A03) || !C14360o3.A0K(this.A05, c26028BfH.A05) || Float.compare(this.A01, c26028BfH.A01) != 0 || Float.compare(this.A02, c26028BfH.A02) != 0 || !C14360o3.A0K(this.A04, c26028BfH.A04) || Float.compare(this.A00, c26028BfH.A00) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public C26028BfH(C41551w4 c41551w4, C141596ac c141596ac, float f, float f2, float f3) {
        String A00 = AbstractC111324zv.A00(1085);
        this.A03 = c41551w4;
        this.A05 = A00;
        this.A01 = f;
        this.A02 = f2;
        this.A04 = c141596ac;
        this.A00 = f3;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A01(AbstractC166997dE.A0J(this.A04, AbstractC166997dE.A00(AbstractC166997dE.A00(AbstractC166997dE.A0K(this.A05, AbstractC166987dD.A0G(this.A03)), this.A01), this.A02)), this.A00);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("LongPressGestureEventInfo(model=");
        A1C.append(this.A03);
        A1C.append(", gestureType=");
        A1C.append(this.A05);
        A1C.append(", xCoordinatePx=");
        A1C.append(this.A01);
        A1C.append(", yCoordinatePx=");
        A1C.append(this.A02);
        A1C.append(", reelItemState=");
        A1C.append(this.A04);
        A1C.append(", longPressStartTime=");
        A1C.append(this.A00);
        return AbstractC167017dG.A0p(A1C);
    }
}
