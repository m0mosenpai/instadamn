package X;

import androidx.compose.foundation.gestures.ScrollableNestedScrollConnection;
import com.instagram.pendingmedia.service.common.IngestionStepDebugLogger;

/* loaded from: classes8.dex */
public final class MA7 extends C1Dq {
    public int A00;
    public long A01;
    public Object A02;
    public final int A03;
    public final Object A04;

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        int i = this.A03;
        this.A02 = obj;
        this.A00 |= Integer.MIN_VALUE;
        switch (i) {
            case 0:
                return ((ScrollableNestedScrollConnection) this.A04).DZz(this, 0L, 0L);
            case 1:
                return ((IngestionStepDebugLogger) this.A04).A01(null, null, this, 0L);
            case 2:
                return ((C28813Cnj) this.A04).DZz(this, 0L, 0L);
            default:
                return ((C28813Cnj) this.A04).Da5(this, 0L);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MA7(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(interfaceC23621Ds);
        this.A03 = i;
        this.A04 = obj;
    }
}
