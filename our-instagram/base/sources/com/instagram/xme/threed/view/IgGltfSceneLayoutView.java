package com.instagram.xme.threed.view;

import X.AbstractC23641Du;
import X.AbstractC55832hO;
import X.AbstractC57302k5;
import X.AnonymousClass191;
import X.B5a;
import X.C05A;
import X.C05F;
import X.C07X;
import X.C0f9;
import X.C0fX;
import X.C10E;
import X.C141826az;
import X.C14360o3;
import X.C149286nd;
import X.C56825PJv;
import X.C57157PZb;
import X.C57312k6;
import X.C57493PfT;
import X.C6Z6;
import X.InterfaceC11380iw;
import X.InterfaceC23621Ds;
import X.InterfaceC57887Plr;
import X.InterfaceC59142nF;
import X.TextureViewSurfaceTextureListenerC149336nj;
import X.U9K;
import X.VBo;
import X.ViewOnAttachStateChangeListenerC55360OiM;
import X.WIR;
import X.YN9;
import android.content.Context;
import android.hardware.SensorManager;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import com.instagram.xme.threed.repository.Xme3dMediaRepository;

/* loaded from: classes3.dex */
public final class IgGltfSceneLayoutView extends IgFrameLayout {
    public RoundedCornerFrameLayout A00;
    public InterfaceC57887Plr A01;
    public C56825PJv A02;
    public IgGltfSceneTextureView A03;
    public Integer A04;
    public C05A A05;
    public IgImageView A06;
    public SpinnerImageView A07;
    public YN9 A08;
    public Integer A09;
    public final Object A0A;
    public final C149286nd A0B;
    public final Object A0C;
    public static final InterfaceC59142nF A0E = C141826az.A00;
    public static final InterfaceC11380iw A0D = new InterfaceC11380iw() { // from class: X.6b0
        public static final String __redex_internal_original_name = "IgGltfSceneLayoutView$Companion$module$1";

        @Override // X.InterfaceC11380iw
        public final String getModuleName() {
            return "IgGltfSceneLayoutView";
        }
    };

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgGltfSceneLayoutView(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
        this.A0B = new C149286nd(this);
        this.A0C = new Object();
        this.A0A = new Object();
        this.A05 = C10E.A00(null);
        Integer num = C05F.A00;
        this.A09 = num;
        this.A04 = num;
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.ig_gltf_scene_layout, this);
        this.A00 = (RoundedCornerFrameLayout) requireViewById(R.id.rounded_corner_layout);
        this.A03 = (IgGltfSceneTextureView) requireViewById(R.id.scene_tex_view);
        IgImageView igImageView = (IgImageView) inflate.findViewById(R.id.preview_image);
        this.A06 = igImageView;
        igImageView.setImageRendererAndReset(A0E);
        this.A07 = (SpinnerImageView) inflate.findViewById(R.id.loading_spinner);
        setCornerRadius(0);
        A00(this, this.A09);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008a, code lost:
    
        if (r6 != X.C05F.A0C) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final synchronized void A00(com.instagram.xme.threed.view.IgGltfSceneLayoutView r5, java.lang.Integer r6) {
        /*
            monitor-enter(r5)
            java.lang.Integer r0 = r5.A09     // Catch: java.lang.Throwable -> L8e
            if (r6 == r0) goto L8c
            r5.A09 = r6     // Catch: java.lang.Throwable -> L8e
            int r2 = r6.intValue()     // Catch: java.lang.Throwable -> L8e
            r3 = 0
            r1 = 0
            r4 = 8
            if (r2 == r3) goto L40
            r0 = 1
            if (r2 == r0) goto L30
            r0 = 2
            if (r2 == r0) goto L50
            r0 = 3
            if (r2 != r0) goto L2a
            com.instagram.xme.threed.view.IgGltfSceneTextureView r0 = r5.A03     // Catch: java.lang.Throwable -> L8e
            r0.setAlpha(r1)     // Catch: java.lang.Throwable -> L8e
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r5.A06     // Catch: java.lang.Throwable -> L8e
            r0.setVisibility(r4)     // Catch: java.lang.Throwable -> L8e
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r5.A07     // Catch: java.lang.Throwable -> L8e
            r0.setVisibility(r4)     // Catch: java.lang.Throwable -> L8e
            goto L61
        L2a:
            X.B4Z r0 = new X.B4Z     // Catch: java.lang.Throwable -> L8e
            r0.<init>()     // Catch: java.lang.Throwable -> L8e
            throw r0     // Catch: java.lang.Throwable -> L8e
        L30:
            com.instagram.xme.threed.view.IgGltfSceneTextureView r0 = r5.A03     // Catch: java.lang.Throwable -> L8e
            r0.setAlpha(r1)     // Catch: java.lang.Throwable -> L8e
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r5.A06     // Catch: java.lang.Throwable -> L8e
            r0.setVisibility(r3)     // Catch: java.lang.Throwable -> L8e
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r5.A07     // Catch: java.lang.Throwable -> L8e
            r0.setVisibility(r3)     // Catch: java.lang.Throwable -> L8e
            goto L61
        L40:
            com.instagram.xme.threed.view.IgGltfSceneTextureView r0 = r5.A03     // Catch: java.lang.Throwable -> L8e
            r0.setAlpha(r1)     // Catch: java.lang.Throwable -> L8e
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r5.A06     // Catch: java.lang.Throwable -> L8e
            r0.setVisibility(r4)     // Catch: java.lang.Throwable -> L8e
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r5.A07     // Catch: java.lang.Throwable -> L8e
            r0.setVisibility(r4)     // Catch: java.lang.Throwable -> L8e
            goto L61
        L50:
            com.instagram.xme.threed.view.IgGltfSceneTextureView r1 = r5.A03     // Catch: java.lang.Throwable -> L8e
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r0)     // Catch: java.lang.Throwable -> L8e
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r5.A06     // Catch: java.lang.Throwable -> L8e
            r0.setVisibility(r4)     // Catch: java.lang.Throwable -> L8e
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r5.A07     // Catch: java.lang.Throwable -> L8e
            r0.setVisibility(r4)     // Catch: java.lang.Throwable -> L8e
        L61:
            X.Plr r2 = r5.A01     // Catch: java.lang.Throwable -> L8e
            if (r2 == 0) goto L8c
            X.PJw r2 = (X.C56826PJw) r2     // Catch: java.lang.Throwable -> L8e
            java.lang.Integer r0 = X.C05F.A0N     // Catch: java.lang.Throwable -> L8e
            if (r6 != r0) goto L88
            X.6du r1 = r2.A00     // Catch: java.lang.Throwable -> L8e
            com.instagram.feed.widget.IgProgressImageView r0 = r1.BGy()     // Catch: java.lang.Throwable -> L8e
            r0.setVisibility(r3)     // Catch: java.lang.Throwable -> L8e
            com.instagram.xme.threed.view.IgGltfSceneLayoutView r0 = r1.A1s     // Catch: java.lang.Throwable -> L8e
            r0.setVisibility(r4)     // Catch: java.lang.Throwable -> L8e
        L79:
            X.O8Y r0 = r2.A01     // Catch: java.lang.Throwable -> L8e
            X.6hX r1 = r0.A01     // Catch: java.lang.Throwable -> L8e
            if (r1 == 0) goto L8c
            r0 = 1
            r1.A00 = r0     // Catch: java.lang.Throwable -> L8e
            instagram.features.stories.fragment.ReelViewerFragment r0 = r1.A01     // Catch: java.lang.Throwable -> L8e
            instagram.features.stories.fragment.ReelViewerFragment.A0I(r0, r3)     // Catch: java.lang.Throwable -> L8e
            goto L8c
        L88:
            java.lang.Integer r0 = X.C05F.A0C     // Catch: java.lang.Throwable -> L8e
            if (r6 == r0) goto L79
        L8c:
            monitor-exit(r5)
            return
        L8e:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.xme.threed.view.IgGltfSceneLayoutView.A00(com.instagram.xme.threed.view.IgGltfSceneLayoutView, java.lang.Integer):void");
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public final void setUrl(String str, UserSession userSession, C6Z6 c6z6) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(c6z6, 2);
        C05A c05a = this.A05;
        if (!C14360o3.A0K(str, c05a.getValue())) {
            C56825PJv c56825PJv = new C56825PJv(userSession, c6z6);
            this.A02 = c56825PJv;
            this.A03.setErrorReportCallback(c56825PJv);
            Xme3dMediaRepository xme3dMediaRepository = (Xme3dMediaRepository) userSession.A01(Xme3dMediaRepository.class, C57493PfT.A00);
            if (isAttachedToWindow()) {
                C07X A00 = AbstractC55832hO.A00(this);
                if (A00 != null) {
                    C57312k6 A002 = AbstractC57302k5.A00(A00.getLifecycle());
                    AbstractC23641Du.A05(AnonymousClass191.A00, new C57157PZb(xme3dMediaRepository, this, (InterfaceC23621Ds) null, 37), A002);
                }
                C07X A003 = AbstractC55832hO.A00(this);
                if (A003 != null) {
                    C57312k6 A004 = AbstractC57302k5.A00(A003.getLifecycle());
                    AbstractC23641Du.A05(AnonymousClass191.A00, new B5a(userSession, xme3dMediaRepository, c6z6, this, null, 2), A004);
                }
            } else {
                addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC55360OiM(this, userSession, c6z6, xme3dMediaRepository, this));
            }
            c05a.Egh(str);
        }
    }

    public static final void A01(IgGltfSceneLayoutView igGltfSceneLayoutView, String str) {
        Handler handler;
        synchronized (igGltfSceneLayoutView.A0C) {
            TextureViewSurfaceTextureListenerC149336nj textureViewSurfaceTextureListenerC149336nj = igGltfSceneLayoutView.A03.A03;
            if (C14360o3.A0K(textureViewSurfaceTextureListenerC149336nj.A0B, str) && igGltfSceneLayoutView.A04 == C05F.A01) {
                A00(igGltfSceneLayoutView, C05F.A0C);
            } else {
                Integer num = C05F.A00;
                if (num != igGltfSceneLayoutView.A04) {
                    A00(igGltfSceneLayoutView, C05F.A01);
                }
                igGltfSceneLayoutView.A04 = num;
                textureViewSurfaceTextureListenerC149336nj.A08 = num;
            }
            if (!C14360o3.A0K(textureViewSurfaceTextureListenerC149336nj.A0B, str)) {
                textureViewSurfaceTextureListenerC149336nj.A0B = null;
                textureViewSurfaceTextureListenerC149336nj.A0A = null;
                VBo vBo = textureViewSurfaceTextureListenerC149336nj.A04;
                if (vBo != null && (handler = ((U9K) vBo).A02) != null) {
                    handler.sendEmptyMessage(7);
                }
            }
            textureViewSurfaceTextureListenerC149336nj.A00();
            C149286nd c149286nd = igGltfSceneLayoutView.A0B;
            C14360o3.A0B(c149286nd, 0);
            textureViewSurfaceTextureListenerC149336nj.A06 = c149286nd;
            Integer num2 = C05F.A00;
            synchronized (igGltfSceneLayoutView.A0A) {
                boolean z = !C14360o3.A0K(textureViewSurfaceTextureListenerC149336nj.A09, str);
                textureViewSurfaceTextureListenerC149336nj.A09 = str;
                textureViewSurfaceTextureListenerC149336nj.A07 = num2;
                textureViewSurfaceTextureListenerC149336nj.A0B = str;
                if (z) {
                    textureViewSurfaceTextureListenerC149336nj.A03.A03 = false;
                }
                VBo vBo2 = textureViewSurfaceTextureListenerC149336nj.A04;
                if (vBo2 != null) {
                    Handler handler2 = ((U9K) vBo2).A02;
                    if (handler2 == null) {
                        TextureViewSurfaceTextureListenerC149336nj textureViewSurfaceTextureListenerC149336nj2 = (TextureViewSurfaceTextureListenerC149336nj) vBo2.A02.get();
                        if (textureViewSurfaceTextureListenerC149336nj2 != null) {
                            textureViewSurfaceTextureListenerC149336nj2.A0D = true;
                        }
                    } else {
                        handler2.sendEmptyMessage(9);
                    }
                } else {
                    textureViewSurfaceTextureListenerC149336nj.A0D = true;
                }
            }
        }
    }

    private final TextureViewSurfaceTextureListenerC149336nj getGltfSceneRenderTarget() {
        return this.A03.A03;
    }

    public static /* synthetic */ void setUrl$default(IgGltfSceneLayoutView igGltfSceneLayoutView, String str, UserSession userSession, C6Z6 c6z6, int i, Object obj) {
        if ((i & 4) != 0) {
            c6z6 = C6Z6.A03;
        }
        igGltfSceneLayoutView.setUrl(str, userSession, c6z6);
    }

    public final YN9 getGltfSceneLoadedListener() {
        return null;
    }

    public final InterfaceC57887Plr getSceneLayoutStateListener() {
        return this.A01;
    }

    public final void setCornerRadius(int i) {
        this.A00.setCornerRadius(i);
    }

    public final void setPreviewUrl(ImageUrl imageUrl) {
        if (imageUrl == null) {
            this.A06.A09();
        } else {
            this.A06.setUrl(imageUrl, A0D);
        }
    }

    public final void setRenderingEnabled(boolean z) {
        TextureViewSurfaceTextureListenerC149336nj textureViewSurfaceTextureListenerC149336nj = this.A03.A03;
        VBo vBo = textureViewSurfaceTextureListenerC149336nj.A04;
        if (z) {
            if (vBo != null) {
                vBo.A01();
            }
        } else if (vBo != null) {
            vBo.A0H = true;
            WIR wir = vBo.A0E;
            SensorManager sensorManager = wir.A01;
            if (sensorManager != null) {
                C0fX.A00(wir, sensorManager);
            }
        }
        textureViewSurfaceTextureListenerC149336nj.A0E = z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        Handler handler;
        int A06 = C0f9.A06(-1614890271);
        super.onAttachedToWindow();
        IgGltfSceneTextureView igGltfSceneTextureView = this.A03;
        TextureViewSurfaceTextureListenerC149336nj textureViewSurfaceTextureListenerC149336nj = igGltfSceneTextureView.A03;
        String str = textureViewSurfaceTextureListenerC149336nj.A0B;
        if (str != null) {
            textureViewSurfaceTextureListenerC149336nj.A0B = null;
            textureViewSurfaceTextureListenerC149336nj.A0A = null;
            VBo vBo = textureViewSurfaceTextureListenerC149336nj.A04;
            if (vBo != null && (handler = ((U9K) vBo).A02) != null) {
                handler.sendEmptyMessage(7);
            }
            A01(this, str);
            setRenderingEnabled(true);
            igGltfSceneTextureView.A00();
        }
        C0f9.A0D(-2112102913, A06);
    }

    public final void setGltfSceneLoadedListener(YN9 yn9) {
        this.A08 = yn9;
    }

    public final void setSceneLayoutStateListener(InterfaceC57887Plr interfaceC57887Plr) {
        this.A01 = interfaceC57887Plr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgGltfSceneLayoutView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        C14360o3.A0B(attributeSet, 2);
        this.A0B = new C149286nd(this);
        this.A0C = new Object();
        this.A0A = new Object();
        this.A05 = C10E.A00(null);
        Integer num = C05F.A00;
        this.A09 = num;
        this.A04 = num;
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.ig_gltf_scene_layout, this);
        this.A00 = (RoundedCornerFrameLayout) requireViewById(R.id.rounded_corner_layout);
        this.A03 = (IgGltfSceneTextureView) requireViewById(R.id.scene_tex_view);
        IgImageView igImageView = (IgImageView) inflate.findViewById(R.id.preview_image);
        this.A06 = igImageView;
        igImageView.setImageRendererAndReset(A0E);
        this.A07 = (SpinnerImageView) inflate.findViewById(R.id.loading_spinner);
        setCornerRadius(0);
        A00(this, this.A09);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgGltfSceneLayoutView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        C14360o3.A0B(attributeSet, 2);
        this.A0B = new C149286nd(this);
        this.A0C = new Object();
        this.A0A = new Object();
        this.A05 = C10E.A00(null);
        Integer num = C05F.A00;
        this.A09 = num;
        this.A04 = num;
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.ig_gltf_scene_layout, this);
        this.A00 = (RoundedCornerFrameLayout) requireViewById(R.id.rounded_corner_layout);
        this.A03 = (IgGltfSceneTextureView) requireViewById(R.id.scene_tex_view);
        IgImageView igImageView = (IgImageView) inflate.findViewById(R.id.preview_image);
        this.A06 = igImageView;
        igImageView.setImageRendererAndReset(A0E);
        this.A07 = (SpinnerImageView) inflate.findViewById(R.id.loading_spinner);
        setCornerRadius(0);
        A00(this, this.A09);
    }
}
