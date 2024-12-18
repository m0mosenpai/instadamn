package X;

import android.content.Context;
import android.os.StrictMode;
import java.io.File;
import java.util.Collection;

/* renamed from: X.07I, reason: invalid class name */
/* loaded from: classes.dex */
public final class C07I extends AbstractC09180dS implements InterfaceC09120dK {
    public C006402e A00;
    public final int A01;

    @Override // X.AbstractC09180dS
    public final String A06() {
        return "ApplicationSoSource";
    }

    @Override // X.AbstractC09180dS
    public final void A02(Collection collection) {
        this.A00.A02(collection);
    }

    @Override // X.AbstractC09180dS
    public final String[] A03(String str) {
        return this.A00.A03(str);
    }

    @Override // X.AbstractC09180dS
    public final int A04(StrictMode.ThreadPolicy threadPolicy, String str, int i) {
        return this.A00.A04(threadPolicy, str, i);
    }

    @Override // X.AbstractC09180dS
    public final File A05(String str) {
        return this.A00.A09(str);
    }

    @Override // X.AbstractC09180dS
    public final String A07(String str) {
        return this.A00.A07(str);
    }

    @Override // X.AbstractC09180dS
    public final void A08(int i) {
        this.A00.A08(i);
    }

    @Override // X.AbstractC09180dS
    public final String toString() {
        return AnonymousClass001.A0u("ApplicationSoSource", "[", this.A00.toString(), "]");
    }

    public C07I(Context context, int i) {
        this.A01 = i;
        this.A00 = new C006402e(new File(context.getApplicationInfo().nativeLibraryDir), i);
    }

    @Override // X.InterfaceC09120dK
    public final AbstractC09180dS ECf(Context context) {
        this.A00 = new C006402e(new File(context.getApplicationInfo().nativeLibraryDir), this.A01 | 1);
        return this;
    }
}
