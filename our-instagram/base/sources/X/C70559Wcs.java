package X;

import android.content.SharedPreferences;

/* renamed from: X.Wcs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70559Wcs implements InterfaceC200298tY {
    public final /* synthetic */ C69518Vqh A00;

    @Override // X.InterfaceC200298tY
    public final void Den(C201938wQ c201938wQ) {
        if (c201938wQ.A00 != EnumC222499rq.A03) {
            C69518Vqh c69518Vqh = this.A00;
            String str = (String) c201938wQ.getKey();
            SharedPreferences sharedPreferences = c69518Vqh.A00.getSharedPreferences("act_dns_cache", 0);
            C14360o3.A07(sharedPreferences);
            sharedPreferences.edit().remove(str).apply();
        }
    }

    public C70559Wcs(C69518Vqh c69518Vqh) {
        this.A00 = c69518Vqh;
    }
}
