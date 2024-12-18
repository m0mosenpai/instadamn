package X;

import android.content.Context;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.creation.capture.quickcapture.sundial.widget.filmstrip.ClipsTrimFilmstrip;

/* loaded from: classes8.dex */
public final class LIj {
    public int A01;
    public Surface A02;
    public C95334Qt A03;
    public boolean A04;
    public final int A05;
    public final TextureView A07;
    public final View A08;
    public final TextView A09;
    public final Fragment A0A;
    public final UserSession A0B;
    public final IgImageView A0C;
    public final ClipsTrimFilmstrip A0E;
    public final boolean A0G;
    public final boolean A0H;
    public final AbstractC46406KgS A0I;
    public final RunnableC24307AqC A0D = new RunnableC24307AqC(this);
    public final InterfaceC09390do A0F = AbstractC09440dt.A01(new MHQ(this, 29));
    public int A00 = Integer.MAX_VALUE;
    public final int A06 = 1000;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if (X.C14360o3.A0K(r1, "270") != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.LIj r7, java.lang.String r8, int r9, int r10) {
        /*
            r6 = r9
            android.view.TextureView r3 = r7.A07
            int r0 = r3.getWidth()
            if (r0 == 0) goto L4b
            int r0 = r3.getHeight()
            if (r0 == 0) goto L4b
            android.media.MediaMetadataRetriever r2 = new android.media.MediaMetadataRetriever
            r2.<init>()
            r2.setDataSource(r8)     // Catch: java.lang.IllegalArgumentException -> L3e java.lang.Throwable -> L46
            r0 = 24
            java.lang.String r1 = r2.extractMetadata(r0)     // Catch: java.lang.IllegalArgumentException -> L3e java.lang.Throwable -> L46
            java.lang.String r0 = "90"
            boolean r0 = X.C14360o3.A0K(r1, r0)     // Catch: java.lang.IllegalArgumentException -> L3e java.lang.Throwable -> L46
            if (r0 != 0) goto L2e
            java.lang.String r0 = "270"
            boolean r0 = X.C14360o3.A0K(r1, r0)     // Catch: java.lang.IllegalArgumentException -> L3e java.lang.Throwable -> L46
            r7 = r10
            if (r0 == 0) goto L30
        L2e:
            r7 = r9
            r6 = r10
        L30:
            int r4 = r3.getWidth()     // Catch: java.lang.IllegalArgumentException -> L3e java.lang.Throwable -> L46
            int r5 = r3.getHeight()     // Catch: java.lang.IllegalArgumentException -> L3e java.lang.Throwable -> L46
            r8 = 0
            r9 = r8
            X.AbstractC226849zg.A00(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.IllegalArgumentException -> L3e java.lang.Throwable -> L46
            goto L42
        L3e:
            r0 = move-exception
            r0.toString()     // Catch: java.lang.Throwable -> L46
        L42:
            r2.release()
            return
        L46:
            r0 = move-exception
            r2.release()
            throw r0
        L4b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LIj.A01(X.LIj, java.lang.String, int, int):void");
    }

    public static final void A00(LIj lIj) {
        TextView textView = lIj.A09;
        textView.setText(AbstractC31174DnI.A0t(lIj.A08.getContext(), 1, Integer.valueOf(lIj.A05), 2131957440));
        textView.setVisibility(0);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setStartOffset(3000L);
        alphaAnimation.setDuration(500L);
        alphaAnimation.setFillAfter(true);
        textView.startAnimation(alphaAnimation);
    }

    public final void A02(Medium medium, C55U c55u, boolean z) {
        boolean z2;
        TextureView textureView = this.A07;
        textureView.setSurfaceTextureListener(new LO7(this, medium.A0X, medium.A0B, medium.A04));
        Context context = this.A08.getContext();
        int A0E = AbstractC167017dG.A0E(context);
        textureView.setOutlineProvider(new C50796McD((int) (A0E * 1.5d), A0E));
        textureView.setClipToOutline(true);
        A01(this, medium.A0X, medium.A0B, medium.A04);
        UserSession userSession = this.A0B;
        C95334Qt c95334Qt = new C95334Qt(context, userSession, "video_trim");
        float f = 1.0f;
        if (z) {
            f = 0.0f;
        }
        c95334Qt.EhH(f);
        c95334Qt.A0M = new C4QU() { // from class: X.9qk
            @Override // X.C4QU, X.C4QV
            public final void D6i(InterfaceC95344Qu interfaceC95344Qu) {
                LIj lIj = LIj.this;
                C95334Qt c95334Qt2 = lIj.A03;
                if (c95334Qt2 != null) {
                    c95334Qt2.seekTo(lIj.A01);
                }
                C95334Qt c95334Qt3 = lIj.A03;
                if (c95334Qt3 != null) {
                    c95334Qt3.start();
                }
            }

            @Override // X.C4QU, X.C4QV
            public final void DaX(InterfaceC95344Qu interfaceC95344Qu, long j) {
                LIj lIj = LIj.this;
                lIj.A08.postOnAnimation(lIj.A0D);
            }
        };
        c95334Qt.ESy(medium.A02(), null, medium.A0Y, "VideoTrimUIController", true, false);
        Surface surface = this.A02;
        if (surface != null) {
            c95334Qt.setSurface(surface);
        }
        c95334Qt.E5Q(null, null);
        c95334Qt.seekTo(0);
        c95334Qt.start();
        this.A03 = c95334Qt;
        if (this.A0G || this.A0H) {
            boolean z3 = false;
            try {
                z2 = new C55773Oph(this.A0C.getContext(), false).AUI(medium.A02()).A0K;
                if (z2) {
                    ((C87H) this.A0F.getValue()).A01();
                }
            } catch (RuntimeException e) {
                AbstractC12120kG.A0E("VideoTrimUIController", AbstractC166997dE.A0y("Could not extract media metadata, media metadata is probably corrupt ", e), e);
                z2 = false;
            }
            IgImageView igImageView = this.A0C;
            igImageView.setVisibility(0);
            if (!C14360o3.A0K(c55u, C208509Kk.A00)) {
                z3 = z2;
            }
            igImageView.setActivated(z3);
            igImageView.setSelected(!z);
            ViewOnClickListenerC48066LPr.A00(igImageView, 25, c55u, this);
            igImageView.post(new M3D(this, AbstractC23021Ah.A00(userSession)));
        }
        AbstractC13880nE.A0q(this.A0E, new RunnableC24592Aun(medium, this));
        A00(this);
    }

    public LIj(View view, Fragment fragment, UserSession userSession, AbstractC46406KgS abstractC46406KgS, int i) {
        this.A0A = fragment;
        this.A0B = userSession;
        this.A08 = view;
        this.A05 = i;
        this.A0I = abstractC46406KgS;
        this.A07 = (TextureView) AbstractC166997dE.A0R(view, R.id.cutout_sticker_video_texture_view);
        this.A0C = AbstractC167007dF.A0T(view, R.id.audio_button);
        this.A0E = (ClipsTrimFilmstrip) AbstractC166997dE.A0R(view, R.id.cutout_sticker_video_trim_filmstrip);
        this.A09 = AbstractC167007dF.A0N(view, R.id.video_trim_instruction_text);
        this.A0G = abstractC46406KgS.equals(KNC.A00);
        this.A0H = abstractC46406KgS.equals(KND.A00);
    }
}
