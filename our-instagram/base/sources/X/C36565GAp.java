package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;

/* renamed from: X.GAp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36565GAp implements GY1 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C36565GAp(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // X.GY1
    public final void CIz(FragmentActivity fragmentActivity) {
        Fragment c32316ELf;
        int i;
        String str;
        C140966Yy A0N;
        Fragment c32288EKb;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(fragmentActivity, 0);
                C193328hC A0H = AbstractC31171DnF.A0H(fragmentActivity);
                A0H.A09(2131972462);
                AbstractC31176DnK.A17(new DialogInterfaceOnClickListenerC35450Fk7(20, fragmentActivity, this.A02, this.A01), A0H, 2131972459);
                return;
            case 1:
                C14360o3.A0B(fragmentActivity, 0);
                C140966Yy A0r = AbstractC25225BEi.A0r(fragmentActivity, ((FOE) this.A02).A02);
                A0r.A0D((Fragment) this.A01);
                A0r.A04();
                return;
            case 2:
                C14360o3.A0B(fragmentActivity, 0);
                C14240no c14240no = new C14240no(fragmentActivity.getSupportFragmentManager());
                if (!C35264Fgy.A05() && AbstractC53242c7.A0L(fragmentActivity, R.attr.nuxAllowSignUpFlow, true)) {
                    Bundle bundle = (Bundle) this.A01;
                    AbstractC31172DnG.A1A();
                    c32316ELf = new C32288EKb();
                    c32316ELf.setArguments(bundle);
                    C14360o3.A0C(c32316ELf, AbstractC43591JPw.A00(0));
                    i = R.id.layout_container_main;
                    str = "android.nux.FacebookLandingFragment";
                } else {
                    Bundle bundle2 = (Bundle) this.A01;
                    AbstractC31172DnG.A1A();
                    c32316ELf = new C32316ELf();
                    c32316ELf.setArguments(bundle2);
                    C14360o3.A0C(c32316ELf, AbstractC43591JPw.A00(0));
                    i = R.id.layout_container_main;
                    str = "android.nux.LoginLandingFragment";
                }
                c14240no.A0D(c32316ELf, str, i);
                c14240no.A00();
                return;
            case 3:
                C14360o3.A0B(fragmentActivity, 0);
                AbstractC31172DnG.A1A();
                Bundle bundle3 = (Bundle) this.A01;
                C32316ELf c32316ELf2 = new C32316ELf();
                c32316ELf2.setArguments(bundle3);
                AbstractC31177DnL.A16(c32316ELf2, fragmentActivity, (AbstractC12990ll) this.A02);
                return;
            default:
                C14360o3.A0B(fragmentActivity, 0);
                if (!FEC.A00.A00(fragmentActivity)) {
                    Bundle bundle4 = (Bundle) this.A01;
                    String A00 = AbstractC34269F9p.A00(bundle4);
                    AbstractC12990ll abstractC12990ll = (AbstractC12990ll) this.A02;
                    if (A00 != null) {
                        C140966Yy A0N2 = AbstractC31177DnL.A0N(fragmentActivity, abstractC12990ll);
                        AbstractC31173DnH.A1B(bundle4);
                        AbstractC31175DnJ.A0t(bundle4, new EKM(), A0N2);
                        return;
                    }
                    if (AbstractC35090Fd1.A02(abstractC12990ll)) {
                        Integer num = C35154Few.A00().A05;
                        Integer num2 = C05F.A0C;
                        if (num != num2 && C35160Ff2.A02.A00().A01() != num2) {
                            A0N = AbstractC25225BEi.A0r(fragmentActivity, abstractC12990ll);
                            c32288EKb = FXP.A01(bundle4);
                        } else {
                            AbstractC31172DnG.A1A();
                            AbstractC31173DnH.A1B(bundle4);
                            AbstractC59962oe abstractC59962oe = new AbstractC59962oe();
                            abstractC59962oe.setArguments(bundle4);
                            AbstractC31179DnN.A0z(abstractC59962oe, fragmentActivity.getSupportFragmentManager());
                            return;
                        }
                    } else {
                        A0N = AbstractC31177DnL.A0N(fragmentActivity, abstractC12990ll);
                        c32288EKb = new C32288EKb();
                        c32288EKb.setArguments(bundle4);
                    }
                    A0N.A0D(c32288EKb);
                    A0N.A04();
                    return;
                }
                return;
        }
    }
}
