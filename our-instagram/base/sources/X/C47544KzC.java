package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.creation.base.MediaSession;
import java.util.List;

/* renamed from: X.KzC, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47544KzC {
    public ReboundViewPager A00;
    public C9KJ A01;

    public static void A00(Context context, UserSession userSession, AnonymousClass840 anonymousClass840, C47544KzC c47544KzC, InterfaceC189598ae interfaceC189598ae, java.util.Set set, int i) {
        View A0D;
        List CpK = anonymousClass840.A00().CpK();
        if (((MediaSession) CpK.get(i)).Btq() == C05F.A01 && (A0D = c47544KzC.A00.A0D(i)) != null) {
            L2T l2t = (L2T) AbstractC31172DnG.A0x(A0D);
            C47Z BcC = interfaceC189598ae.BcC(((MediaSession) CpK.get(i)).BcD());
            BcC.getClass();
            C9KJ A00 = AbstractC46677Kku.A00(context, userSession, l2t, BcC, anonymousClass840.A00().AB3());
            c47544KzC.A01 = A00;
            set.add(A00);
        }
    }
}
