package X;

import android.content.Context;
import android.view.MotionEvent;

/* renamed from: X.LwO, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49631LwO implements InterfaceC144626fi {
    public final C50546MTb A00;
    public final MQF A01;

    @Override // X.InterfaceC144626fi
    public final boolean DrU() {
        return false;
    }

    @Override // X.InterfaceC144626fi
    public final boolean DrW() {
        return false;
    }

    @Override // X.InterfaceC144626fi, X.InterfaceC144636fj
    public final boolean DrS(float f, float f2) {
        return this.A01.DrR();
    }

    @Override // X.InterfaceC144626fi, X.InterfaceC144636fj
    public final boolean Drb(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return this.A01.Dra();
    }

    public C49631LwO(Context context, MQF mqf) {
        this.A01 = mqf;
        this.A00 = new C50546MTb(context);
    }
}
