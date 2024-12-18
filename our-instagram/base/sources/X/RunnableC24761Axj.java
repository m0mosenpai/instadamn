package X;

import android.os.SystemClock;
import com.facebook.quicklog.reliability.CancelReason;
import java.io.File;

/* renamed from: X.Axj, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24761Axj implements Runnable {
    public final /* synthetic */ C51753Mtc A00;
    public final /* synthetic */ Y1s A01;
    public final /* synthetic */ C8IH A02;

    public RunnableC24761Axj(C51753Mtc c51753Mtc, Y1s y1s, C8IH c8ih) {
        this.A02 = c8ih;
        this.A01 = y1s;
        this.A00 = c51753Mtc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C88X A0D;
        C8IH c8ih = this.A02;
        Y1s y1s = this.A01;
        C51753Mtc c51753Mtc = this.A00;
        y1s.A01(Y1s.A0V);
        y1s.A01(Y1s.A0W);
        SystemClock.elapsedRealtime();
        C8IE c8ie = c8ih.A00;
        c8ie.A0V.setButtonActionsEnabled(true);
        c8ie.A0K.A07();
        C1821786b c1821786b = c8ie.A0N;
        c1821786b.A0K = false;
        C1821786b.A06(c1821786b);
        C8FG c8fg = c8ie.A0Q;
        if (c8fg != null && (A0D = c8fg.A0D()) != null && A0D.A04 != C88Z.A0G && !(c8ie.A0I.A08.A00 instanceof C81V)) {
            c8ie.A0P.A0C(true);
        }
        C8HI c8hi = c8ie.A0J.A00;
        if (c8hi.A0I) {
            c8ie.A0O.A02.A08(C05F.A00);
            File file = c8ie.A07;
            file.getClass();
            Y1s y1s2 = c8ie.A00;
            y1s2.getClass();
            C195868lW A04 = AbstractC209669Pc.A04(y1s2, file);
            int i = c51753Mtc.A01;
            A04.A07 = i;
            A04.A0H = 0;
            A04.A06 = i;
            A04.A0U = (C18160v1) c51753Mtc.A02;
            Y1s y1s3 = (Y1s) c8ie.A00.A01(Y1s.A0R);
            if (y1s3 != null) {
                File file2 = c8ie.A06;
                file2.getClass();
                A04.A0X = AbstractC209669Pc.A04(y1s3, file2);
            }
            if (c8ie.A0Z) {
                c8ie.A07(A04);
            }
            C183348Bh A00 = AbstractC183338Bg.A00(c8ie.A0H);
            A00.A05 = A00.A0K.A02(17636574, A00.A05);
            c8ie.A04.A06(A04);
            return;
        }
        C174757qB c174757qB = c8ie.A01;
        c174757qB.getClass();
        c174757qB.A0C();
        C183348Bh A002 = AbstractC183338Bg.A00(c8ie.A0H);
        String A0R = AnonymousClass001.A0R("Video Recording Stopped Successfully, but Camera Not Resumed - ", c8hi.A0H);
        C14360o3.A0B(A0R, 1);
        A002.A05 = A002.A0K.A06(CancelReason.SYSTEM_CANCELLED, A0R, 17636574, A002.A05);
        C8XV c8xv = c8ie.A04;
        if (!(c8xv.A05.A08.A00 instanceof C81V)) {
            return;
        }
        c8xv.A0M.Dys();
        C89F.A01(c8xv.A06);
    }
}
