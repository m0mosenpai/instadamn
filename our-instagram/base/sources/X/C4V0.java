package X;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.4V0, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4V0 {
    public int A00;
    public int A01;
    public int A02;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public HashMap A0G;
    public HashSet A0H;
    public List A0I;
    public List A0J;
    public List A0K;
    public List A0L;
    public List A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public int A06 = Integer.MAX_VALUE;
    public int A05 = Integer.MAX_VALUE;
    public int A04 = Integer.MAX_VALUE;
    public int A03 = Integer.MAX_VALUE;
    public int A0F = Integer.MAX_VALUE;
    public int A0E = Integer.MAX_VALUE;
    public boolean A0Q = true;

    public C4V0 A02(int i, int i2, boolean z) {
        this.A0F = i;
        this.A0E = i2;
        this.A0Q = true;
        return this;
    }

    public final C4V0 A03(Context context, boolean z) {
        Display defaultDisplay;
        Point point;
        String str;
        String[] split;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager == null || (defaultDisplay = displayManager.getDisplay(0)) == null) {
            Object systemService = context.getSystemService("window");
            systemService.getClass();
            defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        }
        if (defaultDisplay.getDisplayId() == 0 && Util.A0H(context)) {
            String A00 = AbstractC58317Pt9.A00(1037);
            try {
                Class<?> cls = Class.forName(AbstractC111324zv.A00(1914));
                str = (String) cls.getMethod("get", String.class).invoke(cls, A00);
            } catch (Exception e) {
                AbstractC46512Bo.A05("Util", AnonymousClass001.A0R(AbstractC58317Pt9.A00(558), A00), e);
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                try {
                    split = str.trim().split("x", -1);
                } catch (NumberFormatException unused) {
                }
                if (split.length == 2) {
                    int parseInt = Integer.parseInt(split[0]);
                    int parseInt2 = Integer.parseInt(split[1]);
                    if (parseInt > 0 && parseInt2 > 0) {
                        point = new Point(parseInt, parseInt2);
                        A02(point.x, point.y, true);
                        return this;
                    }
                }
                AbstractC46512Bo.A03("Util", AnonymousClass001.A0R(AbstractC58317Pt9.A00(575), str));
            }
            if ("Sony".equals(Util.A03) && Util.A04.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature(AbstractC58317Pt9.A00(734))) {
                point = new Point(3840, 2160);
                A02(point.x, point.y, true);
                return this;
            }
        }
        point = new Point();
        Display.Mode mode = defaultDisplay.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
        A02(point.x, point.y, true);
        return this;
    }

    public C4V0 A04(String str) {
        String[] strArr;
        if (str == null) {
            strArr = new String[0];
        } else {
            strArr = new String[]{str};
        }
        A05(strArr);
        return this;
    }

    public final void A07(String str) {
        if (C2C5.A02(C2C1.A0c)) {
            A04(str);
        } else if (str == null) {
            A05(new String[0]);
        } else {
            this.A0I = C4VT.A00(str);
        }
    }

    public final void A08(String str) {
        List A00;
        String[] strArr;
        if (C2C5.A02(C2C1.A0c)) {
            if (str != null) {
                strArr = new String[]{str};
                A00 = A01(strArr);
                this.A0L = A00;
            }
        } else if (str != null) {
            A00 = C4VT.A00(str);
            this.A0L = A00;
        }
        strArr = new String[0];
        A00 = A01(strArr);
        this.A0L = A00;
    }

    @Deprecated
    public C4V0() {
        C16930sl c16930sl = C16930sl.A00;
        this.A0M = c16930sl;
        this.A0D = 0;
        this.A0L = c16930sl;
        this.A0I = c16930sl;
        this.A0B = 0;
        this.A02 = Integer.MAX_VALUE;
        this.A01 = Integer.MAX_VALUE;
        this.A0J = c16930sl;
        this.A0K = c16930sl;
        this.A0C = 0;
        this.A00 = 0;
        this.A0P = false;
        this.A0O = false;
        this.A0N = false;
        this.A0G = new HashMap();
        this.A0H = new HashSet();
    }

    public static ImmutableList A01(String[] strArr) {
        ImmutableList.Builder builder = ImmutableList.builder();
        strArr.getClass();
        int length = strArr.length;
        for (int i = 0; i < length; i = 1) {
            String str = strArr[i];
            str.getClass();
            builder.add((Object) Util.A0C(str));
        }
        return builder.build();
    }

    public C4V0 A05(String... strArr) {
        this.A0I = A01(strArr);
        return this;
    }

    public C4V0 A06(String... strArr) {
        this.A0K = A01(strArr);
        return this;
    }
}
