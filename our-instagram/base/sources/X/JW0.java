package X;

import android.os.SystemClock;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes8.dex */
public final class JW0 {
    public final long A00 = SystemClock.elapsedRealtime() + 20000;
    public final ImageUrl A01;
    public final InterfaceC09390do A02;

    public JW0(ImageUrl imageUrl, String str) {
        this.A01 = imageUrl;
        this.A02 = AbstractC09440dt.A00(EnumC09460dv.A03, new ME3(str, this, 45));
    }
}
