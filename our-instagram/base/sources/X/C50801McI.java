package X;

import android.widget.BaseAdapter;
import java.util.List;

/* renamed from: X.McI, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50801McI extends BaseAdapter {
    public final List A00;
    public final C54378O1k A01;
    public final InterfaceC11380iw A02;

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.A00.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.A00.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        AbstractC25225BEi.A0x(this.A00, i).getId().getClass();
        return r0.hashCode();
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
    
        r8 = r8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, X.NnH] */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View getView(int r7, android.view.View r8, android.view.ViewGroup r9) {
        /*
            r6 = this;
            if (r8 != 0) goto L1a
            android.view.LayoutInflater r1 = X.AbstractC25228BEl.A0P(r9)
            r0 = 2131624681(0x7f0e02e9, float:1.8876549E38)
            android.view.View r8 = X.AbstractC31172DnG.A0A(r1, r9, r0)
            r1 = r8
            com.instagram.common.ui.widget.imageview.IgImageView r1 = (com.instagram.common.ui.widget.imageview.IgImageView) r1
            X.NnH r0 = new X.NnH
            r0.<init>()
            r0.A00 = r1
            r8.setTag(r0)
        L1a:
            java.lang.Object r0 = X.AbstractC31172DnG.A0x(r8)
            X.NnH r0 = (X.C53610NnH) r0
            java.lang.Object r5 = r6.getItem(r7)
            X.1qM r5 = (X.C38321qM) r5
            X.0iw r4 = r6.A02
            X.O1k r3 = r6.A01
            com.instagram.common.ui.widget.imageview.IgImageView r2 = r0.A00
            r2.getClass()
            android.content.Context r1 = r2.getContext()
            r0 = 2131100245(0x7f060255, float:1.7812866E38)
            int r0 = r1.getColor(r0)
            r2.setPlaceHolderColor(r0)
            com.instagram.common.typedurl.ImageUrl r1 = r5.A1S()
            boolean r0 = X.AbstractC81033jX.A03(r1)
            if (r0 != 0) goto L4a
            r2.setUrl(r1, r4)
        L4a:
            r0 = 1
            X.ViewOnClickListenerC55464OkJ.A01(r2, r0, r5, r3)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50801McI.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public C50801McI(C54378O1k c54378O1k, InterfaceC11380iw interfaceC11380iw, List list) {
        this.A00 = list;
        this.A02 = interfaceC11380iw;
        this.A01 = c54378O1k;
    }
}
