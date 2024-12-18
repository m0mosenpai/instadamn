package X;

import androidx.compose.foundation.gestures.ScrollingLogic;
import com.instagram.igsignalsproducts.ttnc.IgSignalsTtncEstimator;

/* loaded from: classes9.dex */
public final class PYt extends AbstractC23611Dp implements InterfaceC16620sF {
    public long A00;
    public Object A01;
    public final int A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PYt(IgSignalsTtncEstimator igSignalsTtncEstimator, InterfaceC23621Ds interfaceC23621Ds, long j) {
        super(2, interfaceC23621Ds);
        this.A02 = 3;
        this.A01 = igSignalsTtncEstimator;
        this.A00 = j;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        long j;
        int i;
        Object obj2;
        int i2;
        switch (this.A02) {
            case 0:
                j = this.A00;
                i = 0;
                break;
            case 1:
                j = this.A00;
                i = 1;
                break;
            case 2:
                obj2 = this.A01;
                i2 = 2;
                PYt pYt = new PYt(obj2, interfaceC23621Ds, i2);
                pYt.A00 = AbstractC166987dD.A0N(obj);
                return pYt;
            case 3:
                return new PYt((IgSignalsTtncEstimator) this.A01, interfaceC23621Ds, this.A00);
            default:
                obj2 = this.A01;
                i2 = 4;
                PYt pYt2 = new PYt(obj2, interfaceC23621Ds, i2);
                pYt2.A00 = AbstractC166987dD.A0N(obj);
                return pYt2;
        }
        PYt pYt3 = new PYt(interfaceC23621Ds, i, j);
        pYt3.A01 = obj;
        return pYt3;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        InterfaceC23621Ds A1M;
        switch (this.A02) {
            case 0:
            case 1:
            case 3:
                A1M = AbstractC166987dD.A1M(obj2, obj, this);
                break;
            case 2:
            default:
                A1M = create(Long.valueOf(AbstractC166987dD.A0N(obj)), (InterfaceC23621Ds) obj2);
                break;
        }
        return ((PYt) A1M).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        Object value;
        C51674Ms5 c51674Ms5;
        switch (this.A02) {
            case 2:
                AbstractC09560e7.A00(obj);
                long j = this.A00;
                C51022MgU c51022MgU = (C51022MgU) this.A01;
                C05A c05a = c51022MgU.A02;
                do {
                    value = c05a.getValue();
                    c51674Ms5 = (C51674Ms5) value;
                } while (!c05a.AIi(value, new C51674Ms5(c51674Ms5.A01, c51674Ms5.A02, j, c51674Ms5.A05, c51674Ms5.A04, c51674Ms5.A03, c51674Ms5.A07)));
                c51022MgU.A01();
                return C0eB.A00;
            case 3:
                AbstractC09560e7.A00(obj);
                IgSignalsTtncEstimator igSignalsTtncEstimator = (IgSignalsTtncEstimator) this.A01;
                long j2 = this.A00;
                C55134Oc1 c55134Oc1 = igSignalsTtncEstimator.A01;
                if (c55134Oc1 != null) {
                    long j3 = j2 - c55134Oc1.A07.A04;
                    NML nml = c55134Oc1.A08;
                    if (nml != null) {
                        nml.A0R.A01(Long.valueOf(j3));
                        if (!igSignalsTtncEstimator.A0H) {
                            long currentTimeMillis = System.currentTimeMillis();
                            if (nml.A01 == null) {
                                nml.A01 = AbstractC55167OdV.A02(nml, currentTimeMillis);
                            }
                        }
                    }
                }
                return C0eB.A00;
            case 4:
                AbstractC09560e7.A00(obj);
                long j4 = ((C147856lA) this.A01).A01.A01 - this.A00;
                return new C51740MtP(C23831Eq.A02(j4), 21, AbstractC31175DnJ.A1S((j4 > 30000L ? 1 : (j4 == 30000L ? 0 : -1))));
            default:
                AbstractC09560e7.A00(obj);
                C6NZ c6nz = (C6NZ) this.A01;
                long j5 = this.A00;
                ScrollingLogic scrollingLogic = ((C6NY) c6nz).A00;
                ScrollingLogic.A00(scrollingLogic.A04, scrollingLogic, 1, j5);
                return C0eB.A00;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PYt(InterfaceC23621Ds interfaceC23621Ds, int i, long j) {
        super(2, interfaceC23621Ds);
        this.A02 = i;
        this.A00 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PYt(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A02 = i;
        this.A01 = obj;
    }
}
