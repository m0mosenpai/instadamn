package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public abstract class FCG {
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000e. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10, types: [X.0Ai] */
    /* JADX WARN: Type inference failed for: r1v12, types: [X.0Ai] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v15, types: [X.0Ai] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.0Ai] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v4, types: [X.0Ai] */
    /* JADX WARN: Type inference failed for: r1v6, types: [X.0Ai] */
    /* JADX WARN: Type inference failed for: r1v8, types: [X.0Ai] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public static final void A00(InterfaceC11380iw interfaceC11380iw, UserSession userSession, User user, Integer num, String str, String str2) {
        C14360o3.A0B(userSession, 0);
        ?? id = user.getId();
        ?? intValue = num.intValue();
        switch (intValue) {
            case 0:
                if (str2 != null) {
                    intValue = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "ig_mute_action_selected");
                    if (!intValue.isSampled()) {
                        return;
                    }
                    AbstractC31175DnJ.A14(intValue, interfaceC11380iw);
                    intValue.AAP("selected_from", str2);
                    AbstractC31178DnM.A18(intValue, id);
                    id = 0;
                    if (str != null) {
                        intValue = intValue;
                        id = AbstractC25228BEl.A13(str);
                    }
                    intValue.A9K("media_id", id);
                    intValue.Cht();
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            case 1:
                intValue = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "ig_mute_posts");
                if (!intValue.isSampled()) {
                    return;
                }
                AbstractC31175DnJ.A14(intValue, interfaceC11380iw);
                AbstractC31178DnM.A18(intValue, id);
                intValue.AAP("selected_from", str2);
                id = 0;
                if (str != null) {
                    intValue = intValue;
                    id = AbstractC25228BEl.A13(str);
                }
                intValue.A9K("media_id", id);
                intValue.Cht();
                return;
            case 2:
                intValue = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "ig_mute_stories");
                if (!intValue.isSampled()) {
                    return;
                }
                AbstractC31175DnJ.A14(intValue, interfaceC11380iw);
                AbstractC31178DnM.A18(intValue, id);
                intValue.AAP("selected_from", str2);
                id = 0;
                if (str != null) {
                    intValue = intValue;
                    id = AbstractC25228BEl.A13(str);
                }
                intValue.A9K("media_id", id);
                intValue.Cht();
                return;
            case 3:
            case 4:
            case 5:
            case 7:
            default:
                return;
            case 6:
                if (str2 != null) {
                    intValue = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "ig_mute_posts_and_stories");
                    if (!intValue.isSampled()) {
                        return;
                    }
                    AbstractC31175DnJ.A14(intValue, interfaceC11380iw);
                    intValue.AAP("selected_from", str2);
                    AbstractC31178DnM.A18(intValue, id);
                    id = 0;
                    if (str != null) {
                        intValue = intValue;
                        id = AbstractC25228BEl.A13(str);
                    }
                    intValue.A9K("media_id", id);
                    intValue.Cht();
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            case 8:
                if (str2 != null) {
                    intValue = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "ig_unmute_posts");
                    if (!intValue.isSampled()) {
                        return;
                    }
                    AbstractC31175DnJ.A14(intValue, interfaceC11380iw);
                    intValue.AAP("selected_from", str2);
                    AbstractC31178DnM.A18(intValue, id);
                    id = 0;
                    if (str != null) {
                        intValue = intValue;
                        id = AbstractC25228BEl.A13(str);
                    }
                    intValue.A9K("media_id", id);
                    intValue.Cht();
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            case 9:
                if (str2 != null) {
                    intValue = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "ig_unmute_stories");
                    if (!intValue.isSampled()) {
                        return;
                    }
                    AbstractC31175DnJ.A14(intValue, interfaceC11380iw);
                    intValue.AAP("selected_from", str2);
                    AbstractC31178DnM.A18(intValue, id);
                    id = 0;
                    if (str != null) {
                        intValue = intValue;
                        id = AbstractC25228BEl.A13(str);
                    }
                    intValue.A9K("media_id", id);
                    intValue.Cht();
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
        }
    }
}
