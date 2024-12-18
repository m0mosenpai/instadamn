package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.ui.widget.selectableview.RoundedCornerCheckMarkSelectableImageView;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class EO2 extends C53Z implements InterfaceC60442pS, InterfaceC11480j6, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "CreateCollectionFromSelectedFragment";
    public int A00;
    public EditText A01;
    public UserSession A02;
    public IgdsListCell A03;
    public EnumC33380EpD A04;
    public String A05;
    public ArrayList A06;
    public View A09;
    public RoundedCornerCheckMarkSelectableImageView A0A;
    public boolean A07 = false;
    public boolean A08 = false;
    public final TextWatcher A0B = new C35469Fl4(this, 30);
    public final View.OnClickListener A0C = new ViewOnClickListenerC35686FpL(this, 11);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "collection_create";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    private void A00(C38321qM c38321qM) {
        if (c38321qM == null) {
            this.A05 = null;
            this.A0A.A02();
            return;
        }
        this.A05 = c38321qM.getId();
        RoundedCornerCheckMarkSelectableImageView roundedCornerCheckMarkSelectableImageView = this.A0A;
        ImageUrl A1S = c38321qM.A1S();
        A1S.getClass();
        roundedCornerCheckMarkSelectableImageView.setUrl(A1S, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (android.text.TextUtils.isEmpty(X.AbstractC31177DnL.A0c(r0)) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A01(X.EO2 r3) {
        /*
            android.widget.EditText r0 = r3.A01
            if (r0 == 0) goto Lf
            java.lang.String r0 = X.AbstractC31177DnL.A0c(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r2 = 1
            if (r0 == 0) goto L10
        Lf:
            r2 = 0
        L10:
            android.view.View r0 = r3.A09
            r0.getClass()
            r0.setEnabled(r2)
            android.view.View r1 = r3.A09
            r0 = 1056964608(0x3f000000, float:0.5)
            if (r2 == 0) goto L20
            r0 = 1065353216(0x3f800000, float:1.0)
        L20:
            r1.setAlpha(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EO2.A01(X.EO2):void");
    }

    public static void A02(EO2 eo2) {
        IgdsListCell igdsListCell;
        Context requireContext;
        int i;
        if (eo2.A03 != null) {
            if (AbstractC166987dD.A10(eo2.A02).A0M() == C05F.A01 && eo2.A07) {
                eo2.A03.A0H(eo2.requireContext().getString(2131972826));
                igdsListCell = eo2.A03;
                requireContext = eo2.requireContext();
                i = R.drawable.instagram_globe_pano_outline_24;
            } else {
                boolean z = eo2.A07;
                IgdsListCell igdsListCell2 = eo2.A03;
                Context requireContext2 = eo2.requireContext();
                if (z) {
                    igdsListCell2.A0H(requireContext2.getString(2131972815));
                    igdsListCell = eo2.A03;
                    requireContext = eo2.requireContext();
                    i = R.drawable.instagram_users_pano_outline_24;
                } else {
                    igdsListCell2.A0H(requireContext2.getString(2131972821));
                    igdsListCell = eo2.A03;
                    requireContext = eo2.requireContext();
                    i = R.drawable.instagram_lock_pano_outline_24;
                }
            }
            igdsListCell.A09(requireContext.getDrawable(i));
        }
    }

    @Override // X.InterfaceC11480j6
    public final C11520jB E6b() {
        C11520jB c11520jB = new C11520jB();
        c11520jB.A0A(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, getSession().userId);
        return c11520jB;
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        if (isAdded()) {
            interfaceC56362iU.EkS(true);
            int i = 2131972736;
            if (this.A04 == EnumC33380EpD.A04) {
                i = 2131972737;
            }
            interfaceC56362iU.Efu(i);
            C3LO A0B = AbstractC31171DnF.A0B();
            A0B.A0K = getString(2131952265);
            this.A09 = AbstractC31177DnL.A0F(new ViewOnClickListenerC35686FpL(this, 12), A0B, interfaceC56362iU);
            A01(this);
        }
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1042 && i2 == -1) {
            C1DX A00 = C1DW.A00(getSession());
            intent.getClass();
            A00(A00.A02(intent.getStringExtra("cover_media_id")));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1624894954);
        super.onCreate(bundle);
        this.A00 = requireArguments().getInt("ARGUMENT_NUM_MEDIA_COLLECTIONS");
        UserSession A0S = AbstractC31176DnK.A0S(this);
        this.A02 = A0S;
        this.A08 = AbstractC35085Fcw.A01(A0S);
        ArrayList<String> stringArrayList = requireArguments().getStringArrayList(AbstractC111324zv.A00(160));
        if (stringArrayList == null) {
            stringArrayList = AbstractC166987dD.A1E();
        }
        this.A06 = stringArrayList;
        this.A04 = (EnumC33380EpD) EnumC33380EpD.A01.get(requireArguments().getString("SaveFragment.ARGUMENT_SAVED_FEED_COLLECTION_SUBTYPE"));
        C0f9.A09(914073460, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate;
        int i;
        int A02 = C0f9.A02(-1131755595);
        if (this.A08) {
            inflate = layoutInflater.inflate(R.layout.create_collection_from_selected_public, viewGroup, false);
            i = -677120227;
        } else {
            inflate = layoutInflater.inflate(R.layout.create_collection_from_selected, viewGroup, false);
            i = 898170972;
        }
        C0f9.A09(i, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1681081790);
        super.onDestroyView();
        this.A09 = null;
        this.A0A = null;
        this.A01 = null;
        C0f9.A09(-46819289, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-1732546269);
        super.onPause();
        AbstractC31171DnF.A16(this);
        Window A0H = AbstractC31174DnI.A0H(this);
        A0H.getClass();
        A0H.setSoftInputMode(0);
        C0f9.A09(-1378293522, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-761123476);
        super.onResume();
        this.A01.requestFocus();
        Window A0H = AbstractC31174DnI.A0H(this);
        A0H.getClass();
        A0H.setSoftInputMode(32);
        if (!this.A08) {
            AbstractC13880nE.A0N(this.A01);
        }
        C0f9.A09(801877921, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.A08) {
            this.A03 = AbstractC31173DnH.A0Y(view, R.id.change_audience);
            AbstractC31171DnF.A16(this);
            IgdsListCell igdsListCell = this.A03;
            if (igdsListCell != null) {
                igdsListCell.A0G(EnumC53237Nga.A04, true);
                this.A03.A0I(requireContext().getString(2131972797));
                A02(this);
                this.A03.A0C(new ViewOnClickListenerC35686FpL(this, 13));
            }
        }
        EditText A0H = AbstractC31173DnH.A0H(view, R.id.saved_collection_name);
        this.A01 = A0H;
        int i = 2131972735;
        if (this.A04 == EnumC33380EpD.A04) {
            i = 2131972743;
        }
        A0H.setHint(i);
        this.A01.addTextChangedListener(this.A0B);
        this.A01.setEnabled(true);
        this.A01.requestFocus();
        View requireViewById = view.requireViewById(R.id.edit_cover_text);
        View.OnClickListener onClickListener = this.A0C;
        C0fQ.A00(onClickListener, requireViewById);
        RoundedCornerCheckMarkSelectableImageView roundedCornerCheckMarkSelectableImageView = (RoundedCornerCheckMarkSelectableImageView) view.requireViewById(R.id.collection_image);
        this.A0A = roundedCornerCheckMarkSelectableImageView;
        C0fQ.A00(onClickListener, roundedCornerCheckMarkSelectableImageView);
        requireViewById.setEnabled(AbstractC25226BEj.A1b(this.A06));
        if (this.A06.isEmpty()) {
            this.A0A.A02();
        } else {
            A00(C1DW.A00(getSession()).A02((String) AbstractC166997dE.A0k(this.A06)));
        }
    }
}
