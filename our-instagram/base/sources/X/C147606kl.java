package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.6kl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C147606kl implements InterfaceC147586kj {
    public C41181vS A00;
    public C39439HbR A01;
    public J25 A02;
    public final Context A03;
    public final InterfaceC11380iw A04;
    public final UserSession A05;
    public boolean isMediaPrepared;

    public C147606kl(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        this.A03 = context;
        this.A05 = userSession;
        this.A04 = interfaceC11380iw;
    }

    public static final void A00(C147606kl c147606kl) {
        J25 j25;
        if (c147606kl.isMediaPrepared) {
            J25 j252 = c147606kl.A02;
            if (j252 != null) {
                j252.A01(false);
                return;
            }
            return;
        }
        C39439HbR c39439HbR = c147606kl.A01;
        if (c39439HbR == null || (j25 = c147606kl.A02) == null) {
            return;
        }
        j25.A00(c39439HbR);
    }

    public final void A01() {
        C5TA c5ta;
        J25 j25 = this.A02;
        if (j25 != null && (c5ta = j25.A00) != null) {
            c5ta.A09("paused_for_replay");
        }
        J25 j252 = this.A02;
        if (j252 != null) {
            C5TA c5ta2 = j252.A00;
            if (c5ta2 != null) {
                c5ta2.A0A("out_of_playback_range");
            }
            j252.A00 = null;
        }
        this.A02 = null;
        this.isMediaPrepared = false;
    }

    @Override // X.InterfaceC147586kj
    public final void DzY(C38321qM c38321qM) {
        if (c38321qM != null) {
            this.isMediaPrepared = true;
            A00(this);
        }
    }

    @Override // X.InterfaceC147586kj
    public final void onProgressUpdate(int i, int i2, boolean z) {
        A00(this);
    }
}
