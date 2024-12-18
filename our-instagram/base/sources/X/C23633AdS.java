package X;

import android.graphics.Bitmap;

/* renamed from: X.AdS, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23633AdS implements InterfaceC66482zP {
    public Bitmap A00;
    public String A01;
    public boolean A02;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return AbstractC166997dE.A0u(this.A00);
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
