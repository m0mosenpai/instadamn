package X;

import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;

/* renamed from: X.7f6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC168117f6 {
    public static final void A00(UserSession userSession, ComposerAutoCompleteTextView composerAutoCompleteTextView) {
        C14360o3.A0B(composerAutoCompleteTextView, 0);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36322967919012627L)) {
            if (C18U.A06(c06090Tz, userSession, 36322967919078164L)) {
                composerAutoCompleteTextView.A03 = true;
            }
            composerAutoCompleteTextView.setSingleLine(false);
        }
    }
}
