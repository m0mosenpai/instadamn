package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.creation.drafts.model.validation.clips.ClipsDraftValidator;

/* loaded from: classes4.dex */
public abstract class A0J {
    public static final ClipsDraftValidator A00(Context context, UserSession userSession, Integer num) {
        AbstractC167017dG.A1N(context, userSession);
        return new ClipsDraftValidator(userSession, C2OY.A00(context, userSession), num);
    }
}
