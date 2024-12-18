package X;

import android.view.ViewGroup;
import com.facebook.R;
import java.util.List;

/* loaded from: classes8.dex */
public final class JYV extends C2UU {
    public Number A00;
    public final MRG A01;
    public final List A02 = AbstractC166987dD.A1E();

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        if (r11 != r0) goto L12;
     */
    @Override // X.C2UU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onBindViewHolder(X.C3OO r10, int r11) {
        /*
            r9 = this;
            r6 = r10
            X.JYi r6 = (X.C43795JYi) r6
            r3 = 0
            X.C14360o3.A0B(r6, r3)
            r7 = r9
            java.util.List r0 = r9.A02
            r4 = r11
            java.lang.Object r8 = r0.get(r11)
            X.JYg r8 = (X.AbstractC43793JYg) r8
            boolean r0 = r8 instanceof X.C43792JYf
            if (r0 == 0) goto L4c
            X.JYf r8 = (X.C43792JYf) r8
            java.lang.Number r1 = r9.A00
            if (r1 != 0) goto L25
            java.lang.String r0 = "currentSelectedPosition"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L25:
            boolean r0 = r1 instanceof java.lang.Integer
            if (r0 == 0) goto L30
            int r0 = r1.intValue()
            r1 = 1
            if (r11 == r0) goto L31
        L30:
            r1 = 0
        L31:
            r5 = 13
            X.MHX r3 = new X.MHX
            r3.<init>(r4, r5, r6, r7, r8)
            r6.A00(r8, r3, r1)
            android.view.View r1 = r6.itemView
            int r0 = r8.A00
            r1.setMinimumWidth(r0)
            X.MRG r1 = r9.A01
            android.view.View r0 = X.AbstractC31171DnF.A06(r6)
            r1.DHk(r0, r8, r11)
            return
        L4c:
            boolean r0 = r8 instanceof X.KQV
            if (r0 == 0) goto L88
            r0 = 11
            X.ME4 r2 = new X.ME4
            r2.<init>(r0, r6, r9, r8)
            X.C14360o3.A0B(r8, r3)
            android.widget.TextView r1 = r6.A00
            java.lang.CharSequence r0 = r8.A01
            r1.setText(r0)
            android.view.View r0 = r6.itemView
            r0.setSelected(r3)
            android.view.View r1 = r6.itemView
            r0 = 57
            X.ViewOnClickListenerC48072LPx.A01(r1, r0, r2)
            android.widget.TextView r1 = r6.A01
            r0 = 8
            r1.setVisibility(r0)
            boolean r2 = r8.A02
            android.view.View r1 = r6.itemView
            r0 = 1061997773(0x3f4ccccd, float:0.8)
            if (r2 == 0) goto L7f
            r0 = 1065353216(0x3f800000, float:1.0)
        L7f:
            r1.setAlpha(r0)
            android.view.View r0 = r6.itemView
            r0.setMinimumWidth(r3)
            return
        L88:
            java.lang.String r0 = "Unknown pill type"
            java.lang.IllegalArgumentException r0 = X.AbstractC166987dD.A12(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JYV.onBindViewHolder(X.3OO, int):void");
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C43795JYi(AbstractC25227BEk.A0D(AbstractC31177DnL.A0E(viewGroup, 0), viewGroup, R.layout.direct_inbox_header_pill_item, false));
    }

    public JYV(MRG mrg) {
        this.A01 = mrg;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(1370842204);
        int size = this.A02.size();
        C0f9.A0A(708212912, A03);
        return size;
    }
}
