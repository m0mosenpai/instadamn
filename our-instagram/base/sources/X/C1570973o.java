package X;

import java.util.Iterator;

/* renamed from: X.73o, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C1570973o extends C03E implements InterfaceC16820sZ {
    public C1570973o(Object obj) {
        super(0, obj, C1570773m.class, "logTrayItemImpressions", "logTrayItemImpressions()V", 0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        C1570773m c1570773m = (C1570773m) this.receiver;
        C6Z0 c6z0 = c1570773m.A02;
        if (c6z0.A00 != null && c6z0.A01 != null) {
            Iterator it = c1570773m.A03.iterator();
            while (it.hasNext()) {
                it.next();
                C18920wW c18920wW = c1570773m.A00;
                if (c18920wW.A00(c18920wW.A00, "igd_an_tray_impression").isSampled()) {
                    throw new NullPointerException("getUser");
                }
            }
        }
        return C0eB.A00;
    }
}
