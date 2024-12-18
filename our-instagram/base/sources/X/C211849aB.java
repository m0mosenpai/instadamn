package X;

/* renamed from: X.9aB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C211849aB extends C0T6 implements InterfaceC41141vN {
    public final Integer A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C211849aB) && this.A00 == ((C211849aB) obj).A00);
    }

    public final int hashCode() {
        String str;
        Integer num = this.A00;
        if (num == null) {
            return 0;
        }
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                str = "SHARE_ONCE";
                break;
            case 2:
                str = "DISMISS";
                break;
            default:
                str = "AUTO_XPOST";
                break;
        }
        return str.hashCode() + intValue;
    }

    public final String toString() {
        String str;
        Integer num = this.A00;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str = "SHARE_ONCE";
                    break;
                case 2:
                    str = "DISMISS";
                    break;
                default:
                    str = "AUTO_XPOST";
                    break;
            }
        } else {
            str = "null";
        }
        return AnonymousClass001.A0S("UserActionAfterLinkingBloksUpsellEvent(eventType=", str, ')');
    }

    public C211849aB(Integer num) {
        this.A00 = num;
    }
}
