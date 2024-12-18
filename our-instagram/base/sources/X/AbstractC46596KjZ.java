package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.TextAppSearchDiscussionTopic;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.KjZ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract /* synthetic */ class AbstractC46596KjZ {
    public static Map A00(TextAppSearchDiscussionTopic textAppSearchDiscussionTopic) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (textAppSearchDiscussionTopic.B5E() != null) {
            A1I.put("fbid", textAppSearchDiscussionTopic.B5E());
        }
        if (textAppSearchDiscussionTopic.BGu() != null) {
            A1I.put("image_url", textAppSearchDiscussionTopic.BGu());
        }
        if (textAppSearchDiscussionTopic.BTa() != null) {
            A1I.put("metagen_description", textAppSearchDiscussionTopic.BTa());
        }
        if (textAppSearchDiscussionTopic.ByO() != null) {
            A1I.put("social_context_label", textAppSearchDiscussionTopic.ByO());
        }
        if (textAppSearchDiscussionTopic.getTitle() != null) {
            A1I.put(DialogModule.KEY_TITLE, textAppSearchDiscussionTopic.getTitle());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
