package X;

import android.view.View;
import com.instagram.api.schemas.StoryMusicPickTappableData;
import com.instagram.reels.musicpick.model.MusicPickReelTag;
import com.instagram.reels.musicpick.model.MusicPickStickerModel;

/* loaded from: classes4.dex */
public final class ASQ implements View.OnClickListener {
    public final /* synthetic */ C41181vS A00;
    public final /* synthetic */ C84823qW A01;
    public final /* synthetic */ InterfaceC144806g0 A02;
    public final /* synthetic */ C144286fA A03;

    public ASQ(C41181vS c41181vS, C84823qW c84823qW, InterfaceC144806g0 interfaceC144806g0, C144286fA c144286fA) {
        this.A01 = c84823qW;
        this.A03 = c144286fA;
        this.A02 = interfaceC144806g0;
        this.A00 = c41181vS;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(1389854371);
        C84823qW c84823qW = this.A01;
        StoryMusicPickTappableData storyMusicPickTappableData = c84823qW.A0X;
        if (storyMusicPickTappableData != null) {
            MusicPickStickerModel musicPickStickerModel = new MusicPickStickerModel(storyMusicPickTappableData);
            C144286fA c144286fA = this.A03;
            InterfaceC144806g0 interfaceC144806g0 = this.A02;
            C41181vS c41181vS = this.A00;
            if (musicPickStickerModel.A01 == 0) {
                View view2 = c144286fA.A00;
                if (view2 == null) {
                    C14360o3.A0F("buttonView");
                    throw C00O.createAndThrow();
                }
                view2.performHapticFeedback(1);
                StoryMusicPickTappableData storyMusicPickTappableData2 = c84823qW.A0X;
                if (storyMusicPickTappableData2 == null) {
                    IllegalStateException A0g = AbstractC166997dE.A0g();
                    C0f9.A0C(-1530706351, A05);
                    throw A0g;
                }
                interfaceC144806g0.DUQ(new MusicPickReelTag(c84823qW.A03, c84823qW.A04, c84823qW.A02, c84823qW.A00, c84823qW.A01, c41181vS.A00(), c84823qW.A09), new MusicPickStickerModel(storyMusicPickTappableData2));
            }
        }
        C0f9.A0C(137839453, A05);
    }
}
