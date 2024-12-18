package X;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.instagram.pendingmedia.model.UserStoryTarget;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.FgG, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35223FgG {
    public static final C35223FgG A00 = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
    
        if (r0 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(androidx.fragment.app.FragmentActivity r7, X.InterfaceC11380iw r8, com.instagram.common.session.UserSession r9, java.lang.String r10, java.lang.String r11, java.util.List r12, java.util.List r13) {
        /*
            r6 = 0
            r5 = 1
            X.AbstractC25229BEm.A1I(r9, r5, r8)
            java.lang.StringBuilder r4 = X.AbstractC166987dD.A1C()
            java.lang.String r1 = A01(r7, r12)
            r4.append(r1)
            if (r13 == 0) goto L5d
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L46
            java.lang.String r0 = X.AnonymousClass001.A0B(r1)
            X.C14360o3.A07(r0)
            int r0 = r0.length()
            if (r0 <= 0) goto L2a
            java.lang.String r0 = ", "
            r4.append(r0)
        L2a:
            android.content.res.Resources r3 = r7.getResources()
            r2 = 2131960438(0x7f132276, float:1.9557545E38)
            boolean r0 = X.AbstractC166987dD.A1b(r13)
            if (r0 == 0) goto L8a
            X.GWE r1 = X.GWE.A00
            java.lang.String r0 = ", "
            java.lang.String r0 = X.AbstractC25226BEj.A1H(r0, r13, r1)
            java.lang.String r0 = X.AbstractC166997dE.A0r(r3, r0, r2)
            r4.append(r0)
        L46:
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L5d
            com.instagram.model.direct.DirectShareTarget r0 = X.AbstractC31172DnG.A0n(r13, r6)
            X.C14360o3.A0B(r0, r5)
            java.util.List r0 = X.AbstractC31172DnG.A18(r0)
            com.instagram.common.typedurl.ImageUrl r0 = X.AbstractC31314Dpa.A00(r9, r0)
            if (r0 != 0) goto L65
        L5d:
            com.instagram.user.model.User r0 = X.AbstractC166997dE.A0Y(r9)
            com.instagram.common.typedurl.ImageUrl r0 = r0.Bhu()
        L65:
            X.G8Z r6 = new X.G8Z
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            X.2OG r3 = X.C2OG.A01()
            java.lang.String r1 = r9.userId
            X.FOf r2 = X.C35129FeW.A00(r1)
            java.lang.String r1 = "media_posted_notification_type"
            r2.A0G = r1
            java.lang.String r1 = r4.toString()
            r2.A0H = r1
            r2.A04 = r0
            r2.A08 = r6
            com.instagram.common.notifications.push.intf.PushChannelType r0 = com.instagram.common.notifications.push.intf.PushChannelType.A09
            r2.A03 = r0
            X.C35129FeW.A01(r2, r3)
            return
        L8a:
            java.lang.String r0 = "Share targets cannot be empty"
            java.lang.IllegalArgumentException r0 = X.AbstractC166987dD.A12(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35223FgG.A02(androidx.fragment.app.FragmentActivity, X.0iw, com.instagram.common.session.UserSession, java.lang.String, java.lang.String, java.util.List, java.util.List):void");
    }

    public static final String A01(FragmentActivity fragmentActivity, List list) {
        int i;
        if (list != null) {
            if (!list.contains(UserStoryTarget.A01) && !list.contains(UserStoryTarget.A09)) {
                if (list.contains(UserStoryTarget.A02)) {
                    i = 2131971741;
                } else {
                    if ((list instanceof Collection) && list.isEmpty()) {
                        return "";
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        String CBn = ((UserStoryTarget) it.next()).CBn();
                        if (CBn != null && CBn.equals("GROUP")) {
                            i = 2131971742;
                        }
                    }
                    return "";
                }
            } else {
                i = 2131971743;
            }
            return fragmentActivity.getString(i);
        }
        return "";
    }

    public static final Intent A00(List list, List list2) {
        Intent A04 = AbstractC31171DnF.A04();
        if (list != null) {
            A04.putParcelableArrayListExtra(AbstractC111324zv.A00(330), AbstractC166987dD.A1F(list));
        }
        if (list2 != null) {
            A04.putParcelableArrayListExtra(AbstractC111324zv.A00(678), AbstractC166987dD.A1F(list2));
        }
        return A04;
    }
}
