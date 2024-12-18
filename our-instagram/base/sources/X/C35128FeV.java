package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.FeV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35128FeV {
    public final int A00;
    public final Context A01;
    public final C66362zD A02;
    public final UserSession A03;
    public final InterfaceC37223GaY A04;
    public final C41951wl A05;
    public final C41891wf A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;

    public C35128FeV(Context context, C66362zD c66362zD, UserSession userSession, InterfaceC37223GaY interfaceC37223GaY, C41951wl c41951wl, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A01 = context;
        this.A05 = c41951wl;
        this.A02 = c66362zD;
        this.A03 = userSession;
        this.A04 = interfaceC37223GaY;
        this.A08 = z;
        this.A0B = z2;
        this.A0E = z3;
        this.A09 = z4;
        this.A0D = z5;
        this.A0C = AbstractC31174DnI.A1V(userSession);
        C41891wf A01 = C41891wf.A01(userSession);
        C14360o3.A07(A01);
        this.A06 = A01;
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A0A = C18U.A06(c06090Tz, userSession, 36320382349681062L);
        long A012 = C18U.A01(c06090Tz, userSession, 36596265278245249L);
        C14360o3.A0C(Long.valueOf(A012), AbstractC111324zv.A00(10));
        this.A00 = (int) A012;
        this.A07 = C18U.A06(c06090Tz, userSession, 36314790302124857L);
    }

    public static final ArrayList A00(C35128FeV c35128FeV, Integer num, List list, int i, int i2) {
        ArrayList A17 = AbstractC25225BEi.A17(list.size() + 1);
        A17.add(new C36216FyV(null, num, C05F.A0N));
        UserSession userSession = c35128FeV.A03;
        F5E.A00(userSession).A00.getBoolean("debug_overlay_enabled", false);
        boolean z = c35128FeV.A0E;
        GWH gwh = new GWH(c35128FeV, 38);
        GWH gwh2 = new GWH(c35128FeV, 39);
        GWH gwh3 = new GWH(c35128FeV, 40);
        GWH gwh4 = new GWH(c35128FeV, 41);
        GWH gwh5 = new GWH(c35128FeV, 42);
        GWH gwh6 = new GWH(c35128FeV, 43);
        GWH gwh7 = new GWH(c35128FeV, 44);
        GWH gwh8 = new GWH(c35128FeV, 45);
        GWH gwh9 = new GWH(c35128FeV, 46);
        GWH gwh10 = new GWH(c35128FeV, 37);
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : list) {
            if (!A01(obj, gwh3)) {
                A1E.add(obj);
            }
        }
        ArrayList A0i = AbstractC167007dF.A0i(A1E);
        int i3 = 0;
        for (Object obj2 : A1E) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            DirectShareTarget directShareTarget = (DirectShareTarget) obj2;
            A0i.add(new C36212FyQ(userSession, directShareTarget, i, i2 + i3, i3, AbstractC166987dD.A0H(gwh4.invoke(directShareTarget)), z, A01(directShareTarget, gwh), A01(directShareTarget, gwh2), A01(directShareTarget, gwh5), A01(directShareTarget, gwh6), A01(directShareTarget, gwh7), A01(directShareTarget, gwh8), A01(directShareTarget, gwh10), A01(directShareTarget, gwh9)));
            i3 = i4;
        }
        A17.addAll(A0i);
        return A17;
    }

    public static boolean A01(Object obj, GWH gwh) {
        return ((Boolean) gwh.invoke(obj)).booleanValue();
    }
}
