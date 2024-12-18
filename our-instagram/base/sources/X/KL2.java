package X;

import java.util.List;

/* loaded from: classes8.dex */
public final class KL2 extends AbstractC146246iN {
    public C47293Kv4 A02 = null;
    public InterfaceC58181Pql A01 = null;
    public int A00 = -1;
    public List A03 = C16930sl.A00;

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b2, code lost:
    
        if (r6.A02 != null) goto L44;
     */
    @Override // X.AbstractC146246iN, android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View getView(int r8, android.view.View r9, android.view.ViewGroup r10) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KL2.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.A03.size();
    }

    @Override // android.widget.Adapter
    public final /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A03.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        if (((C45073Jx2) this.A03.get(i)).A0B.A00 != null) {
            return r0.A05;
        }
        return -1L;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i) {
        if (!((C45073Jx2) this.A03.get(i)).A0B.A06()) {
            return 1;
        }
        return 3;
    }
}
