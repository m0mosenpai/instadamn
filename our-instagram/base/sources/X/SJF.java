package X;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes10.dex */
public final class SJF {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C62831STd A01;
    public final /* synthetic */ SHW A02;
    public final /* synthetic */ SN5 A03;
    public final /* synthetic */ C62621SJe A04;
    public final /* synthetic */ SLi A05;
    public final /* synthetic */ ExecutorService A06;
    public final /* synthetic */ ScheduledExecutorService A07;
    public final /* synthetic */ boolean A08;

    public SJF(Context context, C62831STd c62831STd, SHW shw, SN5 sn5, C62621SJe c62621SJe, SLi sLi, ExecutorService executorService, ScheduledExecutorService scheduledExecutorService, boolean z) {
        this.A03 = sn5;
        this.A04 = c62621SJe;
        this.A08 = z;
        this.A02 = shw;
        this.A07 = scheduledExecutorService;
        this.A05 = sLi;
        this.A00 = context;
        this.A01 = c62831STd;
        this.A06 = executorService;
    }
}
