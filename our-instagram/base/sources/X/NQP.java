package X;

import android.view.View;
import com.facebook.R;

/* loaded from: classes9.dex */
public final class NQP extends AbstractC38513GwY {
    public C64842wi A00;
    public C51341Mm2 A01;
    public final InterfaceC56392iX A02;
    public final View A03;
    public final InterfaceC11380iw A04;

    @Override // X.AbstractC38513GwY
    /* renamed from: A03, reason: merged with bridge method [inline-methods] */
    public final void A02(C52672NRt c52672NRt) {
        String str;
        String str2;
        C14360o3.A0B(c52672NRt, 0);
        InterfaceC11380iw interfaceC11380iw = this.A04;
        if (interfaceC11380iw != null) {
            String str3 = c52672NRt.A09.A00;
            InterfaceC56392iX interfaceC56392iX = this.A02;
            if (!interfaceC56392iX.CWW()) {
                int hashCode = str3.hashCode();
                if (hashCode != -1300165181) {
                    if (hashCode != -303268285) {
                        if (hashCode == 336609433) {
                            str2 = "audio_browser_condensed_megaphone_ig";
                        }
                        throw AbstractC167007dF.A0c("Unsupported template: ", str3);
                    }
                    str2 = "standard_megaphone_ig";
                } else {
                    str2 = "audio_browser_standard_megaphone_ig";
                }
                if (str3.equals(str2)) {
                    this.A01 = new C51341Mm2(interfaceC56392iX.getView());
                }
                throw AbstractC167007dF.A0c("Unsupported template: ", str3);
            }
            int hashCode2 = str3.hashCode();
            if (hashCode2 != -1300165181) {
                if (hashCode2 != -303268285) {
                    if (hashCode2 == 336609433) {
                        str = "audio_browser_condensed_megaphone_ig";
                    }
                    throw AbstractC167007dF.A0c("Unsupported template: ", str3);
                }
                str = "standard_megaphone_ig";
            } else {
                str = "audio_browser_standard_megaphone_ig";
            }
            if (str3.equals(str)) {
                P7P p7p = new P7P(interfaceC11380iw);
                C51341Mm2 c51341Mm2 = this.A01;
                if (c51341Mm2 != null) {
                    p7p.ADw(this.A00, c52672NRt, c51341Mm2);
                    return;
                }
                throw AbstractC166997dE.A0g();
            }
            throw AbstractC167007dF.A0c("Unsupported template: ", str3);
        }
    }

    public NQP(View view, InterfaceC11380iw interfaceC11380iw) {
        super(view);
        this.A03 = view;
        this.A04 = interfaceC11380iw;
        this.A02 = AbstractC166997dE.A0X(view, R.id.qp_megaphone_stub);
    }
}
