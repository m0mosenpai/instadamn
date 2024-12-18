package X;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.4ER, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4ER extends AbstractC56982jZ {
    public WeakReference A00;
    public boolean A01;
    public final C63622uj A02;
    public final C4EA A03;
    public final String A04;
    public final WeakHashMap A05;
    public final InterfaceC08830cm A06;
    public final InterfaceC08830cm A07;

    private final synchronized void A00(JI7 ji7, boolean z) {
        InterfaceC58972mv BXB = ji7.BXB();
        if (BXB != null) {
            C57112jm.A02(null, (C57112jm) this.A07.get(), BXB);
            if (z) {
                this.A05.remove(ji7);
            }
        }
    }

    public final synchronized void A03() {
        WeakHashMap weakHashMap = this.A05;
        Iterator it = weakHashMap.entrySet().iterator();
        while (it.hasNext()) {
            Object key = ((Map.Entry) it.next()).getKey();
            C14360o3.A07(key);
            A00((JI7) key, false);
            it.remove();
        }
        weakHashMap.clear();
    }

    public final synchronized void A05(JI7 ji7) {
        if (this.A05.containsKey(ji7)) {
            A00(ji7, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a8, code lost:
    
        if (r27 != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void A04(X.ICP r22, X.InterfaceC43457JHv r23, X.C4EU r24, X.JI7 r25, X.InterfaceC16620sF r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4ER.A04(X.ICP, X.JHv, X.4EU, X.JI7, X.0sF, boolean):void");
    }

    public C4ER(C4EA c4ea, InterfaceC08830cm interfaceC08830cm, InterfaceC08830cm interfaceC08830cm2) {
        this.A03 = c4ea;
        this.A06 = interfaceC08830cm;
        this.A07 = interfaceC08830cm2;
        String name = C4ER.class.getName();
        C14360o3.A07(name);
        this.A04 = name;
        this.A00 = new WeakReference(null);
        this.A05 = new WeakHashMap();
        this.A02 = new C63622uj();
    }
}
