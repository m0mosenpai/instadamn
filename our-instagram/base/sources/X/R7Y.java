package X;

import android.content.Context;
import com.facebook.R;
import com.facebook.smartcapture.ig.logging.IgSmartCaptureLoggerProvider;
import java.io.File;
import java.util.HashMap;

/* loaded from: classes10.dex */
public final class R7Y extends SN4 {
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.facebook.smartcapture.experimentation.IdCaptureExperimentConfigProvider] */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.facebook.smartcapture.ui.IdCaptureUi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.facebook.smartcapture.resources.ResourcesProvider, java.lang.Object] */
    public R7Y(Context context, AbstractC12990ll abstractC12990ll, String str, String str2, String str3, String str4) {
        AbstractC167017dG.A1P(context, abstractC12990ll);
        File A04 = AbstractC13530mf.A04(context);
        C14360o3.A07(A04);
        File A042 = AbstractC13530mf.A04(context);
        C14360o3.A07(A042);
        String canonicalPath = A04.getCanonicalPath();
        String canonicalPath2 = A042.getCanonicalPath();
        HashMap A1G = AbstractC166987dD.A1G();
        if (str != null) {
            A1G.put("challenge_id", str);
        }
        if (str2 != null) {
            A1G.put("challenge_use_case", str2);
        }
        if (str3 != null) {
            A1G.put("av_session_id", str3);
        }
        if (str4 != null) {
            A1G.put("flow_id", str4);
        }
        if (!A1G.isEmpty()) {
            this.A0H = A1G;
        }
        this.A00 = R.style.IgSmartCaptureTheme;
        this.A02 = context;
        this.A05 = new Object();
        String token = abstractC12990ll.getToken();
        C14360o3.A0B(token, 0);
        this.A0D = token;
        String token2 = abstractC12990ll.getToken();
        C14360o3.A0B(token2, 0);
        this.A0G = token2;
        this.A06 = new IgSmartCaptureLoggerProvider(abstractC12990ll);
        this.A0E = str2 == null ? "Instagram" : str2;
        EnumC61111RfR enumC61111RfR = EnumC61111RfR.A03;
        C14360o3.A0B(enumC61111RfR, 0);
        this.A03 = enumC61111RfR;
        this.A09 = new Object();
        C14360o3.A0A(canonicalPath);
        C14360o3.A0B(canonicalPath, 0);
        this.A0C = canonicalPath;
        C14360o3.A0A(canonicalPath2);
        C14360o3.A0B(canonicalPath2, 0);
        this.A0B = canonicalPath2;
        this.A07 = new Object();
    }
}
