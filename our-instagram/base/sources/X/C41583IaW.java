package X;

import java.util.HashMap;

/* renamed from: X.IaW, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41583IaW {
    public final C55982hj A00;
    public final InterfaceC77033cp A01;
    public final C3FQ A02;
    public final HashMap A03 = AbstractC166987dD.A1G();

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String A00(X.C41583IaW r3, int r4) {
        /*
            X.3FQ r1 = r3.A02
            X.2xM r0 = r1.AZU()
            if (r0 == 0) goto L6c
            X.2xM r0 = r1.AZU()
            java.lang.Object r3 = r0.getItem(r4)
            X.2xM r0 = r1.AZU()
            java.lang.Object r2 = r0.getAdapter()
            boolean r0 = r2 instanceof X.C2US
            if (r0 != 0) goto L65
            boolean r0 = r2 instanceof X.C7E1
            if (r0 == 0) goto L4e
            android.widget.BaseAdapter r2 = (android.widget.BaseAdapter) r2
            int r0 = r2.getItemViewType(r4)
        L26:
            java.lang.String r2 = java.lang.String.valueOf(r0)
            boolean r0 = r3 instanceof X.InterfaceC38381qS
            if (r0 == 0) goto L40
            java.lang.StringBuilder r1 = X.AbstractC166987dD.A1C()
            X.1qS r3 = (X.InterfaceC38381qS) r3
            java.lang.String r0 = r3.getId()
        L38:
            r1.append(r0)
            java.lang.String r0 = X.AbstractC166997dE.A0x(r2, r1)
            return r0
        L40:
            boolean r0 = r3 instanceof X.InterfaceC62602sz
            if (r0 == 0) goto L47
            java.lang.String r0 = "ITEM_ID_LOAD_MORE"
            return r0
        L47:
            java.lang.StringBuilder r1 = X.AbstractC166987dD.A1C()
            java.lang.String r0 = "ITEM_ID_OTHERS"
            goto L38
        L4e:
            boolean r0 = r2 instanceof X.C66362zD
            if (r0 != 0) goto L65
            java.lang.String r1 = "unsupported adapter type: "
            if (r2 != 0) goto L60
            r0 = 0
        L57:
            java.lang.String r0 = X.AnonymousClass001.A0R(r1, r0)
            java.lang.UnsupportedOperationException r0 = X.AbstractC166987dD.A1D(r0)
            throw r0
        L60:
            java.lang.String r0 = X.AbstractC31173DnH.A0q(r2)
            goto L57
        L65:
            X.2UU r2 = (X.C2UU) r2
            int r0 = r2.getItemViewType(r4)
            goto L26
        L6c:
            java.lang.String r0 = "unsupported adapter type: null"
            java.lang.UnsupportedOperationException r0 = X.AbstractC166987dD.A1D(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41583IaW.A00(X.IaW, int):java.lang.String");
    }

    public C41583IaW(InterfaceC77033cp interfaceC77033cp, C3FQ c3fq) {
        this.A02 = c3fq;
        this.A01 = interfaceC77033cp;
        C55982hj A0R = AbstractC167007dF.A0R();
        A0R.A09(C55942hf.A00());
        A0R.A02();
        this.A00 = A0R;
        A0R.A0A(new H8I(this, 0));
    }
}
