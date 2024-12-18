package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.modules.intent.IntentModule;
import com.instagram.mediakit.model.MediaKitInsightType;
import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I29 {
    public static H7W parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            MediaKitInsightType mediaKitInsightType = null;
            String str = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (DialogModule.KEY_TITLE.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    mediaKitInsightType = (MediaKitInsightType) MediaKitInsightType.A01.get(A1P);
                    if (mediaKitInsightType == null) {
                        mediaKitInsightType = MediaKitInsightType.A07;
                    }
                } else if (IntentModule.EXTRA_MAP_KEY_FOR_VALUE.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (mediaKitInsightType == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V(DialogModule.KEY_TITLE, c16l, "MediaKitInsight");
            } else if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, c16l, "MediaKitInsight");
            } else {
                return new H7W(mediaKitInsightType, str);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
