package X;

import com.instagram.common.session.UserSession;
import com.instagram.music.profile.musiconprofile.MusicOnProfileProvider;

/* renamed from: X.Dsq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31506Dsq extends C1P1 {
    public final /* synthetic */ C31490Dsa A00;
    public final /* synthetic */ C155526yh A01;

    public C31506Dsq(C31490Dsa c31490Dsa, C155526yh c155526yh) {
        this.A00 = c31490Dsa;
        this.A01 = c155526yh;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, -1049335315);
        super.onFail(abstractC115105If);
        C155526yh c155526yh = this.A00.A02;
        C155506yf c155506yf = c155526yh.A01;
        if (c155506yf != null) {
            c155506yf.A08(c155526yh.A04.userId, "fetch_profile_music_error");
        }
        C155506yf c155506yf2 = c155526yh.A01;
        if (c155506yf2 != null) {
            c155506yf2.A07(c155526yh.A04.userId, "fetch_profile_music_error");
        }
        c155526yh.A02 = true;
        C0f9.A0A(-635507661, A0N);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-662045626);
        H95 h95 = (H95) obj;
        int A032 = C0f9.A03(1197811763);
        C14360o3.A0B(h95, 0);
        super.onSuccess(h95);
        C31490Dsa c31490Dsa = this.A00;
        MWW A00 = MusicOnProfileProvider.A00(h95);
        C155526yh c155526yh = c31490Dsa.A02;
        if (c155526yh.A08) {
            C155506yf c155506yf = c155526yh.A01;
            if (c155506yf != null) {
                c155506yf.A08(c155526yh.A04.userId, "fetch_profile_music_successful");
            }
            C155506yf c155506yf2 = c155526yh.A01;
            if (c155506yf2 != null) {
                c155506yf2.A03(c155526yh.A04.userId);
            }
            MusicOnProfileProvider musicOnProfileProvider = c155526yh.A06;
            musicOnProfileProvider.A00 = true;
            musicOnProfileProvider.A01.A0A(A00);
        } else {
            C155666yv c155666yv = c31490Dsa.A01.A00;
            if (c155666yv != null) {
                if (c155666yv.A0B != A00) {
                    c155666yv.A0B = A00;
                }
                UserSession userSession = c155526yh.A04;
                C14360o3.A0B(userSession, 0);
                ((C31508Dss) userSession.A01(C31508Dss.class, new C37057GUn(userSession, 28))).A00(c31490Dsa.A00, c31490Dsa.A03, A00.A02.A0B);
            } else {
                C14360o3.A0F("headerAdapter");
                throw C00O.createAndThrow();
            }
        }
        C0f9.A0A(-2052150882, A032);
        C0f9.A0A(1569830322, A03);
    }
}
