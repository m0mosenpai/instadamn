package X;

import com.instagram.model.reels.Reel;
import com.instagram.remindme.common.data.MediaReminderApi;

/* loaded from: classes9.dex */
public final class PYn extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public boolean A05;
    public final int A06 = 0;
    public final Object A07;
    public final Object A08;
    public final Object A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PYn(C38321qM c38321qM, HYG hyg, C54608OAj c54608OAj, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A08 = c38321qM;
        this.A09 = hyg;
        this.A07 = c54608OAj;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        if (this.A06 != 0) {
            return new PYn((C38321qM) this.A08, (HYG) this.A09, (C54608OAj) this.A07, interfaceC23621Ds);
        }
        C3Y7 c3y7 = (C3Y7) this.A02;
        C3G4 c3g4 = (C3G4) this.A04;
        C129025sN c129025sN = (C129025sN) this.A09;
        C75113Zb c75113Zb = (C75113Zb) this.A03;
        boolean z = this.A05;
        return new PYn((InterfaceC11380iw) this.A07, c3y7, c75113Zb, c3g4, c129025sN, (C4QP) this.A08, interfaceC23621Ds, this.A00, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C38321qM c38321qM;
        String A38;
        HYG hyg;
        C54608OAj c54608OAj;
        boolean A64;
        ?? r1;
        InterfaceC57851PlH p9j;
        OIc oIc;
        C38321qM c38321qM2;
        InterfaceC57852PlI interfaceC57852PlI;
        Integer num;
        C05A c05a;
        Object value;
        boolean z;
        InterfaceC30832Dh7 interfaceC30832Dh7;
        if (this.A06 != 0) {
            C1JX c1jx = C1JX.A02;
            boolean z2 = true;
            if (this.A01 != 0) {
                r1 = this.A00;
                A64 = this.A05;
                c54608OAj = (C54608OAj) this.A04;
                c38321qM = (C38321qM) this.A03;
                hyg = (HYG) this.A02;
                AbstractC09560e7.A00(obj);
            } else {
                AbstractC09560e7.A00(obj);
                c38321qM = (C38321qM) this.A08;
                if (c38321qM.A5T() && (A38 = c38321qM.A38()) != null) {
                    hyg = (HYG) this.A09;
                    c54608OAj = (C54608OAj) this.A07;
                    String A07 = AbstractC41071vF.A07(hyg.A00, c38321qM);
                    A64 = c38321qM.A64();
                    r1 = !A64;
                    HYG.A00(c38321qM, hyg, r1);
                    MediaReminderApi mediaReminderApi = hyg.A01;
                    this.A02 = hyg;
                    this.A03 = c38321qM;
                    this.A04 = c54608OAj;
                    this.A05 = A64;
                    this.A00 = r1;
                    this.A01 = 1;
                    if (r1 != 0) {
                        obj = MediaReminderApi.A00(mediaReminderApi, A38, A07, this);
                    } else {
                        obj = MediaReminderApi.A01(mediaReminderApi, A38, A07, this);
                    }
                    if (obj == c1jx) {
                        return c1jx;
                    }
                }
            }
            InterfaceC57850PlG interfaceC57850PlG = (InterfaceC57850PlG) obj;
            if (interfaceC57850PlG instanceof P9H) {
                if (r1 == 0) {
                    z2 = false;
                }
                p9j = new P9I(z2);
                HYG.A00(c38321qM, hyg, A64);
            } else if (interfaceC57850PlG instanceof P9G) {
                boolean z3 = ((P9G) interfaceC57850PlG).A01;
                p9j = new P9J(z3);
                HYG.A00(c38321qM, hyg, z3);
            } else {
                throw B4Z.A00();
            }
            InterfaceC57851PlH interfaceC57851PlH = p9j;
            if (interfaceC57851PlH instanceof P9I) {
                boolean z4 = ((P9I) interfaceC57851PlH).A00;
                oIc = c54608OAj.A01;
                C27966CUm c27966CUm = oIc.A01;
                c38321qM2 = c54608OAj.A00;
                if (z4) {
                    c27966CUm.A00(c38321qM2, "reminder_set_failure", null);
                    interfaceC57852PlI = P9K.A00;
                } else {
                    c27966CUm.A00(c38321qM2, "reminder_unset_failure", null);
                    interfaceC57852PlI = P9M.A00;
                }
            } else if (interfaceC57851PlH instanceof P9J) {
                boolean z5 = ((P9J) interfaceC57851PlH).A00;
                oIc = c54608OAj.A01;
                C27966CUm c27966CUm2 = oIc.A01;
                c38321qM2 = c54608OAj.A00;
                if (z5) {
                    c27966CUm2.A00(c38321qM2, "reminder_set_success", null);
                    interfaceC57852PlI = P9L.A00;
                } else {
                    c27966CUm2.A00(c38321qM2, "reminder_unset_success", null);
                    interfaceC57852PlI = P9N.A00;
                }
            } else {
                throw B4Z.A00();
            }
            InterfaceC57852PlI interfaceC57852PlI2 = interfaceC57852PlI;
            O4N o4n = c54608OAj.A02;
            if (o4n != null) {
                C14360o3.A0B(interfaceC57852PlI2, 0);
                if (!interfaceC57852PlI2.equals(P9K.A00)) {
                    if (!interfaceC57852PlI2.equals(P9L.A00) && !interfaceC57852PlI2.equals(P9M.A00)) {
                        if (!interfaceC57852PlI2.equals(P9N.A00)) {
                            throw B4Z.A00();
                        }
                    } else {
                        num = C05F.A00;
                        c05a = o4n.A00.A06;
                        do {
                            value = c05a.getValue();
                            C51598Mqq c51598Mqq = (C51598Mqq) value;
                            z = c51598Mqq.A02;
                            interfaceC30832Dh7 = c51598Mqq.A00;
                            AbstractC167017dG.A1P(num, interfaceC30832Dh7);
                        } while (!c05a.AIi(value, new C51598Mqq(interfaceC30832Dh7, num, z)));
                    }
                }
                num = C05F.A01;
                c05a = o4n.A00.A06;
                do {
                    value = c05a.getValue();
                    C51598Mqq c51598Mqq2 = (C51598Mqq) value;
                    z = c51598Mqq2.A02;
                    interfaceC30832Dh7 = c51598Mqq2.A00;
                    AbstractC167017dG.A1P(num, interfaceC30832Dh7);
                } while (!c05a.AIi(value, new C51598Mqq(interfaceC30832Dh7, num, z)));
            }
            oIc.A00.E4s(new C3MH(c38321qM2, interfaceC57852PlI2));
        } else {
            C1JX c1jx2 = C1JX.A02;
            if (this.A01 != 0) {
                AbstractC09560e7.A00(obj);
            } else {
                AbstractC09560e7.A00(obj);
                C81343k4 c81343k4 = (C81343k4) ((C3Y7) this.A02);
                AbstractC167007dF.A0x(c81343k4.A02);
                C3G4 c3g4 = (C3G4) this.A04;
                C129025sN c129025sN = (C129025sN) this.A09;
                C41181vS A00 = c3g4.A00(c129025sN.A02);
                if (A00 != null) {
                    Reel reel = c3g4.A03;
                    C75113Zb c75113Zb = (C75113Zb) this.A03;
                    boolean z6 = this.A05;
                    C4QP c4qp = (C4QP) this.A08;
                    InterfaceC11380iw interfaceC11380iw = (InterfaceC11380iw) this.A07;
                    this.A01 = 1;
                    if (C129025sN.A00(interfaceC11380iw, c75113Zb, reel, A00, c3g4, c81343k4, c129025sN, c4qp, this, z6) == c1jx2) {
                        return c1jx2;
                    }
                }
            }
            ((C129025sN) this.A09).A05.A00.A08.A0o(this.A00 + 1);
        }
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PYn) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PYn(InterfaceC11380iw interfaceC11380iw, C3Y7 c3y7, C75113Zb c75113Zb, C3G4 c3g4, C129025sN c129025sN, C4QP c4qp, InterfaceC23621Ds interfaceC23621Ds, int i, boolean z) {
        super(2, interfaceC23621Ds);
        this.A02 = c3y7;
        this.A04 = c3g4;
        this.A09 = c129025sN;
        this.A03 = c75113Zb;
        this.A05 = z;
        this.A08 = c4qp;
        this.A07 = interfaceC11380iw;
        this.A00 = i;
    }
}
