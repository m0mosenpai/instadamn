package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.VQb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68419VQb {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Object A01 = c6fw.A01();
        C14360o3.A0C(A01, "null cannot be cast to non-null type com.instagram.model.hashtag.Hashtag");
        C140966Yy A0F = AbstractC31180DnO.A0F(c6fq);
        Fragment A012 = WE2.A01((UserSession) C6BQ.A0B(c6fq));
        A012.setArguments(WE2.A00((Hashtag) A01, "blok_view", "DEFAULT"));
        A0F.A0B(null, A012);
        A0F.A04();
        return null;
    }
}
