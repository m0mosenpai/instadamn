package X;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.4kq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC103154kq {
    public Drawable A00(C6FG c6fg, C102884kP c102884kP, C102884kP c102884kP2) {
        C135606Bl c135606Bl;
        String A00;
        String str;
        GradientDrawable.Orientation orientation;
        int[] iArr;
        Drawable A002;
        Drawable A003;
        int i = c102884kP.A05;
        if (i != 13318) {
            if (i != 13322) {
                if (i != 13330) {
                    if (i != 13332) {
                        if (i != 13340) {
                            return new ColorDrawable();
                        }
                        c135606Bl = null;
                        try {
                            C102884kP A08 = c102884kP.A08(35);
                            if (A08 == null) {
                                return null;
                            }
                            c135606Bl = AbstractC135596Bk.A01(c6fg, c102884kP2, C6BK.A00(c6fg, A08, 0));
                            return c135606Bl;
                        } catch (C41M e) {
                            e = e;
                            A00 = "ThemedColorDrawableUtils";
                            str = "Parse error for ThemedColorDrawable";
                        }
                    } else {
                        StateListDrawable stateListDrawable = new StateListDrawable();
                        Drawable[] drawableArr = new Drawable[6];
                        List A0N = c102884kP.A0N(35);
                        for (int i2 = 0; i2 < A0N.size(); i2++) {
                            C102884kP c102884kP3 = (C102884kP) A0N.get(i2);
                            C102884kP A082 = c102884kP3.A08(35);
                            if (A082 == null) {
                                AbstractC25241Le.A02("StateDrawableUtils", "Null Drawable model when creating children of a StateDrawable");
                                A003 = new ColorDrawable();
                            } else {
                                A003 = C1LZ.A00().A02.A00(c6fg, A082, c102884kP2);
                            }
                            String str2 = "";
                            String A0L = c102884kP3.A0L(36);
                            if (A0L != null) {
                                str2 = A0L;
                            }
                            switch (str2.hashCode()) {
                                case -691041417:
                                    if (str2.equals("focused")) {
                                        drawableArr[1] = A003;
                                        break;
                                    } else {
                                        break;
                                    }
                                case -318264286:
                                    if (str2.equals("pressed")) {
                                        drawableArr[3] = A003;
                                        break;
                                    } else {
                                        break;
                                    }
                                case 270940796:
                                    if (str2.equals("disabled")) {
                                        drawableArr[4] = A003;
                                        break;
                                    } else {
                                        break;
                                    }
                                case 1191572123:
                                    if (str2.equals("selected")) {
                                        drawableArr[2] = A003;
                                        break;
                                    } else {
                                        break;
                                    }
                                case 1544803905:
                                    if (str2.equals(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT)) {
                                        drawableArr[0] = A003;
                                        break;
                                    } else {
                                        break;
                                    }
                            }
                        }
                        int i3 = 5;
                        do {
                            Drawable drawable = drawableArr[i3];
                            if (drawable != null) {
                                stateListDrawable.addState(U5B.A00[i3], drawable);
                            }
                            i3--;
                        } while (i3 >= 0);
                        return stateListDrawable;
                    }
                } else {
                    C102884kP A083 = c102884kP.A08(35);
                    if (A083 == null) {
                        AbstractC25241Le.A02("RippleDrawableUtils", "Client received a RippleDrawable with null content");
                    }
                    if (A083 == null) {
                        A002 = new ColorDrawable();
                    } else {
                        A002 = C1LZ.A00().A02.A00(c6fg, A083, c102884kP2);
                    }
                    ShapeDrawable shapeDrawable = null;
                    if (c102884kP2 != null) {
                        float[] fArr = new float[8];
                        try {
                            String A0L2 = c102884kP2.A0L(46);
                            float f = 0.0f;
                            if (A0L2 != null) {
                                f = C6BE.A01(A0L2);
                            }
                            Arrays.fill(fArr, f);
                        } catch (C41M unused) {
                            AbstractC25241Le.A02("RippleDrawableUtils", "Error parsing Corner radius for Box decoration");
                            Arrays.fill(fArr, 0.0f);
                        }
                        shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
                    }
                    return new RippleDrawable(ColorStateList.valueOf(Color.parseColor(c102884kP.A0I())), A002, shapeDrawable);
                }
            } else {
                C102884kP A084 = c102884kP.A08(35);
                C102884kP A085 = c102884kP.A08(36);
                if (A084 != null && A085 != null) {
                    C102884kP A086 = c102884kP.A08(38);
                    String A0L3 = c102884kP.A0L(40);
                    try {
                        if (A0L3 == null) {
                            orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                        } else {
                            orientation = C6BE.A09(A0L3);
                        }
                    } catch (C41M e2) {
                        AbstractC25241Le.A00(c6fg, "GradientDrawableUtils", "Error parsing orientation for GradientDrawable", e2);
                        orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                    }
                    int A004 = C6BK.A00(c6fg, A084, 0);
                    int A005 = C6BK.A00(c6fg, A085, 0);
                    if (A086 != null) {
                        iArr = new int[]{A004, C6BK.A00(c6fg, A086, 0), A005};
                    } else {
                        iArr = new int[]{A004, A005};
                    }
                    GradientDrawable gradientDrawable = new GradientDrawable(orientation, iArr);
                    if (c102884kP2 == null) {
                        return gradientDrawable;
                    }
                    try {
                        String A0L4 = c102884kP2.A0L(46);
                        float f2 = 0.0f;
                        if (A0L4 != null) {
                            f2 = C6BE.A01(A0L4);
                        }
                        float[] fArr2 = new float[8];
                        AbstractC135616Bm.A01(fArr2, f2, AbstractC135616Bm.A00(c102884kP2.A0O(56), 15));
                        gradientDrawable.setCornerRadii(fArr2);
                        return gradientDrawable;
                    } catch (C41M unused2) {
                        AbstractC25241Le.A02("GradientDrawableUtils", "Error parsing Corner radius for Box decoration");
                        return gradientDrawable;
                    }
                }
                throw new RuntimeException("Gradient drawable received with null begin or end color");
            }
        } else {
            c135606Bl = null;
            try {
                String A0L5 = c102884kP.A0L(35);
                if (A0L5 == null) {
                    return null;
                }
                c135606Bl = AbstractC135596Bk.A01(c6fg, c102884kP2, C6BE.A03(A0L5));
                return c135606Bl;
            } catch (C41M e3) {
                e = e3;
                A00 = AbstractC111324zv.A00(3541);
                str = "Error parsing color for ColorDrawable";
            }
        }
        AbstractC25241Le.A00(c6fg, A00, str, e);
        return c135606Bl;
    }
}
