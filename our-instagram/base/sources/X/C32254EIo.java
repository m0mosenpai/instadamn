package X;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.user.model.User;

/* renamed from: X.EIo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32254EIo extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "CelebrateBirthdayBottomSheetFragment";
    public View A00;
    public IgdsListCell A01;
    public IgdsListCell A02;
    public IgdsListCell A03;
    public User A04;
    public C31294DpG A05;
    public String A06;
    public boolean A07;
    public final InterfaceC09390do A08 = AbstractC60492pY.A02(this);
    public final View.OnClickListener A0A = ViewOnClickListenerC35689FpO.A00(this, 43);
    public final View.OnClickListener A0B = ViewOnClickListenerC35689FpO.A00(this, 44);
    public final View.OnClickListener A09 = ViewOnClickListenerC35689FpO.A00(this, 42);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Object parcelable;
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        String string = requireArguments().getString("DISPLAY_NAME_ARGUMENT");
        AbstractC31177DnL.A0r(requireContext(), AbstractC31178DnM.A0C(view), string, 2131954848);
        IgdsListCell igdsListCell = this.A01;
        if (igdsListCell != null) {
            igdsListCell.A0G(EnumC53237Nga.A04, true);
        }
        IgdsListCell igdsListCell2 = this.A01;
        if (igdsListCell2 != null) {
            igdsListCell2.A0I(AbstractC31177DnL.A0b(requireContext(), string, 2131954850));
        }
        IgdsListCell igdsListCell3 = this.A01;
        if (igdsListCell3 != null) {
            C0fQ.A00(this.A0A, igdsListCell3);
        }
        IgdsListCell igdsListCell4 = this.A02;
        if (igdsListCell4 != null) {
            igdsListCell4.A0G(EnumC53237Nga.A04, true);
        }
        IgdsListCell igdsListCell5 = this.A02;
        if (igdsListCell5 != null) {
            C0fQ.A00(this.A0B, igdsListCell5);
        }
        IgdsListCell igdsListCell6 = this.A03;
        if (igdsListCell6 != null) {
            igdsListCell6.A0G(EnumC53237Nga.A04, true);
        }
        IgdsListCell igdsListCell7 = this.A03;
        if (igdsListCell7 != null) {
            C0fQ.A00(this.A09, igdsListCell7);
        }
        IgImageView A0T = AbstractC167007dF.A0T(view, R.id.celebrate_birthday_profile_pic);
        Bundle requireArguments = requireArguments();
        int i = Build.VERSION.SDK_INT;
        String A00 = AbstractC111324zv.A00(1711);
        if (i >= 33) {
            parcelable = requireArguments.getParcelable(A00, ImageUrl.class);
        } else {
            parcelable = requireArguments.getParcelable(A00);
        }
        ImageUrl imageUrl = (ImageUrl) parcelable;
        if (imageUrl != null) {
            A0T.setUrl(imageUrl, this);
        }
        User user = this.A04;
        if (user != null) {
            InterfaceC09390do interfaceC09390do = this.A08;
            if (AbstractC73003Pb.A02(AbstractC166987dD.A0r(interfaceC09390do), user)) {
                if (C18U.A06(C06090Tz.A05, AbstractC25230BEn.A0k(interfaceC09390do, 1), 36319480405695956L)) {
                    CircularImageView A0U = AbstractC31176DnK.A0U(view, R.id.birthday_confetti_circular_imageview);
                    AbstractC73003Pb.A00(requireContext(), A0U);
                    AbstractC73003Pb.A01(A0U.getDrawable());
                }
            }
        }
        String string2 = requireArguments.getString("USER_ID_ARGUMENT");
        if (string2 != null && !this.A07 && (str = this.A06) != null) {
            C31294DpG c31294DpG = this.A05;
            if (c31294DpG == null) {
                C14360o3.A0F("birthdayLogger");
                throw C00O.createAndThrow();
            }
            long parseLong = Long.parseLong(string2);
            long A04 = AbstractC31178DnM.A04(this.A08);
            String str2 = "story";
            if (!str.equals("story")) {
                str2 = "profile";
            }
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c31294DpG.A00, "ig_birthday_opt_in_impression");
            if (A0f.isSampled()) {
                A0f.A9K("celebrant_id", Long.valueOf(parseLong));
                C31294DpG.A00(A0f, Long.valueOf(A04), str2, "bottomsheet", null);
            }
            this.A07 = true;
        }
    }

    public static final void A00(C32254EIo c32254EIo, String str, String str2) {
        String str3 = c32254EIo.A06;
        if (str3 != null) {
            C31294DpG c31294DpG = c32254EIo.A05;
            if (c31294DpG == null) {
                C14360o3.A0F("birthdayLogger");
                throw C00O.createAndThrow();
            }
            long parseLong = Long.parseLong(str);
            long A04 = AbstractC31178DnM.A04(c32254EIo.A08);
            String str4 = "story";
            if (!str3.equals("story")) {
                str4 = "profile";
            }
            c31294DpG.A02(str4, "bottomsheet", str2, parseLong, A04);
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A08);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(731374743);
        super.onCreate(bundle);
        this.A05 = new C31294DpG(this, AbstractC166987dD.A0r(this.A08));
        this.A06 = requireArguments().getString("ENTRY_POINT");
        C0f9.A09(-729994909, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-184944767);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.celebrate_birthday_bottomsheet_fragment, viewGroup, false);
        this.A00 = inflate.requireViewById(R.id.loading_spinner);
        this.A01 = AbstractC31173DnH.A0Y(inflate, R.id.see_shared_stories);
        this.A02 = AbstractC31173DnH.A0Y(inflate, R.id.send_confetti);
        this.A03 = AbstractC31173DnH.A0Y(inflate, R.id.manage_settings);
        InterfaceC09390do interfaceC09390do = this.A08;
        this.A04 = AbstractC31176DnK.A0h(interfaceC09390do).A02(requireArguments().getString("USER_ID_ARGUMENT"));
        View view = this.A00;
        if (view != null) {
            view.setVisibility(0);
        }
        IgdsListCell igdsListCell = this.A02;
        if (igdsListCell != null) {
            igdsListCell.setVisibility(4);
        }
        IgdsListCell igdsListCell2 = this.A03;
        if (igdsListCell2 != null) {
            igdsListCell2.setVisibility(4);
        }
        User user = this.A04;
        if (user != null) {
            AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
            String id = user.getId();
            C14360o3.A0B(A0o, 0);
            C25621Ms A0q = AbstractC25228BEl.A0q(A0o);
            A0q.A06();
            A0q.A03();
            A0q.A0B("api/v1/stories/follow_versaries/get_shared_memories/");
            A0q.A0R(EAN.class, C34747FSm.class);
            C1ON A0T = AbstractC31172DnG.A0T(A0q, "follower_id", id);
            C14360o3.A0C(A0T, "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.SharedMemoriesResponse>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.SharedMemoriesResponse>>");
            C31456Ds0.A00(A0T, user, this, 52);
            schedule(A0T);
        }
        C0f9.A09(-2147380250, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1385711226);
        super.onDestroyView();
        this.A00 = null;
        this.A01 = null;
        this.A02 = null;
        this.A03 = null;
        C0f9.A09(-826992853, A02);
    }
}
