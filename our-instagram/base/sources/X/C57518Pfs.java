package X;

import android.app.Application;
import android.content.Context;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.newsfeed.model.PillsFilterCategory;
import com.instagram.newsfeed.ui.InlineLinkUrn;
import com.instagram.newsfeed.viewmodel.ActivityFeedViewModel;
import com.instagram.nido.impl.explore.NidoExploreViewModel;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.Pfs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57518Pfs extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57518Pfs(ActivityFeedViewModel activityFeedViewModel, int i) {
        super(0);
        this.A00 = i;
        this.A01 = activityFeedViewModel;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        String A00;
        AbstractC129825tm c129815tl;
        String str;
        AbstractC129825tm c129815tl2;
        java.util.Set<String> queryParameterNames;
        switch (this.A00) {
            case 0:
                MUI mui = (MUI) this.A01;
                MUH.A01(mui).A02.clear();
                mui.A04(true);
                return C0eB.A00;
            case 1:
                ((MTJ) ((MUI) this.A01).A08.getValue()).A00.A05();
                return C0eB.A00;
            case 2:
                C27961Xa A002 = AbstractC54912fq.A00();
                MUI mui2 = (MUI) this.A01;
                C19270xB c19270xB = (C19270xB) mui2.A05.getValue();
                UserSession session = mui2.getSession();
                QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A05;
                C54922fr A0S = AbstractC31175DnJ.A0S();
                A0S.A04 = new P72(mui2, 9);
                A0S.A0B = AbstractC166997dE.A0a();
                A0S.A08 = new MUU(mui2, 7);
                return A002.A02(mui2, c19270xB, session, A0S.A00(), quickPromotionSlot);
            case 3:
                MUI mui3 = (MUI) this.A01;
                return new C31253Dob(mui3.requireActivity(), (C19270xB) mui3.A05.getValue(), mui3.getSession());
            case 4:
                return new C31251DoZ(((MUI) this.A01).getSession());
            case 5:
                return new MUT(C18U.A01(C06090Tz.A05, ((MUI) this.A01).getSession(), 36601380585017524L), System.currentTimeMillis());
            case 6:
                return this.A01;
            case 7:
                return AbstractC25226BEj.A1C(this.A01);
            case 8:
                return AbstractC167027dH.A0B(this.A01);
            case 9:
                MUI mui4 = (MUI) this.A01;
                return new OI5(mui4, mui4.getSession());
            case 10:
                MUI mui5 = (MUI) this.A01;
                PillsFilterCategory pillsFilterCategory = (PillsFilterCategory) mui5.A0D.getValue();
                if (pillsFilterCategory == null || (A00 = pillsFilterCategory.A01) == null) {
                    A00 = MUH.A01(mui5).A00();
                }
                String A15 = AbstractC25225BEi.A15(mui5.A0J);
                if (A15 != null) {
                    c129815tl = new NQW(A15);
                } else {
                    c129815tl = new C129815tl(A00);
                }
                return AbstractC25230BEn.A0U(MSX.A0S(mui5).A0E(c129815tl, false, false));
            case 11:
                MUI mui6 = (MUI) this.A01;
                String A152 = AbstractC25225BEi.A15(mui6.A0J);
                if (A152 != null) {
                    c129815tl2 = new NQW(A152);
                } else {
                    PillsFilterCategory pillsFilterCategory2 = (PillsFilterCategory) mui6.A0D.getValue();
                    if (pillsFilterCategory2 != null) {
                        str = pillsFilterCategory2.A01;
                    } else {
                        str = null;
                    }
                    c129815tl2 = new C129815tl(str);
                }
                Application A0L = AbstractC25231BEo.A0L(mui6);
                UserSession session2 = mui6.getSession();
                InterfaceC09390do interfaceC09390do = mui6.A05;
                return new C50575MUg(A0L, (C19270xB) interfaceC09390do.getValue(), session2, (GZI) mui6.A0A.getValue(), c129815tl2, C167997eu.A00(AbstractC25231BEo.A0L(mui6), mui6.getSession(), ((C19270xB) interfaceC09390do.getValue()).A00));
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 14:
            default:
                ((ActivityFeedViewModel) this.A01).A0F();
                return C0eB.A00;
            case Process.SIGTERM /* 15 */:
                return new JTE((UserSession) this.A01);
            case 16:
                return new C50580MUo((AbstractC12990ll) this.A01);
            case 17:
                return new C50581MUp((UserSession) this.A01);
            case 18:
                return new MUR(AbstractC50578MUk.A00((UserSession) this.A01));
            case Process.SIGSTOP /* 19 */:
                android.net.Uri uri = ((InlineLinkUrn) this.A01).A00;
                if (uri != null && (queryParameterNames = uri.getQueryParameterNames()) != null) {
                    LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC50522MSa.A09(queryParameterNames));
                    for (String str2 : queryParameterNames) {
                        A18.put(str2, uri.getQueryParameter(str2));
                    }
                    return A18;
                }
                return AbstractC06930Yk.A0E();
            case 20:
                android.net.Uri uri2 = ((InlineLinkUrn) this.A01).A00;
                if (uri2 != null) {
                    return uri2.getHost();
                }
                return null;
            case 21:
                UserSession userSession = ((ActivityFeedViewModel) this.A01).A04;
                if (C18U.A06(C06090Tz.A05, userSession, 36330947968255069L)) {
                    return new CSH(userSession);
                }
                return null;
            case 22:
                return ((C31690Dvv) ((NidoExploreViewModel) this.A01).A03.getValue()).A04.getValue();
            case 23:
            case 24:
                return ((C8CV) this.A01).A00();
            case 25:
                return ((C31690Dvv) ((NidoExploreViewModel) this.A01).A03.getValue()).A05.getValue();
            case 26:
                return ((C31690Dvv) ((NidoExploreViewModel) this.A01).A03.getValue()).A06.getValue();
            case 27:
                return new C31690Dvv((UserSession) this.A01);
            case 28:
                return ((C31690Dvv) this.A01).A02.getValue();
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return ((C31690Dvv) this.A01).A03.getValue();
            case 30:
                return ((C31690Dvv) this.A01).A07;
            case 31:
                C55196Oe3.A04((C55196Oe3) this.A01, "DISMISSAL");
                return C0eB.A00;
            case 32:
                return null;
            case 33:
                return new C09530e4[((InterfaceC19390xP[]) this.A01).length];
            case 34:
                return new C34457FGv(C1AT.A01((UserSession) this.A01).A03(C1AV.A28));
            case 35:
                return new C55039OZl(AbstractC166987dD.A0O((Context) this.A01), C57294PcG.A00);
            case 36:
                return new L9c((UserSession) this.A01);
            case 37:
                C42201xA c42201xA = C1334460n.A01((UserSession) this.A01, "IgRxPushNotification").A02;
                C14360o3.A07(c42201xA);
                return new C47458Kxn(new C47457Kxm(c42201xA.A0N(AbstractC137146It.A00(AbstractC111324zv.A00(2936)))));
            case 38:
                return C023409i.A0A.A02(AbstractC31179DnN.A04(this.A01));
            case 39:
                return C023409i.A0A.A02(AbstractC31179DnN.A04(this.A01));
            case 40:
                return ((C0I) this.A01).A00.mErrorType;
            case Seq.NULL_REFNUM /* 41 */:
                return ((C0I) this.A01).A00.A07;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return Integer.valueOf(((C0I) this.A01).A00.A00);
            case 43:
                return ((C0I) this.A01).A00.A0A;
            case 44:
                return ((C0I) this.A01).A00.A02;
            case 45:
                return ((C0I) this.A01).A00.A0C;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return ((C0I) this.A01).A00;
            case 47:
                return ((C0I) this.A01).A00.A05;
            case 48:
                List list = ((C0J) this.A01).A00.A0B;
                if (list != null) {
                    return ImmutableList.copyOf((Collection) list);
                }
                return null;
            case 49:
                return ((C0J) this.A01).A00.mErrorType;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57518Pfs(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }
}
