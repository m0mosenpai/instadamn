package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.LeV, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48593LeV implements MSD {
    public static final String __redex_internal_original_name = "AiStickerCreationController";
    public int A00;
    public int A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public RecyclerView A08;
    public RecyclerView A09;
    public C66362zD A0A;
    public C47613L0y A0B;
    public IgdsInlineSearchBox A0C;
    public String A0D;
    public boolean A0E;
    public final int A0F;
    public final Activity A0G;
    public final Context A0H;
    public final ViewStub A0I;
    public final C006802i A0J;
    public final C66392zG A0K;
    public final UserSession A0L;
    public final InterfaceC186088Nc A0M;
    public final List A0N;
    public final java.util.Set A0O;
    public final InterfaceC60152ox A0P;
    public final C3I9 A0Q;
    public final C47612L0x A0R;
    public final C47748L6s A0S;
    public final String A0T;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.2zJ, java.lang.Object] */
    public C48593LeV(Activity activity, ViewStub viewStub, UserSession userSession, InterfaceC186088Nc interfaceC186088Nc) {
        C14360o3.A0B(viewStub, 1);
        this.A0I = viewStub;
        this.A0L = userSession;
        this.A0G = activity;
        this.A0M = interfaceC186088Nc;
        Context context = viewStub.getContext();
        this.A0H = context;
        C006802i c006802i = C006802i.A0p;
        this.A0J = c006802i;
        C14360o3.A07(context);
        this.A0S = new C47748L6s(context, userSession);
        this.A0Q = C3I7.A01(this, false, true);
        this.A0P = new C48548Ldl(this, 1);
        this.A0F = AbstractC167017dG.A03(context);
        this.A0T = "ai_sticker_creation";
        this.A0N = AbstractC166987dD.A1E();
        this.A0O = AbstractC31171DnF.A0l();
        C66392zG A00 = C66362zD.A00(context);
        C14360o3.A07(c006802i);
        A00.A01(new KJR(c006802i, userSession));
        A00.A01(new Object());
        A00.A01(new KJJ(new MHQ(this, 0)));
        A00.A01(new C45680KJr(false));
        this.A0K = A00;
        this.A0R = new C47612L0x(context, userSession, new C47285Kuw(this));
    }

    @Override // X.MSD
    public final /* synthetic */ void CxN() {
    }

    @Override // X.MSD
    public final /* synthetic */ void DhN() {
    }

    public static final List A00(C48593LeV c48593LeV) {
        List A00 = c48593LeV.A0S.A00(false);
        ArrayList A0q = AbstractC167017dG.A0q(A00);
        Iterator it = A00.iterator();
        while (it.hasNext()) {
            String A1B = AbstractC166987dD.A1B(it);
            if (A1B.length() > 0) {
                StringBuilder A1C = AbstractC166987dD.A1C();
                A1C.append((Object) AbstractC44209JgD.A00(A1B.charAt(0)));
                A1B = AbstractC166997dE.A0x(AbstractC43592JPx.A0z(A1B, 1), A1C);
            }
            A0q.add(A1B);
        }
        return A0q;
    }

    private final void A01() {
        AbstractC70663Fe abstractC70663Fe;
        C47613L0y c47613L0y = this.A0B;
        if (c47613L0y != null) {
            RecyclerView recyclerView = this.A09;
            int i = 0;
            if (recyclerView != null && (abstractC70663Fe = recyclerView.A0D) != null) {
                abstractC70663Fe.A1O(0);
            }
            ViewModelListUpdate A0E = AbstractC31171DnF.A0E();
            for (Object obj : AbstractC001800i.A0d(C0eM.A1H(A00(this)), 5)) {
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC16960so.A1U();
                    throw C00O.createAndThrow();
                }
                A0E.A00(new C45200Jzg((String) obj, new C50260MHp(this, 24), i));
                i = i2;
            }
            A0E.A00(new C45182JzO(new MHQ(this, 1)));
            c47613L0y.A00.A05(A0E);
        }
    }

    public static final void A02(C48593LeV c48593LeV) {
        IgdsInlineSearchBox igdsInlineSearchBox = c48593LeV.A0C;
        if (igdsInlineSearchBox != null) {
            A03(c48593LeV, null, true);
            c48593LeV.A0J.markerStart(31792419);
            C47612L0x c47612L0x = c48593LeV.A0R;
            String searchString = igdsInlineSearchBox.getSearchString();
            C14360o3.A0B(searchString, 0);
            C2JM A0b = AbstractC25225BEi.A0b();
            C2JM A0b2 = AbstractC25225BEi.A0b();
            A0b.A04("prompt", searchString);
            JQ1.A0f(A0b);
            A0b.A04("caller", "ig_stories_ai_stickers");
            A0b.A01("bypass_cache");
            PandoGraphQLRequest A00 = LTE.A00(A0b, A0b2, true, true);
            C40701ud c40701ud = c47612L0x.A02;
            C14360o3.A0A(A00);
            C48146LSv.A00(new LT1(c47612L0x, 8), A00, c40701ud, c47612L0x, 17);
        }
    }

    @Override // X.MSD
    public final java.util.Set Acr() {
        return this.A0O;
    }

    @Override // X.MSD
    public final /* synthetic */ boolean CJQ() {
        return false;
    }

    @Override // X.MSD
    public final void close() {
        AbstractC70663Fe abstractC70663Fe;
        C22C A01 = AnonymousClass229.A01(this.A0L);
        String str = this.A0D;
        C448124l c448124l = A01.A09;
        C25531Mh A08 = C25531Mh.A08(c448124l.A01);
        EnumC114925Hg A0J = c448124l.A0J();
        if (AbstractC25226BEj.A1Z(A08) && A0J != null) {
            A08.A0s("IG_CAMERA_ENTITY_TAP");
            A08.A0q("GEN_AI_STICKER_BROWSER_EXIT");
            C448124l.A00(A08, c448124l);
            A08.A0a(A0J);
            C22M c22m = c448124l.A04;
            AbstractC167007dF.A14(A08, c22m);
            A08.A0U();
            AbstractC167007dF.A13(A08);
            A08.A0R("sticker_tray_session_id", c22m.A0U);
            A08.A0R("browse_session_id", str);
            JQ0.A1C(A08, c22m);
            AbstractC167017dG.A1D(A08);
        }
        this.A0E = false;
        IgdsInlineSearchBox igdsInlineSearchBox = this.A0C;
        if (igdsInlineSearchBox != null) {
            Context context = this.A0H;
            igdsInlineSearchBox.setSearchRowHeight(AbstractC25235BEs.A04(context));
            igdsInlineSearchBox.A0E.setText("");
            int A05 = AbstractC43594JPz.A05(context);
            AbstractC13880nE.A0e(igdsInlineSearchBox, A05);
            AbstractC13880nE.A0V(igdsInlineSearchBox, A05);
            igdsInlineSearchBox.setTranslationY(0.0f);
            igdsInlineSearchBox.setTranslationX(0.0f);
            int i = this.A00;
            if (i > 0) {
                AbstractC13880nE.A0W(igdsInlineSearchBox, i);
            }
            int i2 = this.A01;
            if (i2 > 0) {
                AbstractC13880nE.A0g(igdsInlineSearchBox, i2);
            }
        }
        RecyclerView recyclerView = this.A09;
        if (recyclerView != null && (abstractC70663Fe = recyclerView.A0D) != null) {
            abstractC70663Fe.A1O(0);
        }
        RecyclerView recyclerView2 = this.A09;
        if (recyclerView2 != null) {
            recyclerView2.setVisibility(0);
        }
        View view = this.A07;
        if (view != null) {
            view.setVisibility(0);
        }
        View view2 = this.A03;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        View view3 = this.A06;
        if (view3 != null) {
            view3.setVisibility(8);
        }
        RecyclerView recyclerView3 = this.A08;
        if (recyclerView3 != null) {
            recyclerView3.setVisibility(8);
        }
        this.A0N.clear();
        C66362zD A00 = this.A0K.A00();
        this.A0A = A00;
        RecyclerView recyclerView4 = this.A08;
        if (recyclerView4 != null) {
            recyclerView4.setAdapter(A00);
        }
        AbstractC13880nE.A0K(this.A0G);
        C3I9 c3i9 = this.A0Q;
        c3i9.onStop();
        c3i9.EFx(this.A0P);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A0T;
    }

    @Override // X.MSD
    public final /* synthetic */ boolean isScrolledToBottom() {
        return false;
    }

    @Override // X.MSD
    public final /* synthetic */ boolean isScrolledToTop() {
        return false;
    }

    public static final void A03(C48593LeV c48593LeV, String str, boolean z) {
        ViewModelListUpdate A0E = AbstractC31171DnF.A0E();
        if (str != null && c48593LeV.A0N.isEmpty()) {
            c48593LeV.A0J.markerEnd(31792419, (short) 3);
            A0E.A00(new LZJ(str));
        } else {
            List list = c48593LeV.A0N;
            ArrayList A0q = AbstractC167017dG.A0q(list);
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC16960so.A1U();
                    throw C00O.createAndThrow();
                }
                String str2 = c48593LeV.A0D;
                A0q.add(new C45207Jzn(c48593LeV.A0M, (C148286ly) obj, str2, i2));
                i = i2;
            }
            A0E.A01(A0q);
            if (z) {
                ArrayList A17 = AbstractC25225BEi.A17(4);
                int i3 = 0;
                do {
                    A17.add(new Object());
                    i3++;
                } while (i3 < 4);
                A0E.A01(A17);
            } else if (AbstractC166987dD.A1b(list)) {
                A0E.A00(new K04(false));
            }
            if (str != null) {
                C9GR.A00(c48593LeV.A0H, str, "ai_sticker_api_error", 0);
            }
        }
        C66362zD c66362zD = c48593LeV.A0A;
        if (c66362zD != null) {
            c66362zD.A05(A0E);
        }
    }

    @Override // X.MSD
    public final void E2K() {
        C66362zD c66362zD;
        this.A0D = AbstractC166997dE.A0n();
        if (this.A05 == null) {
            View inflate = this.A0I.inflate();
            java.util.Set set = this.A0O;
            set.clear();
            C14360o3.A0A(inflate);
            set.add(inflate);
            View requireViewById = inflate.requireViewById(R.id.back_button);
            this.A02 = requireViewById;
            if (requireViewById != null) {
                ViewOnClickListenerC48064LPp.A00(requireViewById, 60, this);
            }
            this.A07 = inflate.requireViewById(R.id.title_label);
            this.A03 = inflate.requireViewById(R.id.body_label);
            this.A04 = inflate.requireViewById(R.id.bottom_section);
            View requireViewById2 = inflate.requireViewById(R.id.create_button);
            this.A06 = requireViewById2;
            if (requireViewById2 != null) {
                ViewOnClickListenerC48064LPp.A00(requireViewById2, 58, this);
            }
            IgdsInlineSearchBox igdsInlineSearchBox = (IgdsInlineSearchBox) inflate.requireViewById(R.id.search_box);
            igdsInlineSearchBox.A03 = true;
            Context context = this.A0H;
            igdsInlineSearchBox.setHints(AbstractC001800i.A0S(A00(this), AbstractC166987dD.A1J(context.getString(2131952664))));
            Context context2 = igdsInlineSearchBox.getContext();
            igdsInlineSearchBox.setTextColor(context2.getColor(AbstractC53242c7.A0A(this.A0G)));
            igdsInlineSearchBox.setSearchGlyphColor(context2.getColor(R.color.audio_bar_action_color_enabled));
            igdsInlineSearchBox.setSearchRowHeight(AbstractC25235BEs.A04(context2));
            igdsInlineSearchBox.A02 = new C49485Lty(this, 3);
            igdsInlineSearchBox.setEditTextOnClickListener(new ViewOnClickListenerC48064LPp(this, 59));
            this.A0C = igdsInlineSearchBox;
            this.A08 = AbstractC31172DnG.A0G(inflate, R.id.ai_sticker_list);
            C66362zD A00 = this.A0K.A00();
            this.A0A = A00;
            RecyclerView recyclerView = this.A08;
            if (recyclerView != null) {
                recyclerView.setAdapter(A00);
            }
            RecyclerView recyclerView2 = this.A08;
            if (recyclerView2 != null) {
                GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 2, 1, false);
                JnN.A00(gridLayoutManager, this, 6);
                recyclerView2.setLayoutManager(gridLayoutManager);
            }
            UserSession userSession = this.A0L;
            if (C18U.A06(C06090Tz.A05, userSession, 36319686564191829L)) {
                this.A09 = AbstractC31172DnG.A0G(inflate, R.id.suggested_prompts);
                this.A0B = new C47613L0y(context, this, userSession);
                A01();
                RecyclerView recyclerView3 = this.A09;
                if (recyclerView3 != null) {
                    C47613L0y c47613L0y = this.A0B;
                    if (c47613L0y != null) {
                        c66362zD = c47613L0y.A00;
                    } else {
                        c66362zD = null;
                    }
                    recyclerView3.setAdapter(c66362zD);
                }
                RecyclerView recyclerView4 = this.A09;
                if (recyclerView4 != null) {
                    AbstractC31174DnI.A17(context, recyclerView4, false);
                }
            }
            this.A05 = inflate;
        }
        A01();
        C3I9 c3i9 = this.A0Q;
        c3i9.A9e(this.A0P);
        c3i9.Dnr(this.A0G);
        IgdsInlineSearchBox igdsInlineSearchBox2 = this.A0C;
        if (igdsInlineSearchBox2 != null) {
            igdsInlineSearchBox2.A04();
        }
    }
}
