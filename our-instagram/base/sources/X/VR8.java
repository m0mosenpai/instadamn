package X;

import java.util.Arrays;

/* loaded from: classes11.dex */
public abstract class VR8 {
    public static final String A00(String str) {
        if (str != null) {
            if (str.equals("regular")) {
                return "regular";
            }
            if (!str.equals("emphasized")) {
                String format = String.format("Got unexpected button style: %s", Arrays.copyOf(new Object[]{str}, 1));
                C14360o3.A07(format);
                AbstractC25241Le.A02("BloksScreenNavbarButtonData", format);
            }
        }
        return "emphasized";
    }
}
