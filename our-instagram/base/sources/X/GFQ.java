package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.save.model.SavedCollection;

/* loaded from: classes6.dex */
public final class GFQ implements JIB {
    public final /* synthetic */ EM6 A00;

    public GFQ(EM6 em6) {
        this.A00 = em6;
    }

    @Override // X.JIB
    public final void AOc() {
        EM6 em6 = this.A00;
        if (em6.A0C != null && em6.A0E != EnumC33416Epn.A05) {
            C193328hC A0O = AbstractC31175DnJ.A0O(em6);
            A0O.A0A(2131972740);
            A0O.A09(2131972739);
            A0O.A0Z(DialogInterfaceOnClickListenerC35454FkB.A00(em6, 63), EnumC193348hE.A06, em6.getString(2131957640), true);
            A0O.A06();
            AbstractC31178DnM.A1R(A0O, true);
            return;
        }
        EM6.A01(em6);
    }

    @Override // X.JIB
    public final SavedCollection Ap1() {
        return this.A00.A0C;
    }

    @Override // X.JIB
    public final void CJ0() {
        EM6 em6 = this.A00;
        if (em6.A0C != null) {
            Bundle A0b = AbstractC166987dD.A0b();
            A0b.putSerializable("SaveFragment.SAVE_HOME_TAB_MODE", EnumC39551HdN.A03);
            A0b.putParcelable("SaveFragment.ARGUMENT_SAVED_FEED_COLLECTION", em6.A0C);
            AbstractC31173DnH.A1I(em6, AbstractC31171DnF.A0L(em6.requireActivity(), A0b, em6.A05, ModalActivity.class, "saved_feed"));
        }
    }

    @Override // X.JIB
    public final void CJ1() {
        EM6 em6 = this.A00;
        SavedCollection savedCollection = em6.A0C;
        if (savedCollection != null) {
            FB6.A00();
            boolean A03 = em6.A0B.A03();
            ELY ely = new ELY();
            Bundle A0b = AbstractC166987dD.A0b();
            A0b.putParcelable("collection_to_edit", savedCollection);
            A0b.putBoolean(AbstractC111324zv.A00(362), A03);
            AbstractC31177DnL.A15(ely, AbstractC31173DnH.A0J(A0b, ely, em6), em6.A05);
        }
    }

    @Override // X.JIB
    public final void CJ6() {
        EM6 em6 = this.A00;
        if (em6.A0F != null) {
            GI1 gi1 = em6.A0B;
            if (!gi1.A05) {
                gi1.A05 = true;
                gi1.A02();
            }
            em6.A0F.A00.setVisibility(0);
            em6.A0F.A02(false);
            AbstractC31178DnM.A0v(em6);
        }
    }

    @Override // X.JIB
    public final boolean CL7() {
        return this.A00.A0B.A03();
    }

    @Override // X.JIB
    public final void EHQ() {
        EM6 em6 = this.A00;
        if (EM6.A0A(em6)) {
            UserSession userSession = em6.A05;
            WEz A01 = AbstractC69993VzD.A01(em6.requireActivity(), em6, userSession, EnumC65855TvH.A0r, VG2.A0V, em6.A0L);
            A01.A01 = AbstractC166987dD.A10(em6.A05);
            A01.A0E = true;
            A01.A07(EnumC39619HeT.A03);
            WEz.A00(null, A01);
        }
    }
}
