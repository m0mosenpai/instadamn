package X;

import com.instagram.model.reels.Reel;
import java.util.Map;

/* loaded from: classes9.dex */
public final class PU0 implements Runnable {
    public final /* synthetic */ Reel A00;
    public final /* synthetic */ C81953lF A01;
    public final /* synthetic */ C3G7 A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Map A05;
    public final /* synthetic */ Map A06;
    public final /* synthetic */ Map A07;
    public final /* synthetic */ Map A08;
    public final /* synthetic */ java.util.Set A09;
    public final /* synthetic */ java.util.Set A0A;
    public final /* synthetic */ java.util.Set A0B;
    public final /* synthetic */ boolean A0C;

    public PU0(Reel reel, C81953lF c81953lF, C3G7 c3g7, String str, String str2, Map map, Map map2, Map map3, Map map4, java.util.Set set, java.util.Set set2, java.util.Set set3, boolean z) {
        this.A02 = c3g7;
        this.A00 = reel;
        this.A01 = c81953lF;
        this.A04 = str;
        this.A03 = str2;
        this.A07 = map;
        this.A0B = set;
        this.A08 = map2;
        this.A0A = set2;
        this.A06 = map3;
        this.A09 = set3;
        this.A05 = map4;
        this.A0C = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3G7 c3g7 = this.A02;
        Reel reel = this.A00;
        C81953lF c81953lF = this.A01;
        String str = this.A04;
        String str2 = this.A03;
        Map map = this.A07;
        java.util.Set set = this.A0B;
        Map map2 = this.A08;
        java.util.Set set2 = this.A0A;
        C3G7.A01(reel, c81953lF, c3g7, str, str2, map, map2, this.A06, this.A05, set, set2, this.A09, this.A0C);
    }
}
