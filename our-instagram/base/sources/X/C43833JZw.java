package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.JZw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43833JZw extends JQS {
    public final C69613Av A00;
    public final C69613Av A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43833JZw(UserSession userSession) {
        super(userSession);
        C14360o3.A0B(userSession, 1);
        this.A01 = new C69613Av(this, "gallery_loading");
        this.A00 = new C69613Av(this, "cameraInitialization");
    }

    @Override // X.AbstractC69603Au
    public final int A01() {
        return 31784976;
    }
}
