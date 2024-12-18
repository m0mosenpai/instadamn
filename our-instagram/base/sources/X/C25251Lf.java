package X;

/* renamed from: X.1Lf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C25251Lf implements InterfaceC25271Lh {
    private final boolean A00() {
        Boolean bool;
        try {
            bool = Boolean.valueOf(C18U.A06(C06090Tz.A05, C023409i.A0A.A08(this), 36327481929775718L));
        } catch (IllegalStateException unused) {
            bool = false;
        }
        C14360o3.A0A(bool);
        return bool.booleanValue() || C1AD.A06(C06090Tz.A05, 18311026131088447L);
    }

    private final boolean A01() {
        Boolean bool;
        try {
            bool = Boolean.valueOf(C18U.A06(C06090Tz.A05, C023409i.A0A.A08(this), 36327481929841255L));
        } catch (IllegalStateException unused) {
            bool = false;
        }
        C14360o3.A0A(bool);
        return bool.booleanValue() || C1AD.A06(C06090Tz.A05, 18311026131153984L);
    }

    private final boolean A02() {
        Boolean bool;
        try {
            bool = Boolean.valueOf(C18U.A06(C06090Tz.A05, C023409i.A0A.A08(this), 36327481929906792L));
        } catch (IllegalStateException unused) {
            bool = false;
        }
        C14360o3.A0A(bool);
        return bool.booleanValue() || C1AD.A06(C06090Tz.A05, 18311026131285057L);
    }

    @Override // X.InterfaceC25271Lh
    public final EnumC191908em C73() {
        if (A02()) {
            return EnumC191908em.A09;
        }
        if (A01()) {
            return EnumC191908em.A08;
        }
        if (A00()) {
            return EnumC191908em.A07;
        }
        if (C1AD.A06(C06090Tz.A06, 2324146467612464776L)) {
            return EnumC191908em.A05;
        }
        return EnumC191908em.A04;
    }

    @Override // X.InterfaceC25271Lh
    public final boolean EpO() {
        if (!A02() && !A01() && !A00() && !C1AD.A06(C06090Tz.A06, 18311026130891838L)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC25271Lh
    public final boolean EpP() {
        if (!A02() && !A01() && !A00()) {
            return false;
        }
        return true;
    }
}
