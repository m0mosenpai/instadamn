package X;

import com.instagram.api.schemas.IntentAwareAdsFormatInfo;
import com.instagram.api.schemas.IntentAwareAdsFormatType;
import com.instagram.api.schemas.IntentAwareAdsInfo;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelType;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1w4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41551w4 {
    public int A00;
    public int A01;
    public int A02;
    public Integer A03;
    public Integer A04;
    public List A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final int A0E;
    public final long A0F;
    public final UserSession A0G;
    public final Reel A0H;
    public final String A0I;
    public final String A0J;
    public final java.util.Set A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final C41181vS A0O;
    public final Boolean A0P;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C41551w4(UserSession userSession, Reel reel, String str, String str2, int i, long j, boolean z) {
        this(userSession, reel, false, str, str2, C16910sj.A00, i, j, z);
        C14360o3.A0B(userSession, 1);
    }

    public final int A02(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return A00(userSession, this).size();
    }

    public final int A03(UserSession userSession, C41181vS c41181vS) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c41181vS, 1);
        if (A00(userSession, this).isEmpty() && c41181vS == this.A0O) {
            return 0;
        }
        return A00(userSession, this).indexOf(c41181vS);
    }

    public final int A04(UserSession userSession, String str) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(str, 1);
        Iterator it = A00(userSession, this).iterator();
        int i = 0;
        while (it.hasNext()) {
            if (!C14360o3.A0K(((C41181vS) it.next()).A0j, str)) {
                i++;
            } else {
                return i;
            }
        }
        return -1;
    }

    public final ImageUrl A07(UserSession userSession) {
        Integer CBs;
        C14360o3.A0B(userSession, 0);
        Reel reel = this.A0H;
        C1NB c1nb = reel.A0W;
        if (c1nb == null) {
            CBs = null;
        } else {
            CBs = c1nb.CBs();
        }
        if ((CBs == C05F.A1F || A05() == IntentAwareAdsFormatType.A08 || A05() == IntentAwareAdsFormatType.A09) && !A00(userSession, this).isEmpty()) {
            A0C(userSession, this.A01);
            User user = ((C41181vS) A00(userSession, this).get(this.A01)).A0i;
            if (user != null) {
                return user.Bhu();
            }
            return null;
        }
        return reel.A07();
    }

    public final C41181vS A08(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (A00(userSession, this).isEmpty()) {
            return this.A0O;
        }
        A0C(userSession, this.A01);
        return (C41181vS) A00(userSession, this).get(this.A01);
    }

    public final C41181vS A09(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return (C41181vS) A00(userSession, this).get(this.A00);
    }

    public final C41181vS A0A(UserSession userSession, int i) {
        C14360o3.A0B(userSession, 0);
        return (C41181vS) A00(userSession, this).get(i);
    }

    public final void A0C(UserSession userSession, int i) {
        C14360o3.A0B(userSession, 0);
        this.A01 = Math.max(Math.min(i, A00(userSession, this).size() - 1), 0);
    }

    public final boolean A0E(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return A00(userSession, this).isEmpty();
    }

    public static final List A00(UserSession userSession, C41551w4 c41551w4) {
        List A0O = c41551w4.A0H.A0O(userSession);
        C14360o3.A07(A0O);
        boolean z = c41551w4.A0L;
        if (z) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : A0O) {
                if (c41551w4.A0K.contains(((C41181vS) obj).A0j)) {
                    arrayList.add(obj);
                }
            }
            A0O = arrayList;
        }
        if (C14360o3.A0K(c41551w4.A0P, true) && z && (!A0O.isEmpty())) {
            return AbstractC001800i.A0g(A0O, new C29610D2l(c41551w4));
        }
        return A0O;
    }

    public final int A01() {
        List list = this.A0H.A17;
        if (list != null && !list.isEmpty()) {
            return this.A02;
        }
        throw new IllegalStateException("This ReelViewModel does not represent a video to carousel story, so why are you calling this method?");
    }

    public final IntentAwareAdsFormatType A05() {
        IntentAwareAdsFormatInfo intentAwareAdsFormatInfo;
        IntentAwareAdsInfo intentAwareAdsInfo = this.A0H.A0B;
        if (intentAwareAdsInfo != null && (intentAwareAdsFormatInfo = intentAwareAdsInfo.A00) != null) {
            return intentAwareAdsFormatInfo.B7y();
        }
        return null;
    }

    public final ImageUrl A06() {
        Reel reel = this.A0H;
        List list = reel.A17;
        if (list != null && !list.isEmpty()) {
            List list2 = reel.A18;
            if (list2 == null || !(!list2.isEmpty())) {
                return null;
            }
            A01();
            if (A01() < list2.size()) {
                return (ImageUrl) list2.get(A01());
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Reel ID:");
            sb.append(reel.getId());
            sb.append(", Ad ID:");
            sb.append(reel.A0F());
            sb.append(". The video to carousel index (");
            sb.append(A01());
            sb.append(") is larger than the number of thumbnails (");
            sb.append(list2.size());
            sb.append("). The amount of segments and thumbnails should be equal.");
            throw new IllegalStateException(sb.toString());
        }
        throw new IllegalStateException("This ReelViewModel does not represent a video to carousel story, so why are you calling this method?");
    }

    public final void A0B(UserSession userSession) {
        int A03;
        if (this.A0L) {
            A03 = 0;
        } else {
            A03 = this.A0H.A03(userSession);
        }
        this.A00 = A03;
        this.A01 = A03;
    }

    public final boolean A0D() {
        if (this.A0H.A0P != ReelType.A05) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C41551w4) {
            String id = ((C41551w4) obj).A0H.getId();
            C14360o3.A07(id);
            String id2 = this.A0H.getId();
            C14360o3.A07(id2);
            if (id.equals(id2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String id = this.A0H.getId();
        C14360o3.A07(id);
        return Arrays.hashCode(new Object[]{id});
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C41551w4(UserSession userSession, Reel reel, int i) {
        this(userSession, reel, false, null, null, C16910sj.A00, i, System.currentTimeMillis(), false);
        C14360o3.A0B(userSession, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C41551w4(UserSession userSession, Reel reel, java.util.Set set) {
        this(userSession, reel, false, null, null, set, -1, System.currentTimeMillis(), false);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(reel, 2);
        C14360o3.A0B(set, 5);
    }

    public C41551w4(UserSession userSession, Reel reel, Boolean bool, String str, String str2, java.util.Set set, int i, long j, boolean z) {
        int i2;
        C1NB c1nb;
        User CDj;
        C14360o3.A0B(userSession, 1);
        this.A0G = userSession;
        this.A0H = reel;
        this.A0E = i;
        this.A0N = z;
        this.A0K = set;
        this.A0I = str;
        this.A0J = str2;
        this.A0P = bool;
        boolean z2 = !set.isEmpty();
        this.A0L = z2;
        this.A0O = new C41181vS(EnumC41231vY.A08, reel.A0D(), reel.getId(), AnonymousClass001.A0R(reel.getId(), "-PLACEHOLDER"));
        if (!z2 && reel.A0z(userSession)) {
            i2 = reel.A03(userSession);
        } else {
            i2 = 0;
        }
        this.A00 = i2;
        this.A01 = i2;
        this.A05 = C16930sl.A00;
        boolean z3 = false;
        if (!reel.A1a && (c1nb = reel.A0W) != null && (CDj = c1nb.CDj()) != null) {
            z3 = C41891wf.A01(userSession).A0C(C41951wl.A00(userSession), CDj);
        }
        this.A0M = z3;
        this.A0F = j;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C41551w4(UserSession userSession, Reel reel) {
        this(userSession, reel, false, null, null, C16910sj.A00, -1, System.currentTimeMillis(), false);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(reel, 2);
    }
}
