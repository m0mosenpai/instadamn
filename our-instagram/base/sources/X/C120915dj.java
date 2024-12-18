package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.CreateModeType;
import java.util.List;

/* renamed from: X.5dj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C120915dj extends C0T6 implements InterfaceC120925dk {
    public final CreateModeType A00;
    public final H3P A01;
    public final JJO A02;
    public final C38828H7z A03;
    public final String A04;
    public final String A05;
    public final List A06;
    public final List A07;
    public final List A08;

    @Override // X.InterfaceC120925dk
    public final InterfaceC120925dk E8w(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC120925dk
    public final C120915dj Ese(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC120925dk
    public final C120915dj Esf(C1DV c1dv) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C120915dj) {
                C120915dj c120915dj = (C120915dj) obj;
                if (!C14360o3.A0K(this.A06, c120915dj.A06) || !C14360o3.A0K(this.A07, c120915dj.A07) || !C14360o3.A0K(this.A01, c120915dj.A01) || !C14360o3.A0K(this.A02, c120915dj.A02) || !C14360o3.A0K(this.A04, c120915dj.A04) || !C14360o3.A0K(this.A08, c120915dj.A08) || !C14360o3.A0K(this.A03, c120915dj.A03) || !C14360o3.A0K(this.A05, c120915dj.A05) || this.A00 != c120915dj.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        List list = this.A06;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.A07;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        H3P h3p = this.A01;
        int hashCode3 = (hashCode2 + (h3p == null ? 0 : h3p.hashCode())) * 31;
        JJO jjo = this.A02;
        int hashCode4 = (hashCode3 + (jjo == null ? 0 : jjo.hashCode())) * 31;
        String str = this.A04;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        List list3 = this.A08;
        int hashCode6 = (hashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        C38828H7z c38828H7z = this.A03;
        int hashCode7 = (hashCode6 + (c38828H7z == null ? 0 : c38828H7z.hashCode())) * 31;
        String str2 = this.A05;
        int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CreateModeType createModeType = this.A00;
        return hashCode8 + (createModeType != null ? createModeType.hashCode() : 0);
    }

    @Override // X.InterfaceC120925dk
    public final List Am1() {
        return this.A06;
    }

    @Override // X.InterfaceC120925dk
    public final List B97() {
        return this.A07;
    }

    @Override // X.InterfaceC120925dk
    public final /* bridge */ /* synthetic */ JLP B9p() {
        return this.A01;
    }

    @Override // X.InterfaceC120925dk
    public final JJO BAg() {
        return this.A02;
    }

    @Override // X.InterfaceC120925dk
    public final List BeM() {
        return this.A08;
    }

    @Override // X.InterfaceC120925dk
    public final /* bridge */ /* synthetic */ InterfaceC43526JKm C5m() {
        return this.A03;
    }

    @Override // X.InterfaceC120925dk
    public final String C8B() {
        return this.A05;
    }

    @Override // X.InterfaceC120925dk
    public final CreateModeType CBR() {
        return this.A00;
    }

    @Override // X.InterfaceC120925dk
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTCreateModeInfo", Hm6.A00(this));
    }

    @Override // X.InterfaceC120925dk
    public final String getName() {
        return this.A04;
    }

    public C120915dj(CreateModeType createModeType, H3P h3p, JJO jjo, C38828H7z c38828H7z, String str, String str2, List list, List list2, List list3) {
        this.A06 = list;
        this.A07 = list2;
        this.A01 = h3p;
        this.A02 = jjo;
        this.A04 = str;
        this.A08 = list3;
        this.A03 = c38828H7z;
        this.A05 = str2;
        this.A00 = createModeType;
    }
}
