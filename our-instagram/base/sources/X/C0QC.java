package X;

import com.facebook.common.dextricks.Constants;
import java.io.File;
import java.io.FileInputStream;

/* renamed from: X.0QC, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0QC extends AbstractC07480aN {
    @Override // X.C006402e, X.AbstractC09180dS
    public final String A06() {
        return "ExoSoSource";
    }

    @Override // X.AbstractC07480aN
    public final AbstractC09260db A0A() {
        return new AbstractC09260db(this) { // from class: X.00l
            public final C002000k[] A00;

            /* JADX WARN: Code restructure failed: missing block: B:32:0x00ca, code lost:
            
                throw new java.lang.RuntimeException(X.AnonymousClass001.A0g("illegal line in exopackage metadata: [", r2, "]"));
             */
            {
                /*
                    Method dump skipped, instructions count: 256
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C002100l.<init>(X.0QC, X.0aN):void");
            }

            @Override // X.AbstractC09260db
            public final C09240dZ[] A02() {
                return this.A00;
            }

            @Override // X.AbstractC09260db
            public final void A01(File file) {
                byte[] bArr = new byte[Constants.LOAD_RESULT_PGO];
                for (C002000k c002000k : this.A00) {
                    FileInputStream fileInputStream = new FileInputStream(c002000k.A00);
                    try {
                        AbstractC09260db.A00(c002000k, file, fileInputStream, bArr);
                        fileInputStream.close();
                    } finally {
                    }
                }
            }
        };
    }
}
