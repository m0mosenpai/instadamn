package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes7.dex */
public final class HE0 extends AbstractC29162CtT {
    public static final C41179IKs A08 = new Object();
    public InterfaceC1118152j A00;
    public ImageUrl A01;
    public String A02;
    public final Context A03;
    public final String A04;
    public final String A05;
    public final UserSession A06;
    public final String A07;

    public HE0(Context context, InterfaceC1118152j interfaceC1118152j, UserSession userSession, String str, String str2) {
        String str3;
        C14360o3.A0B(str, 1);
        this.A04 = str;
        this.A05 = str2;
        this.A03 = context;
        this.A06 = userSession;
        this.A00 = interfaceC1118152j;
        this.A02 = AbstractC166997dE.A0p(context, 2131957396);
        this.A07 = "";
        this.A01 = AbstractC25225BEi.A0t("");
        C38321qM A02 = C1DW.A00(userSession).A02(this.A04);
        if (A02 != null) {
            C84923qg A1X = A02.A1X();
            if (A1X != null && (str3 = A1X.A0e) != null) {
                this.A02 = str3;
            }
            ImageUrl A1S = A02.A1S();
            if (A1S != null) {
                this.A01 = A1S;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HE0) {
                HE0 he0 = (HE0) obj;
                if (!C14360o3.A0K(this.A04, he0.A04) || !C14360o3.A0K(this.A05, he0.A05) || !C14360o3.A0K(this.A03, he0.A03) || !C14360o3.A0K(this.A06, he0.A06) || !C14360o3.A0K(this.A00, he0.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.AbstractC29162CtT
    public final ImageUrl A04() {
        return this.A01;
    }

    @Override // X.AbstractC29162CtT
    public final String A05() {
        return this.A04;
    }

    @Override // X.AbstractC29162CtT
    public final String A06() {
        return this.A02;
    }

    @Override // X.AbstractC29162CtT
    public final String A07() {
        return this.A05;
    }

    @Override // X.AbstractC29162CtT
    public final String A08() {
        return this.A07;
    }

    @Override // X.AbstractC29162CtT
    public final boolean A0A() {
        return false;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A06, AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0K(this.A05, AbstractC166987dD.A0J(this.A04)))) + AbstractC167017dG.A0M(this.A00);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("CutoutSticker(id=");
        A1C.append(this.A04);
        A1C.append(AbstractC111324zv.A00(140));
        A1C.append(this.A05);
        A1C.append(AbstractC43591JPw.A00(226));
        A1C.append(this.A03);
        A1C.append(AbstractC43591JPw.A00(235));
        A1C.append(this.A06);
        A1C.append(", stickerInfo=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
