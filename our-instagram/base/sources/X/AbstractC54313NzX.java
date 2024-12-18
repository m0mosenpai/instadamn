package X;

import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedClientState;
import com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState;
import java.util.List;

/* renamed from: X.NzX, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54313NzX {
    public static final void A00(AbstractC59962oe abstractC59962oe, UserSession userSession, C47Z c47z, TaggingFeedMultiSelectState taggingFeedMultiSelectState, Long l, String str, String str2, String str3, List list, List list2) {
        ClipInfo clipInfo;
        C14360o3.A0B(userSession, 0);
        String moduleName = abstractC59962oe.getModuleName();
        Integer num = C05F.A01;
        EnumC39584Hdu enumC39584Hdu = EnumC39584Hdu.A04;
        String str4 = null;
        TaggingFeedMultiSelectState taggingFeedMultiSelectState2 = null;
        AbstractC167027dH.A0a(1, moduleName, num, enumC39584Hdu, str);
        C16930sl c16930sl = C16930sl.A00;
        ShoppingTaggingFeedClientState shoppingTaggingFeedClientState = new ShoppingTaggingFeedClientState(c16930sl, c16930sl, c16930sl, c16930sl, c16930sl, c16930sl, c16930sl);
        shoppingTaggingFeedClientState.A00 = AbstractC16960so.A1O(str2);
        if (taggingFeedMultiSelectState != null) {
            taggingFeedMultiSelectState2 = taggingFeedMultiSelectState;
            AbstractC50524MSc.A0K(shoppingTaggingFeedClientState, AbstractC50524MSc.A0A(shoppingTaggingFeedClientState, taggingFeedMultiSelectState));
        }
        boolean A00 = Ny2.A00(userSession);
        if (c47z != null) {
            clipInfo = c47z.A1N;
        } else {
            clipInfo = null;
        }
        if (list2 != null) {
            shoppingTaggingFeedClientState.A02 = list2;
        }
        if (c47z != null && c47z.A0r != null) {
            str4 = c47z.A35;
        }
        C1XJ.A00.A0j(abstractC59962oe, abstractC59962oe.requireActivity(), null, userSession, AbstractC41710Idg.A01(clipInfo, enumC39584Hdu, shoppingTaggingFeedClientState, taggingFeedMultiSelectState2, num, l, str3, str4, moduleName, null, null, null, str, list, A00), null, false, true);
    }
}
