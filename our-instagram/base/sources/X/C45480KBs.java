package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.music.common.model.AudioOverlayTrack;

/* renamed from: X.KBs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45480KBs extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "MusicProfileFragment";
    public Context A00;
    public AudioOverlayTrack A01;
    public AudioOverlayTrack A02;
    public C54794OJm A03;
    public C155506yf A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final InterfaceC09390do A09 = AbstractC25225BEi.A0a(new C57528Pg2(this, 6), new C57528Pg2(this, 5), new C57531Pg5(11, null, this), AbstractC25225BEi.A1D(C155476ya.class));
    public final String A08 = AbstractC167017dG.A0j();
    public final InterfaceC09390do A0A = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131968028);
        AbstractC31176DnK.A1C(new ViewOnClickListenerC48073LPy(this, 16), AbstractC31174DnI.A0K(), interfaceC56362iU);
        interfaceC56362iU.Eha(new ViewOnClickListenerC48073LPy(this, 17), R.drawable.instagram_check_pano_outline_24);
        C51758Mth c51758Mth = (C51758Mth) ((C155476ya) this.A09.getValue()).A01.A02();
        boolean z = true;
        if (c51758Mth == null || !c51758Mth.A01) {
            z = false;
        }
        interfaceC56362iU.ARS(z);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "music_settings";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ViewGroup A0C = AbstractC31176DnK.A0C(view, R.id.music_profile_fragment_container);
        if (this.A06) {
            InterfaceC09390do interfaceC09390do = this.A09;
            ((C155476ya) interfaceC09390do.getValue()).A00();
            Context context = this.A00;
            if (context == null) {
                str = "context";
            } else {
                C38311Gsx c38311Gsx = new C38311Gsx(context);
                c38311Gsx.A01(AbstractC166997dE.A0q(AbstractC166997dE.A0N(this), 2131967965));
                A0C.addView(c38311Gsx, 0);
                C54794OJm c54794OJm = new C54794OJm(AbstractC167007dF.A0M(view, R.id.music_on_profile_stub));
                this.A03 = c54794OJm;
                c54794OJm.A00();
                C54794OJm c54794OJm2 = this.A03;
                str = "viewHolder";
                if (c54794OJm2 != null) {
                    IgdsButton igdsButton = c54794OJm2.A06;
                    if (igdsButton != null) {
                        igdsButton.setText(2131972171);
                        ViewOnClickListenerC48073LPy.A00(igdsButton, 18, this);
                    }
                    C54794OJm c54794OJm3 = this.A03;
                    if (c54794OJm3 != null) {
                        ConstraintLayout constraintLayout = c54794OJm3.A00;
                        if (constraintLayout != null) {
                            ViewOnClickListenerC48073LPy.A00(constraintLayout, 19, this);
                        }
                        AbstractC43593JPy.A1E(getViewLifecycleOwner(), ((C155476ya) interfaceC09390do.getValue()).A01, new C57745PjY(this, 37), 48);
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        if (this.A07) {
            this.A07 = false;
            view.postDelayed(new M27(this), 500L);
        }
        JQ0.A11(this, new C50119MBt(this, A0C, null, 37), ((C155476ya) this.A09.getValue()).A04);
    }

    public static final void A00(C45480KBs c45480KBs, boolean z) {
        AudioOverlayTrack audioOverlayTrack = c45480KBs.A02;
        if (audioOverlayTrack != null) {
            InterfaceC09390do interfaceC09390do = c45480KBs.A0A;
            Bundle A05 = AbstractC31178DnM.A05(AbstractC31180DnO.A0M(interfaceC09390do));
            A05.putBoolean("is_existing_track", z);
            A05.putParcelable("selected_audio_track", audioOverlayTrack);
            KD1 kd1 = new KD1();
            kd1.setArguments(A05);
            C189448aO A0g = AbstractC25231BEo.A0g(interfaceC09390do);
            A0g.A0T = kd1;
            AbstractC31177DnL.A14(c45480KBs, kd1, A0g);
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0A);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-407004925);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = requireContext();
        InterfaceC09390do interfaceC09390do = this.A0A;
        this.A06 = C36A.A0A(AbstractC166987dD.A0r(interfaceC09390do));
        this.A07 = requireArguments.getBoolean("music_profile_should_open_for_editing");
        this.A04 = AbstractC155496ye.A00(AbstractC166987dD.A0r(interfaceC09390do));
        if (this.A07) {
            this.A05 = true;
            this.A02 = (AudioOverlayTrack) requireArguments.getParcelable("music_profile_open_for_editing_audio_track");
        }
        C0f9.A09(26099513, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(378089355);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.music_profile_fragment, viewGroup, false);
        C0f9.A09(1579839057, A02);
        return inflate;
    }
}
