package X;

import java.nio.ByteBuffer;

/* renamed from: X.3Kv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC71973Kv {
    public static final String A00(String str) {
        AbstractC50462Tq abstractC50462Tq = AbstractC50442Tn.A00;
        int length = str.length();
        int i = length * 2;
        boolean z = false;
        if (i >= 0) {
            z = true;
        }
        C18C.A0C("expectedInputSize must be >= 0 but was %s", i, z);
        C50502Tv A02 = abstractC50462Tq.A02();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            ByteBuffer byteBuffer = ((AbstractC50512Tw) A02).A00;
            byteBuffer.putChar(charAt);
            try {
                A02.A02(byteBuffer.array(), 0, 2);
                byteBuffer.clear();
            } catch (Throwable th) {
                byteBuffer.clear();
                throw th;
            }
        }
        String obj = A02.A03().toString();
        C14360o3.A07(obj);
        return AnonymousClass001.A0R("switcher_snooze_end_time_", obj);
    }
}
