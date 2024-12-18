package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.8J9, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C8J9 implements C8C1 {
    public C8JE A00;
    public final C8C0 A01;

    public void A01(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C9V2) it.next()).A01(0.0f);
        }
        C8JE c8je = this.A00;
        if (c8je instanceof C8JC) {
            C8JC c8jc = (C8JC) c8je;
            ((C8JE) c8jc).A03 = false;
            c8jc.A02 = false;
            return;
        }
        c8je.A03 = false;
    }

    @Override // X.C8C1
    public final void AD6(int i) {
        this.A01.AD6(i);
    }

    public final void CMH(boolean z) {
        this.A01.A09(this, z);
    }

    @Override // X.C8C1
    public final boolean CcW() {
        return this.A01.CcW();
    }

    @Override // X.C8C1
    public final void EMO(int i, int i2) {
        this.A01.EMO(i, i2);
    }

    public final void EkB(boolean z, boolean z2) {
        Runnable runnableC24759Axh;
        if (this instanceof C218269ky) {
            C218269ky c218269ky = (C218269ky) this;
            ((C8J9) c218269ky).A01.A0A(c218269ky, true);
            C218219kt c218219kt = c218269ky.A01;
            int i = ((C8JF) c218219kt).A00;
            c218219kt.A03(i);
            runnableC24759Axh = new RunnableC24786Ay8(c218269ky, i, true);
        } else if (this instanceof C218279kz) {
            C218279kz c218279kz = (C218279kz) this;
            ((C8J9) c218279kz).A01.A0A(c218279kz, true);
            C218179kp c218179kp = c218279kz.A00;
            int i2 = ((C8JF) c218179kp).A00;
            c218179kp.A03(i2);
            runnableC24759Axh = new RunnableC24759Axh(c218279kz, i2, true);
        } else {
            this.A01.A0A(this, true);
            return;
        }
        C11T.A03(runnableC24759Axh);
    }

    public C8J9(C8C0 c8c0) {
        this.A01 = c8c0;
    }
}
