package X;

import com.facebook.forker.Process;

/* renamed from: X.5uq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C130455uq {
    public C125475lt A00;
    public C130485ut A01;
    public EnumC130465ur A02;

    public C130455uq() {
        EnumC130465ur enumC130465ur = EnumC130465ur.A06;
        this.A01 = null;
        this.A00 = null;
        this.A02 = enumC130465ur;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final C38321qM A00() {
        C130505uv c130505uv;
        switch (this.A02.ordinal()) {
            case 2:
            case 6:
            case 7:
                C130485ut c130485ut = this.A01;
                C14360o3.A0A(c130485ut);
                C9BH c9bh = c130485ut.A00;
                if (c9bh != null) {
                    return (C38321qM) c9bh.A00;
                }
                return null;
            case 14:
            case Process.SIGTERM /* 15 */:
                C130485ut c130485ut2 = this.A01;
                C14360o3.A0A(c130485ut2);
                c130505uv = c130485ut2.A08;
                break;
            case 16:
            case 17:
                C130485ut c130485ut3 = this.A01;
                C14360o3.A0A(c130485ut3);
                c130505uv = c130485ut3.A04;
                break;
            default:
                return null;
        }
        if (c130505uv != null) {
            return c130505uv.A0B;
        }
        return null;
    }
}
