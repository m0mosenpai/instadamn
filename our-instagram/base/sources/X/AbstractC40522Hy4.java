package X;

import android.graphics.RectF;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelViewerConfig;
import com.instagram.reels.store.ReelStore;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.Hy4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40522Hy4 {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        InterfaceC11380iw A07;
        Object obj;
        Object A03 = c6fw.A03(0);
        C14360o3.A0C(A03, AbstractC111324zv.A00(8));
        List list = (List) A03;
        Object A02 = c6fw.A02();
        C14360o3.A0C(A02, "null cannot be cast to non-null type kotlin.String");
        String str = (String) A02;
        Object A00 = c6fw.A00();
        C14360o3.A0C(A00, "null cannot be cast to non-null type kotlin.String");
        UserSession A0S = AbstractC31177DnL.A0S(c6fq);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        C6FG c6fg = c6fq.A03;
        C3G2 valueOf = C3G2.valueOf(AbstractC166997dE.A10(Locale.ROOT, (String) A00));
        RectF rectF = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        C31559Dtj c31559Dtj = new C31559Dtj(A04, rectF, new C42788IwQ(1));
        C38C A0L = AbstractC37301Gc2.A0L(C6BQ.A01(c6fq));
        if (c6fg != null && (A07 = C6BQ.A07(c6fg)) != null) {
            C38E c38e = new C38E(A07, A0S, A0L);
            C56553P8z c56553P8z = new C56553P8z(rectF, 1);
            c38e.A0C = (String) c6fg.A00(R.id.bloks_reel_tray_session_id);
            c38e.A05 = c31559Dtj;
            c38e.A03 = ReelViewerConfig.A00();
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C16L A032 = AbstractC221915u.A00.A03(AbstractC166987dD.A1B(it));
                C07880b8 c07880b8 = C07950bF.A04;
                C14360o3.A0A(A032);
                C07950bF A002 = C07880b8.A00(A032, A0S);
                if (A002.A11() == null) {
                    A002.A1J();
                }
                try {
                    C37771pE parseFromJson = AbstractC38741r6.parseFromJson(A002);
                    if (parseFromJson != null) {
                        A1E.add(ReelStore.A03(A0S).A0I(parseFromJson, A0S.userId.equals(parseFromJson.A1P)));
                    }
                } catch (IOException unused) {
                    AbstractC25241Le.A02("IGBloksActionNavigationOpenStoryViewerImpl", "Unable to parse reel.");
                }
            }
            Iterator it2 = A1E.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj = it2.next();
                    if (AbstractC001900j.A0a(AbstractC37301Gc2.A0i((Reel) obj), str, false)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            Reel reel = (Reel) obj;
            if (reel == null) {
                reel = (Reel) A1E.get(0);
            }
            c38e.A07(reel, valueOf, c56553P8z, A1E, A1E, 0);
            return null;
        }
        throw AbstractC166997dE.A0g();
    }
}
