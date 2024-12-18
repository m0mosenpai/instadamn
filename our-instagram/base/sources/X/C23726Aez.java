package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: X.Aez, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23726Aez implements InterfaceC148316m1, Comparable {
    public long A00;
    public ImageUrl A01;
    public EnumC148326m2 A02;
    public C148276lx A03;
    public C148336m3 A04;

    @Override // X.InterfaceC148316m1
    public final boolean CLn() {
        return false;
    }

    public final ArrayList A00() {
        int ordinal = this.A02.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                StringBuilder A1C = AbstractC166987dD.A1C();
                int i = 0;
                while (true) {
                    C148336m3 c148336m3 = this.A04;
                    c148336m3.getClass();
                    if (i < c148336m3.A02.length()) {
                        A1C.append("\\u");
                        A1C.append(Integer.toHexString(this.A04.A02.charAt(i)));
                        i++;
                    } else {
                        ArrayList A1E = AbstractC166987dD.A1E();
                        AbstractC166997dE.A1S(A1C, A1E);
                        return A1E;
                    }
                }
            } else {
                throw AbstractC166987dD.A1D("Unknown recent item type.");
            }
        } else {
            C148276lx c148276lx = this.A03;
            c148276lx.getClass();
            return c148276lx.A01();
        }
    }

    @Override // X.InterfaceC148316m1
    public final C148336m3 B1F() {
        return this.A04;
    }

    @Override // X.InterfaceC148316m1
    public final C148276lx C0S() {
        return this.A03;
    }

    @Override // X.InterfaceC148316m1
    public final EnumC148326m2 CBc() {
        return this.A02;
    }

    @Override // X.InterfaceC148316m1
    public final ImageUrl CDO() {
        return this.A01;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return -Long.signum(this.A00 - ((C23726Aez) obj).A00);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C23726Aez) {
            C23726Aez c23726Aez = (C23726Aez) obj;
            if (AbstractC50102Ry.A00(c23726Aez.A00(), A00()) && AbstractC50102Ry.A00(c23726Aez.A01, this.A01)) {
                return true;
            }
        }
        return false;
    }

    public C23726Aez(C148336m3 c148336m3, long j) {
        this.A02 = EnumC148326m2.A04;
        this.A01 = new SimpleImageUrl(C168157fA.A00(c148336m3.A01, c148336m3.A02));
        this.A04 = c148336m3;
        this.A00 = j;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{A00(), this.A01});
    }

    public C23726Aez() {
    }
}
