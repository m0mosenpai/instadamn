package X;

import android.content.Context;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.google.common.collect.EvictingQueue;
import com.instagram.common.session.UserSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: X.9AW, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9AW implements InterfaceC449925e {
    public final EvictingQueue A00;
    public final UserSession A01;

    public C9AW(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = new EvictingQueue(Math.max((int) C18U.A01(C06090Tz.A05, userSession, 36604180903957553L), 100));
    }

    public final void A02(final String str) {
        C14360o3.A0B(str, 0);
        if (C18U.A06(C06090Tz.A05, this.A01, 36322705927121327L)) {
            EvictingQueue evictingQueue = this.A00;
            C14360o3.A06(evictingQueue);
            synchronized (evictingQueue) {
                evictingQueue.add(new ABN(str) { // from class: X.9ne
                    public final String A00;

                    {
                        super(C05F.A1F, null);
                        this.A00 = str;
                    }

                    @Override // X.ABN
                    public final String A00() {
                        String A0R = AnonymousClass001.A0R("message=", this.A00);
                        C14360o3.A07(A0R);
                        return A0R;
                    }
                });
            }
        }
    }

    public final void A00(KOD kod) {
        if (C18U.A06(C06090Tz.A05, this.A01, 36322705926400421L)) {
            EvictingQueue evictingQueue = this.A00;
            C14360o3.A06(evictingQueue);
            synchronized (evictingQueue) {
                evictingQueue.add(kod);
            }
        }
    }

    public final void A01(Integer num, Integer num2, String str, String str2, long j, long j2, long j3) {
        if (C18U.A06(C06090Tz.A05, this.A01, 36322705926334884L)) {
            EvictingQueue evictingQueue = this.A00;
            C14360o3.A06(evictingQueue);
            synchronized (evictingQueue) {
                evictingQueue.add(new KOA(num, num2, str, str2, j, j2, j3));
            }
        }
    }

    @Override // X.InterfaceC449925e
    public final String getContentInBackground(Context context) {
        String str;
        SM0 sm0;
        StringBuilder sb = new StringBuilder();
        EvictingQueue<ABN> evictingQueue = this.A00;
        C14360o3.A06(evictingQueue);
        synchronized (evictingQueue) {
            SM0 sm02 = new SM0();
            SM0 sm03 = new SM0();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(AbstractC43591JPw.A00(501), Locale.US);
            StringBuilder sb2 = new StringBuilder();
            for (ABN abn : evictingQueue) {
                String str2 = abn.A02;
                if (str2 != null) {
                    int intValue = abn.A01.intValue();
                    if (intValue != 0 && intValue != 1 && intValue != 3 && intValue != 4 && intValue != 2) {
                        if (intValue == 5 || intValue == 6) {
                            sm0 = sm03;
                        }
                    } else {
                        sm0 = sm02;
                    }
                    long j = abn.A00;
                    if (j < sm0.A01) {
                        sm0.A01 = j;
                    }
                    if (j > sm0.A00) {
                        sm0.A00 = j;
                    }
                    sm0.A02.add(str2);
                }
                String format = simpleDateFormat.format(new Date(abn.A00));
                switch (abn.A01.intValue()) {
                    case 0:
                        str = "SEND_START";
                        break;
                    case 1:
                        str = "SEND_SUCCESS";
                        break;
                    case 2:
                        str = "SEND_FAIL";
                        break;
                    case 3:
                        str = "SEND_DISPATCHED_TO_MEM";
                        break;
                    case 4:
                        str = "SEND_UPDATE_FROM_MEM";
                        break;
                    case 5:
                        str = "RECEIVE_PAYLOAD";
                        break;
                    case 6:
                        str = "RECEIVE_PLACEHOLDER";
                        break;
                    case 7:
                        str = "MEM";
                        break;
                    default:
                        str = "BOOTSTRAP";
                        break;
                }
                String A13 = AnonymousClass001.A13(format, " [", str, "]: ", abn.A00(), "\n");
                C14360o3.A07(A13);
                sb2.append(A13);
            }
            String A00 = sm02.A00();
            if (A00 != null) {
                sb.append("[1TID Send events]");
                sb.append("\n");
                sb.append(A00);
                sb.append("\n");
                sb.append("\n");
            }
            String A002 = sm03.A00();
            if (A002 != null) {
                sb.append("[1TID Receive events]");
                sb.append("\n");
                sb.append(A002);
                sb.append("\n");
                sb.append("\n");
            }
            sb.append("[Event logs]");
            sb.append("\n");
            sb.append((CharSequence) sb2);
        }
        String obj = sb.toString();
        C14360o3.A07(obj);
        return obj;
    }

    @Override // X.InterfaceC449925e
    public final String getFilenamePrefix() {
        return "direct_instamadillo_send_receive_events";
    }

    @Override // X.InterfaceC449925e
    public final String getFilenameSuffix() {
        return OptSvcAnalyticsStore.FILE_SUFFIX;
    }

    @Override // X.InterfaceC449925e
    public final /* synthetic */ boolean getShouldUploadSynchronously_DANGEROUS_DO_NOT_USE_OR_YOU_WILL_GET_FIRED() {
        return false;
    }

    @Override // X.InterfaceC449925e
    public final String getTag() {
        return "DirectInstamadilloLogCollector";
    }
}
