package X;

import java.io.IOException;
import java.io.StringWriter;

/* renamed from: X.6wb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC154266wb {
    public static final String A00(int i, int i2) {
        StringWriter stringWriter = new StringWriter();
        try {
            C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
            A0A.A0c();
            A0A.A0h(i);
            A0A.A0h(i2);
            A0A.A0Z();
            A0A.close();
        } catch (IOException e) {
            C0K8.A0H("AnalyticsEventExtraUtil", "Unable to serialize grid position.", e);
        }
        String obj = stringWriter.toString();
        C14360o3.A07(obj);
        return obj;
    }

    public static final String A01(int i, int i2) {
        StringWriter stringWriter = new StringWriter();
        try {
            C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
            A0A.A0c();
            A0A.A0u(String.valueOf(i));
            A0A.A0u(String.valueOf(i2));
            A0A.A0Z();
            A0A.close();
        } catch (IOException e) {
            C0K8.A0H("AnalyticsEventExtraUtil", "Unable to serialize grid position.", e);
        }
        String obj = stringWriter.toString();
        C14360o3.A07(obj);
        return obj;
    }
}
