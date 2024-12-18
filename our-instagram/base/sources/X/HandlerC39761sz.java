package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.facebook.flexiblesampling.SamplingResult;
import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.analytics.uploadscheduler.AnalyticsUploadAlarmReceiver;
import java.util.Iterator;
import java.util.Locale;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.1sz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerC39761sz extends Handler implements C1t0 {
    public boolean A00;
    public final long A01;
    public final C39091ri A02;
    public final C14080nY A03;
    public final String A04;
    public final Queue A05;
    public final C5FR A06;
    public final C37811pK A07;
    public final C37951pc A08;
    public final C12130kH A09;
    public final C218914p A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;

    private void A00() {
        while (true) {
            Queue queue = this.A05;
            if (!queue.isEmpty()) {
                C19280xC c19280xC = (C19280xC) queue.poll();
                if (c19280xC != null) {
                    A01(c19280xC, false);
                }
            } else {
                sendEmptyMessageDelayed(3, this.A01);
                C37951pc c37951pc = this.A08;
                synchronized (c37951pc) {
                    c37951pc.A02.A00();
                }
                return;
            }
        }
    }

    private void A01(C19280xC c19280xC, boolean z) {
        C39141rn A00;
        C12130kH c12130kH;
        if (this.A0C && (c12130kH = this.A09) != null) {
            if (!c12130kH.A03(this.A06, c19280xC, this.A04)) {
                return;
            }
        }
        SamplingResult samplingResult = c19280xC.A01;
        if (samplingResult != null) {
            A00 = this.A02.A00(samplingResult, C05F.A00, c19280xC.A04, z);
        } else {
            C39091ri c39091ri = this.A02;
            String str = c19280xC.A04;
            A00 = c39091ri.A00(c39091ri.A03.Eiw(str), C05F.A00, str, z);
        }
        A00.A03(c19280xC.A00);
        String str2 = c19280xC.A03;
        if (str2 != null) {
            C39141rn.A00(A00);
            A00.A0C = str2;
        }
        Integer num = c19280xC.A02;
        if (num != null) {
            int intValue = num.intValue();
            C39141rn.A00(A00);
            A00.A0A = Integer.valueOf(intValue);
        }
        Iterator it = c19280xC.A07.iterator();
        C14360o3.A07(it);
        int i = 0;
        while (it.hasNext()) {
            i = (int) (((EnumC11440j2) it.next()).A00 | i);
        }
        C39141rn.A00(A00);
        A00.A03 = i & AbstractC39801t4.A00;
        try {
            c19280xC.A06.A07(A00.A08());
            A00.A06("pk", this.A04);
            A00.A06("release_channel", EnumC12920le.A00().name().toLowerCase(Locale.US));
            A00.A09();
        } catch (Exception e) {
            throw new RuntimeException(AnonymousClass001.A0R("Exception thrown while converting extras to param collection map for event name=", c19280xC.A04), e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0010  */
    @Override // X.C1t0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void EHX(X.C19280xC r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HandlerC39761sz.EHX(X.0xC, boolean):void");
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C37811pK c37811pK;
        if (message != null) {
            int i = message.what;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                boolean A08 = C218914p.A08();
                                if (this.A0B && A08) {
                                    A00();
                                }
                                c37811pK = this.A07;
                                if (c37811pK != null) {
                                    if (!A08 && !this.A0D) {
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            A00();
                            c37811pK = this.A07;
                            if (c37811pK == null || this.A0D) {
                                return;
                            }
                        }
                        if (c37811pK.A02 != null) {
                            Context context = c37811pK.A01;
                            AlarmManager alarmManager = c37811pK.A00;
                            C14360o3.A0B(context, 0);
                            C14360o3.A0B(alarmManager, 1);
                            EnumC73993Tl enumC73993Tl = EnumC73993Tl.A06;
                            if (!enumC73993Tl.A02) {
                                PendingIntent pendingIntent = enumC73993Tl.A01;
                                if (pendingIntent == null) {
                                    Intent intent = new Intent(context, (Class<?>) AnalyticsUploadAlarmReceiver.class);
                                    intent.setAction("action_batch_upload");
                                    C04750Mt c04750Mt = new C04750Mt();
                                    c04750Mt.A0B(intent, context.getClassLoader());
                                    pendingIntent = c04750Mt.A02(context, 0, 134217728);
                                    enumC73993Tl.A01 = pendingIntent;
                                }
                                if (pendingIntent != null) {
                                    try {
                                        alarmManager.set(2, SystemClock.elapsedRealtime() + enumC73993Tl.A00, pendingIntent);
                                    } catch (NullPointerException e) {
                                        C0K8.A0K("AnalyticsUploadAlarm", "NPE when scheduling alarm.", e);
                                    }
                                    enumC73993Tl.A02 = true;
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                } else {
                    Object obj = message.obj;
                    if (obj instanceof C19280xC) {
                        A01((C19280xC) obj, true);
                    }
                    if (!this.A00) {
                        return;
                    }
                }
                while (true) {
                    Queue queue = this.A05;
                    if (!queue.isEmpty()) {
                        this.A03.A03(LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
                        C19280xC c19280xC = (C19280xC) queue.poll();
                        if (c19280xC != null) {
                            A01(c19280xC, false);
                        }
                    } else {
                        sendEmptyMessageDelayed(3, this.A01);
                        return;
                    }
                }
            } else {
                Object obj2 = message.obj;
                if (obj2 instanceof C19280xC) {
                    A01((C19280xC) obj2, false);
                }
            }
        }
    }

    public HandlerC39761sz(Looper looper, C5FR c5fr, C39091ri c39091ri, C37811pK c37811pK, C37951pc c37951pc, C12130kH c12130kH, String str, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        super(looper);
        this.A05 = new ConcurrentLinkedQueue();
        this.A09 = c12130kH;
        this.A02 = c39091ri;
        this.A04 = str;
        this.A03 = C14080nY.A00();
        this.A01 = j;
        this.A00 = z;
        this.A08 = c37951pc;
        this.A07 = c37811pK;
        this.A0B = z2;
        this.A0D = z3;
        this.A0A = C218914p.A08;
        this.A0E = z4;
        this.A0C = z6;
        this.A06 = c5fr;
        sendEmptyMessageDelayed(3, j);
        if (z3 && !z5 && c37811pK != null) {
            sendEmptyMessageDelayed(5, j);
        }
    }
}
