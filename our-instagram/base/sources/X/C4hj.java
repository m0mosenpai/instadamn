package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.fragment.EditMediaInfoFragment;
import com.instagram.pendingmedia.model.BrandedContentTag;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.4hj, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4hj implements C41V, InterfaceC101004gG {
    public final /* synthetic */ EditMediaInfoFragment A00;

    @Override // X.C41V
    public final void DLh(C73083Pj c73083Pj, C105184oY c105184oY, C38321qM c38321qM, C75113Zb c75113Zb) {
    }

    @Override // X.InterfaceC101004gG
    public final void DRG(C38321qM c38321qM) {
    }

    @Override // X.C41V
    public final void DRH(C38321qM c38321qM) {
    }

    @Override // X.C41V
    public final void DXy(C38321qM c38321qM, C3Y7 c3y7, C75113Zb c75113Zb, int i) {
    }

    public C4hj(EditMediaInfoFragment editMediaInfoFragment) {
        this.A00 = editMediaInfoFragment;
    }

    public final void A00() {
        String str;
        BrandedContentTag brandedContentTag;
        EditMediaInfoFragment editMediaInfoFragment = this.A00;
        FragmentActivity requireActivity = editMediaInfoFragment.requireActivity();
        if (!editMediaInfoFragment.A0g.isEmpty() && editMediaInfoFragment.A0g.get(0) != null) {
            if (editMediaInfoFragment.A0g.isEmpty()) {
                brandedContentTag = null;
            } else {
                brandedContentTag = (BrandedContentTag) editMediaInfoFragment.A0g.get(0);
            }
            str = brandedContentTag.A02;
        } else {
            str = null;
        }
        boolean A0Q = EditMediaInfoFragment.A0Q(editMediaInfoFragment);
        C193328hC c193328hC = new C193328hC((Activity) requireActivity);
        c193328hC.A0s(true);
        c193328hC.A0t(true);
        c193328hC.A0A(2131970050);
        c193328hC.A0J(new DialogInterfaceOnClickListenerC55262Ofb(editMediaInfoFragment), 2131969519);
        c193328hC.A0D(new DialogInterfaceOnClickListenerC23136ANb());
        if (A0Q) {
            c193328hC.A0r(requireActivity.getResources().getString(2131970048, str));
        } else {
            c193328hC.A0P(new DialogInterfaceOnClickListenerC55263Ofc(editMediaInfoFragment), EnumC193348hE.A03, 2131970046);
        }
        C0fJ.A00(c193328hC.A02());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.4gN, java.lang.Object] */
    @Override // X.C37R
    public final InterfaceC101074gN Am7() {
        return new Object();
    }

    @Override // X.C37P
    public final BC9 AmP() {
        final EditMediaInfoFragment editMediaInfoFragment = this.A00;
        return new BC9() { // from class: X.ItM
            @Override // X.BC9
            public final void D2Z(C38321qM c38321qM) {
                EditMediaInfoFragment editMediaInfoFragment2 = EditMediaInfoFragment.this;
                UserSession session = editMediaInfoFragment2.getSession();
                if (C18U.A06(AbstractC166997dE.A0U(session), session, 2342163254124028074L) && editMediaInfoFragment2.A00 < 3 && c38321qM.A0C.Bg6() == null) {
                    new IL2(editMediaInfoFragment2.requireContext()).A00(null, editMediaInfoFragment2.getSession(), null, C05F.A15);
                } else {
                    C193328hC A0O = AbstractC31175DnJ.A0O(editMediaInfoFragment2);
                    A0O.A0A(2131957653);
                    A0O.A09(2131957652);
                    A0O.A0J(new DialogInterfaceOnClickListenerC55321Ogj(21, editMediaInfoFragment2, c38321qM), 2131957677);
                    A0O.A0s(true);
                    AbstractC31176DnK.A16(null, A0O, 2131961127);
                }
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.4of, java.lang.Object] */
    @Override // X.C37S
    public final InterfaceC105254of AmS() {
        return new Object();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.3h2] */
    @Override // X.C37C
    public final C3h2 BRL() {
        return new Object();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.3hv, java.lang.Object] */
    @Override // X.C37D
    public final InterfaceC80063hv BRf() {
        return new Object();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.3t2, java.lang.Object] */
    @Override // X.InterfaceC686236z
    public final InterfaceC86303t2 BRj() {
        return new Object();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.3tG] */
    @Override // X.AnonymousClass374
    public final InterfaceC86433tG BRk() {
        return new Object();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.428, java.lang.Object] */
    @Override // X.C37H
    public final AnonymousClass428 BZ0() {
        return new Object();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.421, java.lang.Object] */
    @Override // X.AnonymousClass379
    public final AnonymousClass421 BZ3() {
        return new Object();
    }

    @Override // X.InterfaceC101004gG
    public final void DLg(C73083Pj c73083Pj, C905741s c905741s, C38321qM c38321qM, C75113Zb c75113Zb) {
        EditMediaInfoFragment editMediaInfoFragment = this.A00;
        MediaFrameLayout mediaFrameLayout = c905741s.A0J;
        if (!c38321qM.Cff() && !editMediaInfoFragment.A0n && mediaFrameLayout.findViewById(R.id.edit_alt_text_button) == null) {
            View requireViewById = LayoutInflater.from(mediaFrameLayout.getContext()).inflate(R.layout.edit_alt_text_button_layout, mediaFrameLayout).requireViewById(R.id.edit_alt_text_button);
            requireViewById.setVisibility(0);
            C0fQ.A00(editMediaInfoFragment.A18, requireViewById);
        }
        EditMediaInfoFragment.A03(mediaFrameLayout, editMediaInfoFragment);
    }
}
