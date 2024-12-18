package X;

import android.location.Location;
import com.facebook.android.maps.model.LatLng;
import com.instagram.api.schemas.NotePogImageDict;
import com.instagram.api.schemas.NotePogVideoDict;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.VideoVersion;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.JyU, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45128JyU extends C0T6 implements InterfaceC72044XLa {
    public boolean A00;
    public final int A01;
    public final long A02;
    public final Location A03;
    public final LatLng A04;
    public final C4F5 A05;
    public final User A06;
    public final Integer A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;

    public final boolean A06(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return AbstractC31174DnI.A1Y(A02(), userSession.userId);
    }

    public static String A01(Object obj) {
        return ((C45128JyU) obj).A02().getId();
    }

    public final User A02() {
        User user;
        C4F5 c4f5 = this.A05;
        if (c4f5 == null || (user = c4f5.A0A) == null) {
            return this.A06;
        }
        return user;
    }

    public final C75363a3 A03() {
        String str;
        NotePogVideoDict notePogVideoDict;
        List list;
        VideoVersion videoVersion;
        NotePogVideoDict notePogVideoDict2;
        C4F5 c4f5 = this.A05;
        if (c4f5 != null && (notePogVideoDict2 = c4f5.A08) != null) {
            str = notePogVideoDict2.A01;
        } else {
            str = null;
        }
        String str2 = null;
        if (str == null) {
            return null;
        }
        if (c4f5 != null && (notePogVideoDict = c4f5.A08) != null && (list = notePogVideoDict.A03) != null && (videoVersion = (VideoVersion) AbstractC001800i.A0O(list, 0)) != null) {
            str2 = videoVersion.A06;
        }
        C101644hZ c101644hZ = new C101644hZ(C05F.A00, str);
        c101644hZ.A0B = str2;
        return c101644hZ.A00();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
    
        if (r1 == 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A04() {
        /*
            r2 = this;
            X.4F5 r0 = r2.A05
            if (r0 == 0) goto L21
            java.util.List r0 = r0.A0J
            if (r0 == 0) goto L21
            java.lang.Object r0 = X.AbstractC001800i.A0J(r0)
            X.MOe r0 = (X.InterfaceC50424MOe) r0
            if (r0 == 0) goto L21
            X.6C9 r0 = r0.BXJ()
            if (r0 == 0) goto L21
            java.lang.String r0 = r0.A0J
            if (r0 == 0) goto L21
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L22
        L21:
            r0 = 1
        L22:
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45128JyU.A04():boolean");
    }

    public final boolean A05() {
        C4F5 c4f5 = this.A05;
        if (c4f5 != null) {
            NotePogVideoDict notePogVideoDict = c4f5.A08;
            if (notePogVideoDict == null || notePogVideoDict.A01 == null || A03() == null) {
                NotePogImageDict notePogImageDict = c4f5.A07;
                if (notePogImageDict != null && notePogImageDict.A00 != null && notePogImageDict.A01 != null) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC71945XBu
    public final LatLng Bea() {
        return this.A04;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        LatLng latLng;
        C45128JyU c45128JyU = (C45128JyU) obj;
        LatLng latLng2 = this.A04;
        if (c45128JyU != null) {
            latLng = c45128JyU.A04;
        } else {
            latLng = null;
        }
        if (!C14360o3.A0K(latLng2, latLng)) {
            return -1;
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        C45128JyU c45128JyU;
        if (obj instanceof C45128JyU) {
            c45128JyU = (C45128JyU) obj;
        } else {
            c45128JyU = null;
        }
        if (c45128JyU == null || !C14360o3.A0K(this.A0B, c45128JyU.A0B) || this.A0I != c45128JyU.A0I || !C14360o3.A0K(this.A04, c45128JyU.A04) || this.A0E != c45128JyU.A0E || this.A0C != c45128JyU.A0C || this.A0H != c45128JyU.A0H || this.A00 != c45128JyU.A00 || this.A0F != c45128JyU.A0F || !C14360o3.A0K(this.A05, c45128JyU.A05) || this.A0D != c45128JyU.A0D || this.A07 != c45128JyU.A07) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC71945XBu
    public final String getId() {
        return this.A0B;
    }

    public final int hashCode() {
        return ((AbstractC167007dF.A0D(this.A0D, AbstractC167007dF.A0D(this.A00, AbstractC167007dF.A0D(this.A0K, AbstractC167007dF.A0D(this.A0F, AbstractC167007dF.A0D(this.A0G, (AbstractC167007dF.A0D(this.A0E, AbstractC167007dF.A0D(this.A0C, (AbstractC167007dF.A0D(this.A0J, AbstractC167007dF.A0D(this.A0I, AbstractC167007dF.A0D(this.A0H, (AbstractC25236BEt.A01(this.A02, AbstractC166997dE.A0J(this.A06, (AbstractC166997dE.A0J(this.A04, AbstractC166987dD.A0J(this.A0B)) + AbstractC167017dG.A0M(this.A05)) * 31)) + AbstractC167017dG.A0O(this.A0A)) * 31))) + AbstractC167017dG.A0O(this.A09)) * 31)) + this.A01) * 31))))) + AbstractC25227BEk.A07(this.A08)) * 31) + AbstractC40653I0l.A00(this.A07);
    }

    public C45128JyU(LatLng latLng, C4F5 c4f5, User user, Integer num, String str, String str2, String str3, String str4, int i, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        AbstractC25234BEr.A1P(str, latLng, user);
        C14360o3.A0B(num, 20);
        this.A0B = str;
        this.A04 = latLng;
        this.A05 = c4f5;
        this.A06 = user;
        this.A02 = j;
        this.A0A = str2;
        this.A0H = z;
        this.A0I = z2;
        this.A0J = z3;
        this.A09 = str3;
        this.A0C = z4;
        this.A0E = z5;
        this.A01 = i;
        this.A0G = z6;
        this.A0F = z7;
        this.A0K = z8;
        this.A00 = z9;
        this.A0D = z10;
        this.A08 = str4;
        this.A07 = num;
        Location location = new Location("FriendMapPin");
        location.setLatitude(latLng.A00);
        location.setLongitude(latLng.A01);
        this.A03 = location;
    }

    public static String A00(C45128JyU c45128JyU) {
        return c45128JyU.A02().getId();
    }
}
