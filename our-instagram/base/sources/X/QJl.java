package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.shopify.checkout.models.errors.CheckoutErrorPayload;
import com.shopify.checkout.models.errors.DefaultsErrorPayload;
import com.shopify.checkout.models.errors.ParsableInternalErrorPayload;
import com.shopify.checkout.models.errors.UnrecoverableErrorPayload;
import com.shopify.checkout.models.errors.VaultedPaymentErrorPayload;
import com.shopify.checkout.models.errors.violations.DeliveryErrorPayload;
import com.shopify.checkout.models.errors.violations.InventoryErrorPayload;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public abstract class QJl extends AbstractC61593RqH {
    public SDC A00;
    public AbstractC63399SjU A01;
    public String A02;
    public InterfaceC16660sJ A04;
    public boolean A05;
    public final long A06;
    public final Integer A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final InterfaceC16660sJ A0C;
    public final boolean A0D;
    public final C62573SGy A07 = new C62573SGy(this);
    public String A03 = "";

    /* JADX WARN: Removed duplicated region for block: B:32:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(java.util.List r10) {
        /*
            r9 = this;
            r1 = 0
            java.lang.String r6 = A00(r10)
            com.facebook.quicklog.QuickPerformanceLogger r0 = X.AbstractC63320ShT.A00
            java.lang.Integer r4 = r9.A08
            boolean r3 = X.AbstractC167007dF.A1R(r1, r4, r6)
            java.lang.Integer r0 = X.AbstractC63320ShT.A01(r4)
            if (r0 == 0) goto L2a
            com.facebook.quicklog.QuickPerformanceLogger r2 = X.AbstractC63320ShT.A00
            if (r2 == 0) goto L2a
            int r1 = r0.intValue()
            boolean r0 = r2.isMarkerOn(r1)
            if (r0 != r3) goto L2a
            java.lang.String r0 = "place_order_error"
            r2.markerAnnotate(r1, r0, r6)
            r0 = 3
            r2.markerEnd(r1, r0)
        L2a:
            java.lang.Integer r0 = X.AbstractC63320ShT.A02(r4)
            if (r0 == 0) goto L48
            com.facebook.quicklog.QuickPerformanceLogger r2 = X.AbstractC63320ShT.A00
            if (r2 == 0) goto L48
            int r1 = r0.intValue()
            boolean r0 = r2.isMarkerOn(r1)
            if (r0 != r3) goto L48
            java.lang.String r0 = "update_cart_error"
            r2.markerAnnotate(r1, r0, r6)
            r0 = 3
            r2.markerEnd(r1, r0)
        L48:
            java.util.Iterator r2 = r10.iterator()
        L4c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L7b
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.C71177WpG
            if (r0 != 0) goto L5e
            boolean r0 = r1 instanceof com.shopify.checkout.models.errors.UnrecoverableErrorPayload
            if (r0 == 0) goto L4c
        L5e:
            java.lang.Integer r0 = X.AbstractC63320ShT.A00(r4)
            if (r0 == 0) goto L7b
            com.facebook.quicklog.QuickPerformanceLogger r2 = X.AbstractC63320ShT.A00
            if (r2 == 0) goto L7b
            int r1 = r0.intValue()
            boolean r0 = r2.isMarkerOn(r1)
            if (r0 != r3) goto L7b
            java.lang.String r0 = "checkout_ttrc_error"
            r2.markerAnnotate(r1, r0, r6)
            r0 = 3
            r2.markerEnd(r1, r0)
        L7b:
            X.SjU r0 = r9.A01
            if (r0 == 0) goto L92
            java.lang.String r1 = r9.A0B
            if (r1 != 0) goto L85
            java.lang.String r1 = ""
        L85:
            java.lang.String r4 = r9.A0A
            long r2 = r9.A06
            java.lang.String r5 = r9.A03
            java.lang.String r7 = r9.A09
            java.lang.String r8 = r9.A02
            r0.A0E(r1, r2, r4, r5, r6, r7, r8)
        L92:
            X.SDC r0 = r9.A00
            if (r0 == 0) goto La2
            X.4kP r2 = r0.A01
            X.6FG r1 = r0.A00
            X.TPU r0 = new X.TPU
            r0.<init>(r1, r2, r6)
            X.STC.A00(r0)
        La2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QJl.A02(java.util.List):void");
    }

    public QJl(Integer num, String str, String str2, String str3, long j, boolean z) {
        this.A08 = num;
        this.A0B = str;
        this.A0A = str2;
        this.A06 = j;
        this.A09 = str3;
        this.A0D = z;
        C65075Td4 c65075Td4 = new C65075Td4(this, 28);
        this.A0C = c65075Td4;
        this.A04 = c65075Td4;
    }

    public static final String A00(List list) {
        String str;
        C73773Sh c73773Sh;
        C3RA c3ra;
        ArrayList A0q = AbstractC167017dG.A0q(list);
        for (Object obj : list) {
            if (obj instanceof DeliveryErrorPayload) {
                c73773Sh = AbstractC73763Sg.A03;
                c3ra = X1D.A00;
            } else if (obj instanceof InventoryErrorPayload) {
                c73773Sh = AbstractC73763Sg.A03;
                c3ra = X1E.A00;
            } else if (obj instanceof CheckoutErrorPayload) {
                c73773Sh = AbstractC73763Sg.A03;
                c3ra = X18.A00;
            } else if (obj instanceof DefaultsErrorPayload) {
                c73773Sh = AbstractC73763Sg.A03;
                c3ra = X19.A00;
            } else if (obj instanceof UnrecoverableErrorPayload) {
                c73773Sh = AbstractC73763Sg.A03;
                c3ra = X1B.A00;
            } else if (obj instanceof VaultedPaymentErrorPayload) {
                c73773Sh = AbstractC73763Sg.A03;
                c3ra = X1C.A00;
            } else if (obj instanceof ParsableInternalErrorPayload) {
                c73773Sh = AbstractC73763Sg.A03;
                C3R9[] c3r9Arr = ParsableInternalErrorPayload.A04;
                c3ra = X1A.A00;
            } else {
                str = "";
                A0q.add(str);
            }
            str = c73773Sh.A02(obj, c3ra);
            A0q.add(str);
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("[");
        int i = 0;
        Iterator it = A0q.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            if (i > 0) {
                A1C.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
            }
            A1C.append(String.valueOf(next));
            i = i2;
        }
        String A0w = AbstractC58319PtB.A0w(A1C);
        C14360o3.A07(A0w);
        return AbstractC25228BEl.A1A(AbstractC16490ru.A0p(A0w));
    }
}
