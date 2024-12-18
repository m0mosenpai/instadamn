package X;

import com.facebook.cameracore.ardelivery.xplat.modelmanager.versionfetcher.ARDRemoteModelVersionFetcher;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.G3e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36378G3e implements JH0 {
    public final /* synthetic */ InterfaceC11380iw A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C142846ck A02;
    public final /* synthetic */ InterfaceC163837Ux A03;
    public final /* synthetic */ InterfaceC83733oI A04;
    public final /* synthetic */ boolean A05;

    public C36378G3e(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C142846ck c142846ck, InterfaceC163837Ux interfaceC163837Ux, InterfaceC83733oI interfaceC83733oI, boolean z) {
        this.A05 = z;
        this.A02 = c142846ck;
        this.A04 = interfaceC83733oI;
        this.A03 = interfaceC163837Ux;
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
    }

    @Override // X.JH0
    public final void DCh(int i) {
        if (this.A05) {
            C142846ck c142846ck = this.A02;
            String A0c = AbstractC31171DnF.A0c(this.A04);
            String C7q = this.A03.C7q();
            int i2 = i;
            if (i != -1) {
                i2 = i / ARDRemoteModelVersionFetcher.REQUEST_CACHE_TTL_SECONDS;
            }
            String valueOf = String.valueOf(i2);
            C25531Mh A0I = AbstractC31172DnG.A0I(c142846ck);
            if (AbstractC25226BEj.A1Z(A0I)) {
                HashMap A1G = AbstractC166987dD.A1G();
                A1G.put("duration", valueOf);
                AbstractC31175DnJ.A1B(A0I, c142846ck);
                AbstractC31174DnI.A1I(A0I, "mute_messages_enabled");
                A0I.A0o("mute_message_option_text");
                A0I.A0p("mute_messages_options_dialog");
                AbstractC31175DnJ.A1C(A0I, AbstractC31179DnN.A0Z(A0I, "instagram", A0c, C7q), A1G);
            }
        }
        AbstractC31278Dp0.A02(this.A00, this.A01, AbstractC31171DnF.A0c(this.A04), i);
    }

    @Override // X.JH0
    public final void onCancel() {
        if (this.A05) {
            C142846ck c142846ck = this.A02;
            String A0c = AbstractC31171DnF.A0c(this.A04);
            String C7q = this.A03.C7q();
            C25531Mh A0I = AbstractC31172DnG.A0I(c142846ck);
            if (AbstractC25226BEj.A1Z(A0I)) {
                AbstractC31175DnJ.A1B(A0I, c142846ck);
                AbstractC31174DnI.A1I(A0I, "mute_messages_cancelled");
                A0I.A0o("mute_message_option_text");
                A0I.A0p("mute_messages_options_dialog");
                A0I.A0h(AbstractC31179DnN.A0Z(A0I, "instagram", A0c, C7q));
                A0I.Cht();
            }
        }
    }
}
