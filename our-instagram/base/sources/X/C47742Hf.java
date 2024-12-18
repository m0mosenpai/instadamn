package X;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.sql.Timestamp;
import java.util.Date;

/* renamed from: X.2Hf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47742Hf extends TypeAdapter {
    public static final InterfaceC47612Gm A01 = new InterfaceC47612Gm() { // from class: X.2Hg
        @Override // X.InterfaceC47612Gm
        public final TypeAdapter create(Gson gson, TypeToken typeToken) {
            if (typeToken.rawType != Timestamp.class) {
                return null;
            }
            return new C47742Hf(gson.A03(new TypeToken(Date.class)));
        }
    };
    public final TypeAdapter A00;

    @Override // com.google.gson.TypeAdapter
    public final /* bridge */ /* synthetic */ Object read(JsonReader jsonReader) {
        Date date = (Date) this.A00.read(jsonReader);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // com.google.gson.TypeAdapter
    public final /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Object obj) {
        this.A00.write(jsonWriter, obj);
    }

    public C47742Hf(TypeAdapter typeAdapter) {
        this.A00 = typeAdapter;
    }
}
