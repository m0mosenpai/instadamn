package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.user.model.User;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.EMc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32330EMc extends AbstractC59962oe implements InterfaceC189488aT, InterfaceC169507hQ, InterfaceC37204GaF {
    public static final String __redex_internal_original_name = "MentionsUserSearchFragment";
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public C23710Aej A04;
    public IgdsBottomButtonLayout A05;
    public GYD A07;
    public InterfaceC169517hR A08;
    public boolean A0C;
    public int A0D;
    public View A0E;
    public RecyclerView A0F;
    public C66362zD A0G;
    public boolean A0I;
    public final LinkedHashMap A0O = AbstractC166987dD.A1I();
    public final HashSet A0L = AbstractC166987dD.A1H();
    public final HashSet A0K = AbstractC166987dD.A1H();
    public final HashSet A0M = AbstractC166987dD.A1H();
    public String A09 = "";
    public String A0A = "";
    public String A0B = "";
    public EnumC33393EpQ A06 = EnumC33393EpQ.A04;
    public boolean A0H = true;
    public final String A0J = "anytime_mention_search_sheet";
    public final InterfaceC09390do A0N = AbstractC60492pY.A02(this);
    public final boolean A0P = true;

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ boolean ABC() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ boolean ANe() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final int Aqi() {
        return -1;
    }

    @Override // X.InterfaceC189488aT
    public final int C9V() {
        return 0;
    }

    @Override // X.InterfaceC189488aT
    /* renamed from: CO7 */
    public final float Cpk() {
        return 0.6f;
    }

    @Override // X.InterfaceC37204GaF
    public final boolean Caq(User user) {
        return false;
    }

    @Override // X.InterfaceC37204GaF
    public final boolean Ccd(User user) {
        C14360o3.A0B(user, 0);
        if (user.A2D()) {
            HashSet hashSet = this.A0L;
            if (!hashSet.contains(user)) {
                int size = hashSet.size();
                HashSet hashSet2 = this.A0M;
                if (size + hashSet2.size() < this.A01 || hashSet2.contains(user)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final float Cnp() {
        return 1.0f;
    }

    @Override // X.InterfaceC37204GaF
    public final void Cub(User user) {
    }

    @Override // X.InterfaceC189498aU
    public final void DOM() {
        this.A0D = 0;
        A00(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
    
        if (r1 == 0) goto L10;
     */
    @Override // X.InterfaceC169507hQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DcI(X.InterfaceC169517hR r5) {
        /*
            r4 = this;
            r0 = 0
            X.C14360o3.A0B(r5, r0)
            java.util.LinkedHashMap r3 = r4.A0O
            r3.clear()
            java.lang.Object r0 = r5.Bov()
            java.util.Iterator r2 = X.AbstractC25226BEj.A1J(r0)
        L11:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L23
            com.instagram.user.model.User r1 = X.AbstractC25226BEj.A15(r2)
            java.lang.String r0 = r1.getId()
            r3.put(r0, r1)
            goto L11
        L23:
            java.lang.String r0 = r5.BjQ()
            if (r0 == 0) goto L30
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L31
        L30:
            r0 = 1
        L31:
            r4.A01(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32330EMc.DcI(X.7hR):void");
    }

    @Override // X.InterfaceC37204GaF
    public final boolean Dxg(User user, boolean z) {
        String str;
        C14360o3.A0B(user, 0);
        HashSet hashSet = this.A0L;
        boolean z2 = false;
        if (!hashSet.contains(user)) {
            if (!user.A2D()) {
                Context requireContext = requireContext();
                InterfaceC09390do interfaceC09390do = this.A0N;
                AbstractC35239FgY.A03(requireContext, AbstractC166987dD.A0r(interfaceC09390do), user, null, "story", null, null);
                FDR.A00(AbstractC31176DnK.A0M(this, interfaceC09390do), AbstractC166987dD.A0r(interfaceC09390do), user, "story", "click", AbstractC111324zv.A00(67));
            } else {
                int size = hashSet.size();
                HashSet hashSet2 = this.A0M;
                boolean z3 = false;
                if (size + hashSet2.size() >= this.A01) {
                    z3 = true;
                }
                if (z) {
                    if (z3) {
                        AbstractC22754A1y.A00(requireContext(), this.A01);
                        return false;
                    }
                    hashSet2.add(user);
                } else {
                    hashSet2.remove(user);
                }
                C23710Aej c23710Aej = this.A04;
                if (c23710Aej != null) {
                    str = "model";
                    C217859kI c217859kI = c23710Aej.A00;
                    if (z) {
                        if (c217859kI != null) {
                            c217859kI.A06.add(user);
                            C23710Aej.A01(c23710Aej);
                        }
                        C14360o3.A0F(str);
                        throw C00O.createAndThrow();
                    }
                    if (c217859kI != null) {
                        c217859kI.A06.remove(user);
                        C23710Aej.A01(c23710Aej);
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                InterfaceC169517hR interfaceC169517hR = this.A08;
                if (interfaceC169517hR == null) {
                    str = "searchResultsProvider";
                } else {
                    String BjQ = interfaceC169517hR.BjQ();
                    if (BjQ == null || BjQ.length() == 0) {
                        z2 = true;
                    }
                    A01(z2);
                    boolean z4 = false;
                    if (hashSet.size() + hashSet2.size() >= this.A01) {
                        z4 = true;
                    }
                    if (z3 != z4) {
                        C66362zD c66362zD = this.A0G;
                        if (c66362zD == null) {
                            str = "recyclerViewAdapter";
                        } else {
                            c66362zD.notifyDataSetChanged();
                        }
                    }
                    IgdsBottomButtonLayout igdsBottomButtonLayout = this.A05;
                    if (igdsBottomButtonLayout == null) {
                        str = "actionButton";
                    } else {
                        int i = this.A01;
                        int size2 = hashSet2.size();
                        boolean z5 = false;
                        if (1 <= size2 && size2 <= i) {
                            z5 = true;
                        }
                        igdsBottomButtonLayout.setPrimaryButtonEnabled(z5);
                        return true;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
        }
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final boolean Ei2() {
        return true;
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final void onBottomSheetClosed() {
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final void onBottomSheetPositionChanged(int i, int i2) {
        float f = (-i) - i2;
        IgdsBottomButtonLayout igdsBottomButtonLayout = this.A05;
        if (igdsBottomButtonLayout == null) {
            C14360o3.A0F("actionButton");
            throw C00O.createAndThrow();
        }
        igdsBottomButtonLayout.setTranslationY(f);
        View view = this.A0E;
        if (view != null) {
            view.setTranslationY(f);
        }
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        this.A0G = AbstractC31173DnH.A0R(C66362zD.A00(requireContext), new EXN(this, this));
        RecyclerView A0G = AbstractC31172DnG.A0G(view, R.id.mention_user_recycler_view);
        A0G.setItemAnimator(null);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext);
        linearLayoutManager.A1o(1);
        A0G.setLayoutManager(linearLayoutManager);
        A0G.A0S = true;
        C66362zD c66362zD = this.A0G;
        if (c66362zD == null) {
            C14360o3.A0F("recyclerViewAdapter");
            throw C00O.createAndThrow();
        }
        A0G.setAdapter(c66362zD);
        this.A0F = A0G;
        InterfaceC09390do interfaceC09390do = this.A0N;
        InterfaceC169517hR A01 = AbstractC183898Dp.A01(requireContext, AbstractC018607g.A00(this), AbstractC166987dD.A0r(interfaceC09390do), "story_user_tag_page", true, false);
        A01.EYJ(this);
        this.A08 = A01;
        ((IgdsInlineSearchBox) view.requireViewById(R.id.mention_user_sticky_search_box)).A02 = new C36509G8h(this, 9);
        AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, A0o, 36327847001865130L)) {
            view.requireViewById(R.id.mention_disclaimer);
        }
        if (this.A0I) {
            Resources resources = requireContext.getResources();
            View A0U = AbstractC167017dG.A0U(view, R.id.private_account_mention_toggle_stub);
            IgdsListCell A0Y = AbstractC31173DnH.A0Y(view, R.id.private_account_mention_toggle);
            A0Y.A0G(EnumC53237Nga.A08, true);
            A0Y.setTitleTextSize(resources.getDimension(R.dimen.add_payment_bottom_sheet_row_subtitle_size));
            A0Y.setTitleMaxLines(2);
            int i = 2131969940;
            if (C18U.A06(c06090Tz, AbstractC166987dD.A0o(interfaceC09390do), 36320944989414412L)) {
                i = 2131969941;
            }
            String string = resources.getString(i);
            C14360o3.A0A(string);
            A0Y.A0I(string);
            A0Y.setChecked(this.A0C);
            G9H.A00(A0Y, this, 30);
            C14360o3.A0A(A0U);
            AbstractC13880nE.A0q(A0U, new RunnableC36914GOj(A0U, this));
            this.A0E = A0U;
        }
        IgdsBottomButtonLayout A0j = AbstractC31172DnG.A0j(view, R.id.mention_user_search_action_button);
        if (this.A0H) {
            int i2 = this.A01;
            int size = this.A0M.size();
            boolean z = false;
            if (1 <= size && size <= i2) {
                z = true;
            }
            A0j.setPrimaryButtonEnabled(z);
            A0j.setDividerVisible(!this.A0I);
            A0j.setPrimaryAction(A0j.getResources().getString(2131952265), new ViewOnClickListenerC35686FpL(this, 0));
            AbstractC13880nE.A0q(A0j, new RunnableC36915GOk(A0j, this));
        } else {
            A0j.setVisibility(8);
        }
        this.A05 = A0j;
    }

    public static final void A00(C32330EMc c32330EMc) {
        RecyclerView recyclerView = c32330EMc.A0F;
        if (recyclerView == null) {
            C14360o3.A0F("recyclerView");
            throw C00O.createAndThrow();
        }
        AbstractC13880nE.A0Y(recyclerView, c32330EMc.A0D + c32330EMc.A00 + c32330EMc.A03);
    }

    @Override // X.InterfaceC189498aU
    public final void DON(int i) {
        this.A0D = i;
        A00(this);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0N);
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final boolean isScrolledToTop() {
        RecyclerView recyclerView = this.A0F;
        if (recyclerView != null) {
            if (recyclerView.getChildCount() != 0) {
                RecyclerView recyclerView2 = this.A0F;
                if (recyclerView2 != null) {
                    if (recyclerView2.computeVerticalScrollOffset() != 0) {
                        return false;
                    }
                }
            }
            return true;
        }
        C14360o3.A0F("recyclerView");
        throw C00O.createAndThrow();
    }

    private final void A01(boolean z) {
        ViewModelListUpdate A0E = AbstractC31171DnF.A0E();
        HashSet hashSet = this.A0L;
        Iterator A13 = AbstractC166997dE.A13(hashSet);
        while (A13.hasNext()) {
            User user = (User) AbstractC166997dE.A0l(A13);
            A0E.A00(new C36189Fy3(new FNI(user, user.getUsername(), user.getFullName(), AbstractC31171DnF.A0e(user), true)));
        }
        if (z) {
            Iterator A132 = AbstractC166997dE.A13(this.A0K);
            while (A132.hasNext()) {
                User user2 = (User) AbstractC166997dE.A0l(A132);
                A0E.A00(new C36189Fy3(new FNI(user2, user2.getUsername(), user2.getFullName(), AbstractC31171DnF.A0e(user2), this.A0M.contains(user2))));
            }
        }
        HashSet hashSet2 = this.A0M;
        Iterator A133 = AbstractC166997dE.A13(hashSet2);
        while (A133.hasNext()) {
            User user3 = (User) AbstractC166997dE.A0l(A133);
            if (!z || !this.A0K.contains(user3)) {
                if (!this.A0O.containsKey(user3.getId())) {
                    A0E.A00(new C36189Fy3(new FNI(user3, user3.getUsername(), user3.getFullName(), AbstractC31171DnF.A0e(user3), true)));
                }
            }
        }
        Iterator A14 = AbstractC166997dE.A14(this.A0O);
        while (A14.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A14);
            String A17 = AbstractC31172DnG.A17(A1K);
            User user4 = (User) A1K.getValue();
            if (!C2TN.A05(AbstractC166987dD.A0r(this.A0N), A17) && !hashSet.contains(user4) && (!z || !this.A0K.contains(user4))) {
                A0E.A00(new C36189Fy3(new FNI(user4, user4.getUsername(), user4.getFullName(), AbstractC31171DnF.A0e(user4), hashSet2.contains(user4))));
            }
        }
        C66362zD c66362zD = this.A0G;
        if (c66362zD == null) {
            C14360o3.A0F("recyclerViewAdapter");
            throw C00O.createAndThrow();
        }
        c66362zD.A05(A0E);
    }

    @Override // X.InterfaceC189488aT
    public final int Ahd(Context context) {
        return AbstractC31178DnM.A00(context);
    }

    @Override // X.InterfaceC189488aT
    public final View C5a() {
        return this.mView;
    }

    @Override // X.InterfaceC189488aT
    public final boolean CQm() {
        return this.A0P;
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ float Cpk() {
        return 0.6f;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A0J;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1533691926);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A0I = requireArguments.getBoolean("ARGS_SHOULD_SHOW_PRIVACY_TOGGLE");
        this.A0C = requireArguments.getBoolean("ARGS_MENTION_SHARING_ENABLED");
        this.A01 = requireArguments.getInt("ARGS_MAX_MENTION_COUNT");
        String string = requireArguments.getString("ARGS_MEDIA_ID");
        String str = "";
        if (string == null) {
            string = "";
        }
        this.A09 = string;
        String string2 = requireArguments.getString("ARGS_MEDIA_TYPE");
        if (string2 == null) {
            string2 = "";
        }
        this.A0A = string2;
        this.A02 = requireArguments.getInt("ARGS_MEDIA_POSITION");
        String string3 = requireArguments.getString("ARGS_SESSION_ID");
        if (string3 != null) {
            str = string3;
        }
        this.A0B = str;
        EnumC33393EpQ enumC33393EpQ = (EnumC33393EpQ) EnumC33393EpQ.A01.get(requireArguments.getString("ARGS_ENTRY_POINT"));
        if (enumC33393EpQ == null) {
            enumC33393EpQ = EnumC33393EpQ.A04;
        }
        this.A06 = enumC33393EpQ;
        requireArguments.getString("ARGS_TITLE");
        this.A0H = requireArguments.getBoolean("ARGS_HAS_ACTION_BUTTON");
        C0f9.A09(403673716, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1761593195);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.mention_user_search_fragment, false);
        C0f9.A09(-1847286386, A02);
        return A0R;
    }
}
