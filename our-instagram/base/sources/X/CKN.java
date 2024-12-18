package X;

/* loaded from: classes5.dex */
public abstract class CKN {
    public static final void A00(C18920wW c18920wW, String str, int i, boolean z, boolean z2) {
        C14360o3.A0B(c18920wW, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c18920wW, "ig_blank_screen");
        if (A0f.isSampled()) {
            A0f.AAP("ad_id", "n/a");
            A0f.AAP("ad_page_type", str);
            A0f.A9K("ad_media_type", Long.valueOf(i));
            A0f.A7v("is_blank_screen_detection_attempted", Boolean.valueOf(z));
            A0f.A7v("is_blank_screen_detected", Boolean.valueOf(z2));
            A0f.AAP("blank_screen_failure_reason", "n/a");
            A0f.Cht();
        }
    }
}
