package X;

import android.app.Activity;
import android.view.View;
import com.instagram.reels.musicpick.model.MusicPickReelTag;
import com.instagram.reels.musicpick.model.MusicPickStickerModel;

/* renamed from: X.Oin, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnClickListenerC55377Oin implements View.OnClickListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ N7L A01;

    public ViewOnClickListenerC55377Oin(Activity activity, N7L n7l) {
        this.A01 = n7l;
        this.A00 = activity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(1817012424);
        N7L n7l = this.A01;
        MusicPickReelTag musicPickReelTag = (MusicPickReelTag) n7l.requireArguments().getParcelable(AbstractC111324zv.A00(1929));
        if (musicPickReelTag != null) {
            InterfaceC09390do interfaceC09390do = n7l.A0C;
            if (interfaceC09390do.getValue() != null) {
                ((C146176iG) n7l.A0D.getValue()).A01(C22P.A3Z, musicPickReelTag, (MusicPickStickerModel) interfaceC09390do.getValue());
            }
        }
        AbstractC167017dG.A0y(this.A00, C3DN.A00);
        C0f9.A0C(-489921430, A05);
    }
}
