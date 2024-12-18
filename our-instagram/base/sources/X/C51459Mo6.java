package X;

/* renamed from: X.Mo6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51459Mo6 extends AbstractC53423NkC {
    public final C51461Mo8 A00;
    public final C51463MoA A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51459Mo6) {
                C51459Mo6 c51459Mo6 = (C51459Mo6) obj;
                if (!C14360o3.A0K(this.A01, c51459Mo6.A01) || !C14360o3.A0K(this.A00, c51459Mo6.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166987dD.A0G(this.A01));
    }

    public C51459Mo6(C51461Mo8 c51461Mo8, C51463MoA c51463MoA) {
        this.A01 = c51463MoA;
        this.A00 = c51461Mo8;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("UserAvatarAndTemplateData(userAvatarData=");
        A1C.append(this.A01);
        A1C.append(", templateInfo=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
