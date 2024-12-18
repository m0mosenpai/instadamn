package X;

import android.content.Context;
import android.graphics.Typeface;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.shimmer.placeholder.SimpleShimmerPlaceholderView;

/* loaded from: classes8.dex */
public final class MBb extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public long A01;
    public Object A02;
    public final int A03 = 1;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MBb(Typeface typeface, KCC kcc, IgTextView igTextView, SimpleShimmerPlaceholderView simpleShimmerPlaceholderView, InterfaceC23621Ds interfaceC23621Ds, long j) {
        super(2, interfaceC23621Ds);
        this.A04 = simpleShimmerPlaceholderView;
        this.A05 = igTextView;
        this.A06 = typeface;
        this.A01 = j;
        this.A02 = kcc;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        if (this.A03 != 0) {
            MBb mBb = new MBb((Context) this.A04, (C70843Fw) this.A06, (OFT) this.A05, interfaceC23621Ds);
            mBb.A02 = obj;
            return mBb;
        }
        SimpleShimmerPlaceholderView simpleShimmerPlaceholderView = (SimpleShimmerPlaceholderView) this.A04;
        IgTextView igTextView = (IgTextView) this.A05;
        return new MBb((Typeface) this.A06, (KCC) this.A02, igTextView, simpleShimmerPlaceholderView, interfaceC23621Ds, this.A01);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0041 -> B:6:0x0012). Please report as a decompilation issue!!! */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.A03
            if (r0 == 0) goto L50
            X.1JX r3 = X.C1JX.A02
            int r0 = r11.A00
            r9 = -1
            r8 = 1
            if (r0 == 0) goto L44
            long r4 = r11.A01
            X.AbstractC09560e7.A00(r12)
        L12:
            long r4 = r4 + r9
        L13:
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 >= 0) goto L83
            java.lang.Object r0 = r11.A05
            X.OFT r0 = (X.OFT) r0
            X.0do r0 = r0.A08
            java.lang.Object r7 = r0.getValue()
            android.widget.TextView r7 = (android.widget.TextView) r7
            java.lang.Object r6 = r11.A04
            android.content.Context r6 = (android.content.Context) r6
            r2 = 2131972614(0x7f135206, float:1.958224E38)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = r0.toMillis(r4)
            java.lang.String r0 = X.C23831Eq.A02(r0)
            X.AbstractC31177DnL.A0r(r6, r7, r0, r2)
            r0 = 1000(0x3e8, double:4.94E-321)
            r11.A01 = r4
            r11.A00 = r8
            java.lang.Object r0 = X.AbstractC89993zf.A01(r11, r0)
            if (r0 != r3) goto L12
            return r3
        L44:
            X.AbstractC09560e7.A00(r12)
            java.lang.Object r0 = r11.A06
            X.3Fw r0 = (X.C70843Fw) r0
            long r4 = r0.A00()
            goto L13
        L50:
            X.1JX r3 = X.C1JX.A02
            int r0 = r11.A00
            r2 = 1
            if (r0 == 0) goto Lb3
            X.AbstractC09560e7.A00(r12)
        L5a:
            X.3NY r12 = (X.C3NY) r12
            boolean r0 = r12 instanceof X.C3NX
            r2 = 0
            r1 = 8
            if (r0 == 0) goto L86
            java.lang.Object r0 = r11.A04
            X.AbstractC43592JPx.A1U(r0, r1)
            java.lang.Object r1 = r11.A05
            android.widget.TextView r1 = (android.widget.TextView) r1
            X.3NX r12 = (X.C3NX) r12
            java.lang.Object r0 = r12.A00
            X.MRg r0 = (X.InterfaceC50503MRg) r0
            X.Jyp r0 = (X.C45149Jyp) r0
            java.lang.String r0 = r0.A00
            r1.setText(r0)
            java.lang.Object r0 = r11.A06
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            r1.setTypeface(r0)
            r1.setVisibility(r2)
        L83:
            X.0eB r3 = X.C0eB.A00
            return r3
        L86:
            boolean r0 = r12 instanceof X.C194848jk
            if (r0 != 0) goto L91
            if (r12 == 0) goto L91
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L91:
            java.lang.Object r0 = r11.A04
            X.AbstractC43592JPx.A1U(r0, r1)
            java.lang.Object r1 = r11.A05
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r0 = "#1992"
            r1.setText(r0)
            java.lang.Object r0 = r11.A06
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            r1.setTypeface(r0)
            r1.setVisibility(r2)
            X.0w9 r2 = X.C0w9.A01
            java.lang.String r1 = "barcelona_golden_ticket"
            java.lang.String r0 = "fetching golden ticket number failed"
            r2.EmN(r1, r0)
            goto L83
        Lb3:
            X.AbstractC09560e7.A00(r12)
            r0 = 3000(0xbb8, double:1.482E-320)
            long r8 = r11.A01
            java.lang.Object r5 = r11.A02
            r6 = 0
            r7 = 12
            X.MBs r4 = new X.MBs
            r4.<init>(r5, r6, r7, r8)
            r11.A00 = r2
            java.lang.Object r12 = X.LHL.A01(r11, r4, r0)
            if (r12 != r3) goto L5a
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MBb.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MBb) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MBb(Context context, C70843Fw c70843Fw, OFT oft, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A06 = c70843Fw;
        this.A05 = oft;
        this.A04 = context;
    }
}
