package com.facebook.common.irpgo;

import X.AbstractC06960Yn;
import X.AbstractC166987dD;
import X.C09170dP;
import X.C14360o3;
import X.C15W;
import X.MT6;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes4.dex */
public final class IRPGO {
    public static final IRPGO INSTANCE = new Object();

    public static final int computeModuleId(String str) {
        C14360o3.A0B(str, 0);
        String A02 = MT6.A02(AbstractC166987dD.A11(str));
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            C14360o3.A07(messageDigest);
            byte[] bytes = A02.getBytes(C15W.A05);
            C14360o3.A07(bytes);
            messageDigest.update(bytes);
            byte[] digest = messageDigest.digest();
            C14360o3.A07(digest);
            byte[] A0X = AbstractC06960Yn.A0X(digest, 0, 4);
            int length = A0X.length;
            int i = (length / 2) - 1;
            if (i >= 0) {
                int i2 = length - 1;
                int i3 = 0;
                while (true) {
                    byte b = A0X[i3];
                    A0X[i3] = A0X[i2];
                    A0X[i2] = b;
                    i2--;
                    if (i3 == i) {
                        break;
                    }
                    i3++;
                }
            }
            return ByteBuffer.wrap(A0X).getInt();
        } catch (NoSuchAlgorithmException unused) {
            return 0;
        }
    }

    private final native int[] dumpIRPGOProfiles(String str);

    public final native byte[] dumpProfileRawDataToFiles(String str, boolean z);

    public final native long[] getExecutedFunctionIds();

    public final native byte[] getProfileRawData(boolean z);

    public final native void resetIRPGOProfileCounters();

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.common.irpgo.IRPGO, java.lang.Object] */
    static {
        C09170dP.A0C("irpgoclient");
    }
}
