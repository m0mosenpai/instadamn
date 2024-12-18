package X;

import android.text.TextUtils;
import com.instagram.common.session.UserSession;

/* renamed from: X.WoJ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71122WoJ implements InterfaceC72017XFf {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C1V4 A01;

    public C71122WoJ(UserSession userSession, C1V4 c1v4) {
        this.A01 = c1v4;
        this.A00 = userSession;
    }

    @Override // X.InterfaceC72017XFf
    public final /* bridge */ /* synthetic */ boolean D2q(C69427VnC c69427VnC, Object obj) {
        return TextUtils.isEmpty(C17060sy.A01.A01(this.A00).getFullName());
    }
}
