package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.VSk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68479VSk {
    /* JADX WARN: Type inference failed for: r3v0, types: [X.5yw, java.lang.Object] */
    public static C132735yw parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("tabs".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            W4N parseFromJson = AbstractC68478VSj.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    obj.A02 = arrayList;
                } else if ("selected".equals(A0s)) {
                    obj.A01 = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            EnumC68206VFy enumC68206VFy = (EnumC68206VFy) EnumC68206VFy.A01.get(obj.A01);
            if (enumC68206VFy == null) {
                enumC68206VFy = EnumC68206VFy.A0A;
            }
            obj.A00 = enumC68206VFy;
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
