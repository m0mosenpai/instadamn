package X;

import android.content.Context;
import java.io.File;
import java.io.IOException;

/* renamed from: X.0QB, reason: invalid class name */
/* loaded from: classes.dex */
public class C0QB extends AbstractC07480aN {
    public final File A00;
    public final String A01;

    public C0QB(Context context, File file, String str, String str2) {
        super(context, str, true);
        this.A00 = file;
        this.A01 = str2;
    }

    @Override // X.C006402e, X.AbstractC09180dS
    public String A06() {
        return "ExtractFromZipSoSource";
    }

    @Override // X.AbstractC07480aN
    public final AbstractC09260db A0A() {
        return new C00Z(this, this);
    }

    @Override // X.C006402e, X.AbstractC09180dS
    public final String toString() {
        String name;
        String A06 = A06();
        File file = this.A00;
        try {
            name = file.getCanonicalPath();
        } catch (IOException unused) {
            name = file.getName();
        }
        return AnonymousClass001.A0u(A06, "[", name, "]");
    }

    public C0QB(Context context, File file, File file2, String str) {
        super(context, file);
        this.A00 = file2;
        this.A01 = str;
    }
}
