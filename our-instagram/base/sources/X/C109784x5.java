package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.4x5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C109784x5 extends C0T6 implements InterfaceC109794x6 {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public C109784x5(String str, String str2, String str3, String str4, String str5) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        C14360o3.A0B(str3, 3);
        C14360o3.A0B(str4, 4);
        C14360o3.A0B(str5, 5);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A04 = str5;
    }

    @Override // X.InterfaceC109794x6
    public final C109784x5 Ew1() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C109784x5) {
                C109784x5 c109784x5 = (C109784x5) obj;
                if (!C14360o3.A0K(this.A00, c109784x5.A00) || !C14360o3.A0K(this.A01, c109784x5.A01) || !C14360o3.A0K(this.A02, c109784x5.A02) || !C14360o3.A0K(this.A03, c109784x5.A03) || !C14360o3.A0K(this.A04, c109784x5.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((this.A00.hashCode() * 31) + this.A01.hashCode()) * 31) + this.A02.hashCode()) * 31) + this.A03.hashCode()) * 31) + this.A04.hashCode();
    }

    @Override // X.InterfaceC109794x6
    public final String BgZ() {
        return this.A01;
    }

    @Override // X.InterfaceC109794x6
    public final String Bga() {
        return this.A02;
    }

    @Override // X.InterfaceC109794x6
    public final String Bgb() {
        return this.A03;
    }

    @Override // X.InterfaceC109794x6
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTLiveUserPayConsumptionSheetConfig", AbstractC53780NqW.A00(this));
    }

    @Override // X.InterfaceC109794x6
    public final String getDescription() {
        return this.A00;
    }

    @Override // X.InterfaceC109794x6
    public final String getTitle() {
        return this.A04;
    }
}
