package X;

import java.io.Writer;

/* renamed from: X.55D, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C55D extends Writer {
    public final C16O A00;

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
    }

    @Override // java.io.Writer
    public final void write(int i) {
        C16O c16o = this.A00;
        char c = (char) i;
        if (c16o.A02 >= 0) {
            C16O.A02(c16o, 16);
        }
        c16o.A04 = null;
        c16o.A09 = null;
        char[] cArr = c16o.A07;
        if (c16o.A00 >= cArr.length) {
            C16O.A01(c16o);
            cArr = c16o.A07;
        }
        int i2 = c16o.A00;
        c16o.A00 = i2 + 1;
        cArr[i2] = c;
    }

    public C55D(C16G c16g) {
        this.A00 = new C16O(c16g);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence) {
        String charSequence2 = charSequence.toString();
        this.A00.A08(charSequence2, 0, charSequence2.length());
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence, int i, int i2) {
        String charSequence2 = charSequence.subSequence(i, i2).toString();
        this.A00.A08(charSequence2, 0, charSequence2.length());
        return this;
    }

    @Override // java.io.Writer
    public final void write(String str, int i, int i2) {
        this.A00.A08(str, i, i2);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
        append(charSequence);
        return this;
    }

    @Override // java.io.Writer
    public final void write(char[] cArr) {
        this.A00.A09(cArr, 0, cArr.length);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i, int i2) {
        append(charSequence, i, i2);
        return this;
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        this.A00.A09(cArr, i, i2);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(char c) {
        write(c);
        return this;
    }

    @Override // java.io.Writer
    public final void write(String str) {
        this.A00.A08(str, 0, str.length());
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(char c) {
        write(c);
        return this;
    }
}
