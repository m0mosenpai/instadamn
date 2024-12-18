package X;

import java.util.List;

/* renamed from: X.VsW, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69629VsW {
    public int A00;
    public C69723VuI A01;
    public List A02;
    public final float A03;
    public final int A04;
    public final int A05;
    public final List A06;

    public C69629VsW(List list, float f, int i, int i2) {
        C14360o3.A0B(list, 1);
        this.A06 = list;
        this.A04 = i;
        this.A05 = i2;
        this.A03 = f;
        this.A02 = C16930sl.A00;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BarViewModel(segments=");
        sb.append(this.A06);
        sb.append(MSV.A00(286));
        sb.append(this.A04);
        sb.append(", barHeight=");
        sb.append(this.A05);
        sb.append(", enableAnimations=");
        return AbstractC25236BEt.A0a(sb, false);
    }
}
