package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Lrl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49353Lrl implements MQ7 {
    public final /* synthetic */ C5zZ A00;

    public C49353Lrl(C5zZ c5zZ) {
        this.A00 = c5zZ;
    }

    @Override // X.MQ7
    public final void onFailure() {
    }

    @Override // X.MQ7
    public final void onSuccess() {
        UserSession userSession = this.A00.A01;
        new LFw(userSession).A00(AbstractC111324zv.A00(4639));
        AbstractC23021Ah.A00(userSession).A1e(true);
        C47859LCf.A00(2L, "DEFAULT_ON_BY_META");
    }
}
