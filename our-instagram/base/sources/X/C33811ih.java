package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.1ih, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33811ih extends AbstractC29011ae {
    public static final C1OZ A02 = new C1OZ() { // from class: X.1ii
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C14360o3.A0B(c16l, 0);
            C33811ih parseFromJson = AbstractC46946KpR.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            C33811ih c33811ih = (C33811ih) obj;
            anonymousClass182.A0d();
            c33811ih.A07();
            anonymousClass182.A0r("note_reply");
            C47709L4q A07 = c33811ih.A07();
            anonymousClass182.A0d();
            anonymousClass182.A0R("note_igid", A07.A00);
            String str = A07.A05;
            if (str != null) {
                anonymousClass182.A0S("sticker_id", str);
            }
            anonymousClass182.A0T("is_random", A07.A06);
            anonymousClass182.A0T("is_sticker", A07.A07);
            String str2 = A07.A03;
            if (str2 != null) {
                anonymousClass182.A0S("note_author_username", str2);
            }
            String str3 = A07.A04;
            if (str3 != null) {
                anonymousClass182.A0S("note_text", str3);
            }
            if (A07.A01 != null) {
                anonymousClass182.A0r("profile_pic_url");
                C17Y.A00(anonymousClass182, A07.A01);
            }
            if (A07.A02 != null) {
                anonymousClass182.A0r("gif_url");
                C54X.A00(anonymousClass182, A07.A02);
            }
            anonymousClass182.A0a();
            AbstractC47856LCb.A00(anonymousClass182, c33811ih);
            anonymousClass182.A0a();
        }
    };
    public C47709L4q A00;
    public String A01;

    @Override // X.C1OW
    public final String A02() {
        return "notes_send_animated_media_response";
    }

    public final C47709L4q A07() {
        C47709L4q c47709L4q = this.A00;
        if (c47709L4q != null) {
            return c47709L4q;
        }
        C14360o3.A0F("noteReply");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        return C2EY.A0z;
    }

    @Override // X.AbstractC29011ae
    public final /* bridge */ /* synthetic */ Object A05() {
        List singletonList = Collections.singletonList(AbstractC47996LLi.A0C(A07().A01, A07().A03, A07().A04));
        C14360o3.A07(singletonList);
        return singletonList;
    }
}
