package X;

import android.graphics.Shader;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import java.util.HashSet;
import java.util.Locale;

/* renamed from: X.3rh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C85523rh {
    public java.util.Set A00;
    public final UserSession A01;

    public final void A01(SpannableStringBuilder spannableStringBuilder) {
        java.util.Set set = this.A00;
        if (set == null) {
            set = A00();
            this.A00 = set;
        }
        if (!set.isEmpty()) {
            String obj = spannableStringBuilder.toString();
            C14360o3.A07(obj);
            Locale locale = Locale.getDefault();
            C14360o3.A07(locale);
            String lowerCase = obj.toLowerCase(locale);
            C14360o3.A07(lowerCase);
            if (set.contains(lowerCase) && A02(this.A01)) {
                C9T8 c9t8 = new C9T8(spannableStringBuilder.toString(), null, C50R.A00);
                c9t8.A01 = 7;
                c9t8.A02 = Shader.TileMode.REPEAT;
                spannableStringBuilder.setSpan(c9t8, 0, spannableStringBuilder.length(), 33);
            }
        }
    }

    public final boolean A02(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        boolean z = false;
        if (C18U.A04(C06090Tz.A06, userSession, 36877293578289283L).length() == 0) {
            z = true;
        }
        return !z;
    }

    public final HashSet A00() {
        HashSet hashSet = new HashSet();
        UserSession userSession = this.A01;
        if (A02(userSession)) {
            try {
                C14360o3.A0B(userSession, 0);
                for (String str : (String[]) new C11L(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1).A03(new String(Base64.decode(C18U.A04(C06090Tz.A06, userSession, 36877293578289283L), 0), C15W.A05)).toArray(new String[0])) {
                    int length = str.length() - 1;
                    int i = 0;
                    boolean z = false;
                    while (i <= length) {
                        int i2 = length;
                        if (!z) {
                            i2 = i;
                        }
                        int A00 = C14360o3.A00(str.charAt(i2), 32);
                        boolean z2 = false;
                        if (A00 <= 0) {
                            z2 = true;
                        }
                        if (!z) {
                            if (!z2) {
                                z = true;
                            } else {
                                i++;
                            }
                        } else {
                            if (!z2) {
                                break;
                            }
                            length--;
                        }
                    }
                    String obj = str.subSequence(i, length + 1).toString();
                    Locale locale = Locale.getDefault();
                    C14360o3.A07(locale);
                    String lowerCase = obj.toLowerCase(locale);
                    C14360o3.A07(lowerCase);
                    if (!AbstractC002300n.A0h(lowerCase, "#", false)) {
                        lowerCase = AnonymousClass001.A0D(lowerCase, '#');
                    }
                    hashSet.add(lowerCase);
                }
            } catch (IllegalArgumentException e) {
                C0w9.A06("HashtagColorizer", "Error parsing colorized hashtag list", e);
                return hashSet;
            }
        }
        return hashSet;
    }

    public C85523rh(UserSession userSession) {
        this.A01 = userSession;
    }
}
