package X;

import com.google.common.collect.ImmutableSet;
import com.instagram.model.direct.DirectSearchResharedContent;
import com.instagram.model.direct.DirectSearchResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.HIu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39096HIu extends C4F4 {
    public final int A01;
    public final int A02;
    public final int A03;
    public final InterfaceC11380iw A04;
    public final String A05;
    public final ArrayList A07;
    public final List A08;
    public final List A09;
    public final String A06 = "";
    public final int A00 = 29;

    public C39096HIu(InterfaceC11380iw interfaceC11380iw, String str, ArrayList arrayList, List list, List list2, int i, int i2, int i3) {
        this.A07 = arrayList;
        this.A08 = list;
        this.A09 = list2;
        this.A05 = str;
        this.A01 = i;
        this.A02 = i3;
        this.A03 = i2;
        this.A04 = interfaceC11380iw;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C39096HIu c39096HIu = (C39096HIu) obj;
        if (this.A07.equals(c39096HIu.A07) && this.A08.equals(c39096HIu.A08) && this.A09.equals(c39096HIu.A09) && C2I7.A00(this.A06, c39096HIu.A06) && C2I7.A00(this.A05, c39096HIu.A05) && this.A00 == c39096HIu.A00 && this.A01 == c39096HIu.A01 && this.A03 == c39096HIu.A03 && this.A02 == c39096HIu.A02 && this.A04.equals(c39096HIu.A04)) {
            return true;
        }
        return false;
    }

    public static C39096HIu A00(InterfaceC11380iw interfaceC11380iw, String str, ArrayList arrayList, int i, int i2, int i3) {
        ArrayList A1E = AbstractC166987dD.A1E();
        ArrayList A1E2 = AbstractC166987dD.A1E();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            DirectSearchResult directSearchResult = (DirectSearchResult) it.next();
            if (directSearchResult instanceof DirectSearchResharedContent) {
                DirectSearchResharedContent directSearchResharedContent = (DirectSearchResharedContent) directSearchResult;
                C38321qM c38321qM = directSearchResharedContent.A01;
                if (c38321qM != null) {
                    C120985dq A02 = C128085qc.A02(c38321qM);
                    ArrayList A1E3 = AbstractC166987dD.A1E();
                    A1E3.addAll(ImmutableSet.A03(directSearchResharedContent.A02));
                    A02.A08 = A1E3;
                    A1E.add(A02);
                }
                A1E2.add(ImmutableSet.A03(directSearchResharedContent.A02));
            }
        }
        return new C39096HIu(interfaceC11380iw, str, arrayList, A1E, A1E2, i, i2, i3);
    }
}
