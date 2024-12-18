package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1PZ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1PZ {
    public static final C1PZ A0K = new C1PZ(C05F.A0C);
    public int A07;
    public int A08;
    public Integer A0C;
    public boolean A0G;
    public boolean A0H;
    public final List A0J = new ArrayList();
    public int A09 = -1;
    public int A01 = -1;
    public int A0A = -1;
    public int A04 = -1;
    public int A03 = -1;
    public int A02 = -1;
    public double A00 = -1.0d;
    public String A0D = "";
    public int A05 = -1;
    public final List A0I = new ArrayList();
    public Integer A0B = C05F.A1F;
    public String A0F = "";
    public int A06 = -1;
    public String A0E = "";

    public final void A01(String str) {
        C14360o3.A0B(str, 0);
        this.A0J.add(str);
    }

    public final List A00() {
        List unmodifiableList = Collections.unmodifiableList(this.A0J);
        C14360o3.A07(unmodifiableList);
        return unmodifiableList;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InjectionStatus{reasons=");
        sb.append(this.A0J);
        sb.append(", subReason=");
        sb.append(this.A0F);
        sb.append(", type=");
        sb.append(A2Q.A00(this.A0C));
        sb.append(", reelGapToLastAd=");
        sb.append(this.A09);
        sb.append(", adConsumedMediaGap=");
        sb.append(this.A01);
        sb.append(", reelGapToLastNetego=");
        sb.append(this.A0A);
        sb.append(", netegoConsumedMediaGap=");
        sb.append(this.A04);
        sb.append(", insertPosition=");
        sb.append(this.A03);
        sb.append(", currentPosition=");
        sb.append(this.A02);
        sb.append(", elapsedTime=");
        sb.append(this.A00);
        sb.append(", decisionTriggeringMediaId='");
        sb.append(this.A0D);
        sb.append("', isInjectionMeasurementEnabled=");
        sb.append(this.A0G);
        sb.append(", mediasSinceLastAd=");
        sb.append(this.A05);
        sb.append(", isPushUp=");
        sb.append(this.A0H);
        sb.append(", surroundingMediaIds=");
        sb.append(this.A0I);
        sb.append(", failureReason=");
        sb.append(AbstractC72647Xjd.A00(this.A0B));
        sb.append('}');
        return sb.toString();
    }

    public C1PZ(Integer num) {
        this.A0C = num;
    }
}
