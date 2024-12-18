package X;

/* loaded from: classes6.dex */
public final class G8K implements InterfaceC57949Pmv {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public G8K(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x008c, code lost:
    
        if (r0 != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b3, code lost:
    
        r2.setLabelText(((androidx.fragment.app.Fragment) r5.A02).getString(2131964943));
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009c, code lost:
    
        r2.setLabelText("");
        r6.A01 = "error";
        r0 = ((androidx.fragment.app.Fragment) r5.A02).getString(2131964943);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009a, code lost:
    
        if (r0 != false) goto L38;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC57949Pmv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C54543O7v getState(X.C54543O7v r6, java.lang.CharSequence r7, boolean r8) {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L8f;
                case 1: goto L81;
                case 2: goto L7;
                default: goto L5;
            }
        L5:
            r6 = 0
        L6:
            return r6
        L7:
            r4 = 0
            boolean r3 = X.AbstractC167007dF.A1R(r4, r6, r7)
            java.lang.String r2 = r7.toString()
            int r0 = r2.length()
            if (r0 != 0) goto L2b
            java.lang.String r0 = "error"
            r6.A01 = r0
            java.lang.Object r0 = r5.A01
            android.content.Context r0 = (android.content.Context) r0
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131976573(0x7f13617d, float:1.959027E38)
        L25:
            java.lang.String r0 = r1.getString(r0)
            goto Lb0
        L2b:
            java.lang.Object r1 = r5.A02
            X.0sZ r1 = (X.InterfaceC16820sZ) r1
            java.lang.Object r0 = r1.invoke()
            if (r0 == 0) goto L48
            java.lang.Object r0 = r1.invoke()
            X.FOh r0 = (X.C34649FOh) r0
            if (r0 == 0) goto L46
            java.lang.String r0 = r0.A0O
        L3f:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L48
            return r6
        L46:
            r0 = 0
            goto L3f
        L48:
            java.util.HashMap r0 = X.FEU.A01
            java.lang.Object r0 = r0.get(r2)
            X.EoZ r0 = (X.EnumC33340EoZ) r0
            if (r0 == 0) goto L72
            int r1 = r0.ordinal()
            if (r1 == r3) goto Lc1
            r0 = 2
            if (r1 == r0) goto L62
            if (r1 == r4) goto L6
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L62:
            java.lang.String r0 = "error"
            r6.A01 = r0
            java.lang.Object r0 = r5.A01
            android.content.Context r0 = (android.content.Context) r0
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131976580(0x7f136184, float:1.9590285E38)
            goto L25
        L72:
            X.Dws r2 = X.FEU.A00
            if (r2 == 0) goto L7e
            r2.removeMessages(r3)
            r0 = 1000(0x3e8, double:4.94E-321)
            r2.sendEmptyMessageDelayed(r3, r0)
        L7e:
            java.lang.String r0 = "loading"
            goto Lc3
        L81:
            X.AbstractC167017dG.A1N(r6, r7)
            boolean r0 = X.AbstractC001900j.A0T(r7)
            java.lang.Object r2 = r5.A01
            com.instagram.igds.components.form.IgFormField r2 = (com.instagram.igds.components.form.IgFormField) r2
            if (r0 == 0) goto Lb3
            goto L9c
        L8f:
            X.AbstractC167017dG.A1N(r6, r7)
            boolean r0 = X.AbstractC001900j.A0T(r7)
            java.lang.Object r2 = r5.A01
            com.instagram.igds.components.form.IgFormField r2 = (com.instagram.igds.components.form.IgFormField) r2
            if (r0 == 0) goto Lb3
        L9c:
            java.lang.String r0 = ""
            r2.setLabelText(r0)
            java.lang.String r0 = "error"
            r6.A01 = r0
            java.lang.Object r1 = r5.A02
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            r0 = 2131964943(0x7f13340f, float:1.9566682E38)
            java.lang.String r0 = r1.getString(r0)
        Lb0:
            r6.A00 = r0
            return r6
        Lb3:
            java.lang.Object r1 = r5.A02
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            r0 = 2131964943(0x7f13340f, float:1.9566682E38)
            java.lang.String r0 = r1.getString(r0)
            r2.setLabelText(r0)
        Lc1:
            java.lang.String r0 = "confirmed"
        Lc3:
            r6.A01 = r0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.G8K.getState(X.O7v, java.lang.CharSequence, boolean):X.O7v");
    }
}
