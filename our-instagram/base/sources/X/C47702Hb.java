package X;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* renamed from: X.2Hb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47702Hb extends TypeAdapter {
    public static final InterfaceC47612Gm A01 = new InterfaceC47612Gm() { // from class: X.2Hc
        @Override // X.InterfaceC47612Gm
        public final TypeAdapter create(Gson gson, TypeToken typeToken) {
            if (typeToken.rawType != Date.class) {
                return null;
            }
            return new C47702Hb();
        }
    };
    public final DateFormat A00 = new SimpleDateFormat("MMM d, yyyy");

    @Override // com.google.gson.TypeAdapter
    public final /* bridge */ /* synthetic */ Object read(JsonReader jsonReader) {
        java.util.Date parse;
        if (jsonReader.A0G() == C05F.A1F) {
            jsonReader.A0Q();
            return null;
        }
        String A0K = jsonReader.A0K();
        try {
            synchronized (this) {
                parse = this.A00.parse(A0K);
            }
            return new Date(parse.getTime());
        } catch (ParseException e) {
            throw new RuntimeException(AnonymousClass001.A0u("Failed parsing '", A0K, "' as SQL Date; at path ", jsonReader.A0I()), e);
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Object obj) {
        String format;
        java.util.Date date = (java.util.Date) obj;
        if (date == null) {
            jsonWriter.A0A();
            return;
        }
        synchronized (this) {
            format = this.A00.format(date);
        }
        jsonWriter.A0H(format);
    }
}
