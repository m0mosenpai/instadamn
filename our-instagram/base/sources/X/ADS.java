package X;

import android.content.Context;
import com.instagram.api.schemas.StoryLinkInfoDict;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public abstract class ADS {
    /* JADX WARN: Type inference failed for: r13v1, types: [X.6RN, java.lang.Object] */
    public static final C194808jg A00(Context context, UserSession userSession, String str, String str2, int i) {
        AbstractC167017dG.A1O(context, str);
        StoryLinkInfoDict storyLinkInfoDict = new StoryLinkInfoDict(null, null, null, null, null, null, str2, null, null, "web", str);
        ?? obj = new Object();
        obj.A00 = storyLinkInfoDict;
        ArrayList A1E = AbstractC166987dD.A1E();
        C30176DRg c30176DRg = new C30176DRg(i, 5, context, (Object) obj, userSession);
        A1E.add(c30176DRg.invoke("link_sticker_default"));
        A1E.add(c30176DRg.invoke("link_sticker_subtle"));
        A1E.add(c30176DRg.invoke("link_sticker_black_white"));
        A1E.add(c30176DRg.invoke("link_sticker_hero"));
        C194808jg c194808jg = new C194808jg(context, userSession, A1E);
        c194808jg.A03 = obj;
        return c194808jg;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.6RN, java.lang.Object] */
    public static final C194808jg A01(Context context, UserSession userSession, String str, String str2, int i, boolean z, boolean z2) {
        ArrayList A12 = AbstractC166997dE.A12(context, 0);
        StoryLinkInfoDict storyLinkInfoDict = new StoryLinkInfoDict(null, null, null, null, null, null, str2, null, null, "web", str);
        ?? obj = new Object();
        obj.A00 = storyLinkInfoDict;
        A12.add(new C133115zd(context, userSession, obj, false, null, null, "link_sticker_redesign_default", null, null, i, z, z2, false));
        A12.add(new C133115zd(context, userSession, obj, false, null, null, "link_sticker_redesign_subtle", null, null, i, z, z2, false));
        A12.add(new C133115zd(context, userSession, obj, false, null, null, "link_sticker_redesign_rainbow", null, null, i, z, z2, false));
        A12.add(new C133115zd(context, userSession, obj, false, null, null, "link_sticker_redesign_hero", null, null, i, z, z2, false));
        A12.add(new C133115zd(context, userSession, obj, false, null, null, "link_sticker_redesign_vibrant", null, null, i, z, z2, false));
        A12.add(new C133115zd(context, userSession, obj, false, null, null, "link_sticker_redesign_monotone", null, null, i, z, z2, false));
        C194808jg c194808jg = new C194808jg(context, userSession, A12);
        c194808jg.A03 = obj;
        return c194808jg;
    }
}
