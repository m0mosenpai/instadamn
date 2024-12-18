package X;

import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;

/* loaded from: classes6.dex */
public final class GS1 implements InterfaceC19960yQ {
    public final /* synthetic */ TextView A00;
    public final /* synthetic */ TextView A01;
    public final /* synthetic */ GridLayoutManager A02;
    public final /* synthetic */ C66362zD A03;
    public final /* synthetic */ C66362zD A04;
    public final /* synthetic */ C32268EJd A05;
    public final /* synthetic */ IgdsBottomButtonLayout A06;

    public GS1(TextView textView, TextView textView2, GridLayoutManager gridLayoutManager, C66362zD c66362zD, C66362zD c66362zD2, C32268EJd c32268EJd, IgdsBottomButtonLayout igdsBottomButtonLayout) {
        this.A01 = textView;
        this.A05 = c32268EJd;
        this.A00 = textView2;
        this.A04 = c66362zD;
        this.A03 = c66362zD2;
        this.A02 = gridLayoutManager;
        this.A06 = igdsBottomButtonLayout;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b6, code lost:
    
        if (r1 != false) goto L13;
     */
    @Override // X.InterfaceC19960yQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object r8, X.InterfaceC23621Ds r9) {
        /*
            r7 = this;
            X.E6q r8 = (X.C32064E6q) r8
            android.widget.TextView r2 = r7.A01
            X.EJd r4 = r7.A05
            android.content.Context r1 = r4.requireContext()
            int r0 = r8.A01
            X.AbstractC166987dD.A1P(r1, r2, r0)
            android.widget.TextView r2 = r7.A00
            android.content.Context r1 = r4.requireContext()
            int r0 = r8.A00
            X.AbstractC166987dD.A1P(r1, r2, r0)
            com.instagram.common.recyclerview.ViewModelListUpdate r1 = X.AbstractC31171DnF.A0E()
            java.util.List r0 = r8.A05
            r1.A01(r0)
            X.2zD r0 = r7.A04
            r0.A05(r1)
            com.instagram.common.recyclerview.ViewModelListUpdate r1 = X.AbstractC31171DnF.A0E()
            java.util.List r0 = r8.A04
            r1.A01(r0)
            X.2zD r0 = r7.A03
            r0.A05(r1)
            androidx.recyclerview.widget.GridLayoutManager r3 = r7.A02
            java.lang.Integer r2 = r8.A03
            java.lang.Integer r1 = X.C05F.A00
            r0 = 1
            if (r2 != r1) goto L40
            r0 = 2
        L40:
            r3.A1v(r0)
            boolean r5 = r8.A07
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r2 = r7.A06
            if (r5 == 0) goto Lb9
            android.content.Context r1 = r4.requireContext()
            int r0 = r8.A02
            java.lang.String r1 = r1.getString(r0)
            r0 = 6
            X.FpG r0 = X.ViewOnClickListenerC35681FpG.A00(r4, r0)
            r2.setPrimaryAction(r1, r0)
            boolean r0 = r8.A06
            r2.setPrimaryButtonEnabled(r0)
            r0 = 0
        L61:
            r2.setVisibility(r0)
            X.E6q r0 = r4.A00
            if (r0 != 0) goto La6
            X.0do r0 = r4.A01
            X.7F3 r2 = X.AbstractC31172DnG.A0c(r0)
            X.Ers r3 = X.C32268EJd.A00(r4)
            if (r5 != 0) goto Lab
            r6 = 0
        L75:
            r5 = 0
        L76:
            X.1Mh r2 = X.AbstractC31172DnG.A0H(r2)
            boolean r0 = X.AbstractC25226BEj.A1Z(r2)
            if (r0 == 0) goto La6
            r0 = 5
            r2.A0Z(r0)
            r0 = 1
            r2.A0X(r0)
            r0 = 495(0x1ef, float:6.94E-43)
            java.lang.String r0 = X.MSV.A00(r0)
            r2.A0O(r0, r6)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            r0 = 496(0x1f0, float:6.95E-43)
            java.lang.String r0 = X.MSV.A00(r0)
            r2.A0O(r0, r1)
            java.lang.String r0 = "entry_point"
            r2.A0M(r3, r0)
            r2.Cht()
        La6:
            r4.A00 = r8
            X.0eB r0 = X.C0eB.A00
            return r0
        Lab:
            boolean r1 = r8.A06
            boolean r0 = X.AbstractC167007dF.A1N(r1)
            java.lang.Boolean r6 = X.AbstractC31172DnG.A0s(r0)
            r5 = 1
            if (r1 == 0) goto L76
            goto L75
        Lb9:
            r0 = 8
            goto L61
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GS1.emit(java.lang.Object, X.1Ds):java.lang.Object");
    }
}
