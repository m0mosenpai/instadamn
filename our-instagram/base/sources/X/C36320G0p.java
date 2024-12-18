package X;

import com.instagram.api.schemas.FanClubInfoDict;
import com.instagram.clips.model.metadata.ClipsFanClubMetadata;
import com.instagram.user.model.User;

/* renamed from: X.G0p, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36320G0p implements BBu {
    public final /* synthetic */ User A00;

    @Override // X.BBu
    public final void F8R(C47Z c47z) {
        String fanClubId;
        C14360o3.A0B(c47z, 0);
        EnumC76383bi enumC76383bi = EnumC76383bi.A07;
        C14360o3.A0B(enumC76383bi, 0);
        c47z.A1F = enumC76383bi;
        FanClubInfoDict A0M = AbstractC31172DnG.A0M(this.A00);
        if (A0M != null && (fanClubId = A0M.getFanClubId()) != null) {
            c47z.A11 = new ClipsFanClubMetadata(EnumC31515Dsz.A07, fanClubId);
        }
    }

    public C36320G0p(User user) {
        this.A00 = user;
    }
}
