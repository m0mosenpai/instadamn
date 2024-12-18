package X;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.Iyu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42942Iyu implements InterfaceC671731i {
    public W5F A00;
    public C671831j A01;
    public C32S A02;
    public final C3Z9 A03 = new C3Z9();

    @Override // X.InterfaceC671731i
    public final void EF4() {
        this.A00 = null;
        this.A03.A00 = null;
    }

    @Override // X.InterfaceC671731i
    public final void EUv(int i, int i2) {
    }

    @Override // X.InterfaceC671731i
    public final /* bridge */ /* synthetic */ void A9u(Object obj) {
        C206239Bg c206239Bg = (C206239Bg) obj;
        C14360o3.A0B(c206239Bg, 0);
        Map map = this.A03.A04;
        C120985dq c120985dq = (C120985dq) c206239Bg.A03;
        map.put(AbstractC25226BEj.A1E(c120985dq), AbstractC25226BEj.A1E(c120985dq));
        W5F w5f = this.A00;
        if (w5f != null) {
            w5f.A01();
        }
    }

    @Override // X.InterfaceC671731i
    public final void AHa() {
        C32S c32s = this.A02;
        if (c32s != null) {
            C32S.A06(c32s, true);
        }
    }

    @Override // X.InterfaceC671731i
    public final void AVD(Context context) {
        C32S c32s = this.A02;
        if (c32s != null) {
            c32s.A0T.Co5();
        }
    }

    @Override // X.InterfaceC671731i
    public final /* bridge */ /* synthetic */ Object AuJ() {
        return this.A01;
    }

    @Override // X.InterfaceC671731i
    public final Map Aut() {
        Map unmodifiableMap = Collections.unmodifiableMap(this.A03.A02);
        C14360o3.A07(unmodifiableMap);
        return unmodifiableMap;
    }

    @Override // X.InterfaceC671731i
    public final Map B9T() {
        Map unmodifiableMap = Collections.unmodifiableMap(this.A03.A03);
        C14360o3.A07(unmodifiableMap);
        return unmodifiableMap;
    }

    @Override // X.InterfaceC671731i
    public final List BIF() {
        return AbstractC31172DnG.A19(this.A03.A01);
    }

    @Override // X.InterfaceC671731i
    public final Map BeQ() {
        Map unmodifiableMap = Collections.unmodifiableMap(this.A03.A04);
        C14360o3.A07(unmodifiableMap);
        return unmodifiableMap;
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
        C671831j c671831j = (C671831j) obj;
        C14360o3.A0B(c671831j, 0);
        this.A01 = c671831j;
        C3Z9 c3z9 = this.A03;
        c3z9.A01(-1.0d, -1, -1, -1, -1);
        c3z9.A03.put(AbstractC111324zv.A00(4927), String.valueOf(c671831j.A05()));
    }

    @Override // X.InterfaceC671731i
    public final void EPG(C32S c32s) {
        this.A02 = c32s;
    }
}
