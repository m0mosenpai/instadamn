package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.1sx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39741sx extends C0T6 implements InterfaceC39751sy {
    public final C5FI A00;
    public final C5FI A01;
    public final C5Fa A02;
    public final C5Fa A03;
    public final C110864yy A04;
    public final Boolean A05;
    public final Integer A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final HashMap A0D;
    public final List A0E;

    @Override // X.InterfaceC39751sy
    public final C39741sx F5q(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC39751sy
    public final C39741sx F5r(C1DV c1dv) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C39741sx) {
                C39741sx c39741sx = (C39741sx) obj;
                if (!C14360o3.A0K(this.A02, c39741sx.A02) || !C14360o3.A0K(this.A07, c39741sx.A07) || !C14360o3.A0K(this.A08, c39741sx.A08) || !C14360o3.A0K(this.A00, c39741sx.A00) || !C14360o3.A0K(this.A09, c39741sx.A09) || !C14360o3.A0K(this.A0A, c39741sx.A0A) || !C14360o3.A0K(this.A03, c39741sx.A03) || !C14360o3.A0K(this.A01, c39741sx.A01) || !C14360o3.A0K(this.A04, c39741sx.A04) || !C14360o3.A0K(this.A0D, c39741sx.A0D) || !C14360o3.A0K(this.A0E, c39741sx.A0E) || !C14360o3.A0K(this.A05, c39741sx.A05) || !C14360o3.A0K(this.A0B, c39741sx.A0B) || !C14360o3.A0K(this.A0C, c39741sx.A0C) || !C14360o3.A0K(this.A06, c39741sx.A06)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        C5Fa c5Fa = this.A02;
        int hashCode = (c5Fa == null ? 0 : c5Fa.hashCode()) * 31;
        String str = this.A07;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.A08;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        C5FI c5fi = this.A00;
        int hashCode4 = (hashCode3 + (c5fi == null ? 0 : c5fi.hashCode())) * 31;
        String str3 = this.A09;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A0A;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        C5Fa c5Fa2 = this.A03;
        int hashCode7 = (hashCode6 + (c5Fa2 == null ? 0 : c5Fa2.hashCode())) * 31;
        C5FI c5fi2 = this.A01;
        int hashCode8 = (hashCode7 + (c5fi2 == null ? 0 : c5fi2.hashCode())) * 31;
        C110864yy c110864yy = this.A04;
        int hashCode9 = (hashCode8 + (c110864yy == null ? 0 : c110864yy.hashCode())) * 31;
        HashMap hashMap = this.A0D;
        int hashCode10 = (hashCode9 + (hashMap == null ? 0 : hashMap.hashCode())) * 31;
        List list = this.A0E;
        int hashCode11 = (hashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.A05;
        int hashCode12 = (hashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.A0B;
        int hashCode13 = (hashCode12 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.A0C;
        int hashCode14 = (hashCode13 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.A06;
        return hashCode14 + (num != null ? num.hashCode() : 0);
    }

    @Override // X.InterfaceC39751sy
    public final /* bridge */ /* synthetic */ InterfaceC104764ng AZB() {
        return this.A02;
    }

    @Override // X.InterfaceC39751sy
    public final String Aeu() {
        return this.A08;
    }

    @Override // X.InterfaceC39751sy
    public final /* bridge */ /* synthetic */ C5FJ Ale() {
        return this.A00;
    }

    @Override // X.InterfaceC39751sy
    public final String AwB() {
        return this.A09;
    }

    @Override // X.InterfaceC39751sy
    public final /* bridge */ /* synthetic */ InterfaceC104764ng AyD() {
        return this.A03;
    }

    @Override // X.InterfaceC39751sy
    public final /* bridge */ /* synthetic */ C5FJ BDN() {
        return this.A01;
    }

    @Override // X.InterfaceC39751sy
    public final /* bridge */ /* synthetic */ InterfaceC110874yz BKs() {
        return this.A04;
    }

    @Override // X.InterfaceC39751sy
    public final /* bridge */ /* synthetic */ Map BSP() {
        return this.A0D;
    }

    @Override // X.InterfaceC39751sy
    public final List BSS() {
        return this.A0E;
    }

    @Override // X.InterfaceC39751sy
    public final Boolean BwS() {
        return this.A05;
    }

    @Override // X.InterfaceC39751sy
    public final Integer C6j() {
        return this.A06;
    }

    @Override // X.InterfaceC39751sy
    public final InterfaceC39751sy EBk(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC39751sy
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTStoryAdsHeadlineDict", I3D.A00(this));
    }

    @Override // X.InterfaceC39751sy
    public final String getBackgroundColor() {
        return this.A07;
    }

    @Override // X.InterfaceC39751sy
    public final String getDescription() {
        return this.A0A;
    }

    @Override // X.InterfaceC39751sy
    public final String getText() {
        return this.A0B;
    }

    @Override // X.InterfaceC39751sy
    public final String getTextColor() {
        return this.A0C;
    }

    public C39741sx(C5FI c5fi, C5FI c5fi2, C5Fa c5Fa, C5Fa c5Fa2, C110864yy c110864yy, Boolean bool, Integer num, String str, String str2, String str3, String str4, String str5, String str6, HashMap hashMap, List list) {
        this.A02 = c5Fa;
        this.A07 = str;
        this.A08 = str2;
        this.A00 = c5fi;
        this.A09 = str3;
        this.A0A = str4;
        this.A03 = c5Fa2;
        this.A01 = c5fi2;
        this.A04 = c110864yy;
        this.A0D = hashMap;
        this.A0E = list;
        this.A05 = bool;
        this.A0B = str5;
        this.A0C = str6;
        this.A06 = num;
    }
}
