package X;

import android.os.Bundle;
import com.facebook.react.bridge.ReadableMap;
import java.util.Iterator;
import java.util.regex.Pattern;

/* renamed from: X.SSn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62816SSn {
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0087, code lost:
    
        if (r11 != null) goto L112;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0035. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:66:0x00a4. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00a7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.01p, X.0yX, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C20030yX A00(android.content.Context r14, java.io.InputStream r15) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC62816SSn.A00(android.content.Context, java.io.InputStream):X.0yX");
    }

    public static final void A01(Bundle bundle, ReadableMap readableMap) {
        String str;
        boolean A1a = AbstractC167017dG.A1a(bundle, readableMap);
        Pattern compile = Pattern.compile("^<(\\S+)>$");
        Iterator A14 = AbstractC58319PtB.A14(bundle);
        while (A14.hasNext()) {
            String A1B = AbstractC166987dD.A1B(A14);
            Object obj = bundle.get(A1B);
            if ((obj instanceof String) && (str = (String) obj) != null && AbstractC31175DnJ.A1Z(str, compile)) {
                String string = readableMap.getString(AbstractC25227BEk.A0w(str, A1a ? 1 : 0, str.length() - (A1a ? 1 : 0)));
                if (string != null) {
                    bundle.putString(A1B, string);
                }
            }
        }
    }
}
