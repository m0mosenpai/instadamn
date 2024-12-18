package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.GpV, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38102GpV extends AbstractC66412zI {
    public final C38103GpW A00;
    public final AbstractC42425IqS A01;
    public final UserSession A02;
    public final JPS A03;
    public final InterfaceC43406JFw A04;
    public final InterfaceC60442pS A05;

    public C38102GpV(UserSession userSession, AbstractC42425IqS abstractC42425IqS, JPS jps, InterfaceC43406JFw interfaceC43406JFw, InterfaceC60442pS interfaceC60442pS, boolean z) {
        C14360o3.A0B(userSession, 2);
        this.A01 = abstractC42425IqS;
        this.A02 = userSession;
        this.A05 = interfaceC60442pS;
        this.A04 = interfaceC43406JFw;
        this.A03 = jps;
        this.A00 = new C38103GpW(interfaceC60442pS, userSession, jps, interfaceC43406JFw, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0072, code lost:
    
        if (r11 != null) goto L13;
     */
    @Override // X.AbstractC66422zJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void bind(X.InterfaceC66482zP r21, X.C3OO r22) {
        /*
            r20 = this;
            r0 = r22
            r7 = r21
            X.HKa r7 = (X.HKa) r7
            X.GvK r0 = (X.C38437GvK) r0
            r2 = 0
            boolean r10 = X.AbstractC167007dF.A1R(r2, r7, r0)
            r1 = r20
            X.GpW r3 = r1.A00
            X.1qM r12 = r7.A02
            com.instagram.igds.components.imagebutton.IgImageButton r13 = r0.A01
            com.instagram.common.ui.base.IgTextView r9 = r0.A00
            X.IqS r6 = r1.A01
            X.AbstractC167027dH.A0a(r10, r12, r13, r9, r6)
            X.5qK r4 = r7.A02
            X.JPS r0 = r3.A02
            X.5qT r1 = r0.BAM(r7)
            X.JFw r0 = r3.A03
            r15 = r13
            r17 = r4
            r18 = r7
            r19 = r2
            r14 = r0
            r16 = r1
            r14.EE0(r15, r16, r17, r18, r19)
            X.IBz r0 = r7.A01
            if (r0 == 0) goto L81
            X.IET r0 = r0.A00
            if (r0 == 0) goto L81
            java.lang.String r11 = r0.A01
            int r0 = r11.length()
            if (r0 <= 0) goto L74
            java.lang.StringBuilder r8 = X.AbstractC166987dD.A1C()
            char r5 = r11.charAt(r2)
            boolean r0 = java.lang.Character.isLowerCase(r5)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            if (r0 == 0) goto L64
            r0 = 244(0xf4, float:3.42E-43)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            X.C14360o3.A0C(r5, r0)
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r5 = X.AbstractC166997dE.A10(r0, r5)
        L64:
            r8.append(r5)
            java.lang.String r0 = r11.substring(r10)
            X.C14360o3.A07(r0)
            java.lang.String r11 = X.AbstractC166997dE.A0x(r0, r8)
            if (r11 == 0) goto L81
        L74:
            r9.setText(r11)
            r9.setVisibility(r2)
            android.graphics.Typeface r0 = android.graphics.Typeface.defaultFromStyle(r10)
            r9.setTypeface(r0)
        L81:
            r15 = 9
            X.Ijz r8 = new X.Ijz
            r14 = r8
            r16 = r6
            r17 = r1
            r19 = r12
            r14.<init>(r15, r16, r17, r18, r19)
            com.instagram.common.session.UserSession r11 = r3.A01
            r9 = 0
            int r15 = r1.A01
            int r1 = r1.A00
            float r14 = r4.A00
            X.0iw r10 = r3.A00
            boolean r0 = r3.A04
            r18 = r0
            r17 = r2
            r16 = r1
            X.AbstractC153386v7.A03(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38102GpV.bind(X.2zP, X.3OO):void");
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return HKa.class;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C38437GvK(C50802Vb.A02(layoutInflater, viewGroup, R.layout.layout_grid_item_topictiles));
    }
}
