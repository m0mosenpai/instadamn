package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;

/* renamed from: X.WEw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70174WEw {
    public static boolean A0C = true;
    public static BitmapFactory.Options A0E;
    public int A00;
    public int A01;
    public Bitmap A05;
    public BitmapFactory.Options A08;
    public static final Bitmap A0F = Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8);
    public static final W5O A0H = new W5O(32);
    public static final W5O A0G = new W5O(20);
    public static Bitmap.Config A0D = Bitmap.Config.ARGB_8888;
    public int A04 = -1;
    public int A02 = -1;
    public int A03 = -1;
    public final C70174WEw[] A09 = new C70174WEw[4];
    public C70174WEw A07 = null;
    public C70174WEw A06 = null;
    public volatile int A0B = 0;
    public final AbstractRunnableC71645Wxs A0A = new C66529ULj(this);

    public static C70174WEw A00(byte[] bArr, int i) {
        Bitmap A00;
        C70174WEw c70174WEw = new C70174WEw(-1, -1);
        if (A0C) {
            BitmapFactory.Options options = c70174WEw.A08;
            if (options.inBitmap == null) {
                options.inBitmap = (Bitmap) A0H.A00();
            }
        }
        try {
            BitmapFactory.Options options2 = c70174WEw.A08;
            A00 = C0fL.A00(bArr, 0, i, options2);
            c70174WEw.A05 = A00;
            if (A0C) {
                options2.inBitmap = null;
            }
        } catch (IllegalArgumentException e) {
            C42961yO.A08.A04(e);
            A0C = false;
            BitmapFactory.Options options3 = c70174WEw.A08;
            options3.inBitmap.recycle();
            options3.inBitmap = null;
            A0H.A01();
            A00 = C0fL.A00(bArr, 0, i, options3);
            c70174WEw.A05 = A00;
        }
        if (A00 == null) {
            c70174WEw.A03();
            return null;
        }
        c70174WEw.A01 = A00.getWidth();
        c70174WEw.A00 = c70174WEw.A05.getHeight();
        return c70174WEw;
    }

    public static synchronized void A01(C70174WEw c70174WEw) {
        synchronized (c70174WEw) {
            Bitmap bitmap = c70174WEw.A05;
            if (bitmap != null && bitmap != A0F) {
                if (bitmap.getConfig() == Bitmap.Config.ARGB_8888) {
                    A0G.A02(c70174WEw.A05);
                } else if (A0C) {
                    A0H.A02(c70174WEw.A05);
                } else {
                    c70174WEw.A05.recycle();
                }
            }
            c70174WEw.A05 = null;
        }
    }

    public final synchronized Bitmap A02() {
        return this.A05;
    }

    public final void A03() {
        this.A01 = -1;
        this.A00 = -1;
        for (int i = 0; i < 4; i++) {
            this.A09[i] = null;
        }
        A01(this);
        this.A0B = 0;
        this.A06 = null;
        this.A07 = null;
        this.A02 = -1;
        this.A03 = -1;
        this.A04 = -1;
    }

    public final synchronized String toString() {
        StringBuilder sb;
        String str;
        sb = new StringBuilder();
        sb.append(AbstractC31173DnH.A0q(this));
        sb.append(" {x=");
        sb.append(this.A02);
        sb.append(", y=");
        sb.append(this.A03);
        sb.append(", zoom=");
        sb.append(this.A04);
        sb.append(", status=");
        sb.append(this.A0B);
        sb.append("}");
        if (this.A05 == null) {
            str = "x";
        } else {
            str = "o";
        }
        return AbstractC166997dE.A0x(str, sb);
    }

    public C70174WEw(int i, int i2) {
        this.A00 = -1;
        this.A01 = -1;
        this.A01 = i;
        this.A00 = i2;
        if (!A0C) {
            BitmapFactory.Options options = A0E;
            if (options == null) {
                options = new BitmapFactory.Options();
                A0E = options;
                options.inPreferredConfig = Bitmap.Config.RGB_565;
            }
            this.A08 = options;
            return;
        }
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        this.A08 = options2;
        options2.inSampleSize = 1;
        options2.inPreferredConfig = A0D;
        options2.inMutable = true;
    }

    public final void A04() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            this.A0B = 0;
            if (this.A06 == null && this.A07 == null) {
                A03();
                return;
            }
            return;
        }
        C70184WFm.A01.post(this.A0A);
    }
}
