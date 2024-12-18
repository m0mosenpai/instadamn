package X;

import com.google.protobuf.CodedOutputStream;
import java.nio.charset.Charset;

/* loaded from: classes10.dex */
public final class SCD {
    public final CodedOutputStream A00;

    public SCD(CodedOutputStream codedOutputStream) {
        Charset charset = SVB.A04;
        this.A00 = codedOutputStream;
        codedOutputStream.A00 = this;
    }
}
