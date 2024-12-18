package X;

import com.facebook.quickpromotion.sdk.fetcher.ondemand.OnDemandSurfaceTriggerCache;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel;
import com.instagram.creation.drafts.model.datasource.clips.ClipsDraftLocalDataSource;
import com.instagram.mainfeed.network.flashfeed.FlashFeedCache;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;

/* renamed from: X.9Ch, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206509Ch extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public boolean A05;
    public final int A06;
    public final Object A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C206509Ch(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(interfaceC23621Ds);
        this.A06 = i;
        this.A07 = obj;
    }

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof C206509Ch) && ((C206509Ch) obj).A06 == i) {
            return true;
        }
        return false;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        int i = this.A06;
        this.A04 = obj;
        this.A00 |= Integer.MIN_VALUE;
        switch (i) {
            case 0:
                return OnDemandSurfaceTriggerCache.A01(null, (OnDemandSurfaceTriggerCache) this.A07, null, this, false);
            case 1:
                return ClipsCreationDraftViewModel.A05((ClipsCreationDraftViewModel) this.A07, null, null, this, false);
            case 2:
                return ((ClipsDraftLocalDataSource) this.A07).A01(null, null, this, false);
            case 3:
                return ((FlashFeedCache) this.A07).A05(null, this, false);
            default:
                return ((IgLiveBroadcastInfoManager) this.A07).A01(null, this);
        }
    }
}
