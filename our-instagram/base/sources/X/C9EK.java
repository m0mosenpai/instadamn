package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.PowerManager;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.util.startup.appwarmer.KeepWarmAgainReceiver;
import com.instagram.video.live.mvvm.model.datasource.api.IgLiveCommentsApi;
import com.instagram.video.live.mvvm.model.datasource.api.IgLiveLikesApi;
import com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveLikesRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveModerationRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveQuestionSubmissionsRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveQuestionsRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveShareRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveViewerJoinFlowRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;
import go.Seq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.9EK, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9EK extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9EK(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r0v129, types: [X.A6H, java.lang.Object] */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        C226418s c226418s;
        String A00;
        List<String> list;
        Integer A0i;
        NYV nyv;
        NYW nyw;
        C147766l1 c147766l1;
        InterfaceC09390do interfaceC09390do;
        switch (this.A00) {
            case 0:
                Object systemService = ((C1CM) this.A01).A08.getSystemService("power");
                if (!(systemService instanceof PowerManager)) {
                    return null;
                }
                return systemService;
            case 1:
                return new C23531Cp((UserSession) this.A01);
            case 2:
                try {
                    Thread.sleep(9000L);
                } catch (InterruptedException unused) {
                } catch (Throwable th) {
                    try {
                        BroadcastReceiver.PendingResult pendingResult = ((KeepWarmAgainReceiver) this.A01).A00;
                        if (pendingResult != null) {
                            pendingResult.finish();
                        }
                    } catch (IllegalStateException unused2) {
                    }
                    throw th;
                }
                try {
                    BroadcastReceiver.PendingResult pendingResult2 = ((KeepWarmAgainReceiver) this.A01).A00;
                    if (pendingResult2 != null) {
                        pendingResult2.finish();
                    }
                } catch (IllegalStateException unused3) {
                }
                return C0eB.A00;
            case 3:
                List BQP = ((C3W0) this.A01).BQP();
                if (BQP != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = BQP.iterator();
                    while (it.hasNext()) {
                        List Boc = ((InterfaceC74423Vy) it.next()).Boc();
                        if (Boc == null) {
                            Boc = C16930sl.A00;
                        }
                        AnonymousClass016.A16(Boc, arrayList);
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ExtendedImageUrl BGU = ((InterfaceC74403Vw) it2.next()).BGU();
                        if (BGU != null) {
                            BGU.A02 = false;
                        }
                    }
                }
                return C0eB.A00;
            case 4:
                List BGh = ((C3W0) this.A01).BGh();
                if (BGh != null) {
                    Iterator it3 = BGh.iterator();
                    while (it3.hasNext()) {
                        ((ExtendedImageUrl) it3.next()).A02 = false;
                    }
                }
                return C0eB.A00;
            case 5:
                UserSession userSession = (UserSession) this.A01;
                return new C1CI(userSession, new C1CJ(userSession.deviceSession.A06(), userSession));
            case 6:
                return new C17590tu(AbstractC17610tw.A00(((C1CI) this.A01).A06));
            case 7:
                return new C1LD((UserSession) this.A01);
            case 8:
                return new C1IP(((C226418s) this.A01).A0D());
            case 9:
                c226418s = (C226418s) this.A01;
                A00 = AbstractC111324zv.A00(1620);
                c226418s.A0P(c226418s.A02, A00);
                return C0eB.A00;
            case 10:
                c226418s = (C226418s) this.A01;
                A00 = AbstractC111324zv.A00(3609);
                c226418s.A0P(c226418s.A02, A00);
                return C0eB.A00;
            case 11:
                c226418s = (C226418s) this.A01;
                A00 = "FEED_REQUEST_END";
                c226418s.A0P(c226418s.A02, A00);
                return C0eB.A00;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                c226418s = (C226418s) this.A01;
                A00 = "FEED_REQUEST_SUCCEEDED";
                c226418s.A0P(c226418s.A02, A00);
                return C0eB.A00;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                c226418s = (C226418s) this.A01;
                A00 = "STORIES_REQUEST_START";
                c226418s.A0P(c226418s.A02, A00);
                return C0eB.A00;
            case 14:
                c226418s = (C226418s) this.A01;
                A00 = "STORIES_REQUEST_END";
                c226418s.A0P(c226418s.A02, A00);
                return C0eB.A00;
            case Process.SIGTERM /* 15 */:
                String string = ((InterfaceC19630xq) ((AnonymousClass523) this.A01).A03.getValue()).getString("key", null);
                ArrayList arrayList2 = new ArrayList();
                if (string != null) {
                    list = AbstractC001900j.A0R(string, new String[]{";"}, 0);
                } else {
                    list = C16930sl.A00;
                }
                for (String str : list) {
                    C14360o3.A0B(str, 0);
                    List A0R = AbstractC001900j.A0R(str, new String[]{":"}, 0);
                    if (A0R.size() == 3 && (A0i = AbstractC003100w.A0i((String) A0R.get(0))) != null) {
                        int intValue = A0i.intValue();
                        String str2 = (String) A0R.get(1);
                        C14360o3.A0B(str2, 0);
                        Long A0k = AbstractC003100w.A0k(10, str2);
                        if (A0k != null) {
                            long longValue = A0k.longValue();
                            String str3 = (String) A0R.get(2);
                            C14360o3.A0B(str3, 0);
                            Long A0k2 = AbstractC003100w.A0k(10, str3);
                            if (A0k2 != null) {
                                long longValue2 = A0k2.longValue();
                                C1CA c1ca = (C1CA) AbstractC009903n.A06(C1CA.values(), intValue);
                                if (c1ca == null) {
                                    c1ca = C1CA.A07;
                                }
                                arrayList2.add(new AnonymousClass524(c1ca, longValue, longValue2));
                            }
                        }
                    }
                }
                return arrayList2;
            case 16:
                SharedPreferences sharedPreferences = ((AnonymousClass523) this.A01).A01.getSharedPreferences("historical_app_start_v2", 0);
                C14360o3.A0A(sharedPreferences);
                return new C17320tT(sharedPreferences, "HistoricalAppStartManagerImpl");
            case 17:
                StringBuilder sb = new StringBuilder();
                sb.append("network/");
                sb.append(((C26641Qt) this.A01).A00.A09);
                String lowerCase = sb.toString().toLowerCase(Locale.ROOT);
                C14360o3.A07(lowerCase);
                return lowerCase;
            case 18:
                String str4 = ((C26641Qt) this.A01).A00.A0D;
                C14360o3.A06(str4);
                return AbstractC001900j.A0M(new C11L("/+").A00(C26641Qt.A04.A00(AbstractC001900j.A0F("IgApi:", str4), "/"), "_"), '_', ' ');
            case Process.SIGSTOP /* 19 */:
                return new C3Q4((UserSession) this.A01);
            case 20:
                AbstractC147746kz abstractC147746kz = (AbstractC147746kz) this.A01;
                return new OBA(abstractC147746kz.A00, abstractC147746kz.A01);
            case 21:
                AbstractC147746kz abstractC147746kz2 = (AbstractC147746kz) this.A01;
                return new O92(abstractC147746kz2.A00, abstractC147746kz2.A01);
            case 22:
                AbstractC147746kz abstractC147746kz3 = (AbstractC147746kz) this.A01;
                return new C54810OKj(abstractC147746kz3.A00, abstractC147746kz3.A01);
            case 23:
                AbstractC147746kz abstractC147746kz4 = (AbstractC147746kz) this.A01;
                int ordinal = abstractC147746kz4.A02.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 2) {
                        if (ordinal == 1) {
                            if (!(abstractC147746kz4 instanceof C147766l1) || (c147766l1 = (C147766l1) abstractC147746kz4) == null) {
                                return null;
                            }
                            interfaceC09390do = c147766l1.A05;
                            return interfaceC09390do.getValue();
                        }
                        throw new RuntimeException();
                    }
                    if (!(abstractC147746kz4 instanceof NYW) || (nyw = (NYW) abstractC147746kz4) == null) {
                        return null;
                    }
                    return nyw.A01;
                }
                if (!(abstractC147746kz4 instanceof NYV) || (nyv = (NYV) abstractC147746kz4) == null) {
                    return null;
                }
                return nyv.A00;
            case 24:
                AbstractC147746kz abstractC147746kz5 = (AbstractC147746kz) this.A01;
                return new OBC(abstractC147746kz5.A00, abstractC147746kz5.A01, abstractC147746kz5.A02);
            case 25:
                AbstractC147746kz abstractC147746kz6 = (AbstractC147746kz) this.A01;
                return new OT2(abstractC147746kz6.A00, abstractC147746kz6.A01);
            case 26:
            case 27:
            default:
                interfaceC09390do = ((C147766l1) this.A01).A05;
                return interfaceC09390do.getValue();
            case 28:
                AbstractC147826l7 abstractC147826l7 = (AbstractC147826l7) this.A01;
                return new IgLiveBroadcastInfoManager(abstractC147826l7.A01, abstractC147826l7.A02);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                interfaceC09390do = ((AbstractC147826l7) this.A01).A05;
                return interfaceC09390do.getValue();
            case 30:
                AbstractC147826l7 abstractC147826l72 = (AbstractC147826l7) this.A01;
                UserSession userSession2 = abstractC147826l72.A01;
                return new IgLiveCommentsRepository(userSession2, new IgLiveCommentsApi(userSession2), abstractC147826l72.A02, abstractC147826l72.A01());
            case 31:
                AbstractC147826l7 abstractC147826l73 = (AbstractC147826l7) this.A01;
                return new IgLiveHeartbeatManager(abstractC147826l73.A01, abstractC147826l73.A02, abstractC147826l73.A01(), abstractC147826l73.A03);
            case 32:
                AbstractC147826l7 abstractC147826l74 = (AbstractC147826l7) this.A01;
                UserSession userSession3 = abstractC147826l74.A01;
                return new IgLiveLikesRepository(userSession3, new IgLiveLikesApi(userSession3), abstractC147826l74.A01(), abstractC147826l74.A03);
            case 33:
                AbstractC147826l7 abstractC147826l75 = (AbstractC147826l7) this.A01;
                EnumC142806cg enumC142806cg = abstractC147826l75.A02;
                UserSession userSession4 = abstractC147826l75.A01;
                C06090Tz c06090Tz = C06090Tz.A05;
                return new OLC(userSession4, enumC142806cg, C18U.A01(c06090Tz, userSession4, 36599499388620374L), C18U.A01(c06090Tz, userSession4, 36604086413497375L), C18U.A06(c06090Tz, userSession4, 2342161033625737019L));
            case 34:
                return new IgLiveModerationRepository(((AbstractC147826l7) this.A01).A01);
            case 35:
                UserSession userSession5 = ((AbstractC147826l7) this.A01).A01;
                return new C147886lK(userSession5, userSession5.userId);
            case 36:
                return new IgLiveQuestionSubmissionsRepository(((AbstractC147826l7) this.A01).A01);
            case 37:
                return new IgLiveQuestionsRepository(((AbstractC147826l7) this.A01).A01);
            case 38:
                return new IgLiveShareRepository(((AbstractC147826l7) this.A01).A01);
            case 39:
                if (!AbstractC195888lY.A01(null, ((AbstractC147826l7) this.A01).A01)) {
                    return null;
                }
                AbstractC195888lY.A00();
                return LIV.A05;
            case 40:
                return new OCR(((AbstractC147826l7) this.A01).A01);
            case Seq.NULL_REFNUM /* 41 */:
                return new OJ4(AbstractC109224vo.A05((UserSession) this.A01));
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return new IgLiveViewerJoinFlowRepository((UserSession) this.A01);
            case 43:
                return new C57242jz((UserSession) this.A01);
            case 44:
                java.util.Set set = C95694Sd.A0I;
                Context context = AbstractC12290kX.A00;
                C14360o3.A07(context);
                return new C95694Sd(context, (UserSession) this.A01);
            case 45:
                SurfaceHolderCallbackC98844c4 surfaceHolderCallbackC98844c4 = (SurfaceHolderCallbackC98844c4) this.A01;
                if (C18U.A06(C06090Tz.A05, surfaceHolderCallbackC98844c4.A04, 36316224821006513L)) {
                    surfaceHolderCallbackC98844c4.A00 = new Object();
                }
                surfaceHolderCallbackC98844c4.A02.getHolder().addCallback(surfaceHolderCallbackC98844c4);
                return C0eB.A00;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                C4a9 c4a9 = (C4a9) this.A01;
                c4a9.A02.A02(c4a9);
                return C0eB.A00;
            case 47:
                return new C37911pU(new C14080nY(), (int) C18U.A01(C06090Tz.A05, (AbstractC12990ll) this.A01, 36592988224815984L));
            case 48:
                AbstractC12990ll abstractC12990ll = (AbstractC12990ll) this.A01;
                C14360o3.A0B(abstractC12990ll, 0);
                return abstractC12990ll.A01(C63472uU.class, new C57247PbV(abstractC12990ll, 21));
            case 49:
                return new C70203De((UserSession) this.A01);
        }
    }
}
