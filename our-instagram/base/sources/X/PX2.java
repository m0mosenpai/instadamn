package X;

import androidx.paging.AsyncPagingDataDiffer$differBase$1;
import com.facebook.commonavatarliveediting.api.CdlProviderHolderRegistry;
import com.instagram.direct.send.mutation.armadilloexpresstransport.media.DirectConfigureMediaCollectionMessageMutationFactory;
import com.instagram.settings2.core.viewmodel.UiStateKt;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;

/* loaded from: classes9.dex */
public final class PX2 extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public boolean A08;
    public final int A09;

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        switch (this.A09) {
            case 0:
                this.A06 = obj;
                A00(this);
                return AsyncPagingDataDiffer$differBase$1.A00((AsyncPagingDataDiffer$differBase$1) this.A07, null, null, null, null, this, 0, 0, false);
            case 1:
                this.A06 = obj;
                A00(this);
                return ((CdlProviderHolderRegistry) this.A07).A00(null, null, null, this, false);
            case 2:
                this.A06 = obj;
                A00(this);
                return DirectConfigureMediaCollectionMessageMutationFactory.A01(null, (DirectConfigureMediaCollectionMessageMutationFactory) this.A07, this, false);
            case 3:
                this.A07 = obj;
                A00(this);
                return UiStateKt.A01(null, null, null, null, this, false);
            case 4:
                this.A07 = obj;
                A00(this);
                return UiStateKt.A07(null, null, null, this);
            default:
                this.A06 = obj;
                A00(this);
                return ((IgLiveBroadcastInfoManager) this.A07).A00(null, null, null, this, false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PX2(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(interfaceC23621Ds);
        this.A09 = i;
        this.A07 = obj;
    }

    public static void A00(PX2 px2) {
        px2.A00 |= Integer.MIN_VALUE;
    }

    public static boolean A01(Object obj, int i) {
        if ((obj instanceof PX2) && ((PX2) obj).A09 == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PX2(int i, InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A09 = i;
    }
}
