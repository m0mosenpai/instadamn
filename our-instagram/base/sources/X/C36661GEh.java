package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.GEh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36661GEh implements GYB {
    public final Fragment A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        UserSession userSession = this.A02;
        new C35233FgQ(this.A00, this.A01, userSession, null, null).A07(EnumC33444EqG.A0I);
    }

    public C36661GEh(Fragment fragment, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = interfaceC11380iw;
        this.A02 = userSession;
    }
}
