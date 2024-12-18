package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;

/* renamed from: X.7De, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C159437De extends C7VI {
    public VBH A00;
    public VBH A01;
    public VBH A02;
    public Integer A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final InterfaceC52932ba A07;
    public final C7UB A08;
    public final C7F3 A09;
    public final C7UF A0A;
    public final C7UE A0B;
    public final C7UG A0C;
    public final C163527Tp A0D;
    public final C7WB A0E;
    public final InterfaceC09390do A0F;
    public final InterfaceC09390do A0G;
    public final InterfaceC09390do A0H;
    public final InterfaceC16820sZ A0I;
    public final InterfaceC16820sZ A0J;
    public final InterfaceC16820sZ A0K;
    public final InterfaceC16820sZ A0L;
    public final InterfaceC16820sZ A0M;

    public static final void A00(C159437De c159437De) {
        c159437De.A06 = false;
        ((RecyclerView) c159437De.A0K.invoke()).A15(c159437De.A0C);
        C7WB c7wb = c159437De.A0E;
        C7UF c7uf = c159437De.A0A;
        C14360o3.A0B(c7uf, 0);
        c7wb.A01.remove(c7uf);
        A02(c159437De);
        c159437De.A03 = null;
        c159437De.A0M.invoke();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.7UG] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.7UE] */
    public /* synthetic */ C159437De(C7WB c7wb, C7VG c7vg, final InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16820sZ interfaceC16820sZ4, InterfaceC16820sZ interfaceC16820sZ5) {
        super(c7vg);
        final UserSession userSession = c7vg.A00;
        C7F3 c7f3 = new C7F3(userSession);
        final C7UB c7ub = new C7UB(userSession);
        C163527Tp c163527Tp = new C163527Tp(userSession);
        final C206959Ea c206959Ea = new C206959Ea(interfaceC16820sZ4, 48);
        AbstractC61132qb abstractC61132qb = new AbstractC61132qb(userSession, c7ub, interfaceC16820sZ, c206959Ea) { // from class: X.7UC
            public final UserSession A00;
            public final C7UB A01;
            public final InterfaceC16820sZ A02;
            public final InterfaceC16820sZ A03;

            @Override // X.AbstractC61132qb
            public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
                return new C7UD((Context) this.A02.invoke(), this.A00, this.A01, this.A03);
            }

            {
                this.A02 = interfaceC16820sZ;
                this.A00 = userSession;
                this.A01 = c7ub;
                this.A03 = c206959Ea;
            }
        };
        this.A0E = c7wb;
        this.A0I = interfaceC16820sZ;
        this.A0J = interfaceC16820sZ2;
        this.A0K = interfaceC16820sZ3;
        this.A0L = interfaceC16820sZ4;
        this.A0M = interfaceC16820sZ5;
        this.A09 = c7f3;
        this.A08 = c7ub;
        this.A0D = c163527Tp;
        this.A07 = abstractC61132qb;
        this.A0H = new C60842q8(new C206959Ea(this, 49), new C9EW(this, 2), C149636oG.A00, new C0YZ(C7UD.class));
        this.A0G = AbstractC09440dt.A01(new C9EW(this, 1));
        this.A0F = AbstractC09440dt.A01(new C9EW(this, 0));
        this.A0B = new View.OnLayoutChangeListener() { // from class: X.7UE
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                C14360o3.A0B(view, 0);
                C159437De c159437De = C159437De.this;
                VBH vbh = c159437De.A01;
                if (vbh != null) {
                    int[] iArr = new int[2];
                    view.getLocationInWindow(iArr);
                    vbh.setBottomBounds(Integer.valueOf(iArr[1] + view.getHeight()));
                }
                if (c159437De.A06) {
                    C159437De.A02(c159437De);
                }
            }
        };
        this.A0A = new C7UF(this);
        this.A0C = new C1I4() { // from class: X.7UG
            @Override // X.C1I4
            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                int A03 = C0f9.A03(-1302333052);
                C159437De c159437De = C159437De.this;
                if (c159437De.A06) {
                    C159437De.A02(c159437De);
                } else if (!c159437De.A05) {
                    C159437De.A01(c159437De);
                }
                C0f9.A0A(-1023187265, A03);
            }
        };
    }

    public static final void A01(C159437De c159437De) {
        C1577676k c1577676k = c159437De.A0E.A00;
        if (c1577676k != null) {
            c1577676k.A04 = true;
            FrameLayout frameLayout = c1577676k.A01;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
                frameLayout.setVisibility(8);
            }
            FrameLayout frameLayout2 = c1577676k.A00;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(0);
            }
            c159437De.A05 = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        if (r5.A03 == X.C05F.A01) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.C159437De r5) {
        /*
            boolean r0 = r5.A06
            if (r0 == 0) goto L49
            java.lang.Integer r0 = r5.A03
            java.lang.Integer r2 = X.C05F.A0C
            if (r0 != r2) goto L46
            X.0do r0 = r5.A0G
        Lc:
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            X.0sZ r0 = r5.A0K
            java.lang.Object r0 = r0.invoke()
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            int r0 = r0.computeVerticalScrollOffset()
            if (r0 > r1) goto L30
            X.7WB r0 = r5.A0E
            X.76k r0 = r0.A00
            if (r0 != 0) goto L32
            java.lang.Integer r1 = r5.A03
            java.lang.Integer r0 = X.C05F.A01
            if (r1 != r0) goto L49
        L30:
            java.lang.Integer r2 = X.C05F.A01
        L32:
            java.lang.Integer r3 = r5.A03
            if (r3 != r2) goto L4c
            java.lang.Integer r0 = X.C05F.A0C
            r1 = 1
            if (r3 != r0) goto L45
            X.VBH r0 = r5.A00
            if (r0 == 0) goto L4c
            boolean r0 = r0.isAttachedToWindow()
            if (r0 != r1) goto L4c
        L45:
            return
        L46:
            X.0do r0 = r5.A0F
            goto Lc
        L49:
            java.lang.Integer r2 = X.C05F.A00
            goto L32
        L4c:
            r5.A03 = r2
            X.VBH r4 = r5.A02
            r3 = 0
            r5.A02 = r3
            if (r4 == 0) goto L94
            boolean r0 = r4.isAttachedToWindow()
            if (r0 == 0) goto L94
            r1 = 26
            X.GUg r0 = new X.GUg
            r0.<init>(r5, r1)
            r4.A05(r0)
        L65:
            int r1 = r2.intValue()
            r0 = 1
            if (r1 == r0) goto L88
            r0 = 2
            if (r1 == r0) goto L85
            r0 = 0
            if (r1 != r0) goto L98
            r2 = 0
        L73:
            X.7F3 r1 = r5.A09
            X.0do r0 = r5.A0H
            java.lang.Object r0 = r0.getValue()
            X.7UD r0 = (X.C7UD) r0
            java.lang.String r0 = r0.A00()
            r1.A0B(r0, r2, r3)
            return
        L85:
            java.lang.String r2 = "thread_header"
            goto L73
        L88:
            X.VBH r0 = r5.A01
            if (r0 == 0) goto L91
            java.lang.String r2 = r0.getCurrentDecorAvatarPosition()
            goto L73
        L91:
            java.lang.String r2 = "top_right"
            goto L73
        L94:
            A03(r5, r2)
            goto L65
        L98:
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C159437De.A02(X.7De):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x01e9, code lost:
    
        if (r7.length() == 0) goto L82;
     */
    /* JADX WARN: Type inference failed for: r11v0, types: [X.4AO, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(X.C159437De r39, java.lang.Integer r40) {
        /*
            Method dump skipped, instructions count: 723
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C159437De.A03(X.7De, java.lang.Integer):void");
    }
}
