package X;

import com.instagram.model.keyword.Keyword;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.HzU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40610HzU {
    public static C132835z6 parseFromJson(C16L c16l) {
        EnumC127875qG enumC127875qG;
        Integer num;
        C14360o3.A0B(c16l, 0);
        try {
            C132835z6 c132835z6 = new C132835z6();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("keyword".equals(A0s)) {
                    Keyword parseFromJson = MZ7.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    c132835z6.A01 = parseFromJson;
                } else {
                    ArrayList arrayList = null;
                    if (AbstractC31171DnF.A1Y(A0s)) {
                        String A0m = AbstractC167017dG.A0m(c16l);
                        C14360o3.A0B(A0m, 0);
                        c132835z6.A03 = A0m;
                    } else if ("medias".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                AbstractC37302Gc3.A1J(c16l, arrayList);
                            }
                        }
                        c132835z6.A05 = arrayList;
                    } else if ("style".equals(A0s)) {
                        String A1Q = c16l.A1Q();
                        C14360o3.A0B(A1Q, 0);
                        Integer[] A00 = C05F.A00(3);
                        int length = A00.length;
                        int i = 0;
                        while (true) {
                            if (i < length) {
                                num = A00[i];
                                if (C14360o3.A0K(AbstractC40609HzT.A00(num), A1Q)) {
                                    break;
                                }
                                i++;
                            } else {
                                num = C05F.A01;
                                break;
                            }
                        }
                        C14360o3.A0B(num, 0);
                        c132835z6.A02 = num;
                    } else if ("topic_status".equals(A0s)) {
                        int A1D = c16l.A1D();
                        EnumC127875qG[] values = EnumC127875qG.values();
                        int length2 = values.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 < length2) {
                                enumC127875qG = values[i2];
                                if (enumC127875qG.A00 == A1D) {
                                    break;
                                }
                                i2++;
                            } else {
                                enumC127875qG = EnumC127875qG.A05;
                                break;
                            }
                        }
                        c132835z6.A00 = enumC127875qG;
                    }
                }
                c16l.A0z();
            }
            return c132835z6;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
