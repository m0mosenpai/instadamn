package X;

import com.facebook.proxygen.TraceFieldType;

/* loaded from: classes11.dex */
public abstract class VT8 {
    public static void A00(AbstractC12990ll abstractC12990ll, Integer num, Integer num2, String str, int i) {
        String str2;
        if (num.intValue() != 1) {
            str2 = "ig_emergency_push_did_set_initial_version";
        } else {
            str2 = "ig_emergency_push_did_error";
        }
        C19280xC A01 = C19280xC.A01(str2, null);
        A01.A08(Integer.valueOf(i), AbstractC111324zv.A00(2228));
        if (str != null) {
            A01.A0C(TraceFieldType.Error, str);
        }
        if (num2 != null) {
            A01.A08(num2, "failed_version");
        }
        AbstractC11060iN.A00(abstractC12990ll).EIu(A01);
    }
}
