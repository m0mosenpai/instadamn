package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6pc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C150286pc implements InterfaceC08830cm {
    public Object A00;
    public final List A01 = new ArrayList();
    public final InterfaceC08830cm A02;
    public volatile boolean A03;

    @Override // X.InterfaceC08830cm
    public final Object get() {
        if (!this.A03) {
            synchronized (this) {
                if (!this.A03) {
                    this.A00 = this.A02.get();
                    this.A03 = true;
                    List list = this.A01;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC143366db) it.next()).D8b();
                    }
                    list.clear();
                }
            }
        }
        Object obj = this.A00;
        C14360o3.A0A(obj);
        return obj;
    }

    public C150286pc(InterfaceC08830cm interfaceC08830cm) {
        this.A02 = interfaceC08830cm;
    }
}
