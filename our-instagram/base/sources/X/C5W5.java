package X;

import com.facebook.common.dextricks.DexOptimizationMessageHandler;
import java.util.List;
import org.webrtc.ScreenCapturerAndroid;

/* renamed from: X.5W5, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5W5 implements Comparable {
    public static final C5W5 A01;
    public static final C5W5 A02;
    public static final C5W5 A03;
    public static final C5W5 A04;
    public static final C5W5 A05;
    public static final C5W5 A06;
    public static final C5W5 A07;
    public static final C5W5 A08;
    public static final C5W5 A09;
    public static final C5W5 A0A;
    public static final C5W5 A0B;
    public static final C5W5 A0C;
    public static final C5W5 A0D;
    public static final C5W5 A0E;
    public static final C5W5 A0F;
    public static final C5W5 A0G;
    public static final C5W5 A0H;
    public static final C5W5 A0I;
    public static final List A0J;
    public final int A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C5W5) && this.A00 == ((C5W5) obj).A00);
    }

    static {
        C5W5 c5w5 = new C5W5(100);
        A0B = c5w5;
        C5W5 c5w52 = new C5W5(200);
        A0C = c5w52;
        C5W5 c5w53 = new C5W5(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
        A0D = c5w53;
        C5W5 c5w54 = new C5W5(ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI);
        A0E = c5w54;
        C5W5 c5w55 = new C5W5(500);
        A0F = c5w55;
        C5W5 c5w56 = new C5W5(600);
        A06 = c5w56;
        C5W5 c5w57 = new C5W5(700);
        A0G = c5w57;
        C5W5 c5w58 = new C5W5(800);
        A0H = c5w58;
        C5W5 c5w59 = new C5W5(900);
        A0I = c5w59;
        A0A = c5w5;
        A08 = c5w52;
        A09 = c5w53;
        A04 = c5w54;
        A03 = c5w55;
        A05 = c5w56;
        A01 = c5w57;
        A02 = c5w58;
        A07 = c5w59;
        A0J = AbstractC16960so.A1Q(c5w5, c5w52, c5w53, c5w54, c5w55, c5w56, c5w57, c5w58, c5w59);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return C14360o3.A00(this.A00, ((C5W5) obj).A00);
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        return AnonymousClass001.A0I("FontWeight(weight=", ')', this.A00);
    }

    public C5W5(int i) {
        this.A00 = i;
        if (1 <= i && i < 1001) {
        } else {
            throw new IllegalArgumentException(AnonymousClass001.A0O("Font weight can be in range [1, 1000]. Current value: ", i));
        }
    }
}
