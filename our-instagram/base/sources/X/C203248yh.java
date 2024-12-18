package X;

import java.io.IOException;
import java.io.StringWriter;

/* renamed from: X.8yh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C203248yh {
    public C198998qz A00;
    public C8r2 A01;
    public C203278yk A02;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.8ys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.8yk, java.lang.Object] */
    public C203248yh(C199008r1 c199008r1) {
        C8Q1 c8q1;
        C14360o3.A0B(c199008r1, 1);
        ?? obj = new Object();
        obj.A04 = new C203298ym(c199008r1);
        C198968qw c198968qw = c199008r1.A01;
        C8Q0 c8q0 = c198968qw.A01;
        ?? obj2 = new Object();
        if (c8q0 != null && (c8q1 = c8q0.A00) != null) {
            obj2.A00 = c8q1.A00;
        }
        obj.A03 = obj2;
        obj.A05 = c198968qw.A05;
        obj.A00 = c198968qw.A00;
        obj.A02 = c198968qw.A03;
        obj.A06 = c198968qw.A06;
        obj.A01 = c198968qw.A02;
        this.A02 = obj;
        this.A01 = c199008r1.A03;
        this.A00 = c199008r1.A02;
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
            AbstractC203258yi.A00(A0A, this);
            A0A.close();
            return stringWriter.toString();
        } catch (IOException unused) {
            return "";
        }
    }

    public C203248yh() {
    }
}
