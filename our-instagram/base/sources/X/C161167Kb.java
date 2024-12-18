package X;

import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.7Kb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C161167Kb implements InterfaceC161177Kc {
    public static final String A09;
    public final InterfaceC58742mX A00;
    public final C58632mM A01;
    public final C161187Kd A02;
    public final Map A03;
    public final Executor A04;
    public final ExecutorService A05;
    public final AtomicReference A06;
    public final AtomicReference A07;
    public final C0Gd A08;

    public C161167Kb(C0Gd c0Gd, InterfaceC58742mX interfaceC58742mX, C58632mM c58632mM, C161187Kd c161187Kd, Executor executor, ExecutorService executorService) {
        C14360o3.A0B(c161187Kd, 2);
        C14360o3.A0B(interfaceC58742mX, 3);
        C14360o3.A0B(c0Gd, 6);
        this.A01 = c58632mM;
        this.A02 = c161187Kd;
        this.A00 = interfaceC58742mX;
        this.A04 = executor;
        this.A05 = executorService;
        this.A08 = c0Gd;
        this.A07 = new AtomicReference();
        this.A06 = new AtomicReference();
        this.A03 = new LinkedHashMap();
    }

    public static final synchronized void A00(AbstractC56582ir abstractC56582ir, EnumC53112NeP enumC53112NeP, C161167Kb c161167Kb) {
        AnonymousClass693 anonymousClass693;
        synchronized (c161167Kb) {
            Map map = c161167Kb.A03;
            C69071VhM c69071VhM = (C69071VhM) map.get(enumC53112NeP);
            if (c69071VhM != null) {
                c69071VhM.A02 = false;
                if (abstractC56582ir == null) {
                    c161167Kb.A08.EmN(A09, "Successful load did not include valid Document.");
                } else {
                    c69071VhM.A00 = new WeakReference(abstractC56582ir);
                }
                C69071VhM c69071VhM2 = (C69071VhM) map.get(enumC53112NeP);
                if (c69071VhM2 != null) {
                    java.util.Set set = c69071VhM2.A01;
                    for (C69523Vqn c69523Vqn : AbstractC224517h.A06(B92.A00, AbstractC001800i.A0o(set))) {
                        if (abstractC56582ir != null) {
                            anonymousClass693 = new AnonymousClass693(abstractC56582ir);
                        } else {
                            anonymousClass693 = null;
                        }
                        c69523Vqn.A00(anonymousClass693, enumC53112NeP);
                    }
                    set.clear();
                }
            }
        }
    }

    static {
        Map map = C0YZ.A03;
        A09 = AbstractC13230m9.A01(C161167Kb.class);
    }
}
