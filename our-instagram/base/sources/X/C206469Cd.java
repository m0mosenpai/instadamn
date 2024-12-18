package X;

import com.instagram.mainfeed.network.FeedCacheCoordinator;
import com.instagram.mainfeed.network.flashfeed.FeedCacheRoom;

/* renamed from: X.9Cd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206469Cd extends C1Dq {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;
    public final Object A06;

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        int i = this.A05;
        this.A04 = obj;
        this.A01 |= Integer.MIN_VALUE;
        Object obj2 = this.A06;
        if (i != 0) {
            return ((FeedCacheRoom) obj2).A03(null, null, null, this, 0, 0L);
        }
        return FeedCacheCoordinator.A01((FeedCacheCoordinator) obj2, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C206469Cd(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(interfaceC23621Ds);
        this.A05 = i;
        this.A06 = obj;
    }
}
