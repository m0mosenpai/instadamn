package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* loaded from: classes6.dex */
public final class ES7 extends AbstractC65632xz {
    public final UserSession A00;
    public final ReelDashboardFragment A01;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x00a8. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014e  */
    @Override // X.InterfaceC65642y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bindView(int r15, android.view.View r16, java.lang.Object r17, java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ES7.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getIdentifier(int i, Object obj, Object obj2) {
        return ((C41181vS) obj).A0j.hashCode();
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getViewModelHash(int i, Object obj, Object obj2) {
        InterfaceC37274GbR A05 = ((C41181vS) obj).A05();
        A05.getClass();
        return A05.hashCode();
    }

    public ES7(UserSession userSession, ReelDashboardFragment reelDashboardFragment) {
        this.A00 = userSession;
        this.A01 = reelDashboardFragment;
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(1483086501);
        View A0A = AbstractC31172DnG.A0A(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.reel_dashboard_rights_manager_flag_info);
        A0A.setTag(new FOJ(A0A, this.A01));
        C0f9.A0A(-403098566, A03);
        return A0A;
    }
}
