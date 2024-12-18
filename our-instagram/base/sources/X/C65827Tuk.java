package X;

import android.os.Handler;

/* renamed from: X.Tuk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65827Tuk extends AbstractC65828Tul {
    public C102884kP A00;
    public final Handler A01;
    public final C6FG A02;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C65827Tuk(X.C6FG r4, X.C102884kP r5, int r6) {
        /*
            r3 = this;
            X.U4F r2 = new X.U4F
            r2.<init>(r6)
            r1 = 2131428769(0x7f0b05a1, float:1.8479192E38)
            android.util.SparseArray r0 = r4.A01
            r0.get(r1)
            r3.<init>(r2)
            r3.A02 = r4
            r3.A00 = r5
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1 = 1
            X.TxK r0 = new X.TxK
            r0.<init>(r2, r3, r1)
            r3.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65827Tuk.<init>(X.6FG, X.4kP, int):void");
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onViewAttachedToWindow(C3OO c3oo) {
        InterfaceC103384lE A0B;
        C102884kP A08 = ((U48) ((C131805xG) c3oo).A00).A01.A08(132);
        if (A08 != null && A08.A05 == 13366 && (A0B = A08.A0B(38)) != null) {
            C1LZ.A00();
            AbstractC166997dE.A1H(this.A01, A0B, 0);
        }
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onViewDetachedFromWindow(C3OO c3oo) {
        InterfaceC103384lE A0B;
        C102884kP A08 = ((U48) ((C131805xG) c3oo).A00).A01.A08(132);
        if (A08 != null && A08.A05 == 13366 && (A0B = A08.A0B(40)) != null) {
            C1LZ.A00();
            AbstractC166997dE.A1H(this.A01, A0B, 0);
        }
    }

    @Override // X.AbstractC65828Tul
    /* renamed from: A01 */
    public final void onBindViewHolder(C131805xG c131805xG, int i) {
        StringBuilder sb;
        String str;
        String A0x;
        C6FG c6fg;
        super.onBindViewHolder(c131805xG, i);
        if (!C2V1.A02) {
            C135266Ab A01 = ((U48) this.A03.get(i)).A00.A01();
            if (A01 == null) {
                c6fg = this.A02;
                A0x = "RenderResult is null after Binding item in the collection";
            } else {
                C79243gV c79243gV = A01.A01;
                C102884kP c102884kP = this.A00;
                if (AbstractC65983Txc.A00(c102884kP) == 0 && c79243gV.A01() > super.A01 * 3) {
                    sb = new StringBuilder();
                    sb.append("Item in the collection is too wide item width: ");
                    sb.append(c79243gV.A01());
                    sb.append(" collection width: ");
                    sb.append(super.A01);
                    str = " This will lead to OOMs and poor performance. Use Flipper's UI Debugger to debug.See https://www.internalfb.com/intern/staticdocs/bloks/docs/bloks_standard_library/components/collection_v2#performance-considerations";
                } else {
                    if (AbstractC65983Txc.A00(c102884kP) != 1 || c79243gV.A00() <= super.A00 * 3) {
                        return;
                    }
                    sb = new StringBuilder();
                    sb.append("Item in the collection is too high item height: ");
                    sb.append(c79243gV.A00());
                    sb.append(" collection height: ");
                    sb.append(super.A00);
                    str = " This will lead to OOMs and poor performance. Use Flipper's UI Debugger to debug.See https://www.internalfb.com/intern/staticdocs/bloks/docs/bloks_standard_library/components/collection_v2#performance-considerations.";
                }
                A0x = AbstractC166997dE.A0x(str, sb);
                c6fg = this.A02;
            }
            AbstractC25241Le.A01(c6fg, "BloksCollection", A0x, null, 0, true);
        }
    }
}
