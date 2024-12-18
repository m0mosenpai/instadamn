package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Ezc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33997Ezc {
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, X.FQ4] */
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        try {
            String string = new JSONObject(AbstractC31177DnL.A0d(c6fw)).getString("pk");
            UserSession A0W = AbstractC31172DnG.A0W(c6fq);
            FragmentActivity A04 = C6BQ.A04(c6fq);
            InterfaceC11380iw A08 = C6BQ.A08(c6fq);
            ?? obj = new Object();
            obj.A02 = new C31361DqQ(A08, A0W);
            obj.A00 = A0W;
            C4LM.A02.A02(A0W, new GIL(0, A04, obj), string);
            return null;
        } catch (JSONException unused) {
            return null;
        }
    }
}
