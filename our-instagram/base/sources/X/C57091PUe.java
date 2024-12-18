package X;

import android.content.Context;
import java.util.List;

/* renamed from: X.PUe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57091PUe implements InterfaceC09250da, InterfaceC16660sJ {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C57091PUe(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        switch (this.A00) {
            case 1:
            case 2:
                InterfaceC16590sC interfaceC16590sC = (InterfaceC16590sC) this.A02;
                List list = ((C6FW) obj).A00;
                interfaceC16590sC.invoke(list.get(0), list.get(1), list.get(2), list.get(3), list.get(4));
                return null;
            case 3:
                AbstractC166987dD.A1Y(this.A02);
                return null;
            case 4:
            default:
                ((InterfaceC16660sJ) this.A02).invoke(MSY.A0a((C6FW) obj));
                return null;
            case 5:
                C54796OJo c54796OJo = (C54796OJo) this.A01;
                Context context = (Context) this.A02;
                Throwable th = (Throwable) obj;
                if (th == null || (str = th.getMessage()) == null) {
                    str = "EMPTY ERROR MESSAGE";
                }
                SZ2.A00(c54796OJo.A03, "settings_clear_error", str);
                C9GR.A07(context, 2131954329);
                return C0eB.A00;
        }
    }
}
