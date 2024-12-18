package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.model.mediatype.ProductType;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3cV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C76833cV {
    public static final C76833cV A00 = new Object();

    public static final void A01(Context context, UserSession userSession, C38321qM c38321qM) {
        C14360o3.A0B(userSession, 1);
        C6WQ c6wq = new C6WQ(context, true);
        Activity activity = (Activity) AbstractC167197dY.A00(context, Activity.class);
        if (activity != null) {
            c6wq.setOwnerActivity(activity);
        }
        String string = context.getString(2131952029);
        C14360o3.A07(string);
        int i = 2131952027;
        if (ProductType.CLIPS == c38321qM.A1z()) {
            i = 2131952028;
        }
        String string2 = context.getString(i);
        C14360o3.A07(string2);
        A04(userSession, c38321qM, c6wq, H8Q.class, C41235INa.class, "accept_coauthor_invite/", string, new ME8(c38321qM, userSession, c6wq, string2, 16));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0081, code lost:
    
        if (r0 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0083, code lost:
    
        r4 = r0.getUsername();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0087, code lost:
    
        r1[1] = r4;
        r1[2] = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ef, code lost:
    
        if (r0 != null) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(android.content.Context r13, com.instagram.common.session.UserSession r14, X.InterfaceC60442pS r15, java.lang.String r16) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76833cV.A03(android.content.Context, com.instagram.common.session.UserSession, X.2pS, java.lang.String):void");
    }

    public static final void A04(UserSession userSession, C38321qM c38321qM, C6WQ c6wq, Class cls, Class cls2, String str, String str2, InterfaceC16820sZ interfaceC16820sZ) {
        c6wq.setCancelable(false);
        c6wq.setCanceledOnTouchOutside(false);
        c6wq.A00(str2);
        C0fJ.A00(c6wq);
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A05();
        String A0R = AnonymousClass001.A0R("media/%s_%s/", str);
        String id = c38321qM.getId();
        if (id != null) {
            c25621Ms.A0B(AbstractC13670mt.A06(A0R, id, userSession.userId));
            c25621Ms.A0R(cls, cls2);
            C1ON A0N = c25621Ms.A0N();
            A0N.A00 = new C45542KEh(c6wq, interfaceC16820sZ);
            C1GJ.A03(A0N);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final HashMap A00(UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str) {
        User A2E;
        HashMap hashMap = new HashMap();
        hashMap.put("media_id", str);
        hashMap.put(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, userSession.userId);
        hashMap.put("analytics_module", interfaceC60442pS.getModuleName());
        C38321qM A02 = C1DW.A00(userSession).A02(str);
        if (A02 == null || (A2E = A02.A2E(userSession)) == null) {
            return null;
        }
        hashMap.put("media_owner_username", A2E.getUsername());
        hashMap.put(AbstractC43591JPw.A00(399), String.valueOf(A02.A5P()));
        return hashMap;
    }

    public static final void A02(Context context, UserSession userSession, C38321qM c38321qM) {
        boolean z = false;
        if (ProductType.CLIPS == c38321qM.A1z()) {
            z = true;
        }
        C193328hC c193328hC = new C193328hC(context);
        c193328hC.A05 = context.getString(2131965073);
        int i = 2131965074;
        if (z) {
            i = 2131965075;
        }
        c193328hC.A0r(context.getString(i));
        c193328hC.A0L(new DialogInterfaceOnClickListenerC41802IfI(context, userSession, c38321qM), 2131969805);
        c193328hC.A06();
        C0fJ.A00(c193328hC.A02());
    }

    public static final boolean A06(UserSession userSession, C38321qM c38321qM) {
        List coauthorProducers = c38321qM.A0C.getCoauthorProducers();
        if (coauthorProducers != null && (!(coauthorProducers instanceof Collection) || !coauthorProducers.isEmpty())) {
            Iterator it = coauthorProducers.iterator();
            while (it.hasNext()) {
                if (C14360o3.A0K(((User) it.next()).getId(), userSession.userId)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void A05(C6WQ c6wq) {
        Activity ownerActivity = c6wq.getOwnerActivity();
        if (ownerActivity != null && !ownerActivity.isDestroyed() && !ownerActivity.isFinishing() && c6wq.isShowing()) {
            c6wq.dismiss();
        }
    }

    public static final boolean A07(UserSession userSession, C38321qM c38321qM) {
        List A3i = c38321qM.A3i();
        if (!(A3i instanceof Collection) || !A3i.isEmpty()) {
            Iterator it = A3i.iterator();
            while (it.hasNext()) {
                if (C14360o3.A0K(((User) it.next()).getId(), userSession.userId)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean A08(UserSession userSession, C38321qM c38321qM) {
        String str;
        if (!A07(userSession, c38321qM)) {
            User A2E = c38321qM.A2E(userSession);
            if (A2E != null) {
                str = A2E.getId();
            } else {
                str = null;
            }
            if (C14360o3.A0K(str, userSession.userId) && (!c38321qM.A3i().isEmpty())) {
                return true;
            }
            return false;
        }
        return true;
    }
}
