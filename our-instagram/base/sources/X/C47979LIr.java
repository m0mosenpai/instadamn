package X;

import java.util.Map;

/* renamed from: X.LIr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47979LIr {
    public static final InterfaceC09390do A0A = AbstractC09440dt.A00(EnumC09460dv.A02, C57467Pf3.A00);
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;

    public C47979LIr(InterfaceC09390do interfaceC09390do, InterfaceC09390do interfaceC09390do2, InterfaceC09390do interfaceC09390do3, InterfaceC09390do interfaceC09390do4, InterfaceC09390do interfaceC09390do5, InterfaceC09390do interfaceC09390do6, InterfaceC09390do interfaceC09390do7, InterfaceC09390do interfaceC09390do8, InterfaceC09390do interfaceC09390do9, InterfaceC09390do interfaceC09390do10) {
        C14360o3.A0B(interfaceC09390do, 1);
        AbstractC25234BEr.A1R(interfaceC09390do2, interfaceC09390do3, interfaceC09390do4, interfaceC09390do5, interfaceC09390do6);
        AbstractC25233BEq.A0y(7, interfaceC09390do7, interfaceC09390do8, interfaceC09390do9);
        C14360o3.A0B(interfaceC09390do10, 10);
        this.A02 = interfaceC09390do;
        this.A09 = interfaceC09390do2;
        this.A05 = interfaceC09390do3;
        this.A01 = interfaceC09390do4;
        this.A03 = interfaceC09390do5;
        this.A07 = interfaceC09390do6;
        this.A08 = interfaceC09390do7;
        this.A00 = interfaceC09390do8;
        this.A04 = interfaceC09390do9;
        this.A06 = interfaceC09390do10;
    }

    public final C26082BgB A00(EnumC72392Xce enumC72392Xce) {
        C14360o3.A0B(enumC72392Xce, 0);
        C26082BgB c26082BgB = (C26082BgB) ((Map) this.A09.getValue()).get(enumC72392Xce);
        if (c26082BgB != null) {
            return c26082BgB;
        }
        throw AbstractC37303Gc4.A0M(enumC72392Xce, "No section model found for ID ", AbstractC166987dD.A1C());
    }

    public final C51579MqX A01(EnumC72393Xcf enumC72393Xcf) {
        C14360o3.A0B(enumC72393Xcf, 0);
        C51579MqX c51579MqX = (C51579MqX) ((Map) this.A01.getValue()).get(enumC72393Xcf);
        if (c51579MqX == null && (c51579MqX = (C51579MqX) ((Map) this.A03.getValue()).get(enumC72393Xcf)) == null) {
            throw AbstractC37303Gc4.A0M(enumC72393Xcf, "No navigation row model found for ID ", AbstractC166987dD.A1C());
        }
        return c51579MqX;
    }

    public C47979LIr() {
        this(AbstractC09440dt.A01(MH6.A00), AbstractC09440dt.A01(MH7.A00), AbstractC09440dt.A01(MH8.A00), AbstractC09440dt.A01(MH9.A00), AbstractC09440dt.A01(MHA.A00), AbstractC09440dt.A01(MHB.A00), AbstractC09440dt.A01(MHC.A00), AbstractC09440dt.A01(MHD.A00), AbstractC09440dt.A01(MHE.A00), AbstractC09440dt.A01(MH5.A00));
    }
}
