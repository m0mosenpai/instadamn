package X;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import java.util.Locale;

/* renamed from: X.Ex7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33843Ex7 {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        String A0d = AbstractC31177DnL.A0d(c6fw);
        UserSession A0S = AbstractC31177DnL.A0S(c6fq);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        Intent A03 = AbstractC31172DnG.A0l().A03(A04, 335577088);
        Locale locale = Locale.ROOT;
        C14360o3.A08(locale);
        C116875Qr c116875Qr = new C116875Qr(ClipsViewerSource.valueOf(AbstractC166997dE.A10(locale, A0d)), A0S);
        c116875Qr.A1d = true;
        C12260kU.A0C(A04, AbstractC31173DnH.A09(A03.putExtra(AbstractC111324zv.A00(299), c116875Qr.A00()), AbstractC08820cl.A03("instagram://clips_home")));
        return null;
    }
}
