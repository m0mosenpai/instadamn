package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.model.reels.Reel;
import instagram.features.stories.fragment.ReelViewerFragment;
import java.io.IOException;
import java.util.List;

@Deprecated
/* renamed from: X.6mR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148566mR implements InterfaceC144686fo {
    public boolean A00;
    public boolean A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final InterfaceC1118853a A04;
    public final Fragment A05;

    @Override // X.InterfaceC144696fp
    public final void Cyy() {
    }

    @Override // X.InterfaceC144736ft
    public final void DCn() {
        this.A01 = true;
        C41551w4 c41551w4 = ((ReelViewerFragment) this.A04).A0a;
        c41551w4.getClass();
        String id = c41551w4.A0H.getId();
        UserSession userSession = this.A03;
        Bundle bundle = new Bundle();
        bundle.putString(MSV.A00(436), id);
        bundle.putBoolean(MSV.A00(176), true);
        bundle.putBoolean("edit_highlights_is_suggested_highlight", true);
        bundle.putSerializable(MSV.A00(465), EnumC53243Ngg.A0C);
        Fragment fragment = this.A05;
        new C6XJ(fragment.requireActivity(), bundle, userSession, ModalActivity.class, "manage_highlights").A0D(fragment, 201);
    }

    @Override // X.InterfaceC144726fs
    public final void DcS() {
        this.A00 = true;
        Fragment fragment = this.A05;
        Context requireContext = fragment.requireContext();
        C6WQ c6wq = new C6WQ(requireContext);
        c6wq.A00(fragment.requireContext().getResources().getString(2131971161));
        C0fJ.A00(c6wq);
        C41551w4 c41551w4 = ((ReelViewerFragment) this.A04).A0a;
        c41551w4.getClass();
        C52229N9s c52229N9s = new C52229N9s(requireContext, c41551w4.A0H, c6wq, this);
        C55122Obj A01 = AbstractC55178Odj.A01(this.A03);
        C08790ch A00 = AbstractC018607g.A00(fragment);
        EnumC53243Ngg enumC53243Ngg = EnumC53243Ngg.A0F;
        C55122Obj.A01(A01);
        OVW.A00().A01(new C55834Oqk(requireContext, A00, A01, enumC53243Ngg, c52229N9s), c52229N9s);
    }

    @Override // X.InterfaceC144696fp
    public final void DlV(C3G2 c3g2) {
    }

    @Override // X.InterfaceC144696fp
    public final void Dll() {
    }

    public final boolean A00() {
        C55122Obj A01;
        Reel reel;
        InterfaceC1118853a interfaceC1118853a = this.A04;
        C41551w4 c41551w4 = ((ReelViewerFragment) interfaceC1118853a).A0a;
        c41551w4.getClass();
        if (c41551w4.A0H.A0p() && !this.A00 && (reel = (A01 = AbstractC55178Odj.A01(this.A03)).A02) != null && A01.A04) {
            UserSession userSession = A01.A05;
            List list = A01.A06;
            String str = A01.A03;
            str.getClass();
            if (C55122Obj.A02(A01.A01, A01.A00, userSession, reel, str, list)) {
                interfaceC1118853a.EJE("context_switch");
                C193328hC c193328hC = new C193328hC(this.A05.getContext());
                c193328hC.A0A(2131974898);
                c193328hC.A09(2131974895);
                c193328hC.A0I(new DialogInterfaceOnClickListenerC55266Off(this), 2131974896);
                c193328hC.A0J(new DialogInterfaceOnClickListenerC55265Ofe(this), 2131974897);
                C0fJ.A00(c193328hC.A02());
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC144716fr
    public final void DDd() {
        Bundle bundle = new Bundle();
        C88X c88x = new C88X(new C189128Zd(null, C88Z.A0I, null));
        try {
            bundle.putString("create_mode_attribution", ADL.A00(c88x));
            bundle.putParcelable("camera_configuration", C82R.A00(C208509Kk.A00, C81W.A0C));
            bundle.putSerializable("camera_entry_point", C22P.A2Y);
            UserSession userSession = this.A03;
            Fragment fragment = this.A05;
            C6XJ A02 = C6XJ.A02(fragment.requireActivity(), bundle, userSession, ModalActivity.class, "attribution_quick_camera_fragment");
            A02.A07();
            A02.A0C(fragment.requireActivity());
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to serialize dialElement of type ");
            C88Z c88z = c88x.A04;
            if (c88z == null) {
                c88z = C88Z.A0G;
            }
            sb.append(c88z);
            C0w9.A06("serialize_create_mode_attribution", sb.toString(), e);
        }
    }

    @Override // X.InterfaceC144706fq
    public final void DVp() {
        Bundle bundle = new Bundle();
        C88X c88x = new C88X(new C189128Zd(null, C88Z.A09, null));
        try {
            bundle.putString("create_mode_attribution", ADL.A00(c88x));
            bundle.putParcelable("camera_configuration", C82R.A00(C208509Kk.A00, C81W.A0C));
            bundle.putSerializable("camera_entry_point", C22P.A0Z);
            UserSession userSession = this.A03;
            Fragment fragment = this.A05;
            C6XJ A02 = C6XJ.A02(fragment.requireActivity(), bundle, userSession, ModalActivity.class, "attribution_quick_camera_fragment");
            A02.A07();
            A02.A0C(fragment.requireActivity());
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to serialize dialElement of type ");
            C88Z c88z = c88x.A04;
            if (c88z == null) {
                c88z = C88Z.A0G;
            }
            sb.append(c88z);
            C0w9.A06("serialize_create_mode_attribution", sb.toString(), e);
        }
    }

    @Override // X.InterfaceC144746fu
    public final void Df7() {
        C41551w4 c41551w4 = ((ReelViewerFragment) this.A04).A0a;
        c41551w4.getClass();
        Reel reel = c41551w4.A0H;
        Fragment fragment = this.A05;
        Context requireContext = fragment.requireContext();
        UserSession userSession = this.A03;
        InterfaceC11380iw interfaceC11380iw = this.A02;
        new C54838OLx(requireContext, fragment.getParentFragmentManager(), AbstractC018607g.A00(fragment), interfaceC11380iw, userSession).A01(new C55839Oqp(this), reel.getId());
    }

    public C148566mR(Fragment fragment, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC1118853a interfaceC1118853a) {
        this.A04 = interfaceC1118853a;
        this.A05 = fragment;
        this.A03 = userSession;
        this.A02 = interfaceC11380iw;
    }
}
