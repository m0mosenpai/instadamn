package com.instagram.common.ui.widget.imageview;

import X.AbstractC001900j;
import X.AbstractC116025Nf;
import X.AbstractC12990ll;
import X.AbstractC13670mt;
import X.AbstractC55922hc;
import X.AbstractC56872jL;
import X.AbstractC81033jX;
import X.C0f9;
import X.C0fK;
import X.C0fO;
import X.C14360o3;
import X.C18C;
import X.C19270xB;
import X.C1NJ;
import X.C1OG;
import X.C1WS;
import X.C1WW;
import X.C1WX;
import X.C1X4;
import X.C25761Ni;
import X.C25821No;
import X.C27451Uy;
import X.C27771Wf;
import X.C27811Wj;
import X.C3X3;
import X.C3X6;
import X.C3X8;
import X.C59182nJ;
import X.C5G0;
import X.C5GF;
import X.C72133Lm;
import X.C73083Pj;
import X.C80673iw;
import X.InterfaceC09390do;
import X.InterfaceC11380iw;
import X.InterfaceC114695Fz;
import X.InterfaceC177347uU;
import X.InterfaceC27851Wn;
import X.InterfaceC43471zH;
import X.InterfaceC58852mj;
import X.InterfaceC58872ml;
import X.InterfaceC58912mp;
import X.InterfaceC59142nF;
import X.InterfaceC59152nG;
import X.InterfaceC59502nt;
import X.InterfaceC65702y7;
import X.InterfaceC73023Pd;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.facebook.R;
import com.facebook.systrace.Systrace;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.debug.devoptions.apiperf.ImagePerformanceProvider;
import com.instagram.feed.widget.IgProgressImageView;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class IgImageView extends ImageView {
    public static InterfaceC114695Fz A0b;
    public static C5G0 A0c;
    public static InterfaceC43471zH A0d = InterfaceC43471zH.A01;
    public static ImagePerformanceProvider A0e;
    public static C27451Uy A0f;
    public static boolean A0g;
    public static boolean A0h;
    public static boolean A0i;
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public Bitmap A06;
    public InterfaceC11380iw A07;
    public InterfaceC59502nt A08;
    public InterfaceC59502nt A09;
    public C80673iw A0A;
    public C5GF A0B;
    public ImageUrl A0C;
    public InterfaceC73023Pd A0D;
    public InterfaceC73023Pd A0E;
    public C3X8 A0F;
    public C3X3 A0G;
    public C3X6 A0H;
    public InterfaceC59152nG A0I;
    public String A0J;
    public String A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public Drawable A0Q;
    public AbstractC12990ll A0R;
    public InterfaceC177347uU A0S;
    public C1WW A0T;
    public boolean A0U;
    public final C1NJ A0V;
    public final C1NJ A0W;
    public final InterfaceC58852mj A0X;
    public final InterfaceC58872ml A0Y;
    public final InterfaceC58912mp A0Z;
    public final AtomicInteger A0a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgImageView(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
        this.A03 = 1;
        this.A00 = -1.0f;
        this.A05 = -1L;
        this.A0T = C1WW.A05;
        this.A0a = new AtomicInteger(0);
        this.A04 = 3;
        this.A0X = new InterfaceC58852mj() { // from class: X.2mi
            @Override // X.InterfaceC58852mj
            public final void DTb(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
                Bitmap bitmap = c73033Pe.A01;
                IgImageView igImageView = IgImageView.this;
                if (igImageView.A09 == interfaceC59502nt && bitmap != null && !igImageView.A0L) {
                    igImageView.setImageBitmap(bitmap);
                    C3X8 c3x8 = igImageView.A0F;
                    if (c3x8 != null) {
                        interfaceC59502nt.BRz().CDP();
                        bitmap.getWidth();
                        bitmap.getHeight();
                        IgProgressImageView.A02(((C3X7) c3x8).A00, C05F.A01);
                    }
                    igImageView.A0O = true;
                }
            }
        };
        this.A0Y = new InterfaceC58872ml() { // from class: X.2mk
            @Override // X.InterfaceC58872ml
            public final boolean CbF(InterfaceC59502nt interfaceC59502nt) {
                IgImageView igImageView = IgImageView.this;
                if (igImageView.A09 == interfaceC59502nt) {
                    if (IgImageView.A0h || !igImageView.A0L) {
                        return true;
                    }
                    return false;
                }
                return false;
            }

            @Override // X.InterfaceC58872ml
            public final void Dc3(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe, int i) {
                Bitmap bitmap = c73033Pe.A01;
                IgImageView igImageView = IgImageView.this;
                if (igImageView.A09 == interfaceC59502nt && bitmap != null) {
                    if (!igImageView.A0L) {
                        igImageView.A0a.set(i);
                        IgImageView.A03(bitmap, igImageView);
                        C3X6 c3x6 = igImageView.A0H;
                        if (c3x6 != null) {
                            c3x6.Dbt(i);
                        }
                    }
                    if (i == 4) {
                        InterfaceC43471zH interfaceC43471zH = IgImageView.A0d;
                        ImageUrl BRz = interfaceC59502nt.BRz();
                        C14360o3.A07(BRz);
                        interfaceC43471zH.DLJ(BRz);
                    }
                    if (igImageView.A0L && IgImageView.A0c != null) {
                        igImageView.invalidate();
                    }
                }
            }
        };
        this.A0W = new C1NJ() { // from class: X.2mm
            @Override // X.C1NJ
            public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
                int i;
                int i2;
                C14360o3.A0B(interfaceC59502nt, 0);
                C14360o3.A0B(c73033Pe, 1);
                IgImageView igImageView = IgImageView.this;
                if (igImageView.A08 == interfaceC59502nt && !igImageView.A0N) {
                    igImageView.A0L = true;
                    Bitmap bitmap = c73033Pe.A01;
                    igImageView.setImageBitmap(bitmap);
                    InterfaceC73023Pd interfaceC73023Pd = igImageView.A0D;
                    if (interfaceC73023Pd != null) {
                        String CDP = interfaceC59502nt.BRz().CDP();
                        String str = c73033Pe.A04;
                        if (bitmap != null) {
                            i = bitmap.getWidth();
                            i2 = bitmap.getHeight();
                        } else {
                            i = 0;
                            i2 = 0;
                        }
                        interfaceC73023Pd.DPX(new C73083Pj(bitmap, CDP, str, i, i2));
                        InterfaceC43471zH interfaceC43471zH = IgImageView.A0d;
                        ImageUrl BGt = interfaceC59502nt.BGt();
                        C14360o3.A07(BGt);
                        interfaceC43471zH.DLR(BGt);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
            }

            @Override // X.C1NJ
            public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
            }

            @Override // X.C1NJ
            public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
            }
        };
        this.A0V = new C1NJ() { // from class: X.2mn
            @Override // X.C1NJ
            public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
                C14360o3.A0B(interfaceC59502nt, 0);
                C14360o3.A0B(c73033Pe, 1);
                IgImageView igImageView = IgImageView.this;
                if (igImageView.A09 == interfaceC59502nt) {
                    InterfaceC11380iw interfaceC11380iw = igImageView.A07;
                    if (interfaceC11380iw != null) {
                        interfaceC11380iw.getModuleName();
                    }
                    String str = c73033Pe.A04;
                    igImageView.A0J = str;
                    Bitmap bitmap = c73033Pe.A01;
                    igImageView.A06 = bitmap;
                    igImageView.A0a.set(-1);
                    if (bitmap != null) {
                        ImageUrl BGt = interfaceC59502nt.BGt();
                        C14360o3.A07(BGt);
                        igImageView.setBitmapAndTrackDisplay(bitmap, BGt, str, c73033Pe.A00, igImageView.A07);
                        InterfaceC73023Pd interfaceC73023Pd = igImageView.A0E;
                        if (interfaceC73023Pd != null) {
                            interfaceC73023Pd.DPX(new C73083Pj(bitmap, interfaceC59502nt.BRz().CDP(), str, bitmap.getWidth(), bitmap.getHeight()));
                        }
                    } else {
                        throw new IllegalStateException("info.bitmap should not be null in IgImageInfra.CacheCallback::onBitmapLoaded");
                    }
                }
                ImagePerformanceProvider imagePerformanceProvider = IgImageView.A0e;
                if (imagePerformanceProvider != null) {
                    imagePerformanceProvider.onImageSuccess(interfaceC59502nt.AjY());
                }
            }

            @Override // X.C1NJ
            public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
                C14360o3.A0B(interfaceC59502nt, 0);
                IgImageView igImageView = IgImageView.this;
                if (igImageView.A09 == interfaceC59502nt) {
                    if (!igImageView.A0L) {
                        igImageView.A0B();
                    }
                    InterfaceC73023Pd interfaceC73023Pd = igImageView.A0E;
                    if (interfaceC73023Pd != null) {
                        interfaceC73023Pd.DFp();
                    }
                    if (c82183lf != null) {
                        InterfaceC43471zH interfaceC43471zH = IgImageView.A0d;
                        ImageUrl BGt = interfaceC59502nt.BGt();
                        C14360o3.A07(BGt);
                        String str = c82183lf.A02;
                        int i = c82183lf.A00;
                        interfaceC43471zH.DLT(igImageView.A07, c82183lf.A01, BGt, str, c82183lf.A03, i);
                        ImagePerformanceProvider imagePerformanceProvider = IgImageView.A0e;
                        if (imagePerformanceProvider != null) {
                            imagePerformanceProvider.onImageFailure(interfaceC59502nt.AjY(), c82183lf);
                        }
                    }
                }
            }

            @Override // X.C1NJ
            public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
                C3X3 c3x3;
                ProgressBar progressBar;
                ProgressBar progressBar2;
                C14360o3.A0B(interfaceC59502nt, 0);
                IgImageView igImageView = IgImageView.this;
                if (!igImageView.A0N && igImageView.A09 == interfaceC59502nt && (c3x3 = igImageView.A0G) != null) {
                    IgProgressImageView igProgressImageView = ((C3X2) c3x3).A00;
                    progressBar = igProgressImageView.getProgressBar();
                    if (progressBar.isIndeterminate()) {
                        igProgressImageView.setProgressBarIndeterminate(false);
                    }
                    progressBar2 = igProgressImageView.getProgressBar();
                    progressBar2.setProgress(i);
                }
            }
        };
        this.A0Z = new InterfaceC58912mp() { // from class: X.2mo
            @Override // X.InterfaceC58912mp
            public final void DxG(C5GF c5gf) {
                IgImageView.this.A0B = c5gf;
            }
        };
        A01(context, null);
    }

    public static final void setImageViewsTracker(InterfaceC43471zH interfaceC43471zH) {
        C14360o3.A0B(interfaceC43471zH, 0);
        A0d = interfaceC43471zH;
    }

    public static /* synthetic */ void setUrlWithFallback$default(IgImageView igImageView, AbstractC12990ll abstractC12990ll, ImageUrl imageUrl, ImageUrl imageUrl2, InterfaceC11380iw interfaceC11380iw, InterfaceC73023Pd interfaceC73023Pd, boolean z, int i, Object obj) {
        boolean z2 = z;
        if (obj == null) {
            if ((i & 32) != 0) {
                z2 = true;
            }
            igImageView.A0C(interfaceC11380iw, abstractC12990ll, imageUrl, imageUrl2, interfaceC73023Pd, z2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setUrlWithFallback");
    }

    public static final void setVitoExperimentHelper(C27451Uy c27451Uy) {
        C14360o3.A0B(c27451Uy, 0);
        A0f = c27451Uy;
    }

    public final void A0A() {
        AbstractC12990ll abstractC12990ll = this.A0R;
        ImageUrl imageUrl = this.A0C;
        if (imageUrl != null) {
            InterfaceC11380iw interfaceC11380iw = this.A07;
            if (interfaceC11380iw != null) {
                setUrlInternal(abstractC12990ll, imageUrl, interfaceC11380iw, false, this.A0T);
                return;
            }
            throw new IllegalStateException("Cannot retry if analyticsModule not set");
        }
        throw new IllegalStateException("Cannot retry if url not set");
    }

    public final void A0C(InterfaceC11380iw interfaceC11380iw, AbstractC12990ll abstractC12990ll, ImageUrl imageUrl, ImageUrl imageUrl2, InterfaceC73023Pd interfaceC73023Pd, boolean z) {
        C14360o3.A0B(imageUrl, 1);
        C14360o3.A0B(imageUrl2, 2);
        C14360o3.A0B(interfaceC11380iw, 3);
        C14360o3.A0B(interfaceC73023Pd, 4);
        setUrlInternal(abstractC12990ll, imageUrl, interfaceC11380iw, false, C1WW.A05);
        if (!AbstractC81033jX.A03(imageUrl2)) {
            C1OG A0J = C25821No.A00().A0J(imageUrl2, interfaceC11380iw.getModuleName());
            A0J.A02(this.A0W);
            A0J.A0O = z;
            InterfaceC59502nt A00 = A0J.A00();
            this.A08 = A00;
            this.A0D = interfaceC73023Pd;
            A00.E7X();
        }
    }

    public final void A0D(InterfaceC11380iw interfaceC11380iw, AbstractC12990ll abstractC12990ll, ImageUrl imageUrl, boolean z) {
        C14360o3.A0B(imageUrl, 1);
        C14360o3.A0B(interfaceC11380iw, 2);
        setUrlInternal(abstractC12990ll, imageUrl, interfaceC11380iw, z, C1WW.A05);
    }

    public void A0E(InterfaceC11380iw interfaceC11380iw, ImageUrl imageUrl, int i) {
        C14360o3.A0B(imageUrl, 0);
        this.A08 = null;
        this.A03 = Math.max(i, 1);
        setUrlInternal(null, imageUrl, interfaceC11380iw, false, C1WW.A05);
    }

    public final void A0F(InterfaceC11380iw interfaceC11380iw, ImageUrl imageUrl, boolean z) {
        C14360o3.A0B(imageUrl, 0);
        setUrlInternal(null, imageUrl, interfaceC11380iw, false, false, z, C1WW.A05);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        String message;
        String str;
        String str2;
        C5GF c5gf;
        C14360o3.A0B(canvas, 0);
        boolean z = false;
        try {
            super.onDraw(canvas);
            if (A0c != null) {
                if (Build.VERSION.SDK_INT >= 34 && (c5gf = this.A0B) != null) {
                    Bitmap bitmap = this.A06;
                    if (bitmap != null) {
                        z = bitmap.hasGainmap();
                    }
                    c5gf.A08 = z;
                }
                C5G0 c5g0 = A0c;
                if (c5g0 != null) {
                    c5g0.drawOverlay(canvas, this, this.A0B, this.A06);
                }
            }
        } catch (RuntimeException e) {
            if (e.getMessage() != null && (message = e.getMessage()) != null && AbstractC001900j.A0a(message, "too large", false)) {
                String message2 = e.getMessage();
                InterfaceC11380iw interfaceC11380iw = this.A07;
                if (interfaceC11380iw == null || (str = interfaceC11380iw.getModuleName()) == null) {
                    str = "NullAnalyticsModule";
                }
                ImageUrl imageUrl = this.A0C;
                if (imageUrl == null || (str2 = imageUrl.getUrl()) == null) {
                    str2 = "null";
                }
                throw new RuntimeException(AbstractC13670mt.A06("%s. Bitmaps cannot be bigger than 100 MB. Module: %s. Image URL: %s", message2, str, str2), e);
            }
            throw e;
        }
    }

    public final void setBitmapAndImageRenderer(Bitmap bitmap, InterfaceC59152nG interfaceC59152nG) {
        C14360o3.A0B(bitmap, 0);
        this.A0I = interfaceC59152nG;
        this.A06 = bitmap;
        this.A0N = true;
        A03(bitmap, this);
    }

    public final void setMiniPreviewLoadListener(C3X8 c3x8) {
        C14360o3.A0B(c3x8, 0);
        this.A0F = c3x8;
    }

    public final void setPlaceHolderColor(ColorDrawable colorDrawable) {
        C14360o3.A0B(colorDrawable, 0);
        if (this.A0Q != colorDrawable) {
            this.A0Q = colorDrawable;
        }
    }

    public final void setPrefetchedBitmap(Bitmap bitmap, ImageUrl imageUrl, String str, int i, InterfaceC11380iw interfaceC11380iw) {
        C14360o3.A0B(bitmap, 0);
        C14360o3.A0B(imageUrl, 1);
        C14360o3.A0B(str, 2);
        C14360o3.A0B(interfaceC11380iw, 4);
        setBitmapAndTrackDisplay(bitmap, imageUrl, str, i, interfaceC11380iw);
    }

    public final void setProgressiveImageListener(C3X6 c3x6) {
        C14360o3.A0B(c3x6, 0);
        this.A0H = c3x6;
    }

    public final void setRequestStartListener(InterfaceC177347uU interfaceC177347uU) {
        C14360o3.A0B(interfaceC177347uU, 0);
        this.A0S = interfaceC177347uU;
    }

    public final void setUrl(AbstractC12990ll abstractC12990ll, ImageUrl imageUrl, InterfaceC11380iw interfaceC11380iw, C1WW c1ww) {
        C14360o3.A0B(imageUrl, 1);
        C14360o3.A0B(interfaceC11380iw, 2);
        C14360o3.A0B(c1ww, 3);
        setUrlInternal(abstractC12990ll, imageUrl, interfaceC11380iw, false, c1ww);
    }

    public final void setUrlWithFallback(ImageUrl imageUrl, ImageUrl imageUrl2, InterfaceC11380iw interfaceC11380iw, InterfaceC73023Pd interfaceC73023Pd) {
        C14360o3.A0B(imageUrl, 0);
        C14360o3.A0B(imageUrl2, 1);
        C14360o3.A0B(interfaceC11380iw, 2);
        C14360o3.A0B(interfaceC73023Pd, 3);
        A0C(interfaceC11380iw, null, imageUrl, imageUrl2, interfaceC73023Pd, true);
    }

    private final void A00() {
        A0d.DxZ(this, this.A0C);
        this.A06 = null;
        this.A0N = false;
        this.A09 = null;
        this.A08 = null;
        this.A0L = false;
        this.A0O = false;
        this.A0a.set(0);
        this.A0B = null;
        this.A0J = null;
        this.A0T = C1WW.A05;
    }

    public static final void A03(Bitmap bitmap, IgImageView igImageView) {
        InterfaceC59152nG interfaceC59152nG = igImageView.A0I;
        if (interfaceC59152nG instanceof InterfaceC65702y7) {
            ((InterfaceC65702y7) interfaceC59152nG).EGm(bitmap, igImageView);
            return;
        }
        if (interfaceC59152nG instanceof InterfaceC59142nF) {
            bitmap = ((InterfaceC59142nF) interfaceC59152nG).renderImage(bitmap);
        }
        igImageView.setImageBitmap(bitmap);
    }

    public static final void setDebugImageViewsTracker(InterfaceC114695Fz interfaceC114695Fz) {
        A0b = interfaceC114695Fz;
    }

    public static final void setDebugOverlayDrawer(C5G0 c5g0) {
        if (A0h) {
            A0c = c5g0;
        }
    }

    public static final void setDebuggable(boolean z) {
        A0h = z;
        if (!z) {
            A0b = null;
            A0c = null;
        }
    }

    public static final void setEnablePrepareToDraw(boolean z) {
        A0g = z;
    }

    public static final void setIsFixFullImageLoadedWhenAssignDrawableEnabled(boolean z) {
        A0i = z;
    }

    private final void setUrlInternal(AbstractC12990ll abstractC12990ll, ImageUrl imageUrl, InterfaceC11380iw interfaceC11380iw, boolean z, boolean z2, boolean z3, C1WW c1ww) {
        int i;
        Bitmap bitmap;
        int i2;
        boolean z4;
        if (Systrace.A0E(1L)) {
            C0fO.A01("IgImageView.setUrlInternal", -637074670);
        }
        try {
            interfaceC11380iw.getModuleName();
            C27451Uy c27451Uy = A0f;
            if (c27451Uy != null) {
                String moduleName = interfaceC11380iw.getModuleName();
                Boolean BJa = imageUrl.BJa();
                if (BJa != null) {
                    z4 = BJa.booleanValue();
                } else {
                    z4 = false;
                }
                if (c27451Uy.A00(moduleName, z4)) {
                    setUrlInternalWithVito(abstractC12990ll, imageUrl, interfaceC11380iw, z, z2, z3, c1ww);
                    if (Systrace.A0E(1L)) {
                        i = -1825170499;
                        C0fO.A00(i);
                    }
                    return;
                }
            }
            String str = null;
            if (imageUrl.equals(this.A0C) && this.A0N && (bitmap = this.A06) != null) {
                InterfaceC73023Pd interfaceC73023Pd = this.A0E;
                if (interfaceC73023Pd != null) {
                    ImageUrl imageUrl2 = this.A0C;
                    if (imageUrl2 != null) {
                        str = imageUrl2.getUrl();
                    }
                    String str2 = this.A0J;
                    int width = bitmap.getWidth();
                    Bitmap bitmap2 = this.A06;
                    if (bitmap2 != null) {
                        i2 = bitmap2.getHeight();
                    } else {
                        i2 = 0;
                    }
                    interfaceC73023Pd.DPX(new C73083Pj(bitmap, str, str2, width, i2));
                }
                Bitmap bitmap3 = this.A06;
                if (bitmap3 != null) {
                    A03(bitmap3, this);
                    if (Systrace.A0E(1L)) {
                        i = 523452516;
                    } else {
                        return;
                    }
                } else {
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                InterfaceC114695Fz interfaceC114695Fz = A0b;
                if (interfaceC114695Fz != null) {
                    interfaceC114695Fz.updateUrl(this, this.A0C, imageUrl);
                }
                A09();
                this.A0R = abstractC12990ll;
                this.A0C = imageUrl;
                this.A0T = c1ww;
                C19270xB c19270xB = new C19270xB(interfaceC11380iw.getModuleName());
                this.A07 = c19270xB;
                InterfaceC43471zH interfaceC43471zH = A0d;
                ImageUrl imageUrl3 = this.A0C;
                if (imageUrl3 != null) {
                    interfaceC43471zH.Dxa(imageUrl3, this, c19270xB);
                    InterfaceC11380iw interfaceC11380iw2 = this.A07;
                    if (interfaceC11380iw2 != null) {
                        str = interfaceC11380iw2.getModuleName();
                    }
                    C1OG A0J = C25821No.A00().A0J(imageUrl, str);
                    A0J.A05 = abstractC12990ll;
                    A0J.A0I = false;
                    C80673iw c80673iw = this.A0A;
                    if (c80673iw != null) {
                        A0J.A04 = c80673iw;
                        A0J.A0D = new WeakReference(this.A0Y);
                    }
                    if (A0h) {
                        A0J.A0B = new WeakReference(this.A0Z);
                    }
                    A0J.A02(this.A0V);
                    A0J.A01 = this.A03;
                    A0J.A00 = this.A00;
                    A0J.A0M = this.A0P;
                    A0J.A0E = z;
                    A0J.A0C = new WeakReference(this.A0X);
                    A0J.A09 = this.A0K;
                    A0J.A02 = this.A04;
                    A0J.A0O = z2;
                    A0J.A0L = z3;
                    A0J.A0J = true;
                    this.A09 = A0J.A00();
                    InterfaceC177347uU interfaceC177347uU = this.A0S;
                    if (interfaceC177347uU != null) {
                        interfaceC177347uU.DgF();
                    }
                    InterfaceC59502nt interfaceC59502nt = this.A09;
                    if (interfaceC59502nt != null) {
                        interfaceC59502nt.E7X();
                    }
                    A0d.DgC(imageUrl);
                    if (Systrace.A0E(1L)) {
                        i = 2121808916;
                    } else {
                        return;
                    }
                } else {
                    throw new IllegalArgumentException("typedUrl should not be null in IgImageView::setUrlInternal");
                }
            }
            C0fO.A00(i);
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(1317387209);
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0077, code lost:
    
        if (r1.getBitmap() != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (r1 != true) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c3, code lost:
    
        if (r1.A08 != true) goto L59;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void setUrlInternalWithVito(X.AbstractC12990ll r32, com.instagram.common.typedurl.ImageUrl r33, X.InterfaceC11380iw r34, boolean r35, boolean r36, boolean r37, X.C1WW r38) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.ui.widget.imageview.IgImageView.setUrlInternalWithVito(X.0ll, com.instagram.common.typedurl.ImageUrl, X.0iw, boolean, boolean, boolean, X.1WW):void");
    }

    public C27771Wf A07(C1WX c1wx) {
        C27811Wj A00;
        InterfaceC09390do interfaceC09390do;
        C27811Wj c27811Wj;
        InterfaceC27851Wn interfaceC27851Wn;
        C1WW c1ww = this.A0T;
        boolean z = false;
        if (this.A0A != null) {
            z = true;
        }
        C14360o3.A0B(c1ww, 0);
        int i = 0;
        if (c1ww.ordinal() == 0) {
            i = R.color.context_line_color;
        }
        C1WX c1wx2 = new C1WX(c1ww, i, z);
        int ordinal = c1wx2.A01.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        interfaceC09390do = C1WS.A06;
                    } else if (c1wx2.equals(C1WS.A00)) {
                        interfaceC09390do = C1WS.A04;
                    } else {
                        A00 = C1X4.A00(C27771Wf.A0b);
                        A00.A0P = Boolean.valueOf(c1wx2.A02);
                        A00.A03 = c1wx2.A00;
                        A00.A0R = null;
                        A00.A0C = null;
                        c27811Wj = A00;
                        interfaceC27851Wn = InterfaceC27851Wn.A04;
                    }
                } else if (c1wx2.equals(C1WS.A03)) {
                    interfaceC09390do = C1WS.A08;
                } else {
                    A00 = C1X4.A00(C27771Wf.A0b);
                    A00.A0P = Boolean.valueOf(c1wx2.A02);
                    c27811Wj = A00;
                    interfaceC27851Wn = InterfaceC27851Wn.A01;
                }
            } else if (c1wx2.equals(C1WS.A02)) {
                interfaceC09390do = C1WS.A07;
            } else {
                c27811Wj = C1X4.A00(C27771Wf.A0b);
                c27811Wj.A0P = Boolean.valueOf(c1wx2.A02);
                int i2 = c1wx2.A00;
                if (i2 != 0) {
                    c27811Wj.A03 = i2;
                    c27811Wj.A0R = null;
                    c27811Wj.A0C = null;
                }
                c27811Wj.A0H = InterfaceC27851Wn.A02;
                c27811Wj.A0J = C59182nJ.A04;
                return new C27771Wf(c27811Wj);
            }
            return (C27771Wf) interfaceC09390do.getValue();
        }
        if (c1wx2.equals(C1WS.A01)) {
            interfaceC09390do = C1WS.A05;
            return (C27771Wf) interfaceC09390do.getValue();
        }
        A00 = C1X4.A00(C27771Wf.A0b);
        A00.A0P = Boolean.valueOf(c1wx2.A02);
        A00.A03 = c1wx2.A00;
        A00.A0R = null;
        A00.A0C = null;
        c27811Wj = A00;
        interfaceC27851Wn = InterfaceC27851Wn.A01;
        A00.A0H = interfaceC27851Wn;
        return new C27771Wf(c27811Wj);
    }

    public final Long A08(StringBuilder sb) {
        Bitmap bitmap;
        if (this.A0N && (bitmap = this.A06) != null) {
            C0fK.A03(bitmap);
            int[] iArr = new int[72];
            Bitmap.createScaledBitmap(bitmap, 9, 8, true).getPixels(iArr, 0, 9, 0, 0, 9, 8);
            int i = 0;
            do {
                int i2 = 0;
                do {
                    String hexString = Integer.toHexString(AbstractC116025Nf.A00(iArr[(i * 9) + i2]));
                    if (hexString.length() < 2) {
                        sb.append("0");
                    }
                    sb.append(hexString);
                    i2++;
                } while (i2 < 9);
                i++;
            } while (i < 8);
            C18C.A04(72, 72, "Invalid pixels array length. Expected: %d. Got %d", true);
            long j = 0;
            int i3 = 0;
            do {
                int i4 = i3 * 9;
                int A00 = AbstractC116025Nf.A00(iArr[i4]);
                int i5 = 1;
                do {
                    int A002 = AbstractC116025Nf.A00(iArr[i4 + i5]);
                    long j2 = j << 1;
                    int i6 = 0;
                    if (A00 <= A002) {
                        i6 = 1;
                    }
                    j = j2 | i6;
                    i5++;
                    A00 = A002;
                } while (i5 < 9);
                i3++;
            } while (i3 < 8);
            return Long.valueOf(j);
        }
        return null;
    }

    public final void A0B() {
        setImageDrawable(this.A0Q);
    }

    public final boolean A0G() {
        if (!this.A0N && !this.A0L && this.A0a.get() <= 0 && !this.A0O) {
            return false;
        }
        return true;
    }

    public final InterfaceC11380iw getAnalyticsModule$fbandroid_java_com_instagram_common_ui_widget_imageview_imageview() {
        return this.A07;
    }

    public final Bitmap getBitmap() {
        return this.A06;
    }

    public final AtomicInteger getCurrentScans() {
        return this.A0a;
    }

    public final float getDecodeAspectRatio$fbandroid_java_com_instagram_common_ui_widget_imageview_imageview() {
        return this.A00;
    }

    public final int getDrawableHeight() {
        return this.A01;
    }

    public final int getDrawableWidth() {
        return this.A02;
    }

    public final long getExpirationTime$fbandroid_java_com_instagram_common_ui_widget_imageview_imageview() {
        return this.A05;
    }

    public final InterfaceC73023Pd getFallbackLoadListener$fbandroid_java_com_instagram_common_ui_widget_imageview_imageview() {
        return this.A0D;
    }

    public final boolean getForceTracking() {
        return this.A0M;
    }

    public final String getLoadSource$fbandroid_java_com_instagram_common_ui_widget_imageview_imageview() {
        return this.A0J;
    }

    public final int getMaxSampleSize$fbandroid_java_com_instagram_common_ui_widget_imageview_imageview() {
        return this.A03;
    }

    public final int getMiniPreviewBlurRadius$fbandroid_java_com_instagram_common_ui_widget_imageview_imageview() {
        return this.A04;
    }

    public final C3X8 getMiniPreviewLoadListener$fbandroid_java_com_instagram_common_ui_widget_imageview_imageview() {
        return this.A0F;
    }

    public final String getMiniPreviewPayload$fbandroid_java_com_instagram_common_ui_widget_imageview_imageview() {
        return this.A0K;
    }

    public final InterfaceC59152nG getPostProcessor() {
        return this.A0I;
    }

    public final C80673iw getProgressiveImageConfig$fbandroid_java_com_instagram_common_ui_widget_imageview_imageview() {
        return this.A0A;
    }

    public final C3X6 getProgressiveImageListener$fbandroid_java_com_instagram_common_ui_widget_imageview_imageview() {
        return this.A0H;
    }

    public final boolean getReportProgress$fbandroid_java_com_instagram_common_ui_widget_imageview_imageview() {
        return this.A0P;
    }

    public final ImageUrl getTypedUrl() {
        return this.A0C;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.A0U) {
            i2 = i;
        }
        super.onMeasure(i, i2);
    }

    public final void setAnalyticsModule$fbandroid_java_com_instagram_common_ui_widget_imageview_imageview(InterfaceC11380iw interfaceC11380iw) {
        this.A07 = interfaceC11380iw;
    }

    public final void setDecodeAspectRatio$fbandroid_java_com_instagram_common_ui_widget_imageview_imageview(float f) {
        this.A00 = f;
    }

    public final void setExpiration(long j) {
        this.A05 = j;
    }

    public final void setExpirationTime$fbandroid_java_com_instagram_common_ui_widget_imageview_imageview(long j) {
        this.A05 = j;
    }

    public final void setFallbackLoadListener$fbandroid_java_com_instagram_common_ui_widget_imageview_imageview(InterfaceC73023Pd interfaceC73023Pd) {
        this.A0D = interfaceC73023Pd;
    }

    public final void setForceTracking(boolean z) {
        this.A0M = z;
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        if (A0g) {
            boolean z = C25761Ni.A07;
            if (bitmap != null && z) {
                bitmap.prepareToDraw();
            }
        }
        super.setImageBitmap(bitmap);
        AbstractC56872jL.A00().DiU(bitmap);
        if (Build.VERSION.SDK_INT >= 34) {
            C72133Lm.A03.A04(bitmap);
        }
    }

    public final void setImageDecodeAspectRatio(float f) {
        this.A00 = f;
    }

    public final void setImageRendererAndReset(InterfaceC59152nG interfaceC59152nG) {
        this.A0I = interfaceC59152nG;
        Bitmap bitmap = this.A06;
        if (bitmap != null) {
            A03(bitmap, this);
        }
    }

    public final void setLoadSource$fbandroid_java_com_instagram_common_ui_widget_imageview_imageview(String str) {
        this.A0J = str;
    }

    public final void setMaxSampleSize$fbandroid_java_com_instagram_common_ui_widget_imageview_imageview(int i) {
        this.A03 = i;
    }

    public final void setMiniPreviewBlurRadius(int i) {
        this.A04 = i;
    }

    public final void setMiniPreviewBlurRadius$fbandroid_java_com_instagram_common_ui_widget_imageview_imageview(int i) {
        this.A04 = i;
    }

    public final void setMiniPreviewLoadListener$fbandroid_java_com_instagram_common_ui_widget_imageview_imageview(C3X8 c3x8) {
        this.A0F = c3x8;
    }

    public final void setMiniPreviewPayload(String str) {
        this.A0K = str;
    }

    public final void setMiniPreviewPayload$fbandroid_java_com_instagram_common_ui_widget_imageview_imageview(String str) {
        this.A0K = str;
    }

    public final void setOnFallbackListener(InterfaceC73023Pd interfaceC73023Pd) {
        this.A0D = interfaceC73023Pd;
    }

    public final void setOnLoadListener(InterfaceC73023Pd interfaceC73023Pd) {
        this.A0E = interfaceC73023Pd;
    }

    public final void setPostProcessor(InterfaceC59152nG interfaceC59152nG) {
        this.A0I = interfaceC59152nG;
    }

    public final void setProgressListener(C3X3 c3x3) {
        this.A0G = c3x3;
    }

    public final void setProgressiveImageConfig(C80673iw c80673iw) {
        this.A0A = c80673iw;
    }

    public final void setProgressiveImageConfig$fbandroid_java_com_instagram_common_ui_widget_imageview_imageview(C80673iw c80673iw) {
        this.A0A = c80673iw;
    }

    public final void setProgressiveImageListener$fbandroid_java_com_instagram_common_ui_widget_imageview_imageview(C3X6 c3x6) {
        this.A0H = c3x6;
    }

    public final void setReportProgress(boolean z) {
        this.A0P = z;
    }

    public final void setReportProgress$fbandroid_java_com_instagram_common_ui_widget_imageview_imageview(boolean z) {
        this.A0P = z;
    }

    private final void A01(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC55922hc.A1A);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            setContentDescription(context.getText(resourceId));
        }
        int color = obtainStyledAttributes.getColor(3, 0);
        if (color != 0) {
            this.A0Q = new ColorDrawable(color);
        }
        this.A0U = obtainStyledAttributes.getBoolean(1, false);
        this.A0M = obtainStyledAttributes.getBoolean(2, false);
        obtainStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r12.hasGainmap() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setBitmapAndTrackDisplay(android.graphics.Bitmap r12, com.instagram.common.typedurl.ImageUrl r13, java.lang.String r14, int r15, X.InterfaceC11380iw r16) {
        /*
            r11 = this;
            A03(r12, r11)
            r0 = 1
            r11.A0N = r0
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 34
            if (r1 < r0) goto L13
            boolean r0 = r12.hasGainmap()
            r10 = 1
            if (r0 != 0) goto L14
        L13:
            r10 = 0
        L14:
            X.1zH r0 = com.instagram.common.ui.widget.imageview.IgImageView.A0d
            int r4 = r11.getHeight()
            int r5 = r11.getWidth()
            int r6 = r12.getWidth()
            int r7 = r12.getHeight()
            int r8 = r12.getByteCount()
            r2 = r13
            r3 = r14
            r9 = r15
            r1 = r16
            r0.DLN(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.ui.widget.imageview.IgImageView.setBitmapAndTrackDisplay(android.graphics.Bitmap, com.instagram.common.typedurl.ImageUrl, java.lang.String, int, X.0iw):void");
    }

    public final void A09() {
        A00();
        A0B();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        int A06 = C0f9.A06(-830384259);
        super.onAttachedToWindow();
        A0d.Cxe(this.A0C, this, this.A07);
        InterfaceC114695Fz interfaceC114695Fz = A0b;
        if (interfaceC114695Fz != null) {
            interfaceC114695Fz.registerView(this);
        }
        C0f9.A0D(880139788, A06);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        InterfaceC59502nt interfaceC59502nt;
        int A06 = C0f9.A06(181573684);
        super.onDetachedFromWindow();
        if (!this.A0N && (interfaceC59502nt = this.A09) != null) {
            interfaceC59502nt.AGO();
        }
        A0d.DA1(this, this.A0C);
        InterfaceC114695Fz interfaceC114695Fz = A0b;
        if (interfaceC114695Fz != null) {
            interfaceC114695Fz.unregisterView(this);
        }
        C0f9.A0D(-961628347, A06);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        if (!A0i) {
            this.A0N = true;
        }
        if (drawable != null) {
            this.A02 = drawable.getIntrinsicWidth();
            this.A01 = drawable.getIntrinsicHeight();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A03 = 1;
        this.A00 = -1.0f;
        this.A05 = -1L;
        this.A0T = C1WW.A05;
        this.A0a = new AtomicInteger(0);
        this.A04 = 3;
        this.A0X = new InterfaceC58852mj() { // from class: X.2mi
            @Override // X.InterfaceC58852mj
            public final void DTb(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
                Bitmap bitmap = c73033Pe.A01;
                IgImageView igImageView = IgImageView.this;
                if (igImageView.A09 == interfaceC59502nt && bitmap != null && !igImageView.A0L) {
                    igImageView.setImageBitmap(bitmap);
                    C3X8 c3x8 = igImageView.A0F;
                    if (c3x8 != null) {
                        interfaceC59502nt.BRz().CDP();
                        bitmap.getWidth();
                        bitmap.getHeight();
                        IgProgressImageView.A02(((C3X7) c3x8).A00, C05F.A01);
                    }
                    igImageView.A0O = true;
                }
            }
        };
        this.A0Y = new InterfaceC58872ml() { // from class: X.2mk
            @Override // X.InterfaceC58872ml
            public final boolean CbF(InterfaceC59502nt interfaceC59502nt) {
                IgImageView igImageView = IgImageView.this;
                if (igImageView.A09 == interfaceC59502nt) {
                    if (IgImageView.A0h || !igImageView.A0L) {
                        return true;
                    }
                    return false;
                }
                return false;
            }

            @Override // X.InterfaceC58872ml
            public final void Dc3(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe, int i2) {
                Bitmap bitmap = c73033Pe.A01;
                IgImageView igImageView = IgImageView.this;
                if (igImageView.A09 == interfaceC59502nt && bitmap != null) {
                    if (!igImageView.A0L) {
                        igImageView.A0a.set(i2);
                        IgImageView.A03(bitmap, igImageView);
                        C3X6 c3x6 = igImageView.A0H;
                        if (c3x6 != null) {
                            c3x6.Dbt(i2);
                        }
                    }
                    if (i2 == 4) {
                        InterfaceC43471zH interfaceC43471zH = IgImageView.A0d;
                        ImageUrl BRz = interfaceC59502nt.BRz();
                        C14360o3.A07(BRz);
                        interfaceC43471zH.DLJ(BRz);
                    }
                    if (igImageView.A0L && IgImageView.A0c != null) {
                        igImageView.invalidate();
                    }
                }
            }
        };
        this.A0W = new C1NJ() { // from class: X.2mm
            @Override // X.C1NJ
            public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
                int i2;
                int i22;
                C14360o3.A0B(interfaceC59502nt, 0);
                C14360o3.A0B(c73033Pe, 1);
                IgImageView igImageView = IgImageView.this;
                if (igImageView.A08 == interfaceC59502nt && !igImageView.A0N) {
                    igImageView.A0L = true;
                    Bitmap bitmap = c73033Pe.A01;
                    igImageView.setImageBitmap(bitmap);
                    InterfaceC73023Pd interfaceC73023Pd = igImageView.A0D;
                    if (interfaceC73023Pd != null) {
                        String CDP = interfaceC59502nt.BRz().CDP();
                        String str = c73033Pe.A04;
                        if (bitmap != null) {
                            i2 = bitmap.getWidth();
                            i22 = bitmap.getHeight();
                        } else {
                            i2 = 0;
                            i22 = 0;
                        }
                        interfaceC73023Pd.DPX(new C73083Pj(bitmap, CDP, str, i2, i22));
                        InterfaceC43471zH interfaceC43471zH = IgImageView.A0d;
                        ImageUrl BGt = interfaceC59502nt.BGt();
                        C14360o3.A07(BGt);
                        interfaceC43471zH.DLR(BGt);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
            }

            @Override // X.C1NJ
            public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
            }

            @Override // X.C1NJ
            public final void DLW(InterfaceC59502nt interfaceC59502nt, int i2) {
            }
        };
        this.A0V = new C1NJ() { // from class: X.2mn
            @Override // X.C1NJ
            public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
                C14360o3.A0B(interfaceC59502nt, 0);
                C14360o3.A0B(c73033Pe, 1);
                IgImageView igImageView = IgImageView.this;
                if (igImageView.A09 == interfaceC59502nt) {
                    InterfaceC11380iw interfaceC11380iw = igImageView.A07;
                    if (interfaceC11380iw != null) {
                        interfaceC11380iw.getModuleName();
                    }
                    String str = c73033Pe.A04;
                    igImageView.A0J = str;
                    Bitmap bitmap = c73033Pe.A01;
                    igImageView.A06 = bitmap;
                    igImageView.A0a.set(-1);
                    if (bitmap != null) {
                        ImageUrl BGt = interfaceC59502nt.BGt();
                        C14360o3.A07(BGt);
                        igImageView.setBitmapAndTrackDisplay(bitmap, BGt, str, c73033Pe.A00, igImageView.A07);
                        InterfaceC73023Pd interfaceC73023Pd = igImageView.A0E;
                        if (interfaceC73023Pd != null) {
                            interfaceC73023Pd.DPX(new C73083Pj(bitmap, interfaceC59502nt.BRz().CDP(), str, bitmap.getWidth(), bitmap.getHeight()));
                        }
                    } else {
                        throw new IllegalStateException("info.bitmap should not be null in IgImageInfra.CacheCallback::onBitmapLoaded");
                    }
                }
                ImagePerformanceProvider imagePerformanceProvider = IgImageView.A0e;
                if (imagePerformanceProvider != null) {
                    imagePerformanceProvider.onImageSuccess(interfaceC59502nt.AjY());
                }
            }

            @Override // X.C1NJ
            public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
                C14360o3.A0B(interfaceC59502nt, 0);
                IgImageView igImageView = IgImageView.this;
                if (igImageView.A09 == interfaceC59502nt) {
                    if (!igImageView.A0L) {
                        igImageView.A0B();
                    }
                    InterfaceC73023Pd interfaceC73023Pd = igImageView.A0E;
                    if (interfaceC73023Pd != null) {
                        interfaceC73023Pd.DFp();
                    }
                    if (c82183lf != null) {
                        InterfaceC43471zH interfaceC43471zH = IgImageView.A0d;
                        ImageUrl BGt = interfaceC59502nt.BGt();
                        C14360o3.A07(BGt);
                        String str = c82183lf.A02;
                        int i2 = c82183lf.A00;
                        interfaceC43471zH.DLT(igImageView.A07, c82183lf.A01, BGt, str, c82183lf.A03, i2);
                        ImagePerformanceProvider imagePerformanceProvider = IgImageView.A0e;
                        if (imagePerformanceProvider != null) {
                            imagePerformanceProvider.onImageFailure(interfaceC59502nt.AjY(), c82183lf);
                        }
                    }
                }
            }

            @Override // X.C1NJ
            public final void DLW(InterfaceC59502nt interfaceC59502nt, int i2) {
                C3X3 c3x3;
                ProgressBar progressBar;
                ProgressBar progressBar2;
                C14360o3.A0B(interfaceC59502nt, 0);
                IgImageView igImageView = IgImageView.this;
                if (!igImageView.A0N && igImageView.A09 == interfaceC59502nt && (c3x3 = igImageView.A0G) != null) {
                    IgProgressImageView igProgressImageView = ((C3X2) c3x3).A00;
                    progressBar = igProgressImageView.getProgressBar();
                    if (progressBar.isIndeterminate()) {
                        igProgressImageView.setProgressBarIndeterminate(false);
                    }
                    progressBar2 = igProgressImageView.getProgressBar();
                    progressBar2.setProgress(i2);
                }
            }
        };
        this.A0Z = new InterfaceC58912mp() { // from class: X.2mo
            @Override // X.InterfaceC58912mp
            public final void DxG(C5GF c5gf) {
                IgImageView.this.A0B = c5gf;
            }
        };
        A01(context, attributeSet);
    }

    private final void setUrlInternal(AbstractC12990ll abstractC12990ll, ImageUrl imageUrl, InterfaceC11380iw interfaceC11380iw, boolean z, C1WW c1ww) {
        setUrlInternal(abstractC12990ll, imageUrl, interfaceC11380iw, z, false, false, c1ww);
    }

    public void setPlaceHolderColor(int i) {
        this.A0Q = new ColorDrawable(i);
    }

    public final void setUrl(AbstractC12990ll abstractC12990ll, ImageUrl imageUrl, InterfaceC11380iw interfaceC11380iw) {
        C14360o3.A0B(imageUrl, 1);
        C14360o3.A0B(interfaceC11380iw, 2);
        setUrlInternal(abstractC12990ll, imageUrl, interfaceC11380iw, false, C1WW.A05);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        this.A03 = 1;
        this.A00 = -1.0f;
        this.A05 = -1L;
        this.A0T = C1WW.A05;
        this.A0a = new AtomicInteger(0);
        this.A04 = 3;
        this.A0X = new InterfaceC58852mj() { // from class: X.2mi
            @Override // X.InterfaceC58852mj
            public final void DTb(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
                Bitmap bitmap = c73033Pe.A01;
                IgImageView igImageView = IgImageView.this;
                if (igImageView.A09 == interfaceC59502nt && bitmap != null && !igImageView.A0L) {
                    igImageView.setImageBitmap(bitmap);
                    C3X8 c3x8 = igImageView.A0F;
                    if (c3x8 != null) {
                        interfaceC59502nt.BRz().CDP();
                        bitmap.getWidth();
                        bitmap.getHeight();
                        IgProgressImageView.A02(((C3X7) c3x8).A00, C05F.A01);
                    }
                    igImageView.A0O = true;
                }
            }
        };
        this.A0Y = new InterfaceC58872ml() { // from class: X.2mk
            @Override // X.InterfaceC58872ml
            public final boolean CbF(InterfaceC59502nt interfaceC59502nt) {
                IgImageView igImageView = IgImageView.this;
                if (igImageView.A09 == interfaceC59502nt) {
                    if (IgImageView.A0h || !igImageView.A0L) {
                        return true;
                    }
                    return false;
                }
                return false;
            }

            @Override // X.InterfaceC58872ml
            public final void Dc3(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe, int i2) {
                Bitmap bitmap = c73033Pe.A01;
                IgImageView igImageView = IgImageView.this;
                if (igImageView.A09 == interfaceC59502nt && bitmap != null) {
                    if (!igImageView.A0L) {
                        igImageView.A0a.set(i2);
                        IgImageView.A03(bitmap, igImageView);
                        C3X6 c3x6 = igImageView.A0H;
                        if (c3x6 != null) {
                            c3x6.Dbt(i2);
                        }
                    }
                    if (i2 == 4) {
                        InterfaceC43471zH interfaceC43471zH = IgImageView.A0d;
                        ImageUrl BRz = interfaceC59502nt.BRz();
                        C14360o3.A07(BRz);
                        interfaceC43471zH.DLJ(BRz);
                    }
                    if (igImageView.A0L && IgImageView.A0c != null) {
                        igImageView.invalidate();
                    }
                }
            }
        };
        this.A0W = new C1NJ() { // from class: X.2mm
            @Override // X.C1NJ
            public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
                int i2;
                int i22;
                C14360o3.A0B(interfaceC59502nt, 0);
                C14360o3.A0B(c73033Pe, 1);
                IgImageView igImageView = IgImageView.this;
                if (igImageView.A08 == interfaceC59502nt && !igImageView.A0N) {
                    igImageView.A0L = true;
                    Bitmap bitmap = c73033Pe.A01;
                    igImageView.setImageBitmap(bitmap);
                    InterfaceC73023Pd interfaceC73023Pd = igImageView.A0D;
                    if (interfaceC73023Pd != null) {
                        String CDP = interfaceC59502nt.BRz().CDP();
                        String str = c73033Pe.A04;
                        if (bitmap != null) {
                            i2 = bitmap.getWidth();
                            i22 = bitmap.getHeight();
                        } else {
                            i2 = 0;
                            i22 = 0;
                        }
                        interfaceC73023Pd.DPX(new C73083Pj(bitmap, CDP, str, i2, i22));
                        InterfaceC43471zH interfaceC43471zH = IgImageView.A0d;
                        ImageUrl BGt = interfaceC59502nt.BGt();
                        C14360o3.A07(BGt);
                        interfaceC43471zH.DLR(BGt);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
            }

            @Override // X.C1NJ
            public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
            }

            @Override // X.C1NJ
            public final void DLW(InterfaceC59502nt interfaceC59502nt, int i2) {
            }
        };
        this.A0V = new C1NJ() { // from class: X.2mn
            @Override // X.C1NJ
            public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
                C14360o3.A0B(interfaceC59502nt, 0);
                C14360o3.A0B(c73033Pe, 1);
                IgImageView igImageView = IgImageView.this;
                if (igImageView.A09 == interfaceC59502nt) {
                    InterfaceC11380iw interfaceC11380iw = igImageView.A07;
                    if (interfaceC11380iw != null) {
                        interfaceC11380iw.getModuleName();
                    }
                    String str = c73033Pe.A04;
                    igImageView.A0J = str;
                    Bitmap bitmap = c73033Pe.A01;
                    igImageView.A06 = bitmap;
                    igImageView.A0a.set(-1);
                    if (bitmap != null) {
                        ImageUrl BGt = interfaceC59502nt.BGt();
                        C14360o3.A07(BGt);
                        igImageView.setBitmapAndTrackDisplay(bitmap, BGt, str, c73033Pe.A00, igImageView.A07);
                        InterfaceC73023Pd interfaceC73023Pd = igImageView.A0E;
                        if (interfaceC73023Pd != null) {
                            interfaceC73023Pd.DPX(new C73083Pj(bitmap, interfaceC59502nt.BRz().CDP(), str, bitmap.getWidth(), bitmap.getHeight()));
                        }
                    } else {
                        throw new IllegalStateException("info.bitmap should not be null in IgImageInfra.CacheCallback::onBitmapLoaded");
                    }
                }
                ImagePerformanceProvider imagePerformanceProvider = IgImageView.A0e;
                if (imagePerformanceProvider != null) {
                    imagePerformanceProvider.onImageSuccess(interfaceC59502nt.AjY());
                }
            }

            @Override // X.C1NJ
            public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
                C14360o3.A0B(interfaceC59502nt, 0);
                IgImageView igImageView = IgImageView.this;
                if (igImageView.A09 == interfaceC59502nt) {
                    if (!igImageView.A0L) {
                        igImageView.A0B();
                    }
                    InterfaceC73023Pd interfaceC73023Pd = igImageView.A0E;
                    if (interfaceC73023Pd != null) {
                        interfaceC73023Pd.DFp();
                    }
                    if (c82183lf != null) {
                        InterfaceC43471zH interfaceC43471zH = IgImageView.A0d;
                        ImageUrl BGt = interfaceC59502nt.BGt();
                        C14360o3.A07(BGt);
                        String str = c82183lf.A02;
                        int i2 = c82183lf.A00;
                        interfaceC43471zH.DLT(igImageView.A07, c82183lf.A01, BGt, str, c82183lf.A03, i2);
                        ImagePerformanceProvider imagePerformanceProvider = IgImageView.A0e;
                        if (imagePerformanceProvider != null) {
                            imagePerformanceProvider.onImageFailure(interfaceC59502nt.AjY(), c82183lf);
                        }
                    }
                }
            }

            @Override // X.C1NJ
            public final void DLW(InterfaceC59502nt interfaceC59502nt, int i2) {
                C3X3 c3x3;
                ProgressBar progressBar;
                ProgressBar progressBar2;
                C14360o3.A0B(interfaceC59502nt, 0);
                IgImageView igImageView = IgImageView.this;
                if (!igImageView.A0N && igImageView.A09 == interfaceC59502nt && (c3x3 = igImageView.A0G) != null) {
                    IgProgressImageView igProgressImageView = ((C3X2) c3x3).A00;
                    progressBar = igProgressImageView.getProgressBar();
                    if (progressBar.isIndeterminate()) {
                        igProgressImageView.setProgressBarIndeterminate(false);
                    }
                    progressBar2 = igProgressImageView.getProgressBar();
                    progressBar2.setProgress(i2);
                }
            }
        };
        this.A0Z = new InterfaceC58912mp() { // from class: X.2mo
            @Override // X.InterfaceC58912mp
            public final void DxG(C5GF c5gf) {
                IgImageView.this.A0B = c5gf;
            }
        };
        A01(context, attributeSet);
    }

    public void setUrl(ImageUrl imageUrl, InterfaceC11380iw interfaceC11380iw, C1WW c1ww) {
        C14360o3.A0B(imageUrl, 0);
        C14360o3.A0B(interfaceC11380iw, 1);
        C14360o3.A0B(c1ww, 2);
        setUrlInternal(null, imageUrl, interfaceC11380iw, false, false, false, c1ww);
    }

    public final void setUrl(ImageUrl imageUrl, InterfaceC11380iw interfaceC11380iw, boolean z, boolean z2, C1WW c1ww) {
        C14360o3.A0B(imageUrl, 0);
        C14360o3.A0B(interfaceC11380iw, 1);
        C14360o3.A0B(c1ww, 4);
        setUrlInternal(null, imageUrl, interfaceC11380iw, z, false, z2, c1ww);
    }

    public void setUrl(ImageUrl imageUrl, InterfaceC11380iw interfaceC11380iw) {
        C14360o3.A0B(imageUrl, 0);
        C14360o3.A0B(interfaceC11380iw, 1);
        setUrlInternal(null, imageUrl, interfaceC11380iw, false, C1WW.A05);
    }
}
