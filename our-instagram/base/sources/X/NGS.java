package X;

import android.content.Context;
import com.google.common.io.Closeables;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* loaded from: classes9.dex */
public final class NGS extends AbstractRunnableC14200nk {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ String A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NGS(Context context, String str) {
        super(103, 4, false, false);
        this.A01 = str;
        this.A00 = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BufferedInputStream bufferedInputStream;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(this.A01);
            try {
                bufferedInputStream = new BufferedInputStream(fileInputStream);
                try {
                    try {
                        Context context = this.A00;
                        File A00 = AbstractC15860qg.A00(context, ".jpg");
                        if (A00 != null) {
                            AbstractC13530mf.A0B(A00, bufferedInputStream);
                            AbstractC50633MWu.A09(context, A00);
                        }
                    } catch (IOException | IllegalArgumentException | NullPointerException e) {
                        e = e;
                        C0K8.A0H("FollowersShareFragment", "Gallery save error", e);
                        Closeables.A01(fileInputStream);
                        Closeables.A01(bufferedInputStream);
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    Closeables.A01(fileInputStream2);
                    Closeables.A01(bufferedInputStream);
                    throw th;
                }
            } catch (IOException | IllegalArgumentException | NullPointerException e2) {
                e = e2;
                bufferedInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                bufferedInputStream = null;
                fileInputStream2 = fileInputStream;
                Closeables.A01(fileInputStream2);
                Closeables.A01(bufferedInputStream);
                throw th;
            }
        } catch (IOException | IllegalArgumentException | NullPointerException e3) {
            e = e3;
            bufferedInputStream = null;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            bufferedInputStream = null;
            Closeables.A01(fileInputStream2);
            Closeables.A01(bufferedInputStream);
            throw th;
        }
        Closeables.A01(fileInputStream);
        Closeables.A01(bufferedInputStream);
    }
}
