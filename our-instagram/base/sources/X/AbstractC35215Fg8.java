package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;

/* renamed from: X.Fg8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35215Fg8 {
    public static void A00(InterfaceC02590Ai interfaceC02590Ai, C0Zx c0Zx, long j) {
        c0Zx.A05(PublicKeyCredentialControllerUtility.JSON_KEY_ID, Long.valueOf(j));
        c0Zx.A03("is_fbid", false);
        interfaceC02590Ai.AAQ(c0Zx, AbstractC111324zv.A00(2845));
        interfaceC02590Ai.AAP(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, null);
    }

    public static final void A01(EnumC223459tc enumC223459tc, EnumC223399tW enumC223399tW, UserSession userSession, String str, int i) {
        long j;
        Long A0j;
        AbstractC167007dF.A1E(userSession, 0, enumC223459tc);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31176DnK.A0O(userSession, AbstractC43591JPw.A00(926)), "mwb_actor_experience_event");
        if (A0f.isSampled()) {
            AbstractC166997dE.A1N(A0f, "action", i);
            A0f.A8R(enumC223459tc, "restriction_type");
            AbstractC31171DnF.A1E(A0f, AbstractC111324zv.A00(2476));
            C0Zx c0Zx = new C0Zx();
            if (str != null && (A0j = AbstractC166997dE.A0j(str)) != null) {
                j = A0j.longValue();
            } else {
                j = -1;
            }
            A00(A0f, c0Zx, j);
            A0f.A8R(enumC223399tW, AbstractC111324zv.A00(4716));
            A0f.Cht();
        }
    }

    public static final void A02(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str) {
        long j;
        Long A0j;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31172DnG.A0Q(interfaceC11380iw, userSession, 0), "mwb_actor_experience_event");
        if (A0f.isSampled()) {
            AbstractC166997dE.A1N(A0f, "action", 13);
            A0f.A8R(EnumC223459tc.A0D, "restriction_type");
            AbstractC31171DnF.A1E(A0f, "forwarding_sheet");
            C0Zx c0Zx = new C0Zx();
            if (str != null && (A0j = AbstractC166997dE.A0j(str)) != null) {
                j = A0j.longValue();
            } else {
                j = -1;
            }
            A00(A0f, c0Zx, j);
            A0f.Cht();
        }
    }

    public static final void A03(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, boolean z) {
        String str2;
        long j;
        Long A0j;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31172DnG.A0Q(interfaceC11380iw, userSession, 0), "mwb_actor_experience_event");
        if (A0f.isSampled()) {
            AbstractC166997dE.A1N(A0f, "action", 13);
            A0f.A8R(EnumC223459tc.A0U, "restriction_type");
            if (z) {
                str2 = "forwarding_sheet";
            } else {
                str2 = "reshare_sheet";
            }
            AbstractC31171DnF.A1E(A0f, str2);
            C0Zx c0Zx = new C0Zx();
            if (str != null && (A0j = AbstractC166997dE.A0j(str)) != null) {
                j = A0j.longValue();
            } else {
                j = -1;
            }
            A00(A0f, c0Zx, j);
            A0f.Cht();
        }
    }

    public static final void A04(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, boolean z) {
        String str2;
        long j;
        Long A0j;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31172DnG.A0Q(interfaceC11380iw, userSession, 0), "mwb_actor_experience_event");
        if (A0f.isSampled()) {
            AbstractC166997dE.A1N(A0f, "action", 13);
            A0f.A8R(EnumC223459tc.A0J, "restriction_type");
            if (z) {
                str2 = "forwarding_sheet";
            } else {
                str2 = "reshare_sheet";
            }
            AbstractC31171DnF.A1E(A0f, str2);
            C0Zx c0Zx = new C0Zx();
            if (str != null && (A0j = AbstractC166997dE.A0j(str)) != null) {
                j = A0j.longValue();
            } else {
                j = -1;
            }
            A00(A0f, c0Zx, j);
            A0f.Cht();
        }
    }
}
