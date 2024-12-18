package X;

/* renamed from: X.FyB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36197FyB implements InterfaceC66482zP {
    public final Integer A00;
    public final boolean A01;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        switch (this.A00.intValue()) {
            case 0:
                return "MOST_RECENT";
            case 1:
                return "MOST_INTERACTED_WITH";
            default:
                return "LEAST_INTERACTED_WITH";
        }
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        Integer num;
        C36197FyB c36197FyB = (C36197FyB) obj;
        Integer num2 = this.A00;
        if (c36197FyB != null) {
            num = c36197FyB.A00;
        } else {
            num = null;
        }
        if (num2 == num && c36197FyB != null && this.A01 == c36197FyB.A01) {
            return true;
        }
        return false;
    }

    public C36197FyB(Integer num, boolean z) {
        this.A00 = num;
        this.A01 = z;
    }
}
