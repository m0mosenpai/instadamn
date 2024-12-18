package X;

import android.content.Context;
import com.google.common.collect.EvictingQueue;
import com.instagram.realtimeclient.bugreport.RealtimeLogsProvider;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: X.25r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C451225r implements InterfaceC449925e, InterfaceC13000lm {
    public String A00;
    public String A01;
    public final EvictingQueue A02 = new EvictingQueue(100);

    @Override // X.InterfaceC449925e
    public final /* synthetic */ boolean getShouldUploadSynchronously_DANGEROUS_DO_NOT_USE_OR_YOU_WILL_GET_FIRED() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.3rt, java.lang.Object] */
    public final void A00(String str, String str2, String str3, String str4) {
        String str5;
        EvictingQueue evictingQueue = this.A02;
        String str6 = this.A00;
        if (str6 == null) {
            str5 = "containerModule";
        } else {
            String str7 = this.A01;
            if (str7 == null) {
                str5 = "sessionId";
            } else {
                String format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format(Long.valueOf(System.currentTimeMillis()));
                C14360o3.A0B(format, 1);
                ?? obj = new Object();
                obj.A06 = format;
                obj.A01 = str6;
                obj.A02 = str;
                obj.A05 = str7;
                obj.A00 = str2;
                obj.A04 = str3;
                obj.A03 = str4;
                evictingQueue.add(obj);
                return;
            }
        }
        C14360o3.A0F(str5);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC449925e
    public final String getContentInBackground(Context context) {
        EvictingQueue<C85643rt> evictingQueue = this.A02;
        C14360o3.A06(evictingQueue);
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(evictingQueue, 10));
        for (C85643rt c85643rt : evictingQueue) {
            StringWriter stringWriter = new StringWriter();
            C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
            A0A.A0d();
            String str = c85643rt.A06;
            if (str != null) {
                A0A.A0S("time", str);
            }
            String str2 = c85643rt.A01;
            if (str2 != null) {
                A0A.A0S("container_module", str2);
            }
            String str3 = c85643rt.A02;
            if (str3 != null) {
                A0A.A0S("event_name", str3);
            }
            String str4 = c85643rt.A05;
            if (str4 != null) {
                A0A.A0S(AbstractC65709Tsi.A00(), str4);
            }
            String str5 = c85643rt.A00;
            if (str5 != null) {
                A0A.A0S("ad_id", str5);
            }
            String str6 = c85643rt.A04;
            if (str6 != null) {
                A0A.A0S("media_id", str6);
            }
            String str7 = c85643rt.A03;
            if (str7 != null) {
                A0A.A0S("extra_data", str7);
            }
            A0A.A0a();
            A0A.close();
            arrayList.add(stringWriter.toString());
        }
        return AbstractC001800i.A0P("\n", "", "", AbstractC001800i.A0Y(arrayList), null);
    }

    @Override // X.InterfaceC449925e
    public final String getFilenamePrefix() {
        return "ad_delivery_logging";
    }

    @Override // X.InterfaceC449925e
    public final String getFilenameSuffix() {
        return RealtimeLogsProvider.LOG_SUFFIX;
    }

    @Override // X.InterfaceC449925e
    public final String getTag() {
        return "SponsoredContentDebugLogger";
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A02.clear();
    }
}
