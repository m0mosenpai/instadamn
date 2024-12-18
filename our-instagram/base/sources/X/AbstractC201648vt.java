package X;

import com.instagram.reels.question.model.responsetype.QuestionResponseType;

/* renamed from: X.8vt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC201648vt {
    public static final QuestionResponseType A00(String str) {
        QuestionResponseType questionResponseType = (QuestionResponseType) QuestionResponseType.A01.get(str);
        if (questionResponseType == null) {
            return QuestionResponseType.A08;
        }
        return questionResponseType;
    }
}
