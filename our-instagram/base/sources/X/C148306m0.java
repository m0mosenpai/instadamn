package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.util.Arrays;

/* renamed from: X.6m0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C148306m0 implements InterfaceC148316m1 {
    public final C148276lx A00;
    public final ImageUrl A01;
    public final EnumC148326m2 A02;
    public final C148336m3 A03;

    public C148306m0(C148336m3 c148336m3) {
        C14360o3.A0B(c148336m3, 1);
        this.A02 = EnumC148326m2.A04;
        this.A03 = c148336m3;
        this.A00 = null;
        this.A01 = new SimpleImageUrl(C168157fA.A00(c148336m3.A01, c148336m3.A02));
    }

    @Override // X.InterfaceC148316m1
    public final C148336m3 B1F() {
        return this.A03;
    }

    @Override // X.InterfaceC148316m1
    public final C148276lx C0S() {
        return this.A00;
    }

    @Override // X.InterfaceC148316m1
    public final EnumC148326m2 CBc() {
        return this.A02;
    }

    @Override // X.InterfaceC148316m1
    public final ImageUrl CDO() {
        return this.A01;
    }

    @Override // X.InterfaceC148316m1
    public final boolean CLn() {
        C148336m3 c148336m3 = this.A03;
        if (c148336m3 != null && AbstractC170297ii.A00(c148336m3)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof X.InterfaceC148316m1
            r2 = 0
            if (r0 == 0) goto L32
            r0 = 1
            if (r4 != r3) goto L9
            return r0
        L9:
            X.6m2 r1 = r3.A02
            X.6m2 r0 = X.EnumC148326m2.A04
            if (r1 != r0) goto L21
            X.6m3 r1 = r3.A03
            if (r1 == 0) goto L32
            X.6m1 r4 = (X.InterfaceC148316m1) r4
            X.6m3 r0 = r4.B1F()
        L19:
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L32
            r2 = 1
            return r2
        L21:
            X.6lx r1 = r3.A00
            if (r1 == 0) goto L32
            X.6m1 r4 = (X.InterfaceC148316m1) r4
            X.6lx r0 = r4.C0S()
            if (r0 == 0) goto L32
            java.lang.String r1 = r1.A0Z
            java.lang.String r0 = r0.A0Z
            goto L19
        L32:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C148306m0.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        Object obj;
        EnumC148326m2 enumC148326m2 = this.A02;
        if (enumC148326m2 == EnumC148326m2.A04) {
            obj = this.A03;
        } else {
            C148276lx c148276lx = this.A00;
            if (c148276lx != null) {
                obj = c148276lx.A0Z;
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        return Arrays.hashCode(new Object[]{enumC148326m2, obj});
    }

    public C148306m0(C148276lx c148276lx) {
        C14360o3.A0B(c148276lx, 1);
        this.A02 = EnumC148326m2.A06;
        this.A03 = null;
        this.A00 = c148276lx;
        this.A01 = ((C148286ly) c148276lx.A0O.get(0)).A0H;
    }

    public C148306m0() {
        this.A02 = EnumC148326m2.A05;
        this.A03 = null;
        this.A00 = null;
        this.A01 = null;
    }
}
