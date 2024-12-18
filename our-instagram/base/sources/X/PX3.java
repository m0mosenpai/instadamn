package X;

import androidx.datastore.core.SingleProcessDataStore;
import androidx.paging.PagingSource;
import com.instagram.newsfeed.followrequests.data.FollowRequestsActionDataSource;
import com.instagram.stickersearch.AvatarStickerInteractor;
import com.instagram.user.follow.mvvm.data.FollowUserDataSourceImpl;
import com.instagram.zero.headers.IGZeroHeadersStorage;

/* loaded from: classes9.dex */
public final class PX3 extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public final int A08;
    public final Object A09;

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        int i = this.A08;
        A01(obj, this);
        switch (i) {
            case 0:
                return SingleProcessDataStore.A01((SingleProcessDataStore) this.A09, this);
            case 1:
                return ((PagingSource) this.A09).A04(null, this);
            case 2:
                return ((FollowRequestsActionDataSource) this.A09).Cmj(null, null, null, this, null);
            case 3:
                return AbstractC55145Od4.A01(this.A09, this);
            case 4:
                return ((AvatarStickerInteractor) this.A09).A02(null, null, null, null, this);
            case 5:
                return ((FollowUserDataSourceImpl) this.A09).Cmj(null, null, null, this, null);
            default:
                return IGZeroHeadersStorage.A01((IGZeroHeadersStorage) this.A09, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PX3(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(interfaceC23621Ds);
        this.A08 = i;
        this.A09 = obj;
    }

    public static void A00(Object obj, Object obj2, Object obj3, Object obj4, PX3 px3) {
        px3.A02 = obj;
        px3.A03 = obj2;
        px3.A04 = obj3;
        px3.A05 = obj4;
    }

    public static void A01(Object obj, PX3 px3) {
        px3.A07 = obj;
        px3.A00 |= Integer.MIN_VALUE;
    }

    public static boolean A02(Object obj, int i) {
        if ((obj instanceof PX3) && ((PX3) obj).A08 == i) {
            return true;
        }
        return false;
    }
}
