package X;

import android.view.MotionEvent;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.LmA, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49022LmA implements C7Q6 {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final InterfaceC165417aU A02;

    @Override // X.C7Q6
    public final /* bridge */ /* synthetic */ boolean DT4(MotionEvent motionEvent, Object obj, Object obj2) {
        String str;
        String host;
        C7SZ c7sz = (C7SZ) obj;
        C3OO c3oo = (C3OO) obj2;
        boolean A1R = AbstractC167007dF.A1R(0, c7sz, c3oo);
        UserSession userSession = this.A01;
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36325214187041671L);
        C48513LdA A00 = AbstractC46706KlP.A00(this.A00, userSession);
        List list = c7sz.A04;
        int size = list.size();
        KTK ktk = (KTK) AbstractC001800i.A0J(list);
        if (ktk != null) {
            str = ktk.A02.A0L.A00;
        } else {
            str = null;
        }
        String str2 = c7sz.A03;
        C48513LdA.A00(A00, "stack", "tap", str, str2, size, A06);
        if (A06) {
            C7QY A01 = KTK.A01(list, 0);
            C9C9 c9c9 = A01.A08;
            android.net.Uri A0B = AbstractC25227BEk.A0B(c9c9.A01);
            List<String> pathSegments = A0B.getPathSegments();
            if (pathSegments.size() < 2 || !"reel".equalsIgnoreCase(AbstractC25226BEj.A1I(pathSegments, 0)) || (host = A0B.getHost()) == null || new C11L(".*instagram.*").A08(host) != A1R) {
                return false;
            }
            ((C7Zf) this.A02).Cqj(AbstractC31174DnI.A0A(AbstractC31171DnF.A06(c3oo)), null, null, A01.A0L, null, false, false, A0B.getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID), AbstractC31173DnH.A0s(pathSegments, A1R ? 1 : 0), null, null, null, null, C14360o3.A0K(userSession.userId, c9c9.A00));
        } else {
            String str3 = KTK.A01(list, 0).A0L.A00;
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str4 = KTK.A00(it).A0L.A02;
                if (str4 != null) {
                    A1E.add(str4);
                }
            }
            this.A02.Cqh(str2, str3, A1E);
        }
        return true;
    }

    public C49022LmA(InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC165417aU interfaceC165417aU) {
        this.A02 = interfaceC165417aU;
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
    }
}
