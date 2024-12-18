package X;

import java.lang.ref.Reference;

/* renamed from: X.3q7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C84583q7 extends C0YY implements InterfaceC16660sJ {
    public static final C84583q7 A00 = new C84583q7();

    public C84583q7() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Reference reference = (Reference) obj;
        boolean z = false;
        C14360o3.A0B(reference, 0);
        if (reference.get() == null) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
