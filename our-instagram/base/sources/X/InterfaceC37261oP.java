package X;

import android.app.Activity;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;
import java.util.Map;

/* renamed from: X.1oP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC37261oP {
    public static final C37321oV A00 = C37321oV.A01;

    void ABd(Activity activity, SpannableStringBuilder spannableStringBuilder, UserSession userSession, InterfaceC16820sZ interfaceC16820sZ);

    boolean Ba9(UserSession userSession, List list, int i);

    SpannableStringBuilder C2A(Activity activity, UserSession userSession, Integer num, String str, String str2, int i);

    void Cgm(FragmentActivity fragmentActivity, UserSession userSession, User user, String str, String str2, Map map);

    void Cgn(Activity activity, Bundle bundle, UserSession userSession);
}
