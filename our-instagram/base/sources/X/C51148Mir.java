package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.Mir, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51148Mir extends C2UU {
    public int A00;
    public int A01 = Integer.MAX_VALUE;
    public int A02;
    public final EnumC53265Nh3 A03;

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        if (i != 0) {
            if (i != 1) {
                View view = new View(viewGroup.getContext());
                view.setLayoutParams(new ViewGroup.LayoutParams(0, -1));
                return new C3OO(view);
            }
            int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
            return new NIB(AbstractC25226BEj.A0R(AbstractC25228BEl.A0P(viewGroup), viewGroup, this.A03.A01, false));
        }
        int i3 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C3OO(AbstractC25226BEj.A0R(AbstractC25228BEl.A0P(viewGroup), viewGroup, this.A03.A00, false));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x003d, code lost:
    
        if (r0 != null) goto L8;
     */
    @Override // X.C2UU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onBindViewHolder(X.C3OO r7, int r8) {
        /*
            r6 = this;
            X.Mjs r7 = (X.AbstractC51207Mjs) r7
            r0 = 0
            X.C14360o3.A0B(r7, r0)
            boolean r0 = r7 instanceof X.NIB
            if (r0 == 0) goto L7b
            r0 = r7
            X.NIB r0 = (X.NIB) r0
            android.widget.TextView r3 = r0.A00
            android.content.Context r5 = r3.getContext()
            X.Nh3 r0 = r6.A03
            java.lang.Integer r0 = r0.A02
            if (r0 == 0) goto L5e
            int r4 = r0.intValue()
            java.lang.String r0 = "#.#"
            java.text.DecimalFormat r2 = new java.text.DecimalFormat
            r2.<init>(r0)
            int r0 = r8 + (-1)
            float r1 = (float) r0
            int r0 = X.OZQ.A03
            float r0 = (float) r0
            float r1 = r1 * r0
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r1 = r1 / r0
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            java.lang.String r0 = r2.format(r0)
            X.C14360o3.A07(r0)
            java.lang.String r0 = X.AbstractC167007dF.A0f(r5, r0, r4)
            if (r0 == 0) goto L5e
        L3f:
            r3.setText(r0)
            android.view.View r3 = X.AbstractC31171DnF.A06(r7)
            android.content.Context r1 = X.AbstractC37301Gc2.A03(r7)
            int r0 = X.OZQ.A03
            int r2 = r0 * 2
            float r0 = X.OZQ.A00
            float r1 = X.AbstractC50522MSa.A00(r1, r0)
            float r0 = (float) r2
            float r1 = r1 * r0
            int r0 = X.C1H4.A01(r1)
        L5a:
            X.AbstractC13880nE.A0g(r3, r0)
        L5d:
            return
        L5e:
            java.lang.String r0 = "#.#"
            java.text.DecimalFormat r2 = new java.text.DecimalFormat
            r2.<init>(r0)
            int r0 = r8 + (-1)
            float r1 = (float) r0
            int r0 = X.OZQ.A03
            float r0 = (float) r0
            float r1 = r1 * r0
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r1 = r1 / r0
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            java.lang.String r0 = r2.format(r0)
            X.C14360o3.A07(r0)
            goto L3f
        L7b:
            boolean r0 = r7 instanceof X.NIA
            if (r0 == 0) goto L5d
            android.view.View r3 = X.AbstractC31171DnF.A06(r7)
            if (r8 != 0) goto L88
            int r0 = r6.A02
            goto L5a
        L88:
            int r0 = r6.A00
            goto L5a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51148Mir.onBindViewHolder(X.3OO, int):void");
    }

    public C51148Mir(EnumC53265Nh3 enumC53265Nh3) {
        this.A03 = enumC53265Nh3;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(459221305);
        int i = this.A01 + 2;
        C0f9.A0A(-1599563723, A03);
        return i;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        int A03 = C0f9.A03(151726908);
        int i2 = 2;
        if (i != 0 && i != this.A01 + 1) {
            i2 = 1;
            if (i % 2 == 1) {
                i2 = 0;
            }
        }
        C0f9.A0A(1316478473, A03);
        return i2;
    }
}
