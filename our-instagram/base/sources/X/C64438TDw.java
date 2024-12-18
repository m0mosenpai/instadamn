package X;

import java.util.Collections;
import java.util.Iterator;

/* renamed from: X.TDw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64438TDw implements InterfaceC65438TkA {
    public volatile java.util.Set A00;
    public volatile java.util.Set A01;

    @Override // X.InterfaceC65438TkA
    public final /* bridge */ /* synthetic */ Object get() {
        if (this.A00 == null) {
            synchronized (this) {
                if (this.A00 == null) {
                    this.A00 = Collections.newSetFromMap(AbstractC58318PtA.A14());
                    Iterator it = this.A01.iterator();
                    while (it.hasNext()) {
                        this.A00.add(((InterfaceC65438TkA) it.next()).get());
                    }
                    this.A01 = null;
                }
            }
        }
        return Collections.unmodifiableSet(this.A00);
    }
}
