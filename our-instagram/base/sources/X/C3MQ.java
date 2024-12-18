package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.3MQ, reason: invalid class name */
/* loaded from: classes2.dex */
public class C3MQ implements C3MR {
    public UserSession A00;
    public InterfaceC60162oy A01;
    public C24461Hp A02;
    public InterfaceC60442pS A03;
    public C3MS A04;

    @Override // X.C3MR
    public void Dih(long j) {
        InterfaceC60162oy interfaceC60162oy = this.A01;
        Integer BRW = interfaceC60162oy.BRW();
        String BkH = interfaceC60162oy.BkH();
        if (BRW.equals(C05F.A00)) {
            AbstractC23021Ah.A00(this.A00).A0f(System.currentTimeMillis());
        }
        C11T.A07(false, new PSV(this, BRW, BkH));
    }

    public C3MQ(UserSession userSession, InterfaceC60162oy interfaceC60162oy, InterfaceC60442pS interfaceC60442pS, String str) {
        this.A01 = interfaceC60162oy;
        this.A00 = userSession;
        this.A03 = interfaceC60442pS;
        this.A02 = AbstractC24451Ho.A00(userSession);
        this.A04 = new C3MS(this.A00, this.A03, str);
    }
}
