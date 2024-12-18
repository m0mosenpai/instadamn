package X;

import android.content.ContentResolver;
import android.content.Context;
import android.media.AudioManager;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* loaded from: classes9.dex */
public final class OEF {
    public C50739Mat A00;
    public C53738Npq A01;
    public Future A02;
    public final ContentResolver A03;
    public final AudioManager A04;
    public final ExecutorService A05;
    public final C55000OUz A06;

    public OEF(Context context, AudioManager audioManager, C53738Npq c53738Npq, C55000OUz c55000OUz, ExecutorService executorService) {
        this.A04 = audioManager;
        this.A06 = c55000OUz;
        ContentResolver contentResolver = context.getContentResolver();
        C14360o3.A07(contentResolver);
        this.A03 = contentResolver;
        this.A01 = c53738Npq;
        this.A05 = executorService;
    }
}
