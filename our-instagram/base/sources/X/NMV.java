package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.io.IOException;

/* loaded from: classes9.dex */
public final class NMV extends AbstractC52160N6m implements InterfaceC60072op, InterfaceC58130Ppt {
    public static final String __redex_internal_original_name = "IGTVVideoCoverPickerFragment";
    public C55535OlT A00;
    public C6WQ A01;
    public boolean A02;
    public boolean A03;
    public OXC A04;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131964263);
        AbstractC31176DnK.A1B(ViewOnClickListenerC55455Ok9.A00(this, 20), OPJ.A00(this, interfaceC56362iU), interfaceC56362iU);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "igtv_cover_picker";
    }

    @Override // X.AbstractC52160N6m, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        C14360o3.A0A(activity);
        if (!activity.isFinishing()) {
            try {
                this.A04 = new OXC(AbstractC166987dD.A0r(this.A0C), AbstractC54906OQd.A00(NNE.A01(this.A0D).A1N), super.A01, super.A00);
            } catch (IOException e) {
                AbstractC12120kG.A09("igtv_cover_picker", "Video frame generator setup failed", e);
            }
            Context requireContext = requireContext();
            int A01 = OZN.A01(requireContext);
            int A00 = OZN.A00(requireContext);
            InterfaceC09390do interfaceC09390do = this.A0D;
            float f = NNE.A01(interfaceC09390do).A02;
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.filmstrip_keyframes_holder);
            C60842q8 A0a = AbstractC25225BEi.A0a(C57538PgC.A01(this, 33), new C57251PbZ(27, requireContext, this), new C57251PbZ(26, null, this), AbstractC25225BEi.A1D(C50982Mfp.class));
            AbstractC31174DnI.A1E(this, ((C50982Mfp) A0a.getValue()).A07, new C57561PgZ(this, 24), 31);
            AbstractC50522MSa.A14(this, new PZH(this, null, 2), ((C50982Mfp) A0a.getValue()).A0G);
            AbstractC31174DnI.A1E(this, ((C50982Mfp) A0a.getValue()).A04, new C57561PgZ(this, 25), 31);
            AbstractC31174DnI.A1E(this, ((C50982Mfp) A0a.getValue()).A08, new C57561PgZ(this, 26), 31);
            UserSession A0r = AbstractC166987dD.A0r(this.A0C);
            FrameLayout frameLayout = super.A03;
            if (frameLayout != null) {
                SeekBar seekBar = this.A05;
                if (seekBar != null) {
                    C50743Max c50743Max = this.A07;
                    if (c50743Max != null) {
                        this.A00 = new C55535OlT(requireContext, frameLayout, linearLayout, seekBar, this, A0r, c50743Max, this, (C50982Mfp) A0a.getValue(), this.A04, "live_cover_photo_selector", null, f, f, super.A01, super.A00, A01, A00);
                        SeekBar seekBar2 = this.A05;
                        if (seekBar2 != null) {
                            seekBar2.setProgress(NNE.A01(interfaceC09390do).A05);
                            return;
                        }
                    } else {
                        str = "thumb";
                    }
                }
                str = "seekBar";
            } else {
                str = "frameContainer";
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    @Override // X.InterfaceC58130Ppt
    public final void D7v(String str) {
        C11T.A02(new RunnableC56995PQl(this, str));
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        OPI.A01(this, this.A0D);
        this.A03 = false;
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(576360717);
        super.onPause();
        C55535OlT c55535OlT = this.A00;
        if (c55535OlT == null) {
            C14360o3.A0F("singleVideoCoverFrameScrubbingController");
            throw C00O.createAndThrow();
        }
        c55535OlT.onPause();
        C0f9.A09(291789363, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-46245513);
        super.onResume();
        C55535OlT c55535OlT = this.A00;
        if (c55535OlT == null) {
            C14360o3.A0F("singleVideoCoverFrameScrubbingController");
            throw C00O.createAndThrow();
        }
        c55535OlT.onResume();
        C0f9.A09(-879352578, A02);
    }
}
