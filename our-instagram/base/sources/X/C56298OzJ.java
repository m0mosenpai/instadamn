package X;

import android.view.MotionEvent;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.OzJ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56298OzJ implements InterfaceC58200Pr6 {
    public final /* synthetic */ NI5 A00;

    @Override // X.InterfaceC58200Pr6
    public final /* synthetic */ void DQW(int i) {
    }

    @Override // X.InterfaceC58200Pr6
    public final /* synthetic */ void DQX(MotionEvent motionEvent, int i) {
    }

    @Override // X.InterfaceC58200Pr6
    public final /* synthetic */ void DQc(Integer num, int i, int i2) {
    }

    @Override // X.InterfaceC58200Pr6
    public final /* synthetic */ void DQd(int i, int i2, float f) {
    }

    @Override // X.InterfaceC58200Pr6
    public final /* synthetic */ void DQe(MotionEvent motionEvent) {
    }

    @Override // X.InterfaceC58200Pr6
    public final /* synthetic */ void DsH(MotionEvent motionEvent) {
    }

    @Override // X.InterfaceC58200Pr6
    public final void Dvp(Integer num, int i, int i2) {
        int intValue;
        C115475Kh c115475Kh;
        C14360o3.A0B(num, 2);
        NI5 ni5 = this.A00;
        C50868Mdz c50868Mdz = ni5.A0K;
        Integer A0G = c50868Mdz.A0G();
        if (A0G != null && (intValue = A0G.intValue()) != -1) {
            UserSession userSession = ni5.A0B;
            C183348Bh A00 = AbstractC183338Bg.A00(userSession);
            A00.A0B = A00.A0K.A03(613293953, 12000L);
            boolean z = true;
            if (num == C05F.A01) {
                Integer[] numArr = ni5.A0C.A02;
                c50868Mdz.A0O(intValue, i, (MSW.A07(numArr, 1) + i) - MSW.A07(numArr, 0), false);
                c50868Mdz.A0V(C16930sl.A00);
            } else {
                if (num != C05F.A00) {
                    z = false;
                }
                c50868Mdz.A0O(intValue, i, i2, z);
            }
            C84B A0N = MSY.A0N(c50868Mdz.A0E);
            if (A0N != null) {
                ArrayList A05 = A0N.A05();
                if (intValue < A05.size() && (c115475Kh = (C115475Kh) AbstractC001800i.A0O(A05, intValue)) != null) {
                    AnonymousClass229.A01(userSession).A0x(null, i, i2, c115475Kh.A0G.A0F.hashCode());
                }
            }
        }
    }

    @Override // X.InterfaceC58200Pr6
    public final void Dvt(Integer num) {
        int intValue;
        int i;
        C187478Sp c187478Sp;
        C14360o3.A0B(num, 0);
        NI5 ni5 = this.A00;
        C187358Sd c187358Sd = ni5.A0J;
        AbstractC187378Sf A0E = c187358Sd.A0E();
        if ((A0E instanceof C187478Sp) && (c187478Sp = (C187478Sp) A0E) != null) {
            MSX.A1L(c187358Sd, c187478Sp.A00);
        }
        C50868Mdz c50868Mdz = ni5.A0K;
        Integer A0G = c50868Mdz.A0G();
        if (A0G != null && (intValue = A0G.intValue()) != -1) {
            Integer num2 = C05F.A00;
            boolean A1X = AbstractC167007dF.A1X(num, num2);
            C84B A0N = MSY.A0N(c50868Mdz.A0E);
            if (A0N != null) {
                C115475Kh c115475Kh = (C115475Kh) A0N.A03(intValue);
                if (A1X) {
                    i = c115475Kh.A09;
                } else {
                    i = c115475Kh.A08;
                }
                c50868Mdz.A01 = i;
            }
            c50868Mdz.A0c.Egh(new C51745MtU(num2, 0, 2, A1X));
            c50868Mdz.A0U(null, Integer.valueOf(ni5.A06));
            ni5.A0C.A02();
        }
    }

    public C56298OzJ(NI5 ni5) {
        this.A00 = ni5;
    }

    @Override // X.InterfaceC58200Pr6
    public final void Dn4(int i, int i2) {
        this.A00.A0K.A0e.Egh(new C54631OBg(C05F.A0C, i, i2, 0));
    }

    @Override // X.InterfaceC58200Pr6
    public final void Dn5() {
        C84B A0N;
        C115475Kh A0V;
        C50868Mdz c50868Mdz = this.A00.A0K;
        AbstractC187378Sf A0E = c50868Mdz.A0F.A0E();
        if ((A0E instanceof C187518St) && (A0N = MSY.A0N(c50868Mdz.A0E)) != null && (A0V = MSW.A0V(A0N, ((C187518St) A0E).A00)) != null) {
            c50868Mdz.A0e.Egh(new C54631OBg(C05F.A00, A0V.A09, A0V.A08, 0));
        }
    }

    @Override // X.InterfaceC58200Pr6
    public final void Dn6(int i, int i2, float f) {
        NI5 ni5 = this.A00;
        ni5.A0K.A0e.Egh(new C54631OBg(C05F.A01, i, i2, (int) (f / AbstractC50522MSa.A00(ni5.A07, OZQ.A00))));
    }

    @Override // X.InterfaceC58200Pr6
    public final void Dvr(Integer num, float f, int i, int i2) {
        int intValue;
        C14360o3.A0B(num, 2);
        NI5 ni5 = this.A00;
        C50868Mdz c50868Mdz = ni5.A0K;
        Integer A0G = c50868Mdz.A0G();
        if (A0G != null && (intValue = A0G.intValue()) != -1) {
            boolean z = false;
            int i3 = 0;
            if (num == C05F.A01) {
                C55098Ob9 c55098Ob9 = ni5.A0C;
                c55098Ob9.A04(AbstractC001800i.A0S(c50868Mdz.A0I.A0E(), AbstractC001800i.A0S(c50868Mdz.A0H.A0E(), c50868Mdz.A0J.A0E())), null);
                C84B A0W = MSW.A0W(ni5.A0I.A0F);
                if (A0W != null) {
                    i3 = A0W.A01(intValue);
                }
                c55098Ob9.A03(num, C57341Pd1.A00, new C57263Pbl(ni5, i, num, intValue, 3), f, i3, (i2 + i3) - i, false);
                return;
            }
            if (num == C05F.A00) {
                z = true;
            }
            c50868Mdz.A0P(intValue, i, i2, z);
        }
    }

    @Override // X.InterfaceC58200Pr6
    public final void EME(int i) {
        View view;
        int i2;
        int i3;
        C3OO A0V;
        NI5 ni5 = this.A00;
        if (ni5.A0E.A1a() == 0 && (A0V = ni5.A0A.A0V(0)) != null) {
            view = A0V.itemView;
        } else {
            view = null;
        }
        if (view != null) {
            i2 = view.getWidth() - (ni5.A06 / 2);
            i3 = view.getLeft();
        } else {
            i2 = 0;
            i3 = Integer.MAX_VALUE;
        }
        int abs = Math.abs(i3);
        if (i > 0) {
            if (i > abs) {
                i2 += i - abs;
                i = abs;
            }
        } else {
            i += i2;
            i2 = 0;
            if (i >= 0) {
                i2 = i;
                i = 0;
            }
        }
        C50868Mdz c50868Mdz = ni5.A0K;
        c50868Mdz.A0U(Integer.valueOf((ni5.A06 / 2) + i2), null);
        int i4 = -i;
        ni5.A0A.scrollBy(i4, 0);
        AbstractC166987dD.A1Z(new C57151PYd(c50868Mdz, (InterfaceC23621Ds) null, i4, i2, 3), AbstractC141776au.A00(c50868Mdz));
    }

    @Override // X.InterfaceC58200Pr6
    public final void CyP(int i) {
        EME(i);
    }

    @Override // X.InterfaceC58200Pr6
    public final void Du4(MotionEvent motionEvent, boolean z, boolean z2) {
    }
}
