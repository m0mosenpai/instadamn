package X;

import com.instagram.model.people.PeopleTag;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public abstract class MW2 {
    public static final List A00(String str) {
        PeopleTag peopleTag;
        C14360o3.A0B(str, 0);
        if (str.equals("")) {
            return C16930sl.A00;
        }
        List A0m = AbstractC167007dF.A0m(str, "␞", 0);
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = A0m.iterator();
        while (it.hasNext()) {
            try {
                peopleTag = IR0.parseFromJson(C16V.A00((String) it.next()));
            } catch (IOException e) {
                AbstractC12120kG.A06("PeopleTagListConverter", "Failed to deserialize PeopleTag from Clips draft", e);
                peopleTag = null;
            }
            if (peopleTag != null) {
                A1E.add(peopleTag);
            }
        }
        return A1E;
    }
}
