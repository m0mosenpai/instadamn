package X;

import android.text.TextUtils;
import com.instagram.api.schemas.IntentAwareAdsInfo;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelType;
import com.instagram.reels.store.ReelStore;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.3GL, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3GL implements InterfaceC62242sP {
    public final UserSession A00;

    public C3GL(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.InterfaceC62242sP
    public final /* bridge */ /* synthetic */ Integer Ahy(Object obj) {
        return null;
    }

    @Override // X.InterfaceC62242sP
    public final /* bridge */ /* synthetic */ Integer Ai1(Object obj) {
        return null;
    }

    @Override // X.InterfaceC62242sP
    public final /* bridge */ /* synthetic */ boolean CX6(Object obj) {
        return false;
    }

    @Override // X.InterfaceC62242sP
    public final /* bridge */ /* synthetic */ boolean ACQ(Object obj, Object obj2) {
        C37881pR c37881pR;
        String str;
        C41551w4 c41551w4 = (C41551w4) obj;
        C41181vS c41181vS = (C41181vS) obj2;
        C14360o3.A0B(c41551w4, 0);
        C14360o3.A0B(c41181vS, 1);
        C37881pR c37881pR2 = c41551w4.A0H.A0X;
        Reel A0M = ReelStore.A03(this.A00).A0M(c41181vS.A0j);
        if (A0M != null) {
            c37881pR = A0M.A0X;
        } else {
            c37881pR = null;
        }
        if (c37881pR2 != null && c37881pR != null && (str = c37881pR2.A02) != null && str.length() != 0 && str.equals(c37881pR.A02)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC62242sP
    public final /* bridge */ /* synthetic */ boolean ACU(Object obj, Object obj2) {
        String str;
        C41551w4 c41551w4 = (C41551w4) obj;
        C41551w4 c41551w42 = (C41551w4) obj2;
        C14360o3.A0B(c41551w4, 0);
        C14360o3.A0B(c41551w42, 1);
        C37881pR c37881pR = c41551w4.A0H.A0X;
        C37881pR c37881pR2 = c41551w42.A0H.A0X;
        if (c37881pR != null && c37881pR2 != null && (str = c37881pR.A02) != null && str.length() != 0 && str.equals(c37881pR2.A02)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC62242sP
    public final /* bridge */ /* synthetic */ C5I4 AMc(Object obj) {
        String str;
        String str2;
        C41551w4 c41551w4 = (C41551w4) obj;
        C14360o3.A0B(c41551w4, 0);
        Reel reel = c41551w4.A0H;
        C38541qi c38541qi = reel.A0I;
        if (c38541qi != null) {
            str = c38541qi.A04;
        } else {
            str = null;
        }
        if (reel.CdW()) {
            if (c38541qi == null) {
                UserSession userSession = this.A00;
                C41181vS A0A = reel.A0A(userSession, 0);
                C14360o3.A07(A0A);
                String A0V = A0A.A0V(userSession);
                if (A0V != null) {
                    LinkedList linkedList = null;
                    if (AbstractC130925vf.A0W(reel)) {
                        linkedList = new LinkedList();
                        Iterator it = reel.A0O(userSession).iterator();
                        while (it.hasNext()) {
                            String A0V2 = ((C41181vS) it.next()).A0V(userSession);
                            if (A0V2 != null) {
                                linkedList.add(new C5ID(reel, C05F.A0C, A0V2, null));
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        }
                    }
                    return new C5ID(reel, C05F.A0C, A0V, linkedList);
                }
                throw new IllegalStateException("Required value was null.");
            }
            if (str != null) {
                return new C5ID(reel, C05F.A0C, str, null);
            }
        }
        if (reel.A0m()) {
            String A0G = reel.A0G();
            C14360o3.A07(A0G);
            return new C5ID(reel, C05F.A0N, A0G, null);
        }
        String id = reel.getId();
        C14360o3.A07(id);
        ReelType reelType = reel.A0P;
        if (reelType == null || (str2 = reelType.toString()) == null) {
            str2 = "";
        }
        throw new IllegalArgumentException(AnonymousClass001.A14("Unsupported reel for injection, id = [", id, "], reelType = [", str2, "], mediaIds = [", TextUtils.join(", ", reel.A0K()), ']'));
    }

    @Override // X.InterfaceC62242sP
    public final /* bridge */ /* synthetic */ int AZN(Object obj) {
        C41551w4 c41551w4 = (C41551w4) obj;
        C14360o3.A0B(c41551w4, 0);
        C37881pR c37881pR = c41551w4.A0H.A0X;
        if (c37881pR != null) {
            return c37881pR.A00;
        }
        return -1;
    }

    @Override // X.InterfaceC62242sP
    public final /* bridge */ /* synthetic */ int Aa7(Object obj) {
        C41551w4 c41551w4 = (C41551w4) obj;
        if (c41551w4 != null) {
            if (AbstractC130925vf.A0n(c41551w4)) {
                return c41551w4.A0H.A0O(this.A00).size();
            }
            if (c41551w4.A0H.CdW()) {
                return 1;
            }
            return 0;
        }
        return 0;
    }

    @Override // X.InterfaceC62242sP
    public final /* bridge */ /* synthetic */ String BF8(Object obj) {
        C41551w4 c41551w4 = (C41551w4) obj;
        C14360o3.A0B(c41551w4, 0);
        String id = c41551w4.A0H.getId();
        C14360o3.A07(id);
        return id;
    }

    @Override // X.InterfaceC62242sP
    public final /* bridge */ /* synthetic */ String BFA(Object obj) {
        C41181vS c41181vS = (C41181vS) obj;
        C14360o3.A0B(c41181vS, 0);
        String str = c41181vS.A0k;
        C14360o3.A07(str);
        return str;
    }

    @Override // X.InterfaceC62242sP
    public final /* bridge */ /* synthetic */ String BK4(Object obj) {
        C41181vS c41181vS = (C41181vS) obj;
        C14360o3.A0B(c41181vS, 0);
        String str = c41181vS.A0j;
        C14360o3.A07(str);
        return str;
    }

    @Override // X.InterfaceC62242sP
    public final /* bridge */ /* synthetic */ List BV9(Object obj) {
        return new LinkedList();
    }

    @Override // X.InterfaceC62242sP
    public final /* bridge */ /* synthetic */ Integer BVE(Object obj) {
        IntentAwareAdsInfo intentAwareAdsInfo;
        String str;
        C41551w4 c41551w4 = (C41551w4) obj;
        if (c41551w4 != null && (intentAwareAdsInfo = c41551w4.A0H.A0B) != null && (str = intentAwareAdsInfo.A04) != null) {
            return AbstractC40674I1g.A00(str);
        }
        return null;
    }

    @Override // X.InterfaceC62242sP
    public final /* bridge */ /* synthetic */ EnumC26291Pk BYX(Object obj) {
        Integer num;
        C41551w4 c41551w4 = (C41551w4) obj;
        C14360o3.A0B(c41551w4, 0);
        Reel reel = c41551w4.A0H;
        IntentAwareAdsInfo intentAwareAdsInfo = reel.A0B;
        if (intentAwareAdsInfo != null) {
            num = intentAwareAdsInfo.A02;
        } else {
            num = null;
        }
        Integer A00 = C71113Gx.A00(num);
        if (A00 != null && (A00 == C05F.A0u || A00 == C05F.A02)) {
            return EnumC26291Pk.A02;
        }
        if (!reel.CdW() && !reel.A0m()) {
            return EnumC26291Pk.A03;
        }
        return EnumC26291Pk.A04;
    }

    @Override // X.InterfaceC62242sP
    public final /* bridge */ /* synthetic */ boolean CX7(Object obj) {
        C41181vS c41181vS = (C41181vS) obj;
        C14360o3.A0B(c41181vS, 0);
        return c41181vS.A1Q();
    }

    @Override // X.InterfaceC62242sP
    public final /* bridge */ /* synthetic */ boolean CX8(Object obj) {
        C41181vS c41181vS = (C41181vS) obj;
        C14360o3.A0B(c41181vS, 0);
        return c41181vS.CdW();
    }

    @Override // X.InterfaceC62242sP
    public final /* bridge */ /* synthetic */ boolean CYw(Object obj) {
        C41551w4 c41551w4 = (C41551w4) obj;
        if (c41551w4 != null) {
            return AbstractC130925vf.A0n(c41551w4);
        }
        return false;
    }

    @Override // X.InterfaceC62242sP
    public final /* bridge */ /* synthetic */ boolean CZK(Object obj) {
        C41551w4 c41551w4 = (C41551w4) obj;
        if (c41551w4 != null && c41551w4.A0H.A0m()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC62242sP
    public final /* bridge */ /* synthetic */ boolean CdX(Object obj) {
        C41551w4 c41551w4 = (C41551w4) obj;
        if (c41551w4 != null && c41551w4.A0H.CdW()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC62242sP
    public final /* bridge */ /* synthetic */ boolean CdY(Object obj) {
        C41551w4 c41551w4 = (C41551w4) obj;
        if (c41551w4 != null && c41551w4.A0N && c41551w4.A0H.A13(this.A00)) {
            return true;
        }
        return false;
    }
}
