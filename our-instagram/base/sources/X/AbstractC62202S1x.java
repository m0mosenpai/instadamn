package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.S1x, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62202S1x {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        C6FG c6fg = c6fq.A03;
        Object A02 = c6fw.A02();
        C14360o3.A0C(A02, "null cannot be cast to non-null type kotlin.String");
        String str = (String) A02;
        String A0n = AbstractC31176DnK.A0n(c6fw, "null cannot be cast to non-null type kotlin.String");
        String A0o = AbstractC31176DnK.A0o(c6fw, "null cannot be cast to non-null type kotlin.String", 3);
        Object A03 = c6fw.A03(4);
        String A00 = AbstractC111324zv.A00(8);
        C14360o3.A0C(A03, A00);
        List list = (List) A03;
        Object A032 = c6fw.A03(5);
        C14360o3.A0C(A032, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
        Map map = (Map) A032;
        Object A033 = c6fw.A03(6);
        C14360o3.A0C(A033, A00);
        List list2 = (List) A033;
        String A0o2 = AbstractC31176DnK.A0o(c6fw, "null cannot be cast to non-null type kotlin.String", 7);
        InterfaceC103384lE A0I = AbstractC31175DnJ.A0I(c6fw, 8);
        InterfaceC103384lE A0I2 = AbstractC31175DnJ.A0I(c6fw, 9);
        Object A034 = c6fw.A03(10);
        C14360o3.A0C(A034, "null cannot be cast to non-null type kotlin.Boolean");
        Boolean bool = (Boolean) A034;
        if (A0o != null && A0o.equals("VERIFY_FACTOR") && (str.equals("SMS_OTP") || str.equals("MFT_SMS_OTP") || str.equals("MFT_RECOVERY_CODE"))) {
            C14360o3.A0A(c6fg);
            AbstractC63312ShK.A03(c6fg.A00, new T38(c6fq, A0I, A0I2, 2), str, A0n, A0o2, list, list2, map);
            return null;
        }
        C14360o3.A0A(c6fg);
        AbstractC63312ShK.A02(c6fg.A00, new T38(c6fq, A0I, A0I2, 3), bool, str, A0o, A0n, null, null, A0o2, list, list2, map);
        return null;
    }
}
