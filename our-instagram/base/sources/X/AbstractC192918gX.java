package X;

import android.util.JsonReader;
import com.instagram.common.api.base.CacheBehaviorLogger;
import java.io.IOException;
import java.io.StringReader;
import java.util.Random;

/* renamed from: X.8gX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC192918gX {
    public static final Random A00 = new Random();

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, X.8ge] */
    public static final C1338462s A00(C63C c63c, String str, String str2) {
        JsonReader jsonReader;
        C102824kJ c102824kJ;
        C14360o3.A0B(c63c, 1);
        if (str == null) {
            return null;
        }
        synchronized (C42681xw.class) {
        }
        int nextInt = A00.nextInt();
        c63c.ATF(3, nextInt);
        c63c.ATB(3, nextInt, CacheBehaviorLogger.SOURCE, str2);
        C1LN.A01("GraphQLBlokParse.parseBloksBundleTreeWithData");
        c63c.currentMonotonicTimestamp();
        try {
            try {
                jsonReader = new JsonReader(new StringReader(str));
            } catch (IOException e) {
                AbstractC25241Le.A03("BloksBundleParser", e);
                if (0 != 0) {
                    c63c.ATE(3, nextInt);
                }
            }
            try {
                C192928gY c192928gY = new C192928gY(jsonReader);
                c192928gY.Csy();
                C192948ga A002 = C192948ga.A00(c192928gY);
                C14360o3.A07(A002);
                C102794kG c102794kG = A002.A00;
                if (c102794kG != null && (c102824kJ = c102794kG.A00) != null) {
                    c63c.currentMonotonicTimestamp();
                    C1338462s A02 = C1338462s.A02(new Object(), c102824kJ);
                    jsonReader.close();
                    c63c.ATE(3, nextInt);
                    C1LN.A00();
                    return A02;
                }
                jsonReader.close();
                c63c.ATD(3, nextInt);
                C1LN.A00();
                return null;
            } finally {
            }
        } catch (Throwable th) {
            if (0 != 0) {
                c63c.ATE(3, nextInt);
            } else {
                c63c.ATD(3, nextInt);
            }
            C1LN.A00();
            throw th;
        }
    }
}
