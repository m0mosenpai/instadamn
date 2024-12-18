package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.api.schemas.ACRType;
import com.instagram.api.schemas.ClipsCameraCommandAction;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.capture.assetpicker.shareplatform.model.SharePlatformStickerClientModel;
import com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel;
import com.instagram.model.direct.camera.DirectCameraViewModel;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.InstagramAudioApplySource;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.reels.prompt.model.PromptStickerModel;
import com.instagram.reels.question.model.QuestionResponseReshareModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9LP, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9LP extends AbstractC59962oe implements InterfaceC60072op, InterfaceC25175BBx, InterfaceC53912dV, InterfaceC11210ic {
    public static final String __redex_internal_original_name = "ClipsCameraFragment";
    public C69613Av A01;
    public C81Y A02;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public EnumC33503Erc A07;
    public C24H A08;
    public C8JW A09;
    public JQS A0A;
    public ACRType A0B;
    public ClipsCameraCommandAction A0C;
    public C85B A0D;
    public InterfaceC110214xq A0F;
    public ImageUrl A0G;
    public TouchInterceptorFrameLayout A0H;
    public CropInfo A0I;
    public SharePlatformStickerClientModel A0K;
    public ReelsVisualRepliesModel A0L;
    public InterfaceC25214BDm A0M;
    public C81I A0N;
    public EnumC189548aZ A0P;
    public DirectCameraViewModel A0Q;
    public MusicAttributionConfig A0R;
    public AudioOverlayTrack A0S;
    public AudioOverlayTrack A0T;
    public InstagramAudioApplySource A0U;
    public PendingRecipient A0V;
    public PromptStickerModel A0W;
    public QuestionResponseReshareModel A0X;
    public C48672Ll A0Y;
    public Boolean A0Z;
    public String A0b;
    public String A0c;
    public String A0d;
    public String A0e;
    public String A0f;
    public String A0g;
    public String A0h;
    public String A0i;
    public String A0j;
    public String A0k;
    public String A0l;
    public String A0m;
    public String A0n;
    public String A0o;
    public String A0p;
    public String A0q;
    public String A0r;
    public String A0s;
    public String A0t;
    public String A0u;
    public String A0v;
    public String A0w;
    public String A0x;
    public String A0y;
    public String A0z;
    public String A10;
    public String A11;
    public String A12;
    public ArrayList A13;
    public ArrayList A14;
    public ArrayList A15;
    public ArrayList A16;
    public ArrayList A17;
    public ArrayList A18;
    public ArrayList A19;
    public ArrayList A1A;
    public List A1B;
    public List A1C;
    public List A1D;
    public java.util.Set A1E;
    public boolean A1F;
    public boolean A1G;
    public boolean A1H;
    public boolean A1I;
    public boolean A1J;
    public boolean A1K;
    public boolean A1L;
    public boolean A1M;
    public boolean A1N;
    public boolean A1O;
    public boolean A1P;
    public boolean A1Q;
    public boolean A1S;
    public boolean A1T;
    public boolean A1V;
    public boolean A1W;
    public boolean A1X;
    public final InterfaceC09390do A1Y = AbstractC09440dt.A01(new D88(this, 6));
    public C55U A0J = C81U.A00;
    public C22P A00 = C22P.A5N;
    public C5JK A0O = C5JK.A05;
    public EnumC185548Kw A0E = EnumC185548Kw.A05;
    public Integer A0a = C05F.A0C;
    public boolean A1R = true;
    public boolean A1U = true;
    public final InterfaceC09390do A1Z = AbstractC60492pY.A02(this);
    public String A03 = "clips_precapture_camera";

    /* JADX WARN: Code restructure failed: missing block: B:80:0x029f, code lost:
    
        if (r34.A0P == X.EnumC189548aZ.A06) goto L94;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A00(android.os.Bundle r35) {
        /*
            Method dump skipped, instructions count: 928
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9LP.A00(android.os.Bundle):void");
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        C14360o3.A0B(configuration, 0);
        super.onConfigurationChanged(configuration);
        Configuration configuration2 = AbstractC166997dE.A0N(this).getConfiguration();
        C14360o3.A07(configuration2);
        if (AbstractC68606VXh.A00(configuration2, configuration)) {
            AbstractC58002lE.A02();
        }
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        C8JU c8ju;
        C14360o3.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        C81Y c81y = this.A02;
        if (c81y != null && (c8ju = c81y.A00.A1i) != null) {
            c8ju.onSaveInstanceState(bundle);
        }
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A0H = (TouchInterceptorFrameLayout) view.findViewById(R.id.quick_capture_fragment_container);
        this.A1Q = true;
        if (!this.A1G) {
            A00(bundle);
        }
        if (AbstractC167007dF.A1Z(this.A1Y)) {
            C57982lB.A0B.A05(requireActivity(), new RunnableC24521Ate(view));
        }
    }

    @Override // X.InterfaceC25175BBx
    public final void DJ3(boolean z) {
        String str;
        if (z != this.A06) {
            this.A06 = z;
            if (z) {
                str = "clips_gallery";
            } else {
                str = "clips_precapture_camera";
            }
            this.A03 = str;
            updateModuleNameV2_USE_WITH_CAUTION(str);
            if (!this.A04) {
                this.A04 = true;
                C1KM.A04(this);
            }
            C1KM.A09.A0D(this);
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A03;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A1Z);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C81Y c81y = this.A02;
        if (c81y != null && c81y.A06()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0256, code lost:
    
        if (r0.ordinal() != 357) goto L49;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r14) {
        /*
            Method dump skipped, instructions count: 1333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9LP.onCreate(android.os.Bundle):void");
    }

    @Override // X.InterfaceC53912dV
    public final void DWU(C54822fg c54822fg) {
        C8XA c8xa;
        C8XB A00;
        int A0N = AbstractC167017dG.A0N(c54822fg, -2072973224);
        boolean A1N = AbstractC167007dF.A1N((c54822fg.A01 > (-1.0f) ? 1 : (c54822fg.A01 == (-1.0f) ? 0 : -1)));
        this.A1P = A1N;
        if (A1N && this.A1Q && this.A1G) {
            A00(null);
        } else if (isResumed() && !this.A1Q && AbstractC167007dF.A1Z(this.A1Y)) {
            float f = c54822fg.A01;
            C54132eL c54132eL = c54822fg.A04;
            C14360o3.A07(c54132eL);
            float A01 = c54132eL.A01(f);
            C81Y c81y = this.A02;
            if (c81y != null && (c8xa = c81y.A00.A17) != null && (A00 = c8xa.A00()) != null) {
                A00.A0A(C22P.A0Y, C05F.A0C, A01);
            }
        }
        C0f9.A0A(-1593727350, A0N);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10001 && i2 == -1) {
            InterfaceC25214BDm interfaceC25214BDm = this.A0M;
            if (interfaceC25214BDm == null) {
                C14360o3.A0F("quickCaptureEnvironment");
                throw C00O.createAndThrow();
            }
            interfaceC25214BDm.Cqz("media_posted_to_feed");
            requireActivity().setResult(9691);
            requireActivity().finish();
        }
        if (i == 1) {
            AbstractC167017dG.A19(this, i2, 9683);
        }
        if (this.A1T && i == 9583) {
            AbstractC167017dG.A19(this, i2, 9685);
        }
        if (this.A0Q != null && i == 9583) {
            AbstractC167017dG.A19(this, i2, 9683);
        }
        for (Fragment fragment : getChildFragmentManager().A0U.A04()) {
            if (fragment instanceof C52134N5i) {
                fragment.onActivityResult(i, i2, intent);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate;
        int A02 = C0f9.A02(-1611713665);
        C14360o3.A0B(layoutInflater, 0);
        if (AbstractC167007dF.A1Z(this.A1Y)) {
            inflate = C50802Vb.A01(layoutInflater, viewGroup, R.layout.layout_quick_capture_controller);
        } else {
            inflate = layoutInflater.inflate(R.layout.layout_clips_camera_fragment, viewGroup, false);
            C14360o3.A0A(inflate);
        }
        C0f9.A09(1816946506, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(1324736365);
        super.onDestroy();
        String str = this.A12;
        if (str != null && str.length() != 0) {
            UserSession A0r = AbstractC166987dD.A0r(this.A1Z);
            C14360o3.A0B(A0r, 0);
            C41711wL.A01(A0r).A0C(3);
        }
        C0f9.A09(-2046699586, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-201577490);
        super.onDestroyView();
        C81Y c81y = this.A02;
        if (c81y != null) {
            c81y.A00();
        }
        this.A02 = null;
        unregisterLifecycleListener(this.A0N);
        C81I c81i = this.A0N;
        if (c81i != null) {
            c81i.onDestroyView();
        }
        this.A0N = null;
        C0f9.A09(539345886, A02);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        if (r4.A1P != false) goto L9;
     */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() {
        /*
            r4 = this;
            r0 = -767761609(0xffffffffd23ce337, float:-2.0281647E11)
            int r3 = X.C0f9.A02(r0)
            super.onResume()
            X.JQS r2 = r4.A0A
            if (r2 != 0) goto L18
            java.lang.String r0 = "navigationPerfLogger"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L18:
            java.lang.String r1 = r4.A03
            java.lang.String r0 = "destination"
            r2.A0J(r0, r1)
            X.0do r0 = r4.A1Y
            boolean r0 = X.AbstractC167007dF.A1Z(r0)
            if (r0 != 0) goto L49
            android.app.Activity r1 = r4.getRootActivity()
            X.C14360o3.A0A(r1)
            X.0do r0 = r4.A1Z
            r0.getValue()
            X.AbstractC65987Txg.A00(r1)
        L36:
            boolean r0 = r4.A05
            if (r0 == 0) goto L42
            X.9OV r0 = new X.9OV
            r0.<init>(r4)
            X.AbstractC167007dF.A0z(r4, r0)
        L42:
            r0 = -1231035501(0xffffffffb69fe393, float:-4.7650624E-6)
            X.C0f9.A09(r0, r3)
            return
        L49:
            boolean r0 = r4.A1P
            if (r0 == 0) goto L42
            goto L36
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9LP.onResume():void");
    }
}
