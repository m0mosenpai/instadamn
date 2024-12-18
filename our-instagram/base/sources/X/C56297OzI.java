package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: X.OzI, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56297OzI implements InterfaceC58185Pqq {
    public final /* synthetic */ RecyclerView A00;
    public final /* synthetic */ C56050OuP A01;

    @Override // X.InterfaceC58185Pqq
    public final void Dik() {
    }

    @Override // X.InterfaceC58185Pqq
    public final void Du0() {
    }

    @Override // X.InterfaceC58185Pqq
    public final void Du3(int i) {
    }

    @Override // X.InterfaceC58185Pqq
    public final boolean Eil(int i) {
        return true;
    }

    public C56297OzI(RecyclerView recyclerView, C56050OuP c56050OuP) {
        this.A01 = c56050OuP;
        this.A00 = recyclerView;
    }

    @Override // X.InterfaceC58185Pqq
    public final void CvN() {
        this.A01.A0P.A0F(new C9BF());
    }

    @Override // X.InterfaceC58185Pqq
    public final void Dt4(int i) {
        C56050OuP c56050OuP = this.A01;
        c56050OuP.A0H.A04();
        MSX.A1M(c56050OuP.A0Q, true);
        c56050OuP.A0M.A04(i / 2);
    }

    @Override // X.InterfaceC58185Pqq
    public final void Dt6(int i) {
        AbstractC187378Sf c187368Se;
        List BsT;
        InterfaceC110074xc interfaceC110074xc;
        int i2 = i / 2;
        C56050OuP c56050OuP = this.A01;
        C89P c89p = c56050OuP.A0O;
        if (c89p.A04 != null) {
            if (!(c56050OuP.A0M.A03.get(i2) instanceof C52427NHx)) {
                InterfaceC110214xq interfaceC110214xq = c89p.A04;
                if (interfaceC110214xq != null && (BsT = interfaceC110214xq.BsT()) != null && (interfaceC110074xc = (InterfaceC110074xc) AbstractC001800i.A0O(BsT, i2)) != null && AbstractC189168Zk.A03(interfaceC110074xc)) {
                    return;
                }
            } else {
                return;
            }
        }
        C187358Sd c187358Sd = c56050OuP.A0Q;
        AbstractC187378Sf A0E = c187358Sd.A0E();
        if (A0E instanceof C187368Se) {
            if (((C187368Se) A0E).A00) {
                return;
            }
        } else if (!(A0E instanceof C52410NHg)) {
            if (A0E instanceof C187528Su) {
                c187368Se = new C187528Su(i2);
            } else if (A0E instanceof C187538Sv) {
                return;
            } else {
                c187368Se = new C187368Se(false);
            }
            c187358Sd.A0G(c187368Se);
            return;
        }
        c187358Sd.A0G(new C52410NHg(i2, false));
        AnonymousClass229.A01(c56050OuP.A0F).A0U();
    }

    @Override // X.InterfaceC58185Pqq
    public final void DvS(int i) {
        C211029Uz c211029Uz;
        C3OO A0V = this.A00.A0V(i);
        if (A0V != null) {
            C56050OuP c56050OuP = this.A01;
            if ((A0V instanceof C211029Uz) && (c211029Uz = (C211029Uz) A0V) != null && c211029Uz.A03) {
                C22C A01 = AnonymousClass229.A01(c56050OuP.A0F);
                if (A01.A0J() != null) {
                    C22C.A09(EnumC50631MWs.A0I, A01, "TIMELINE_TRANSITION_ADD", ((C22F) A01).A04.A0W);
                }
                c56050OuP.A0Q.A0G(new C187538Sv(i));
            }
        }
    }
}
