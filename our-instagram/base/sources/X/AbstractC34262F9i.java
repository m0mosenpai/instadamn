package X;

import com.instagram.nux.cal.model.ContentText;
import com.instagram.nux.cal.model.SignupContent;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.F9i, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34262F9i {
    /* JADX WARN: Type inference failed for: r1v0, types: [com.instagram.nux.cal.model.SignupContent, java.lang.Object] */
    public static SignupContent parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if (AbstractC111324zv.A00(844).equals(A0s)) {
                    obj.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("content_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            ContentText parseFromJson = AbstractC34256F9c.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    obj.A07 = arrayList;
                } else if ("content_button_label1".equals(A0s)) {
                    obj.A00 = AbstractC167017dG.A0m(c16l);
                } else if ("content_button_label2".equals(A0s)) {
                    obj.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("partial_screen_primary_button_label".equals(A0s)) {
                    obj.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("partial_screen_toast_text".equals(A0s)) {
                    obj.A05 = AbstractC167017dG.A0m(c16l);
                } else if ("final_screen_toast_text".equals(A0s)) {
                    obj.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("scroll_hint_text".equals(A0s)) {
                    obj.A06 = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
