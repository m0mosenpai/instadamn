package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public final class T2P implements C2GC {
    public final T2Q A00;

    @Override // X.C2GC
    public final void Chz(String str, Map map) {
        C14360o3.A0B(str, 0);
        if (map != null) {
            HashMap A10 = AbstractC58318PtA.A10(map);
            C54s c54s = new C54s(C913045j.A00);
            Iterator A15 = AbstractC166997dE.A15(map);
            while (A15.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A15);
                String A17 = AbstractC31172DnG.A17(A1K);
                Object value = A1K.getValue();
                if (value instanceof Integer) {
                    c54s.A0D(A17, AbstractC166987dD.A0H(value));
                } else {
                    c54s.A0F(A17, AbstractC31180DnO.A0k(value));
                }
            }
            A10.put("paymod_extra_data", AbstractC166987dD.A19(c54s));
            this.A00.Chz(str, Collections.unmodifiableMap(A10));
        }
    }

    public T2P(AbstractC12990ll abstractC12990ll) {
        C12210kP c12210kP = new C12210kP(abstractC12990ll);
        c12210kP.A01 = "payflows";
        C18920wW A00 = c12210kP.A00();
        this.A00 = new T2Q(A00, new C2GB(A00));
    }
}
