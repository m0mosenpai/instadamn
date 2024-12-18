package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.0A0, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0A0 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C0KV A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0A0(UserSession userSession, C0KV c0kv) {
        super(0);
        this.A01 = c0kv;
        this.A00 = userSession;
    }

    @Override // X.InterfaceC16820sZ
    public final Object invoke() {
        return this.A01.AXR(this.A00);
    }
}
