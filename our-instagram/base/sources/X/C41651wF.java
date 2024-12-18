package X;

import java.io.Writer;

/* renamed from: X.1wF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41651wF {
    public boolean A00;
    public boolean A01;
    public final Writer A02;

    public static void A00(C41651wF c41651wF) {
        Writer writer;
        int i;
        if (!c41651wF.A00) {
            c41651wF.A00 = true;
            writer = c41651wF.A02;
            i = 123;
        } else {
            writer = c41651wF.A02;
            i = 44;
        }
        writer.write(i);
    }

    public final void A01(AbstractC04050Jw abstractC04050Jw) {
        Writer writer;
        if (!this.A01) {
            A00(this);
            writer = this.A02;
            writer.write("\"data\":[");
            this.A01 = true;
        } else {
            writer = this.A02;
            writer.write(44);
        }
        AbstractC05810Sj.A01(writer, "Writer is null!");
        AbstractC05810Sj.A01(abstractC04050Jw.A02, "No encoder set, please call setEncoder() first!");
        abstractC04050Jw.A02.A04(abstractC04050Jw, writer);
    }

    public C41651wF(Writer writer) {
        this.A02 = writer;
    }
}
