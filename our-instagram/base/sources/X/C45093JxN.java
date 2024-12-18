package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.visual.model.DirectVisualMessageItemModel;
import com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.JxN, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45093JxN extends C0T6 {
    public PrivacyMediaOverlayViewModel A00;
    public final float A01;
    public final int A02;
    public final long A03;
    public final ImageUrl A04;
    public final L4E A05;
    public final C101674hc A06;
    public final C101594hU A07;
    public final DirectVisualMessageItemModel.MediaFields.RemixMedia A08;
    public final DirectVisualMessageItemModel.MediaFields.TamMedia A09;
    public final C38321qM A0A;
    public final EnumC40111tc A0B;
    public final User A0C;
    public final Long A0D;
    public final Long A0E;
    public final Long A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final String A0O;
    public final List A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public final boolean A0Z;

    public C45093JxN(ImageUrl imageUrl, L4E l4e, C101674hc c101674hc, C101594hU c101594hU, DirectVisualMessageItemModel.MediaFields.RemixMedia remixMedia, DirectVisualMessageItemModel.MediaFields.TamMedia tamMedia, PrivacyMediaOverlayViewModel privacyMediaOverlayViewModel, C38321qM c38321qM, EnumC40111tc enumC40111tc, User user, Long l, Long l2, Long l3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, float f, int i, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        AbstractC25233BEq.A0y(5, str4, str5, enumC40111tc);
        C14360o3.A0B(list, 11);
        this.A0K = str;
        this.A0G = str2;
        this.A0J = str3;
        this.A0C = user;
        this.A0M = str4;
        this.A0X = z;
        this.A0A = c38321qM;
        this.A0I = str5;
        this.A0B = enumC40111tc;
        this.A03 = j;
        this.A0P = list;
        this.A0Z = z2;
        this.A0S = z3;
        this.A0Q = z4;
        this.A0Y = z5;
        this.A0W = z6;
        this.A0R = z7;
        this.A0H = str6;
        this.A0O = str7;
        this.A04 = imageUrl;
        this.A0F = l;
        this.A0D = l2;
        this.A01 = f;
        this.A0L = str8;
        this.A05 = l4e;
        this.A06 = c101674hc;
        this.A02 = i;
        this.A0N = str9;
        this.A07 = c101594hU;
        this.A09 = tamMedia;
        this.A00 = privacyMediaOverlayViewModel;
        this.A08 = remixMedia;
        this.A0E = l3;
        this.A0T = z8;
        this.A0U = z9;
        this.A0V = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45093JxN) {
                C45093JxN c45093JxN = (C45093JxN) obj;
                if (!C14360o3.A0K(this.A0K, c45093JxN.A0K) || !C14360o3.A0K(this.A0G, c45093JxN.A0G) || !C14360o3.A0K(this.A0J, c45093JxN.A0J) || !C14360o3.A0K(this.A0C, c45093JxN.A0C) || !C14360o3.A0K(this.A0M, c45093JxN.A0M) || this.A0X != c45093JxN.A0X || !C14360o3.A0K(this.A0A, c45093JxN.A0A) || !C14360o3.A0K(this.A0I, c45093JxN.A0I) || this.A0B != c45093JxN.A0B || this.A03 != c45093JxN.A03 || !C14360o3.A0K(this.A0P, c45093JxN.A0P) || this.A0Z != c45093JxN.A0Z || this.A0S != c45093JxN.A0S || this.A0Q != c45093JxN.A0Q || this.A0Y != c45093JxN.A0Y || this.A0W != c45093JxN.A0W || this.A0R != c45093JxN.A0R || !C14360o3.A0K(this.A0H, c45093JxN.A0H) || !C14360o3.A0K(this.A0O, c45093JxN.A0O) || !C14360o3.A0K(this.A04, c45093JxN.A04) || !C14360o3.A0K(this.A0F, c45093JxN.A0F) || !C14360o3.A0K(this.A0D, c45093JxN.A0D) || Float.compare(this.A01, c45093JxN.A01) != 0 || !C14360o3.A0K(this.A0L, c45093JxN.A0L) || !C14360o3.A0K(this.A05, c45093JxN.A05) || !C14360o3.A0K(this.A06, c45093JxN.A06) || this.A02 != c45093JxN.A02 || !C14360o3.A0K(this.A0N, c45093JxN.A0N) || !C14360o3.A0K(this.A07, c45093JxN.A07) || !C14360o3.A0K(this.A09, c45093JxN.A09) || !C14360o3.A0K(this.A00, c45093JxN.A00) || !C14360o3.A0K(this.A08, c45093JxN.A08) || !C14360o3.A0K(this.A0E, c45093JxN.A0E) || this.A0T != c45093JxN.A0T || this.A0U != c45093JxN.A0U || this.A0V != c45093JxN.A0V) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0008, code lost:
    
        if (r3.A0Q == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
    
        if (r6.A0H == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C75363a3 A00() {
        /*
            r6 = this;
            X.4hU r3 = r6.A07
            r5 = 1
            if (r3 == 0) goto La
            boolean r0 = r3.A0Q
            r2 = 1
            if (r0 != 0) goto Lb
        La:
            r2 = 0
        Lb:
            boolean r0 = r6.A0R
            if (r0 == 0) goto L14
            java.lang.String r1 = r6.A0H
            r0 = 1
            if (r1 != 0) goto L15
        L14:
            r0 = 0
        L15:
            if (r2 != 0) goto L73
            if (r0 != 0) goto L73
            java.lang.String r2 = "DirectVisualMessageViewerItem"
            java.lang.StringBuilder r4 = X.AbstractC166987dD.A1C()
            java.lang.String r0 = "mediaFields != null: "
            r4.append(r0)
            boolean r0 = X.AbstractC167007dF.A1W(r3)
            r4.append(r0)
            java.lang.String r1 = ",\n"
            r4.append(r1)
            if (r3 == 0) goto L3f
            java.lang.String r0 = "mediaFields.hasVideoSource: "
            r4.append(r0)
            boolean r0 = r3.A0Q
            r4.append(r0)
            r4.append(r1)
        L3f:
            java.lang.String r0 = "localVideoPath != null: "
            r4.append(r0)
            java.lang.String r0 = r6.A0H
            if (r0 != 0) goto L49
            r5 = 0
        L49:
            r4.append(r5)
            r4.append(r1)
            java.lang.String r0 = "isViewableOnce: "
            r4.append(r0)
            boolean r0 = r6.A0Y
            r4.append(r0)
            r4.append(r1)
            java.lang.String r0 = "isPermanentVisualMessage: "
            r4.append(r0)
            boolean r0 = r6.A0W
            r4.append(r0)
            java.lang.StringBuilder r1 = X.AbstractC166987dD.A1C()
            java.lang.String r0 = "invalid media or local video when calling getVideoSource(): "
            java.lang.String r0 = X.AbstractC167017dG.A0n(r4, r0, r1)
            X.C0w9.A03(r2, r0)
        L73:
            if (r3 == 0) goto L79
            X.3a3 r0 = r3.A09
            if (r0 != 0) goto L7f
        L79:
            java.lang.String r0 = r6.A0H
            X.3a3 r0 = X.AbstractC101604hV.A03(r0)
        L7f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45093JxN.A00():X.3a3");
    }

    public final String A01() {
        String str = this.A0K;
        if (str == null) {
            String str2 = this.A0G;
            if (str2 == null) {
                return this.A0J;
            }
            return str2;
        }
        return str;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A0V, AbstractC167007dF.A0D(this.A0U, AbstractC167007dF.A0D(this.A0T, (((((((((((((((((((AbstractC166997dE.A00((((((((((AbstractC167007dF.A0D(this.A0R, AbstractC167007dF.A0D(this.A0W, AbstractC167007dF.A0D(this.A0Y, AbstractC167007dF.A0D(this.A0Q, AbstractC167007dF.A0D(this.A0S, AbstractC167007dF.A0D(this.A0Z, AbstractC166997dE.A0J(this.A0P, AbstractC25236BEt.A01(this.A03, AbstractC166997dE.A0J(this.A0B, AbstractC166997dE.A0K(this.A0I, (AbstractC167007dF.A0D(this.A0X, AbstractC166997dE.A0K(this.A0M, (AbstractC166997dE.A0K(this.A0J, ((AbstractC167017dG.A0O(this.A0K) * 31) + AbstractC167017dG.A0O(this.A0G)) * 31) + AbstractC167017dG.A0M(this.A0C)) * 31)) + AbstractC167017dG.A0M(this.A0A)) * 31)))))))))) + AbstractC167017dG.A0O(this.A0H)) * 31) + AbstractC167017dG.A0O(this.A0O)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A0F)) * 31) + AbstractC167017dG.A0M(this.A0D)) * 31, this.A01) + AbstractC167017dG.A0O(this.A0L)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + this.A02) * 31) + AbstractC167017dG.A0O(this.A0N)) * 31) + AbstractC167017dG.A0M(this.A07)) * 31) + AbstractC167017dG.A0M(this.A09)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A08)) * 31) + AbstractC166997dE.A0I(this.A0E)) * 31)));
    }

    public final boolean A02(UserSession userSession) {
        User A10 = AbstractC166987dD.A10(userSession);
        User user = this.A0C;
        if (user != null) {
            return AbstractC50102Ry.A00(A10.getId(), user.getId());
        }
        return false;
    }
}
