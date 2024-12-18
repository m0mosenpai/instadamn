package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonObject;

/* renamed from: X.X6c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC71824X6c extends AbstractC71825X6d {
    public final String A0E() {
        ArrayList arrayList = this.A01;
        if (arrayList.isEmpty()) {
            return "$";
        }
        return AbstractC001800i.A0P(".", "$.", "", arrayList, null);
    }

    public final String A0F(SerialDescriptor serialDescriptor, int i) {
        String str;
        if (this instanceof X6Y) {
            return String.valueOf(i);
        }
        if (this instanceof C71822X6a) {
            C71822X6a c71822X6a = (C71822X6a) this;
            if (c71822X6a instanceof X6Z) {
                return (String) ((X6Z) c71822X6a).A02.get(i / 2);
            }
            AbstractC73763Sg abstractC73763Sg = ((AbstractC71823X6b) c71822X6a).A01;
            C14360o3.A0K(serialDescriptor.BKw(), C3TE.A00);
            String B0v = serialDescriptor.B0v(i);
            if (((AbstractC71823X6b) c71822X6a).A02.A0E) {
                JsonObject jsonObject = c71822X6a.A02;
                if (!jsonObject.keySet().contains(B0v)) {
                    Map A02 = C3TL.A02(serialDescriptor, abstractC73763Sg);
                    Iterator<String> it = jsonObject.keySet().iterator();
                    while (true) {
                        str = null;
                        if (!it.hasNext()) {
                            break;
                        }
                        str = it.next();
                        Number number = (Number) A02.get(str);
                        if (number != null && number.intValue() == i) {
                            break;
                        }
                    }
                    String str2 = str;
                    if (str2 != null) {
                        return str2;
                    }
                }
            }
            return B0v;
        }
        return serialDescriptor.B0v(i);
    }
}
