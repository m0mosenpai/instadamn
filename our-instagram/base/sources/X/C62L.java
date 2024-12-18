package X;

import java.util.Iterator;

/* renamed from: X.62L, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C62L implements C62F {
    public AbstractC118405Xc A00;
    public AbstractC118405Xc A01;
    public AbstractC118405Xc A02;
    public final C62H A03;

    @Override // X.C62F
    public final AbstractC118405Xc B2E(AbstractC118405Xc abstractC118405Xc, AbstractC118405Xc abstractC118405Xc2, AbstractC118405Xc abstractC118405Xc3) {
        AbstractC118405Xc abstractC118405Xc4 = this.A00;
        if (abstractC118405Xc4 == null) {
            abstractC118405Xc4 = AbstractC137336Kc.A01(abstractC118405Xc3);
            this.A00 = abstractC118405Xc4;
        }
        int i = 0;
        if (abstractC118405Xc4 != null) {
            int A01 = abstractC118405Xc4.A01();
            while (true) {
                if (i < A01) {
                    AbstractC118405Xc abstractC118405Xc5 = this.A00;
                    if (abstractC118405Xc5 == null) {
                        break;
                    }
                    abstractC118405Xc5.A03(i, this.A03.AXB(i).B2D(abstractC118405Xc.A00(i), abstractC118405Xc2.A00(i), abstractC118405Xc3.A00(i)));
                    i++;
                } else {
                    AbstractC118405Xc abstractC118405Xc6 = this.A00;
                    if (abstractC118405Xc6 != null) {
                        return abstractC118405Xc6;
                    }
                }
            }
        }
        C14360o3.A0F("endVelocityVector");
        throw C00O.createAndThrow();
    }

    @Override // X.C62F
    public final AbstractC118405Xc CEY(AbstractC118405Xc abstractC118405Xc, AbstractC118405Xc abstractC118405Xc2, AbstractC118405Xc abstractC118405Xc3, long j) {
        AbstractC118405Xc abstractC118405Xc4 = this.A01;
        if (abstractC118405Xc4 == null) {
            abstractC118405Xc4 = AbstractC137336Kc.A01(abstractC118405Xc);
            this.A01 = abstractC118405Xc4;
        }
        int i = 0;
        if (abstractC118405Xc4 != null) {
            int A01 = abstractC118405Xc4.A01();
            while (true) {
                if (i < A01) {
                    AbstractC118405Xc abstractC118405Xc5 = this.A01;
                    if (abstractC118405Xc5 == null) {
                        break;
                    }
                    abstractC118405Xc5.A03(i, this.A03.AXB(i).CEX(abstractC118405Xc.A00(i), abstractC118405Xc2.A00(i), abstractC118405Xc3.A00(i), j));
                    i++;
                } else {
                    AbstractC118405Xc abstractC118405Xc6 = this.A01;
                    if (abstractC118405Xc6 != null) {
                        return abstractC118405Xc6;
                    }
                }
            }
        }
        C14360o3.A0F("valueVector");
        throw C00O.createAndThrow();
    }

    @Override // X.C62F
    public final AbstractC118405Xc CEj(AbstractC118405Xc abstractC118405Xc, AbstractC118405Xc abstractC118405Xc2, AbstractC118405Xc abstractC118405Xc3, long j) {
        AbstractC118405Xc abstractC118405Xc4 = this.A02;
        if (abstractC118405Xc4 == null) {
            abstractC118405Xc4 = AbstractC137336Kc.A01(abstractC118405Xc3);
            this.A02 = abstractC118405Xc4;
        }
        int i = 0;
        if (abstractC118405Xc4 != null) {
            int A01 = abstractC118405Xc4.A01();
            while (true) {
                if (i < A01) {
                    AbstractC118405Xc abstractC118405Xc5 = this.A02;
                    if (abstractC118405Xc5 == null) {
                        break;
                    }
                    abstractC118405Xc5.A03(i, this.A03.AXB(i).CEi(abstractC118405Xc.A00(i), abstractC118405Xc2.A00(i), abstractC118405Xc3.A00(i), j));
                    i++;
                } else {
                    AbstractC118405Xc abstractC118405Xc6 = this.A02;
                    if (abstractC118405Xc6 != null) {
                        return abstractC118405Xc6;
                    }
                }
            }
        }
        C14360o3.A0F("velocityVector");
        throw C00O.createAndThrow();
    }

    @Override // X.C62F
    public final /* synthetic */ boolean CWV() {
        return false;
    }

    public C62L(C62H c62h) {
        this.A03 = c62h;
    }

    @Override // X.C62F
    public final long Azq(AbstractC118405Xc abstractC118405Xc, AbstractC118405Xc abstractC118405Xc2, AbstractC118405Xc abstractC118405Xc3) {
        Iterator it = C17s.A0C(0, abstractC118405Xc.A01()).iterator();
        long j = 0;
        while (it.hasNext()) {
            int A00 = ((AbstractC16880sg) it).A00();
            j = Math.max(j, this.A03.AXB(A00).Azp(abstractC118405Xc.A00(A00), abstractC118405Xc2.A00(A00), abstractC118405Xc3.A00(A00)));
        }
        return j;
    }
}
