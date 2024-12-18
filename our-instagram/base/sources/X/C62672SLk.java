package X;

/* renamed from: X.SLk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62672SLk {
    public final SMV A00;
    public final String A01;
    public final String A02;

    public C62672SLk(SMV smv, String str, String str2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = smv;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ShowreelNativeRenderingComponentInfo{name='");
        A1C.append(this.A01);
        A1C.append("', type='");
        A1C.append(this.A02);
        A1C.append("', data=");
        return AbstractC58320PtC.A11(this.A00, A1C);
    }
}
