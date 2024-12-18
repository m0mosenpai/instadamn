package X;

import android.content.Context;
import android.view.View;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;
import java.util.ArrayList;

/* renamed from: X.Han, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39403Han extends AnonymousClass522 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39403Han(Context context, HD9 hd9, int i, int i2) {
        super(Integer.valueOf(i));
        this.A00 = i2;
        if (1 - i2 != 0) {
            this.A02 = hd9;
            this.A01 = context;
        } else {
            this.A01 = context;
            this.A02 = hd9;
        }
    }

    @Override // X.AnonymousClass522, android.text.style.ClickableSpan
    public final void onClick(View view) {
        switch (this.A00) {
            case 0:
                N4D n4d = (N4D) this.A02;
                InterfaceC09390do interfaceC09390do = n4d.A01;
                AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
                ArrayList arrayList = (ArrayList) this.A01;
                String str = ((C8Y4) n4d.A00.getValue()).A00;
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31172DnG.A0Q(n4d, A0o, 0), MSV.A00(1313));
                A0f.AAP("event", "instagram_bc_ad_ppl_boost_eligibility_error_surface_guidelines");
                A0f.AAk("error_codes", arrayList);
                A0f.AAP("media_id", null);
                A0f.AAP("media_type", str);
                A0f.Cht();
                new C63397SjR(n4d.requireContext(), AbstractC166987dD.A0r(interfaceC09390do), C2Fb.A0c, "https://help.instagram.com/831260938290279", false).A0A();
                return;
            case 1:
                C14360o3.A0B(view, 0);
                SimpleWebViewActivity.A02.A02((Context) this.A01, AbstractC166987dD.A0o(((HD9) this.A02).A0K), new SimpleWebViewConfig(AbstractC111324zv.A00(2462), (String) null, view.getResources().getString(2131970013), (String) null, false, false, false, false, false, true, false, true, false, false, false, false));
                return;
            case 2:
                C14360o3.A0B(view, 0);
                HD9 hd9 = (HD9) this.A02;
                C41762Ied c41762Ied = hd9.A03;
                if (c41762Ied == null) {
                    C14360o3.A0F("logger");
                    throw C00O.createAndThrow();
                }
                C41762Ied.A05(C41762Ied.A00(c41762Ied, "onboarding_guidelines_clicked"), c41762Ied);
                String A0q = AbstractC166997dE.A0q(view.getResources(), 2131964383);
                C35133Fea c35133Fea = SimpleWebViewActivity.A02;
                Context context = (Context) this.A01;
                C14360o3.A0A(context);
                c35133Fea.A02(context, AbstractC166987dD.A0o(hd9.A0K), new SimpleWebViewConfig("https://help.instagram.com/1627591223954487", (String) null, A0q, (String) null, false, false, false, false, false, true, false, true, false, false, false, false));
                return;
            default:
                ((IIN) this.A02).A03.A00((C39344HZj) this.A01);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39403Han(IIN iin, C39344HZj c39344HZj, int i) {
        super(Integer.valueOf(i));
        this.A00 = 3;
        this.A02 = iin;
        this.A01 = c39344HZj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39403Han(N4D n4d, ArrayList arrayList, int i) {
        super(Integer.valueOf(i));
        this.A00 = 0;
        this.A02 = n4d;
        this.A01 = arrayList;
    }
}
