package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.reels.prompt.model.PromptStickerModel;
import java.util.LinkedHashMap;

/* renamed from: X.Ojf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnClickListenerC55430Ojf implements View.OnClickListener {
    public final /* synthetic */ C82G A00;
    public final /* synthetic */ C82H A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C41181vS A03;
    public final /* synthetic */ InterfaceC146936jV A04;
    public final /* synthetic */ InterfaceC146916jT A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    public ViewOnClickListenerC55430Ojf(C82G c82g, C82H c82h, UserSession userSession, C41181vS c41181vS, InterfaceC146936jV interfaceC146936jV, InterfaceC146916jT interfaceC146916jT, boolean z, boolean z2) {
        this.A02 = userSession;
        this.A00 = c82g;
        this.A03 = c41181vS;
        this.A07 = z;
        this.A01 = c82h;
        this.A06 = z2;
        this.A05 = interfaceC146916jT;
        this.A04 = interfaceC146936jV;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        LinkedHashMap linkedHashMap;
        PromptStickerModel A0K;
        int A05 = C0f9.A05(-1712220303);
        String A0p = AbstractC25231BEo.A0p();
        UserSession userSession = this.A02;
        C82G c82g = this.A00;
        String str = c82g.A00;
        String A0t = AbstractC166997dE.A0t(userSession);
        C41181vS c41181vS = this.A03;
        if (c41181vS != null && (A0K = c41181vS.A0K()) != null) {
            linkedHashMap = A0K.A06();
        } else {
            linkedHashMap = null;
        }
        AbstractC54107Nw5.A00(userSession, "primary_click", str, A0t, A0p, linkedHashMap);
        if (this.A07) {
            OQA.A01(userSession, "primary_click_cf_xposting", "share_later", A0p);
        }
        C82H c82h = this.A01;
        EnumC201098ur enumC201098ur = EnumC201098ur.ACCEPT;
        C82I A0H = MSW.A0H();
        A0H.A0A(Boolean.valueOf(this.A06));
        AbstractC201108us.A00(c82g, enumC201098ur, c82h, A0H, userSession);
        this.A05.Dlh(c41181vS, A0p);
        InterfaceC146936jV interfaceC146936jV = this.A04;
        if (interfaceC146936jV != null) {
            interfaceC146936jV.D6t();
        }
        C0f9.A0C(282582171, A05);
    }
}
