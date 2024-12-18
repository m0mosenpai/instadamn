package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.K2d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45275K2d extends C0T6 implements MNN {
    public final C51760Mtj A00;
    public final C47654L2n A01;
    public final Integer A02;
    public final UserSession A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45275K2d) {
                C45275K2d c45275K2d = (C45275K2d) obj;
                if (this.A02 != c45275K2d.A02 || !C14360o3.A0K(this.A01, c45275K2d.A01) || !C14360o3.A0K(this.A03, c45275K2d.A03) || !C14360o3.A0K(this.A00, c45275K2d.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A02;
        return AbstractC166997dE.A0J(this.A03, AbstractC25236BEt.A05(this.A01, AbstractC25230BEn.A0C(num, AbstractC46865Kny.A00(num)) * 31) * 31) + AbstractC167017dG.A0M(this.A00);
    }

    public C45275K2d(C51760Mtj c51760Mtj, UserSession userSession, C47654L2n c47654L2n, Integer num) {
        this.A02 = num;
        this.A01 = c47654L2n;
        this.A03 = userSession;
        this.A00 = c51760Mtj;
    }

    public final String toString() {
        String str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("LoadMessagesAction(loadType=");
        Integer num = this.A02;
        if (num != null) {
            str = AbstractC46865Kny.A00(num);
        } else {
            str = "null";
        }
        A1C.append(str);
        A1C.append(", viewModelGenerators=");
        A1C.append(this.A01);
        A1C.append(", fetchNullStateHeaderOnly=");
        A1C.append(false);
        A1C.append(", userSession=");
        A1C.append(this.A03);
        A1C.append(", messageHighlightModel=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
