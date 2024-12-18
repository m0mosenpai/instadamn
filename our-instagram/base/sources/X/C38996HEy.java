package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.instagram.adshistory.fragment.RecentAdActivityFragment;

/* renamed from: X.HEy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38996HEy extends AbstractC65632xz {
    public final RecentAdActivityFragment A00;
    public final C62862tP A01;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public C38996HEy(RecentAdActivityFragment recentAdActivityFragment, C62862tP c62862tP) {
        this.A01 = c62862tP;
        this.A00 = recentAdActivityFragment;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        C0f9.A0A(-1498268834, C0f9.A03(-58471063));
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, -456021166);
        Context context = viewGroup.getContext();
        FrameLayout frameLayout = new FrameLayout(context);
        C14360o3.A07(context);
        C126545np c126545np = new C126545np(context);
        c126545np.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        frameLayout.addView(c126545np);
        C1338462s c1338462s = this.A00.A02;
        if (c1338462s != null) {
            AbstractC37301Gc2.A0B(context, c1338462s, this.A01).A07(c126545np);
        }
        C0f9.A0A(-908164157, A0G);
        return frameLayout;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
