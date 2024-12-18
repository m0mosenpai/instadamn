package X;

import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes11.dex */
public final class WXh implements C2W2 {
    public final C136336Fm A00;
    public final C102934kU A01;
    public final C102884kP A02;
    public final C102884kP A03;
    public final C1339162z A04;
    public final List A05;
    public final Map A06;
    public final AtomicBoolean A07;

    @Override // X.C2W2
    public final /* synthetic */ C2W5 AF9(C78473fD c78473fD, long j) {
        return AbstractC135286Ad.A00(c78473fD, this, j);
    }

    @Override // X.C2W2
    public final C2W5 AF8(C78473fD c78473fD, int i, int i2) {
        C2W5 AF8 = ((C102884kP) ((C6AY) this.A01.A00()).A00).AF8(c78473fD, i, i2);
        C14360o3.A07(AF8);
        return AF8;
    }

    public WXh(C136336Fm c136336Fm, C102884kP c102884kP, C1339162z c1339162z, List list, C09530e4 c09530e4) {
        C102884kP c102884kP2;
        Map A0E;
        C68965Vf3 c68965Vf3;
        this.A00 = c136336Fm;
        this.A02 = c102884kP;
        this.A04 = c1339162z;
        this.A05 = c09530e4 != null ? AbstractC001800i.A0S(list, ((C68965Vf3) c09530e4.A01).A00) : list;
        if (c09530e4 != null) {
            c102884kP2 = (C102884kP) c09530e4.A00;
        } else {
            c102884kP2 = null;
        }
        this.A03 = c102884kP2;
        if (c09530e4 != null && (c68965Vf3 = (C68965Vf3) c09530e4.A01) != null) {
            A0E = c68965Vf3.A01;
        } else {
            A0E = AbstractC06930Yk.A0E();
        }
        this.A06 = A0E;
        this.A07 = AbstractC166997dE.A17();
        this.A01 = new C102934kU(new C70687Wf8(this));
    }
}
