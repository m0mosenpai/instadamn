package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.BvC, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26971BvC extends AbstractC65806TuP {
    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ Object A0K(View view, C6FG c6fg, C102884kP c102884kP, Object obj) {
        C6QC c6qc = (C6QC) view;
        try {
            if (AbstractC03270Dk.A01(C6BQ.A0A(c6fg)) != null) {
                c6qc.A01.A00 = c102884kP.A02(44, 0.0f) / c102884kP.A02(42, 0.0f);
                return null;
            }
        } catch (NullPointerException unused) {
        }
        AbstractC25241Le.A02("BKShowreelVideoPlayerBinderUtils", "Attempt to render Bloks showreel video player component outside a logged in user context.");
        return null;
    }

    @Override // X.InterfaceC50822Vd
    public final /* bridge */ /* synthetic */ Object ALq(Context context) {
        C6QC c6qc = new C6QC(context);
        c6qc.setTag("showreel_composition_video_view_tag");
        return c6qc;
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ View A0J(Context context) {
        throw C00O.createAndThrow();
    }

    public C26971BvC(C6FG c6fg, C102884kP c102884kP) {
        super(c6fg, c102884kP);
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ void A0M(View view, C6FG c6fg, C102884kP c102884kP, Object obj, Object obj2) {
    }
}
