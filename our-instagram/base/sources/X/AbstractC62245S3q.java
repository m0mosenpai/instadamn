package X;

import com.instagram.igds.components.form.IgFormField;
import java.util.Map;

/* renamed from: X.S3q, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62245S3q {
    public static final void A00(IgFormField igFormField, String str, Map map) {
        String A1A = AbstractC25228BEl.A1A(igFormField.getText().toString());
        if (str.length() != 0 && A1A.length() != 0) {
            map.put(str, A1A);
        }
    }
}
