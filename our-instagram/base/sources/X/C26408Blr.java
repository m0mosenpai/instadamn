package X;

import com.meta.metaai.writewithai.creation.impl.viewmodel.WriteWithAICreationViewModel;

/* renamed from: X.Blr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26408Blr extends AbstractC51572Yf {
    public final WriteWithAICreationViewModel A00;
    public final InterfaceC16820sZ A01;
    public final InterfaceC16820sZ A02;
    public final InterfaceC16620sF A03;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C51722Yv c51722Yv;
        C51722Yv A00;
        C14360o3.A0B(c76223bS, 0);
        CWJ cwj = (CWJ) AbstractC25525BQn.A00(c76223bS, this.A00.A0D);
        C2XE c2xe = c76223bS.A05;
        Object A06 = c2xe.A06(CWA.class);
        if (A06 != null) {
            CWA cwa = (CWA) A06;
            C75933ay c75933ay = C51722Yv.A02;
            Integer num = C05F.A01;
            C51722Yv A0h = AbstractC25225BEi.A0h(null, AbstractC25225BEi.A0m(num, 1.0f, 1));
            C2Z0 A0P = AbstractC167007dF.A0P(c2xe);
            C30506Dbp c30506Dbp = new C30506Dbp(this, 15);
            C30506Dbp c30506Dbp2 = new C30506Dbp(this, 16);
            C30487DbW A002 = C30487DbW.A00(cwa, this, A0P, 40);
            D8K d8k = new D8K(15, cwj, this);
            if (cwa.A03) {
                A00 = C9CU.A00(null, num, 0, AbstractC25229BEm.A0K((int) (AbstractC167007dF.A0K(A0P.ArD().A0C).heightPixels * 0.3f)));
            } else {
                CAU cau = cwj.A01;
                if (cau.A00() && (cau instanceof C27339C4u) && ((C27339C4u) cau).A05) {
                    c51722Yv = C9CU.A00(null, num, 0, AbstractC25229BEm.A0K((int) (AbstractC167007dF.A0K(A0P.ArD().A0C).heightPixels * 0.4d)));
                } else {
                    c51722Yv = c75933ay;
                }
                C9CT A0m = AbstractC25225BEi.A0m(num, 1.0f, 1);
                if (c51722Yv == c75933ay) {
                    c51722Yv = null;
                }
                A00 = C9CU.A00(AbstractC25234BEr.A0B(c51722Yv, A0m, 1.0f), C05F.A04, 0, AbstractC25230BEn.A0L());
            }
            A0P.A00(new C26458Bmf(A00, cwj, d8k, c30506Dbp, c30506Dbp2, A002));
            return AbstractC25227BEk.A0V(new C26563BoM(AbstractC25230BEn.A0d(null, C05F.A0C, 0.0f, 1), cwj, C29905DGt.A01(this, 48), C29905DGt.A01(this, 49), C30181DRm.A01(this, 31), C30181DRm.A01(this, 32), new C30519Dc2(this, 15)), A0P, c76223bS, A0h);
        }
        throw AbstractC166997dE.A0g();
    }

    public C26408Blr(WriteWithAICreationViewModel writeWithAICreationViewModel, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16620sF interfaceC16620sF) {
        this.A00 = writeWithAICreationViewModel;
        this.A03 = interfaceC16620sF;
        this.A02 = interfaceC16820sZ;
        this.A01 = interfaceC16820sZ2;
    }
}
