package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;

/* loaded from: classes9.dex */
public final class PUP implements Callable {
    public final Context A00;
    public final Bitmap A01;
    public final Bitmap A02;
    public final InterfaceC57938Pmi A03;
    public final boolean A04;
    public final boolean A05;

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        File file;
        Bitmap bitmap = this.A02;
        Bitmap bitmap2 = this.A01;
        if (bitmap2 != null && !bitmap.isRecycled()) {
            AbstractC43592JPx.A06(bitmap).drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
        }
        boolean z = this.A05;
        Context context = this.A00;
        if (z) {
            file = AbstractC15860qg.A00(context, ".jpg");
        } else {
            try {
                file = File.createTempFile("screenshot", ".jpg", context.getFilesDir());
            } catch (IOException e) {
                C0K8.A0F("PhotoFileUtil", "unable to create temp file", e);
                file = null;
            }
        }
        if (file == null) {
            C11T.A02(new PSN(this, null, false));
            return null;
        }
        boolean A0K = C1NC.A0K(context, Bitmap.CompressFormat.JPEG, bitmap, file);
        if (this.A04) {
            bitmap.recycle();
        }
        if (!A0K) {
            C11T.A02(new PSN(this, null, false));
            return null;
        }
        if (z) {
            AbstractC50633MWu.A09(context, file);
        }
        C11T.A02(new PSN(this, file.getPath(), true));
        return file.getPath();
    }

    public PUP(Context context, Bitmap bitmap, Bitmap bitmap2, InterfaceC57938Pmi interfaceC57938Pmi, boolean z, boolean z2) {
        this.A00 = context;
        this.A02 = bitmap;
        this.A01 = bitmap2;
        this.A04 = z;
        this.A05 = z2;
        this.A03 = interfaceC57938Pmi;
    }
}
