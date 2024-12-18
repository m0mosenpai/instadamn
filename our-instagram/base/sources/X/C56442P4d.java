package X;

import android.content.Context;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;
import com.instagram.leadgen.core.ui.LeadGenFormStoreLocatorView;
import java.text.SimpleDateFormat;
import java.util.List;

/* renamed from: X.P4d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56442P4d implements InterfaceC57957Pn3 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C56442P4d(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = obj3;
        this.A02 = obj2;
    }

    @Override // X.InterfaceC57957Pn3
    public final void Cwq(LeadGenFormBaseQuestion leadGenFormBaseQuestion, String str) {
        String str2;
        String str3;
        Object obj;
        switch (this.A00) {
            case 0:
                AbstractC167007dF.A1K(leadGenFormBaseQuestion, str);
                ((C54841OMk) this.A01).A05(leadGenFormBaseQuestion, str, false);
                NOR.A01((C51654Mrl) this.A02, (NOR) this.A03, str);
                return;
            case 1:
                NOM nom = (NOM) this.A03;
                C51654Mrl c51654Mrl = (C51654Mrl) this.A02;
                int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
                SimpleDateFormat simpleDateFormat = C55205OeH.A04;
                LeadGenFormStoreLocatorView leadGenFormStoreLocatorView = nom.A00;
                if (C55205OeH.A01.contains(leadGenFormStoreLocatorView.getCountryCode())) {
                    List list = ((LeadGenFormBaseQuestion) c51654Mrl.A09.get(0)).A0F;
                    if (list != null) {
                        obj = AbstractC001800i.A0O(list, 0);
                    } else {
                        obj = null;
                    }
                    boolean A0K = C14360o3.A0K(obj, "post_code");
                    Context context = leadGenFormStoreLocatorView.getContext();
                    int i2 = 2131964871;
                    if (A0K) {
                        i2 = 2131964870;
                    }
                    String A0u = AbstractC25227BEk.A0u(context, i2);
                    IgdsBottomButtonLayout igdsBottomButtonLayout = nom.A09;
                    if (igdsBottomButtonLayout != null) {
                        igdsBottomButtonLayout.setFooterText(A0u);
                    }
                } else {
                    IgdsBottomButtonLayout igdsBottomButtonLayout2 = nom.A09;
                    if (igdsBottomButtonLayout2 != null) {
                        igdsBottomButtonLayout2.setFooterText("");
                    }
                }
                if (str.length() > 0) {
                    str2 = AnonymousClass001.A0T(leadGenFormStoreLocatorView.getCountryCode(), str, ':');
                } else {
                    str2 = str;
                }
                C54841OMk c54841OMk = (C54841OMk) this.A01;
                List list2 = ((LeadGenFormBaseQuestion) c51654Mrl.A09.get(0)).A0F;
                if (list2 == null || (str3 = MSW.A14(list2, 0)) == null) {
                    str3 = "";
                }
                C14360o3.A0B(str2, 1);
                AbstractC52562NNi abstractC52562NNi = c54841OMk.A00;
                if (abstractC52562NNi.A00 != null) {
                    MSW.A0d(abstractC52562NNi).A0c.Egh(new UQE(str3, str2, 4));
                }
                leadGenFormStoreLocatorView.A00 = str;
                return;
            default:
                return;
        }
    }
}
