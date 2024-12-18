package X;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.LinkWithText;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;

/* renamed from: X.FiY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC35357FiY implements DialogInterface.OnClickListener {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ LinkWithText A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C1XI A03;
    public final /* synthetic */ Product A04;

    public DialogInterfaceOnClickListenerC35357FiY(FragmentActivity fragmentActivity, LinkWithText linkWithText, UserSession userSession, C1XI c1xi, Product product) {
        this.A03 = c1xi;
        this.A04 = product;
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A01 = linkWithText;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if (X.AbstractC116315Ok.A00(r1) == false) goto L10;
     */
    @Override // android.content.DialogInterface.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.content.DialogInterface r7, int r8) {
        /*
            r6 = this;
            com.instagram.user.model.Product r5 = r6.A04
            com.instagram.api.schemas.ProductReviewStatus r1 = r5.A05
            com.instagram.api.schemas.ProductReviewStatus r0 = com.instagram.api.schemas.ProductReviewStatus.A08
            if (r1 != r0) goto L15
            X.1XI r4 = r6.A03
            androidx.fragment.app.FragmentActivity r3 = r6.A00
            com.instagram.common.session.UserSession r2 = r6.A02
            java.lang.String r1 = r5.A0H
            r0 = 1
            r4.A1F(r3, r2, r1, r0)
            return
        L15:
            androidx.fragment.app.FragmentActivity r3 = r6.A00
            com.instagram.common.session.UserSession r2 = r6.A02
            com.instagram.api.schemas.LinkWithText r0 = r6.A01
            if (r0 == 0) goto L32
            java.lang.String r1 = r0.A01
            boolean r0 = X.AbstractC116315Ok.A00(r1)
            if (r0 != 0) goto L32
        L25:
            X.SXK r1 = X.AbstractC31171DnF.A0R(r1)
            com.instagram.simplewebview.SimpleWebViewConfig r0 = new com.instagram.simplewebview.SimpleWebViewConfig
            r0.<init>(r1)
            com.instagram.simplewebview.SimpleWebViewActivity.A00(r3, r2, r0)
            return
        L32:
            r0 = 2462(0x99e, float:3.45E-42)
            java.lang.String r1 = X.AbstractC111324zv.A00(r0)
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DialogInterfaceOnClickListenerC35357FiY.onClick(android.content.DialogInterface, int):void");
    }
}
