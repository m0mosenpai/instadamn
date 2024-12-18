package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.6jD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C146756jD implements InterfaceC43071ya {
    public final C41661wG A00;
    public final Map A01 = new HashMap();

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        C14360o3.A0B(c59062n7, 0);
        C14360o3.A0B(interfaceC57162jr, 1);
        if (interfaceC57162jr.CFq(c59062n7) == C05F.A0C) {
            Map map = this.A01;
            String id = ((C41551w4) c59062n7.A03).A0H.getId();
            C14360o3.A07(id);
            map.remove(id);
        }
    }

    public C146756jD(C41661wG c41661wG) {
        this.A00 = c41661wG;
    }
}
