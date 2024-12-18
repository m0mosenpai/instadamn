package X;

import com.instagram.creation.capture.quickcapture.superlativesticker.model.SuperlativeMentionSticker;
import java.util.Arrays;

/* renamed from: X.J4p, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC43126J4p implements Runnable {
    public final /* synthetic */ C41181vS A00;
    public final /* synthetic */ C140536Xh A01;

    public RunnableC43126J4p(C41181vS c41181vS, C140536Xh c140536Xh) {
        this.A00 = c41181vS;
        this.A01 = c140536Xh;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C41618Ib8 c41618Ib8 = this.A00.A0E;
        c41618Ib8.getClass();
        SuperlativeMentionSticker[] superlativeMentionStickerArr = (SuperlativeMentionSticker[]) this.A01.A00.toArray(new SuperlativeMentionSticker[0]);
        c41618Ib8.A00((SuperlativeMentionSticker[]) Arrays.copyOf(superlativeMentionStickerArr, superlativeMentionStickerArr.length));
    }
}
