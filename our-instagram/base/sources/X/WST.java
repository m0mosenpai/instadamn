package X;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes11.dex */
public final class WST implements InterfaceC71939XBo {
    public static final Pattern A04 = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");
    public static final Pattern A03 = Pattern.compile("\\{\\\\.*?\\}");
    public final StringBuilder A01 = new StringBuilder();
    public final ArrayList A02 = new ArrayList();
    public final WFa A00 = new WFa();

    @Override // X.InterfaceC71939XBo
    public final /* synthetic */ void reset() {
    }

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

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0176, code lost:
    
        if (r5 != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0198, code lost:
    
        if (r9 != false) goto L42;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:48:0x0117. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:50:0x011b. Please report as an issue. */
    @Override // X.InterfaceC71939XBo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E3P(X.InterfaceC71874X8h r34, X.C70003VzN r35, byte[] r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WST.E3P(X.X8h, X.VzN, byte[], int, int):void");
    }
}
