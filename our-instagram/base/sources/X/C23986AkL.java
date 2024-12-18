package X;

import com.instagram.music.common.model.MusicOverlayStickerModel;

/* renamed from: X.AkL, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23986AkL implements AnonymousClass876 {
    public final /* synthetic */ MusicOverlayStickerModel A00;

    @Override // X.AnonymousClass876
    public final void EZO(int i) {
    }

    public C23986AkL(MusicOverlayStickerModel musicOverlayStickerModel) {
        this.A00 = musicOverlayStickerModel;
    }

    @Override // X.AnonymousClass876
    public final int BVm() {
        Integer num = this.A00.A0O;
        if (num != null) {
            int intValue = num.intValue();
            if (intValue > 60000) {
                return 60000;
            }
            return intValue;
        }
        throw AbstractC166997dE.A0g();
    }
}
