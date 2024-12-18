package X;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.49p, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C918749p extends C19H {
    public static final /* synthetic */ AtomicReferenceFieldUpdater A03 = AtomicReferenceFieldUpdater.newUpdater(C918749p.class, Object.class, "_disposer$volatile");
    public C19D A00;
    public final InterfaceC24901Jp A01;
    public final /* synthetic */ C918649o A02;
    public volatile /* synthetic */ Object _disposer$volatile;

    public C918749p(C918649o c918649o, InterfaceC24901Jp interfaceC24901Jp) {
        this.A02 = c918649o;
        this.A01 = interfaceC24901Jp;
    }

    @Override // X.C19I
    public final void A05(Throwable th) {
        if (th != null) {
            InterfaceC24901Jp interfaceC24901Jp = this.A01;
            C20730zt A02 = C24891Jo.A02(new C1JW(false, th), null, (C24891Jo) interfaceC24901Jp);
            if (A02 != null) {
                interfaceC24901Jp.AIl(A02);
                C918849q c918849q = (C918849q) A03.get(this);
                if (c918849q != null) {
                    c918849q.A06();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C918649o.A01;
        C918649o c918649o = this.A02;
        if (atomicIntegerFieldUpdater.decrementAndGet(c918649o) != 0) {
            return;
        }
        InterfaceC24901Jp interfaceC24901Jp2 = this.A01;
        Object[] objArr = c918649o.A00;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(((AnonymousClass198) obj).A0B());
        }
        interfaceC24901Jp2.resumeWith(arrayList);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A05((Throwable) obj);
        return C0eB.A00;
    }
}
