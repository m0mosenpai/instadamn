package X;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextUtils;
import java.util.WeakHashMap;

/* renamed from: X.93D, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C93D {
    public static final TextUtils.TruncateAt[] A02 = TextUtils.TruncateAt.values();
    public static final C93E A00 = C93E.TEXT_START;
    public static final WeakHashMap A01 = new WeakHashMap();

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001b, code lost:
    
        if (r1 != 8388613) goto L3;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:1:0x0000. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C93E A00(int r0, int r1) {
        /*
            switch(r0) {
                case 0: goto L6;
                case 1: goto L6;
                case 2: goto L21;
                case 3: goto L1e;
                case 4: goto L30;
                case 5: goto L27;
                case 6: goto L24;
                default: goto L3;
            }
        L3:
            X.93E r0 = X.C93D.A00
            return r0
        L6:
            r0 = 8388615(0x800007, float:1.1754953E-38)
            r1 = r1 & r0
            r0 = 1
            if (r1 == r0) goto L30
            r0 = 3
            if (r1 == r0) goto L2d
            r0 = 5
            if (r1 == r0) goto L2a
            r0 = 8388611(0x800003, float:1.1754948E-38)
            if (r1 == r0) goto L27
            r0 = 8388613(0x800005, float:1.175495E-38)
            if (r1 == r0) goto L24
            goto L3
        L1e:
            X.93E r0 = X.C93E.TEXT_END
            return r0
        L21:
            X.93E r0 = X.C93E.TEXT_START
            return r0
        L24:
            X.93E r0 = X.C93E.LAYOUT_END
            return r0
        L27:
            X.93E r0 = X.C93E.LAYOUT_START
            return r0
        L2a:
            X.93E r0 = X.C93E.RIGHT
            return r0
        L2d:
            X.93E r0 = X.C93E.LEFT
            return r0
        L30:
            X.93E r0 = X.C93E.CENTER
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93D.A00(int, int):X.93E");
    }

    public static C93F A01(Context context) {
        C93F c93f;
        Resources.Theme theme = context.getTheme();
        WeakHashMap weakHashMap = A01;
        synchronized (weakHashMap) {
            c93f = (C93F) weakHashMap.get(theme);
        }
        if (c93f == null) {
            C93F c93f2 = new C93F();
            C1LN.A01("LoadTextStyle");
            Resources.Theme theme2 = context.getTheme();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, C93H.A01, 0, 0);
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            obtainStyledAttributes.recycle();
            if (resourceId != -1) {
                TypedArray obtainStyledAttributes2 = theme2.obtainStyledAttributes(resourceId, C93H.A00);
                A02(obtainStyledAttributes2, c93f2);
                obtainStyledAttributes2.recycle();
            }
            TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(null, C93H.A02, 0, 0);
            int resourceId2 = obtainStyledAttributes3.getResourceId(0, -1);
            obtainStyledAttributes3.recycle();
            if (resourceId2 != -1) {
                TypedArray obtainStyledAttributes4 = theme2.obtainStyledAttributes(resourceId2, C93H.A00);
                A02(obtainStyledAttributes4, c93f2);
                obtainStyledAttributes4.recycle();
            }
            C1LN.A00();
            synchronized (weakHashMap) {
                weakHashMap.put(theme, c93f2);
            }
            return c93f2;
        }
        return c93f;
    }

    public static void A02(TypedArray typedArray, C93F c93f) {
        C93G c93g;
        int indexCount = typedArray.getIndexCount();
        int i = 1;
        int i2 = 0;
        for (int i3 = 0; i3 < indexCount; i3++) {
            int index = typedArray.getIndex(i3);
            if (index == 2) {
                c93f.A0R = typedArray.getColorStateList(index);
                c93f.A0O = 0;
            } else if (index == 0) {
                c93f.A0P = typedArray.getDimensionPixelSize(index, 0);
            } else if (index == 5) {
                int integer = typedArray.getInteger(index, 0);
                if (integer > 0) {
                    c93f.A0T = A02[integer - 1];
                }
            } else if (index == 25) {
                i = typedArray.getInt(index, -1);
                c93f.A0V = A00(i, i2);
            } else if (index == 6) {
                i2 = typedArray.getInt(index, -1);
                c93f.A0V = A00(i, i2);
                int i4 = i2 & 112;
                if (i4 != 16) {
                    if (i4 != 48 && i4 == 80) {
                        c93g = C93G.BOTTOM;
                    } else {
                        c93g = C93G.TOP;
                    }
                } else {
                    c93g = C93G.CENTER;
                }
                c93f.A0X = c93g;
            } else if (index == 15) {
                c93f.A0a = typedArray.getBoolean(index, false);
            } else if (index == 11) {
                c93f.A0L = typedArray.getInteger(index, -1);
            } else if (index == 10) {
                c93f.A0I = typedArray.getInteger(index, -1);
            } else if (index == 14) {
                c93f.A0b = typedArray.getBoolean(index, false);
            } else if (index == 4) {
                c93f.A0E = typedArray.getColor(index, 0);
            } else if (index == 3) {
                c93f.A0A = typedArray.getColor(index, 0);
            } else if (index == 1) {
                c93f.A0Q = typedArray.getInteger(index, 0);
            } else if (index == 20) {
                c93f.A05 = typedArray.getDimensionPixelOffset(index, 0);
            } else if (index == 21) {
                c93f.A04 = typedArray.getFloat(index, 0.0f);
            } else if (index == 17) {
                c93f.A06 = typedArray.getFloat(index, 0.0f);
            } else if (index == 18) {
                c93f.A07 = typedArray.getFloat(index, 0.0f);
            } else if (index == 19) {
                c93f.A08 = typedArray.getFloat(index, 0.0f);
            } else if (index == 16) {
                c93f.A0N = typedArray.getColor(index, 0);
            } else if (index == 13) {
                c93f.A0K = typedArray.getInteger(index, -1);
            } else if (index == 12) {
                c93f.A0H = typedArray.getInteger(index, -1);
            } else if (index == 8) {
                c93f.A0M = typedArray.getDimensionPixelSize(index, 0);
            } else if (index == 7) {
                c93f.A0J = typedArray.getDimensionPixelSize(index, Integer.MAX_VALUE);
            } else if (index == 24) {
                String string = typedArray.getString(index);
                if (string != null) {
                    c93f.A0S = Typeface.create(string, 0);
                }
            } else if (index == 26) {
                c93f.A09 = typedArray.getInt(index, 0);
            } else if (index == 27) {
                c93f.A0C = typedArray.getInt(index, 0);
            } else if (index == 28) {
                c93f.A0D = typedArray.getInt(index, 0);
            }
        }
    }
}
