package X;

import com.facebook.R;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class VEQ {
    public static final /* synthetic */ EnumEntries A03;
    public static final /* synthetic */ VEQ[] A04;
    public static final VEQ A05;
    public static final VEQ A06;
    public static final VEQ A07;
    public static final VEQ A08;
    public final int A00;
    public final Integer A01;
    public final Integer A02;

    public static VEQ valueOf(String str) {
        return (VEQ) Enum.valueOf(VEQ.class, str);
    }

    public static VEQ[] values() {
        return (VEQ[]) A04.clone();
    }

    static {
        VEQ veq = new VEQ(null, null, "DEFAULT", 0, R.attr.fbpay_divider_color);
        A06 = veq;
        VEQ veq2 = new VEQ(null, null, "FOCUS", 1, R.attr.fbpay_focus_color);
        A08 = veq2;
        VEQ veq3 = new VEQ(null, null, "BOX_INPUT_FOCUS", 2, R.attr.fbpay_box_input_focus_color);
        A05 = veq3;
        VEQ veq4 = new VEQ(46, 6, "ERROR", 3, R.attr.fbpay_error_text_color);
        A07 = veq4;
        VEQ[] veqArr = {veq, veq2, veq3, veq4};
        A04 = veqArr;
        A03 = AbstractC12190kN.A00(veqArr);
    }

    public VEQ(Integer num, Integer num2, String str, int i, int i2) {
        this.A00 = i2;
        this.A02 = num;
        this.A01 = num2;
    }
}
