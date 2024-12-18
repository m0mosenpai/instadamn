package X;

import com.instagram.api.schemas.TestimonialDict;
import com.instagram.user.model.User;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CDa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC27530CDa {
    public static Map A00(TestimonialDict testimonialDict) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        User Ae9 = testimonialDict.Ae9();
        if (Ae9 != null) {
            A1I.put("author", Ae9.A07());
        }
        if (testimonialDict.Asa() != null) {
            A1I.put("created_at", testimonialDict.Asa());
        }
        if (testimonialDict.BQz() != null) {
            A1I.put(AbstractC58317Pt9.A00(861), testimonialDict.BQz());
        }
        if (testimonialDict.getText() != null) {
            A1I.put("text", testimonialDict.getText());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
