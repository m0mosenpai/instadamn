package X;

/* renamed from: X.XOf, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72109XOf implements MQP {
    public final double A00;
    public final C50679MYx A01;
    public final String A02;
    public final String A03;

    public C72109XOf(C50679MYx c50679MYx, String str, String str2, double d) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        this.A03 = str;
        this.A02 = str2;
        this.A00 = d;
        this.A01 = c50679MYx;
    }

    @Override // X.MQP
    public final String BGJ() {
        return this.A03;
    }

    @Override // X.MQP
    public final C50679MYx CDs() {
        return this.A01;
    }

    @Override // X.MQP
    public final double getScore() {
        return this.A00;
    }
}
