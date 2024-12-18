package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.TzX, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66096TzX implements InterfaceC61782rf {
    public final Map A01 = new LinkedHashMap();
    public final Map A00 = new LinkedHashMap();

    @Override // X.InterfaceC61782rf
    public final C75113Zb BRZ(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        Map map = this.A01;
        C75113Zb c75113Zb = (C75113Zb) map.get(c38321qM);
        if (c75113Zb == null) {
            C75113Zb A0E = AbstractC37303Gc4.A0E(c38321qM);
            map.put(c38321qM, A0E);
            return A0E;
        }
        return c75113Zb;
    }
}
