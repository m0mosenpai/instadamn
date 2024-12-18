package X;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.util.regex.Matcher;

/* renamed from: X.3y4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC89023y4 implements InterfaceC89033y5 {
    public static final ThreadLocal A03 = new ThreadLocal() { // from class: X.3y7
        @Override // java.lang.ThreadLocal
        public final /* bridge */ /* synthetic */ Object initialValue() {
            return new byte[C3OO.FLAG_MOVED];
        }
    };
    public static final ThreadLocal A04 = new ThreadLocal() { // from class: X.3y8
        @Override // java.lang.ThreadLocal
        public final /* bridge */ /* synthetic */ Object initialValue() {
            return new char[1024];
        }
    };
    public final C88753xb A00;
    public final Object A01;
    public volatile AbstractC40721uf A02;

    public int A00() {
        return Math.round((float) ((C89013y3) this).A01.length());
    }

    public AbstractC40721uf A01() {
        C89013y3 c89013y3 = (C89013y3) this;
        return c89013y3.A00.A02(c89013y3.A01);
    }

    public void A02() {
        File file = ((C89013y3) this).A01;
        if (!file.delete()) {
            C0K8.A0P("FileBatchPayloadIterator", "Failed to remove %s", file);
        }
    }

    public void A05(Writer writer) {
        C89013y3 c89013y3 = (C89013y3) this;
        final FileInputStream fileInputStream = new FileInputStream(c89013y3.A01);
        final ByteBuffer wrap = ByteBuffer.wrap((byte[]) A03.get());
        Reader reader = new Reader(fileInputStream, wrap) { // from class: X.3yD
            public InputStream A00;
            public CharsetDecoder A01;
            public boolean A02;
            public final ByteBuffer A03;

            @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                synchronized (((Reader) this).lock) {
                    CharsetDecoder charsetDecoder = this.A01;
                    if (charsetDecoder != null) {
                        charsetDecoder.reset();
                    }
                    this.A01 = null;
                    InputStream inputStream = this.A00;
                    if (inputStream != null) {
                        inputStream.close();
                        this.A00 = null;
                    }
                }
            }

            @Override // java.io.Reader
            public final int read(char[] cArr, int i, int i2) {
                InputStream inputStream;
                int i3;
                synchronized (((Reader) this).lock) {
                    synchronized (((Reader) this).lock) {
                        inputStream = this.A00;
                        if (inputStream == null) {
                            throw new IOException("InputStreamReader is closed");
                        }
                    }
                    AbstractC41931wj.A01(cArr.length, i, i2);
                    if (i2 == 0) {
                        return 0;
                    }
                    CharBuffer wrap2 = CharBuffer.wrap(cArr, i, i2);
                    CoderResult coderResult = CoderResult.UNDERFLOW;
                    ByteBuffer byteBuffer = this.A03;
                    boolean z = false;
                    if (!byteBuffer.hasRemaining()) {
                        z = true;
                    }
                    while (true) {
                        i3 = -1;
                        if (!wrap2.hasRemaining()) {
                            break;
                        }
                        if (z) {
                            try {
                                if (inputStream.available() == 0 && wrap2.position() > i) {
                                    break;
                                }
                            } catch (IOException unused) {
                            }
                            int capacity = byteBuffer.capacity() - byteBuffer.limit();
                            int read = inputStream.read(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.limit(), capacity);
                            if (read == -1) {
                                this.A02 = true;
                                break;
                            }
                            if (read == 0) {
                                break;
                            }
                            byteBuffer.limit(byteBuffer.limit() + read);
                        }
                        coderResult = this.A01.decode(byteBuffer, wrap2, false);
                        if (!coderResult.isUnderflow()) {
                            break;
                        }
                        if (byteBuffer.limit() == byteBuffer.capacity()) {
                            byteBuffer.compact();
                            byteBuffer.limit(byteBuffer.position());
                            byteBuffer.position(0);
                            z = true;
                        } else {
                            z = true;
                        }
                    }
                    CoderResult coderResult2 = CoderResult.UNDERFLOW;
                    if (coderResult == coderResult2 && this.A02) {
                        coderResult = this.A01.decode(byteBuffer, wrap2, true);
                        if (coderResult == coderResult2) {
                            coderResult = this.A01.flush(wrap2);
                        }
                        this.A01.reset();
                    }
                    if (coderResult.isMalformed() || coderResult.isUnmappable()) {
                        coderResult.throwException();
                    }
                    if (wrap2.position() - i != 0) {
                        i3 = wrap2.position() - i;
                    }
                    return i3;
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x0018, code lost:
            
                if (r2.available() > 0) goto L14;
             */
            @Override // java.io.Reader
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean ready() {
                /*
                    r5 = this;
                    java.lang.Object r4 = r5.lock
                    monitor-enter(r4)
                    java.lang.Object r3 = r5.lock     // Catch: java.lang.Throwable -> L2a
                    monitor-enter(r3)     // Catch: java.lang.Throwable -> L2a
                    java.io.InputStream r2 = r5.A00     // Catch: java.lang.Throwable -> L27
                    if (r2 == 0) goto L1f
                    monitor-exit(r3)     // Catch: java.lang.Throwable -> L27
                    r1 = 0
                    java.nio.ByteBuffer r0 = r5.A03     // Catch: java.io.IOException -> L1d java.lang.Throwable -> L2a
                    boolean r0 = r0.hasRemaining()     // Catch: java.io.IOException -> L1d java.lang.Throwable -> L2a
                    if (r0 != 0) goto L1a
                    int r0 = r2.available()     // Catch: java.io.IOException -> L1d java.lang.Throwable -> L2a
                    if (r0 <= 0) goto L1b
                L1a:
                    r1 = 1
                L1b:
                    monitor-exit(r4)     // Catch: java.lang.Throwable -> L2a
                    return r1
                L1d:
                    monitor-exit(r4)     // Catch: java.lang.Throwable -> L2a
                    return r1
                L1f:
                    java.lang.String r1 = "InputStreamReader is closed"
                    java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L27
                    r0.<init>(r1)     // Catch: java.lang.Throwable -> L27
                    throw r0     // Catch: java.lang.Throwable -> L27
                L27:
                    r0 = move-exception
                    monitor-exit(r3)     // Catch: java.lang.Throwable -> L27
                    throw r0     // Catch: java.lang.Throwable -> L2a
                L2a:
                    r0 = move-exception
                    monitor-exit(r4)     // Catch: java.lang.Throwable -> L2a
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C89113yD.ready():boolean");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(fileInputStream);
                Charset defaultCharset = Charset.defaultCharset();
                this.A02 = false;
                this.A03 = wrap;
                this.A00 = fileInputStream;
                CharsetDecoder newDecoder = defaultCharset.newDecoder();
                CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
                this.A01 = newDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
                wrap.limit(0);
            }

            @Override // java.io.Reader
            public final int read() {
                char c;
                synchronized (((Reader) this).lock) {
                    if (this.A00 != null) {
                        char[] cArr = new char[1];
                        c = 65535;
                        if (read(cArr, 0, 1) != -1) {
                            c = cArr[0];
                        }
                    } else {
                        throw new IOException("InputStreamReader is closed");
                    }
                }
                return c;
            }
        };
        try {
            char[] cArr = (char[]) A04.get();
            boolean z = false;
            while (true) {
                int read = reader.read(cArr);
                if (read != -1) {
                    if (!z) {
                        Matcher matcher = c89013y3.A02.matcher(CharBuffer.wrap(cArr));
                        int i = 0;
                        while (matcher.find()) {
                            int start = matcher.start();
                            i = matcher.end();
                            writer.write(cArr, 0, start);
                        }
                        writer.write(cArr, i, read - i);
                        z = true;
                    } else {
                        writer.write(cArr, 0, read);
                    }
                } else {
                    return;
                }
            }
        } finally {
            reader.close();
        }
    }

    @Override // X.InterfaceC89043y6
    public final boolean CYy() {
        return false;
    }

    public void A03() {
    }

    @Override // X.InterfaceC89033y5
    public final boolean CLC() {
        boolean z;
        AbstractC40721uf abstractC40721uf = this.A02;
        if (abstractC40721uf != null) {
            synchronized (abstractC40721uf) {
                z = false;
                if (abstractC40721uf.A01 == this) {
                    z = true;
                }
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC89043y6
    public final void CnF() {
        if (this.A02 != null) {
            this.A02.A07(this);
            A02();
            AbstractC40721uf abstractC40721uf = this.A02;
            abstractC40721uf.A07(this);
            abstractC40721uf.A05();
            return;
        }
        throw new IllegalStateException("mBatchLock is null, and it should be locked");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("{lockKey=");
        sb.append(this.A01);
        sb.append(";hasLock=");
        sb.append(CLC());
        sb.append("}");
        return sb.toString();
    }

    @Override // X.InterfaceC89033y5
    public final void unlock() {
        if (this.A02 != null) {
            this.A02.A07(this);
            this.A02.A08(this);
            A03();
            this.A02.A03();
            this.A02 = null;
            return;
        }
        throw new IllegalStateException("mBatchLock is null, and it should be locked");
    }

    public AbstractC89023y4(C88753xb c88753xb, Object obj) {
        this.A00 = c88753xb;
        this.A01 = obj;
    }

    public final void A04() {
        this.A02 = A01();
        AbstractC40721uf abstractC40721uf = this.A02;
        synchronized (abstractC40721uf) {
            if (abstractC40721uf.A09()) {
                C0K8.A0P("BatchLockState", "Attempting to lock a deleted entry: %s (owned by %s)", abstractC40721uf.A02, abstractC40721uf.A01);
            }
            AbstractC40721uf.A00(abstractC40721uf, this);
            while (abstractC40721uf.A01 != null) {
                try {
                    abstractC40721uf.wait();
                } catch (InterruptedException unused) {
                }
            }
            abstractC40721uf.A04();
            abstractC40721uf.A01 = this;
        }
    }

    @Override // X.InterfaceC89043y6
    public final int B2d() {
        return A00() + 256;
    }

    @Override // X.InterfaceC89043y6
    public final void FEe(Writer writer) {
        if (!CLC()) {
            A04();
        }
        A05(writer);
        C88753xb c88753xb = this.A00;
        writer.write(93);
        writer.write(44);
        C0CA A02 = c88753xb.A02.A02();
        try {
            c88753xb.A01.A00(A02);
            C88773xd c88773xd = c88753xb.A00;
            if (c88773xd != null) {
                c88773xd.A00.E6R(A02);
            }
            C0C2.A00().A05(A02, writer);
            A02.A02();
            writer.write(125);
            writer.flush();
        } catch (Throwable th) {
            A02.A02();
            throw th;
        }
    }
}
