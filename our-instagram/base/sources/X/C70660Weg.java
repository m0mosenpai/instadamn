package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.Weg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70660Weg implements XCQ {
    public final int A00;
    public final Object A01;

    public C70660Weg(C68096VAq c68096VAq, int i) {
        this.A00 = i;
        this.A01 = c68096VAq;
    }

    @Override // X.XCQ
    public final void Dwe() {
        String str;
        switch (this.A00) {
            case 0:
                ((XA6) this.A01).onComplete();
                return;
            case 1:
                ((XCJ) this.A01).DFf();
                return;
            case 2:
                ((XCQ) this.A01).Dwe();
                return;
            case 3:
                C68096VAq c68096VAq = (C68096VAq) this.A01;
                BaseFragmentActivity baseFragmentActivity = c68096VAq.A01;
                str = "activity";
                if (baseFragmentActivity != null) {
                    C08790ch A00 = AbstractC018607g.A00(baseFragmentActivity);
                    BaseFragmentActivity baseFragmentActivity2 = c68096VAq.A01;
                    if (baseFragmentActivity2 != null) {
                        UserSession userSession = (UserSession) c68096VAq.A08.getValue();
                        Integer num = C05F.A0Y;
                        C70399WUb c70399WUb = c68096VAq.A02;
                        if (c70399WUb == null) {
                            str = "promotedPostsLogger";
                            break;
                        } else {
                            String str2 = c70399WUb.A03;
                            C14360o3.A07(str2);
                            C1GJ.A00(baseFragmentActivity, A00, AbstractC70133W6h.A00(baseFragmentActivity2, userSession, num, str2));
                            return;
                        }
                    }
                }
                break;
            case 4:
                VG4 vg4 = VG4.A1G;
                C68096VAq c68096VAq2 = (C68096VAq) this.A01;
                W8S.A00(vg4, (UserSession) c68096VAq2.A08.getValue(), "settings_business_options");
                BaseFragmentActivity baseFragmentActivity3 = c68096VAq2.A01;
                if (baseFragmentActivity3 == null) {
                    str = "activity";
                    break;
                } else {
                    C9GR.A0B(baseFragmentActivity3, "fetch_buat_failed");
                    return;
                }
            default:
                return;
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [X.42o, java.lang.Object] */
    @Override // X.XCQ
    public final void E65(String str) {
        String str2;
        switch (this.A00) {
            case 0:
                ((XA6) this.A01).onComplete();
                return;
            case 1:
                ((XCJ) this.A01).DqC(str);
                return;
            case 2:
                ((XCQ) this.A01).E65(str);
                return;
            case 3:
                C68096VAq c68096VAq = (C68096VAq) this.A01;
                C2JM c2jm = new C2JM();
                C0CA A0T = AbstractC25227BEk.A0T(GraphQlCallInput.A02, ((UserSession) c68096VAq.A08.getValue()).userId, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                C0CA.A00(A0T, "", "access_token");
                AbstractC31173DnH.A1M(A0T, c2jm.A00, "query_params");
                C907442n c907442n = new C907442n(c2jm, UN8.class, "TokenlessPromoteQuery", false);
                Context requireContext = c68096VAq.requireContext();
                AbstractC018607g abstractC018607g = c68096VAq.A00;
                if (abstractC018607g == null) {
                    str2 = "loaderManager";
                    break;
                } else {
                    ?? obj = new Object();
                    obj.A06 = str;
                    obj.A08(c907442n);
                    C1ON A04 = obj.A04();
                    A04.A00 = new C67949V3o(c68096VAq);
                    C1GJ.A00(requireContext, abstractC018607g, A04);
                    return;
                }
            case 4:
                C68096VAq c68096VAq2 = (C68096VAq) this.A01;
                C70399WUb c70399WUb = c68096VAq2.A02;
                if (c70399WUb == null) {
                    str2 = "promotedPostsLogger";
                    break;
                } else {
                    c70399WUb.A0T("settings_business_options", VG4.A1G.toString());
                    C69506Vpb c69506Vpb = WUX.A00;
                    C18920wW c18920wW = c68096VAq2.A03;
                    if (c18920wW == null) {
                        str2 = "logger";
                        break;
                    } else {
                        C25531Mh A00 = c69506Vpb.A00(c18920wW, c68096VAq2.A04, "fulcrum_nexus_enter_billing", "BPAT", c68096VAq2.A06);
                        A00.A0R(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "fulcrum_nexus");
                        A00.A0R("flow", "fulcrum_nexus_main");
                        A00.A0j("open");
                        A00.A0R("component", "fulcrum_nexus_open_billing_bpat");
                        A00.Cht();
                        BaseFragmentActivity baseFragmentActivity = c68096VAq2.A01;
                        if (baseFragmentActivity == null) {
                            str2 = "activity";
                            break;
                        } else {
                            VRN.A00(baseFragmentActivity, (UserSession) c68096VAq2.A08.getValue(), "settings_business_options");
                            return;
                        }
                    }
                }
            default:
                return;
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }

    public C70660Weg(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
