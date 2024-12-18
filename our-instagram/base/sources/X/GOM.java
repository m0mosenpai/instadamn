package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.igds.components.headline.IgdsHeadline;

/* loaded from: classes6.dex */
public final class GOM implements Runnable {
    public final /* synthetic */ EDU A00;
    public final /* synthetic */ EJU A01;

    public GOM(EDU edu, EJU eju) {
        this.A00 = edu;
        this.A01 = eju;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        EDU edu = this.A00;
        EJU eju = this.A01;
        eju.A00 = edu.A00();
        if (!eju.requireArguments().getBoolean("skip_landing_screen") && !edu.A08 && !edu.A07) {
            ViewStub viewStub = eju.A02;
            if (viewStub != null) {
                if (viewStub.getParent() != null) {
                    ViewStub viewStub2 = eju.A02;
                    if (viewStub2 != null) {
                        View inflate = viewStub2.inflate();
                        if (inflate != null) {
                            inflate.setVisibility(0);
                            IgdsHeadline A0Q = AbstractC31179DnN.A0Q(inflate, R.id.two_factor_headline);
                            A0Q.setImageResource(R.drawable.ig_illustrations_illo_2fac_off_refresh);
                            A0Q.setHeadline(2131975916);
                            A0Q.setBody(2131975915);
                            A0Q.EPC((View.OnClickListener) eju.A05.getValue(), 2131975917);
                            ((C64P) inflate.requireViewById(R.id.start_bottom_button)).setPrimaryActionOnClickListener((View.OnClickListener) eju.A07.getValue());
                            return;
                        }
                        return;
                    }
                } else {
                    return;
                }
            }
            C14360o3.A0F("successViewStub");
            throw C00O.createAndThrow();
        }
        if (!eju.isResumed() || (bundle = eju.A00) == null) {
            return;
        }
        AbstractC35179FfW.A03();
        bundle.putBoolean("direct_launch_backup_codes", eju.requireArguments().getBoolean("direct_launch_backup_codes"));
        C33230ElN c33230ElN = new C33230ElN();
        C140966Yy A0c = AbstractC25231BEo.A0c(AbstractC31173DnH.A0J(bundle, c33230ElN, eju), eju.A06);
        A0c.A0D(c33230ElN);
        A0c.A0A = AbstractC31178DnM.A0Z();
        A0c.A04();
    }
}
