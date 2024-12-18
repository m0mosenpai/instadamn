package X;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;

/* renamed from: X.75k, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C75k implements InterfaceC164927Zh {
    public boolean A00;
    public boolean A01;
    public View A02;
    public final Context A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC16820sZ A06;
    public final C1I4 A07;
    public final C006802i A08;
    public final InterfaceC16820sZ A09;

    public C75k(Context context, C006802i c006802i, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3) {
        C14360o3.A0B(interfaceC16820sZ2, 3);
        C14360o3.A0B(interfaceC16820sZ3, 4);
        C14360o3.A0B(c006802i, 5);
        this.A03 = context;
        this.A09 = interfaceC16820sZ;
        this.A06 = interfaceC16820sZ3;
        this.A08 = c006802i;
        this.A04 = AbstractC09440dt.A01(new C9EW(interfaceC16820sZ2, 33));
        this.A05 = AbstractC09440dt.A01(new C9EW(this, 34));
        this.A00 = true;
        this.A07 = new C1I4() { // from class: X.75l
            @Override // X.C1I4
            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                int A03 = C0f9.A03(362489223);
                C75k c75k = C75k.this;
                c75k.A01 = true;
                C75k.A00(c75k);
                C0f9.A0A(1216959045, A03);
            }
        };
    }

    private final void A02(C7QD c7qd, boolean z) {
        this.A01 = false;
        this.A00 = z;
        InterfaceC09390do interfaceC09390do = this.A04;
        ((View) interfaceC09390do.getValue()).setVisibility(4);
        InterfaceC09390do interfaceC09390do2 = this.A05;
        ((Dialog) interfaceC09390do2.getValue()).setContentView(R.layout.progress_dialog);
        ((C6WQ) interfaceC09390do2.getValue()).A00(this.A03.getString(2131965662));
        C0fJ.A00((Dialog) interfaceC09390do2.getValue());
        if (c7qd != null) {
            View A01 = ((C1585179m) c7qd).A04.A01();
            C14360o3.A07(A01);
            A01.setVisibility(0);
            this.A02 = A01;
        }
        ((RecyclerView) interfaceC09390do.getValue()).A14(this.A07);
        this.A08.markerStart(20126662);
    }

    @Override // X.InterfaceC164927Zh
    public final void AUy(C7QD c7qd, String str, boolean z) {
        A02(null, true);
        A01(this, str, 0, true);
    }

    @Override // X.InterfaceC164927Zh
    public final void AUz(C7QD c7qd, String str, boolean z) {
        A02(c7qd, z);
        A01(this, str, 0, false);
    }

    public static final void A00(C75k c75k) {
        InterfaceC09390do interfaceC09390do = c75k.A04;
        ((View) interfaceC09390do.getValue()).setVisibility(0);
        ((RecyclerView) interfaceC09390do.getValue()).A15(c75k.A07);
        View view = c75k.A02;
        if (view != null) {
            view.setVisibility(4);
        }
        ((Dialog) c75k.A05.getValue()).hide();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C75k r6, java.lang.String r7, int r8, boolean r9) {
        /*
            boolean r0 = r6.A01
            r2 = 20126662(0x1331bc6, float:3.2897034E-38)
            if (r0 != 0) goto Lad
            r0 = 10
            if (r8 > r0) goto Lad
            X.0sZ r0 = r6.A09
            java.lang.Object r3 = r0.invoke()
            X.7U0 r3 = (X.C7U0) r3
            if (r3 == 0) goto L85
            X.7Ts r1 = r3.BT6()
            if (r9 == 0) goto L8b
            int r4 = r1.CNN(r7)
        L1f:
            r0 = -1
            if (r4 == r0) goto L98
            X.02i r3 = r6.A08
            java.lang.String r0 = "numOfPaginationsSoFar"
            r3.markerAnnotate(r2, r0, r8)
            X.2EY r1 = r1.BSn(r7)
            if (r1 == 0) goto L3d
            X.F2Y r0 = X.F2Y.$redex_init_class
            int r1 = r1.ordinal()
            r0 = 101(0x65, float:1.42E-43)
            if (r1 == r0) goto L88
            r0 = 100
            if (r1 == r0) goto L88
        L3d:
            java.lang.Integer r0 = X.C05F.A00
        L3f:
            int r0 = r0.intValue()
            if (r0 == 0) goto L86
            r1 = 1
        L46:
            java.lang.String r0 = "type"
            r3.markerAnnotate(r2, r0, r1)
            r0 = 2
            r3.markerEnd(r2, r0)
            A00(r6)
            X.0do r5 = r6.A04
            java.lang.Object r0 = r5.getValue()
            android.view.View r0 = (android.view.View) r0
            android.content.Context r1 = r0.getContext()
            r0 = 0
            X.MiD r3 = new X.MiD
            r3.<init>(r1, r0)
            r3.A00 = r4
            java.lang.Object r0 = r5.getValue()
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            X.3Fe r2 = r0.A0D
            if (r2 == 0) goto L90
            boolean r0 = r6.A00
            if (r0 == 0) goto L82
            X.JoN r1 = new X.JoN
            r1.<init>(r6, r4)
            java.lang.Object r0 = r5.getValue()
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r0.A14(r1)
        L82:
            r2.A10(r3)
        L85:
            return
        L86:
            r1 = 0
            goto L46
        L88:
            java.lang.Integer r0 = X.C05F.A01
            goto L3f
        L8b:
            int r4 = r1.CNL(r7)
            goto L1f
        L90:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L98:
            X.7Uz r1 = r3.Avk()
            boolean r0 = r1 instanceof X.C163827Uw
            if (r0 == 0) goto Lb3
            X.7Uw r1 = (X.C163827Uw) r1
            if (r1 == 0) goto Lb3
            X.Ait r0 = new X.Ait
            r0.<init>(r6, r7, r8, r9)
            r1.A0E(r0)
            return
        Lad:
            X.02i r1 = r6.A08
            r0 = 3
            r1.markerEnd(r2, r0)
        Lb3:
            A00(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75k.A01(X.75k, java.lang.String, int, boolean):void");
    }

    @Override // X.InterfaceC164927Zh
    public final void EMC(String str) {
        int CNL;
        C7U0 c7u0 = (C7U0) this.A09.invoke();
        if (c7u0 != null && (CNL = c7u0.BT6().CNL(str)) != -1) {
            InterfaceC09390do interfaceC09390do = this.A04;
            Context context = ((View) interfaceC09390do.getValue()).getContext();
            C14360o3.A07(context);
            C110814yt c110814yt = new C110814yt(context);
            ((AbstractC110824yu) c110814yt).A00 = CNL;
            AbstractC70663Fe abstractC70663Fe = ((RecyclerView) interfaceC09390do.getValue()).A0D;
            if (abstractC70663Fe != null) {
                abstractC70663Fe.A10(c110814yt);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    @Override // X.InterfaceC164927Zh
    public final void EMK(String str) {
        int CNL;
        C7U0 c7u0 = (C7U0) this.A09.invoke();
        if (c7u0 != null && (CNL = c7u0.BT6().CNL(str)) != -1) {
            AbstractC70663Fe abstractC70663Fe = ((RecyclerView) this.A04.getValue()).A0D;
            if (abstractC70663Fe != null) {
                abstractC70663Fe.A1O(CNL);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }
}
