package X;

import com.instagram.api.schemas.ClipsMerchandisingPillType;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.3x2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC88453x2 {
    public static C38696H2h parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            ArrayList arrayList = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("loop_time".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if (AbstractC111324zv.A00(1108).equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() == C16R.A0G) {
                                A1P = null;
                            } else {
                                A1P = c16l.A1P();
                            }
                            ClipsMerchandisingPillType clipsMerchandisingPillType = (ClipsMerchandisingPillType) ClipsMerchandisingPillType.A01.get(A1P);
                            if (clipsMerchandisingPillType == null) {
                                clipsMerchandisingPillType = ClipsMerchandisingPillType.A06;
                            }
                            arrayList.add(clipsMerchandisingPillType);
                        }
                    } else {
                        arrayList = null;
                    }
                }
                c16l.A0z();
            }
            if (num == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("loop_time", "ClipsMerchandisingPillInfoImpl");
                throw C00O.createAndThrow();
            }
            return new C38696H2h(num.intValue(), arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
