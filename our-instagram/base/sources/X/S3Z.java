package X;

import com.google.gson.JsonElement;
import com.google.gson.stream.JsonReader;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes10.dex */
public abstract class S3Z {
    public static JsonElement A00(JsonReader jsonReader) {
        try {
            try {
                jsonReader.A0G();
                try {
                    return (JsonElement) AbstractC47652Gq.A0F.read(jsonReader);
                } catch (EOFException e) {
                    throw new RuntimeException(e);
                }
            } catch (EOFException unused) {
                return RVZ.A00;
            }
        } catch (C40O e2) {
            throw new RuntimeException(e2);
        } catch (IOException e3) {
            throw new RuntimeException(e3);
        } catch (NumberFormatException e4) {
            throw new RuntimeException(e4);
        }
    }
}
