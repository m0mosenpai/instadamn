package X;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.save.analytics.SaveToCollectionsParentInsightsHost;
import com.instagram.save.model.SavedCollection;
import com.instagram.ui.widget.selectableview.RoundedCornerCheckMarkSelectableImageView;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.List;

/* loaded from: classes11.dex */
public final class V1Q extends AbstractC59962oe implements C1M1, InterfaceC60442pS, InterfaceC60072op, InterfaceC86363t8, InterfaceC62612t0, InterfaceC60152ox, XB1 {
    public static final String __redex_internal_original_name = "SaveToCollectionsFragment";
    public ViewStub A02;
    public ViewStub A03;
    public RecyclerView A04;
    public C38321qM A05;
    public InterfaceC60442pS A06;
    public GFJ A07;
    public C41645Ibb A08;
    public SpinnerImageView A09;
    public Integer A0A;
    public String A0B;
    public String A0C;
    public ImageView A0D;
    public TextView A0E;
    public TextView A0F;
    public C3I9 A0G;
    public String A0H;
    public int A00 = -1;
    public int A01 = -1;
    public final InterfaceC09390do A0Q = MSY.A0p(this, 25);
    public final InterfaceC09390do A0O = MSY.A0p(this, 24);
    public final InterfaceC09390do A0M = MSY.A0p(this, 22);
    public final InterfaceC09390do A0K = MSY.A0p(this, 20);
    public final InterfaceC09390do A0N = MSY.A0p(this, 23);
    public final InterfaceC09390do A0L = MSY.A0p(this, 21);
    public final InterfaceC09390do A0J = MSY.A0p(this, 19);
    public final WKU A0I = new WKU(this, 16);
    public final InterfaceC09390do A0P = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC86363t8
    public final /* synthetic */ void CwQ(float f) {
    }

    @Override // X.InterfaceC86363t8
    public final /* synthetic */ void CwR(Integer num, float f) {
    }

    @Override // X.InterfaceC86363t8
    public final /* synthetic */ void D5o() {
    }

    @Override // X.InterfaceC86363t8
    public final /* synthetic */ void D5p(Integer num) {
    }

    @Override // X.XB1
    public final void D5t(SavedCollection savedCollection) {
        C14360o3.A0B(savedCollection, 0);
        C38321qM c38321qM = this.A05;
        if (c38321qM != null) {
            boolean A0K = C14360o3.A0K(savedCollection.A0F, EnumC33416Epn.A07.A01);
            String str = "delegate";
            C41645Ibb c41645Ibb = this.A08;
            if (A0K) {
                if (c41645Ibb != null) {
                    int i = this.A00;
                    int i2 = this.A01;
                    ((C2UU) this.A0J.getValue()).getItemCount();
                    if (this.A0B == null) {
                        str = "navigationType";
                    } else {
                        c41645Ibb.A01(this, c38321qM, i, i2);
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            if (c41645Ibb != null) {
                c41645Ibb.A02(this, c38321qM, savedCollection, this.A0H, this.A00, this.A01);
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        AbstractC25226BEj.A1Q(this);
    }

    @Override // X.InterfaceC86363t8
    public final /* synthetic */ void DId(Integer num) {
    }

    @Override // X.InterfaceC86363t8
    public final /* synthetic */ void DZk(int i, int i2) {
    }

    @Override // X.InterfaceC86363t8
    public final /* synthetic */ void Dyj(C51752Mtb c51752Mtb) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "save_to_collections_tray";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        FragmentActivity activity;
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C3I9 c3i9 = this.A0G;
        if (c3i9 == null) {
            str = "keyboardHeightChangeDetector";
        } else {
            c3i9.A9e(this);
            A01(this);
            A03(this, C05F.A00);
            TextView textView = this.A0F;
            if (textView == null) {
                str = "actionButton";
            } else {
                WNU.A00(textView, 67, this);
                C55782hJ A00 = C55772hI.A00((AbstractC12990ll) this.A0P.getValue());
                InterfaceC60442pS interfaceC60442pS = this.A06;
                if (interfaceC60442pS == null) {
                    str = "parentInsightsHost";
                } else {
                    A00.A0C(interfaceC60442pS, null, getParentFragmentManager().A0L());
                    if (this.A05 == null && C06P.A01(getParentFragmentManager()) && (activity = getActivity()) != null) {
                        activity.onBackPressed();
                        return;
                    }
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A00(V1Q v1q) {
        String str;
        TextView textView = v1q.A0E;
        if (textView == null) {
            str = "actionBarTitle";
        } else {
            textView.setText(2131972775);
            ImageView imageView = v1q.A0D;
            if (imageView == null) {
                str = "createCollectionButton";
            } else {
                imageView.setVisibility(0);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A01(V1Q v1q) {
        String str;
        C66417UGl c66417UGl = (C66417UGl) v1q.A0J.getValue();
        c66417UGl.A06.clear();
        c66417UGl.notifyDataSetChanged();
        ImageView imageView = v1q.A0D;
        if (imageView == null) {
            str = "createCollectionButton";
        } else {
            imageView.setVisibility(8);
            SpinnerImageView spinnerImageView = v1q.A09;
            if (spinnerImageView == null) {
                str = "loadingSpinner";
            } else {
                spinnerImageView.setLoadingStatus(C3T1.LOADING);
                GFJ gfj = v1q.A07;
                if (gfj == null) {
                    str = "savedCollectionsFetcher";
                } else {
                    gfj.A02(true, true);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A02(V1Q v1q) {
        String str;
        ExtendedImageUrl A1o;
        RecyclerView recyclerView = v1q.A04;
        if (recyclerView == null) {
            str = "recyclerView";
        } else {
            recyclerView.setVisibility(8);
            ((View) v1q.A0O.getValue()).setVisibility(0);
            InterfaceC09390do interfaceC09390do = v1q.A0M;
            TextView textView = (TextView) interfaceC09390do.getValue();
            textView.setVisibility(0);
            textView.addTextChangedListener(v1q.A0I);
            textView.requestFocus();
            AbstractC13880nE.A0R((View) interfaceC09390do.getValue());
            C38321qM c38321qM = v1q.A05;
            if (c38321qM != null && (A1o = c38321qM.A1o(R.dimen.fbpay_ui_text_button_width)) != null) {
                ((RoundedCornerCheckMarkSelectableImageView) v1q.A0N.getValue()).setUrl(A1o, v1q);
            } else {
                ((RoundedCornerCheckMarkSelectableImageView) v1q.A0N.getValue()).A02();
            }
            TextView textView2 = v1q.A0E;
            if (textView2 == null) {
                str = "actionBarTitle";
            } else {
                textView2.setText(2131968437);
                ImageView imageView = v1q.A0D;
                if (imageView == null) {
                    str = "createCollectionButton";
                } else {
                    imageView.setVisibility(8);
                    ((View) v1q.A0Q.getValue()).setVisibility(0);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC62612t0
    public final void AD4() {
        GFJ gfj = this.A07;
        if (gfj == null) {
            C14360o3.A0F("savedCollectionsFetcher");
            throw C00O.createAndThrow();
        }
        gfj.A01();
    }

    @Override // X.InterfaceC86363t8
    public final void DB6() {
        AbstractC13880nE.A0O(this.mView);
    }

    @Override // X.InterfaceC60152ox
    public final void DOK(int i, boolean z) {
        if (z) {
            ViewGroup A00 = AbstractC124845kp.A00(requireView());
            if (A00 != null) {
                AbstractC125325le A002 = AbstractC125325le.A00(A00);
                A002.A0G();
                AbstractC125325le A0A = A002.A0A();
                A0A.A0K(-i);
                A0A.A0H();
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A0P.getValue();
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        InterfaceC60442pS interfaceC60442pS = this.A06;
        if (interfaceC60442pS == null) {
            C14360o3.A0F("parentInsightsHost");
            throw C00O.createAndThrow();
        }
        return interfaceC60442pS.isOrganicEligible();
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        InterfaceC60442pS interfaceC60442pS = this.A06;
        if (interfaceC60442pS == null) {
            C14360o3.A0F("parentInsightsHost");
            throw C00O.createAndThrow();
        }
        return interfaceC60442pS.isSponsoredEligible();
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        AbstractC13880nE.A0O(this.mView);
        C3I9 c3i9 = this.A0G;
        if (c3i9 == null) {
            C14360o3.A0F("keyboardHeightChangeDetector");
            throw C00O.createAndThrow();
        }
        c3i9.EFx(this);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(X.V1Q r7, java.lang.Integer r8) {
        /*
            int r5 = r8.intValue()
            r4 = 0
            java.lang.String r6 = "actionButton"
            if (r5 == r4) goto L6c
            android.graphics.drawable.StateListDrawable r3 = new android.graphics.drawable.StateListDrawable
            r3.<init>()
            r0 = 16842919(0x10100a7, float:2.3694026E-38)
            int[] r2 = new int[]{r0}
            android.content.Context r1 = r7.requireContext()
            r0 = 2131099817(0x7f0600a9, float:1.7811998E38)
            int r1 = r1.getColor(r0)
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r1)
            r3.addState(r2, r0)
            int[] r2 = new int[r4]
            android.content.Context r1 = r7.requireContext()
            r0 = 2131099704(0x7f060038, float:1.7811769E38)
            int r1 = r1.getColor(r0)
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r1)
            r3.addState(r2, r0)
            android.widget.TextView r0 = r7.A0F
            if (r0 == 0) goto L83
            r0.setBackground(r3)
        L44:
            android.widget.TextView r2 = r7.A0F
            if (r2 == 0) goto L83
            if (r5 == 0) goto L68
            r0 = 2131961124(0x7f132524, float:1.9558936E38)
        L4d:
            r2.setText(r0)
            android.content.Context r1 = r7.requireContext()
            android.content.Context r0 = r7.requireContext()
            if (r5 == r4) goto L63
            r0 = 2131100036(0x7f060184, float:1.7812442E38)
        L5d:
            X.AbstractC166987dD.A1O(r1, r2, r0)
            r7.A0A = r8
            return
        L63:
            int r0 = X.AbstractC53242c7.A07(r0)
            goto L5d
        L68:
            r0 = 2131954754(0x7f130c42, float:1.9546016E38)
            goto L4d
        L6c:
            android.widget.TextView r3 = r7.A0F
            if (r3 == 0) goto L83
            android.content.Context r2 = r7.requireContext()
            android.content.Context r1 = r7.requireContext()
            r0 = 2130969339(0x7f0402fb, float:1.7547357E38)
            int r0 = X.AbstractC53242c7.A0H(r1, r0)
            X.AbstractC31173DnH.A0z(r2, r3, r0)
            goto L44
        L83:
            X.C14360o3.A0F(r6)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V1Q.A03(X.V1Q, java.lang.Integer):void");
    }

    @Override // X.C1M1
    public final String getSessionId() {
        return AbstractC153636vY.A01(requireArguments(), AbstractC111324zv.A00(335));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1892283705);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        InterfaceC09390do interfaceC09390do = this.A0P;
        this.A05 = AbstractC31176DnK.A0Z(interfaceC09390do).A02(requireArguments.getString(AbstractC111324zv.A00(3753)));
        this.A00 = requireArguments.getInt(AbstractC111324zv.A00(3751));
        this.A01 = requireArguments.getInt(AbstractC111324zv.A00(3756));
        this.A06 = (InterfaceC60442pS) AbstractC153636vY.A00(requireArguments, SaveToCollectionsParentInsightsHost.class, AbstractC111324zv.A00(3755));
        this.A0H = requireArguments.getString(AbstractC111324zv.A00(3752));
        String A00 = AbstractC111324zv.A00(3754);
        String string = requireArguments.getString(A00);
        AbstractC153636vY.A03(requireArguments, string, A00);
        this.A0B = string;
        InterfaceC60442pS interfaceC60442pS = this.A06;
        V1Q v1q = null;
        if (interfaceC60442pS == null) {
            C14360o3.A0F("parentInsightsHost");
            throw C00O.createAndThrow();
        }
        UserSession userSession = (UserSession) interfaceC09390do.getValue();
        if (requireArguments.getString(AbstractC111324zv.A00(335)) != null) {
            v1q = this;
        }
        this.A08 = new C41645Ibb(this, userSession, interfaceC60442pS, v1q);
        List A002 = AbstractC35273Fh8.A00((UserSession) interfaceC09390do.getValue(), this.A05, AbstractC166987dD.A1J(EnumC33416Epn.A0A), this.A00);
        this.A07 = new GFJ(requireContext(), AbstractC018607g.A00(this), this, (UserSession) interfaceC09390do.getValue(), new C71003WmK(this, 1), A002, C16930sl.A00, null);
        this.A0G = C3I7.A01(this, false, false);
        C0f9.A09(1889391701, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(488631097);
        C14360o3.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.save_to_collections, viewGroup, false);
        this.A0E = (TextView) inflate.requireViewById(R.id.save_to_collection_action_bar_title);
        ImageView imageView = (ImageView) inflate.requireViewById(R.id.save_to_collection_new_collection_button);
        WNU.A00(imageView, 65, this);
        this.A0D = imageView;
        this.A03 = (ViewStub) inflate.requireViewById(R.id.save_to_collection_back_button_stub);
        this.A09 = AbstractC31180DnO.A0V(inflate);
        RecyclerView recyclerView = (RecyclerView) inflate.requireViewById(R.id.save_to_collections_recycler_view);
        Resources resources = recyclerView.getResources();
        AbstractC37304Gc5.A0z(recyclerView, resources.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding), resources.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext(), 0, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        AbstractC37304Gc5.A10(recyclerView, this.A0J);
        AbstractC37304Gc5.A0y(linearLayoutManager, recyclerView, this, C153146ui.A08);
        this.A04 = recyclerView;
        this.A02 = (ViewStub) inflate.requireViewById(R.id.save_to_collections_new_collection_stub);
        this.A0F = (TextView) inflate.requireViewById(R.id.save_to_collection_action_button);
        C0f9.A09(1880016218, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1423784706);
        super.onDestroyView();
        AbstractC13880nE.A0O(this.mView);
        C3I9 c3i9 = this.A0G;
        if (c3i9 == null) {
            C14360o3.A0F("keyboardHeightChangeDetector");
            throw C00O.createAndThrow();
        }
        c3i9.EFx(this);
        C0f9.A09(1997921489, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-2021788650);
        super.onPause();
        AbstractC13880nE.A0O(this.mView);
        C0f9.A09(-571056941, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(1492165030);
        super.onStart();
        C3I9 c3i9 = this.A0G;
        if (c3i9 == null) {
            C14360o3.A0F("keyboardHeightChangeDetector");
            throw C00O.createAndThrow();
        }
        c3i9.Dnr(requireActivity());
        C0f9.A09(-1239199531, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(789260951);
        super.onStop();
        C3I9 c3i9 = this.A0G;
        if (c3i9 == null) {
            C14360o3.A0F("keyboardHeightChangeDetector");
            throw C00O.createAndThrow();
        }
        c3i9.onStop();
        C0f9.A09(-1424461682, A02);
    }
}
