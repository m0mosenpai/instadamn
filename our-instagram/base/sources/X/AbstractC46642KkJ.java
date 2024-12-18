package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.creation.MediaCaptureConfig;

/* renamed from: X.KkJ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46642KkJ {
    public static final Object A00(C6FQ c6fq) {
        UserSession userSession = (UserSession) C6BQ.A0B(c6fq);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        C69963Cf A00 = AbstractC69933Cc.A00(A04, userSession, new C48635LfC(A04, 0));
        EnumC69983Ch enumC69983Ch = EnumC69983Ch.A02;
        C43846JaA c43846JaA = new C43846JaA(enumC69983Ch);
        c43846JaA.A0A = false;
        c43846JaA.A0F = true;
        A00.Emz(EnumC33447EqK.A0B, new MediaCaptureConfig(c43846JaA), enumC69983Ch);
        return null;
    }
}
