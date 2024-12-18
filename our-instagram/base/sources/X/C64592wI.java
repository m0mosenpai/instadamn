package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.discoverpeople.model.FindPeopleButtonOverride;
import com.instagram.nux.cal.model.DpActionContent;

/* renamed from: X.2wI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64592wI {
    public final C25671My A00;
    public final UserSession A01;
    public final Fragment A02;

    public C64592wI(Fragment fragment, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        this.A02 = fragment;
        this.A01 = userSession;
        this.A00 = AbstractC25651Mw.A00(userSession);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, X.1vN] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, X.1vN] */
    public final void A00(EnumC72412Xd8 enumC72412Xd8) {
        C140966Yy c140966Yy;
        Fragment ek6;
        if (enumC72412Xd8 != EnumC72412Xd8.A0R && enumC72412Xd8 != EnumC72412Xd8.A0V && enumC72412Xd8 != EnumC72412Xd8.A0C && enumC72412Xd8 != EnumC72412Xd8.A0W && enumC72412Xd8 != EnumC72412Xd8.A09) {
            if (enumC72412Xd8 == EnumC72412Xd8.A0S && AbstractC35067Fce.A02()) {
                UserSession userSession = this.A01;
                DpActionContent dpActionContent = (DpActionContent) userSession.A00(DpActionContent.class);
                Bundle bundle = new Bundle();
                if (dpActionContent != null) {
                    String str = dpActionContent.A02;
                    if (str != null) {
                        String str2 = dpActionContent.A00;
                        if (str2 != null) {
                            String str3 = dpActionContent.A01;
                            if (str3 != null) {
                                bundle.putParcelable("FACEBOOK", new FindPeopleButtonOverride(str, str2, str3));
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                c140966Yy = new C140966Yy(this.A02.requireActivity(), userSession);
                AbstractC35067Fce.A00().A00();
                String A00 = AbstractC111324zv.A00(1152);
                Bundle bundle2 = new Bundle();
                bundle2.putString(AbstractC111324zv.A00(3606), "nux");
                bundle2.putString(AbstractC111324zv.A00(3607), A00);
                bundle2.putBundle(AbstractC111324zv.A00(631), bundle);
                ek6 = F7G.A00(bundle2);
                c140966Yy.A0D(ek6);
                c140966Yy.A04();
            }
            AbstractC25651Mw.A00(this.A01).E4s(new Object());
        }
        Fragment fragment = this.A02;
        if (fragment instanceof GYM) {
            this.A00.E4s(new Object());
        } else if (AbstractC35067Fce.A02()) {
            c140966Yy = new C140966Yy(fragment.requireActivity(), this.A01);
            AbstractC35067Fce.A00().A00();
            Bundle bundle3 = new Bundle();
            bundle3.putBoolean(AbstractC111324zv.A00(84), false);
            ek6 = new EK6();
            ek6.setArguments(bundle3);
            c140966Yy.A0D(ek6);
            c140966Yy.A04();
        }
        AbstractC25651Mw.A00(this.A01).E4s(new Object());
    }
}
