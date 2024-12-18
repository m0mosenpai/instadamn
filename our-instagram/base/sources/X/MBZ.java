package X;

import com.instagram.appreciation.giftfeed.repository.AppreciationGiftFeedRepository;
import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.IgLiveQuestionsRepository;
import java.io.IOException;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class MBZ extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public final int A02;
    public final long A03;
    public final Object A04;
    public final String A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MBZ(Object obj, Object obj2, String str, InterfaceC23621Ds interfaceC23621Ds, int i, long j) {
        super(2, interfaceC23621Ds);
        this.A02 = i;
        this.A01 = obj;
        this.A04 = obj2;
        this.A03 = j;
        this.A05 = str;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        Object obj3;
        long j;
        String str;
        int i;
        switch (this.A02) {
            case 0:
                obj2 = this.A01;
                obj3 = this.A04;
                j = this.A03;
                str = this.A05;
                i = 0;
                return new MBZ(obj2, obj3, str, interfaceC23621Ds, i, j);
            case 1:
                MBZ mbz = new MBZ((C47407Kww) this.A04, this.A05, interfaceC23621Ds, this.A03);
                mbz.A01 = obj;
                return mbz;
            default:
                obj3 = this.A04;
                str = this.A05;
                j = this.A03;
                obj2 = this.A01;
                i = 2;
                return new MBZ(obj2, obj3, str, interfaceC23621Ds, i, j);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C1JX c1jx;
        InterfaceC19960yQ interfaceC19960yQ;
        Object emit;
        Long l;
        Object obj2 = obj;
        switch (this.A02) {
            case 0:
                c1jx = C1JX.A02;
                int i = this.A00;
                if (i != 0) {
                    if (i != 1) {
                        throw AbstractC166987dD.A13();
                    }
                    AbstractC09560e7.A00(obj2);
                    return C0eB.A00;
                }
                AbstractC09560e7.A00(obj2);
                C44553Jmz c44553Jmz = (C44553Jmz) this.A04;
                AppreciationGiftFeedRepository appreciationGiftFeedRepository = c44553Jmz.A06;
                long j = appreciationGiftFeedRepository.A00;
                long j2 = this.A03;
                if (j != j2) {
                    C47983LJh c47983LJh = c44553Jmz.A02;
                    if (j2 == -1) {
                        l = null;
                    } else {
                        l = new Long(j2);
                    }
                    C47983LJh.A02(C47983LJh.A00(c47983LJh, null, null, C05F.A01, C05F.A0C, l, null, null, null), c47983LJh);
                    c47983LJh.A03(C44553Jmz.A01(C44553Jmz.A00(c44553Jmz)));
                    String str = this.A05;
                    Long l2 = new Long(j2);
                    this.A00 = 1;
                    emit = appreciationGiftFeedRepository.A01(l2, str, this, true);
                    if (emit == c1jx) {
                        return c1jx;
                    }
                }
                return C0eB.A00;
            case 1:
                c1jx = C1JX.A02;
                int i2 = this.A00;
                if (i2 != 0) {
                    if (i2 == 1) {
                        interfaceC19960yQ = (InterfaceC19960yQ) this.A01;
                        AbstractC09560e7.A00(obj2);
                    }
                    AbstractC09560e7.A00(obj2);
                    return C0eB.A00;
                }
                AbstractC09560e7.A00(obj2);
                interfaceC19960yQ = (InterfaceC19960yQ) this.A01;
                UserSession userSession = ((C47407Kww) this.A04).A00;
                long j3 = this.A03;
                this.A01 = interfaceC19960yQ;
                this.A00 = 1;
                obj2 = AbstractC23641Du.A00(this, AbstractC25231BEo.A0e(C12L.A00), new C50123MBx(userSession, null, j3));
                if (obj2 == c1jx) {
                    return c1jx;
                }
                String str2 = this.A05;
                Iterator it = ((Iterable) obj2).iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (C14360o3.A0K(((C25978BeS) next).A01, str2)) {
                            if (next != null) {
                                this.A01 = null;
                                this.A00 = 2;
                                emit = interfaceC19960yQ.emit(next, this);
                                break;
                            }
                        }
                    }
                }
                return C0eB.A00;
            default:
                C1JX c1jx2 = C1JX.A02;
                int i3 = this.A00;
                try {
                    if (i3 != 0) {
                        if (i3 != 1) {
                            throw AbstractC166987dD.A13();
                        }
                        AbstractC09560e7.A00(obj2);
                    } else {
                        AbstractC09560e7.A00(obj2);
                        IgLiveQuestionsRepository igLiveQuestionsRepository = ((C147896lL) this.A04).A08;
                        String str3 = this.A05;
                        long j4 = this.A03;
                        this.A00 = 1;
                        obj2 = igLiveQuestionsRepository.A02(str3, this, j4);
                        if (obj2 == c1jx2) {
                            return c1jx2;
                        }
                    }
                    if (!AbstractC166987dD.A1a(obj2)) {
                        ((C147896lL) this.A04).A01.A0B(C52970Nc4.A00);
                    } else {
                        InterfaceC147786l3 interfaceC147786l3 = ((C147896lL) this.A04).A06;
                        if (interfaceC147786l3 != null) {
                            long j5 = this.A03;
                            OM6 om6 = (OM6) this.A01;
                            interfaceC147786l3.Cl2(j5, om6.A05.A00, om6.A08);
                        }
                    }
                } catch (IOException unused) {
                    C147896lL c147896lL = (C147896lL) this.A04;
                    IgLiveQuestionsRepository igLiveQuestionsRepository2 = c147896lL.A08;
                    OM6 om62 = (OM6) this.A01;
                    C14360o3.A0B(om62, 0);
                    igLiveQuestionsRepository2.A08.put(Long.valueOf(om62.A01), om62);
                    c147896lL.A01.A0B(C52970Nc4.A00);
                }
                return C0eB.A00;
        }
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MBZ) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MBZ(C47407Kww c47407Kww, String str, InterfaceC23621Ds interfaceC23621Ds, long j) {
        super(2, interfaceC23621Ds);
        this.A02 = 1;
        this.A04 = c47407Kww;
        this.A03 = j;
        this.A05 = str;
    }
}
