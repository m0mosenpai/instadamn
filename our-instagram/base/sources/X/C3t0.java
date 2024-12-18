package X;

import android.graphics.RectF;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelViewerConfig;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* renamed from: X.3t0, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3t0 implements InterfaceC63982vJ {
    public final Fragment A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final InterfaceC09390do A03;
    public final ReelViewerConfig A04;

    public C3t0(Fragment fragment, InterfaceC11380iw interfaceC11380iw, UserSession userSession, ReelViewerConfig reelViewerConfig) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(interfaceC11380iw, 4);
        this.A02 = userSession;
        this.A00 = fragment;
        this.A04 = reelViewerConfig;
        this.A01 = interfaceC11380iw;
        this.A03 = AbstractC09440dt.A01(new C9EH(this, 10));
    }

    public final void A00(RectF rectF, CP7 cp7, C3G2 c3g2, User user, String str, String str2) {
        C1N9 c1n9 = new C1N9(user);
        UserSession userSession = this.A02;
        Reel A0K = C1OU.A04(userSession).A0K(c1n9, str, C14360o3.A0K(userSession.userId, user.getId()));
        List singletonList = Collections.singletonList(A0K);
        C14360o3.A07(singletonList);
        C38E c38e = (C38E) this.A03.getValue();
        c38e.A0C = UUID.randomUUID().toString();
        c38e.A05 = new NS3();
        c38e.A06 = new C56535P8h(cp7);
        c38e.A0F = true;
        C29362Cwv c29362Cwv = new C29362Cwv(rectF, cp7);
        List A0O = A0K.A0O(userSession);
        C14360o3.A07(A0O);
        int size = A0O.size();
        int i = 0;
        while (true) {
            if (i < size) {
                C38321qM c38321qM = ((C41181vS) A0O.get(i)).A0b;
                if (c38321qM != null && (C14360o3.A0K(c38321qM.getId(), str2) || C14360o3.A0K(c38321qM.A2u(), str2))) {
                    break;
                } else {
                    i++;
                }
            } else {
                i = 0;
                break;
            }
        }
        c38e.A08(A0K, c3g2, c29362Cwv, singletonList, singletonList, i);
    }

    @Override // X.InterfaceC63982vJ
    public final /* synthetic */ void DHC(Reel reel, C6X4 c6x4) {
    }

    @Override // X.InterfaceC63982vJ
    public final /* synthetic */ void Ddi(Reel reel) {
    }

    @Override // X.InterfaceC63982vJ
    public final /* synthetic */ void DeI(Reel reel) {
    }
}
