package X;

import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.Wns, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71096Wns implements XBR {
    public final /* synthetic */ V0V A00;
    public final /* synthetic */ SearchEditText A01;

    public C71096Wns(V0V v0v, SearchEditText searchEditText) {
        this.A00 = v0v;
        this.A01 = searchEditText;
    }

    @Override // X.XBR
    public final void DTS() {
        String str;
        V0V v0v = this.A00;
        C18920wW c18920wW = (C18920wW) v0v.A0a.getValue();
        String str2 = C1QM.A00.A02.A00;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        String A04 = v0v.A04();
        SearchEditText searchEditText = this.A01;
        AbstractC66181U2w.A01(c18920wW, str2, A04, searchEditText.getSearchString(), v0v.A05());
        C66151U1s A02 = v0v.A02();
        InterfaceC09390do interfaceC09390do = v0v.A0Z;
        AbstractC12990ll abstractC12990ll = (AbstractC12990ll) interfaceC09390do.getValue();
        C14360o3.A0B(abstractC12990ll, 0);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, abstractC12990ll, 36327950081997814L)) {
            str3 = searchEditText.getSearchString();
        }
        if (C18U.A06(c06090Tz, AbstractC25230BEn.A0k(interfaceC09390do, 0), 36327950081997814L)) {
            str = searchEditText.getSearchString();
        } else {
            str = null;
        }
        A02.A05(null, "core_search_serp_meta_ai_icon", str3, str, null);
    }
}
