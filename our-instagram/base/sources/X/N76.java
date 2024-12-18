package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.quicksnap.emitter.QuickSnapReactionEmitterView;

/* loaded from: classes9.dex */
public final class N76 extends AbstractC59962oe implements MQF {
    public static final String __redex_internal_original_name = "QuickSnapArchivePreviewFragment";
    public C6WQ A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F;
    public final InterfaceC09390do A0G;
    public final InterfaceC09390do A0H;
    public final InterfaceC09390do A0I;
    public final InterfaceC09390do A0J;

    @Override // X.MQF
    public final boolean Dra() {
        return false;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C57165PZj(c07s, this, viewLifecycleOwner, null, 25), C07Y.A00(viewLifecycleOwner));
        InterfaceC09390do interfaceC09390do = this.A0E;
        int i = 0;
        AbstractC31174DnI.A17(requireContext(), (RecyclerView) interfaceC09390do.getValue(), false);
        ((RecyclerView) interfaceC09390do.getValue()).setAdapter((C2UU) AbstractC166987dD.A17(this.A0B));
        ((RecyclerView) interfaceC09390do.getValue()).A10(new C51183MjR(requireContext()));
        AMo.A06(AbstractC166987dD.A0d(this.A07), AbstractC167027dH.A01(this.A08));
        ViewOnClickListenerC55456OkA.A00(AbstractC166987dD.A0d(this.A02), 58, this);
        ViewOnClickListenerC55456OkA.A00(AbstractC166987dD.A0d(this.A03), 59, this);
        InterfaceC09390do interfaceC09390do2 = this.A01;
        ViewOnClickListenerC55456OkA.A00(AbstractC166987dD.A0d(interfaceC09390do2), 60, this);
        View A0d = AbstractC166987dD.A0d(interfaceC09390do2);
        if (!AbstractC167007dF.A1Z(this.A0H)) {
            i = 8;
        }
        A0d.setVisibility(i);
        view.setOnTouchListener(new ViewOnTouchListenerC48084LQj(this.A0I.getValue(), 22));
    }

    @Override // X.MQF
    public final boolean DrR() {
        C51002Mg9.A00(new P7U(false), (C51002Mg9) this.A0J.getValue());
        return true;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0G);
    }

    public N76() {
        C57519Pft c57519Pft = new C57519Pft(this, 19);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C57519Pft(new C57519Pft(this, 15), 16));
        this.A0J = AbstractC25225BEi.A0a(new C57519Pft(A00, 17), c57519Pft, new C57257Pbf(28, null, A00), AbstractC25225BEi.A1D(C51002Mg9.class));
        this.A0H = C57519Pft.A00(this, 14);
        this.A0I = C57519Pft.A00(this, 18);
        this.A07 = AMo.A05(this, MLK.A00, R.id.quick_snap_archive_preview_image_view);
        C57667PiI c57667PiI = C57667PiI.A00;
        this.A04 = AMo.A05(this, c57667PiI, R.id.quick_snap_archive_preview_header);
        this.A06 = AMo.A05(this, new C57748Pjb(this, 43), R.id.quick_snap_archive_preview_title_stacked_avatar);
        this.A05 = AMo.A05(this, c57667PiI, R.id.quick_snap_archive_preview_title_single_avatar);
        this.A0A = AMo.A05(this, c57667PiI, R.id.quick_snap_archive_preview_title);
        this.A09 = AMo.A05(this, c57667PiI, R.id.quick_snap_archive_preview_timestamp);
        this.A0F = AMo.A05(this, c57667PiI, R.id.quick_snap_reactions_title);
        this.A0D = AMo.A05(this, c57667PiI, R.id.quick_snap_reactions_empty_text);
        this.A0E = AMo.A05(this, c57667PiI, R.id.quick_snap_reactions_recycler_view);
        this.A0C = AMo.A05(this, c57667PiI, R.id.quick_snap_reactions_emitter);
        this.A02 = AMo.A05(this, c57667PiI, R.id.quick_snap_archive_preview_exit);
        this.A03 = AMo.A05(this, c57667PiI, R.id.quick_snap_archive_preview_more);
        this.A01 = AMo.A05(this, c57667PiI, R.id.quick_snap_preview_camera);
        this.A08 = C57519Pft.A00(this, 12);
        this.A0G = AbstractC60492pY.A02(this);
        this.A0B = C57519Pft.A00(this, 13);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1807587460);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_quick_snap_archive_preview, false);
        C0f9.A09(71360630, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-452102481);
        super.onDestroyView();
        ((QuickSnapReactionEmitterView) this.A0C.getValue()).A01();
        C0f9.A09(774622068, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(873250323);
        super.onResume();
        AbstractC145016gM.A03(requireActivity(), null, AbstractC166987dD.A0r(this.A0G), false, false);
        C0f9.A09(2105888291, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(1043380559);
        super.onStop();
        AbstractC145016gM.A02(requireActivity(), this, AbstractC166987dD.A0r(this.A0G), false, false);
        C0f9.A09(2102092046, A02);
    }
}
