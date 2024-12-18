package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import com.instagram.user.model.User;

/* renamed from: X.EIl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32252EIl extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "ProfilePhotoUploadFragment";
    public C3CZ A00;
    public InterfaceC37264GbH A01;
    public User A02;
    public TextView A03;
    public CircularImageView A04;
    public ProgressButton A05;
    public final InterfaceC09390do A06 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "profile_photo_upload";
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C32252EIl r3) {
        /*
            com.instagram.user.model.User r0 = r3.A02
            java.lang.String r2 = "user"
            if (r0 == 0) goto L3c
            boolean r0 = r0.A1k()
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r3.A05
            if (r0 == 0) goto L2c
            if (r1 == 0) goto L16
            r0 = 2131970229(0x7f1348b5, float:1.9577403E38)
            r1.setText(r0)
        L16:
            android.widget.TextView r1 = r3.A03
            if (r1 == 0) goto L20
            r0 = 2131974116(0x7f1357e4, float:1.9585287E38)
        L1d:
            r1.setText(r0)
        L20:
            com.instagram.common.ui.widget.imageview.CircularImageView r1 = r3.A04
            if (r1 == 0) goto L2b
            com.instagram.user.model.User r0 = r3.A02
            if (r0 == 0) goto L3c
            X.AbstractC31173DnH.A1T(r3, r1, r0)
        L2b:
            return
        L2c:
            if (r1 == 0) goto L34
            r0 = 2131968535(0x7f134217, float:1.9573967E38)
            r1.setText(r0)
        L34:
            android.widget.TextView r1 = r3.A03
            if (r1 == 0) goto L20
            r0 = 2131970230(0x7f1348b6, float:1.9577405E38)
            goto L1d
        L3c:
            X.C14360o3.A0F(r2)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32252EIl.A00(X.EIl):void");
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A06);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C3CZ c3cz = this.A00;
        if (c3cz != null) {
            c3cz.A08(intent, i, i2, false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(241799932);
        super.onCreate(bundle);
        this.A01 = AbstractC34275F9v.A00(this);
        C08730cb c08730cb = C17060sy.A01;
        InterfaceC09390do interfaceC09390do = this.A06;
        this.A02 = AbstractC31176DnK.A0g(c08730cb, interfaceC09390do);
        boolean z = C3CZ.A0G;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        AbstractC10360h2 A0I = AbstractC31174DnI.A0I(this);
        C14360o3.A07(A0I);
        User user = this.A02;
        if (user == null) {
            C14360o3.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
            throw C00O.createAndThrow();
        }
        this.A00 = new C3CZ(this, A0I, new C35905FtP(this, 0), A0r, user, C05F.A0q, null);
        C0f9.A09(97493179, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1654626155);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.nux_profile_photo_upload_fragment, viewGroup, false);
        this.A04 = AbstractC31173DnH.A0T(inflate, R.id.profile_photo_image);
        TextView A0T = AbstractC166997dE.A0T(inflate, R.id.skip_button);
        this.A03 = A0T;
        if (A0T != null) {
            ViewOnClickListenerC31724DwT.A00(A0T, 20, this);
        }
        ProgressButton A0U = AbstractC31180DnO.A0U(inflate);
        this.A05 = A0U;
        if (A0U != null) {
            ViewOnClickListenerC31724DwT.A00(A0U, 21, this);
        }
        A00(this);
        C0f9.A09(-406256320, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1172353095);
        super.onDestroyView();
        this.A04 = null;
        this.A03 = null;
        this.A05 = null;
        C0f9.A09(1444381212, A02);
    }
}
