package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.OvB, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56091OvB implements InterfaceC66482zP {
    public final UserSession A00;
    public final NKD A01;

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C14360o3.A0B(obj, 0);
        return true;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return "open_carousel_card_preview";
    }

    public C56091OvB(UserSession userSession, NKD nkd) {
        AbstractC167017dG.A1P(userSession, nkd);
        this.A00 = userSession;
        this.A01 = nkd;
    }
}
