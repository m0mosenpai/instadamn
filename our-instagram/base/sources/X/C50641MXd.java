package X;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.cameracountdown.CountdownView;
import java.lang.ref.WeakReference;

/* renamed from: X.MXd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50641MXd implements InterfaceC185498Kr {
    public int A00;
    public CountDownTimer A02;
    public C4PX A03;
    public AnonymousClass693 A04;
    public AnonymousClass693 A05;
    public WeakReference A06;
    public Runnable A07;
    public final View A08;
    public final ImageView A09;
    public final TextView A0A;
    public final AnonymousClass693 A0B;
    public final AnonymousClass693 A0C;
    public final AnonymousClass693 A0D;
    public final UserSession A0E;
    public final CountdownView A0F;
    public final Context A0H;
    public final ImageView A0I;
    public final Guideline A0J;
    public final boolean A0K;
    public final boolean A0L;
    public long A01 = -1;
    public final Runnable A0G = new RunnableC50642MXe(this);

    public static void A00(ImageView imageView, AnonymousClass693 anonymousClass693, InterfaceC57935Pmf interfaceC57935Pmf, C50641MXd c50641MXd, Integer num, Integer num2, long j, boolean z, boolean z2) {
        long j2;
        Integer num3 = num;
        View view = imageView;
        c50641MXd.A04();
        if (imageView != null) {
            TextView textView = c50641MXd.A0A;
            boolean z3 = false;
            if (num2 != null && textView != null) {
                textView.setText(num2.intValue());
                textView.setVisibility(0);
            }
            boolean z4 = c50641MXd.A0L;
            if (z4) {
                view = c50641MXd.A0F;
                num3 = C05F.A00;
            }
            view.setVisibility(0);
            c50641MXd.A03();
            if (c50641MXd.A02 == null) {
                z3 = true;
            }
            C18C.A0F(z3);
            if (num3.intValue() != 0) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = 1000;
            }
            CountDownTimerC50750MbF countDownTimerC50750MbF = new CountDownTimerC50750MbF(view, interfaceC57935Pmf, c50641MXd, num3, j, j2, z2, z);
            c50641MXd.A02 = countDownTimerC50750MbF;
            c50641MXd.A01 = SystemClock.elapsedRealtime();
            if (z4) {
                countDownTimerC50750MbF.start();
                ImageView imageView2 = c50641MXd.A09;
                Runnable runnable = c50641MXd.A0G;
                imageView2.removeCallbacks(runnable);
                imageView2.postOnAnimation(runnable);
                return;
            }
            PSM psm = new PSM(view, anonymousClass693, c50641MXd);
            c50641MXd.A07 = psm;
            C11T.A04(psm, 0L);
        }
    }

    public static void A01(C50641MXd c50641MXd) {
        AnonymousClass693 anonymousClass693 = c50641MXd.A0C;
        if (anonymousClass693 != null) {
            anonymousClass693.stop();
        }
        AnonymousClass693 anonymousClass6932 = c50641MXd.A0B;
        if (anonymousClass6932 != null) {
            anonymousClass6932.stop();
        }
        AnonymousClass693 anonymousClass6933 = c50641MXd.A0D;
        if (anonymousClass6933 != null) {
            anonymousClass6933.stop();
        }
        AnonymousClass693 anonymousClass6934 = c50641MXd.A04;
        if (anonymousClass6934 != null) {
            anonymousClass6934.stop();
        }
        AnonymousClass693 anonymousClass6935 = c50641MXd.A05;
        if (anonymousClass6935 != null) {
            anonymousClass6935.stop();
        }
        ImageView imageView = c50641MXd.A09;
        imageView.removeCallbacks(c50641MXd.A0G);
        c50641MXd.A0F.setVisibility(8);
        imageView.setImageDrawable(null);
        imageView.setVisibility(8);
        ImageView imageView2 = c50641MXd.A0I;
        imageView2.setImageDrawable(null);
        imageView2.setVisibility(8);
    }

    public static void A02(C50641MXd c50641MXd, int i) {
        if (c50641MXd.A0K) {
            try {
                MediaPlayer create = MediaPlayer.create(c50641MXd.A0H, i);
                if (create != null) {
                    create.setVolume(1.0f, 1.0f);
                    create.start();
                    create.setOnCompletionListener(new C48030LMz(c50641MXd, 1));
                }
            } catch (Exception e) {
                AbstractC12120kG.A0H("CountdownController", e);
            }
        }
    }

    public final void A03() {
        Guideline guideline;
        C4PX c4px = this.A03;
        if (c4px != null && (guideline = this.A0J) != null) {
            C8A3 A01 = C4PY.A01(c4px);
            float f = 1.0f;
            if (A01 == C8A3.A04) {
                f = 0.5f;
            }
            guideline.setGuidelinePercent(f);
        }
    }

    public final void A04() {
        Runnable runnable = this.A07;
        if (runnable != null) {
            C11T.A01(runnable);
            this.A07 = null;
        }
        this.A01 = -1L;
        CountDownTimer countDownTimer = this.A02;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.A02 = null;
        }
        A01(this);
        this.A0F.setVisibility(8);
        this.A09.setVisibility(8);
        this.A0I.setVisibility(8);
        this.A08.setVisibility(8);
    }

    @Override // X.InterfaceC185498Kr
    public final void D7s(int i) {
        InterfaceC185498Kr interfaceC185498Kr;
        this.A00 = i;
        WeakReference weakReference = this.A06;
        if (weakReference != null && (interfaceC185498Kr = (InterfaceC185498Kr) weakReference.get()) != null) {
            interfaceC185498Kr.D7s(i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0069, code lost:
    
        if (r1 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C50641MXd(android.content.Context r4, android.view.ViewGroup r5, com.instagram.common.session.UserSession r6, boolean r7) {
        /*
            r3 = this;
            r3.<init>()
            r0 = -1
            r3.A01 = r0
            X.MXe r0 = new X.MXe
            r0.<init>(r3)
            r3.A0G = r0
            r3.A0H = r4
            r3.A0E = r6
            r3.A0K = r7
            r0 = 2131429438(0x7f0b083e, float:1.8480549E38)
            android.view.View r0 = r5.findViewById(r0)
            if (r0 != 0) goto L23
            r0 = 2131438118(0x7f0b2a26, float:1.8498154E38)
            X.MSY.A0y(r5, r0)
        L23:
            r0 = 2131430884(0x7f0b0de4, float:1.8483482E38)
            android.view.View r0 = r5.requireViewById(r0)
            com.instagram.creation.capture.quickcapture.cameracountdown.CountdownView r0 = (com.instagram.creation.capture.quickcapture.cameracountdown.CountdownView) r0
            r3.A0F = r0
            r0 = 2131430865(0x7f0b0dd1, float:1.8483443E38)
            android.widget.ImageView r0 = X.AbstractC31173DnH.A0I(r5, r0)
            r3.A09 = r0
            r0 = 2131430859(0x7f0b0dcb, float:1.848343E38)
            android.view.View r0 = r5.requireViewById(r0)
            androidx.constraintlayout.widget.Guideline r0 = (androidx.constraintlayout.widget.Guideline) r0
            r3.A0J = r0
            r0 = 2131436427(0x7f0b238b, float:1.8494724E38)
            android.widget.ImageView r0 = X.AbstractC31173DnH.A0I(r5, r0)
            r3.A0I = r0
            r0 = 2131886100(0x7f120014, float:1.940677E38)
            X.693 r2 = X.C68U.A00(r4, r0)
            r3.A0C = r2
            r0 = 2131886098(0x7f120012, float:1.9406765E38)
            X.693 r0 = X.C68U.A00(r4, r0)
            r3.A0B = r0
            r0 = 2131886102(0x7f120016, float:1.9406773E38)
            X.693 r1 = X.C68U.A00(r4, r0)
            r3.A0D = r1
            if (r2 == 0) goto L6b
            r0 = 0
            if (r1 != 0) goto L6c
        L6b:
            r0 = 1
        L6c:
            r3.A0L = r0
            r0 = 2131430863(0x7f0b0dcf, float:1.8483439E38)
            android.view.View r0 = r5.requireViewById(r0)
            r3.A08 = r0
            int r0 = X.C8KL.A00(r6)
            r3.A00 = r0
            r0 = 2131430851(0x7f0b0dc3, float:1.8483415E38)
            android.widget.TextView r0 = X.AbstractC166997dE.A0T(r5, r0)
            r3.A0A = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50641MXd.<init>(android.content.Context, android.view.ViewGroup, com.instagram.common.session.UserSession, boolean):void");
    }
}
