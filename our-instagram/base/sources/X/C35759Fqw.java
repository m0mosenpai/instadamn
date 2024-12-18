package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.nux.activity.SignedOutFragmentActivity;
import com.instagram.nux.fragment.OneTapLoginLandingFragment;

/* renamed from: X.Fqw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35759Fqw implements InterfaceC09670ek, C07W {
    public final int A00;
    public final Object A01;

    public C35759Fqw(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, X.EtZ] */
    @Override // X.InterfaceC09670ek
    public final void DoQ(C07R c07r, C07X c07x) {
        AbstractC59962oe oneTapLoginLandingFragment;
        String str;
        String str2;
        Fragment abstractC59962oe;
        switch (this.A00) {
            case 0:
                if (c07r != C07R.ON_RESUME) {
                    return;
                }
                FJN fjn = (FJN) this.A01;
                SignedOutFragmentActivity signedOutFragmentActivity = fjn.A01;
                signedOutFragmentActivity.getLifecycle().A0A(this);
                if (signedOutFragmentActivity.A08) {
                    SignedOutFragmentActivity.A00(signedOutFragmentActivity);
                }
                Bundle bundle = fjn.A00;
                if (AbstractC31177DnL.A0I(signedOutFragmentActivity) == null) {
                    C14120nc.A00().ATO(new C32658EZh(bundle, signedOutFragmentActivity));
                }
                if (!bundle.getBoolean("allow_confirm_email")) {
                    return;
                }
                String A0j = AbstractC31173DnH.A0j(bundle, "confirm_email_nonce");
                String A0j2 = AbstractC31173DnH.A0j(bundle, "confirm_email_encoded_email");
                C07270a1 c07270a1 = signedOutFragmentActivity.A01;
                ?? obj = new Object();
                obj.A01 = signedOutFragmentActivity;
                obj.A04 = A0j;
                obj.A03 = A0j2;
                obj.A00 = AbstractC167007dF.A0J();
                obj.A02 = c07270a1;
                obj.A00();
                return;
            case 1:
                if (c07r != C07R.ON_RESUME) {
                    return;
                }
                GOQ goq = (GOQ) this.A01;
                C32658EZh c32658EZh = goq.A00;
                SignedOutFragmentActivity signedOutFragmentActivity2 = c32658EZh.A01;
                signedOutFragmentActivity2.getLifecycle().A0A(this);
                Bundle bundle2 = c32658EZh.A00;
                boolean z = goq.A01;
                if (signedOutFragmentActivity2.getSupportFragmentManager().A0O(R.id.layout_container_main) != null) {
                    return;
                }
                C14240no c14240no = new C14240no(signedOutFragmentActivity2.getSupportFragmentManager());
                Bundle A0A = AbstractC31173DnH.A0A(signedOutFragmentActivity2);
                if (A0A != null && A0A.containsKey("caa_registration_redirection_to_native")) {
                    if (!AbstractC35090Fd1.A02(signedOutFragmentActivity2.A01)) {
                        Integer num = C35154Few.A00().A05;
                        Integer num2 = C05F.A0C;
                        str2 = "reg_gdpr_entrance";
                        if (num != num2 && C35160Ff2.A00().A01() != num2) {
                            AbstractC31171DnF.A12(bundle2, "IgSessionManager.LOGGED_OUT_TOKEN");
                            AbstractC31175DnJ.A0R();
                            AbstractC31171DnF.A12(bundle2, "IgSessionManager.LOGGED_OUT_TOKEN");
                            abstractC59962oe = new EKF();
                        } else {
                            AbstractC31172DnG.A1A();
                            AbstractC31173DnH.A1B(bundle2);
                            abstractC59962oe = new AbstractC59962oe();
                        }
                        abstractC59962oe.setArguments(bundle2);
                        c14240no.A0A(abstractC59962oe, R.id.layout_container_main);
                        c14240no.A0I(str2);
                        c14240no.A00();
                        return;
                    }
                } else if (!signedOutFragmentActivity2.A0C) {
                    if (signedOutFragmentActivity2.A08) {
                        AbstractC31172DnG.A1A();
                        oneTapLoginLandingFragment = new EMI();
                        oneTapLoginLandingFragment.setArguments(bundle2);
                        signedOutFragmentActivity2.A00 = oneTapLoginLandingFragment;
                        str = "android.nux.AymhLoginLandingFragment";
                    } else if (!AbstractC25226BEj.A1b(C83743oJ.A01(signedOutFragmentActivity2.A01).A06(signedOutFragmentActivity2.A01)) && z && signedOutFragmentActivity2.A02.A01(AbstractC31173DnH.A0A(signedOutFragmentActivity2)).isEmpty()) {
                        if (!C35264Fgy.A05() && AbstractC53242c7.A0L(signedOutFragmentActivity2, R.attr.nuxAllowSignUpFlow, true)) {
                            AbstractC31172DnG.A1A();
                            oneTapLoginLandingFragment = new C32288EKb();
                            oneTapLoginLandingFragment.setArguments(bundle2);
                            signedOutFragmentActivity2.A00 = oneTapLoginLandingFragment;
                            str = "android.nux.FacebookLandingFragment";
                        } else {
                            AbstractC31172DnG.A1A();
                            oneTapLoginLandingFragment = new C32316ELf();
                            oneTapLoginLandingFragment.setArguments(bundle2);
                            signedOutFragmentActivity2.A00 = oneTapLoginLandingFragment;
                            str = "android.nux.LoginLandingFragment";
                        }
                    } else {
                        AbstractC31172DnG.A1A();
                        oneTapLoginLandingFragment = new OneTapLoginLandingFragment();
                        oneTapLoginLandingFragment.setArguments(bundle2);
                        signedOutFragmentActivity2.A00 = oneTapLoginLandingFragment;
                        str = "android.nux.OneTapLoginLandingFragment";
                    }
                    c14240no.A0D(oneTapLoginLandingFragment, str, R.id.layout_container_main);
                    c14240no.A00();
                    return;
                }
                if (C36700GFv.A01()) {
                    AbstractC31172DnG.A1A();
                    AbstractC31173DnH.A1B(bundle2);
                    Fragment abstractC59962oe2 = new AbstractC59962oe();
                    abstractC59962oe2.setArguments(bundle2);
                    c14240no.A0A(abstractC59962oe2, R.id.layout_container_main);
                    str2 = "reg_gdpr_entrance";
                    c14240no.A0I(str2);
                    c14240no.A00();
                    return;
                }
                ELk A01 = FXP.A01(bundle2);
                signedOutFragmentActivity2.A00 = A01;
                c14240no.A0D(A01, "android.secondaryaccount.CreateUsernameFragment", R.id.layout_container_main);
                c14240no.A00();
                return;
            default:
                C14360o3.A0B(c07r, 1);
                C35038FcB c35038FcB = (C35038FcB) this.A01;
                c35038FcB.A01.markerAnnotate(383649364, c35038FcB.A00, "view_lifecycle", c07r.A00().toString());
                return;
        }
    }
}
