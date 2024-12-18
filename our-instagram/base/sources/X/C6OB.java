package X;

import java.util.Map;

/* renamed from: X.6OB, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6OB {
    public boolean A00 = true;
    public final InterfaceC117845Uu A01;
    public final Object A02;
    public final /* synthetic */ C6N3 A03;

    public C6OB(C6N3 c6n3, Object obj) {
        this.A03 = c6n3;
        this.A02 = obj;
        this.A01 = new C117835Ut((Map) c6n3.A02.get(obj), new C206929Dx(c6n3, 37));
    }

    public final void A00(Map map) {
        if (this.A00) {
            Map E4F = this.A01.E4F();
            if (E4F.isEmpty()) {
                map.remove(this.A02);
            } else {
                map.put(this.A02, E4F);
            }
        }
    }
}
