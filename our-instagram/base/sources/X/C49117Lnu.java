package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Lnu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49117Lnu implements C7QC {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final InterfaceC165247aD A02;
    public final C162907Rb A03;
    public final AnonymousClass988 A04;

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ C7QD ANU(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        View A0C = AbstractC31173DnH.A0C(layoutInflater, viewGroup, R.layout.direct_coauthor_posts_invite, false);
        C7N9.A01(A0C);
        C49159Loc c49159Loc = new C49159Loc(A0C);
        this.A03.A00(c49159Loc);
        return c49159Loc;
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void F91(C7QD c7qd) {
        C14360o3.A0B(c7qd, 0);
        this.A03.A01(c7qd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (0.8f < r3) goto L6;
     */
    @Override // X.C7QC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void ADy(X.C7QD r9, X.InterfaceC129555tK r10) {
        /*
            r8 = this;
            X.Loc r9 = (X.C49159Loc) r9
            X.KT0 r10 = (X.KT0) r10
            r6 = 0
            boolean r5 = X.AbstractC167007dF.A1R(r6, r9, r10)
            float r3 = r10.A00
            r2 = 1072986849(0x3ff47ae1, float:1.91)
            int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r0 <= 0) goto L1a
            r2 = r3
            r1 = 1061997773(0x3f4ccccd, float:0.8)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L1b
        L1a:
            r1 = r2
        L1b:
            com.instagram.ui.widget.framelayout.MediaFrameLayout r0 = r9.A03
            r0.A00 = r1
            com.instagram.feed.widget.IgProgressImageView r4 = r9.A02
            r4.setAspectRatio(r1)
            boolean r0 = r10.A04
            r7 = 8
            if (r0 != 0) goto L4d
            X.2iX r0 = r9.A01
            r0.setVisibility(r7)
        L2f:
            X.7QL r0 = r10.A03
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r4.getIgImageView()
            X.791 r0 = X.AbstractC1580577p.A05(r1, r0)
            r1.setImageRendererAndReset(r0)
            com.instagram.common.typedurl.ImageUrl r2 = r10.A01
            if (r2 == 0) goto L47
            com.instagram.common.session.UserSession r1 = r8.A01
            X.0iw r0 = r8.A00
            r4.setUrl(r1, r2, r0)
        L47:
            X.7Rb r0 = r8.A03
            r0.A02(r9, r10)
            return
        L4d:
            X.2iX r2 = r9.A01
            r2.setVisibility(r6)
            android.view.View r1 = r2.getView()
            r0 = 21
            X.LQ1.A00(r1, r0, r8, r10)
            X.7QL r0 = r10.A03
            int r3 = X.AbstractC1580577p.A00(r0)
            android.view.View r0 = r2.getView()
            android.graphics.drawable.Drawable r2 = r0.getBackground()
            r0 = 27
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            X.C14360o3.A0C(r2, r0)
            android.graphics.drawable.GradientDrawable r2 = (android.graphics.drawable.GradientDrawable) r2
            float[] r1 = new float[r7]
            r0 = 0
            r1[r6] = r0
            X.AbstractC43594JPz.A1U(r1, r0, r5)
            float r0 = (float) r3
            X.AbstractC167017dG.A1X(r1, r0)
            r2.setCornerRadii(r1)
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49117Lnu.ADy(X.7QD, X.5tK):void");
    }

    public C49117Lnu(InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC165247aD interfaceC165247aD, AnonymousClass988 anonymousClass988) {
        this.A02 = interfaceC165247aD;
        this.A04 = anonymousClass988;
        this.A00 = interfaceC11380iw;
        this.A01 = userSession;
        boolean z = anonymousClass988.A1U;
        C7AZ c7az = new C7AZ(z);
        this.A03 = AbstractC43594JPz.A0b(new C1580177l(null, new C49003Llr(this), c7az.A00(interfaceC165247aD), new C7Q9((InterfaceC165307aJ) interfaceC165247aD, z), (InterfaceC165507ad) interfaceC165247aD, anonymousClass988, null, false), c7az);
    }
}
