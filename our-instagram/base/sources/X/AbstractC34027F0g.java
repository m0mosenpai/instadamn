package X;

import android.os.Bundle;

/* renamed from: X.F0g, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34027F0g {
    public static final Bundle A00(C45126Jxv c45126Jxv, Integer num, String str) {
        Bundle A0C = AbstractC31177DnL.A0C(num);
        A0C.putInt("ux_flow_linking_code", num.intValue());
        A0C.putString("ux_flow_entrypoint", str);
        if (c45126Jxv != null) {
            Number number = (Number) c45126Jxv.A00;
            if (number != null) {
                A0C.putInt("ux_flow_flow", number.intValue());
            }
            String str2 = c45126Jxv.A03;
            if (str2 != null) {
                A0C.putString("ux_flow_page_id", str2);
            }
            String str3 = c45126Jxv.A01;
            if (str3 != null) {
                A0C.putString("back_stack_tag", str3);
            }
        }
        return A0C;
    }
}
