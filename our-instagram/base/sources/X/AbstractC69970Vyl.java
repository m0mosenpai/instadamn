package X;

import com.instagram.reels.question.model.responsetype.QuestionResponseType;

/* renamed from: X.Vyl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69970Vyl {
    public static final QuestionResponseType A00(EnumC68151VDv enumC68151VDv) {
        int A05 = AbstractC25227BEk.A05(enumC68151VDv, 0);
        if (A05 != 1) {
            if (A05 != 2) {
                if (A05 != 3) {
                    if (A05 != 4) {
                        return QuestionResponseType.A08;
                    }
                    return QuestionResponseType.A04;
                }
                return QuestionResponseType.A05;
            }
            return QuestionResponseType.A06;
        }
        return QuestionResponseType.A07;
    }

    public static final EnumC68151VDv A01(QuestionResponseType questionResponseType) {
        int A05 = AbstractC25227BEk.A05(questionResponseType, 0);
        if (A05 != 4) {
            if (A05 != 3) {
                if (A05 != 2) {
                    if (A05 != 1) {
                        return EnumC68151VDv.A08;
                    }
                    return EnumC68151VDv.A04;
                }
                return EnumC68151VDv.A05;
            }
            return EnumC68151VDv.A06;
        }
        return EnumC68151VDv.A07;
    }
}
