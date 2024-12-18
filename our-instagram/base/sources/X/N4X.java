package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class N4X extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "AudioPickerFragment";
    public RecyclerView A00;
    public C51172MjG A01;
    public String A02;
    public final C51203Mjo A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06 = J8Z.A00(this, 23);
    public final InterfaceC09390do A07;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "clips_audition";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        if (view instanceof ConstraintLayout) {
            this.A02 = AbstractC153636vY.A01(requireArguments(), "music_browse_session_id");
            this.A00 = AbstractC31172DnG.A0G(view, R.id.audio_picker_list);
            UserSession A0r = AbstractC166987dD.A0r(this.A07);
            String str2 = this.A02;
            if (str2 == null) {
                str = "musicBrowseSessionId";
            } else {
                ArrayList A1E = AbstractC166987dD.A1E();
                OGJ ogj = C51193Mjb.A01;
                Context requireContext = requireContext();
                Integer num = C05F.A00;
                C51172MjG c51172MjG = new C51172MjG(null, A0r, new C56334Ozv(this), num, str2, A1E, ogj.A00(requireContext, num));
                this.A01 = c51172MjG;
                c51172MjG.setHasStableIds(true);
                RecyclerView recyclerView = this.A00;
                str = "auditionAudioList";
                if (recyclerView != null) {
                    C51172MjG c51172MjG2 = this.A01;
                    if (c51172MjG2 == null) {
                        str = "audioListAdapter";
                    } else {
                        recyclerView.setAdapter(c51172MjG2);
                        RecyclerView recyclerView2 = this.A00;
                        if (recyclerView2 != null) {
                            AbstractC31174DnI.A17(requireContext(), recyclerView2, false);
                            RecyclerView recyclerView3 = this.A00;
                            if (recyclerView3 != null) {
                                recyclerView3.A10(new C51193Mjb(requireContext(), num));
                                RecyclerView recyclerView4 = this.A00;
                                if (recyclerView4 != null) {
                                    recyclerView4.setItemAnimator(new U7P());
                                    AbstractC166987dD.A1P(requireContext(), AbstractC167007dF.A0N(view, R.id.audio_picker_subtitle), 2131974868);
                                    C51035Mgj c51035Mgj = (C51035Mgj) this.A05.getValue();
                                    JQ0.A11(this, new C57154PYy(this, null, 47), c51035Mgj.A04);
                                    JQ0.A11(this, new C57154PYy(this, null, 48), c51035Mgj.A05);
                                    JQ0.A11(this, new C57154PYy(this, null, 49), ((C50870Me1) this.A06.getValue()).A0V);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        throw AbstractC166987dD.A14("Clips Audio Selector Fragment view should be ConstraintLayout");
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A07);
    }

    public N4X() {
        J8Z j8z = new J8Z(this, 22);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new J8Z(new J8Z(this, 24), 25));
        this.A05 = AbstractC25225BEi.A0a(new J8Z(A00, 26), j8z, new D8K(27, null, A00), AbstractC25225BEi.A1D(C51035Mgj.class));
        this.A04 = J8Z.A00(this, 21);
        this.A03 = new C51203Mjo();
        this.A07 = AbstractC60492pY.A02(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-264862289);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_clips_audition_audio_picker_fragment, viewGroup, false);
        C0f9.A09(1397904826, A02);
        return inflate;
    }
}
