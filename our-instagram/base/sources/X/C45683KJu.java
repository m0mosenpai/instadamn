package X;

import com.instagram.common.gallery.Medium;
import java.util.Iterator;

/* renamed from: X.KJu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45683KJu extends C2AH {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C45683KJu(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // X.C2AH
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        if (this.A00 != 0) {
            C65911TwI c65911TwI = (C65911TwI) obj;
            C14360o3.A0B(c65911TwI, 0);
            ((C66151U1s) this.A02).A00 = c65911TwI;
            AbstractC166987dD.A1Y(this.A01);
            return;
        }
        C189368aD c189368aD = (C189368aD) obj;
        C14360o3.A0B(c189368aD, 0);
        Iterator it = c189368aD.A01.iterator();
        while (it.hasNext()) {
            ((C8SF) this.A01).A04((Medium) it.next(), (InterfaceC193488hT) this.A02);
        }
    }
}
