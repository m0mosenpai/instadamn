package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.43y, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C43y {
    /* JADX WARN: Type inference failed for: r2v0, types: [X.43z, java.lang.Object] */
    public static C910443z parseFromJson(C16L c16l) {
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
                ArrayList arrayList = null;
                if ("likes".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            AnonymousClass441 parseFromJson = AnonymousClass440.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    obj.A01 = arrayList;
                } else if ("emojis".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            AnonymousClass441 parseFromJson2 = AnonymousClass440.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList.add(parseFromJson2);
                            }
                        }
                    }
                    obj.A00 = arrayList;
                }
                c16l.A0z();
            }
            if (obj.A01 == null) {
                obj.A01 = Collections.emptyList();
            }
            if (obj.A00 == null) {
                obj.A00 = Collections.emptyList();
                return obj;
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
