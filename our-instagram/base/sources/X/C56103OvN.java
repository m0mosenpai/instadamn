package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.OvN, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56103OvN implements InterfaceC66482zP {
    public final UserSession A00;
    public final boolean A01;
    public final boolean A02;

    public C56103OvN(UserSession userSession, boolean z, boolean z2) {
        C14360o3.A0B(userSession, 3);
        this.A02 = z;
        this.A01 = z2;
        this.A00 = userSession;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return "video_metadata_promote";
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C56103OvN c56103OvN = (C56103OvN) obj;
        C14360o3.A0B(c56103OvN, 0);
        return AbstractC167007dF.A1P(this.A01 ? 1 : 0, c56103OvN.A01 ? 1 : 0);
    }
}
