package X;

import android.webkit.WebResourceResponse;
import com.google.common.collect.ImmutableMap;
import java.io.ByteArrayInputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

/* renamed from: X.Rsw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61741Rsw {
    public static WebResourceResponse A00(String str, String str2, int i) {
        if (str2 == null) {
            str2 = "";
        }
        Charset charset = StandardCharsets.UTF_8;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str2.getBytes(charset));
        WebResourceResponse webResourceResponse = new WebResourceResponse(AbstractC43591JPw.A00(478), charset.name().toLowerCase(Locale.US), byteArrayInputStream);
        ImmutableMap.Builder A0Z = AbstractC58319PtB.A0Z();
        A0Z.put("Access-Control-Allow-Origin", "*");
        A0Z.put("Access-Control-Allow-Headers", "*");
        A0Z.put("Access-Control-Allow-Methods", "GET, OPTIONS");
        webResourceResponse.setResponseHeaders(A0Z.buildOrThrow());
        webResourceResponse.setStatusCodeAndReasonPhrase(i, str);
        return webResourceResponse;
    }
}
