package X;

import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.Serializable;

/* loaded from: classes10.dex */
public final class R9T extends AbstractC62638SJv implements Serializable {
    public final JsonDeserializer A00;
    public final Class A01;

    public R9T(JsonDeserializer jsonDeserializer, Class cls) {
        this.A01 = cls;
        this.A00 = jsonDeserializer;
    }
}
