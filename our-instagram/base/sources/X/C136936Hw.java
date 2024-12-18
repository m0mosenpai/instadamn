package X;

import java.util.UUID;

/* renamed from: X.6Hw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C136936Hw {
    public final InterfaceC74963Ym A00;
    public final InterfaceC74963Ym A01;
    public final InterfaceC74963Ym A02;
    public final InterfaceC74963Ym A03;
    public final C6G3 A04;
    public final String A05;

    public C136936Hw(C6G3 c6g3) {
        C14360o3.A0B(c6g3, 1);
        this.A04 = c6g3;
        String obj = UUID.randomUUID().toString();
        C14360o3.A07(obj);
        this.A05 = obj;
        this.A00 = new C113775Bp(null, new C9EI(this, 38));
        this.A02 = new C113775Bp(null, new C9EI(this, 40));
        this.A03 = new C113775Bp(null, new C9EI(this, 41));
        this.A01 = new C113775Bp(null, new C9EI(this, 39));
    }

    public final void A00() {
        C43816JZd c43816JZd;
        C6G3 c6g3 = this.A04;
        String str = this.A05;
        InterfaceC74953Yl interfaceC74953Yl = c6g3.A07;
        if (!C14360o3.A0K(interfaceC74953Yl.getValue(), str) && (c43816JZd = (C43816JZd) c6g3.A0B.get(str)) != null) {
            c6g3.A04 = true;
            interfaceC74953Yl.Egh(str);
            c6g3.A02 = c43816JZd.A01;
            c6g3.A01 = c43816JZd.A00;
            c6g3.A00 = c43816JZd.A00();
            c6g3.A03 = false;
        }
    }
}
