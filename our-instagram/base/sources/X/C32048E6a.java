package X;

import com.instagram.user.model.User;
import java.util.HashMap;

/* renamed from: X.E6a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32048E6a extends C0T6 {
    public final E6X A00;
    public final InterfaceC37236Gal A01;
    public final User A02;
    public final Boolean A03;
    public final Boolean A04;
    public final Integer A05;
    public final Long A06;
    public final String A07;
    public final String A08;
    public final HashMap A09;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32048E6a) {
                C32048E6a c32048E6a = (C32048E6a) obj;
                if (!C14360o3.A0K(this.A05, c32048E6a.A05) || !C14360o3.A0K(this.A03, c32048E6a.A03) || !C14360o3.A0K(this.A04, c32048E6a.A04) || !C14360o3.A0K(this.A07, c32048E6a.A07) || !C14360o3.A0K(this.A00, c32048E6a.A00) || !C14360o3.A0K(this.A09, c32048E6a.A09) || !C14360o3.A0K(this.A01, c32048E6a.A01) || !C14360o3.A0K(this.A06, c32048E6a.A06) || !C14360o3.A0K(this.A02, c32048E6a.A02) || !C14360o3.A0K(this.A08, c32048E6a.A08)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((((((AbstractC167017dG.A0M(this.A05) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A09)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC25227BEk.A07(this.A08);
    }

    public C32048E6a(E6X e6x, InterfaceC37236Gal interfaceC37236Gal, User user, Boolean bool, Boolean bool2, Integer num, Long l, String str, String str2, HashMap hashMap) {
        this.A05 = num;
        this.A03 = bool;
        this.A04 = bool2;
        this.A07 = str;
        this.A00 = e6x;
        this.A09 = hashMap;
        this.A01 = interfaceC37236Gal;
        this.A06 = l;
        this.A02 = user;
        this.A08 = str2;
    }
}
