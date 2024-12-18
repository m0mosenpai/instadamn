package X;

import android.view.Choreographer;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.576, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass576 implements AnonymousClass577 {
    public final Choreographer A00;
    public final AnonymousClass572 A01;

    @Override // X.C12W
    public final Object fold(Object obj, InterfaceC16620sF interfaceC16620sF) {
        C14360o3.A0B(interfaceC16620sF, 2);
        return interfaceC16620sF.invoke(obj, this);
    }

    @Override // X.AnonymousClass577
    public final Object FE9(InterfaceC23621Ds interfaceC23621Ds, final InterfaceC16660sJ interfaceC16660sJ) {
        InterfaceC16660sJ c65076Td9;
        AnonymousClass572 anonymousClass572 = this.A01;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C24891Jo.A02;
        final C24891Jo c24891Jo = new C24891Jo(1, C1E2.A02(interfaceC23621Ds));
        c24891Jo.A0I();
        Choreographer.FrameCallback frameCallback = new Choreographer.FrameCallback(this) { // from class: X.5qw
            public final /* synthetic */ AnonymousClass576 A00;

            {
                this.A00 = this;
            }

            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                Object c09540e5;
                InterfaceC24901Jp interfaceC24901Jp = c24891Jo;
                try {
                    c09540e5 = interfaceC16660sJ.invoke(Long.valueOf(j));
                } catch (Throwable th) {
                    c09540e5 = new C09540e5(th);
                }
                interfaceC24901Jp.resumeWith(c09540e5);
            }
        };
        Choreographer choreographer = anonymousClass572.A05;
        Choreographer choreographer2 = this.A00;
        if (C14360o3.A0K(choreographer, choreographer2)) {
            synchronized (anonymousClass572.A08) {
                anonymousClass572.A01.add(frameCallback);
                if (!anonymousClass572.A02) {
                    anonymousClass572.A02 = true;
                    choreographer.postFrameCallback(anonymousClass572.A07);
                }
            }
            c65076Td9 = new C9F3(15, anonymousClass572, frameCallback);
        } else {
            choreographer2.postFrameCallback(frameCallback);
            c65076Td9 = new C65076Td9(2, this, frameCallback);
        }
        c24891Jo.CPA(c65076Td9);
        return c24891Jo.A0E();
    }

    @Override // X.C12V
    public final /* synthetic */ InterfaceC212412b getKey() {
        return AnonymousClass577.A00;
    }

    public AnonymousClass576(Choreographer choreographer, AnonymousClass572 anonymousClass572) {
        this.A00 = choreographer;
        this.A01 = anonymousClass572;
    }

    @Override // X.C12V, X.C12W
    public final C12V get(InterfaceC212412b interfaceC212412b) {
        return AnonymousClass190.A00(this, interfaceC212412b);
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
