package X;

import android.app.Activity;
import android.content.Context;
import android.os.HandlerThread;
import android.view.View;
import android.view.ViewStub;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.tigon.tigonhuc.HucClient;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.wellbeing.equity.diversity.DiversityInfoRepository;
import go.Seq;
import java.util.Map;

/* renamed from: X.Pfr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57517Pfr extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57517Pfr(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static InterfaceC09390do A00(Object obj, int i) {
        return C1XM.A00(new C57517Pfr(obj, i));
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        String A1A;
        View view;
        Window window;
        View decorView;
        InterfaceC108984vN interfaceC108984vN;
        ViewStub A07;
        switch (this.A00) {
            case 0:
            case 6:
            case 27:
                return this.A01;
            case 1:
            case 7:
            case 28:
                return AbstractC25226BEj.A1C(this.A01);
            case 2:
            case 8:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return AbstractC167027dH.A0B(this.A01);
            case 3:
                OF2 of2 = (OF2) this.A01;
                UserSession userSession = of2.A04;
                Context context = of2.A01;
                AbstractC59962oe abstractC59962oe = of2.A03;
                C109054vU c109054vU = of2.A05.A02;
                boolean z = true;
                if (c109054vU == null || (interfaceC108984vN = c109054vU.A0A) == null || !interfaceC108984vN.CX2()) {
                    z = false;
                }
                return new NDM(context, abstractC59962oe, userSession, z);
            case 4:
                View A0d = AbstractC166987dD.A0d(((C54731OFi) this.A01).A0D);
                if (A0d != null) {
                    return A0d.findViewById(R.id.wave_reaction);
                }
                return null;
            case 5:
                View A0d2 = AbstractC166987dD.A0d(((C54731OFi) this.A01).A0D);
                if (A0d2 != null) {
                    return A0d2.findViewById(R.id.host_avatar);
                }
                return null;
            case 9:
                View A0d3 = AbstractC166987dD.A0d(((C54731OFi) this.A01).A0D);
                if (A0d3 != null) {
                    return A0d3.findViewById(R.id.wave_text);
                }
                return null;
            case 10:
                C54731OFi c54731OFi = (C54731OFi) this.A01;
                return new NCL(c54731OFi.A04, c54731OFi.A05);
            case 11:
                InterfaceC09390do interfaceC09390do = ((C54731OFi) this.A01).A0D;
                View A0d4 = AbstractC166987dD.A0d(interfaceC09390do);
                if (A0d4 != null && (A07 = AbstractC31171DnF.A07(A0d4, R.id.iglive_comment_wave_back_button_stub)) != null) {
                    return A07.inflate();
                }
                View A0d5 = AbstractC166987dD.A0d(interfaceC09390do);
                if (A0d5 == null) {
                    return null;
                }
                return A0d5.findViewById(R.id.iglive_comment_wave_back_button_stub);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                View A0d6 = AbstractC166987dD.A0d(((C54731OFi) this.A01).A0A);
                if (A0d6 != null) {
                    return A0d6.findViewById(R.id.iglive_comment_wave_back_button);
                }
                return null;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                View A0d7 = AbstractC166987dD.A0d(((C54731OFi) this.A01).A0D);
                if (A0d7 != null) {
                    return A0d7.findViewById(R.id.guest_avatar);
                }
                return null;
            case 14:
                C54731OFi c54731OFi2 = (C54731OFi) this.A01;
                Activity rootActivity = c54731OFi2.A04.getRootActivity();
                if (rootActivity == null || (window = rootActivity.getWindow()) == null || (decorView = window.getDecorView()) == null || (view = decorView.getRootView()) == null) {
                    view = c54731OFi2.A03;
                }
                ViewStub A072 = AbstractC31171DnF.A07(view, R.id.reaction_overlay_stub);
                if (A072 == null) {
                    return view.findViewById(R.id.reaction_overlay);
                }
                return AbstractC31173DnH.A0E(A072, R.layout.layout_iglive_viewer_wave_reaction_overlay);
            case Process.SIGTERM /* 15 */:
                return new Boolean[((InterfaceC19390xP[]) this.A01).length];
            case 16:
            case 17:
            case 18:
            case Process.SIGSTOP /* 19 */:
            case 20:
            case 23:
            default:
                return new Object[((InterfaceC19390xP[]) this.A01).length];
            case 21:
                ((C51044Mgw) this.A01).A00.A02.Egh(null);
                return C0eB.A00;
            case 22:
                AbstractC52922bZ abstractC52922bZ = (AbstractC52922bZ) this.A01;
                PZD.A02(abstractC52922bZ, AbstractC141776au.A00(abstractC52922bZ), 7);
                return C0eB.A00;
            case 24:
                InterfaceC19630xq interfaceC19630xq = ((C53011Ncj) this.A01).A02.A01;
                AbstractC50522MSa.A1T(interfaceC19630xq, "live_badges_ufi_tooltip_view_count", 0);
                long currentTimeMillis = System.currentTimeMillis();
                InterfaceC19610xo ARD = interfaceC19630xq.ARD();
                ARD.E7G("live_badges_ufi_tooltip_last_impression_timestamp", currentTimeMillis);
                ARD.apply();
                return C0eB.A00;
            case 25:
                C23031Ai c23031Ai = ((C53011Ncj) this.A01).A02;
                AbstractC167007dF.A1L(c23031Ai, c23031Ai.A6R, C23031Ai.A8c, HucClient.BODY_UPLOAD_TIMEOUT_SECONDS, false);
                return C0eB.A00;
            case 26:
                C27611Vo A00 = AbstractC54071NvV.A00();
                OUD oud = (OUD) this.A01;
                return A00.A00(oud.A00, oud.A02);
            case 30:
                return C023409i.A0A.A06(AbstractC31179DnN.A04(this.A01));
            case 31:
                return new NCJ(AbstractC166987dD.A0r(((N4H) this.A01).A00), false);
            case 32:
                return AbstractC166997dE.A0c(C06090Tz.A05, AbstractC31178DnM.A0M(((N7O) this.A01).A0G), 36312402299520102L);
            case 33:
                return AbstractC54273Nyt.A00(AbstractC166987dD.A0r(((N7O) this.A01).A0G));
            case 34:
                C52121N4u c52121N4u = (C52121N4u) this.A01;
                UserSession A0r = AbstractC166987dD.A0r(c52121N4u.A03);
                FragmentActivity activity = c52121N4u.getActivity();
                C14360o3.A0A(activity);
                AbstractC167017dG.A1N(A0r, activity);
                OUD oud2 = OUD.A05;
                if (oud2 != null) {
                    return oud2;
                }
                OUD oud3 = new OUD(A0r, activity);
                OUD.A05 = oud3;
                return oud3;
            case 35:
                return new C97694a4((UserSession) this.A01);
            case 36:
                Context context2 = AbstractC12290kX.A00;
                C14360o3.A07(context2);
                C4AW c4aw = new C4AW(C1U4.A00(context2));
                UserSession userSession2 = (UserSession) this.A01;
                C41711wL A01 = C41711wL.A01(userSession2);
                C14360o3.A07(A01);
                return new C4AV(userSession2, C13920nI.A00, c4aw, A01);
            case 37:
                return new C4SD((UserSession) this.A01);
            case 38:
                return new C4S2((UserSession) this.A01);
            case 39:
                return new C43001yT((UserSession) this.A01);
            case 40:
                C66055Tys c66055Tys = (C66055Tys) this.A01;
                if (c66055Tys.A0A) {
                    C66055Tys.A01(c66055Tys, C05F.A01, false);
                }
                c66055Tys.A0D.DR9();
                return C0eB.A00;
            case Seq.NULL_REFNUM /* 41 */:
                HandlerThread handlerThread = ((C71160Wov) this.A01).A01;
                handlerThread.start();
                return MSY.A09(handlerThread);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                C11T.A02(new RunnableC56958POz((C71160Wov) this.A01));
                return C0eB.A00;
            case 43:
                return new OHc((UserSession) this.A01);
            case 44:
                return new DiversityInfoRepository((UserSession) this.A01);
            case 45:
                return new JZG(C12L.A00, (UserSession) this.A01);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return new C56324Ozl(this.A01, 3);
            case 47:
                return AbstractC31179DnN.A04(this.A01).getString("argument_module_name");
            case 48:
                C0Zx c0Zx = new C0Zx();
                Map map = ((U79) this.A01).A0C;
                Object obj = map.get("trigger_session_id");
                if (obj != null) {
                    c0Zx.A06(AbstractC50531MSk.A01(), (String) obj);
                    c0Zx.A01(XPI.FETCHING_FAILED, AbstractC43591JPw.A00(361));
                    c0Zx.A01(EnumC31716DwL.IXT, "event_source");
                    if (C14360o3.A0K(map.get("is_e2ee"), RealtimeSubscription.GRAPHQL_MQTT_VERSION)) {
                        A1A = "0";
                    } else {
                        A1A = AbstractC166987dD.A1A("ig_object_value", map);
                    }
                    c0Zx.A06("entity_id", A1A);
                    return c0Zx;
                }
                throw AbstractC166997dE.A0g();
            case 49:
                C0Zx c0Zx2 = new C0Zx();
                Object obj2 = ((U79) this.A01).A0C.get("ig_container_module");
                if (obj2 != null) {
                    c0Zx2.A06("containermodule", (String) obj2);
                    return c0Zx2;
                }
                throw AbstractC166997dE.A0g();
        }
    }
}
