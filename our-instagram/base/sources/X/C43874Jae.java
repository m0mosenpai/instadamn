package X;

/* renamed from: X.Jae, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43874Jae extends C0T6 implements InterfaceC66482zP {
    public final C8Z4 A00;

    public C43874Jae(C8Z4 c8z4) {
        C14360o3.A0B(c8z4, 1);
        this.A00 = c8z4;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C43874Jae) && C14360o3.A0K(this.A00, ((C43874Jae) obj).A00));
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        String str;
        C8Z4 c8z4 = this.A00;
        if (c8z4.CBv().intValue() != 0) {
            str = "REMOTE";
        } else {
            str = "SYSTEM";
        }
        return AnonymousClass001.A0G(str, '_', c8z4.BF3());
    }

    public final int hashCode() {
        return AbstractC166987dD.A0G(this.A00);
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C43874Jae c43874Jae = (C43874Jae) obj;
        if (c43874Jae == null || !C14360o3.A0K(this.A00.getName(), c43874Jae.A00.getName())) {
            return false;
        }
        return true;
    }
}
