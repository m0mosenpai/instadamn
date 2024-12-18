package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;
import com.instagram.model.venue.Venue;
import java.util.List;

/* loaded from: classes11.dex */
public final class V1D extends AbstractC59962oe implements JPX {
    public static final String __redex_internal_original_name = "LocationSheetFragment";
    public UserSession A00;
    public Venue A01;
    public AbstractC140596Xn A02;
    public C69177Vj6 A03;
    public C69366VmC A04;
    public String A05;
    public List A06;
    public View A07;
    public C69236Vk4 A08;
    public C68827Vci A09;
    public C69425VnA A0A;
    public C69147Vic A0B;
    public String A0C;
    public final XDP A0F = new C70962Wl9(this);
    public final InterfaceC71955XCh A0E = new C70959Wl6(this);
    public final C1P1 A0D = new V3X(this, 3);
    public final InterfaceC71930XAy A0G = new C70988Wly(this);
    public final X8S A0H = new Wm0(this);

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [X.VJU, java.lang.Object] */
    public static void A00(V1D v1d) {
        Context requireContext = v1d.requireContext();
        UserSession userSession = v1d.A00;
        C69425VnA c69425VnA = v1d.A0A;
        C69366VmC c69366VmC = v1d.A04;
        ImageUrl imageUrl = c69366VmC.A00;
        Integer num = C05F.A0C;
        ?? obj = new Object();
        obj.A02 = num;
        obj.A01 = imageUrl;
        obj.A00 = null;
        C70986Wlw c70986Wlw = new C70986Wlw(v1d, 1);
        String str = c69366VmC.A05;
        Reel reel = c69366VmC.A01;
        InterfaceC71930XAy interfaceC71930XAy = v1d.A0G;
        String str2 = c69366VmC.A03;
        String str3 = c69366VmC.A04;
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            str3 = TextUtils.concat(str2, " · ", str3).toString();
        } else if (!TextUtils.isEmpty(str2)) {
            str3 = str2;
        } else if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        VW1.A00(requireContext, v1d, userSession, new C69447VnW(reel, c70986Wlw, obj, interfaceC71930XAy, str3, v1d.A04.A02, str, null, false, false, false), c69425VnA);
        AbstractC70052W0m.A00(null, v1d.A09, v1d.A01);
    }

    @Override // X.JPX
    public final Integer BlT() {
        return C05F.A04;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return I58.A00(this, this.A0C);
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A00;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        int A02 = C0f9.A02(1217543919);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = AbstractC31176DnK.A0S(this);
        Parcelable parcelable = requireArguments.getParcelable("args_venue");
        parcelable.getClass();
        this.A01 = (Venue) parcelable;
        String string = requireArguments.getString(AbstractC111324zv.A00(44));
        string.getClass();
        this.A0C = string;
        this.A05 = AbstractC166997dE.A0n();
        String str2 = "";
        if (this.A01.A00.getName() == null) {
            str = "";
        } else {
            str = this.A01.A00.getName();
        }
        if (this.A01.A00.getAddress() != null) {
            str2 = this.A01.A00.getAddress();
        }
        this.A04 = new C69366VmC(null, null, str, str2, this.A01.A00.getCategory(), WFD.A02(requireContext(), this.A00, this.A01, "REELS_LOCATION_SHEET"));
        this.A08 = new C69236Vk4(AbstractC31178DnM.A0L(this));
        C0f9.A09(1206487879, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1272038233);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.location_sheet_fragment);
        C0f9.A09(1935033008, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1826603930);
        super.onDestroyView();
        this.A02 = null;
        C0f9.A09(485561215, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-1442387439);
        super.onResume();
        C69236Vk4 c69236Vk4 = this.A08;
        UserSession userSession = this.A00;
        String A05 = this.A01.A05();
        XDP xdp = this.A0F;
        boolean A1a = AbstractC167017dG.A1a(userSession, A05);
        if (c69236Vk4.A02.add(A05)) {
            C25621Ms A0N = AbstractC31173DnH.A0N(userSession);
            A0N.A0L("locations/%s/story/", A05);
            C1ON A0S = AbstractC31172DnG.A0S(A0N, C67828Uz1.class, C69962Vyd.class);
            A0S.A00 = new C67954V3t(12, xdp, userSession);
            c69236Vk4.A00.schedule(A0S);
        }
        C69236Vk4 c69236Vk42 = this.A08;
        UserSession userSession2 = this.A00;
        String A052 = this.A01.A05();
        InterfaceC71955XCh interfaceC71955XCh = this.A0E;
        AbstractC25230BEn.A15(A1a ? 1 : 0, userSession2, A052);
        if (c69236Vk42.A01.add(A052)) {
            if (C18U.A06(C06090Tz.A05, userSession2, 36319604959616567L)) {
                C40701ud A01 = AbstractC40691uc.A01(userSession2);
                PandoGraphQLRequest A00 = AbstractC69958VyZ.A00(A052);
                A01.ATV(new C70434WVm(interfaceC71955XCh, 8), new C64024Sxv(A052, interfaceC71955XCh, 5), A00);
            } else {
                c69236Vk42.A00.schedule(AbstractC69958VyZ.A01(userSession2, interfaceC71955XCh, A052));
            }
        }
        C0f9.A09(1355040350, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A0A = new C69425VnA((ViewGroup) view.requireViewById(R.id.header_container));
        this.A09 = new C68827Vci(view);
        this.A07 = view.requireViewById(R.id.horizontal_divider);
        this.A0B = new C69147Vic((ViewGroup) view.requireViewById(R.id.media_preview_grid));
        A00(this);
    }
}
