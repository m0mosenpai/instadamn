package X;

import java.lang.ref.WeakReference;

/* renamed from: X.Lv1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49547Lv1 implements C5OF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C49548Lv2 A01;
    public final /* synthetic */ InterfaceC41211vV A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ WeakReference A04;

    public C49547Lv1(C49548Lv2 c49548Lv2, InterfaceC41211vV interfaceC41211vV, String str, WeakReference weakReference, int i) {
        this.A02 = interfaceC41211vV;
        this.A00 = i;
        this.A03 = str;
        this.A01 = c49548Lv2;
        this.A04 = weakReference;
    }

    @Override // X.C5OF
    public final void DHK(boolean z) {
        C140906Ys c140906Ys;
        int i = this.A00;
        String str = this.A03;
        C49548Lv2 c49548Lv2 = this.A01;
        InterfaceC50398MNa interfaceC50398MNa = c49548Lv2.A07;
        C14360o3.A0A(str);
        C49549Lv3 c49549Lv3 = (C49549Lv3) interfaceC50398MNa;
        c49549Lv3.A00.A09.A00(str, z, i);
        C11T.A02(new M2C(c49549Lv3));
        WeakReference weakReference = this.A04;
        if (weakReference != null && (c140906Ys = (C140906Ys) weakReference.get()) != null) {
            c140906Ys.A00(z);
        }
        C49548Lv2.A00(c49548Lv2);
    }
}
