package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.5dF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C120695dF implements InterfaceC14180ni, InterfaceC76323bc {
    public final /* synthetic */ AnonymousClass399 A00;

    public C120695dF(AnonymousClass399 anonymousClass399) {
        this.A00 = anonymousClass399;
    }

    @Override // X.InterfaceC76323bc
    public final C79743hP AXa(UserSession userSession, C75113Zb c75113Zb, String str, boolean z) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(c75113Zb, 3);
        return this.A00.A00(userSession, c75113Zb, str, z);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC76323bc) && (obj instanceof InterfaceC14180ni)) {
            return C14360o3.A0K(getFunctionDelegate(), ((InterfaceC14180ni) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // X.InterfaceC14180ni
    public final InterfaceC09250da getFunctionDelegate() {
        return new C03E(4, this.A00, AnonymousClass399.class, "getOrCreateHolderForMedia", "getOrCreateHolderForMedia(Ljava/lang/String;ZLcom/instagram/common/session/UserSession;Lcom/instagram/feed/ui/state/MediaState;)Lcom/instagram/feed/ui/rows/mediaview/ui/litho/LithoMediaViewHolder;", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
