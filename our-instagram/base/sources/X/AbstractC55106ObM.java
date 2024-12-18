package X;

import android.app.Activity;
import android.content.Context;
import com.facebook.common.dextricks.StringTreeSet;
import com.instagram.common.session.UserSession;
import java.util.Arrays;

/* renamed from: X.ObM, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC55106ObM {
    public boolean A00;
    public final C05A A01;
    public final C05A A02;
    public final C0UO A03;
    public final C0UO A04;

    public static /* synthetic */ void A01(AbstractC55106ObM abstractC55106ObM, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6 = z5;
        boolean z7 = z4;
        boolean z8 = z3;
        boolean z9 = z2;
        boolean z10 = z;
        if ((i & 1) != 0) {
            z10 = ((C9BE) abstractC55106ObM.A02.getValue()).A03;
        }
        if ((i & 2) != 0) {
            z9 = ((C9BE) abstractC55106ObM.A02.getValue()).A01;
        }
        if ((i & 4) != 0) {
            z8 = ((C9BE) abstractC55106ObM.A02.getValue()).A06;
        }
        if ((i & 8) != 0) {
            z7 = ((C9BE) abstractC55106ObM.A02.getValue()).A07;
        }
        if ((i & 16) != 0) {
            z6 = ((C9BE) abstractC55106ObM.A02.getValue()).A05;
        }
        abstractC55106ObM.A0F(z10, z9, z8, z7, z6);
    }

    public final void A02() {
        if (this instanceof NX1) {
            NX1 nx1 = (NX1) this;
            nx1.A07();
            nx1.A0C(null, AbstractC166997dE.A0a(), null, null);
            nx1.A01.A04.invoke();
        }
    }

    public final void A03() {
        C54845OMq c54845OMq;
        if ((this instanceof NX1) && (c54845OMq = ((NX1) this).A04.A01) != null) {
            c54845OMq.A0B.E4W();
        }
    }

    public final void A04() {
        if (this instanceof NX1) {
            OWe oWe = ((NX1) this).A04;
            if (oWe.A02()) {
                AbstractC195978lm.A02.A01("sup:MediaStreamControllerDelegate", "Permissions already granted!");
                return;
            }
            String[] A00 = AbstractC54337Nzv.A00.A00();
            int length = A00.length;
            for (String str : A00) {
                Context context = oWe.A09;
                String A002 = AbstractC43591JPw.A00(4);
                C14360o3.A0C(context, A002);
                Activity activity = (Activity) context;
                if (AbstractC23451Ch.A05(activity, str)) {
                    C23031Ai c23031Ai = oWe.A0D;
                    AbstractC167007dF.A1L(c23031Ai, c23031Ai.A1n, C23031Ai.A8c, 124, true);
                }
                C23031Ai c23031Ai2 = oWe.A0D;
                if (AbstractC167017dG.A1b(c23031Ai2, c23031Ai2.A1n, C23031Ai.A8c, 124) && AbstractC23451Ch.A00(activity, str) == EnumC172127lh.A04) {
                    AbstractC195978lm.A02.A01("sup:MediaStreamControllerDelegate", "Already denied permissions twice - deeplinking to phone settings");
                    WGH.A06(activity, null);
                } else {
                    AbstractC195978lm.A02.A01("sup:MediaStreamControllerDelegate", "Requesting bluetooth permissions...");
                    C14360o3.A0C(context, A002);
                    AbstractC23451Ch.A04(activity, new C56066Ouj(2, A00, oWe), (String[]) Arrays.copyOf(A00, length));
                }
            }
        }
    }

    public final void A05() {
        if (this instanceof NX1) {
            NX1 nx1 = (NX1) this;
            C23031Ai c23031Ai = nx1.A03;
            InterfaceC16530ry interfaceC16530ry = c23031Ai.A4t;
            C0YR[] c0yrArr = C23031Ai.A8c;
            if (AbstractC167017dG.A1b(c23031Ai, interfaceC16530ry, c0yrArr, 122)) {
                nx1.A08(new N1R(false));
                return;
            }
            AbstractC195978lm.A02.A01("sup:GlassesToggleRepository", "Showing NUX tooltip");
            nx1.A08(new N1R(true));
            AbstractC167007dF.A1L(c23031Ai, interfaceC16530ry, c0yrArr, 122, true);
        }
    }

    public final void A06() {
        if (this instanceof NX1) {
            NX1 nx1 = (NX1) this;
            nx1.A08(((AbstractC53639Nnk) ((AbstractC55106ObM) nx1).A01.getValue()).A00(true));
            nx1.A0C(null, null, AbstractC166997dE.A0a(), null);
            C54786OJd c54786OJd = (C54786OJd) nx1.A05.getValue();
            if (c54786OJd != null) {
                c54786OJd.A01 = true;
            }
        }
    }

    public final void A07() {
        C54845OMq c54845OMq;
        if (this instanceof NX1) {
            NX1 nx1 = (NX1) this;
            C05A c05a = ((AbstractC55106ObM) nx1).A01;
            nx1.A08(((AbstractC53639Nnk) c05a.getValue()).A00(false));
            AbstractC54520O6x A02 = ((AbstractC53639Nnk) c05a.getValue()).A02();
            if (A02 != null && A02.A00 == 7 && (c54845OMq = nx1.A04.A01) != null) {
                c54845OMq.A05(EnumC223469td.A0M);
            }
            C55141Ocj c55141Ocj = nx1.A01;
            c55141Ocj.A05(C52068N1t.A00);
            C54786OJd c54786OJd = (C54786OJd) nx1.A05.getValue();
            if (c54786OJd != null) {
                c54786OJd.A01 = false;
            }
            if (!nx1.A0H() && c55141Ocj.A02.isEmpty()) {
                c55141Ocj.A05(N1W.A00);
            }
        }
    }

    public final void A08(AbstractC53639Nnk abstractC53639Nnk) {
        if (this instanceof NX1) {
            AbstractC195978lm.A02.A03("sup:GlassesToggleRepository", AbstractC167017dG.A0n(abstractC53639Nnk, "Setting glasses state to ", AbstractC166987dD.A1C()));
            this.A01.Egh(abstractC53639Nnk);
        }
    }

    public final void A09(AbstractC54520O6x abstractC54520O6x) {
        AbstractC54520O6x abstractC54520O6x2;
        if (this instanceof NX1) {
            C14360o3.A0B(abstractC54520O6x, 0);
            C55141Ocj c55141Ocj = ((NX1) this).A01;
            int i = abstractC54520O6x.A00;
            if (i != 4) {
                if (i != 7) {
                    if (i == 10) {
                        abstractC54520O6x2 = N1U.A00;
                    } else {
                        return;
                    }
                } else {
                    abstractC54520O6x2 = C52058N1j.A00;
                }
            } else {
                abstractC54520O6x2 = C52067N1s.A00;
            }
            c55141Ocj.A05(abstractC54520O6x2);
        }
    }

    public final void A0A(AbstractC54520O6x abstractC54520O6x) {
        if (this instanceof NX1) {
            ((NX1) this).A01.A05(abstractC54520O6x);
        }
    }

    public final void A0B(InterfaceC57998Pni interfaceC57998Pni, InterfaceC58128Ppr interfaceC58128Ppr, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16620sF interfaceC16620sF) {
        if (this instanceof NX1) {
            OWe oWe = ((NX1) this).A04;
            oWe.A03 = interfaceC57998Pni;
            oWe.A04 = interfaceC58128Ppr;
            oWe.A05 = interfaceC16820sZ;
            oWe.A06 = interfaceC16660sJ;
            oWe.A07 = interfaceC16620sF;
        }
    }

    public final void A0C(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        if (this instanceof NX1) {
            C05A c05a = this.A01;
            AbstractC53639Nnk A01 = ((AbstractC53639Nnk) c05a.getValue()).A01(null, bool, bool2, bool3, bool4);
            if (A01 != null) {
                c05a.Egh(A01);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        if (r0 != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0D(boolean r4) {
        /*
            r3 = this;
            boolean r0 = r3 instanceof X.NX1
            if (r0 == 0) goto L2c
            r1 = r3
            X.NX1 r1 = (X.NX1) r1
            r1.A00 = r4
            X.OWe r0 = r1.A04
            X.OMq r2 = r0.A01
            if (r2 == 0) goto L2c
            if (r4 != 0) goto L26
            X.Ocj r0 = r1.A01
            java.util.LinkedHashSet r1 = r0.A02
            X.N1m r0 = X.C52061N1m.A00
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L26
            X.N1X r0 = X.N1X.A00
            boolean r0 = r1.contains(r0)
            r1 = 0
            if (r0 == 0) goto L27
        L26:
            r1 = 1
        L27:
            X.PsU r0 = r2.A0B
            r0.Edz(r1)
        L2c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC55106ObM.A0D(boolean):void");
    }

    public final void A0E(boolean z) {
        if (this instanceof NX1) {
            NX1 nx1 = (NX1) this;
            OWe oWe = nx1.A04;
            if (!oWe.A02()) {
                AbstractC195978lm.A02.A01("sup:GlassesToggleRepository", "Showing permissions dialog to user");
                A01(nx1, 23, false, false, false, true, false);
                return;
            }
            UserSession userSession = nx1.A02;
            if (!AbstractC23021Ah.A00(userSession).A1r()) {
                AbstractC195978lm.A02.A01("sup:GlassesToggleRepository", "Showing NUX bottom sheet");
                A01(nx1, 27, false, false, true, false, false);
                C23031Ai A00 = AbstractC23021Ah.A00(userSession);
                AbstractC167007dF.A1L(A00, A00.A4s, C23031Ai.A8c, 123, true);
                return;
            }
            if (z) {
                nx1.A08(new N1S(new C51738MtL(15, false), false));
                nx1.A01.A03();
            }
            UserSession userSession2 = oWe.A0C;
            Context context = oWe.A09;
            if (!MSY.A1T(context, userSession2)) {
                return;
            }
            C54845OMq c54845OMq = oWe.A01;
            if (c54845OMq != null) {
                if (c54845OMq.A0B.isConnected()) {
                    return;
                }
            } else {
                OIB oib = oWe.A02;
                if (oib == null) {
                    oib = C37101o8.A00(AbstractC195888lY.A00());
                    oWe.A02 = oib;
                    if (oib == null) {
                        return;
                    }
                }
                c54845OMq = oib.A00;
                if (c54845OMq != null) {
                    AbstractC55106ObM A01 = oWe.A01();
                    if (A01 != null) {
                        A01.A08(new N1S(new C51738MtL(15, false), false));
                    }
                    new PH0(oWe, 2).Dd6(c54845OMq);
                } else {
                    oib.A00(context, userSession2, new PH0(oWe, 2), "sup:MediaStreamControllerDelegate");
                    return;
                }
            }
            c54845OMq.A0B.connect();
        }
    }

    public final void A0F(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        if (this instanceof NX1) {
            C05A c05a = this.A02;
            Object value = c05a.getValue();
            c05a.Egh(new C9BE(12, z, z2, z3, z4, z5));
            C195988ln c195988ln = AbstractC195978lm.A02;
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("Updating flow attributes flow from ");
            A1C.append(value);
            A1C.append(" to  ");
            c195988ln.A03("sup:GlassesToggleRepository", AbstractC166997dE.A0v(c05a.getValue(), A1C));
        }
    }

    public final boolean A0G() {
        if (this instanceof NX1) {
            return ((NX1) this).A04.A02();
        }
        return false;
    }

    public final boolean A0H() {
        C54845OMq c54845OMq;
        if ((this instanceof NX1) && (c54845OMq = ((NX1) this).A04.A01) != null && c54845OMq.A0B.isConnected()) {
            return true;
        }
        return false;
    }

    public final boolean A0I() {
        if (this instanceof NX1) {
            return this.A01.getValue() instanceof N1S;
        }
        return false;
    }

    public final boolean A0J() {
        if (this instanceof NX1) {
            AbstractC53639Nnk abstractC53639Nnk = (AbstractC53639Nnk) this.A01.getValue();
            if ((abstractC53639Nnk instanceof N1P) && ((N1P) abstractC53639Nnk).A01) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0K() {
        if (this instanceof NX1) {
            return this.A01.getValue() instanceof N1P;
        }
        return false;
    }

    public final boolean A0L() {
        if (this instanceof NX1) {
            return C14360o3.A0K(this.A01.getValue(), N1Q.A00);
        }
        return false;
    }

    public final boolean A0M() {
        if (this instanceof NX1) {
            AbstractC53639Nnk abstractC53639Nnk = (AbstractC53639Nnk) this.A01.getValue();
            if ((abstractC53639Nnk instanceof N1P) && ((N1P) abstractC53639Nnk).A00.A04) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0N() {
        if (this instanceof NX1) {
            AbstractC53639Nnk abstractC53639Nnk = (AbstractC53639Nnk) this.A01.getValue();
            if ((abstractC53639Nnk instanceof N1R) && ((N1R) abstractC53639Nnk).A00) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0O() {
        if (this instanceof NX1) {
            return AbstractC167007dF.A1W(((NX1) this).A04.A01);
        }
        return false;
    }

    public AbstractC55106ObM() {
        C008002u A00 = C10E.A00(N1Q.A00);
        this.A01 = A00;
        C008002u A1H = AbstractC25225BEi.A1H(new C9BE(StringTreeSet.MAX_SYMBOL_COUNT, false, false, false, false, false));
        this.A02 = A1H;
        this.A03 = AbstractC208910l.A02(A00);
        this.A04 = AbstractC208910l.A02(A1H);
    }
}
