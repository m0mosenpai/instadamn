package X;

import android.os.Bundle;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class F1B {
    public static final C26756Brd A00(Boolean bool, String str, String str2, List list) {
        C26756Brd c26756Brd = new C26756Brd();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("entrypoint", str);
        A0b.putString("challenge_id", str2);
        A0b.putBoolean(AbstractC111324zv.A00(3096), AbstractC167007dF.A1T(bool));
        A0b.putStringArrayList("achievement_ids", AbstractC166987dD.A1F(list));
        c26756Brd.setArguments(A0b);
        return c26756Brd;
    }
}
