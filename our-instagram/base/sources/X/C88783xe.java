package X;

import com.facebook.analytics2.logger.interfaces.DefaultFalcoAcsProvider;
import java.io.File;
import java.util.Iterator;

/* renamed from: X.3xe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C88783xe implements Iterator {
    public int A00;
    public AbstractC40011tS A01;
    public InterfaceC89033y5 A02;
    public File A03;
    public boolean A04;
    public final int A05;
    public final long A06 = (C40661uZ.A00() / C40661uZ.A00) - 7;
    public final long A07 = (C40661uZ.A00() / C40661uZ.A01) - 168;
    public final DefaultFalcoAcsProvider A08;
    public final C88793xf A09;
    public final C88753xb A0A;
    public final C88743xa A0B;
    public final String A0C;
    public final boolean A0D;

    /* JADX WARN: Code restructure failed: missing block: B:74:0x00f3, code lost:
    
        if (r13 >= r2) goto L52;
     */
    @Override // java.util.Iterator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean hasNext() {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88783xe.hasNext():boolean");
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("File removal should be accomplished via markSuccessful");
    }

    public C88783xe(DefaultFalcoAcsProvider defaultFalcoAcsProvider, C88753xb c88753xb, C88743xa c88743xa, File file, String str, int i, boolean z, boolean z2) {
        this.A09 = new C88793xf(file, z2);
        this.A0A = c88753xb;
        this.A0B = c88743xa;
        this.A05 = i;
        this.A08 = defaultFalcoAcsProvider;
        this.A0C = str;
        this.A0D = z;
    }

    public static void A00(File file) {
        if (!file.isDirectory()) {
            C0K8.A0P("FileBatchPayloadIterator", "%s: not a directory, deleting anyway...", file);
        }
        file.delete();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (hasNext()) {
            InterfaceC89033y5 interfaceC89033y5 = this.A02;
            this.A04 = false;
            this.A02 = null;
            return interfaceC89033y5;
        }
        throw new IllegalStateException();
    }
}
