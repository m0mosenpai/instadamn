package X;

import java.io.IOException;
import java.io.Writer;

/* renamed from: X.3If, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71413If extends AbstractRunnableC14200nk {
    public final String A00;
    public final /* synthetic */ C1H1 A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71413If(C1H1 c1h1, String str) {
        super(427);
        this.A01 = c1h1;
        this.A00 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C1H1 c1h1 = this.A01;
            Writer writer = c1h1.A01;
            if (writer != null) {
                writer.write(this.A00);
                c1h1.A01.flush();
                int i = c1h1.A00 + 1;
                c1h1.A00 = i;
                if (i > c1h1.A02) {
                    c1h1.A04.ATO(new C31577Du5(c1h1));
                }
            }
        } catch (IOException unused) {
        }
    }
}
