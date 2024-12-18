package X;

import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1Yl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C28261Yl {
    public static C28261Yl A00;
    public static final C1Yn A01 = new Object();

    public final void A00(Context context, FragmentActivity fragmentActivity, UserSession userSession, User user, InterfaceC37219GaU interfaceC37219GaU, String str, String str2, String str3) {
        JSONObject jSONObject;
        C14360o3.A0B(context, 0);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(str, 3);
        if (str2 == null) {
            jSONObject = null;
        } else {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("surface", "profile_of_commenter");
                jSONObject.put("comment_id", str2);
            } catch (JSONException e) {
                C0w9.A03("BlockPlugin", AnonymousClass001.A0R("Error adding adding comment params to JSON Object: ", e.getMessage()));
            }
        }
        C1Yn.A00(context, fragmentActivity, userSession, null, null, user, interfaceC37219GaU, str, null, str3, jSONObject);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.1mF, X.1OW] */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.1mR, X.1OW] */
    public final void A01(Fragment fragment, FragmentActivity fragmentActivity, final UserSession userSession, C17C c17c, C35199Ffr c35199Ffr, InterfaceC37187GZy interfaceC37187GZy, InterfaceC37219GaU interfaceC37219GaU, int i) {
        InterfaceC37268GbL c36770GIt;
        C1OW c1ow;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c35199Ffr, 5);
        if (fragment == null && fragmentActivity == null) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z = !c17c.CYY();
        if (fragment == null && fragmentActivity == null) {
            throw new IllegalStateException("Check failed.");
        }
        C36300Fzv c36300Fzv = (C36300Fzv) userSession.A01(C36300Fzv.class, new InterfaceC16820sZ() { // from class: X.GRf
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return new C36300Fzv(AbstractC12990ll.this);
            }
        });
        C14360o3.A07(c36300Fzv);
        if (fragment != null) {
            c36770GIt = new C36771GIu(fragment);
        } else if (fragmentActivity != null) {
            c36770GIt = new C36770GIt(fragmentActivity);
        } else {
            throw new IllegalStateException("Required value was null.");
        }
        InterfaceC37268GbL interfaceC37268GbL = c36770GIt;
        c36300Fzv.A03 = interfaceC37268GbL;
        interfaceC37268GbL.getLifecycle().A09(c36300Fzv);
        c36300Fzv.A07 = c17c.getId();
        c36300Fzv.A04 = Boolean.valueOf(z);
        c36300Fzv.A02 = interfaceC37219GaU;
        c36300Fzv.A08 = c17c.getUsername();
        boolean z2 = false;
        if (c17c.BJ8() == 0) {
            z2 = true;
        }
        c36300Fzv.A05 = Boolean.valueOf(z2);
        c36300Fzv.A06 = Integer.valueOf(i);
        c36300Fzv.A01 = interfaceC37187GZy;
        c36300Fzv.A00 = c17c;
        int BJ8 = c17c.BJ8();
        C26141Ov A012 = C26141Ov.A01(userSession);
        if (BJ8 == 0) {
            JTa A08 = AbstractC31277Doz.A08(userSession, C36071mR.class);
            String id = c17c.getId();
            String fullName = c17c.getFullName();
            String username = c17c.getUsername();
            ?? c1ow2 = new C1OW(A08);
            c1ow2.A03 = id;
            c1ow2.A02 = fullName;
            c1ow2.A04 = username;
            c1ow2.A00 = i;
            c1ow2.A01 = c35199Ffr;
            c1ow = c1ow2;
        } else {
            JTa A082 = AbstractC31277Doz.A08(userSession, C35951mF.class);
            String id2 = c17c.getId();
            String fullName2 = c17c.getFullName();
            ?? c1ow3 = new C1OW(A082);
            c1ow3.A02 = id2;
            c1ow3.A03 = z;
            c1ow3.A00 = c35199Ffr;
            c1ow3.A01 = fullName2;
            c1ow = c1ow3;
        }
        A012.A0B(c1ow);
        if (fragment != null) {
            fragmentActivity = fragment.getActivity();
        }
        C1Yn.A01(fragmentActivity, userSession, i);
    }

    public final void A02(UserSession userSession, List list, JSONObject jSONObject) {
        C14360o3.A0B(userSession, 0);
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            User A02 = AnonymousClass189.A00(userSession).A02(str);
            if (A02 != null) {
                hashMap.put(str, Boolean.valueOf(A02.CQf()));
                AbstractC34337FCf.A00(userSession, A02, true);
            } else {
                C0w9.A03("BulkBlockRequestManager", "User is missing from user cache");
            }
        }
        String str2 = null;
        if (jSONObject != null) {
            str2 = jSONObject.toString();
        }
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A05();
        c25621Ms.A0B("friendships/block_many/");
        c25621Ms.A9s("user_ids", TextUtils.join(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, list));
        c25621Ms.A0Q(new C56150OwG(new C07510aQ(userSession), new C36017FvF(userSession)));
        if (str2 != null) {
            c25621Ms.AA6("entrypoint", str2);
        }
        c25621Ms.A0R = true;
        C1ON A0N = c25621Ms.A0N();
        A0N.A00 = new C32479ESf(userSession, list, hashMap);
        C195218kN.A00(userSession).A06();
        C1GJ.A01().schedule(A0N);
    }
}
