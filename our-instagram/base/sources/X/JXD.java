package X;

import android.graphics.DashPathEffect;
import android.os.SystemClock;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;
import com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationApi;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public final class JXD extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final long A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JXD(long j, int i) {
        super(1);
        this.A00 = i;
        this.A01 = j;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        VideoEffectCommunicationApi videoEffectCommunicationApi;
        Long valueOf;
        int i;
        long j;
        switch (this.A00) {
            case 0:
                C137576Ld c137576Ld = (C137576Ld) obj;
                float A02 = C5YC.A02(c137576Ld.A00.Bxc()) / 2.0f;
                return c137576Ld.A00(new DHY(new C5YU(this.A01, 5), AbstractC28376Cfe.A00(c137576Ld, A02), A02, 3));
            case 1:
                ((InterfaceC113515Ao) obj).EOx(AbstractC47132KsR.A00, new C27997CVu(EnumC27356C5l.Cursor, C05F.A01, this.A01, true));
                return C0eB.A00;
            case 2:
            case 3:
                Future future = (Future) obj;
                C14360o3.A0B(future, 0);
                Object obj2 = future.get(this.A01 - SystemClock.elapsedRealtime(), TimeUnit.MILLISECONDS);
                C14360o3.A07(obj2);
                return obj2;
            case 4:
                C19670xu c19670xu = (C19670xu) obj;
                C14360o3.A0B(c19670xu, 0);
                long j2 = this.A01;
                InterfaceC105054oL interfaceC105054oL = c19670xu.A00;
                interfaceC105054oL.E7F("last_bug_report_id", j2);
                interfaceC105054oL.E7F("last_bug_report_unixtime", System.currentTimeMillis());
                return C0eB.A00;
            case 5:
                InterfaceC1128857w A0c = AbstractC25228BEl.A0c(obj);
                A0c.AQe(null, C119815bf.A00, C5YC.A01(A0c.Bxc()) / 2.0f, 1.0f, 3, this.A01, A0c.Amh());
                return C0eB.A00;
            case 6:
                long j3 = this.A01;
                return new C119235af(AbstractC113765Bo.A00(C1H4.A01(C119365at.A01(j3)), C1H4.A01(C119365at.A02(j3))));
            case 7:
                MailboxFeature mailboxFeature = (MailboxFeature) obj;
                C14360o3.A0B(mailboxFeature, 0);
                Long valueOf2 = Long.valueOf(this.A01);
                InterfaceExecutorC135866Co A0H = AbstractC43593JPy.A0H(mailboxFeature);
                MailboxFutureImpl A0D = AbstractC43592JPx.A0D(A0H);
                int A00 = AbstractC1346866s.A00(A0D);
                TraceInfo A01 = AbstractC1346866s.A01(A0D, "MailboxInstagramReverb", "expireMessages");
                if (!A0H.ELJ(new LUQ(A00, 0, mailboxFeature, A0D, valueOf2))) {
                    A0D.cancel(false);
                    AbstractC1346866s.A02(A00);
                    AbstractC1346866s.A03(A01, "MailboxInstagramReverb", "expireMessages");
                }
                PlatformLogger.platformEventLog(5);
                return A0D;
            case 8:
                return C42221xC.A07(new C48440Lbt(obj, this.A01, 7), AbstractC137146It.A00("fetch proactive warning banner"));
            case 9:
                C137576Ld c137576Ld2 = (C137576Ld) obj;
                C14360o3.A0B(c137576Ld2, 0);
                return c137576Ld2.A00(new C57748Pjb(C6L6.A00(AbstractC16960so.A1Q(AbstractC25225BEi.A0S(C1132359l.A07), AbstractC25225BEi.A0S(this.A01)), AbstractC119395aw.A00(25.0f, 0.0f), AbstractC119395aw.A00(Float.POSITIVE_INFINITY, 0.0f)), 24));
            case 10:
                InterfaceC1128857w interfaceC1128857w = (InterfaceC1128857w) obj;
                C14360o3.A0B(interfaceC1128857w, 0);
                C62V c62v = new C62V(new C28803CnZ(new DashPathEffect(new float[]{8.0f, 8.0f}, 0.0f)), interfaceC1128857w.EqT(2.0f), 4.0f, 0, 0);
                float EqT = interfaceC1128857w.EqT(8.0f);
                interfaceC1128857w.AR4(null, c62v, 1.0f, 3, this.A01, 0L, C62U.A00(interfaceC1128857w.Bxc(), 0L), AbstractC137636Lj.A00(EqT, EqT));
                return C0eB.A00;
            case 11:
                N04 A0k = AbstractC43593JPy.A0k(obj);
                long j4 = this.A01;
                videoEffectCommunicationApi = A0k.A00;
                if (videoEffectCommunicationApi != null) {
                    valueOf = Long.valueOf(j4);
                    i = 3;
                    videoEffectCommunicationApi.setGroupEffectStatus(valueOf, i);
                }
                return C0eB.A00;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                N04 A0k2 = AbstractC43593JPy.A0k(obj);
                long j5 = this.A01;
                videoEffectCommunicationApi = A0k2.A00;
                if (videoEffectCommunicationApi != null) {
                    valueOf = Long.valueOf(j5);
                    i = 4;
                    videoEffectCommunicationApi.setGroupEffectStatus(valueOf, i);
                }
                return C0eB.A00;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                N04 A0k3 = AbstractC43593JPy.A0k(obj);
                long j6 = this.A01;
                videoEffectCommunicationApi = A0k3.A00;
                if (videoEffectCommunicationApi != null) {
                    valueOf = Long.valueOf(j6);
                    i = 5;
                    videoEffectCommunicationApi.setGroupEffectStatus(valueOf, i);
                }
                return C0eB.A00;
            case 14:
                N04 A0k4 = AbstractC43593JPy.A0k(obj);
                long j7 = this.A01;
                VideoEffectCommunicationApi videoEffectCommunicationApi2 = A0k4.A00;
                if (videoEffectCommunicationApi2 != null) {
                    videoEffectCommunicationApi2.participantModuleInitialize(j7);
                }
                return C0eB.A00;
            case Process.SIGTERM /* 15 */:
                N04 A0k5 = AbstractC43593JPy.A0k(obj);
                long j8 = this.A01;
                Long l = A0k5.A04;
                if (l == null || l.longValue() != j8) {
                    A0k5.A04 = Long.valueOf(j8);
                    VideoEffectCommunicationApi videoEffectCommunicationApi3 = A0k5.A00;
                    if (videoEffectCommunicationApi3 != null) {
                        videoEffectCommunicationApi3.participantModuleInitialize(j8);
                    }
                    LS5 ls5 = new LS5(A0k5);
                    A0k5.A02 = ls5;
                    A0k5.A07.A01 = ls5;
                }
                return C0eB.A00;
            case 16:
                N04 A0k6 = AbstractC43593JPy.A0k(obj);
                long j9 = this.A01;
                Long l2 = A0k6.A03;
                if (l2 == null || l2.longValue() != j9) {
                    LS4 ls4 = new LS4(A0k6);
                    A0k6.A01 = ls4;
                    A0k6.A07.A00 = ls4;
                    A0k6.A03 = Long.valueOf(j9);
                    VideoEffectCommunicationApi videoEffectCommunicationApi4 = A0k6.A00;
                    if (videoEffectCommunicationApi4 != null) {
                        videoEffectCommunicationApi4.multipeerStartListening(j9);
                    }
                }
                return C0eB.A00;
            case 17:
                InterfaceC1128857w A0c2 = AbstractC25228BEl.A0c(obj);
                long A002 = C5YB.A00(A0c2.EqT(36.0f), A0c2.EqT(4.0f));
                long A003 = AbstractC119395aw.A00(C119365at.A01(A0c2.Amh()) - (C5YC.A02(A002) / 2.0f), A0c2.EqT(16.0f) - C5YC.A00(A002));
                float A012 = C5YC.A01(A002) / 2.0f;
                A0c2.AR4(null, C119815bf.A00, 1.0f, 3, this.A01, A003, A002, AbstractC137636Lj.A00(A012, A012));
                return C0eB.A00;
            case 18:
                int A0H2 = AbstractC166987dD.A0H(obj);
                int A004 = C78613fT.A00(this.A01) / 2;
                if (A004 > A0H2 * 0.95d) {
                    A0H2 = A004;
                }
                return Integer.valueOf(A0H2);
            case Process.SIGSTOP /* 19 */:
            case 20:
            case 21:
            case 22:
            default:
                QIe qIe = (QIe) obj;
                C14360o3.A0B(qIe, 0);
                j = qIe.A00;
                return Boolean.valueOf(AbstractC25230BEn.A1P((j > this.A01 ? 1 : (j == this.A01 ? 0 : -1))));
            case 23:
            case 25:
            case 27:
                QIv qIv = (QIv) obj;
                C14360o3.A0B(qIv, 0);
                j = qIv.A00;
                return Boolean.valueOf(AbstractC25230BEn.A1P((j > this.A01 ? 1 : (j == this.A01 ? 0 : -1))));
            case 24:
            case 26:
            case 28:
                C58913QIr c58913QIr = (C58913QIr) obj;
                C14360o3.A0B(c58913QIr, 0);
                return Boolean.valueOf(AbstractC25230BEn.A1P((c58913QIr.A01 > this.A01 ? 1 : (c58913QIr.A01 == this.A01 ? 0 : -1))));
        }
    }
}
