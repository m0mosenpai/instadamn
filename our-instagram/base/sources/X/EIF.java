package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.banner.IgdsBanner;

/* loaded from: classes6.dex */
public final class EIF extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "DirectInboxFilterOptionsFragment";
    public RecyclerView A00;
    public UserSession A01;
    public IgdsBanner A02;
    public C23031Ai A03;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "DIRECT_INBOX_FILTER_OPTIONS";
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a6  */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r8, android.os.Bundle r9) {
        /*
            r7 = this;
            r5 = 0
            X.C14360o3.A0B(r8, r5)
            super.onViewCreated(r8, r9)
            android.content.Context r1 = r8.getContext()
            r0 = 1
            androidx.recyclerview.widget.LinearLayoutManager r6 = new androidx.recyclerview.widget.LinearLayoutManager
            r6.<init>(r1, r0, r5)
            r0 = 2131431667(0x7f0b10f3, float:1.848507E38)
            android.view.View r0 = r8.findViewById(r0)
            com.instagram.igds.components.banner.IgdsBanner r0 = (com.instagram.igds.components.banner.IgdsBanner) r0
            X.C14360o3.A0B(r0, r5)
            r7.A02 = r0
            com.instagram.common.session.UserSession r0 = r7.A01
            if (r0 == 0) goto Lac
            X.1Ai r0 = X.AbstractC23021Ah.A00(r0)
            r7.A03 = r0
            com.instagram.common.session.UserSession r2 = r7.A01
            if (r2 == 0) goto Lac
            X.0Tz r4 = X.C06090Tz.A05
            r0 = 36330007370416768(0x8111f300004280, double:3.038581178024701E-306)
            boolean r0 = X.C18U.A06(r4, r2, r0)
            if (r0 == 0) goto L7f
            X.1Ai r3 = r7.A03
            if (r3 != 0) goto L48
            java.lang.String r0 = "userPreferences"
        L40:
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L48:
            X.0ry r2 = r3.A3g
            X.0YR[] r1 = X.C23031Ai.A8c
            r0 = 525(0x20d, float:7.36E-43)
            boolean r0 = X.AbstractC167017dG.A1b(r3, r2, r1, r0)
            if (r0 != 0) goto L7f
            com.instagram.common.session.UserSession r2 = r7.A01
            if (r2 == 0) goto Lac
            r0 = 36611482347247897(0x8211f300021919, double:3.216587086781465E-306)
            long r3 = X.C18U.A01(r4, r2, r0)
            long r1 = java.lang.System.currentTimeMillis()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto L7f
            com.instagram.igds.components.banner.IgdsBanner r1 = r7.A02
            if (r1 == 0) goto La9
            r0 = 2131959641(0x7f131f59, float:1.9555928E38)
            r1.setBody(r0)
            com.instagram.igds.components.banner.IgdsBanner r1 = r7.A02
            if (r1 == 0) goto La9
            r0 = 5
            X.G81.A00(r1, r7, r0)
            r1.setVisibility(r5)
            goto L88
        L7f:
            com.instagram.igds.components.banner.IgdsBanner r1 = r7.A02
            if (r1 == 0) goto La9
            r0 = 8
            r1.setVisibility(r0)
        L88:
            r0 = 2131431665(0x7f0b10f1, float:1.8485066E38)
            android.view.View r1 = r8.findViewById(r0)
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            X.C14360o3.A0B(r1, r5)
            r7.A00 = r1
            X.E05 r0 = new X.E05
            r0.<init>()
            r1.setAdapter(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r7.A00
            if (r0 == 0) goto La6
            r0.setLayoutManager(r6)
            return
        La6:
            java.lang.String r0 = "recyclerView"
            goto L40
        La9:
            java.lang.String r0 = "filterBanner"
            goto L40
        Lac:
            java.lang.String r0 = "userSession"
            goto L40
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EIF.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        UserSession userSession = this.A01;
        if (userSession != null) {
            return userSession;
        }
        AbstractC31171DnF.A0y();
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1444946569);
        super.onCreate(bundle);
        UserSession A0R = AbstractC31177DnL.A0R(this);
        C14360o3.A0B(A0R, 0);
        this.A01 = A0R;
        C0f9.A09(337423852, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1167230934);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_filter_optioins_panel, viewGroup, false);
        C0f9.A09(1181238979, A02);
        return inflate;
    }
}
