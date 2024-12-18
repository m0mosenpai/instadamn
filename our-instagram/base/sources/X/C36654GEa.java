package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import kotlin.Deprecated;

@Deprecated(message = "This QP action should already be deprecated.")
/* renamed from: X.GEa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36654GEa implements GYB {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final String A02;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        String str;
        C1ZX A01 = C1ZV.A00(this.A01).A01(C05F.A04, C05F.A0M, false);
        A01.A03("action_type", "INTEROP_MAIN_DISCLOSURE_SHEET");
        if (AbstractC111324zv.A00(2403).equals(this.A02)) {
            str = "main_disclosure_inbox";
        } else {
            str = "main_disclosure_feed";
        }
        A01.A03(CacheBehaviorLogger.SOURCE, str);
        A01.A00();
    }

    public C36654GEa(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
        this.A02 = str;
    }
}
