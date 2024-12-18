package X;

import java.util.Map;

/* renamed from: X.WZh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70500WZh implements XCB {
    public MYB A00;
    public int A01;
    public final W63 A02;
    public final C68232VIs A03;
    public final XCB A04;
    public final W62 A05;
    public final Integer A06;
    public final /* synthetic */ C70501WZi A07;

    @Override // X.XCB
    public final synchronized void D6j(String str, int i, Map map) {
        this.A04.D6j(str, i, map);
    }

    @Override // X.XCB
    public final synchronized void DGA(Exception exc, Map map, int i, boolean z) {
        if (z) {
            int i2 = this.A01;
            if (i2 < 5) {
                this.A01 = i2 + 1;
                int intValue = this.A06.intValue();
                if (intValue != 0) {
                    if (intValue != 1) {
                        XE8 xe8 = this.A07.A00;
                        C68232VIs c68232VIs = this.A03;
                        if (c68232VIs != null) {
                            xe8.ENL(c68232VIs, this);
                        } else {
                            throw AbstractC166997dE.A0g();
                        }
                    } else {
                        this.A07.A00.EOA(this.A02, this.A03, this, this.A05);
                    }
                } else {
                    this.A07.A00.EOS(this.A00, this);
                }
            }
        }
        this.A04.DGA(exc, map, i, z);
    }

    public C70500WZh(W63 w63, C68232VIs c68232VIs, XCB xcb, C70501WZi c70501WZi, W62 w62, Integer num) {
        this.A07 = c70501WZi;
        this.A06 = num;
        this.A04 = xcb;
        this.A03 = c68232VIs;
        this.A05 = w62;
        this.A02 = w63;
    }
}
