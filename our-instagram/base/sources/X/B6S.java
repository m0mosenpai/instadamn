package X;

import java.util.UUID;

/* loaded from: classes4.dex */
public final class B6S extends C0YY implements InterfaceC16820sZ {
    public static final B6S A00 = new B6S();

    public B6S() {
        super(0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        return Integer.valueOf(UUID.randomUUID().hashCode());
    }
}
