package X;

import android.view.animation.AccelerateDecelerateInterpolator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.BoE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26555BoE extends AbstractC51572Yf {
    public final AbstractC50812Vc A00;
    public final InterfaceC16820sZ A01;
    public final InterfaceC16820sZ A02;
    public final C51722Yv A03;
    public final InterfaceC31155Dmz A04;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        List list = ((CV8) AbstractC28337CeP.A02(c76223bS, this.A04)).A00;
        Float A0m = AbstractC25227BEk.A0m();
        C2XI A00 = AbstractC80383iT.A00(c76223bS, A0m);
        C2XI A002 = AbstractC80383iT.A00(c76223bS, A0m);
        C2XI A003 = AbstractC80383iT.A00(c76223bS, A0m);
        O9S o9s = (O9S) AbstractC77183d4.A00(c76223bS, new MEB(40, A00, list, this, A003, A002), new Object[]{list});
        C51722Yv c51722Yv = this.A03;
        C9CV c9cv = new C9CV(A00, C05F.A00);
        if (c51722Yv == C51722Yv.A02) {
            c51722Yv = null;
        }
        C51722Yv A0h = AbstractC25225BEi.A0h(c51722Yv, c9cv);
        Integer num = C05F.A1F;
        return new C26359Bl4(C9CV.A00(C9CV.A00(AbstractC25234BEr.A0A(A003, A0h, new C9CV(A002, num)), num, C30179DRk.A01(this, 42), 4), C05F.A03, C30179DRk.A01(this, 43), 4), o9s, C29890DGe.A00(this, 8));
    }

    public C26555BoE(AbstractC50812Vc abstractC50812Vc, C51722Yv c51722Yv, InterfaceC31155Dmz interfaceC31155Dmz, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        AbstractC167017dG.A1Q(abstractC50812Vc, interfaceC16820sZ);
        C14360o3.A0B(c51722Yv, 5);
        this.A00 = abstractC50812Vc;
        this.A04 = interfaceC31155Dmz;
        this.A01 = interfaceC16820sZ;
        this.A02 = interfaceC16820sZ2;
        this.A03 = c51722Yv;
    }

    public static final YB9 A03(C2XI c2xi, C2XI c2xi2, C2XI c2xi3, Integer num, List list) {
        C2XI c2xi4;
        float f;
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C27986CVj c27986CVj = (C27986CVj) it.next();
            int intValue = c27986CVj.A02.intValue();
            if (intValue != 0) {
                c2xi4 = c2xi2;
                if (intValue != 1) {
                    c2xi4 = c2xi3;
                }
            } else {
                c2xi4 = c2xi;
            }
            if (num.intValue() != 0) {
                f = 1.0f;
            } else {
                f = c27986CVj.A00;
            }
            A0q.add(CCG.A00(new AccelerateDecelerateInterpolator(), c2xi4, null, f, c27986CVj.A01));
        }
        YPb[] yPbArr = (YPb[]) A0q.toArray(new YPb[0]);
        YPb[] yPbArr2 = (YPb[]) Arrays.copyOf(yPbArr, yPbArr.length);
        C14360o3.A0B(yPbArr2, 0);
        return new YB9(yPbArr2);
    }
}
