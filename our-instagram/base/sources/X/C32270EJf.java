package X;

import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.ui.text.backinterceptedittext.BackInterceptEditText;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import com.instagram.user.model.User;

/* renamed from: X.EJf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32270EJf extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "DirectQuestionsAddResponseFragment";
    public ViewGroup A00;
    public IgTextView A01;
    public C31835Dyu A02;
    public BackInterceptEditText A03;
    public SpinnerImageView A04;
    public User A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public C3I9 A0A;
    public AnonymousClass988 A0B;
    public DirectThreadKey A0C;
    public final InterfaceC09390do A0D = AbstractC60492pY.A02(this);
    public final InterfaceC41501vz A0E = C31650DvG.A00(this, 16);
    public final InterfaceC60152ox A0F = new G0M(this, 0);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        Editable editable;
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.ETp(true);
        AbstractC31179DnN.A1G(interfaceC56362iU);
        BackInterceptEditText backInterceptEditText = this.A03;
        if (backInterceptEditText != null) {
            editable = backInterceptEditText.getText();
        } else {
            editable = null;
        }
        String valueOf = String.valueOf(editable);
        if (valueOf.length() > 0) {
            interfaceC56362iU.Ect(getString(2131952265), new ViewOnClickListenerC35671Fp6(valueOf, this, 5));
        } else {
            interfaceC56362iU.AAC(2131952265);
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "direct_questions_add_response_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = AbstractC31173DnH.A0F(view, R.id.direct_card_add_response);
        this.A04 = (SpinnerImageView) view.requireViewById(R.id.spinner);
        C3I8 A01 = C3I7.A01(this, false, false);
        this.A0A = A01;
        A01.A9e(this.A0F);
        IgImageView A0T = AbstractC167007dF.A0T(view, R.id.profile_picture);
        User user = this.A05;
        if (user == null) {
            str = PublicKeyCredentialControllerUtility.JSON_KEY_USER;
        } else {
            AbstractC31173DnH.A1T(this, A0T, user);
            this.A01 = AbstractC31172DnG.A0X(view, R.id.character_count);
            A00(this, 0);
            View requireViewById = view.requireViewById(R.id.question_edittext);
            BackInterceptEditText backInterceptEditText = (BackInterceptEditText) requireViewById;
            this.A03 = backInterceptEditText;
            C14360o3.A07(requireViewById);
            C35469Fl4.A00(backInterceptEditText, this, 4);
            backInterceptEditText.setOnBackCallback(C37051GUh.A00(backInterceptEditText, 29));
            backInterceptEditText.requestFocus();
            AbstractC13880nE.A0T(backInterceptEditText);
            C31835Dyu c31835Dyu = this.A02;
            if (c31835Dyu == null) {
                str = "viewModel";
            } else {
                AbstractC31174DnI.A1E(this, c31835Dyu.A00, new C50370MLx(39, view, this), 12);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A00(C32270EJf c32270EJf, int i) {
        IgTextView igTextView = c32270EJf.A01;
        if (igTextView != null) {
            igTextView.setText(c32270EJf.getString(2131960213, AbstractC25228BEl.A1Z(Integer.valueOf(i), AbstractC166997dE.A0N(c32270EJf).getInteger(R.integer.prompt_response_max_length))));
        }
        C14360o3.A0C(c32270EJf.getActivity(), "null cannot be cast to non-null type com.instagram.base.activity.BaseFragmentActivity");
        AbstractC31178DnM.A0w(c32270EJf);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0D);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C3o9 c3o9;
        Throwable A0t;
        int i;
        String str;
        String string;
        String str2;
        String str3;
        String str4;
        String string2;
        User A02;
        int A022 = C0f9.A02(705234076);
        super.onCreate(bundle);
        InterfaceC09390do interfaceC09390do = this.A0D;
        this.A05 = AbstractC31178DnM.A0U(interfaceC09390do);
        Bundle bundle2 = this.mArguments;
        String str5 = null;
        if (bundle2 != null) {
            c3o9 = AbstractC43826JZo.A00(bundle2, "DirectStoryViewerFragment.ARGUMENTS_THREAD_KEY");
        } else {
            c3o9 = null;
        }
        DirectThreadKey directThreadKey = (DirectThreadKey) c3o9;
        if (directThreadKey != null) {
            this.A0C = directThreadKey;
            Bundle bundle3 = this.mArguments;
            if (bundle3 != null) {
                str = AbstractC31171DnF.A0b(bundle3);
            } else {
                str = null;
            }
            if (str != null) {
                this.A06 = str;
                Bundle bundle4 = this.mArguments;
                if (bundle4 != null && (string = bundle4.getString("surface")) != null) {
                    this.A07 = string;
                    Bundle bundle5 = this.mArguments;
                    String str6 = "";
                    if (bundle5 == null || (str2 = bundle5.getString("card_gallery_collection_title")) == null) {
                        str2 = "";
                    }
                    this.A09 = str2;
                    Bundle bundle6 = this.mArguments;
                    if (bundle6 != null && (string2 = bundle6.getString("card_gallery_sender_id")) != null && (A02 = AbstractC31176DnK.A0h(interfaceC09390do).A02(string2)) != null) {
                        str6 = A02.getUsername();
                    }
                    this.A08 = str6;
                    this.A0B = AbstractC31181DnP.A0A(interfaceC09390do);
                    UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                    DirectThreadKey directThreadKey2 = this.A0C;
                    if (directThreadKey2 == null) {
                        str4 = "threadKey";
                    } else {
                        String str7 = this.A06;
                        if (str7 == null) {
                            str4 = "collectionId";
                        } else {
                            Bundle bundle7 = this.mArguments;
                            if (bundle7 != null) {
                                str3 = bundle7.getString("message_id");
                            } else {
                                str3 = null;
                            }
                            this.A02 = (C31835Dyu) new EWV(A0r, directThreadKey2, str7, str3).create(C31835Dyu.class);
                            Bundle bundle8 = this.mArguments;
                            if (bundle8 != null) {
                                str5 = bundle8.getString("DirectFragment.ENTRY_POINT");
                            }
                            C31835Dyu c31835Dyu = this.A02;
                            if (c31835Dyu == null) {
                                str4 = "viewModel";
                            } else {
                                C31835Dyu.A00((C2EC) c31835Dyu.A07.getValue(), new C50269MHy(str5, c31835Dyu, 35));
                                C0f9.A09(-1396864673, A022);
                                return;
                            }
                        }
                    }
                    C14360o3.A0F(str4);
                    throw C00O.createAndThrow();
                }
                A0t = AbstractC166987dD.A14("Required value was null.");
                i = -1416577184;
            } else {
                A0t = AbstractC166987dD.A14("Required value was null.");
                i = -1496586172;
            }
        } else {
            A0t = AbstractC31172DnG.A0t();
            i = 1676575395;
        }
        C0f9.A09(i, A022);
        throw A0t;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1059472033);
        C14360o3.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.direct_card_add_response_layout, viewGroup, false);
        C0f9.A09(-951611748, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-1682621660);
        super.onDestroy();
        C3I9 c3i9 = this.A0A;
        if (c3i9 == null) {
            AbstractC31171DnF.A0r();
            throw C00O.createAndThrow();
        }
        c3i9.EFx(this.A0F);
        C0f9.A09(1548830273, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-631126274);
        super.onDestroyView();
        this.A00 = null;
        this.A03 = null;
        this.A01 = null;
        this.A04 = null;
        C0f9.A09(-540367783, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-991915800);
        super.onPause();
        AbstractC31176DnK.A0Q(this.A0D).A02(this.A0E, C7MN.class);
        C3I9 c3i9 = this.A0A;
        if (c3i9 == null) {
            AbstractC31171DnF.A0r();
            throw C00O.createAndThrow();
        }
        c3i9.onStop();
        C0f9.A09(875673176, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1588641795);
        super.onResume();
        AbstractC31176DnK.A0Q(this.A0D).A01(this.A0E, C7MN.class);
        C3I9 c3i9 = this.A0A;
        if (c3i9 == null) {
            AbstractC31171DnF.A0r();
            throw C00O.createAndThrow();
        }
        c3i9.Dnr(getActivity());
        C0f9.A09(-1601463987, A02);
    }
}
