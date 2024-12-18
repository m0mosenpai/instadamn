package X;

import android.content.Context;
import com.facebook.msys.mci.DefaultCrypto;
import com.facebook.msys.mci.MediaTranscoder;
import com.facebook.msys.mci.ProxyProvider;
import com.facebook.msys.mci.transcoder.DefaultMediaTranscoder;
import com.facebook.msys.util.Provider;
import java.util.Collections;

/* renamed from: X.4Mn, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4Mn {
    public static ProxyProvider A00(final Context context, final C4Mm c4Mm) {
        synchronized (C4Mo.class) {
            if (C4Mo.A00 == null) {
                C4Mo.A00 = new C4Mp(context);
            }
        }
        Provider provider = new Provider() { // from class: X.4Mq
            @Override // com.facebook.msys.util.Provider
            public final Object get() {
                return DefaultCrypto.A00;
            }
        };
        Provider provider2 = new Provider() { // from class: X.4Ms
            @Override // com.facebook.msys.util.Provider
            public final Object get() {
                Context context2 = context;
                C4Mm c4Mm2 = c4Mm;
                C14140ne c14140ne = new C14140ne(1401572073, 3, false, true);
                MediaTranscoder mediaTranscoder = DefaultMediaTranscoder.A06;
                if (mediaTranscoder == null) {
                    C68681VaH c68681VaH = new C68681VaH(Collections.emptyList());
                    DefaultMediaTranscoder defaultMediaTranscoder = new DefaultMediaTranscoder(context2, new WFN(c68681VaH), c68681VaH, c4Mm2, c14140ne);
                    DefaultMediaTranscoder.A06 = defaultMediaTranscoder;
                    return defaultMediaTranscoder;
                }
                return mediaTranscoder;
            }
        };
        return new ProxyProvider(new Provider() { // from class: X.4Mu
            @Override // com.facebook.msys.util.Provider
            public final Object get() {
                C41031vA c41031vA = C41031vA.A02;
                if (c41031vA == null) {
                    C41031vA c41031vA2 = new C41031vA();
                    C41031vA.A02 = c41031vA2;
                    return c41031vA2;
                }
                return c41031vA;
            }
        }, provider, new Provider() { // from class: X.4Mt
            @Override // com.facebook.msys.util.Provider
            public final Object get() {
                return C72913Xqt.A00;
            }
        }, provider2);
    }
}
