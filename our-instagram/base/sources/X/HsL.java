package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.api.schemas.DayOfTheWeek;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public abstract class HsL {
    public static URF parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ArrayList arrayList = null;
            Integer num = null;
            String str = null;
            Integer num2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("days".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() == C16R.A0G) {
                                A1P = null;
                            } else {
                                A1P = c16l.A1P();
                            }
                            DayOfTheWeek dayOfTheWeek = (DayOfTheWeek) DayOfTheWeek.A01.get(A1P);
                            if (dayOfTheWeek == null) {
                                dayOfTheWeek = DayOfTheWeek.A0A;
                            }
                            arrayList.add(dayOfTheWeek);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("end_time".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("label".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else {
                    num2 = AbstractC31178DnM.A0V(c16l, num2, A0s, TraceFieldType.StartTime);
                }
                c16l.A0z();
            }
            return new URF(num, num2, str, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
