package X;

import androidx.compose.runtime.snapshots.Snapshot;

/* renamed from: X.3Z5, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3Z5 {
    public static final Object A04(InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ) {
        Snapshot c3z3;
        if (interfaceC16660sJ == null) {
            return interfaceC16820sZ.invoke();
        }
        C75033Yt c75033Yt = AbstractC75013Yr.A05;
        Snapshot snapshot = (Snapshot) c75033Yt.A00();
        C3Z1 c3z1 = null;
        if (snapshot instanceof C3Z3) {
            C3Z3 c3z32 = (C3Z3) snapshot;
            boolean z = false;
            if (c3z32.A02 == Thread.currentThread().getId()) {
                z = true;
            }
            if (z) {
                InterfaceC16660sJ interfaceC16660sJ2 = c3z32.A00;
                InterfaceC16660sJ interfaceC16660sJ3 = c3z32.A01;
                try {
                    c3z32.A00 = AbstractC75013Yr.A0C(interfaceC16660sJ, interfaceC16660sJ2, true);
                    c3z32.A01 = interfaceC16660sJ3;
                    return interfaceC16820sZ.invoke();
                } finally {
                    c3z32.A00 = interfaceC16660sJ2;
                    c3z32.A01 = interfaceC16660sJ3;
                }
            }
        }
        if (snapshot != null && !(snapshot instanceof C3Z1)) {
            c3z3 = snapshot.A02(interfaceC16660sJ);
        } else {
            if (snapshot instanceof C3Z1) {
                c3z1 = (C3Z1) snapshot;
            }
            c3z3 = new C3Z3(c3z1, interfaceC16660sJ, null, true, false);
        }
        try {
            Snapshot snapshot2 = (Snapshot) c75033Yt.A00();
            c75033Yt.A01(c3z3);
            try {
                return interfaceC16820sZ.invoke();
            } finally {
                c75033Yt.A01(snapshot2);
            }
        } finally {
            c3z3.A0H();
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.57a] */
    public static final C1127057a A01(final InterfaceC16620sF interfaceC16620sF) {
        AbstractC75013Yr.A0A(AbstractC75013Yr.A09);
        synchronized (AbstractC75013Yr.A07) {
            AbstractC75013Yr.A02 = AbstractC001800i.A0T(interfaceC16620sF, AbstractC75013Yr.A02);
        }
        return new InterfaceC1127157b() { // from class: X.57a
            @Override // X.InterfaceC1127157b
            public final void dispose() {
                InterfaceC16620sF interfaceC16620sF2 = InterfaceC16620sF.this;
                synchronized (AbstractC75013Yr.A07) {
                    AbstractC75013Yr.A02 = AbstractC001800i.A0f(AbstractC75013Yr.A02, interfaceC16620sF2);
                }
            }
        };
    }

    public static final Snapshot A02() {
        return (Snapshot) AbstractC75013Yr.A05.A00();
    }

    public static final Snapshot A03(Snapshot snapshot) {
        if (snapshot instanceof C3Z3) {
            C3Z3 c3z3 = (C3Z3) snapshot;
            if (c3z3.A02 == Thread.currentThread().getId()) {
                c3z3.A00 = null;
                return snapshot;
            }
        }
        if (snapshot instanceof C3Z4) {
            C3Z4 c3z4 = (C3Z4) snapshot;
            if (c3z4.A01 == Thread.currentThread().getId()) {
                c3z4.A00 = null;
                return snapshot;
            }
        }
        Snapshot A01 = AbstractC75013Yr.A01(snapshot, null, false);
        C75033Yt c75033Yt = AbstractC75013Yr.A05;
        c75033Yt.A00();
        c75033Yt.A01(A01);
        return A01;
    }

    public static final void A05() {
        boolean z;
        synchronized (AbstractC75013Yr.A07) {
            C18570vk A0I = ((C3Z0) AbstractC75013Yr.A08.get()).A0I();
            z = true;
            if (A0I != null) {
                if (A0I.A01 != 0) {
                }
            }
            z = false;
        }
        if (z) {
            AbstractC75013Yr.A0A(C5TV.A00);
        }
    }

    public static final void A06(Snapshot snapshot, Snapshot snapshot2, InterfaceC16660sJ interfaceC16660sJ) {
        if (snapshot == snapshot2) {
            if (snapshot instanceof C3Z3) {
                ((C3Z3) snapshot).A00 = interfaceC16660sJ;
                return;
            } else {
                if (snapshot instanceof C3Z4) {
                    ((C3Z4) snapshot).A00 = interfaceC16660sJ;
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Non-transparent snapshot was reused: ");
                sb.append(snapshot);
                throw new IllegalStateException(sb.toString());
            }
        }
        AbstractC75013Yr.A05.A01(snapshot);
        snapshot2.A0H();
    }

    public static final boolean A07() {
        if (AbstractC75013Yr.A05.A00() == null) {
            return false;
        }
        return true;
    }

    public static final C3Z1 A00(InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2) {
        C3Z1 c3z1;
        C3Z1 A0J;
        Snapshot A00 = AbstractC75013Yr.A00();
        if ((A00 instanceof C3Z1) && (c3z1 = (C3Z1) A00) != null && (A0J = c3z1.A0J(interfaceC16660sJ, interfaceC16660sJ2)) != null) {
            return A0J;
        }
        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
    }
}
