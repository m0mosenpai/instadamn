package X;

import android.content.Context;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Iyv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42943Iyv implements InterfaceC671731i {
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
    public final void EUv(int i, int i2) {
    }

    @Override // X.InterfaceC671731i
    public final void AHa() {
        C32S c32s = this.A02;
        if (c32s != null) {
            C32S.A06(c32s, true);
        }
        C3Z9 c3z9 = this.A03;
        c3z9.A04.clear();
        W5F w5f = c3z9.A00;
        if (w5f != null) {
            w5f.A01();
        }
    }

    @Override // X.InterfaceC671731i
    public final void AVD(Context context) {
        C9GR.A03(context, "Filling ad pool is not supported for contextual feed", AbstractC111324zv.A00(3610), 1);
    }

    @Override // X.InterfaceC671731i
    public final /* bridge */ /* synthetic */ Object AuJ() {
        return this.A01;
    }

    @Override // X.InterfaceC671731i
    public final Map Aut() {
        ImmutableMap copyOf = ImmutableMap.copyOf(this.A03.A02);
        C14360o3.A07(copyOf);
        return copyOf;
    }

    @Override // X.InterfaceC671731i
    public final Map B9T() {
        ImmutableMap copyOf = ImmutableMap.copyOf(this.A03.A03);
        C14360o3.A07(copyOf);
        return copyOf;
    }

    @Override // X.InterfaceC671731i
    public final List BIF() {
        return AbstractC31173DnH.A0L(this.A03.A01);
    }

    @Override // X.InterfaceC671731i
    public final Map BeQ() {
        ImmutableMap copyOf = ImmutableMap.copyOf(this.A03.A04);
        C14360o3.A07(copyOf);
        return copyOf;
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
        map.put(AbstractC111324zv.A00(3724), String.valueOf(c40861ut.A07()));
        map.remove(AbstractC111324zv.A00(3672));
        W5F w5f = this.A00;
        if (w5f != null) {
            w5f.A01();
        }
    }

    @Override // X.InterfaceC671731i
    public final /* bridge */ /* synthetic */ void A9u(Object obj) {
        String str = AbstractC37301Gc2.A0J(obj).A0S;
        this.A03.A04.put(str, str);
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
