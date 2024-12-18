package X;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import com.instagram.ui.emptystaterow.EmptyStateView;
import com.instagram.user.model.User;
import java.util.HashMap;

/* renamed from: X.N7f, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52174N7f extends C53Z implements InterfaceC60072op {
    public static final OGb A0M = new Object();
    public static final String __redex_internal_original_name = "PeopleTagSearchFragment";
    public int A00;
    public ContextThemeWrapper A01;
    public ListView A02;
    public IgdsInlineSearchBox A03;
    public C65974TxR A04;
    public InterfaceC58082Pp7 A05;
    public OL1 A06;
    public String A08;
    public String A09;
    public String A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public int A0E;
    public InterfaceC190488c6 A0F;
    public C55619On4 A0G;
    public boolean A0I;
    public boolean A0J;
    public Integer A07 = C05F.A0C;
    public String A0H = "";
    public final C56711PFd A0K = new C56711PFd(this, 3);
    public final C54481O5j A0L = new C54481O5j(this);

    public static final void A02(C52174N7f c52174N7f, String str) {
        c52174N7f.A0C = false;
        c52174N7f.A0H = str;
        OL1 ol1 = c52174N7f.A06;
        String str2 = "adapter";
        if (ol1 != null) {
            ol1.A00 = str;
            ((C65960TxC) ol1.A02.getValue()).A04();
            ((C52198N8n) ol1.A05.getValue()).A00();
            if (c52174N7f.A0H.length() == 0) {
                AbstractC167007dF.A0x(c52174N7f.A02);
                OL1 ol12 = c52174N7f.A06;
                if (ol12 != null) {
                    ol12.A00();
                    return;
                }
            } else {
                if (!c52174N7f.A0J) {
                    c52174N7f.A0J = true;
                    InterfaceC190488c6 interfaceC190488c6 = c52174N7f.A0F;
                    if (interfaceC190488c6 == null) {
                        str2 = "searchLogger";
                    } else {
                        interfaceC190488c6.Clg();
                    }
                }
                ListView listView = c52174N7f.A02;
                if (listView != null) {
                    listView.setVisibility(0);
                }
                OL1 ol13 = c52174N7f.A06;
                if (ol13 != null) {
                    if (AbstractC31178DnM.A1a(ol13.A03)) {
                        C65974TxR c65974TxR = c52174N7f.A04;
                        if (c65974TxR == null) {
                            str2 = "queuedTypeaheadManager";
                        } else {
                            c65974TxR.A06(c52174N7f.A0H);
                        }
                    }
                    OL1 ol14 = c52174N7f.A06;
                    if (ol14 != null) {
                        ol14.A01(MSZ.A0q(c52174N7f, c52174N7f.A0H, 2131973013), c52174N7f.A00, false);
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "collaborator_search";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        C14360o3.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("HAS_USER_TYPED_SOMETHING", this.A0J);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        OL1 ol1 = this.A06;
        String str = "adapter";
        if (ol1 != null) {
            boolean A1a = AbstractC31178DnM.A1a(ol1.A03);
            ListView listView = this.A02;
            if (A1a) {
                if (listView != null) {
                    AbstractC31172DnG.A1B(getThemedContext(), listView, AbstractC53242c7.A0D(getThemedContext()));
                }
            } else if (listView != null) {
                listView.setBackground(new ColorDrawable(AbstractC53242c7.A0F(getThemedContext(), R.attr.peopleTagSearchBackground)));
            }
            ListView listView2 = this.A02;
            if (listView2 != null) {
                listView2.setCacheColorHint(AbstractC53242c7.A0F(getThemedContext(), R.attr.peopleTagSearchCacheColorHint));
            }
            ListView listView3 = this.A02;
            if (listView3 != null) {
                OL1 ol12 = this.A06;
                if (ol12 != null) {
                    listView3.setAdapter((ListAdapter) ol12.A05.getValue());
                }
            }
            IgdsInlineSearchBox igdsInlineSearchBox = this.A03;
            if (igdsInlineSearchBox != null) {
                igdsInlineSearchBox.A0E.requestFocus();
            }
            IgdsInlineSearchBox igdsInlineSearchBox2 = this.A03;
            if (igdsInlineSearchBox2 != null) {
                igdsInlineSearchBox2.A04();
            }
            C55619On4 c55619On4 = this.A0G;
            if (c55619On4 == null) {
                str = "facebookInviteEventLogger";
            } else {
                OL1 ol13 = this.A06;
                if (ol13 != null) {
                    int count = ((C2UT) ol13.A05.getValue()).getCount();
                    C14360o3.A0B(getSession(), 1);
                    C19280xC A00 = C19280xC.A00(c55619On4.A00, "search_list_ig_fb_toggle");
                    A00.A0C("referring_screen", "photo_tag");
                    A00.A0C("invite_flow", "fb");
                    A00.A0C("extra_action", "page_loaded");
                    A00.A08(Integer.valueOf(count), "ig_count");
                    AbstractC31173DnH.A1S(A00, c55619On4.A01);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A00(C52174N7f c52174N7f, User user, int i) {
        InterfaceC190488c6 interfaceC190488c6 = c52174N7f.A0F;
        if (interfaceC190488c6 == null) {
            C14360o3.A0F("searchLogger");
            throw C00O.createAndThrow();
        }
        String id = user.getId();
        Integer num = C05F.A0N;
        interfaceC190488c6.ClZ(C70108W4f.A00(null, "server_results", id, "USER", null, "server"), num, C05F.A0C, c52174N7f.A0H, "", i);
    }

    @Override // X.AbstractC59962oe
    /* renamed from: A03, reason: merged with bridge method [inline-methods] */
    public final ContextThemeWrapper getThemedContext() {
        ContextThemeWrapper contextThemeWrapper = this.A01;
        if (contextThemeWrapper != null) {
            return contextThemeWrapper;
        }
        C14360o3.A0F("themedContext");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        InterfaceC58082Pp7 interfaceC58082Pp7 = this.A05;
        if (interfaceC58082Pp7 != null) {
            interfaceC58082Pp7.AVh();
            return true;
        }
        return true;
    }

    public static final void A01(C52174N7f c52174N7f, User user, int i) {
        FragmentActivity requireActivity;
        C193328hC A0H;
        int i2;
        String A0c;
        Boolean AkK;
        if (AbstractC31171DnF.A1W(c52174N7f.getSession(), user.getId())) {
            FragmentActivity requireActivity2 = c52174N7f.requireActivity();
            A0H = AbstractC31171DnF.A0H(requireActivity2);
            A0c = requireActivity2.getString(2131954780);
        } else {
            if (OQE.A00(c52174N7f.getSession(), user)) {
                AbstractC55114ObY.A03(c52174N7f.requireActivity(), c52174N7f, c52174N7f.getSession(), c52174N7f.A0D);
                C18920wW A01 = AbstractC12220kQ.A01(c52174N7f, c52174N7f.getSession());
                UserSession session = c52174N7f.getSession();
                C14360o3.A0B(session, 1);
                String str = session.userId;
                String id = user.getId();
                boolean A0Q = C57582kX.A00(session).A0Q(user);
                HashMap A0e = AbstractC31179DnN.A0e();
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A01, "ig_wellbeing_tag_controls_action");
                A0f.A9K("actor_ig_userid", AbstractC25228BEl.A13(str));
                AbstractC31171DnF.A1C(A0f, "click");
                AbstractC31171DnF.A1A(A0f, "non_taggable_user_in_search_collab");
                A0f.A9K("ig_userid", AbstractC166997dE.A0j(id));
                A0f.A7v("is_following", Boolean.valueOf(A0Q));
                A0f.A9M("extra_values", A0e);
                A0f.Cht();
            }
            Boolean AkJ = user.A03.AkJ();
            if (AkJ != null && AkJ.booleanValue()) {
                if (c52174N7f.A08 != null && (AkK = user.A03.AkK()) != null && !AkK.booleanValue()) {
                    requireActivity = c52174N7f.requireActivity();
                    A0H = AbstractC31171DnF.A0H(requireActivity);
                    i2 = 2131954779;
                } else {
                    A00(c52174N7f, user, i);
                    InterfaceC58082Pp7 interfaceC58082Pp7 = c52174N7f.A05;
                    if (interfaceC58082Pp7 == null) {
                        return;
                    }
                    interfaceC58082Pp7.AAT(user, true);
                    return;
                }
            } else {
                requireActivity = c52174N7f.requireActivity();
                A0H = AbstractC31171DnF.A0H(requireActivity);
                i2 = 2131954778;
            }
            A0c = AbstractC31178DnM.A0c(requireActivity, user, i2);
        }
        A0H.A0r(A0c);
        AbstractC31176DnK.A1W(A0H);
        C18920wW A012 = AbstractC12220kQ.A01(c52174N7f, c52174N7f.getSession());
        UserSession session2 = c52174N7f.getSession();
        C14360o3.A0B(session2, 1);
        String str2 = session2.userId;
        String id2 = user.getId();
        boolean A0Q2 = C57582kX.A00(session2).A0Q(user);
        HashMap A0e2 = AbstractC31179DnN.A0e();
        InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(A012, "ig_wellbeing_tag_controls_action");
        A0f2.A9K("actor_ig_userid", AbstractC25228BEl.A13(str2));
        AbstractC31171DnF.A1C(A0f2, "click");
        AbstractC31171DnF.A1A(A0f2, "non_taggable_user_in_search_collab");
        A0f2.A9K("ig_userid", AbstractC166997dE.A0j(id2));
        A0f2.A7v("is_following", Boolean.valueOf(A0Q2));
        A0f2.A9M("extra_values", A0e2);
        A0f2.Cht();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00ee, code lost:
    
        if (r4.equals(r2.A0J()) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0112, code lost:
    
        if (X.C18U.A06(r4, r5, 36326408187885422L) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0119, code lost:
    
        if (r2 != false) goto L25;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r22) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52174N7f.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        IgdsInlineSearchBox igdsInlineSearchBox;
        int A02 = C0f9.A02(-874973801);
        C14360o3.A0B(layoutInflater, 0);
        View A07 = AbstractC31175DnJ.A07(layoutInflater.cloneInContext(getThemedContext()), viewGroup, R.layout.fragment_people_tag_search, false);
        if (this.A0I) {
            AbstractC31172DnG.A1B(getThemedContext(), A07, R.color.design_dark_default_color_on_background);
        }
        if (bundle != null) {
            this.A0J = bundle.getBoolean("HAS_USER_TYPED_SOMETHING");
        }
        IgdsInlineSearchBox igdsInlineSearchBox2 = (IgdsInlineSearchBox) A07.requireViewById(R.id.row_search_edit_text);
        this.A03 = igdsInlineSearchBox2;
        if (igdsInlineSearchBox2 != null) {
            igdsInlineSearchBox2.setHint(AbstractC166997dE.A0q(getThemedContext().getResources(), 2131973010));
        }
        IgdsInlineSearchBox igdsInlineSearchBox3 = this.A03;
        if (igdsInlineSearchBox3 != null) {
            igdsInlineSearchBox3.setImeOptions(268435463);
        }
        if (!this.A0C && (igdsInlineSearchBox = this.A03) != null) {
            igdsInlineSearchBox.A02 = new P38(this);
        }
        if (this.A0D) {
            View view = AbstractC37301Gc2.A0D(A07, R.id.collaborator_search_empty_state_view_stub).getView();
            C14360o3.A0C(view, "null cannot be cast to non-null type com.instagram.ui.emptystaterow.EmptyStateView");
            EmptyStateView emptyStateView = (EmptyStateView) view;
            int i2 = 2131964643;
            if (C18U.A06(C06090Tz.A05, getSession(), 36312999300236887L)) {
                i2 = 2131952291;
            }
            EnumC153216up enumC153216up = EnumC153216up.A02;
            emptyStateView.A0T(enumC153216up, i2);
            boolean A1X = AbstractC167007dF.A1X(C05F.A0C, C17060sy.A01.A01(getSession()).A0M());
            if (this.A0B) {
                i = 2131969761;
                if (A1X) {
                    i = 2131969952;
                }
            } else {
                i = 2131956351;
                if (A1X) {
                    i = 2131969947;
                }
            }
            emptyStateView.A0S(enumC153216up, i);
            emptyStateView.A0P(enumC153216up);
            emptyStateView.A0I();
            emptyStateView.setVisibility(0);
        }
        this.A02 = (ListView) A07.requireViewById(android.R.id.list);
        C0f9.A09(-2018628363, A02);
        return A07;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(1101423506);
        super.onDestroy();
        C65974TxR c65974TxR = this.A04;
        if (c65974TxR == null) {
            C14360o3.A0F("queuedTypeaheadManager");
            throw C00O.createAndThrow();
        }
        c65974TxR.onDestroy();
        C0f9.A09(1745484849, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(960634967);
        super.onDestroyView();
        IgdsInlineSearchBox igdsInlineSearchBox = this.A03;
        if (igdsInlineSearchBox != null) {
            igdsInlineSearchBox.A02 = null;
        }
        this.A03 = null;
        this.A02 = null;
        this.A05 = null;
        C0f9.A09(-1286939628, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-1115416664);
        super.onPause();
        IgdsInlineSearchBox igdsInlineSearchBox = this.A03;
        if (igdsInlineSearchBox != null) {
            igdsInlineSearchBox.A03();
        }
        Window A0H = AbstractC31174DnI.A0H(this);
        if (A0H != null) {
            A0H.setSoftInputMode(this.A0E);
            C0f9.A09(751177529, A02);
        } else {
            IllegalStateException A0g = AbstractC166997dE.A0g();
            C0f9.A09(-68064212, A02);
            throw A0g;
        }
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        String searchString;
        int A02 = C0f9.A02(1578427980);
        super.onResume();
        Window A0H = AbstractC31174DnI.A0H(this);
        if (A0H != null) {
            this.A0E = A0H.getAttributes().softInputMode;
            A0H.setSoftInputMode(16);
            IgdsInlineSearchBox igdsInlineSearchBox = this.A03;
            if (igdsInlineSearchBox != null && (searchString = igdsInlineSearchBox.getSearchString()) != null) {
                A02(this, searchString);
            }
            C0f9.A09(-659270521, A02);
            return;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A09(-1468152890, A02);
        throw A0g;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(-1318260115);
        super.onStart();
        if (this.A0C) {
            AbstractC167007dF.A0w(this.A02);
            OL1 ol1 = this.A06;
            if (ol1 == null) {
                AbstractC31171DnF.A0t();
                throw C00O.createAndThrow();
            }
            ol1.A00();
            IgdsInlineSearchBox igdsInlineSearchBox = this.A03;
            if (igdsInlineSearchBox != null) {
                igdsInlineSearchBox.A02 = new P38(this);
            }
        }
        C0f9.A09(-1096763834, A02);
    }
}
