package X;

import android.view.Choreographer;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.CnM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28790CnM implements AnonymousClass577 {
    public static final Choreographer A00;
    public static final C28790CnM A01 = new Object();

    @Override // X.C12W
    public final Object fold(Object obj, InterfaceC16620sF interfaceC16620sF) {
        C14360o3.A0B(interfaceC16620sF, 2);
        return interfaceC16620sF.invoke(obj, this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.CnM, java.lang.Object] */
    static {
        C12T c12t = C12P.A00;
        A00 = (Choreographer) C2ST.A00(AnonymousClass131.A00.A06(), new GSB(0, null));
    }

    @Override // X.AnonymousClass577
    public final Object FE9(InterfaceC23621Ds interfaceC23621Ds, InterfaceC16660sJ interfaceC16660sJ) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C24891Jo.A04;
        C24891Jo c24891Jo = new C24891Jo(1, C1E2.A02(interfaceC23621Ds));
        c24891Jo.A0I();
        ChoreographerFrameCallbackC28591CjW choreographerFrameCallbackC28591CjW = new ChoreographerFrameCallbackC28591CjW(0, interfaceC16660sJ, c24891Jo);
        A00.postFrameCallback(choreographerFrameCallbackC28591CjW);
        c24891Jo.CPA(DRU.A00(choreographerFrameCallbackC28591CjW, 19));
        return c24891Jo.A0E();
    }

    @Override // X.C12V, X.C12W
    public final C12V get(InterfaceC212412b interfaceC212412b) {
        return AnonymousClass190.A00(this, interfaceC212412b);
    }

    @Override // X.C12V
    public final /* synthetic */ InterfaceC212412b getKey() {
        return AnonymousClass577.A00;
    }

    @Override // X.C12W
    public final C12W minusKey(InterfaceC212412b interfaceC212412b) {
        return AnonymousClass190.A01(this, interfaceC212412b);
    }

    @Override // X.C12W
    public final C12W plus(C12W c12w) {
        return AnonymousClass190.A02(this, c12w);
    }
}
