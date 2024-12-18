package com.instagram.urlhandlers.rbs;

import X.AbstractC12990ll;
import X.AbstractC18680vv;
import X.AbstractC25226BEj;
import X.AbstractC25227BEk;
import X.AbstractC25229BEm;
import X.AbstractC31171DnF;
import X.AbstractC31176DnK;
import X.AbstractC31180DnO;
import X.AbstractC35178FfV;
import X.C0f9;
import X.C26835Bsx;
import X.C38321qM;
import X.CLH;
import X.InterfaceC43580JMo;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;

/* loaded from: classes9.dex */
public final class RBSPivotPageUrlHandlerActivity extends BaseFragmentActivity {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return AbstractC31171DnF.A0F(this);
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        InterfaceC43580JMo A0t;
        boolean z;
        String str;
        ImageUrl imageUrl;
        String str2;
        int i;
        int A00 = C0f9.A00(947427559);
        super.onCreate(bundle);
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 == null) {
            finish();
            i = 945465142;
        } else {
            String string = A07.getString("original_url");
            if (string == null) {
                finish();
                i = 392780641;
            } else {
                AbstractC18680vv A0F = AbstractC31171DnF.A0F(this);
                if (!(A0F instanceof UserSession)) {
                    AbstractC35178FfV.A01(this, A07, A0F);
                } else {
                    Uri A0B = AbstractC25227BEk.A0B(string);
                    UserSession userSession = (UserSession) A0F;
                    String queryParameter = A0B.getQueryParameter("media_id");
                    String queryParameter2 = A0B.getQueryParameter("media_surface");
                    boolean booleanQueryParameter = A0B.getBooleanQueryParameter("disable_cta", false);
                    if (queryParameter != null) {
                        C38321qM A0h = AbstractC25229BEm.A0h(userSession, queryParameter);
                        if (A0h != null && (A0t = AbstractC25226BEj.A0t(A0h)) != null) {
                            User BdV = A0t.BdV();
                            if (BdV != null) {
                                z = BdV.isVerified();
                            } else {
                                z = false;
                            }
                            String BdW = A0t.BdW();
                            if (BdV != null) {
                                str = BdV.getUsername();
                            } else {
                                str = null;
                            }
                            String BdS = A0t.BdS();
                            String BdU = A0t.BdU();
                            if (BdV != null) {
                                imageUrl = BdV.Bhu();
                                str2 = BdV.getId();
                            } else {
                                imageUrl = null;
                                str2 = null;
                            }
                            Bundle A002 = CLH.A00(imageUrl, BdW, str, BdS, BdU, str2, queryParameter, queryParameter2, null, z, booleanQueryParameter);
                            C26835Bsx c26835Bsx = new C26835Bsx();
                            c26835Bsx.setArguments(A002);
                            AbstractC31180DnO.A16(null, c26835Bsx, this, userSession, false);
                        } else {
                            finish();
                        }
                    } else {
                        Bundle A003 = CLH.A00(null, null, null, null, null, null, null, queryParameter2, null, false, booleanQueryParameter);
                        C26835Bsx c26835Bsx2 = new C26835Bsx();
                        c26835Bsx2.setArguments(A003);
                        AbstractC31180DnO.A16(null, c26835Bsx2, this, userSession, false);
                    }
                }
                i = 1526682811;
            }
        }
        C0f9.A07(i, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return AbstractC31171DnF.A0F(this);
    }
}
