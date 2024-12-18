package X;

import android.util.Patterns;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes8.dex */
public abstract class LJP {
    /* JADX WARN: Removed duplicated region for block: B:45:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String A01(com.instagram.common.session.UserSession r17, X.AbstractC29011ae r18, X.C2EY r19, java.lang.String r20, java.lang.String r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LJP.A01(com.instagram.common.session.UserSession, X.1ae, X.2EY, java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    public static final boolean A02(String str) {
        C14360o3.A0B(str, 0);
        Pattern pattern = AbstractC13670mt.A06;
        Matcher matcher = Patterns.WEB_URL.matcher(str);
        C14360o3.A07(matcher);
        if (!matcher.find() || AbstractC13670mt.A0A(matcher.group(0))) {
            return false;
        }
        if (AbstractC13670mt.A09(str).find() && !AbstractC13670mt.A06.matcher(str).find()) {
            return false;
        }
        Matcher matcher2 = Patterns.EMAIL_ADDRESS.matcher(str);
        C14360o3.A07(matcher2);
        if (matcher2.find()) {
            return false;
        }
        return true;
    }

    public static final boolean A03(List list) {
        if (list != null && (!(list instanceof Collection) || !list.isEmpty())) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int i = ((C206179Ba) it.next()).A03;
                if (i == 5 || i == 6 || i == 102) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x02fc, code lost:
    
        if (r60.A05() != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x03db, code lost:
    
        if (A02(r71) != false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01b4, code lost:
    
        if (r11 != false) goto L59;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String A00(X.C50679MYx r57, com.instagram.common.session.UserSession r58, X.L7G r59, X.AnonymousClass442 r60, com.instagram.direct.model.mentions.SendMentionData$MentionData r61, X.C47588Kzy r62, X.EnumC46200Kcc r63, com.instagram.model.direct.DirectThreadKey r64, java.lang.Boolean r65, java.lang.Boolean r66, java.lang.Integer r67, java.lang.Integer r68, java.lang.Integer r69, java.lang.Long r70, java.lang.String r71, java.lang.String r72, java.lang.String r73, java.lang.String r74, java.lang.String r75, java.lang.String r76, java.lang.String r77, java.lang.String r78, java.util.List r79, java.util.List r80, boolean r81, boolean r82, boolean r83) {
        /*
            Method dump skipped, instructions count: 999
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LJP.A00(X.MYx, com.instagram.common.session.UserSession, X.L7G, X.442, com.instagram.direct.model.mentions.SendMentionData$MentionData, X.Kzy, X.Kcc, com.instagram.model.direct.DirectThreadKey, java.lang.Boolean, java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, boolean, boolean, boolean):java.lang.String");
    }
}
