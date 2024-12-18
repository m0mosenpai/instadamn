package X;

import java.util.Map;

/* renamed from: X.IqJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42416IqJ implements InterfaceC43460JHy {
    public final /* synthetic */ C38016Go3 A00;

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0180, code lost:
    
        if (r2 != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
    
        r11 = r8.get(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x03b1, code lost:
    
        if (r16.CdW() != false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0144, code lost:
    
        if (r6.CdW() != false) goto L69;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:194:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC43460JHy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DqV(X.C84543q2 r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.util.List r36) {
        /*
            Method dump skipped, instructions count: 1097
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42416IqJ.DqV(X.3q2, java.lang.String, java.lang.String, java.lang.String, java.util.List):void");
    }

    public C42416IqJ(C38016Go3 c38016Go3) {
        this.A00 = c38016Go3;
    }

    @Override // X.InterfaceC43460JHy
    public final int AuB() {
        return this.A00.A01().getItemCount();
    }

    @Override // X.InterfaceC43460JHy
    public final void DFf() {
        C69613Av c69613Av;
        C38016Go3 c38016Go3 = this.A00;
        C38018Go6.A00(c38016Go3.A01());
        ILJ ilj = c38016Go3.A0J;
        C114485Es c114485Es = ilj.A01;
        MTJ mtj = c114485Es.A05;
        if (mtj != null && (c69613Av = mtj.A00) != null) {
            c69613Av.A01();
        }
        C62112sC c62112sC = c114485Es.A0D;
        if (c62112sC != null) {
            c62112sC.A00();
        }
        if (!c38016Go3.A06) {
            ilj.A00();
            c38016Go3.A06 = true;
        }
    }

    @Override // X.InterfaceC43460JHy
    public final void onStart() {
        C69613Av c69613Av;
        C38016Go3 c38016Go3 = this.A00;
        C38018Go6.A00(c38016Go3.A01());
        C114485Es c114485Es = c38016Go3.A0J.A01;
        MTJ mtj = c114485Es.A05;
        if (mtj != null && (c69613Av = mtj.A00) != null) {
            c69613Av.A04();
        }
        C62112sC c62112sC = c114485Es.A0D;
        if (c62112sC != null) {
            c62112sC.A01();
        }
        if (!c38016Go3.A06) {
            if (C18U.A06(C06090Tz.A05, c114485Es.getSession(), 36314901970488226L) && c114485Es.A0R) {
                C6WQ A0i = AbstractC31174DnI.A0i(c114485Es.requireActivity());
                A0i.A00(c114485Es.getString(2131965660));
                C0fJ.A00(A0i);
                c114485Es.A0G = A0i;
            }
        }
    }

    @Override // X.InterfaceC43460JHy
    public final void CJS(Map map) {
        int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
    }
}
