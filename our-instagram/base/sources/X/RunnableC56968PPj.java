package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.PPj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56968PPj implements Runnable {
    public final /* synthetic */ EnumC53112NeP A00;
    public final /* synthetic */ C161167Kb A01;

    public RunnableC56968PPj(EnumC53112NeP enumC53112NeP, C161167Kb c161167Kb) {
        this.A01 = c161167Kb;
        this.A00 = enumC53112NeP;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        C3LX c3lx;
        C161167Kb c161167Kb = this.A01;
        C58632mM c58632mM = c161167Kb.A01;
        EnumC53112NeP enumC53112NeP = this.A00;
        int ordinal = enumC53112NeP.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                atomicReference = c161167Kb.A06;
            } else {
                throw B4Z.A00();
            }
        } else {
            atomicReference = c161167Kb.A07;
        }
        if (enumC53112NeP == EnumC53112NeP.A02) {
            c3lx = AbstractC54365O0x.A00;
        } else {
            c3lx = AbstractC54365O0x.A01;
        }
        InterfaceC58742mX interfaceC58742mX = c161167Kb.A00;
        C48128LSd c48128LSd = new C48128LSd(0, enumC53112NeP, c161167Kb);
        C6VI c6vi = (C6VI) atomicReference.get();
        if (c6vi == null) {
            c6vi = c58632mM.A01(c3lx, interfaceC58742mX, c48128LSd);
            if (!C1EM.A00(null, c6vi, atomicReference)) {
                c6vi = (C6VI) atomicReference.get();
            }
        }
        AbstractC56582ir abstractC56582ir = (AbstractC56582ir) c6vi.A00();
        if (abstractC56582ir != null) {
            c161167Kb.A04.execute(new PSB(abstractC56582ir, enumC53112NeP, c161167Kb));
        }
    }
}
