package X;

import android.view.View;
import com.instagram.api.schemas.StoryMusicPickTappableData;
import com.instagram.reels.musicpick.model.MusicPickReelTag;
import com.instagram.reels.musicpick.model.MusicPickStickerModel;

/* loaded from: classes4.dex */
public final class ASK implements View.OnClickListener {
    public final /* synthetic */ C41181vS A00;
    public final /* synthetic */ C84823qW A01;
    public final /* synthetic */ InterfaceC144806g0 A02;

    public ASK(C41181vS c41181vS, C84823qW c84823qW, InterfaceC144806g0 interfaceC144806g0) {
        this.A02 = interfaceC144806g0;
        this.A01 = c84823qW;
        this.A00 = c41181vS;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MusicPickStickerModel musicPickStickerModel;
        IllegalStateException A14;
        int i;
        int A05 = C0f9.A05(505454863);
        InterfaceC144806g0 interfaceC144806g0 = this.A02;
        C84823qW c84823qW = this.A01;
        StoryMusicPickTappableData storyMusicPickTappableData = c84823qW.A0X;
        if (storyMusicPickTappableData == null) {
            musicPickStickerModel = null;
        } else {
            musicPickStickerModel = new MusicPickStickerModel(storyMusicPickTappableData);
        }
        if (musicPickStickerModel != null) {
            float f = c84823qW.A03;
            float f2 = c84823qW.A04;
            int i2 = c84823qW.A09;
            float f3 = c84823qW.A02;
            float f4 = c84823qW.A00;
            float f5 = c84823qW.A01;
            C41181vS c41181vS = this.A00;
            MusicPickReelTag musicPickReelTag = new MusicPickReelTag(f, f2, f3, f4, f5, c41181vS.A00(), i2);
            String str = c84823qW.A1j;
            if (str != null) {
                interfaceC144806g0.DUR(c41181vS, musicPickReelTag, musicPickStickerModel, str);
                C0f9.A0C(2100067457, A05);
                return;
            } else {
                A14 = AbstractC166987dD.A14("Required value was null.");
                i = -1815763161;
            }
        } else {
            A14 = AbstractC166987dD.A14("Required value was null.");
            i = -2117981363;
        }
        C0f9.A0C(i, A05);
        throw A14;
    }
}
