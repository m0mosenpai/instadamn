package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public abstract class MW4 {
    public static final List A00(String str) {
        C51710Msf c51710Msf;
        if (str != null && !str.equals("")) {
            List A0m = AbstractC167007dF.A0m(str, "␞", 0);
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator it = A0m.iterator();
            while (it.hasNext()) {
                try {
                    c51710Msf = AbstractC54871OOg.parseFromJson(C16V.A00((String) it.next()));
                } catch (IOException e) {
                    AbstractC12120kG.A06("StackedTimelineAction", "Failed to deserialize StackedTimelineActions from Clips draft.", e);
                    c51710Msf = null;
                }
                if (c51710Msf != null) {
                    A1E.add(c51710Msf);
                }
            }
            return A1E;
        }
        return C16930sl.A00;
    }
}
