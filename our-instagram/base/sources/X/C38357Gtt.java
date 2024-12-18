package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import java.util.List;

/* renamed from: X.Gtt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38357Gtt extends C2UU {
    public final int A00;
    public final InterfaceC43425JGp A01;
    public final List A02;
    public final boolean[] A03;

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (r1[r6] != false) goto L8;
     */
    @Override // X.C2UU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onBindViewHolder(X.C3OO r5, int r6) {
        /*
            r4 = this;
            X.GuY r5 = (X.C38397GuY) r5
            android.widget.TextView r3 = r5.A00
            java.util.List r0 = r4.A02
            java.lang.Object r0 = r0.get(r6)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r3.setText(r0)
            boolean[] r1 = r4.A03
            if (r1 == 0) goto L1b
            int r0 = r1.length
            if (r6 >= r0) goto L1b
            boolean r0 = r1[r6]
            r2 = 0
            if (r0 == 0) goto L1c
        L1b:
            r2 = 1
        L1c:
            r3.setEnabled(r2)
            int r0 = r4.A00
            boolean r1 = X.AbstractC167007dF.A1P(r6, r0)
            r0 = 0
            r3.setTypeface(r0, r1)
            if (r2 == 0) goto L34
            r1 = 1
            X.IiC r0 = new X.IiC
            r0.<init>(r4, r6, r1)
            X.C0fQ.A00(r0, r3)
        L34:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38357Gtt.onBindViewHolder(X.3OO, int):void");
    }

    public C38357Gtt(InterfaceC43425JGp interfaceC43425JGp, List list, boolean[] zArr, int i) {
        this.A01 = interfaceC43425JGp;
        this.A02 = list;
        this.A03 = zArr;
        this.A00 = i;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-2136979162);
        int size = this.A02.size();
        C0f9.A0A(471179223, A03);
        return size;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.3OO, X.GuY] */
    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View A0A = AbstractC31172DnG.A0A(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.picker_list_item);
        ?? c3oo = new C3OO(A0A);
        c3oo.A00 = (TextView) A0A;
        return c3oo;
    }
}
