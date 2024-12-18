package X;

import android.graphics.Color;
import com.instagram.reels.question.model.QuestionResponseModelIntf;
import com.instagram.reels.question.model.QuestionResponsesModelIntf;
import com.instagram.user.model.User;

/* renamed from: X.IbJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41628IbJ {
    public QuestionResponseModelIntf A00;
    public final QuestionResponsesModelIntf A01;

    public static User A00(C41628IbJ c41628IbJ) {
        return c41628IbJ.A00.CDj();
    }

    public final int A01() {
        QuestionResponsesModelIntf questionResponsesModelIntf = this.A01;
        C14360o3.A0B(questionResponsesModelIntf, 0);
        return Color.parseColor(questionResponsesModelIntf.getBackgroundColor());
    }

    public final String A02() {
        if (this.A00.Bog() != null) {
            return this.A00.Bog();
        }
        return "";
    }

    public C41628IbJ(QuestionResponseModelIntf questionResponseModelIntf, QuestionResponsesModelIntf questionResponsesModelIntf) {
        this.A01 = questionResponsesModelIntf;
        this.A00 = questionResponseModelIntf;
    }
}
