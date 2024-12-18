package X;

import android.content.SharedPreferences;
import com.facebook.stash.core.FileStash;

/* renamed from: X.86r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1822986r extends C1MM {
    public long A00;
    public final C1MA A01;
    public final String A02;

    public final synchronized void A00() {
        SharedPreferences sharedPreferences;
        long sizeBytes = super.A00.getSizeBytes();
        this.A00 = sizeBytes;
        C1MA c1ma = this.A01;
        String str = this.A02;
        synchronized (c1ma) {
            sharedPreferences = c1ma.A00;
            if (sharedPreferences == null) {
                sharedPreferences = AbstractC12290kX.A00.getSharedPreferences("stash", 0);
                c1ma.A00 = sharedPreferences;
            }
        }
        sharedPreferences.edit().putLong(AnonymousClass001.A0R(str, "/total_size"), sizeBytes).apply();
    }

    @Override // X.C1MM, com.facebook.stash.core.Stash
    public final synchronized long getSizeBytes() {
        long j;
        SharedPreferences sharedPreferences;
        j = this.A00;
        if (j <= 0) {
            C1MA c1ma = this.A01;
            String str = this.A02;
            synchronized (c1ma) {
                sharedPreferences = c1ma.A00;
                if (sharedPreferences == null) {
                    sharedPreferences = AbstractC12290kX.A00.getSharedPreferences("stash", 0);
                    c1ma.A00 = sharedPreferences;
                }
            }
            j = sharedPreferences.getLong(AnonymousClass001.A0R(str, "/total_size"), -1L);
            this.A00 = j;
            if (j <= 0) {
                A00();
                j = this.A00;
            }
        }
        return j;
    }

    public C1822986r(FileStash fileStash, C1MA c1ma, String str) {
        super(fileStash);
        this.A02 = str;
        this.A01 = c1ma;
    }
}
