package X;

import android.graphics.Typeface;
import com.facebook.R;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class BNB extends AbstractC51572Yf {
    public final C120985dq A00;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        String[] strArr;
        InterfaceC88353wq B3J;
        String B3M;
        C14360o3.A0B(c76223bS, 0);
        if (!AbstractC25464BOd.A00.get()) {
            return null;
        }
        C38321qM c38321qM = this.A00.A02;
        if (c38321qM != null && (B3J = c38321qM.A0C.B3J()) != null && (B3M = B3J.B3M()) != null) {
            strArr = (String[]) new C11L("\n").A03(B3M).toArray(new String[0]);
        } else {
            strArr = null;
        }
        C2XE c2xe = c76223bS.A05;
        int A09 = AbstractC25228BEl.A09(c76223bS, AbstractC53242c7.A07(c2xe.A0C));
        C75933ay c75933ay = C51722Yv.A02;
        C51722Yv A00 = C9CU.A00(AbstractC25233BEq.A0Q(C9CV.A00(null, C05F.A0Y, EnumC77933eL.ABSOLUTE, 3), 48.0d), C05F.A06, 0, AbstractC25230BEn.A0L());
        int A092 = AbstractC25228BEl.A09(c76223bS, R.color.igds_debug_overlay_background);
        Integer num = C05F.A00;
        C51722Yv A16 = AbstractC25232BEp.A16(A00, num, AbstractC25225BEi.A0i(A092));
        ArrayList A1E = AbstractC166987dD.A1E();
        C51722Yv A002 = C9CV.A00(null, num, EnumC77683ds.CENTER, 3);
        Typeface typeface = Typeface.DEFAULT;
        long A0D = AbstractC25229BEm.A0D();
        C77723dw A0g = AbstractC25233BEq.A0g(c2xe, "Recommender Debug Overlay", A09);
        C2XH c2xh = c2xe.A0D;
        C14360o3.A07(c2xh);
        AbstractC25230BEn.A1K(A0g, c2xh, 0, Float.floatToRawIntBits(18.0f) | 9221683186994511872L);
        A0g.A0T(typeface);
        AbstractC25234BEr.A19(A0g, c2xh, num, A0D);
        A0g.A0b(false);
        A0g.A0N(0);
        A0g.A0E();
        AbstractC25233BEq.A1D(A002, A0g, false);
        A1E.add(A0g.A0A());
        String str = "No data to show; allowlist yourself in \nig_gl_discover_explanation_debug_mode GK \nto see the debug logs.";
        if (strArr != null && strArr.length > 3) {
            String A003 = MSV.A00(284);
            str = AbstractC16490ru.A0p(AnonymousClass001.A15(A003, strArr[1], A003, strArr[2], A003, strArr[3], "\n          "));
        }
        C77723dw A0g2 = AbstractC25233BEq.A0g(c2xe, str, A09);
        AbstractC25230BEn.A1K(A0g2, c2xh, 0, Float.floatToRawIntBits(16.0f) | 9221683186994511872L);
        A0g2.A0T(typeface);
        AbstractC25234BEr.A19(A0g2, c2xh, num, A0D);
        A0g2.A0b(false);
        A0g2.A0N(0);
        A0g2.A0E();
        AbstractC25229BEm.A1F(A0g2);
        A0g2.A06(null);
        A1E.add(A0g2.A0A());
        C2WF c2wf = new C2WF(null, null, null, A1E, false);
        A16.A01(c2wf.A0a(), c76223bS.ArD());
        return c2wf;
    }

    public BNB(C120985dq c120985dq) {
        this.A00 = c120985dq;
    }
}
