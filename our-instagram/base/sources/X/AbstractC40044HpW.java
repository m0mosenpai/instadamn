package X;

import com.instagram.api.schemas.ListeningNowResponseInfo;
import com.instagram.api.schemas.ListeningNowState;
import com.instagram.api.schemas.MusicInfoImpl;
import java.io.IOException;

/* renamed from: X.HpW, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40044HpW {
    public static ListeningNowResponseInfo parseFromJson(C16L c16l) {
        String A00;
        String A002;
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ListeningNowState listeningNowState = null;
            Boolean bool = null;
            MusicInfoImpl musicInfoImpl = null;
            Integer num = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r = C16R.A09;
                A00 = AbstractC111324zv.A00(1687);
                A002 = AbstractC43591JPw.A00(82);
                if (A1J == c16r) {
                    break;
                }
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("is_spotify_save_eligible".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if (A002.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    listeningNowState = (ListeningNowState) ListeningNowState.A01.get(A1P);
                    if (listeningNowState == null) {
                        listeningNowState = ListeningNowState.A09;
                    }
                } else if ("music_info".equals(A0s)) {
                    musicInfoImpl = C3XO.parseFromJson(c16l);
                } else {
                    num = AbstractC31178DnM.A0V(c16l, num, A0s, "num_spotify_saves");
                }
                c16l.A0z();
            }
            if (listeningNowState == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V(A002, c16l, A00);
                throw C00O.createAndThrow();
            }
            return new ListeningNowResponseInfo(listeningNowState, musicInfoImpl, bool, num);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
