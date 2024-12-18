package X;

import com.facebook.common.stringformat.StringFormatUtil;
import java.util.regex.Pattern;

/* renamed from: X.XYk, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72214XYk extends AbstractC200978ue {
    @Override // X.AbstractC200978ue
    public final /* bridge */ /* synthetic */ Object A01(Object obj) {
        String str = (String) obj;
        String str2 = (String) XkX.A01.get(str);
        if (str2 == null) {
            str2 = ".*";
        } else {
            String str3 = (String) XkX.A00.get(str);
            if (str3 != null && str3.startsWith("CC")) {
                str2 = StringFormatUtil.formatStrLocaleSafe("%s%s", str3.replace("CC", str), str2);
            }
        }
        return Pattern.compile(str2);
    }
}
