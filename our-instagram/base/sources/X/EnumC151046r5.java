package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.6r5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC151046r5 {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC151046r5[] A02;
    public static final EnumC151046r5 A03;
    public static final EnumC151046r5 A04;
    public static final EnumC151046r5 A05;
    public static final EnumC151046r5 A06;
    public static final EnumC151046r5 A07;
    public static final EnumC151046r5 A08;
    public final int A00;

    static {
        EnumC151046r5 enumC151046r5 = new EnumC151046r5("SMALL", 0, 0);
        A07 = enumC151046r5;
        EnumC151046r5 enumC151046r52 = new EnumC151046r5("LARGE", 1, 1);
        A04 = enumC151046r52;
        EnumC151046r5 enumC151046r53 = new EnumC151046r5("X_SMALL", 2, 2);
        A08 = enumC151046r53;
        EnumC151046r5 enumC151046r54 = new EnumC151046r5("HORIZONTAL_LARGE", 3, 3);
        A03 = enumC151046r54;
        EnumC151046r5 enumC151046r55 = new EnumC151046r5("MEDIUM", 4, 4);
        A05 = enumC151046r55;
        EnumC151046r5 enumC151046r56 = new EnumC151046r5("MEDIUM_LARGE", 5, 5);
        A06 = enumC151046r56;
        EnumC151046r5[] enumC151046r5Arr = {enumC151046r5, enumC151046r52, enumC151046r53, enumC151046r54, enumC151046r55, enumC151046r56};
        A02 = enumC151046r5Arr;
        A01 = AbstractC12190kN.A00(enumC151046r5Arr);
    }

    public static EnumC151046r5 valueOf(String str) {
        return (EnumC151046r5) Enum.valueOf(EnumC151046r5.class, str);
    }

    public static EnumC151046r5[] values() {
        return (EnumC151046r5[]) A02.clone();
    }

    public final float A00(Context context) {
        int i = this.A00;
        int i2 = 2;
        if (i != 2) {
            if (i == 0) {
                i2 = 8;
            } else {
                if (i != 4) {
                    if (i == 3) {
                        i2 = 10;
                    } else if (i == 5) {
                        i2 = 12;
                    }
                }
                return AbstractC13880nE.A04(context, 14);
            }
        }
        return AbstractC13880nE.A04(context, i2);
    }

    public final float A01(Context context, Drawable drawable) {
        float f;
        int i;
        float A042;
        int i2;
        float A043;
        if (drawable != null) {
            int i3 = this.A00;
            if (i3 == 2) {
                A043 = AbstractC13880nE.A04(context, 8);
            } else {
                if (i3 == 0) {
                    i2 = 16;
                } else {
                    i2 = 24;
                    if (i3 == 4) {
                        i2 = 20;
                    }
                }
                A043 = AbstractC13880nE.A04(context, i2);
            }
            f = (A043 - drawable.getIntrinsicWidth()) / 2.0f;
        } else {
            f = 0.0f;
        }
        int i4 = this.A00;
        if (i4 == 2) {
            i = 6;
        } else {
            if (i4 == 0) {
                A042 = AbstractC13880nE.A04(context, 8);
                return A042 + f;
            }
            i = 10;
            if (i4 == 4) {
                i = 12;
            }
        }
        A042 = AbstractC13880nE.A04(context, i);
        return A042 + f;
    }

    public EnumC151046r5(String str, int i, int i2) {
        this.A00 = i2;
    }
}
