package X;

import android.os.Handler;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/* renamed from: X.XoX, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72838XoX {
    public C129235sl A00;
    public C129165sd A01;
    public final Handler A02;
    public final C172097le A03;
    public final Y0D A04;
    public final C172117lg A05;
    public final C0JO A06;
    public final List A07;
    public final Queue A08;

    public C72838XoX(C172097le c172097le, Y0D y0d, C172117lg c172117lg, C0JO c0jo) {
        C14360o3.A0B(c172097le, 2);
        this.A06 = c0jo;
        this.A03 = c172097le;
        this.A05 = c172117lg;
        this.A04 = y0d;
        this.A02 = AbstractC167007dF.A0J();
        this.A08 = new LinkedList();
        this.A07 = new LinkedList();
    }

    public final void A00() {
        this.A07.clear();
        this.A08.clear();
        this.A02.removeCallbacksAndMessages(null);
    }
}
