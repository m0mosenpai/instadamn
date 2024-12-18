package X;

import com.instagram.model.direct.messageid.DirectMessageIdentifier;

/* renamed from: X.7Xw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C164577Xw implements InterfaceC164587Xx {
    public final C164597Xy A00;
    public final InterfaceC16820sZ A01;

    public C164577Xw(InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(interfaceC16820sZ, 1);
        this.A01 = interfaceC16820sZ;
        this.A00 = new C164597Xy();
    }

    @Override // X.InterfaceC164587Xx
    public final void CnN(DirectMessageIdentifier directMessageIdentifier) {
        C164597Xy c164597Xy = this.A00;
        synchronized (c164597Xy) {
            c164597Xy.A00.remove(C164597Xy.A00(c164597Xy, directMessageIdentifier));
        }
        ((C7U0) this.A01.invoke()).C78().CnP(directMessageIdentifier);
    }

    @Override // X.InterfaceC164587Xx
    public final void CnO(DirectMessageIdentifier directMessageIdentifier) {
        C164597Xy c164597Xy = this.A00;
        synchronized (c164597Xy) {
            C164597Xy.A00(c164597Xy, directMessageIdentifier);
        }
    }
}
