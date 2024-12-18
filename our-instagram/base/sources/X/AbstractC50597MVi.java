package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.MVi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC50597MVi {
    public static final List A00(String str) {
        C115475Kh c115475Kh;
        if (str != null && !str.equals("")) {
            List A0m = AbstractC167007dF.A0m(str, "␞", 0);
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator it = A0m.iterator();
            while (it.hasNext()) {
                try {
                    c115475Kh = AbstractC115465Kg.parseFromJson(C16V.A00((String) it.next()));
                } catch (IOException e) {
                    AbstractC12120kG.A06("VideoSegmentListConverter", "Failed to deserialize SerializedMediaEdits from Clips draft", e);
                    c115475Kh = null;
                }
                if (c115475Kh != null) {
                    A1E.add(c115475Kh);
                }
            }
            return A1E;
        }
        return C16930sl.A00;
    }
}
