package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.location.platform.api.Location;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import com.instagram.modal.ModalActivity;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.save.model.SavedCollection;
import com.instagram.ui.text.backinterceptedittext.BackInterceptEditText;
import com.instagram.user.model.User;
import java.util.Collection;

/* loaded from: classes6.dex */
public final class EME extends AbstractC59962oe implements InterfaceC60442pS, InterfaceC169507hQ {
    public static final String __redex_internal_original_name = "DirectNewCollectionFragment";
    public View A00;
    public View A01;
    public View A02;
    public ViewGroup A03;
    public RecyclerView A04;
    public IgTextView A05;
    public IgdsInlineSearchBox A06;
    public IgdsSwitch A07;
    public BackInterceptEditText A08;
    public Integer A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public final InterfaceC09390do A0T = C37059GUt.A00(this, 4);
    public final InterfaceC09390do A0I = A01(this, 43);
    public final InterfaceC09390do A0G = A01(this, 41);
    public final InterfaceC09390do A0M = A01(this, 47);
    public final InterfaceC09390do A0L = A01(this, 46);
    public final InterfaceC09390do A0P = C37059GUt.A00(this, 0);
    public final InterfaceC09390do A0O = A01(this, 49);
    public final InterfaceC09390do A0Q = C37059GUt.A00(this, 1);
    public final InterfaceC09390do A0R = C37059GUt.A00(this, 2);
    public final InterfaceC09390do A0N = A01(this, 48);
    public final InterfaceC09390do A0K = A01(this, 45);
    public final InterfaceC09390do A0U = C37059GUt.A00(this, 5);
    public final InterfaceC09390do A0H = A01(this, 42);
    public final InterfaceC09390do A0S = C37059GUt.A00(this, 3);
    public final InterfaceC09390do A0J = A01(this, 44);
    public final InterfaceC60152ox A0W = new G0M(this, 2);
    public final InterfaceC09390do A0V = AbstractC60492pY.A02(this);

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r1 != true) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(android.view.View r4, X.EME r5) {
        /*
            r3 = 1
            com.instagram.igds.components.switchbutton.IgdsSwitch r0 = r5.A07
            if (r0 == 0) goto Lc
            boolean r1 = r0.isChecked()
            r0 = 1
            if (r1 == r3) goto Ld
        Lc:
            r0 = 0
        Ld:
            boolean r0 = r5.A09(r0, r3)
            if (r0 == 0) goto L3f
            java.lang.Integer r0 = r5.A09
            if (r0 == 0) goto L22
            int r0 = r0.intValue()
            float r2 = (float) r0
            r1 = 0
            X.GTr r0 = X.C37035GTr.A00
            A07(r5, r0, r1, r2)
        L22:
            X.AbstractC13880nE.A0O(r4)
            X.0do r0 = r5.A0N
            boolean r0 = X.AbstractC167007dF.A1Z(r0)
            if (r0 == 0) goto L40
            com.instagram.save.model.SavedCollection r1 = new com.instagram.save.model.SavedCollection
            r1.<init>()
            com.instagram.ui.text.backinterceptedittext.BackInterceptEditText r0 = r5.A08
            if (r0 == 0) goto Lf4
            java.lang.String r0 = X.AbstractC167007dF.A0g(r0)
            r1.A0G = r0
            A05(r5, r1)
        L3f:
            return
        L40:
            X.0do r0 = r5.A0V
            X.0ll r0 = X.AbstractC166987dD.A0o(r0)
            X.1Ms r2 = X.AbstractC167017dG.A0c(r0)
            java.lang.String r0 = "collections/create/"
            r2.A0B(r0)
            java.lang.Class<com.instagram.save.model.SavedCollection> r1 = com.instagram.save.model.SavedCollection.class
            java.lang.Class<X.W6r> r0 = X.C70139W6r.class
            r2.A0R(r1, r0)
            com.instagram.ui.text.backinterceptedittext.BackInterceptEditText r0 = r5.A08
            if (r0 == 0) goto Lf4
            java.lang.String r1 = X.AbstractC167007dF.A0g(r0)
            java.lang.String r0 = "name"
            r2.A9s(r0, r1)
            X.0do r4 = r5.A0I
            com.instagram.direct.messagethread.collections.model.DirectCollectionArguments r0 = X.AbstractC31172DnG.A0f(r4)
            java.lang.Integer r0 = r0.A03
            java.lang.String r1 = X.FUP.A00(r0)
            java.lang.String r0 = "surface"
            r2.A9s(r0, r1)
            com.instagram.direct.messagethread.collections.model.DirectCollectionArguments r0 = X.AbstractC31172DnG.A0f(r4)
            java.lang.String r1 = r0.A07
            java.lang.String r0 = "module_name"
            r2.A9s(r0, r1)
            boolean r1 = r5.A0F
            java.lang.String r0 = "with_search_text"
            r2.A0I(r0, r1)
            com.instagram.direct.messagethread.collections.model.DirectCollectionArguments r0 = X.AbstractC31172DnG.A0f(r4)
            java.lang.String r0 = r0.A04
            if (r0 == 0) goto Ld7
            com.instagram.direct.messagethread.collections.model.DirectCollectionArguments r0 = X.AbstractC31172DnG.A0f(r4)
            java.lang.String r0 = r0.A04
            java.util.List r0 = X.AbstractC166987dD.A1J(r0)
            java.lang.String r1 = X.AbstractC31175DnJ.A0b(r0)
            java.lang.String r0 = "added_media_fbids"
        L9e:
            r2.A9s(r0, r1)
        La1:
            X.0do r0 = r5.A0T
            boolean r0 = X.AbstractC167007dF.A1Z(r0)
            if (r0 == 0) goto Lb6
            boolean r0 = r5.A0D
            if (r0 == 0) goto Lb6
            com.instagram.api.schemas.CollectionPrivacyModeEnum r0 = com.instagram.api.schemas.CollectionPrivacyModeEnum.A06
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "privacy_mode"
            r2.A9s(r0, r1)
        Lb6:
            java.lang.String r1 = r5.A00()
            java.lang.String r0 = "thread_id"
            r2.A0H(r0, r1)
            boolean r0 = r5.isAdded()
            if (r0 == 0) goto L3f
            X.1ON r1 = X.AbstractC31172DnG.A0U(r2, r3)
            X.0do r0 = r5.A0H
            java.lang.Object r0 = r0.getValue()
            X.1P1 r0 = (X.C1P1) r0
            r1.A00 = r0
            r5.schedule(r1)
            return
        Ld7:
            com.instagram.direct.messagethread.collections.model.DirectCollectionArguments r0 = X.AbstractC31172DnG.A0f(r4)
            java.lang.String r0 = r0.A00()
            if (r0 == 0) goto La1
            com.instagram.direct.messagethread.collections.model.DirectCollectionArguments r0 = X.AbstractC31172DnG.A0f(r4)
            java.lang.String r0 = r0.A00()
            java.util.List r0 = X.AbstractC166987dD.A1J(r0)
            java.lang.String r1 = X.AbstractC31175DnJ.A0b(r0)
            java.lang.String r0 = "added_media_ids"
            goto L9e
        Lf4:
            java.lang.String r0 = "collectionNameEditText"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EME.A02(android.view.View, X.EME):void");
    }

    public static final void A03(EME eme) {
        eme.A0C = true;
        View view = eme.A00;
        if (view != null) {
            ImageView A0D = AbstractC31176DnK.A0D(view, R.id.privacy_icon);
            View view2 = eme.A00;
            if (view2 != null) {
                TextView A0N = AbstractC167007dF.A0N(view2, R.id.visible_to);
                View view3 = eme.A00;
                if (view3 != null) {
                    TextView A0N2 = AbstractC167007dF.A0N(view3, R.id.audience_status);
                    View view4 = eme.A00;
                    if (view4 != null) {
                        ImageView A0D2 = AbstractC31176DnK.A0D(view4, R.id.chevron);
                        int A03 = AbstractC31173DnH.A03(eme.getContext(), eme.requireContext(), R.attr.igds_color_primary_text_disabled);
                        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                        A0D.setColorFilter(A03, mode);
                        A0N.setTextColor(A03);
                        A0N2.setTextColor(A03);
                        AbstractC25227BEk.A12(A0N2, eme, 2131968440);
                        A0D2.setColorFilter(A03, mode);
                        return;
                    }
                }
            }
        }
        C14360o3.A0F("audienceSelectorIntentRow");
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        if (r1 != true) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A08(X.EME r6, boolean r7) {
        /*
            r5 = 0
            boolean r4 = r6.A09(r7, r5)
            com.instagram.common.ui.base.IgTextView r1 = r6.A05
            java.lang.String r3 = "saveButton"
            if (r1 == 0) goto L4f
            r0 = 1050253722(0x3e99999a, float:0.3)
            if (r4 == 0) goto L12
            r0 = 1065353216(0x3f800000, float:1.0)
        L12:
            r1.setAlpha(r0)
            android.content.Context r0 = r6.requireContext()
            r2 = 1
            boolean r0 = X.AbstractC56862jK.A01(r0, r2)
            if (r0 == 0) goto L27
            com.instagram.common.ui.base.IgTextView r0 = r6.A05
            if (r0 == 0) goto L4f
            r0.setEnabled(r4)
        L27:
            com.instagram.igds.components.switchbutton.IgdsSwitch r0 = r6.A07
            if (r0 == 0) goto L32
            boolean r1 = r0.isChecked()
            r0 = 1
            if (r1 == r2) goto L33
        L32:
            r0 = 0
        L33:
            r1 = 0
            boolean r0 = r6.A09(r0, r5)
            r0 = r0 ^ 1
            com.instagram.common.ui.base.IgTextView r2 = r6.A05
            if (r2 == 0) goto L4f
            if (r0 == 0) goto L4b
            android.content.Context r1 = r6.requireContext()
            r0 = 2131952375(0x7f1302f7, float:1.954119E38)
            java.lang.String r1 = r1.getString(r0)
        L4b:
            r2.setContentDescription(r1)
            return
        L4f:
            X.C14360o3.A0F(r3)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EME.A08(X.EME, boolean):void");
    }

    @Override // X.InterfaceC169507hQ
    public final void DcI(InterfaceC169517hR interfaceC169517hR) {
        C14360o3.A0B(interfaceC169517hR, 0);
        if (!((Collection) interfaceC169517hR.Bov()).isEmpty()) {
            if (AbstractC31178DnM.A1a(this.A0R)) {
                C11T.A04(new GO5(this, interfaceC169517hR), 100L);
            } else {
                C11T.A02(new GO6(this, interfaceC169517hR));
            }
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "direct_new_collection";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b9, code lost:
    
        if (r1 != true) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0100  */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r10, android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 597
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EME.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    private final String A00() {
        IgdsSwitch igdsSwitch;
        if ((AbstractC167007dF.A1Z(this.A0P) || AbstractC167007dF.A1Z(this.A0O)) && (igdsSwitch = this.A07) != null && igdsSwitch.isChecked()) {
            DirectShareTarget directShareTarget = ((FKY) this.A0G.getValue()).A00;
            if (directShareTarget != null) {
                return directShareTarget.A08();
            }
            return null;
        }
        return AbstractC31172DnG.A0f(this.A0I).A08;
    }

    public static InterfaceC09390do A01(Object obj, int i) {
        return C1XM.A00(new C50252MHh(obj, i));
    }

    public static final void A04(EME eme) {
        Integer num = eme.A09;
        if (num != null) {
            int intValue = num.intValue();
            IgdsInlineSearchBox igdsInlineSearchBox = eme.A06;
            if (igdsInlineSearchBox != null) {
                boolean z = true;
                if (igdsInlineSearchBox.getSearchString().length() == 0 || intValue <= 0) {
                    z = false;
                }
                igdsInlineSearchBox.setVisibilityOfClearButton(z);
            }
        }
    }

    public static final void A05(EME eme, SavedCollection savedCollection) {
        if (AbstractC167007dF.A1Z(eme.A0N)) {
            C09530e4 A1L = AbstractC166987dD.A1L("SaveFragment.SAVE_HOME_TAB_MODE", EnumC39551HdN.A02);
            C09530e4 A1L2 = AbstractC166987dD.A1L("SaveFragment.ARGUMENT_SAVED_FEED_COLLECTION", savedCollection);
            C09530e4 A1L3 = AbstractC166987dD.A1L("SaveFragment.ARGUMENT_SAVED_COLLECTION_CREATE_IS_PUBLIC", Boolean.valueOf(eme.A0D));
            InterfaceC09390do interfaceC09390do = eme.A0I;
            Bundle A00 = AbstractC61636Rr0.A00(A1L, A1L2, A1L3, AbstractC166987dD.A1L("SaveFragment.ARGUMENT_SAVED_COLLECTION_CREATE_SURFACE", FUP.A00(AbstractC31172DnG.A0f(interfaceC09390do).A03)), AbstractC166987dD.A1L("SaveFragment.ARGUMENT_SAVED_COLLECTION_CREATE_WITH_SEARCH_TEXT", Boolean.valueOf(eme.A0F)), AbstractC166987dD.A1L("SaveFragment.ARGUMENT_SAVED_COLLECTION_CREATE_THREAD_ID", eme.A00()), AbstractC166987dD.A1L("SaveFragment.ARGUMENT_SAVED_COLLECTION_CREATE_ADDED_MEDIA_FBID", AbstractC31172DnG.A0f(interfaceC09390do).A04));
            FB6.A00();
            C38288GsX c38288GsX = new C38288GsX();
            AbstractC31179DnN.A0y(c38288GsX, AbstractC31173DnH.A0J(A00, c38288GsX, eme), eme.A0V);
            return;
        }
        AbstractC12990ll A0o = AbstractC166987dD.A0o(eme.A0V);
        AbstractC31173DnH.A1I(eme, AbstractC31171DnF.A0L(eme.requireActivity(), AbstractC167017dG.A0T("SaveFragment.ARGUMENT_SAVED_FEED_COLLECTION", savedCollection, AbstractC166987dD.A1L("SaveFragment.SAVE_HOME_TAB_MODE", EnumC39551HdN.A03)), A0o, ModalActivity.class, "saved_feed"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (r0.length() == 0) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, X.2zP] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A06(X.EME r8, X.InterfaceC169517hR r9) {
        /*
            X.0do r0 = r8.A0G
            java.lang.Object r7 = r0.getValue()
            X.FKY r7 = (X.FKY) r7
            java.util.List r1 = X.AbstractC31171DnF.A0m(r9)
            java.lang.String r0 = r9.BjQ()
            r5 = 0
            if (r0 == 0) goto L1a
            int r0 = r0.length()
            r4 = 0
            if (r0 != 0) goto L1b
        L1a:
            r4 = 1
        L1b:
            X.C14360o3.A0B(r1, r5)
            com.instagram.common.recyclerview.ViewModelListUpdate r6 = X.AbstractC31171DnF.A0E()
            if (r4 == 0) goto L2c
            X.Fxp r0 = new X.Fxp
            r0.<init>()
            r6.A00(r0)
        L2c:
            java.util.ArrayList r3 = X.AbstractC167017dG.A0q(r1)
            java.util.Iterator r2 = r1.iterator()
        L34:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L47
            com.instagram.model.direct.DirectShareTarget r1 = X.AbstractC31172DnG.A0m(r2)
            X.Fxz r0 = new X.Fxz
            r0.<init>(r1)
            r3.add(r0)
            goto L34
        L47:
            if (r4 == 0) goto L82
            com.instagram.model.direct.DirectShareTarget r1 = r7.A00
            if (r1 == 0) goto L82
            X.Fxz r0 = new X.Fxz
            r0.<init>(r1)
            r6.A00(r0)
            java.util.ArrayList r4 = X.AbstractC166987dD.A1E()
            java.util.Iterator r3 = r3.iterator()
        L5d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L81
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.Fxz r0 = (X.C36185Fxz) r0
            com.instagram.model.direct.DirectShareTarget r0 = r0.A00
            java.lang.String r1 = X.AbstractC31173DnH.A0o(r0)
            com.instagram.model.direct.DirectShareTarget r0 = r7.A00
            X.C14360o3.A0A(r0)
            java.lang.String r0 = r0.A09()
            boolean r0 = r1.equals(r0)
            X.AbstractC25228BEl.A1Q(r2, r4, r0)
            goto L5d
        L81:
            r3 = r4
        L82:
            r6.A01(r3)
            X.2zD r0 = r7.A01
            r0.A05(r6)
            androidx.recyclerview.widget.RecyclerView r0 = r8.A04
            if (r0 == 0) goto L91
            r0.A0n(r5)
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EME.A06(X.EME, X.7hR):void");
    }

    public static final void A07(EME eme, InterfaceC16820sZ interfaceC16820sZ, float f, float f2) {
        ViewGroup viewGroup = eme.A03;
        if (viewGroup != null) {
            AbstractC125325le A00 = AbstractC125325le.A00(viewGroup);
            A00.A0G();
            AbstractC125325le A0A = A00.A0A();
            A0A.A0K(f);
            A0A.A0N(viewGroup.getHeight(), f2);
            A0A.A05 = new C24088AmZ(interfaceC16820sZ, 2);
            A0A.A0H();
        }
        View view = eme.A02;
        if (view == null) {
            C14360o3.A0F("composerContainer");
            throw C00O.createAndThrow();
        }
        AbstractC125325le A002 = AbstractC125325le.A00(view);
        A002.A0G();
        AbstractC125325le A0A2 = A002.A0A();
        A0A2.A0K(f);
        A0A2.A0H();
    }

    private final boolean A09(boolean z, boolean z2) {
        Context context;
        int i;
        BackInterceptEditText backInterceptEditText = this.A08;
        String str = null;
        if (backInterceptEditText == null) {
            C14360o3.A0F("collectionNameEditText");
            throw C00O.createAndThrow();
        }
        Editable text = backInterceptEditText.getText();
        if (text != null && !AbstractC001900j.A0T(text)) {
            if (!z || ((FKY) this.A0G.getValue()).A00 != null) {
                return true;
            }
            if (z2) {
                context = getContext();
                if (context != null) {
                    i = 2131956341;
                    str = context.getString(i);
                }
                C146106i8 A0j = AbstractC25229BEm.A0j();
                C41451vu c41451vu = C41451vu.A01;
                A0j.A0D = str;
                AbstractC31178DnM.A1N(c41451vu, A0j);
            }
            return false;
        }
        if (z2) {
            context = getContext();
            if (context != null) {
                i = 2131956340;
                str = context.getString(i);
            }
            C146106i8 A0j2 = AbstractC25229BEm.A0j();
            C41451vu c41451vu2 = C41451vu.A01;
            A0j2.A0D = str;
            AbstractC31178DnM.A1N(c41451vu2, A0j2);
        }
        return false;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0V);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1222860456);
        super.onCreate(bundle);
        Window A0H = AbstractC31174DnI.A0H(this);
        if (A0H != null) {
            A0H.setSoftInputMode(53);
        }
        if (!AbstractC167007dF.A1Z(this.A0O)) {
            ((C3I9) AbstractC166987dD.A17(this.A0S)).A9e(this.A0W);
        }
        C34999FbW c34999FbW = (C34999FbW) this.A0K.getValue();
        String obj = this.A0L.getValue().toString();
        C14360o3.A0B(obj, 0);
        UserSession userSession = c34999FbW.A00;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "ig_collections");
        if (A0f.isSampled()) {
            A0f.AAP("module_name", AbstractC167007dF.A0h(obj));
            AbstractC31171DnF.A1B(A0f, "collection_creation_enter");
            AbstractC31171DnF.A1G(A0f, c34999FbW.A01.A07);
            User A10 = AbstractC166987dD.A10(userSession);
            A0f.A9M(Location.EXTRAS, AbstractC25233BEq.A0p("has_collab_collections", String.valueOf(A10.A03.BBM()), AbstractC166987dD.A1L("has_private_collections", String.valueOf(A10.A03.BCS()))));
            A0f.Cht();
        }
        C0f9.A09(357777363, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1437996051);
        C14360o3.A0B(layoutInflater, 0);
        boolean A1Z = AbstractC167007dF.A1Z(this.A0O);
        int i = R.layout.new_collection_fragment;
        if (A1Z) {
            i = R.layout.new_empty_collection_fragment;
        }
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, i, false);
        C0f9.A09(1056634270, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(934122527);
        super.onDestroy();
        ((C3I9) AbstractC166987dD.A17(this.A0S)).EFx(this.A0W);
        ((InterfaceC169517hR) this.A0U.getValue()).DEw();
        C0f9.A09(478797048, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(2057575642);
        super.onStart();
        ((C3I9) AbstractC166987dD.A17(this.A0S)).Dnr(requireActivity());
        C0f9.A09(435210142, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(-1507005115);
        super.onStop();
        ((C3I9) AbstractC166987dD.A17(this.A0S)).onStop();
        C0f9.A09(692740248, A02);
    }
}
