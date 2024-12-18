package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.49o, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C918649o {
    public static final /* synthetic */ AtomicIntegerFieldUpdater A01 = AtomicIntegerFieldUpdater.newUpdater(C918649o.class, "notCompletedCount$volatile");
    public final InterfaceC50122Sb[] A00;
    public volatile /* synthetic */ int notCompletedCount$volatile;

    public final Object A00(InterfaceC23621Ds interfaceC23621Ds) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C24891Jo.A04;
        C24891Jo c24891Jo = new C24891Jo(1, C1E2.A02(interfaceC23621Ds));
        c24891Jo.A0I();
        AnonymousClass195[] anonymousClass195Arr = this.A00;
        int length = anonymousClass195Arr.length;
        C918749p[] c918749pArr = new C918749p[length];
        for (int i = 0; i < length; i++) {
            AnonymousClass195 anonymousClass195 = anonymousClass195Arr[i];
            anonymousClass195.Emo();
            C918749p c918749p = new C918749p(this, c24891Jo);
            c918749p.A00 = anonymousClass195.CPD(c918749p);
            c918749pArr[i] = c918749p;
        }
        C918849q c918849q = new C918849q(this, c918749pArr);
        for (int i2 = 0; i2 < length; i2++) {
            C918749p.A03.set(c918749pArr[i2], c918849q);
        }
        if (!(C24891Jo.A04.get(c24891Jo) instanceof C13E)) {
            c918849q.A06();
        } else {
            c24891Jo.CPA(c918849q);
        }
        return c24891Jo.A0E();
    }

    public C918649o(InterfaceC50122Sb[] interfaceC50122SbArr) {
        this.A00 = interfaceC50122SbArr;
        this.notCompletedCount$volatile = interfaceC50122SbArr.length;
    }
}
