package X;

import android.app.Activity;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.messenger.notification.engine.MSGNotificationEngineValueProvider;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mci.SessionedNotificationCenter;
import com.instagram.common.session.UserSession;
import com.instagram.direct.msys.mailbox.core.mutation.MsysMessageEditor;
import com.instagram.direct.notifications.sync.NotificationEngineInstagramSyncIntegrator;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.realtimeclient.RealtimeClientManager;
import go.Seq;

/* loaded from: classes8.dex */
public final class MHJ extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MHJ(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static MHJ A00(Object obj, int i) {
        return new MHJ(obj, i);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r0v106, types: [X.K3K, com.facebook.msys.mca.MailboxFeature] */
    /* JADX WARN: Type inference failed for: r0v120, types: [com.facebook.msys.mca.MailboxFeature, X.66g] */
    /* JADX WARN: Type inference failed for: r0v125, types: [X.K3X, com.facebook.msys.mca.MailboxFeature] */
    /* JADX WARN: Type inference failed for: r0v132, types: [X.K3D, com.facebook.msys.mca.MailboxFeature] */
    /* JADX WARN: Type inference failed for: r0v136, types: [com.facebook.msys.mca.MailboxFeature, X.K3C] */
    /* JADX WARN: Type inference failed for: r0v94, types: [com.facebook.msys.mca.MailboxFeature, X.K3a] */
    /* JADX WARN: Type inference failed for: r0v98, types: [X.K3Z, com.facebook.msys.mca.MailboxFeature] */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        AbstractC52922bZ A0Z;
        C141796aw A00;
        int i;
        Activity activity;
        int i2;
        Object[] objArr;
        Object obj;
        char c;
        InterfaceC135846Cm A002;
        switch (this.A00) {
            case 0:
                return new LE2((UserSession) this.A01);
            case 1:
                return new L6O((UserSession) this.A01);
            case 2:
                return new MsysMessageEditor((UserSession) this.A01);
            case 3:
                return new C47392Kwh((UserSession) this.A01);
            case 4:
                return C137746Lw.A00((UserSession) this.A01, "IgMailboxThreadSessionController").A01;
            case 5:
                MailboxFeature mailboxFeature = MailboxFeature.$redex_init_class;
                return new C47393Kwi(new MailboxFeature(C44106JeV.A00((UserSession) this.A01)));
            case 6:
                MailboxFeature mailboxFeature2 = MailboxFeature.$redex_init_class;
                return new C47394Kwj(new MailboxFeature(C44106JeV.A00((UserSession) this.A01)));
            case 7:
                C2057599a c2057599a = C99Y.A00;
                UserSession userSession = (UserSession) this.A01;
                if (c2057599a.A02(userSession, true)) {
                    C14360o3.A0B(userSession, 0);
                    A002 = (C48163LTn) userSession.A01(C48163LTn.class, new MHH(userSession, 49));
                } else if (AbstractC94034Kn.A00(userSession)) {
                    A002 = C44106JeV.A00(userSession);
                } else {
                    A002 = JVC.A00.A00(userSession);
                }
                return new C47395Kwk(new MailboxFeature(A002));
            case 8:
                return new LEA(new MailboxFeature(C44106JeV.A00((UserSession) this.A01)));
            case 9:
                AbstractC1345065z abstractC1345065z = C133255zr.A00;
                return new C47396Kwl(new C47616L1b(C42221xC.A09(new MailboxFeature(JVC.A00.A00((UserSession) this.A01)))));
            case 10:
                return new C47751L6v((UserSession) this.A01);
            case 11:
                C42201xA c42201xA = C1334460n.A01((UserSession) this.A01, "IgRxSafeBrowsing").A02;
                C14360o3.A07(c42201xA);
                return new C47398Kwn(new C47397Kwm(c42201xA));
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return new C128765rk(C218914p.A08, (UserSession) this.A01);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                MailboxFeature mailboxFeature3 = MailboxFeature.$redex_init_class;
                return new C44107JeW(new MailboxFeature(C44106JeV.A00((UserSession) this.A01)));
            case 14:
                return new C132025xd((UserSession) this.A01);
            case Process.SIGTERM /* 15 */:
                return new L6Q((UserSession) this.A01);
            case 16:
                AbstractC1345065z abstractC1345065z2 = K3Z.A00;
                return new C47399Kwo(new MailboxFeature(C44106JeV.A00((UserSession) this.A01)));
            case 17:
                AbstractC1345065z abstractC1345065z3 = K3a.A00;
                return new LEB(new MailboxFeature(C44106JeV.A00((UserSession) this.A01)));
            case 18:
                SessionedNotificationCenter sessionedNotificationCenter = (SessionedNotificationCenter) this.A01;
                C48523LdL c48523LdL = new C48523LdL(sessionedNotificationCenter);
                sessionedNotificationCenter.addObserver(c48523LdL.A01, AbstractC111324zv.A00(1690), 1, null);
                sessionedNotificationCenter.addObserver(c48523LdL.A00, "MEMOfflineHandlingCompletionNotification", 1, null);
                return c48523LdL;
            case Process.SIGSTOP /* 19 */:
                UserSession userSession2 = (UserSession) this.A01;
                int i3 = 200;
                if (C1C0.A00(userSession2)) {
                    i3 = 500;
                }
                return new C452726k(userSession2, i3);
            case 20:
                return Boolean.valueOf(RealtimeClientManager.getInstance((UserSession) this.A01).isReceivingRealtimeAndForeground());
            case 21:
                return AbstractC46884KoR.A00((UserSession) this.A01);
            case 22:
                objArr = new MQ0[10];
                C43731JVq c43731JVq = (C43731JVq) this.A01;
                objArr[0] = new C43723JVi(c43731JVq);
                objArr[1] = new C43721JVg(c43731JVq);
                objArr[2] = new C43722JVh(c43731JVq);
                objArr[3] = new C43734JVt(c43731JVq);
                objArr[4] = new C43733JVs(c43731JVq);
                objArr[5] = new C43730JVp(c43731JVq);
                objArr[6] = new C43728JVn(c43731JVq);
                objArr[7] = new C43727JVm(c43731JVq);
                objArr[8] = new C43729JVo(c43731JVq);
                obj = new C43726JVl(c43731JVq);
                c = '\t';
                objArr[c] = obj;
                return AbstractC16960so.A1Q(objArr);
            case 23:
                objArr = new MQ0[2];
                C47668L3b c47668L3b = (C47668L3b) this.A01;
                objArr[0] = new C49252Lq8(c47668L3b);
                obj = new C49253Lq9(c47668L3b);
                c = 1;
                objArr[c] = obj;
                return AbstractC16960so.A1Q(objArr);
            case 24:
                objArr = new MQ0[2];
                C47668L3b c47668L3b2 = (C47668L3b) this.A01;
                objArr[0] = new Lq7(c47668L3b2);
                obj = new C49254LqA(c47668L3b2);
                c = 1;
                objArr[c] = obj;
                return AbstractC16960so.A1Q(objArr);
            case 25:
                objArr = new MQ0[4];
                C47658L2r c47658L2r = (C47658L2r) this.A01;
                objArr[0] = new C49256LqC(c47658L2r);
                objArr[1] = new C49258LqE(c47658L2r);
                objArr[2] = new C49257LqD(c47658L2r);
                obj = new Object();
                c = 3;
                objArr[c] = obj;
                return AbstractC16960so.A1Q(objArr);
            case 26:
                return new C48524LdM((UserSession) this.A01);
            case 27:
                return new C132605yj(AbstractC12220kQ.A02((AbstractC12990ll) this.A01), C218914p.A08);
            case 28:
                return new C35165FfF(AbstractC12220kQ.A02((AbstractC12990ll) this.A01));
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                UserSession userSession3 = (UserSession) this.A01;
                MSGNotificationEngineValueProvider mSGNotificationEngineValueProvider = new MSGNotificationEngineValueProvider();
                K37 k37 = new K37(userSession3);
                C14360o3.A0B(userSession3, 0);
                return new NotificationEngineInstagramSyncIntegrator(userSession3, mSGNotificationEngineValueProvider, k37, new L7H(userSession3, new C48155LTe(userSession3), new C48157LTg(userSession3, C47882LDc.A00)));
            case 30:
                return new C4KU((UserSession) this.A01);
            case 31:
                activity = ((C44000Jcn) this.A01).A00;
                i2 = R.attr.igds_color_secondary_text;
                return Integer.valueOf(AbstractC167007dF.A09(activity, i2));
            case 32:
                activity = ((C44000Jcn) this.A01).A00;
                i2 = R.attr.igds_color_primary_text;
                return Integer.valueOf(AbstractC167007dF.A09(activity, i2));
            case 33:
                return ((C44000Jcn) this.A01).A00.getDrawable(R.drawable.instagram_creator_marketplace_pano_outline_24);
            case 34:
                Activity activity2 = ((C44000Jcn) this.A01).A00;
                C43768JXh c43768JXh = new C43768JXh(activity2);
                int color = activity2.getColor(R.color.badge_color);
                c43768JXh.A00 = color;
                c43768JXh.A01 = color;
                c43768JXh.A02 = true;
                c43768JXh.A03 = false;
                return c43768JXh;
            case 35:
                return new C47618L1d(AbstractC43592JPx.A0N(), (UserSession) this.A01);
            case 36:
                return new C99H(AbstractC43592JPx.A0N(), (UserSession) this.A01);
            case 37:
                return new C4KO(AbstractC43592JPx.A0N());
            case 38:
                return new C4KO(AbstractC43592JPx.A0N());
            case 39:
                return new C4KO(AbstractC43592JPx.A0N());
            case 40:
                return new L7I((UserSession) this.A01);
            case Seq.NULL_REFNUM /* 41 */:
                return new C47910LEe(AbstractC43592JPx.A0N(), C218914p.A08, (UserSession) this.A01);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return new C47619L1e(AbstractC43592JPx.A0N(), C218914p.A08);
            case 43:
                return new C43749JWk(AbstractC43592JPx.A0N());
            case 44:
                return AbstractC166997dE.A0c(C06090Tz.A05, ((LG2) this.A01).A02, 36316173281267806L);
            case 45:
                AbstractC25227BEk.A1A(((CP1) this.A01).A00, false);
                return C0eB.A00;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                InterfaceC09390do interfaceC09390do = ((C26780Bs3) this.A01).A01;
                ((C44505JmB) interfaceC09390do.getValue()).A02.markerPoint(834879336, "delete_popup_delete_click");
                A0Z = AbstractC25225BEi.A0Z(interfaceC09390do);
                A00 = AbstractC141776au.A00(A0Z);
                i = 27;
                MCO.A04(A0Z, A00, i);
                return C0eB.A00;
            case 47:
                A0Z = AbstractC25225BEi.A0Z(((C26780Bs3) this.A01).A01);
                A00 = AbstractC141776au.A00(A0Z);
                i = 28;
                MCO.A04(A0Z, A00, i);
                return C0eB.A00;
            case 48:
                return this.A01;
            default:
                return AbstractC25226BEj.A1C(this.A01);
        }
    }
}
