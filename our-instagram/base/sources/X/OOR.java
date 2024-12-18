package X;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.CreationSession;
import com.instagram.pendingmedia.model.constants.ShareType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes9.dex */
public abstract class OOR {
    public static void A00(Fragment fragment, UserSession userSession, AnonymousClass840 anonymousClass840, C47Z c47z, String str) {
        float A01;
        String str2;
        if (!c47z.A0t()) {
            C19280xC A00 = AbstractC31718DwN.A00(C05F.A0A);
            if (c47z.A11()) {
                str2 = MediaStreamTrack.VIDEO_TRACK_KIND;
            } else {
                str2 = "image";
            }
            A00.A0C("media_type", str2);
            A00.A09("is_draft", true);
            A00.A0C("bucket_name", c47z.A3J);
            AbstractC31173DnH.A1S(A00, userSession);
        }
        if (c47z.A0D() == ShareType.A09) {
            AnonymousClass229.A01(userSession).A1s(c47z.A3t);
            String A0t = AbstractC166997dE.A0t(userSession);
            C183348Bh A002 = AbstractC183338Bg.A00(userSession);
            if (A0t == null) {
                A0t = "";
            }
            A002.A0H(A0t);
            AnonymousClass229.A01(userSession);
            A0J.A00(fragment.requireContext(), userSession, C05F.A1F).A02(fragment.getViewLifecycleOwner(), c47z.A3t, new JWS(userSession, 2));
            C77453dV.A04(fragment.requireActivity(), fragment, userSession, null, c47z.A3t, str, false, false);
            return;
        }
        AnonymousClass841 A003 = anonymousClass840.A00();
        CreationSession creationSession = ((MX5) A003).A01;
        creationSession.A06();
        creationSession.A02 = c47z.A0K;
        creationSession.A0I = true;
        ArrayList A1E = AbstractC166987dD.A1E();
        if (c47z.A0t()) {
            A003.EPV(c47z.A35);
            C47Z A03 = C25A.A00(userSession).A03(AbstractC25226BEj.A1I(c47z.A0L(), 0));
            A03.getClass();
            if (A03.A11()) {
                A01 = A03.A02;
            } else {
                A01 = A03.A01();
            }
            creationSession.A00 = A01;
            Iterator it = c47z.A0L().iterator();
            while (it.hasNext()) {
                C47Z A0h = AbstractC43593JPy.A0h(userSession, AbstractC166987dD.A1B(it));
                if (A0h != null) {
                    A1E.add(A0h);
                }
            }
        } else {
            A1E.add(c47z);
        }
        Iterator it2 = A1E.iterator();
        while (it2.hasNext()) {
            C47Z A0l = AbstractC43592JPx.A0l(it2);
            String str3 = A0l.A3Z;
            if (str3 != null) {
                boolean A11 = A0l.A11();
                String str4 = A0l.A3M;
                if (A11) {
                    A003.A9Y(str3, str4, true);
                    A003.EPt(A0l.A02);
                } else {
                    A003.A9Y(str3, str4, false);
                    A003.ESV(A0l.A06(), A0l.A0H, A0l.A0G);
                    creationSession.A05 = A0l.A15;
                    A003.ETx(A0l.A08);
                }
                A003.Eab(A0l.A35);
            }
        }
        List A05 = creationSession.A05();
        C14360o3.A07(A05);
        Iterator it3 = A05.iterator();
        while (it3.hasNext()) {
            MSW.A0R(it3).EYz(creationSession.A02);
        }
        C50695MZq.A00(userSession, new C52499NKs());
    }

    public static void A01(UserSession userSession, C47Z c47z) {
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = c47z.A0L().iterator();
        while (it.hasNext()) {
            C47Z A0h = AbstractC43593JPy.A0h(userSession, AbstractC166987dD.A1B(it));
            if (A0h != null) {
                String str = A0h.A30;
                if (!TextUtils.isEmpty(str)) {
                    A1E.add(str);
                }
            }
        }
        List list = AbstractC43847JaB.A00(userSession).A03;
        list.clear();
        list.addAll(A1E);
    }
}
