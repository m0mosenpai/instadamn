package X;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.1HP, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1HP extends C19Q implements C1G4 {
    public static final Pattern A01 = Pattern.compile("rtt=(\\d+)");
    public final C1G4 A00;

    @Override // X.C19Q, X.C19O
    public final void onResponseStarted(C1QW c1qw, C1QY c1qy, C3JQ c3jq) {
        C14360o3.A0B(c3jq, 2);
        if (c3jq.A00("X-FB-Connection-Quality") != null) {
            Pattern pattern = A01;
            C23781El A00 = c3jq.A00("X-FB-Connection-Quality");
            C14360o3.A0A(A00);
            Matcher matcher = pattern.matcher(A00.A01);
            if (matcher.find()) {
                try {
                    String group = matcher.group(1);
                    if (group != null) {
                        double parseDouble = Double.parseDouble(group);
                        if (parseDouble > 1.0d) {
                            C1FQ.A00().A01.A00(parseDouble);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
    }

    @Override // X.C1G4
    public final InterfaceC27191Tt startRequest(C1QW c1qw, C1QY c1qy, C26511Qg c26511Qg) {
        C14360o3.A0B(c1qw, 0);
        C14360o3.A0B(c1qy, 1);
        C14360o3.A0B(c26511Qg, 2);
        c26511Qg.A01(this);
        InterfaceC27191Tt startRequest = this.A00.startRequest(c1qw, c1qy, c26511Qg);
        C14360o3.A07(startRequest);
        return startRequest;
    }

    public C1HP(C1G4 c1g4) {
        this.A00 = c1g4;
    }
}
