package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.70D, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C70D {
    public List A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final Context A05;
    public final FragmentActivity A06;
    public final AbstractC59962oe A07;
    public final C684436h A08;
    public final UserSession A09;
    public final InterfaceC60442pS A0A;
    public final C152336tJ A0B;
    public final C152326tI A0C;
    public final C70P A0D;
    public final User A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;

    public static int A00(C70D c70d) {
        UserSession userSession = c70d.A09;
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36324011596459817L) && C18U.A06(c06090Tz, userSession, 36324011598032687L)) {
            InterfaceC16530ry interfaceC16530ry = A00.A1p;
            C0YR[] c0yrArr = C23031Ai.A8c;
            if (!((Boolean) interfaceC16530ry.CES(A00, c0yrArr[451])).booleanValue() && !((Boolean) A00.A5b.CES(A00, c0yrArr[450])).booleanValue()) {
                return 1;
            }
        }
        return 0;
    }

    public static void A01(C70D c70d) {
        UserSession userSession = c70d.A09;
        InterfaceC19610xo ARD = AbstractC23021Ah.A00(userSession).A01.ARD();
        ARD.E77("barcelona_has_tapped_profile_menu_option", true);
        ARD.apply();
        AbstractC151386rg.A03(c70d.A0A, userSession, null, null, null, "settings", c70d.A0I, null, null, null, AbstractC14490oL.A0A(c70d.A05));
    }

    public final int A02() {
        Boolean Bw2;
        User user = this.A0E;
        if (user != null && (Bw2 = user.A03.Bw2()) != null && Bw2.booleanValue() && !AbstractC23021Ah.A00(this.A09).A01.getBoolean("has_tapped_on_favorites_profile_navbar_icon", false)) {
            return 1;
        }
        return 0;
    }

    public final int A03() {
        List list = this.A00;
        int i = 0;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((AbstractC151906sa) it.next()).A01() != C36584GBi.A00) {
                    i++;
                }
            }
        }
        return i;
    }

    public final void A05() {
        this.A0E.getClass();
        AbstractC155756z4.A00();
        Intent intent = new Intent(this.A06, (Class<?>) BusinessConversionActivity.class);
        Bundle requireArguments = this.A07.requireArguments();
        requireArguments.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, MSV.A00(260));
        requireArguments.putInt("intro_entry_position", 0);
        C193328hC c193328hC = new C193328hC(this.A05);
        c193328hC.A0A(2131974191);
        c193328hC.A09(2131974192);
        c193328hC.A0J(new DialogInterfaceOnClickListenerC35342FiJ(intent, requireArguments, this), 2131956794);
        c193328hC.A0I(null, 2131968687);
        C0fJ.A00(c193328hC.A02());
    }

    public C70D(Context context, FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, C684436h c684436h, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C152336tJ c152336tJ, C152326tI c152326tI, C70P c70p, User user, String str, String str2, String str3, String str4) {
        this.A05 = context;
        this.A06 = fragmentActivity;
        this.A09 = userSession;
        this.A07 = abstractC59962oe;
        this.A0A = interfaceC60442pS;
        this.A0E = user;
        this.A0I = str;
        this.A0G = str2;
        this.A0H = str3;
        this.A0F = str4;
        this.A08 = c684436h;
        this.A0B = c152336tJ;
        this.A0C = c152326tI;
        this.A0D = c70p;
    }

    public final int A04() {
        C28411Zc.A00();
        UserSession userSession = this.A09;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36322297904113774L) && C18U.A06(c06090Tz, userSession, 36322297904572533L)) {
            C28411Zc.A00();
            C23031Ai A00 = AbstractC23021Ah.A00(userSession);
            return ((Number) A00.A8T.CES(A00, C23031Ai.A8c[490])).intValue();
        }
        return 0;
    }

    public C70D(FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, UserSession userSession, InterfaceC60442pS interfaceC60442pS) {
        this.A05 = abstractC59962oe.requireContext();
        this.A06 = fragmentActivity;
        this.A09 = userSession;
        this.A07 = abstractC59962oe;
        this.A0A = interfaceC60442pS;
        User A01 = C17060sy.A01.A01(userSession);
        this.A0E = A01;
        this.A0I = A01.getId();
        this.A0G = "";
        this.A0H = "";
        this.A0F = "";
        this.A08 = new C684436h(fragmentActivity, userSession);
        this.A0B = new C152336tJ(abstractC59962oe, userSession);
        this.A0C = new C152326tI(fragmentActivity, abstractC59962oe, userSession, abstractC59962oe);
        this.A0D = null;
    }
}
