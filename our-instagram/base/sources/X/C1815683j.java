package X;

import java.util.List;

/* renamed from: X.83j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1815683j {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final C101394gx A06;
    public final boolean A07;

    public C1815683j(C38321qM c38321qM) {
        List A3w = c38321qM.A3w(EnumC75383a5.A0x);
        if (A3w != null) {
            C84823qW c84823qW = (C84823qW) AbstractC001800i.A0J(A3w);
            if (c84823qW != null) {
                C101394gx A0D = c84823qW.A0D();
                if (A0D != null) {
                    this.A06 = A0D;
                    this.A04 = c84823qW.A03;
                    this.A05 = c84823qW.A04;
                    this.A03 = c84823qW.A02;
                    this.A00 = c84823qW.A00;
                    this.A01 = c84823qW.A01;
                    this.A02 = c38321qM.A0m();
                    this.A07 = c84823qW.A1s;
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("pollInteractive must not be null");
        }
        throw new IllegalStateException("List of polling ReelInteractives from media must not be null");
    }
}
