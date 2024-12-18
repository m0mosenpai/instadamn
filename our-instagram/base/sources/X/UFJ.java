package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.PandoGraphQLRequest;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.AdsAPIInstagramPosition;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public final class UFJ extends AbstractC52922bZ {
    public C38321qM A00;
    public Map A01;
    public final C2GT A02;
    public final XIGIGBoostCallToAction A03;
    public final XIGIGBoostDestination A04;
    public final UserSession A05;
    public final AudioOverlayTrack A06;
    public final String A07;
    public final String A08;
    public final List A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final C69289Vkx A0H;

    public UFJ(XIGIGBoostCallToAction xIGIGBoostCallToAction, XIGIGBoostDestination xIGIGBoostDestination, C69289Vkx c69289Vkx, UserSession userSession, AudioOverlayTrack audioOverlayTrack, String str, String str2, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        Object obj;
        AbstractC25233BEq.A0w(1, userSession, xIGIGBoostDestination, str);
        this.A05 = userSession;
        this.A0H = c69289Vkx;
        this.A04 = xIGIGBoostDestination;
        this.A07 = str;
        this.A03 = xIGIGBoostCallToAction;
        this.A09 = list;
        this.A0C = z;
        this.A0D = z2;
        this.A0B = z3;
        this.A0F = z4;
        this.A0G = z5;
        this.A0E = z6;
        this.A08 = str2;
        this.A06 = audioOverlayTrack;
        this.A00 = C1DW.A00(userSession).A02(AnonymousClass001.A0T(str, userSession.userId, '_'));
        this.A01 = new LinkedHashMap();
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (obj == AdsAPIInstagramPosition.A0A) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        AdsAPIInstagramPosition adsAPIInstagramPosition = (AdsAPIInstagramPosition) obj;
        this.A0A = adsAPIInstagramPosition != null ? C6PZ.A03(adsAPIInstagramPosition, xIGIGBoostDestination, userSession) : false;
        C2JM c2jm = new C2JM();
        C2JM c2jm2 = new C2JM();
        UserSession userSession2 = c69289Vkx.A01;
        boolean A1X = AbstractC43594JPz.A1X(c2jm, PublicKeyCredentialControllerUtility.JSON_KEY_ID, userSession2.userId);
        c2jm.A04("media_id", c69289Vkx.A03);
        c2jm.A04("call_to_action", c69289Vkx.A02);
        c2jm.A05("instagram_positions", c69289Vkx.A00);
        c2jm.A05("regulated_categories", ImmutableList.copyOf((Collection) c69289Vkx.A04));
        this.A02 = AbstractC58232lf.A00(AnonymousClass191.A00, AbstractC208910l.A01(new Jw7(null, true), AbstractC141776au.A00(this), new MWG(12, this, new C50540MSt(new C43818JZg(new MC5(c69289Vkx, null, 36), AbstractC40691uc.A01(userSession2).A05(new PandoGraphQLRequest(AbstractC25227BEk.A0U(A1X), "IGBoostPlacementWebviewPreviewInfoQuery", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), C67565Urj.class, false, null, 0, null, "xig_user_by_igid_v2", new ArrayList())), 15), 15)), C10I.A00));
    }
}
