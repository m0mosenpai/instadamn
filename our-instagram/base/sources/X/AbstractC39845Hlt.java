package X;

import com.instagram.user.model.User;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hlt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39845Hlt {
    public static Map A00(InterfaceC43555JLp interfaceC43555JLp) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        User BZm = interfaceC43555JLp.BZm();
        if (BZm != null) {
            A1I.put(AbstractC111324zv.A00(249), BZm.A07());
        }
        if (interfaceC43555JLp.getOriginalCommentId() != null) {
            A1I.put(AbstractC111324zv.A00(C8S8.DEFAULT_SWIPE_ANIMATION_DURATION), interfaceC43555JLp.getOriginalCommentId());
        }
        if (interfaceC43555JLp.getOriginalCommentText() != null) {
            A1I.put(AbstractC111324zv.A00(251), interfaceC43555JLp.getOriginalCommentText());
        }
        if (interfaceC43555JLp.getOriginalMediaId() != null) {
            A1I.put("original_media_id", interfaceC43555JLp.getOriginalMediaId());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
