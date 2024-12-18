package X;

import android.os.Build;

/* loaded from: classes6.dex */
public abstract class F0H {
    public static final C19280xC A00(Integer num) {
        int i;
        C1QE A01 = C1QE.A01("business_signup_flow");
        switch (num.intValue()) {
            case 0:
                i = 2013;
                break;
            case 1:
                i = 2016;
                break;
            case 2:
                i = 2017;
                break;
            case 3:
                i = 2018;
                break;
            case 4:
                i = 2014;
                break;
            default:
                i = 2015;
                break;
        }
        C19280xC A04 = A01.A04(AbstractC111324zv.A00(i));
        A04.A08(Integer.valueOf(Build.VERSION.SDK_INT), "api_level");
        return A04;
    }
}
