package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.0Bo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC02900Bo {
    public static final C0BQ A00 = C0BQ.A00;

    C0BO AEY(Activity activity, android.net.Uri uri, UserSession userSession, String str, boolean z);

    C0BO AEZ(Activity activity, android.net.Uri uri, UserSession userSession, String str, boolean z, boolean z2);

    boolean AGB(Context context, UserSession userSession, User user);

    List BOY();

    int BOZ();

    User BOa(String str);

    User BOb(String str);

    List BOc(String str);

    java.util.Set BOd();

    List BOe();

    List BOf(User user);

    User BWy(User user);

    void CJm(Context context, UserSession userSession, String str);

    boolean CLL();

    boolean CPH(String str);

    void Cn0();

    void E45(Context context, Intent intent, UserSession userSession, User user, String str);

    void E46(Context context, Intent intent, UserSession userSession, User user, String str, boolean z);

    void E47(Context context, Intent intent, UserSession userSession, User user, String str, boolean z, boolean z2);
}
