package X;

import androidx.fragment.app.FragmentActivity;
import com.facebookpay.offsite.models.message.MessageAvailabilityResponseId$Companion;
import com.instagram.ar.features.effectspage.models.EffectsPageModel;
import com.instagram.common.session.UserSession;
import com.instagram.feed.media.EffectPreviewIntf;
import instagram.features.clips.ar.features.effectspage.ui.EffectsPageFragment;

/* renamed from: X.Hzw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40638Hzw {
    public static final void A00(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, EffectPreviewIntf effectPreviewIntf, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb) {
        boolean A1V = AbstractC167007dF.A1V(effectPreviewIntf);
        String A0j = AbstractC167017dG.A0j();
        EnumC39652Hih enumC39652Hih = EnumC39652Hih.A0U;
        String id = effectPreviewIntf.getId();
        C14360o3.A0B(id, 0);
        AbstractC37670Gi3.A0L(enumC39652Hih, null, userSession, c38321qM, interfaceC60442pS, A0j, "null", null, AbstractC167027dH.A03(id), c75113Zb.getPosition());
        EffectsPageModel effectsPageModel = new EffectsPageModel(null, AbstractC41732Ie4.A00(effectPreviewIntf), null, null, null, null, AbstractC41732Ie4.A02(effectPreviewIntf), AbstractC41732Ie4.A03(effectPreviewIntf), effectPreviewIntf.getId(), null, "", effectPreviewIntf.getName(), "", null, AbstractC166997dE.A1Z(effectPreviewIntf.AdP().CfY(), A1V), !AbstractC167007dF.A1W(effectPreviewIntf.getFailureReason()), "SAVED".equals(effectPreviewIntf.getSaveStatus()), !MessageAvailabilityResponseId$Companion.NOT_SUPPORTED.equals(effectPreviewIntf.getSaveStatus()), A1V, A1V, A1V, false);
        String id2 = c38321qM.getId();
        EnumC223429tZ enumC223429tZ = EnumC223429tZ.FEED_ATTRIBUTION;
        AbstractC40465Hwu.A00(fragmentActivity, EffectsPageFragment.A00(enumC223429tZ, null, effectsPageModel, null, id2, A0j, null, null, null), null, enumC223429tZ, null, EnumC50631MWs.A0G, userSession, C05F.A00, interfaceC11380iw.getModuleName());
    }
}
