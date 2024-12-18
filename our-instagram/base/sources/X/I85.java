package X;

import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I85 {
    public static C51757Mtg parseFromJson(C16L c16l) {
        EnumC39558HdU enumC39558HdU;
        C14360o3.A0B(c16l, 0);
        try {
            C51757Mtg c51757Mtg = new C51757Mtg(27);
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("feed_type".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    EnumC39558HdU[] values = EnumC39558HdU.values();
                    int length = values.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            enumC39558HdU = values[i];
                            if (C14360o3.A0K(A0m, enumC39558HdU.A00)) {
                                break;
                            }
                            i++;
                        } else {
                            enumC39558HdU = EnumC39558HdU.A04;
                            break;
                        }
                    }
                    c51757Mtg.A01 = enumC39558HdU;
                } else if ("layout_content".equals(A0s)) {
                    C38899HAv parseFromJson = I84.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    c51757Mtg.A00 = parseFromJson;
                } else if ("section_id".equals(A0s)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    c51757Mtg.A02 = A0m2;
                }
                c16l.A0z();
            }
            return c51757Mtg;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
