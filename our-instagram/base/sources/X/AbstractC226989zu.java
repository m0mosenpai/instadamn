package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.9zu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC226989zu {
    public static C24239Ap6 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C24239Ap6 c24239Ap6 = new C24239Ap6();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("start_time_ms".equals(A0s)) {
                    c24239Ap6.A01 = c16l.A1D();
                } else if ("end_time_ms".equals(A0s)) {
                    c24239Ap6.A00 = c16l.A1D();
                } else {
                    ArrayList arrayList = null;
                    if ("file_path".equals(A0s)) {
                        c24239Ap6.A06 = AbstractC167017dG.A0m(c16l);
                    } else if ("trimmed_start_time_ms".equals(A0s)) {
                        c24239Ap6.A03 = c16l.A1D();
                    } else if ("trimmed_end_time_ms".equals(A0s)) {
                        c24239Ap6.A02 = c16l.A1D();
                    } else if ("waveform".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                arrayList.add(AbstractC167007dF.A0a(c16l));
                            }
                        }
                        c24239Ap6.A07 = arrayList;
                    } else if ("snippet_start_time_ms".equals(A0s)) {
                        c24239Ap6.A05 = c16l.A1D();
                    } else if ("is_recording_segment".equals(A0s)) {
                        c24239Ap6.A08 = c16l.A0d();
                    } else if ("sequence_number".equals(A0s)) {
                        c24239Ap6.A04 = c16l.A1D();
                    }
                }
                c16l.A0z();
            }
            return c24239Ap6;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
