package X;

/* loaded from: classes10.dex */
public abstract class S5P {
    public static final void A00(AbstractC12990ll abstractC12990ll, String str, String str2, String str3) {
        String A10 = AbstractC58320PtC.A10(abstractC12990ll);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(abstractC12990ll), "instagram_android_install_with_referrer");
        if (str2 != null) {
            A0f.AAP("error", str2);
        }
        if (A10 != null) {
            A0f.AAP("pigeon_session_id", A10);
        }
        A0f.AAP("family_device_id", str3);
        A0f.AAP("waterfall_id", C1Q9.A01());
        A0f.AAP("containermodule", "install_referrer");
        A0f.AAP("referrer", str);
        A0f.Cht();
    }
}
