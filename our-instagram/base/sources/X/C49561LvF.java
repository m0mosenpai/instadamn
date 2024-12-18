package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.LvF, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49561LvF implements GYB {
    public final Fragment A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        new C47756L7c(this.A00.requireActivity(), this.A01, this.A02, "igd_android_qp").A00();
    }

    public C49561LvF(Fragment fragment, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A00 = fragment;
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
    }
}
