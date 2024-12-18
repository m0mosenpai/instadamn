package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.GrG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38211GrG {
    public final Context A00;
    public final Fragment A01;
    public final UserSession A02;
    public final C38208GrD A03;
    public final InterfaceC60442pS A04;
    public final String A05;

    public C38211GrG(Context context, Fragment fragment, UserSession userSession, C38208GrD c38208GrD, InterfaceC60442pS interfaceC60442pS, String str) {
        C14360o3.A0B(fragment, 1);
        this.A01 = fragment;
        this.A00 = context;
        this.A04 = interfaceC60442pS;
        this.A02 = userSession;
        this.A05 = str;
        this.A03 = c38208GrD;
    }

    public final void A00() {
        String str;
        C38208GrD c38208GrD = this.A03;
        InterfaceC60442pS interfaceC60442pS = this.A04;
        if (C14360o3.A0K(interfaceC60442pS.getModuleName(), "explore_popular")) {
            str = "explore_grid_media_tap";
        } else if (C14360o3.A0K(interfaceC60442pS.getModuleName(), "serp_top")) {
            str = "search_grid_media_tap";
        } else {
            C0w9.A03("GridAdsLogger", "wrong module for logging grid media tap");
            return;
        }
        c38208GrD.A00(interfaceC60442pS, str);
    }
}
