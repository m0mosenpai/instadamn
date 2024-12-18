package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.4x7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C109804x7 extends C0T6 implements InterfaceC109814x8 {
    public final long A00;
    public final long A01;
    public final long A02;
    public final C109784x5 A03;
    public final InterfaceC109764x3 A04;
    public final List A05;

    public C109804x7(C109784x5 c109784x5, InterfaceC109764x3 interfaceC109764x3, List list, long j, long j2, long j3) {
        C14360o3.A0B(c109784x5, 1);
        C14360o3.A0B(interfaceC109764x3, 5);
        C14360o3.A0B(list, 6);
        this.A03 = c109784x5;
        this.A00 = j;
        this.A01 = j2;
        this.A02 = j3;
        this.A04 = interfaceC109764x3;
        this.A05 = list;
    }

    @Override // X.InterfaceC109814x8
    public final C109804x7 Ew5() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C109804x7) {
                C109804x7 c109804x7 = (C109804x7) obj;
                if (!C14360o3.A0K(this.A03, c109804x7.A03) || this.A00 != c109804x7.A00 || this.A01 != c109804x7.A01 || this.A02 != c109804x7.A02 || !C14360o3.A0K(this.A04, c109804x7.A04) || !C14360o3.A0K(this.A05, c109804x7.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC109814x8
    public final /* bridge */ /* synthetic */ InterfaceC109794x6 AqY() {
        return this.A03;
    }

    @Override // X.InterfaceC109814x8
    public final long AxP() {
        return this.A00;
    }

    @Override // X.InterfaceC109814x8
    public final long AxQ() {
        return this.A01;
    }

    @Override // X.InterfaceC109814x8
    public final long Bbi() {
        return this.A02;
    }

    @Override // X.InterfaceC109814x8
    public final InterfaceC109764x3 BdK() {
        return this.A04;
    }

    @Override // X.InterfaceC109814x8
    public final List C8H() {
        return this.A05;
    }

    @Override // X.InterfaceC109814x8
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTLiveUserPayViewerPayConfig", AbstractC53784Nqa.A00(this));
    }

    public final int hashCode() {
        int hashCode = this.A03.hashCode() * 31;
        long j = this.A00;
        int i = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.A01;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.A02;
        return ((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.A04.hashCode()) * 31) + this.A05.hashCode();
    }
}
