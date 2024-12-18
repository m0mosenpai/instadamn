package X;

import java.io.IOException;

/* renamed from: X.5up, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC130445up {
    public static C130455uq parseFromJson(C16L c16l) {
        EnumC130465ur enumC130465ur;
        C14360o3.A0B(c16l, 0);
        try {
            C130455uq c130455uq = new C130455uq();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("layout_content".equals(A0q)) {
                    c130455uq.A01 = AbstractC130475us.parseFromJson(c16l);
                } else if ("explore_item_info".equals(A0q)) {
                    c130455uq.A00 = AbstractC125465ls.parseFromJson(c16l);
                } else if ("layout_type".equals(A0q)) {
                    String A1Q = c16l.A1Q();
                    C14360o3.A0B(A1Q, 0);
                    EnumC130465ur[] values = EnumC130465ur.values();
                    int length = values.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            enumC130465ur = values[i];
                            if (C14360o3.A0K(enumC130465ur.A00, A1Q)) {
                                break;
                            }
                            i++;
                        } else {
                            enumC130465ur = EnumC130465ur.A06;
                            break;
                        }
                    }
                    c130455uq.A02 = enumC130465ur;
                }
                c16l.A0z();
            }
            return c130455uq;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
