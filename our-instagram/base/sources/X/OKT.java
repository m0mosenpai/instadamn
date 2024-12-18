package X;

import android.content.Context;
import com.instagram.api.schemas.OriginalAudioSubtype;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.VideoUrlImpl;
import com.instagram.model.mediatype.ProductType;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class OKT {
    public final Context A00;
    public final UserSession A01;

    public final C51768MuY A00(C38321qM c38321qM) {
        float A0m;
        C51600Mqs c51600Mqs;
        ArrayList A1E;
        C45116Jxl c45116Jxl;
        Integer num;
        Integer num2;
        String A05;
        String A06;
        List AmB;
        C14360o3.A0B(c38321qM, 0);
        String id = c38321qM.getId();
        if (id != null) {
            ImageUrl A1S = c38321qM.A1S();
            if (A1S != null) {
                String A0w = AbstractC43592JPx.A0w(A1S);
                if (!c38321qM.Cff()) {
                    c51600Mqs = null;
                } else {
                    String A03 = c38321qM.CFR().A03();
                    MVC mvc = null;
                    if (c38321qM.Cff()) {
                        VideoUrlImpl videoUrlImpl = c38321qM.CFR().A08;
                        if (videoUrlImpl != null) {
                            String str = videoUrlImpl.A06;
                            C14360o3.A07(str);
                            mvc = new MVC(Integer.valueOf(videoUrlImpl.A01), str, videoUrlImpl.A00, videoUrlImpl.A02);
                        }
                    } else {
                        ExtendedImageUrl A1q = c38321qM.A1q(this.A00);
                        if (A1q != null) {
                            mvc = new MVC(A1q.A0A, A1q.getHeight(), A1q.getWidth());
                        }
                    }
                    long A1C = c38321qM.A1C();
                    if (c38321qM.A1U() != null) {
                        A0m = r3.A01 / r3.A00;
                    } else {
                        A0m = c38321qM.A0m();
                    }
                    c51600Mqs = new C51600Mqs(mvc, A03, A0m, A1C);
                }
                ExtendedImageUrl A1q2 = c38321qM.A1q(this.A00);
                if (A1q2 != null) {
                    A1E = AbstractC16960so.A1M(new MVC(A1q2.A0A, A1q2.getHeight(), A1q2.getWidth()));
                } else {
                    A1E = AbstractC166987dD.A1E();
                }
                User A2E = c38321qM.A2E(this.A01);
                if (A2E != null) {
                    c45116Jxl = new C45116Jxl(A2E.getId(), A2E.getUsername(), AbstractC43592JPx.A0w(A2E.Bhu()), 0);
                } else {
                    c45116Jxl = null;
                }
                if (c38321qM.A5x()) {
                    num = C05F.A00;
                } else if (c38321qM.Cff()) {
                    num = C05F.A01;
                } else if (c38321qM.A5M()) {
                    num = C05F.A0N;
                } else if (c38321qM.A5g()) {
                    num = C05F.A0C;
                } else {
                    num = C05F.A0Y;
                }
                ArrayList A1E2 = AbstractC166987dD.A1E();
                if (c38321qM.A5M() && (AmB = c38321qM.A0C.AmB()) != null) {
                    Iterator it = AmB.iterator();
                    while (it.hasNext()) {
                        A1E2.add(A00(AbstractC31172DnG.A0i(it)));
                    }
                }
                C3x9 A0u = AbstractC25226BEj.A0u(c38321qM);
                C50679MYx c50679MYx = null;
                if (A0u != null && AbstractC117245Sj.A05(A0u).length() != 0) {
                    if (AbstractC117245Sj.A00(A0u) == OriginalAudioSubtype.A06) {
                        ArrayList A07 = AbstractC117245Sj.A07(A0u);
                        A05 = AbstractC117245Sj.A05(A0u);
                        A06 = AnonymousClass001.A0R("Mix: ", AbstractC25226BEj.A1H(" | ", A07, JCJ.A00));
                    } else {
                        A05 = AbstractC117245Sj.A05(A0u);
                        A06 = AbstractC117245Sj.A06(A0u);
                    }
                    c50679MYx = new C50679MYx(A05, A06, 3);
                }
                String CAR = c38321qM.CAR();
                if (CAR == null) {
                    CAR = "";
                }
                ProductType A1z = c38321qM.A1z();
                if (A1z != null) {
                    int ordinal = A1z.ordinal();
                    if (ordinal != 13) {
                        if (ordinal == 1) {
                            num2 = C05F.A00;
                        }
                    } else {
                        num2 = C05F.A01;
                    }
                    c38321qM.A0C.getTitle();
                    c38321qM.A1V();
                    return new C51768MuY(c50679MYx, c45116Jxl, c51600Mqs, num, num2, id, A0w, CAR, A1E, A1E2);
                }
                num2 = C05F.A0C;
                c38321qM.A0C.getTitle();
                c38321qM.A1V();
                return new C51768MuY(c50679MYx, c45116Jxl, c51600Mqs, num, num2, id, A0w, CAR, A1E, A1E2);
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    public final C51765MuV A01(Integer num, String str) {
        Context context = this.A00;
        return new C51765MuV(num, str, AbstractC166997dE.A0p(context, 2131966151), AbstractC166997dE.A0p(context, 2131966150));
    }

    public OKT(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }
}
