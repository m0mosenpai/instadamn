package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.5lO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC125185lO {
    public static C5lP parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C5lP c5lP = new C5lP();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                String str = null;
                ArrayList arrayList = null;
                Long l = null;
                String str2 = null;
                if ("data".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C125205lR parseFromJson = AbstractC125195lQ.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c5lP.A05 = arrayList;
                } else if ("seq_id".equals(A0q)) {
                    c5lP.A00 = c16l.A0y();
                } else if ("tq_seq_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0I) {
                        l = Long.valueOf(c16l.A0y());
                    }
                    c5lP.A02 = l;
                } else if ("sampled".equals(A0q)) {
                    c5lP.A07 = c16l.A0d();
                } else if ("realtime".equals(A0q)) {
                    c5lP.A06 = c16l.A0d();
                } else if ("client_context".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str2 = c16l.A1P();
                    }
                    c5lP.A03 = str2;
                } else if ("mutation_token".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    c5lP.A04 = str;
                } else if ("mi_trace_id".equals(A0q)) {
                    c5lP.A01 = Long.valueOf(c16l.A0y());
                }
                c16l.A0z();
            }
            return c5lP;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
