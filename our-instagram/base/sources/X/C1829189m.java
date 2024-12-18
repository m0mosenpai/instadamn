package X;

import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import org.json.JSONObject;

/* renamed from: X.89m, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1829189m {
    public final /* synthetic */ ViewGroup A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ C1815283f A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ AnonymousClass860 A04;
    public final /* synthetic */ C1814582x A05;
    public final /* synthetic */ ClipsCreationViewModel A06;
    public final /* synthetic */ C1816283r A07;
    public final /* synthetic */ C1828989k A08;

    public final void A01(C2AH c2ah, String str) {
        C121275eQ c121275eQ;
        C14360o3.A0B(c2ah, 0);
        C14360o3.A0B(str, 1);
        if (this.A08.A06.A02() == EnumC1829089l.A02) {
            C23084AFq.A02.getValue();
            if (C14360o3.A0K(C23084AFq.A01, str) && (c121275eQ = C23084AFq.A00) != null) {
                c121275eQ.A00 = c2ah;
            }
        }
    }

    public C1829189m(ViewGroup viewGroup, FragmentActivity fragmentActivity, C1815283f c1815283f, UserSession userSession, AnonymousClass860 anonymousClass860, C1814582x c1814582x, ClipsCreationViewModel clipsCreationViewModel, C1816283r c1816283r, C1828989k c1828989k) {
        this.A06 = clipsCreationViewModel;
        this.A01 = fragmentActivity;
        this.A02 = c1815283f;
        this.A08 = c1828989k;
        this.A04 = anonymousClass860;
        this.A07 = c1816283r;
        this.A05 = c1814582x;
        this.A00 = viewGroup;
        this.A03 = userSession;
    }

    public final void A00() {
        C84B c84b = (C84B) this.A06.A0G.A02();
        if (c84b != null) {
            C1828989k c1828989k = this.A08;
            C1815283f c1815283f = this.A02;
            if (c1828989k.A03.A02() instanceof C171757l5) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("clipStartTimeMs", c84b.A00);
                c1815283f.A00().A0A(jSONObject);
            }
        }
    }
}
