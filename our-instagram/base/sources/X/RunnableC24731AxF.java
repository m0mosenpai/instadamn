package X;

import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.view.View;
import java.util.List;

/* renamed from: X.AxF, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24731AxF implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C200688uB A01;
    public final /* synthetic */ C22821A4q A02;

    public RunnableC24731AxF(C200688uB c200688uB, C22821A4q c22821A4q, long j) {
        this.A02 = c22821A4q;
        this.A00 = j;
        this.A01 = c200688uB;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final long j;
        C23128AMg c23128AMg = this.A02.A00;
        if (c23128AMg.A05 == -1) {
            c23128AMg.A05 = this.A00;
            final C8J4 c8j4 = c23128AMg.A0P;
            final String str = c23128AMg.A0R;
            C176567tE.A00(new Runnable() { // from class: X.AvH
                @Override // java.lang.Runnable
                public final void run() {
                    int i;
                    C8J4 c8j42 = C8J4.this;
                    String str2 = str;
                    C184978Im c184978Im = c8j42.A00;
                    if (C184978Im.A03(c184978Im, str2)) {
                        C184658Hg c184658Hg = c184978Im.A0H.A00.A0n;
                        C184668Hh c184668Hh = c184658Hg.A0G;
                        View view = c184658Hg.A0A;
                        if (c184658Hg.A0F.A0S()) {
                            i = Color.parseColor("#FBE9D2");
                        } else {
                            i = -1;
                        }
                        view.setBackgroundColor(i);
                        c184668Hh.A01(view);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 0.25f, 0.0f);
                        c184668Hh.A00 = ofFloat;
                        ofFloat.setDuration(100L);
                        c184668Hh.A00.setRepeatCount(-1);
                        c184668Hh.A00.addListener(new ANC(view, c184668Hh, null, 0.25f));
                        c184668Hh.A00.start();
                    }
                }
            });
        }
        List list = c23128AMg.A0T;
        if (list.size() <= 35) {
            list.add(this.A01);
        }
        final long j2 = this.A00 - c23128AMg.A05;
        if (!c23128AMg.A0Y) {
            final C8J4 c8j42 = c23128AMg.A0P;
            final String str2 = c23128AMg.A0R;
            if (c23128AMg.A0W) {
                j = 1000000000;
            } else {
                j = 1800000000;
            }
            C176567tE.A00(new Runnable() { // from class: X.Ayz
                @Override // java.lang.Runnable
                public final void run() {
                    C8J4 c8j43 = C8J4.this;
                    String str3 = str2;
                    long j3 = j2;
                    long j4 = j;
                    C184978Im c184978Im = c8j43.A00;
                    if (C184978Im.A03(c184978Im, str3)) {
                        c184978Im.A0H.A00(((float) j3) / ((float) j4));
                    }
                }
            });
        }
    }
}
