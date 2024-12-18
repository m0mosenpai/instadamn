package X;

import android.graphics.Bitmap;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.Lut, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49540Lut implements InterfaceC65982ya {
    public boolean A00;
    public final /* synthetic */ Bitmap A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ EnumC46246KdN A04;
    public final /* synthetic */ DirectThreadKey A05;

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0017, code lost:
    
        if (r7.A12() != false) goto L10;
     */
    @Override // X.InterfaceC65982ya
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Dbp(X.C47Z r7) {
        /*
            r6 = this;
            r0 = 0
            X.C14360o3.A0B(r7, r0)
            boolean r0 = r7.A4w
            if (r0 == 0) goto Lc
            boolean r0 = r7.A5Q
            if (r0 == 0) goto L19
        Lc:
            boolean r0 = r7.A0m()
            if (r0 != 0) goto L19
            boolean r0 = r7.A12()
            r1 = 0
            if (r0 == 0) goto L1a
        L19:
            r1 = 1
        L1a:
            boolean r0 = r6.A00
            if (r0 != 0) goto L23
            if (r1 == 0) goto L23
            r0 = 1
            r6.A00 = r0
        L23:
            X.47k r1 = r7.A1f
            X.47k r0 = X.EnumC915447k.A02
            if (r1 == r0) goto L31
            X.47k r0 = X.EnumC915447k.A09
            if (r1 != r0) goto L3f
            boolean r0 = r7.A53
            if (r0 == 0) goto L3f
        L31:
            r7.A0X(r6)
            com.instagram.model.direct.DirectThreadKey r0 = r6.A05
            java.lang.String r3 = r0.A00
            if (r3 != 0) goto L57
            java.lang.String r3 = r0.A01
            if (r3 != 0) goto L57
        L3e:
            return
        L3f:
            boolean r0 = r7.A4w
            if (r0 == 0) goto L47
            boolean r0 = r7.A5Q
            if (r0 == 0) goto L3e
        L47:
            boolean r0 = r7.A0m()
            if (r0 != 0) goto L3e
            boolean r0 = r7.A12()
            if (r0 != 0) goto L3e
            r7.A0X(r6)
            return
        L57:
            com.instagram.common.session.UserSession r2 = r6.A03
            X.KdN r0 = r6.A04
            java.lang.String r4 = X.AbstractC166987dD.A19(r0)
            java.lang.Long r0 = r7.A2I
            java.lang.String r5 = java.lang.String.valueOf(r0)
            android.view.View r0 = r6.A02
            android.content.Context r0 = X.AbstractC166997dE.A0L(r0)
            android.graphics.Bitmap r1 = r6.A01
            X.LKb.A01(r0, r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49540Lut.Dbp(X.47Z):void");
    }

    public C49540Lut(Bitmap bitmap, View view, UserSession userSession, EnumC46246KdN enumC46246KdN, DirectThreadKey directThreadKey) {
        this.A05 = directThreadKey;
        this.A03 = userSession;
        this.A04 = enumC46246KdN;
        this.A02 = view;
        this.A01 = bitmap;
    }
}
