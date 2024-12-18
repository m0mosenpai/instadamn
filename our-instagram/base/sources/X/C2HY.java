package X;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.2HY, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2HY extends TypeAdapter {
    public static final InterfaceC47612Gm A01 = new InterfaceC47612Gm() { // from class: X.2HZ
        @Override // X.InterfaceC47612Gm
        public final TypeAdapter create(Gson gson, TypeToken typeToken) {
            if (typeToken.rawType == Date.class) {
                return new C2HY();
            }
            return null;
        }
    };
    public final List A00;

    @Override // com.google.gson.TypeAdapter
    public final /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Object obj) {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            jsonWriter.A0A();
            return;
        }
        List list = this.A00;
        DateFormat dateFormat = (DateFormat) list.get(0);
        synchronized (list) {
            format = dateFormat.format(date);
        }
        jsonWriter.A0H(format);
    }

    public C2HY() {
        ArrayList arrayList = new ArrayList();
        this.A00 = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (AbstractC62336S7g.A00 >= 9) {
            arrayList.add(new SimpleDateFormat(AnonymousClass001.A0g("MMM d, yyyy", " ", "h:mm:ss a"), locale));
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final /* bridge */ /* synthetic */ Object read(JsonReader jsonReader) {
        if (jsonReader.A0G() == C05F.A1F) {
            jsonReader.A0Q();
            return null;
        }
        String A0K = jsonReader.A0K();
        List list = this.A00;
        synchronized (list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    return ((DateFormat) it.next()).parse(A0K);
                } catch (ParseException unused) {
                }
            }
            try {
                return AbstractC63259SgH.A01(A0K, new ParsePosition(0));
            } catch (ParseException e) {
                throw new RuntimeException(AnonymousClass001.A0u("Failed parsing '", A0K, "' as Date; at path ", jsonReader.A0I()), e);
            }
        }
    }
}
