package X;

/* renamed from: X.Msf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51710Msf extends C0T6 {
    public final String A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51710Msf) {
                C51710Msf c51710Msf = (C51710Msf) obj;
                if (!C14360o3.A0K(this.A02, c51710Msf.A02) || !C14360o3.A0K(this.A00, c51710Msf.A00) || !C14360o3.A0K(this.A01, c51710Msf.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return AnonymousClass001.A14("StackedTimelineAction(target=", this.A02, AbstractC111324zv.A00(277), this.A00, ", surfaceElement=", this.A01, ')');
    }

    public static void A00(C9RL c9rl, String str, String str2) {
        c9rl.A01.add(new C51710Msf(str, str2, "STACKED_TIMELINE"));
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A01, AbstractC166997dE.A0K(this.A00, AbstractC166987dD.A0J(this.A02)));
    }

    public C51710Msf(String str, String str2, String str3) {
        AbstractC167027dH.A13(str, str2, str3);
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
    }
}
