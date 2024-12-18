package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;

/* renamed from: X.93F, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C93F implements Cloneable {
    public ColorStateList A0R;
    public Typeface A0S;
    public TextUtils.TruncateAt A0T;
    public InterfaceC78793fl A0U;
    public CharSequence A0Y;
    public String A0Z;
    public boolean A0c;
    public boolean A0a = true;
    public int A0L = Integer.MIN_VALUE;
    public int A0I = Integer.MAX_VALUE;
    public int A0K = -1;
    public int A0H = -1;
    public int A0M = 0;
    public int A0J = Integer.MAX_VALUE;
    public float A08 = 0.0f;
    public float A06 = 0.0f;
    public float A07 = 0.0f;
    public int A0N = -7829368;
    public boolean A0b = false;
    public int A0O = -16777216;
    public int A0E = -16776961;
    public int A0P = -1;
    public float A05 = 0.0f;
    public float A03 = Float.MAX_VALUE;
    public float A04 = 1.0f;
    public float A02 = 0.0f;
    public int A0Q = Typeface.DEFAULT.getStyle();
    public C93E A0V = C93E.TEXT_START;
    public int A09 = -1;
    public int A0C = 0;
    public int A0D = 0;
    public C93G A0X = C93G.TOP;
    public int A0A = 0;
    public int A0B = 0;
    public boolean A0d = false;
    public boolean A0e = false;
    public int A0F = Integer.MIN_VALUE;
    public int A0G = Integer.MIN_VALUE;
    public float A00 = 0.0f;
    public float A01 = 0.0f;
    public A80 A0W = null;

    public static void A01(C93F c93f, Integer num) {
        C93E c93e;
        if (num != null) {
            int intValue = num.intValue();
            if (intValue != 1) {
                if (intValue != 8388611 && intValue == 8388613) {
                    c93e = C93E.TEXT_END;
                } else {
                    c93e = C93E.TEXT_START;
                }
            } else {
                c93e = C93E.CENTER;
            }
            c93f.A0V = c93e;
        }
    }

    public static C93F A00(Context context) {
        C93F A02 = C93D.A01(context).A02();
        A02.A0d = true;
        A02.A0A = 0;
        return A02;
    }

    public final C93F A02() {
        try {
            return (C93F) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
