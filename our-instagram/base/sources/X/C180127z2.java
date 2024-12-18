package X;

import java.util.List;

/* renamed from: X.7z2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C180127z2 extends AbstractC179807yU implements InterfaceC180137z3 {
    public int A00;
    public C197368o7 A01;
    public final C1814082s A02;

    @Override // X.AbstractC178227vw
    public final void A09() {
        this.A00 = 1;
        List list = this.A02.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((C197368o7) list.get(i)).A02();
        }
    }

    @Override // X.InterfaceC180137z3
    public final C197368o7 AN0(InterfaceC197408oB interfaceC197408oB) {
        C178087vh c178087vh = InterfaceC178817wt.A01;
        InterfaceC178207vu interfaceC178207vu = ((AbstractC179807yU) this).A00;
        C197368o7 c197368o7 = new C197368o7(((InterfaceC199408rh) interfaceC178207vu.Aq0(InterfaceC199408rh.A00)).B6U(), ((InterfaceC178817wt) interfaceC178207vu.Aq0(c178087vh)).Ac3(), (InterfaceC178407wE) interfaceC178207vu.Aq1(InterfaceC178407wE.A00), ((InterfaceC178817wt) interfaceC178207vu.Aq0(c178087vh)).AMz(), interfaceC197408oB);
        if (this.A00 >= 1) {
            c197368o7.A02();
        }
        if (this.A00 >= 2) {
            c197368o7.A0K = true;
        }
        this.A02.A01(c197368o7);
        return c197368o7;
    }

    @Override // X.InterfaceC180137z3
    public final C197368o7 AwM() {
        if (this.A01 == null) {
            C178087vh c178087vh = InterfaceC178817wt.A01;
            InterfaceC178207vu interfaceC178207vu = ((AbstractC179807yU) this).A00;
            C197368o7 c197368o7 = new C197368o7(((InterfaceC199408rh) interfaceC178207vu.Aq0(InterfaceC199408rh.A00)).B6U(), ((InterfaceC178817wt) interfaceC178207vu.Aq0(c178087vh)).Ac3(), (InterfaceC178407wE) interfaceC178207vu.Aq1(InterfaceC178407wE.A00), ((InterfaceC178817wt) interfaceC178207vu.Aq0(c178087vh)).AwL(), null);
            this.A01 = c197368o7;
            if (this.A00 >= 1) {
                c197368o7.A02();
            }
            if (this.A00 >= 2) {
                this.A01.A0K = true;
            }
            this.A02.A01(this.A01);
        }
        return this.A01;
    }

    @Override // X.InterfaceC179817yV
    public final C179837yX BKZ() {
        return InterfaceC180137z3.A00;
    }

    @Override // X.InterfaceC180137z3
    public final void EEQ(final C197368o7 c197368o7) {
        if (this.A02.A02(c197368o7)) {
            if (this.A00 >= 2) {
                c197368o7.A0K = false;
            }
            if (this.A00 >= 1) {
                c197368o7.A0C(new Runnable() { // from class: X.Api
                    @Override // java.lang.Runnable
                    public final void run() {
                        C197368o7.this.A03();
                    }
                });
            }
        }
    }

    public C180127z2(InterfaceC178207vu interfaceC178207vu) {
        super(interfaceC178207vu);
        this.A02 = new C1814082s();
        this.A00 = 0;
    }
}
