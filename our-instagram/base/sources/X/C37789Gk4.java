package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Gk4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37789Gk4 implements InterfaceC116925Qy {
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0D;
    public final C1M6 A0E;
    public final C61412r4 A0F;
    public final String A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.3ry, java.lang.Object] */
    @Override // X.InterfaceC61432r6
    public final Map AUS(String str) {
        Map AUS;
        C14360o3.A0B(str, 0);
        long currentTimeMillis = System.currentTimeMillis();
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (this.A0K && (this.A0H || this.A0I)) {
            AbstractC37302Gc3.A1X(str, A1I, this.A0C);
            if (this.A0I) {
                AUS = AbstractC37302Gc3.A0k(str, this.A0A);
            }
            this.A0E.EIH(new Object(), this.A0G, str, AbstractC001800i.A0a(A1I.keySet()), AbstractC06930Yk.A0B(A1I), AbstractC37300Gc1.A00(currentTimeMillis));
            return A1I;
        }
        AbstractC37303Gc4.A1P(str, A1I, this.A09);
        A1I.putAll(AbstractC37302Gc3.A0k(str, this.A0A));
        AbstractC37303Gc4.A1P(str, A1I, this.A06);
        if (this.A0J) {
            AbstractC37303Gc4.A1P(str, A1I, this.A04);
        }
        AbstractC37303Gc4.A1P(str, A1I, this.A01);
        AbstractC37303Gc4.A1P(str, A1I, this.A05);
        AUS = ((InterfaceC61432r6) this.A00.getValue()).AUS(str);
        A1I.putAll(AUS);
        this.A0E.EIH(new Object(), this.A0G, str, AbstractC001800i.A0a(A1I.keySet()), AbstractC06930Yk.A0B(A1I), AbstractC37300Gc1.A00(currentTimeMillis));
        return A1I;
    }

    public C37789Gk4(C1M6 c1m6, C61412r4 c61412r4, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16820sZ interfaceC16820sZ4, InterfaceC16820sZ interfaceC16820sZ5, InterfaceC16820sZ interfaceC16820sZ6, InterfaceC16820sZ interfaceC16820sZ7, InterfaceC16820sZ interfaceC16820sZ8, InterfaceC16820sZ interfaceC16820sZ9, InterfaceC16820sZ interfaceC16820sZ10, InterfaceC16820sZ interfaceC16820sZ11, InterfaceC16820sZ interfaceC16820sZ12, InterfaceC16820sZ interfaceC16820sZ13, InterfaceC16820sZ interfaceC16820sZ14, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A0H = z;
        this.A0I = z2;
        this.A0K = z3;
        this.A0E = c1m6;
        this.A0G = str;
        this.A0J = z4;
        this.A0F = c61412r4;
        this.A0D = AbstractC37302Gc3.A0m(interfaceC16820sZ, 11);
        this.A09 = AbstractC37302Gc3.A0m(interfaceC16820sZ2, 7);
        this.A05 = AbstractC37302Gc3.A0m(interfaceC16820sZ10, 3);
        this.A00 = AbstractC09440dt.A01(new X32(interfaceC16820sZ11, 48));
        this.A0A = AbstractC37302Gc3.A0m(interfaceC16820sZ3, 8);
        this.A06 = AbstractC37302Gc3.A0m(interfaceC16820sZ4, 4);
        this.A04 = AbstractC37302Gc3.A0m(interfaceC16820sZ5, 2);
        this.A03 = AbstractC37302Gc3.A0m(interfaceC16820sZ6, 1);
        this.A02 = AbstractC37302Gc3.A0m(interfaceC16820sZ7, 0);
        this.A0B = AbstractC37302Gc3.A0m(interfaceC16820sZ8, 9);
        this.A01 = AbstractC09440dt.A01(new X32(interfaceC16820sZ9, 49));
        this.A0C = AbstractC37302Gc3.A0m(interfaceC16820sZ12, 10);
        this.A07 = AbstractC37302Gc3.A0m(interfaceC16820sZ13, 5);
        this.A08 = AbstractC37302Gc3.A0m(interfaceC16820sZ14, 6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.3ry, java.lang.Object] */
    @Override // X.InterfaceC116925Qy
    public final Map AUT(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        AbstractC37303Gc4.A1P(str, A1I, this.A0D);
        this.A0E.EIH(new Object(), this.A0G, str, AbstractC166987dD.A1J("xout"), AbstractC06930Yk.A0B(A1I), AbstractC37300Gc1.A00(currentTimeMillis));
        return A1I;
    }

    @Override // X.InterfaceC61432r6
    public final /* bridge */ /* synthetic */ void DVi(C6T6 c6t6, AnonymousClass317 anonymousClass317, Object obj, Object obj2) {
        InterfaceC09390do interfaceC09390do;
        AbstractC167027dH.A12(anonymousClass317, obj, obj2);
        C14360o3.A0B(c6t6, 3);
        switch (anonymousClass317.ordinal()) {
            case 0:
                interfaceC09390do = this.A02;
                break;
            case 1:
                interfaceC09390do = this.A03;
                break;
            case 2:
                interfaceC09390do = this.A04;
                break;
            case 5:
                interfaceC09390do = this.A06;
                break;
            case 7:
                interfaceC09390do = this.A09;
                break;
            case 11:
                interfaceC09390do = this.A0B;
                break;
            case 16:
                interfaceC09390do = this.A0D;
                break;
            case 26:
                interfaceC09390do = this.A00;
                break;
            case 27:
                interfaceC09390do = this.A05;
                break;
            case 28:
                interfaceC09390do = this.A01;
                break;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                interfaceC09390do = this.A07;
                break;
            case 30:
                interfaceC09390do = this.A08;
                break;
            default:
                throw AbstractC37303Gc4.A0M(anonymousClass317, "Wrong signal type in RealtimeSignalProviderImpl for Clips: ", AbstractC166987dD.A1C());
        }
        ((InterfaceC61432r6) interfaceC09390do.getValue()).DVi(c6t6, anonymousClass317, obj, obj2);
    }

    @Override // X.InterfaceC61432r6
    public final void FCF(EnumC74603Ws enumC74603Ws, Collection collection) {
        AbstractC167017dG.A1N(collection, enumC74603Ws);
        this.A0F.A00(enumC74603Ws, collection);
    }
}
