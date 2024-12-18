package X;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.save.model.SavedCollection;
import java.util.Iterator;

/* renamed from: X.Iwv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42819Iwv implements InterfaceC37202GaD {
    public final int A00;
    public final Object A01;

    public C42819Iwv(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC37202GaD
    public final C193328hC AM3(C193328hC c193328hC) {
        UserSession userSession;
        Fragment fragment;
        switch (this.A00) {
            case 0:
                AbstractC59962oe abstractC59962oe = (AbstractC59962oe) this.A01;
                C193328hC A0O = AbstractC31175DnJ.A0O(abstractC59962oe);
                A0O.A0n(abstractC59962oe);
                return A0O;
            case 1:
                C42810Iwm c42810Iwm = (C42810Iwm) this.A01;
                userSession = c42810Iwm.A01;
                fragment = c42810Iwm.A00;
                c193328hC.A0m(fragment, userSession);
                return c193328hC;
            default:
                C37600Ggv c37600Ggv = (C37600Ggv) this.A01;
                userSession = c37600Ggv.A03;
                fragment = c37600Ggv.A01;
                c193328hC.A0m(fragment, userSession);
                return c193328hC;
        }
    }

    @Override // X.InterfaceC37202GaD
    public final boolean CNB() {
        if (1 - this.A00 != 0) {
            return false;
        }
        return AbstractC167007dF.A1W(((C42810Iwm) this.A01).A04);
    }

    @Override // X.InterfaceC37202GaD
    public final void EFN(C38321qM c38321qM, C75113Zb c75113Zb, int i, int i2) {
        if (1 - this.A00 == 0) {
            C42810Iwm c42810Iwm = (C42810Iwm) this.A01;
            C41645Ibb c41645Ibb = c42810Iwm.A02;
            SavedCollection savedCollection = c42810Iwm.A04;
            savedCollection.getClass();
            c41645Ibb.A02(null, c38321qM, savedCollection, savedCollection.A0F, i, i2);
        }
    }

    @Override // X.InterfaceC37202GaD
    public final void F9n(C38321qM c38321qM, C75113Zb c75113Zb, int i, int i2) {
        switch (this.A00) {
            case 0:
                C14360o3.A0B(c38321qM, 0);
                EMG emg = (EMG) this.A01;
                EMG.A00(emg.requireContext(), emg, c38321qM, i, i2);
                EMG.A03(emg);
                if (c38321qM.A53() && AbstractC35273Fh8.A08(emg.A08())) {
                    AbstractC35273Fh8.A02(emg.requireContext(), new EUT(i, 0, emg, c38321qM), emg.A08(), c38321qM, emg, EnumC77213d7.A03, AbstractC25225BEi.A15(emg.A0N), i);
                }
                Iterator it = emg.A08.iterator();
                while (it.hasNext()) {
                    ((SavedCollection) it.next()).A09 = false;
                }
                c38321qM.Ed3(EnumC77213d7.A03);
                ((C1DX) emg.A0J.getValue()).A03(c38321qM);
                RecyclerView recyclerView = emg.A00;
                if (recyclerView == null) {
                    C14360o3.A0F("recyclerView");
                    throw C00O.createAndThrow();
                }
                C2UU c2uu = recyclerView.A0A;
                if (c2uu != null) {
                    c2uu.notifyDataSetChanged();
                }
                EMG.A02(emg);
                return;
            case 1:
                return;
            default:
                C14360o3.A0B(c38321qM, 0);
                C37600Ggv.A01(c38321qM, (C37600Ggv) this.A01, i, i2);
                return;
        }
    }
}
