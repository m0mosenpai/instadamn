package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* renamed from: X.W5p, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70128W5p {
    public final C70106W4d A00;
    public final XA1 A01;
    public final HashMap A02;
    public final Map A03;
    public final Map A04;
    public final Map A05;
    public final Map A06;
    public final Map A07;
    public final Map A08;
    public final Map A09;
    public final Map A0A;
    public final Map A0B;
    public final java.util.Set A0C;
    public final Map A0D;
    public final InterfaceC16660sJ A0E;
    public final InterfaceC16660sJ A0F;

    public final XA2 A00(String str) {
        C14360o3.A0B(str, 0);
        XA2 xa2 = (XA2) this.A0D.get(this.A0F.invoke(str));
        if (xa2 == null) {
            return new C70580WdF();
        }
        return xa2;
    }

    public final String A01(InterfaceC71973XDg interfaceC71973XDg) {
        C14360o3.A0B(interfaceC71973XDg, 0);
        CharSequence charSequence = (CharSequence) C71802X5g.A00.invoke(interfaceC71973XDg.BxO());
        if (charSequence.length() == 0) {
            charSequence = "Unknown";
        }
        return (String) charSequence;
    }

    public final String A02(InterfaceC71973XDg interfaceC71973XDg, String str) {
        Map A0E;
        C14360o3.A0B(str, 1);
        if (AbstractC001900j.A0a(interfaceC71973XDg.BxO(), "gnv", false)) {
            A0E = this.A06;
        } else if (AbstractC001900j.A0a(interfaceC71973XDg.BxO(), "Distillery", true)) {
            A0E = this.A07;
        } else if (AbstractC001900j.A0a(interfaceC71973XDg.BxO(), "alevent", false)) {
            A0E = this.A03;
        } else if (AbstractC001900j.A0a(interfaceC71973XDg.BxO(), "virtual", false)) {
            A0E = this.A0B;
        } else if (AbstractC001900j.A0a(interfaceC71973XDg.BxO(), "share_event", false)) {
            A0E = this.A08;
        } else {
            A0E = AbstractC06930Yk.A0E();
        }
        String str2 = (String) A0E.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public C70128W5p(String str) {
        C70106W4d c70106W4d = new C70106W4d(str);
        this.A00 = c70106W4d;
        this.A04 = c70106W4d.A01;
        this.A01 = C70106W4d.A07;
        this.A0A = c70106W4d.A02;
        this.A0E = C71802X5g.A00;
        this.A0F = new C50356MLi(c70106W4d, 13);
        this.A0D = c70106W4d.A04;
        HashSet hashSet = new HashSet(c70106W4d.A05);
        this.A0C = hashSet;
        String A00 = AbstractC111324zv.A00(1021);
        hashSet.add(A00);
        hashSet.add("navigation");
        String A002 = AbstractC111324zv.A00(2564);
        hashSet.add(A002);
        this.A02 = AbstractC167017dG.A0r("link_click_virtual_event:link_click:primary:0", "link click primary event");
        this.A05 = AbstractC06930Yk.A02(AbstractC167007dF.A1b("alevent:instagram_open_application", AbstractC166987dD.A1J(new C09530e4(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, A002)), new C09530e4("alevent:media_metric_event", AbstractC166987dD.A1J(new C09530e4(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, A00))), new C09530e4("alevent:navigation_event", AbstractC166987dD.A1J(new C09530e4(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "navigation")))));
        String A003 = AbstractC111324zv.A00(4392);
        this.A09 = AbstractC06930Yk.A02(new C09530e4("alevent:media_metric_event", AbstractC166987dD.A1J(A003)), new C09530e4("alevent:navigation_event", AbstractC166987dD.A1J(A003)), new C09530e4("alevent:instagram_open_application", AbstractC166987dD.A1J(A003)), new C09530e4("link_click_virtual_event:link_click:primary:0", C16930sl.A00));
        this.A07 = AbstractC06930Yk.A06(new C09530e4("media_pk", "media_id"), new C09530e4(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, "_uid"), new C09530e4("target_user_id", AbstractC111324zv.A00(2393)), new C09530e4("container_module", "container_module"));
        this.A06 = AbstractC06930Yk.A06(new C09530e4("media_pk", "m_pk"), new C09530e4(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, "pk"), new C09530e4("destination_uri", "after_module_uri"), new C09530e4("target_user_id", AbstractC111324zv.A00(843)), new C09530e4("container_module", "module"));
        this.A03 = AbstractC16850sd.A0M(new C09530e4(A003, A003));
        this.A0B = AbstractC25233BEq.A0p("container_module", "module", new C09530e4("destination_uri", "dest_uri"));
        this.A08 = AbstractC167007dF.A0n("media_pk", "m_pk");
    }

    public C70128W5p() {
        this("");
    }
}
