package X;

import android.view.animation.AlphaAnimation;
import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.models.NoteStyle;
import com.instagram.direct.inbox.notes.ui.NoteBubbleView;

/* loaded from: classes8.dex */
public abstract class JZC {
    public static final InterfaceC50424MOe A00(C6C9 c6c9) {
        InterfaceC50424MOe c43654JSm;
        int i;
        NoteStyle noteStyle = (NoteStyle) NoteStyle.A01.get(Integer.valueOf(c6c9.A01));
        if (noteStyle == null) {
            noteStyle = NoteStyle.A0E;
        }
        switch (noteStyle.ordinal()) {
            case 1:
                c43654JSm = new C43654JSm(c6c9);
                return c43654JSm;
            case 2:
                c43654JSm = new C43646JSe(c6c9);
                return c43654JSm;
            case 3:
            case 6:
            default:
                return null;
            case 4:
                c43654JSm = new K2O(c6c9);
                return c43654JSm;
            case 5:
                i = 2;
                break;
            case 7:
                i = 6;
                break;
            case 8:
                i = 4;
                break;
            case 9:
                i = 3;
                break;
            case 10:
                i = 1;
                break;
        }
        c43654JSm = new C9BI(c6c9, i);
        return c43654JSm;
    }

    public static final void A01(NoteBubbleView noteBubbleView, boolean z) {
        if (noteBubbleView != null) {
            float f = 0.0f;
            float f2 = 1.0f;
            if (z) {
                f2 = 0.0f;
                f = 1.0f;
            }
            AlphaAnimation A0I = AbstractC43594JPz.A0I(f2, f);
            A0I.setFillAfter(!z);
            noteBubbleView.post(new RunnableC50009M5y(A0I, noteBubbleView, z));
        }
    }

    public static final boolean A02(UserSession userSession, boolean z) {
        if (!z && C4AC.A08(userSession) && C18U.A06(C06090Tz.A05, userSession, 36328362397941221L)) {
            return true;
        }
        return false;
    }
}
