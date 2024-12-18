package X;

import com.instagram.common.session.UserSession;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;

/* renamed from: X.BWl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25675BWl extends AbstractC51572Yf {
    public final UserSession A00;
    public final InterfaceC60442pS A01;
    public final InterfaceC31137Dmc A02;
    public final AbstractC25398BLp A03;
    public final boolean A04;

    public C25675BWl(UserSession userSession, InterfaceC60442pS interfaceC60442pS, InterfaceC31137Dmc interfaceC31137Dmc, AbstractC25398BLp abstractC25398BLp, boolean z) {
        C14360o3.A0B(interfaceC31137Dmc, 2);
        this.A03 = abstractC25398BLp;
        this.A02 = interfaceC31137Dmc;
        this.A01 = interfaceC60442pS;
        this.A00 = userSession;
        this.A04 = z;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        C2XE c2xe = c76223bS.A05;
        C25682BWs c25682BWs = new C25682BWs(c2xe, new C25681BWr());
        C75933ay c75933ay = C51722Yv.A02;
        AbstractC77743dy.A00(c25682BWs, AbstractC25233BEq.A0e(C05F.A00, 100.0f, 0));
        C25681BWr c25681BWr = c25682BWs.A01;
        c25681BWr.A0E = true;
        c25681BWr.A01 = 2;
        C169757hp c169757hp = new C169757hp();
        c169757hp.A00 = 0;
        c169757hp.A01 = Integer.MIN_VALUE;
        c25681BWr.A0B = c169757hp.AER();
        new C169827hw(c2xe);
        C9QO c9qo = new C9QO();
        BitSet bitSet = new BitSet(5);
        bitSet.clear();
        c9qo.A01 = this.A01;
        bitSet.set(2);
        AbstractC25398BLp abstractC25398BLp = this.A03;
        c9qo.A03 = abstractC25398BLp;
        bitSet.set(0);
        c9qo.A02 = this.A02;
        bitSet.set(1);
        c9qo.A00 = this.A00;
        bitSet.set(4);
        c9qo.A04 = this.A04;
        bitSet.set(3);
        AbstractC169877i1.A00(bitSet, new String[]{"carouselViewModel", "delegate", "insightsHost", "shouldThumbnailsOverflowToEdge", "userSession"}, 5);
        c25681BWr.A09 = c9qo;
        BitSet bitSet2 = c25682BWs.A02;
        bitSet2.set(0);
        c25681BWr.A0A = (C26668Bq3) abstractC25398BLp.A0M.getValue();
        boolean A0E = abstractC25398BLp.A0E();
        c25681BWr.A0F = A0E;
        float f = 0.0f;
        if (A0E) {
            f = 20.0f;
        }
        c25681BWr.A00 = ((AbstractC77733dx) c25682BWs).A02.A00(f);
        C1I4 c1i4 = abstractC25398BLp.A07;
        if (c1i4 != null) {
            List list = c25681BWr.A0D;
            if (list == Collections.EMPTY_LIST) {
                list = AbstractC166987dD.A1E();
                c25681BWr.A0D = list;
            }
            list.add(c1i4);
        }
        AbstractC77733dx.A00(bitSet2, c25682BWs.A03, 1);
        C51422Xp c51422Xp = c25681BWr.A08;
        if (c51422Xp == null) {
            c51422Xp = AbstractC50812Vc.A00(c25681BWr, c25682BWs.A00, -1505688212);
        }
        c25681BWr.A08 = c51422Xp;
        C51422Xp c51422Xp2 = c25681BWr.A07;
        if (c51422Xp2 == null) {
            c51422Xp2 = AbstractC50812Vc.A00(c25681BWr, c25682BWs.A00, -238194236);
        }
        c25681BWr.A07 = c51422Xp2;
        C51422Xp c51422Xp3 = c25681BWr.A06;
        if (c51422Xp3 == null) {
            c51422Xp3 = AbstractC50812Vc.A00(c25681BWr, c25682BWs.A00, -1017305181);
        }
        c25681BWr.A06 = c51422Xp3;
        c25682BWs.A03();
        return c25681BWr;
    }
}
