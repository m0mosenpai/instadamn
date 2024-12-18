package X;

import java.lang.ref.WeakReference;

/* renamed from: X.JWz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43761JWz implements InterfaceC41501vz {
    public final String A00;
    public final WeakReference A01;

    public C43761JWz(String str, WeakReference weakReference) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
        this.A01 = weakReference;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        C51762Yz c51762Yz;
        int A03 = C0f9.A03(1371533779);
        C3MC c3mc = (C3MC) obj;
        int A0N = AbstractC167017dG.A0N(c3mc, -1061620624);
        if (C14360o3.A0K(c3mc.A01, this.A00) && (c51762Yz = (C51762Yz) this.A01.get()) != null) {
            c51762Yz.A01(c3mc.A00);
        }
        C0f9.A0A(-940927458, A0N);
        C0f9.A0A(1441424465, A03);
    }
}
