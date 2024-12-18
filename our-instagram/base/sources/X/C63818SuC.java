package X;

import android.content.Context;
import android.os.Build;

/* renamed from: X.SuC, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63818SuC implements InterfaceC65477Tku {
    public final Context A00;
    public final InterfaceC65477Tku A01;
    public final InterfaceC65477Tku A02;
    public final Class A03;

    @Override // X.InterfaceC65477Tku
    public final /* bridge */ /* synthetic */ SFV AEj(C63729Ssj c63729Ssj, Object obj, int i, int i2) {
        android.net.Uri uri = (android.net.Uri) obj;
        return new SFV(new C63726Ssg(uri), new C63771StR(this.A00, uri, c63729Ssj, this.A01, this.A02, this.A03, i, i2));
    }

    @Override // X.InterfaceC65477Tku
    public final /* bridge */ /* synthetic */ boolean CKb(Object obj) {
        android.net.Uri uri = (android.net.Uri) obj;
        if (Build.VERSION.SDK_INT >= 29 && AbstractC61683Rrx.A00(uri)) {
            return true;
        }
        return false;
    }

    public C63818SuC(Context context, InterfaceC65477Tku interfaceC65477Tku, InterfaceC65477Tku interfaceC65477Tku2, Class cls) {
        this.A00 = context.getApplicationContext();
        this.A01 = interfaceC65477Tku;
        this.A02 = interfaceC65477Tku2;
        this.A03 = cls;
    }
}
