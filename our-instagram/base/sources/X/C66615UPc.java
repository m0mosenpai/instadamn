package X;

import com.instagram.api.schemas.AdproRegulatedCategory;
import com.instagram.api.schemas.BoostedActionStatus;
import com.instagram.api.schemas.CallToActionType;
import com.instagram.api.schemas.InstagramMediaProductType;
import java.util.List;

/* renamed from: X.UPc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66615UPc extends C0T6 {
    public final BoostedActionStatus A00;
    public final InstagramMediaProductType A01;
    public final Integer A02;
    public final Integer A03;
    public final Integer A04;
    public final Integer A05;
    public final Integer A06;
    public final Integer A07;
    public final Integer A08;
    public final Integer A09;
    public final Long A0A;
    public final String A0B;
    public final boolean A0C;
    public final AdproRegulatedCategory A0D;
    public final CallToActionType A0E;
    public final UPA A0F;
    public final Integer A0G;
    public final Long A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final String A0O;
    public final String A0P;
    public final String A0Q;
    public final List A0R;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66615UPc) {
                C66615UPc c66615UPc = (C66615UPc) obj;
                if (this.A00 != c66615UPc.A00 || !C14360o3.A0K(this.A0I, c66615UPc.A0I) || this.A0E != c66615UPc.A0E || !C14360o3.A0K(this.A0J, c66615UPc.A0J) || !C14360o3.A0K(this.A0G, c66615UPc.A0G) || !C14360o3.A0K(this.A02, c66615UPc.A02) || !C14360o3.A0K(this.A0K, c66615UPc.A0K) || !C14360o3.A0K(this.A0L, c66615UPc.A0L) || !C14360o3.A0K(this.A0M, c66615UPc.A0M) || !C14360o3.A0K(this.A03, c66615UPc.A03) || !C14360o3.A0K(this.A0F, c66615UPc.A0F) || !C14360o3.A0K(this.A0R, c66615UPc.A0R) || !C14360o3.A0K(this.A0N, c66615UPc.A0N) || this.A01 != c66615UPc.A01 || !C14360o3.A0K(this.A0O, c66615UPc.A0O) || this.A0D != c66615UPc.A0D || !C14360o3.A0K(this.A04, c66615UPc.A04) || !C14360o3.A0K(this.A05, c66615UPc.A05) || this.A0C != c66615UPc.A0C || !C14360o3.A0K(this.A06, c66615UPc.A06) || !C14360o3.A0K(this.A0H, c66615UPc.A0H) || !C14360o3.A0K(this.A0A, c66615UPc.A0A) || !C14360o3.A0K(this.A0B, c66615UPc.A0B) || !C14360o3.A0K(this.A07, c66615UPc.A07) || !C14360o3.A0K(this.A0P, c66615UPc.A0P) || !C14360o3.A0K(this.A08, c66615UPc.A08) || !C14360o3.A0K(this.A09, c66615UPc.A09) || !C14360o3.A0K(this.A0Q, c66615UPc.A0Q)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int A0D = (((((((((((((((AbstractC167007dF.A0D(this.A0C, ((((((((((((((((((((((((((((((((((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0O(this.A0I)) * 31) + AbstractC167017dG.A0M(this.A0E)) * 31) + AbstractC167017dG.A0O(this.A0J)) * 31) + AbstractC167017dG.A0M(this.A0G)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0O(this.A0K)) * 31) + AbstractC167017dG.A0O(this.A0L)) * 31) + AbstractC167017dG.A0O(this.A0M)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A0F)) * 31) + AbstractC167017dG.A0M(this.A0R)) * 31) + AbstractC167017dG.A0O(this.A0N)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0O(this.A0O)) * 31) + AbstractC167017dG.A0M(this.A0D)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC167017dG.A0M(this.A0H)) * 31) + AbstractC167017dG.A0M(this.A0A)) * 31) + AbstractC167017dG.A0O(this.A0B)) * 31) + AbstractC167017dG.A0M(this.A07)) * 31) + AbstractC167017dG.A0O(this.A0P)) * 31) + AbstractC167017dG.A0M(this.A08)) * 31) + AbstractC167017dG.A0M(this.A09)) * 31;
        String str = this.A0Q;
        if (str != null) {
            i = str.hashCode();
        }
        return A0D + i;
    }

    public C66615UPc(AdproRegulatedCategory adproRegulatedCategory, BoostedActionStatus boostedActionStatus, CallToActionType callToActionType, InstagramMediaProductType instagramMediaProductType, UPA upa, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Long l, Long l2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List list, boolean z) {
        this.A00 = boostedActionStatus;
        this.A0I = str;
        this.A0E = callToActionType;
        this.A0J = str2;
        this.A0G = num;
        this.A02 = num2;
        this.A0K = str3;
        this.A0L = str4;
        this.A0M = str5;
        this.A03 = num3;
        this.A0F = upa;
        this.A0R = list;
        this.A0N = str6;
        this.A01 = instagramMediaProductType;
        this.A0O = str7;
        this.A0D = adproRegulatedCategory;
        this.A04 = num4;
        this.A05 = num5;
        this.A0C = z;
        this.A06 = num6;
        this.A0H = l;
        this.A0A = l2;
        this.A0B = str8;
        this.A07 = num7;
        this.A0P = str9;
        this.A08 = num8;
        this.A09 = num9;
        this.A0Q = str10;
    }
}
