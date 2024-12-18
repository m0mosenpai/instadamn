package X;

import android.util.JsonReader;
import android.util.JsonToken;
import com.facebook.xanalytics.XAnalyticsAdapter;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/* renamed from: X.0ad, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C07640ad implements XAnalyticsAdapter {
    public InterfaceC11360iu A00 = null;

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
    }

    @Override // com.facebook.xanalytics.XAnalyticsAdapter
    public final void logCounter(String str, double d, String str2) {
    }

    @Override // com.facebook.xanalytics.XAnalyticsAdapter
    public final boolean shouldLog(String str) {
        return true;
    }

    @Override // com.facebook.xanalytics.XAnalyticsAdapter
    public final void logEvent(String str, String str2, String str3, boolean z, double d) {
        InterfaceC11360iu interfaceC11360iu;
        ByteArrayInputStream byteArrayInputStream;
        JsonReader jsonReader;
        C19280xC A01 = C19280xC.A01(str, "IgQPLXAnalytincs");
        A01.A00 = System.currentTimeMillis();
        try {
            byteArrayInputStream = new ByteArrayInputStream(str2.getBytes(Charset.forName("UTF8")));
            try {
                jsonReader = new JsonReader(new InputStreamReader(byteArrayInputStream));
            } finally {
            }
        } catch (IOException unused) {
        }
        try {
            C19260xA A00 = A00(jsonReader);
            if (A00 != null) {
                A01.A04(A00);
            }
            jsonReader.close();
            byteArrayInputStream.close();
            synchronized (this) {
                C18C.A07(this.A00, "trying to log events in IgQPLXAnalytics while its analytics logger is null");
                interfaceC11360iu = this.A00;
            }
            interfaceC11360iu.EHW(A01);
        } finally {
        }
    }

    @Override // com.facebook.xanalytics.XAnalyticsAdapter
    public final void logEventBypassSampling(String str, String str2) {
        logEvent(str, str2, "", false, -1.0d);
    }

    public static C19260xA A00(JsonReader jsonReader) {
        Object valueOf;
        if (jsonReader.peek() != JsonToken.BEGIN_OBJECT) {
            return null;
        }
        C19260xA c19260xA = new C19260xA();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            int i = AbstractC07630ac.A00[jsonReader.peek().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                jsonReader.skipValue();
                            } else {
                                valueOf = A01(jsonReader);
                            }
                        } else {
                            valueOf = A00(jsonReader);
                        }
                        if (valueOf != null) {
                        }
                    } else {
                        valueOf = Boolean.valueOf(jsonReader.nextBoolean());
                    }
                } else {
                    valueOf = jsonReader.nextString();
                }
            } else {
                valueOf = Double.valueOf(jsonReader.nextDouble());
            }
            C19260xA.A00(c19260xA, valueOf, nextName);
        }
        jsonReader.endObject();
        return c19260xA;
    }

    public static C0x9 A01(JsonReader jsonReader) {
        InterfaceC11310in A00;
        if (jsonReader.peek() != JsonToken.BEGIN_ARRAY) {
            return null;
        }
        C0x9 c0x9 = new C0x9();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            int i = AbstractC07630ac.A00[jsonReader.peek().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                jsonReader.skipValue();
                            } else {
                                A00 = A01(jsonReader);
                            }
                        } else {
                            A00 = A00(jsonReader);
                        }
                        if (A00 != null) {
                            c0x9.A00.add(A00);
                        }
                    } else {
                        c0x9.A05(jsonReader.nextBoolean());
                    }
                } else {
                    c0x9.A04(jsonReader.nextString());
                }
            } else {
                c0x9.A00(jsonReader.nextDouble());
            }
        }
        jsonReader.endArray();
        return c0x9;
    }
}
