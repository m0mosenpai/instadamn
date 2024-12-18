package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.keyword.Keyword;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.service.http.IGTigonAsyncHttpService;
import com.instagram.service.http.IGTigonAsyncHttpServiceHolder;
import go.Seq;

/* loaded from: classes11.dex */
public final class X2z extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X2z(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        String str;
        DirectShareTarget directShareTarget;
        InterfaceC09390do interfaceC09390do;
        switch (this.A00) {
            case 0:
            case 34:
            case 40:
            case 45:
                return this.A01;
            case 1:
            case 35:
            case Seq.NULL_REFNUM /* 41 */:
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return ((InterfaceC16820sZ) this.A01).invoke();
            case 2:
            case 36:
            case Seq.RefTracker.REF_OFFSET /* 42 */:
            case 47:
            default:
                return AbstractC167027dH.A0B(this.A01);
            case 3:
                AbstractC67878V0j abstractC67878V0j = (AbstractC67878V0j) this.A01;
                String A05 = abstractC67878V0j.A06().A05();
                String A08 = abstractC67878V0j.A08();
                String A0d = AbstractC65702TsY.A0d(abstractC67878V0j);
                UserSession session = abstractC67878V0j.getSession();
                Context requireContext = abstractC67878V0j.requireContext();
                C14360o3.A0B(session, 0);
                C55168OdW c55168OdW = (C55168OdW) session.A01(C55168OdW.class, new X2z(requireContext.getApplicationContext(), 24));
                OCG ocg = new OCG(abstractC67878V0j.requireContext(), AbstractC65702TsY.A0d(abstractC67878V0j));
                if (abstractC67878V0j instanceof VAH) {
                    interfaceC09390do = ((VAH) abstractC67878V0j).A01;
                } else if (abstractC67878V0j instanceof VAL) {
                    interfaceC09390do = ((VAL) abstractC67878V0j).A04;
                } else if (abstractC67878V0j instanceof VAI) {
                    interfaceC09390do = ((VAI) abstractC67878V0j).A01;
                } else if (abstractC67878V0j instanceof VAJ) {
                    interfaceC09390do = ((VAJ) abstractC67878V0j).A01;
                } else if (abstractC67878V0j instanceof VAK) {
                    interfaceC09390do = ((VAK) abstractC67878V0j).A01;
                } else if (abstractC67878V0j instanceof VAG) {
                    interfaceC09390do = ((VAG) abstractC67878V0j).A01;
                } else {
                    interfaceC09390do = ((VAF) abstractC67878V0j).A01;
                }
                AbstractC41190ILd abstractC41190ILd = (AbstractC41190ILd) interfaceC09390do.getValue();
                UserSession session2 = abstractC67878V0j.getSession();
                W58 w58 = abstractC67878V0j.A0D;
                if (w58 == null) {
                    str = "perfLogger";
                } else {
                    W99 w99 = abstractC67878V0j.A0C;
                    if (w99 == null) {
                        str = "serpMetaAiHcmLogger";
                    } else {
                        return new V54(session2, w99, abstractC41190ILd, w58, c55168OdW, ocg, A05, A08, A0d);
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 4:
                UserSession session3 = ((AbstractC67878V0j) this.A01).getSession();
                C14360o3.A0B(session3, 1);
                return new AbstractC41190ILd("fbsearch/reels_serp/", "clips_serp_page", new C57753Pjg(session3, 49));
            case 5:
                V0V v0v = (V0V) this.A01;
                return AbstractC12220kQ.A01(v0v, (AbstractC12990ll) v0v.A0Z.getValue());
            case 6:
                UserSession session4 = ((AbstractC67878V0j) this.A01).getSession();
                C14360o3.A0B(session4, 1);
                return new AbstractC41190ILd(AbstractC111324zv.A00(2353), "top_serp", new JEZ(session4, 0));
            case 7:
                UserSession session5 = ((AbstractC67878V0j) this.A01).getSession();
                C14360o3.A0B(session5, 1);
                return new AbstractC41190ILd(AbstractC111324zv.A00(3203), "hashtag_serp", new JEZ(session5, 1));
            case 8:
                UserSession session6 = ((AbstractC67878V0j) this.A01).getSession();
                C14360o3.A0B(session6, 1);
                return new AbstractC41190ILd("fbsearch/places/", "places_serp", new JEZ(session6, 2));
            case 9:
                C66151U1s c66151U1s = (C66151U1s) this.A01;
                FragmentActivity fragmentActivity = c66151U1s.A01;
                Context applicationContext = fragmentActivity.getApplicationContext();
                C14360o3.A07(applicationContext);
                UserSession userSession = c66151U1s.A04;
                C65911TwI c65911TwI = c66151U1s.A00;
                if (c65911TwI != null) {
                    directShareTarget = c65911TwI.A00();
                } else {
                    directShareTarget = null;
                }
                AbstractC35257Fgr.A03(applicationContext, fragmentActivity, c66151U1s.A02, userSession, EnumC33346Eof.A02, directShareTarget);
                return C0eB.A00;
            case 10:
                U1X.A00(((U22) this.A01).A02).A00.A02().isEmpty();
                return AbstractC166997dE.A0a();
            case 11:
                C65918TwP c65918TwP = (C65918TwP) this.A01;
                return new C66152U1t(c65918TwP.requireContext(), c65918TwP.A0E(), c65918TwP.A0c);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                C65918TwP c65918TwP2 = (C65918TwP) this.A01;
                UserSession A0E = c65918TwP2.A0E();
                String str2 = c65918TwP2.A09;
                if (str2 != null) {
                    return new U21(c65918TwP2, A0E, str2);
                }
                throw AbstractC166997dE.A0g();
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                C65918TwP c65918TwP3 = (C65918TwP) this.A01;
                String str3 = c65918TwP3.A09;
                if (str3 != null) {
                    return new C66151U1s(c65918TwP3.requireActivity(), c65918TwP3, c65918TwP3.A0E(), str3, 112, false);
                }
                throw AbstractC166997dE.A0g();
            case 14:
                AbstractC65919TwQ abstractC65919TwQ = (AbstractC65919TwQ) this.A01;
                Context requireContext2 = abstractC65919TwQ.requireContext();
                UserSession A0E2 = abstractC65919TwQ.A0E();
                return new C43812JYz(AbstractC677833s.A00(requireContext2, A0E2, null, new C677733r(abstractC65919TwQ.requireContext(), abstractC65919TwQ.A0E()), C65918TwP.__redex_internal_original_name, AbstractC677833s.A02(A0E2)));
            case Process.SIGTERM /* 15 */:
                AbstractC65919TwQ abstractC65919TwQ2 = (AbstractC65919TwQ) this.A01;
                return AbstractC12220kQ.A01(abstractC65919TwQ2, abstractC65919TwQ2.A0E());
            case 16:
                UserSession session7 = ((AbstractC67878V0j) this.A01).getSession();
                C14360o3.A0B(session7, 1);
                return new AbstractC41190ILd(AbstractC111324zv.A00(2352), "popular_serp", new JEZ(session7, 3));
            case 17:
                UserSession session8 = ((AbstractC67878V0j) this.A01).getSession();
                C14360o3.A0B(session8, 1);
                return new AbstractC41190ILd(AbstractC111324zv.A00(2351), "user_serp", new JEZ(session8, 4));
            case 18:
                return new C69595Vry((UserSession) this.A01);
            case Process.SIGSTOP /* 19 */:
                return new U0G((UserSession) this.A01);
            case 20:
                return new C66153U1u((UserSession) this.A01);
            case 21:
                return AbstractC166997dE.A0c(C06090Tz.A05, ((C66153U1u) this.A01).A00, 36325759647823173L);
            case 22:
                return AbstractC166997dE.A0c(C06090Tz.A05, ((C66153U1u) this.A01).A00, 36325759647757636L);
            case 23:
                InterfaceC09390do interfaceC09390do2 = ((C67898V1g) this.A01).A0C;
                if (!U1X.A00((UserSession) interfaceC09390do2.getValue()).A00.A02().isEmpty()) {
                    interfaceC09390do2.getValue();
                }
                return AbstractC166997dE.A0a();
            case 24:
                Context context = (Context) this.A01;
                C14360o3.A0A(context);
                return new C55168OdW(context);
            case 25:
                Keyword keyword = ((C38934HCh) this.A01).A08;
                if (keyword == null) {
                    str = "surfaceKeyword";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                return new C69296Vl4(null, keyword.A04, true, false);
            case 26:
                return new C69296Vl4(null, ((C51042Mgs) this.A01).A0E, false, false);
            case 27:
                return new ABA(((C18720vz) this.A01).A06());
            case 28:
                return new C53E(((C69559VrO) this.A01).A01);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return new C1GU(((C18720vz) this.A01).A06());
            case 30:
                C54190NxU c54190NxU = IGTigonAsyncHttpServiceHolder.Companion;
                return new IGTigonAsyncHttpServiceHolder(new IGTigonAsyncHttpService((AbstractC12990ll) this.A01));
            case 31:
                return C023409i.A0A.A05(this.A01);
            case 32:
                ((C33226ElG) this.A01).A09 = false;
                return C0eB.A00;
            case 33:
                EIT eit = (EIT) this.A01;
                return AbstractC12220kQ.A01(eit.A04, (AbstractC12990ll) eit.A06.getValue());
            case 37:
                return new NBH((UserSession) ((C33218El6) this.A01).A04.getValue());
            case 38:
                return new C34683FPu((UserSession) this.A01);
            case 39:
                return AbstractC25230BEn.A0l(((C33193Ekf) this.A01).A00);
            case 43:
                return new C32573EVy((UserSession) ((C33219El7) this.A01).A06.getValue());
            case 44:
                return new FLE((UserSession) this.A01);
            case 48:
                return new NBI((UserSession) ((C33232ElR) this.A01).A03.getValue());
            case 49:
                return AbstractC12220kQ.A01(new C19270xB("message_links_settings_fragment"), (AbstractC12990ll) ((C33194Ekg) this.A01).A01.getValue());
        }
    }
}
