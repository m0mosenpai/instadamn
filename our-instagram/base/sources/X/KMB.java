package X;

import android.content.Context;
import com.google.common.io.Closeables;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.ref.WeakReference;

/* loaded from: classes8.dex */
public final class KMB extends AbstractRunnableC14200nk {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ android.net.Uri A01;
    public final /* synthetic */ WeakReference A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KMB(Context context, android.net.Uri uri, WeakReference weakReference) {
        super(108, 4, false, false);
        this.A00 = context;
        this.A01 = uri;
        this.A02 = weakReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BufferedInputStream bufferedInputStream;
        String str;
        File A07;
        boolean A0B;
        try {
            try {
                A07 = AbstractC916948n.A07();
            } catch (FileNotFoundException | NullPointerException e) {
                e = e;
                bufferedInputStream = null;
            }
            if (A07.exists() || A07.mkdir()) {
                File file = new File(A07, AnonymousClass001.A0R(AbstractC916948n.A08(System.currentTimeMillis()), ".mp4"));
                InputStream openInputStream = this.A00.getContentResolver().openInputStream(this.A01);
                if (openInputStream != null) {
                    bufferedInputStream = new BufferedInputStream(openInputStream);
                    try {
                        A0B = AbstractC13530mf.A0B(file, bufferedInputStream);
                        Closeables.A01(bufferedInputStream);
                    } catch (FileNotFoundException | NullPointerException e2) {
                        e = e2;
                        C0K8.A0H("VideoImportUtil", "Save Video File copy file error", e);
                        str = "video_invalid_url";
                        C11T.A02(new RunnableC49935M3c(str, this.A02));
                    }
                    if (A0B) {
                        str = file.getAbsolutePath();
                        C11T.A02(new RunnableC49935M3c(str, this.A02));
                    }
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            }
            str = "video_invalid_url";
            C11T.A02(new RunnableC49935M3c(str, this.A02));
        } finally {
            if (bufferedInputStream != null) {
                Closeables.A01(bufferedInputStream);
            }
        }
    }
}
