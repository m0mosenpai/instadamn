package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7Xp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C164507Xp extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C7XQ A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ InterfaceC16820sZ A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C164507Xp(C7XQ c7xq, String str, InterfaceC16820sZ interfaceC16820sZ, int i) {
        super(0);
        this.A01 = c7xq;
        this.A02 = str;
        this.A00 = i;
        this.A03 = interfaceC16820sZ;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        C7XQ c7xq = this.A01;
        UserSession userSession = c7xq.A0G;
        AbstractC59962oe abstractC59962oe = c7xq.A0E;
        C7WZ c7wz = c7xq.A0H;
        InterfaceC60442pS interfaceC60442pS = c7wz.A08;
        C18920wW c18920wW = c7wz.A03;
        boolean A00 = c7wz.A07.A00();
        String str = this.A02;
        return new C164517Xq(abstractC59962oe, abstractC59962oe, c18920wW, userSession, (C7XR) c7xq.A0Q.getValue(), interfaceC60442pS, str, c7xq.A0t, this.A03, c7wz.A0K, c7wz.A0L, this.A00, A00);
    }
}
