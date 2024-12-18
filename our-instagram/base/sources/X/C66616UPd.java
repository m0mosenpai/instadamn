package X;

import com.instagram.api.schemas.AdproObjectiveTypesEnum;
import com.instagram.api.schemas.AdproRegulatedCategory;
import com.instagram.api.schemas.BoostedActionStatus;
import com.instagram.api.schemas.CallToActionType;
import com.instagram.api.schemas.InstagramMediaProductType;
import java.util.List;

/* renamed from: X.UPd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66616UPd extends C0T6 {
    public final AdproObjectiveTypesEnum A00;
    public final BoostedActionStatus A01;
    public final CallToActionType A02;
    public final InstagramMediaProductType A03;
    public final UPA A04;
    public final Integer A05;
    public final Integer A06;
    public final Integer A07;
    public final Integer A08;
    public final Integer A09;
    public final Integer A0A;
    public final Integer A0B;
    public final Integer A0C;
    public final Long A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final List A0K;
    public final boolean A0L;
    public final AdproRegulatedCategory A0M;
    public final Integer A0N;
    public final Long A0O;
    public final String A0P;
    public final String A0Q;
    public final String A0R;
    public final String A0S;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66616UPd) {
                C66616UPd c66616UPd = (C66616UPd) obj;
                if (this.A01 != c66616UPd.A01 || !C14360o3.A0K(this.A0E, c66616UPd.A0E) || this.A02 != c66616UPd.A02 || !C14360o3.A0K(this.A0P, c66616UPd.A0P) || !C14360o3.A0K(this.A0N, c66616UPd.A0N) || !C14360o3.A0K(this.A05, c66616UPd.A05) || !C14360o3.A0K(this.A0F, c66616UPd.A0F) || !C14360o3.A0K(this.A0G, c66616UPd.A0G) || !C14360o3.A0K(this.A0Q, c66616UPd.A0Q) || !C14360o3.A0K(this.A06, c66616UPd.A06) || !C14360o3.A0K(this.A04, c66616UPd.A04) || !C14360o3.A0K(this.A0K, c66616UPd.A0K) || !C14360o3.A0K(this.A0R, c66616UPd.A0R) || this.A03 != c66616UPd.A03 || this.A00 != c66616UPd.A00 || !C14360o3.A0K(this.A0H, c66616UPd.A0H) || this.A0M != c66616UPd.A0M || !C14360o3.A0K(this.A07, c66616UPd.A07) || !C14360o3.A0K(this.A08, c66616UPd.A08) || this.A0L != c66616UPd.A0L || !C14360o3.A0K(this.A09, c66616UPd.A09) || !C14360o3.A0K(this.A0D, c66616UPd.A0D) || !C14360o3.A0K(this.A0O, c66616UPd.A0O) || !C14360o3.A0K(this.A0I, c66616UPd.A0I) || !C14360o3.A0K(this.A0A, c66616UPd.A0A) || !C14360o3.A0K(this.A0S, c66616UPd.A0S) || !C14360o3.A0K(this.A0B, c66616UPd.A0B) || !C14360o3.A0K(this.A0C, c66616UPd.A0C) || !C14360o3.A0K(this.A0J, c66616UPd.A0J)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int A0D = (((((((((((((((AbstractC167007dF.A0D(this.A0L, ((((((((((((((((((((((((((((((((((((AbstractC167017dG.A0M(this.A01) * 31) + AbstractC167017dG.A0O(this.A0E)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0O(this.A0P)) * 31) + AbstractC167017dG.A0M(this.A0N)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0O(this.A0F)) * 31) + AbstractC167017dG.A0O(this.A0G)) * 31) + AbstractC167017dG.A0O(this.A0Q)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A0K)) * 31) + AbstractC167017dG.A0O(this.A0R)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0O(this.A0H)) * 31) + AbstractC167017dG.A0M(this.A0M)) * 31) + AbstractC167017dG.A0M(this.A07)) * 31) + AbstractC167017dG.A0M(this.A08)) * 31) + AbstractC167017dG.A0M(this.A09)) * 31) + AbstractC167017dG.A0M(this.A0D)) * 31) + AbstractC167017dG.A0M(this.A0O)) * 31) + AbstractC167017dG.A0O(this.A0I)) * 31) + AbstractC167017dG.A0M(this.A0A)) * 31) + AbstractC167017dG.A0O(this.A0S)) * 31) + AbstractC167017dG.A0M(this.A0B)) * 31) + AbstractC167017dG.A0M(this.A0C)) * 31;
        String str = this.A0J;
        if (str != null) {
            i = str.hashCode();
        }
        return A0D + i;
    }

    public C66616UPd(AdproObjectiveTypesEnum adproObjectiveTypesEnum, AdproRegulatedCategory adproRegulatedCategory, BoostedActionStatus boostedActionStatus, CallToActionType callToActionType, InstagramMediaProductType instagramMediaProductType, UPA upa, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Long l, Long l2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List list, boolean z) {
        this.A01 = boostedActionStatus;
        this.A0E = str;
        this.A02 = callToActionType;
        this.A0P = str2;
        this.A0N = num;
        this.A05 = num2;
        this.A0F = str3;
        this.A0G = str4;
        this.A0Q = str5;
        this.A06 = num3;
        this.A04 = upa;
        this.A0K = list;
        this.A0R = str6;
        this.A03 = instagramMediaProductType;
        this.A00 = adproObjectiveTypesEnum;
        this.A0H = str7;
        this.A0M = adproRegulatedCategory;
        this.A07 = num4;
        this.A08 = num5;
        this.A0L = z;
        this.A09 = num6;
        this.A0D = l;
        this.A0O = l2;
        this.A0I = str8;
        this.A0A = num7;
        this.A0S = str9;
        this.A0B = num8;
        this.A0C = num9;
        this.A0J = str10;
    }
}
