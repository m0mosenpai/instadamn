package X;

import android.app.Dialog;
import android.content.Context;
import android.os.Handler;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.realtimeclient.RealtimeSubscription;
import instagram.features.clips.edit.ClipsEditMetadataController;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.EOv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32394EOv extends AbstractC193068gm {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C32394EOv(AbstractC59962oe abstractC59962oe, C62862tP c62862tP, int i) {
        this.A00 = i;
        if (4 - i != 0) {
            this.A02 = abstractC59962oe;
            this.A01 = c62862tP;
        } else {
            this.A02 = c62862tP;
            this.A01 = abstractC59962oe;
        }
    }

    public static void A00(AbstractC192798gL abstractC192798gL, Object obj, Object obj2, int i) {
        abstractC192798gL.A00(new C32394EOv(i, obj, obj2));
    }

    @Override // X.AbstractC192848gQ
    public final void A01() {
        Dialog dialog;
        switch (this.A00) {
            case 4:
                AbstractC41766Iei.A00 = false;
                return;
            case 5:
            case 6:
            case 14:
                dialog = (Dialog) this.A02;
                break;
            case 10:
                dialog = (Dialog) this.A01;
                if (dialog == null) {
                    return;
                }
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                ((FMM) this.A01).A00 = false;
                return;
            case 17:
                C55052Oa3.A00 = false;
                return;
            case 22:
                ((C0SG) this.A01).A08();
                return;
            default:
                super.A01();
                return;
        }
        dialog.dismiss();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01cc  */
    @Override // X.AbstractC192848gQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(X.AbstractC115105If r8) {
        /*
            Method dump skipped, instructions count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32394EOv.A03(X.5If):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.AbstractC192848gQ
    public final /* bridge */ /* synthetic */ void A04(Object obj) {
        C66246U5q A0E;
        C62862tP A02;
        AbstractC12990ll abstractC12990ll;
        Fragment fragment;
        Object obj2;
        switch (this.A00) {
            case 1:
                A0E = AbstractC31175DnJ.A0E(obj);
                A02 = C62862tP.A02((Fragment) this.A01, AbstractC31171DnF.A0D("pro_to_pro.framework.async.controller.entry"), (AbstractC12990ll) this.A02, null);
                AbstractC33787EwD.A00(A02, A0E);
                return;
            case 2:
                AbstractC33787EwD.A00((C62862tP) this.A01, AbstractC31175DnJ.A0E(obj));
                ((EKO) this.A02).A01 = true;
                return;
            case 3:
                AbstractC33787EwD.A00((C62862tP) this.A01, AbstractC31175DnJ.A0E(obj));
                AbstractC35025Fby abstractC35025Fby = (AbstractC35025Fby) this.A02;
                if (abstractC35025Fby instanceof Ef2) {
                    abstractC35025Fby.A03();
                    return;
                }
                Ef3 ef3 = (Ef3) abstractC35025Fby;
                G04.A00(ef3.A01, "initial_async_controller_request_success", "", ef3.A05, AbstractC166987dD.A1G());
                ef3.A00.markerPoint(444800256, "initial_async_controller_request_success");
                return;
            case 4:
                A0E = AbstractC31175DnJ.A0E(obj);
                obj2 = this.A02;
                A02 = (C62862tP) obj2;
                AbstractC33787EwD.A00(A02, A0E);
                return;
            case 5:
            case 6:
                A0E = (C66246U5q) obj;
                C31250DoY c31250DoY = (C31250DoY) this.A01;
                abstractC12990ll = c31250DoY.A0A;
                fragment = c31250DoY.A07;
                A02 = AbstractC31172DnG.A0N(fragment, abstractC12990ll);
                AbstractC33787EwD.A00(A02, A0E);
                return;
            case 7:
                C66246U5q c66246U5q = (C66246U5q) obj;
                C14360o3.A0B(c66246U5q, 0);
                C35229FgM c35229FgM = (C35229FgM) this.A02;
                AtomicBoolean atomicBoolean = c35229FgM.A0F;
                if (atomicBoolean.get()) {
                    atomicBoolean.compareAndSet(true, false);
                    return;
                }
                Handler handler = c35229FgM.A0A;
                handler.removeCallbacks(c35229FgM.A0E);
                C006802i c006802i = c35229FgM.A04;
                if (c006802i == null) {
                    C14360o3.A0F("qpl");
                    throw C00O.createAndThrow();
                }
                c006802i.markerPoint(896612552, 0, AnonymousClass001.A0R(AbstractC111324zv.A00(1070), RealtimeSubscription.GRAPHQL_MQTT_VERSION));
                AbstractC33787EwD.A00((C62862tP) this.A01, c66246U5q);
                boolean z = c35229FgM.A06;
                if (z) {
                    handler.postDelayed(new GM4(c35229FgM), 1000L);
                } else {
                    C34571FLg c34571FLg = c35229FgM.A01;
                    c34571FLg.A02.post(new GKV(c34571FLg));
                }
                C35229FgM.A03(c35229FgM, z);
                return;
            case 8:
                A0E = AbstractC31175DnJ.A0E(obj);
                abstractC12990ll = (AbstractC12990ll) this.A02;
                fragment = (Fragment) this.A01;
                A02 = AbstractC31172DnG.A0N(fragment, abstractC12990ll);
                AbstractC33787EwD.A00(A02, A0E);
                return;
            case 9:
                A0E = AbstractC31175DnJ.A0E(obj);
                C71E c71e = (C71E) this.A02;
                UserSession userSession = c71e.A01;
                Context context = (Context) this.A01;
                AbstractC31171DnF.A1P(context);
                A02 = AbstractC31172DnG.A0O((FragmentActivity) context, c71e.A03.A0b, userSession);
                AbstractC33787EwD.A00(A02, A0E);
                return;
            case 10:
                A0E = AbstractC31175DnJ.A0E(obj);
                GEG geg = (GEG) this.A02;
                abstractC12990ll = geg.A01;
                fragment = geg.A00;
                A02 = AbstractC31172DnG.A0N(fragment, abstractC12990ll);
                AbstractC33787EwD.A00(A02, A0E);
                return;
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A0E = (C66246U5q) obj;
                obj2 = this.A02;
                A02 = (C62862tP) obj2;
                AbstractC33787EwD.A00(A02, A0E);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            default:
                A0E = AbstractC31175DnJ.A0E(obj);
                obj2 = this.A01;
                A02 = (C62862tP) obj2;
                AbstractC33787EwD.A00(A02, A0E);
                return;
            case 14:
                A0E = (C66246U5q) obj;
                C34944FaU c34944FaU = (C34944FaU) this.A01;
                A02 = C62862tP.A02(c34944FaU.A02, new C35990Fuo(this), c34944FaU.A00, c34944FaU.A01);
                AbstractC33787EwD.A00(A02, A0E);
                return;
            case Process.SIGTERM /* 15 */:
                A0E = (C66246U5q) obj;
                C11T.A04(new RunnableC36863GMk(this), 1000L);
                C33234ElT c33234ElT = (C33234ElT) this.A01;
                A02 = AbstractC31172DnG.A0N(c33234ElT, c33234ElT.A02);
                AbstractC33787EwD.A00(A02, A0E);
                return;
            case 16:
                AbstractC33787EwD.A00((C62862tP) this.A01, AbstractC31175DnJ.A0E(obj));
                AbstractC166987dD.A1Y(this.A02);
                return;
            case 17:
                C66246U5q A0E2 = AbstractC31175DnJ.A0E(obj);
                Context A06 = AbstractC31172DnG.A06(this.A02);
                if (A06 == null) {
                    return;
                }
                C62862tP c62862tP = (C62862tP) this.A01;
                C16920sk c16920sk = C16920sk.A00;
                C14360o3.A0C(c16920sk, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
                C14360o3.A0B(c16920sk, 1);
                if (A0E2.A02 == null) {
                    return;
                }
                C6FP.A02(A06, A0E2, c62862tP, C6FW.A01, c16920sk);
                return;
            case 18:
                A0E = (C66246U5q) obj;
                J0U j0u = (J0U) this.A01;
                j0u.A01 = A0E;
                j0u.A05 = AbstractC166997dE.A0a();
                obj2 = this.A02;
                A02 = (C62862tP) obj2;
                AbstractC33787EwD.A00(A02, A0E);
                return;
            case Process.SIGSTOP /* 19 */:
                AbstractC33787EwD.A00((C62862tP) this.A01, AbstractC31175DnJ.A0E(obj));
                ((EKP) this.A02).A00 = true;
                return;
            case 20:
                A0E = AbstractC31175DnJ.A0E(obj);
                A02 = AbstractC31178DnM.A0G((FragmentActivity) this.A02, (AbstractC12990ll) this.A01, "pro2pro_framework_ccp_page_link_to_existing_page_flow");
                AbstractC33787EwD.A00(A02, A0E);
                return;
            case 21:
                A0E = AbstractC31175DnJ.A0E(obj);
                A02 = AbstractC31178DnM.A0G((FragmentActivity) this.A01, (AbstractC12990ll) this.A02, "Password Reset");
                A02.A00 = true;
                AbstractC33787EwD.A00(A02, A0E);
                return;
            case 22:
                A0E = AbstractC31175DnJ.A0E(obj);
                ClipsEditMetadataController clipsEditMetadataController = (ClipsEditMetadataController) this.A02;
                abstractC12990ll = clipsEditMetadataController.A0s;
                fragment = clipsEditMetadataController.A0q;
                A02 = AbstractC31172DnG.A0N(fragment, abstractC12990ll);
                AbstractC33787EwD.A00(A02, A0E);
                return;
        }
    }

    public C32394EOv(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }
}
