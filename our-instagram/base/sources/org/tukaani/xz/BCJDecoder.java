package org.tukaani.xz;

import X.InterfaceC14780os;
import X.InterfaceC20420zJ;
import X.InterfaceC20670zm;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class BCJDecoder implements InterfaceC20670zm, InterfaceC14780os {
    public static final BCJDecoder $redex_init_class = null;
    public final int A00;
    public final long A01;

    public BCJDecoder() {
    }

    @Override // X.InterfaceC20670zm
    public final boolean AH8() {
        return false;
    }

    @Override // X.InterfaceC20670zm
    public final boolean Cgc() {
        return false;
    }

    @Override // X.InterfaceC20670zm
    public final boolean Ct0() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, X.0lH] */
    /* JADX WARN: Type inference failed for: r1v11, types: [X.0lG, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, X.0lE] */
    /* JADX WARN: Type inference failed for: r1v7, types: [X.0lF, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, X.0lI] */
    /* JADX WARN: Type inference failed for: r1v9, types: [X.0lJ, java.lang.Object] */
    @Override // X.InterfaceC14780os
    public final InputStream BI5(InputStream inputStream) {
        InterfaceC20420zJ interfaceC20420zJ;
        long j = this.A01;
        if (j == 4) {
            int i = this.A00;
            ?? obj = new Object();
            obj.A01 = 0;
            obj.A00 = i + 5;
            interfaceC20420zJ = obj;
        } else if (j == 5) {
            int i2 = this.A00;
            ?? obj2 = new Object();
            obj2.A00 = i2;
            interfaceC20420zJ = obj2;
        } else if (j == 6) {
            int i3 = this.A00;
            ?? obj3 = new Object();
            obj3.A00 = i3;
            interfaceC20420zJ = obj3;
        } else if (j == 7) {
            int i4 = this.A00;
            ?? obj4 = new Object();
            obj4.A00 = i4 + 8;
            interfaceC20420zJ = obj4;
        } else if (j == 8) {
            int i5 = this.A00;
            ?? obj5 = new Object();
            obj5.A00 = i5 + 4;
            interfaceC20420zJ = obj5;
        } else if (j == 9) {
            int i6 = this.A00;
            ?? obj6 = new Object();
            obj6.A00 = i6;
            interfaceC20420zJ = obj6;
        } else {
            interfaceC20420zJ = null;
        }
        return new SimpleInputStream(inputStream, interfaceC20420zJ);
    }

    @Override // X.InterfaceC14780os
    public final int BSI() {
        SimpleInputStream simpleInputStream = SimpleInputStream.$redex_init_class;
        return 5;
    }

    static {
        try {
            Class.forName("org.tukaani.xz.BCJDecoder");
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    public BCJDecoder(long j, byte[] bArr) {
        this.A01 = j;
        int length = bArr.length;
        int i = 0;
        if (length != 0) {
            if (length == 4) {
                int i2 = 0;
                do {
                    i2 |= (bArr[i] & 255) << (i * 8);
                    i++;
                } while (i < 4);
                this.A00 = i2;
                return;
            }
            throw new IOException("Unsupported BCJ filter properties");
        }
    }
}
