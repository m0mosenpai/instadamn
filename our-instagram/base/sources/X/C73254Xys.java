package X;

import android.content.Context;
import org.webrtc.Logging;
import org.webrtc.PeerConnectionFactory;

/* renamed from: X.Xys, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73254Xys {
    public static boolean A00;

    /* JADX WARN: Type inference failed for: r0v6, types: [org.webrtc.NativeLibraryLoader, java.lang.Object] */
    public static final synchronized void A00(Context context, C006802i c006802i, OXJ oxj) {
        synchronized (C73254Xys.class) {
            C14360o3.A0B(oxj, 2);
            if (!A00) {
                oxj.A02(6);
                c006802i.markerStart(29239048);
                C09170dP.A0C("jniperflogger");
                c006802i.markerPoint(29239048, "webrtc_load_start");
                C09170dP.A0C("webrtcLatest");
                PeerConnectionFactory.InitializationOptions.Builder builder = new PeerConnectionFactory.InitializationOptions.Builder(context);
                builder.nativeLibraryName = "webrtcLatest";
                builder.nativeLibraryLoader = new Object();
                PeerConnectionFactory.initialize(builder.createInitializationOptions());
                c006802i.markerPoint(29239048, "webrtc_load_end");
                c006802i.markerPoint(29239048, "igrtcjni_load_start");
                C09170dP.A0C("igrtcjniLatest");
                c006802i.markerPoint(29239048, "igrtcjni_load_end");
                c006802i.markerEnd(29239048, (short) 2);
                oxj.A02(7);
                A00 = true;
                Logging.enableLogToDebugOutput(Logging.Severity.LS_INFO);
            }
        }
    }
}
