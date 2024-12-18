package X;

import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.9Fc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C207239Fc extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C207239Fc(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        super(2);
        this.A00 = i2;
        this.A05 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A04 = obj4;
        this.A01 = i;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.A00 != 0) {
            C76223bS c76223bS = (C76223bS) obj;
            long j = ((C78613fT) obj2).A00;
            C14360o3.A0B(c76223bS, 0);
            C104614nR c104614nR = (C104614nR) this.A05;
            int i = this.A01;
            C2XI c2xi = (C2XI) this.A03;
            C2XI c2xi2 = (C2XI) this.A04;
            C2XI c2xi3 = (C2XI) this.A02;
            C2Z0 c2z0 = new C2Z0(c76223bS.A05, new ArrayList());
            Iterator it = c104614nR.A00.A02.iterator();
            while (it.hasNext()) {
                PointF pointF = ((com.instagram.tagging.model.Tag) it.next()).A00;
                if (pointF != null) {
                    int A01 = ((int) (C78613fT.A01(j) * pointF.x)) - i;
                    int A00 = ((int) (C78613fT.A00(j) * pointF.y)) - i;
                    C75933ay c75933ay = C51722Yv.A02;
                    C51722Yv c51722Yv = new C51722Yv(new C51722Yv(new C51722Yv(new C51722Yv(new C51722Yv(null, new C9CV(C05F.A0Y, EnumC77933eL.ABSOLUTE, 3)), new C9CU(C05F.A0C, 1, A01 | 9221401712017801216L)), new C9CU(C05F.A0N, 1, A00 | 9221401712017801216L)), new C9CV(c2xi, C05F.A1F)), new C9CV(c2xi2, C05F.A1I));
                    Integer num = C05F.A00;
                    C51722Yv c51722Yv2 = new C51722Yv(c51722Yv, new C9CV(c2xi3, num));
                    long j2 = AbstractC22799A3s.A00;
                    C51722Yv c51722Yv3 = new C51722Yv(new C51722Yv(c51722Yv2, new C9CU(C05F.A01, 0, j2)), new C9CU(num, 0, j2));
                    Drawable A0E = AbstractC77623dm.A0E(c2z0, R.drawable.tag_hint_with_shadow);
                    C80403iV A03 = C80393iU.A03(c2z0.A00);
                    A03.A0D(A0E);
                    A03.A0B();
                    A03.A0C();
                    AbstractC77743dy.A00(A03, c51722Yv3);
                    c2z0.A00(A03.A0A());
                }
            }
            return new C2WH(null, null, null, null, null, c2z0.A01, false);
        }
        ((Number) obj2).intValue();
        ((C5TR) this.A05).A03((C5Tl) obj, this.A02, this.A03, this.A04, AbstractC128295qy.A00(this.A01) | 1);
        return C0eB.A00;
    }
}
