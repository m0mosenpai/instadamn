package kotlinx.serialization.encoding;

import X.C3RA;
import X.C4D8;
import X.C73803Sk;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes2.dex */
public interface Encoder {
    C4D8 ADR(SerialDescriptor serialDescriptor);

    void AS1(boolean z);

    void AS3(byte b);

    void AS4(char c);

    void AS5(double d);

    void AS7(float f);

    Encoder AS9(SerialDescriptor serialDescriptor);

    void ASB(int i);

    void ASD(long j);

    void ASF();

    void ASI(Object obj, C3RA c3ra);

    void ASJ(short s);

    void ASK(String str);

    C73803Sk BtX();
}
