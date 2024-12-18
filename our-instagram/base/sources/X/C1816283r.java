package X;

import com.instagram.user.model.User;

/* renamed from: X.83r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1816283r {
    public EnumC189548aZ A00;
    public final A7D A01;
    public final EnumC209589Ot A02;
    public final C38321qM A03;
    public final C38321qM A04;
    public final User A05;

    public C1816283r(A7D a7d, EnumC189548aZ enumC189548aZ, C38321qM c38321qM, User user) {
        EnumC209589Ot enumC209589Ot;
        this.A04 = c38321qM;
        this.A05 = user;
        this.A01 = a7d;
        if (c38321qM.A63()) {
            enumC209589Ot = EnumC209589Ot.A05;
        } else {
            if (!c38321qM.A5P() && !c38321qM.A5b() && !c38321qM.A5g()) {
                throw new IllegalArgumentException(AnonymousClass001.A0S("Unsupported media type ", c38321qM.A3A(), '!'));
            }
            enumC209589Ot = EnumC209589Ot.A04;
        }
        this.A02 = enumC209589Ot;
        this.A03 = c38321qM;
        this.A00 = enumC189548aZ;
    }
}
