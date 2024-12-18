package X;

import androidx.fragment.app.Fragment;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.3Cb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69923Cb {
    public static final void A00() {
        C3CZ.A0B = null;
        C3CZ.A0C = null;
        C3CZ.A0D = null;
        C3CZ.A0E = null;
    }

    public static final void A01(Fragment fragment, AbstractC10360h2 abstractC10360h2) {
        C0SG c0sg;
        C14360o3.A0B(fragment, 0);
        C14360o3.A0B(abstractC10360h2, 1);
        if (fragment.mView != null && (c0sg = (C0SG) abstractC10360h2.A0Q(ReactProgressBarViewManager.PROP_PROGRESS)) != null) {
            c0sg.A08();
        }
    }

    public static final void A02(Fragment fragment, AbstractC10360h2 abstractC10360h2) {
        C14360o3.A0B(fragment, 0);
        C14360o3.A0B(abstractC10360h2, 1);
        if (fragment.isResumed() && !abstractC10360h2.A0G && abstractC10360h2.A0Q(ReactProgressBarViewManager.PROP_PROGRESS) == null) {
            new C67858Uzp().A0B(abstractC10360h2, ReactProgressBarViewManager.PROP_PROGRESS);
        }
    }

    public static final void A03(InterfaceC114785Gl interfaceC114785Gl, UserSession userSession, String str) {
        C3CZ.A0G = false;
        HashMap hashMap = new HashMap();
        String str2 = C3CZ.A0D;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        hashMap.put(AbstractC111324zv.A00(941), str2);
        String str4 = C3CZ.A0E;
        if (str4 != null) {
            str3 = str4;
        }
        hashMap.put("tool_name", str3);
        if (str != null) {
            hashMap.put(TraceFieldType.ErrorCode, str);
        }
        EnumC69993Ci enumC69993Ci = C3CZ.A0B;
        String str5 = userSession.userId;
        C14360o3.A0B(str5, 0);
        AbstractC003100w.A0k(10, str5);
        AbstractC31719DwO.A00(enumC69993Ci, userSession, "profile_picture_updated", "photo_editing", C3CZ.A0C, null, hashMap);
        if (interfaceC114785Gl != null) {
            interfaceC114785Gl.FAY(C3CZ.A0A);
        }
        A00();
    }
}
