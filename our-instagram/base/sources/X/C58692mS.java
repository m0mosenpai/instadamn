package X;

import android.util.Pair;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.2mS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C58692mS extends AbstractC58702mT {
    public static final InterfaceC58742mX A06 = new InterfaceC58742mX() { // from class: X.2mW
        @Override // X.InterfaceC58742mX
        public final /* bridge */ /* synthetic */ Object AK1(File file) {
            byte[] bArr;
            ByteBuffer wrap;
            AbstractC56582ir A00;
            if (file == null) {
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    bArr = C15V.A00(fileInputStream);
                    try {
                        fileInputStream.close();
                    } catch (FileNotFoundException | IOException unused) {
                    }
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    }
                    throw th;
                }
            } catch (FileNotFoundException | IOException unused2) {
                bArr = null;
            }
            if (bArr == null || (A00 = C58692mS.A00((wrap = ByteBuffer.wrap(bArr)))) == null) {
                return null;
            }
            return Pair.create(wrap, A00);
        }
    };
    public static volatile C68V A07;
    public int A00;
    public int A01;
    public String A02;
    public AtomicReference A03;
    public AtomicReference A04;
    public final C58632mM A05;

    /* JADX WARN: Type inference failed for: r0v6, types: [X.68V, java.lang.Object] */
    public static AbstractC56582ir A00(ByteBuffer byteBuffer) {
        try {
            if (A07 == null) {
                synchronized (C58692mS.class) {
                    if (A07 == null) {
                        A07 = new Object();
                    }
                }
            }
            return A07.A00(byteBuffer);
        } catch (Exception unused) {
            return null;
        }
    }

    public C58692mS(C58632mM c58632mM, Executor executor, int i) {
        super(executor, i);
        this.A03 = new AtomicReference();
        this.A04 = new AtomicReference();
        this.A05 = c58632mM;
    }
}
