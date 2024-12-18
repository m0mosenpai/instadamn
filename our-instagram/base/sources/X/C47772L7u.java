package X;

import android.app.Activity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.util.HashMap;

/* renamed from: X.L7u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47772L7u {
    public boolean A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final C47417Kx8 A05;

    public C47772L7u(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C47417Kx8 c47417Kx8) {
        C14360o3.A0B(interfaceC11380iw, 2);
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A05 = c47417Kx8;
        this.A03 = C1XM.A00(new MHI(this, 25));
        this.A04 = C1XM.A00(new MHI(this, 26));
    }

    public final void A00(Activity activity, String str) {
        UserSession userSession = this.A02;
        HashMap A02 = AbstractC06930Yk.A02(AbstractC25229BEm.A1b(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str, AbstractC166987dD.A1L("merchant_igid", userSession.userId)));
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(this.A01, userSession), AbstractC111324zv.A00(5344));
        if (A0f.isSampled()) {
            AbstractC31175DnJ.A15(A0f, "shops_product_picker_entrypoint_tap");
        }
        this.A04.getValue();
        C72743Nv A022 = W6d.A02(new IgBloksScreenConfig(userSession), C66277U6x.A01("com.bloks.www.minishops.ig.productpicker.content", A02));
        InterfaceC09390do interfaceC09390do = this.A03;
        ((C189448aO) interfaceC09390do.getValue()).A0T = new C49615Lw8(A022, 7);
        this.A05.A00.A19();
        AbstractC31173DnH.A0w(activity, A022, (C189448aO) interfaceC09390do.getValue());
    }
}
