package X;

import android.content.Context;
import com.facebook.R;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.6RQ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6RQ {
    public static final /* synthetic */ EnumEntries A04;
    public static final /* synthetic */ C6RQ[] A05;
    public static final C6RQ A06;
    public static final C6RQ A07;
    public static final C6RQ A08;
    public static final C6RQ A09;
    public static final C6RQ A0A;
    public static final C6RQ A0B;
    public static final C6RQ A0C;
    public final int A00;
    public final EnumC15950qp A01;
    public final boolean A02;
    public final int[] A03;

    static {
        EnumC15950qp enumC15950qp = EnumC15950qp.A0Y;
        int color = AbstractC12290kX.A00.getColor(R.color.design_dark_default_color_on_background);
        Context context = AbstractC12290kX.A00;
        int color2 = context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_text_on_white));
        Context context2 = AbstractC12290kX.A00;
        A06 = new C6RQ(enumC15950qp, "DEFAULT", new int[]{color2, context2.getColor(AbstractC53242c7.A0H(context2, R.attr.igds_color_text_on_white))}, 0, color, false);
        A0B = new C6RQ(enumC15950qp, "SUBTLE", new int[]{AbstractC12290kX.A00.getColor(R.color.design_dark_default_color_on_background), AbstractC12290kX.A00.getColor(R.color.design_dark_default_color_on_background)}, 1, AbstractC12290kX.A00.getColor(R.color.sticker_subtle_light_background), false);
        A0A = new C6RQ(enumC15950qp, "RAINBOW", C50R.A01, 2, AbstractC12290kX.A00.getColor(R.color.design_dark_default_color_on_background), false);
        EnumC15950qp enumC15950qp2 = EnumC15950qp.A0V;
        int color3 = AbstractC12290kX.A00.getColor(R.color.design_dark_default_color_on_background);
        Context context3 = AbstractC12290kX.A00;
        int color4 = context3.getColor(AbstractC53242c7.A0H(context3, R.attr.igds_color_text_on_white));
        Context context4 = AbstractC12290kX.A00;
        A07 = new C6RQ(enumC15950qp2, "HERO", new int[]{color4, context4.getColor(AbstractC53242c7.A0H(context4, R.attr.igds_color_text_on_white))}, 3, color3, true);
        int color5 = AbstractC12290kX.A00.getColor(R.color.design_dark_default_color_on_background);
        Context context5 = AbstractC12290kX.A00;
        int color6 = context5.getColor(AbstractC53242c7.A0H(context5, R.attr.igds_color_text_on_white));
        Context context6 = AbstractC12290kX.A00;
        A0C = new C6RQ(enumC15950qp2, "VIBRANT", new int[]{color6, context6.getColor(AbstractC53242c7.A0H(context6, R.attr.igds_color_text_on_white))}, 4, color5, true);
        int color7 = AbstractC12290kX.A00.getColor(R.color.design_dark_default_color_on_background);
        Context context7 = AbstractC12290kX.A00;
        int color8 = context7.getColor(AbstractC53242c7.A0H(context7, R.attr.igds_color_text_on_white));
        Context context8 = AbstractC12290kX.A00;
        A09 = new C6RQ(enumC15950qp2, "MONOTONE", new int[]{color8, context8.getColor(AbstractC53242c7.A0H(context8, R.attr.igds_color_text_on_white))}, 5, color7, true);
        C6RQ c6rq = new C6RQ(enumC15950qp2, "HIDDEN", new int[]{AbstractC12290kX.A00.getColor(R.color.design_dark_default_color_on_background), AbstractC12290kX.A00.getColor(R.color.design_dark_default_color_on_background)}, 6, AbstractC12290kX.A00.getColor(R.color.sticker_subtle_light_background), false);
        A08 = c6rq;
        C6RQ[] c6rqArr = {A06, A0B, A0A, A07, A0C, A09, c6rq};
        A05 = c6rqArr;
        A04 = AbstractC12190kN.A00(c6rqArr);
    }

    public static C6RQ valueOf(String str) {
        return (C6RQ) Enum.valueOf(C6RQ.class, str);
    }

    public static C6RQ[] values() {
        return (C6RQ[]) A05.clone();
    }

    public C6RQ(EnumC15950qp enumC15950qp, String str, int[] iArr, int i, int i2, boolean z) {
        this.A02 = z;
        this.A01 = enumC15950qp;
        this.A00 = i2;
        this.A03 = iArr;
    }
}
