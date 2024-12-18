package X;

import android.app.job.JobParameters;
import android.content.Intent;

/* renamed from: X.0yI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC19880yI {
    public boolean A00;
    public final AbstractJobServiceC19890yJ A01;

    public AbstractC19880yI(AbstractJobServiceC19890yJ abstractJobServiceC19890yJ) {
        C14360o3.A0B(abstractJobServiceC19890yJ, 1);
        C0eQ.A00();
        this.A01 = abstractJobServiceC19890yJ;
    }

    public abstract int A00(Intent intent, int i, int i2);

    public abstract void A02();

    public abstract boolean A03(JobParameters jobParameters);

    public abstract boolean A04(JobParameters jobParameters);

    public void A01() {
        this.A01.A01();
    }
}
