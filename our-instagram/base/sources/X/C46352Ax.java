package X;

import android.util.LruCache;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.2Ax, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46352Ax implements InterfaceC46362Ay {
    public final C46322Au A00;

    @Override // X.InterfaceC46362Ay
    public final boolean CR3(android.net.Uri uri, String str, String str2, long j, long j2) {
        boolean z;
        VKD vkd = Wc7.A0B;
        UMT umt = new UMT(str2, uri);
        VKD vkd2 = Wc7.A0B;
        synchronized (vkd2) {
            InterfaceC92354Bq A00 = vkd2.A00(umt);
            z = false;
            if (A00 != null) {
                z = true;
            }
        }
        if (!z && this.A00.A01(uri, str2) == null) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC46362Ay
    public final void EbI(String str, String str2) {
        C69191VjK c69191VjK;
        C46322Au c46322Au = this.A00;
        if (str != null && str2 != null) {
            AtomicReference atomicReference = c46322Au.A01;
            synchronized (atomicReference) {
                c69191VjK = (C69191VjK) ((LruCache) atomicReference.get()).get(str);
            }
            if (c69191VjK != null) {
                synchronized (c69191VjK) {
                }
                return;
            }
            return;
        }
        AbstractC459729h.A01("DashChunkMemoryCache", "Invalid input is given for setPrefetchFormatId", new Object[0]);
    }

    public C46352Ax(C46322Au c46322Au) {
        this.A00 = c46322Au;
    }
}
