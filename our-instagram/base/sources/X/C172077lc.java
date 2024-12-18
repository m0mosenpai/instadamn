package X;

import android.content.Context;
import android.view.ViewConfiguration;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: X.7lc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C172077lc {
    public C22934A9e A00;
    public GestureDetectorOnGestureListenerC72583Nf A01;
    public final C172087ld A02;
    public final AbstractC12990ll A03;

    public C172077lc(AbstractC12990ll abstractC12990ll) {
        this.A03 = abstractC12990ll;
        C172087ld c172087ld = new C172087ld(abstractC12990ll);
        this.A02 = c172087ld;
        Context context = (Context) C3K9.A00.get();
        if (C3K8.A02(abstractC12990ll) && context != null) {
            Context applicationContext = context.getApplicationContext();
            C14360o3.A0B(applicationContext, 0);
            C14360o3.A0B(abstractC12990ll, 1);
            C16930sl c16930sl = C16930sl.A00;
            int doubleTapTimeout = ViewConfiguration.getDoubleTapTimeout();
            long scaledDoubleTapSlop = ViewConfiguration.get(applicationContext).getScaledDoubleTapSlop();
            long j = scaledDoubleTapSlop * scaledDoubleTapSlop;
            AbstractC06930Yk.A0E();
            AbstractC06930Yk.A0E();
            C06090Tz c06090Tz = C06090Tz.A05;
            boolean A06 = C18U.A06(c06090Tz, abstractC12990ll, 2342154642718065332L);
            boolean A062 = C18U.A06(c06090Tz, abstractC12990ll, 2342154642714526348L);
            String A04 = C18U.A04(c06090Tz, abstractC12990ll, 36874583457857582L);
            Pattern pattern = AbstractC13670mt.A00;
            String[] strArr = (String[]) new C11L(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1).A03(A04).toArray(new String[0]);
            List A1Q = AbstractC16960so.A1Q(Arrays.copyOf(strArr, strArr.length));
            boolean A063 = C18U.A06(c06090Tz, abstractC12990ll, 2342154642715116178L);
            boolean A064 = C18U.A06(c06090Tz, abstractC12990ll, 36311633501029007L);
            String A042 = C18U.A04(c06090Tz, abstractC12990ll, 36874583454646315L);
            C04830Nb c04830Nb = C04830Nb.A00;
            Map A08 = AbstractC13670mt.A08(A042, c04830Nb);
            A08 = A08 == null ? AbstractC06930Yk.A0E() : A08;
            C14360o3.A0B(A08, 0);
            Map A082 = AbstractC13670mt.A08(C18U.A04(c06090Tz, abstractC12990ll, 36874583454908460L), c04830Nb);
            A082 = A082 == null ? AbstractC06930Yk.A0E() : A082;
            C14360o3.A0B(A082, 0);
            boolean A065 = C18U.A06(c06090Tz, abstractC12990ll, 36311633502143132L);
            boolean A066 = C18U.A06(c06090Tz, abstractC12990ll, 36311633503584941L);
            String[] strArr2 = (String[]) new C11L(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1).A03(C18U.A04(c06090Tz, abstractC12990ll, 36874583456940077L)).toArray(new String[0]);
            List A1Q2 = AbstractC16960so.A1Q(Arrays.copyOf(strArr2, strArr2.length));
            boolean A067 = C18U.A06(c06090Tz, abstractC12990ll, 36311633504764598L);
            String[] strArr3 = (String[]) new C11L(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1).A03(C18U.A04(c06090Tz, abstractC12990ll, 36874583458250799L)).toArray(new String[0]);
            List A1Q3 = AbstractC16960so.A1Q(Arrays.copyOf(strArr3, strArr3.length));
            boolean A068 = C18U.A06(c06090Tz, abstractC12990ll, 2342154642718720697L);
            boolean A069 = C18U.A06(c06090Tz, abstractC12990ll, 36311633505157819L);
            long A01 = C18U.A01(c06090Tz, abstractC12990ll, 36593108479574987L);
            int i = A01 > 0 ? (int) A01 : 40;
            long A012 = C18U.A01(c06090Tz, abstractC12990ll, 36593108478002121L);
            C22934A9e c22934A9e = new C22934A9e(new Y0D(C18U.A00(c06090Tz, abstractC12990ll, 37156058430570514L), C18U.A01(c06090Tz, abstractC12990ll, 36593108477346760L), C18U.A06(c06090Tz, abstractC12990ll, 36311633500308102L), C18U.A06(c06090Tz, abstractC12990ll, 36311633500504712L), C18U.A06(c06090Tz, abstractC12990ll, 36311633504895671L)), new A6S(C18U.A06(c06090Tz, abstractC12990ll, 36311633503650478L), C18U.A01(c06090Tz, abstractC12990ll, 36593108480951248L)), new C22959AAd(c16930sl, A1Q, A1Q2, A1Q3, A08, A082, A012 > 0 ? (int) A012 : doubleTapTimeout, i, j, A06, A064, A065, A062, A068, A063, A066, A067, A069), C18U.A06(c06090Tz, abstractC12990ll, 36311633505092282L), C18U.A06(c06090Tz, abstractC12990ll, 36311633504961208L), C18U.A06(c06090Tz, abstractC12990ll, 36315580575255975L));
            this.A00 = c22934A9e;
            this.A01 = new GestureDetectorOnGestureListenerC72583Nf(applicationContext, c22934A9e, this, c172087ld, abstractC12990ll);
        }
    }

    public static C172077lc A00(final AbstractC12990ll abstractC12990ll) {
        return (C172077lc) abstractC12990ll.A01(C172077lc.class, new InterfaceC16820sZ() { // from class: X.9HP
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return new C172077lc(AbstractC12990ll.this);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x01c9, code lost:
    
        if (r1 != null) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(X.C22933A9d r21) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C172077lc.A01(X.A9d):void");
    }

    public final void A02(C71313Hs c71313Hs) {
        GestureDetectorOnGestureListenerC72583Nf gestureDetectorOnGestureListenerC72583Nf = this.A01;
        if (gestureDetectorOnGestureListenerC72583Nf != null) {
            c71313Hs.A05 = new WeakReference(gestureDetectorOnGestureListenerC72583Nf);
            C3KL.A00(c71313Hs.A08).A05 = new WeakReference(gestureDetectorOnGestureListenerC72583Nf);
        }
    }

    public final void A03(C71313Hs c71313Hs) {
        GestureDetectorOnGestureListenerC72583Nf gestureDetectorOnGestureListenerC72583Nf = this.A01;
        if (gestureDetectorOnGestureListenerC72583Nf != null) {
            gestureDetectorOnGestureListenerC72583Nf.A03 = c71313Hs;
            c71313Hs.A04 = new WeakReference(gestureDetectorOnGestureListenerC72583Nf);
        }
        this.A02.A02.A00 = c71313Hs;
    }

    public final void A04(C38321qM c38321qM, Integer num) {
        C22934A9e c22934A9e;
        String str;
        int i;
        GestureDetectorOnGestureListenerC72583Nf gestureDetectorOnGestureListenerC72583Nf = this.A01;
        if (gestureDetectorOnGestureListenerC72583Nf != null && (c22934A9e = this.A00) != null && c22934A9e.A02.A05) {
            AbstractC12990ll abstractC12990ll = this.A03;
            C14360o3.A0B(c38321qM, 0);
            C123965jA c123965jA = new C123965jA(abstractC12990ll, c38321qM);
            C129165sd c129165sd = gestureDetectorOnGestureListenerC72583Nf.A02;
            if (c129165sd != null) {
                C172087ld c172087ld = gestureDetectorOnGestureListenerC72583Nf.A0B;
                C172117lg c172117lg = c172087ld.A03;
                switch (num.intValue()) {
                    case 0:
                        i = 3038;
                        str = AbstractC111324zv.A00(i);
                        break;
                    case 1:
                        i = 3040;
                        str = AbstractC111324zv.A00(i);
                        break;
                    case 2:
                        str = "adhoc_peek_media";
                        break;
                    default:
                        str = "comment_send_via_ime";
                        break;
                }
                c172117lg.A00(c172087ld.A01.A00(), c123965jA, new A6R(null, str), c129165sd, null);
            }
        }
    }
}
