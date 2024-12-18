package X;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* renamed from: X.1Qy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C26691Qy {
    public final String A00;
    public final String A01;
    public final Pattern A02;

    public C26691Qy(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
        try {
            this.A02 = Pattern.compile(str);
        } catch (PatternSyntaxException e) {
            throw new Exception(AnonymousClass001.A0R("Invalid regex pattern: ", str), e);
        }
    }

    public final String toString() {
        return AnonymousClass001.A0u("matcher: ", this.A00, "\nreplacer: ", this.A01);
    }
}
