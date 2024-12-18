package X;

import android.graphics.RectF;
import android.util.Pair;
import android.view.View;
import com.facebook.msys.mci.AuthData;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.permanentmedia.DirectAggregatedMediaViewerController;
import com.instagram.direct.fragment.permanentmedia.MediaViewerReplyBarEligibilityCheckerImpl;
import com.instagram.direct.model.DirectForwardingParams;
import com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressLinkMessageSender;
import com.instagram.model.direct.DirectShareTarget;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.GJx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36798GJx implements InterfaceC42241xE {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public C36798GJx(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.A00 = i;
        this.A05 = obj3;
        this.A02 = obj4;
        this.A04 = obj;
        this.A01 = obj2;
        this.A03 = obj5;
    }

    /* JADX WARN: Type inference failed for: r0v51, types: [X.0bW, java.lang.Object] */
    @Override // X.InterfaceC42241xE
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C35169FfL c35169FfL;
        AuthData authData;
        InterfaceC37233Gai interfaceC37233Gai;
        String host;
        switch (this.A00) {
            case 0:
                if (!((EnumC61185Rgl) obj).A01) {
                    List list = (List) this.A05;
                    if (AbstractC166987dD.A1b(list)) {
                        ((C56138Ovy) this.A02).A04(new C48204LVc(1, this.A03, this.A04, this.A01), null, list);
                        return;
                    }
                }
                C131845xK.A00((C6FQ) this.A01, new C6FW(AbstractC166987dD.A1J("Failed to init")), (InterfaceC103384lE) this.A03);
                return;
            case 1:
                Pair pair = (Pair) obj;
                InterfaceC37233Gai interfaceC37233Gai2 = null;
                if (pair != null) {
                    authData = (AuthData) pair.first;
                    interfaceC37233Gai2 = (InterfaceC37233Gai) pair.second;
                } else {
                    authData = null;
                }
                RectF rectF = (RectF) this.A04;
                JR2 jr2 = (JR2) this.A05;
                C3o9 c3o9 = (C3o9) this.A03;
                C7TT c7tt = (C7TT) this.A01;
                DirectShareTarget directShareTarget = (DirectShareTarget) this.A02;
                if (JR2.A0e(authData, jr2, interfaceC37233Gai2, new G77(0, rectF, c7tt, jr2, directShareTarget, c3o9))) {
                    return;
                }
                JR2.A0D(rectF, jr2, c7tt, null, directShareTarget, c3o9);
                return;
            case 2:
                Pair pair2 = (Pair) obj;
                AuthData authData2 = null;
                if (pair2 != null) {
                    authData2 = (AuthData) pair2.first;
                    interfaceC37233Gai = (InterfaceC37233Gai) pair2.second;
                } else {
                    interfaceC37233Gai = null;
                }
                JR2 jr22 = (JR2) this.A05;
                DirectShareTarget directShareTarget2 = (DirectShareTarget) this.A02;
                RectF rectF2 = (RectF) this.A04;
                C22P c22p = (C22P) this.A01;
                C3o9 c3o92 = (C3o9) this.A03;
                if (JR2.A0e(authData2, jr22, interfaceC37233Gai, new G77(1, rectF2, c22p, jr22, directShareTarget2, c3o92))) {
                    return;
                }
                UserSession A0p = jr22.A0p();
                if (directShareTarget2 != null) {
                    JR2.A0B(rectF2, c22p, jr22, LKW.A04(A0p, directShareTarget2), c3o92);
                    return;
                }
                throw AbstractC166997dE.A0g();
            case 3:
                List list2 = (List) obj;
                C14360o3.A0A(list2);
                C158797Aq c158797Aq = (C158797Aq) this.A01;
                Iterator it = list2.iterator();
                int i = 0;
                while (true) {
                    if (it.hasNext()) {
                        if (C14360o3.A0K(((C35169FfL) it.next()).A05(), c158797Aq.A0T)) {
                            if (i != -1) {
                                G4R g4r = (G4R) this.A05;
                                C3o9 c3o93 = (C3o9) this.A03;
                                View view = (View) this.A04;
                                UserSession userSession = g4r.A01;
                                AbstractC59962oe abstractC59962oe = g4r.A00;
                                if (AbstractC34068F1w.A00(abstractC59962oe.requireActivity(), userSession, c3o93)) {
                                    InterfaceC08830cm interfaceC08830cm = g4r.A05;
                                    MediaViewerReplyBarEligibilityCheckerImpl A00 = F2K.A00(userSession, (InterfaceC163837Ux) AbstractC31172DnG.A0y(interfaceC08830cm));
                                    DirectAggregatedMediaViewerController directAggregatedMediaViewerController = g4r.A02;
                                    abstractC59962oe.registerLifecycleListener(directAggregatedMediaViewerController);
                                    DirectShareTarget C7f = ((InterfaceC163837Ux) interfaceC08830cm.get()).C7f(abstractC59962oe.getContext());
                                    String str = null;
                                    if (AbstractC167007dF.A1Q(i, list2.size()) && (c35169FfL = (C35169FfL) AbstractC001800i.A0O(list2, i)) != null) {
                                        str = c35169FfL.A05();
                                    }
                                    C34696FQh c34696FQh = new C34696FQh(abstractC59962oe.requireContext(), view, userSession, directAggregatedMediaViewerController, C7f, c3o93);
                                    c34696FQh.A06 = list2;
                                    c34696FQh.A01 = i;
                                    c34696FQh.A03 = C05F.A01;
                                    c34696FQh.A05 = str;
                                    c34696FQh.A02 = A00;
                                    c34696FQh.A00();
                                }
                            }
                        } else {
                            i++;
                        }
                    }
                }
                G4R g4r2 = (G4R) this.A05;
                View view2 = (View) this.A04;
                if (AbstractC34068F1w.A00(g4r2.A00.requireActivity(), g4r2.A01, (C3o9) g4r2.A06.invoke())) {
                    g4r2.A03.CrH(view2, new E6B(AbstractC13880nE.A0G(view2), 0.0f), C05F.A01, AbstractC166987dD.A1J(c158797Aq), 0, false, false);
                }
                ((C41761wQ) this.A02).A01();
                return;
            default:
                C46h c46h = (C46h) obj;
                ((C41761wQ) this.A04).A01();
                if (!(c46h instanceof C4JL)) {
                    ArmadilloExpressLinkMessageSender armadilloExpressLinkMessageSender = (ArmadilloExpressLinkMessageSender) this.A05;
                    C29481bP c29481bP = (C29481bP) this.A03;
                    String str2 = c29481bP.A00.A01;
                    if (str2 == null) {
                        str2 = "";
                    }
                    android.net.Uri A002 = AbstractC08820cl.A00(new Object(), str2);
                    if (A002 != null && (host = A002.getHost()) != null && host.equals("www.instagram.com") && AbstractC31176DnK.A0l(A002, 0).equals("explore") && ((String) AbstractC25227BEk.A0t(A002.getPathSegments())).equals("locations")) {
                        armadilloExpressLinkMessageSender.A05((DirectForwardingParams) this.A02, (InterfaceC37261GbE) this.A01, c29481bP);
                        return;
                    }
                }
                ArmadilloExpressLinkMessageSender.A04((DirectForwardingParams) this.A02, null, (InterfaceC37261GbE) this.A01, (C44999Jvp) c46h.A04(), (ArmadilloExpressLinkMessageSender) this.A05, (C29481bP) this.A03);
                return;
        }
    }
}
