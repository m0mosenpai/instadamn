package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.3At, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69593At extends AbstractC69603Au {
    public boolean A00;
    public final C69613Av A01;
    public final C69613Av A02;
    public final C69613Av A03;
    public final C69613Av A04;
    public final C69613Av A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C69593At(UserSession userSession) {
        super(userSession);
        C14360o3.A0B(userSession, 1);
        this.A04 = A02("media_component");
        this.A03 = A02("json_component");
        this.A02 = A02("initialize_component");
        this.A05 = A02("post_animation_component");
        this.A01 = A02("animation_component");
    }

    @Override // X.AbstractC69603Au
    public final void A04() {
        super.A04();
        this.A00 = false;
    }
}
