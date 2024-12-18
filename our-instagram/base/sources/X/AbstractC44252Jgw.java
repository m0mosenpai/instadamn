package X;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* renamed from: X.Jgw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC44252Jgw {
    public static final String A00(C6FW c6fw) {
        String str;
        try {
            Object A03 = c6fw.A03(0);
            C14360o3.A0C(A03, "null cannot be cast to non-null type kotlin.String");
            Object A032 = c6fw.A03(1);
            C14360o3.A0C(A032, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Int>");
            Object A00 = c6fw.A00();
            C14360o3.A0C(A00, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            List list = (List) A00;
            String A0y = AbstractC43593JPy.A0y(c6fw, 3);
            String A0y2 = AbstractC43593JPy.A0y(c6fw, 4);
            C39601sh c39601sh = new C39601sh(A0y2, ByteBuffer.wrap(Base64.decode((String) A03, 0)));
            int[] A0x = AbstractC001800i.A0x((List) A032);
            C14360o3.A0B(A0y, 0);
            String A002 = c39601sh.A00(A0y, A0x);
            if (A002 != null) {
                String[] strArr = (String[]) AbstractC31178DnM.A1b(A0y2, "_");
                String str2 = strArr[0];
                if (strArr.length > 1) {
                    str = strArr[1];
                } else {
                    str = "";
                }
                Locale locale = new Locale(str2, str);
                String[] A1b = AbstractC31173DnH.A1b(list, 0);
                Object[] copyOf = Arrays.copyOf(A1b, A1b.length);
                String format = String.format(locale, A002, Arrays.copyOf(copyOf, copyOf.length));
                C14360o3.A07(format);
                return format;
            }
            return null;
        } catch (Exception e) {
            Object A033 = c6fw.A03(0);
            C14360o3.A0C(A033, "null cannot be cast to non-null type kotlin.String");
            String A0y3 = AbstractC43593JPy.A0y(c6fw, 3);
            String A14 = AnonymousClass001.A14("Error when evaluating ", AbstractC43593JPy.A0y(c6fw, 4), " fbt {", A0y3, "} (", (String) A033, ')');
            C14360o3.A0B(A14, 1);
            throw new Exception(A14, e);
        }
    }
}
