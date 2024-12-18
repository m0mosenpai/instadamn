package X;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.core.content.FileProvider;
import java.io.File;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final class B1O implements Callable {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final boolean A03;

    public B1O(int i, Object obj, Object obj2, boolean z) {
        this.A00 = i;
        this.A03 = z;
        this.A02 = obj2;
        this.A01 = obj;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        String str;
        Bitmap.CompressFormat compressFormat;
        if (this.A00 != 0) {
            boolean z = this.A03;
            Context context = ((LLI) this.A02).A04;
            if (z) {
                str = ".png";
            } else {
                str = ".jpg";
            }
            File A00 = AbstractC15860qg.A00(context, str);
            if (A00 != null) {
                Bitmap bitmap = (Bitmap) this.A01;
                if (z) {
                    compressFormat = Bitmap.CompressFormat.PNG;
                } else {
                    compressFormat = Bitmap.CompressFormat.JPEG;
                }
                C1NC.A0L(compressFormat, bitmap, A00, 100);
                return FileProvider.A00(context, A00);
            }
            return null;
        }
        C208789Lm c208789Lm = (C208789Lm) this.A01;
        if (c208789Lm.isConnected()) {
            if (this.A03) {
                C209049Mm c209049Mm = c208789Lm.A0I;
                if (c209049Mm.A07) {
                    c209049Mm.A04 = true;
                    c209049Mm.A01();
                }
            }
            C208999Mh A01 = C208789Lm.A01(c208789Lm, c208789Lm.A00);
            try {
                ((AbstractC176827te) A01).A00.A01(AbstractC176797tb.A0P, false);
                ((AbstractC176827te) A01).A00.A01(AbstractC176797tb.A0R, false);
                A01.A03();
                return null;
            } catch (RuntimeException e) {
                ((AbstractC184688Hj) this.A02).A01(e);
                return null;
            }
        }
        throw new RuntimeException(AnonymousClass001.A0R("Camera not initialised: ", "Failed to unlock automatics (focus, exposure, white-balance)"));
    }
}
