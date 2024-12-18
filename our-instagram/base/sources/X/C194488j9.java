package X;

import android.app.Activity;
import android.content.res.Resources;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import java.util.List;

/* renamed from: X.8j9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C194488j9 {
    public C5SW A00;
    public boolean A01;
    public final Activity A02;
    public final Activity A03;
    public final UserSession A04;
    public final IgTextView A05;
    public final C194498jA A06;
    public final ViewGroup A07;
    public final C194478j8 A08;

    public C194488j9(Activity activity, ViewGroup viewGroup, UserSession userSession, IgTextView igTextView, C1810981l c1810981l, C194478j8 c194478j8) {
        C14360o3.A0B(c194478j8, 3);
        C14360o3.A0B(igTextView, 4);
        this.A02 = activity;
        this.A04 = userSession;
        this.A08 = c194478j8;
        this.A05 = igTextView;
        this.A07 = viewGroup;
        this.A03 = activity;
        this.A06 = new C194498jA(userSession, (C55U) c1810981l.A08.A00);
    }

    public final void A00() {
        C5SW c5sw;
        C5SW c5sw2 = this.A00;
        if (c5sw2 == null || !c5sw2.A09()) {
            UserSession userSession = this.A04;
            List list = this.A06.A03;
            if ((!list.isEmpty()) && AbstractC23021Ah.A00(userSession).A01.getInt("meta_gallery_tooltip_impression_count", 0) < 1 && C18U.A06(C06090Tz.A05, userSession, 36316645727146553L)) {
                Activity activity = this.A02;
                IgTextView igTextView = this.A05;
                Resources resources = this.A03.getResources();
                C14360o3.A07(resources);
                c5sw = AbstractC34762FTh.A00(activity, igTextView, userSession, EnumC58132lV.A03, AbstractC34762FTh.A01(resources, list));
            } else {
                c5sw = null;
            }
            this.A00 = c5sw;
            if (c5sw != null) {
                this.A07.postDelayed(new RunnableC24638AvY(this, c5sw), 500L);
            }
        }
    }

    public final void A01() {
        C194688jT c194688jT = new C194688jT(this);
        C194498jA c194498jA = this.A06;
        c194498jA.A03.clear();
        if (C18U.A06(C06090Tz.A05, c194498jA.A00, 36316645727146553L)) {
            C194508jB c194508jB = c194498jA.A02;
            C195448kk c195448kk = c194508jB.A01;
            C194498jA.A00(c194688jT, c194498jA, (List) c195448kk.A06.getValue());
            c194508jB.A00 = new C207189Ex(2, c194498jA, c194688jT);
            c195448kk.A03(AbstractC208329Jr.A00(c194498jA.A01));
        }
    }
}
