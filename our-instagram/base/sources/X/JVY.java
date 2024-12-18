package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.encryptedbackups.mca.MailboxEncryptedBackupsJNI;
import com.facebook.forker.Process;
import com.facebook.instagrammem.mca.MailboxInstagramMemJNI;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.msys.mcf.MsysError;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.ExecutionLogger;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.mci.TraceInfo;
import com.facebook.msys.util.NotificationScope;
import com.facebook.tigon.tigonhuc.HucClient;
import com.google.common.util.concurrent.ListenableFuture;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes8.dex */
public final class JVY implements MailboxCallback {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public JVY(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A02 = obj2;
        this.A03 = obj;
        this.A01 = obj3;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r5v5, types: [com.facebook.msys.mca.MailboxFeature, X.5zr, java.lang.Object] */
    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        EnumC46197KcZ enumC46197KcZ;
        AccountSession accountSession;
        NotificationScope A00;
        Object obj2;
        int i;
        LK0 lk0;
        Exception exc;
        Object c44827Jt1;
        InterfaceC23621Ds interfaceC23621Ds;
        Object obj3;
        Throwable th;
        IGFOAMessagingSendToSentLogger A002;
        IGFOAMessagingSendToSentLogger A003;
        switch (this.A00) {
            case 0:
                AbstractC47797L9f abstractC47797L9f = (AbstractC47797L9f) this.A02;
                abstractC47797L9f.A02.markerPoint(1021646192, abstractC47797L9f.A01, "eb_manager_add_device_end");
                if (C14360o3.A0K(obj, AbstractC25227BEk.A0p())) {
                    lk0 = (LK0) this.A01;
                    c44827Jt1 = new C44826Jt0(EnumC46124KbO.A02);
                } else {
                    if (C14360o3.A0K(obj, AbstractC25227BEk.A0o())) {
                        lk0 = (LK0) this.A01;
                        exc = new Exception();
                    } else {
                        if (!C14360o3.A0K(obj, -2)) {
                            return;
                        }
                        lk0 = (LK0) this.A01;
                        exc = new Exception();
                    }
                    c44827Jt1 = new C44827Jt1(exc);
                }
                lk0.A05(c44827Jt1);
                return;
            case 1:
                LLH llh = (LLH) this.A03;
                int[] iArr = (int[]) this.A02;
                LLH.A04(llh, "FETCH_BACKUP_STATUS_READ_CLIENT_STATE_END", iArr);
                if (((Boolean) obj).booleanValue()) {
                    enumC46197KcZ = EnumC46197KcZ.A05;
                } else {
                    enumC46197KcZ = EnumC46197KcZ.A04;
                }
                LK0 lk02 = (LK0) this.A01;
                LLH.A03(llh, "backup_state", enumC46197KcZ.name(), iArr);
                llh.A00.A03 = true;
                lk02.A05(enumC46197KcZ);
                return;
            case 2:
                AccountSession accountSession2 = (AccountSession) obj;
                String A0u = AbstractC43592JPx.A0u(K3W.A00, HucClient.BODY_UPLOAD_TIMEOUT_SECONDS);
                NotificationScope A004 = C43725JVk.A00(AbstractC43592JPx.A0E(accountSession2), this, A0u, 4);
                AbstractC43592JPx.A1P(A004, this.A03, A0u);
                MailboxEncryptedBackupsJNI.dispatchVOOOOOOOO(16, accountSession2, "ENCRYPTED_BACKUP_ONBOARDED_KEY", this.A02, null, null, null, null, A004);
                return;
            case 3:
                accountSession = (AccountSession) obj;
                String A0u2 = AbstractC43592JPx.A0u(K3W.A00, 330);
                A00 = C43725JVk.A00(AbstractC43592JPx.A0E(accountSession), this, A0u2, 5);
                AbstractC43592JPx.A1P(A00, this.A02, A0u2);
                obj2 = this.A03;
                i = 22;
                MailboxEncryptedBackupsJNI.dispatchVOOO(i, accountSession, obj2, A00);
                return;
            case 4:
                accountSession = (AccountSession) obj;
                String A0u3 = AbstractC43592JPx.A0u(K3W.A00, 339);
                A00 = LVN.A01(AbstractC43592JPx.A0E(accountSession), this, A0u3, 6);
                AbstractC43592JPx.A1P(A00, this.A02, A0u3);
                obj2 = this.A03;
                i = 25;
                MailboxEncryptedBackupsJNI.dispatchVOOO(i, accountSession, obj2, A00);
                return;
            case 5:
                accountSession = (AccountSession) obj;
                String A0u4 = AbstractC43592JPx.A0u(K3W.A00, 324);
                A00 = C43725JVk.A00(AbstractC43592JPx.A0E(accountSession), this, A0u4, 10);
                AbstractC43592JPx.A1P(A00, this.A02, A0u4);
                obj2 = this.A03;
                i = 32;
                MailboxEncryptedBackupsJNI.dispatchVOOO(i, accountSession, obj2, A00);
                return;
            case 6:
                accountSession = (AccountSession) obj;
                String A0u5 = AbstractC43592JPx.A0u(K3W.A00, 335);
                A00 = LVN.A01(AbstractC43592JPx.A0E(accountSession), this, A0u5, 9);
                AbstractC43592JPx.A1P(A00, this.A02, A0u5);
                obj2 = this.A03;
                i = 33;
                MailboxEncryptedBackupsJNI.dispatchVOOO(i, accountSession, obj2, A00);
                return;
            case 7:
                accountSession = (AccountSession) obj;
                String A0u6 = AbstractC43592JPx.A0u(K3W.A00, 346);
                A00 = C43725JVk.A00(AbstractC43592JPx.A0E(accountSession), this, A0u6, 14);
                AbstractC43592JPx.A1P(A00, this.A02, A0u6);
                obj2 = this.A03;
                i = 45;
                MailboxEncryptedBackupsJNI.dispatchVOOO(i, accountSession, obj2, A00);
                return;
            case 8:
                accountSession = (AccountSession) obj;
                String A0u7 = AbstractC43592JPx.A0u(K3W.A00, 381);
                A00 = C43725JVk.A00(AbstractC43592JPx.A0E(accountSession), this, A0u7, 18);
                AbstractC43592JPx.A1P(A00, this.A03, A0u7);
                obj2 = this.A02;
                i = 54;
                MailboxEncryptedBackupsJNI.dispatchVOOO(i, accountSession, obj2, A00);
                return;
            case 9:
                AccountSession accountSession3 = (AccountSession) obj;
                String A0u8 = AbstractC43592JPx.A0u(K3X.A00, 41);
                NotificationScope A005 = C43725JVk.A00(AbstractC43592JPx.A0E(accountSession3), this, A0u8, 19);
                AbstractC43592JPx.A1P(A005, this.A02, A0u8);
                MailboxInstagramMemJNI.dispatchVOOO(9, accountSession3, this.A03, A005);
                return;
            case 10:
                MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, (MailboxFutureImpl) this.A02, AbstractC43593JPy.A0J(), 0, 0, "MCAMailboxInstagramOpenXmaReceiverFetch", "InstagramXmaBatchedReceiverFetchQuery", JRF.A00(this, 14));
                return;
            case 11:
                if (obj != null) {
                    C47576Kzm c47576Kzm = (C47576Kzm) this.A02;
                    LJd lJd = (LJd) this.A03;
                    String str = lJd.A0D;
                    C50372MLz c50372MLz = new C50372MLz(8, obj, lJd, c47576Kzm, this.A01);
                    UserSession userSession = c47576Kzm.A01;
                    C18C.A0F(AbstractC31171DnF.A1V(userSession, str));
                    C135806Ci c135806Ci = LG5.A05.A00(userSession).A02.A01;
                    C133215zn A006 = C6AJ.A00(userSession);
                    C6CN c6cn = c135806Ci.A00;
                    C1334860s c1334860s = c6cn.A01;
                    String str2 = (String) c1334860s.A05.get();
                    boolean z = false;
                    if (str2 != null) {
                        C14360o3.A0B("/", 1);
                        if (str2.endsWith("/")) {
                            str2 = AbstractC25227BEk.A0w(str2, 0, str2.length() - 1);
                        }
                    }
                    if (A006.A05 && C0JA.A00().A04()) {
                        z = true;
                    }
                    c6cn.A03.getFacebookUserID();
                    C125855ma c125855ma = new C125855ma(str2, str2, 2, 30L, A006.A02, false, z, A006.A07);
                    C125865mb c125865mb = new C125865mb(AbstractC12880la.A04(c1334860s.A01));
                    User A0Y = AbstractC166997dE.A0Y(userSession);
                    ?? mailboxFeature = new MailboxFeature(new C135656Br(c6cn.A02));
                    long A03 = AbstractC31178DnM.A03(A0Y.BTC());
                    ListenableFuture A007 = AbstractC133285zv.A00(mailboxFeature.A01(null, userSession.userId, A0Y.B8y(), A03));
                    C1M8 c1m8 = C1M8.A01;
                    C29924DHm c29924DHm = new C29924DHm(A03, A006, mailboxFeature, c47576Kzm, 2);
                    C14360o3.A0B(A007, 0);
                    C2OD.A03(new LWS(3, c125865mb, c125855ma, c47576Kzm, c50372MLz), AbstractRunnableC133325zz.A01(new AnonymousClass604(new C65021Tc7(A03, mailboxFeature, A006, 7)), AbstractRunnableC133325zz.A01(new C133305zx(C50367MLu.A01(c29924DHm, 22)), A007, c1m8), c1m8), c1m8);
                    return;
                }
                throw AbstractC166997dE.A0g();
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                LJd lJd2 = (LJd) this.A03;
                C47576Kzm c47576Kzm2 = lJd2.A0C;
                if (lJd2.A03 != null) {
                    c47576Kzm2.A00.onCompletion(AbstractC166997dE.A0b());
                    ExecutionLogger.activeFlowMarkerEnd(755177991);
                    AbstractC166987dD.A1Y(this.A01);
                    ((Runnable) this.A02).run();
                    return;
                }
                throw AbstractC166997dE.A0g();
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                LJd lJd3 = (LJd) this.A03;
                C47576Kzm c47576Kzm3 = lJd3.A0C;
                if (lJd3.A03 != null) {
                    c47576Kzm3.A00.onCompletion(AbstractC166997dE.A0b());
                    AbstractC166987dD.A1Y(this.A01);
                    ((Runnable) this.A02).run();
                    return;
                }
                throw AbstractC166997dE.A0g();
            case 14:
                MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, (MailboxFutureImpl) this.A02, new MailboxNullable(null), 0, 0, null, (PrivacyContext) this.A03, "MCAMailboxSafetyInterventions", "ActiveSafetyInterventions", JRF.A00(this, 41));
                return;
            case Process.SIGTERM /* 15 */:
                MailboxNullable mailboxNullable = (MailboxNullable) obj;
                C14360o3.A0B(mailboxNullable, 0);
                C45319K3w c45319K3w = (C45319K3w) mailboxNullable.value;
                C6CC c6cc = (C6CC) this.A03;
                synchronized (c6cc) {
                    C6CD c6cd = C6CC.A03;
                    c6cc.A00 = c45319K3w;
                    c6cc.A01 = true;
                }
                C6CC.A03(c6cc, (InterfaceC16820sZ) this.A01, (InterfaceC16600sD) this.A02);
                return;
            case 16:
                C1346766r c1346766r = (C1346766r) this.A01;
                List list = (List) this.A02;
                C1345666g c1345666g = (C1345666g) this.A03;
                MailboxNullable mailboxNullable2 = (MailboxNullable) obj;
                Object obj4 = mailboxNullable2.value;
                if (obj4 != null && AbstractC43592JPx.A02((AbstractC1351869s) obj4) != 0) {
                    HashSet hashSet = new HashSet(list);
                    ArrayList A0q = AbstractC25230BEn.A0q(list);
                    for (int i2 = 0; i2 < ((AbstractC1351869s) mailboxNullable2.value).mResultSet.getCount(); i2++) {
                        long j = ((AbstractC1351869s) mailboxNullable2.value).mResultSet.getLong(i2, 1);
                        Long nullableLong = ((AbstractC1351869s) mailboxNullable2.value).mResultSet.getNullableLong(i2, 2);
                        if (hashSet.contains(((AbstractC1351869s) mailboxNullable2.value).mResultSet.getString(i2, 0)) && nullableLong != null) {
                            A0q.add(Long.valueOf(j));
                        }
                    }
                    if (!A0q.isEmpty()) {
                        long A0N = AbstractC166987dD.A0N(A0q.get(0));
                        JVL jvl = new JVL(c1346766r, 1);
                        InterfaceExecutorC135866Co A0C = AbstractC43592JPx.A0C(c1345666g, 0);
                        MailboxFutureImpl A0D = AbstractC43592JPx.A0D(A0C);
                        int A008 = AbstractC1346866s.A00(A0D);
                        TraceInfo A0F = AbstractC43592JPx.A0F(jvl, A0D, "MailboxInstagramSecureMessage", "loadSHIMThreadInfoByFbId");
                        if (!A0C.ELJ(new LVJ(c1345666g, A0D, A008, 5, A0N))) {
                            A0D.cancel(false);
                            AbstractC1346866s.A02(A008);
                            AbstractC1346866s.A03(A0F, "MailboxInstagramSecureMessage", "loadSHIMThreadInfoByFbId");
                        }
                        PlatformLogger.platformEventLog(5);
                        return;
                    }
                }
                c1346766r.A02(false);
                c1346766r.A00();
                return;
            case 17:
                C47810L9s c47810L9s = ((C47977LIp) this.A03).A02;
                String str3 = ((C1OW) this.A02).A05;
                InterfaceC37261GbE interfaceC37261GbE = (InterfaceC37261GbE) this.A01;
                c47810L9s.A03.A00.remove(str3);
                interfaceC37261GbE.DUq(null, null);
                return;
            case 18:
                C47483KyC c47483KyC = (C47483KyC) obj;
                C14360o3.A0B(c47483KyC, 0);
                MsysError msysError = c47483KyC.A01;
                android.net.Uri uri = c47483KyC.A00;
                C47Z c47z = ((OXD) this.A02).A0C;
                Integer num = c47z.A2G;
                if (msysError == null && uri != null) {
                    if (num != null) {
                        IGFOAMessagingSendToSentLogger A009 = C163307Sp.A00(((C49544Lux) this.A03).A00, num.intValue());
                        if (A009 != null) {
                            A009.onLogMediaScrutinySuccess();
                        }
                    }
                    c47z.A1N.A0F = uri.getPath();
                    interfaceC23621Ds = (InterfaceC23621Ds) this.A01;
                    obj3 = NRL.A00;
                    interfaceC23621Ds.resumeWith(obj3);
                    return;
                }
                if (num != null) {
                    IGFOAMessagingSendToSentLogger A0010 = C163307Sp.A00(((C49544Lux) this.A03).A00, num.intValue());
                    if (A0010 != null) {
                        A0010.onLogMediaScrutinyFailed();
                    }
                }
                interfaceC23621Ds = (InterfaceC23621Ds) this.A01;
                obj3 = NRK.A00;
                interfaceC23621Ds.resumeWith(obj3);
                return;
            default:
                C47485KyE c47485KyE = (C47485KyE) obj;
                C14360o3.A0B(c47485KyE, 0);
                MsysError msysError2 = c47485KyE.A01;
                android.net.Uri uri2 = c47485KyE.A00;
                C47Z c47z2 = ((OXD) this.A03).A0C;
                Integer num2 = c47z2.A2G;
                if (msysError2 == null && uri2 != null) {
                    UserSession userSession2 = (UserSession) this.A02;
                    LL8.A03(userSession2, null, c47z2.A3p, null, 1164);
                    if (num2 != null && (A003 = C163307Sp.A00(userSession2, num2.intValue())) != null) {
                        A003.onLogPIIRemovalSuccess();
                    }
                    c47z2.A0g(uri2.getPath());
                    interfaceC23621Ds = (InterfaceC23621Ds) this.A01;
                    if (interfaceC23621Ds == null) {
                        return;
                    }
                    obj3 = NRL.A00;
                    interfaceC23621Ds.resumeWith(obj3);
                    return;
                }
                UserSession userSession3 = (UserSession) this.A02;
                LL8.A03(userSession3, null, c47z2.A3p, null, 1165);
                if (num2 != null && (A002 = C163307Sp.A00(userSession3, num2.intValue())) != null) {
                    A002.onLogPIIRemovalFailed();
                }
                interfaceC23621Ds = (InterfaceC23621Ds) this.A01;
                if (interfaceC23621Ds == null) {
                    return;
                }
                EnumC115415Kb enumC115415Kb = EnumC115415Kb.A0D;
                if (msysError2 != null) {
                    th = msysError2.getCause();
                } else {
                    th = null;
                }
                obj3 = new NRJ(C115445Ke.A01(enumC115415Kb, "PII Removal failed", null, th));
                interfaceC23621Ds.resumeWith(obj3);
                return;
        }
    }
}
