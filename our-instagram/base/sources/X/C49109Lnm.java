package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Lnm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49109Lnm implements C7QC {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final InterfaceC165077Zw A02;

    /* JADX WARN: Code restructure failed: missing block: B:8:0x005f, code lost:
    
        if (r0 == false) goto L10;
     */
    @Override // X.C7QC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void ADy(X.C7QD r14, X.InterfaceC129555tK r15) {
        /*
            r13 = this;
            r7 = r14
            X.Lom r7 = (X.C49169Lom) r7
            X.KTD r15 = (X.KTD) r15
            android.widget.FrameLayout r1 = r7.A05
            android.content.Context r12 = r1.getContext()
            X.7QL r0 = r15.A02
            X.3Xy r0 = X.LJN.A00(r0, r7)
            if (r0 == 0) goto L26
            float[] r6 = r0.A01
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout r5 = r7.A0K
            r0 = 0
            r4 = r6[r0]
            r0 = 2
            r3 = r6[r0]
            r0 = 4
            r2 = r6[r0]
            r0 = 6
            r0 = r6[r0]
            r5.A01(r4, r3, r2, r0)
        L26:
            X.9Bx r2 = r15.A00
            com.instagram.common.session.UserSession r6 = r13.A01
            X.0iw r5 = r13.A00
            X.LJN.A01(r2, r5, r6, r7)
            X.Kh8 r9 = r15.A03
            X.0do r0 = r15.A05
            java.lang.Object r10 = r0.getValue()
            com.instagram.model.direct.messageid.DirectMessageIdentifier r10 = (com.instagram.model.direct.messageid.DirectMessageIdentifier) r10
            boolean r11 = X.AbstractC167007dF.A1W(r2)
            r8 = 0
            X.LJN.A02(r5, r6, r7, r8, r9, r10, r11)
            X.Kh9 r15 = r15.A04
            android.view.ViewGroup$LayoutParams r4 = r1.getLayoutParams()
            android.content.res.Resources r2 = r12.getResources()
            r0 = 2131165265(0x7f070051, float:1.7944742E38)
            int r2 = r2.getDimensionPixelSize(r0)
            r4.width = r2
            boolean r0 = r9 instanceof X.C45943KUu
            if (r0 == 0) goto L95
            X.KUu r9 = (X.C45943KUu) r9
            boolean r0 = r9.A03
        L5c:
            r3 = 1059363750(0x3f249ba6, float:0.643)
            if (r0 != 0) goto L63
        L61:
            r3 = 1065353216(0x3f800000, float:1.0)
        L63:
            float r0 = (float) r2
            float r0 = r0 / r3
            int r0 = (int) r0
            r4.height = r0
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout r0 = r7.A0K
            r0.A00 = r3
            com.instagram.feed.widget.IgProgressImageView r2 = r7.A0I
            r2.setAspectRatio(r3)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_CROP
            r2.setScaleType(r0)
            r1.setLayoutParams(r4)
            android.view.View r1 = r7.A04
            r0 = 8
            r1.setVisibility(r0)
            r0 = 2131239248(0x7f082150, float:1.8094798E38)
            android.graphics.drawable.Drawable r0 = r12.getDrawable(r0)
            r2.setProgressBarDrawable(r0)
            r11 = 5
            X.LPM r10 = new X.LPM
            r14 = r7
            r10.<init>(r11, r12, r13, r14, r15)
            X.C0fQ.A00(r10, r2)
            return
        L95:
            boolean r0 = r9 instanceof X.C45944KUv
            if (r0 == 0) goto L61
            X.KUv r9 = (X.C45944KUv) r9
            boolean r0 = r9.A06
            goto L5c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49109Lnm.ADy(X.7QD, X.5tK):void");
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void F91(C7QD c7qd) {
    }

    public C49109Lnm(InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC165077Zw interfaceC165077Zw) {
        this.A02 = interfaceC165077Zw;
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ C7QD ANU(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.direct_media_share_message);
        C7N9.A01(A0A);
        return new C49169Lom(A0A);
    }
}
