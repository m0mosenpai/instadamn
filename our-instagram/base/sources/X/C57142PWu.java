package X;

import com.instagram.newsfeed.followrequests.data.FollowRequestsRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveExploreRepository;

/* renamed from: X.PWu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57142PWu extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public boolean A05;
    public final int A06;
    public final Object A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57142PWu(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(interfaceC23621Ds);
        this.A06 = i;
        this.A07 = obj;
    }

    public static Object A00(Object obj, C57142PWu c57142PWu) {
        c57142PWu.A04 = obj;
        c57142PWu.A00 |= Integer.MIN_VALUE;
        return c57142PWu.A07;
    }

    public static boolean A01(Object obj, int i) {
        if ((obj instanceof C57142PWu) && ((C57142PWu) obj).A06 == i) {
            return true;
        }
        return false;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        switch (this.A06) {
            case 0:
                return ((FollowRequestsRepository) A00(obj, this)).A02(null, this, false);
            case 1:
                return AbstractC55145Od4.A01(A00(obj, this), this);
            case 2:
                return IgLiveCommentsRepository.A02((IgLiveCommentsRepository) A00(obj, this), null, this, false);
            case 3:
                return ((IgLiveCommentsRepository) A00(obj, this)).A0C(null, null, this);
            default:
                return ((IgLiveExploreRepository) A00(obj, this)).A01(null, this, false);
        }
    }
}
