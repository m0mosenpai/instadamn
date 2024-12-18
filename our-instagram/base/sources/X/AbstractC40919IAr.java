package X;

import android.os.SystemClock;
import com.instagram.common.session.UserSession;
import com.instagram.ui.animation.timeline.linear.AdvanceTargetTaskDisabledException;
import java.util.Locale;

/* renamed from: X.IAr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40919IAr {
    public static final void A00(C120985dq c120985dq, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C37729Gj4 c37729Gj4, C37648Ghh c37648Ghh, EnumC37742GjH enumC37742GjH, String str, String str2, boolean z) {
        long j;
        AbstractC25234BEr.A1P(c37729Gj4, interfaceC60442pS, c120985dq);
        if (c37729Gj4.A01) {
            if (c120985dq.CdW()) {
                C40971v4 A06 = c120985dq.A06();
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC60442pS, userSession), "instagram_ad_reels_cta_advance_impression");
                if (A0f.isSampled()) {
                    C09530e4 c09530e4 = AbstractC37674GiB.A02;
                    if (c09530e4 != null && C14360o3.A0K(c120985dq.getId(), c09530e4.A00)) {
                        j = AbstractC166987dD.A0N(c09530e4.A01);
                    } else {
                        j = 0;
                    }
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    AbstractC37674GiB.A01 = AbstractC167007dF.A0p(c120985dq.getId(), elapsedRealtime);
                    long j2 = elapsedRealtime - j;
                    C0Zx c0Zx = new C0Zx();
                    String name = enumC37742GjH.name();
                    Locale locale = Locale.ROOT;
                    c0Zx.A06(AbstractC111324zv.A00(2215), AbstractC31172DnG.A16(locale, name));
                    c0Zx.A06(AbstractC111324zv.A00(2216), str);
                    c0Zx.A06(AbstractC111324zv.A00(2217), str2);
                    Long valueOf = Long.valueOf(j2);
                    c0Zx.A05(AbstractC111324zv.A00(2218), valueOf);
                    String id = c120985dq.getId();
                    C11520jB A0B = AbstractC37300Gc1.A0B();
                    A0B.A04(C5I8.A6z, AbstractC31172DnG.A16(locale, name));
                    A0B.A04(C5I8.A71, str);
                    A0B.A04(C5I8.A72, str2);
                    A0B.A05(C5I8.A73, valueOf);
                    AbstractC37674GiB.A00 = AbstractC166987dD.A1L(id, A0B);
                    AbstractC37300Gc1.A0g(A0f, AbstractC25231BEo.A0j(0, A06.A0S));
                    AbstractC37300Gc1.A0o(A0f, c120985dq.BzL(userSession));
                    A0f.AAQ(c0Zx, AbstractC111324zv.A00(2993));
                    A0f.Cht();
                    return;
                }
                return;
            }
            return;
        }
        AbstractC37674GiB.A00(c37729Gj4, c37648Ghh);
        if (!z || !C14360o3.A0K(c37729Gj4.A00, AdvanceTargetTaskDisabledException.A00) || enumC37742GjH != EnumC37742GjH.A04 || !C18U.A06(C06090Tz.A05, userSession, 36320201960923278L)) {
            return;
        }
        ILR ilr = (ILR) c37648Ghh.A04.getValue();
        EnumC37742GjH enumC37742GjH2 = EnumC37742GjH.A03;
        A00(c120985dq, userSession, interfaceC60442pS, ilr.A00(enumC37742GjH2), c37648Ghh, enumC37742GjH2, str, str2, false);
    }
}
