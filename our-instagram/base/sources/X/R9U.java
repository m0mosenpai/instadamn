package X;

import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;
import java.io.Serializable;

@JacksonStdImpl
/* loaded from: classes10.dex */
public class R9U extends AbstractC62638SJv implements Serializable {
    public final int A00;
    public final FromStringDeserializer A01;
    public final Class A02;

    public R9U(FromStringDeserializer fromStringDeserializer, Class cls, int i) {
        this.A00 = i;
        this.A02 = cls;
        this.A01 = fromStringDeserializer;
    }
}
