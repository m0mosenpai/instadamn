package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8Y5, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8Y5 {
    public boolean A00;
    public final Context A01;
    public final FragmentActivity A02;
    public final C8Y4 A03;
    public final UserSession A04;
    public final C40701ud A05;

    public C8Y5(Fragment fragment, C8Y4 c8y4, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(fragment, 2);
        this.A04 = userSession;
        this.A03 = c8y4;
        this.A05 = AbstractC40691uc.A01(userSession);
        this.A01 = fragment.requireContext();
        this.A02 = fragment.requireActivity();
    }

    public final void A04(C47Z c47z, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(c47z, 0);
        C2JO A00 = A00(this, c47z, false);
        C2JM c2jm = new C2JM();
        C2JM c2jm2 = new C2JM();
        c2jm.A00(A00, "input");
        C2JQ c2jq = PandoGraphQLRequest.Companion;
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC40511uK.A00(), "ValidateNewIgMediaForAdsEligibilityQuery", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), C59111QXr.class, false, null, 0, null, "validate_new_ig_media_for_ads_eligibility", new ArrayList());
        this.A05.ATV(new AXX(interfaceC16820sZ), new C55666Onr(this, c47z, interfaceC16820sZ), pandoGraphQLRequest);
    }

    public final void A05(C47Z c47z, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(c47z, 0);
        C2JO A00 = A00(this, c47z, true);
        C2JM c2jm = new C2JM();
        C2JM c2jm2 = new C2JM();
        c2jm.A00(A00, "input");
        C2JQ c2jq = PandoGraphQLRequest.Companion;
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC40511uK.A00(), "ValidateIGStoryMediaForBoostEligibilityQuery", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), C59107QXn.class, false, null, 0, null, "validate_ig_story_media_for_boost_eligibility", new ArrayList());
        this.A05.ATV(new AXY(interfaceC16820sZ), new C55663Ono(this, interfaceC16820sZ), pandoGraphQLRequest);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x026d A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.facebook.graphql.calls.GraphQlCallInput, X.2JO] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v4, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C2JO A00(X.C8Y5 r10, X.C47Z r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 755
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8Y5.A00(X.8Y5, X.47Z, boolean):X.2JO");
    }

    public final C47Z A03(CameraAREffect cameraAREffect, C1816783z c1816783z, List list, List list2, List list3) {
        C47Z A01;
        List list4 = list3;
        C14360o3.A0B(c1816783z, 0);
        EnumC198268pb A012 = c1816783z.A01();
        int ordinal = A012.ordinal();
        String str = null;
        if (ordinal != 0) {
            if (ordinal == 1) {
                C195868lW A04 = c1816783z.A01.A04();
                if (A04 != null) {
                    if (cameraAREffect != null) {
                        str = cameraAREffect.A0K;
                    }
                    C44059Jdk c44059Jdk = null;
                    A01 = AbstractC209399Nx.A02(String.valueOf(System.nanoTime()));
                    A01.A0H = A04.A0K;
                    A01.A0G = A04.A08;
                    String A05 = A04.A05();
                    if (A05 != null) {
                        str = A05;
                    }
                    A01.A2o = str;
                    boolean A042 = MY4.A04(A04.A0k);
                    int i = A04.A0K;
                    int i2 = A04.A08;
                    UserSession userSession = this.A04;
                    if (A042) {
                        c44059Jdk = new C44059Jdk(A04.A0k, 0, -3L, true);
                    }
                    A01.A0i(AbstractC16960so.A1N(C9O0.A00(userSession, A04, c44059Jdk, i, i2)));
                } else {
                    throw new IllegalStateException("activeCapturedVideo is null");
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown media type: ");
                sb.append(A012);
                throw new UnsupportedOperationException(sb.toString());
            }
        } else {
            C183978Ee A03 = c1816783z.A01.A03();
            if (A03 != null) {
                if (cameraAREffect != null) {
                    str = cameraAREffect.A0K;
                }
                A01 = AbstractC209399Nx.A01(String.valueOf(System.nanoTime()));
                A01.A0H = A03.A09;
                A01.A0G = A03.A06;
                String A052 = A03.A05();
                if (A052 != null) {
                    str = A052;
                }
                A01.A2o = str;
            } else {
                throw new IllegalStateException("activeCapturedPhoto is null");
            }
        }
        A01.A4C = list;
        C14360o3.A0B(list2, 0);
        A01.A4b = list2;
        if (list3 == null) {
            list4 = C16930sl.A00;
        }
        C14360o3.A0B(list4, 0);
        A01.A4Y = list4;
        return A01;
    }

    public static final String A01(C8Y5 c8y5, C8Y4 c8y4) {
        Context context;
        int i;
        int ordinal = c8y4.ordinal();
        if (ordinal != 2) {
            context = c8y5.A01;
            if (ordinal != 0) {
                i = 2131962472;
            } else {
                i = 2131974621;
            }
        } else {
            context = c8y5.A01;
            i = 2131971711;
        }
        String string = context.getString(i);
        C14360o3.A07(string);
        return string;
    }

    public static final String A02(C8Y5 c8y5, C8Y4 c8y4) {
        Context context;
        int i;
        int ordinal = c8y4.ordinal();
        if (ordinal != 2) {
            context = c8y5.A01;
            if (ordinal != 0) {
                i = 2131962473;
            } else {
                i = 2131974622;
            }
        } else {
            context = c8y5.A01;
            i = 2131971712;
        }
        String string = context.getString(i);
        C14360o3.A07(string);
        return string;
    }
}
