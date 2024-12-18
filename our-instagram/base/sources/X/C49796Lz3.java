package X;

import android.content.Context;

/* renamed from: X.Lz3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49796Lz3 implements InterfaceC42241xE {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C49796Lz3(String str, Object obj, int i) {
        this.A00 = i;
        this.A02 = str;
        this.A01 = obj;
    }

    @Override // X.InterfaceC42241xE
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        Context context;
        switch (this.A00) {
            case 0:
                ((C43655JSn) obj).A01(new C49224Lpf(((C49206LpN) this.A01).A0D.A00(), this.A02));
                return;
            case 1:
                InterfaceC132965zL interfaceC132965zL = (InterfaceC132965zL) obj;
                if (!(interfaceC132965zL instanceof C48496Lcn)) {
                    return;
                }
                C0w9.A07(this.A02, (Throwable) AbstractC132975zM.A00(interfaceC132965zL));
                C9GR.A0A((Context) this.A01, "error");
                return;
            case 2:
                if ((obj instanceof C48496Lcn) || (context = (Context) this.A01) == null) {
                    return;
                }
                C9GR.A09(context, AbstractC167007dF.A0f(context, this.A02, 2131960438));
                return;
            case 3:
                ((C7X3) this.A01).A05(this.A02, true);
                return;
            case 4:
                if (!(obj instanceof C132955zK)) {
                    return;
                }
                C7X3 c7x3 = (C7X3) this.A01;
                String str = this.A02;
                c7x3.A05(str, false);
                c7x3.A04(str, true);
                return;
            default:
                return;
        }
    }

    public C49796Lz3(Context context, String str, int i) {
        this.A00 = i;
        if (1 - i != 0) {
            this.A01 = context;
            this.A02 = str;
        } else {
            this.A02 = str;
            this.A01 = context;
        }
    }
}
