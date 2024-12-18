package X;

import com.instagram.music.common.model.MusicOverlayStickerModel;
import java.util.List;

/* renamed from: X.AlG, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24024AlG implements C8GD {
    public int A00;
    public MusicOverlayStickerModel A01;
    public Al0 A02;
    public EnumC138556Pl A03;
    public boolean A04;

    @Override // X.C8GD
    public final void EZN(MusicOverlayStickerModel musicOverlayStickerModel) {
        C14360o3.A0B(musicOverlayStickerModel, 0);
        this.A01 = musicOverlayStickerModel;
    }

    @Override // X.C5NL
    public final /* synthetic */ List B6F() {
        return C16930sl.A00;
    }

    @Override // X.C8GD
    public final MusicOverlayStickerModel BVf() {
        MusicOverlayStickerModel musicOverlayStickerModel = this.A01;
        if (musicOverlayStickerModel != null) {
            return musicOverlayStickerModel;
        }
        C14360o3.A0F("musicOverlayStickerModel");
        throw C00O.createAndThrow();
    }

    @Override // X.C8GD
    public final EnumC138556Pl BVp() {
        return this.A03;
    }

    @Override // X.C5NL
    public final C5NG BlQ() {
        C5NG c5ng;
        List A1J;
        if (this.A04) {
            c5ng = new C5NG();
            c5ng.A01 = C5NH.A04;
            EnumC138556Pl enumC138556Pl = EnumC138556Pl.A0F;
            A1J = AbstractC16960so.A1Q(enumC138556Pl.A01(), enumC138556Pl.A01(), EnumC138556Pl.A0E.A01());
        } else {
            c5ng = new C5NG();
            c5ng.A01 = C5NH.A04;
            A1J = AbstractC166987dD.A1J(this.A03.A01());
        }
        c5ng.A06 = A1J;
        return c5ng;
    }

    @Override // X.C8GD
    public final int C0U() {
        return this.A00;
    }

    @Override // X.C5NL
    public final Integer CBq() {
        return C05F.A0E;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C24024AlG(MusicOverlayStickerModel musicOverlayStickerModel, Al0 al0, EnumC138556Pl enumC138556Pl, int i) {
        this();
        AbstractC167017dG.A1P(enumC138556Pl, musicOverlayStickerModel);
        this.A03 = enumC138556Pl;
        this.A01 = musicOverlayStickerModel;
        this.A00 = i;
        this.A02 = al0;
    }

    public C24024AlG() {
        this.A03 = EnumC138556Pl.A0J;
    }
}
