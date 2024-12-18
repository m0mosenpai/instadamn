package X;

import android.util.JsonReader;
import android.util.JsonToken;
import com.facebook.xanalytics.XAnalyticsAdapter;
import com.instagram.common.session.UserSession;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/* loaded from: classes10.dex */
public final class T2D implements XAnalyticsAdapter {
    public static final C62821SSt A01 = new Object();
    public final UserSession A00;

    @Override // com.facebook.xanalytics.XAnalyticsAdapter
    public final void cleanup() {
    }

    @Override // com.facebook.xanalytics.XAnalyticsAdapter
    public final void flush() {
    }

    @Override // com.facebook.xanalytics.XAnalyticsAdapter
    public final String getStructureSamplingConfig(String str) {
        return "";
    }

    @Override // com.facebook.xanalytics.XAnalyticsAdapter
    public final void logCounter(String str, double d) {
        C14360o3.A0B(str, 0);
    }

    @Override // com.facebook.xanalytics.XAnalyticsAdapter
    public final void logEventBypassSampling(String str, String str2) {
        AbstractC167007dF.A1K(str, str2);
        logEvent(str, str2, "", false, -1.0d);
    }

    @Override // com.facebook.xanalytics.XAnalyticsAdapter
    public final boolean shouldLog(String str) {
        return true;
    }

    public T2D(UserSession userSession) {
        this.A00 = userSession;
    }

    @Override // com.facebook.xanalytics.XAnalyticsAdapter
    public final void logEvent(String str, String str2, String str3, boolean z, double d) {
        boolean A1a = AbstractC167017dG.A1a(str, str2);
        C19280xC A012 = C19280xC.A01(str, T2D.class.getSimpleName());
        A012.A00 = System.currentTimeMillis();
        try {
            Charset forName = Charset.forName("UTF8");
            C14360o3.A07(forName);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(AbstractC58318PtA.A1a(str2, forName));
            try {
                JsonReader jsonReader = new JsonReader(new InputStreamReader(byteArrayInputStream));
                try {
                    if (jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            String nextName = jsonReader.nextName();
                            JsonToken peek = jsonReader.peek();
                            if (peek != null) {
                                int A06 = AbstractC58318PtA.A06(peek, AbstractC22801A3u.A00);
                                if (A06 != A1a) {
                                    if (A06 != 2) {
                                        if (A06 != 3) {
                                            if (A06 == 4) {
                                                C19260xA c19260xA = new C19260xA();
                                                C62821SSt.A00(jsonReader, c19260xA, A01);
                                                A012.A05(c19260xA, nextName);
                                            }
                                        } else {
                                            AbstractC58321PtD.A1M(A012, nextName, jsonReader.nextBoolean());
                                        }
                                    } else {
                                        A012.A0C(nextName, jsonReader.nextString());
                                    }
                                } else {
                                    A012.A0A(nextName, Double.valueOf(jsonReader.nextDouble()));
                                }
                            }
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.close();
                    byteArrayInputStream.close();
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
        }
        AbstractC31173DnH.A1S(A012, this.A00);
    }

    @Override // com.facebook.xanalytics.XAnalyticsAdapter
    public final void logCounter(String str, double d, String str2) {
        C14360o3.A0B(str, 0);
    }
}
