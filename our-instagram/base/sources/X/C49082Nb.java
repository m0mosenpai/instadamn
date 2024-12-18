package X;

import com.facebook.common.stringformat.StringFormatUtil;
import java.util.List;

/* renamed from: X.2Nb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49082Nb {
    public final InterfaceC02550Ad A00;
    public final String A01;
    public final String A02;

    public final void A01(String str, Throwable th, List list) {
        C14360o3.A0B(th, 2);
        String str2 = this.A01;
        if (str2 != null) {
            C18920wW c18920wW = (C18920wW) this.A00;
            InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "client_bind_trusteddevice_fail");
            if (A00.isSampled()) {
                C0Zx c0Zx = new C0Zx();
                c0Zx.A06("family_device_id", str2);
                c0Zx.A06("same_app_key", str);
                c0Zx.A07("cross_app_keys", list);
                A00.AAQ(c0Zx, "event_payload");
                A00.AAP("error_message", String.valueOf(th.getMessage()));
                A00.AAP("error_stacktrace", C2Ql.A00(th));
                A00.AAP(AbstractC58346Ptm.A00(), C2O0.A00);
                A00.AAP("product_type", AbstractC49212Oa.A00);
                A00.AAP("platform", "android");
                A00.A9K("actual_event_time", Long.valueOf(System.currentTimeMillis()));
                A00.Cht();
            }
        }
    }

    public final void A02(List list, List list2, String str) {
        String str2 = this.A01;
        if (str2 != null) {
            C18920wW c18920wW = (C18920wW) this.A00;
            InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "client_bind_trusteddevice_success");
            if (A00.isSampled()) {
                C0Zx c0Zx = new C0Zx();
                c0Zx.A06("family_device_id", str2);
                c0Zx.A06("same_app_key", str);
                c0Zx.A07("cross_app_keys", list);
                c0Zx.A07("bound_keys", list2);
                c0Zx.A03("is_cache_hit", false);
                A00.AAQ(c0Zx, "event_payload");
                A00.AAP(AbstractC58346Ptm.A00(), C2O0.A00);
                A00.AAP("product_type", AbstractC49212Oa.A00);
                A00.AAP("platform", "android");
                A00.A9K("actual_event_time", Long.valueOf(System.currentTimeMillis()));
                A00.Cht();
            }
        }
    }

    public final void A00(String str, Throwable th) {
        String str2 = this.A01;
        if (str2 != null) {
            C18920wW c18920wW = (C18920wW) this.A00;
            InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "client_register_trusteddevice_fail");
            if (A00.isSampled()) {
                C0Zx c0Zx = new C0Zx();
                c0Zx.A06("family_device_id", str2);
                c0Zx.A06("dev_pub_key", str);
                A00.AAQ(c0Zx, "event_payload");
                A00.AAP("error_message", String.valueOf(th.getMessage()));
                A00.AAP("error_stacktrace", C2Ql.A00(th));
                A00.AAP(AbstractC58346Ptm.A01(9, 10, 62), C2O0.A00);
                A00.AAP("product_type", AbstractC49212Oa.A00);
                A00.AAP("platform", "android");
                A00.A9K("actual_event_time", Long.valueOf(System.currentTimeMillis()));
                A00.Cht();
            }
        }
    }

    public C49082Nb(InterfaceC02550Ad interfaceC02550Ad, String str) {
        this.A00 = interfaceC02550Ad;
        this.A01 = str;
        String valueOf = String.valueOf(System.currentTimeMillis());
        String obj = C0HM.A00().toString();
        C14360o3.A07(obj);
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("%s_%s_%s", "upl", valueOf, obj);
        C14360o3.A07(formatStrLocaleSafe);
        this.A02 = formatStrLocaleSafe;
        C2O0.A00 = formatStrLocaleSafe;
        C2OZ.A00(C2O5.A0J);
    }
}
