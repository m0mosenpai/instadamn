package X;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.view.View;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.direct.store.InboxNetworkSource;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.impl.ContentFilterEngineImpl;
import com.instagram.direct.wellbeing.safetyecosystem.mutedwords.MutedWordsFilterManager;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.9E1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9E1 extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9E1(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r10v1, types: [X.2DT, java.lang.Object] */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        String str;
        String str2;
        switch (this.A00) {
            case 0:
                C160637Hx c160637Hx = (C160637Hx) this.A01;
                View requireViewById = ((View) c160637Hx.A0B.getValue()).requireViewById(R.id.scheduled_message_bar_chevron);
                C14360o3.A07(requireViewById);
                C0fQ.A00(c160637Hx.A06, requireViewById);
                return requireViewById;
            case 1:
                View inflate = ((C160637Hx) this.A01).A07.inflate();
                C14360o3.A0C(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
                return inflate;
            case 2:
                return ((View) ((C160637Hx) this.A01).A0B.getValue()).requireViewById(R.id.scheduled_message_bar_divider);
            case 3:
                C160637Hx c160637Hx2 = (C160637Hx) this.A01;
                View requireViewById2 = ((View) c160637Hx2.A0B.getValue()).requireViewById(R.id.scheduled_message_bar_header);
                C14360o3.A07(requireViewById2);
                C0fQ.A00(c160637Hx2.A06, requireViewById2);
                return requireViewById2;
            case 4:
                C160637Hx c160637Hx3 = (C160637Hx) this.A01;
                UserSession userSession = c160637Hx3.A08;
                DirectThreadKey directThreadKey = (DirectThreadKey) c160637Hx3.A0F.invoke();
                if (directThreadKey != null) {
                    str = directThreadKey.A00;
                } else {
                    str = null;
                }
                return new C7G0(userSession, str);
            case 5:
                return new C47794L9b(((C7G0) this.A01).A01);
            case 6:
                C7G0 c7g0 = (C7G0) this.A01;
                return new C7FR(c7g0, c7g0.A01);
            case 7:
                IntentFilter intentFilter = C2057098u.A0J;
                UserSession userSession2 = (UserSession) this.A01;
                Context context = AbstractC12290kX.A00;
                C14360o3.A07(context);
                C25671My A00 = AbstractC25651Mw.A00(userSession2);
                C4I1 c4i1 = C4I1.A00;
                C2EB c2eb = C2EB.A04;
                InboxNetworkSource A002 = AbstractC2057298w.A00(userSession2, c4i1, c2eb);
                InboxNetworkSource A003 = AbstractC2057298w.A00(userSession2, C2057398y.A00, c2eb);
                HashMap hashMap = new HashMap();
                for (C2EB c2eb2 : C2EB.values()) {
                    hashMap.put(c2eb2, AbstractC2057298w.A00(userSession2, C2057498z.A00, c2eb2));
                }
                return new C2057098u(context, A00, C218914p.A08, userSession2, A002, A003, AbstractC28761aE.A00(userSession2), hashMap);
            case 8:
                UserSession userSession3 = (UserSession) this.A01;
                List list = AbstractC28761aE.A00;
                ?? obj = new Object();
                C14360o3.A0B(userSession3, 0);
                C14360o3.A0B(list, 1);
                C13080lu A004 = AbstractC13090lv.A00("DirectThreadStoreImpl.create");
                try {
                    Context context2 = AbstractC12290kX.A00;
                    C14360o3.A07(context2);
                    InterfaceC37208GaJ interfaceC37208GaJ = null;
                    if (C18U.A06(C06090Tz.A05, userSession3, 2342156051466094224L) && C023409i.A0A.A09(userSession3)) {
                        interfaceC37208GaJ = AbstractC44044JdV.A00(userSession3);
                    }
                    C0o0 A005 = AbstractC14350nz.A00();
                    A005.A01 = C28741aC.class.toString();
                    C2DU c2du = new C2DU(context2, userSession3, new C18240vB(A005), interfaceC37208GaJ, obj, list);
                    A004.close();
                    return c2du;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        C20I.A00(A004, th);
                        throw th2;
                    }
                }
            case 9:
                return AbstractC142856cl.A00(C4HC.A00.A00(((C46922Dg) this.A01).A09).A02());
            case 10:
                C46922Dg c46922Dg = (C46922Dg) this.A01;
                return c46922Dg.A06.A0O((C5Fn) c46922Dg.A0H.getValue());
            case 11:
                return ((C4HD) ((C46922Dg) this.A01).A09.A01(C4HC.class, C4HE.A00)).A01();
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                C46922Dg c46922Dg2 = (C46922Dg) this.A01;
                HashMap hashMap2 = new HashMap();
                for (Map.Entry entry : c46922Dg2.A0F.entrySet()) {
                    hashMap2.put(entry.getKey(), ((C42221xC) entry.getValue()).A0O((C5Fn) c46922Dg2.A0H.getValue()));
                }
                return hashMap2;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return C4HC.A00.A00(((C2DU) this.A01).A0A).A01();
            case 14:
                return AbstractC142856cl.A00(((Handler) ((C2DU) this.A01).A0K.getValue()).getLooper());
            case Process.SIGTERM /* 15 */:
                return Boolean.valueOf(C18U.A06(C06090Tz.A05, (AbstractC12990ll) this.A01, 2342165362955200698L));
            case 16:
            case Seq.NULL_REFNUM /* 41 */:
                return ((InterfaceC16820sZ) this.A01).invoke();
            case 17:
                return new C2RB((UserSession) this.A01);
            case 18:
                return new C2RB((UserSession) this.A01);
            case Process.SIGSTOP /* 19 */:
                return new C2RB((UserSession) this.A01);
            case 20:
                return Integer.valueOf((int) C18U.A01(C06090Tz.A05, (AbstractC12990ll) this.A01, 36608961202493229L));
            case 21:
                return AbstractC28761aE.A00((UserSession) this.A01);
            case 22:
                return AbstractC28761aE.A00(((C1k7) this.A01).A00);
            case 23:
                EnumC222416a A0I = C17060sy.A01.A01((UserSession) this.A01).A0I();
                if (A0I == null) {
                    A0I = EnumC222416a.A08;
                }
                return A0I.A02;
            case 24:
                return new C98R((UserSession) this.A01);
            case 25:
                C7KG c7kg = (C7KG) this.A01;
                UserSession userSession4 = c7kg.A00;
                C47755L7b c47755L7b = (C47755L7b) c7kg.A02.getValue();
                C14360o3.A0B(c47755L7b, 1);
                return new L04(userSession4, c47755L7b);
            case 26:
                return new A7M(((C7KG) this.A01).A00);
            case 27:
                C7GT c7gt = (C7GT) this.A01;
                return AbstractC22718A0o.A00(c7gt.A08, c7gt.A0C, c7gt);
            case 28:
                C7GN c7gn = (C7GN) this.A01;
                return AbstractC22718A0o.A00(c7gn.A0O, c7gn.A0T, c7gn);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return new C123735in((UserSession) this.A01);
            case 30:
                return new C7DM(((C123735in) this.A01).A06);
            case 31:
                return new C2r0((UserSession) this.A01);
            case 32:
                return new ContentFilterDictionaryRegistrar((UserSession) this.A01);
            case 33:
                return AbstractC001800i.A0P(" ", "", "", (Iterable) this.A01, null);
            case 34:
                return C18U.A04(C06090Tz.A06, ((ContentFilterEngineImpl) this.A01).A02, 36877693012082830L);
            case 35:
                return C18U.A04(C06090Tz.A06, ((ContentFilterEngineImpl) this.A01).A02, 36877693012017293L);
            case 36:
                return new MutedWordsFilterManager((UserSession) this.A01);
            case 37:
                return new C164387Xb((UserSession) this.A01);
            case 38:
                return new C164417Xe((UserSession) this.A01);
            case 39:
                return new C61122qa(((C114485Es) this.A01).getSession());
            case 40:
                return this.A01;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return ((InterfaceC018407e) ((InterfaceC09390do) this.A01).getValue()).getViewModelStore();
            case 43:
                return new C58572mG((UserSession) this.A01);
            case 44:
                return Boolean.valueOf(C18U.A06(C06090Tz.A05, ((C58572mG) this.A01).A01, 36315142488591414L));
            case 45:
                return Boolean.valueOf(C18U.A06(C06090Tz.A05, ((C93W) this.A01).A01, 36316422388846970L));
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                C38P c38p = (C38P) this.A01;
                UserSession session = c38p.getSession();
                C37498GfG c37498GfG = new C37498GfG(c38p.getSession());
                InterfaceC43405JFv interfaceC43405JFv = c38p.A0i;
                InterfaceC62602sz interfaceC62602sz = c38p.A0T;
                if (interfaceC62602sz == null) {
                    str2 = "loadMoreInterface";
                    C14360o3.A0F(str2);
                    throw C00O.createAndThrow();
                }
                return new C38086GpF(session, interfaceC43405JFv, c37498GfG, null, interfaceC62602sz, new DRQ(c38p, 2));
            case 47:
                return Boolean.valueOf(C18U.A06(C06090Tz.A05, ((C38P) this.A01).getSession(), 36316422388846970L));
            case 48:
                return Boolean.valueOf(C18U.A06(C06090Tz.A05, ((C38P) this.A01).getSession(), 36316040136822676L));
            default:
                C38P c38p2 = (C38P) this.A01;
                Context requireContext = c38p2.requireContext();
                UserSession session2 = c38p2.getSession();
                C08790ch A006 = AbstractC018607g.A00(c38p2);
                C155936zN c155936zN = new C155936zN(c38p2.requireContext(), c38p2, c38p2.getSession());
                String moduleName = c38p2.getModuleName();
                C38193Gqy A007 = AbstractC38143GqA.A00(c38p2.getSession(), c38p2, c38p2.getSessionId(), false);
                C37934GmW c37934GmW = c38p2.A0E;
                if (c37934GmW == null) {
                    str2 = "dataStore";
                    C14360o3.A0F(str2);
                    throw C00O.createAndThrow();
                }
                return new C38144GqB(requireContext, A006, session2, c37934GmW.A02, c155936zN, c38p2, A007, moduleName);
        }
    }
}
