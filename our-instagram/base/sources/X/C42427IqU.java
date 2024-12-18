package X;

import com.instagram.discovery.refinement.model.Refinement;
import com.instagram.model.keyword.Keyword;

/* renamed from: X.IqU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42427IqU implements InterfaceC43407JFx {
    public final /* synthetic */ C38934HCh A00;

    public C42427IqU(C38934HCh c38934HCh) {
        this.A00 = c38934HCh;
    }

    @Override // X.InterfaceC43407JFx
    public final void ClG(Refinement refinement, int i) {
        String str;
        C38934HCh c38934HCh = this.A00;
        C38107Gpa c38107Gpa = c38934HCh.A09;
        if (c38107Gpa == null) {
            C14360o3.A0F("keywordRefinementItemLogger");
            throw C00O.createAndThrow();
        }
        String str2 = c38934HCh.A0D;
        if (str2 == null) {
            str2 = "";
        }
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c38107Gpa.A00, "instagram_refinement_item_click");
        if (A0f.isSampled()) {
            AbstractC31175DnJ.A0z(A0f, i);
            A0f.AAP(AbstractC37314GcG.A00(), c38107Gpa.A02);
            A0f.AAP("search_session_id", c38107Gpa.A03);
            Keyword keyword = c38107Gpa.A01;
            String str3 = null;
            if (keyword != null) {
                str = keyword.A03;
            } else {
                str = null;
            }
            A0f.AAP("entity_page_id", str);
            if (keyword != null) {
                str3 = keyword.A04;
            }
            A0f.AAP("entity_page_name", str3);
            A0f.AAP("entity_page_type", "keyword");
            A0f.AAP("entity_id", refinement.A00());
            A0f.AAP("entity_name", refinement.A01);
            A0f.AAP("entity_type", refinement.A00.A01.toString());
            A0f.AAP("entity_unit", "title_bar");
            A0f.AAP("entity_unit_style", "hscroll");
            A0f.AAP("entity_unit_source", "refinement");
            AbstractC25233BEq.A17(A0f, "rank_token", str2);
            A0f.Cht();
        }
    }
}
