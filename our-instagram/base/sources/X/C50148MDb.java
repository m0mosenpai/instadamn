package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.MDb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C50148MDb extends C03E implements InterfaceC16610sE {
    public static final C50148MDb A00 = new C50148MDb();

    public C50148MDb() {
        super(3, AnonymousClass198.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        AnonymousClass198 anonymousClass198 = (AnonymousClass198) obj;
        C2QS c2qs = (C2QS) obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AnonymousClass198.A00;
        while (true) {
            Object A0C = anonymousClass198.A0C();
            if (!(A0C instanceof C19B)) {
                if (!(A0C instanceof C1JW)) {
                    A0C = AnonymousClass199.A00(A0C);
                }
                c2qs.A01 = A0C;
            } else if (AnonymousClass198.A00(A0C, anonymousClass198) >= 0) {
                c2qs.A00 = anonymousClass198.CPD(new C50376MMd(anonymousClass198, c2qs));
                break;
            }
        }
        return C0eB.A00;
    }
}
