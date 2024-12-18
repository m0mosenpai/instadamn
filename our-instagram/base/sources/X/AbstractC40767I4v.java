package X;

import java.util.Locale;

/* renamed from: X.I4v, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40767I4v {
    public static final C19280xC A00(InterfaceC11380iw interfaceC11380iw, String str, String str2, String str3, String str4, String str5) {
        C19280xC A00 = C19280xC.A00(interfaceC11380iw, "profile_tagging_bio_link_click");
        A00.A0C("link_type", str);
        A00.A0C("link_id", str3);
        A00.A0C("link_text", str4);
        A00.A0C(AbstractC111324zv.A00(263), str5);
        A00.A07(AbstractC128995sK.A01, str3);
        A00.A07(AbstractC128995sK.A02, str4);
        C11500j9 c11500j9 = AbstractC128995sK.A06;
        Locale locale = Locale.ENGLISH;
        C14360o3.A08(locale);
        A00.A07(c11500j9, AbstractC31172DnG.A16(locale, str2));
        return A00;
    }
}
