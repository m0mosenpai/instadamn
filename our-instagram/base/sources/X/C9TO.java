package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.OrientationEventListener;
import android.view.ScaleGestureDetector;
import android.view.TextureView;
import android.view.ViewParent;
import android.view.WindowManager;
import java.util.Map;

/* renamed from: X.9TO */
/* loaded from: classes4.dex */
public final class C9TO extends TextureView implements TextureView.SurfaceTextureListener {
    public int A00;
    public int A01;
    public OrientationEventListener A02;
    public EnumC174667q0 A03;
    public EnumC174667q0 A04;
    public InterfaceC174637px A05;
    public C177447ue A06;
    public InterfaceC175017qb A07;
    public InterfaceC1814282u A08;
    public BB4 A09;
    public InterfaceC175497rP A0A;
    public String A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public int A0K;
    public int A0L;
    public TextureView.SurfaceTextureListener A0M;
    public InterfaceC174657pz A0N;
    public C8HT A0O;
    public final GestureDetector.SimpleOnGestureListener A0P;
    public final GestureDetector A0Q;
    public final ScaleGestureDetector.SimpleOnScaleGestureListener A0R;
    public final ScaleGestureDetector A0S;
    public final AbstractC184688Hj A0T;
    public final InterfaceC175067qg A0U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9TO(Context context) {
        super(context, null, 0);
        EnumC177227uI enumC177227uI;
        String simpleName = context.getClass().getSimpleName();
        this.A09 = null;
        this.A07 = null;
        this.A01 = 0;
        this.A00 = -1;
        this.A0J = true;
        this.A0G = true;
        this.A0C = true;
        this.A0T = new C212659bY(this, 2);
        C44406Jjj c44406Jjj = new C44406Jjj(this, 1);
        this.A0P = c44406Jjj;
        ScaleGestureDetector.SimpleOnScaleGestureListener simpleOnScaleGestureListener = new ScaleGestureDetector.SimpleOnScaleGestureListener() { // from class: X.9TM
            public float A00;
            public int A01;
            public int A02;
            public int A03;
            public Float A04;

            @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
            public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
                C9TO c9to = C9TO.this;
                InterfaceC175067qg interfaceC175067qg = c9to.A0U;
                if (!interfaceC175067qg.isConnected() || !c9to.A0E) {
                    return false;
                }
                if (!AbstractC167007dF.A1S(AbstractC176767tY.A0f, interfaceC175067qg.AlU())) {
                    return false;
                }
                float currentSpan = (scaleGestureDetector.getCurrentSpan() - this.A00) / AbstractC166987dD.A07(c9to);
                Float f = this.A04;
                if (f != null) {
                    interfaceC175067qg.EmH(null, Math.min(1.0f, Math.max(-1.0f, (currentSpan * 2.0f) + f.floatValue())));
                } else {
                    interfaceC175067qg.EhW(null, Math.min(this.A02, Math.max(this.A03, ((int) (currentSpan * (r3 - r2))) + this.A01)));
                }
                return true;
            }

            @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
            public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
                C9TO c9to = C9TO.this;
                InterfaceC175067qg interfaceC175067qg = c9to.A0U;
                boolean z = false;
                if (interfaceC175067qg.isConnected() && c9to.A0E) {
                    if (AbstractC167007dF.A1S(AbstractC176767tY.A0f, interfaceC175067qg.AlU())) {
                        ViewParent parent = c9to.getParent();
                        z = true;
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                        this.A01 = AbstractC167017dG.A0H(AbstractC176797tb.A11, interfaceC175067qg.Bty());
                        if (AbstractC167007dF.A1S(AbstractC176767tY.A0U, interfaceC175067qg.AlU())) {
                            this.A04 = (Float) interfaceC175067qg.Bty().A02(AbstractC176797tb.A0t);
                        }
                        this.A02 = AbstractC166987dD.A0H(interfaceC175067qg.AlU().A01(AbstractC176767tY.A0j));
                        this.A03 = AbstractC166987dD.A0H(interfaceC175067qg.AlU().A01(AbstractC176767tY.A0l));
                        this.A00 = scaleGestureDetector.getCurrentSpan();
                    }
                }
                return z;
            }

            @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
            public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            }
        };
        this.A0R = simpleOnScaleGestureListener;
        this.A0B = simpleName;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, A3L.A00, 0, 0);
        try {
            int i = obtainStyledAttributes.getInt(4, 1);
            if (i != 1 && i == 2) {
                enumC177227uI = EnumC177227uI.CAMERA2;
            } else {
                enumC177227uI = EnumC177227uI.CAMERA1;
            }
            int i2 = obtainStyledAttributes.getInt(6, 0);
            for (EnumC174667q0 enumC174667q0 : EnumC174667q0.values()) {
                if (enumC174667q0.A00 == i2) {
                    this.A04 = enumC174667q0;
                    int i3 = obtainStyledAttributes.getInt(3, 0);
                    for (EnumC174667q0 enumC174667q02 : EnumC174667q0.values()) {
                        if (enumC174667q02.A00 == i3) {
                            this.A03 = enumC174667q02;
                            this.A0E = obtainStyledAttributes.getBoolean(0, true);
                            setInitialCameraFacing(obtainStyledAttributes.getInt(1, 0));
                            int i4 = obtainStyledAttributes.getInt(5, 3);
                            this.A0H = AbstractC167007dF.A1P(i4 & 1, 1);
                            this.A0I = (i4 & 2) == 2;
                            boolean z = obtainStyledAttributes.getBoolean(2, false);
                            obtainStyledAttributes.recycle();
                            this.A0U = AbstractC175047qe.A00(getContext(), null, enumC177227uI, false);
                            setMediaOrientationLocked(z);
                            super.setSurfaceTextureListener(this);
                            this.A0Q = new GestureDetector(context, c44406Jjj);
                            this.A0S = new ScaleGestureDetector(context, simpleOnScaleGestureListener);
                            return;
                        }
                    }
                    throw new IllegalArgumentException();
                }
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void A03() {
        this.A0D = true;
        this.A0F = false;
        OrientationEventListener orientationEventListener = this.A02;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
        }
        InterfaceC175067qg interfaceC175067qg = this.A0U;
        interfaceC175067qg.ECd("onPause", this);
        interfaceC175067qg.APd(new C212659bY(this, 3));
    }

    public final void A04(InterfaceC196578mn interfaceC196578mn) {
        C196548mk c196548mk = new C196548mk();
        c196548mk.A01(C196548mk.A09, new Rect(0, 0, getWidth(), getHeight()));
        c196548mk.A01(C196548mk.A05, false);
        c196548mk.A01(C196548mk.A08, true);
        this.A0U.Epu(new C23458AaV(interfaceC196578mn, this), c196548mk);
    }

    public static void A01(C177447ue c177447ue, C9TO c9to, int i, int i2) {
        AbstractC176797tb abstractC176797tb = c177447ue.A03;
        C176877tj c176877tj = (C176877tj) abstractC176797tb.A02(AbstractC176797tb.A0q);
        if (c176877tj != null) {
            int i3 = c176877tj.A02;
            int i4 = c176877tj.A01;
            Matrix transform = c9to.getTransform(AbstractC166987dD.A0Q());
            InterfaceC175067qg interfaceC175067qg = c9to.A0U;
            if (interfaceC175067qg.Ehu(transform, i, i2, i3, i4, c9to.A0C)) {
                if (c9to.A0J) {
                    c9to.setTransform(transform);
                }
                interfaceC175067qg.CO9(transform, c9to.getWidth(), c9to.getHeight(), c177447ue.A01);
                if (c9to.A0G) {
                    c9to.A0F = true;
                    return;
                }
                return;
            }
            throw AbstractC166987dD.A18("CameraService doesn't support setting up preview matrix.");
        }
        throw AbstractC166987dD.A18(AnonymousClass001.A0R("Cannot get preview size, maybe camera was never initialised.\n characteristics.settings=\n", (String) abstractC176797tb.A02(AbstractC176797tb.A0u)));
    }

    public static void A02(C9TO c9to) {
        InterfaceC175067qg interfaceC175067qg = c9to.A0U;
        interfaceC175067qg.ECd("initialise", c9to);
        String str = c9to.A0B;
        int i = c9to.A01;
        InterfaceC174657pz runtimeParameters = c9to.getRuntimeParameters();
        int i2 = c9to.A0L;
        C176577tF c176577tF = new C176577tF(c9to.getSurfacePipeCoordinator(), null, c9to.A0K, i2);
        int displayRotation = c9to.getDisplayRotation();
        interfaceC175067qg.AJR(null, c9to.A0T, runtimeParameters, c9to.A07, c176577tF, str, i, displayRotation);
        c9to.getSurfacePipeCoordinator().Dic(c9to.getSurfaceTexture(), c9to.A0L, c9to.A0K);
    }

    private EnumC174667q0 getPhotoCaptureQuality() {
        EnumC174667q0 enumC174667q0 = this.A03;
        if (enumC174667q0 == null) {
            return EnumC174667q0.HIGH;
        }
        return enumC174667q0;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.7q2] */
    private InterfaceC174657pz getRuntimeParameters() {
        InterfaceC174657pz interfaceC174657pz = this.A0N;
        if (interfaceC174657pz == null) {
            Map map = C174647py.A01;
            return new C174647py(new Object(), getPhotoCaptureQuality(), getVideoCaptureQuality(), getSizeSetter(), false, false, false);
        }
        return interfaceC174657pz;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.7px, java.lang.Object] */
    private InterfaceC174637px getSizeSetter() {
        InterfaceC174637px interfaceC174637px = this.A05;
        if (interfaceC174637px == null) {
            return new Object();
        }
        return interfaceC174637px;
    }

    private InterfaceC175497rP getSurfacePipeCoordinator() {
        InterfaceC175497rP interfaceC175497rP = this.A0A;
        if (interfaceC175497rP == null) {
            C23462AaZ c23462AaZ = new C23462AaZ(getSurfaceTexture());
            this.A0A = c23462AaZ;
            return c23462AaZ;
        }
        return interfaceC175497rP;
    }

    private EnumC174667q0 getVideoCaptureQuality() {
        EnumC174667q0 enumC174667q0 = this.A04;
        if (enumC174667q0 == null) {
            return EnumC174667q0.HIGH;
        }
        return enumC174667q0;
    }

    public void setCameraDeviceRotation(C177447ue c177447ue) {
        InterfaceC175067qg interfaceC175067qg = this.A0U;
        if (interfaceC175067qg.isConnected()) {
            int displayRotation = getDisplayRotation();
            if (this.A00 == displayRotation) {
                if (c177447ue != null && c177447ue.A03.A02(AbstractC176797tb.A0q) != null) {
                    A01(c177447ue, this, getWidth(), getHeight());
                    return;
                }
                return;
            }
            this.A00 = displayRotation;
            interfaceC175067qg.EbM(new C212659bY(this, 4), displayRotation);
        }
    }

    public InterfaceC175067qg getCameraService() {
        return this.A0U;
    }

    @Override // android.view.TextureView
    public TextureView.SurfaceTextureListener getSurfaceTextureListener() {
        return this.A0M;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.A0L = i;
        this.A0K = i2;
        if (!this.A0D) {
            A02(this);
        }
        TextureView.SurfaceTextureListener surfaceTextureListener = this.A0M;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureAvailable(surfaceTexture, i, i2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        OrientationEventListener orientationEventListener = this.A02;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
        }
        this.A0F = false;
        InterfaceC175067qg interfaceC175067qg = this.A0U;
        interfaceC175067qg.ECd("onSurfaceTextureDestroyed", this);
        interfaceC175067qg.APd(new C212669bZ(0, surfaceTexture, this));
        TextureView.SurfaceTextureListener surfaceTextureListener = this.A0M;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureDestroyed(surfaceTexture);
        }
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.A0L = i;
        this.A0K = i2;
        if (!this.A0D) {
            getSurfacePipeCoordinator().Dib(i, i2);
            setCameraDeviceRotation(this.A06);
        }
        TextureView.SurfaceTextureListener surfaceTextureListener = this.A0M;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        C8HT c8ht = this.A0O;
        if (c8ht != null) {
            c8ht.DrO();
            this.A0O = null;
        }
        this.A0U.CtC();
        C196998nU.A00().A03();
    }

    public void setDoubleTapToZoomEnabled(boolean z) {
        this.A0S.setQuickScaleEnabled(z);
    }

    public void setInitialCameraFacing(int i) {
        this.A01 = i;
        AbstractC175037qd.A01("CameraPreviewView", AnonymousClass001.A0O("Initial camera facing set to: ", i));
    }

    public void setMediaOrientationLocked(boolean z) {
        this.A0U.EYx(z);
    }

    public void setOnInitialisedListener(InterfaceC1814282u interfaceC1814282u) {
        if (interfaceC1814282u != null && this.A06 != null && this.A0U.isConnected()) {
            interfaceC1814282u.DM7(this.A06);
        }
        this.A08 = interfaceC1814282u;
    }

    private int getDisplayRotation() {
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        if (windowManager != null) {
            return windowManager.getDefaultDisplay().getRotation();
        }
        return 0;
    }

    private Activity getParentActivity() {
        Context baseContext;
        Context context = getContext();
        while (!(context instanceof Activity)) {
            if (!(context instanceof ContextWrapper) || context == (baseContext = ((ContextWrapper) context).getBaseContext())) {
                return null;
            }
            context = baseContext;
        }
        return (Activity) context;
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(-1124652081);
        super.onAttachedToWindow();
        C0f9.A0D(574050395, A06);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setCameraDeviceRotation(this.A06);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(1122086947);
        super.onDetachedFromWindow();
        OrientationEventListener orientationEventListener = this.A02;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
        }
        this.A08 = null;
        C0f9.A0D(-1972273118, A06);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int A05 = C0f9.A05(2112489534);
        boolean z = false;
        if (this.A0F && this.A0U.isConnected()) {
            boolean onTouchEvent = this.A0Q.onTouchEvent(motionEvent);
            boolean onTouchEvent2 = this.A0S.onTouchEvent(motionEvent);
            if (onTouchEvent || onTouchEvent2) {
                z = true;
            }
            i = 1333841855;
        } else {
            i = 1507126315;
        }
        C0f9.A0C(i, A05);
        return z;
    }

    public void setCameraEventLogger(InterfaceC175017qb interfaceC175017qb) {
        this.A07 = interfaceC175017qb;
    }

    public void setCropEnabled(boolean z) {
        this.A0C = z;
    }

    public void setOnSurfaceTextureUpdatedListener(C8HT c8ht) {
        this.A0O = c8ht;
    }

    public void setPhotoCaptureQuality(EnumC174667q0 enumC174667q0) {
        this.A03 = enumC174667q0;
    }

    public void setPinchZoomEnabled(boolean z) {
        this.A0E = z;
    }

    public void setPinchZoomListener(BB4 bb4) {
        this.A09 = bb4;
    }

    public void setProductName(String str) {
        this.A0B = str;
    }

    public void setRuntimeParameters(InterfaceC174657pz interfaceC174657pz) {
        this.A0N = interfaceC174657pz;
    }

    public void setSingleTapFocusEnabled(boolean z) {
        this.A0H = z;
    }

    public void setSingleTapMeteringEnabled(boolean z) {
        this.A0I = z;
    }

    public void setSizeSetter(InterfaceC174637px interfaceC174637px) {
        this.A05 = interfaceC174637px;
    }

    public void setSurfacePipeCoordinator(InterfaceC175497rP interfaceC175497rP) {
        this.A0A = interfaceC175497rP;
    }

    @Override // android.view.TextureView
    public void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        this.A0M = surfaceTextureListener;
    }

    public void setTransformMatrixEnabled(boolean z) {
        this.A0J = z;
    }

    public void setVideoCaptureQuality(EnumC174667q0 enumC174667q0) {
        this.A04 = enumC174667q0;
    }

    public static /* synthetic */ void A00(C177447ue c177447ue, C9TO c9to) {
        c9to.setCameraDeviceRotation(c177447ue);
    }
}
