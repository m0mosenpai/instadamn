package X;

import com.facebook.rsys.moderator.gen.ModeratorApi;
import com.facebook.rsys.moderator.gen.ModeratorProxy;

/* renamed from: X.Mzb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52021Mzb extends ModeratorProxy {
    public ModeratorApi A00;

    @Override // com.facebook.rsys.moderator.gen.ModeratorProxy
    public final void setApi(ModeratorApi moderatorApi) {
        C14360o3.A0B(moderatorApi, 0);
        this.A00 = moderatorApi;
    }

    @Override // com.facebook.rsys.moderator.gen.ModeratorProxy
    public final void userWasSoftMuted() {
    }
}
