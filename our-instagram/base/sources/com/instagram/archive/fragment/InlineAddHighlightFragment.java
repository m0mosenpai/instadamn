package com.instagram.archive.fragment;

import X.AbstractC12990ll;
import X.AbstractC13880nE;
import X.AbstractC1571873x;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC25229BEm;
import X.AbstractC25651Mw;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC31176DnK;
import X.AbstractC31177DnL;
import X.AbstractC31178DnM;
import X.AbstractC31180DnO;
import X.AbstractC53242c7;
import X.AbstractC72463Mt;
import X.C00O;
import X.C05F;
import X.C06090Tz;
import X.C0f5;
import X.C0f9;
import X.C14120nc;
import X.C14360o3;
import X.C151626s8;
import X.C155306yJ;
import X.C18950wb;
import X.C1ON;
import X.C35902FtM;
import X.C35903FtN;
import X.C35904FtO;
import X.C38321qM;
import X.C3G2;
import X.C3G4;
import X.C3LZ;
import X.C3OO;
import X.C3T1;
import X.C44376JjF;
import X.C51187MjV;
import X.C51374MmZ;
import X.C55844Oqu;
import X.C56189Oww;
import X.C57012jc;
import X.C70873Fz;
import X.EnumC40111tc;
import X.EnumC53202Nfy;
import X.InterfaceC149556o7;
import X.InterfaceC156146zi;
import X.InterfaceC57921PmR;
import X.InterfaceC58138Pq3;
import X.InterfaceC73233Pz;
import X.NGP;
import X.OIL;
import X.Oi8;
import X.ViewOnClickListenerC55467OkM;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.api.schemas.HighlightReelTypeStr;
import com.instagram.api.schemas.IGUserHighlightsTrayType;
import com.instagram.archive.fragment.InlineAddHighlightFragment;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public class InlineAddHighlightFragment extends AbstractC72463Mt implements InterfaceC149556o7, InterfaceC156146zi {
    public UserSession A00;
    public Integer A01;
    public String A02;
    public int A03;
    public C155306yJ A04;
    public OIL A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public TextView mActionButton;
    public View mCreateHighlightCardCoverImage;
    public CircularImageView mCreateHighlightCoverImage;
    public EditText mCreateHighlightEditText;
    public View mCreateHighlightView;
    public ViewStub mCreateHighlightViewStub;
    public InterfaceC58138Pq3 mDelegate;
    public C57012jc mHeaderBackButtonStubHolder;
    public TextView mHeaderText;
    public SpinnerImageView mLoadingSpinner;
    public RecyclerView mTrayRecyclerView;
    public View mView;

    @Override // X.InterfaceC61272qp
    public final void AVA() {
    }

    @Override // X.InterfaceC61272qp
    public final boolean CKt() {
        return false;
    }

    @Override // X.InterfaceC61272qp
    public final boolean CLh() {
        return false;
    }

    @Override // X.InterfaceC64002vL
    public final void CMu(String str) {
    }

    @Override // X.InterfaceC156146zi
    public final boolean CfC(Reel reel) {
        return false;
    }

    @Override // X.InterfaceC61272qp
    public final void Co4() {
    }

    @Override // X.InterfaceC64002vL
    public final void D1e(Reel reel) {
    }

    @Override // X.InterfaceC156156zj
    public final void D8A(View view) {
        A05(true);
    }

    @Override // X.InterfaceC156146zi
    public final void DDO() {
    }

    @Override // X.InterfaceC64002vL
    public final void DJt() {
    }

    @Override // X.InterfaceC149556o7
    public final /* synthetic */ void DKr(boolean z) {
    }

    @Override // X.InterfaceC149556o7
    public final /* synthetic */ void DKt(boolean z) {
    }

    @Override // X.InterfaceC64002vL
    public final /* synthetic */ void DSa() {
    }

    @Override // X.InterfaceC156146zi
    public final void DUx(Reel reel) {
    }

    @Override // X.InterfaceC64002vL
    public final void DVW() {
    }

    @Override // X.InterfaceC64002vL
    public final void DXO() {
    }

    @Override // X.InterfaceC61322qu
    public final /* synthetic */ void DXf(long j, int i) {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC61322qu
    public final /* synthetic */ void DXg(long j) {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC64002vL
    public final void De5(EnumC53202Nfy enumC53202Nfy, String str) {
    }

    @Override // X.InterfaceC64002vL
    public final /* synthetic */ void De6(Reel reel, C70873Fz c70873Fz, int i) {
    }

    @Override // X.InterfaceC64002vL
    public final /* synthetic */ void De8(C3OO c3oo, InterfaceC73233Pz interfaceC73233Pz, Integer num, String str, String str2, String str3, List list, float f, int i, int i2, boolean z) {
    }

    @Override // X.InterfaceC64002vL
    public final void DeA(Reel reel, C70873Fz c70873Fz, Integer num, int i) {
    }

    @Override // X.InterfaceC64002vL
    public final void DeC(List list, int i, String str) {
    }

    @Override // X.InterfaceC64002vL
    public final void DeF(String str) {
    }

    @Override // X.InterfaceC64002vL
    public final void Dvg(int i) {
    }

    @Override // X.InterfaceC64002vL
    public final void E1q(C3OO c3oo, Reel reel, Integer num, String str, String str2, List list) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "inline_add_to_highlight";
    }

    public static void A01(InlineAddHighlightFragment inlineAddHighlightFragment) {
        AbstractC31171DnF.A1M(inlineAddHighlightFragment.mLoadingSpinner);
        Context requireContext = inlineAddHighlightFragment.requireContext();
        UserSession userSession = inlineAddHighlightFragment.A00;
        String str = userSession.userId;
        C1ON c1on = AbstractC1571873x.A05(requireContext, userSession, null, null, null, C05F.A0Y, null, str, AbstractC167007dF.A1U(str)).A00;
        c1on.A00 = new C151626s8(inlineAddHighlightFragment, inlineAddHighlightFragment.A00, true);
        inlineAddHighlightFragment.schedule(c1on);
    }

    public static void A02(InlineAddHighlightFragment inlineAddHighlightFragment) {
        inlineAddHighlightFragment.mHeaderText.setText(2131964511);
        inlineAddHighlightFragment.mTrayRecyclerView.setVisibility(0);
        AbstractC13880nE.A0P(inlineAddHighlightFragment.mCreateHighlightView);
        inlineAddHighlightFragment.A04(C05F.A00);
        AbstractC13880nE.A0O(inlineAddHighlightFragment.mView);
        inlineAddHighlightFragment.mHeaderBackButtonStubHolder.A02();
    }

    public static void A03(InlineAddHighlightFragment inlineAddHighlightFragment, ImageUrl imageUrl) {
        if (imageUrl == null) {
            imageUrl = inlineAddHighlightFragment.mDelegate.AsN(inlineAddHighlightFragment.requireContext());
        }
        if (inlineAddHighlightFragment.A0A) {
            int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
            View view = inlineAddHighlightFragment.mCreateHighlightView;
            view.getClass();
            ((C44376JjF) new C51374MmZ(view).A08.getValue()).A02(imageUrl, "inline_add_to_highlight");
            return;
        }
        CircularImageView circularImageView = inlineAddHighlightFragment.mCreateHighlightCoverImage;
        if (circularImageView != null) {
            circularImageView.setUrl(imageUrl, inlineAddHighlightFragment);
            if (!inlineAddHighlightFragment.A08) {
                inlineAddHighlightFragment.mCreateHighlightCoverImage.setRotation(inlineAddHighlightFragment.A03);
            }
            if (!inlineAddHighlightFragment.A07) {
                return;
            }
            CircularImageView circularImageView2 = inlineAddHighlightFragment.mCreateHighlightCoverImage;
            circularImageView2.setScaleY(circularImageView2.getScaleY() * (-1.0f));
            return;
        }
        C0f5 AEp = C18950wb.A01.AEp("InlineAddHighlightFragment mCreateHighlightCoverImage is null", 817905059);
        AEp.ABX("mCreateHighlightView is null", AbstractC25229BEm.A1Z(inlineAddHighlightFragment.mCreateHighlightView));
        AEp.ABW("imageUrl", imageUrl.getUrl());
        AEp.report();
    }

    private void A05(boolean z) {
        this.mHeaderText.setText(2131956960);
        if (this.mCreateHighlightView == null) {
            View inflate = this.mCreateHighlightViewStub.inflate();
            this.mCreateHighlightView = inflate;
            this.mCreateHighlightCoverImage = AbstractC31173DnH.A0T(inflate, R.id.highlight_cover_image);
            this.mCreateHighlightCardCoverImage = this.mCreateHighlightView.requireViewById(R.id.highlight_card_cover_image);
            EditText editText = (EditText) this.mCreateHighlightView.requireViewById(R.id.highlight_title);
            this.mCreateHighlightEditText = editText;
            C14360o3.A0B(editText, 0);
            editText.addTextChangedListener(new Oi8(editText, null));
        }
        boolean z2 = this.A0A;
        int i = 0;
        CircularImageView circularImageView = this.mCreateHighlightCoverImage;
        circularImageView.getClass();
        if (z2) {
            circularImageView.setVisibility(8);
            View view = this.mCreateHighlightCardCoverImage;
            view.getClass();
            view.setVisibility(0);
        } else {
            circularImageView.setVisibility(0);
            View view2 = this.mCreateHighlightCardCoverImage;
            view2.getClass();
            view2.setVisibility(8);
        }
        this.mCreateHighlightView.setVisibility(0);
        String str = this.A06;
        this.mCreateHighlightEditText.getClass();
        if (str != null) {
            this.mCreateHighlightEditText.setText(str);
        } else {
            EditText editText2 = this.mCreateHighlightEditText;
            editText2.setText(AbstractC167007dF.A0g(editText2).trim());
        }
        this.mCreateHighlightEditText.requestFocus();
        AbstractC13880nE.A0R(this.mCreateHighlightEditText);
        if (AbstractC31178DnM.A1X(C06090Tz.A05, this.A00, 36323367350971585L)) {
            C14120nc.A00().ATO(new NGP(requireContext(), this));
        } else {
            A03(this, null);
        }
        A04(C05F.A01);
        C57012jc c57012jc = this.mHeaderBackButtonStubHolder;
        if (!z) {
            i = 8;
        }
        c57012jc.A03(i);
        this.mTrayRecyclerView.setVisibility(8);
    }

    @Override // X.AbstractC72463Mt
    public final /* bridge */ /* synthetic */ AbstractC12990ll A0M() {
        return this.A00;
    }

    @Override // X.InterfaceC64002vL
    public final /* synthetic */ int C9u() {
        return 0;
    }

    @Override // X.InterfaceC61272qp
    public final /* synthetic */ boolean CLg() {
        return false;
    }

    @Override // X.InterfaceC149556o7
    public final void DKs(boolean z) {
        this.mLoadingSpinner.setLoadingStatus(C3T1.FAILED);
        ViewOnClickListenerC55467OkM.A00(this.mLoadingSpinner, 18, this);
    }

    @Override // X.InterfaceC149556o7
    public final void DKu(C3LZ c3lz, List list, boolean z) {
        this.mLoadingSpinner.setLoadingStatus(C3T1.SUCCESS);
        boolean A1X = AbstractC167007dF.A1X(c3lz.F7f().A01, IGUserHighlightsTrayType.A04);
        this.A0A = A1X;
        this.A04.A09(A1X);
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Reel reel = (Reel) it.next();
            HighlightReelTypeStr highlightReelTypeStr = reel.A09;
            if (highlightReelTypeStr != HighlightReelTypeStr.A05 && highlightReelTypeStr != HighlightReelTypeStr.A06 && !reel.A0l()) {
                A1E.add(reel);
            }
        }
        if (A1E.isEmpty()) {
            A05(false);
        } else {
            this.mDelegate.DPo(this.A04, A1E);
            A02(this);
        }
    }

    @Override // X.InterfaceC64002vL
    public final void De7(C3OO c3oo, InterfaceC73233Pz interfaceC73233Pz, Integer num, String str, String str2, List list, int i, boolean z) {
        C155306yJ c155306yJ = this.A04;
        C14360o3.A0B(str, 0);
        C3G4 A00 = C155306yJ.A00(c155306yJ, str);
        if (A00 != null && A00.A02) {
            this.mDelegate.Ddp(this, this, str, true);
        } else {
            this.A02 = str;
            this.A05.A00(null, !this.A08);
        }
    }

    private void A04(Integer num) {
        int i;
        int A07;
        int A02;
        int A0H;
        if (num.intValue() != 0) {
            i = 2131952265;
            A07 = R.color.design_dark_default_color_on_background;
            A02 = R.color.badge_color;
            A0H = R.color.blue_6;
        } else {
            i = 2131954754;
            A07 = AbstractC53242c7.A07(requireContext());
            A02 = AbstractC53242c7.A02(requireContext());
            A0H = AbstractC53242c7.A0H(requireContext(), R.attr.backgroundColorSecondary);
        }
        this.mActionButton.setText(i);
        AbstractC166987dD.A1O(requireContext(), this.mActionButton, A07);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, new ColorDrawable(requireContext().getColor(A0H)));
        stateListDrawable.addState(new int[0], new ColorDrawable(requireContext().getColor(A02)));
        this.mActionButton.setBackground(stateListDrawable);
        this.A01 = num;
    }

    @Override // X.C0SG, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        InterfaceC58138Pq3 c35903FtN;
        int A02 = C0f9.A02(-1374168497);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = AbstractC31176DnK.A0S(this);
        String string = requireArguments.getString("current_reel_item_media_id");
        int i = requireArguments.getInt("initial_selected_media_width");
        int i2 = requireArguments.getInt("initial_selected_media_height");
        if (string != null) {
            C38321qM A0h = AbstractC25229BEm.A0h(this.A00, string);
            if (A0h != null) {
                this.A08 = AbstractC167007dF.A1X(A0h.BRp(), EnumC40111tc.A0a);
            }
            Parcelable parcelable = requireArguments.getParcelable("initial_selected_media_url");
            Serializable serializable = requireArguments.getSerializable("reel_viewer_source");
            Context requireContext = requireContext();
            UserSession userSession = this.A00;
            parcelable.getClass();
            serializable.getClass();
            this.mDelegate = new C35904FtO(requireContext, userSession, (ImageUrl) parcelable, A0h, (C3G2) serializable, string);
        } else {
            String string2 = requireArguments.getString("InlineAddHighlightFragment.ARG_CAPTURED_MEDIA_FILE_PATH");
            string2.getClass();
            this.A08 = requireArguments.getBoolean("InlineAddHighlightFragment.ARG_CAPTURED_MEDIA_IS_VIDEO");
            if (requireArguments.getParcelable("InlineAddHighlightsFragment.ARG_INGEST_SESSION") != null) {
                c35903FtN = new C35902FtM(requireContext(), this.A00, string2, i, i2, this.A08);
            } else {
                c35903FtN = new C35903FtN(requireContext(), this.A00, string2, i, i2, this.A08);
            }
            this.mDelegate = c35903FtN;
        }
        this.A07 = requireArguments.getBoolean("InlineAddHighlightsFragment.ARG_IS_MEDIA_MIRRORED");
        this.A03 = requireArguments.getInt("InlineAddHighlightsFragment.ARG_MEDIA_ROTATION_DEGREES");
        boolean z = requireArguments.getBoolean("is_in_story_creation_flow_tray", false);
        this.A09 = requireArguments.getBoolean("should_request_highlight_tray", true);
        this.A06 = requireArguments.getString("default_new_highlight_title");
        C155306yJ c155306yJ = new C155306yJ(requireContext(), this, this.A00, C3G2.A1Y, true, z, false, true);
        this.A04 = c155306yJ;
        c155306yJ.A01 = this;
        this.A05 = new OIL(requireContext(), new C55844Oqu(this), new InterfaceC57921PmR() { // from class: X.Oqw
            @Override // X.InterfaceC57921PmR
            public final void D6v(C38321qM c38321qM) {
                InlineAddHighlightFragment inlineAddHighlightFragment = InlineAddHighlightFragment.this;
                inlineAddHighlightFragment.A02.getClass();
                InterfaceC58138Pq3 interfaceC58138Pq3 = inlineAddHighlightFragment.mDelegate;
                if (interfaceC58138Pq3 != null) {
                    interfaceC58138Pq3.Ddp(inlineAddHighlightFragment, inlineAddHighlightFragment, inlineAddHighlightFragment.A02, false);
                }
            }
        });
        C0f9.A09(-741290996, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1411186048);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.layout_inline_add_highlight);
        C0f9.A09(699565540, A02);
        return A0A;
    }

    @Override // X.C0SG, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-81922871);
        super.onDestroyView();
        InlineAddHighlightFragmentLifecycleUtil.cleanupReferences(this);
        C0f9.A09(-80153311, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.1vN] */
    @Override // X.C0SG, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        AbstractC25651Mw.A00(this.A00).E4s(new Object());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-410223);
        super.onPause();
        AbstractC13880nE.A0O(this.mView);
        C0f9.A09(26991, A02);
    }

    @Override // X.AbstractC72463Mt, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mView = view;
        this.mCreateHighlightViewStub = AbstractC31173DnH.A0G(view, R.id.inline_create_highlight_metadata_stub);
        C57012jc A0V = AbstractC31177DnL.A0V(view, R.id.inline_create_highlight_back_button_stub);
        this.mHeaderBackButtonStubHolder = A0V;
        A0V.A02 = new C56189Oww(this, 0);
        this.mHeaderText = AbstractC166997dE.A0T(view, R.id.header_text);
        TextView A0T = AbstractC166997dE.A0T(view, R.id.action_button);
        this.mActionButton = A0T;
        ViewOnClickListenerC55467OkM.A00(A0T, 17, this);
        A04(C05F.A00);
        this.mTrayRecyclerView = AbstractC31172DnG.A0G(view, R.id.highlights_reel_tray_recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext(), 0, false);
        this.mTrayRecyclerView.setLayoutManager(linearLayoutManager);
        linearLayoutManager.A12(true);
        this.mTrayRecyclerView.A10(new C51187MjV(this, AbstractC167017dG.A07(requireContext()), 0));
        this.mTrayRecyclerView.setAdapter(this.A04);
        this.mTrayRecyclerView.setVisibility(8);
        this.mLoadingSpinner = AbstractC31180DnO.A0V(this.mView);
        if (this.A09) {
            A01(this);
        } else {
            A05(false);
        }
    }

    @Override // X.InterfaceC61272qp
    public final /* synthetic */ boolean Eib(Integer num, int i, int i2) {
        return false;
    }
}
