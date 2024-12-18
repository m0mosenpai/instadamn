package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.forker.Process;
import com.instagram.challenge.activity.ChallengeActivity;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.urlhandlers.brandedcontent.BrandedContentUrlHandlerActivity;

/* renamed from: X.EOu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32393EOu extends AbstractC193068gm {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C32393EOu(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj3;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public static void A00(AbstractC192798gL abstractC192798gL, Object obj, Object obj2, Object obj3, int i) {
        abstractC192798gL.A00(new C32393EOu(i, obj, obj2, obj3));
    }

    @Override // X.AbstractC192848gQ
    public final void A01() {
        Object obj;
        switch (this.A00) {
            case 10:
                obj = this.A02;
                break;
            case 17:
                obj = this.A01;
                break;
            case 18:
                ((C34673FPi) this.A03).A00 = false;
                return;
            default:
                super.A01();
                return;
        }
        AbstractC31171DnF.A1N(obj);
    }

    @Override // X.AbstractC192848gQ
    public final void A02() {
        if (7 - this.A00 != 0) {
            super.A02();
        } else {
            C0fJ.A00(((V01) this.A02).A08);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.AbstractC192848gQ
    public final void A03(AbstractC115105If abstractC115105If) {
        Context context;
        String str;
        int i;
        Throwable cause;
        InterfaceC16820sZ interfaceC16820sZ;
        switch (this.A00) {
            case 1:
                C006802i.A0p.markerEnd(39124996, (short) 3);
                C9GR.A07((Context) this.A01, 2131961896);
                return;
            case 2:
                C70816WhZ.A01(C67908V1x.A00, VRD.A00((UserSession) this.A03), "launch_posm_1_from_native_failed");
                return;
            case 3:
                G06 g06 = (G06) this.A01;
                g06.A02 = false;
                Throwable A01 = abstractC115105If.A01();
                if (A01 != null) {
                    C0w9.A06("CheckpointManagerImpl", "Failed to get bloks challenge", A01);
                } else {
                    C0w9.A03("CheckpointManagerImpl", "Failed to get bloks challenge");
                }
                FNM fnm = (FNM) this.A02;
                if (fnm == null) {
                    return;
                }
                G06.A00((Context) this.A03, g06, fnm);
                return;
            case 4:
                C14360o3.A0B(abstractC115105If, 0);
                ((Runnable) this.A02).run();
                ((FQ2) this.A03).A02.clear();
                Throwable A012 = abstractC115105If.A01();
                if (A012 != null) {
                    C0w9.A06("MinorEducationFlowController", "Unable to fetch bloks action for Joiner Transparency", A012);
                    return;
                } else {
                    C0w9.A03("MinorEducationFlowController", "Unable to fetch bloks action for Joiner Transparency");
                    return;
                }
            case 5:
                C9GR.A0B((Context) this.A01, "something_went_wrong");
                return;
            case 6:
                C14360o3.A0B(abstractC115105If, 0);
                Context A06 = AbstractC31172DnG.A06(this.A01);
                if (A06 != null) {
                    C9GR.A03(A06, A06.getString(2131968430), "network_error", 0);
                }
                Throwable A013 = abstractC115105If.A01();
                if (A013 == null || (cause = A013.getCause()) == null) {
                    return;
                }
                C0w9.A07(((InterfaceC11380iw) this.A02).getModuleName(), cause);
                return;
            case 7:
                if (!((Fragment) this.A03).isResumed()) {
                    return;
                }
                V01 v01 = (V01) this.A02;
                C9GR.A05(v01.requireContext());
                v01.A08.dismiss();
                return;
            case 8:
            case 9:
                AbstractC35254Fgn.A01((Context) this.A01);
                return;
            case 10:
            case 16:
            default:
                return;
            case 11:
                interfaceC16820sZ = ((C54985OTt) this.A01).A01;
                if (interfaceC16820sZ == null) {
                    return;
                }
                interfaceC16820sZ.invoke();
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                ((C35016Fbp) this.A02).A00.markerEnd(857808852, (short) 3);
                interfaceC16820sZ = ((GGU) this.A03).A00;
                interfaceC16820sZ.invoke();
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                ((C33227ElJ) this.A03).A04 = false;
                AbstractC34209F7h.A00().A01((Window) this.A02);
                return;
            case 14:
                HD9 hd9 = (HD9) this.A03;
                C41762Ied c41762Ied = hd9.A03;
                if (c41762Ied == null) {
                    AbstractC31171DnF.A0s();
                    throw C00O.createAndThrow();
                }
                C19280xC A00 = C41762Ied.A00(c41762Ied, "onboarding_navigation_request_completed");
                A00.A0B(AbstractC111324zv.A00(476), AbstractC31173DnH.A0g());
                A00.A0C("network_result", OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE);
                C41762Ied.A05(A00, c41762Ied);
                IgdsBottomButtonLayout igdsBottomButtonLayout = hd9.A01;
                if (igdsBottomButtonLayout != null) {
                    igdsBottomButtonLayout.setPrimaryButtonEnabled(true);
                }
                context = (Context) this.A01;
                str = "in_app_sign_up_failed";
                i = 2131970016;
                C9GR.A0F(context, str, i);
                return;
            case Process.SIGTERM /* 15 */:
                context = (Context) this.A01;
                str = "branded_content_tools_error";
                i = 2131954218;
                C9GR.A0F(context, str, i);
                return;
            case 17:
                C14360o3.A0B(abstractC115105If, 0);
                Throwable A014 = abstractC115105If.A01();
                if (A014 != null) {
                    C0w9.A06("INFO_CENTER_FACT", "Failed to load consent flow", A014);
                } else {
                    C0w9.A03("INFO_CENTER_FACT", "Failed to load consent flow");
                }
                ((AbstractC10360h2) this.A02).A0b();
                return;
            case 18:
                C9GR.A0A((Context) this.A01, "bloks_bottom_sheet_error");
                return;
            case Process.SIGSTOP /* 19 */:
                C9GR.A03((Context) this.A01, "error", "error", 0);
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.AbstractC192848gQ
    public final /* bridge */ /* synthetic */ void A04(Object obj) {
        C66246U5q c66246U5q;
        Object obj2;
        int i;
        C62862tP A0G;
        AbstractC12990ll abstractC12990ll;
        Object obj3;
        AbstractC12990ll abstractC12990ll2;
        FragmentActivity fragmentActivity;
        InterfaceC11380iw interfaceC11380iw;
        switch (this.A00) {
            case 0:
                c66246U5q = (C66246U5q) obj;
                ((InterfaceC37222GaX) this.A02).AGf();
                obj2 = this.A03;
                A0G = (C62862tP) obj2;
                AbstractC33787EwD.A00(A0G, c66246U5q);
                return;
            case 1:
                c66246U5q = AbstractC31175DnJ.A0E(obj);
                obj2 = this.A02;
                A0G = (C62862tP) obj2;
                AbstractC33787EwD.A00(A0G, c66246U5q);
                return;
            case 2:
                c66246U5q = AbstractC31175DnJ.A0E(obj);
                UserSession userSession = (UserSession) this.A03;
                C70816WhZ.A01(C67908V1x.A00, VRD.A00(userSession), "launch_posm_1_from_native_success");
                FragmentActivity fragmentActivity2 = (FragmentActivity) this.A01;
                switch (AbstractC166987dD.A0H(this.A02)) {
                    case 0:
                        i = 2928;
                        break;
                    case 1:
                        i = 259;
                        break;
                    case 2:
                        i = 344;
                        break;
                    case 3:
                        i = 1182;
                        break;
                    default:
                        i = 501;
                        break;
                }
                A0G = AbstractC31178DnM.A0G(fragmentActivity2, userSession, AbstractC111324zv.A00(i));
                AbstractC33787EwD.A00(A0G, c66246U5q);
                return;
            case 3:
                G06 g06 = (G06) this.A01;
                g06.A02 = false;
                if (!g06.A03 || g06.A04) {
                    return;
                }
                AbstractC12990ll abstractC12990ll3 = g06.A06;
                if (abstractC12990ll3.hasEnded()) {
                    return;
                }
                g06.A04 = true;
                g06.A05 = false;
                Bundle A0b = AbstractC166987dD.A0b();
                A0b.putInt("ChallengeFragment.bloksAction", U6N.A00(abstractC12990ll3).A01(obj));
                String token = abstractC12990ll3.getToken();
                C14360o3.A0B(token, 0);
                Context context = (Context) this.A03;
                C14360o3.A0B(context, 0);
                Intent intent = new Intent(context, (Class<?>) ChallengeActivity.class);
                intent.addFlags(805306368);
                AbstractC31179DnN.A0k(intent, AbstractC166987dD.A0b(), A0b, "bloks", token);
                try {
                    C12260kU.A0C(context, intent);
                    return;
                } catch (IllegalStateException e) {
                    C0w9.A07(AbstractC111324zv.A00(296), e);
                    return;
                }
            case 4:
                c66246U5q = AbstractC31175DnJ.A0E(obj);
                abstractC12990ll = ((FQ2) this.A03).A00;
                obj3 = this.A01;
                A0G = AbstractC31172DnG.A0N((Fragment) obj3, abstractC12990ll);
                AbstractC33787EwD.A00(A0G, c66246U5q);
                return;
            case 5:
                c66246U5q = AbstractC31175DnJ.A0E(obj);
                abstractC12990ll2 = ((FGZ) this.A03).A00;
                fragmentActivity = (FragmentActivity) this.A01;
                interfaceC11380iw = (InterfaceC11380iw) this.A02;
                A0G = AbstractC31172DnG.A0O(fragmentActivity, interfaceC11380iw, abstractC12990ll2);
                AbstractC33787EwD.A00(A0G, c66246U5q);
                return;
            case 6:
                c66246U5q = AbstractC31175DnJ.A0E(obj);
                abstractC12990ll2 = (AbstractC12990ll) this.A03;
                fragmentActivity = AbstractC31172DnG.A0C(this.A01);
                interfaceC11380iw = (InterfaceC11380iw) this.A02;
                A0G = AbstractC31172DnG.A0O(fragmentActivity, interfaceC11380iw, abstractC12990ll2);
                AbstractC33787EwD.A00(A0G, c66246U5q);
                return;
            case 7:
                c66246U5q = AbstractC31175DnJ.A0E(obj);
                if (!((Fragment) this.A03).isResumed()) {
                    return;
                }
                ((V01) this.A02).A08.dismiss();
                obj2 = this.A01;
                A0G = (C62862tP) obj2;
                AbstractC33787EwD.A00(A0G, c66246U5q);
                return;
            case 8:
            case 9:
            default:
                c66246U5q = AbstractC31175DnJ.A0E(obj);
                FTX.A00((AbstractC12990ll) this.A03);
                A0G = (C62862tP) this.A02;
                A0G.A00 = true;
                AbstractC33787EwD.A00(A0G, c66246U5q);
                return;
            case 10:
                c66246U5q = (C66246U5q) obj;
                obj2 = this.A03;
                A0G = (C62862tP) obj2;
                AbstractC33787EwD.A00(A0G, c66246U5q);
                return;
            case 11:
                c66246U5q = AbstractC31175DnJ.A0E(obj);
                abstractC12990ll = (AbstractC12990ll) this.A03;
                obj3 = this.A02;
                A0G = AbstractC31172DnG.A0N((Fragment) obj3, abstractC12990ll);
                AbstractC33787EwD.A00(A0G, c66246U5q);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                AbstractC33787EwD.A00((C62862tP) this.A01, AbstractC31175DnJ.A0E(obj));
                ((GGU) this.A03).A00.invoke();
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                c66246U5q = (C66246U5q) obj;
                C14360o3.A0B(c66246U5q, 0);
                ((C33227ElJ) this.A03).A04 = false;
                AbstractC34209F7h.A00().A01((Window) this.A02);
                obj2 = this.A01;
                A0G = (C62862tP) obj2;
                AbstractC33787EwD.A00(A0G, c66246U5q);
                return;
            case 14:
                C66246U5q A0E = AbstractC31175DnJ.A0E(obj);
                HD9 hd9 = (HD9) this.A03;
                C41762Ied c41762Ied = hd9.A03;
                if (c41762Ied == null) {
                    AbstractC31171DnF.A0s();
                    throw C00O.createAndThrow();
                }
                C19280xC A00 = C41762Ied.A00(c41762Ied, "onboarding_navigation_request_completed");
                A00.A0B(AbstractC111324zv.A00(476), AbstractC31173DnH.A0g());
                A00.A0C("network_result", "success");
                C41762Ied.A05(A00, c41762Ied);
                AbstractC33787EwD.A00((C62862tP) this.A02, A0E);
                IgdsBottomButtonLayout igdsBottomButtonLayout = hd9.A01;
                if (igdsBottomButtonLayout == null) {
                    return;
                }
                igdsBottomButtonLayout.setPrimaryButtonEnabled(true);
                return;
            case Process.SIGTERM /* 15 */:
                c66246U5q = AbstractC31175DnJ.A0E(obj);
                abstractC12990ll2 = (AbstractC12990ll) this.A02;
                fragmentActivity = (FragmentActivity) this.A01;
                interfaceC11380iw = (BrandedContentUrlHandlerActivity) this.A03;
                A0G = AbstractC31172DnG.A0O(fragmentActivity, interfaceC11380iw, abstractC12990ll2);
                AbstractC33787EwD.A00(A0G, c66246U5q);
                return;
            case 16:
                c66246U5q = AbstractC31175DnJ.A0E(obj);
                abstractC12990ll2 = (AbstractC12990ll) this.A03;
                fragmentActivity = (FragmentActivity) this.A02;
                interfaceC11380iw = (C19270xB) this.A01;
                A0G = AbstractC31172DnG.A0O(fragmentActivity, interfaceC11380iw, abstractC12990ll2);
                AbstractC33787EwD.A00(A0G, c66246U5q);
                return;
            case 17:
                c66246U5q = AbstractC31175DnJ.A0E(obj);
                obj2 = this.A03;
                A0G = (C62862tP) obj2;
                AbstractC33787EwD.A00(A0G, c66246U5q);
                return;
            case 18:
                c66246U5q = AbstractC31175DnJ.A0E(obj);
                abstractC12990ll = ((C34673FPi) this.A03).A01;
                obj3 = this.A02;
                A0G = AbstractC31172DnG.A0N((Fragment) obj3, abstractC12990ll);
                AbstractC33787EwD.A00(A0G, c66246U5q);
                return;
            case Process.SIGSTOP /* 19 */:
                C66246U5q A0E2 = AbstractC31175DnJ.A0E(obj);
                try {
                    AbstractC33787EwD.A00(AbstractC31172DnG.A0N((Fragment) this.A02, (AbstractC12990ll) this.A03), A0E2);
                    return;
                } catch (IllegalStateException unused) {
                    C18950wb.A01.AEp("QM Bloks Action failed - IllegalState", 817892914);
                    return;
                }
            case 20:
                c66246U5q = AbstractC31175DnJ.A0E(obj);
                abstractC12990ll2 = (AbstractC12990ll) this.A03;
                Activity activity = (Activity) this.A01;
                AbstractC31171DnF.A1P(activity);
                fragmentActivity = (FragmentActivity) activity;
                interfaceC11380iw = (AbstractC59962oe) this.A02;
                A0G = AbstractC31172DnG.A0O(fragmentActivity, interfaceC11380iw, abstractC12990ll2);
                AbstractC33787EwD.A00(A0G, c66246U5q);
                return;
        }
    }
}
