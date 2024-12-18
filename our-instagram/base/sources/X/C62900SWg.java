package X;

import android.os.Build;
import android.os.Bundle;
import com.facebook.smartcapture.logging.AuthenticityUploadMedium;
import java.io.Serializable;
import java.util.Map;

/* renamed from: X.SWg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62900SWg {
    public final OTB A00;
    public final C6FG A01;
    public final C6FQ A02;
    public final InterfaceC103384lE A03;

    public C62900SWg(C6FG c6fg, C6FQ c6fq, InterfaceC103384lE interfaceC103384lE) {
        C14360o3.A0B(c6fg, 1);
        this.A01 = c6fg;
        this.A02 = c6fq;
        this.A03 = interfaceC103384lE;
        this.A00 = OTB.A01.A00();
    }

    public static final void A00(Bundle bundle, String str, String str2, String str3, Map map, Map map2) {
        Serializable serializable;
        String string = bundle.getString(str2);
        if (string != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = bundle.getSerializable(str3, AuthenticityUploadMedium.class);
            } else {
                serializable = bundle.getSerializable(str3);
                if (!(serializable instanceof AuthenticityUploadMedium)) {
                    return;
                }
            }
            AuthenticityUploadMedium authenticityUploadMedium = (AuthenticityUploadMedium) serializable;
            if (authenticityUploadMedium != null) {
                map.put(str, string);
                map2.put(str, authenticityUploadMedium.getValue());
            }
        }
    }
}
