package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.OvS, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56108OvS implements InterfaceC66482zP {
    public final UserSession A00;
    public final InterfaceC57955Pn1 A01;
    public final String A02;
    public final String A03;

    public C56108OvS(UserSession userSession, InterfaceC57955Pn1 interfaceC57955Pn1, String str, String str2) {
        C14360o3.A0B(userSession, 5);
        this.A03 = str;
        this.A01 = interfaceC57955Pn1;
        this.A02 = str2;
        this.A00 = userSession;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return AnonymousClass001.A0R("video_metadata_tagging_", this.A03);
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C56108OvS c56108OvS = (C56108OvS) obj;
        C14360o3.A0B(c56108OvS, 0);
        if (C14360o3.A0K(this.A03, c56108OvS.A03) && C14360o3.A0K(this.A02, c56108OvS.A02)) {
            return true;
        }
        return false;
    }
}
