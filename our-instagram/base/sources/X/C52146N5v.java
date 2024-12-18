package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType;
import java.io.Serializable;

/* renamed from: X.N5v, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52146N5v extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "PublishScreenCategorySubFragment";
    public C51150Mit A00;
    public OX2 A01;
    public PublishScreenCategoryType A02;
    public boolean A03;
    public RecyclerView A04;
    public EnumC53117NeU A05;
    public final InterfaceC09390do A06 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        if (!this.A03) {
            Context requireContext = requireContext();
            PublishScreenCategoryType publishScreenCategoryType = this.A02;
            if (publishScreenCategoryType == null) {
                C14360o3.A0F("categoryType");
                throw C00O.createAndThrow();
            }
            interfaceC56362iU.setTitle(requireContext.getString(OOu.A01(publishScreenCategoryType)));
            interfaceC56362iU.EkT(new ViewOnClickListenerC55462OkH(this, 60), true);
        }
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        return false;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        InterfaceC58168PqY interfaceC58168PqY;
        boolean A1W;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        if (this.A03) {
            View A0S = AbstractC166997dE.A0S(view, R.id.custom_action_bar);
            TextView A0N = AbstractC167007dF.A0N(A0S, R.id.action_bar_title);
            Context requireContext = requireContext();
            PublishScreenCategoryType publishScreenCategoryType = this.A02;
            if (publishScreenCategoryType == null) {
                str = "categoryType";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            AbstractC166987dD.A1P(requireContext, A0N, OOu.A01(publishScreenCategoryType));
            A0S.setVisibility(0);
            ViewOnClickListenerC55462OkH.A01(AbstractC166997dE.A0S(A0S, R.id.action_bar_button_back), 61, this);
        }
        AbstractC50522MSa.A10(view, this);
        OX2 ox2 = this.A01;
        if (ox2 != null) {
            AbstractC53643Nno A04 = ox2.A04();
            InterfaceC09390do interfaceC09390do = this.A06;
            UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
            EnumC53117NeU enumC53117NeU = this.A05;
            if (enumC53117NeU == null) {
                str = "screenType";
            } else {
                C51150Mit c51150Mit = new C51150Mit(A0r, A04, enumC53117NeU);
                this.A00 = c51150Mit;
                RecyclerView recyclerView = this.A04;
                if (recyclerView == null) {
                    str = "recyclerView";
                } else {
                    recyclerView.setAdapter(c51150Mit);
                    C07S c07s = C07S.STARTED;
                    C07X viewLifecycleOwner = getViewLifecycleOwner();
                    AbstractC166987dD.A1Z(C57173PZr.A02(viewLifecycleOwner, c07s, this, null, 7), C07Y.A00(viewLifecycleOwner));
                    OX2 ox22 = this.A01;
                    if (ox22 != null) {
                        if (ox22 instanceof NJK) {
                            interfaceC58168PqY = ((NJK) ox22).A07;
                        } else {
                            interfaceC58168PqY = ((NJL) ox22).A01;
                        }
                        interfaceC58168PqY.DiZ();
                        OX2 ox23 = this.A01;
                        if (ox23 != null) {
                            AbstractC50867Mdy A05 = ox23.A05();
                            if (A05 instanceof NJR) {
                                A1W = AbstractC167007dF.A1W(((NJR) A05).A02);
                            } else {
                                A1W = AbstractC167007dF.A1W(((AbstractC193598he) ((NJQ) A05).A03.A06.getValue()).A01);
                            }
                            if (!A1W) {
                                if (C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(interfaceC09390do), 36328547082255995L)) {
                                    AbstractC25226BEj.A1P(this);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        str = "dependencyProvider";
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A06);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        String string = requireArguments().getString("publish_screen_category_parent_module_name");
        if (string != null) {
            PublishScreenCategoryType publishScreenCategoryType = this.A02;
            if (publishScreenCategoryType == null) {
                C14360o3.A0F("categoryType");
                throw C00O.createAndThrow();
            }
            return AnonymousClass001.A0T(string, publishScreenCategoryType.name(), '_');
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        OX2 ox2 = this.A01;
        if (ox2 == null) {
            MSW.A1K();
            throw C00O.createAndThrow();
        }
        ox2.A03().onActivityResult(i, i2, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Throwable A0g;
        int i;
        PublishScreenCategoryType publishScreenCategoryType;
        int i2;
        EnumC53117NeU enumC53117NeU;
        OX2 njl;
        InterfaceC58168PqY interfaceC58168PqY;
        String str;
        int A02 = C0f9.A02(-2143891664);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            Parcelable parcelable = bundle2.getParcelable("publish_screen_category_type");
            if (parcelable instanceof PublishScreenCategoryType) {
                publishScreenCategoryType = (PublishScreenCategoryType) parcelable;
            } else {
                publishScreenCategoryType = null;
            }
            if (publishScreenCategoryType == null) {
                AbstractC12120kG.A07(AnonymousClass001.A0R(getModuleName(), ".onCreate"), "categoryType is null.", null);
                i2 = -1625389080;
            } else {
                this.A02 = publishScreenCategoryType;
                Serializable serializable = bundle2.getSerializable("publish_screen_type");
                if ((serializable instanceof EnumC53117NeU) && (enumC53117NeU = (EnumC53117NeU) serializable) != null) {
                    this.A05 = enumC53117NeU;
                    this.A03 = requireArguments().getBoolean("should_show_customized_action_bar", false);
                    EnumC53117NeU enumC53117NeU2 = this.A05;
                    if (enumC53117NeU2 == null) {
                        str = "screenType";
                    } else {
                        int ordinal = enumC53117NeU2.ordinal();
                        if (ordinal != 0) {
                            if (ordinal == 1) {
                                njl = new NJK(bundle2, this, this, AbstractC166987dD.A0r(this.A06));
                            } else {
                                A0g = B4Z.A00();
                                i = -1537868392;
                            }
                        } else {
                            UserSession A0r = AbstractC166987dD.A0r(this.A06);
                            String string = bundle2.getString("ClipsConstants.ARGS_WATERFALL_ID", AbstractC166997dE.A0n());
                            C14360o3.A07(string);
                            njl = new NJL(bundle2, this, this, A0r, string);
                        }
                        this.A01 = njl;
                        njl.A06();
                        OX2 ox2 = this.A01;
                        if (ox2 == null) {
                            str = "dependencyProvider";
                        } else {
                            if (ox2 instanceof NJK) {
                                interfaceC58168PqY = ((NJK) ox2).A07;
                            } else {
                                interfaceC58168PqY = ((NJL) ox2).A01;
                            }
                            interfaceC58168PqY.EDN();
                            i2 = -2129967308;
                        }
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                AbstractC12120kG.A07(AnonymousClass001.A0R(getModuleName(), ".onCreate"), "screenType is null.", null);
                i2 = 1345868014;
            }
            C0f9.A09(i2, A02);
            return;
        }
        A0g = AbstractC166997dE.A0g();
        i = -1626880183;
        C0f9.A09(i, A02);
        throw A0g;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(2055349199);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_publish_screen_sub_fragment, false);
        this.A04 = AbstractC31180DnO.A08(A0R);
        C0f9.A09(2049855351, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        InterfaceC58168PqY interfaceC58168PqY;
        int A02 = C0f9.A02(625406042);
        super.onDestroy();
        OX2 ox2 = this.A01;
        if (ox2 == null) {
            MSW.A1K();
            throw C00O.createAndThrow();
        }
        if (ox2 instanceof NJK) {
            interfaceC58168PqY = ((NJK) ox2).A07;
        } else {
            interfaceC58168PqY = ((NJL) ox2).A01;
        }
        interfaceC58168PqY.F9a();
        C0f9.A09(-1253177728, A02);
    }
}
