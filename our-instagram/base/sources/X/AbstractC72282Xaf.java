package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;

/* renamed from: X.Xaf, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC72282Xaf extends C72283Xag {
    public float A00;
    public C72771Xmo A01;
    public C72867Xpa A02;
    public boolean A03;
    public final C72793XnE A04;

    @Override // X.AbstractC73478YFb, X.YQ3
    public final YRN AMV() {
        AbstractC73479YFc c72288Xal;
        if (this.A03) {
            c72288Xal = new C72287Xak(this);
        } else {
            c72288Xal = new C72288Xal(this);
        }
        c72288Xal.A01(this);
        return c72288Xal;
    }

    @Override // X.C72283Xag, X.YQ3
    public void CNp(C22978ABc c22978ABc) {
        C72867Xpa c72867Xpa;
        String str;
        int i;
        int i2;
        boolean z;
        int i3;
        if (((C72283Xag) this).A06 == null) {
            super.CNp(c22978ABc);
            Context context = c22978ABc.A00;
            this.A00 = context.getResources().getDisplayMetrics().density;
            XO3 xo3 = ((AbstractC73478YFb) this).A04;
            if (xo3 != null) {
                boolean A1W = AbstractC167007dF.A1W(xo3.A01.get("aVelocity"));
                this.A03 = A1W;
                XO3 xo32 = ((AbstractC73478YFb) this).A04;
                if (A1W) {
                    C18C.A07(xo32, "An error occurred while initializing brush. Cannot perform this action without initializing");
                    c72867Xpa = new C72867Xpa(xo32, 28);
                    c72867Xpa.A02(2, 5126, "aPosition", false, 0);
                    c72867Xpa.A02(2, 5126, "aVelocity", false, 8);
                    c72867Xpa.A02(1, 5126, "aTime", false, 16);
                    c72867Xpa.A02(1, 5126, "aSize", false, 20);
                    str = "aColor";
                    i = 4;
                    i2 = 5121;
                    z = true;
                    i3 = 24;
                } else {
                    C18C.A07(xo32, "An error occurred while initializing brush. Cannot perform this action without initializing");
                    c72867Xpa = new C72867Xpa(xo32, 20);
                    c72867Xpa.A02(2, 5126, "aPosition", false, 0);
                    c72867Xpa.A02(1, 5126, "aTime", false, 8);
                    c72867Xpa.A02(1, 5126, "aSize", false, 12);
                    str = "aColor";
                    i = 4;
                    i2 = 5121;
                    z = true;
                    i3 = 16;
                }
                c72867Xpa.A02(i, i2, str, z, i3);
                this.A02 = c72867Xpa;
                C72793XnE c72793XnE = this.A04;
                if (c72793XnE != null) {
                    c72793XnE.A03 = new C72738XmA(xo3, this);
                    if (c72793XnE.A02 == null) {
                        Thread currentThread = Thread.currentThread();
                        if (currentThread instanceof X1v) {
                            c72793XnE.A02 = (X1v) currentThread;
                        }
                    }
                    Resources resources = context.getResources();
                    int i4 = c72793XnE.A00;
                    Drawable drawable = resources.getDrawable(i4);
                    if (drawable instanceof C3PR) {
                        c72793XnE.A04 = z;
                        ((C3PR) drawable).A01(new C48544Ldh(i, drawable, c72793XnE));
                    } else {
                        if (i4 == 0) {
                            return;
                        }
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inScaled = false;
                        Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), i4, options);
                        decodeResource.getClass();
                        int A00 = C72793XnE.A00(decodeResource);
                        decodeResource.recycle();
                        c72793XnE.A01 = A00;
                        C72738XmA c72738XmA = c72793XnE.A03;
                        if (c72738XmA == null) {
                            return;
                        }
                        c72738XmA.A00.A02("sBrush", A00);
                    }
                }
            }
        }
    }

    @Override // X.AbstractC73478YFb, X.YQ3
    public final boolean isValid() {
        C72793XnE c72793XnE;
        if (AbstractC167007dF.A1W(((AbstractC73478YFb) this).A04) && (c72793XnE = this.A04) != null) {
            if (c72793XnE.A01 != 0 || c72793XnE.A04) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.YQQ] */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.XnE, java.lang.Object] */
    public AbstractC72282Xaf(String str, int i, int i2, int i3) {
        super(str);
        ((C72283Xag) this).A00 = i2;
        ((C72283Xag) this).A01 = i;
        ?? obj = new Object();
        obj.A01 = 0;
        obj.A04 = false;
        obj.A00 = i3;
        this.A04 = obj;
        ((AbstractC73478YFb) this).A05 = new Object();
    }
}
