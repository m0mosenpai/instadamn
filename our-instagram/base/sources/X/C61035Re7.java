package X;

import java.io.IOException;

/* renamed from: X.Re7, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C61035Re7 extends IOException {
    public InterfaceC65665Tqv A00;

    public final void A06(InterfaceC65665Tqv interfaceC65665Tqv) {
        this.A00 = interfaceC65665Tqv;
    }

    public static C60721ROb A00() {
        return new C60721ROb();
    }

    public static C61035Re7 A01() {
        return new C61035Re7("Protocol message contained an invalid tag (zero).");
    }

    public static C61035Re7 A02() {
        return new C61035Re7("Protocol message had invalid UTF-8.");
    }

    public static C61035Re7 A03() {
        return new C61035Re7("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static C61035Re7 A04() {
        return new C61035Re7("Failed to parse the message.");
    }

    public static C61035Re7 A05() {
        return new C61035Re7("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public C61035Re7(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.A00 = null;
    }

    public C61035Re7(String str) {
        super(str);
        this.A00 = null;
    }
}
