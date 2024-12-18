package X;

import com.instagram.debug.log.DLog;
import com.instagram.debug.log.tags.DLogTag;

/* loaded from: classes9.dex */
public final class N9U extends C1P1 {
    public final /* synthetic */ IN3 A00;

    public N9U(IN3 in3) {
        this.A00 = in3;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(1709562657);
        DLog.e(DLogTag.LIVE.INSTANCE, AbstractC13670mt.A06("confirm failed: %s", this.A00), new Object[0]);
        C0f9.A0A(-1753660413, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(786796272);
        int A032 = C0f9.A03(-979636725);
        DLog.d(DLogTag.LIVE.INSTANCE, AbstractC13670mt.A06("confirmed: %s", this.A00), new Object[0]);
        C0f9.A0A(-448654687, A032);
        C0f9.A0A(1165020277, A03);
    }
}
