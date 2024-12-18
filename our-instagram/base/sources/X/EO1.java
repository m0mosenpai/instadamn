package X;

import android.os.Bundle;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.igds.components.textcell.IgdsListCell;

/* loaded from: classes6.dex */
public final class EO1 extends C53Z implements InterfaceC60442pS, InterfaceC11480j6, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "CreateCollectionFragment";
    public int A00;
    public View A01;
    public View A02;
    public EditText A03;
    public UserSession A04;
    public IgdsListCell A05;
    public boolean A06;
    public boolean A07;
    public final TextWatcher A08 = new C35469Fl4(this, 29);

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

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A03 = AbstractC31173DnH.A0H(view, R.id.saved_collection_name);
        this.A01 = view.requireViewById(R.id.audience_selector);
        UserSession userSession = this.A04;
        if (userSession == null) {
            str = "userSession";
        } else {
            this.A07 = AbstractC35085Fcw.A01(userSession);
            this.A05 = AbstractC31173DnH.A0Y(view, R.id.change_audience);
            if (this.A07) {
                View view2 = this.A01;
                if (view2 == null) {
                    str = "audienceSelector";
                } else {
                    view2.setVisibility(0);
                    IgdsListCell igdsListCell = this.A05;
                    str = "changeAudienceForPublicCollection";
                    if (igdsListCell != null) {
                        igdsListCell.A0G(EnumC53237Nga.A04, true);
                        IgdsListCell igdsListCell2 = this.A05;
                        if (igdsListCell2 != null) {
                            igdsListCell2.A0I(AbstractC166997dE.A0p(requireContext(), 2131972797));
                            A00(this);
                            IgdsListCell igdsListCell3 = this.A05;
                            if (igdsListCell3 != null) {
                                igdsListCell3.A0C(new ViewOnClickListenerC35686FpL(this, 10));
                            }
                        }
                    }
                }
            }
            EditText editText = this.A03;
            if (editText != null) {
                editText.addTextChangedListener(this.A08);
            }
            AbstractC31180DnO.A18(this.A03);
            EditText editText2 = this.A03;
            if (editText2 != null) {
                editText2.requestFocus();
                return;
            }
            return;
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.EO1 r4) {
        /*
            com.instagram.common.session.UserSession r0 = r4.A04
            if (r0 != 0) goto Le
            java.lang.String r3 = "userSession"
        L6:
            X.C14360o3.A0F(r3)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        Le:
            com.instagram.user.model.User r0 = X.AbstractC166997dE.A0Y(r0)
            java.lang.Integer r1 = r0.A0M()
            java.lang.Integer r0 = X.C05F.A01
            boolean r0 = X.AbstractC167007dF.A1X(r1, r0)
            java.lang.String r3 = "changeAudienceForPublicCollection"
            if (r0 == 0) goto L47
            boolean r0 = r4.A06
            if (r0 == 0) goto L47
            com.instagram.igds.components.textcell.IgdsListCell r2 = r4.A05
            if (r2 == 0) goto L6
            android.content.Context r1 = r4.requireContext()
            r0 = 2131972826(0x7f1352da, float:1.958267E38)
            X.AbstractC31180DnO.A12(r1, r2, r0)
            android.content.Context r1 = r4.requireContext()
            r0 = 2131238394(0x7f081dfa, float:1.8093065E38)
        L39:
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r0)
            if (r1 == 0) goto L46
            com.instagram.igds.components.textcell.IgdsListCell r0 = r4.A05
            if (r0 == 0) goto L6
            r0.A09(r1)
        L46:
            return
        L47:
            boolean r0 = r4.A06
            com.instagram.igds.components.textcell.IgdsListCell r2 = r4.A05
            if (r0 == 0) goto L61
            if (r2 == 0) goto L6
            android.content.Context r1 = r4.requireContext()
            r0 = 2131972815(0x7f1352cf, float:1.9582648E38)
            X.AbstractC31180DnO.A12(r1, r2, r0)
            android.content.Context r1 = r4.requireContext()
            r0 = 2131239033(0x7f082079, float:1.8094362E38)
            goto L39
        L61:
            if (r2 == 0) goto L6
            android.content.Context r1 = r4.requireContext()
            r0 = 2131972821(0x7f1352d5, float:1.958266E38)
            X.AbstractC31180DnO.A12(r1, r2, r0)
            android.content.Context r1 = r4.requireContext()
            r0 = 2131238578(0x7f081eb2, float:1.8093439E38)
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EO1.A00(X.EO1):void");
    }

    @Override // X.InterfaceC11480j6
    public final C11520jB E6b() {
        C11520jB c11520jB = new C11520jB();
        c11520jB.A0A(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, getSession().userId);
        return c11520jB;
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C35197Ffp A00 = C35197Ffp.A00(interfaceC56362iU);
        C35197Ffp.A02(AbstractC166997dE.A0N(this), A00, 2131972736);
        this.A02 = C31722DwR.A00(new ViewOnClickListenerC35686FpL(this, 9), interfaceC56362iU, A00);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1585587730);
        super.onCreate(bundle);
        this.A00 = requireArguments().getInt("ARGUMENT_NUM_MEDIA_COLLECTIONS");
        this.A04 = AbstractC31176DnK.A0S(this);
        C0f9.A09(-306290596, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-509078041);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.create_collection, viewGroup, false);
        C0f9.A09(-206742117, A02);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-1828887184);
        super.onPause();
        AbstractC31171DnF.A16(this);
        C0f9.A09(-1337811374, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1488192947);
        super.onResume();
        EditText editText = this.A03;
        if (editText != null) {
            editText.requestFocus();
            AbstractC13880nE.A0N(editText);
        }
        C0f9.A09(1006247921, A02);
    }
}
