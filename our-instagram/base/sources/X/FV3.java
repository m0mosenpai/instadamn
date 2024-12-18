package X;

import com.instagram.model.direct.DirectThreadKey;

/* loaded from: classes6.dex */
public abstract class FV3 {
    public static void A01(C16L c16l, AbstractC33951iv abstractC33951iv, String str) {
        if ("thread_key".equals(str)) {
            DirectThreadKey parseFromJson = AbstractC83623o5.parseFromJson(c16l);
            C14360o3.A0B(parseFromJson, 0);
            abstractC33951iv.A02 = parseFromJson;
        } else {
            if (AbstractC43591JPw.A00(338).equals(str)) {
                abstractC33951iv.A01 = AbstractC47865LCl.parseFromJson(c16l);
                return;
            }
            if ("prompt_id".equals(str)) {
                abstractC33951iv.A03 = AbstractC167017dG.A0m(c16l);
                return;
            }
            if ("prompt_type".equals(str)) {
                abstractC33951iv.A00 = c16l.A1D();
            } else if ("question_response_text".equals(str)) {
                abstractC33951iv.A04 = AbstractC167017dG.A0m(c16l);
            } else {
                AbstractC47856LCb.A01(c16l, abstractC33951iv, str);
            }
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, AbstractC33951iv abstractC33951iv) {
        abstractC33951iv.A07();
        anonymousClass182.A0r("thread_key");
        AbstractC83623o5.A00(anonymousClass182, abstractC33951iv.A07());
        if (abstractC33951iv.A01 != null) {
            anonymousClass182.A0r(AbstractC43591JPw.A00(338));
            AbstractC47865LCl.A00(anonymousClass182, abstractC33951iv.A01);
        }
        String str = abstractC33951iv.A03;
        if (str != null) {
            anonymousClass182.A0S("prompt_id", str);
        }
        anonymousClass182.A0Q("prompt_type", abstractC33951iv.A00);
        String str2 = abstractC33951iv.A04;
        if (str2 != null) {
            anonymousClass182.A0S("question_response_text", str2);
        }
        AbstractC47856LCb.A00(anonymousClass182, abstractC33951iv);
    }
}
