package X;

import android.net.Uri;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.newsfeed.ui.InlineLinkUrn;
import java.util.Locale;
import java.util.regex.Matcher;

/* renamed from: X.BGu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC25280BGu {
    public static final void A00(C5Tl c5Tl, C6C7 c6c7, int i) {
        int i2;
        c5Tl.Enr(1808565762);
        if ((i & 6) == 0) {
            i2 = AbstractC25230BEn.A04(AbstractC25233BEq.A1T(c5Tl, c6c7, i) ? 1 : 0) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1143716292, "com.instagram.newsfeed.ui.applyHashtagAnnotation (NewsfeedStoryMessageState.kt:169)");
            }
            Matcher matcher = AbstractC85443rZ.A01().matcher(c6c7.A02().A00);
            C14360o3.A07(matcher);
            while (matcher.find()) {
                c5Tl.Eno(1607792714);
                String group = matcher.group(1);
                if (group != null) {
                    Uri.Builder authority = new Uri.Builder().authority("hashtag");
                    String lowerCase = group.toLowerCase(Locale.ROOT);
                    C14360o3.A07(lowerCase);
                    String obj = authority.appendQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID, AbstractC001900j.A0F("#", lowerCase)).build().toString();
                    C14360o3.A07(obj);
                    int start = matcher.start(1);
                    int end = matcher.end(1);
                    c6c7.A06(new C5W3(null, null, null, null, null, 65534, C5XL.A00(c5Tl).A0Y, 0L, 0L), start, end);
                    c6c7.A0A("InlineLinkUrn", AbstractC73763Sg.A03.A02(new InlineLinkUrn(group, obj), MUO.A00), start, end);
                }
                C117505Tk.A0L((C117505Tk) c5Tl, false);
            }
            if (C0fH.A02()) {
                C0fH.A00(-1026517716);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30497Dbg.A01(ASZ, c6c7, i, 27);
        }
    }

    public static final void A01(C5Tl c5Tl, C6C7 c6c7, int i) {
        int i2;
        c5Tl.Enr(1728680484);
        if ((i & 6) == 0) {
            i2 = AbstractC25230BEn.A04(AbstractC25233BEq.A1T(c5Tl, c6c7, i) ? 1 : 0) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1884719905, "com.instagram.newsfeed.ui.applyMentionAnnotation (NewsfeedStoryMessageState.kt:195)");
            }
            Matcher A09 = AbstractC13670mt.A09(c6c7.A02().A00);
            while (A09.find()) {
                c5Tl.Eno(1939667852);
                String group = A09.group(1);
                if (group != null) {
                    Uri.Builder authority = new Uri.Builder().authority("mention");
                    String lowerCase = group.toLowerCase(Locale.ROOT);
                    C14360o3.A07(lowerCase);
                    String obj = authority.appendQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID, AbstractC001900j.A0F("@", lowerCase)).build().toString();
                    C14360o3.A07(obj);
                    int start = A09.start(1);
                    int end = A09.end(1);
                    c6c7.A06(new C5W3(null, null, null, null, null, 65534, C5XL.A00(c5Tl).A0Y, 0L, 0L), start, end);
                    c6c7.A0A("InlineLinkUrn", AbstractC73763Sg.A03.A02(new InlineLinkUrn(group, obj), MUO.A00), start, end);
                }
                C117505Tk.A0L((C117505Tk) c5Tl, false);
            }
            if (C0fH.A02()) {
                C0fH.A00(1155206072);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30497Dbg.A01(ASZ, c6c7, i, 28);
        }
    }
}
