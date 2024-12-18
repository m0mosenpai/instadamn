package X;

/* renamed from: X.BjF, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26246BjF extends C0T6 implements InterfaceC30866Dhf {
    public final EnumC75663aX A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26246BjF) {
                C26246BjF c26246BjF = (C26246BjF) obj;
                if (!C14360o3.A0K(this.A01, c26246BjF.A01) || !C14360o3.A0K(this.A02, c26246BjF.A02) || this.A00 != c26246BjF.A00 || this.A03 != c26246BjF.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A03, AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0K(this.A02, AbstractC166987dD.A0J(this.A01))));
    }

    public C26246BjF(EnumC75663aX enumC75663aX, String str, String str2, boolean z) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = enumC75663aX;
        this.A03 = z;
    }
}
