package X;

import com.instagram.common.session.UserSession;
import java.util.Arrays;

/* loaded from: classes8.dex */
public final class JZe {
    public final UserSession A00;
    public final MP4 A01;
    public final InterfaceC09390do A02;

    public JZe(UserSession userSession, MP4 mp4) {
        C14360o3.A0B(mp4, 2);
        this.A00 = userSession;
        this.A01 = mp4;
        this.A02 = C1XM.A00(new DGY(this, 2));
    }

    public final int A01(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        C44Q An4 = c38321qM.A0C.An4();
        if (An4 != null) {
            return Arrays.hashCode(new Object[]{c38321qM.getId(), An4.getTitle(), Boolean.valueOf(A00(c38321qM))});
        }
        throw AbstractC166997dE.A0g();
    }

    public final C9CD A02(C38321qM c38321qM, C75113Zb c75113Zb) {
        AbstractC167017dG.A1N(c38321qM, c75113Zb);
        C44Q An4 = c38321qM.A0C.An4();
        if (An4 == null) {
            return null;
        }
        String C7K = An4.C7K();
        String title = An4.getTitle();
        boolean A00 = A00(c38321qM);
        C44Q An42 = c38321qM.A0C.An4();
        if (An42 != null) {
            return new C9CD(new C51755Mte(new C50372MLz(46, c38321qM, this, c75113Zb, An42), 21), C7K, title, A00);
        }
        throw AbstractC166997dE.A0g();
    }

    private final boolean A00(C38321qM c38321qM) {
        C44Q An4 = c38321qM.A0C.An4();
        if (An4 != null) {
            C81663kb C76 = ((C2DS) this.A02.getValue()).C76(An4.C7K());
            if (C76 != null) {
                return C76.CPZ();
            }
            return AbstractC167007dF.A1T(An4.CYK());
        }
        throw AbstractC166997dE.A0g();
    }
}
