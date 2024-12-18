package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes9.dex */
public final class PKB implements InterfaceC58198Pr4, InterfaceC13000lm {
    public static final CallerContext A0B = CallerContext.A01("FxIgFbStoryAfterShareACUpsellContent");
    public ImageUrl A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public final UserSession A0A;

    public PKB(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A0A = userSession;
        this.A07 = "";
        this.A08 = "";
        this.A09 = "";
    }

    @Override // X.InterfaceC58198Pr4
    public final String Agv(Context context) {
        String str = this.A01;
        if (str == null || str.length() == 0) {
            return "account-center-pano";
        }
        return str;
    }

    @Override // X.InterfaceC58198Pr4
    public final String Agw(Context context) {
        String str = this.A02;
        if (str == null || str.length() == 0) {
            return "settings-pano";
        }
        return str;
    }

    @Override // X.InterfaceC58198Pr4
    public final String Agx(Context context) {
        String str = this.A03;
        if (str == null || str.length() == 0) {
            return "outline";
        }
        return str;
    }

    @Override // X.InterfaceC58198Pr4
    public final String Agy(Context context) {
        String str = this.A04;
        if (str == null || str.length() == 0) {
            return "outline";
        }
        return str;
    }

    @Override // X.InterfaceC58198Pr4
    public final String Ah0(Context context) {
        String str = this.A05;
        if (str == null || str.length() == 0) {
            int i = 2131952005;
            if (AnonymousClass252.A00(this.A0A).A01) {
                i = 2131952006;
            }
            return context.getString(i);
        }
        return str;
    }

    @Override // X.InterfaceC58198Pr4
    public final String Ah1(Context context) {
        String str = this.A06;
        if (str == null || str.length() == 0) {
            int i = 2131976126;
            if (AnonymousClass252.A00(this.A0A).A01) {
                i = 2131976128;
            }
            return context.getString(i);
        }
        return str;
    }

    @Override // X.InterfaceC58198Pr4
    public final String BDH(Context context) {
        String str = this.A07;
        if (str.length() == 0) {
            return AbstractC166997dE.A0p(context, 2131952007);
        }
        return str;
    }

    @Override // X.InterfaceC58198Pr4
    public final ImageUrl BGt() {
        return this.A00;
    }

    @Override // X.InterfaceC58198Pr4
    public final String BgN(Context context) {
        String str = this.A08;
        if (str == null || str.length() == 0) {
            return AbstractC166997dE.A0p(context, 2131952004);
        }
        return str;
    }

    @Override // X.InterfaceC58198Pr4
    public final String BrY(Context context) {
        String str = this.A09;
        if (str.length() == 0) {
            return AbstractC166997dE.A0p(context, 2131974600);
        }
        return str;
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A0A.A03(PKB.class);
    }

    @Override // X.InterfaceC58198Pr4
    public final String Aqu(Context context) {
        return "";
    }

    @Override // X.InterfaceC58198Pr4
    public final String B7k(Context context) {
        return null;
    }
}
