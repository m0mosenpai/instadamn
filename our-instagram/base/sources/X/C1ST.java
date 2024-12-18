package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.1ST, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1ST {
    public final String A00;
    public final Map A01;
    public final boolean A02;
    public final boolean A03;

    public C1ST(String str, Map map, boolean z, boolean z2) {
        String str2;
        this.A03 = z;
        this.A02 = z2;
        this.A00 = str;
        this.A01 = new HashMap();
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            String[] split = ((String) it.next()).split(":");
            int length = split.length;
            if (length >= 3 && length <= 4) {
                String str3 = split[0];
                if (str3.length() == 2) {
                    String str4 = split[1];
                    if (str4.length() != 0) {
                        String str5 = split[2];
                        if (str5.length() != 0) {
                            if (length > 3) {
                                str2 = split[3];
                            } else {
                                str2 = "";
                            }
                            C72791XnC c72791XnC = new C72791XnC(str4, str5, str2);
                            c72791XnC.A00 = str3.charAt(0) == "ET".charAt(0);
                            c72791XnC.A01 = split[0].charAt(1) == "ET".charAt(1);
                            this.A01.put(c72791XnC.A04, c72791XnC);
                        }
                    }
                }
            }
        }
    }

    public C1ST() {
        this.A01 = new HashMap();
        this.A03 = false;
        this.A02 = false;
        this.A00 = new String();
    }
}
