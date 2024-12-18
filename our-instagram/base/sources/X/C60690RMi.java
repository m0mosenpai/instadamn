package X;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

/* renamed from: X.RMi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60690RMi extends AbstractC60694RMm {
    public static boolean A05;
    public String A00;
    public boolean A01;
    public AdvertisingIdClient.Info A02;
    public final Object A03;
    public final SYI A04;

    private final boolean A02(String str) {
        try {
            String A01 = A01(str);
            AbstractC63371Sic.A09(this, "Storing hashed adid.", 2);
            FileOutputStream openFileOutput = ((AbstractC63371Sic) this).A00.A00.openFileOutput("gaClientIdData", 0);
            openFileOutput.write(A01.getBytes());
            openFileOutput.close();
            this.A00 = A01;
            return true;
        } catch (IOException e) {
            A0G("Error creating hash file", e);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02c4 A[Catch: all -> 0x031f, TryCatch #25 {, blocks: (B:96:0x0234, B:100:0x023b, B:102:0x0250, B:135:0x025f, B:136:0x0269, B:138:0x026e, B:144:0x02a2, B:104:0x02ac, B:105:0x02b0, B:108:0x031b, B:112:0x02c4, B:114:0x02cc, B:116:0x02d2, B:117:0x02db, B:126:0x0306, B:131:0x0305, B:132:0x030f, B:147:0x0278, B:150:0x0282, B:152:0x0286, B:153:0x0295, B:120:0x02dd, B:122:0x02f0, B:123:0x02f8, B:124:0x02fa, B:128:0x02fc), top: B:95:0x0234, outer: #12, inners: #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x007d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x006a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0055 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x003f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x021d A[Catch: all -> 0x0336, TryCatch #12 {, blocks: (B:4:0x0003, B:6:0x000d, B:8:0x0013, B:26:0x008b, B:87:0x01ac, B:88:0x0218, B:90:0x021d, B:91:0x021f, B:93:0x0226, B:94:0x0233, B:111:0x0322, B:156:0x0321, B:157:0x0330, B:197:0x01ff, B:198:0x0202, B:203:0x0083, B:208:0x0070, B:213:0x005b, B:218:0x0045, B:224:0x002f, B:228:0x0204, B:230:0x0208, B:225:0x0211, B:231:0x0332, B:96:0x0234, B:100:0x023b, B:102:0x0250, B:135:0x025f, B:136:0x0269, B:138:0x026e, B:144:0x02a2, B:104:0x02ac, B:105:0x02b0, B:108:0x031b, B:112:0x02c4, B:114:0x02cc, B:116:0x02d2, B:117:0x02db, B:126:0x0306, B:131:0x0305, B:132:0x030f, B:147:0x0278, B:150:0x0282, B:152:0x0286, B:153:0x0295), top: B:3:0x0003, inners: #18, #24, #25 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0226 A[Catch: all -> 0x0336, TryCatch #12 {, blocks: (B:4:0x0003, B:6:0x000d, B:8:0x0013, B:26:0x008b, B:87:0x01ac, B:88:0x0218, B:90:0x021d, B:91:0x021f, B:93:0x0226, B:94:0x0233, B:111:0x0322, B:156:0x0321, B:157:0x0330, B:197:0x01ff, B:198:0x0202, B:203:0x0083, B:208:0x0070, B:213:0x005b, B:218:0x0045, B:224:0x002f, B:228:0x0204, B:230:0x0208, B:225:0x0211, B:231:0x0332, B:96:0x0234, B:100:0x023b, B:102:0x0250, B:135:0x025f, B:136:0x0269, B:138:0x026e, B:144:0x02a2, B:104:0x02ac, B:105:0x02b0, B:108:0x031b, B:112:0x02c4, B:114:0x02cc, B:116:0x02d2, B:117:0x02db, B:126:0x0306, B:131:0x0305, B:132:0x030f, B:147:0x0278, B:150:0x0282, B:152:0x0286, B:153:0x0295), top: B:3:0x0003, inners: #18, #24, #25 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final synchronized com.google.android.gms.ads.identifier.AdvertisingIdClient.Info A00(X.C60690RMi r25) {
        /*
            Method dump skipped, instructions count: 825
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60690RMi.A00(X.RMi):com.google.android.gms.ads.identifier.AdvertisingIdClient$Info");
    }

    public static String A01(String str) {
        MessageDigest messageDigest;
        int i = 0;
        while (true) {
            if (i < 2) {
                try {
                    messageDigest = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException unused) {
                }
                if (messageDigest != null) {
                    break;
                }
                i++;
            } else {
                messageDigest = null;
                break;
            }
        }
        if (messageDigest == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigest.digest(str.getBytes())));
    }

    public C60690RMi(C63335Shm c63335Shm) {
        super(c63335Shm);
        this.A01 = false;
        this.A03 = AbstractC58318PtA.A0b();
        this.A04 = new SYI(c63335Shm.A04);
    }
}
