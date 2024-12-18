package X;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.api.schemas.BrandedContentGatingInfoIntf;
import com.instagram.api.schemas.BrandedContentProjectMetadataIntf;
import com.instagram.common.session.UserSession;
import com.instagram.creation.fragment.EditMediaInfoFragment;
import com.instagram.model.venue.Venue;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;
import java.util.List;

/* renamed from: X.MbU, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50763MbU extends ClickableSpan {
    public final int A00;
    public final Object A01;

    public C50763MbU(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Double A2K;
        C140966Yy A0F;
        C63397SjR A0y;
        String str;
        C35133Fea c35133Fea;
        Context context;
        UserSession userSession;
        String str2;
        switch (this.A00) {
            case 0:
                EditMediaInfoFragment editMediaInfoFragment = (EditMediaInfoFragment) this.A01;
                editMediaInfoFragment.A0I.getClass();
                Location location = new Location("photo");
                Venue venue = editMediaInfoFragment.A0L;
                if (venue != null && venue.A00() != null && editMediaInfoFragment.A0L.A01() != null) {
                    location.setLatitude(editMediaInfoFragment.A0L.A00().doubleValue());
                    A2K = editMediaInfoFragment.A0L.A01();
                } else if (editMediaInfoFragment.A0I.A2J() != null && editMediaInfoFragment.A0I.A2K() != null) {
                    location.setLatitude(editMediaInfoFragment.A0I.A2J().doubleValue());
                    A2K = editMediaInfoFragment.A0I.A2K();
                } else {
                    location = editMediaInfoFragment.A01;
                    A0F = AbstractC31178DnM.A0F(editMediaInfoFragment);
                    AbstractC69933Cc.A01();
                    A0F.A0E(N5Z.A00(location, "EDIT_POST", null, editMediaInfoFragment.A0I.A1B(), false, false));
                    A0F.A0C = N5Z.class.getCanonicalName();
                    A0F.A04();
                    return;
                }
                location.setLongitude(A2K.doubleValue());
                A0F = AbstractC31178DnM.A0F(editMediaInfoFragment);
                AbstractC69933Cc.A01();
                A0F.A0E(N5Z.A00(location, "EDIT_POST", null, editMediaInfoFragment.A0I.A1B(), false, false));
                A0F.A0C = N5Z.class.getCanonicalName();
                A0F.A04();
                return;
            case 1:
                EditMediaInfoFragment editMediaInfoFragment2 = (EditMediaInfoFragment) this.A01;
                C38321qM c38321qM = editMediaInfoFragment2.A0I;
                if (c38321qM != null && c38321qM.A5X()) {
                    C54966OSw.A00(new C54966OSw(editMediaInfoFragment2.requireContext()), 2131961964, 2131961935);
                    return;
                }
                LL0.A02(editMediaInfoFragment2, editMediaInfoFragment2.getSession(), C05F.A0H, C05F.A0C, LB9.A00(editMediaInfoFragment2.getSession()));
                if (C4A4.A00(editMediaInfoFragment2.getSession())) {
                    UserSession session = editMediaInfoFragment2.getSession();
                    List list = editMediaInfoFragment2.A0g;
                    BrandedContentProjectMetadataIntf brandedContentProjectMetadataIntf = editMediaInfoFragment2.A05;
                    BrandedContentGatingInfoIntf brandedContentGatingInfoIntf = editMediaInfoFragment2.A04;
                    boolean z = editMediaInfoFragment2.A0q;
                    String str3 = editMediaInfoFragment2.A0R;
                    AbstractC167017dG.A1P(session, list);
                    Fragment A00 = AbstractC54944ORu.A00(brandedContentGatingInfoIntf, brandedContentProjectMetadataIntf, session, str3, "feed", list, false, false, true, false, z);
                    A0F = AbstractC31178DnM.A0F(editMediaInfoFragment2);
                    A0F.A0E(A00);
                    A0F.A04();
                    return;
                }
                FragmentActivity activity = editMediaInfoFragment2.getActivity();
                activity.getClass();
                C193328hC A0H = AbstractC31171DnF.A0H(activity);
                A0H.A0A(2131972195);
                A0H.A09(2131972196);
                DialogInterfaceOnClickListenerC55319Ogh.A01(A0H, editMediaInfoFragment2, 36, 2131972171);
                A0H.A06();
                AbstractC166987dD.A1W(A0H);
                return;
            case 2:
                C52125N4y c52125N4y = (C52125N4y) this.A01;
                A0y = AbstractC25228BEl.A0y(c52125N4y.requireActivity(), AbstractC166987dD.A0r(c52125N4y.A05), C2Fb.A3A, "https://help.instagram.com/1549313575265878");
                str = "recommend_to_facebook_optimization_upsell";
                A0y.A0S = str;
                A0y.A0A();
                return;
            case 3:
                C14360o3.A0B(view, 0);
                C12260kU.A0G(AbstractC166997dE.A0L(view), AbstractC08820cl.A03("https://help.instagram.com/1549313575265878"));
                return;
            case 4:
                N57 n57 = (N57) this.A01;
                FragmentActivity requireActivity = n57.requireActivity();
                InterfaceC09390do interfaceC09390do = n57.A08;
                UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
                A0y = new C63397SjR(requireActivity, A0r, C2Fb.A3B, C18U.A04(AbstractC25225BEi.A0j(A0o, 0), A0o, 36878036607434900L), false);
                str = "reels_share_to_fb_upsell_fragment";
                A0y.A0S = str;
                A0y.A0A();
                return;
            case 5:
                Intent intent = new Intent(AbstractC58317Pt9.A00(18));
                String A002 = AbstractC43591JPw.A00(88);
                Context context2 = (Context) this.A01;
                intent.setData(AbstractC08820cl.A03(AnonymousClass001.A0R(A002, context2.getPackageName())));
                context2.startActivity(intent);
                return;
            case 6:
                c35133Fea = SimpleWebViewActivity.A02;
                OBO obo = (OBO) this.A01;
                context = obo.A00;
                userSession = obo.A01;
                str2 = "https://www.facebook.com/policies/other-policies/ais-terms";
                c35133Fea.A02(context, userSession, new SimpleWebViewConfig(new SXK(str2)));
                return;
            case 7:
                c35133Fea = SimpleWebViewActivity.A02;
                OBO obo2 = (OBO) this.A01;
                context = obo2.A00;
                userSession = obo2.A01;
                str2 = "https://help.instagram.com/1145520429907666";
                c35133Fea.A02(context, userSession, new SimpleWebViewConfig(new SXK(str2)));
                return;
            case 8:
                C14360o3.A0B(view, 0);
                ((View.OnClickListener) this.A01).onClick(view);
                return;
            default:
                C51046Mgy A0O = AbstractC50523MSb.A0O((C52170N6z) this.A01);
                C05A c05a = A0O.A07;
                C51726Mt3 c51726Mt3 = (C51726Mt3) C51046Mgy.A00(A0O);
                boolean z2 = ((C51726Mt3) C51046Mgy.A00(A0O)).A08;
                boolean z3 = ((C51726Mt3) C51046Mgy.A00(A0O)).A0A;
                boolean z4 = c51726Mt3.A06;
                List list2 = (List) c51726Mt3.A03;
                List list3 = (List) c51726Mt3.A01;
                List list4 = (List) c51726Mt3.A02;
                boolean z5 = c51726Mt3.A05;
                String str4 = c51726Mt3.A04;
                boolean z6 = c51726Mt3.A08;
                boolean z7 = c51726Mt3.A0A;
                AbstractC167027dH.A13(list2, list3, list4);
                c05a.Egh(new C51726Mt3(str4, list2, list3, list4, z4, z5, z6, z2, z7, z3));
                return;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        boolean z;
        switch (this.A00) {
            case 0:
            case 1:
                textPaint.setUnderlineText(false);
                AbstractC166987dD.A1N(AbstractC31172DnG.A07(this.A01), textPaint, R.color.badge_color);
                return;
            case 2:
            case 3:
            case 4:
                z = false;
                C14360o3.A0B(textPaint, 0);
                super.updateDrawState(textPaint);
                textPaint.setColor(textPaint.linkColor);
                break;
            case 5:
                z = false;
                C14360o3.A0B(textPaint, 0);
                super.updateDrawState(textPaint);
                break;
            case 6:
            case 7:
            default:
                super.updateDrawState(textPaint);
                return;
            case 8:
                z = false;
                C14360o3.A0B(textPaint, 0);
                break;
            case 9:
                AbstractC25229BEm.A13(textPaint);
                textPaint.setFakeBoldText(true);
                return;
        }
        textPaint.setUnderlineText(z);
    }
}
