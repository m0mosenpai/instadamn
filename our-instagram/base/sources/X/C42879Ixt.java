package X;

import android.content.Context;
import java.util.Map;

/* renamed from: X.Ixt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42879Ixt implements InterfaceC43455JHt {
    public EnumC153216up A00;
    public final J10 A01;
    public final Context A02;
    public final Map A03;

    public C42879Ixt(Context context, J10 j10) {
        C14360o3.A0B(j10, 2);
        this.A02 = context;
        this.A01 = j10;
        this.A03 = AbstractC166987dD.A1G();
        this.A00 = EnumC153216up.A02;
    }

    @Override // X.InterfaceC43455JHt
    public final C1571273r Afz() {
        C1571273r c1571273r = (C1571273r) this.A03.get(this.A00);
        if (c1571273r == null) {
            return AbstractC37300Gc1.A0J();
        }
        return c1571273r;
    }

    @Override // X.InterfaceC43455JHt
    public final EnumC153216up B1M() {
        return this.A00;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC43455JHt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void FAs() {
        /*
            r3 = this;
            X.6up r2 = r3.A00
            X.J10 r0 = r3.A01
            java.lang.Object r1 = r0.A01
            X.HCN r1 = (X.HCN) r1
            X.J1K r0 = r1.A04
            if (r0 == 0) goto L4d
            boolean r0 = r0.isLoading()
            if (r0 != 0) goto L4a
            X.7hR r0 = r1.A01
            if (r0 == 0) goto L47
            boolean r0 = r0.isLoading()
            if (r0 != 0) goto L4a
            X.J1K r0 = r1.A04
            if (r0 == 0) goto L4d
            boolean r0 = r0.CUG()
            if (r0 != 0) goto L44
            X.7hR r0 = r1.A01
            if (r0 == 0) goto L47
            boolean r0 = r0.CUG()
            if (r0 != 0) goto L44
            X.6up r0 = X.EnumC153216up.A02
        L32:
            r3.A00 = r0
            if (r0 == r2) goto L53
            X.HEU r0 = r1.A02
            if (r0 != 0) goto L50
            java.lang.String r0 = "adapter"
        L3c:
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L44:
            X.6up r0 = X.EnumC153216up.A04
            goto L32
        L47:
            java.lang.String r0 = "brandSearchResultProvider"
            goto L3c
        L4a:
            X.6up r0 = X.EnumC153216up.A06
            goto L32
        L4d:
            java.lang.String r0 = "networkHelper"
            goto L3c
        L50:
            r0.A00()
        L53:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42879Ixt.FAs():void");
    }

    @Override // X.InterfaceC43455JHt
    public final void EgQ() {
        C1571273r A0J = AbstractC37300Gc1.A0J();
        Context context = this.A02;
        AbstractC37304Gc5.A0q(context, A0J);
        Map map = this.A03;
        map.put(EnumC153216up.A06, A0J);
        C1571273r A0O = AbstractC37304Gc5.A0O();
        ViewOnClickListenerC42033Ik2.A01(A0O, this, 51);
        map.put(EnumC153216up.A04, A0O);
        C1571273r A0J2 = AbstractC37300Gc1.A0J();
        A0J2.A0D = context.getString(2131968594);
        map.put(EnumC153216up.A02, A0J2);
    }
}
