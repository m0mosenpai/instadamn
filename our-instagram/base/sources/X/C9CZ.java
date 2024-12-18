package X;

import com.instagram.share.facebook.upsell.api.CLNoticeApi;
import com.instagram.trials.impl.TrialsPreferencesImpl;
import com.instagram.trials.repository.ClipsProfileTabTrialsRepository;
import com.instagram.uxlogging.navigation.NavigationObserver$start$1;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;
import com.instagram.wellbeing.respectfulcommentnudge.data.RepositoryImpl;
import com.instagram.wellbeing.respectfulcommentnudge.data.RespectfulNudgeApi;
import com.instagram.zero.dogfooding.state.IgZeroDogfoodingKt$collectWithZeroErrorBoundary$2;

/* renamed from: X.9CZ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9CZ extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9CZ(InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A04 = 10;
    }

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof C9CZ) && ((C9CZ) obj).A04 == i) {
            return true;
        }
        return false;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        switch (this.A04) {
            case 0:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((CLNoticeApi) this.A03).A02(null, null, null, this);
            case 1:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((TrialsPreferencesImpl) this.A03).A01(this);
            case 2:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((ClipsProfileTabTrialsRepository) this.A03).A00(this);
            case 3:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((NavigationObserver$start$1.AnonymousClass2) this.A03).emit(null, this);
            case 4:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((IgLiveBroadcastInfoManager) this.A03).A02(null, this);
            case 5:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((IgLiveHeartbeatManager) this.A03).A01(this, false);
            case 6:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((RepositoryImpl) this.A03).A01(null, null, this);
            case 7:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((RespectfulNudgeApi) this.A03).A01(null, null, this);
            case 8:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((RespectfulNudgeApi) this.A03).A00(null, null, null, null, null, this, false);
            case 9:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((IgZeroDogfoodingKt$collectWithZeroErrorBoundary$2) this.A03).emit(null, this);
            case 10:
                this.A03 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return AbstractC71523Is.A00(this, null, null);
            default:
                this.A02 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return C2QS.A02(this, (C2QS) this.A03);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9CZ(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(interfaceC23621Ds);
        this.A04 = i;
        this.A03 = obj;
    }
}
