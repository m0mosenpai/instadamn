package X;

import com.instagram.api.schemas.StoryGroupMentionTappableDataIntf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Htt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40289Htt {
    public static Map A00(StoryGroupMentionTappableDataIntf storyGroupMentionTappableDataIntf) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (storyGroupMentionTappableDataIntf.AvN() != null) {
            A1I.put("custom_text_color", storyGroupMentionTappableDataIntf.AvN());
        }
        if (storyGroupMentionTappableDataIntf.getId() != null) {
            AbstractC37300Gc1.A12(storyGroupMentionTappableDataIntf.getId(), A1I);
        }
        if (storyGroupMentionTappableDataIntf.BSS() != null) {
            List BSS = storyGroupMentionTappableDataIntf.BSS();
            ArrayList A0q = AbstractC167017dG.A0q(BSS);
            Iterator it = BSS.iterator();
            while (it.hasNext()) {
                AbstractC31178DnM.A1U(A0q, it);
            }
            A1I.put("mentioned_users", A0q);
        }
        if (storyGroupMentionTappableDataIntf.C0i() != null) {
            A1I.put("sticker_style_enum", storyGroupMentionTappableDataIntf.C0i());
        }
        if (storyGroupMentionTappableDataIntf.getText() != null) {
            AbstractC37300Gc1.A15(storyGroupMentionTappableDataIntf.getText(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
