package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.Sua, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63842Sua implements InterfaceC65324Ti4 {
    public final Context A00;
    public final Class A01;

    @Override // X.InterfaceC65324Ti4
    public final InterfaceC65477Tku AEQ(C62954SYw c62954SYw) {
        Context context = this.A00;
        Class cls = this.A01;
        return new C63818SuC(context, c62954SYw.A00(File.class, cls), c62954SYw.A00(android.net.Uri.class, cls), cls);
    }

    public AbstractC63842Sua(Context context, Class cls) {
        this.A00 = context;
        this.A01 = cls;
    }
}
