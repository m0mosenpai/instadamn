package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2rL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C61582rL extends C1I2 implements InterfaceC12870lZ, InterfaceC60602pj {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public JHG A04;
    public C62112sC A05;
    public boolean A06;
    public boolean A07;
    public final int A08;
    public final C006802i A09;
    public final String A0A;
    public final C01U A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final DisplayMetrics A0E;

    public C61582rL(Context context, C006802i c006802i, UserSession userSession, String str, int i) {
        C14360o3.A0B(str, 3);
        C14360o3.A0B(userSession, 4);
        this.A08 = i;
        this.A0A = str;
        this.A09 = c006802i;
        this.A0B = new C01U();
        this.A0E = context.getResources().getDisplayMetrics();
        C06090Tz c06090Tz = C06090Tz.A06;
        this.A0D = C18U.A06(c06090Tz, userSession, 36314519718333097L);
        this.A0C = C18U.A06(c06090Tz, userSession, 36314519718398634L);
    }

    public final void A02() {
        this.A03 = 0;
        this.A01 = 0;
        this.A00 = 0;
        this.A02 = 0;
    }

    public void A03(short s, boolean z) {
        if (z) {
            C006802i c006802i = this.A09;
            int i = this.A08;
            C218914p c218914p = C218914p.A08;
            c006802i.markerEnd(i, s, AwakeTimeSinceBootClock.INSTANCE.now() - LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT, TimeUnit.MILLISECONDS);
            return;
        }
        if (this.A0B.size() > 0) {
            C0K8.A0E("TailLoadPerfLogger", "On-going requests in flight on end marker.");
        }
        this.A09.markerEnd(this.A08, s);
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void D8S(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onCreate() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroy() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroyView() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if (r7.A0C == false) goto L10;
     */
    @Override // X.InterfaceC60602pj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPause() {
        /*
            r7 = this;
            r6 = 0
            r7.A01(r6)
            boolean r0 = r7.A06
            if (r0 != 0) goto L43
            int r1 = r7.A02
            int r0 = r7.A01
            if (r1 <= r0) goto L43
            X.02i r5 = r7.A09
            int r4 = r7.A08
            r5.markerStart(r4)
            java.lang.String r1 = "module"
            java.lang.String r0 = r7.A0A
            r5.markerAnnotate(r4, r1, r0)
            java.lang.String r2 = "is_user_sampled"
            boolean r0 = r7.A0D
            r3 = 1
            if (r0 == 0) goto L28
            boolean r1 = r7.A0C
            r0 = 1
            if (r1 != 0) goto L29
        L28:
            r0 = 0
        L29:
            r5.markerAnnotate(r4, r2, r0)
            java.lang.String r2 = "scroll_distance"
            int r1 = r7.A02
            int r0 = r7.A01
            int r1 = r1 - r0
            r5.markerAnnotate(r4, r2, r1)
            java.lang.String r0 = "scroll_event"
            r5.markerAnnotate(r4, r0, r3)
            r0 = 2
            r7.A03(r0, r6)
            int r0 = r7.A02
            r7.A01 = r0
        L43:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61582rL.onPause():void");
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onResume() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStart() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStop() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public static final void A00(C61582rL c61582rL, boolean z) {
        JHG jhg;
        if (!z && (jhg = c61582rL.A04) != null) {
            jhg.DDX(C05F.A00);
        }
        if (c61582rL.A06 && !c61582rL.A07 && c61582rL.A05 == null) {
            C006802i c006802i = c61582rL.A09;
            if (z) {
                c006802i.markerPoint(c61582rL.A08, "tail_load_interruption_end");
            }
            c006802i.markerAnnotate(c61582rL.A08, "scroll_distance", c61582rL.A00 - c61582rL.A01);
            c61582rL.A01 = c61582rL.A00;
            c61582rL.A03((short) 2, false);
            c61582rL.A06 = false;
            C218914p.A06(c61582rL);
        }
    }

    private final void A01(boolean z) {
        JHG jhg = this.A04;
        if (jhg != null) {
            jhg.DDX(C05F.A0C);
        }
        if (this.A06) {
            this.A09.markerAnnotate(this.A08, "scroll_distance", this.A00 - this.A01);
            this.A01 = this.A00;
            A03((short) 4, z);
            this.A06 = false;
            C218914p.A06(this);
        }
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(773167759);
        A01(true);
        C0f9.A0A(-1878493089, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        C0f9.A0A(-565875453, C0f9.A03(-616180119));
    }

    @Override // X.C1I2
    public final void onScroll(C3FQ c3fq, int i, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int A03 = C0f9.A03(-1496942068);
        C14360o3.A0B(c3fq, 0);
        if (i5 == 0) {
            i6 = -1689167369;
        } else {
            int i8 = this.A03;
            DisplayMetrics displayMetrics = this.A0E;
            C14360o3.A06(displayMetrics);
            RectF rectF = AbstractC13880nE.A01;
            int i9 = i8 + ((int) (i5 / displayMetrics.density));
            this.A03 = i9;
            if (i9 > this.A02) {
                this.A02 = i9;
            }
            if (i9 < 0.0d) {
                if (c3fq.CFj() instanceof RecyclerView) {
                    C14360o3.A0C(c3fq.CFj(), "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
                    i7 = (int) (((RecyclerView) r1).computeVerticalScrollOffset() / displayMetrics.density);
                } else {
                    i7 = 0;
                }
                this.A03 = i7;
            }
            i6 = 2065069188;
        }
        C0f9.A0A(i6, A03);
    }

    @Override // X.C1I2
    public final void onScrollStateChanged(C3FQ c3fq, int i) {
        C0f9.A0A(-1679543903, C0f9.A03(1398150722));
    }
}
