package X;

import android.text.TextUtils;
import android.util.JsonWriter;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.io.IOException;
import java.io.StringWriter;

/* loaded from: classes10.dex */
public final class RkH extends Exception {
    public static final java.util.Set A01 = AbstractC58319PtB.A13(new String[]{TraceFieldType.ErrorCode, TraceFieldType.ErrorDomain, DevServerEntity.COLUMN_DESCRIPTION});
    public final Integer A00;

    public final String A00() {
        String message;
        try {
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            jsonWriter.beginObject();
            jsonWriter.name(TraceFieldType.ErrorDomain).value(AbstractC224519vc.A00(this.A00));
            if (!TextUtils.isEmpty(null)) {
                jsonWriter.name(TraceFieldType.ErrorCode).value((String) null);
            }
            if (!TextUtils.isEmpty(getMessage())) {
                JsonWriter name = jsonWriter.name(DevServerEntity.COLUMN_DESCRIPTION);
                if (getMessage().length() > 200) {
                    message = AbstractC58318PtA.A0j(getMessage(), 200);
                } else {
                    message = getMessage();
                }
                name.value(message);
            }
            jsonWriter.endObject();
            return stringWriter.toString();
        } catch (IOException unused) {
            return "";
        }
    }

    public RkH(Integer num, String str, Throwable th) {
        super(str, th);
        this.A00 = num;
    }
}
