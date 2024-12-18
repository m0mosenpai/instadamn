package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spanned;
import com.facebook.R;
import com.instagram.user.model.User;
import java.util.ArrayList;

/* renamed from: X.4fM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC100574fM {
    public static String A02(User user) {
        return AnonymousClass001.A0R("@", user.getUsername());
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x01e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C85383rT A00(android.content.Context r13, com.instagram.common.session.UserSession r14, X.InterfaceC85403rV r15, java.lang.String r16, java.util.List r17, int r18, int r19, boolean r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC100574fM.A00(android.content.Context, com.instagram.common.session.UserSession, X.3rV, java.lang.String, java.util.List, int, int, boolean, boolean, boolean):X.3rT");
    }

    public static String A01(Context context, ArrayList arrayList, int i, boolean z, boolean z2) {
        int i2;
        Object[] objArr;
        Spanned A01;
        Resources resources = context.getResources();
        if (arrayList.size() != 1) {
            if (z && !arrayList.isEmpty()) {
                int i3 = i - 1;
                String username = ((User) arrayList.get(0)).getUsername();
                Integer valueOf = Integer.valueOf(i3);
                C14360o3.A0B(resources, 1);
                A01 = AbstractC07900bA.A02(resources, new String[]{username, AnonymousClass001.A0R("@", C84963qk.A04(resources, valueOf, 10000, false, false)), "@"}, R.plurals.collaborators_w_and_n_others, i3);
            } else {
                int size = arrayList.size();
                if (size != 1) {
                    if (size != 2) {
                        if (size != 3) {
                            if (size != 4) {
                                if (size != 5) {
                                    A01 = AbstractC07900bA.A01(resources, new String[]{((User) arrayList.get(0)).getUsername(), ((User) arrayList.get(1)).getUsername(), ((User) arrayList.get(2)).getUsername(), ((User) arrayList.get(3)).getUsername(), Integer.toString(i - 4)}, 2131956354);
                                } else {
                                    i2 = 2131956352;
                                    objArr = new Object[]{((User) arrayList.get(0)).getUsername(), ((User) arrayList.get(1)).getUsername(), ((User) arrayList.get(2)).getUsername(), ((User) arrayList.get(3)).getUsername(), ((User) arrayList.get(4)).getUsername()};
                                }
                            } else {
                                i2 = 2131956353;
                                objArr = new Object[]{((User) arrayList.get(0)).getUsername(), ((User) arrayList.get(1)).getUsername(), ((User) arrayList.get(2)).getUsername(), ((User) arrayList.get(3)).getUsername()};
                            }
                        } else {
                            i2 = 2131956358;
                            objArr = new Object[]{((User) arrayList.get(0)).getUsername(), ((User) arrayList.get(1)).getUsername(), ((User) arrayList.get(2)).getUsername()};
                        }
                    } else {
                        i2 = 2131956356;
                        if (z2) {
                            i2 = 2131956357;
                        }
                        objArr = new Object[]{((User) arrayList.get(0)).getUsername(), ((User) arrayList.get(1)).getUsername()};
                    }
                    return resources.getString(i2, objArr);
                }
            }
            return A01.toString();
        }
        return ((User) arrayList.get(0)).getUsername();
    }
}
