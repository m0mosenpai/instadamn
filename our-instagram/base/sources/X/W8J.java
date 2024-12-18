package X;

import android.graphics.BlendMode;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;

/* loaded from: classes11.dex */
public abstract class W8J {
    public static final C69496VpR A00 = new Object();

    public static final BlendMode A00(int i) {
        if (i == 0) {
            return BlendMode.CLEAR;
        }
        if (i == 1) {
            return BlendMode.SRC;
        }
        if (i != 3) {
            if (i == 4) {
                return BlendMode.DST_OVER;
            }
            if (i == 5) {
                return BlendMode.SRC_IN;
            }
            if (i == 6) {
                return BlendMode.DST_IN;
            }
            if (i == 7) {
                return BlendMode.SRC_OUT;
            }
            if (i == 8) {
                return BlendMode.DST_OUT;
            }
            if (i == 9) {
                return BlendMode.SRC_ATOP;
            }
            if (i == 10) {
                return BlendMode.DST_ATOP;
            }
            if (i == 11) {
                return BlendMode.XOR;
            }
            if (i == 16) {
                return BlendMode.DARKEN;
            }
            if (i == 17) {
                return BlendMode.LIGHTEN;
            }
            if (i == 13) {
                return BlendMode.MULTIPLY;
            }
            if (i == 14) {
                return BlendMode.SCREEN;
            }
            if (i == 15) {
                return BlendMode.OVERLAY;
            }
        }
        return BlendMode.SRC_OVER;
    }

    public static final void A01(int i, Paint paint) {
        PorterDuff.Mode mode;
        if (Build.VERSION.SDK_INT >= 29) {
            BlendMode A002 = A00(i);
            if (paint.getBlendMode() != A002) {
                paint.setBlendMode(A002);
                return;
            }
            return;
        }
        if (i == 0) {
            mode = PorterDuff.Mode.CLEAR;
        } else if (i == 1) {
            mode = PorterDuff.Mode.SRC;
        } else {
            if (i != 3) {
                if (i == 4) {
                    mode = PorterDuff.Mode.DST_OVER;
                } else if (i == 5) {
                    mode = PorterDuff.Mode.SRC_IN;
                } else if (i == 6) {
                    mode = PorterDuff.Mode.DST_IN;
                } else if (i == 7) {
                    mode = PorterDuff.Mode.SRC_OUT;
                } else if (i == 8) {
                    mode = PorterDuff.Mode.DST_OUT;
                } else if (i == 9) {
                    mode = PorterDuff.Mode.SRC_ATOP;
                } else if (i == 10) {
                    mode = PorterDuff.Mode.DST_ATOP;
                } else if (i == 11) {
                    mode = PorterDuff.Mode.XOR;
                } else if (i == 16) {
                    mode = PorterDuff.Mode.DARKEN;
                } else if (i == 17) {
                    mode = PorterDuff.Mode.LIGHTEN;
                } else if (i == 13) {
                    mode = PorterDuff.Mode.MULTIPLY;
                } else if (i == 14) {
                    mode = PorterDuff.Mode.SCREEN;
                } else if (i == 15) {
                    mode = PorterDuff.Mode.OVERLAY;
                }
            }
            mode = PorterDuff.Mode.SRC_OVER;
        }
        PorterDuffXfermode porterDuffXfermode = new PorterDuffXfermode(mode);
        if (C14360o3.A0K(paint.getXfermode(), porterDuffXfermode)) {
            return;
        }
        paint.setXfermode(porterDuffXfermode);
    }
}
