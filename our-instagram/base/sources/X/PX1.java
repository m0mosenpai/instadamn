package X;

import com.facebook.commonavatarliveediting.prefetch.CommonCdlProviderHolder;
import com.instagram.comments.mvvm.data.network.MediaParentCommentNetworkFetcherKt;
import com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher;
import com.instagram.direct.send.mutation.armadilloexpresstransport.media.DirectConfigureMediaMessageMutationFactory;
import com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository;

/* loaded from: classes9.dex */
public final class PX1 extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public boolean A07;
    public final int A08;

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        switch (this.A08) {
            case 0:
                return ((CommonCdlProviderHolder) A00(obj, this)).A00(null, null, this, false);
            case 1:
                this.A06 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return MediaParentCommentNetworkFetcherKt.A00(null, null, null, null, null, this, null, false);
            case 2:
                return ((AiAgentThreadLauncher) A00(obj, this)).A03(null, null, null, null, this);
            case 3:
                return DirectConfigureMediaMessageMutationFactory.A02(null, (DirectConfigureMediaMessageMutationFactory) A00(obj, this), null, null, this, false);
            case 4:
                return IgLiveCommentsRepository.A04((IgLiveCommentsRepository) A00(obj, this), null, this, false, false);
            default:
                return C37866GlL.A03(null, (C37866GlL) A00(obj, this), null, null, null, this, false, false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PX1(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(interfaceC23621Ds);
        this.A08 = i;
        this.A06 = obj;
    }

    public static Object A00(Object obj, PX1 px1) {
        px1.A05 = obj;
        px1.A00 |= Integer.MIN_VALUE;
        return px1.A06;
    }

    public static boolean A01(Object obj, int i) {
        if ((obj instanceof PX1) && ((PX1) obj).A08 == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PX1(InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A08 = 1;
    }
}
