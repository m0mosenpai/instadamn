package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.NoteCustomThemeImpl;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public final class HKH extends LA1 {
    public HKH() {
        super(C4FM.class);
    }

    @Override // X.LA1
    public final int A00() {
        return 1;
    }

    @Override // X.LA1
    public final /* bridge */ /* synthetic */ String A02(Object obj) {
        C4FM c4fm = (C4FM) obj;
        C14360o3.A0B(c4fm, 0);
        return c4fm.A0A;
    }

    @Override // X.LA1
    public final /* bridge */ /* synthetic */ void A03(AnonymousClass182 anonymousClass182, Object obj) {
        C4FM c4fm = (C4FM) obj;
        C14360o3.A0B(c4fm, 0);
        anonymousClass182.A0d();
        AbstractC37301Gc2.A1D(anonymousClass182, c4fm.A0A);
        User user = c4fm.A06;
        if (user != null) {
            AbstractC37300Gc1.A0x(anonymousClass182, user, PublicKeyCredentialControllerUtility.JSON_KEY_USER);
        }
        anonymousClass182.A0T("is_self_note", c4fm.A0G);
        Map map = c4fm.A0E;
        if (map != null) {
            anonymousClass182.A0r("thumbnail_urls");
            anonymousClass182.A0d();
            Iterator A15 = AbstractC166997dE.A15(map);
            while (A15.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A15);
                if (!C16V.A04(anonymousClass182, A1K)) {
                    AbstractC222616c.A01(anonymousClass182, (ImageUrl) A1K.getValue());
                }
            }
            anonymousClass182.A0a();
        }
        anonymousClass182.A0Q("inventory_count", c4fm.A02);
        anonymousClass182.A0T(AbstractC58317Pt9.A00(103), c4fm.A0F);
        List list = c4fm.A0D;
        if (list != null) {
            Iterator A0q = AbstractC37301Gc2.A0q(anonymousClass182, "users", list);
            while (A0q.hasNext()) {
                AbstractC167017dG.A1G(anonymousClass182, A0q);
            }
            anonymousClass182.A0Z();
        }
        anonymousClass182.A0Q("index", c4fm.A01);
        anonymousClass182.A0Q("last_visible_content_note_timestamp", c4fm.A03);
        anonymousClass182.A0Q(AbstractC111324zv.A00(2764), c4fm.A04);
        String str = c4fm.A0C;
        if (str != null) {
            anonymousClass182.A0S("stack_style", str);
        }
        String str2 = c4fm.A0B;
        if (str2 != null) {
            anonymousClass182.A0S("pog_style", str2);
        }
        String str3 = c4fm.A08;
        if (str3 != null) {
            anonymousClass182.A0S("cover_note_id", str3);
        }
        String str4 = c4fm.A09;
        if (str4 != null) {
            anonymousClass182.A0S("cover_note_text", str4);
        }
        Boolean bool = c4fm.A07;
        if (bool != null) {
            anonymousClass182.A0T("viewer_has_liked", bool.booleanValue());
        }
        NoteCustomThemeImpl noteCustomThemeImpl = c4fm.A05;
        if (noteCustomThemeImpl != null) {
            anonymousClass182.A0r("custom_theme");
            AbstractC103504lQ.A00(anonymousClass182, noteCustomThemeImpl);
        }
        anonymousClass182.A0a();
    }

    @Override // X.LA1
    public final /* bridge */ /* synthetic */ Object A01(C16L c16l) {
        C4FM parseFromJson = AbstractC40580Hz0.parseFromJson(c16l);
        C14360o3.A07(parseFromJson);
        return parseFromJson;
    }
}
