package X;

import java.util.List;

/* renamed from: X.GlU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37875GlU implements InterfaceC82463mA {
    public final /* synthetic */ float A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ InterfaceC82423m6 A02;
    public final /* synthetic */ C37868GlN A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ String A05;

    @Override // X.InterfaceC82463mA
    public final boolean B7r() {
        return true;
    }

    public C37875GlU(InterfaceC82423m6 interfaceC82423m6, C37868GlN c37868GlN, Integer num, String str, float f, long j) {
        this.A05 = str;
        this.A04 = num;
        this.A01 = j;
        this.A00 = f;
        this.A02 = interfaceC82423m6;
        this.A03 = c37868GlN;
    }

    @Override // X.InterfaceC82463mA
    public final List Avb() {
        return C16930sl.A00;
    }

    @Override // X.InterfaceC82463mA
    public final InterfaceC82423m6 B3h() {
        return this.A02;
    }

    @Override // X.InterfaceC82463mA
    public final String BK3() {
        return this.A05;
    }

    @Override // X.InterfaceC82463mA
    public final boolean BWW() {
        return false;
    }

    @Override // X.InterfaceC82463mA
    public final String BZh() {
        return this.A03.A05;
    }

    @Override // X.InterfaceC82463mA
    public final float BcM() {
        return this.A00;
    }

    @Override // X.InterfaceC82463mA
    public final Integer C0M() {
        return this.A04;
    }

    @Override // X.InterfaceC82463mA
    public final long C8K() {
        return this.A01;
    }
}
