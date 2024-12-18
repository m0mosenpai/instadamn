package X;

import android.content.Context;
import android.view.View;
import com.instagram.api.schemas.ClipsTemplateBrowserV2Type;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import java.util.Map;

/* loaded from: classes9.dex */
public final class P3P implements InterfaceC58152PqH {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ ClipsTemplateBrowserV2Type A01;
    public final /* synthetic */ C120985dq A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ IgSimpleImageView A04;
    public final /* synthetic */ C38321qM A05;
    public final /* synthetic */ InterfaceC60442pS A06;
    public final /* synthetic */ EnumC77213d7 A07;
    public final /* synthetic */ C50983Mfq A08;
    public final /* synthetic */ Gt6 A09;
    public final /* synthetic */ C50999Mg6 A0A;
    public final /* synthetic */ Map A0B;

    @Override // X.InterfaceC58152PqH
    public final void onDismiss() {
    }

    @Override // X.InterfaceC58152PqH
    public final void onShow() {
    }

    @Override // X.InterfaceC58152PqH
    public final /* synthetic */ void onTextClick(View view) {
    }

    public P3P(Context context, ClipsTemplateBrowserV2Type clipsTemplateBrowserV2Type, C120985dq c120985dq, UserSession userSession, IgSimpleImageView igSimpleImageView, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, EnumC77213d7 enumC77213d7, C50983Mfq c50983Mfq, Gt6 gt6, C50999Mg6 c50999Mg6, Map map) {
        this.A07 = enumC77213d7;
        this.A01 = clipsTemplateBrowserV2Type;
        this.A08 = c50983Mfq;
        this.A02 = c120985dq;
        this.A05 = c38321qM;
        this.A0A = c50999Mg6;
        this.A04 = igSimpleImageView;
        this.A00 = context;
        this.A03 = userSession;
        this.A06 = interfaceC60442pS;
        this.A0B = map;
        this.A09 = gt6;
    }

    @Override // X.InterfaceC58152PqH
    public final void onButtonClick(View view) {
        C50983Mfq c50983Mfq;
        EnumC77213d7 enumC77213d7 = this.A07;
        EnumC77213d7 enumC77213d72 = EnumC77213d7.A04;
        if (enumC77213d7 == enumC77213d72) {
            enumC77213d72 = EnumC77213d7.A03;
        }
        ClipsTemplateBrowserV2Type clipsTemplateBrowserV2Type = this.A01;
        if (clipsTemplateBrowserV2Type == ClipsTemplateBrowserV2Type.A04) {
            C50983Mfq c50983Mfq2 = this.A08;
            if (c50983Mfq2 != null) {
                c50983Mfq2.A00(this.A02, enumC77213d72);
            }
        } else if (clipsTemplateBrowserV2Type == ClipsTemplateBrowserV2Type.A05 && (c50983Mfq = this.A08) != null) {
            c50983Mfq.A01(this.A05);
        }
        C50999Mg6 c50999Mg6 = this.A0A;
        C50999Mg6.A00(this.A00, this.A02, this.A03, this.A05, this.A06, enumC77213d72, this.A09, c50999Mg6, this.A0B);
    }
}
