package X;

import android.graphics.PointF;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: X.7AS, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7AS {
    public final int A00;
    public final PointF A01;
    public final ImmutableList A02;
    public final ImmutableList A03;
    public final UserSession A04;
    public final ImageUrl A05;
    public final AnonymousClass988 A06;
    public final AnonymousClass441 A07;
    public final C7IH A08;
    public final C2EY A09;
    public final MessageIdentifier A0A;
    public final Long A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final Map A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !(obj instanceof C7AS)) {
                return false;
            }
            C7AS c7as = (C7AS) obj;
            if (!C14360o3.A0K(this.A02, c7as.A02) || !C14360o3.A0K(this.A03, c7as.A03) || !C14360o3.A0K(this.A07, c7as.A07) || !C14360o3.A0K(this.A0C, c7as.A0C) || !C14360o3.A0K(this.A0G, c7as.A0G) || !C14360o3.A0K(this.A0F, c7as.A0F) || !C14360o3.A0K(this.A0D, c7as.A0D) || this.A0L != c7as.A0L || this.A0K != c7as.A0K || !C14360o3.A0K(this.A06, c7as.A06) || !C14360o3.A0K(this.A01, c7as.A01) || !C14360o3.A0K(this.A0E, c7as.A0E) || this.A0M != c7as.A0M) {
                return false;
            }
        }
        return true;
    }

    public C7AS(PointF pointF, UserSession userSession, ImageUrl imageUrl, AnonymousClass988 anonymousClass988, AnonymousClass441 anonymousClass441, C7IH c7ih, C2EY c2ey, MessageIdentifier messageIdentifier, Long l, String str, String str2, String str3, String str4, String str5, List list, List list2, Map map, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A04 = userSession;
        this.A07 = anonymousClass441;
        this.A05 = imageUrl;
        this.A0C = str;
        this.A00 = i;
        this.A0A = messageIdentifier;
        this.A0G = str2;
        this.A0F = str3;
        this.A0D = str4;
        this.A0H = map;
        this.A0L = z;
        this.A08 = c7ih;
        this.A0K = z2;
        this.A06 = anonymousClass988;
        this.A09 = c2ey;
        this.A01 = pointF;
        this.A0E = str5;
        this.A0J = z3;
        this.A0I = z4;
        this.A0B = l;
        this.A0M = z5;
        ImmutableList copyOf = ImmutableList.copyOf((Collection) list);
        C14360o3.A07(copyOf);
        this.A02 = copyOf;
        ImmutableList copyOf2 = ImmutableList.copyOf((Collection) list2);
        C14360o3.A07(copyOf2);
        this.A03 = copyOf2;
    }
}
