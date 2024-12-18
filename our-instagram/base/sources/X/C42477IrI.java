package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.api.schemas.OpenCarouselSubmissionState;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.IrI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42477IrI implements InterfaceC76813cT {
    public final UserSession A00;

    public C42477IrI(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.InterfaceC76813cT
    public final boolean EjR(C38321qM c38321qM, C75113Zb c75113Zb, int i) {
        AbstractC167007dF.A1D(c38321qM, 0, c75113Zb);
        if (!c75113Zb.A2k && !c38321qM.A5G()) {
            int A0r = c38321qM.A0r();
            OpenCarouselSubmissionState BZ5 = c38321qM.A0C.BZ5();
            if (BZ5 == null) {
                return false;
            }
            if ((BZ5 != OpenCarouselSubmissionState.A07 && BZ5 != OpenCarouselSubmissionState.A09) || A0r <= 0) {
                return false;
            }
            return AbstractC31176DnK.A1a(C06090Tz.A05, this.A00, 2342163254124093611L);
        }
        c75113Zb.A2k = true;
        return false;
    }

    @Override // X.InterfaceC76813cT
    public final /* synthetic */ boolean Ejq() {
        return false;
    }

    @Override // X.InterfaceC76813cT
    public final Integer BEt() {
        return Integer.valueOf(R.drawable.instagram_collage_pano_outline_24);
    }

    @Override // X.InterfaceC76813cT
    public final CharSequence C5v(Context context, UserSession userSession, C38321qM c38321qM, C75113Zb c75113Zb) {
        AbstractC167017dG.A1N(context, c38321qM);
        String A0k = AbstractC167017dG.A0k(context.getResources(), c38321qM.A0r(), R.plurals.open_carousel_review_media_cta_label);
        C14360o3.A07(A0k);
        return A0k;
    }

    @Override // X.InterfaceC76813cT
    public final /* synthetic */ String BTZ(Context context, C38321qM c38321qM, C75113Zb c75113Zb) {
        return null;
    }

    @Override // X.InterfaceC76813cT
    public final /* synthetic */ List Bre(C38321qM c38321qM, C75113Zb c75113Zb) {
        return null;
    }

    @Override // X.InterfaceC76813cT
    public final /* synthetic */ boolean EjP(UserSession userSession, C38321qM c38321qM, C75113Zb c75113Zb) {
        return false;
    }

    @Override // X.InterfaceC76813cT
    public final /* synthetic */ boolean EjQ(UserSession userSession, C38321qM c38321qM) {
        return false;
    }

    @Override // X.InterfaceC76813cT
    public final /* synthetic */ CharSequence Brc(Context context, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb) {
        return null;
    }
}
