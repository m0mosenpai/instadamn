package X;

import java.io.File;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: X.WzB, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71702WzB implements C3R9 {
    public static final C71702WzB A00 = new Object();
    public static final SerialDescriptor A01 = AbstractC70142W6u.A02("File", C3RE.A00);

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        String str;
        File file = (File) obj;
        C14360o3.A0B(encoder, 0);
        if (file == null || (str = file.getPath()) == null) {
            str = "";
        }
        encoder.ASK(str);
    }

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        String A0i = AbstractC65702TsY.A0i(decoder);
        if (A0i.length() == 0) {
            return null;
        }
        return new File(A0i);
    }
}
