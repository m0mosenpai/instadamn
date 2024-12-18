package X;

import com.instagram.mainfeed.network.FeedCacheCoordinator;
import com.instagram.mainfeed.network.flashfeed.FlashFeedCache;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9D9, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9D9 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9D9(Object obj, Object obj2, InterfaceC23621Ds interfaceC23621Ds, int i, int i2) {
        super(2, interfaceC23621Ds);
        this.A01 = i2;
        this.A04 = obj;
        this.A03 = obj2;
        this.A02 = i;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        int i;
        int i2 = this.A01;
        Object obj2 = this.A04;
        Object obj3 = this.A03;
        int i3 = this.A02;
        if (i2 != 0) {
            i = 1;
        } else {
            i = 0;
        }
        return new C9D9(obj2, obj3, interfaceC23621Ds, i3, i);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C9D9) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        Object obj2 = obj;
        int i = this.A01;
        C1JX c1jx = C1JX.A02;
        int i2 = this.A00;
        if (i != 0) {
            if (i2 != 0) {
                AbstractC09560e7.A00(obj2);
            } else {
                AbstractC09560e7.A00(obj2);
                FeedCacheCoordinator feedCacheCoordinator = (FeedCacheCoordinator) this.A04;
                FlashFeedCache flashFeedCache = feedCacheCoordinator.A09;
                int i3 = feedCacheCoordinator.A00;
                long A01 = C1XT.A01(feedCacheCoordinator.A07);
                ArrayList A03 = FeedCacheCoordinator.A03(feedCacheCoordinator, C05F.A0C, false);
                this.A00 = 1;
                obj2 = flashFeedCache.A04(null, null, null, A03, this, i3, A01, true, true, true);
                if (obj2 == c1jx) {
                    return c1jx;
                }
            }
            FeedCacheCoordinator feedCacheCoordinator2 = (FeedCacheCoordinator) this.A04;
            C006802i c006802i = (C006802i) this.A03;
            int i4 = this.A02;
            List list = (List) obj2;
            C1X7 c1x7 = feedCacheCoordinator2.A01;
            if (c1x7 != null) {
                c1x7.DVT(C05F.A0C, list);
            }
            c006802i.markerAnnotate(974459630, i4, MSV.A00(802), list.size());
            c006802i.markerEnd(974459630, i4, (short) 2);
        } else if (i2 != 0) {
            AbstractC09560e7.A00(obj2);
        } else {
            AbstractC09560e7.A00(obj2);
            InterfaceC06180Ui interfaceC06180Ui = ((C187418Sj) this.A04).A01;
            Object obj3 = this.A03;
            if (obj3 == null) {
                if (this.A02 <= 3) {
                    obj3 = EnumC187428Sk.A09;
                } else {
                    obj3 = EnumC187428Sk.A0C;
                }
            }
            this.A00 = 1;
            if (interfaceC06180Ui.emit(obj3, this) == c1jx) {
                return c1jx;
            }
        }
        return C0eB.A00;
    }
}
