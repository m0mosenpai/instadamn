package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.io.IOException;

/* renamed from: X.F7w, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34224F7w {
    /* JADX WARN: Type inference failed for: r0v5, types: [X.FJB, java.lang.Object] */
    public static FJB parseFromJson(C16L c16l) {
        String str;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str2 = null;
            Integer num = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("style".equals(A0s)) {
                    String A1Q = c16l.A1Q();
                    Integer[] A00 = C05F.A00(7);
                    int length = A00.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            num = A00[i];
                            switch (num.intValue()) {
                                case 1:
                                    str = "paragraph";
                                    break;
                                case 2:
                                    str = "bold_paragraph";
                                    break;
                                case 3:
                                    str = "bulletpoint";
                                    break;
                                case 4:
                                    str = "bulletpoint_checkmark";
                                    break;
                                case 5:
                                    str = "bulletpoint_cross";
                                    break;
                                case 6:
                                    str = NetInfoModule.CONNECTION_TYPE_NONE;
                                    break;
                                default:
                                    str = AbstractC111324zv.A00(3185);
                                    break;
                            }
                            if (!str.equals(A1Q)) {
                                i++;
                            }
                        } else {
                            num = C05F.A0u;
                        }
                    }
                }
                c16l.A0z();
            }
            ?? obj = new Object();
            if (str2 != null) {
                obj.A01 = str2;
            }
            if (num != null) {
                obj.A00 = num;
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
