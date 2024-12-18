package X;

import android.content.Context;
import android.os.Looper;
import java.util.Map;

/* renamed from: X.7wy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C178867wy {
    public static final Object A05 = new Object();
    public InterfaceC178897x1 A00;
    public final C178847ww A01;
    public final Context A02;
    public final C178887x0 A03;
    public final C178877wz A04;

    public final C178907x2 A00(Looper looper) {
        Context context = this.A02;
        C178847ww c178847ww = this.A01;
        C178877wz c178877wz = this.A04;
        C178887x0 c178887x0 = this.A03;
        C178857wx c178857wx = C178847ww.A0B;
        Map map = c178847ww.A00;
        InterfaceC178897x1 interfaceC178897x1 = (InterfaceC178897x1) map.get(c178857wx);
        if (interfaceC178897x1 == null) {
            Object obj = map.get(C178847ww.A04);
            obj.getClass();
            if (!((Boolean) obj).booleanValue()) {
                interfaceC178897x1 = null;
            } else {
                if (this.A00 == null) {
                    C178857wx c178857wx2 = C178847ww.A02;
                    Object obj2 = A05;
                    Object obj3 = map.get(c178857wx2);
                    if (obj3 != null) {
                        obj2 = obj3;
                    }
                    Object obj4 = map.get(C178847ww.A07);
                    obj4.getClass();
                    C178927x4 A01 = C178917x3.A01(obj2, ((Number) obj4).intValue());
                    this.A00 = A01;
                    A01.EhY(1);
                }
                interfaceC178897x1 = this.A00;
            }
        }
        return new C178907x2(context, looper, c178887x0, interfaceC178897x1, c178847ww, c178877wz);
    }

    public C178867wy(Context context, C178887x0 c178887x0, C178847ww c178847ww, C178877wz c178877wz) {
        this.A02 = context.getApplicationContext();
        this.A01 = c178847ww;
        this.A03 = c178887x0;
        this.A04 = c178877wz;
    }
}
