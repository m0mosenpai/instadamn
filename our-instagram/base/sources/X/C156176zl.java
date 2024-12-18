package X;

import com.instagram.common.session.UserSession;
import com.instagram.repository.storyhighlights.StoryHighlightsTrayManager$Instance;
import java.util.Map;

/* renamed from: X.6zl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C156176zl {
    public final StoryHighlightsTrayManager$Instance A00(UserSession userSession, String str) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(userSession, 1);
        C156166zk c156166zk = (C156166zk) userSession.A01(C156166zk.class, new C9EU(userSession, 30));
        Map map = c156166zk.A01;
        StoryHighlightsTrayManager$Instance storyHighlightsTrayManager$Instance = (StoryHighlightsTrayManager$Instance) map.get(str);
        if (storyHighlightsTrayManager$Instance == null) {
            StoryHighlightsTrayManager$Instance storyHighlightsTrayManager$Instance2 = new StoryHighlightsTrayManager$Instance(c156166zk, str);
            map.put(str, storyHighlightsTrayManager$Instance2);
            return storyHighlightsTrayManager$Instance2;
        }
        return storyHighlightsTrayManager$Instance;
    }
}
