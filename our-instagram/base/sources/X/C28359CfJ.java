package X;

import android.content.Context;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.instagram.common.session.UserSession;
import com.instagram.contentnotes.domain.uistate.SocialContextBubbleUiState;

/* renamed from: X.CfJ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28359CfJ {
    public static final C28359CfJ A00 = new Object();

    public final SpannableStringBuilder A01(Context context, C2Y0 c2y0, UserSession userSession, SocialContextBubbleUiState socialContextBubbleUiState, InterfaceC80043ht interfaceC80043ht, int i, int i2) {
        String str;
        String str2;
        AbstractC167027dH.A0a(1, userSession, socialContextBubbleUiState, interfaceC80043ht, c2y0);
        boolean A02 = AbstractC13620mo.A02(context);
        String str3 = socialContextBubbleUiState.A08;
        if (str3 == null) {
            return new SpannableStringBuilder();
        }
        Integer num = socialContextBubbleUiState.A05;
        boolean z = socialContextBubbleUiState.A0E;
        StringBuilder A11 = AbstractC166997dE.A11(str3);
        if (num != null) {
            str = C9IS.A00(num);
        } else {
            str = "null";
        }
        A11.append(str);
        A11.append(z);
        A11.append(A02);
        A11.append(i);
        A11.append(i2);
        String obj = A11.toString();
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) C57352kA.A05(userSession).A03.get(obj);
        if (spannableStringBuilder != null) {
            return spannableStringBuilder;
        }
        if (z) {
            str2 = (String) C57352kA.A05(userSession).A05.get(str3);
        } else {
            str2 = socialContextBubbleUiState.A07;
        }
        C169607ha c169607ha = C169607ha.A00;
        if (str2 == null) {
            str2 = "";
        }
        SpannableStringBuilder A022 = c169607ha.A02(context, userSession, socialContextBubbleUiState.A04, str2, socialContextBubbleUiState.A0A, new BAO(19, interfaceC80043ht, c2y0), new BAO(20, interfaceC80043ht, c2y0), new DSZ(interfaceC80043ht, c2y0, str3, 1), i, i2, A02, false, false);
        C57352kA.A05(userSession).A03.put(obj, A022);
        return A022;
    }

    public static final void A00(GestureDetector gestureDetector) {
        gestureDetector.onTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 3, 0.0f, 0.0f, 0));
    }
}
