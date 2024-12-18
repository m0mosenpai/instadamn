package X;

import android.content.Context;
import android.view.View;
import com.instagram.simplewebview.SimpleWebViewActivity;

/* renamed from: X.Eli, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33248Eli extends AnonymousClass772 {
    public final Context A00;
    public final AbstractC12990ll A01;
    public final FHZ A02;
    public final String A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33248Eli(Context context, AbstractC12990ll abstractC12990ll, FHZ fhz, String str, int i) {
        super(Integer.valueOf(i));
        C14360o3.A0B(abstractC12990ll, 2);
        this.A00 = context;
        this.A01 = abstractC12990ll;
        this.A03 = str;
        this.A02 = fhz;
    }

    @Override // X.AnonymousClass772, android.text.style.ClickableSpan
    public final void onClick(View view) {
        FHZ fhz = this.A02;
        if (fhz != null) {
            C34997FbU c34997FbU = fhz.A00.A08;
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c34997FbU.A00, "instagram_waverly_ig_event");
            AbstractC31171DnF.A1B(A0f, "tap_component");
            AbstractC31171DnF.A1G(A0f, c34997FbU.A01);
            A0f.AAP("component", "learn_more");
            AbstractC31171DnF.A1A(A0f, "ig_message_settings");
            A0f.AAP("message_controls_settings_version", "v2");
            A0f.Cht();
        }
        Context context = this.A00;
        String A0p = AbstractC166997dE.A0p(context, 2131965052);
        C35133Fea.A01(context, this.A01, SimpleWebViewActivity.A02, AbstractC31171DnF.A0R(this.A03), A0p);
    }
}
