package X;

/* renamed from: X.L8v, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47789L8v {
    public String A00 = "";
    public final C13400mQ A01;
    public final InterfaceC50474MQc A02;
    public final C1GL A03;

    public final void A00(String str) {
        C13400mQ c13400mQ = this.A01;
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            int i2 = length;
            if (!z) {
                i2 = i;
            }
            boolean A19 = AbstractC167027dH.A19(str, i2);
            if (!z) {
                if (!A19) {
                    z = true;
                } else {
                    i++;
                }
            } else if (!A19) {
                break;
            } else {
                length--;
            }
        }
        c13400mQ.A01(AbstractC31177DnL.A0g(str, length, i));
    }

    public final void A01(String str) {
        if (!C14360o3.A0K(this.A00, "") && C14360o3.A0K(this.A00, str)) {
            return;
        }
        this.A00 = str;
        C1ON AEh = this.A02.AEh(null, str);
        AEh.A00 = new C45551KEq(str, this, 3);
        this.A03.schedule(AEh);
    }

    public AbstractC47789L8v(C1GL c1gl, InterfaceC50474MQc interfaceC50474MQc, boolean z) {
        this.A03 = c1gl;
        this.A02 = interfaceC50474MQc;
        C13400mQ A00 = JX1.A00(AbstractC167007dF.A0J(), this, 8);
        A00.A03 = z;
        this.A01 = A00;
    }
}
