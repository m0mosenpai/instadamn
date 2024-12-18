package X;

import java.util.HashMap;
import java.util.List;

/* renamed from: X.GkY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37818GkY extends AbstractC39653Hii {
    public final int A00;
    public final InterfaceC124295jj A01;
    public final Long A02;
    public final Long A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final HashMap A07;
    public final List A08;
    public final List A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;

    public C37818GkY(InterfaceC124295jj interfaceC124295jj, Long l, Long l2, String str, String str2, String str3, HashMap hashMap, List list, List list2, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        C14360o3.A0B(list, 2);
        this.A01 = interfaceC124295jj;
        this.A09 = list;
        this.A00 = i;
        this.A0D = z;
        this.A0G = z2;
        this.A0F = z3;
        this.A0I = z4;
        this.A0E = z5;
        this.A0H = z6;
        this.A0B = z7;
        this.A05 = str;
        this.A06 = str2;
        this.A07 = hashMap;
        this.A08 = list2;
        this.A04 = str3;
        this.A02 = l;
        this.A03 = l2;
        this.A0A = z8;
        this.A0C = AbstractC167007dF.A1N(i);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C37818GkY) {
                C37818GkY c37818GkY = (C37818GkY) obj;
                if (!C14360o3.A0K(this.A01, c37818GkY.A01) || !C14360o3.A0K(this.A09, c37818GkY.A09) || this.A00 != c37818GkY.A00 || this.A0D != c37818GkY.A0D || this.A0G != c37818GkY.A0G || this.A0F != c37818GkY.A0F || this.A0I != c37818GkY.A0I || this.A0E != c37818GkY.A0E || this.A0H != c37818GkY.A0H || this.A0B != c37818GkY.A0B || !C14360o3.A0K(this.A05, c37818GkY.A05) || !C14360o3.A0K(this.A06, c37818GkY.A06) || !C14360o3.A0K(this.A07, c37818GkY.A07) || !C14360o3.A0K(this.A08, c37818GkY.A08) || !C14360o3.A0K(this.A04, c37818GkY.A04) || !C14360o3.A0K(this.A02, c37818GkY.A02) || !C14360o3.A0K(this.A03, c37818GkY.A03) || this.A0A != c37818GkY.A0A) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A0A, (((((((((((((AbstractC167007dF.A0D(this.A0B, AbstractC167007dF.A0D(this.A0H, AbstractC167007dF.A0D(this.A0E, AbstractC167007dF.A0D(this.A0I, AbstractC167007dF.A0D(this.A0F, AbstractC167007dF.A0D(this.A0G, AbstractC167007dF.A0D(this.A0D, (AbstractC166997dE.A0J(this.A09, AbstractC166987dD.A0G(this.A01)) + this.A00) * 31))))))) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0M(this.A07)) * 31) + AbstractC167017dG.A0M(this.A08)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC166997dE.A0I(this.A03)) * 31);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("SuccessState(responseObject=");
        A1C.append(this.A01);
        A1C.append(", clipsItems=");
        A1C.append(this.A09);
        A1C.append(", chunkIndex=");
        A1C.append(this.A00);
        A1C.append(", isFirstPage=");
        A1C.append(this.A0D);
        A1C.append(", isRefreshing=");
        A1C.append(this.A0G);
        A1C.append(", isPrefetchResponse=");
        A1C.append(this.A0F);
        A1C.append(", isStreaming=");
        A1C.append(this.A0I);
        A1C.append(", isForward=");
        A1C.append(this.A0E);
        A1C.append(", isRequestedFromCache=");
        A1C.append(this.A0H);
        A1C.append(", isEagerFetch=");
        A1C.append(this.A0B);
        A1C.append(AbstractC111324zv.A00(3432));
        A1C.append(this.A05);
        A1C.append(", responseContainerModule=");
        A1C.append(this.A06);
        A1C.append(", brandSafetySeverityMap=");
        A1C.append(this.A07);
        A1C.append(", brandSafetyBlocklist=");
        A1C.append(this.A08);
        A1C.append(", cacheKeyUsed=");
        A1C.append(this.A04);
        A1C.append(", cachedResponseTimeStamp=");
        A1C.append(this.A02);
        A1C.append(", responseTimestamp=");
        A1C.append(this.A03);
        A1C.append(AbstractC111324zv.A00(1425));
        return AbstractC25236BEt.A0a(A1C, this.A0A);
    }
}
