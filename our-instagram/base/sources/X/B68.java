package X;

import android.graphics.Bitmap;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* loaded from: classes4.dex */
public final class B68 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Bitmap A01;
    public final /* synthetic */ Fragment A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ C38321qM A04;
    public final /* synthetic */ C183978Ee A05;
    public final /* synthetic */ boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B68(Bitmap bitmap, Fragment fragment, UserSession userSession, C38321qM c38321qM, C183978Ee c183978Ee, int i, boolean z) {
        super(0);
        this.A03 = userSession;
        this.A04 = c38321qM;
        this.A00 = i;
        this.A02 = fragment;
        this.A05 = c183978Ee;
        this.A01 = bitmap;
        this.A06 = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        if (r2 != null) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    @Override // X.InterfaceC16820sZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r10 = this;
            com.instagram.common.session.UserSession r5 = r10.A03
            X.1qM r2 = r10.A04
            int r1 = r10.A00
            androidx.fragment.app.Fragment r4 = r10.A02
            X.8Ee r7 = r10.A05
            android.graphics.Bitmap r3 = r10.A01
            boolean r9 = r10.A06
            boolean r0 = r2.A5M()
            if (r0 == 0) goto L1d
            X.1qM r2 = r2.A1e(r1)
            if (r2 != 0) goto L1d
        L1a:
            X.0eB r0 = X.C0eB.A00
            return r0
        L1d:
            java.lang.String r8 = r2.getId()
            if (r8 == 0) goto L1a
            boolean r0 = r2.A5M()
            if (r0 == 0) goto L3d
            X.1qM r2 = r2.A1e(r1)
            if (r2 == 0) goto L1a
        L2f:
            android.content.Context r0 = r4.requireContext()
            com.instagram.model.mediasize.ExtendedImageUrl r6 = r2.A1q(r0)
        L37:
            if (r6 == 0) goto L1a
            X.CYE.A00(r3, r4, r5, r6, r7, r8, r9)
            goto L1a
        L3d:
            boolean r0 = r2.A5P()
            if (r0 == 0) goto L2f
            com.instagram.common.typedurl.ImageUrl r6 = r2.A1S()
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B68.invoke():java.lang.Object");
    }
}
