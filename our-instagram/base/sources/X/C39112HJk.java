package X;

import com.instagram.discovery.filters.analytics.FiltersLoggingInfo;
import java.util.HashMap;

/* renamed from: X.HJk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39112HJk extends AbstractC64162vb {
    public final IMI A00;

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        String str;
        C39698HjU c39698HjU = (C39698HjU) obj;
        C41024IEt c41024IEt = (C41024IEt) obj2;
        AbstractC167017dG.A1N(c39698HjU, c41024IEt);
        IMI imi = this.A00;
        String str2 = c39698HjU.A03;
        String str3 = c39698HjU.A04;
        Long l = c39698HjU.A02;
        FiltersLoggingInfo filtersLoggingInfo = c39698HjU.A00;
        int i = c41024IEt.A01;
        int i2 = c41024IEt.A00;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(imi.A01, "instagram_shopping_checker_tile_impression");
        if (A0f.isSampled()) {
            AbstractC37301Gc2.A0x(A0f, i, i2);
            AbstractC37300Gc1.A0n(A0f, imi.A02);
            AbstractC37300Gc1.A0q(A0f, imi.A03);
            AbstractC37300Gc1.A0m(A0f, str2);
            AbstractC25233BEq.A17(A0f, "shopping_session_id", imi.A04);
            if (str3 != null) {
                AbstractC37301Gc2.A17(A0f, str3);
            }
            if (filtersLoggingInfo != null) {
                HashMap hashMap = filtersLoggingInfo.A01;
                if (hashMap != null) {
                    str = (String) hashMap.get("sort_by");
                } else {
                    str = null;
                }
                A0f.AAP("sort_by", str);
                A0f.A9M("filters", filtersLoggingInfo.A00());
            }
            C38532Gwt c38532Gwt = imi.A00;
            if (c38532Gwt != null) {
                A0f.AAQ(c38532Gwt, "feed_item_info");
            }
            if (l != null) {
                AbstractC37304Gc5.A15(A0f, l, (l.longValue() > 0L ? 1 : (l.longValue() == 0L ? 0 : -1)));
            }
            A0f.Cht();
        }
    }

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
        String str;
        C39698HjU c39698HjU = (C39698HjU) obj;
        C41024IEt c41024IEt = (C41024IEt) obj2;
        AbstractC167017dG.A1N(c39698HjU, c41024IEt);
        IMI imi = this.A00;
        String str2 = c39698HjU.A03;
        String str3 = c39698HjU.A04;
        Long l = c39698HjU.A02;
        FiltersLoggingInfo filtersLoggingInfo = c39698HjU.A00;
        int i = c41024IEt.A01;
        int i2 = c41024IEt.A00;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(imi.A01, "instagram_shopping_checker_tile_sub_impression");
        if (A0f.isSampled()) {
            AbstractC37301Gc2.A0x(A0f, i, i2);
            AbstractC37300Gc1.A0n(A0f, imi.A02);
            AbstractC37300Gc1.A0q(A0f, imi.A03);
            AbstractC37300Gc1.A0m(A0f, str2);
            AbstractC25233BEq.A17(A0f, "shopping_session_id", imi.A04);
            if (str3 != null) {
                AbstractC37301Gc2.A17(A0f, str3);
            }
            if (filtersLoggingInfo != null) {
                HashMap hashMap = filtersLoggingInfo.A01;
                if (hashMap != null) {
                    str = (String) hashMap.get("sort_by");
                } else {
                    str = null;
                }
                A0f.AAP("sort_by", str);
                A0f.A9M("filters", filtersLoggingInfo.A00());
            }
            C38532Gwt c38532Gwt = imi.A00;
            if (c38532Gwt != null) {
                A0f.AAQ(c38532Gwt, "feed_item_info");
            }
            if (l != null) {
                AbstractC37304Gc5.A15(A0f, l, (l.longValue() > 0L ? 1 : (l.longValue() == 0L ? 0 : -1)));
            }
            A0f.Cht();
        }
    }

    public C39112HJk(C1BX c1bx, InterfaceC62702t9 interfaceC62702t9, IMI imi) {
        super(c1bx, interfaceC62702t9);
        this.A00 = imi;
    }
}
