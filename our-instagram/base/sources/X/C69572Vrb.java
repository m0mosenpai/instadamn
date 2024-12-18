package X;

import com.facebook.proxygen.TraceFieldType;
import java.util.Map;

/* renamed from: X.Vrb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69572Vrb {
    public final InterfaceC02550Ad A00;
    public final String A01 = AbstractC58442PvL.A02();
    public final InterfaceC09390do A02 = AbstractC09440dt.A00(EnumC09460dv.A02, X4L.A00);

    public final void A00(Exception exc, String str, String str2, Map map) {
        String str3;
        String message;
        InterfaceC02590Ai A0H = MSY.A0H(this.A00, "client_copy_autofillproof_fail");
        if (A0H.isSampled()) {
            C0Zx c0Zx = new C0Zx();
            Boolean A0a = AbstractC166997dE.A0a();
            c0Zx.A03("legacy_key_migration_should_retry", A0a);
            c0Zx.A03("cross_app_migration_should_retry", A0a);
            c0Zx.A06("legacy_key_migration_status", str);
            c0Zx.A06("cross_app_migration_status", str2);
            A0H.AAP(AbstractC63083Sc6.A00(), this.A01);
            A0H.A8R(C2O5.A04, "product_type");
            A0H.A8R(EnumC31203Dnm.ANDROID, "platform");
            C14360o3.A07(this.A02.getValue());
            A0H.A9K("actual_event_time", AbstractC31173DnH.A0g());
            A0H.AAQ(c0Zx, "event_payload");
            A0H.A9M("extra_data", map);
            String str4 = "";
            if (exc == null || ((str3 = exc.getMessage()) == null && (str3 = exc.toString()) == null)) {
                str3 = "";
            }
            A0H.AAP(TraceFieldType.ErrorCode, str3);
            if (exc != null && ((message = exc.getMessage()) != null || (message = exc.toString()) != null)) {
                str4 = message;
            }
            A0H.AAP("error_message", str4);
            A0H.Cht();
        }
    }

    public C69572Vrb(InterfaceC02550Ad interfaceC02550Ad) {
        this.A00 = interfaceC02550Ad;
    }
}
