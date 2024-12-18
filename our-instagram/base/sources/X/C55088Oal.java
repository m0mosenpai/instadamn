package X;

import android.app.Activity;
import android.content.Context;
import androidx.core.app.ComponentActivity;
import androidx.fragment.app.Fragment;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.Oal, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55088Oal {
    public static final NVk A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return (NVk) userSession.A01(NVk.class, new C43205J8c(userSession, 15));
    }

    public final void A03(Activity activity, Fragment fragment, C82G c82g, C82H c82h, UserSession userSession, InterfaceC57990Pna interfaceC57990Pna, String str, String str2) {
        A02(activity, fragment, c82g, c82h, userSession, null, interfaceC57990Pna, null, null, str, str2, false);
    }

    public final void A04(Activity activity, Fragment fragment, C82H c82h, UserSession userSession, InterfaceC57990Pna interfaceC57990Pna) {
        A02(activity, fragment, C82G.A0J, c82h, userSession, null, interfaceC57990Pna, null, null, "", "", false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A01(Context context, Integer num, int i) {
        int i2;
        switch (num.intValue()) {
            case 0:
                i2 = 2131976134;
                break;
            case 1:
                i2 = 2131976135;
                break;
            case 2:
                i2 = 2131976136;
                break;
            case 3:
                i2 = 2131976120;
                break;
            case 4:
                i2 = 2131976137;
                break;
            default:
                i2 = 2131976118;
                break;
        }
        int i3 = 6000;
        if (num == C05F.A00) {
            i3 = 3000;
        }
        C146106i8 A0K = AbstractC31171DnF.A0K();
        AbstractC25226BEj.A1N(context, A0K, i2);
        A0K.A01 = i3;
        A0K.A02 = i;
        if (context instanceof C2d5) {
            ((C2d5) context).By1().A0A(A0K.A00());
        } else {
            AbstractC31178DnM.A1S(A0K);
        }
    }

    public final void A02(Activity activity, Fragment fragment, C82G c82g, C82H c82h, UserSession userSession, OE3 oe3, InterfaceC57990Pna interfaceC57990Pna, InterfaceC57991Pnb interfaceC57991Pnb, C54723OFa c54723OFa, String str, String str2, boolean z) {
        Context context;
        AbstractC43594JPz.A1P(userSession, interfaceC57990Pna);
        C14360o3.A0B(str, 6);
        NVk A00 = A00(userSession);
        CallerContext callerContext = NVk.A02;
        A00.A01 = oe3;
        A00.A07 = interfaceC57991Pnb;
        ((OwC) A00).A00 = c82g;
        A00.A08 = c54723OFa;
        A00.A09 = str;
        A00.A0A = str2;
        A00.A0C = z;
        A00.A06 = interfaceC57990Pna;
        if (c82h == null) {
            OGZ ogz = NVm.A02;
            if (fragment != null) {
                context = fragment.getContext();
            } else {
                context = null;
            }
            c82h = ogz.A00(context, c82g, userSession, z);
        }
        A00.A00 = c82h;
        C35038FcB A002 = FXY.A00(userSession);
        A002.A02((ComponentActivity) activity, null, c82g.toString(), A00.A00.toString());
        A00.A04 = A002;
        if (fragment != null) {
            A002.A01(fragment);
        }
        A00.A05(activity);
    }
}
