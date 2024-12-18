package X;

import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.Gr1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38196Gr1 extends AbstractC155316yK {
    public final AbstractC42425IqS A00;

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C38197Gr2(AbstractC25227BEk.A0D(AbstractC31177DnL.A0E(viewGroup, 0), viewGroup, R.layout.explore_interest_view_holder, false));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2xd, java.lang.Object] */
    public C38196Gr1(AbstractC42425IqS abstractC42425IqS) {
        super((AbstractC65412xd) new Object());
        this.A00 = abstractC42425IqS;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0065, code lost:
    
        if (r2 != r5) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007e, code lost:
    
        if (r2 != r5) goto L37;
     */
    @Override // X.C2UU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onBindViewHolder(X.C3OO r10, int r11) {
        /*
            r9 = this;
            X.Gr2 r10 = (X.C38197Gr2) r10
            r6 = 0
            X.C14360o3.A0B(r10, r6)
            java.lang.Object r4 = r9.getItem(r11)
            X.Dvw r4 = (X.C31691Dvw) r4
            X.C14360o3.A0A(r4)
            X.IqS r3 = r9.A00
            boolean r5 = X.AbstractC167007dF.A1R(r6, r4, r3)
            android.widget.ImageView r7 = r10.A01
            java.lang.Integer r8 = r4.A01
            int r2 = r8.intValue()
            r0 = 4
            if (r2 == r0) goto L31
            if (r2 == r6) goto L31
            r0 = 3
            if (r2 == r0) goto L31
            if (r2 == r5) goto L2f
            r0 = 2
            if (r2 == r0) goto L2f
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L2f:
            r0 = 0
            goto L33
        L31:
            r0 = 8
        L33:
            r7.setVisibility(r0)
            if (r2 == r5) goto L97
            r1 = 2
            r0 = 2131238868(0x7f081fd4, float:1.8094027E38)
            if (r2 == r1) goto L3f
            r0 = 0
        L3f:
            r7.setImageResource(r0)
            android.widget.TextView r7 = r10.A02
            java.lang.Integer r0 = X.C05F.A0C
            if (r8 != r0) goto L94
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131968547(0x7f134223, float:1.9573992E38)
            java.lang.String r0 = X.AbstractC166997dE.A0q(r1, r0)
        L53:
            r7.setText(r0)
            android.content.Context r1 = r7.getContext()
            r0 = 4
            if (r2 == r0) goto L90
            if (r2 == r6) goto L67
            r0 = 3
            if (r2 == r0) goto L67
            r0 = 2130970134(0x7f040616, float:1.754897E38)
            if (r2 == r5) goto L6a
        L67:
            r0 = 2130970131(0x7f040613, float:1.7548963E38)
        L6a:
            int r0 = X.AbstractC53242c7.A0H(r1, r0)
            X.AbstractC166987dD.A1O(r1, r7, r0)
            android.view.View r1 = r10.A00
            r0 = 4
            if (r2 == r0) goto L8c
            if (r2 == r6) goto L80
            r0 = 3
            if (r2 == r0) goto L80
            r0 = 2131239141(0x7f0820e5, float:1.809458E38)
            if (r2 == r5) goto L83
        L80:
            r0 = 2131239139(0x7f0820e3, float:1.8094577E38)
        L83:
            r1.setBackgroundResource(r0)
            r0 = 20
            X.ViewOnClickListenerC42029Ijy.A00(r1, r3, r4, r10, r0)
            return
        L8c:
            r0 = 2131239140(0x7f0820e4, float:1.8094579E38)
            goto L83
        L90:
            r0 = 2130970315(0x7f0406cb, float:1.7549337E38)
            goto L6a
        L94:
            java.lang.String r0 = r4.A03
            goto L53
        L97:
            r0 = 2131237900(0x7f081c0c, float:1.8092064E38)
            goto L3f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38196Gr1.onBindViewHolder(X.3OO, int):void");
    }
}
