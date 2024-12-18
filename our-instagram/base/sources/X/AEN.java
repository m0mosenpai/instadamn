package X;

import com.instagram.reels.question.model.responsetype.QuestionResponseType;
import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class AEN {
    /* JADX WARN: Type inference failed for: r1v0, types: [X.A9c, java.lang.Object] */
    public static C22932A9c parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("original_question_id".equals(A0s)) {
                    obj.A02 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC111324zv.A00(508).equals(A0s)) {
                    obj.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("question_responder_id".equals(A0s)) {
                    obj.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("is_clips_v2_media".equals(A0s)) {
                    obj.A01 = AbstractC166997dE.A0d(c16l);
                } else if (AbstractC43591JPw.A00(453).equals(A0s)) {
                    obj.A00 = AbstractC201648vt.A00(AbstractC167017dG.A0m(c16l));
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C22932A9c c22932A9c) {
        anonymousClass182.A0d();
        String str = c22932A9c.A02;
        if (str != null) {
            anonymousClass182.A0S("original_question_id", str);
        }
        String str2 = c22932A9c.A04;
        if (str2 != null) {
            anonymousClass182.A0S(AbstractC111324zv.A00(508), str2);
        }
        String str3 = c22932A9c.A03;
        if (str3 != null) {
            anonymousClass182.A0S("question_responder_id", str3);
        }
        Boolean bool = c22932A9c.A01;
        if (bool != null) {
            anonymousClass182.A0T("is_clips_v2_media", bool.booleanValue());
        }
        QuestionResponseType questionResponseType = c22932A9c.A00;
        if (questionResponseType != null) {
            anonymousClass182.A0S(AbstractC43591JPw.A00(453), questionResponseType.A00);
        }
        anonymousClass182.A0a();
    }
}
