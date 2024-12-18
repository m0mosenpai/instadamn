package X;

import android.content.Context;
import java.util.List;
import java.util.Map;

/* renamed from: X.6hd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C145806hd implements InterfaceC671731i {
    public W5F A00;
    public C40861ut A01;
    public C32S A02;
    public final C3Z9 A03 = new C3Z9();

    @Override // X.InterfaceC671731i
    public final void EF4() {
        this.A00 = null;
        this.A03.A00 = null;
    }

    @Override // X.InterfaceC671731i
    public final /* bridge */ /* synthetic */ void A9u(Object obj) {
        C41551w4 c41551w4 = (C41551w4) obj;
        C14360o3.A0B(c41551w4, 0);
        String id = c41551w4.A0H.getId();
        C14360o3.A07(id);
        this.A03.A04.put(id, id);
        W5F w5f = this.A00;
        if (w5f != null) {
            w5f.A01();
        }
    }

    @Override // X.InterfaceC671731i
    public final void AHa() {
        C32S c32s = this.A02;
        if (c32s == null) {
            C14360o3.A0F("poolOperationCallback");
            throw C00O.createAndThrow();
        }
        C32S.A06(c32s, true);
        C3Z9 c3z9 = this.A03;
        c3z9.A04.clear();
        W5F w5f = c3z9.A00;
        if (w5f != null) {
            w5f.A01();
        }
    }

    @Override // X.InterfaceC671731i
    public final void AVD(Context context) {
        C3Z9 c3z9 = this.A03;
        Map map = c3z9.A04;
        int size = map.size();
        List list = c3z9.A01;
        int size2 = list.size();
        C32S c32s = this.A02;
        if (c32s == null) {
            C14360o3.A0F("poolOperationCallback");
            throw C00O.createAndThrow();
        }
        c32s.A0T.Co5();
        int size3 = (map.size() - size) + 1;
        int size4 = list.size() - size2;
        if (size3 > 0 && size4 > 0) {
            C9GR.A09(context, AnonymousClass001.A03(size3, " ads were successfully added to the pool"));
        } else {
            C9GR.A00(context, "No ads were sent to the pool. Try Fill Pool again or reopen stories", "FILL_POOL_ERROR", 1);
        }
    }

    @Override // X.InterfaceC671731i
    public final /* bridge */ /* synthetic */ Object AuJ() {
        return this.A01;
    }

    @Override // X.InterfaceC671731i
    public final Map Aut() {
        return AbstractC06930Yk.A0B(this.A03.A02);
    }

    @Override // X.InterfaceC671731i
    public final Map B9T() {
        return AbstractC06930Yk.A0B(this.A03.A03);
    }

    @Override // X.InterfaceC671731i
    public final List BIF() {
        return AbstractC001800i.A0a(this.A03.A01);
    }

    @Override // X.InterfaceC671731i
    public final Map BeQ() {
        return AbstractC06930Yk.A0B(this.A03.A04);
    }

    @Override // X.InterfaceC671731i
    public final C3Z9 BuQ() {
        return this.A03;
    }

    @Override // X.InterfaceC671731i
    public final void EQn(W5F w5f) {
        this.A00 = w5f;
        this.A03.A00 = w5f;
    }

    @Override // X.InterfaceC671731i
    public final /* bridge */ /* synthetic */ void ESa(Object obj) {
        C40861ut c40861ut = (C40861ut) obj;
        C14360o3.A0B(c40861ut, 0);
        this.A01 = c40861ut;
        C3Z9 c3z9 = this.A03;
        c3z9.A01(c40861ut.A00(), c40861ut.A01(), c40861ut.A02(), c40861ut.A03(), c40861ut.A06());
        Map map = c3z9.A03;
        map.put("Reel gap to previous ad", String.valueOf(c40861ut.A07()));
        map.put("Reel gap to previous netego", String.valueOf(c40861ut.A08()));
        map.put("Max reel gap to previous item", String.valueOf(c40861ut.A04()));
        W5F w5f = this.A00;
        if (w5f != null) {
            w5f.A01();
        }
    }

    @Override // X.InterfaceC671731i
    public final void EUv(int i, int i2) {
        Map map = this.A03.A02;
        map.put("Reel gap to previous ad", String.valueOf(i));
        map.put("Reel gap to previous netego", String.valueOf(i2));
        W5F w5f = this.A00;
        if (w5f != null) {
            w5f.A01();
        }
    }

    @Override // X.InterfaceC671731i
    public final void EPG(C32S c32s) {
        this.A02 = c32s;
    }
}
