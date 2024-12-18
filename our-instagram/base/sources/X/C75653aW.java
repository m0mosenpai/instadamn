package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.camera.DirectCameraViewModel;
import com.instagram.model.reels.Reel;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.reels.store.ReelStore;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3aW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75653aW {
    public static final C75653aW A00 = new Object();

    public static final DirectCameraViewModel A00(C41181vS c41181vS, String str) {
        int i;
        boolean z;
        User user = c41181vS.A0i;
        if (user != null) {
            List singletonList = Collections.singletonList(new PendingRecipient(user));
            C14360o3.A07(singletonList);
            DirectShareTarget directShareTarget = new DirectShareTarget(new C122145g6(singletonList), "", singletonList, true);
            if (str.equals("story_remix_reply")) {
                i = 4;
            } else {
                i = 0;
                if (str.equals("story_selfie_reply")) {
                    i = 5;
                }
            }
            String username = user.getUsername();
            ImageUrl Bhu = user.Bhu();
            Boolean CfN = user.A03.CfN();
            if (CfN != null) {
                z = CfN.booleanValue();
            } else {
                z = false;
            }
            return new DirectCameraViewModel(Bhu, null, directShareTarget, null, username, user.getUsername(), null, i, false, false, false, z);
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final DirectCameraViewModel A01(C41551w4 c41551w4, String str) {
        boolean z;
        int i;
        C1NB c1nb = c41551w4.A0H.A0W;
        if (c1nb != null) {
            User CDj = c1nb.CDj();
            if (CDj != null) {
                List singletonList = Collections.singletonList(new PendingRecipient(CDj));
                C14360o3.A07(singletonList);
                String username = CDj.getUsername();
                ImageUrl Bhu = CDj.Bhu();
                Boolean CfN = CDj.A03.CfN();
                if (CfN != null) {
                    z = CfN.booleanValue();
                } else {
                    z = false;
                }
                String username2 = CDj.getUsername();
                if (str.equals("story_remix_reply")) {
                    i = 4;
                } else {
                    i = 0;
                    if (str.equals("story_selfie_reply")) {
                        i = 5;
                    }
                }
                return new DirectCameraViewModel(Bhu, null, new DirectShareTarget(new C122145g6(singletonList), "", singletonList, true), null, username, username2, null, i, false, false, false, z);
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final String A04(Reel reel) {
        if (reel != null) {
            if (reel.A0d()) {
                return "live_";
            }
            if (reel.A0R != null) {
                return "stories_ad4ad";
            }
            return "reel_";
        }
        return "reel_";
    }

    public static final boolean A05(UserSession userSession, Reel reel, String str) {
        C14360o3.A0B(userSession, 0);
        if (reel == null) {
            return false;
        }
        if (str == null) {
            return reel.A0z(userSession);
        }
        Iterator it = reel.A19.iterator();
        while (it.hasNext()) {
            if (((C38321qM) it.next()).getId().equals(str)) {
                return true;
            }
        }
        Iterator it2 = reel.A15.iterator();
        while (it2.hasNext()) {
            if (((C38321qM) it2.next()).getId().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean A07(Reel reel) {
        C1NB c1nb;
        return reel.A0o() || ((c1nb = reel.A0W) != null && c1nb.CBs().intValue() == 6);
    }

    public static final Reel A02(UserSession userSession, User user) {
        Reel A03 = A03(userSession, user);
        if (A03 != null && !A03.A16(userSession)) {
            return A03;
        }
        return null;
    }

    public static final Reel A03(UserSession userSession, User user) {
        Long BMD;
        if (ReelStore.A03(userSession).A0M(user.getId()) != null || (user.A03.BMD() != null && ((BMD = user.A03.BMD()) == null || BMD.longValue() != 0))) {
            Reel A0K = ReelStore.A03(userSession).A0K(new C1N9(user), user.getId(), C14360o3.A0K(userSession.userId, user.getId()));
            Long BMD2 = user.A03.BMD();
            user.A03.EX6(null);
            Long Bli = user.A03.Bli();
            user.A03.EcJ(null);
            Long BMA = user.A03.BMA();
            user.A03.EX4(null);
            Long BMB = user.A03.BMB();
            user.A03.EX5(null);
            if (BMD2 != null) {
                A0K.A03 = BMD2.longValue();
            }
            if (Bli != null) {
                A0K.A0S(userSession, Bli.longValue());
            }
            if (A0K.A0l()) {
                A0K.A0U(userSession, A0K.A0L());
            }
            if (BMA != null) {
                A0K.A1F = !C41661wG.A00(userSession).A06(A0K, Long.valueOf(BMA.longValue()));
            }
            if (BMB != null) {
                A0K.A1G = !C41661wG.A00(userSession).A06(A0K, Long.valueOf(BMB.longValue()));
            }
            if (A06(userSession, user)) {
                if (A0K.A03 + (AbstractC73343Qk.A00 / 1000) > (System.currentTimeMillis() / 1000) - SandboxRepository.CACHE_TTL) {
                    return A0K;
                }
            }
        }
        return null;
    }

    public static final boolean A06(UserSession userSession, User user) {
        if (!user.CQf()) {
            if (user.A0M() == C05F.A01 || C14360o3.A0K(userSession.userId, user.getId()) || C57582kX.A00(userSession).A0N(user) == FollowStatus.A05) {
                return true;
            }
            return false;
        }
        return false;
    }
}
