package X;

import com.instagram.music.common.model.MusicOverlayStickerModel;
import java.util.List;

/* renamed from: X.AlH, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24025AlH implements C8GD {
    public int A00;
    public C38059Gom A01;
    public MusicOverlayStickerModel A02;
    public Al0 A03;
    public EnumC138556Pl A04;

    @Override // X.C8GD
    public final void EZN(MusicOverlayStickerModel musicOverlayStickerModel) {
        C14360o3.A0B(musicOverlayStickerModel, 0);
        this.A02 = musicOverlayStickerModel;
    }

    public final C70993Wm9 A00() {
        C38059Gom c38059Gom = this.A01;
        if (c38059Gom != null) {
            return new C70993Wm9(c38059Gom);
        }
        C14360o3.A0F("musicAssetLyrics");
        throw C00O.createAndThrow();
    }

    @Override // X.C5NL
    public final /* synthetic */ List B6F() {
        return C16930sl.A00;
    }

    @Override // X.C8GD
    public final MusicOverlayStickerModel BVf() {
        MusicOverlayStickerModel musicOverlayStickerModel = this.A02;
        if (musicOverlayStickerModel != null) {
            return musicOverlayStickerModel;
        }
        C14360o3.A0F("musicOverlayStickerModel");
        throw C00O.createAndThrow();
    }

    @Override // X.C8GD
    public final EnumC138556Pl BVp() {
        EnumC138556Pl enumC138556Pl = this.A04;
        if (enumC138556Pl != null) {
            return enumC138556Pl;
        }
        C14360o3.A0F("musicStickerDisplayType");
        throw C00O.createAndThrow();
    }

    @Override // X.C5NL
    public final C5NG BlQ() {
        C5NG c5ng = new C5NG();
        c5ng.A01 = C5NH.A04;
        c5ng.A06 = AbstractC166987dD.A1J(BVp().A01());
        return c5ng;
    }

    @Override // X.C8GD
    public final int C0U() {
        return this.A00;
    }

    @Override // X.C5NL
    public final Integer CBq() {
        return C05F.A0A;
    }

    public C24025AlH(C38059Gom c38059Gom, MusicOverlayStickerModel musicOverlayStickerModel, Al0 al0, EnumC138556Pl enumC138556Pl, int i) {
        AbstractC167017dG.A1P(enumC138556Pl, musicOverlayStickerModel);
        this.A04 = enumC138556Pl;
        this.A02 = musicOverlayStickerModel;
        this.A01 = c38059Gom;
        this.A00 = i;
        this.A03 = al0;
    }

    public C24025AlH() {
    }
}
