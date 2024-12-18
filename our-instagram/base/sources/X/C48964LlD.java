package X;

import android.content.Context;
import android.graphics.PointF;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams;
import com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.LlD, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48964LlD implements InterfaceC162527Pp {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC162527Pp
    public final /* bridge */ /* synthetic */ InterfaceC66482zP AWm(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C7VC c7vc, C7IM c7im, C18A c18a, boolean z) {
        C7SZ A03;
        String str;
        boolean z2;
        PrivacyMediaOverlayViewModel privacyMediaOverlayViewModel;
        C158737Aj c158737Aj;
        C160787Im c160787Im = (C160787Im) c7vc;
        C14360o3.A0B(context, 0);
        AbstractC167017dG.A1P(userSession, c18a);
        int i = 3;
        AbstractC167007dF.A1F(c7im, 3, c160787Im);
        C14360o3.A0B(anonymousClass988, 5);
        C1583378t c1583378t = null;
        C7SV c7sv = C7SV.A00;
        C17050sx A01 = AbstractC09440dt.A01(c7sv);
        C83403nh c83403nh = c160787Im.A0e;
        C7QL A032 = C7QK.A03(userSession, anonymousClass988, c160787Im, c7im, c83403nh.A10, A01);
        Object obj = c83403nh.A1T;
        if (obj instanceof C7Q4) {
            C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.model.direct.DirectPendingMedia");
            ArrayList A1E = AbstractC166987dD.A1E();
            C47Z A033 = C25A.A00(userSession).A03(((C7Q4) obj).A06);
            C76T A00 = C76S.A00(context, userSession);
            C7QL A034 = C7QK.A03(userSession, anonymousClass988, c160787Im, c7im, c83403nh.A10, AbstractC09440dt.A01(c7sv));
            if (A033 != null) {
                Iterator it = A033.A0K().iterator();
                while (it.hasNext()) {
                    C7Q4 A002 = AbstractC47064KrL.A00(AbstractC43592JPx.A0l(it));
                    String str2 = A002.A08;
                    DirectThreadAnalyticsParams A0V = JQ0.A0V(c160787Im, c83403nh, A033.A5D ? 1 : 0);
                    int A012 = c160787Im.A01();
                    String str3 = A002.A06;
                    if (AbstractC47014KqX.A00(userSession, c83403nh, str3) && JUW.A01(userSession)) {
                        z2 = true;
                        privacyMediaOverlayViewModel = JQ0.A0W(context, AbstractC47014KqX.A00(userSession, c83403nh, str3) ? 1 : 0);
                        A012 = 2;
                        if (AbstractC47014KqX.A00(userSession, c83403nh, str3)) {
                            A012 = 1;
                        }
                    } else {
                        z2 = false;
                        privacyMediaOverlayViewModel = null;
                    }
                    boolean A05 = A002.A05();
                    C7TT c7tt = c160787Im.A0G;
                    C158797Aq A04 = A00.A04(c83403nh, null, A002, AbstractC160897Ix.A00(c7tt), false, c7tt.A0N.A08);
                    DirectMessageIdentifier A0V2 = c83403nh.A0V();
                    String str4 = c83403nh.A1u;
                    C14360o3.A07(str4);
                    C9C9 c9c9 = new C9C9("", str4, 5);
                    EnumC910243u enumC910243u = EnumC910243u.SINGLE;
                    if (!A002.A05()) {
                        c158737Aj = new C158737Aj(AbstractC43593JPy.A0Q(A002.A03()), false, AbstractC25227BEk.A0m(), null, null, null, null, null, null, null);
                    } else if (str2 != null) {
                        c158737Aj = new C158737Aj(AbstractC43593JPy.A0Q(str2), false, AbstractC25227BEk.A0m(), null, null, null, null, null, null, null);
                    } else {
                        c158737Aj = null;
                    }
                    A1E.add(new KTK(A04, new C7QY(null, null, null, c9c9, null, null, null, null, AbstractC43592JPx.A0d(context, userSession, anonymousClass988, c160787Im, c83403nh), A034, null, null, c158737Aj, null, null, null, enumC910243u, null, A0V2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, false, false, false, false, false, false, false, false, false, false), A0V, privacyMediaOverlayViewModel, A012, A05, false, z2, false));
                }
            }
            DirectMessageIdentifier A0V3 = c83403nh.A0V();
            InterfaceC83733oI interfaceC83733oI = c160787Im.A0G.A0P;
            if (interfaceC83733oI != null) {
                str = AbstractC1345466e.A07(interfaceC83733oI);
            } else {
                str = null;
            }
            A03 = new C7SZ(null, null, A0V3, str, A1E, MHU.A00(context, A034, 2), c160787Im.A0G.A08, 2, false, false, true);
        } else {
            C7M5 c7m5 = new C7M5(userSession);
            C7TT c7tt2 = c160787Im.A0G;
            InterfaceC83733oI interfaceC83733oI2 = c7tt2.A0P;
            if (interfaceC83733oI2 != null) {
                c7m5.A02(c83403nh, interfaceC83733oI2, c7tt2.A08);
            }
            A03 = new C1582378i(c1583378t, null == true ? 1 : 0, null == true ? 1 : 0, i).A03(context, userSession, A032, anonymousClass988, c160787Im, false);
        }
        PointF pointF = new PointF(AbstractC43594JPz.A03(context), AbstractC166987dD.A04(context.getResources(), R.dimen.clips_editor_v3_timeline_transition_selector_margin_negative));
        String A0k = JQ0.A0k(userSession, c83403nh, z);
        C14360o3.A0A(A0k);
        return new KVE(C7QZ.A01(context, pointF, userSession, anonymousClass988, c160787Im, c7im, c18a), A03, A0k);
    }
}
