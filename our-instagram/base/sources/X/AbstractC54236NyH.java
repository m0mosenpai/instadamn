package X;

import com.instagram.tagging.api.model.MediaSuggestedProductTag;
import com.instagram.tagging.api.model.MediaSuggestedProductTagProductItemContainer;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.NyH, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54236NyH {
    public static final List A00(List list) {
        String str;
        float f;
        User user;
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaSuggestedProductTag mediaSuggestedProductTag = (MediaSuggestedProductTag) it.next();
            MediaSuggestedProductTagProductItemContainer mediaSuggestedProductTagProductItemContainer = (MediaSuggestedProductTagProductItemContainer) AbstractC001800i.A0J(AbstractC31173DnH.A0L(mediaSuggestedProductTag.A02));
            String str2 = null;
            if (mediaSuggestedProductTagProductItemContainer != null) {
                str = AbstractC38048Gob.A01(mediaSuggestedProductTagProductItemContainer.A01).A0H;
            } else {
                str = null;
            }
            MediaSuggestedProductTagProductItemContainer mediaSuggestedProductTagProductItemContainer2 = (MediaSuggestedProductTagProductItemContainer) AbstractC001800i.A0J(AbstractC31173DnH.A0L(mediaSuggestedProductTag.A02));
            if (mediaSuggestedProductTagProductItemContainer2 != null && (user = AbstractC38048Gob.A01(mediaSuggestedProductTagProductItemContainer2.A01).A0B) != null) {
                str2 = AbstractC76433bn.A00(user);
            }
            Float A08 = mediaSuggestedProductTag.A08();
            if (A08 != null) {
                f = A08.floatValue();
            } else {
                f = 0.0f;
            }
            if (str != null && str2 != null) {
                A1E.add(new C51730MtA(str, str2, 1, f));
            }
        }
        return A1E;
    }
}
