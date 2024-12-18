package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import java.util.List;

/* renamed from: X.LRe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48104LRe implements C07X, C7QC {
    public final C0eR A00 = new C0eR(this);
    public final C162907Rb A01;

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ C7QD ANU(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        C44787Js8 c44787Js8 = new C44787Js8(AbstractC25227BEk.A0D(layoutInflater, viewGroup, R.layout.direct_file_xma_content, false));
        c44787Js8.A01.post(new M48(this, c44787Js8));
        return c44787Js8;
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void F91(C7QD c7qd) {
        C14360o3.A0B(c7qd, 0);
        this.A01.A01(c7qd);
        this.A00.A0B(C07R.ON_PAUSE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008a, code lost:
    
        if (r1 == 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0097, code lost:
    
        r3 = r9.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0094, code lost:
    
        if (r4.length() != 0) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    @Override // X.C7QC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void ADy(X.C7QD r9, X.InterfaceC129555tK r10) {
        /*
            r8 = this;
            X.Js8 r9 = (X.C44787Js8) r9
            X.KT1 r10 = (X.KT1) r10
            r7 = 0
            boolean r6 = X.AbstractC167007dF.A1R(r7, r9, r10)
            java.lang.String r1 = r10.A05
            if (r1 != 0) goto L15
            android.view.View r1 = r9.A01
            r0 = 8
            r1.setVisibility(r0)
            return
        L15:
            com.instagram.common.ui.base.IgTextView r0 = r9.A03
            r0.setText(r1)
            java.lang.String r4 = r10.A03
            if (r4 == 0) goto L8c
            int r1 = r4.length()
            if (r1 == 0) goto L8a
            java.lang.String r2 = r10.A02
            if (r2 == 0) goto L8a
            int r0 = r2.length()
            if (r0 == 0) goto L8a
            com.instagram.common.ui.base.IgTextView r3 = r9.A02
            android.view.View r0 = r9.A01
            android.content.Context r1 = r0.getContext()
            r0 = 2131959640(0x7f131f58, float:1.9555926E38)
            java.lang.String r4 = X.AbstractC31174DnI.A0t(r1, r4, r2, r0)
        L3d:
            r3.setText(r4)
        L40:
            android.view.View r5 = r9.A01
            r5.setVisibility(r7)
            android.graphics.drawable.Drawable r4 = X.AbstractC162807Qr.A00()
            X.7IM r0 = r10.A00
            X.7II r3 = r0.A03
            android.content.Context r0 = r5.getContext()
            X.C14360o3.A07(r0)
            X.C14360o3.A0B(r4, r6)
            X.7Oj r1 = X.AbstractC43593JPy.A0G(r4)
            if (r1 == 0) goto L7a
            int r0 = r3.A03
            r1.A01(r0)
            android.graphics.drawable.shapes.Shape r2 = r1.A03
            boolean r0 = r2 instanceof X.AbstractC148416mB
            if (r0 == 0) goto L7a
            r0 = 1136(0x470, float:1.592E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            X.C14360o3.A0C(r2, r0)
            X.6mB r2 = (X.AbstractC148416mB) r2
            X.7R2 r1 = X.C7R2.A05
            float r0 = r3.A02
            X.C7II.A01(r2, r1, r3, r0, r0)
        L7a:
            r5.setBackground(r4)
            X.7Rb r0 = r8.A01
            r0.A02(r9, r10)
            X.0eR r1 = r8.A00
            X.07R r0 = X.C07R.ON_RESUME
            r1.A0B(r0)
            return
        L8a:
            if (r1 != 0) goto L97
        L8c:
            java.lang.String r4 = r10.A02
            if (r4 == 0) goto L40
            int r0 = r4.length()
            if (r0 != 0) goto L97
            goto L40
        L97:
            com.instagram.common.ui.base.IgTextView r3 = r9.A02
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48104LRe.ADy(X.7QD, X.5tK):void");
    }

    @Override // X.C07X
    public final /* bridge */ /* synthetic */ C07T getLifecycle() {
        return this.A00;
    }

    public C48104LRe(List list) {
        this.A01 = new C162907Rb(list);
    }
}
