package X;

import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I1L {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.I1K, java.lang.Object] */
    public static I1K parseFromJson(C16L c16l) {
        int i;
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if (DatePickerDialogModule.ARG_MODE.equals(AbstractC166997dE.A0s(c16l))) {
                    int A0i = c16l.A0i();
                    for (Integer num : C05F.A00(3)) {
                        switch (num.intValue()) {
                            case 1:
                                i = 1;
                                break;
                            case 2:
                                i = 2;
                                break;
                            default:
                                i = 0;
                                break;
                        }
                        if (i != A0i) {
                        }
                    }
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
