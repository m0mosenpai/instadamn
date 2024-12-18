package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.HashtagImpl;
import com.instagram.user.model.User;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;

/* renamed from: X.857, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass857 {
    public boolean A00;
    public List A01;
    public final Activity A02;

    public AnonymousClass857(Activity activity) {
        C14360o3.A0B(activity, 1);
        this.A02 = activity;
        this.A01 = C16930sl.A00;
    }

    public static final User A00(UserSession userSession, String str, List list) {
        User A02;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(str, 1);
        List A0a = AbstractC001800i.A0a(AbstractC53940NtD.A00(str));
        C18A A00 = AnonymousClass189.A00(userSession);
        if (A0a.size() == 1) {
            A02 = (User) A00.A02.get(A0a.get(0));
        } else if (list != null && list.size() == 1) {
            A02 = A00.A02(((com.instagram.tagging.model.Tag) list.get(0)).getId());
        } else {
            return null;
        }
        if (A02 != null) {
            return A02;
        }
        return null;
    }

    public final List A01(UserSession userSession, String str, List list) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(list, 2);
        if (AbstractC172137li.A05(userSession) && list.isEmpty() && !this.A00 && str != null && str.length() != 0) {
            String lowerCase = str.toLowerCase(C1Q2.A02());
            C14360o3.A07(lowerCase);
            HashSet hashSet = new HashSet();
            java.util.Set A0j = AbstractC001800i.A0j(C23087AFt.A02);
            A0j.addAll(C23087AFt.A01);
            List A0a = AbstractC001800i.A0a(A0j);
            java.util.Set A0j2 = AbstractC001800i.A0j(C23087AFt.A04);
            A0j2.addAll(C23087AFt.A03);
            List<String> A0a2 = AbstractC001800i.A0a(A0j2);
            Matcher matcher = AbstractC85443rZ.A01().matcher(lowerCase);
            C14360o3.A07(matcher);
            while (matcher.find()) {
                String group = matcher.group(1);
                if (group != null && A0a.contains(group)) {
                    hashSet.add(group);
                }
            }
            for (String str2 : A0a2) {
                if (AbstractC001900j.A0a(lowerCase, str2, false)) {
                    hashSet.add(str2);
                }
            }
            List A0a3 = AbstractC001800i.A0a(hashSet);
            this.A01 = A0a3;
            return A0a3;
        }
        return C16930sl.A00;
    }

    public final List A02(UserSession userSession, String str, List list, List list2) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(list2, 3);
        HashSet hashSet = new HashSet();
        java.util.Set A0j = AbstractC001800i.A0j(C23087AFt.A02);
        A0j.addAll(C23087AFt.A01);
        List<String> A0a = AbstractC001800i.A0a(A0j);
        java.util.Set A0j2 = AbstractC001800i.A0j(C23087AFt.A04);
        A0j2.addAll(C23087AFt.A03);
        List<String> A0a2 = AbstractC001800i.A0a(A0j2);
        if (AbstractC172137li.A05(userSession) && list2.isEmpty() && !this.A00 && !AbstractC101614hW.A0E(list)) {
            Iterator it = list.iterator();
            while (true) {
                String str2 = null;
                if (it.hasNext()) {
                    C84823qW c84823qW = (C84823qW) it.next();
                    if (c84823qW.A12 == EnumC75383a5.A0d) {
                        HashtagImpl hashtagImpl = c84823qW.A0l;
                        if (hashtagImpl != null) {
                            String str3 = hashtagImpl.A0D;
                            if (str3 != null) {
                                str2 = str3.toLowerCase(C1Q2.A02());
                                C14360o3.A07(str2);
                            }
                            String A0D = AnonymousClass001.A0D(str2, '#');
                            if (A0a.contains(A0D)) {
                                hashSet.add(A0D);
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                } else if (str != null && str.length() != 0) {
                    String lowerCase = str.toLowerCase(C1Q2.A02());
                    C14360o3.A07(lowerCase);
                    for (String str4 : A0a2) {
                        if (AbstractC001900j.A0a(lowerCase, str4, false)) {
                            hashSet.add(str4);
                        }
                    }
                    for (String str5 : A0a) {
                        if (AbstractC001900j.A0a(lowerCase, str5, false)) {
                            hashSet.add(str5);
                        }
                    }
                }
            }
        }
        List A0a3 = AbstractC001800i.A0a(hashSet);
        this.A01 = A0a3;
        return A0a3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0143, code lost:
    
        if (r0 != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(android.content.Context r8, android.content.DialogInterface.OnClickListener r9, android.content.DialogInterface.OnClickListener r10, com.instagram.common.session.UserSession r11, java.lang.Integer r12, java.lang.String r13, java.util.List r14) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass857.A03(android.content.Context, android.content.DialogInterface$OnClickListener, android.content.DialogInterface$OnClickListener, com.instagram.common.session.UserSession, java.lang.Integer, java.lang.String, java.util.List):void");
    }

    public final boolean A04(Context context, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, UserSession userSession, String str, String str2, List list) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(str, 2);
        C14360o3.A0B(list, 3);
        if (C4A4.A00(userSession) && !this.A00) {
            List A01 = A01(userSession, str, list);
            if (!A01.isEmpty()) {
                A03(context, onClickListener, onClickListener2, userSession, null, str2, A01);
                return true;
            }
        }
        return false;
    }
}
