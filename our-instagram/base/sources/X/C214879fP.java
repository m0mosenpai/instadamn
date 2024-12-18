package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.api.schemas.NonprofitSelectorSurfaceEnum;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.9fP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C214879fP extends AbstractC59962oe implements InterfaceC186118Nf {
    public static final String __redex_internal_original_name = "CanvasFundraiserStickerBottomSheetFragment";
    public A5K A00;
    public ViewStub A01;
    public UserSession A02;
    public C56247Oxu A03;

    @Override // X.InterfaceC186118Nf
    public final void Cuu(C214499en c214499en) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "canvas_fundraiser_sticker_bottom_sheet_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ViewStub viewStub = (ViewStub) view.requireViewById(R.id.canvas_fundraiser_sticker_search_stub);
        this.A01 = viewStub;
        UserSession userSession = this.A02;
        C56247Oxu c56247Oxu = new C56247Oxu(requireActivity(), viewStub, this, NonprofitSelectorSurfaceEnum.A05, this, userSession, this, AbstractC166997dE.A0a(), "CREATE_MODE_NULLSTATE");
        this.A03 = c56247Oxu;
        c56247Oxu.E2K();
    }

    @Override // X.InterfaceC186118Nf
    public final void DIl(User user, String str) {
        A5K a5k = this.A00;
        if (a5k != null) {
            C218009kY c218009kY = a5k.A00;
            Context context = c218009kY.A05;
            C14360o3.A0A(user);
            AlB A01 = AbstractC209909Qc.A01(context, user, "CREATE_MODE_NULLSTATE");
            C88Y c88y = c218009kY.A09;
            C14360o3.A0A(c88y);
            c88y.A08(c218009kY.A0D);
            c218009kY.A0B.E4u(new C187968Un(A01));
            C3DN A012 = C3DN.A00.A01(getContext());
            A012.getClass();
            A012.A0B();
        }
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A02;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-422173836);
        super.onCreate(bundle);
        this.A02 = AbstractC166987dD.A0r(AbstractC60492pY.A02(this));
        C0f9.A09(983994210, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-379030675);
        View inflate = layoutInflater.inflate(R.layout.canvas_fundraiser_sticker_bottom_sheet, viewGroup, false);
        C0f9.A09(-902666958, A02);
        return inflate;
    }
}
