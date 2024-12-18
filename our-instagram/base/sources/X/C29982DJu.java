package X;

import android.os.Handler;

/* renamed from: X.DJu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29982DJu extends C0YY implements InterfaceC16660sJ {
    public static final C29982DJu A00 = new C29982DJu();

    public C29982DJu() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        BT9 bt9 = (BT9) obj;
        Handler handler = bt9.getHandler();
        final InterfaceC16820sZ interfaceC16820sZ = bt9.A0S;
        handler.post(new Runnable() { // from class: X.D0t
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC16820sZ.this.invoke();
            }
        });
        return C0eB.A00;
    }
}
