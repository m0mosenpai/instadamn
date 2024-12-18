package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.facebook.R;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class BO2 {
    public static final BO2 A00 = new Object();

    public static final boolean A02(UserSession userSession, C38321qM c38321qM) {
        JLN AtQ;
        C14360o3.A0B(userSession, 0);
        if (c38321qM.A5P() && AbstractC166297by.A02(c38321qM)) {
            return true;
        }
        if (c38321qM.A5P() && (AtQ = c38321qM.A0C.AtQ()) != null && C14360o3.A0K(AtQ.CCY(), true) && C18U.A06(C06090Tz.A05, userSession, 36320820435428264L)) {
            return true;
        }
        return false;
    }

    public final String A04(Resources resources, CharSequence charSequence, int i, int i2, boolean z) {
        String str;
        int i3;
        Object[] objArr;
        String A0r = AbstractC25231BEo.A0r(resources, C84963qk.A04(resources, Integer.valueOf(i), 10000, false, false), R.plurals.unified_feedback_reactions_from_fb, i);
        int i4 = R.plurals.unified_feedback_plays_from_fb;
        if (z) {
            i4 = R.plurals.unified_feedback_views_from_fb;
        }
        String A0r2 = AbstractC25231BEo.A0r(resources, C84963qk.A04(resources, Integer.valueOf(i2), 10000, false, false), i4, i2);
        if (i > 0) {
            if (i2 > 0) {
                i3 = 2131976116;
                objArr = new Object[]{A0r, A0r2, charSequence};
                str = resources.getString(i3, objArr);
                C14360o3.A0A(str);
                return str;
            }
            i3 = 2131976117;
            objArr = new Object[2];
            objArr[0] = A0r;
        } else if (i2 > 0) {
            i3 = 2131976117;
            objArr = new Object[2];
            objArr[0] = A0r2;
        } else {
            C0f5 AEp = C18950wb.A01.AEp("FeedbackFromFacebookUtil", 817892340);
            AEp.ABW(DialogModule.KEY_MESSAGE, "Reel has no plays or reactions. you shouldn't get here");
            AEp.report();
            str = "";
            C14360o3.A0A(str);
            return str;
        }
        objArr[1] = charSequence;
        str = resources.getString(i3, objArr);
        C14360o3.A0A(str);
        return str;
    }

    public static final void A00(Context context, View.OnClickListener onClickListener, InterfaceC56362iU interfaceC56362iU) {
        C3LO c3lo = new C3LO();
        c3lo.A0F = AbstractC65877Tvg.A00(context, XNQ.A4q, BSV.SIZE_16, BSU.OUTLINE);
        c3lo.A05 = 2131976905;
        c3lo.A03 = AbstractC53242c7.A05(context);
        c3lo.A0G = onClickListener;
        c3lo.A09 = 16;
        interfaceC56362iU.AA9(new C3LY(c3lo));
    }

    public static final boolean A01(UserSession userSession, C38321qM c38321qM) {
        AbstractC167017dG.A1N(userSession, c38321qM);
        if (c38321qM.A5P() && c38321qM.A0C.getClipsMetadata() != null && (!AbstractC166297by.A00(userSession, c38321qM)) && AbstractC166297by.A02(c38321qM) && AbstractC166297by.A01(c38321qM)) {
            return true;
        }
        return false;
    }

    public final SpannableStringBuilder A03(Resources resources, CWE cwe) {
        String A0q = AbstractC166997dE.A0q(resources, 2131973683);
        String A02 = cwe.A02(resources, A0q);
        C50761MbS c50761MbS = new C50761MbS(AbstractC25227BEk.A0B(MSV.A00(49)));
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(A02);
        AnonymousClass773.A03(A0H, c50761MbS, A0q);
        return A0H;
    }
}
