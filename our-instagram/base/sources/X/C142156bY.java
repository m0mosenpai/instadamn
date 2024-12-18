package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.showreelnative.ui.reels.IgShowreelNativeProgressView;

/* renamed from: X.6bY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C142156bY {
    public static final boolean A00(View view, UserSession userSession, C41181vS c41181vS) {
        IgShowreelNativeProgressView igShowreelNativeProgressView;
        if (view == null) {
            return false;
        }
        C41051vD c41051vD = C41051vD.A01;
        c41051vD.A00 = userSession;
        return new C1341564a(c41051vD, 0, false).Cah() && AbstractC130925vf.A0f(c41181vS) && (igShowreelNativeProgressView = (IgShowreelNativeProgressView) view.findViewById(R.id.sponsored_reel_showreel_native_view)) != null && igShowreelNativeProgressView.CXh();
    }
}
