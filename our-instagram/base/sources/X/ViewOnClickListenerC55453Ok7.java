package X;

import android.view.View;
import com.instagram.api.schemas.ShoppingBrandWithProducts;
import java.util.List;

/* renamed from: X.Ok7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnClickListenerC55453Ok7 implements View.OnClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public ViewOnClickListenerC55453Ok7(Object obj, Object obj2, String str, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj2;
        this.A03 = obj;
        this.A04 = str;
        this.A01 = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        int i2;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(-686220948);
                if (this.A02 == C05F.A00) {
                    V16.A0D((V16) this.A03, AbstractC43591JPw.A00(335), this.A04, AnonymousClass001.A0O("messaging_ads_multi_suggestion_post_card_", this.A01), null);
                } else {
                    V16.A0C((V16) this.A03, null, AbstractC43591JPw.A00(145), AbstractC43591JPw.A00(451), "messaging_ads_multi_suggestion_post_selector");
                }
                i = 443974452;
                break;
            case 1:
                A05 = C0f9.A05(-488445070);
                ((InterfaceC37216GaR) this.A02).DAw((C47P) this.A03, this.A04, this.A01);
                i = -689743048;
                break;
            case 2:
                A05 = A00(this, 527962089);
                i = -515853076;
                break;
            case 3:
                A05 = C0f9.A05(-1814080569);
                InterfaceC37216GaR interfaceC37216GaR = (InterfaceC37216GaR) this.A02;
                C47P c47p = (C47P) this.A03;
                Integer AvK = interfaceC37216GaR.AvK(c47p.CDj().getId());
                if (AvK != null) {
                    i2 = AvK.intValue();
                } else {
                    i2 = this.A01;
                }
                interfaceC37216GaR.Dxe(c47p, this.A04, i2);
                i = 1520467018;
                break;
            case 4:
                A05 = C0f9.A05(-1129146894);
                ((C23031Ai) this.A03).A0c(this.A01 + 1);
                OFZ ofz = (OFZ) this.A02;
                InterfaceC64002vL interfaceC64002vL = ofz.A08;
                String str = this.A04;
                int i3 = ofz.A00;
                List list = ofz.A0B;
                C51375Mma c51375Mma = ofz.A07;
                String str2 = ofz.A0A;
                interfaceC64002vL.De7(c51375Mma, ofz.A04, ofz.A09, str, str2, list, i3, AbstractC167007dF.A1W(ofz.A06));
                i = 1972326452;
                break;
            case 5:
                A05 = C0f9.A05(-1887413867);
                ((InterfaceC65022x0) this.A02).DSs((ShoppingBrandWithProducts) this.A03, this.A04, this.A01);
                i = 1819992843;
                break;
            case 6:
                A05 = A00(this, 1232303299);
                i = -867578199;
                break;
            case 7:
                A05 = A00(this, 24521966);
                i = -2059340078;
                break;
            case 8:
                A05 = A00(this, -785086011);
                i = 1592326319;
                break;
            default:
                A05 = A00(this, -1521863877);
                i = 1595732382;
                break;
        }
        C0f9.A0C(i, A05);
    }

    public static int A00(ViewOnClickListenerC55453Ok7 viewOnClickListenerC55453Ok7, int i) {
        int A05 = C0f9.A05(i);
        ((InterfaceC37216GaR) viewOnClickListenerC55453Ok7.A02).Dxe((C47P) viewOnClickListenerC55453Ok7.A03, viewOnClickListenerC55453Ok7.A04, viewOnClickListenerC55453Ok7.A01);
        return A05;
    }
}
