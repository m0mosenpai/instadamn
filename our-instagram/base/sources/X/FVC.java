package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class FVC {
    public static void A00(EnumC33492ErR enumC33492ErR, EnumC33486ErL enumC33486ErL, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, Map map, int i, int i2, boolean z) {
        InterfaceC02590Ai A0f;
        int i3;
        EnumC33471Er6 enumC33471Er6;
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        if (z) {
            A0f = AbstractC166987dD.A0f(A01, "ig_block_action");
            i3 = 196;
        } else {
            A0f = AbstractC166987dD.A0f(A01, "ig_unblock_action");
            i3 = 274;
        }
        C25531Mh A0A = AbstractC31171DnF.A0A(A0f, i3);
        ((AbstractC02600Aj) A0A).A00.A8p("action", Integer.valueOf(i));
        A0A.A0Q("target_user_id", AbstractC25228BEl.A13(str));
        if (i2 == 0) {
            enumC33471Er6 = EnumC33471Er6.INSTAGRAM;
        } else {
            enumC33471Er6 = EnumC33471Er6.FACEBOOK;
        }
        A0A.A0M(enumC33471Er6, "target_user_type");
        A0A.A0R(TraceFieldType.RequestID, str2);
        A0A.A0M(enumC33492ErR, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        A0A.A0M(enumC33486ErL, "surface");
        ((AbstractC02600Aj) A0A).A00.A9M("surface_data", map);
        A0A.Cht();
    }

    public static void A01(EnumC33492ErR enumC33492ErR, EnumC33486ErL enumC33486ErL, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, List list, Map map, int i) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "ig_bulk_block_action");
        AbstractC166997dE.A1N(A0f, "action", i);
        ArrayList A0q = AbstractC25230BEn.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC31177DnL.A1R(AbstractC166987dD.A1B(it), A0q);
        }
        A0f.AAk("target_user_id", A0q);
        A0f.AAP(TraceFieldType.RequestID, str);
        A0f.A8R(enumC33492ErR, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        A0f.A8R(enumC33486ErL, "surface");
        A0f.A9M("target_user_type", map);
        A0f.Cht();
    }
}
