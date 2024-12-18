package X;

import android.app.Activity;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.1oO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37251oO implements InterfaceC37261oP {
    @Override // X.InterfaceC37261oP
    public final void ABd(Activity activity, SpannableStringBuilder spannableStringBuilder, UserSession userSession, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(userSession, 1);
        String string = activity.getString(2131952643);
        C14360o3.A07(string);
        AnonymousClass773.A05(spannableStringBuilder, new C25719BYe(activity, userSession, this, interfaceC16820sZ), string);
    }

    @Override // X.InterfaceC37261oP
    public final boolean Ba9(UserSession userSession, List list, int i) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(list, 1);
        C150866ql c150866ql = new C150866ql(userSession);
        if (i == 1003) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((AnonymousClass178) next).CS0(c150866ql)) {
                    if (next == null) {
                        break;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.InterfaceC37261oP
    public final SpannableStringBuilder C2A(Activity activity, UserSession userSession, Integer num, String str, String str2, int i) {
        C14360o3.A0B(str, 2);
        SpannableStringBuilder A00 = F1V.A00(activity, "", Integer.valueOf(i), num, true);
        String string = activity.getString(2131952668, str, '*');
        C14360o3.A07(string);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        int length = spannableStringBuilder.length();
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                if (spannableStringBuilder.charAt(i2) == '*') {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        spannableStringBuilder.replace(i2, i2 + 1, (CharSequence) A00);
        ABd(activity, spannableStringBuilder, userSession, new ME3(str2, userSession, 31));
        return spannableStringBuilder;
    }

    @Override // X.InterfaceC37261oP
    public final void Cgm(FragmentActivity fragmentActivity, UserSession userSession, User user, String str, String str2, Map map) {
        C14360o3.A0B(fragmentActivity, 0);
        C14360o3.A0B(user, 2);
        C14360o3.A0B(str, 4);
        C27276C2b c27276C2b = new C27276C2b();
        c27276C2b.setArguments(AbstractC61636Rr0.A00(new C09530e4("other_user", user), new C09530e4("is_enabled_map", new HashMap(map)), new C09530e4(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str)));
        C140966Yy c140966Yy = new C140966Yy(fragmentActivity, userSession);
        c140966Yy.A0D(c27276C2b);
        c140966Yy.A0A = str2;
        c140966Yy.A08();
        c140966Yy.A04();
    }

    @Override // X.InterfaceC37261oP
    public final void Cgn(Activity activity, Bundle bundle, UserSession userSession) {
        C26865BtR c26865BtR = new C26865BtR();
        c26865BtR.setArguments(bundle);
        C189448aO c189448aO = new C189448aO(userSession);
        c189448aO.A0d = activity.getString(2131957098);
        c189448aO.A1C = false;
        C189478aR A00 = c189448aO.A00();
        A00.A02(activity, c26865BtR);
        c26865BtR.A00 = new C29887DGb(A00, 26);
    }
}
