package X;

import android.media.MediaPlayer;
import java.util.Arrays;

/* loaded from: classes8.dex */
public final class LN3 implements MediaPlayer.OnErrorListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public LN3(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        int i3 = this.A00;
        String A0z = AbstractC166997dE.A0z("Media player error what: %d, extra: %d", Arrays.copyOf(AbstractC25228BEl.A1Z(Integer.valueOf(i), i2), 2));
        if (i3 != 0) {
            C0w9.A03("NoteQuickReplySheetFragment:setNoteVideoPog", A0z);
            C45487KCc.A04((C45487KCc) this.A02, (C45842KQx) this.A01);
            return true;
        }
        C0w9.A03("SelfNoteBottomSheetFragment:setNoteVideoPog", A0z);
        KDQ.A04((KDQ) this.A02, (C45838KQt) this.A01);
        return true;
    }
}
