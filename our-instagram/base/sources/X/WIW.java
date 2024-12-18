package X;

import android.media.MediaRecorder;

/* loaded from: classes11.dex */
public final class WIW implements MediaRecorder.OnErrorListener {
    public final /* synthetic */ C66055Tys A00;

    public WIW(C66055Tys c66055Tys) {
        this.A00 = c66055Tys;
    }

    @Override // android.media.MediaRecorder.OnErrorListener
    public final void onError(MediaRecorder mediaRecorder, int i, int i2) {
        StringBuilder sb;
        String str;
        if (i == 100) {
            sb = new StringBuilder();
            str = "MediaRecorder server died. Code: ";
        } else {
            sb = new StringBuilder();
            str = "Unknown MediaRecorder error. Code: ";
        }
        C66055Tys.A00(this.A00, new IllegalStateException(AbstractC58320PtC.A12(str, sb, i2)));
    }
}
