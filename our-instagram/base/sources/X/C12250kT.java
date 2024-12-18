package X;

import android.util.JsonReader;
import com.facebook.xanalytics.XAnalyticsAdapter;
import com.google.common.collect.ImmutableMap;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/* renamed from: X.0kT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C12250kT implements XAnalyticsAdapter {
    public static final C12240kS A03 = new Object();
    public final ImmutableMap A00;
    public final AbstractC12990ll A01;
    public final String A02;

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
    public void logEvent(String str, String str2, String str3, boolean z, double d) {
        ByteArrayInputStream byteArrayInputStream;
        JsonReader jsonReader;
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        C19280xC A01 = C19280xC.A01(str, this.A02);
        try {
            Charset forName = Charset.forName("UTF8");
            C14360o3.A07(forName);
            byte[] bytes = str2.getBytes(forName);
            C14360o3.A07(bytes);
            byteArrayInputStream = new ByteArrayInputStream(bytes);
            try {
                jsonReader = new JsonReader(new InputStreamReader(byteArrayInputStream));
            } finally {
            }
        } catch (IOException unused) {
        }
        try {
            C19260xA A00 = C12240kS.A00(jsonReader, A03);
            if (A00 != null) {
                A01.A04(A00);
            }
            jsonReader.close();
            byteArrayInputStream.close();
            ImmutableMap immutableMap = this.A00;
            if (immutableMap != null) {
                A01.A0F(immutableMap);
            }
            AbstractC11060iN.A00(this.A01).EHW(A01);
        } finally {
        }
    }

    @Override // com.facebook.xanalytics.XAnalyticsAdapter
    public final void logEventBypassSampling(String str, String str2) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        logEvent(str, str2, "", false, -1.0d);
    }

    @Override // com.facebook.xanalytics.XAnalyticsAdapter
    public final boolean shouldLog(String str) {
        return true;
    }

    public C12250kT(ImmutableMap immutableMap, AbstractC12990ll abstractC12990ll, String str) {
        this.A01 = abstractC12990ll;
        this.A02 = str;
        this.A00 = immutableMap;
    }
}
