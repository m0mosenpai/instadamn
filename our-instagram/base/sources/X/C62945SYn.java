package X;

import android.content.Context;
import java.util.Map;

/* renamed from: X.SYn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62945SYn {
    public final Context A00;
    public final C3UV A01;
    public final String A02;
    public final String A03;

    private String A00(String str) {
        String str2;
        String str3;
        if (str != null) {
            int length = str.length();
            StringBuilder A0q = AbstractC58318PtA.A0q(length);
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt == '&') {
                    str3 = "&amp;";
                } else if (charAt >= ' ' && charAt <= '~') {
                    A0q.append(charAt);
                } else {
                    A0q.append("&#");
                    A0q.append(Integer.toString(charAt));
                    str3 = ";";
                }
                A0q.append(str3);
            }
            str2 = A0q.toString();
        } else {
            str2 = "";
        }
        return str2.replace("/", "-").replace(";", "-");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(24:3|4|5|6|7|(2:9|(18:11|12|(1:16)|17|18|19|20|(2:22|(10:24|25|(1:27)(1:40)|28|29|30|31|(1:33)(1:37)|34|35))|42|25|(0)(0)|28|29|30|31|(0)(0)|34|35))|46|12|(2:14|16)|17|18|19|20|(0)|42|25|(0)(0)|28|29|30|31|(0)(0)|34|35) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f8, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ad A[Catch: Exception -> 0x00b4, TryCatch #3 {Exception -> 0x00b4, blocks: (B:20:0x00a7, B:22:0x00ad), top: B:19:0x00a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String A01() {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62945SYn.A01():java.lang.String");
    }

    public C62945SYn(Context context, C3UV c3uv, String str, Map map) {
        String str2;
        this.A00 = context;
        this.A01 = c3uv;
        this.A02 = str;
        if (map != null) {
            str2 = AbstractC166987dD.A1A("User-Agent", map);
        } else {
            str2 = null;
        }
        this.A03 = str2;
    }
}
