package X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: X.Aey, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23725Aey implements InterfaceC148316m1 {
    public ImageUrl A00;
    public EnumC148326m2 A01;
    public C148276lx A02;

    @Override // X.InterfaceC148316m1
    public final boolean CLn() {
        return false;
    }

    public final ArrayList A00() {
        int ordinal = this.A01.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                Object obj = null;
                obj.getClass();
                throw C00O.createAndThrow();
            }
            throw AbstractC166987dD.A1D("Unknown boostable item type.");
        }
        C148276lx c148276lx = this.A02;
        c148276lx.getClass();
        return c148276lx.A01();
    }

    @Override // X.InterfaceC148316m1
    public final C148336m3 B1F() {
        return null;
    }

    @Override // X.InterfaceC148316m1
    public final C148276lx C0S() {
        return this.A02;
    }

    @Override // X.InterfaceC148316m1
    public final EnumC148326m2 CBc() {
        return this.A01;
    }

    @Override // X.InterfaceC148316m1
    public final ImageUrl CDO() {
        return this.A00;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C23725Aey) {
            C23725Aey c23725Aey = (C23725Aey) obj;
            if (AbstractC50102Ry.A00(c23725Aey.A00(), A00()) && AbstractC50102Ry.A00(c23725Aey.A00, this.A00)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{A00(), this.A00});
    }
}
