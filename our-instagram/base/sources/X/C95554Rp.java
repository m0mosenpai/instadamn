package X;

import java.util.Map;

/* renamed from: X.4Rp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C95554Rp {
    public static final void A00(InterfaceC02550Ad interfaceC02550Ad, C95804So c95804So, C42351xP c42351xP, String str, String str2) {
        C14360o3.A0B(c42351xP, 1);
        if (c42351xP.A06) {
            C18920wW c18920wW = (C18920wW) interfaceC02550Ad;
            InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "media_playback_compound_debug");
            if (A00.isSampled() && c95804So != null) {
                A00.AAQ(c95804So, "required_metadata");
                A00.AAP("log_category", str);
                A00.AAP("error_type", str2);
                A00.AAP("error_message", "");
                A00.Cht();
            }
        }
    }

    public final String A01(C95804So c95804So, long j) {
        if (c95804So == null) {
            return "client_metadata_provider_missing";
        }
        Number number = 0L;
        Map map = c95804So.A00;
        C14360o3.A07(map);
        if ((map.containsKey("media_id") && (number = (Number) map.get("media_id")) == null) || j != number.longValue()) {
            return "client_media_id_mismatch";
        }
        return null;
    }
}
