package X;

import com.instagram.user.model.User;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.I5e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40776I5e {
    public static Map A00(JM1 jm1) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (jm1.BGu() != null) {
            A1I.put("image_url", jm1.BGu());
        }
        User C5e = jm1.C5e();
        if (C5e != null) {
            A1I.put("template_author", C5e.A07());
        }
        if (jm1.C5f() != null) {
            A1I.put("template_id", jm1.C5f());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
