package X;

import androidx.fragment.app.FragmentActivity;
import com.facebookpay.paypal.model.LinkableTextParams;
import com.facebookpay.paypal.model.PaypalConsentLaunchParams;
import java.util.Map;

/* renamed from: X.S3x, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62252S3x {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        AbstractC10360h2 supportFragmentManager;
        C6FG A09 = C6BQ.A09(c6fq);
        Object A02 = c6fw.A02();
        C14360o3.A0C(A02, "null cannot be cast to non-null type kotlin.String");
        String str = (String) A02;
        String A0n = AbstractC31176DnK.A0n(c6fw, "null cannot be cast to non-null type kotlin.String");
        String A0o = AbstractC31176DnK.A0o(c6fw, "null cannot be cast to non-null type kotlin.String", 3);
        String A0o2 = AbstractC31176DnK.A0o(c6fw, "null cannot be cast to non-null type kotlin.String", 4);
        String A0o3 = AbstractC31176DnK.A0o(c6fw, "null cannot be cast to non-null type kotlin.String", 5);
        String A0o4 = AbstractC31176DnK.A0o(c6fw, "null cannot be cast to non-null type kotlin.String", 6);
        String A0o5 = AbstractC31176DnK.A0o(c6fw, "null cannot be cast to non-null type kotlin.String", 7);
        Object A03 = c6fw.A03(8);
        C14360o3.A0C(A03, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
        Map map = (Map) A03;
        String A0o6 = AbstractC31176DnK.A0o(c6fw, "null cannot be cast to non-null type kotlin.String", 9);
        String A0o7 = AbstractC31176DnK.A0o(c6fw, "null cannot be cast to non-null type kotlin.String", 10);
        InterfaceC103384lE A0I = AbstractC31175DnJ.A0I(c6fw, 11);
        InterfaceC103384lE A0I2 = AbstractC31175DnJ.A0I(c6fw, 12);
        FragmentActivity A032 = C6BQ.A03(A09);
        C14360o3.A0B(map, 0);
        Map map2 = (Map) AbstractC58321PtD.A0o("ranges", "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>", map);
        String str2 = (String) AbstractC58321PtD.A0o("text", "null cannot be cast to non-null type kotlin.String", map);
        Object obj = map2.get("length");
        String A00 = AbstractC111324zv.A00(488);
        LinkableTextParams linkableTextParams = new LinkableTextParams(str2, AbstractC25230BEn.A0D(obj, A00), AbstractC25230BEn.A0D(map2.get("offset"), A00), (String) AbstractC58321PtD.A0o("url", "null cannot be cast to non-null type kotlin.String", map2));
        C2FP.A01();
        if (A032 != null && (supportFragmentManager = A032.getSupportFragmentManager()) != null) {
            C63406Sjd.A0B(AbstractC62193S1o.A00(supportFragmentManager, new PaypalConsentLaunchParams(null, linkableTextParams, str, A0n, A0o, A0o5, A0o3, A0o4, A0o2, A0o6, A0o7, false)), new C63626SqY(c6fq, A0I, A0I2, 13));
            return null;
        }
        throw AbstractC166987dD.A12("Input fragment or fragmentActivity cannot be null");
    }
}
