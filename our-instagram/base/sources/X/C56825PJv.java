package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.PJv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56825PJv implements InterfaceC149306ng {
    public Long A00;
    public final UserSession A01;
    public final C6Z6 A02;

    @Override // X.InterfaceC149306ng
    public final void EmP(String str, String str2, Throwable th) {
        C14360o3.A0B(str2, 1);
        LD2.A01(this.A01, null, "render_error", LD2.A00(this.A02), str2);
    }

    @Override // X.InterfaceC149306ng
    public final void EmN(String str, String str2) {
        LD2.A01(this.A01, null, "render_error", LD2.A00(this.A02), str2);
    }

    public C56825PJv(UserSession userSession, C6Z6 c6z6) {
        this.A01 = userSession;
        this.A02 = c6z6;
    }
}
