package X;

import android.content.Context;

/* renamed from: X.Su5, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63811Su5 implements InterfaceC65477Tku {
    public final Context A00;

    @Override // X.InterfaceC65477Tku
    public final /* bridge */ /* synthetic */ SFV AEj(C63729Ssj c63729Ssj, Object obj, int i, int i2) {
        android.net.Uri uri = (android.net.Uri) obj;
        return new SFV(new C63726Ssg(uri), new C63769StP(this.A00, uri));
    }

    @Override // X.InterfaceC65477Tku
    public final /* bridge */ /* synthetic */ boolean CKb(Object obj) {
        return AbstractC61683Rrx.A00((android.net.Uri) obj);
    }

    public C63811Su5(Context context) {
        this.A00 = context;
    }
}
