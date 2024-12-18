package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.8JE, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C8JE extends C8JF {
    public int A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final Handler A04;
    public final C8C1 A05;
    public final C2UY A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
    
        if (r7.A05.CcW() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (r9 > r7.A00) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A07(X.C9V2 r8, final int r9) {
        /*
            r7 = this;
            android.view.View r6 = r8.A07
            boolean r0 = r7.A01
            r4 = 8
            r1 = 0
            if (r0 != 0) goto Lf
            int r2 = r7.A00
            r0 = 8
            if (r9 <= r2) goto L10
        Lf:
            r0 = 0
        L10:
            r6.setVisibility(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r5 = r8.A0A
            r5.setVisibility(r1)
            com.instagram.ui.widget.bubblespinner.BubbleSpinner r2 = r8.A0C
            r2.setVisibility(r4)
            X.8ZZ r0 = X.C8ZZ.DONE
            r2.setLoadingStatus(r0)
            boolean r0 = r7.A0A
            X.2jc r3 = r8.A0B
            if (r0 == 0) goto L6d
            r3.A03(r1)
        L2b:
            X.ARP r0 = new X.ARP
            r0.<init>()
            X.C0fQ.A00(r0, r6)
            int r0 = r7.A00
            if (r9 != r0) goto L71
            boolean r0 = r7.A02
            if (r0 == 0) goto L71
            boolean r0 = r6.isSelected()
            if (r0 != 0) goto L6c
            r0 = 1
            r2 = 0
            X.C9V2.A00(r8, r0, r1)
            r6.setSelected(r0)
            android.view.View r1 = r8.A08
            boolean r0 = r8.A03
            if (r0 != 0) goto L51
            r2 = 8
        L51:
            r1.setVisibility(r2)
            boolean r0 = r8.A05
            if (r0 == 0) goto L6c
            int r1 = r8.A00
            r5.setColorFilter(r1)
            int r0 = r3.A00()
            if (r0 == r4) goto L6c
            android.view.View r0 = r3.A01()
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setTextColor(r1)
        L6c:
            return
        L6d:
            r3.A03(r4)
            goto L2b
        L71:
            boolean r0 = r7.A03
            if (r0 != 0) goto L7e
            X.8C1 r0 = r7.A05
            boolean r1 = r0.CcW()
            r0 = 1
            if (r1 != 0) goto L7f
        L7e:
            r0 = 0
        L7f:
            r8.A02(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8JE.A07(X.9V2, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (r2.A05.CcW() == false) goto L6;
     */
    @Override // X.C2UU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onViewRecycled(X.C3OO r3) {
        /*
            r2 = this;
            X.9V2 r3 = (X.C9V2) r3
            boolean r0 = r2.A07
            r3.A03 = r0
            boolean r0 = r2.A09
            r3.A05 = r0
            boolean r0 = r2.A03
            if (r0 != 0) goto L17
            X.8C1 r0 = r2.A05
            boolean r1 = r0.CcW()
            r0 = 1
            if (r1 != 0) goto L18
        L17:
            r0 = 0
        L18:
            r3.A02(r0)
            r0 = 0
            r3.A01(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r3.A0A
            r0.A09()
            X.2jc r1 = r3.A0B
            r0 = 8
            r1.A03(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8JE.onViewRecycled(X.3OO):void");
    }

    public C8JE(Context context, C8FJ c8fj, C8C1 c8c1, boolean z, boolean z2, boolean z3, boolean z4) {
        super(context, c8fj);
        this.A06 = C2UY.A01;
        this.A04 = new Handler(Looper.getMainLooper());
        this.A01 = true;
        this.A00 = -1;
        this.A02 = true;
        this.A05 = c8c1;
        this.A07 = z;
        this.A09 = z2;
        this.A0A = z3;
        this.A08 = z4;
        super.A00 = 0;
    }

    @Override // X.C8JF
    public void A02(int i) {
        super.A02(i);
        this.A06.A05(10L);
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C9V2(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.generic_effect_picker_tile, viewGroup, false), this.A07, this.A09, this.A08);
    }
}
