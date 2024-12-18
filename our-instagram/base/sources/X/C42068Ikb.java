package X;

import android.view.View;
import android.widget.AbsListView;

/* renamed from: X.Ikb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42068Ikb implements AbsListView.RecyclerListener, JFP {
    public final C3FQ A00;
    public final /* synthetic */ C33A A01;

    @Override // android.widget.AbsListView.RecyclerListener
    public final void onMovedToScrapHeap(View view) {
        A00(view, false);
    }

    public C42068Ikb(C33A c33a, C3FQ c3fq) {
        this.A01 = c33a;
        this.A00 = c3fq;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0079, code lost:
    
        if (r5.A0B == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007e, code lost:
    
        r5.A0B = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0080, code lost:
    
        r0 = r11;
        r3 = r10.A06;
        r2 = (X.JG5) r3.remove(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0089, code lost:
    
        if (r2 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008b, code lost:
    
        r0 = X.C3XH.A02(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008f, code lost:
    
        if (r0 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0091, code lost:
    
        r2 = (X.JG5) r3.remove(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0097, code lost:
    
        if (r2 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x009f, code lost:
    
        if ((r11 instanceof X.C38321qM) == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a1, code lost:
    
        r11 = (X.C38321qM) r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a3, code lost:
    
        if (r15 == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a5, code lost:
    
        r8.CFj().post(new X.J4X(r11, r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b5, code lost:
    
        if (r3.isEmpty() == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00b7, code lost:
    
        r10.A00 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b9, code lost:
    
        r14.setTag(com.facebook.R.id.row_tombstone_item, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00be, code lost:
    
        if (r10.A01 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c0, code lost:
    
        r6 = r6 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c2, code lost:
    
        r8.EdZ(r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c5, code lost:
    
        if (r5 == null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c7, code lost:
    
        r8.CFj().post(new X.J4Y(r5, r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00d3, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d4, code lost:
    
        r7 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00d6, code lost:
    
        r1.CtR(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00da, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0099, code lost:
    
        r2.Dtg(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x007c, code lost:
    
        if (r5 != null) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(android.view.View r14, boolean r15) {
        /*
            r13 = this;
            X.33A r10 = r13.A01
            int r0 = X.C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION
            boolean r0 = r10.A00
            if (r0 == 0) goto L3e
            r14.getClass()
            r9 = 2131440613(0x7f0b33e5, float:1.8503214E38)
            java.lang.Object r11 = r14.getTag(r9)
            X.1qS r11 = (X.InterfaceC38381qS) r11
            if (r11 == 0) goto L3e
            X.2xQ r1 = r10.A05
            boolean r0 = r1.CSO()
            if (r0 != 0) goto L3e
            java.lang.Object r0 = X.AbstractC31172DnG.A0x(r14)
            X.Gwl r0 = (X.C38525Gwl) r0
            X.3Zb r0 = r0.A03
            if (r0 == 0) goto L3f
            X.3Zm r2 = r0.A0m
            X.3Zm r0 = X.EnumC75193Zm.A0J
            if (r2 == r0) goto L3e
            X.3Zm r0 = X.EnumC75193Zm.A0K
            if (r2 == r0) goto L3e
            X.3Zm r0 = X.EnumC75193Zm.A0M
            if (r2 == r0) goto L3e
            X.3Zm r0 = X.EnumC75193Zm.A0N
            if (r2 == r0) goto L3e
            X.3Zm r0 = X.EnumC75193Zm.A0L
            if (r2 != r0) goto L3f
        L3e:
            return
        L3f:
            X.3FQ r8 = r13.A00
            int r0 = r8.AnZ()
            if (r0 <= 0) goto L3e
            int r6 = r8.B6q()
            r7 = 0
            android.view.View r0 = r8.AnU(r7)
            int r12 = r0.getTop()
            boolean r0 = r10.A01
            if (r0 == 0) goto L72
            r2 = 0
        L59:
            int r0 = r8.AnZ()
            if (r2 >= r0) goto L72
            android.view.View r0 = r8.AnU(r2)
            if (r0 == r14) goto Ldc
            int r6 = r8.B6q()
            int r6 = r6 + r2
            android.view.View r0 = r8.AnU(r2)
            int r12 = r0.getTop()
        L72:
            X.2pm r5 = r10.A04
            if (r5 == 0) goto L7b
            boolean r0 = r5.A0B
            r4 = 1
            if (r0 != 0) goto L7e
        L7b:
            r4 = 0
            if (r5 == 0) goto L80
        L7e:
            r5.A0B = r7
        L80:
            r0 = r11
            java.util.Map r3 = r10.A06
            java.lang.Object r2 = r3.remove(r11)
            X.JG5 r2 = (X.JG5) r2
            if (r2 != 0) goto L99
            X.1qM r0 = X.C3XH.A02(r11)
            if (r0 == 0) goto L9c
            java.lang.Object r2 = r3.remove(r0)
            X.JG5 r2 = (X.JG5) r2
            if (r2 == 0) goto L9c
        L99:
            r2.Dtg(r0)
        L9c:
            r2 = 0
            boolean r0 = r11 instanceof X.C38321qM
            if (r0 == 0) goto Lda
            X.1qM r11 = (X.C38321qM) r11
        La3:
            if (r15 == 0) goto Ld6
            android.view.ViewGroup r1 = r8.CFj()
            X.J4X r0 = new X.J4X
            r0.<init>()
            r1.post(r0)
        Lb1:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto Lb9
            r10.A00 = r7
        Lb9:
            r14.setTag(r9, r2)
            boolean r0 = r10.A01
            if (r0 == 0) goto Ld4
            int r6 = r6 + (-1)
        Lc2:
            r8.EdZ(r6, r7)
            if (r5 == 0) goto L3e
            android.view.ViewGroup r1 = r8.CFj()
            X.J4Y r0 = new X.J4Y
            r0.<init>()
            r1.post(r0)
            return
        Ld4:
            r7 = r12
            goto Lc2
        Ld6:
            r1.CtR(r11)
            goto Lb1
        Lda:
            r11 = r2
            goto La3
        Ldc:
            int r2 = r2 + 1
            goto L59
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42068Ikb.A00(android.view.View, boolean):void");
    }

    public C42068Ikb() {
    }
}
