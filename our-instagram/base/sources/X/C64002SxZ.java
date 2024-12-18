package X;

/* renamed from: X.SxZ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64002SxZ implements InterfaceC48212Jk {
    public final int A00;
    public final String A01;

    public C64002SxZ(String str, int i) {
        this.A00 = i;
        switch (i) {
            case 0:
            case 1:
                this.A01 = str;
                return;
            default:
                this.A01 = str;
                return;
        }
    }

    @Override // X.InterfaceC48212Jk
    public final void invoke(Throwable th) {
        EnumC223219t5 enumC223219t5;
        int i = this.A00;
        String str = this.A01;
        switch (i) {
            case 0:
                enumC223219t5 = EnumC223219t5.A0l;
                break;
            case 1:
                enumC223219t5 = EnumC223219t5.A0m;
                break;
            case 2:
                enumC223219t5 = EnumC223219t5.A0j;
                break;
            case 3:
                enumC223219t5 = EnumC223219t5.A0i;
                break;
            default:
                enumC223219t5 = EnumC223219t5.A0k;
                break;
        }
        A1A.A00(enumC223219t5, str);
    }
}
