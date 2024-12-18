package X;

import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.igds.components.button.IgdsButton;
import java.util.List;

/* renamed from: X.MiT, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51124MiT extends C2UU {
    public final List A00;
    public final InterfaceC16660sJ A01;

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C51318Mlf(AbstractC25226BEj.A0R(AbstractC25231BEo.A0O(viewGroup), viewGroup, R.layout.lead_ads_multi_submit_thank_you_row, false));
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        String str;
        C51318Mlf c51318Mlf = (C51318Mlf) c3oo;
        C14360o3.A0B(c51318Mlf, 0);
        List list = this.A00;
        P2Q p2q = (P2Q) list.get(i);
        c51318Mlf.A00.setText(p2q.A04);
        IgdsButton igdsButton = c51318Mlf.A03;
        OUJ ouj = ((P2Q) list.get(i)).A00;
        if (ouj == null || (str = ouj.A02) == null) {
            str = "";
        }
        igdsButton.setText(str);
        ViewOnClickListenerC55458OkC.A01(igdsButton, this, i, 5);
        ImageUrl imageUrl = p2q.A01;
        if (imageUrl != null) {
            c51318Mlf.A02.setUrl(imageUrl, AbstractC31171DnF.A0D("lead_ads_multi_submit_thank_you_adapter"));
        }
        c51318Mlf.A01.setVisibility(MSY.A01(i));
    }

    public C51124MiT(InterfaceC16660sJ interfaceC16660sJ, List list) {
        this.A00 = list;
        this.A01 = interfaceC16660sJ;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-158679080);
        int size = this.A00.size();
        C0f9.A0A(343340833, A03);
        return size;
    }
}
