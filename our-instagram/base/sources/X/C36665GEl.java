package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.GEl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36665GEl implements GYB {
    public final FragmentActivity A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.1vN] */
    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        if (bundle != null && bundle.get("target_thread_id") != null) {
            AbstractC25651Mw.A00(this.A02).E4s(new Object());
        }
    }

    public C36665GEl(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
    }
}
