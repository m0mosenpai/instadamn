package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.modal.ModalActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;

/* loaded from: classes10.dex */
public abstract class S4G {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        String A0e = AbstractC31177DnL.A0e(c6fw, 0);
        InterfaceC103384lE A0I = AbstractC31175DnJ.A0I(c6fw, 1);
        InterfaceC103384lE interfaceC103384lE = ((C1344465q) c6fw.A00()).A00;
        SimpleWebViewConfig simpleWebViewConfig = new SimpleWebViewConfig(A0e, (String) null, (String) null, (String) null, false, false, false, false, false, true, false, true, false, false, false, false);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        AbstractC12990ll A0J = AbstractC31175DnJ.A0J(c6fq);
        C14360o3.A0B(A0J, 0);
        C64487TFx c64487TFx = (C64487TFx) A0J.A01(C64487TFx.class, new C50150MDd(A0J, 23));
        c64487TFx.A00 = new TEi(c6fq, A0I);
        c64487TFx.A01 = new C64448TEk(c64487TFx, c6fq, interfaceC103384lE);
        AbstractC25228BEl.A1G(A04, AbstractC31178DnM.A06(MSV.A00(2), simpleWebViewConfig), A0J, ModalActivity.class, AbstractC111324zv.A00(2838));
        return null;
    }
}
