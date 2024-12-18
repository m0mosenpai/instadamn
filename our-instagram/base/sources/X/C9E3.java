package X;

import android.content.Context;
import android.os.Looper;
import android.util.Base64;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.distribgw.client.DGWClient;
import com.facebook.distribgw.client.msys.DgwNetworkSessionPluginImpl;
import com.facebook.forker.Process;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.AuthData;
import com.facebook.msys.mci.RedactedString;
import com.instagram.common.session.UserSession;
import com.instagram.direct.msys.impl.MsysMailboxSessionManagerImpl;
import com.instagram.distribgw.client.DGWClientHolder;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import org.json.JSONObject;

/* renamed from: X.9E3, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9E3 extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9E3(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Type inference failed for: r0v116, types: [X.4Jq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [X.0ps, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.facebook.msys.mci.RedactedString, java.lang.Object] */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        int i;
        C46h A01;
        boolean z;
        String str;
        switch (this.A00) {
            case 0:
                return this.A01;
            case 1:
                return new C1586179w(((C7NA) this.A01).A00);
            case 2:
                return new C125055lB((UserSession) this.A01);
            case 3:
                C0f5 AEp = C18950wb.A01.AEp(AbstractC43591JPw.A00(648), 817891009);
                C83403nh c83403nh = (C83403nh) this.A01;
                AEp.ABW("item_type", c83403nh.A10.A00);
                C910143t A012 = AbstractC158887Ba.A01(c83403nh);
                if (A012 != null) {
                    i = A012.A02;
                } else {
                    i = -1;
                }
                AEp.ABU("xma_layout_type", i);
                AEp.report();
                return C0eB.A00;
            case 4:
                return Boolean.valueOf(C18U.A06(C06090Tz.A05, (AbstractC12990ll) this.A01, 36327752512584536L));
            case 5:
                return Boolean.valueOf(C18U.A06(C06090Tz.A05, (AbstractC12990ll) this.A01, 36318033005582176L));
            case 6:
                return new C136096Dr((UserSession) this.A01);
            case 7:
                UserSession userSession = (UserSession) this.A01;
                AccountSession A013 = C61A.A01(userSession, 0);
                C6Ek.A00(userSession).A00 = A013;
                return A013;
            case 8:
                UserSession userSession2 = (UserSession) this.A01;
                if (userSession2.isStopped()) {
                    AbstractC12120kG.A0J("Invalid create foreground account session when user session is stopped", null, AbstractC06930Yk.A0E(), 20134884);
                }
                AccountSession A014 = C61A.A01(userSession2, 0);
                C6Ek.A00(userSession2).A00 = A014;
                return A014;
            case 9:
                UserSession userSession3 = (UserSession) this.A01;
                AccountSession A015 = C61A.A01(userSession3, 1);
                C6Ek.A00(userSession3).A00 = A015;
                return A015;
            case 10:
            case 11:
            default:
                final UserSession userSession4 = (UserSession) this.A01;
                return new AbstractC12990ll(userSession4) { // from class: X.1wb
                    public final UserSession A00;

                    {
                        C14360o3.A0B(userSession4, 1);
                        this.A00 = userSession4;
                    }

                    @Override // X.AbstractC12990ll
                    public final C18720vz getDeviceSession() {
                        return this.A00.deviceSession;
                    }

                    @Override // X.AbstractC12990ll
                    public final String getToken() {
                        return this.A00.token;
                    }

                    @Override // X.AbstractC12990ll
                    public final boolean hasEnded() {
                        return this.A00.hasEnded();
                    }
                };
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                C1344765w c1344765w = DgwNetworkSessionPluginImpl.Companion;
                DGWClient dGWClient = DGWClientHolder.Companion.A00((UserSession) this.A01).client;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = C14250np.A00().A00;
                C14360o3.A07(scheduledThreadPoolExecutor);
                return new DgwNetworkSessionPluginImpl(dGWClient, scheduledThreadPoolExecutor);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                UserSession userSession5 = (UserSession) this.A01;
                Long BTC = C17060sy.A01.A01(userSession5).BTC();
                if (BTC == null) {
                    BTC = 0L;
                    C18950wb.A01.AEp("msys_eimu_null", 20134884).report();
                }
                C19U A016 = C11830jh.A04.A01(userSession5).A01(C19T.A1J);
                C14360o3.A0B(userSession5, 0);
                String str2 = C1F8.A00(userSession5).A04;
                if (str2 == null) {
                    A01 = C4JK.A00;
                } else {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("authorization", str2);
                    String obj = jSONObject.toString();
                    C14360o3.A07(obj);
                    byte[] bytes = obj.getBytes(C15W.A05);
                    C14360o3.A07(bytes);
                    A01 = C46h.A01(Base64.encodeToString(bytes, 11));
                }
                C14360o3.A0A(A01);
                if (A01 instanceof C4JL) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    C18950wb.A01.AEp("msys_ig_access_token_null", 20134884).report();
                }
                if (A016 == null) {
                    C18950wb.A01.AEp("msys_phoneId_null", 20134884).report();
                }
                RedactedString redactedString = RedactedString.$redex_init_class;
                String str3 = (String) A01.A05("");
                ?? obj2 = new Object();
                str3.getClass();
                obj2.mNativeHolder = RedactedString.initNativeHolder(str3);
                String A04 = C16030qx.A02.A04(AbstractC12290kX.A00);
                if (A04 != null) {
                    if (A016 == null || (str = A016.A01) == null) {
                        str = "";
                    }
                    AuthData authData = AuthData.$redex_init_class;
                    return new AuthData(obj2, null, A04, str, BTC.toString(), null, null, null, null, null, null, 2, null);
                }
                throw new IllegalStateException("Required value was null.");
            case 14:
                return new C7YG((UserSession) this.A01);
            case Process.SIGTERM /* 15 */:
                return new C9AU((UserSession) this.A01);
            case 16:
                UserSession userSession6 = (UserSession) this.A01;
                C47162Ei A00 = AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(2342156051463472752L));
                C47162Ei A002 = AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(2342156051464193657L));
                C47162Ei A003 = AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(2342156051464783488L));
                C47162Ei A004 = AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36313871178336533L));
                C47162Ei A005 = AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36876821131690103L));
                C47162Ei A006 = AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(2342156051463734899L));
                C47162Ei A007 = AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36600899547828298L));
                C47162Ei A008 = AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36313042252596883L));
                C47162Ei A009 = AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36320536967717524L));
                C47162Ei A0010 = AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36602011944292794L));
                C47162Ei A0011 = AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36602011945144763L));
                C47162Ei A0012 = AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36602011945275836L));
                C47162Ei A0013 = AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36602011945341373L));
                C47162Ei A0014 = AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36320536968766102L));
                C47162Ei A0015 = AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36320536970076830L));
                C47162Ei A0016 = AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36320536968831639L));
                C47162Ei A0017 = AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(2342163546182197909L));
                C47162Ei A0018 = AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36320536970011293L));
                C47162Ei A0019 = AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36313072314353380L));
                C47162Ei A0020 = AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36594551586359051L));
                C47162Ei A0021 = AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36594551586424588L));
                C17050sx A017 = AbstractC09440dt.A01(new MHH(userSession6, 32));
                C47162Ei A0022 = AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(37157467179843640L));
                C47162Ei A0023 = AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(37157467180105785L));
                C47162Ei A0024 = AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(37157467179778103L));
                C47162Ei A0025 = AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36313042250106484L));
                C47162Ei A0026 = AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36313076609320677L));
                C47162Ei A0027 = AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36313033659713134L));
                C47162Ei A0028 = AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36313042250565242L));
                C47162Ei A0029 = AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36313042250630779L));
                C47162Ei A0030 = AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36313042252924567L));
                C47162Ei A0031 = AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36313042250761853L));
                C47162Ei A0032 = AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36313437386573828L));
                C47162Ei A0033 = AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36313042249582191L));
                C47162Ei A0034 = AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36313042250303094L));
                C47162Ei A0035 = AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36313042250237557L));
                C47162Ei A0036 = AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36313042250892927L));
                C47162Ei A0037 = AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36314420934347313L));
                C47162Ei A0038 = AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(2342157430147844655L));
                C47162Ei A0039 = AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(2342157004946082161L));
                C47162Ei A0040 = AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(2342157004946147698L));
                C47162Ei A0041 = AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36314249135458810L));
                C47162Ei A0042 = AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36313042252465809L));
                C47162Ei A0043 = AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36315262747675769L));
                C47162Ei A0044 = AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36313390141999020L));
                C47162Ei A0045 = AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36313390142064557L));
                C47162Ei A0046 = AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36313390142130094L));
                C47162Ei A0047 = AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36313390142195631L));
                C17050sx A018 = AbstractC09440dt.A01(new MHH(userSession6, 33));
                return new C47142Eg(A00, A002, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, A0012, A0013, A0014, A0015, A0016, A0017, A0018, A0019, A0020, A0021, A0022, A0023, A0024, A0025, A0026, A0027, A0028, A0029, A0030, A0031, A0032, A0033, A0034, A0035, A0036, A0037, A0038, A0039, A0040, A0041, A0042, A0043, A0044, A0045, A0046, A0047, AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36313042252007050L)), AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36313879768205598L)), AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36313063725532888L)), AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36315752374013471L)), AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36315752374603297L)), AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36315752374668834L)), AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36315795323751993L)), AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36315795323686456L)), AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36313042253645473L)), AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36316869065446091L)), AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36317113878647596L)), AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36598773538884907L)), AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36317298562307098L)), AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36313042254169767L)), AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36317513310541094L)), AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36318372304001142L)), AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36318372304066679L)), AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36600276777635675L)), AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(37163226731184397L)), AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(37163226731249934L)), AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36318801801189872L)), AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(37163226731381007L)), AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36318801801320945L)), AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36322482587904263L)), AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36885432541381236L)), AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36885432541119091L)), AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(37166907517960636L)), AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36319609254911544L)), AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36313042255349425L)), AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36328658750684878L)), AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36319626434453053L)), AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36320206255104146L)), AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36317298562831387L)), AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36321679428822707L)), AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(2342164860441470830L)), AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36321851227907952L)), AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(2342164860441536367L)), AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36321851227973489L)), AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36321851228039026L)), AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(2342164688642713269L)), AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36315928475930420L)), AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36322680156400017L)), AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36322680157383064L)), AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36321851228104563L)), AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36320536969487001L)), AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36602011946258878L)), AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36602011946324415L)), AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36602011946389952L)), AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36330127629501130L)), AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36611602606332207L)), AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36330127629566667L)), AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36330127629697740L)), AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36314386574477854L)), AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36314386574412317L)), AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(2342156051466487446L)), AbstractC47152Eh.A00(userSession6, AbstractC20100yh.A00(36313063724877523L)), A017, A018);
            case 17:
                return new MsysMailboxSessionManagerImpl((UserSession) this.A01);
            case 18:
                Runnable runnable = (Runnable) this.A01;
                if (runnable != null) {
                    runnable.run();
                    return C0eB.A00;
                }
                return null;
            case Process.SIGSTOP /* 19 */:
                UserSession userSession7 = (UserSession) this.A01;
                return new C6AI(userSession7, C2FO.A00(userSession7), C47272Eu.A00(userSession7));
            case 20:
                UserSession userSession8 = (UserSession) this.A01;
                return new C1345166a(AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(2342156206082164544L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36328993758134194L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36610468734900310L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36594517226882805L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36322658681432457L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36594517233239805L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36610468736014428L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36594517234157312L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36321851228301172L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36322680157186454L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36610468735424601L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(2342161871152356052L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(2342166956385578709L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36321438911768006L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(2342161428762925192L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36328126175001804L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36318776031058399L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36600251007700809L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36318118901520313L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36319626434453053L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36319630729420350L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36326025935795785L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36322680157120917L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36328993759182781L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36313042257381060L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36320412413796833L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36322319380064407L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36323947172409051L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36328843434278728L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(2342156051467273888L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36322680156531091L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36314051567159689L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36314051567225226L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36319278542494851L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36319428865957290L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36319424570989992L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36319278542363778L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36319278542298241L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36313042257774281L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36313042257708744L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36313042257643207L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36313042257512133L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36317281386632216L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36328804779573041L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36323947171557073L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36323947171557073L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36314051567028615L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36314051566963078L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36314051567094152L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36314051566897541L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36324063135674228L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36313042255808180L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36314481063627390L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36314322149837329L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36322319379867797L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36323947172212441L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36323947172015831L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36322680156400017L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36315795323620919L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36321438910653883L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36594517233895167L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36318861938137808L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36313042253842084L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36313042253645473L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36317281386238995L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36322680157251991L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36313042256594622L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36317281386566679L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36328993759444926L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36322319379146894L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36321851227973489L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36324453977764014L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(2342164860441470830L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36317281386107922L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36317281385714702L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36317281385518092L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36318861934729898L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36313042256725695L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36317281386697753L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36317277087405021L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36313042253121178L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36318861936499389L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36317281386370068L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36313042256070328L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36317281385845776L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36317281384993802L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36322658681366920L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36324453977829551L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36318419549165703L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36322680156268944L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36322680157055380L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36595956040534301L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36595956040599838L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36329053887676407L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36595797126678786L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(2342161871149931194L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36603794356507621L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(2342157580471962319L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(2342157580471896782L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(2342157580472879833L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(2342157580472814296L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(2342157580471634634L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(2342157580471700171L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(2342157580472093393L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(2342157580472027856L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(2342157580472486613L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(2342157580472421076L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(2342157580472683222L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(2342157580472748759L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(2342157580472158930L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(2342157580472224467L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(2342157580471765708L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(2342157580471831245L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36881811892470180L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36318861937285830L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36322353738688680L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(2342156051471271622L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36324453977895088L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36316035841789837L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36322319379998870L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36878985795338471L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36605422148326657L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(37160460772245619L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36319278542494851L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36594517234681601L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36594517233370878L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36604155133432875L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36604155133498412L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36328753240162060L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36594517232846588L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36328126175132877L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36320412413600222L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36604155134022701L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36322319380195481L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36598756362030363L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36598756362292510L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36598756362161437L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36609468007454607L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36604155133039658L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36322319379736724L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(37166744309727667L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36603794356376548L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36609468007520144L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36609601151440823L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36609601151440823L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36320412414124518L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36320412414386665L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36320412414648813L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36601887390896514L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36320412414517739L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36313042256987840L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36323947171688146L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36323947171688146L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36313042257839818L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36314420934085166L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36322680156465554L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36598756362095900L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36318002937009936L)), AbstractC47152Eh.A00(userSession8, AbstractC20100yh.A00(36318002936944399L)));
            case 21:
                C18C.A0J(!C14360o3.A0K(Thread.currentThread(), Looper.getMainLooper().getThread()), "To avoid ANRs, IgMailbox initialization should not run on main thread", new Object[0]);
                UserSession userSession9 = (UserSession) this.A01;
                ?? obj3 = new Object();
                CountDownLatch countDownLatch = new CountDownLatch(1);
                C1334460n.A01(userSession9, AbstractC43591JPw.A00(643)).A03(new M8I(countDownLatch, obj3));
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                    C0K8.A0E("IgMailbox", "Interrupted when initializing IgMailbox");
                }
                Object obj4 = obj3.A00;
                if (obj4 != null) {
                    return new C131225wA((Mailbox) obj4);
                }
                throw new IllegalStateException("Required value was null.");
            case 22:
                return new C41881wd(((UserSession) this.A01).userId);
            case 23:
                return new C132065xh((UserSession) this.A01);
            case 24:
                final UserSession userSession10 = (UserSession) this.A01;
                C14360o3.A0B(userSession10, 0);
                final C162237Oh c162237Oh = new C162237Oh(AbstractC162217Of.A02(userSession10));
                final C162237Oh c162237Oh2 = new C162237Oh(AbstractC162217Of.A01(userSession10));
                return new AbstractC220129ny(userSession10, c162237Oh, c162237Oh2) { // from class: X.9nw
                    public final C162237Oh A00;
                    public final C162237Oh A01;

                    {
                        this.A01 = c162237Oh;
                        this.A00 = c162237Oh2;
                    }
                };
            case 25:
                final UserSession userSession11 = (UserSession) this.A01;
                C14360o3.A0B(userSession11, 0);
                final C162237Oh c162237Oh3 = new C162237Oh(AbstractC162217Of.A02(userSession11));
                final C162237Oh c162237Oh4 = new C162237Oh(AbstractC162217Of.A00(userSession11));
                return new AbstractC220129ny(userSession11, c162237Oh3, c162237Oh4) { // from class: X.9nv
                    public final C162237Oh A00;
                    public final C162237Oh A01;

                    {
                        this.A01 = c162237Oh3;
                        this.A00 = c162237Oh4;
                    }
                };
            case 26:
                final UserSession userSession12 = (UserSession) this.A01;
                C14360o3.A0B(userSession12, 0);
                final C162237Oh c162237Oh5 = new C162237Oh(AbstractC162217Of.A01(userSession12));
                return new AbstractC162197Od(userSession12, c162237Oh5) { // from class: X.9nx
                    public final C162237Oh A00;

                    {
                        this.A00 = c162237Oh5;
                    }
                };
            case 27:
                final UserSession userSession13 = (UserSession) this.A01;
                C14360o3.A0B(userSession13, 0);
                final C162237Oh c162237Oh6 = new C162237Oh(AbstractC162217Of.A00(userSession13));
                return new AbstractC162197Od(userSession13, c162237Oh6) { // from class: X.77W
                    public final C162237Oh A00;

                    {
                        this.A00 = c162237Oh6;
                    }
                };
            case 28:
                UserSession userSession14 = (UserSession) this.A01;
                C006802i c006802i = C006802i.A0p;
                C14360o3.A07(c006802i);
                C218914p c218914p = C218914p.A08;
                int i2 = 20131727;
                if (C18U.A06(C06090Tz.A05, userSession14, 36323968647376629L)) {
                    i2 = 20127832;
                }
                return new C2FQ(c006802i, c218914p, userSession14, i2);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                UserSession userSession15 = (UserSession) this.A01;
                C006802i c006802i2 = C006802i.A0p;
                C14360o3.A07(c006802i2);
                return new C47252Er(c006802i2, userSession15);
            case 30:
                C13920nI c13920nI = C13920nI.A00;
                C221315o c221315o = AbstractC221215n.sStartupTypeDetector;
                C14360o3.A07(c221315o);
                C006802i c006802i3 = C006802i.A0p;
                C14360o3.A07(c006802i3);
                return new C47232Ep(c006802i3, c13920nI, AbstractC47242Eq.A00((UserSession) this.A01), c221315o);
            case 31:
                UserSession userSession16 = (UserSession) this.A01;
                C006802i c006802i4 = C006802i.A0p;
                C14360o3.A07(c006802i4);
                return new C7X3(c006802i4, C218914p.A08, userSession16);
            case 32:
                return new C8M1((UserSession) this.A01);
            case 33:
                return ((AbstractC69603Au) this.A01).A02("view_holder_preload");
            case 34:
                UserSession userSession17 = (UserSession) this.A01;
                return new C93814Jp(AbstractC25651Mw.A00(userSession17), new Object(), AnonymousClass189.A00(userSession17));
            case 35:
                C99E c99e = C99C.A01;
                return new C99C(((Boolean) AbstractC47132Ef.A00((UserSession) this.A01).A1D.get()).booleanValue());
            case 36:
                return new C47976LIn(((C9A2) this.A01).A00);
            case 37:
                UserSession userSession18 = ((C9A2) this.A01).A00;
                return userSession18.A01(C47778L8d.class, new C37056GUm(userSession18, 44));
            case 38:
                return ((InterfaceC16820sZ) this.A01).invoke();
            case 39:
                return new C94104Kw((UserSession) this.A01);
            case 40:
                return C1ZV.A00(((C4KR) this.A01).A04);
            case Seq.NULL_REFNUM /* 41 */:
                UserSession userSession19 = (UserSession) this.A01;
                return new AnonymousClass995(userSession19, AbstractC28761aE.A00(userSession19));
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return ((C56352iT) this.A01).A0P;
            case 43:
                return Integer.valueOf(((C56352iT) this.A01).AYS());
            case 44:
                return ((C3EQ) this.A01).A03.getResources().getString(2131960037);
            case 45:
                return ((C3EQ) this.A01).A03.getResources().getString(2131976757);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return Integer.valueOf(((C3EJ) this.A01).A05.getResources().getDimensionPixelSize(R.dimen.direct_composer_redesign_background_height));
            case 47:
                return new C42W((UserSession) this.A01);
            case 48:
                return new C109494wb((UserSession) this.A01);
            case 49:
                Context context = AbstractC12290kX.A00;
                C14360o3.A07(context);
                return new C7TG(context, (UserSession) this.A01);
        }
    }
}
