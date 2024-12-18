package X;

import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.browser.lite.extensions.whatsapp.CTWABrowserCTAExtensionModel;

/* renamed from: X.QEq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC58880QEq extends AbstractC63223SfY implements BEG, InterfaceC65639Tq2, InterfaceC65638Tq1 {
    public LinearLayout A00;
    public boolean A01 = true;
    public boolean A02;

    public int A00() {
        if (this instanceof QEU) {
            return R.layout.ctwa_iaw_cta_on_ig_view;
        }
        return R.layout.ig_call_extension_view;
    }

    public final void A02() {
        LinearLayout linearLayout = this.A00;
        if (linearLayout != null) {
            if (this.A01) {
                linearLayout.setVisibility(8);
                TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, linearLayout.getHeight());
                translateAnimation.setDuration(500L);
                AbstractC58320PtC.A1H(translateAnimation);
                linearLayout.startAnimation(translateAnimation);
            }
            this.A01 = false;
        }
    }

    public void A03(View view, InterfaceC172717mh interfaceC172717mh) {
        C64P c64p;
        String str;
        ViewOnClickListenerC63509Soc viewOnClickListenerC63509Soc;
        if (this instanceof QEU) {
            QEU qeu = (QEU) this;
            CTWABrowserCTAExtensionModel cTWABrowserCTAExtensionModel = qeu.A00;
            if (cTWABrowserCTAExtensionModel.A00 == null) {
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(qeu.A01, "ctmessaging_web_to_wa_cta_error");
                if (A0f.isSampled()) {
                    String str2 = cTWABrowserCTAExtensionModel.A01;
                    if (str2 == null) {
                        str2 = "";
                    }
                    A0f.AAP("ad_id", str2);
                    A0f.AAP(MSV.A00(202), "URL is empty");
                    A0f.Cht();
                    return;
                }
                return;
            }
            c64p = (C64P) view.findViewById(R.id.bottom_button);
            FragmentActivity activity = interfaceC172717mh.getActivity();
            if (activity != null) {
                str = activity.getString(2131963718);
            } else {
                str = null;
            }
            viewOnClickListenerC63509Soc = new ViewOnClickListenerC63509Soc(9, qeu, view);
        } else {
            c64p = (C64P) view.findViewById(R.id.bottom_button);
            FragmentActivity activity2 = interfaceC172717mh.getActivity();
            if (activity2 != null) {
                str = activity2.getString(2131954502);
            } else {
                str = null;
            }
            viewOnClickListenerC63509Soc = new ViewOnClickListenerC63509Soc(8, this, interfaceC172717mh);
        }
        c64p.setPrimaryAction(str, viewOnClickListenerC63509Soc);
    }

    public int A01() {
        return R.id.call_extension_iab_stub;
    }
}
