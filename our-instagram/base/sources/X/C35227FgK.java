package X;

import android.app.Activity;
import android.graphics.RectF;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.FgK, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35227FgK {
    public static final C35227FgK A00 = new Object();

    public static final void A01(Activity activity, C22P c22p, AbstractC59962oe abstractC59962oe, UserSession userSession) {
        Bundle bundle;
        if (C18U.A06(AbstractC25225BEi.A0j(userSession, 3), userSession, 36324909244232274L)) {
            INH A0C = AbstractC86593tX.A0C(c22p);
            A0C.A0n = true;
            bundle = A0C.A00();
        } else {
            bundle = null;
        }
        AbstractC41671Ic3.A01(activity, bundle, abstractC59962oe, c22p, userSession, true, false);
    }

    public final void A04(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, String str3, List list) {
        AbstractC167007dF.A1F(str, 2, list);
        C141586ab A002 = A00(fragmentActivity, userSession, str, str2);
        A002.A0P = AbstractC166987dD.A1F(list);
        A002.A0A = str3;
        C6XJ A01 = C6XJ.A01(fragmentActivity, A002.A00(), userSession);
        A01.A07();
        A01.A0C(fragmentActivity);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, X.6ab] */
    public static final C141586ab A00(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2) {
        C1OU c1ou = C1OU.$redex_init_class;
        C143536ds c143536ds = new C143536ds(userSession);
        C31559Dtj c31559Dtj = new C31559Dtj(fragmentActivity, new RectF(), new GF2(1), C05F.A01);
        ArrayList A1M = AbstractC16960so.A1M(str);
        C38801rC c38801rC = C38321qM.A0h;
        String str3 = userSession.userId;
        C14360o3.A0B(str3, 1);
        HashMap A0r = AbstractC167017dG.A0r(str, AbstractC16830sb.A05(AnonymousClass001.A0T(str2, str3, '_')));
        ?? obj = new Object();
        obj.A0A(A1M);
        obj.A09(A1M);
        obj.A03(C3G2.A03);
        AbstractC31177DnL.A1P(obj);
        obj.A01(userSession);
        obj.A02 = new C70873Fz();
        C14360o3.A0B(A0r, 0);
        obj.A0T = A0r;
        obj.A0V = true;
        obj.A0Z = false;
        obj.A06(((AbstractC149546o6) c143536ds).A02);
        obj.A07(c31559Dtj.A03);
        return obj;
    }

    public final void A03(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        C38801rC c38801rC = C38321qM.A0h;
        String str2 = userSession.userId;
        C14360o3.A0B(str2, 1);
        String A0T = AnonymousClass001.A0T(str, str2, '_');
        C116875Qr c116875Qr = new C116875Qr(ClipsViewerSource.A04, userSession);
        c116875Qr.A1D = A0T;
        AbstractC31173DnH.A1J(fragmentActivity, c116875Qr, userSession);
    }

    public static final void A02(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        AbstractC167017dG.A1P(userSession, str);
        AbstractC31177DnL.A16(C35028Fc1.A00(str).A02(), fragmentActivity, userSession);
    }
}
