package X;

import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F6U {
    public static C34651k3 parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C34651k3 c34651k3 = new C34651k3();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC31180DnO.A1W(c16l, A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    C14360o3.A0B(A1P, 0);
                    c34651k3.A06 = A1P;
                } else if ("toggle_thread_mode_entry_point".equals(A0q)) {
                    c34651k3.A00 = c16l.A1D();
                } else if (DatePickerDialogModule.ARG_MODE.equals(A0q)) {
                    c34651k3.A07 = c16l.A0d();
                } else if ("ttl_sec".equals(A0q)) {
                    c34651k3.A04 = AbstractC166997dE.A0h(c16l);
                } else if (AbstractC111324zv.A00(5568).equals(A0q)) {
                    c34651k3.A05 = AbstractC166997dE.A0h(c16l);
                } else if ("pre_mutation_disappearing_mode_metadata".equals(A0q)) {
                    c34651k3.A03 = AbstractC1118652y.parseFromJson(c16l);
                } else if ("optimistic_disappearing_mode_metadata".equals(A0q)) {
                    c34651k3.A02 = AbstractC1118652y.parseFromJson(c16l);
                } else {
                    AbstractC43669JTd.A01(c16l, c34651k3, A0q);
                }
                c16l.A0z();
            }
            return c34651k3;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
