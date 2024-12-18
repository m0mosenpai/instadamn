package X;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.clips.audio.soundsync.view.player.shared.SoundSyncPreviewView;
import com.instagram.common.ui.base.IgButton;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;

/* renamed from: X.N5i, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52134N5i extends AbstractC59962oe implements InterfaceC60072op {
    public static final String __redex_internal_original_name = "ClipsAuditionFragment";
    public Dialog A00;
    public ViewGroup A01;
    public EnumC53101NeE A02;
    public SoundSyncPreviewView A03;
    public IgButton A04;
    public IgButton A05;
    public IgdsMediaButton A06;
    public IgdsMediaButton A07;
    public InterfaceC59892oW A08;
    public C54711OEn A09;
    public boolean A0A;
    public boolean A0B;
    public String A0C;
    public final InterfaceC09390do A0E = J8Z.A00(this, 28);
    public final InterfaceC09390do A0D = J8Z.A00(this, 27);
    public final InterfaceC09390do A0F = AbstractC60492pY.A02(this);

    public static void A00(View view, int i, Object obj) {
        ViewOnClickListenerC55463OkI viewOnClickListenerC55463OkI = new ViewOnClickListenerC55463OkI(obj, i);
        C3P9 c3p9 = new C3P9(view);
        c3p9.A04 = new C52374NFq(view, 19);
        c3p9.A07 = true;
        c3p9.A02 = 0.9f;
        c3p9.A00();
        C0fQ.A00(viewOnClickListenerC55463OkI, view);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "clips_audition";
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0074, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, X.AbstractC166987dD.A0o(r12.A0F), 36316942080414437L) == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0109, code lost:
    
        if (r0 != null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01fc, code lost:
    
        if (r0 == null) goto L84;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b1  */
    /* JADX WARN: Type inference failed for: r6v11, types: [X.6cX, java.lang.Object] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r13, android.os.Bundle r14) {
        /*
            Method dump skipped, instructions count: 784
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52134N5i.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A01(C52134N5i c52134N5i) {
        InterfaceC09390do interfaceC09390do = c52134N5i.A0F;
        AbstractC183338Bg.A00(AbstractC166987dD.A0r(interfaceC09390do)).A0M(((C22F) AbstractC43593JPy.A0T(interfaceC09390do)).A04.A0L, "sound_sync_next");
        C54711OEn c54711OEn = c52134N5i.A09;
        if (c54711OEn == null) {
            C14360o3.A0F("videoPlayer");
            throw C00O.createAndThrow();
        }
        c54711OEn.A02.A05();
        C50870Me1 c50870Me1 = (C50870Me1) c52134N5i.A0E.getValue();
        C22C c22c = c50870Me1.A07;
        C448124l c448124l = c22c.A09;
        C25531Mh A0G = MSW.A0G(c448124l);
        if (AbstractC25226BEj.A1Z(A0G)) {
            A0G.A0s("IG_CAMERA_SUGGESTED_AUDIO_NEXT");
            MSZ.A1I(A0G, c448124l, "SUGGESTED_AUDIO_NEXT");
            AbstractC167007dF.A14(A0G, c448124l.A04);
            MSW.A1P(EnumC50631MWs.A0J, A0G);
            AbstractC167007dF.A13(A0G);
            A0G.A0c(AnonymousClass249.VIDEO);
            AbstractC167017dG.A1D(A0G);
        }
        c22c.A1a(C81X.A2N);
        C8JY c8jy = c50870Me1.A0C;
        c8jy.A02.flowMarkPoint(c8jy.A01, "SOUND_SYNC_NEXT_TAPPED");
        D51.A02(c50870Me1, AbstractC141776au.A00(c50870Me1), 44);
    }

    public static final void A02(C52134N5i c52134N5i) {
        InterfaceC09390do interfaceC09390do = c52134N5i.A0F;
        AbstractC183338Bg.A00(AbstractC166987dD.A0r(interfaceC09390do)).A0M(((C22F) AbstractC43593JPy.A0T(interfaceC09390do)).A04.A0L, "sound_sync_skip");
        C50870Me1 c50870Me1 = (C50870Me1) c52134N5i.A0E.getValue();
        C448124l c448124l = c50870Me1.A07.A09;
        C25531Mh A0G = MSW.A0G(c448124l);
        if (AbstractC25226BEj.A1Z(A0G)) {
            A0G.A0s("IG_CAMERA_SUGGESTED_AUDIO_SKIP");
            MSZ.A1I(A0G, c448124l, "SUGGESTED_AUDIO_SKIP");
            C22M c22m = c448124l.A04;
            A0G.A0b(c22m.A09);
            A0G.A0W(2);
            MSW.A1P(EnumC50631MWs.A0J, A0G);
            AbstractC167007dF.A13(A0G);
            A0G.A0V(MSZ.A05(c22m));
            A0G.A0c(AnonymousClass249.VIDEO);
            AbstractC167017dG.A1D(A0G);
        }
        C8JY c8jy = c50870Me1.A0C;
        c8jy.A02.flowMarkPoint(c8jy.A01, "SOUND_SYNC_SKIP_TAPPED");
        C50870Me1.A05(c50870Me1);
    }

    public static final void A03(C52134N5i c52134N5i, boolean z) {
        String str;
        ViewGroup viewGroup = c52134N5i.A01;
        if (viewGroup == null) {
            str = "rootView";
        } else {
            C12500ku c12500ku = new C12500ku(viewGroup);
            while (c12500ku.hasNext()) {
                View A0A = MSW.A0A(c12500ku);
                SoundSyncPreviewView soundSyncPreviewView = c52134N5i.A03;
                if (soundSyncPreviewView == null) {
                    str = "videoPreviewView";
                } else if (!C14360o3.A0K(A0A, soundSyncPreviewView)) {
                    A0A.setClickable(!z);
                    if (z) {
                        A0A.animate().alpha(0.2f).setDuration(900L).setInterpolator(new AccelerateInterpolator()).start();
                    } else {
                        A0A.setAlpha(1.0f);
                    }
                }
            }
            return;
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final boolean A04(C52134N5i c52134N5i) {
        InterfaceC09390do interfaceC09390do = c52134N5i.A0F;
        if (!C18U.A06(C06090Tz.A05, AbstractC31178DnM.A0M(interfaceC09390do), 36328946513756054L) && !C8SO.A00(AbstractC166987dD.A0r(interfaceC09390do))) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0F);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        EnumC53101NeE enumC53101NeE = this.A02;
        if (enumC53101NeE != null && enumC53101NeE == EnumC53101NeE.A06) {
            return true;
        }
        return ((C50870Me1) this.A0E.getValue()).onBackPressed();
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 9583) {
            if (i2 != 0) {
                if (i2 != 9683) {
                    if (i2 == 9685) {
                        C50870Me1 c50870Me1 = (C50870Me1) this.A0E.getValue();
                        c50870Me1.A0A.A00(C8XI.A06);
                        c50870Me1.onCleared();
                        return;
                    }
                    return;
                }
                requireActivity().setResult(i2);
                AbstractC25227BEk.A1B(this);
                return;
            }
            OX1 ox1 = ((C50870Me1) this.A0E.getValue()).A0H;
            AbstractC166997dE.A1Y(ox1.A0G, false);
            ox1.A0A.A0K.A06.A09(ox1.A03);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1515312077);
        super.onCreate(bundle);
        setModuleNameV2("clips_audition");
        C0f9.A09(731961406, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-450453857);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_clips_sound_sync_audition_fragment, viewGroup, false);
        C0f9.A09(1819065188, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        String str;
        int A02 = C0f9.A02(-1466391137);
        super.onDestroyView();
        C54711OEn c54711OEn = this.A09;
        if (c54711OEn == null) {
            str = "videoPlayer";
        } else {
            c54711OEn.A02.A07();
            FragmentActivity requireActivity = requireActivity();
            InterfaceC59892oW interfaceC59892oW = this.A08;
            if (interfaceC59892oW == null) {
                str = "windowInsetListener";
            } else {
                C57992lC.A02(requireActivity, interfaceC59892oW);
                C0f9.A09(354010970, A02);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-601629304);
        super.onPause();
        C54711OEn c54711OEn = this.A09;
        if (c54711OEn == null) {
            C14360o3.A0F("videoPlayer");
            throw C00O.createAndThrow();
        }
        c54711OEn.A02.A05();
        C0f9.A09(417585009, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(775035308);
        super.onResume();
        if (!((C56303OzO) ((N4X) this.A0D.getValue()).A04.getValue()).A00) {
            C54711OEn c54711OEn = this.A09;
            if (c54711OEn == null) {
                C14360o3.A0F("videoPlayer");
                throw C00O.createAndThrow();
            }
            c54711OEn.A02.A06();
        }
        C0f9.A09(-2093440348, A02);
    }
}
