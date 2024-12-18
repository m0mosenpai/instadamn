package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.1eK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31151eK extends AbstractC29011ae {
    public static final C1OZ A02 = new C1OZ() { // from class: X.1eL
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C14360o3.A0B(c16l, 0);
            C31151eK parseFromJson = AbstractC46978Kpx.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            C31151eK c31151eK = (C31151eK) obj;
            anonymousClass182.A0d();
            if (c31151eK.A00 != null) {
                anonymousClass182.A0r("interactive_sticker");
                C26069Bfx c26069Bfx = c31151eK.A00;
                if (c26069Bfx != null) {
                    anonymousClass182.A0d();
                    String str = c26069Bfx.A03;
                    if (str != null) {
                        anonymousClass182.A0S("text", str);
                    }
                    String str2 = c26069Bfx.A02;
                    if (str2 != null) {
                        anonymousClass182.A0S("interactive_user_id", str2);
                    }
                    String str3 = c26069Bfx.A00;
                    if (str3 != null) {
                        anonymousClass182.A0S("interactive_sticker_id", str3);
                    }
                    String str4 = c26069Bfx.A01;
                    if (str4 != null) {
                        anonymousClass182.A0S("interactive_sticker_type", str4);
                    }
                    anonymousClass182.A0a();
                    String str5 = c31151eK.A01;
                    if (str5 != null) {
                        anonymousClass182.A0S("question_response_type", str5);
                    }
                    AbstractC47856LCb.A00(anonymousClass182, c31151eK);
                    anonymousClass182.A0a();
                    return;
                }
            }
            C14360o3.A0F("interactiveSticker");
            throw C00O.createAndThrow();
        }
    };
    public C26069Bfx A00;
    public String A01;

    @Override // X.C1OW
    public final String A02() {
        return "send_story_interaction_reply_text";
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        return C2EY.A0z;
    }

    @Override // X.AbstractC29011ae
    public final /* bridge */ /* synthetic */ Object A05() {
        List singletonList = Collections.singletonList(AbstractC47996LLi.A00());
        C14360o3.A07(singletonList);
        return singletonList;
    }
}
