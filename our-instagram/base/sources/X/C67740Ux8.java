package X;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.Ux8, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67740Ux8 extends AbstractC126695o9 {
    public final StringBuilder A00 = new StringBuilder();
    public final ArrayList A01 = new ArrayList();
    public static final Pattern A03 = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");
    public static final Pattern A02 = Pattern.compile("\\{\\\\.*?\\}");

    public static long A00(Matcher matcher, int i) {
        long j;
        String group = matcher.group(i + 1);
        if (group != null) {
            j = Long.parseLong(group) * 60 * 60 * 1000;
        } else {
            j = 0;
        }
        long A0E = j + (AbstractC58322PtE.A0E(matcher, i + 2) * 60 * 1000) + (AbstractC58322PtE.A0E(matcher, i + 3) * 1000);
        String group2 = matcher.group(i + 4);
        if (group2 != null) {
            A0E += Long.parseLong(group2);
        }
        return A0E * 1000;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0188, code lost:
    
        if (r7 != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01aa, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:49:0x012c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:51:0x0130. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.4ac] */
    @Override // X.AbstractC126695o9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC126735oD A06(byte[] r29, int r30, boolean r31) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67740Ux8.A06(byte[], int, boolean):X.5oD");
    }
}
