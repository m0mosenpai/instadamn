package X;

import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.Mj6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC51163Mj6 extends C2UU {
    public O1E A00 = new O1E(false);

    public C3OO A00(ViewGroup viewGroup, O1E o1e) {
        return new C51234MkJ(AbstractC25227BEk.A0D(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.clips_acr_browser_placeholder_item_layout, false));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if ((r5 instanceof X.C51058MhC) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if ((r1 instanceof X.C51058MhC) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(X.O1E r5) {
        /*
            r4 = this;
            r3 = 0
            X.O1E r0 = r4.A00
            boolean r0 = X.C14360o3.A0K(r0, r5)
            if (r0 != 0) goto L28
            X.O1E r1 = r4.A00
            boolean r0 = r1 instanceof X.C51059MhD
            if (r0 != 0) goto L14
            boolean r0 = r1 instanceof X.C51058MhC
            r2 = 0
            if (r0 == 0) goto L15
        L14:
            r2 = 1
        L15:
            boolean r0 = r5 instanceof X.C51059MhD
            if (r0 != 0) goto L1e
            boolean r1 = r5 instanceof X.C51058MhC
            r0 = 0
            if (r1 == 0) goto L1f
        L1e:
            r0 = 1
        L1f:
            if (r2 == 0) goto L2d
            if (r0 != 0) goto L29
            r4.notifyItemRemoved(r3)
        L26:
            r4.A00 = r5
        L28:
            return
        L29:
            r4.notifyItemChanged(r3)
            goto L26
        L2d:
            if (r0 == 0) goto L26
            r4.notifyItemInserted(r3)
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC51163Mj6.A01(X.O1E):void");
    }

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        C14360o3.A0B(c3oo, 0);
        A02(this.A00, c3oo);
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        return A00(viewGroup, this.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r0 != false) goto L6;
     */
    @Override // X.C2UU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int getItemCount() {
        /*
            r3 = this;
            r0 = 1158300841(0x450a44a9, float:2212.2913)
            int r2 = X.C0f9.A03(r0)
            X.O1E r1 = r3.A00
            boolean r0 = r1 instanceof X.C51059MhD
            if (r0 != 0) goto L12
            boolean r0 = r1 instanceof X.C51058MhC
            r1 = 0
            if (r0 == 0) goto L13
        L12:
            r1 = 1
        L13:
            r0 = -255448387(0xfffffffff0c62abd, float:-4.906376E29)
            X.C0f9.A0A(r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC51163Mj6.getItemCount():int");
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        C0f9.A0A(379697631, C0f9.A03(-1942535748));
        return 0;
    }

    public void A02(O1E o1e, C3OO c3oo) {
    }
}
