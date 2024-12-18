package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.user.model.Product;

/* renamed from: X.IjA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC41979IjA implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public ViewOnClickListenerC41979IjA(Object obj, Object obj2, Object obj3, String str, int i) {
        this.A00 = i;
        this.A03 = obj3;
        this.A04 = str;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(-833715746);
                AbstractC12990ll abstractC12990ll = (AbstractC12990ll) this.A03;
                INH A0C = AbstractC86593tX.A0C(C22P.A1f);
                A0C.A0a = this.A04;
                A0C.A0n = true;
                A0C.A0p = true;
                A0C.A0o = true;
                A0C.A0w = true;
                C6XJ A02 = C6XJ.A02((Activity) this.A01, A0C.A00(), abstractC12990ll, TransparentModalActivity.class, "clips_camera");
                A02.A07();
                A02.A0C((Context) this.A02);
                i = 1626298824;
                break;
            case 1:
                A05 = C0f9.A05(996450363);
                C9GR.A07(((C50674MYs) this.A02).A00, 2131970003);
                Product product = (Product) this.A01;
                IK3 ik3 = (IK3) this.A03;
                AbstractC25651Mw.A00(ik3.A02).E4s(new C42247InX(product));
                IJ8 ij8 = ik3.A04;
                String str = product.A0H;
                String A0d = AbstractC37302Gc3.A0d(product);
                C14360o3.A0A(A0d);
                String str2 = this.A04;
                AbstractC167007dF.A1K(str, A0d);
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(ij8.A00, "instagram_shopping_product_see_less");
                if (A0f.isSampled()) {
                    AbstractC37300Gc1.A0i(A0f, AbstractC25228BEl.A13(str));
                    AbstractC37301Gc2.A17(A0f, A0d);
                    AbstractC37300Gc1.A0t(A0f, ij8.A02);
                    AbstractC37300Gc1.A0n(A0f, ij8.A01);
                    AbstractC25233BEq.A17(A0f, "prior_submodule", str2);
                    A0f.Cht();
                }
                i = -587921976;
                break;
            case 2:
                A05 = C0f9.A05(1683589325);
                C153936w2.A05((C153936w2) this.A02, PublicKeyCredentialControllerUtility.JSON_KEY_USER, "drafts_megaphone", "tap_learn_more");
                Activity activity = (Activity) this.A01;
                UserSession userSession = (UserSession) this.A03;
                String str3 = this.A04;
                EnumC53164NfJ enumC53164NfJ = EnumC53164NfJ.A03;
                AbstractC167027dH.A12(activity, userSession, str3);
                AbstractC54238NyJ.A00(activity, userSession, enumC53164NfJ, str3, null);
                i = -1369805572;
                break;
            default:
                A05 = C0f9.A05(1420223093);
                FragmentActivity fragmentActivity = (FragmentActivity) this.A01;
                AbstractC59962oe abstractC59962oe = (AbstractC59962oe) this.A02;
                UserSession userSession2 = (UserSession) this.A03;
                String str4 = this.A04;
                C25621Ms A0c = AbstractC167017dG.A0c(userSession2);
                A0c.A0B("clips/restore_original_audio_attribution/");
                A0c.A9s("clips_media_id", str4);
                C1ON A0e = AbstractC25227BEk.A0e(A0c, C38871H9t.class, C41303IPs.class);
                C37484Gf2.A00(A0e, fragmentActivity, userSession2, 30);
                abstractC59962oe.schedule(A0e);
                i = -131463295;
                break;
        }
        C0f9.A0C(i, A05);
    }
}
