package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5Y4, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5Y4 implements C5Y5 {
    public final float A00;
    public final float A01;
    public final Object A02;

    @Override // X.C5Y6
    public final /* bridge */ /* synthetic */ C62F FDZ(InterfaceC118485Xk interfaceC118485Xk) {
        final AbstractC118405Xc abstractC118405Xc;
        final float f = this.A00;
        final float f2 = this.A01;
        Object obj = this.A02;
        if (obj == null) {
            abstractC118405Xc = null;
        } else {
            abstractC118405Xc = (AbstractC118405Xc) ((C118475Xj) interfaceC118485Xk).A01.invoke(obj);
        }
        return new C62F(abstractC118405Xc, f, f2) { // from class: X.62E
            public final /* synthetic */ C62L A00;

            @Override // X.C62F
            public final long Azq(AbstractC118405Xc abstractC118405Xc2, AbstractC118405Xc abstractC118405Xc3, AbstractC118405Xc abstractC118405Xc4) {
                return this.A00.Azq(abstractC118405Xc2, abstractC118405Xc3, abstractC118405Xc4);
            }

            @Override // X.C62F
            public final AbstractC118405Xc B2E(AbstractC118405Xc abstractC118405Xc2, AbstractC118405Xc abstractC118405Xc3, AbstractC118405Xc abstractC118405Xc4) {
                return this.A00.B2E(abstractC118405Xc2, abstractC118405Xc3, abstractC118405Xc4);
            }

            @Override // X.C62F
            public final AbstractC118405Xc CEY(AbstractC118405Xc abstractC118405Xc2, AbstractC118405Xc abstractC118405Xc3, AbstractC118405Xc abstractC118405Xc4, long j) {
                return this.A00.CEY(abstractC118405Xc2, abstractC118405Xc3, abstractC118405Xc4, j);
            }

            @Override // X.C62F
            public final AbstractC118405Xc CEj(AbstractC118405Xc abstractC118405Xc2, AbstractC118405Xc abstractC118405Xc3, AbstractC118405Xc abstractC118405Xc4, long j) {
                return this.A00.CEj(abstractC118405Xc2, abstractC118405Xc3, abstractC118405Xc4, j);
            }

            {
                C62H xns;
                if (abstractC118405Xc != null) {
                    xns = new C62H(abstractC118405Xc, f, f2) { // from class: X.62G
                        public final List A00;

                        @Override // X.C62H
                        public final /* bridge */ /* synthetic */ C62J AXB(int i) {
                            return (C62I) this.A00.get(i);
                        }

                        {
                            C17u A0C = C17s.A0C(0, abstractC118405Xc.A01());
                            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(A0C, 10));
                            Iterator it = A0C.iterator();
                            while (it.hasNext()) {
                                arrayList.add(new C62I(f, f2, abstractC118405Xc.A00(((AbstractC16880sg) it).A00())));
                            }
                            this.A00 = arrayList;
                        }
                    };
                } else {
                    xns = new XNS(f, f2);
                }
                this.A00 = new C62L(xns);
            }

            @Override // X.C62F
            public final boolean CWV() {
                return false;
            }
        };
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5Y4) {
            C5Y4 c5y4 = (C5Y4) obj;
            if (c5y4.A00 == this.A00 && c5y4.A01 == this.A01 && C14360o3.A0K(c5y4.A02, this.A02)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        Object obj = this.A02;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return (((i * 31) + Float.floatToIntBits(this.A00)) * 31) + Float.floatToIntBits(this.A01);
    }

    public C5Y4(Object obj, float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
        this.A02 = obj;
    }

    public C5Y4() {
        this(null, 1.0f, 1500.0f);
    }
}
