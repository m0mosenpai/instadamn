package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.user.model.User;

/* loaded from: classes7.dex */
public final class J2C implements InterfaceC64122vX {
    public final UserSession A00;
    public final InterfaceC60442pS A01;
    public final Context A02;

    @Override // X.InterfaceC64122vX
    public final /* bridge */ /* synthetic */ Object AGl(C82383m1 c82383m1, Object obj, Object obj2, String str) {
        Long l;
        C45127Jxw c45127Jxw = (C45127Jxw) obj;
        AbstractC167017dG.A1O(c45127Jxw, c82383m1);
        C38321qM c38321qM = (C38321qM) c45127Jxw.A00;
        String str2 = c45127Jxw.A01;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(this.A01, this.A00), "instagram_organic_vpvd_imp");
        if (A0f.isSampled()) {
            A0f.A8I("max_duration_ms", Double.valueOf(c82383m1.A04));
            A0f.A8I("sum_duration_ms", Double.valueOf(c82383m1.A05));
            A0f.A8I("legacy_duration_ms", Double.valueOf(c82383m1.A02));
            AbstractC37300Gc1.A0o(A0f, c38321qM.CAR());
            AbstractC37302Gc3.A0x(A0f, c38321qM);
            A0f.AAP("m_t", String.valueOf(Integer.valueOf(c38321qM.BRp().A00)));
            AbstractC25225BEi.A1N(A0f, str);
            AbstractC37300Gc1.A0h(A0f, AbstractC37302Gc3.A0W(c38321qM.A38()));
            A0f.AAP("media_type", c38321qM.BRp().name());
            User A14 = AbstractC25226BEj.A14(c38321qM);
            if (A14 != null) {
                l = AbstractC25231BEo.A0k(A14);
            } else {
                l = null;
            }
            AbstractC37300Gc1.A0k(A0f, l);
            A0f.AAP(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str2);
            A0f.AAP("canonical_nav_chain", AbstractC25041Ki.A00);
            A0f.AAP("canonical_nav_chain_previous", C3NN.A00);
            A0f.A9K("canonical_nav_chain_delta_ms_since_last_update", Long.valueOf(C3NP.A01.now() - C3NP.A00));
            AbstractC25234BEr.A11(A0f, "device_aspect_ratio_category", AbstractC82663mU.A00);
            A0f.Cht();
        }
        return null;
    }

    @Override // X.InterfaceC64122vX
    public final /* bridge */ /* synthetic */ C19280xC AMA(Object obj) {
        C19280xC c19280xC = (C19280xC) obj;
        C14360o3.A0B(c19280xC, 0);
        return c19280xC;
    }

    public J2C(Context context, UserSession userSession, InterfaceC60442pS interfaceC60442pS) {
        this.A02 = context;
        this.A01 = interfaceC60442pS;
        this.A00 = userSession;
    }
}
