package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.ui.widget.videopreviewview.VideoPreviewView;
import com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel;

/* renamed from: X.N6p, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52163N6p extends AbstractC59962oe implements InterfaceC60442pS, InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "IGTVUploadPreviewFragment";
    public View A00;
    public SeekBar A01;
    public TextView A02;
    public VideoPreviewView A03;
    public boolean A04;
    public ImageView A05;
    public LinearLayout A06;
    public Runnable A07;
    public final InterfaceC09390do A09 = C57551PgP.A00(this, new C57551PgP(this, 9), new C57251PbZ(34, null, this), AbstractC25225BEi.A1D(IGTVUploadViewModel.class), 10);
    public final InterfaceC09390do A08 = AbstractC60492pY.A02(this);

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002a, code lost:
    
        if (r4 > (r1 * 1.05d)) goto L6;
     */
    @Override // X.InterfaceC60122ou
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void configureActionBar(X.InterfaceC56362iU r12) {
        /*
            r11 = this;
            r3 = 0
            X.C14360o3.A0B(r12, r3)
            r0 = 1
            r12.EkS(r0)
            X.0do r8 = r11.A09
            X.NNE r0 = X.MSY.A0P(r8)
            com.instagram.common.gallery.Medium r1 = r0.A00
            int r0 = r1.A0B
            double r4 = (double) r0
            int r0 = r1.A04
            double r1 = (double) r0
            r9 = 4606732058837280358(0x3fee666666666666, double:0.95)
            double r6 = r1 * r9
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 < 0) goto L2c
            r6 = 4607407598781385933(0x3ff0cccccccccccd, double:1.05)
            double r1 = r1 * r6
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            r4 = 1
            if (r0 <= 0) goto L2d
        L2c:
            r4 = 0
        L2d:
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r0 = X.MSW.A0b(r8)
            X.P45 r0 = r0.A0M
            X.O80 r0 = r0.A0C
            boolean r0 = X.AbstractC167007dF.A1W(r0)
            if (r0 == 0) goto L84
            if (r4 == 0) goto L83
            r0 = 2131972699(0x7f13525b, float:1.9582413E38)
            java.lang.String r0 = r11.getString(r0)
            X.NN5 r2 = X.NN5.A00
        L46:
            X.3LO r1 = X.AbstractC31171DnF.A0B()
            r1.A0K = r0
            r0 = 40
            X.OkK r0 = X.ViewOnClickListenerC55465OkK.A00(r2, r11, r0)
            android.view.View r0 = X.AbstractC31177DnL.A0F(r0, r1, r12)
            int r2 = r0.getPaddingRight()
            if (r4 == 0) goto L83
            r1 = 2131629816(0x7f0e16f8, float:1.8886964E38)
            X.0do r0 = r11.A08
            com.instagram.common.session.UserSession r0 = X.AbstractC166987dD.A0r(r0)
            android.view.View r1 = r12.ESp(r0, r1, r2, r3)
            r11.A00 = r1
            java.lang.String r2 = "toggleAspectRatioButton"
            if (r1 == 0) goto L8e
            r0 = 37
            X.ViewOnClickListenerC55455Ok9.A01(r1, r0, r11)
            android.content.Context r0 = r11.requireContext()
            int r1 = X.MSX.A01(r0)
            android.view.View r0 = r11.A00
            if (r0 == 0) goto L8e
            r0.setPadding(r3, r1, r3, r1)
        L83:
            return
        L84:
            r0 = 2131968535(0x7f134217, float:1.9573967E38)
            java.lang.String r0 = r11.getString(r0)
            X.NMo r2 = X.C52542NMo.A00
            goto L46
        L8e:
            X.C14360o3.A0F(r2)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52163N6p.configureActionBar(X.2iU):void");
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "igtv_upload_preview_fragment";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        C14360o3.A0A(activity);
        if (!activity.isFinishing()) {
            Context requireContext = requireContext();
            InterfaceC09390do interfaceC09390do = this.A09;
            C47Z A01 = NNE.A01(interfaceC09390do);
            this.A04 = AbstractC25230BEn.A1S(A01.A0H, A01.A0G);
            VideoPreviewView videoPreviewView = (VideoPreviewView) view.findViewById(R.id.pending_video_preview);
            videoPreviewView.setVideoPath(MSY.A0P(interfaceC09390do).A00.A0X, new NG2(this, 1));
            this.A03 = videoPreviewView;
            int A0C = AbstractC166987dD.A0C(requireContext, 11);
            C210339Rw c210339Rw = new C210339Rw(A0C, A0C, AbstractC31173DnH.A03(getContext(), requireContext, R.attr.glyphColorPrimary), AbstractC166987dD.A0C(requireContext, 1));
            c210339Rw.setAlpha(255);
            SeekBar seekBar = (SeekBar) view.findViewById(R.id.scrubber);
            seekBar.setProgressDrawable(seekBar.getResources().getDrawable(AbstractC53242c7.A0H(requireContext, R.attr.videoScrubberProgressBarDrawable)));
            seekBar.setThumb(c210339Rw);
            seekBar.setOnSeekBarChangeListener(new C55531OlP(this, 3));
            this.A01 = seekBar;
            ImageView A08 = AbstractC31171DnF.A08(view, R.id.pause_button);
            AbstractC31173DnH.A11(requireContext, A08, AbstractC53242c7.A08(requireContext));
            ViewOnClickListenerC55455Ok9.A01(A08, 38, this);
            this.A05 = A08;
            TextView A0e = AbstractC166987dD.A0e(view, R.id.timer);
            AbstractC166987dD.A1O(requireContext, A0e, AbstractC53242c7.A08(requireContext));
            this.A02 = A0e;
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.video_controls_container);
            linearLayout.setBackgroundColor(AbstractC53242c7.A00(linearLayout.getContext()));
            this.A06 = linearLayout;
            A02(this);
            Medium medium = MSY.A0P(interfaceC09390do).A00;
            double d = medium.A0B;
            double d2 = medium.A04;
            if (d >= d2 * 0.95d && d <= d2 * 1.05d) {
                C23031Ai A0l = AbstractC25230BEn.A0l(this.A08);
                if (!AbstractC167017dG.A1b(A0l, A0l.A0n, C23031Ai.A8c, 248)) {
                    PN1 pn1 = new PN1(this);
                    this.A07 = pn1;
                    VideoPreviewView videoPreviewView2 = this.A03;
                    if (videoPreviewView2 == null) {
                        C14360o3.A0F("videoPreviewView");
                        throw C00O.createAndThrow();
                    }
                    videoPreviewView2.postDelayed(pn1, 200L);
                }
            }
        }
    }

    public static final void A00(C52163N6p c52163N6p) {
        String str;
        VideoPreviewView videoPreviewView = c52163N6p.A03;
        if (videoPreviewView == null) {
            str = "videoPreviewView";
        } else {
            videoPreviewView.A04();
            ImageView imageView = c52163N6p.A05;
            if (imageView == null) {
                str = "pauseButton";
            } else {
                imageView.setImageResource(R.drawable.play_icon);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A01(C52163N6p c52163N6p) {
        String str;
        VideoPreviewView videoPreviewView = c52163N6p.A03;
        if (videoPreviewView == null) {
            str = "videoPreviewView";
        } else {
            videoPreviewView.A06();
            ImageView imageView = c52163N6p.A05;
            if (imageView == null) {
                str = "pauseButton";
            } else {
                imageView.setImageResource(R.drawable.pause);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A08);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        OPI.A01(this, this.A09);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.C52163N6p r5) {
        /*
            android.content.Context r0 = r5.requireContext()
            int r0 = X.AbstractC13880nE.A09(r0)
            float r2 = (float) r0
            android.content.res.Resources r1 = X.AbstractC166997dE.A0N(r5)
            r0 = 2131165219(0x7f070023, float:1.7944649E38)
            float r0 = r1.getDimension(r0)
            float r2 = r2 - r0
            android.content.Context r1 = r5.requireContext()
            r0 = 2130968588(0x7f04000c, float:1.7545834E38)
            int r0 = X.AbstractC53242c7.A0G(r1, r0)
            float r0 = (float) r0
            float r2 = r2 - r0
            int r4 = X.C1H4.A01(r2)
            boolean r0 = r5.A04
            java.lang.String r3 = "videoPreviewView"
            if (r0 == 0) goto L51
            int r2 = X.MSX.A03(r5)
            float r1 = (float) r2
            r0 = 1071877875(0x3fe38ef3, float:1.7778)
            int r0 = X.MSW.A02(r1, r0)
            int r4 = r4 - r0
            int r1 = r4 / 2
            com.instagram.common.ui.widget.videopreviewview.VideoPreviewView r0 = r5.A03
            if (r0 == 0) goto L75
            X.AbstractC13880nE.A0f(r0, r1)
            com.instagram.common.ui.widget.videopreviewview.VideoPreviewView r0 = r5.A03
            if (r0 == 0) goto L75
            X.AbstractC13880nE.A0U(r0, r1)
        L49:
            com.instagram.common.ui.widget.videopreviewview.VideoPreviewView r0 = r5.A03
            if (r0 == 0) goto L75
            X.AbstractC13880nE.A0g(r0, r2)
            return
        L51:
            android.content.res.Resources r1 = X.AbstractC166997dE.A0N(r5)
            r0 = 2131165206(0x7f070016, float:1.7944623E38)
            float r0 = r1.getDimension(r0)
            com.instagram.common.ui.widget.videopreviewview.VideoPreviewView r1 = r5.A03
            if (r1 == 0) goto L75
            int r0 = (int) r0
            int r0 = -r0
            X.AbstractC13880nE.A0f(r1, r0)
            com.instagram.common.ui.widget.videopreviewview.VideoPreviewView r1 = r5.A03
            if (r1 == 0) goto L75
            r0 = 0
            X.AbstractC13880nE.A0U(r1, r0)
            r1 = 1058013184(0x3f100000, float:0.5625)
            float r0 = (float) r4
            int r2 = X.AbstractC166987dD.A0B(r0, r1)
            goto L49
        L75:
            X.C14360o3.A0F(r3)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52163N6p.A02(X.N6p):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1916857496);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.upload_preview_tab_fragment, false);
        C0f9.A09(-1262669986, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-819749800);
        super.onDestroyView();
        VideoPreviewView videoPreviewView = this.A03;
        if (videoPreviewView == null) {
            C14360o3.A0F("videoPreviewView");
            throw C00O.createAndThrow();
        }
        videoPreviewView.A05();
        Runnable runnable = this.A07;
        if (runnable != null) {
            videoPreviewView.removeCallbacks(runnable);
        }
        C0f9.A09(-690763180, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(2144125034);
        super.onPause();
        A00(this);
        C0f9.A09(596378257, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(200429758);
        super.onResume();
        VideoPreviewView videoPreviewView = this.A03;
        if (videoPreviewView == null) {
            C14360o3.A0F("videoPreviewView");
            throw C00O.createAndThrow();
        }
        if (videoPreviewView.A08() && videoPreviewView.A04 != MXU.STARTED) {
            A01(this);
        }
        C0f9.A09(-1769245041, A02);
    }
}
