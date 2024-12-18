package X;

import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.android.maps.model.CameraPosition;
import com.facebook.android.maps.model.LatLng;
import com.instagram.maps.raster.IgRasterMapView;
import java.lang.ref.WeakReference;
import java.util.EnumSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

/* renamed from: X.UBx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C66356UBx extends FrameLayout implements X7I, X7J, X7K {
    public static final double A0p = Math.log(2.0d);
    public double A00;
    public double A01;
    public double A02;
    public double A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public float A0A;
    public float A0B;
    public float A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public long A0I;
    public long A0J;
    public long A0K;
    public long A0L;
    public C70394WTw A0M;
    public W3L A0N;
    public AbstractC66278U6y A0O;
    public VJZ A0P;
    public RunnableC71638Wxk A0Q;
    public InterfaceC72012XFa A0R;
    public Queue A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public Context A0a;
    public X7H A0b;
    public C69493VoG A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public final Matrix A0g;
    public final Matrix A0h;
    public final EnumSet A0i;
    public final BroadcastReceiver A0j;
    public final ComponentCallbacks A0k;
    public final Paint A0l;
    public final RectF A0m;
    public final float[] A0n;
    public final float[] A0o;

    private void A02() {
        if (!this.A0d) {
            this.A0a.registerComponentCallbacks(this.A0k);
            C0DJ.A00(this.A0j, this.A0a, new IntentFilter(AbstractC58317Pt9.A00(678)));
            this.A0d = true;
        }
    }

    private void A03() {
        int i = 0;
        if (this.A0d) {
            this.A0a.unregisterComponentCallbacks(this.A0k);
            try {
                this.A0a.unregisterReceiver(this.A0j);
            } catch (IllegalArgumentException unused) {
            }
            this.A0d = false;
        }
        this.A0M.A07();
        C42961yO[] c42961yOArr = C42961yO.A0X;
        do {
            C42961yO c42961yO = c42961yOArr[i];
            if (c42961yO.A06) {
                synchronized (c42961yO) {
                    C42961yO.A01(c42961yO);
                }
            } else {
                C42961yO.A01(c42961yO);
            }
            i++;
        } while (i < 8);
    }

    public static void A0A(C66356UBx c66356UBx) {
        c66356UBx.A0W = false;
        WFW wfw = c66356UBx.A0M.A0J;
        C66356UBx c66356UBx2 = wfw.A00.A0I;
        LatLng A04 = wfw.A04(0.0f, c66356UBx2.A0E);
        LatLng A042 = wfw.A04(c66356UBx2.A0G, c66356UBx2.A0E);
        LatLng A043 = wfw.A04(0.0f, 0.0f);
        LatLng A044 = wfw.A04(c66356UBx2.A0G, 0.0f);
        W52 w52 = new W52();
        w52.A02(A04);
        w52.A02(A043);
        w52.A02(A042);
        w52.A02(A044);
        w52.A01();
    }

    public static final double A00(double d) {
        int i;
        if (d < 0.0d) {
            i = 1;
        } else {
            i = 0;
            if (d > 1.0d) {
                i = -1;
            }
        }
        return d + i;
    }

    public static WHE A01(C66356UBx c66356UBx) {
        c66356UBx.A02 = 0.5d;
        c66356UBx.A03 = 0.5d;
        c66356UBx.A0J = SystemClock.uptimeMillis();
        c66356UBx.A0R = InterfaceC72012XFa.A00;
        return new WHE(c66356UBx);
    }

    private void A04() {
        RectF rectF = this.A0m;
        rectF.left = 0.0f;
        rectF.right = this.A0G;
        rectF.top = 0.0f;
        rectF.bottom = this.A0E;
        Matrix matrix = this.A0h;
        matrix.mapRect(rectF);
        float[] fArr = this.A0o;
        float f = this.A04;
        fArr[0] = -f;
        float f2 = -this.A05;
        fArr[1] = f2;
        fArr[2] = f;
        fArr[3] = f2;
        matrix.mapVectors(fArr);
        float max = Math.max(Math.abs(fArr[0]), Math.abs(fArr[2]));
        float max2 = Math.max(Math.abs(fArr[1]), Math.abs(fArr[3]));
        float f3 = (float) this.A0K;
        this.A00 = max / f3;
        this.A01 = max2 / f3;
    }

    private void A05(float f, float f2, float f3, float f4) {
        float[] fArr = this.A0n;
        fArr[0] = this.A04 - f;
        fArr[1] = this.A05 - f2;
        this.A0h.mapVectors(fArr);
        double d = fArr[0];
        long j = this.A0K;
        double d2 = j;
        this.A02 = A00(f3 + (d / d2));
        this.A03 = A0D(j, f4 + (fArr[1] / d2));
    }

    private void A06(int i, float f) {
        this.A0H = i;
        this.A0C = f;
        this.A0F = 1 << i;
        this.A0K = r1 * this.A0M.A0F;
    }

    private void A08(Bundle bundle) {
        if (bundle != null && bundle.containsKey("zoom")) {
            float f = bundle.getInt("zoom");
            C70394WTw c70394WTw = this.A0M;
            A06((int) Math.min(Math.max(f, c70394WTw.A01), c70394WTw.A00), bundle.getFloat("scale"));
            this.A02 = bundle.getDouble("xVisibleCenter") - (0 / (this.A0K << 1));
            this.A03 = bundle.getDouble("yVisibleCenter") - (0 / (this.A0K << 1));
            this.A0B = bundle.getFloat("rotation");
            Matrix matrix = this.A0g;
            float f2 = this.A0C;
            matrix.setScale(f2, f2);
            matrix.postRotate(this.A0B);
            matrix.invert(this.A0h);
            this.A0Y = false;
        }
    }

    private void A09(W3L w3l) {
        String str;
        if ("FacebookMapOptions.java".equals(w3l.A05)) {
            if (this instanceof IgRasterMapView) {
                str = "AbstractRasterMapView.java";
            } else {
                str = "MapView.java";
            }
            if (str.length() > 0) {
                w3l.A05 = str;
            }
        }
    }

    public static void A0B(C66356UBx c66356UBx) {
        C70394WTw c70394WTw = c66356UBx.A0M;
        WDS wds = ((ULX) c70394WTw.A0L).A09;
        if (wds.A03 == -1) {
            wds.A03 = 1;
        }
        c66356UBx.A0W = true;
        c70394WTw.A07();
        RunnableC71638Wxk runnableC71638Wxk = c66356UBx.A0Q;
        runnableC71638Wxk.A0E.removeCallbacks(runnableC71638Wxk);
        runnableC71638Wxk.A0A = false;
        runnableC71638Wxk.A05 = false;
        runnableC71638Wxk.A06 = true;
        runnableC71638Wxk.A0F.forceFinished(true);
        runnableC71638Wxk.A01 = 0.0f;
        runnableC71638Wxk.A00 = 0.0f;
    }

    public static void A0C(C66356UBx c66356UBx) {
        WDS wds = ((ULX) c66356UBx.A0M.A0L).A09;
        if (wds.A03 == -1) {
            wds.A03 = 1;
        }
        RunnableC71638Wxk runnableC71638Wxk = c66356UBx.A0Q;
        View view = runnableC71638Wxk.A0E;
        view.removeCallbacks(runnableC71638Wxk);
        runnableC71638Wxk.A06 = false;
        runnableC71638Wxk.A05 = true;
        view.postOnAnimation(runnableC71638Wxk);
    }

    public final double A0D(long j, double d) {
        double d2 = this.A01 * (this.A0K / j);
        double d3 = 1.0d - d2;
        if (d < d2) {
            return d2;
        }
        if (d > d3) {
            return d3;
        }
        return d;
    }

    public final void A0E(float f, float f2, float f3) {
        if (this.A0e) {
            WFW wfw = this.A0M.A0J;
            float[] fArr = this.A0n;
            wfw.A08(fArr, f2, f3);
            float f4 = fArr[0];
            float f5 = fArr[1];
            Matrix matrix = this.A0g;
            matrix.postRotate(f - this.A0B, f2, f3);
            matrix.invert(this.A0h);
            this.A0B = f % 360.0f;
            A04();
            A05(f2, f3, f4, f5);
        }
    }

    public final void A0F(X90 x90) {
        Queue queue;
        if (this.A0f && ((queue = this.A0S) == null || queue.isEmpty())) {
            x90.DR2(this.A0M);
            return;
        }
        Queue queue2 = this.A0S;
        if (queue2 == null) {
            queue2 = new LinkedList();
            this.A0S = queue2;
        }
        queue2.add(x90);
    }

    public final boolean A0H(float f, float f2, float f3) {
        WFW wfw = this.A0M.A0J;
        float[] fArr = this.A0n;
        wfw.A08(fArr, f2, f3);
        float f4 = fArr[0];
        float f5 = fArr[1];
        C70394WTw c70394WTw = this.A0M;
        float min = Math.min(Math.max(f, c70394WTw.A01), c70394WTw.A00);
        float f6 = (min % 1.0f) + 1.0f;
        int i = this.A0H;
        float f7 = f6 / this.A0C;
        this.A06 = f7;
        A06((int) min, f6);
        Matrix matrix = this.A0g;
        matrix.postScale(f7, f7, f2, f3);
        matrix.invert(this.A0h);
        A04();
        A05(f2, f3, f4, f5);
        if (this.A0H == i) {
            return false;
        }
        return true;
    }

    public final void D7y(Bundle bundle) {
        C70394WTw c70394WTw = new C70394WTw(this.A0N, this);
        this.A0M = c70394WTw;
        CameraPosition cameraPosition = this.A0N.A04;
        if (cameraPosition == null) {
            float f = c70394WTw.A01;
            A06((int) f, (f % 1.0f) + 1.0f);
        } else {
            float min = Math.min(Math.max(cameraPosition.A02, c70394WTw.A01), c70394WTw.A00);
            A06((int) min, (min % 1.0f) + 1.0f);
            LatLng latLng = cameraPosition.A03;
            if (latLng != null) {
                this.A02 = WFW.A01(latLng.A01);
                this.A03 = WFW.A00(latLng.A00);
            }
            this.A0B = cameraPosition.A00;
        }
        this.A0P = c70394WTw.A0K;
        Matrix matrix = this.A0g;
        float f2 = this.A0C;
        matrix.setScale(f2, f2);
        matrix.postRotate(this.A0B);
        matrix.invert(this.A0h);
        A08(bundle);
    }

    public EnumSet getCurrentAttribution() {
        return this.A0i;
    }

    @Deprecated
    public final C70394WTw getMap() {
        return this.A0M;
    }

    public final W3L getMapOptions() {
        return this.A0N;
    }

    public float getPixelSize() {
        return (float) this.A0K;
    }

    public float getTileScale() {
        return this.A0C;
    }

    public float getZoom() {
        return (this.A0H + this.A0C) - 1.0f;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            if (bundle.containsKey("zoom")) {
                if (bundle.containsKey("parentBundle")) {
                    super.onRestoreInstanceState(bundle.getParcelable("parentBundle"));
                }
                A08(bundle);
                return;
            }
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z = this.A0Y;
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (z) {
            return onSaveInstanceState;
        }
        Bundle bundle = new Bundle();
        if (!this.A0Y) {
            bundle.putDouble("xVisibleCenter", this.A02 + (0 / (this.A0K << 1)));
            bundle.putDouble("yVisibleCenter", this.A03 + (0 / (this.A0K << 1)));
            bundle.putInt("zoom", this.A0H);
            bundle.putFloat("scale", this.A0C);
            bundle.putFloat("rotation", this.A0B);
            this.A0Y = true;
        }
        bundle.putParcelable("parentBundle", onSaveInstanceState);
        return bundle;
    }

    public final void setMapEventHandler(InterfaceC72012XFa interfaceC72012XFa) {
        if (interfaceC72012XFa == null) {
            interfaceC72012XFa = InterfaceC72012XFa.A00;
        }
        this.A0R = interfaceC72012XFa;
    }

    public C66356UBx(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0i = EnumSet.of(EnumC68127VCl.A00);
        this.A0l = new Paint(2);
        this.A0D = -987675;
        this.A0m = new RectF();
        this.A0g = new Matrix();
        this.A0h = new Matrix();
        this.A0n = new float[2];
        this.A0o = new float[4];
        this.A0k = A01(this);
        this.A0j = new Q1k(this, 4);
        W3L A00 = W3L.A00(attributeSet);
        A09(A00);
        A07(context, A00);
    }

    private void A07(Context context, W3L w3l) {
        this.A0I = System.nanoTime();
        setWillNotDraw(false);
        this.A0a = context;
        this.A0N = w3l;
        boolean z = w3l.A08;
        w3l.A08 = z;
        int i = -987675;
        if (z) {
            i = -15789542;
        }
        this.A0D = i;
        C69493VoG c69493VoG = new C69493VoG(context, this);
        this.A0c = c69493VoG;
        Matrix matrix = this.A0h;
        c69493VoG.A0K = matrix;
        c69493VoG.A09 = 0.87f;
        c69493VoG.A07 = 0.85f;
        this.A0e = this.A0a.getPackageManager().hasSystemFeature("android.hardware.touchscreen.multitouch.distinct");
        this.A0Z = true;
        RunnableC71638Wxk runnableC71638Wxk = new RunnableC71638Wxk(this, this);
        this.A0Q = runnableC71638Wxk;
        runnableC71638Wxk.A04 = matrix;
        C2TD.A08.add(new WeakReference(this));
        C2TD.A01(false);
    }

    public final boolean A0G(float f, float f2, float f3) {
        if (A0H(f, f2, f3)) {
            this.A0M.A05();
        }
        return AbstractC167007dF.A1M((this.A06 > 1.0f ? 1 : (this.A06 == 1.0f ? 0 : -1)));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(985644278);
        super.onAttachedToWindow();
        if (this.A0M != null) {
            A02();
            this.A0L = System.nanoTime();
            if (!this.A0V) {
                C66535ULq c66535ULq = this.A0M.A0L.A03;
                ((WU2) c66535ULq).A01.set(0L);
                c66535ULq.A04.set(0L);
                c66535ULq.A05.set(0L);
                this.A0V = true;
            }
            C0f9.A0D(-761523511, A06);
            return;
        }
        RuntimeException runtimeException = new RuntimeException("MapView.onCreate() must be called!");
        C0f9.A0D(-512979122, A06);
        throw runtimeException;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A0M.A04();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(1407247971);
        super.onDetachedFromWindow();
        this.A0M.A04();
        Vector vector = W5O.A02;
        C70184WFm.A01(new C66524ULe());
        A03();
        C0f9.A0D(-1826184611, A06);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        long nanoTime = System.nanoTime();
        super.onDraw(canvas);
        canvas.drawColor(this.A0D);
        this.A0T = true;
        int size = this.A0M.A0O.size();
        for (int i = 0; i < size; i++) {
            AbstractC66278U6y abstractC66278U6y = (AbstractC66278U6y) this.A0M.A0O.get(i);
            if (abstractC66278U6y.A04) {
                abstractC66278U6y.A0D(canvas);
                if (abstractC66278U6y instanceof AbstractC66521ULb) {
                    this.A0T &= AbstractC167007dF.A1N(((ULX) abstractC66278U6y).A00);
                }
            }
        }
        if (this.A0T) {
            C70394WTw c70394WTw = this.A0M;
            if (c70394WTw.A0D != null) {
                c70394WTw.A06();
            }
            if (this.A0V) {
                ULp uLp = this.A0M.A0L;
                C42961yO.A0H.A05(new X24(uLp.A03, this.A0N.A06));
                this.A0V = false;
            }
        }
        long nanoTime2 = System.nanoTime();
        String str = this.A0N.A06;
        C42961yO.A0F.A02(nanoTime2 - nanoTime);
        if (this.A0I > 0) {
            C42961yO.A0G.A05(new X24(this, str, 0, nanoTime2));
            this.A0I = 0L;
        }
        if (this.A0L > 0) {
            C42961yO.A0I.A05(new X24(this, str, 1, nanoTime2));
            this.A0L = 0L;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c0, code lost:
    
        if (r1 != false) goto L8;
     */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66356UBx.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004b, code lost:
    
        if (java.lang.Math.abs(r7 - r3.A0B) <= r11) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x040c, code lost:
    
        if (r13 != 0.0f) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0086, code lost:
    
        if (java.lang.Math.abs(r7 - r3.A01) <= r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:179:0x013a A[Catch: all -> 0x050e, TryCatch #0 {all -> 0x050e, blocks: (B:3:0x000b, B:7:0x0032, B:9:0x0041, B:13:0x02b1, B:15:0x02be, B:17:0x02c5, B:19:0x02da, B:21:0x02e3, B:22:0x02f0, B:24:0x02f6, B:27:0x04d6, B:28:0x04ed, B:30:0x04f1, B:31:0x04f4, B:35:0x02fe, B:37:0x0302, B:39:0x0309, B:40:0x030e, B:42:0x0322, B:44:0x0326, B:46:0x033f, B:47:0x0341, B:49:0x034d, B:50:0x0356, B:55:0x0368, B:57:0x0379, B:59:0x037d, B:61:0x038e, B:62:0x0396, B:63:0x03bb, B:65:0x03ca, B:66:0x0399, B:67:0x039b, B:69:0x03a6, B:70:0x03aa, B:72:0x03b8, B:74:0x03d4, B:76:0x03e0, B:78:0x03f0, B:83:0x0411, B:85:0x0423, B:88:0x0435, B:92:0x043d, B:94:0x04b6, B:96:0x04bf, B:98:0x04c3, B:99:0x04cc, B:100:0x04cf, B:101:0x04d3, B:102:0x0441, B:104:0x0445, B:106:0x0453, B:108:0x047d, B:110:0x04aa, B:111:0x0485, B:113:0x048f, B:115:0x0497, B:117:0x04a5, B:118:0x04ac, B:120:0x04b0, B:121:0x04b3, B:123:0x03fe, B:132:0x0355, B:136:0x004d, B:139:0x0058, B:141:0x0062, B:143:0x006d, B:145:0x007c, B:147:0x0090, B:149:0x00a8, B:150:0x00ae, B:152:0x00d1, B:154:0x00db, B:162:0x00e9, B:164:0x00ed, B:159:0x00e5, B:168:0x00cb, B:169:0x0088, B:171:0x00f4, B:173:0x0103, B:175:0x0110, B:176:0x0122, B:177:0x0125, B:179:0x013a, B:181:0x0140, B:182:0x0145, B:184:0x0149, B:185:0x014e, B:187:0x0154, B:189:0x015f, B:191:0x016d, B:193:0x0178, B:195:0x018c, B:198:0x0193, B:200:0x0199, B:201:0x01be, B:203:0x01c2, B:205:0x01c6, B:206:0x01d7, B:208:0x01e3, B:210:0x01e7, B:212:0x01f1, B:214:0x01f5, B:215:0x0205, B:217:0x0209, B:219:0x0213, B:220:0x0223, B:222:0x0227, B:224:0x0251, B:226:0x025f, B:229:0x0286, B:233:0x028f, B:235:0x0295, B:238:0x029e, B:240:0x02a4), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0149 A[Catch: all -> 0x050e, TryCatch #0 {all -> 0x050e, blocks: (B:3:0x000b, B:7:0x0032, B:9:0x0041, B:13:0x02b1, B:15:0x02be, B:17:0x02c5, B:19:0x02da, B:21:0x02e3, B:22:0x02f0, B:24:0x02f6, B:27:0x04d6, B:28:0x04ed, B:30:0x04f1, B:31:0x04f4, B:35:0x02fe, B:37:0x0302, B:39:0x0309, B:40:0x030e, B:42:0x0322, B:44:0x0326, B:46:0x033f, B:47:0x0341, B:49:0x034d, B:50:0x0356, B:55:0x0368, B:57:0x0379, B:59:0x037d, B:61:0x038e, B:62:0x0396, B:63:0x03bb, B:65:0x03ca, B:66:0x0399, B:67:0x039b, B:69:0x03a6, B:70:0x03aa, B:72:0x03b8, B:74:0x03d4, B:76:0x03e0, B:78:0x03f0, B:83:0x0411, B:85:0x0423, B:88:0x0435, B:92:0x043d, B:94:0x04b6, B:96:0x04bf, B:98:0x04c3, B:99:0x04cc, B:100:0x04cf, B:101:0x04d3, B:102:0x0441, B:104:0x0445, B:106:0x0453, B:108:0x047d, B:110:0x04aa, B:111:0x0485, B:113:0x048f, B:115:0x0497, B:117:0x04a5, B:118:0x04ac, B:120:0x04b0, B:121:0x04b3, B:123:0x03fe, B:132:0x0355, B:136:0x004d, B:139:0x0058, B:141:0x0062, B:143:0x006d, B:145:0x007c, B:147:0x0090, B:149:0x00a8, B:150:0x00ae, B:152:0x00d1, B:154:0x00db, B:162:0x00e9, B:164:0x00ed, B:159:0x00e5, B:168:0x00cb, B:169:0x0088, B:171:0x00f4, B:173:0x0103, B:175:0x0110, B:176:0x0122, B:177:0x0125, B:179:0x013a, B:181:0x0140, B:182:0x0145, B:184:0x0149, B:185:0x014e, B:187:0x0154, B:189:0x015f, B:191:0x016d, B:193:0x0178, B:195:0x018c, B:198:0x0193, B:200:0x0199, B:201:0x01be, B:203:0x01c2, B:205:0x01c6, B:206:0x01d7, B:208:0x01e3, B:210:0x01e7, B:212:0x01f1, B:214:0x01f5, B:215:0x0205, B:217:0x0209, B:219:0x0213, B:220:0x0223, B:222:0x0227, B:224:0x0251, B:226:0x025f, B:229:0x0286, B:233:0x028f, B:235:0x0295, B:238:0x029e, B:240:0x02a4), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03b8 A[Catch: all -> 0x050e, TryCatch #0 {all -> 0x050e, blocks: (B:3:0x000b, B:7:0x0032, B:9:0x0041, B:13:0x02b1, B:15:0x02be, B:17:0x02c5, B:19:0x02da, B:21:0x02e3, B:22:0x02f0, B:24:0x02f6, B:27:0x04d6, B:28:0x04ed, B:30:0x04f1, B:31:0x04f4, B:35:0x02fe, B:37:0x0302, B:39:0x0309, B:40:0x030e, B:42:0x0322, B:44:0x0326, B:46:0x033f, B:47:0x0341, B:49:0x034d, B:50:0x0356, B:55:0x0368, B:57:0x0379, B:59:0x037d, B:61:0x038e, B:62:0x0396, B:63:0x03bb, B:65:0x03ca, B:66:0x0399, B:67:0x039b, B:69:0x03a6, B:70:0x03aa, B:72:0x03b8, B:74:0x03d4, B:76:0x03e0, B:78:0x03f0, B:83:0x0411, B:85:0x0423, B:88:0x0435, B:92:0x043d, B:94:0x04b6, B:96:0x04bf, B:98:0x04c3, B:99:0x04cc, B:100:0x04cf, B:101:0x04d3, B:102:0x0441, B:104:0x0445, B:106:0x0453, B:108:0x047d, B:110:0x04aa, B:111:0x0485, B:113:0x048f, B:115:0x0497, B:117:0x04a5, B:118:0x04ac, B:120:0x04b0, B:121:0x04b3, B:123:0x03fe, B:132:0x0355, B:136:0x004d, B:139:0x0058, B:141:0x0062, B:143:0x006d, B:145:0x007c, B:147:0x0090, B:149:0x00a8, B:150:0x00ae, B:152:0x00d1, B:154:0x00db, B:162:0x00e9, B:164:0x00ed, B:159:0x00e5, B:168:0x00cb, B:169:0x0088, B:171:0x00f4, B:173:0x0103, B:175:0x0110, B:176:0x0122, B:177:0x0125, B:179:0x013a, B:181:0x0140, B:182:0x0145, B:184:0x0149, B:185:0x014e, B:187:0x0154, B:189:0x015f, B:191:0x016d, B:193:0x0178, B:195:0x018c, B:198:0x0193, B:200:0x0199, B:201:0x01be, B:203:0x01c2, B:205:0x01c6, B:206:0x01d7, B:208:0x01e3, B:210:0x01e7, B:212:0x01f1, B:214:0x01f5, B:215:0x0205, B:217:0x0209, B:219:0x0213, B:220:0x0223, B:222:0x0227, B:224:0x0251, B:226:0x025f, B:229:0x0286, B:233:0x028f, B:235:0x0295, B:238:0x029e, B:240:0x02a4), top: B:2:0x000b }] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r23) {
        /*
            Method dump skipped, instructions count: 1315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66356UBx.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        int A06 = C0f9.A06(1534762860);
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            A02();
        } else {
            A03();
        }
        C0f9.A0D(1664356537, A06);
    }

    public void setOnFirstTileLoadedCallback(X7H x7h) {
        this.A0b = x7h;
    }

    public C66356UBx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0i = EnumSet.of(EnumC68127VCl.A00);
        this.A0l = new Paint(2);
        this.A0D = -987675;
        this.A0m = new RectF();
        this.A0g = new Matrix();
        this.A0h = new Matrix();
        this.A0n = new float[2];
        this.A0o = new float[4];
        this.A0k = A01(this);
        this.A0j = new Q1k(this, 4);
        W3L A00 = W3L.A00(attributeSet);
        A09(A00);
        A07(context, A00);
    }

    public C66356UBx(Context context, W3L w3l) {
        super(context);
        this.A0i = EnumSet.of(EnumC68127VCl.A00);
        this.A0l = new Paint(2);
        this.A0D = -987675;
        this.A0m = new RectF();
        this.A0g = new Matrix();
        this.A0h = new Matrix();
        this.A0n = new float[2];
        this.A0o = new float[4];
        this.A0k = A01(this);
        this.A0j = new Q1k(this, 4);
        A09(w3l);
        A07(context, w3l);
    }

    public C66356UBx(Context context) {
        super(context);
        this.A0i = EnumSet.of(EnumC68127VCl.A00);
        this.A0l = new Paint(2);
        this.A0D = -987675;
        this.A0m = new RectF();
        this.A0g = new Matrix();
        this.A0h = new Matrix();
        this.A0n = new float[2];
        this.A0o = new float[4];
        this.A0k = A01(this);
        this.A0j = new Q1k(this, 4);
        W3L w3l = new W3L();
        A09(w3l);
        A07(context, w3l);
    }
}
