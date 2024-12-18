package X;

import android.media.SoundPool;

/* renamed from: X.Oh6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55341Oh6 implements SoundPool.OnLoadCompleteListener {
    public final /* synthetic */ C55742OpB A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ InterfaceC16820sZ A02;
    public final /* synthetic */ InterfaceC16820sZ A03;

    public C55341Oh6(C55742OpB c55742OpB, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        this.A00 = c55742OpB;
        this.A01 = str;
        this.A03 = interfaceC16820sZ;
        this.A02 = interfaceC16820sZ2;
    }

    @Override // android.media.SoundPool.OnLoadCompleteListener
    public final void onLoadComplete(SoundPool soundPool, int i, int i2) {
        InterfaceC16820sZ interfaceC16820sZ;
        if (i2 == 0) {
            Integer valueOf = Integer.valueOf(i);
            C55742OpB c55742OpB = this.A00;
            c55742OpB.A05.put(this.A01, valueOf);
            c55742OpB.A00 = i;
            interfaceC16820sZ = this.A03;
        } else {
            this.A00.A00 = -1;
            interfaceC16820sZ = this.A02;
        }
        interfaceC16820sZ.invoke();
    }
}
