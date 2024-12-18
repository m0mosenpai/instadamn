package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Dsc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31492Dsc implements InterfaceC37229Gae {
    public final C53N A00;
    public final boolean A01;

    @Override // X.InterfaceC37229Gae
    public final boolean EjK(Context context, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        return !AbstractC31178DnM.A1Z(AbstractC23021Ah.A00(userSession), PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
    }

    @Override // X.InterfaceC37229Gae
    public final int BEr() {
        if (!this.A01) {
            return R.drawable.activation_card_name;
        }
        return R.drawable.activation_card_name_redesign;
    }

    @Override // X.InterfaceC37229Gae
    public final void D12() {
        this.A00.DUz();
    }

    public C31492Dsc(C53N c53n, boolean z) {
        this.A00 = c53n;
        this.A01 = z;
    }

    @Override // X.InterfaceC37229Gae
    public final int Aj9() {
        return 2131952183;
    }

    @Override // X.InterfaceC37229Gae
    public final int Apx() {
        return 2131952182;
    }

    @Override // X.InterfaceC37229Gae
    public final int Apy() {
        return 2131952185;
    }

    @Override // X.InterfaceC37229Gae
    public final String BfQ() {
        return PublicKeyCredentialControllerUtility.JSON_KEY_NAME;
    }

    @Override // X.InterfaceC37229Gae
    public final int C3h() {
        return 2131952184;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r1 == 0) goto L6;
     */
    @Override // X.InterfaceC37229Gae
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean CRX(com.instagram.common.session.UserSession r3, com.instagram.user.model.User r4) {
        /*
            r2 = this;
            com.instagram.user.model.User r0 = X.AbstractC31178DnM.A0T(r3)
            java.lang.String r0 = r0.getFullName()
            if (r0 == 0) goto L11
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L12
        L11:
            r0 = 1
        L12:
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31492Dsc.CRX(com.instagram.common.session.UserSession, com.instagram.user.model.User):boolean");
    }

    @Override // X.InterfaceC37229Gae
    public final int getTitleRes() {
        return 2131952185;
    }

    @Override // X.InterfaceC37229Gae
    public final /* synthetic */ float Aiy(UserSession userSession) {
        return 1.0f;
    }
}
