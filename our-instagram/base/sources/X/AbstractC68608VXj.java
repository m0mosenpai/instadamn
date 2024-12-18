package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.foa.session.IgMetaSessionImpl;
import com.meta.foa.session.FoaUserSession;

/* renamed from: X.VXj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68608VXj {
    public static final void A00(Context context, W1X w1x, C27987CVk c27987CVk, FoaUserSession foaUserSession, Object obj) {
        int i;
        C0SG c67862Uzt;
        AbstractC167017dG.A1N(context, foaUserSession);
        C14360o3.A0B(obj, 4);
        C27944CTd c27944CTd = (C27944CTd) ((IgMetaSessionImpl) foaUserSession).A00.A01(C27944CTd.class, C29790DCi.A00);
        C14360o3.A07(c27944CTd);
        InterfaceC30961DjI A00 = c27944CTd.A00(context, c27987CVk, obj);
        A00.E5P();
        C65981Txa c65981Txa = w1x.A00;
        Integer num = c65981Txa.A0G;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 32;
        }
        CW5 cw5 = new CW5(A00, c27987CVk, foaUserSession, obj, i);
        Activity A002 = C66224U4u.A00(context);
        if (A002 instanceof FragmentActivity) {
            FragmentActivity fragmentActivity = (FragmentActivity) A002;
            if (!fragmentActivity.isFinishing() && !fragmentActivity.isDestroyed()) {
                UserSession A003 = AbstractC28057CYl.A00(foaUserSession);
                boolean A06 = C18U.A06(C06090Tz.A05, A003, 2342167098119303044L);
                Bundle bundle = new Bundle();
                AbstractC31175DnJ.A0r(bundle, A003);
                bundle.putBundle("cds_open_screen_config", c65981Txa.A00());
                bundle.putInt("containerArguments", AbstractC66261U6f.A00(cw5));
                bundle.putString("cds_platform", "Native");
                bundle.putString("dark_mode_config", U76.A01(c65981Txa.A0F));
                if (A06) {
                    c67862Uzt = new C66207U4d();
                } else {
                    c67862Uzt = new C67862Uzt();
                }
                c67862Uzt.setArguments(bundle);
                if (c65981Txa.A0E == U6H.A07) {
                    C140966Yy c140966Yy = new C140966Yy(fragmentActivity, A003);
                    c140966Yy.A0B(null, c67862Uzt);
                    c140966Yy.A0G = true;
                    c140966Yy.A04();
                    return;
                }
                AbstractC10360h2 supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                C14360o3.A07(supportFragmentManager);
                try {
                    if (supportFragmentManager.A11()) {
                        return;
                    }
                    C14240no c14240no = new C14240no(supportFragmentManager);
                    c14240no.A0I(null);
                    c67862Uzt.A0C(c14240no, null);
                    return;
                } catch (IllegalStateException e) {
                    C0K8.A0H("IgCdsBottomSheetNavigator", "Failed to open bottom sheet", e);
                    return;
                }
            }
            C0K8.A0D("IgCdsBottomSheetNavigator", "Activity is finishing or destroyed, not launching CDS bottom sheet fragment");
            return;
        }
        throw new IllegalStateException("Unable to launch CDS bottom sheet fragment without FragmentActivity!");
    }
}
