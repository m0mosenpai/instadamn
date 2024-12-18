package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.reels.questionv2.model.QuestionMediaResponseModelIntf;

/* renamed from: X.HbW, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39444HbW extends C30F {
    public final Context A00;
    public final QuestionMediaResponseModelIntf A01;
    public final C4QW A02;
    public final String A03;
    public final UserSession A04;

    public C39444HbW(Context context, UserSession userSession, QuestionMediaResponseModelIntf questionMediaResponseModelIntf, String str) {
        this.A00 = context;
        this.A04 = userSession;
        this.A03 = str;
        this.A01 = questionMediaResponseModelIntf;
        this.A02 = C4QS.A00(context, userSession, null, this, str);
    }
}
