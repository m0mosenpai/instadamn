package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.LEm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47918LEm {
    public final String A00;
    public final List A01;
    public final Map A02;
    public final boolean A03;
    public final /* synthetic */ C48516LdE A04;

    public C47918LEm(C48516LdE c48516LdE, String str, List list, Map map, boolean z) {
        this.A04 = c48516LdE;
        this.A00 = str;
        this.A01 = list;
        this.A03 = z;
        this.A02 = map;
    }

    public static final void A00(C47918LEm c47918LEm) {
        Iterator it = c47918LEm.A01.iterator();
        while (it.hasNext()) {
            String A0h = AbstractC43592JPx.A0e(it).A0h();
            if (A0h != null) {
                c47918LEm.A04.A02.remove(new C50679MYx(c47918LEm.A00, A0h, 30));
            }
        }
    }
}
