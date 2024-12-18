package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.5qq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C128215qq extends C0T6 {
    public final C4SX A00;
    public final Boolean A01;
    public final List A02;
    public final List A03;
    public final List A04;
    public final List A05;
    public final Map A06;
    public final Map A07;
    public final Map A08;
    public final Map A09;
    public final Map A0A;

    public C128215qq(C4SX c4sx, Boolean bool, List list, List list2, List list3, List list4, Map map, Map map2, Map map3, Map map4, Map map5) {
        C14360o3.A0B(map, 2);
        this.A03 = list;
        this.A07 = map;
        this.A08 = map2;
        this.A09 = map3;
        this.A0A = map4;
        this.A02 = list2;
        this.A04 = list3;
        this.A05 = list4;
        this.A00 = c4sx;
        this.A01 = bool;
        this.A06 = map5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128215qq) {
                C128215qq c128215qq = (C128215qq) obj;
                if (!C14360o3.A0K(this.A03, c128215qq.A03) || !C14360o3.A0K(this.A07, c128215qq.A07) || !C14360o3.A0K(this.A08, c128215qq.A08) || !C14360o3.A0K(this.A09, c128215qq.A09) || !C14360o3.A0K(this.A0A, c128215qq.A0A) || !C14360o3.A0K(this.A02, c128215qq.A02) || !C14360o3.A0K(this.A04, c128215qq.A04) || !C14360o3.A0K(this.A05, c128215qq.A05) || !C14360o3.A0K(this.A00, c128215qq.A00) || !C14360o3.A0K(this.A01, c128215qq.A01) || !C14360o3.A0K(this.A06, c128215qq.A06)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        List list = this.A03;
        int hashCode = (((list == null ? 0 : list.hashCode()) * 31) + this.A07.hashCode()) * 31;
        Map map = this.A08;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        Map map2 = this.A09;
        int hashCode3 = (hashCode2 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map map3 = this.A0A;
        int hashCode4 = (hashCode3 + (map3 == null ? 0 : map3.hashCode())) * 31;
        List list2 = this.A02;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.A04;
        int hashCode6 = (hashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.A05;
        int hashCode7 = (hashCode6 + (list4 == null ? 0 : list4.hashCode())) * 31;
        C4SX c4sx = this.A00;
        int hashCode8 = (hashCode7 + (c4sx == null ? 0 : c4sx.hashCode())) * 31;
        Boolean bool = this.A01;
        int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        Map map4 = this.A06;
        return hashCode9 + (map4 != null ? map4.hashCode() : 0);
    }
}
