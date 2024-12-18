package X;

import com.instagram.appreciation.gifting.repository.AppreciationGiftingRepository;
import com.instagram.common.typedurl.ImageUrl;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Jmy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44552Jmy extends AbstractC52922bZ {
    public final LJ7 A00;
    public final C47740L6e A01;
    public final C48504Lcv A02;
    public final C46611Kjo A03;
    public final AppreciationGiftingRepository A04;
    public final InterfaceC24731Iq A05;
    public final InterfaceC19390xP A06;
    public final C05A A07;
    public final C0UO A08;

    public C44552Jmy(LJ7 lj7, C47740L6e c47740L6e, C48504Lcv c48504Lcv, C46611Kjo c46611Kjo, AppreciationGiftingRepository appreciationGiftingRepository) {
        C14360o3.A0B(c48504Lcv, 5);
        this.A04 = appreciationGiftingRepository;
        this.A03 = c46611Kjo;
        this.A00 = lj7;
        this.A01 = c47740L6e;
        this.A02 = c48504Lcv;
        MCD.A02(c48504Lcv, c48504Lcv.A01, 39);
        C008002u A00 = C10E.A00(C48233LWi.A00);
        this.A07 = A00;
        this.A08 = AbstractC208910l.A02(A00);
        C24721Ip A12 = AbstractC25229BEm.A12();
        this.A05 = A12;
        this.A06 = AbstractC07080Za.A03(A12);
    }

    public static final Object A02(C44552Jmy c44552Jmy, InterfaceC23621Ds interfaceC23621Ds) {
        Object EMz = c44552Jmy.A05.EMz(new C45162Jz2(new C69749Vuj(new Object[0], 2131953046), false), interfaceC23621Ds);
        if (EMz != C1JX.A02) {
            return C0eB.A00;
        }
        return EMz;
    }

    public static final C45125Jxu A00(C45037JwS c45037JwS) {
        Object obj;
        Iterator A1J = AbstractC25226BEj.A1J(c45037JwS.A03);
        while (true) {
            if (A1J.hasNext()) {
                obj = A1J.next();
                if (((C45114Jxj) obj).A06) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C45114Jxj c45114Jxj = (C45114Jxj) obj;
        if (c45114Jxj == null) {
            return null;
        }
        ImageUrl imageUrl = (ImageUrl) c45114Jxj.A03;
        ImageUrl imageUrl2 = (ImageUrl) c45114Jxj.A04;
        boolean z = false;
        if (c45114Jxj.A01 <= c45037JwS.A01) {
            z = true;
        }
        return new C45125Jxu(c45114Jxj, imageUrl, imageUrl2, z);
    }

    public static final BHS A01(Integer num) {
        int i = 2131973280;
        if (num == C05F.A01) {
            i = 2131953077;
        }
        return BHS.A00(new Object[0], i);
    }

    public final void A03(C45125Jxu c45125Jxu, Integer num, List list, int i, boolean z) {
        C141796aw A00;
        InterfaceC16620sF mca;
        boolean z2;
        AbstractC37302Gc3.A1U(list, num);
        if (num == C05F.A01) {
            z2 = true;
        } else {
            if (c45125Jxu == null) {
                if (i > 0) {
                    A00 = AbstractC141776au.A00(this);
                    mca = new MCD(this, null, 45);
                } else {
                    Integer num2 = C05F.A00;
                    C141796aw A002 = AbstractC141776au.A00(this);
                    AbstractC23641Du.A03(num2, AnonymousClass191.A00, new MCQ((InterfaceC23621Ds) null, this, num2, 15), A002);
                    return;
                }
            } else if (!c45125Jxu.A02) {
                z2 = false;
            } else if (!z) {
                Object value = this.A07.getValue();
                A00 = AbstractC141776au.A00(this);
                mca = new MCP(value, c45125Jxu, this, num, null, 12);
            } else {
                A00 = AbstractC141776au.A00(this);
                mca = new MCA(this, c45125Jxu, list, null, i, 1);
            }
            AbstractC166987dD.A1Z(mca, A00);
        }
        A00 = AbstractC141776au.A00(this);
        mca = new C50110MAi(this, null, i, 0, z2);
        AbstractC166987dD.A1Z(mca, A00);
    }
}
