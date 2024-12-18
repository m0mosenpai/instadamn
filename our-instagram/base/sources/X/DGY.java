package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.mainfeed.fragment.layoutmanager.MainFeedLinearLayoutManager;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes5.dex */
public final class DGY extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DGY(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static C17050sx A00(Object obj, int i) {
        return AbstractC09440dt.A01(new DGY(obj, i));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        UserSession userSession;
        Context context;
        int A07;
        Context context2;
        MainFeedLinearLayoutManager mainFeedLinearLayoutManager;
        boolean z;
        View view;
        String str;
        InterfaceC76613c6 interfaceC76613c6;
        InterfaceC30846DhL interfaceC30846DhL;
        InterfaceC16660sJ interfaceC16660sJ;
        Object obj;
        switch (this.A00) {
            case 0:
                userSession = ((CSF) this.A01).A00;
                return new C80113i0(userSession);
            case 1:
                return new C80213iA(((CSF) this.A01).A00);
            case 2:
                return AbstractC28761aE.A00(((JZe) this.A01).A00);
            case 3:
                return ((C89623z3) this.A01).A03;
            case 4:
                return ((C51760Mtj) this.A01).A01;
            case 5:
                return ((C26533Bns) this.A01).A00.invoke();
            case 6:
                return ((C51760Mtj) this.A01).A02;
            case 7:
                return ((C51760Mtj) this.A01).A00;
            case 8:
                context = (Context) this.A01;
                A07 = AbstractC25227BEk.A02(AbstractC13890nF.A01(context));
                return Integer.valueOf(A07);
            case 9:
                return ((C26390BlZ) this.A01).A01.A00;
            case 10:
                userSession = ((CQX) this.A01).A00;
                return new C80113i0(userSession);
            case 11:
                return new CQX(((CUD) this.A01).A00);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                userSession = ((CUD) this.A01).A00;
                return new C80113i0(userSession);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return new C86473tK(((CUD) this.A01).A00);
            case 14:
                return new C80213iA(((CUD) this.A01).A00);
            case Process.SIGTERM /* 15 */:
                TextView textView = ((C81373k7) this.A01).A01;
                textView.setText(textView.getResources().getString(2131965660));
                return C0eB.A00;
            case 16:
                A07 = AbstractC13880nE.A07(((C2U) this.A01).A00);
                return Integer.valueOf(A07);
            case 17:
                context2 = ((C2Q) this.A01).A00;
                A07 = AbstractC13890nF.A01(context2);
                return Integer.valueOf(A07);
            case 18:
                context2 = (Context) this.A01;
                A07 = AbstractC13890nF.A01(context2);
                return Integer.valueOf(A07);
            case Process.SIGSTOP /* 19 */:
                context2 = ((C2V) this.A01).A00;
                A07 = AbstractC13890nF.A01(context2);
                return Integer.valueOf(A07);
            case 20:
                context = ((C2Y) this.A01).A00;
                A07 = AbstractC25227BEk.A02(AbstractC13890nF.A01(context));
                return Integer.valueOf(A07);
            case 21:
                ViewGroup CFj = ((CTA) this.A01).A07.getScrollingViewProxy().CFj();
                C14360o3.A0C(CFj, AbstractC111324zv.A00(9));
                AbstractC70663Fe abstractC70663Fe = ((RecyclerView) CFj).A0D;
                C14360o3.A0C(abstractC70663Fe, "null cannot be cast to non-null type com.instagram.mainfeed.fragment.layoutmanager.MainFeedLinearLayoutManager");
                mainFeedLinearLayoutManager = (MainFeedLinearLayoutManager) abstractC70663Fe;
                z = false;
                mainFeedLinearLayoutManager.A00 = z;
                return C0eB.A00;
            case 22:
                ViewGroup CFj2 = ((CTA) this.A01).A07.getScrollingViewProxy().CFj();
                C14360o3.A0C(CFj2, AbstractC111324zv.A00(9));
                AbstractC70663Fe abstractC70663Fe2 = ((RecyclerView) CFj2).A0D;
                C14360o3.A0C(abstractC70663Fe2, "null cannot be cast to non-null type com.instagram.mainfeed.fragment.layoutmanager.MainFeedLinearLayoutManager");
                mainFeedLinearLayoutManager = (MainFeedLinearLayoutManager) abstractC70663Fe2;
                z = true;
                mainFeedLinearLayoutManager.A00 = z;
                return C0eB.A00;
            case 23:
                return Boolean.valueOf(((C33P) this.A01).A0G.A0Y());
            case 24:
                view = (View) this.A01;
                if (view == null) {
                    throw AbstractC166997dE.A0g();
                }
                return new C116785Qh(view);
            case 25:
                view = ((C2YJ) this.A01).A00;
                C14360o3.A06(view);
                return new C116785Qh(view);
            case 26:
                C26515Bna c26515Bna = (C26515Bna) this.A01;
                C85233rE c85233rE = c26515Bna.A02;
                C76623c7 c76623c7 = c85233rE.A07;
                InterfaceC76613c6 interfaceC76613c62 = c76623c7.A00;
                String id = interfaceC76613c62.getId();
                if (id != null) {
                    C28358CfI c28358CfI = C28358CfI.A00;
                    Integer num = c85233rE.A0A;
                    UserSession userSession2 = c26515Bna.A00;
                    WeakReference weakReference = c26515Bna.A04;
                    C38321qM c38321qM = c76623c7.A01;
                    String A2f = c38321qM.A2f();
                    String moduleName = c26515Bna.A03.getModuleName();
                    String BJN = c38321qM.A0C.BJN();
                    String A1G = AbstractC25226BEj.A1G(c38321qM);
                    C75113Zb c75113Zb = c85233rE.A09;
                    Integer valueOf = Integer.valueOf(c75113Zb.getPosition());
                    List carouselMediaImmutable = interfaceC76613c62.getCarouselMediaImmutable();
                    if (carouselMediaImmutable != null && (interfaceC76613c6 = (InterfaceC76613c6) carouselMediaImmutable.get(c75113Zb.A03)) != null) {
                        str = interfaceC76613c6.getId();
                    } else {
                        str = null;
                    }
                    c28358CfI.A01(userSession2, c85233rE.A01, c38321qM, num, valueOf, Integer.valueOf(c75113Zb.A03), id, A2f, moduleName, BJN, A1G, str, weakReference);
                }
                return C0eB.A00;
            case 27:
                view = (View) this.A01;
                return new C116785Qh(view);
            case 28:
                return new C691739d((UserSession) this.A01);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                UserSession userSession3 = ((C77133cz) this.A01).A00;
                if (C18U.A06(C06090Tz.A05, userSession3, 2342162545453833712L)) {
                    InterfaceC19630xq A0x = AbstractC166987dD.A0x(userSession3);
                    AbstractC167017dG.A1L(A0x.ARD(), A0x, "feed_ufi_bar_impression_count", 0);
                }
                return C0eB.A00;
            case 30:
                AbstractC166987dD.A1Y(this.A01);
                return C0eB.A00;
            case 31:
            case 32:
                return C0eB.A00;
            case 33:
                C26351Bkw c26351Bkw = (C26351Bkw) this.A01;
                InterfaceC59172nI interfaceC59172nI = (InterfaceC59172nI) c26351Bkw.A00.A00;
                long A0F = AbstractC25229BEm.A0F();
                C75933ay c75933ay = C51722Yv.A02;
                C51722Yv A00 = AbstractC25233BEq.A0a(AbstractC25225BEi.A0h(null, AbstractC25225BEi.A0m(C05F.A00, 50.0f, 0)), C05F.A0Y, 0.75f).A00(c26351Bkw.A01);
                DGY dgy = new DGY(c26351Bkw, 32);
                DOF dof = DOF.A00;
                if (interfaceC59172nI != null) {
                    interfaceC30846DhL = C29516CzU.A00;
                } else {
                    interfaceC30846DhL = C29515CzT.A00;
                }
                return new C129495tE(interfaceC59172nI, null, A00, interfaceC30846DhL, null, null, dgy, null, null, dof, A0F);
            case 34:
            case 36:
                return new CQZ(((C65882yQ) this.A01).A01);
            case 35:
            case 37:
            default:
                return ((C65882yQ) this.A01).A00;
            case 38:
                C37443GeN c37443GeN = (C37443GeN) this.A01;
                return new C691439a(c37443GeN.A0c, c37443GeN.A0d, c37443GeN.A0f);
            case 39:
                C37443GeN c37443GeN2 = (C37443GeN) this.A01;
                Context context3 = c37443GeN2.A0c;
                C61142qc c61142qc = c37443GeN2.A0g;
                C62862tP c62862tP = c37443GeN2.A0e;
                InterfaceC686036x interfaceC686036x = c37443GeN2.A00;
                if (interfaceC686036x == null) {
                    C14360o3.A0F("delegate");
                    throw C00O.createAndThrow();
                }
                C57332k8 c57332k8 = c37443GeN2.A0k;
                UserSession userSession4 = c37443GeN2.A0f;
                InterfaceC60442pS interfaceC60442pS = c37443GeN2.A0i;
                C77013cn c77013cn = c37443GeN2.A0j;
                return new C37455GeZ(context3, c62862tP, userSession4, interfaceC686036x, (C691439a) c37443GeN2.A0m.getValue(), c61142qc, c37443GeN2.A0h, interfaceC60442pS, c77013cn, c57332k8, c37443GeN2.A0l, c37443GeN2.A0o, c37443GeN2.A0p, c37443GeN2.A0r, c37443GeN2.A0s, c37443GeN2.A0q);
            case 40:
                C37455GeZ c37455GeZ = (C37455GeZ) this.A01;
                return new C692339j(c37455GeZ.A05, (C691939f) c37455GeZ.A0E.getValue());
            case Seq.NULL_REFNUM /* 41 */:
                C37455GeZ c37455GeZ2 = (C37455GeZ) this.A01;
                return new C691939f(c37455GeZ2.A02, c37455GeZ2.A03, (C691839e) c37455GeZ2.A06.A01.getValue(), c37455GeZ2.A08, c37455GeZ2.A0A, null, c37455GeZ2.A0H, c37455GeZ2.A0I, c37455GeZ2.A0G);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                C9C3 c9c3 = ((C89693zA) this.A01).A00;
                interfaceC16660sJ = (InterfaceC16660sJ) ((C206259Bi) c9c3.A00).A04;
                obj = c9c3.A04;
                interfaceC16660sJ.invoke(obj);
                return C0eB.A00;
            case 43:
                C206249Bh c206249Bh = ((C89673z8) this.A01).A00;
                interfaceC16660sJ = (InterfaceC16660sJ) ((C206209Bd) c206249Bh.A01).A02;
                obj = c206249Bh.A02;
                interfaceC16660sJ.invoke(obj);
                return C0eB.A00;
            case 44:
                ((C37513GfV) this.A01).A00.A05(new C42240InQ(false));
                return C0eB.A00;
            case 45:
                return new IEY((UserSession) this.A01);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return new IC4((UserSession) this.A01);
            case 47:
                UserSession userSession5 = (UserSession) this.A01;
                C14360o3.A0B(userSession5, 1);
                return new C62732tC(userSession5, AbstractC111324zv.A00(2527), AbstractC111324zv.A00(2525));
            case 48:
                return new C27863CQa((UserSession) this.A01);
            case 49:
                return new C25462BOb(C1AT.A01((UserSession) this.A01).A03(C1AV.A1c));
        }
    }
}
