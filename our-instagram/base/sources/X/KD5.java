package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.ui.bottomsheet.mixed.model.AvatarMixedAttributionModel;
import com.instagram.ui.bottomsheet.mixed.model.MixedAttributionModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes8.dex */
public final class KD5 extends AbstractC59962oe implements JPX {
    public static final String __redex_internal_original_name = "MixedAttributionSheetFragment";
    public InterfaceC149856oe A00;
    public C189478aR A01;
    public JFX A02;
    public MPC A03;
    public C146016hy A04;
    public List A05;
    public C66362zD A06;
    public L5A A07;
    public String A08;
    public boolean A09;
    public final InterfaceC09390do A0A = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A0B;
    public final String A0C;

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AbstractC56952jT.A01(view.requireViewById(R.id.attribution_title));
        RecyclerView recyclerView = (RecyclerView) AbstractC166997dE.A0R(view, R.id.attributions_recycler_view);
        Context context = getContext();
        if (context != null) {
            AbstractC31174DnI.A15(context, recyclerView);
            C66392zG A00 = C66362zD.A00(context);
            C189478aR c189478aR = this.A01;
            String str2 = "bottomSheet";
            if (c189478aR != null) {
                L5A l5a = this.A07;
                String str3 = "delegate";
                if (l5a != null) {
                    A00.A01(new V5P(context, this, c189478aR, l5a));
                    C189478aR c189478aR2 = this.A01;
                    if (c189478aR2 != null) {
                        L5A l5a2 = this.A07;
                        if (l5a2 != null) {
                            A00.A01(new V5O(context, this, c189478aR2, l5a2));
                            C189478aR c189478aR3 = this.A01;
                            if (c189478aR3 != null) {
                                L5A l5a3 = this.A07;
                                if (l5a3 != null) {
                                    A00.A01(new V5K(context, c189478aR3, l5a3));
                                    C189478aR c189478aR4 = this.A01;
                                    if (c189478aR4 != null) {
                                        L5A l5a4 = this.A07;
                                        if (l5a4 != null) {
                                            InterfaceC09390do interfaceC09390do = this.A0A;
                                            this.A06 = AbstractC31173DnH.A0R(A00, new V5R(context, this, AbstractC166987dD.A0r(interfaceC09390do), c189478aR4, l5a4));
                                            ViewModelListUpdate A0E = AbstractC31171DnF.A0E();
                                            List list = this.A05;
                                            str2 = "mixedAttributionModels";
                                            if (list != null) {
                                                A0E.A01(list);
                                                C66362zD c66362zD = this.A06;
                                                str3 = "adapter";
                                                if (c66362zD != null) {
                                                    c66362zD.A05(A0E);
                                                    C66362zD c66362zD2 = this.A06;
                                                    if (c66362zD2 != null) {
                                                        recyclerView.setAdapter(c66362zD2);
                                                        List list2 = this.A05;
                                                        if (list2 != null) {
                                                            if ((list2 instanceof Collection) && list2.isEmpty()) {
                                                                return;
                                                            }
                                                            Iterator it = list2.iterator();
                                                            while (it.hasNext()) {
                                                                if (it.next() instanceof AvatarMixedAttributionModel) {
                                                                    if (C18U.A06(C06090Tz.A06, AbstractC166987dD.A0o(interfaceC09390do), 36324492632404166L)) {
                                                                        C07S c07s = C07S.STARTED;
                                                                        C07X viewLifecycleOwner = getViewLifecycleOwner();
                                                                        C57312k6 A002 = C07Y.A00(viewLifecycleOwner);
                                                                        C57166PZk c57166PZk = new C57166PZk(c07s, this, viewLifecycleOwner, null, 34);
                                                                        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
                                                                        AbstractC23641Du.A05(anonymousClass191, c57166PZk, A002);
                                                                        List list3 = this.A05;
                                                                        if (list3 != null) {
                                                                            for (Object obj : list3) {
                                                                                if (obj instanceof AvatarMixedAttributionModel) {
                                                                                    AvatarMixedAttributionModel avatarMixedAttributionModel = (AvatarMixedAttributionModel) obj;
                                                                                    if (avatarMixedAttributionModel == null || (str = avatarMixedAttributionModel.A01) == null) {
                                                                                        return;
                                                                                    }
                                                                                    AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(this.A0B);
                                                                                    Object obj2 = ((MixedAttributionModel) avatarMixedAttributionModel).A01;
                                                                                    if (obj2 != null) {
                                                                                        AbstractC25225BEi.A1S(obj2);
                                                                                        String str4 = (String) obj2;
                                                                                        C14360o3.A0B(str4, 0);
                                                                                        AbstractC23641Du.A05(anonymousClass191, new C50125MBz(A0Z, str, str4, (InterfaceC23621Ds) null, 17), AbstractC141776au.A00(A0Z));
                                                                                        return;
                                                                                    }
                                                                                    str2 = "attributionObject";
                                                                                }
                                                                            }
                                                                            throw new NoSuchElementException(MSV.A00(1));
                                                                        }
                                                                        C14360o3.A0F(str2);
                                                                        throw C00O.createAndThrow();
                                                                    }
                                                                }
                                                            }
                                                            return;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                C14360o3.A0F(str3);
                throw C00O.createAndThrow();
            }
            C14360o3.A0F(str2);
            throw C00O.createAndThrow();
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.JPX
    public final Integer BlT() {
        return C05F.A07;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A0C;
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0A);
    }

    public KD5() {
        C57239PbN c57239PbN = new C57239PbN(this, 38);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C57239PbN(new C57239PbN(this, 35), 36));
        this.A0B = AbstractC25225BEi.A0a(new C57239PbN(A00, 37), c57239PbN, new C43208J8f(47, null, A00), AbstractC25225BEi.A1D(C44483Jlp.class));
        this.A0C = "mixed_attribution_bottom_sheet";
    }

    public static final void A00(KD5 kd5, Integer num, String str) {
        String str2;
        ViewModelListUpdate A0E = AbstractC31171DnF.A0E();
        List list = kd5.A05;
        if (list == null) {
            str2 = "mixedAttributionModels";
        } else {
            ArrayList A0q = AbstractC167017dG.A0q(list);
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    MixedAttributionModel mixedAttributionModel = (MixedAttributionModel) it.next();
                    if (mixedAttributionModel instanceof AvatarMixedAttributionModel) {
                        SimpleImageUrl A0t = AbstractC25225BEi.A0t(str);
                        Object obj = mixedAttributionModel.A01;
                        if (obj != null) {
                            mixedAttributionModel = new AvatarMixedAttributionModel(kd5.requireContext(), A0t, num, obj, ((AvatarMixedAttributionModel) mixedAttributionModel).A01);
                        } else {
                            str2 = "attributionObject";
                            break;
                        }
                    }
                    A0q.add(mixedAttributionModel);
                } else {
                    A0E.A01(A0q);
                    C66362zD c66362zD = kd5.A06;
                    if (c66362zD == null) {
                        str2 = "adapter";
                    } else {
                        c66362zD.A05(A0E);
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-517341316);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        ArrayList parcelableArrayList = requireArguments.getParcelableArrayList(AbstractC111324zv.A00(4931));
        if (parcelableArrayList != null) {
            this.A05 = parcelableArrayList;
            this.A08 = requireArguments.getString("source_media_id");
            this.A09 = requireArguments.getBoolean(AbstractC111324zv.A00(4782));
            UserSession A0r = AbstractC166987dD.A0r(this.A0A);
            C146016hy c146016hy = this.A04;
            InterfaceC149856oe interfaceC149856oe = this.A00;
            if (interfaceC149856oe == null) {
                C14360o3.A0F("effectSheetDelegate");
                throw C00O.createAndThrow();
            }
            this.A07 = new L5A(this, A0r, interfaceC149856oe, this.A02, this.A03, this, c146016hy, this.A08, this.A09);
            C0f9.A09(-537484245, A02);
            return;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A09(-1328911345, A02);
        throw A0g;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(626303318);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.mixed_attribution_sheet_fragment, viewGroup, false);
        C0f9.A09(1331224103, A02);
        return inflate;
    }
}
