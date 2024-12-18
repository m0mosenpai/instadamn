package X;

import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;
import java.text.SimpleDateFormat;

/* loaded from: classes9.dex */
public final class P35 implements InterfaceC57949Pmv {
    public final /* synthetic */ LeadGenFormBaseQuestion A00;
    public final /* synthetic */ AbstractC50822Mcy A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    public P35(LeadGenFormBaseQuestion leadGenFormBaseQuestion, AbstractC50822Mcy abstractC50822Mcy, boolean z, boolean z2) {
        this.A01 = abstractC50822Mcy;
        this.A00 = leadGenFormBaseQuestion;
        this.A03 = z;
        this.A02 = z2;
    }

    @Override // X.InterfaceC57949Pmv
    public final C54543O7v getState(C54543O7v c54543O7v, CharSequence charSequence, boolean z) {
        String str;
        AbstractC167007dF.A1K(c54543O7v, charSequence);
        AbstractC50822Mcy abstractC50822Mcy = this.A01;
        if (!abstractC50822Mcy.A07 && z) {
            String A0D = abstractC50822Mcy.A0D(charSequence.toString());
            if (!C14360o3.A0K(abstractC50822Mcy.A03, A0D) && A0D.length() > 0) {
                LeadGenFormBaseQuestion leadGenFormBaseQuestion = this.A00;
                InterfaceC57958Pn4 interfaceC57958Pn4 = abstractC50822Mcy.A02;
                if (interfaceC57958Pn4 != null) {
                    interfaceC57958Pn4.Dxu(leadGenFormBaseQuestion);
                }
            }
            abstractC50822Mcy.setLastKnownInput(A0D);
        }
        if (abstractC50822Mcy.A04 && this.A00.A0I) {
            if (!AbstractC001900j.A0T(charSequence)) {
                if (!z) {
                    str = "removable";
                    c54543O7v.A01 = str;
                }
            }
            return c54543O7v;
        }
        if (this.A03 && !z) {
            return c54543O7v;
        }
        OV6 ov6 = OV6.A00;
        LeadGenFormBaseQuestion leadGenFormBaseQuestion2 = this.A00;
        if (!ov6.A00(null, leadGenFormBaseQuestion2, C16930sl.A00, this.A02, false)) {
            c54543O7v.A01 = "error";
            SimpleDateFormat simpleDateFormat = C55205OeH.A04;
            c54543O7v.A00 = C55205OeH.A03(AbstractC166997dE.A0L(abstractC50822Mcy), leadGenFormBaseQuestion2.A03, leadGenFormBaseQuestion2.A05);
            return c54543O7v;
        }
        if (AbstractC001900j.A0B(charSequence).length() > 0) {
            str = "confirmed";
            c54543O7v.A01 = str;
        }
        return c54543O7v;
    }
}
