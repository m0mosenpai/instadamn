package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.MVw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC50611MVw {
    public static final List A00(String str) {
        JUM jum;
        C14360o3.A0B(str, 0);
        List A0m = AbstractC167007dF.A0m(str, "␞", 0);
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = A0m.iterator();
        while (it.hasNext()) {
            try {
                jum = AbstractC50608MVt.parseFromJson(C16V.A00((String) it.next()));
            } catch (IOException e) {
                AbstractC12120kG.A06("UnschematizedCompositionListConverter", "Failed to deserialize UnschematizedUnifiedComposition from Clips draft", e);
                jum = null;
            }
            if (jum != null) {
                A1E.add(jum);
            }
        }
        return A1E;
    }
}
