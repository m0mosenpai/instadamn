package X;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;

/* renamed from: X.1v7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC41001v7 {
    public int A00;
    public final AbstractC40721uf A01;
    public final C41651wF A02;
    public final Writer A03;
    public final /* synthetic */ AbstractC40081tZ A04;

    public AbstractC41001v7(AbstractC40721uf abstractC40721uf, AbstractC40081tZ abstractC40081tZ, final OutputStream outputStream) {
        this.A04 = abstractC40081tZ;
        this.A01 = abstractC40721uf;
        final ByteBuffer byteBuffer = abstractC40081tZ.A05;
        final Writer writer = new Writer(outputStream, byteBuffer) { // from class: X.1w8
            public ByteBuffer A00;
            public CharsetEncoder A01;
            public final OutputStream A02;

            @Override // java.io.Writer, java.io.Flushable
            public final void flush() {
                A02(true);
            }

            private void A00() {
                if (this.A01 != null) {
                } else {
                    throw new IOException("OutputStreamWriter is closed");
                }
            }

            private void A01(CharBuffer charBuffer) {
                CoderResult encode;
                if (this.A01 == null) {
                    return;
                }
                while (true) {
                    encode = this.A01.encode(charBuffer, this.A00, false);
                    if (!encode.isOverflow()) {
                        break;
                    } else {
                        A02(false);
                    }
                }
                if (!encode.isError()) {
                    return;
                }
                encode.throwException();
            }

            private void A02(boolean z) {
                synchronized (((Writer) this).lock) {
                    A00();
                    ByteBuffer byteBuffer2 = this.A00;
                    if (byteBuffer2 != null) {
                        int position = byteBuffer2.position();
                        if (position > 0) {
                            this.A00.flip();
                            this.A02.write(this.A00.array(), this.A00.arrayOffset(), position);
                            this.A00.clear();
                        }
                        if (z) {
                            this.A02.flush();
                        }
                    }
                }
            }

            @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                synchronized (((Writer) this).lock) {
                    if (this.A01 != null) {
                        CharBuffer allocate = CharBuffer.allocate(0);
                        while (true) {
                            CoderResult encode = this.A01.encode(allocate, this.A00, true);
                            if (encode.isError()) {
                                encode.throwException();
                                break;
                            } else if (!encode.isOverflow()) {
                                break;
                            } else {
                                A02(false);
                            }
                        }
                        loop1: while (true) {
                            CoderResult flush = this.A01.flush(this.A00);
                            while (!flush.isUnderflow()) {
                                if (flush.isOverflow()) {
                                    break;
                                } else {
                                    flush.throwException();
                                }
                            }
                            A02(false);
                        }
                        A02(false);
                        this.A02.close();
                        this.A01 = null;
                        this.A00 = null;
                    }
                }
            }

            @Override // java.io.Writer
            public final void write(int i) {
                synchronized (((Writer) this).lock) {
                    A00();
                    A01(CharBuffer.wrap(new char[]{(char) i}));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(outputStream);
                Charset defaultCharset = Charset.defaultCharset();
                this.A02 = outputStream;
                this.A00 = byteBuffer;
                CharsetEncoder newEncoder = defaultCharset.newEncoder();
                this.A01 = newEncoder;
                CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
                newEncoder.onMalformedInput(codingErrorAction);
                this.A01.onUnmappableCharacter(codingErrorAction);
            }

            @Override // java.io.Writer
            public final void write(char[] cArr, int i, int i2) {
                synchronized (((Writer) this).lock) {
                    A00();
                    AbstractC41931wj.A01(cArr.length, i, i2);
                    A01(CharBuffer.wrap(cArr, i, i2));
                }
            }

            @Override // java.io.Writer
            public final void write(String str, int i, int i2) {
                synchronized (((Writer) this).lock) {
                    if (i2 < 0) {
                        throw AbstractC41931wj.A00(str, i, i2);
                    }
                    if (str != null) {
                        if ((i | i2) >= 0 && i <= str.length() - i2) {
                            A00();
                            A01(CharBuffer.wrap(str, i, i2 + i));
                        } else {
                            throw AbstractC41931wj.A00(str, i, i2);
                        }
                    } else {
                        throw new NullPointerException("str == null");
                    }
                }
            }
        };
        final char[] cArr = abstractC40081tZ.A08;
        Writer writer2 = new Writer(writer, cArr) { // from class: X.1wD
            public Writer A00;
            public int A01;
            public char[] A02;

            private void A00() {
                Writer writer3 = this.A00;
                if (writer3 != null) {
                    int i = this.A01;
                    if (i > 0) {
                        writer3.write(this.A02, 0, i);
                    }
                    this.A01 = 0;
                    return;
                }
                throw new IOException("BufferedWriter is closed");
            }

            @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                Writer writer3 = this.A00;
                if (writer3 != null) {
                    try {
                        A00();
                        th = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                    this.A02 = null;
                    try {
                        writer3.close();
                    } catch (Throwable th2) {
                        if (th == null) {
                            th = th2;
                        }
                    }
                    this.A00 = null;
                    if (th != null) {
                        throw th;
                    }
                }
            }

            @Override // java.io.Writer, java.io.Flushable
            public final void flush() {
                Writer writer3 = this.A00;
                if (writer3 != null) {
                    A00();
                    writer3.flush();
                    return;
                }
                throw new IOException("BufferedWriter is closed");
            }

            @Override // java.io.Writer
            public final void write(int i) {
                Writer writer3 = this.A00;
                if (writer3 != null) {
                    char[] cArr2 = this.A02;
                    int i2 = this.A01;
                    int length = cArr2.length;
                    if (i2 >= length) {
                        writer3.write(cArr2, 0, length);
                        this.A01 = 0;
                        i2 = 0;
                    }
                    this.A01 = i2 + 1;
                    cArr2[i2] = (char) i;
                    return;
                }
                throw new IOException("BufferedWriter is closed");
            }

            {
                super(writer);
                this.A00 = writer;
                this.A02 = cArr;
            }

            @Override // java.io.Writer
            public final void write(char[] cArr2, int i, int i2) {
                Writer writer3 = this.A00;
                if (writer3 != null) {
                    if (cArr2 != null) {
                        AbstractC41931wj.A01(cArr2.length, i, i2);
                        char[] cArr3 = this.A02;
                        int i3 = this.A01;
                        if (i3 != 0 || i2 < cArr3.length) {
                            int length = cArr3.length - i3;
                            if (i2 < length) {
                                length = i2;
                            }
                            if (length > 0) {
                                System.arraycopy(cArr2, i, cArr3, i3, length);
                                i3 = this.A01 + length;
                                this.A01 = i3;
                            }
                            char[] cArr4 = this.A02;
                            int length2 = cArr4.length;
                            if (i3 != length2) {
                                return;
                            }
                            writer3.write(cArr4, 0, length2);
                            this.A01 = 0;
                            if (i2 <= length) {
                                return;
                            }
                            i += length;
                            i2 -= length;
                            char[] cArr5 = this.A02;
                            if (i2 < cArr5.length) {
                                System.arraycopy(cArr2, i, cArr5, 0, i2);
                                this.A01 += i2;
                                return;
                            }
                        }
                        writer3.write(cArr2, i, i2);
                        return;
                    }
                    throw new NullPointerException("buffer == null");
                }
                throw new IOException("BufferedWriter is closed");
            }

            /* JADX WARN: Code restructure failed: missing block: B:29:0x0050, code lost:
            
                if (r2 > 0) goto L17;
             */
            @Override // java.io.Writer
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void write(java.lang.String r8, int r9, int r10) {
                /*
                    r7 = this;
                    java.io.Writer r5 = r7.A00
                    if (r5 == 0) goto L63
                    if (r10 <= 0) goto L23
                    if (r9 < 0) goto L5e
                    int r0 = r8.length()
                    int r0 = r0 - r10
                    if (r9 > r0) goto L5e
                    char[] r6 = r7.A02
                    int r0 = r7.A01
                    r4 = 0
                    if (r0 != 0) goto L24
                    int r1 = r6.length
                    if (r10 < r1) goto L24
                    char[] r1 = new char[r10]
                    int r0 = r9 + r10
                    r8.getChars(r9, r0, r1, r4)
                    r5.write(r1, r4, r10)
                L23:
                    return
                L24:
                    int r3 = r6.length
                    int r2 = r3 - r0
                    if (r10 >= r2) goto L50
                    r2 = r10
                L2a:
                    int r1 = r9 + r2
                    r8.getChars(r9, r1, r6, r0)
                    int r0 = r7.A01
                    int r0 = r0 + r2
                    r7.A01 = r0
                L34:
                    if (r0 != r3) goto L23
                    char[] r1 = r7.A02
                    int r0 = r1.length
                    r5.write(r1, r4, r0)
                    r7.A01 = r4
                    if (r10 <= r2) goto L23
                    int r9 = r9 + r2
                    int r2 = r10 - r2
                    if (r2 < r3) goto L53
                    char[] r1 = new char[r10]
                    int r0 = r9 + r2
                    r8.getChars(r9, r0, r1, r4)
                    r5.write(r1, r4, r2)
                    return
                L50:
                    if (r2 <= 0) goto L34
                    goto L2a
                L53:
                    int r0 = r9 + r2
                    r8.getChars(r9, r0, r6, r4)
                    int r0 = r7.A01
                    int r0 = r0 + r2
                    r7.A01 = r0
                    return
                L5e:
                    java.lang.StringIndexOutOfBoundsException r0 = X.AbstractC41931wj.A00(r8, r9, r10)
                    throw r0
                L63:
                    java.lang.String r1 = "BufferedWriter is closed"
                    java.io.IOException r0 = new java.io.IOException
                    r0.<init>(r1)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C41631wD.write(java.lang.String, int, int):void");
            }
        };
        this.A03 = writer2;
        this.A02 = new C41651wF(writer2);
    }
}
