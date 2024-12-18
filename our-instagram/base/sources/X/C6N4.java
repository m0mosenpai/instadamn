package X;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: X.6N4, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6N4 extends C0YY implements InterfaceC16620sF {
    public static final C6N4 A00 = new C6N4();

    public C6N4() {
        super(2);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C6N3 c6n3 = (C6N3) obj2;
        LinkedHashMap A03 = AbstractC06930Yk.A03(c6n3.A02);
        Iterator it = c6n3.A01.values().iterator();
        while (it.hasNext()) {
            ((C6OB) it.next()).A00(A03);
        }
        if (A03.isEmpty()) {
            return null;
        }
        return A03;
    }
}
