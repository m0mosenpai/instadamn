package X;

import com.google.common.collect.ImmutableList;
import com.instagram.model.showreelnative.IgShowreelNativeAsset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.Gdw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37416Gdw extends C0T6 implements C6PT {
    public final Integer A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;
    public final List A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C37416Gdw) {
                C37416Gdw c37416Gdw = (C37416Gdw) obj;
                if (!C14360o3.A0K(this.A02, c37416Gdw.A02) || !C14360o3.A0K(this.A06, c37416Gdw.A06) || !C14360o3.A0K(this.A07, c37416Gdw.A07) || !C14360o3.A0K(this.A03, c37416Gdw.A03) || !C14360o3.A0K(this.A04, c37416Gdw.A04) || !C14360o3.A0K(this.A00, c37416Gdw.A00) || !C14360o3.A0K(this.A05, c37416Gdw.A05) || !C14360o3.A0K(this.A01, c37416Gdw.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C6PT
    public final /* bridge */ /* synthetic */ ImmutableList Acw() {
        ImmutableList copyOf;
        List list = this.A06;
        if (list == null) {
            copyOf = ImmutableList.of();
        } else {
            copyOf = ImmutableList.copyOf((Collection) list);
        }
        C14360o3.A07(copyOf);
        return copyOf;
    }

    @Override // X.C6PT
    public final /* bridge */ /* synthetic */ ImmutableList Acy() {
        ImmutableList of;
        List<IgShowreelNativeAsset> list = this.A07;
        if (list != null) {
            ArrayList A0q = AbstractC167017dG.A0q(list);
            for (IgShowreelNativeAsset igShowreelNativeAsset : list) {
                C14360o3.A0B(igShowreelNativeAsset, 0);
                A0q.add(new C43660JSs(igShowreelNativeAsset));
            }
            of = ImmutableList.copyOf((Collection) A0q);
        } else {
            of = ImmutableList.of();
        }
        C14360o3.A09(of);
        return of;
    }

    public final int hashCode() {
        return (((((((((((((AbstractC167017dG.A0O(this.A02) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC167017dG.A0M(this.A07)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public C37416Gdw(Integer num, Integer num2, String str, String str2, String str3, String str4, List list, List list2) {
        this.A02 = str;
        this.A06 = list;
        this.A07 = list2;
        this.A03 = str2;
        this.A04 = str3;
        this.A00 = num;
        this.A05 = str4;
        this.A01 = num2;
    }
}
