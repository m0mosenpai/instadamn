package X;

import com.facebook.proxygen.TraceFieldType;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.3IY, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3IY {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.3IZ, java.lang.Object] */
    public static C3IZ parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if (TraceFieldType.StatusCode.equals(A0q)) {
                    obj.A01 = c16l.A1D();
                } else {
                    ArrayList arrayList = null;
                    String str = null;
                    if ("reason_phrase".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        obj.A02 = str;
                    } else if ("headers".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C23781El parseFromJson = AbstractC71393Ia.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        obj.A03 = arrayList;
                    } else if ("response_id".equals(A0q)) {
                        obj.A00 = c16l.A1D();
                    }
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
