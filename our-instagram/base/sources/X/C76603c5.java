package X;

import java.util.List;

/* renamed from: X.3c5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C76603c5 implements InterfaceC76613c6 {
    public final C3XR A00;
    public final C3x9 A01;
    public final InterfaceC39541sb A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final List A07;
    public final List A08;
    public final List A09;

    @Override // X.InterfaceC76613c6
    public final List getCarouselMediaImmutable() {
        return this.A07;
    }

    @Override // X.InterfaceC76613c6
    public final C3x9 getClipsMetadata() {
        return this.A01;
    }

    @Override // X.InterfaceC76613c6
    public final List getCoauthorProducers() {
        return this.A08;
    }

    @Override // X.InterfaceC76613c6
    public final String getConnectionId() {
        return this.A03;
    }

    @Override // X.InterfaceC76613c6
    public final String getId() {
        return this.A04;
    }

    @Override // X.InterfaceC76613c6
    public final InterfaceC39541sb getInjected() {
        return this.A02;
    }

    @Override // X.InterfaceC76613c6
    public final String getLoggingInfoToken() {
        return this.A05;
    }

    @Override // X.InterfaceC76613c6
    public final String getMezqlToken() {
        return this.A06;
    }

    @Override // X.InterfaceC76613c6
    public final C3XR getMusicMetadata() {
        return this.A00;
    }

    @Override // X.InterfaceC76613c6
    public final List getSponsorTags() {
        return this.A09;
    }

    public C76603c5(C3XR c3xr, C3x9 c3x9, InterfaceC39541sb interfaceC39541sb, String str, String str2, String str3, String str4, List list, List list2, List list3) {
        this.A07 = list;
        this.A01 = c3x9;
        this.A08 = list2;
        this.A03 = str;
        this.A04 = str2;
        this.A02 = interfaceC39541sb;
        this.A05 = str3;
        this.A06 = str4;
        this.A00 = c3xr;
        this.A09 = list3;
    }
}
