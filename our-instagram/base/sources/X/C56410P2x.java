package X;

import com.instagram.api.schemas.ACRType;
import com.instagram.music.common.model.MusicOverlayStickerModel;

/* renamed from: X.P2x, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56410P2x implements InterfaceC199918sv {
    public final /* synthetic */ C22P A00;
    public final /* synthetic */ ACRType A01;
    public final /* synthetic */ C41181vS A02;
    public final /* synthetic */ C145176gc A03;

    public C56410P2x(C22P c22p, ACRType aCRType, C41181vS c41181vS, C145176gc c145176gc) {
        this.A03 = c145176gc;
        this.A02 = c41181vS;
        this.A00 = c22p;
        this.A01 = aCRType;
    }

    @Override // X.InterfaceC199918sv
    public final void onClick() {
        MusicOverlayStickerModel A04;
        C145176gc c145176gc = this.A03;
        C41181vS c41181vS = this.A02;
        C22P c22p = this.A00;
        ACRType aCRType = this.A01;
        if (c41181vS.A1K()) {
            A04 = null;
        } else {
            A04 = AbstractC101614hW.A04(c41181vS);
        }
        C145176gc.A01(c22p, aCRType, c41181vS, A04, c145176gc);
    }
}
