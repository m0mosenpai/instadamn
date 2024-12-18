package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.camera.DirectCameraViewModel;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public abstract class LKW {
    public static DirectCameraViewModel A02(Context context, UserSession userSession, C2EC c2ec, String str) {
        return A01(context, userSession, null, c2ec, str, 0);
    }

    public static DirectCameraViewModel A04(UserSession userSession, DirectShareTarget directShareTarget) {
        return A03(userSession, null, directShareTarget, null, false, false);
    }

    public static DirectCameraViewModel A01(Context context, UserSession userSession, AnonymousClass442 anonymousClass442, C2EC c2ec, String str, int i) {
        String A07;
        String str2;
        ImageUrl imageUrl;
        C02R.A03(c2ec, "DirectShareTarget is null");
        if (anonymousClass442 != null) {
            User A02 = AnonymousClass189.A00(userSession).A02(anonymousClass442.A0U);
            if (A02 != null) {
                A07 = AbstractC101904i3.A08(A02);
            } else {
                A07 = "";
            }
        } else {
            A07 = C4GQ.A07(context, userSession, c2ec);
        }
        ArrayList A01 = C4GO.A01(c2ec.BSH());
        Long A012 = AbstractC160897Ix.A01(c2ec);
        DirectShareTarget directShareTarget = new DirectShareTarget(AbstractC31232DoF.A00(str, A01), A07, A01, c2ec.CRD());
        C3AY A00 = A00(A01);
        User A04 = C4GQ.A04(userSession, c2ec.BLX(), c2ec);
        User A10 = AbstractC166987dD.A10(userSession);
        List BSH = c2ec.BSH();
        String str3 = null;
        if (A04 != null) {
            str2 = A04.getId();
            imageUrl = A04.Bhu();
        } else {
            str2 = null;
            imageUrl = null;
        }
        c2ec.CVQ();
        C3AY A022 = AbstractC81683kd.A02(imageUrl, A10, str2, BSH);
        if (anonymousClass442 != null) {
            str3 = anonymousClass442.A0T;
        }
        return new DirectCameraViewModel((ImageUrl) A022.A00, (ImageUrl) A022.A01, directShareTarget, A012, A07, (String) A00.A01, str3, i, c2ec.CVQ(), c2ec.CbK(), c2ec.CWO(), AbstractC166987dD.A1a(A00.A00));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0043, code lost:
    
        if (r7.isEmpty() == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.instagram.model.direct.camera.DirectCameraViewModel A03(com.instagram.common.session.UserSession r14, X.AnonymousClass442 r15, com.instagram.model.direct.DirectShareTarget r16, java.lang.Long r17, boolean r18, boolean r19) {
        /*
            java.lang.String r0 = "DirectShareTarget is null"
            r5 = r16
            X.C02R.A03(r5, r0)
            java.util.List r0 = r5.A0Q
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            X.3AY r1 = A00(r0)
            com.instagram.user.model.User r3 = X.AbstractC166987dD.A10(r14)
            java.util.List r0 = r5.A0Q
            java.util.List r2 = java.util.Collections.unmodifiableList(r0)
            r5.A0R()
            r13 = 1
            r0 = 0
            X.3AY r4 = X.AbstractC81683kd.A02(r0, r3, r0, r2)
            r9 = 0
            java.lang.String r3 = r5.A0I
            if (r3 != 0) goto L2b
            java.lang.String r3 = ""
        L2b:
            if (r15 == 0) goto L79
            java.lang.String r9 = r15.A0T
            X.18A r2 = X.AnonymousClass189.A00(r14)
            java.lang.String r0 = r15.A0U
            com.instagram.user.model.User r0 = r2.A02(r0)
            if (r0 == 0) goto L76
            java.lang.String r7 = X.AbstractC101904i3.A08(r0)
        L3f:
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L79
        L45:
            r10 = 7
            if (r9 != 0) goto L49
            r10 = 0
        L49:
            java.lang.Object r3 = r4.A00
            com.instagram.common.typedurl.ImageUrl r3 = (com.instagram.common.typedurl.ImageUrl) r3
            java.lang.Object r4 = r4.A01
            com.instagram.common.typedurl.ImageUrl r4 = (com.instagram.common.typedurl.ImageUrl) r4
            boolean r0 = r5.A0R()
            r11 = r0 ^ 1
            if (r19 != 0) goto L62
            X.Fek r0 = X.C35143Fek.A00
            boolean r0 = r0.A01(r14, r5)
            if (r0 != 0) goto L62
            r13 = 0
        L62:
            java.lang.Object r0 = r1.A00
            boolean r14 = X.AbstractC166987dD.A1a(r0)
            java.lang.Object r8 = r1.A01
            java.lang.String r8 = (java.lang.String) r8
            com.instagram.model.direct.camera.DirectCameraViewModel r2 = new com.instagram.model.direct.camera.DirectCameraViewModel
            r6 = r17
            r12 = r18
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r2
        L76:
            java.lang.String r7 = ""
            goto L3f
        L79:
            r7 = r3
            goto L45
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LKW.A03(com.instagram.common.session.UserSession, X.442, com.instagram.model.direct.DirectShareTarget, java.lang.Long, boolean, boolean):com.instagram.model.direct.camera.DirectCameraViewModel");
    }

    public static C3AY A00(List list) {
        String str;
        boolean z;
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                PendingRecipient pendingRecipient = (PendingRecipient) it.next();
                if (pendingRecipient.A05 == Boolean.TRUE) {
                    str = pendingRecipient.A0C;
                    z = true;
                    break;
                }
            } else {
                str = null;
                z = false;
                break;
            }
        }
        return new C3AY(Boolean.valueOf(z), str);
    }
}
