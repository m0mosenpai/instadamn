package X;

import com.instagram.user.model.User;

/* renamed from: X.3Cr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C70073Cr implements InterfaceC41141vN {
    public final User A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public C70073Cr(User user, boolean z, boolean z2, boolean z3) {
        this.A00 = user;
        this.A03 = true;
        this.A01 = false;
        this.A02 = true;
    }

    public C70073Cr(User user, boolean z) {
        this.A00 = user;
        this.A03 = z;
        this.A01 = false;
        this.A02 = false;
    }

    public C70073Cr(User user) {
        this.A00 = user;
        this.A03 = true;
        this.A01 = true;
        this.A02 = false;
    }
}
