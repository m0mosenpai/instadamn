package X;

import android.content.Context;
import com.facebook.common.dextricks.Constants;

/* loaded from: classes5.dex */
public abstract class BX3 {
    public static final C2YM A01(Context context, BX7 bx7, BX4 bx4, CharSequence charSequence, InterfaceC16660sJ interfaceC16660sJ, long j) {
        return new C2YM(new BX5(bx4, charSequence), new C2YP(AbstractC25227BEk.A0d(BXD.A00, AbstractC25230BEn.A07(2, bx4, bx7), false), null, new C50372MLz(10, bx7, interfaceC16660sJ, bx4, context), j));
    }

    public static final int A00(BXC bxc, Integer num, boolean z) {
        int i;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 131073;
        }
        if ((i & 15) == 1) {
            int ordinal = bxc.ordinal();
            if (ordinal != 1) {
                if (ordinal == 2) {
                    i = (i | Constants.LOAD_RESULT_PGO) & (-524289);
                }
            } else {
                i = (i & (-32769)) | Constants.LOAD_RESULT_WITH_VDEX_ODEX;
            }
        }
        if (z) {
            return i & (-131073);
        }
        return i;
    }
}
