package X;

import android.widget.ListView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class Eg6 extends C1I2 implements GYO {
    public ListView A00;
    public final InterfaceC11380iw A01;
    public final EnumC40111tc A02;
    public final C31552Dtc A03;
    public final String A04;
    public final java.util.Set A05 = AbstractC166987dD.A1H();

    @Override // X.GYO
    public final void EHl(UserSession userSession, int i) {
        Object itemAtPosition;
        String id;
        String name;
        String A02;
        String str;
        ListView listView = this.A00;
        if (listView != null && (itemAtPosition = listView.getItemAtPosition(i)) != null) {
            if (E72.A00(itemAtPosition, 8)) {
                itemAtPosition = AbstractC31174DnI.A0k(userSession, ((com.instagram.tagging.model.Tag) ((E72) itemAtPosition).A00).getId());
            }
            if (itemAtPosition instanceof User) {
                User user = (User) itemAtPosition;
                id = user.getId();
                name = user.getUsername();
                A02 = user.B7L().toString();
                str = PublicKeyCredentialControllerUtility.JSON_KEY_USER;
            } else if (itemAtPosition instanceof Product) {
                Product product = (Product) itemAtPosition;
                id = product.A0H;
                name = product.A0J;
                A02 = null;
                str = "product";
            } else if (itemAtPosition instanceof Hashtag) {
                Hashtag hashtag = (Hashtag) itemAtPosition;
                id = hashtag.getId();
                name = hashtag.getName();
                A02 = AbstractC1120253r.A02(hashtag);
                str = "hashtag";
            } else {
                C0w9.A03("TaggedItemImpressionLogger", "Item not instance of TaggedUser, User, Product, or Hashtag");
                return;
            }
            if (this.A05.add(id)) {
                InterfaceC11380iw interfaceC11380iw = this.A01;
                String str2 = "";
                String str3 = "";
                if (id != null) {
                    str3 = id;
                }
                if (name != null) {
                    str2 = name;
                }
                String str4 = this.A04;
                EnumC40111tc enumC40111tc = this.A02;
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "instagram_tag_list_item_impression");
                if (A0f.isSampled()) {
                    A0f.A9K("entity_id", Long.valueOf(str3));
                    A0f.AAP("entity_name", str2);
                    A0f.AAP("entity_type", str);
                    A0f.A9K("list_position", AbstractC31171DnF.A0V(i));
                    A0f.AAP("m_pk", str4);
                    A0f.A9K("m_t", AbstractC31171DnF.A0V(enumC40111tc.A00));
                    A0f.AAP("follow_status", A02);
                    A0f.Cht();
                }
            }
        }
    }

    public Eg6(InterfaceC11380iw interfaceC11380iw, UserSession userSession, EnumC40111tc enumC40111tc, String str) {
        this.A01 = interfaceC11380iw;
        this.A04 = str;
        this.A02 = enumC40111tc;
        this.A03 = new C31552Dtc(userSession, this);
    }

    @Override // X.C1I2
    public final void onScroll(C3FQ c3fq, int i, int i2, int i3, int i4, int i5) {
        int A03 = C0f9.A03(-754360104);
        this.A03.onScroll(c3fq, i, i2, i3, i4, i5);
        C0f9.A0A(1184084559, A03);
    }

    @Override // X.C1I2
    public final void onScrollStateChanged(C3FQ c3fq, int i) {
        int A03 = C0f9.A03(1558680802);
        this.A03.onScrollStateChanged(c3fq, i);
        C0f9.A0A(2120155319, A03);
    }
}
