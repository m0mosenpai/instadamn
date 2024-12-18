package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2n8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C59072n8 {
    public final Object A02;
    public final Object A03;
    public final String A04;
    public List A01 = null;
    public C59062n7 A00 = C59062n7.A07;

    public C59072n8 A00(InterfaceC43071ya interfaceC43071ya) {
        List list = this.A01;
        if (list == null) {
            list = new ArrayList();
            this.A01 = list;
        }
        list.add(interfaceC43071ya);
        return this;
    }

    public C59062n7 A01() {
        return new C59062n7(this);
    }

    public C59072n8(Object obj, Object obj2, String str) {
        this.A02 = obj;
        this.A03 = obj2;
        this.A04 = str;
    }

    public final void A02(C59062n7 c59062n7) {
        this.A00 = c59062n7;
    }
}
