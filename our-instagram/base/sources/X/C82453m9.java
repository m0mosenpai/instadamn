package X;

import java.util.List;

/* renamed from: X.3m9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C82453m9 implements InterfaceC82463mA {
    public final InterfaceC82433m7 A00;
    public final Integer A01;
    public final float A02;
    public final long A03;
    public final Integer A04;
    public final String A05;
    public final List A06;
    public final boolean A07;
    public final boolean A08;

    public C82453m9(InterfaceC82433m7 interfaceC82433m7, Integer num, Integer num2, String str, List list, float f, long j, boolean z, boolean z2) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(num, 3);
        C14360o3.A0B(list, 7);
        this.A05 = str;
        this.A04 = num;
        this.A03 = j;
        this.A01 = num2;
        this.A00 = interfaceC82433m7;
        this.A06 = list;
        this.A08 = z;
        this.A07 = z2;
        this.A02 = f;
    }

    @Override // X.InterfaceC82463mA
    public final List Avb() {
        return this.A06;
    }

    @Override // X.InterfaceC82463mA
    public final /* bridge */ /* synthetic */ InterfaceC82423m6 B3h() {
        return this.A00;
    }

    @Override // X.InterfaceC82463mA
    public final boolean B7r() {
        return this.A07;
    }

    @Override // X.InterfaceC82463mA
    public final String BK3() {
        return this.A05;
    }

    @Override // X.InterfaceC82463mA
    public final boolean BWW() {
        return this.A08;
    }

    @Override // X.InterfaceC82463mA
    public final String BZh() {
        return null;
    }

    @Override // X.InterfaceC82463mA
    public final float BcM() {
        return this.A02;
    }

    @Override // X.InterfaceC82463mA
    public final Integer C0M() {
        return this.A04;
    }

    @Override // X.InterfaceC82463mA
    public final long C8K() {
        return this.A03;
    }
}
