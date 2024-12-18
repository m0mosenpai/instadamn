package X;

import android.util.JsonWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Nsr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53918Nsr {
    public static final void A00(JsonWriter jsonWriter, List list) {
        try {
            jsonWriter.beginArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String A1B = AbstractC166987dD.A1B(it);
                jsonWriter.beginObject();
                MSX.A0z(jsonWriter, "thread_igid", A1B);
                jsonWriter.endObject();
            }
            jsonWriter.endArray();
        } catch (IOException unused) {
        }
    }
}
