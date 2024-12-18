package X;

import android.content.SharedPreferences;

/* renamed from: X.RMg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60688RMg extends AbstractC60694RMm {
    public SharedPreferences A00;
    public long A01;
    public long A02;
    public final SW5 A03;

    public C60688RMg(C63335Shm c63335Shm) {
        super(c63335Shm);
        this.A02 = -1L;
        this.A03 = new SW5(this, AbstractC166987dD.A0N(SVM.A09.A00));
    }

    public final long A0J() {
        SX6.A00();
        A0I();
        long j = this.A01;
        if (j == 0) {
            j = this.A00.getLong("first_run", 0L);
            if (j == 0) {
                j = System.currentTimeMillis();
                SharedPreferences.Editor edit = this.A00.edit();
                edit.putLong("first_run", j);
                if (!edit.commit()) {
                    AbstractC63371Sic.A09(this, "Failed to commit first run time", 5);
                }
            }
            this.A01 = j;
        }
        return j;
    }

    public final long A0K() {
        SX6.A00();
        A0I();
        long j = this.A02;
        if (j == -1) {
            long j2 = this.A00.getLong("last_dispatch", 0L);
            this.A02 = j2;
            return j2;
        }
        return j;
    }

    public final void A0L() {
        SX6.A00();
        A0I();
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor edit = this.A00.edit();
        edit.putLong("last_dispatch", currentTimeMillis);
        edit.apply();
        this.A02 = currentTimeMillis;
    }
}
