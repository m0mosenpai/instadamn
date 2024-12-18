package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import java.util.LinkedHashSet;

/* renamed from: X.Wi8, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70842Wi8 implements InterfaceC43071ya {
    public final java.util.Set A00 = new LinkedHashSet();
    public final C41587Iaa A01;

    public C70842Wi8(C41587Iaa c41587Iaa) {
        this.A01 = c41587Iaa;
    }

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        boolean A1a = AbstractC167017dG.A1a(c59062n7, interfaceC57162jr);
        if (interfaceC57162jr.CFq(c59062n7) == C05F.A00 && this.A00.add("map_tile_with_pins")) {
            C41587Iaa c41587Iaa = this.A01;
            Object obj = c59062n7.A04;
            C14360o3.A06(obj);
            Hashtag hashtag = (Hashtag) obj;
            C14360o3.A0B(hashtag, A1a ? 1 : 0);
            UserSession userSession = c41587Iaa.A01;
            InterfaceC11380iw interfaceC11380iw = c41587Iaa.A00;
            String str = c41587Iaa.A03;
            C14360o3.A0A(str);
            String id = hashtag.getId();
            String str2 = "";
            if (id == null) {
                id = "";
            }
            String name = hashtag.getName();
            if (name != null) {
                str2 = name;
            }
            C18920wW A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
            C25531Mh c25531Mh = new C25531Mh(A01.A00(A01.A00, "ig_discovery_map"), 217);
            c25531Mh.A0j("instagram_map_entry_point_impression");
            c25531Mh.A0R("container_module", interfaceC11380iw.getModuleName());
            c25531Mh.A0R("map_session_id", str);
            c25531Mh.A0R("search_id", id);
            c25531Mh.A0R("search_type", VEZ.A03.toString());
            c25531Mh.A0R("search_query", AnonymousClass001.A0R("#", str2));
            c25531Mh.Cht();
        }
    }
}
