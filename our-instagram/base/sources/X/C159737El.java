package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.forker.Process;
import com.google.common.util.concurrent.SettableFuture;
import com.instagram.api.schemas.IGAIAgentType;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.avatar.stickers.suggestions.DirectStickerSuggestionsController;
import com.instagram.direct.fragment.permanentmedia.DirectAggregatedMediaViewerController;
import com.instagram.direct.smartsuggestion.model.SmartSuggestion;
import com.instagram.foa.session.IgMetaSessionImpl;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;
import com.instagram.user.model.User;
import com.meta.foa.performancelogging.lss.LocalSendSpeedMessageTypes;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: X.7El, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C159737El {
    public static boolean A2V;
    public View A03;
    public View A04;
    public View A05;
    public ViewGroup A06;
    public FrameLayout A07;
    public ImageView A08;
    public C06K A09;
    public C7F6 A0A;
    public InterfaceC41501vz A0B;
    public InterfaceC41501vz A0C;
    public InterfaceC41501vz A0D;
    public InterfaceC41501vz A0E;
    public InterfaceC41501vz A0F;
    public IgTextView A0G;
    public ColorFilterAlphaImageView A0H;
    public ColorFilterAlphaImageView A0I;
    public C7F3 A0J;
    public DirectStickerSuggestionsController A0K;
    public C160617Hv A0L;
    public C34962Fam A0M;
    public C7VZ A0N;
    public C7FW A0O;
    public C7FX A0P;
    public C7I0 A0Q;
    public C1576575z A0R;
    public C35041FcE A0S;
    public C34605FMo A0T;
    public C7IK A0U;
    public C98L A0V;
    public C2EE A0W;
    public FRJ A0X;
    public C47624L1j A0Y;
    public C7VF A0Z;
    public C160657Hz A0a;
    public C160007Fm A0b;
    public C160557Hp A0c;
    public C160547Ho A0d;
    public C160467Hg A0f;
    public L8B A0g;
    public C160627Hw A0h;
    public C160587Hs A0i;
    public C7CH A0j;
    public C159947Fg A0k;
    public C47772L7u A0l;
    public FRX A0m;
    public C7O6 A0n;
    public C160637Hx A0o;
    public C159287Co A0q;
    public C7GD A0r;
    public C160607Hu A0t;
    public C7GN A0u;
    public C45078Jx7 A0v;
    public boolean A0z;
    public boolean A15;
    public boolean A17;
    public boolean A1A;
    public boolean A1B;
    public boolean A1G;
    public View A1H;
    public ViewGroup A1I;
    public ImageView A1J;
    public InterfaceC161477Li A1K;
    public IgTextView A1L;
    public C160597Ht A1M;
    public C7DZ A1N;
    public C148396m9 A1O;
    public boolean A1Q;
    public final Context A1R;
    public final ViewGroup A1V;
    public final C7FT A1W;
    public final InterfaceC11380iw A1X;
    public final UserSession A1Z;
    public final InterfaceC60152ox A1a;
    public final C3I9 A1b;
    public final C7FS A1c;
    public final C7FR A1d;
    public final C7EC A1e;
    public final C7FJ A1f;
    public final DirectAggregatedMediaViewerController A1g;
    public final C163997Vo A1i;
    public final C159727Ek A1j;
    public final C7FG A1k;
    public final C7FK A1l;
    public final C7F8 A1m;
    public final C7X3 A1n;
    public final C98N A1o;
    public final C7FI A1p;
    public final C7FV A1r;
    public final C7FM A1s;
    public final C7FO A1t;
    public final C7F2 A1u;
    public final C7FU A1v;
    public final C7E0 A1w;
    public final C98R A1x;
    public final C7DK A1y;
    public final InterfaceC83713oG A1z;
    public final InterfaceC159557Dq A20;
    public final String A21;
    public final InterfaceC08830cm A22;
    public final InterfaceC08830cm A23;
    public final InterfaceC08830cm A24;
    public final InterfaceC08830cm A25;
    public final InterfaceC08830cm A26;
    public final boolean A27;
    public final boolean A28;
    public final boolean A29;
    public final boolean A2A;
    public final C2d4 A2C;
    public final C18920wW A2D;
    public final C7ZZ A2F;
    public final C159547Dp A2N;
    public final InterfaceC164017Vq A2O;
    public final InterfaceC08830cm A2P;
    public final InterfaceC09390do A2Q;
    public final boolean A2R;
    public final boolean A2S;
    public final boolean A2T;
    public final boolean A2U;
    public final Handler A1T = new Handler(Looper.getMainLooper());
    public boolean A1C = false;
    public boolean A10 = false;
    public boolean A11 = false;
    public boolean A13 = false;
    public boolean A19 = false;
    public boolean A14 = false;
    public boolean A18 = false;
    public boolean A12 = false;
    public int A00 = 0;
    public boolean A1P = false;
    public boolean A0y = false;
    public boolean A1E = false;
    public boolean A1F = false;
    public boolean A1D = false;
    public C35152Feu A0s = null;
    public final Rect A1S = new Rect();
    public int A01 = 0;
    public C69556VrL A0p = null;
    public C7H0 A0e = null;
    public boolean A16 = true;
    public final C41761wQ A1Y = new C41761wQ(null);
    public Integer A0w = null;
    public String A0x = null;
    public final C159747Em A2G = new C159747Em(this);
    public final C159757En A2I = new C159757En(this);
    public final InterfaceC148366m6 A2E = new InterfaceC148366m6() { // from class: X.7Eo
        @Override // X.InterfaceC148366m6
        public final void DOh() {
        }

        @Override // X.InterfaceC148366m6
        public final void CMc() {
            C159737El.this.A19();
        }

        @Override // X.InterfaceC148366m6
        public final void DWL() {
            C159737El.this.A17 = false;
        }

        @Override // X.InterfaceC148366m6
        public final void DWN() {
            C159737El c159737El = C159737El.this;
            C7IK c7ik = c159737El.A0U;
            c7ik.getClass();
            C159737El.A0h(c159737El, c7ik.A02);
            C159737El.A0p(c159737El, true, false);
            c159737El.A17 = true;
        }
    };
    public final C159777Ep A2J = new C159777Ep(this);
    public final C159787Eq A2K = new C159787Eq(this);
    public final C159797Er A2L = new C159797Er(this);
    public final C159807Es A2M = new C159807Es(this);
    public final C159817Et A2H = new C159817Et(this);
    public final View.OnFocusChangeListener A1U = new View.OnFocusChangeListener() { // from class: X.7Eu
        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view, boolean z) {
            if (z) {
                C159737El c159737El = C159737El.this;
                if (c159737El.A0S != null && c159737El.A28) {
                    UserSession userSession = c159737El.A1Z;
                    C14360o3.A0B(userSession, 0);
                    if (C18U.A06(C06090Tz.A06, userSession, 36329680952902126L)) {
                        c159737El.A0S.A01();
                    }
                }
                C7FR c7fr = c159737El.A1d;
                boolean A10 = C159737El.A10(c159737El);
                InterfaceC83713oG interfaceC83713oG = c159737El.A1z;
                C14360o3.A0B(interfaceC83713oG, 1);
                C18920wW c18920wW = c7fr.A00;
                InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "direct_composer_tap_text_field");
                if (A00.isSampled()) {
                    A00.AAP("nav_chain", C1QM.A00.A02.A00);
                    A00.A7v("is_reply_flow", Boolean.valueOf(A10));
                    A00.AAP("open_thread_id", AbstractC92784Dr.A02(interfaceC83713oG));
                    A00.AAP("occamadillo_thread_id", String.valueOf(AbstractC92784Dr.A01(interfaceC83713oG)));
                    A00.A7v("is_e2ee", Boolean.valueOf(AbstractC140946Yw.A07(interfaceC83713oG)));
                    A00.Cht();
                }
            }
        }
    };
    public TextWatcher A02 = new TextWatcher() { // from class: X.7Ev
        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            AbstractC28921aV abstractC28921aV;
            if (!C159737El.A2V) {
                C159737El.A2V = true;
                C159737El c159737El = C159737El.this;
                c159737El.A02 = null;
                if (C159737El.A0w(c159737El)) {
                    if (C18U.A06(C06090Tz.A05, c159737El.A1Z, 36328993758527413L) && AbstractC28921aV.A00 != null) {
                        C14120nc.A00().ATO(new KLH());
                    }
                }
                if (C159737El.A0w(c159737El)) {
                    UserSession userSession = c159737El.A1Z;
                    C06090Tz c06090Tz = C06090Tz.A05;
                    if (C18U.A06(c06090Tz, userSession, 36328993758658487L) && (abstractC28921aV = AbstractC28921aV.A00) != null) {
                        InterfaceC83713oG interfaceC83713oG = c159737El.A1z;
                        C14360o3.A0B(userSession, 0);
                        C14360o3.A0B(interfaceC83713oG, 1);
                        C14120nc.A00().ATO(new KMD(userSession, (C28911aU) abstractC28921aV, interfaceC83713oG));
                    }
                    if (C18U.A06(c06090Tz, userSession, 36328993758789560L) && AbstractC28921aV.A00 != null) {
                        C14360o3.A0B(userSession, 0);
                        C14120nc.A00().ATO(new KLN(userSession));
                    }
                    if (AbstractC28921aV.A00 != null) {
                        C14360o3.A0B(userSession, 0);
                        if (!AbstractC18890wN.A00.getAndSet(true) && C18U.A06(c06090Tz, userSession, 36328993758855097L)) {
                            C14120nc.A00().ATO(new AbstractRunnableC14200nk() { // from class: X.0tY
                                @Override // java.lang.Runnable
                                public final void run() {
                                    AbstractC09800fd.A01("ArmadilloSendToSentClassPreload", -345744872);
                                    AbstractC09800fd.A00(1645024012);
                                }
                            });
                        }
                    }
                }
            }
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            UserSession userSession;
            C7E0 c7e0;
            String obj = editable.toString();
            if (obj != null && !obj.isEmpty()) {
                C159737El c159737El = C159737El.this;
                if (c159737El.A0r != null && c159737El.A0R != null && (userSession = c159737El.A1Z) != null && c159737El.A0W != null && (c7e0 = c159737El.A1w) != null && C159737El.A15(c159737El)) {
                    AbstractC160207Gg A0D = ((C159637Dz) c7e0).A0D(EnumC160197Gf.A03);
                    C2EE c2ee = c159737El.A0W;
                    C14360o3.A0B(userSession, 1);
                    C14360o3.A0B(c2ee, 2);
                    boolean z = false;
                    if (A0D != null && A0D.A01() == C7FZ.A03 && obj.length() > 0 && AbstractC001900j.A0a(obj, A0D.A05(), false) && C7C3.A00(userSession, c2ee)) {
                        z = true;
                    }
                    C7GD c7gd = c159737El.A0r;
                    C1576575z c1576575z = c159737El.A0R;
                    C14360o3.A0B(c1576575z, 0);
                    List list = c7gd.A01;
                    boolean contains = list.contains(c1576575z);
                    if (z) {
                        if (!contains) {
                            list.add(c1576575z);
                        }
                    } else {
                        if (!contains) {
                            return;
                        }
                        list.remove(c1576575z);
                    }
                }
            }
        }
    };
    public final View.OnLayoutChangeListener A2B = new View.OnLayoutChangeListener() { // from class: X.7Ew
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            C159737El c159737El = C159737El.this;
            if (c159737El.A0P != null) {
                int i9 = i8 - i6;
                int height = c159737El.A07.getHeight();
                if (i9 != height) {
                    C159737El.A0n(c159737El, c159737El.A1B);
                    if (c159737El.A16 && !c159737El.A15) {
                        C159737El.A0j(c159737El, c159737El.A1m.A00() - height);
                    }
                    L8B l8b = c159737El.A0g;
                    if (l8b != null && l8b.A00()) {
                        int dimensionPixelSize = (-c159737El.A07.getHeight()) + c159737El.A1R.getResources().getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material);
                        int i10 = Build.VERSION.SDK_INT;
                        View A03 = C159737El.A03(c159737El);
                        if (i10 < 30) {
                            dimensionPixelSize -= c159737El.A01;
                        }
                        A03.setTranslationY(dimensionPixelSize);
                    }
                    c159737El.A1B = false;
                    C160637Hx c160637Hx = c159737El.A0o;
                    if (c160637Hx != null) {
                        c160637Hx.A01();
                    }
                }
            }
        }
    };
    public final C159857Ex A1q = new C159857Ex(this);
    public final InterfaceC159877Ez A1h = new InterfaceC159877Ez() { // from class: X.7Ey
        @Override // X.InterfaceC159877Ez
        public final void Cyk(C148286ly c148286ly) {
            C159737El c159737El = C159737El.this;
            C3DN A01 = AbstractC161537Lo.A01(c159737El.A1R, c159737El.A1Z);
            if (A01 != null) {
                A01.A0B();
            }
            String valueOf = String.valueOf(C0HN.A00());
            Integer num = C05F.A0u;
            AnonymousClass442 A05 = C159737El.A05(c159737El);
            C159737El.A0S(A05, c159737El, num, valueOf);
            C35152Feu c35152Feu = c159737El.A0s;
            if (c35152Feu != null && c35152Feu.A02()) {
                AbstractC46995KqE.A00(c35152Feu.A01, false, false);
            }
            boolean isEmpty = c148286ly.A0a.isEmpty();
            C163997Vo c163997Vo = c159737El.A1i;
            if (isEmpty) {
                c163997Vo.A04(c148286ly, EnumC46186KcO.A07);
            } else {
                c163997Vo.A05(c148286ly, EnumC46186KcO.A07, A05);
            }
            c159737El.A1I(0.0f);
            C159737El.A0m(c159737El, true);
        }

        @Override // X.InterfaceC159877Ez
        public final void DNq(EnumC46186KcO enumC46186KcO, C45026JwH c45026JwH) {
            C159737El c159737El = C159737El.this;
            C3DN A01 = AbstractC161537Lo.A01(c159737El.A1R, c159737El.A1Z);
            if (A01 != null) {
                A01.A0B();
            }
            String valueOf = String.valueOf(C0HN.A00());
            Integer num = C05F.A0j;
            if (c45026JwH.A00.A06) {
                num = C05F.A0u;
            }
            AnonymousClass442 A05 = C159737El.A05(c159737El);
            C159737El.A0S(A05, c159737El, num, valueOf);
            C35152Feu c35152Feu = c159737El.A0s;
            if (c35152Feu != null && c35152Feu.A02()) {
                AbstractC46995KqE.A00(c35152Feu.A01, false, false);
            }
            C163997Vo c163997Vo = c159737El.A1i;
            if (enumC46186KcO != EnumC46186KcO.A0B) {
                AnonymousClass983 anonymousClass983 = c163997Vo.A00;
                if (AnonymousClass983.A01(anonymousClass983).A0V(valueOf, "DirectThreadFragment.sendGifOrStickerMessage")) {
                    C7IT A0J = AnonymousClass983.A01(anonymousClass983).A0J();
                    Context context = anonymousClass983.A02;
                    if (context == null) {
                        C14360o3.A0F("context");
                        throw C00O.createAndThrow();
                    }
                    MIV miv = new MIV(A0J, c45026JwH, context, anonymousClass983.A10, A05, valueOf, 1);
                    C7X1 c7x1 = A0J.A01;
                    c7x1.A00();
                    miv.invoke(A0J.A06.invoke());
                    c7x1.A01(null, 100);
                }
            }
            c159737El.A1I(0.0f);
            C159737El.A0m(c159737El, true);
        }
    };

    public static C49317LrB A07(Activity activity, final C159737El c159737El, Integer num) {
        UserSession userSession = c159737El.A1Z;
        Context context = c159737El.A1R;
        C7F2 c7f2 = c159737El.A1u;
        return new C49317LrB(activity, context, userSession, c159737El.A1i, c159737El, c7f2, num, c159737El.A21, new InterfaceC16820sZ() { // from class: X.B31
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                C159737El c159737El2 = C159737El.this;
                C7FO c7fo = c159737El2.A1t;
                C7FM c7fm = c159737El2.A1s;
                c7fo.A00((C7GY) c7fm.A00.get(C7GX.A0I));
                return null;
            }
        }, c159737El.A28);
    }

    public static String A0C(C26086BgF c26086BgF, C159737El c159737El, Long l, String str) {
        String str2 = str;
        if (!A0v(c159737El) && (c26086BgF == null || !LJP.A03((List) c26086BgF.A00))) {
            return null;
        }
        String valueOf = String.valueOf(C0HN.A00());
        if (c26086BgF != null) {
            str2 = c26086BgF.A03;
        }
        String A0H = A0H(c159737El);
        C120115cA A00 = AbstractC120095c8.A00(c159737El.A1Z);
        Boolean valueOf2 = Boolean.valueOf(!AbstractC13670mt.A0B(A0H));
        String str3 = c159737El.A21;
        boolean z = false;
        if (c26086BgF != null) {
            z = true;
        }
        A00.A00(EnumC33443EqF.THREADVIEW_USER_INPUT_PROMPT, valueOf2, l, str2, A0H, str3, valueOf, z, true);
        return valueOf;
    }

    public static void A0U(final C159737El c159737El) {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        BitSet bitSet = new BitSet(0);
        c159737El.A19();
        C2EE c2ee = c159737El.A0W;
        String str2 = "";
        if (c2ee == null || c2ee.C7I() == null) {
            str = "";
        } else {
            str = c159737El.A0W.C7I();
        }
        linkedHashMap.put("message_send_callback", new C66237U5h(new C57560PgY(new InterfaceC16620sF() { // from class: X.GRr
            @Override // X.InterfaceC16620sF
            public final Object invoke(Object obj, Object obj2) {
                C159737El c159737El2 = C159737El.this;
                C163997Vo c163997Vo = c159737El2.A1i;
                C50679MYx c50679MYx = new C50679MYx("prompt_library", "", 39);
                UserSession userSession = c159737El2.A1Z;
                c163997Vo.A09(c50679MYx, null, null, null, null, null, null, null, (String) obj, null, null, FVU.A01(EnumC33443EqF.NULL_STATE_PROMPT, userSession, (String) obj2, null), null);
                return C0eB.A00;
            }
        }, 19)));
        linkedHashMap.put(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
        if (bitSet.nextClearBit(0) >= 0) {
            C63719SsZ c63719SsZ = new C63719SsZ("com.bloks.www.genai.metaai.experiences.discovery.screen_query.BloksGenAIMetaAIDiscoveryScreenQuery", null, null, AbstractC06930Yk.A0B(linkedHashMap), AbstractC06930Yk.A0E(), 719983200, 0L, true);
            Context context = c159737El.A1R;
            AnonymousClass637 A00 = VRA.A00(c159737El.A1Z, false);
            WTZ wtz = new WTZ(new UP2(null, context.getString(2131958895)), false, null, null, 1.0f, false, false, false, true);
            C14360o3.A0B(A00, 1);
            c63719SsZ.E2V(context, wtz, A00);
            C2EE c2ee2 = c159737El.A0W;
            if (c2ee2 != null && c2ee2.Ba5() != null) {
                str2 = c159737El.A0W.Ba5().getId();
            }
            C7F3 c7f3 = c159737El.A0J;
            String A0F = A0F(c159737El);
            C25531Mh A0J = C25531Mh.A0J(c7f3.A01);
            if (((AbstractC02600Aj) A0J).A00.isSampled()) {
                A0J.A0Z(18);
                A0J.A0X(0);
                A0J.A0R("selected_item", "hamburger_menu");
                A0J.A0R("agent_id", str2);
                A0J.A0R("agent_personality", null);
                A0J.A0M(EnumC72433Xdd.A02, "thread_type");
                A0J.A0O("is_e2ee", false);
                A0J.A0R(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, A0F);
                A0J.A0M(EnumC33519Ers.A05, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                A0J.A0O(MSV.A00(495), null);
                A0J.A0O(MSV.A00(496), null);
                A0J.A0Y(0);
                A0J.A0R("prompt_id", null);
                A0J.A0S("displayed_prompt_ids", null);
                A0J.Cht();
            }
            FragmentActivity fragmentActivity = (FragmentActivity) AbstractC13320mI.A00(context, FragmentActivity.class);
            if (fragmentActivity != null) {
                C30D.A04(fragmentActivity, context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_secondary_background)));
                if (c159737El.A09 == null) {
                    C31785Dy4 c31785Dy4 = new C31785Dy4(fragmentActivity, c159737El);
                    c159737El.A09 = c31785Dy4;
                    fragmentActivity.getSupportFragmentManager().A0q(c31785Dy4, true);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException(AbstractC43591JPw.A00(266));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x008f, code lost:
    
        if (X.AbstractC140946Yw.A07(r7) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b7, code lost:
    
        if (r1 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f4, code lost:
    
        if (r2.Ay8() == false) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0l(X.C159737El r13, java.lang.Integer r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, boolean r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C159737El.A0l(X.7El, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, boolean, boolean):void");
    }

    public final void A1O(EnumC46186KcO enumC46186KcO, String str, String str2) {
        A19();
        AbstractC161537Lo.A02(null, A08(enumC46186KcO, this, str, str2));
    }

    public static int A00(C159737El c159737El) {
        C2EE c2ee = c159737El.A0W;
        if (c2ee != null) {
            return c2ee.AdZ();
        }
        return 0;
    }

    public static int A01(C159737El c159737El) {
        C2EE c2ee = c159737El.A0W;
        if (c2ee != null) {
            return c2ee.C7g();
        }
        return 0;
    }

    public static View A03(C159737El c159737El) {
        if (c159737El.A1H == null) {
            View requireViewById = c159737El.A1V.requireViewById(R.id.composer_overlay_top);
            c159737El.A1H = requireViewById;
            requireViewById.setOnClickListener(null);
        }
        return c159737El.A1H;
    }

    public static IGAIAgentType A04(C159737El c159737El) {
        C2EE c2ee = c159737El.A0W;
        if (c2ee != null && c2ee.Ba5() != null) {
            return c159737El.A0W.Ba5().A03.Aah();
        }
        return null;
    }

    public static AnonymousClass442 A05(C159737El c159737El) {
        L51 l51;
        C160557Hp c160557Hp = c159737El.A0c;
        if (c160557Hp == null || (l51 = c160557Hp.A09) == null) {
            return null;
        }
        return l51.A02.A01;
    }

    public static EnumC92794Ds A06(C159737El c159737El, Integer num) {
        if (AbstractC159387Cy.A08(c159737El.A1Z, A0A(c159737El), num)) {
            return EnumC92794Ds.A04;
        }
        return AbstractC140946Yw.A00(c159737El.A1z);
    }

    public static C49319LrD A08(final EnumC46186KcO enumC46186KcO, final C159737El c159737El, String str, String str2) {
        UserSession userSession = c159737El.A1Z;
        Context context = c159737El.A1R;
        Handler handler = c159737El.A1T;
        int A01 = A01(c159737El);
        boolean z = false;
        if (A01 == 29) {
            z = true;
        }
        InterfaceC83713oG interfaceC83713oG = c159737El.A1z;
        C14360o3.A0B(interfaceC83713oG, 0);
        boolean z2 = interfaceC83713oG instanceof InterfaceC2056098k;
        ArrayList A0I = A0I(c159737El);
        DirectThreadKey A0A = A0A(c159737El);
        C159347Cu c159347Cu = new C159347Cu(A09(c159737El));
        C7IK c7ik = c159737El.A0U;
        C2EE c2ee = c159737El.A0W;
        C7F2 c7f2 = c159737El.A1u;
        InterfaceC159877Ez interfaceC159877Ez = c159737El.A1h;
        C7FV c7fv = c159737El.A1r;
        C35152Feu c35152Feu = c159737El.A0s;
        C163997Vo c163997Vo = c159737El.A1i;
        C160557Hp c160557Hp = c159737El.A0c;
        InterfaceC16620sF interfaceC16620sF = new InterfaceC16620sF() { // from class: X.M9I
            @Override // X.InterfaceC16620sF
            public final Object invoke(Object obj, Object obj2) {
                C45058Jwn c45058Jwn = (C45058Jwn) obj2;
                C159737El.A0Q(c45058Jwn, enumC46186KcO, c159737El, (String) obj);
                return null;
            }
        };
        InterfaceC16820sZ interfaceC16820sZ = new InterfaceC16820sZ() { // from class: X.B2z
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                C159737El c159737El2 = C159737El.this;
                UserSession userSession2 = c159737El2.A1Z;
                C06090Tz c06090Tz = C06090Tz.A05;
                if (C18U.A06(c06090Tz, userSession2, 36325828367300005L) || C18U.A06(c06090Tz, userSession2, 36325828367627690L)) {
                    c159737El2.A1G();
                    return null;
                }
                return null;
            }
        };
        boolean z3 = c159737El.A28;
        return new C49319LrD(context, handler, userSession, interfaceC159877Ez, c163997Vo, enumC46186KcO, c7ik, c2ee, c159737El, c160557Hp, c7fv, c7f2, c159347Cu, c35152Feu, A0A, C05F.A00, str, str2, c159737El.A21, A0I, interfaceC16820sZ, interfaceC16620sF, z, z2, z3);
    }

    public static C160477Hh A09(C159737El c159737El) {
        UserSession userSession = c159737El.A1Z;
        boolean z = c159737El.A29;
        boolean z2 = c159737El.A0y;
        InterfaceC08830cm interfaceC08830cm = c159737El.A23;
        interfaceC08830cm.getClass();
        C160357Gv c160357Gv = new C160357Gv(interfaceC08830cm);
        InterfaceC08830cm interfaceC08830cm2 = c159737El.A26;
        interfaceC08830cm2.getClass();
        C164297Ws c164297Ws = new C164297Ws(interfaceC08830cm2);
        InterfaceC83713oG interfaceC83713oG = c159737El.A1z;
        return new C160477Hh(userSession, c159737El.A0W, c159737El.A0Z, c159737El.A0c, interfaceC83713oG, c160357Gv, c164297Ws, z, z2);
    }

    public static DirectThreadKey A0A(C159737El c159737El) {
        C2EE c2ee = c159737El.A0W;
        if (c2ee != null && (c2ee.BKb() instanceof DirectThreadKey)) {
            return (DirectThreadKey) c159737El.A0W.BKb();
        }
        return null;
    }

    private Long A0B() {
        C2EC c2ec = (C2EC) this.A22.get();
        if (c2ec == null) {
            return null;
        }
        return C160907Iy.A00.A01(this.A1Z, c2ec);
    }

    public static String A0E(C159737El c159737El) {
        String str;
        if (((Boolean) c159737El.A0Z.A0G.getValue()).booleanValue()) {
            str = "stickers";
        } else {
            str = "gifs";
        }
        if (C20Y.A00(c159737El.A1Z).A01.A00 == C125535lz.A00) {
            C7FJ c7fj = c159737El.A1f;
            if (!c7fj.A00()) {
                if (C18U.A06(C06090Tz.A05, c7fj.A00, 36319282837134471L)) {
                    return AbstractC43591JPw.A00(34);
                }
                return str;
            }
            return str;
        }
        return str;
    }

    public static String A0F(C159737El c159737El) {
        C2EE c2ee = c159737El.A0W;
        if (c2ee == null || c2ee.C7I() == null) {
            return "";
        }
        return c159737El.A0W.C7I();
    }

    public static String A0G(C159737El c159737El) {
        C2EE c2ee = c159737El.A0W;
        if (c2ee != null && !c2ee.BSH().isEmpty()) {
            return ((User) c159737El.A0W.BSH().get(0)).getId();
        }
        return null;
    }

    public static ArrayList A0I(C159737El c159737El) {
        ArrayList arrayList = new ArrayList();
        C2EE c2ee = c159737El.A0W;
        if (c2ee != null && !c159737El.A1V()) {
            Iterator it = c2ee.BSH().iterator();
            while (it.hasNext()) {
                arrayList.add(((User) it.next()).getId());
            }
        }
        return arrayList;
    }

    public static HashMap A0J(C159737El c159737El) {
        HashMap hashMap = new HashMap();
        hashMap.put("ephemeral_lifetime_ms", c159737El.A24.get());
        hashMap.put("after_view_lifetime_ms", c159737El.A0B());
        return hashMap;
    }

    public static HashMap A0K(C159737El c159737El) {
        HashMap hashMap = new HashMap();
        hashMap.put("is_mixvm", Boolean.valueOf(c159737El.A29));
        hashMap.put("is_vm", c159737El.A26.get());
        hashMap.put("is_mixvm_eligible", c159737El.A2P.get());
        return hashMap;
    }

    private void A0M() {
        View view;
        if (C18U.A06(C06090Tz.A05, this.A1Z, 36320476837978649L)) {
            if (this.A1I != null && this.A08 != null && this.A1J != null && this.A0U != null) {
                Context context = this.A1R;
                float dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material);
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize}, null, null));
                int[] iArr = this.A0U.A0K;
                int length = iArr.length;
                if (length == 0) {
                    AbstractC148406mA.A02(Paint.Style.FILL, shapeDrawable, shapeDrawable.getShape(), 0.0f, AbstractC53242c7.A0F(context, R.attr.cyanBubbleBackground));
                } else if (length == 1) {
                    AbstractC148406mA.A02(Paint.Style.FILL, shapeDrawable, shapeDrawable.getShape(), 0.0f, iArr[0]);
                } else {
                    C7F8 c7f8 = this.A1m;
                    float A00 = c7f8.A00();
                    int[] iArr2 = this.A0U.A0K;
                    C14360o3.A0B(iArr2, 2);
                    AbstractC148406mA.A01(null, Paint.Cap.BUTT, Paint.Style.FILL, shapeDrawable, shapeDrawable.getShape(), iArr2, A00, 0.0f).Eg1(c7f8.A00() - this.A07.getHeight());
                }
                this.A08.setBackground(shapeDrawable);
                this.A1J.getDrawable().setColorFilter(C3DY.A00(this.A0U.A05));
                this.A08.invalidate();
                view = this.A1J;
            } else {
                return;
            }
        } else {
            IgTextView igTextView = this.A1L;
            if (igTextView == null) {
                return;
            }
            if (this.A0U.A0K.length > 1) {
                C7F8 c7f82 = this.A1m;
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, c7f82.A00(), this.A0U.A0K, (float[]) null, Shader.TileMode.REPEAT);
                this.A1L.getPaint().setShader(linearGradient);
                this.A1K = new C7BY(linearGradient);
                if (this.A07.getHeight() == 0) {
                    return;
                }
                A0j(this, c7f82.A00() - this.A07.getHeight());
                return;
            }
            igTextView.getPaint().setShader(null);
            this.A1K = null;
            int[] iArr3 = this.A0U.A0K;
            int length2 = iArr3.length;
            IgTextView igTextView2 = this.A1L;
            if (length2 == 1) {
                igTextView2.setTextColor(iArr3[0]);
            } else {
                Context context2 = this.A1R;
                igTextView2.setTextColor(C02G.A02(context2, AbstractC53242c7.A0H(context2, R.attr.igds_color_primary_button)));
            }
            view = this.A1L;
        }
        view.invalidate();
    }

    private void A0N(final Activity activity) {
        C7GY c7gy;
        if (this.A0e == null) {
            C9BW c9bw = new C9BW(19);
            UserSession userSession = this.A1Z;
            if (C18U.A06(C06090Tz.A05, userSession, 36323448955874560L)) {
                c7gy = C7GY.A07;
            } else {
                c7gy = C7GY.A04;
            }
            C7E0 c7e0 = this.A1w;
            if (c7e0 != null) {
                C159637Dz c159637Dz = (C159637Dz) c7e0;
                c9bw.A00 = new C160217Gh(c7gy, c159637Dz.A0D(EnumC160197Gf.A03));
                c9bw.A01 = new C160217Gh(C7GY.A04, c159637Dz.A0D(EnumC160197Gf.A05));
            }
            InterfaceC16820sZ interfaceC16820sZ = new InterfaceC16820sZ() { // from class: X.7Gi
                @Override // X.InterfaceC16820sZ
                public final Object invoke() {
                    return C159737El.this.A0W;
                }
            };
            Context context = this.A1R;
            boolean z = !A0v(this);
            InterfaceC16820sZ interfaceC16820sZ2 = new InterfaceC16820sZ() { // from class: X.7Gj
                @Override // X.InterfaceC16820sZ
                public final Object invoke() {
                    return C159737El.this.A1r;
                }
            };
            InterfaceC16820sZ interfaceC16820sZ3 = new InterfaceC16820sZ() { // from class: X.7Gk
                @Override // X.InterfaceC16820sZ
                public final Object invoke() {
                    C159737El c159737El = this;
                    return C159737El.A08(EnumC46186KcO.A07, c159737El, C159737El.A0E(c159737El), "");
                }
            };
            InterfaceC16820sZ interfaceC16820sZ4 = new InterfaceC16820sZ() { // from class: X.7Gl
                @Override // X.InterfaceC16820sZ
                public final Object invoke() {
                    return C159737El.A07(activity, this, C05F.A00);
                }
            };
            C7FR c7fr = this.A1d;
            C7FO c7fo = this.A1t;
            InterfaceC16820sZ interfaceC16820sZ5 = new InterfaceC16820sZ() { // from class: X.7Gm
                @Override // X.InterfaceC16820sZ
                public final Object invoke() {
                    return C159737El.this.A0n;
                }
            };
            InterfaceC16820sZ interfaceC16820sZ6 = new InterfaceC16820sZ() { // from class: X.7Gn
                @Override // X.InterfaceC16820sZ
                public final Object invoke() {
                    return C159737El.this.A0m;
                }
            };
            InterfaceC16820sZ interfaceC16820sZ7 = new InterfaceC16820sZ() { // from class: X.7Go
                @Override // X.InterfaceC16820sZ
                public final Object invoke() {
                    return C159737El.this.A0l;
                }
            };
            C159947Fg c159947Fg = this.A0k;
            boolean z2 = this.A28;
            InterfaceC83713oG interfaceC83713oG = this.A1z;
            C163997Vo c163997Vo = this.A1i;
            InterfaceC11380iw interfaceC11380iw = this.A1X;
            C160007Fm c160007Fm = this.A0b;
            InterfaceC16660sJ interfaceC16660sJ = new InterfaceC16660sJ() { // from class: X.7Gp
                /* JADX WARN: Code restructure failed: missing block: B:4:0x0024, code lost:
                
                    if (X.C159737El.A0x(r11) != false) goto L6;
                 */
                @Override // X.InterfaceC16660sJ
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invoke(java.lang.Object r38) {
                    /*
                        r37 = this;
                        r0 = r37
                        r12 = r38
                        X.7El r11 = X.C159737El.this
                        X.9CH r12 = (X.C9CH) r12
                        com.instagram.common.session.UserSession r0 = r11.A1Z
                        r20 = r0
                        android.content.Context r0 = r11.A1R
                        r17 = r0
                        android.os.Handler r15 = r11.A1T
                        X.7Ez r14 = r11.A1h
                        X.7Vo r13 = r11.A1i
                        X.7IK r10 = r11.A0U
                        X.7F2 r9 = r11.A1u
                        boolean r0 = r11.A0y
                        if (r0 != 0) goto L26
                        boolean r0 = X.C159737El.A0x(r11)
                        r34 = 0
                        if (r0 == 0) goto L28
                    L26:
                        r34 = 1
                    L28:
                        X.3oG r1 = r11.A1z
                        r0 = 0
                        X.C14360o3.A0B(r1, r0)
                        boolean r8 = r1 instanceof X.InterfaceC2056098k
                        X.7Fm r0 = r11.A0b
                        X.7Fy r0 = r0.A0Y
                        java.lang.String r0 = r0.A00
                        java.lang.String r28 = r0.trim()
                        X.7Ex r7 = r11.A1q
                        com.instagram.direct.avatar.stickers.suggestions.DirectStickerSuggestionsController r6 = r11.A0K
                        X.M93 r5 = new X.M93
                        r5.<init>()
                        X.M96 r4 = new X.M96
                        r4.<init>()
                        X.M9C r3 = new X.M9C
                        r3.<init>()
                        X.B30 r2 = new X.B30
                        r2.<init>()
                        boolean r1 = r11.A28
                        java.lang.String r0 = r11.A21
                        X.LrC r16 = new X.LrC
                        r31 = r4
                        r32 = r2
                        r33 = r3
                        r35 = r8
                        r36 = r1
                        r27 = r9
                        r29 = r0
                        r30 = r5
                        r24 = r10
                        r25 = r7
                        r26 = r11
                        r21 = r6
                        r22 = r14
                        r23 = r13
                        r18 = r15
                        r19 = r12
                        r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
                        return r16
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C160297Gp.invoke(java.lang.Object):java.lang.Object");
                }
            };
            InterfaceC16820sZ interfaceC16820sZ8 = new InterfaceC16820sZ() { // from class: X.7Gq
                @Override // X.InterfaceC16820sZ
                public final Object invoke() {
                    return C159737El.this.A0K;
                }
            };
            InterfaceC16820sZ interfaceC16820sZ9 = new InterfaceC16820sZ() { // from class: X.7Gr
                @Override // X.InterfaceC16820sZ
                public final Object invoke() {
                    return Boolean.valueOf(C159737El.A10(C159737El.this));
                }
            };
            InterfaceC16820sZ interfaceC16820sZ10 = new InterfaceC16820sZ() { // from class: X.7Gs
                @Override // X.InterfaceC16820sZ
                public final Object invoke() {
                    AnonymousClass442 A05 = C159737El.A05(C159737El.this);
                    if (A05 != null) {
                        return A05.A0F;
                    }
                    return null;
                }
            };
            InterfaceC16820sZ interfaceC16820sZ11 = new InterfaceC16820sZ() { // from class: X.7Gt
                @Override // X.InterfaceC16820sZ
                public final Object invoke() {
                    return C159737El.this.A0g;
                }
            };
            InterfaceC16820sZ interfaceC16820sZ12 = new InterfaceC16820sZ() { // from class: X.7Gu
                @Override // X.InterfaceC16820sZ
                public final Object invoke() {
                    return C159737El.this.A0Z;
                }
            };
            InterfaceC08830cm interfaceC08830cm = this.A23;
            interfaceC08830cm.getClass();
            C160357Gv c160357Gv = new C160357Gv(interfaceC08830cm);
            this.A0e = new C7H0(activity, context, c9bw, interfaceC11380iw, userSession, this.A0J, c7fr, c163997Vo, new C160397Gz(this), c160007Fm, this.A1s, c7fo, c159947Fg, interfaceC83713oG, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16820sZ3, interfaceC16820sZ4, interfaceC16820sZ5, interfaceC16820sZ6, interfaceC16820sZ7, interfaceC16820sZ8, interfaceC16820sZ9, interfaceC16820sZ10, interfaceC16820sZ11, interfaceC16820sZ12, c160357Gv, new InterfaceC16820sZ() { // from class: X.7Gw
                @Override // X.InterfaceC16820sZ
                public final Object invoke() {
                    final C159737El c159737El = C159737El.this;
                    C1576575z c1576575z = c159737El.A0R;
                    if (c1576575z != null) {
                        c1576575z.A00(c159737El.A0b.A0Y.A00.trim(), new InterfaceC16660sJ() { // from class: X.B3f
                            @Override // X.InterfaceC16660sJ
                            public final Object invoke(Object obj) {
                                C159737El c159737El2 = C159737El.this;
                                c159737El2.A00 = 1;
                                c159737El2.A0b.A0S.setText((String) obj);
                                return C0eB.A00;
                            }
                        }, true);
                    }
                    return C0eB.A00;
                }
            }, new InterfaceC16820sZ() { // from class: X.7Gx
                @Override // X.InterfaceC16820sZ
                public final Object invoke() {
                    Integer num;
                    C159737El c159737El = this;
                    Activity activity2 = activity;
                    Integer num2 = C05F.A01;
                    if (c159737El.A1V()) {
                        num = num2;
                    } else {
                        num = C05F.A00;
                    }
                    return c159737El.A17(activity2, new FRT(num2, num));
                }
            }, new InterfaceC16820sZ() { // from class: X.7Gy
                @Override // X.InterfaceC16820sZ
                public final Object invoke() {
                    return C159737El.this.A0b.A0Y.A00.trim();
                }
            }, interfaceC16660sJ, z, z2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x046e, code lost:
    
        if (X.C18U.A06(r2, r3, 36324767511163335L) == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x04b2, code lost:
    
        if (X.C18U.A06(r2, r3, 36329272931074279L) == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01bf, code lost:
    
        if (r11.A03(r3, r35.A0W) == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0046, code lost:
    
        if (r1.A00 <= 0) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x039a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0P(final androidx.fragment.app.FragmentActivity r36, int r37) {
        /*
            Method dump skipped, instructions count: 1295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C159737El.A0P(androidx.fragment.app.FragmentActivity, int):void");
    }

    public static void A0Q(C45058Jwn c45058Jwn, EnumC46186KcO enumC46186KcO, C159737El c159737El, String str) {
        Long l;
        C7FR c7fr = c159737El.A1d;
        List A0L = A0L(c159737El);
        InterfaceC83713oG interfaceC83713oG = c159737El.A1z;
        String obj = enumC46186KcO.toString();
        C14360o3.A0B(interfaceC83713oG, 1);
        C14360o3.A0B(obj, 2);
        C18920wW c18920wW = c7fr.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "direct_composer_sticker_send");
        if (A00.isSampled()) {
            A00.AAk("recipient_ids", A0L);
            A00.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, obj);
            A00.AAP("open_thread_id", AbstractC92784Dr.A02(interfaceC83713oG));
            A00.A9K("occamadillo_thread_id", AbstractC92784Dr.A01(interfaceC83713oG));
            A00.A7v("is_e2ee", Boolean.valueOf(AbstractC140946Yw.A07(interfaceC83713oG)));
            if (str != null) {
                A00.AAP(AbstractC43591JPw.A00(11), str);
            }
            UserSession userSession = c7fr.A01;
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36328229255134562L) && c45058Jwn != null) {
                A00.A8R(c45058Jwn.A01, "sticker_type");
                String str2 = c45058Jwn.A04;
                if (str2 != null) {
                    l = AbstractC003100w.A0k(10, str2);
                } else {
                    l = null;
                }
                A00.A9K("pack_id", l);
                A00.A7v("is_animated", c45058Jwn.A02);
                A00.A7v("is_favorited", c45058Jwn.A03);
                A00.AAP("tray_source", c45058Jwn.A05);
                A00.A7v("is_overflow", Boolean.valueOf(c45058Jwn.A06));
                A00.A7v("is_visible_on_tray_open", null);
                if (C18U.A06(c06090Tz, userSession, 36328229255200099L)) {
                    A00.A9K(AbstractC43591JPw.A00(1343), Long.valueOf(c45058Jwn.A00));
                }
            }
            A00.Cht();
        }
    }

    public static void A0S(AnonymousClass442 anonymousClass442, C159737El c159737El, Integer num, String str) {
        Integer num2;
        LocalSendSpeedMessageTypes localSendSpeedMessageTypes;
        C2EE c2ee = c159737El.A0W;
        Boolean bool = null;
        if (c2ee != null) {
            num2 = Integer.valueOf(c2ee.C7g());
        } else {
            num2 = null;
        }
        if (num == C05F.A0j) {
            localSendSpeedMessageTypes = LocalSendSpeedMessageTypes.GIF;
        } else {
            localSendSpeedMessageTypes = LocalSendSpeedMessageTypes.STICKER;
        }
        A0R(anonymousClass442, c159737El, localSendSpeedMessageTypes, num2, str);
        C7X3 c7x3 = c159737El.A1n;
        EnumC92794Ds A06 = A06(c159737El, AHZ.A01(num));
        C2EE c2ee2 = c159737El.A0W;
        if (c2ee2 != null) {
            bool = Boolean.valueOf(c2ee2.CVQ());
        }
        c7x3.A00(A06, c159737El.A1z, bool, Boolean.valueOf(AbstractC159387Cy.A08(c159737El.A1Z, A0A(c159737El), C05F.A06)), num, num2, str, A0K(c159737El), A0J(c159737El));
    }

    public static void A0T(C159737El c159737El) {
        C3DN A01 = AbstractC161537Lo.A01(c159737El.A1R, c159737El.A1Z);
        if (A01 != null && ((C3DP) A01).A0h && (A01.A09() instanceof InterfaceC50436MOq)) {
            InterfaceC50436MOq interfaceC50436MOq = (InterfaceC50436MOq) A01.A09();
            C7IK c7ik = c159737El.A0U;
            if (c7ik != null) {
                interfaceC50436MOq.ADq(c7ik);
            }
        }
    }

    public static void A0V(C159737El c159737El) {
        ViewGroup viewGroup;
        C160617Hv c160617Hv = c159737El.A0L;
        if (c160617Hv != null && c159737El.A0U != null && (viewGroup = c160617Hv.A00) != null && viewGroup.getVisibility() == 0) {
            c160617Hv.A01();
            A0h(c159737El, 0);
            c159737El.A1B = true;
        }
    }

    public static void A0W(C159737El c159737El) {
        C160627Hw c160627Hw = c159737El.A0h;
        if (c160627Hw != null) {
            c160627Hw.A05 = false;
            C160627Hw.A02(c160627Hw, false);
        }
    }

    public static void A0X(C159737El c159737El) {
        C160557Hp c160557Hp;
        C2EY c2ey;
        if (((MRH) c159737El.A0u.A0V.getValue()).isRecording()) {
            C2EE c2ee = c159737El.A0W;
            if ((c2ee == null || !c2ee.CX1()) && (c160557Hp = c159737El.A0c) != null && c160557Hp.A09 != null && ((Boolean) c159737El.A0Z.A0I.getValue()).booleanValue()) {
                InterfaceC83713oG interfaceC83713oG = c159737El.A1z;
                C14360o3.A0B(interfaceC83713oG, 0);
                boolean z = interfaceC83713oG instanceof InterfaceC2056098k;
                C7FK c7fk = c159737El.A1l;
                AnonymousClass442 A05 = A05(c159737El);
                if (A05 != null) {
                    c2ey = A05.A0F;
                } else {
                    c2ey = null;
                }
                if (z) {
                    if (AbstractC001800i.A0u(C7FK.A08, c2ey)) {
                        if (C18U.A06(C06090Tz.A05, c7fk.A00, 36318161850734563L)) {
                            return;
                        }
                    }
                } else {
                    boolean z2 = c159737El.A0y;
                    InterfaceC08830cm interfaceC08830cm = c159737El.A23;
                    interfaceC08830cm.getClass();
                    if (c7fk.A03(c2ey, new C160357Gv(interfaceC08830cm), z2, A0x(c159737El))) {
                        return;
                    }
                }
            }
            c159737El.A0u.A0D();
        }
    }

    public static void A0Y(C159737El c159737El) {
        View findViewById;
        C7I0 c7i0 = (C7I0) c159737El.A0d.A0H.getValue();
        c159737El.A0Q = c7i0;
        C2EE c2ee = c159737El.A0W;
        if (c2ee != null && c2ee.BI1() != 0 && c7i0 != null && (findViewById = c7i0.A04.findViewById(R.id.nux_banner)) != null) {
            findViewById.setVisibility(8);
        }
    }

    public static void A0Z(C159737El c159737El) {
        C160657Hz c160657Hz = c159737El.A0a;
        if (c160657Hz != null && ((View) c160657Hz.A07.getValue()).getVisibility() == 0) {
            c159737El.A1B = true;
            ((View) c160657Hz.A07.getValue()).setVisibility(8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        if (r0 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0066, code lost:
    
        if (r2 != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009b, code lost:
    
        if (r1 != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c8, code lost:
    
        if (r9 == X.C2EY.A1x) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d2, code lost:
    
        if (r9 == X.C2EY.A22) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00dc, code lost:
    
        if (r9 == X.C2EY.A1r) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00e6, code lost:
    
        if (r9 == X.C2EY.A1t) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0a(X.C159737El r10) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C159737El.A0a(X.7El):void");
    }

    public static void A0b(C159737El c159737El) {
        EnumC33344Eod enumC33344Eod;
        C7I0 c7i0 = (C7I0) c159737El.A0d.A0H.getValue();
        c159737El.A0Q = c7i0;
        C2EE c2ee = c159737El.A0W;
        if (c2ee != null) {
            UserSession userSession = c159737El.A1Z;
            C7IK c7ik = c159737El.A0U;
            C45078Jx7 c45078Jx7 = c159737El.A0v;
            C14360o3.A0B(userSession, 0);
            Integer num = c7i0.A00;
            if (num == null) {
                C7I0.A00(userSession, c7i0, c2ee);
            } else {
                switch (num.intValue()) {
                    case 6:
                        AbstractC34081F2j.A00(c7i0.A04, c7i0.A07);
                        break;
                    case 7:
                        AbstractC34086F2o.A00(c7i0.A04, userSession, c7i0.A07, c2ee, true);
                        break;
                    case 8:
                        AbstractC34085F2n.A00(c7i0.A04, c7i0.A07);
                        break;
                    case 11:
                        C159187Ce.A00.A09(c7i0.A04, userSession, c7i0.A07, c7ik, c2ee);
                        break;
                    case Process.SIGSTOP /* 19 */:
                        C18920wW A01 = AbstractC12220kQ.A01(c7i0.A05, userSession);
                        InterfaceC02590Ai A00 = A01.A00(A01.A00, "ig_creator_connections_events");
                        A00.AAP("event", MSV.A00(515));
                        A00.AAP("target", "direct_thread_nux");
                        A00.A8R(EnumC33488ErN.DIRECT_THREAD, "screen");
                        A00.A8R(AbstractC100604fP.A00(userSession), "project");
                        A00.Cht();
                        View view = c7i0.A04;
                        InterfaceC148366m6 interfaceC148366m6 = c7i0.A07;
                        View findViewById = view.findViewById(R.id.nux_banner);
                        if (findViewById != null && findViewById.getVisibility() == 0) {
                            AbstractC34893FZf.A00(findViewById, userSession, interfaceC148366m6, c2ee);
                            break;
                        }
                        break;
                    case 22:
                        AbstractC47850LBt.A00(c7i0.A04, c7i0.A05, userSession, c7i0.A07, c45078Jx7);
                        break;
                    case 24:
                        View view2 = c7i0.A04;
                        InterfaceC148366m6 interfaceC148366m62 = c7i0.A07;
                        View findViewById2 = view2.findViewById(R.id.nux_banner);
                        C14360o3.A0A(findViewById2);
                        findViewById2.setVisibility(8);
                        interfaceC148366m62.DWL();
                        break;
                    case 26:
                        AbstractC34083F2l.A00(c7i0.A04, c7i0.A07);
                        break;
                }
                Activity activity = c7i0.A02;
                C14360o3.A0C(activity, MSV.A00(0));
                FragmentActivity fragmentActivity = (FragmentActivity) activity;
                InterfaceC83733oI A05 = JRE.A05(c2ee.BKb());
                String C7q = c2ee.C7q();
                int C7g = c2ee.C7g();
                int AdZ = c2ee.AdZ();
                String Asv = c2ee.Asv();
                boolean A0K = C14360o3.A0K(c2ee.An1(), true);
                C14360o3.A0B(fragmentActivity, 1);
                C2056398n A002 = AbstractC2056298m.A00(userSession);
                if (C7g == 29 && C14360o3.A0K(Asv, userSession.userId) && ((Number) A002.A06.CES(A002, C2056398n.A0d[31])).longValue() == 0 && C18U.A06(C06090Tz.A05, userSession, 36319377334279566L)) {
                    if (A0K) {
                        enumC33344Eod = EnumC33344Eod.A05;
                    } else {
                        enumC33344Eod = EnumC33344Eod.A02;
                    }
                    AbstractC34776FTz.A01(fragmentActivity, userSession, enumC33344Eod, A05, C7q, "thread_view", null, AdZ);
                    c7i0.A07.CMc();
                    c7i0.A00 = C05F.A04;
                }
            }
            C35152Feu c35152Feu = c159737El.A0s;
            if (c35152Feu != null) {
                C35152Feu.A00(c35152Feu, true);
            }
        }
    }

    public static void A0d(C159737El c159737El) {
        InterfaceC41501vz interfaceC41501vz = c159737El.A0C;
        if (interfaceC41501vz != null) {
            AbstractC25651Mw.A00(c159737El.A1Z).A02(interfaceC41501vz, C7I1.class);
        }
        InterfaceC41501vz interfaceC41501vz2 = c159737El.A0D;
        if (interfaceC41501vz2 != null) {
            AbstractC25651Mw.A00(c159737El.A1Z).A02(interfaceC41501vz2, C7CK.class);
        }
    }

    public static void A0e(final C159737El c159737El) {
        ImageView imageView;
        if (!c159737El.A1P && c159737El.A0t()) {
            C160007Fm c160007Fm = c159737El.A0b;
            final InterfaceC16660sJ interfaceC16660sJ = new InterfaceC16660sJ() { // from class: X.7Gc
                @Override // X.InterfaceC16660sJ
                public final Object invoke(Object obj) {
                    Long l;
                    final C159737El c159737El2 = C159737El.this;
                    final View view = (View) obj;
                    UserSession userSession = c159737El2.A1Z;
                    if (C18U.A06(C06090Tz.A06, userSession, 36325669454427392L)) {
                        C7FR c7fr = c159737El2.A1d;
                        InterfaceC83713oG interfaceC83713oG = c159737El2.A1z;
                        EnumC72433Xdd A01 = AbstractC34774FTx.A01(c159737El2.A0W);
                        List A0L = C159737El.A0L(c159737El2);
                        boolean A10 = C159737El.A10(c159737El2);
                        C14360o3.A0B(interfaceC83713oG, 0);
                        C18920wW c18920wW = c7fr.A00;
                        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "direct_composer_tap");
                        if (A00.isSampled()) {
                            A00.AAP("target", "camera");
                            A00.A7v("is_e2ee", Boolean.valueOf(AbstractC140946Yw.A07(interfaceC83713oG)));
                            A00.A7v("is_reply_flow", Boolean.valueOf(A10));
                            A00.AAP("open_thread_id", AbstractC92784Dr.A02(interfaceC83713oG));
                            A00.AAk("recipient_ids", A0L);
                            A00.A8R(A01, "thread_type");
                            A00.Cht();
                        }
                    }
                    C2EE c2ee = c159737El2.A0W;
                    if (c2ee != null && C159737El.A01(c159737El2) == 29) {
                        C142846ck A002 = AbstractC147806l5.A00(userSession);
                        int A003 = C159737El.A00(c159737El2);
                        String C7I = c2ee.C7I();
                        String C7q = c2ee.C7q();
                        C25531Mh A0E = C25531Mh.A0E(A002.A03);
                        if (((AbstractC02600Aj) A0E).A00.isSampled()) {
                            A0E.A0g(Long.valueOf(A002.A02));
                            A0E.A0k("camera_rendered");
                            A0E.A0j("tap");
                            A0E.A0o("camera_icon");
                            A0E.A0p("thread_view");
                            A0E.A0n(AbstractC147806l5.A01(Integer.valueOf(A003)));
                            A0E.A0r(C7I);
                            if (C7q != null) {
                                l = AbstractC003100w.A0k(10, C7q);
                            } else {
                                l = null;
                            }
                            A0E.A0h(l);
                            A0E.Cht();
                        }
                    }
                    if (!C159737El.A16(c159737El2, EnumC44170JfZ.A04, new MP1() { // from class: X.Aj0
                        @Override // X.MP1
                        public final void DHa(Integer num) {
                            C159737El c159737El3 = c159737El2;
                            View view2 = view;
                            if (num == C05F.A00) {
                                c159737El3.A1i.A03(AbstractC13880nE.A0G(view2), C159737El.A05(c159737El3), null, C159737El.A01(c159737El3));
                            }
                        }
                    })) {
                        c159737El2.A1i.A03(AbstractC13880nE.A0G(view), C159737El.A05(c159737El2), null, C159737El.A01(c159737El2));
                    } else {
                        c159737El2.A1C();
                        c159737El2.A19();
                    }
                    C159737El.A0m(c159737El2, false);
                    return C0eB.A00;
                }
            };
            C7G7 c7g7 = c160007Fm.A0X;
            View view = (View) c7g7.A07.getValue();
            if ((view instanceof ImageView) && (imageView = (ImageView) view) != null) {
                C0fQ.A00(new View.OnClickListener() { // from class: X.7Gd
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int A05 = C0f9.A05(600733063);
                        InterfaceC16660sJ interfaceC16660sJ2 = InterfaceC16660sJ.this;
                        C14360o3.A0A(view2);
                        interfaceC16660sJ2.invoke(view2);
                        C0f9.A0C(2132966763, A05);
                    }
                }, imageView);
                if (C7G5.A00.A01(c7g7.A04)) {
                    imageView.setImageDrawable(imageView.getContext().getDrawable(R.drawable.instagram_camera_pano_outline_24));
                } else {
                    AbstractC160187Ge.A02(imageView, R.drawable.direct_message_composer_thread_camera_icon, true);
                }
            }
            C7IK c7ik = c159737El.A0U;
            if (c7ik != null) {
                c159737El.A0b.A03(c7ik, false);
            }
            c159737El.A1P = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        if (X.C4GR.A08(java.lang.Integer.valueOf(A01(r5))) != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0f(X.C159737El r5) {
        /*
            X.0cm r0 = r5.A23
            java.lang.Object r4 = r0.get()
            X.7Hl r4 = (X.InterfaceC160517Hl) r4
            X.2EE r0 = r5.A0W
            r3 = 0
            if (r0 == 0) goto L4e
            com.instagram.common.session.UserSession r2 = r5.A1Z
            X.7DG r1 = X.C7DF.A00
            boolean r0 = r1.A02(r2, r0)
            if (r0 != 0) goto L4e
            X.2EE r0 = r5.A0W
            boolean r0 = r1.A03(r2, r0)
            if (r0 != 0) goto L4e
            com.instagram.model.direct.DirectThreadKey r0 = A0A(r5)
            boolean r0 = r4.Cg6(r2, r0)
            if (r0 != 0) goto L33
            com.instagram.model.direct.DirectThreadKey r0 = A0A(r5)
            boolean r0 = r4.CYE(r2, r0)
            if (r0 == 0) goto L4e
        L33:
            boolean r0 = A0v(r5)
            if (r0 == 0) goto L3f
            boolean r0 = r5.A0r()
            if (r0 == 0) goto L4e
        L3f:
            int r0 = A01(r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = X.C4GR.A08(r0)
            r2 = 1
            if (r0 == 0) goto L4f
        L4e:
            r2 = 0
        L4f:
            boolean r0 = r5.A16
            if (r0 == r2) goto L8e
            X.7Fm r0 = r5.A0b
            com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView r1 = r0.A0M
            r0 = 8
            if (r2 == 0) goto L5c
            r0 = 0
        L5c:
            r1.setVisibility(r0)
            X.7GN r0 = r5.A0u
            android.view.View r1 = X.C7GN.A00(r0)
            r0 = 8
            if (r2 == 0) goto L6a
            r0 = 0
        L6a:
            r1.setVisibility(r0)
            com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView r0 = r5.A0H
            if (r0 == 0) goto L78
            if (r2 != 0) goto L75
            r3 = 8
        L75:
            r0.setVisibility(r3)
        L78:
            r5.A16 = r2
            X.7Fm r0 = r5.A0b
            X.7G7 r0 = r0.A0X
            if (r2 == 0) goto L8f
            r2 = 1
            android.view.View r1 = r0.A01
            android.view.ViewGroup r0 = r0.A02
            X.AbstractC1577376h.A01(r1, r0, r2)
        L88:
            r5.A0M()
            r5.A1F()
        L8e:
            return
        L8f:
            android.view.ViewGroup r1 = r0.A02
            r0 = 8
            r1.setVisibility(r0)
            goto L88
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C159737El.A0f(X.7El):void");
    }

    public static void A0g(C159737El c159737El, int i) {
        EnumC33519Ers enumC33519Ers;
        String str = c159737El.A21;
        if (str != null && A0v(c159737El)) {
            if (!str.startsWith("core_search") && !str.startsWith("explore_search") && !str.startsWith("ig_search")) {
                if (str.startsWith("igd_universal_search")) {
                    enumC33519Ers = EnumC33519Ers.A0I;
                } else if (str.startsWith("inbox")) {
                    enumC33519Ers = EnumC33519Ers.A0H;
                }
            } else {
                enumC33519Ers = EnumC33519Ers.A09;
            }
            String A0H = A0H(c159737El);
            int i2 = !c159737El.A28 ? 1 : 0;
            C18920wW c18920wW = c159737El.A2D;
            C14360o3.A0B(c18920wW, 0);
            F1U.A00(c18920wW, new MI1(enumC33519Ers, A0H, i, i2));
        }
        enumC33519Ers = EnumC33519Ers.A0J;
        String A0H2 = A0H(c159737El);
        int i22 = !c159737El.A28 ? 1 : 0;
        C18920wW c18920wW2 = c159737El.A2D;
        C14360o3.A0B(c18920wW2, 0);
        F1U.A00(c18920wW2, new MI1(enumC33519Ers, A0H2, i, i22));
    }

    public static void A0h(C159737El c159737El, int i) {
        View view = c159737El.A05;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    public static void A0i(final C159737El c159737El, int i) {
        if (C18U.A06(C06090Tz.A05, c159737El.A1Z, 36325321561093114L) && c159737El.A07.getVisibility() == i) {
            return;
        }
        c159737El.A07.setVisibility(i);
        C7FX c7fx = c159737El.A0P;
        if (c7fx == null) {
            return;
        }
        if (i == 8) {
            c7fx.A00(0, 0, 0, false);
        } else {
            AbstractC13880nE.A0u(c159737El.A07, new Callable() { // from class: X.7CL
                @Override // java.util.concurrent.Callable
                public final /* bridge */ /* synthetic */ Object call() {
                    C159737El.A0n(C159737El.this, false);
                    return true;
                }
            });
        }
    }

    public static void A0j(C159737El c159737El, int i) {
        InterfaceC161477Li interfaceC161477Li;
        if (c159737El.A1L != null && (interfaceC161477Li = c159737El.A1K) != null) {
            interfaceC161477Li.Eg1(i);
            c159737El.A1L.invalidate();
        }
    }

    public static void A0m(C159737El c159737El, boolean z) {
        C160557Hp c160557Hp = c159737El.A0c;
        if (c160557Hp != null && c160557Hp.A02()) {
            ViewGroup viewGroup = c160557Hp.A03;
            if (viewGroup != null && viewGroup.getVisibility() == 0) {
                viewGroup.setVisibility(8);
            }
            c160557Hp.A09 = null;
            c160557Hp.A07 = null;
            c159737El.A1F();
            A0h(c159737El, 0);
            c159737El.A1B = z;
            A0O(Editable.Factory.getInstance().newEditable(c159737El.A0b.A0Y.A00.trim()), c159737El);
            C35152Feu c35152Feu = c159737El.A0s;
            if (c35152Feu != null && c35152Feu.A02()) {
                AbstractC46995KqE.A00(c35152Feu.A01, true, false);
            }
        }
    }

    public static void A0n(C159737El c159737El, boolean z) {
        int height;
        int i;
        View view;
        if (c159737El.A0P != null) {
            if (!c159737El.A1X() && !c159737El.A1G) {
                height = 0;
            } else {
                height = c159737El.A07.getHeight();
            }
            if (c159737El.A2A && c159737El.A04 == null) {
                c159737El.A04 = c159737El.A07.findViewById(R.id.direct_composer_ai_suggested_replies);
            }
            View view2 = c159737El.A04;
            if (view2 != null && view2.getVisibility() == 0) {
                i = c159737El.A04.getHeight();
            } else {
                i = 0;
            }
            FRJ frj = c159737El.A0X;
            int i2 = 0;
            if (frj != null) {
                InterfaceC56392iX interfaceC56392iX = frj.A08;
                if (interfaceC56392iX.CWW() && interfaceC56392iX.getView().getVisibility() == 0) {
                    InterfaceC56392iX interfaceC56392iX2 = c159737El.A0X.A08;
                    if (interfaceC56392iX2.CWW() && (view = interfaceC56392iX2.getView()) != null) {
                        i2 = view.getHeight();
                    }
                }
            }
            c159737El.A0P.A00(height - i, i, i2, z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
    
        if (r0.A02() == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
    
        if (r0.A00 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
    
        if (r2.findViewById(com.facebook.R.id.nux_banner).getVisibility() != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004c, code lost:
    
        if (r0.getVisibility() != 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005c, code lost:
    
        if (r1 != 0) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0o(X.C159737El r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C159737El.A0o(X.7El, boolean):void");
    }

    public static void A0p(C159737El c159737El, boolean z, boolean z2) {
        ViewGroup viewGroup;
        C160607Hu c160607Hu = c159737El.A0t;
        if (c160607Hu != null && c159737El.A0U != null && (viewGroup = c160607Hu.A02) != null && viewGroup.getVisibility() == 0) {
            if (z2) {
                if (C18U.A06(C06090Tz.A05, c159737El.A1Z, 36314034387159424L)) {
                    return;
                }
            }
            ViewGroup viewGroup2 = c160607Hu.A02;
            if (viewGroup2 != null) {
                if (viewGroup2.getVisibility() == 0) {
                    ViewGroup viewGroup3 = c160607Hu.A02;
                    if (viewGroup3 != null) {
                        viewGroup3.setVisibility(8);
                    }
                }
                if (!z) {
                    A0h(c159737El, 0);
                }
                c159737El.A1B = true;
                return;
            }
            C14360o3.A0F("rootView");
            throw C00O.createAndThrow();
        }
    }

    private boolean A0q() {
        String AzI;
        if (this.A1A) {
            return this.A0b.A0Y.A00.trim().isEmpty();
        }
        C2EE c2ee = this.A0W;
        if (c2ee == null || (AzI = c2ee.AzI(this.A1Z)) == null || AzI.isEmpty()) {
            return true;
        }
        return false;
    }

    private boolean A0t() {
        if (((!((Boolean) this.A0Z.A0H.getValue()).booleanValue() && A01(this) != 29) || A0v(this)) && !A0u()) {
            return false;
        }
        return true;
    }

    public static boolean A0x(C159737El c159737El) {
        C2EF c2ef = (C2EF) c159737El.A22.get();
        if (c2ef != null && C161867Mw.A02(c2ef.Aic())) {
            return true;
        }
        return false;
    }

    public static boolean A0y(C159737El c159737El) {
        C2EE c2ee = c159737El.A0W;
        if (c2ee != null && c2ee.Ba5() != null) {
            return c159737El.A0W.Ba5().A1U();
        }
        return false;
    }

    public static boolean A10(C159737El c159737El) {
        C160557Hp c160557Hp = c159737El.A0c;
        if (c160557Hp != null && c160557Hp.A02()) {
            return true;
        }
        return false;
    }

    public static boolean A12(C159737El c159737El) {
        InterfaceC83713oG interfaceC83713oG = c159737El.A1z;
        C14360o3.A0B(interfaceC83713oG, 0);
        if ((interfaceC83713oG instanceof InterfaceC2056098k) || C4GR.A03(A01(c159737El))) {
            return false;
        }
        InterfaceC160517Hl interfaceC160517Hl = (InterfaceC160517Hl) c159737El.A23.get();
        UserSession userSession = c159737El.A1Z;
        if (!interfaceC160517Hl.Ccm(userSession)) {
            return false;
        }
        if (A0y(c159737El)) {
            C14360o3.A0B(userSession, 0);
            if (!C18U.A06(C06090Tz.A05, userSession, 36323560625876345L)) {
                return false;
            }
        }
        if (A0x(c159737El)) {
            C14360o3.A0B(userSession, 0);
            if (AbstractC46749Km6.A00(userSession) && C18U.A06(C06090Tz.A05, userSession, 36323560624893292L)) {
                return true;
            }
            return false;
        }
        return AbstractC46749Km6.A00(userSession);
    }

    public static boolean A13(C159737El c159737El) {
        C2EE c2ee = c159737El.A0W;
        if (c2ee != null && c2ee.CX1()) {
            return false;
        }
        return ((Boolean) c159737El.A0Z.A0E.getValue()).booleanValue();
    }

    public static boolean A14(C159737El c159737El) {
        if (c159737El.A2U && A01(c159737El) != 29 && !A0v(c159737El) && !C4GR.A08(Integer.valueOf(A01(c159737El)))) {
            return true;
        }
        return false;
    }

    public static boolean A15(C159737El c159737El) {
        if (c159737El.A1x.A00(AbstractC140946Yw.A05(c159737El.A1z), 52) && !A0v(c159737El)) {
            if (C18U.A06(C06090Tz.A05, c159737El.A1Z, 36323448955350269L)) {
                return true;
            }
        }
        return false;
    }

    public static boolean A16(C159737El c159737El, EnumC44170JfZ enumC44170JfZ, MP1 mp1) {
        java.util.Set A01;
        Iterable iterable;
        String str;
        Boolean valueOf;
        Long l;
        Long l2;
        long j;
        long j2;
        java.util.Set A012;
        if (!c159737El.A1V()) {
            InterfaceC83713oG interfaceC83713oG = c159737El.A1z;
            C14360o3.A0B(interfaceC83713oG, 0);
            if (!(interfaceC83713oG instanceof InterfaceC2056098k)) {
                C164387Xb A00 = AbstractC164377Xa.A00(c159737El.A1Z);
                if (A00.A01()) {
                    EnumC44171Jfa enumC44171Jfa = EnumC44171Jfa.A04;
                    String A0G = A0G(c159737El);
                    if (A00.A01()) {
                        C164397Xc c164397Xc = A00.A01;
                        C164417Xe c164417Xe = c164397Xc.A01;
                        synchronized (c164417Xe) {
                            A01 = C164417Xe.A01(c164417Xe, enumC44170JfZ, C164417Xe.A00(c164417Xe, enumC44171Jfa, (java.util.Set) c164417Xe.A05.getValue()));
                        }
                        java.util.Set A002 = C164397Xc.A00(c164397Xc, A01);
                        if (A0G != null) {
                            synchronized (c164417Xe) {
                                java.util.Set set = (java.util.Set) ((Map) c164417Xe.A08.getValue()).get(A0G);
                                if (set == null) {
                                    set = C16910sj.A00;
                                }
                                A012 = C164417Xe.A01(c164417Xe, enumC44170JfZ, C164417Xe.A00(c164417Xe, enumC44171Jfa, set));
                            }
                            iterable = C164397Xc.A00(c164397Xc, A012);
                        } else {
                            iterable = C16910sj.A00;
                        }
                        Iterator it = AnonymousClass090.A00(iterable, A002).iterator();
                        Object obj = null;
                        if (it.hasNext()) {
                            obj = it.next();
                            if (it.hasNext()) {
                                int i = ((C66057Tyu) obj).A00;
                                do {
                                    Object next = it.next();
                                    int i2 = ((C66057Tyu) next).A00;
                                    if (i < i2) {
                                        obj = next;
                                        i = i2;
                                    }
                                } while (it.hasNext());
                            }
                        }
                        C66057Tyu c66057Tyu = (C66057Tyu) obj;
                        if (c66057Tyu != null) {
                            String str2 = c66057Tyu.A06;
                            UP3 up3 = c66057Tyu.A02;
                            if (up3 != null) {
                                str = up3.A00;
                            } else {
                                str = null;
                            }
                            if ("MINOR_TO_ADULT_MEDIA_SHARE_EDUCATION".equalsIgnoreCase(str2) || "MINOR_TO_HIGH_RISK_ADULT_MEDIA_SHARE_EDUCATION".equalsIgnoreCase(str2)) {
                                UserSession userSession = c164397Xc.A00;
                                C66056Tyt c66056Tyt = c66057Tyu.A01;
                                int i3 = c66056Tyt.A00;
                                int A06 = (int) C17s.A06(C36J.A06(C36G.A09, c66056Tyt.A02), -2147483648L, 2147483647L);
                                C14360o3.A0B(userSession, 1);
                                C14360o3.A0B(str2, 3);
                                String obj2 = C0HM.A00().toString();
                                C14360o3.A07(obj2);
                                Context context = c159737El.A1R;
                                C14360o3.A0B(context, 0);
                                C06090Tz c06090Tz = C06090Tz.A06;
                                if (C18U.A06(c06090Tz, userSession, 36317161123353419L)) {
                                    valueOf = Boolean.valueOf(C18U.A06(C06090Tz.A05, userSession, 36317161123287882L));
                                } else {
                                    valueOf = Boolean.valueOf(C18U.A06(c06090Tz, userSession, 36317161123287882L));
                                }
                                C14360o3.A0A(valueOf);
                                if (valueOf.booleanValue()) {
                                    long currentTimeMillis = System.currentTimeMillis();
                                    Object obj3 = AbstractC164407Xd.A00(userSession).A03.get(str2);
                                    if (obj3 == null) {
                                        obj3 = null;
                                    }
                                    C47632L1r c47632L1r = (C47632L1r) obj3;
                                    C18920wW A02 = AbstractC12220kQ.A02(userSession);
                                    InterfaceC02590Ai A003 = A02.A00(A02.A00, "mwb_ts_education_intervention_triggered");
                                    if (A003.isSampled()) {
                                        A003.AAP("logger_session_id", obj2);
                                        Long l3 = null;
                                        if (A0G != null) {
                                            l = AbstractC003100w.A0k(10, A0G);
                                        } else {
                                            l = null;
                                        }
                                        A003.A9K("other_userid", l);
                                        A003.AAP("intervention_type", str2);
                                        A003.AAP("trigger_action_type", enumC44170JfZ.A00);
                                        A003.AAP("trigger_action_location", "CANONICAL_THREAD_VIEW");
                                        A003.A9K("trigger_event_timestamp", Long.valueOf(currentTimeMillis));
                                        if (c47632L1r != null) {
                                            C58913QIr c58913QIr = c47632L1r.A00;
                                            if (c58913QIr != null) {
                                                j2 = c58913QIr.A00;
                                            } else {
                                                j2 = 0;
                                            }
                                            l2 = Long.valueOf(j2);
                                        } else {
                                            l2 = null;
                                        }
                                        A003.A9K("last_impression_timestamp", l2);
                                        if (c47632L1r != null) {
                                            C58913QIr c58913QIr2 = c47632L1r.A00;
                                            if (c58913QIr2 != null) {
                                                j = c58913QIr2.A01;
                                            } else {
                                                j = 0;
                                            }
                                            l3 = Long.valueOf(j);
                                        }
                                        A003.A9K("total_num_impressions", l3);
                                        A003.A9K("max_num_impressions_allowed", Long.valueOf(i3));
                                        A003.A9K("impression_candence_sec", Long.valueOf(A06));
                                        A003.Cht();
                                    }
                                    IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig(userSession);
                                    igBloksScreenConfig.A0R = "com.bloks.www.safety_intervention.media_share.bottom_sheet";
                                    CSU csu = new CSU(context);
                                    Map map = csu.A03;
                                    map.put("intervetion_type", str2);
                                    map.put("flow_context", str);
                                    map.put("action_type", enumC44170JfZ.A00);
                                    map.put("location", enumC44171Jfa.A00);
                                    map.put(AbstractC31688Dvt.A00(), obj2);
                                    C66237U5h c66237U5h = new C66237U5h(new D33(csu, new C50159MDm(mp1, 9)));
                                    Map map2 = csu.A02;
                                    map2.put("onShareActionClick", c66237U5h);
                                    map2.put("onDontShareActionClick", new C66237U5h(new D32(csu, new C50159MDm(mp1, 10))));
                                    C66277U6x A022 = C66277U6x.A02("com.bloks.www.safety_intervention.media_share.bottom_sheet", AbstractC191768eY.A01(map), map2);
                                    A022.A00 = -1;
                                    A022.A05 = null;
                                    A022.A01 = 0L;
                                    A022.A06 = null;
                                    A022.A03 = null;
                                    A022.A02 = null;
                                    A022.A04 = null;
                                    A022.A08(csu.A01);
                                    A022.A05(csu.A00, igBloksScreenConfig);
                                    C164417Xe A004 = AbstractC164407Xd.A00(userSession);
                                    AbstractC23641Du.A05(AnonymousClass191.A00, new MBg(A004, str2, A0G, null), A004.A04);
                                    return true;
                                }
                                mp1.DHa(C05F.A00);
                                return true;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final C0eB A17(Activity activity, final FRT frt) {
        EnumC33519Ers enumC33519Ers;
        final C49696LxR c49696LxR = new C49696LxR(this);
        UserSession userSession = this.A1Z;
        if (!AbstractC162267Oo.A02(userSession)) {
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36320403826287065L)) {
                AbstractC31265Don.A00().A02(activity, EnumC33519Ers.A05, userSession, new InterfaceC16820sZ() { // from class: X.GRg
                    @Override // X.InterfaceC16820sZ
                    public final Object invoke() {
                        C159737El.this.A1S(frt, c49696LxR);
                        return null;
                    }
                }, null);
            } else if (C18U.A06(c06090Tz, userSession, 36329272931139816L)) {
                AbstractC31265Don.A00().A03(activity, userSession, EnumC33519Ers.A05.toString(), new InterfaceC16820sZ() { // from class: X.GRh
                    @Override // X.InterfaceC16820sZ
                    public final Object invoke() {
                        C159737El.this.A1S(frt, c49696LxR);
                        return C0eB.A00;
                    }
                });
            } else {
                if (frt.A00 == C05F.A00) {
                    enumC33519Ers = EnumC33519Ers.A05;
                } else {
                    enumC33519Ers = EnumC33519Ers.A06;
                }
                AbstractC31265Don.A00().A01(activity, enumC33519Ers, userSession, null, false, true);
            }
        } else {
            A1S(frt, c49696LxR);
        }
        return C0eB.A00;
    }

    public final void A18() {
        L8B l8b = this.A0g;
        if (l8b != null) {
            if (l8b.A00()) {
                ((View) l8b.A07.getValue()).setVisibility(8);
                l8b.A02 = null;
                l8b.A03 = null;
                C47557KzS c47557KzS = l8b.A01;
                if (c47557KzS != null) {
                    C1575275m c1575275m = c47557KzS.A01;
                    c1575275m.A01 = false;
                    RecyclerView recyclerView = (RecyclerView) c1575275m.A03.getValue();
                    C1I4 c1i4 = c1575275m.A00;
                    C14360o3.A0C(c1i4, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.OnScrollListener");
                    recyclerView.A15(c1i4);
                    ArrayList arrayList = c1575275m.A02;
                    Iterator it = arrayList.iterator();
                    C14360o3.A07(it);
                    while (it.hasNext()) {
                        L6L l6l = (L6L) it.next();
                        if (l6l != null) {
                            l6l.A00();
                        }
                    }
                    arrayList.clear();
                    ((C7ZK) c1575275m.A05.invoke()).A01(1.0f);
                }
            }
            C160007Fm c160007Fm = this.A0b;
            c160007Fm.A0Y.A00 = "";
            c160007Fm.A0S.post(new M4N(null, c160007Fm));
            A1F();
            A0h(this, 0);
            A03(this).setVisibility(8);
            this.A1B = true;
            C7E0 c7e0 = this.A1w;
            if (c7e0 instanceof C159637Dz) {
                C159637Dz c159637Dz = (C159637Dz) c7e0;
                c159637Dz.A06 = false;
                C159637Dz.A00(c159637Dz);
            }
        }
        C2d4 c2d4 = this.A2C;
        if (c2d4.AYT() != null) {
            c2d4.AYT().A0P.setAlpha(1.0f);
        }
    }

    public final void A19() {
        AbstractC13880nE.A0O(this.A0b.A0S);
    }

    public final void A1A() {
        C160617Hv c160617Hv = (C160617Hv) this.A0d.A0J.getValue();
        this.A0L = c160617Hv;
        C2EE c2ee = this.A0W;
        if (c160617Hv != null && this.A1A && this.A0U != null && c2ee != null && !c2ee.isPending()) {
            if (!A0q()) {
                String trim = this.A0b.A0Y.A00.trim();
                C14360o3.A0B(trim, 0);
                if (c160617Hv.A00 == null) {
                    ViewStub viewStub = c160617Hv.A04;
                    viewStub.setLayoutResource(R.layout.contact_share_container);
                    View inflate = viewStub.inflate();
                    C14360o3.A0C(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
                    c160617Hv.A00 = (ViewGroup) inflate;
                }
                if (c160617Hv.A01 != null && c160617Hv.A02 != null && C160617Hv.A00(c160617Hv, trim) && !c160617Hv.A03) {
                    if (C18U.A06(C06090Tz.A05, c160617Hv.A06, 36322607141759346L)) {
                        ViewGroup viewGroup = c160617Hv.A00;
                        if (viewGroup != null) {
                            if (viewGroup.getVisibility() == 8) {
                                ViewGroup viewGroup2 = c160617Hv.A00;
                                if (viewGroup2 != null) {
                                    ((TextView) viewGroup2.findViewById(R.id.contact_share_business_name_label)).setText(c160617Hv.A08);
                                    ViewGroup viewGroup3 = c160617Hv.A00;
                                    if (viewGroup3 != null) {
                                        ((TextView) viewGroup3.findViewById(R.id.contact_share_number_label)).setText(c160617Hv.A02);
                                        ViewGroup viewGroup4 = c160617Hv.A00;
                                        if (viewGroup4 != null) {
                                            C0fQ.A00(new ViewOnClickListenerC23200AQk(c160617Hv), viewGroup4.findViewById(R.id.dismiss_button));
                                            ImageUrl imageUrl = c160617Hv.A07;
                                            if (imageUrl != null) {
                                                ExtendedImageUrl extendedImageUrl = new ExtendedImageUrl(imageUrl);
                                                ViewGroup viewGroup5 = c160617Hv.A00;
                                                if (viewGroup5 != null) {
                                                    ((IgImageView) viewGroup5.findViewById(R.id.profile_image_view)).setUrl(extendedImageUrl, c160617Hv.A05);
                                                }
                                            }
                                            ViewGroup viewGroup6 = c160617Hv.A00;
                                            if (viewGroup6 != null) {
                                                AbstractC125325le A01 = AbstractC125325le.A01(viewGroup6, 0);
                                                A01.A0G();
                                                AbstractC125325le A0A = A01.A0A();
                                                if (c160617Hv.A00 != null) {
                                                    A0A.A0T(r0.getMeasuredHeight(), 0.0f);
                                                    A0A.A04 = 0;
                                                    A0A.A0H();
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                return;
                            }
                        }
                        C14360o3.A0F("rootView");
                        throw C00O.createAndThrow();
                    }
                }
                if (!C160617Hv.A00(c160617Hv, trim) && c160617Hv.A03) {
                    c160617Hv.A03 = false;
                    return;
                } else {
                    c160617Hv.A01();
                    return;
                }
            }
            this.A2J.A00();
        }
    }

    public final void A1B() {
        String str;
        SettableFuture settableFuture;
        C159777Ep c159777Ep;
        SmartSuggestion Bxt;
        EnumC82333lv enumC82333lv;
        C160607Hu c160607Hu = (C160607Hu) this.A0d.A0P.getValue();
        this.A0t = c160607Hu;
        C2EE c2ee = this.A0W;
        if (c160607Hu != null && this.A1A && this.A0U != null && c2ee != null && !c2ee.isPending()) {
            if (A0q()) {
                Bundle bundle = this.A1i.A00.A0r;
                if (bundle.getParcelable("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_LOCAL_SMART_SUGGESTION") != null) {
                    Bxt = (SmartSuggestion) bundle.getParcelable("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_LOCAL_SMART_SUGGESTION");
                } else {
                    C2056398n A00 = AbstractC2056298m.A00(this.A1Z);
                    if (((Boolean) A00.A0U.CES(A00, C2056398n.A0d[8])).booleanValue()) {
                        Bxt = c2ee.Bxt();
                    }
                    c159777Ep = this.A2J;
                }
                if (Bxt != null) {
                    String str2 = Bxt.A04;
                    Integer num = Bxt.A03;
                    Integer num2 = C05F.A01;
                    if (num == num2 && (enumC82333lv = Bxt.A02) != EnumC82333lv.A09 && str2 != null && str2.length() != 0 && !c160607Hu.A0H && enumC82333lv == EnumC82333lv.A07) {
                        UserSession userSession = c160607Hu.A0M;
                        if (C18U.A06(C06090Tz.A05, userSession, 36315194028264555L)) {
                            C160607Hu.A01(c160607Hu, Bxt.A02, "smart_suggestion");
                            c159777Ep = c160607Hu.A0N;
                            str = "suggestedReplyLogger";
                            if (!c159777Ep.A02(false)) {
                                LGj lGj = c160607Hu.A0A;
                                if (lGj != null) {
                                    lGj.A01(Bxt.A02, "smart_suggestion");
                                }
                            } else {
                                Context context = c160607Hu.A0L;
                                EnumC82333lv enumC82333lv2 = Bxt.A02;
                                String str3 = Bxt.A06;
                                C14360o3.A0B(enumC82333lv2, 2);
                                List singletonList = Collections.singletonList(LJU.A00(context, userSession, enumC82333lv2, num2, "", "smart_suggestion", str2, str3, null));
                                C14360o3.A07(singletonList);
                                C160607Hu.A02(c160607Hu, singletonList, new C207189Ex(17, c160607Hu, Bxt));
                                c159777Ep.A01();
                                c160607Hu.A09 = Bxt;
                                if (c160607Hu.A0G) {
                                    return;
                                }
                                LGj lGj2 = c160607Hu.A0A;
                                if (lGj2 != null) {
                                    lGj2.A03(Bxt.A02, "smart_suggestion", c160607Hu.A0E, 1);
                                    JU2 ju2 = c160607Hu.A08;
                                    if (ju2 == null) {
                                        str = "smartSuggestionLogger";
                                    } else {
                                        ju2.A02(userSession.userId, (String) AbstractC001800i.A0O(c160607Hu.A0P, 0), Bxt.A05);
                                        c160607Hu.A0G = true;
                                        return;
                                    }
                                }
                            }
                            C14360o3.A0F(str);
                            throw C00O.createAndThrow();
                        }
                    }
                }
                c159777Ep = c160607Hu.A0N;
            } else {
                UserSession userSession2 = this.A1Z;
                C2056398n A002 = AbstractC2056298m.A00(userSession2);
                if (((Boolean) A002.A0U.CES(A002, C2056398n.A0d[8])).booleanValue()) {
                    C14360o3.A0B(userSession2, 0);
                    if (C18U.A06(C06090Tz.A06, userSession2, 36316173281071196L)) {
                        String trim = this.A0b.A0Y.A00.trim();
                        C14360o3.A0B(trim, 0);
                        if (c160607Hu.A0H) {
                            return;
                        }
                        C160607Hu.A01(c160607Hu, EnumC82333lv.A07, "sayt");
                        LG2 lg2 = c160607Hu.A06;
                        String str4 = null;
                        if (lg2 == null) {
                            str = "previousReplyManager";
                            C14360o3.A0F(str);
                            throw C00O.createAndThrow();
                        }
                        LI2 li2 = lg2.A00;
                        synchronized (li2) {
                            C47496KyP c47496KyP = new C47496KyP(trim);
                            li2.A04.add(c47496KyP);
                            LI2.A00(li2);
                            settableFuture = c47496KyP.A00;
                        }
                        L4K l4k = c160607Hu.A0B;
                        if (l4k != null) {
                            str4 = l4k.A04;
                        }
                        if (trim.equals(str4)) {
                            return;
                        }
                        C2OD.A03(new LWQ(c160607Hu, trim), settableFuture, C1M8.A01);
                        return;
                    }
                }
                if (AbstractC2056298m.A00(userSession2).A08()) {
                    String trim2 = this.A0b.A0Y.A00.trim();
                    C14360o3.A0B(trim2, 0);
                    if (!c160607Hu.A0H) {
                        UserSession userSession3 = c160607Hu.A0M;
                        if (C7I2.A00(userSession3)) {
                            EnumC82333lv enumC82333lv3 = EnumC82333lv.A08;
                            C160607Hu.A01(c160607Hu, enumC82333lv3, "sayt");
                            L4K l4k2 = c160607Hu.A0B;
                            String str5 = null;
                            if (l4k2 != null) {
                                str5 = l4k2.A04;
                            }
                            if (trim2.equals(str5)) {
                                return;
                            }
                            JUI jui = c160607Hu.A04;
                            if (jui == null) {
                                str = "quickReplyManager";
                            } else {
                                ArrayList A03 = jui.A03(trim2);
                                if (A03.isEmpty()) {
                                    c160607Hu.A0F = false;
                                } else {
                                    LGj lGj3 = c160607Hu.A0A;
                                    str = "suggestedReplyLogger";
                                    if (lGj3 != null) {
                                        lGj3.A02(enumC82333lv3, c160607Hu.A0E, trim2.length());
                                        C159777Ep c159777Ep2 = c160607Hu.A0N;
                                        if (!c159777Ep2.A02(true)) {
                                            LGj lGj4 = c160607Hu.A0A;
                                            if (lGj4 != null) {
                                                lGj4.A01(enumC82333lv3, "sayt");
                                                c159777Ep2.A00();
                                                return;
                                            }
                                        } else {
                                            LGj lGj5 = c160607Hu.A0A;
                                            if (lGj5 != null) {
                                                lGj5.A03(enumC82333lv3, "sayt", c160607Hu.A0E, A03.size());
                                                C160607Hu.A02(c160607Hu, LJU.A01(c160607Hu.A0L, userSession3, trim2, A03), new C50261MHq(c160607Hu, 30));
                                                c159777Ep2.A01();
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                            C14360o3.A0F(str);
                            throw C00O.createAndThrow();
                        }
                    }
                    c159777Ep = c160607Hu.A0N;
                }
                c159777Ep = this.A2J;
            }
            c159777Ep.A00();
        }
    }

    public final void A1C() {
        if (this.A1Q) {
            this.A1Q = false;
            if (!this.A18) {
                A19();
            }
            this.A0b.A0R.setOnFocusChangeListener(null);
            this.A07.removeOnLayoutChangeListener(this.A2B);
            C7GN c7gn = this.A0u;
            if (((MRH) c7gn.A0V.getValue()).isRecording()) {
                c7gn.A0D();
            }
            c7gn.A0E = C05F.A0j;
            C163997Vo c163997Vo = this.A1i;
            String trim = this.A0b.A0Y.A00.trim();
            C14360o3.A0B(trim, 0);
            AnonymousClass983 anonymousClass983 = c163997Vo.A00;
            if (AnonymousClass983.A07(anonymousClass983) != null) {
                String string = anonymousClass983.A0r.getString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_PREFILL_TEXT");
                if (string == null || string.length() == 0) {
                    C7W4 A01 = AnonymousClass983.A01(anonymousClass983);
                    C7U0 c7u0 = A01.A08;
                    if (c7u0 != null) {
                        if (c7u0.C7r().CeQ()) {
                            C7U0 c7u02 = A01.A08;
                            if (c7u02 != null) {
                                C3o9 B90 = c7u02.C7r().B90();
                                C41761wQ c41761wQ = A01.A0b;
                                C7U0 c7u03 = A01.A08;
                                if (c7u03 != null) {
                                    C7TQ C78 = c7u03.C78();
                                    C14360o3.A0A(B90);
                                    c41761wQ.A02(C78.ELf(B90, trim, A01.A0F, false), PKG.A00);
                                }
                            }
                        }
                    }
                    C14360o3.A0F("clientInfra");
                    throw C00O.createAndThrow();
                }
                if (anonymousClass983.A13.A00(EnumC2054697t.A16) && (anonymousClass983.A0b instanceof DirectThreadKey)) {
                    C2DS A00 = C2JD.A00(anonymousClass983.A10);
                    DirectThreadKey A012 = JRE.A01(anonymousClass983.A0b);
                    C2DU c2du = (C2DU) A00;
                    synchronized (c2du) {
                        C14360o3.A0B(A012, 0);
                        C4GV A0P = c2du.A0P(A012);
                        if (A0P != null) {
                            synchronized (A0P) {
                                A0P.A0P();
                            }
                            C2DU.A0F(c2du, A0P);
                        }
                    }
                }
            }
            DirectStickerSuggestionsController directStickerSuggestionsController = this.A0K;
            if (directStickerSuggestionsController != null && !DirectStickerSuggestionsController.A02(directStickerSuggestionsController)) {
                if (AnonymousClass194.A07(directStickerSuggestionsController.A07)) {
                    AnonymousClass194.A05(null, directStickerSuggestionsController.A07);
                    directStickerSuggestionsController.A07 = AnonymousClass194.A02(C12L.A00.AOT(891758784, 3));
                }
                L7T l7t = directStickerSuggestionsController.A02;
                if (l7t != null) {
                    l7t.A00();
                }
            }
        }
    }

    public final void A1E() {
        A0i(this, 8);
        if (!this.A18) {
            AbstractC13880nE.A0O(this.A07);
        }
        A0Y(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e0, code lost:
    
        if (r7 == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
    
        if (r1.A00() == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A1F() {
        /*
            r26 = this;
            r0 = r26
            boolean r1 = r0.A0z
            if (r1 == 0) goto L84
            X.L8B r1 = r0.A0g
            if (r1 == 0) goto L11
            boolean r1 = r1.A00()
            r11 = 1
            if (r1 != 0) goto L12
        L11:
            r11 = 0
        L12:
            boolean r9 = A10(r0)
            X.7Fm r1 = r0.A0b
            X.7Fy r1 = r1.A0Y
            java.lang.String r1 = r1.A00
            java.lang.String r1 = r1.trim()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r10 = r1 ^ 1
            X.7H0 r3 = r0.A0e
            if (r3 == 0) goto L84
            X.7VF r13 = r0.A0Z
            X.442 r1 = A05(r0)
            if (r1 == 0) goto Le4
            X.2EY r14 = r1.A0F
        L34:
            X.7Fm r1 = r0.A0b
            boolean r19 = r1.A06()
            X.7Fm r1 = r0.A0b
            X.7Fy r1 = r1.A0Y
            java.lang.String r1 = r1.A00
            java.lang.String r2 = r1.trim()
            r1 = 0
            X.C14360o3.A0B(r13, r1)
            r1 = 6
            X.C14360o3.A0B(r2, r1)
            java.util.List r4 = r3.A0H
            boolean r1 = r4 instanceof java.util.Collection
            if (r1 == 0) goto L87
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L87
        L58:
            r16 = 1
        L5a:
            X.7H2 r1 = r3.A0B
            r17 = r11
            r18 = r10
            r14 = r1
            r15 = r2
            r14.Cp3(r15, r16, r17, r18, r19)
            X.7H0 r5 = r0.A0e
            X.7VF r6 = r0.A0Z
            X.442 r1 = A05(r0)
            if (r1 == 0) goto L85
            X.2EY r7 = r1.A0F
        L71:
            X.7Fm r1 = r0.A0b
            boolean r12 = r1.A06()
            X.7Fm r0 = r0.A0b
            X.7Fy r0 = r0.A0Y
            java.lang.String r0 = r0.A00
            java.lang.String r8 = r0.trim()
            r5.A00(r6, r7, r8, r9, r10, r11, r12)
        L84:
            return
        L85:
            r7 = 0
            goto L71
        L87:
            java.util.Iterator r8 = r4.iterator()
            r7 = 0
        L8c:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto Lde
            java.lang.Object r12 = r8.next()
            X.7H2 r12 = (X.C7H2) r12
            X.3oG r15 = r3.A0G
            X.0sZ r1 = r3.A0K
            java.lang.Object r6 = r1.invoke()
            X.2EE r6 = (X.C2EE) r6
            r18 = 0
            if (r6 == 0) goto Lb8
            X.7DG r5 = X.C7DF.A00
            com.instagram.common.session.UserSession r4 = r3.A02
            boolean r1 = r5.A02(r4, r6)
            if (r1 != 0) goto Lb6
            boolean r1 = r5.A03(r4, r6)
            if (r1 == 0) goto Lb8
        Lb6:
            r18 = 1
        Lb8:
            X.0sZ r1 = r3.A0I
            r17 = r9
            r16 = r1
            boolean r22 = r12.A03(r13, r14, r15, r16, r17, r18)
            r20 = r12
            r21 = r2
            r23 = r11
            r24 = r10
            r25 = r19
            boolean r1 = r20.Cp3(r21, r22, r23, r24, r25)
            if (r1 == 0) goto L8c
            int r7 = r7 + 1
            if (r7 >= 0) goto L8c
            X.AbstractC16960so.A1T()
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        Lde:
            r16 = 0
            if (r7 != 0) goto L5a
            goto L58
        Le4:
            r14 = 0
            goto L34
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C159737El.A1F():void");
    }

    public final void A1G() {
        ComposerAutoCompleteTextView composerAutoCompleteTextView = this.A0b.A0S;
        composerAutoCompleteTextView.requestFocus();
        if (composerAutoCompleteTextView.isLaidOut()) {
            AbstractC13880nE.A0R(composerAutoCompleteTextView);
        } else {
            AbstractC13880nE.A0S(composerAutoCompleteTextView);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a2, code lost:
    
        if (r1 != null) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A1H() {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C159737El.A1H():void");
    }

    public final void A1I(float f) {
        if (this.A07.getTranslationY() != f) {
            if (Build.VERSION.SDK_INT < 30) {
                AbstractC125325le A01 = AbstractC125325le.A01(this.A07, 0);
                A01.A0G();
                AbstractC125325le A0F = A01.A0F(true);
                A0F.A0K(f);
                A0F.A0H();
                L8B l8b = this.A0g;
                if (l8b != null && l8b.A00()) {
                    A03(this).setTranslationY((-this.A07.getHeight()) + f + this.A1R.getResources().getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material));
                }
                C159547Dp c159547Dp = this.A2N;
                if (c159547Dp != null) {
                    c159547Dp.A05.setTranslationY(f);
                }
            }
            C7FW c7fw = this.A0O;
            if (c7fw != null) {
                AnonymousClass983 anonymousClass983 = c7fw.A01;
                KB3 kb3 = anonymousClass983.A0L;
                if (kb3 != null && kb3.isVisible()) {
                    C48259LXi c48259LXi = kb3.A02;
                    if (!c48259LXi.A0G) {
                        float f2 = anonymousClass983.A00;
                        float f3 = f;
                        c48259LXi.A00 = f;
                        boolean z = c48259LXi.A0Z;
                        if (z) {
                            c48259LXi.A00 = 0.0f;
                        } else {
                            c48259LXi.A0B.getClass();
                            AbstractC125325le A00 = AbstractC125325le.A00(c48259LXi.A0B);
                            A00.A0G();
                            AbstractC125325le A0F2 = A00.A0F(true);
                            A0F2.A0K(f);
                            A0F2.A0H();
                        }
                        float f4 = f - f2;
                        PopupWindow popupWindow = c48259LXi.A0C;
                        if (popupWindow != null && popupWindow.getContentView() != null) {
                            int i = (int) (c48259LXi.A02 + f4);
                            c48259LXi.A02 = i;
                            if (z || f == 0.0f) {
                                popupWindow.update(c48259LXi.A01, i, -1, -1);
                            }
                        }
                        C47988LJq c47988LJq = c48259LXi.A0F;
                        if (c47988LJq != null) {
                            FrameLayout frameLayout = c48259LXi.A0A;
                            PopupWindow popupWindow2 = c48259LXi.A0C;
                            if (z && popupWindow2 != null && popupWindow2.getContentView() != null && frameLayout != null) {
                                frameLayout.getGlobalVisibleRect(new Rect());
                                int[] iArr = new int[2];
                                popupWindow2.getContentView().getLocationOnScreen(iArr);
                                float f5 = r10.bottom + f4;
                                float f6 = iArr[1];
                                if (f5 > f6) {
                                    f3 = f + (f6 - (f5 + frameLayout.getResources().getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material)));
                                }
                            }
                            if (c47988LJq.A0D) {
                                FrameLayout frameLayout2 = c47988LJq.A0N;
                                float y = (frameLayout2.getY() + f3) - f2;
                                if (z) {
                                    frameLayout2.setY(y);
                                } else if (f3 == 0.0f) {
                                    AbstractC125325le A002 = AbstractC125325le.A00(frameLayout2);
                                    C14360o3.A07(A002);
                                    if (A002.A0W()) {
                                        frameLayout2.setAlpha(1.0f);
                                        frameLayout2.setScaleX(1.0f);
                                        frameLayout2.setScaleY(1.0f);
                                    }
                                    AbstractC125325le A003 = AbstractC125325le.A00(frameLayout2);
                                    A003.A0G();
                                    AbstractC125325le A0F3 = A003.A0F(true);
                                    A0F3.A0K(y);
                                    A0F3.A0H();
                                }
                            }
                        }
                    }
                }
                c7fw.A00.A0R(f);
                anonymousClass983.A00 = f;
            }
        }
    }

    public final /* synthetic */ void A1J(final int i) {
        C7G2 c7g2;
        C8QJ c8qj;
        C47557KzS c47557KzS;
        int i2;
        C160007Fm c160007Fm;
        Drawable background;
        C160007Fm c160007Fm2;
        InterfaceC09390do interfaceC09390do;
        int intValue;
        View view;
        View findViewById;
        boolean z;
        boolean z2 = this.A15;
        boolean z3 = false;
        if (i > 0) {
            z3 = true;
        }
        this.A15 = z3;
        this.A01 = i;
        C1576575z c1576575z = this.A0R;
        if (c1576575z != null && c1576575z.A01 == null && A15(this)) {
            this.A0R.A01 = Integer.valueOf(this.A01);
        }
        C160637Hx c160637Hx = this.A0o;
        if (c160637Hx != null && c160637Hx.A03 != (z = this.A15)) {
            c160637Hx.A03 = z;
            c160637Hx.A01();
        }
        C7I0 c7i0 = (C7I0) this.A0d.A0H.getValue();
        this.A0Q = c7i0;
        boolean z4 = this.A15;
        if (z2 != z4) {
            C14360o3.A0B(this.A1Z, 0);
            Integer num = c7i0.A00;
            if (num != null && (((intValue = num.intValue()) == 11 || intValue == 20) && (findViewById = (view = c7i0.A04).findViewById(R.id.nux_banner)) != null)) {
                int i3 = 0;
                if (findViewById.getVisibility() == 0) {
                    View findViewById2 = view.findViewById(R.id.pills_container);
                    C14360o3.A0A(findViewById2);
                    if (!(!z4)) {
                        i3 = 8;
                    }
                    findViewById2.setVisibility(i3);
                }
            }
            if (z2) {
                if (this.A0S != null && A0s()) {
                    ViewGroup viewGroup = this.A0S.A00;
                    if (viewGroup != null) {
                        viewGroup.setVisibility(0);
                    }
                    C7IK c7ik = this.A0U;
                    if (c7ik != null) {
                        A0h(this, c7ik.A02);
                    }
                }
                DirectStickerSuggestionsController directStickerSuggestionsController = this.A0K;
                if (directStickerSuggestionsController != null) {
                    directStickerSuggestionsController.A09 = false;
                }
            } else {
                IgTextView igTextView = this.A0G;
                if (igTextView != null && igTextView.getVisibility() == 0) {
                    this.A0G.setVisibility(8);
                }
                if (this.A0S != null && A0s()) {
                    ViewGroup viewGroup2 = this.A0S.A00;
                    if (viewGroup2 != null) {
                        viewGroup2.setVisibility(8);
                    }
                    A0h(this, 0);
                }
                DirectStickerSuggestionsController directStickerSuggestionsController2 = this.A0K;
                if (directStickerSuggestionsController2 != null) {
                    directStickerSuggestionsController2.A09 = true;
                }
                A0k(this, 2L);
            }
        }
        if (A1X()) {
            A0n(this, false);
        }
        C7F8 c7f8 = this.A1m;
        int A00 = (c7f8.A00() - i) - this.A07.getHeight();
        if (this.A0z && (c160007Fm2 = this.A0b) != null) {
            C7G7 c7g7 = c160007Fm2.A0X;
            Drawable drawable = null;
            if (C7G5.A00.A01(c7g7.A04)) {
                interfaceC09390do = c7g7.A08;
            } else {
                interfaceC09390do = c7g7.A07;
            }
            View view2 = (View) interfaceC09390do.getValue();
            if (view2 != null) {
                drawable = view2.getBackground();
            }
            C7MU.A00(drawable, A00);
        }
        ImageView imageView = this.A08;
        if (imageView != null && imageView.getBackground() != null) {
            C7MU.A00(imageView.getBackground(), A00);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            C7MU.A00(this.A0b.A0R.getTextCursorDrawable(), A00);
        }
        if (((Boolean) this.A0Z.A0G.getValue()).booleanValue() && (c160007Fm = this.A0b) != null) {
            InterfaceC09390do interfaceC09390do2 = c160007Fm.A0X.A09;
            if (((InterfaceC56392iX) interfaceC09390do2.getValue()).CWW() && (background = ((InterfaceC56392iX) interfaceC09390do2.getValue()).getView().getBackground()) != null) {
                C7MU.A00(background, A00);
            }
        }
        if (this.A16) {
            A0j(this, A00);
        }
        C7GN c7gn = this.A0u;
        c7gn.A00 = i;
        View view3 = c7gn.A08;
        if (view3 != null) {
            C7MU.A00(view3.getBackground(), A00);
        }
        View view4 = this.A05;
        C160607Hu c160607Hu = this.A0t;
        if (c160607Hu != null && view4 != null) {
            int A002 = (c7f8.A00() - view4.getHeight()) - i;
            int A01 = ((int) C18U.A01(C06090Tz.A05, c160607Hu.A0M, 36595509363804314L)) / 100;
            if (C57992lC.A03()) {
                i2 = C57992lC.A01();
            } else {
                i2 = 0;
            }
            c160607Hu.A01 = (A002 - i2) * A01;
            if (c160607Hu.A02 != null) {
                C160607Hu.A00(c160607Hu);
            }
            if (!z2 && this.A15) {
                A1B();
            }
        }
        if (this.A0L != null && view4 != null && !z2 && this.A15) {
            A1A();
        }
        L8B l8b = this.A0g;
        if (l8b != null && z2 && !this.A15 && l8b.A00() && (c47557KzS = l8b.A01) != null) {
            C1575275m c1575275m = c47557KzS.A01;
            c1575275m.A02.add(LC2.A01(c47557KzS.A00, (RecyclerView) c1575275m.A03.getValue(), false));
        }
        if (!this.A15 && z2) {
            this.A1i.A08(false);
        }
        A1I(-i);
        this.A1T.post(new Runnable() { // from class: X.7MV
            @Override // java.lang.Runnable
            public final void run() {
                C159737El.this.A1K(i);
            }
        });
        C160007Fm c160007Fm3 = this.A0b;
        if (c160007Fm3 != null && (c8qj = (c7g2 = c160007Fm3.A0U).A01) != null && c8qj.isShowing()) {
            C7G2.A01(c7g2, true);
            C8QJ c8qj2 = c7g2.A01;
            if (c8qj2 != null) {
                c8qj2.dismiss();
            }
        }
    }

    public final /* synthetic */ void A1K(int i) {
        int i2;
        ViewGroup viewGroup = this.A1V;
        int measuredHeight = viewGroup.getMeasuredHeight() - this.A07.getMeasuredHeight();
        View view = this.A03;
        if (view != null) {
            i2 = view.getMeasuredHeight();
        } else {
            i2 = 0;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            FrameLayout frameLayout = this.A07;
            Rect rect = this.A1S;
            frameLayout.getDrawingRect(rect);
            viewGroup.offsetDescendantRectToMyCoords(this.A07, rect);
            int i3 = rect.top - i2;
            C160007Fm c160007Fm = this.A0b;
            int max = Math.max(-1, i3);
            c160007Fm.A02 = max;
            C159547Dp c159547Dp = c160007Fm.A0A;
            if (c159547Dp != null) {
                c159547Dp.A00(max);
                return;
            }
            return;
        }
        int i4 = (measuredHeight - i) - i2;
        if (i4 <= 0) {
            return;
        }
        C160007Fm c160007Fm2 = this.A0b;
        c160007Fm2.A02 = i4;
        C159547Dp c159547Dp2 = c160007Fm2.A0A;
        if (c159547Dp2 == null) {
            return;
        }
        c159547Dp2.A00(i4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b9, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r15, 36319368740281603L) == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A1L(android.app.Activity r22, com.google.common.collect.ImmutableList r23, X.C2EC r24, java.lang.Boolean r25, java.lang.Boolean r26, java.lang.String r27, java.lang.String r28) {
        /*
            r21 = this;
            r7 = r24
            if (r24 == 0) goto L29
            r3 = r21
            com.instagram.common.session.UserSession r15 = r3.A1Z
            r2 = 0
            X.C14360o3.A0B(r15, r2)
            X.0Tz r4 = X.C06090Tz.A06
            r0 = 36316418093879672(0x81059700001178, double:3.029987264823017E-306)
            boolean r0 = X.C18U.A06(r4, r15, r0)
            if (r0 == 0) goto L2a
            X.0Tz r4 = X.C06090Tz.A05
            r0 = 36316418093945209(0x81059700011179, double:3.029987264864463E-306)
            boolean r0 = X.C18U.A06(r4, r15, r0)
            if (r0 == 0) goto L2a
            r3.A1H()
        L29:
            return
        L2a:
            r5 = r23
            r8 = r26
            r9 = r27
            r10 = r28
            r6 = r15
            X.7Lz r0 = X.AbstractC161637Ly.A00(r5, r6, r7, r8, r9, r10)
            java.util.List r9 = r0.A05
            X.9BW r6 = r0.A00
            boolean r10 = r0.A06
            X.FIk r4 = r0.A01
            X.3nh r5 = r0.A02
            java.lang.Boolean r1 = r0.A04
            java.lang.Boolean r0 = r0.A03
            boolean r8 = X.AbstractC83893oY.A00(r9)
            if (r8 == 0) goto L57
            if (r10 != 0) goto L57
            if (r4 != 0) goto L57
            X.FcE r0 = r3.A0S
            if (r0 == 0) goto L29
            r0.A01()
            return
        L57:
            X.FcE r8 = r3.A0S
            if (r8 != 0) goto L94
            java.lang.String r17 = r7.C7I()
            android.widget.FrameLayout r13 = r3.A07
            android.content.Context r8 = r13.getContext()
            android.view.LayoutInflater r12 = android.view.LayoutInflater.from(r8)
            if (r17 != 0) goto L6d
            java.lang.String r17 = ""
        L6d:
            com.instagram.user.model.User r16 = X.C4GQ.A05(r7)
            X.0iw r14 = r3.A1X
            X.3kb r7 = (X.C81663kb) r7
            X.3iy r7 = r7.A01
            boolean r8 = r7.A2U
            X.GRt r7 = new X.GRt
            r7.<init>()
            X.FcE r10 = new X.FcE
            r11 = r22
            r18 = r7
            r19 = r8
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r3.A0S = r10
            X.7IK r8 = r3.A0U
            boolean r7 = r3.A0s()
            r10.A03(r8, r7)
        L94:
            boolean r19 = r3.A0s()
            X.FcE r7 = r3.A0S
            boolean r16 = r25.booleanValue()
            boolean r17 = r1.booleanValue()
            boolean r18 = r0.booleanValue()
            boolean r0 = A0v(r3)
            if (r0 == 0) goto Lbb
            X.0Tz r8 = X.C06090Tz.A05
            r0 = 36319368740281603(0x810846003b1d03, double:3.031853265488898E-306)
            boolean r0 = X.C18U.A06(r8, r15, r0)
            r20 = 1
            if (r0 != 0) goto Lbd
        Lbb:
            r20 = 0
        Lbd:
            r13 = r4
            r14 = r5
            r15 = r9
            r11 = r7
            r12 = r6
            r11.A02(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            if (r19 == 0) goto Ld0
            X.7IK r0 = r3.A0U
            if (r0 == 0) goto Ld0
            int r0 = r0.A02
            A0h(r3, r0)
        Ld0:
            r0 = 1
            A0p(r3, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C159737El.A1L(android.app.Activity, com.google.common.collect.ImmutableList, X.2EC, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
    
        if (X.C18U.A06(r2, r3, 36324660136522069L) == false) goto L14;
     */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.7Hh, X.7Hi] */
    /* JADX WARN: Type inference failed for: r8v27, types: [X.7Hh, X.7Hi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A1M(androidx.fragment.app.FragmentActivity r39) {
        /*
            Method dump skipped, instructions count: 774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C159737El.A1M(androidx.fragment.app.FragmentActivity):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x0273, code lost:
    
        if (r1 != null) goto L65;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A1N(androidx.fragment.app.FragmentActivity r31, com.instagram.model.direct.messageid.MessageIdentifier r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C159737El.A1N(androidx.fragment.app.FragmentActivity, com.instagram.model.direct.messageid.MessageIdentifier, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x035f, code lost:
    
        if (X.C18U.A06(r4, r11, 36320476838306333L) == false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01d0, code lost:
    
        if (r2 != null) goto L92;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A1P(X.C7IK r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 1010
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C159737El.A1P(X.7IK, boolean):void");
    }

    public final void A1Q(EnumC160197Gf enumC160197Gf) {
        AbstractC160207Gg A0D;
        C7E0 c7e0 = this.A1w;
        if ((c7e0 instanceof C159637Dz) && (A0D = ((C159637Dz) c7e0).A0D(enumC160197Gf)) != null) {
            this.A0b.A04(A0D);
        }
    }

    public final void A1R(EnumC160197Gf enumC160197Gf) {
        Editable text = this.A0b.A0S.getText();
        for (A7L a7l : (A7L[]) text.getSpans(0, text.length(), A7L.class)) {
            Integer A03 = a7l.A00.A03();
            if (A03 != null && A03.intValue() == enumC160197Gf.A00) {
                text.replace(text.getSpanStart(a7l), text.getSpanEnd(a7l), "");
            }
        }
    }

    public final void A1S(FRT frt, InterfaceC31002Dk1 interfaceC31002Dk1) {
        Context context = this.A1R;
        UserSession userSession = this.A1Z;
        IgMetaSessionImpl A01 = AbstractC28057CYl.A01(userSession);
        CVS cvs = new CVS(frt, C18U.A01(C06090Tz.A05, userSession, 36612349930510720L));
        C14360o3.A0B(context, 0);
        C14360o3.A0B(interfaceC31002Dk1, 3);
        C30181DRm c30181DRm = new C30181DRm(interfaceC31002Dk1, 5);
        CL0 cl0 = C27329C4k.A06;
        CVR cvr = new CVR(A01, cvs);
        synchronized (cl0) {
            if (!C27329C4k.A05) {
                new C27329C4k(context, cvr, c30181DRm).A0F();
                C27329C4k.A05 = true;
            }
        }
    }

    public final void A1T(String str) {
        if ((this.A1w instanceof C159637Dz) && !AbstractC27611CGh.A00(str)) {
            ComposerAutoCompleteTextView composerAutoCompleteTextView = this.A0b.A0S;
            composerAutoCompleteTextView.setSelection(0);
            composerAutoCompleteTextView.A04(str);
            composerAutoCompleteTextView.setSelection(composerAutoCompleteTextView.length());
        }
    }

    public final void A1U(List list) {
        C23845Agu c23845Agu;
        C7DZ c7dz;
        String str;
        if (list == null) {
            list = new ArrayList();
        }
        UserSession userSession = this.A1Z;
        if (C18U.A06(C06090Tz.A06, userSession, 36325669454427392L)) {
            C7FR c7fr = this.A1d;
            InterfaceC83713oG interfaceC83713oG = this.A1z;
            EnumC72433Xdd A00 = AbstractC34774FTx.A00((C2EC) this.A22.get());
            Long valueOf = Long.valueOf(list.size());
            List A0L = A0L(this);
            C18920wW c18920wW = c7fr.A00;
            InterfaceC02590Ai A002 = c18920wW.A00(c18920wW.A00, "direct_composer_tap");
            if (A002.isSampled()) {
                A002.AAP("target", "media_editor_add_message");
                A002.A8R(A00, "thread_type");
                A002.A9K("num_images", valueOf);
                A002.AAk("recipient_ids", A0L);
                Boolean bool = null;
                if (interfaceC83713oG != null) {
                    str = AbstractC92784Dr.A02(interfaceC83713oG);
                } else {
                    str = null;
                }
                A002.AAP("open_thread_id", str);
                if (interfaceC83713oG != null) {
                    bool = Boolean.valueOf(AbstractC140946Yw.A07(interfaceC83713oG));
                }
                A002.A7v("is_e2ee", bool);
                A002.Cht();
            }
        }
        C160007Fm c160007Fm = this.A0b;
        if (c160007Fm.A06 != null && (c7dz = c160007Fm.A09) != null) {
            c7dz.A00(list);
            c160007Fm.A06.notifyDataSetChanged();
        }
        DirectThreadKey A0A = A0A(this);
        if (AbstractC46860Knt.A00(userSession, A0A) && A0A != null) {
            for (C22874A6u c22874A6u : list) {
                C98L c98l = this.A0V;
                C14360o3.A0B(c22874A6u, 0);
                InterfaceC25182BCf interfaceC25182BCf = c22874A6u.A01;
                if ((interfaceC25182BCf instanceof C23845Agu) && (c23845Agu = (C23845Agu) interfaceC25182BCf) != null) {
                    c23845Agu.A01(new C50363MLp(35, A0A, c98l));
                }
            }
        }
    }

    public final boolean A1V() {
        C2EE c2ee = this.A0W;
        if (c2ee != null && c2ee.CVQ()) {
            return true;
        }
        return false;
    }

    public final boolean A1W() {
        C2EC c2ec = (C2EC) this.A22.get();
        if ((c2ec == null || AbstractC46764KmL.A00(this.A1Z, c2ec)) && ((InterfaceC160517Hl) this.A23.get()).Cfl(this.A1Z, A0A(this))) {
            return true;
        }
        return false;
    }

    public final boolean A1X() {
        FrameLayout frameLayout = this.A07;
        if (frameLayout != null && frameLayout.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    private int A02(Boolean bool) {
        if (bool.booleanValue()) {
            return Long.valueOf(C18U.A01(C06090Tz.A05, this.A1Z, 36597905958571078L)).intValue();
        }
        if (A12(this)) {
            return 10;
        }
        if (A0r() && A0v(this)) {
            UserSession userSession = this.A1Z;
            C14360o3.A0B(userSession, 0);
            return (int) C18U.A01(C06090Tz.A05, userSession, 36608677733472017L);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006d, code lost:
    
        if (r2.CWk(r1) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x006f, code lost:
    
        r17 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0071, code lost:
    
        r4.A00(r18, r6, r7, r20, r9, r10, r11, r21, r13, r14, r15, r16, r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x007a, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0065, code lost:
    
        if (r2 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x003c, code lost:
    
        if (r2.CWO() == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0061, code lost:
    
        if (r2.Ay8() == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0067, code lost:
    
        r17 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String A0D(X.AnonymousClass442 r18, X.C159737El r19, java.lang.Integer r20, int r21) {
        /*
            long r0 = X.C0HN.A00()
            java.lang.String r11 = java.lang.String.valueOf(r0)
            r3 = r19
            X.0cm r0 = r3.A22
            java.lang.Object r2 = r0.get()
            X.2EC r2 = (X.C2EC) r2
            com.instagram.common.session.UserSession r1 = r3.A1Z
            r0 = 0
            X.C14360o3.A0B(r1, r0)
            r0 = 40
            X.MHJ r4 = new X.MHJ
            r4.<init>(r1, r0)
            java.lang.Class<X.L7I> r0 = X.L7I.class
            java.lang.Object r4 = r1.A01(r0, r4)
            X.L7I r4 = (X.L7I) r4
            X.7Vo r0 = r3.A1i
            com.instagram.model.direct.DirectShareTarget r6 = r0.A00()
            int r0 = A01(r3)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            if (r2 == 0) goto L3e
            boolean r0 = r2.CWO()
            r13 = 1
            if (r0 != 0) goto L3f
        L3e:
            r13 = 0
        L3f:
            boolean r14 = r3.A29
            X.0cm r0 = r3.A2P
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r15 = r0.booleanValue()
            X.0cm r0 = r3.A24
            java.lang.Object r9 = r0.get()
            java.lang.Long r9 = (java.lang.Long) r9
            java.lang.Long r10 = r3.A0B()
            if (r2 == 0) goto L63
            boolean r0 = r2.Ay8()
            r16 = 1
            if (r0 != 0) goto L67
        L63:
            r16 = 0
            if (r2 == 0) goto L6f
        L67:
            boolean r0 = r2.CWk(r1)
            r17 = 1
            if (r0 != 0) goto L71
        L6f:
            r17 = 0
        L71:
            r5 = r18
            r8 = r20
            r12 = r21
            r4.A00(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C159737El.A0D(X.442, X.7El, java.lang.Integer, int):java.lang.String");
    }

    public static String A0H(C159737El c159737El) {
        String str;
        DirectThreadKey A0A = A0A(c159737El);
        if (A0A != null && (str = A0A.A00) != null) {
            return str;
        }
        return "";
    }

    public static List A0L(C159737El c159737El) {
        List list;
        DirectThreadKey A0A = A0A(c159737El);
        if (A0A != null && (list = A0A.A02) != null) {
            return list;
        }
        return new ArrayList();
    }

    public static void A0O(Editable editable, final C159737El c159737El) {
        A0Z(c159737El);
        if (editable.length() >= 4) {
            final String obj = editable.toString();
            Context context = c159737El.A1R;
            UserSession userSession = c159737El.A1Z;
            C47954LGp A00 = AbstractC46924Kp5.A00(context, userSession);
            InterfaceC83713oG interfaceC83713oG = c159737El.A1z;
            C14360o3.A0B(interfaceC83713oG, 0);
            if ((((interfaceC83713oG instanceof InterfaceC2056098k) && C18U.A06(C06090Tz.A05, userSession, 2342156760134125801L)) || A11(c159737El) || (!A0x(c159737El) && C18U.A06(C06090Tz.A05, userSession, 36324531287109857L))) && A00.A02(obj)) {
                A00.A01(obj);
                if (!A10(c159737El)) {
                    final C47954LGp A002 = AbstractC46924Kp5.A00(context, userSession);
                    C44999Jvp A003 = A002.A00(obj);
                    if (A003 != null) {
                        byte[] bArr = A003.A09;
                        String str = A003.A07;
                        String str2 = A003.A06;
                        if (c159737El.A0a != null) {
                            C7IK c7ik = c159737El.A0U;
                            c7ik.getClass();
                            A0h(c159737El, c7ik.A02);
                            c159737El.A1B = true;
                            c159737El.A0a.A02(str, str2, bArr);
                            return;
                        }
                        return;
                    }
                    c159737El.A1Y.A02(A002.A01.A0S(C0eB.A00).A0K(new C6D2() { // from class: X.LaW
                        @Override // X.C6D2
                        public final Object apply(Object obj2) {
                            return C46h.A00(C47954LGp.this.A00(obj));
                        }
                    }).A0M(new C6J5() { // from class: X.Lcg
                        @Override // X.C6J5
                        public final boolean test(Object obj2) {
                            if (((C46h) obj2) instanceof C4JL) {
                                return true;
                            }
                            return false;
                        }
                    }).A0G().A0O(AbstractC142856cl.A01), new InterfaceC42241xE() { // from class: X.LxV
                        @Override // X.InterfaceC42241xE
                        public final void accept(Object obj2) {
                            C159737El c159737El2 = C159737El.this;
                            C46h c46h = (C46h) obj2;
                            if (c46h instanceof C4JL) {
                                C44999Jvp c44999Jvp = (C44999Jvp) c46h.A03();
                                byte[] bArr2 = c44999Jvp.A09;
                                String str3 = c44999Jvp.A07;
                                String str4 = c44999Jvp.A06;
                                if (c159737El2.A0a != null) {
                                    C7IK c7ik2 = c159737El2.A0U;
                                    c7ik2.getClass();
                                    C159737El.A0h(c159737El2, c7ik2.A02);
                                    c159737El2.A1B = true;
                                    c159737El2.A0a.A02(str3, str4, bArr2);
                                }
                            }
                        }
                    });
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        if (r4.CWO() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        if (r4.Ay8() == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
    
        if (r4.CWk(r7) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0R(X.AnonymousClass442 r8, X.C159737El r9, com.meta.foa.performancelogging.lss.LocalSendSpeedMessageTypes r10, java.lang.Integer r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C159737El.A0R(X.442, X.7El, com.meta.foa.performancelogging.lss.LocalSendSpeedMessageTypes, java.lang.Integer, java.lang.String):void");
    }

    public static void A0c(C159737El c159737El) {
        c159737El.A1F();
        A0h(c159737El, c159737El.A0U.A02);
        c159737El.A0b.A0R.requestFocus();
        c159737El.A1G();
        A0p(c159737El, true, true);
        A0W(c159737El);
        A0Z(c159737El);
        A0X(c159737El);
        c159737El.A1B = true;
    }

    public static void A0k(C159737El c159737El, long j) {
        InterfaceC56392iX interfaceC56392iX;
        View view;
        if (A0z(c159737El)) {
            UserSession userSession = c159737El.A1Z;
            if (!AbstractC23021Ah.A00(userSession).A01.getBoolean("meta_ai_discovery_nux_seen", false) && j == C18U.A01(C06090Tz.A05, userSession, 36607603991713397L) && (interfaceC56392iX = (InterfaceC56392iX) c159737El.A0b.A0P.A06.getValue()) != null && (view = interfaceC56392iX.getView()) != null) {
                int i = 2131958894;
                Activity activity = (Activity) AbstractC13320mI.A00(c159737El.A1R, FragmentActivity.class);
                if (activity != null && !activity.isFinishing()) {
                    c159737El.A0J.A04();
                    view.postDelayed(new GQG(activity, view, new G9K(c159737El), i), 500L);
                }
            }
        }
    }

    private boolean A0r() {
        UserSession userSession;
        C06090Tz c06090Tz;
        long j;
        if (A0y(this)) {
            userSession = this.A1Z;
            c06090Tz = C06090Tz.A05;
            j = 36325669453772022L;
        } else if (A04(this) == IGAIAgentType.A05) {
            userSession = this.A1Z;
            c06090Tz = C06090Tz.A05;
            j = 36325669453706485L;
        } else if (A04(this) == IGAIAgentType.A08) {
            userSession = this.A1Z;
            c06090Tz = C06090Tz.A05;
            j = 36325669454034170L;
        } else if (A04(this) == null) {
            userSession = this.A1Z;
            c06090Tz = C06090Tz.A05;
            j = 36325669453575411L;
        } else {
            return false;
        }
        return C18U.A06(c06090Tz, userSession, j);
    }

    private boolean A0s() {
        if (A0v(this)) {
            if (C18U.A06(C06090Tz.A05, this.A1Z, 36319368739757308L)) {
                return true;
            }
        }
        return false;
    }

    private boolean A0u() {
        UserSession userSession;
        C06090Tz c06090Tz;
        long j;
        if (A0y(this)) {
            userSession = this.A1Z;
            c06090Tz = C06090Tz.A05;
            j = 36325669453837559L;
        } else if (A04(this) == IGAIAgentType.A08) {
            userSession = this.A1Z;
            c06090Tz = C06090Tz.A05;
            j = 36325669453968633L;
        } else {
            return false;
        }
        return C18U.A06(c06090Tz, userSession, j);
    }

    public static boolean A0v(C159737El c159737El) {
        return C4GR.A07(Integer.valueOf(A01(c159737El)));
    }

    public static boolean A0w(C159737El c159737El) {
        if (A0A(c159737El) == null || !AbstractC159387Cy.A05(c159737El.A1Z, A0A(c159737El), C05F.A00, false).A01()) {
            return false;
        }
        return true;
    }

    public static boolean A0z(C159737El c159737El) {
        if (A0y(c159737El)) {
            UserSession userSession = c159737El.A1Z;
            C14360o3.A0B(userSession, 0);
            if (C18U.A06(C06090Tz.A05, userSession, 36324561351880942L)) {
                return true;
            }
        }
        return false;
    }

    public static boolean A11(C159737El c159737El) {
        boolean A0x = A0x(c159737El);
        UserSession userSession = c159737El.A1Z;
        boolean A08 = AbstractC159387Cy.A08(userSession, A0A(c159737El), C05F.A0C);
        if (A0x) {
            if (A08 && C18U.A06(C06090Tz.A05, userSession, 2342165792449571367L)) {
                return true;
            }
            return false;
        }
        return A08;
    }

    public final void A1D() {
        if (A1X() && !this.A1Q) {
            this.A1Q = true;
            this.A0b.A0R.setOnFocusChangeListener(this.A1U);
            TextWatcher textWatcher = this.A02;
            if (textWatcher != null) {
                this.A0b.A0R.addTextChangedListener(textWatcher);
            }
            this.A07.addOnLayoutChangeListener(this.A2B);
            this.A0u.A0E = C05F.A00;
            C69556VrL c69556VrL = this.A0p;
            if (c69556VrL != null) {
                c69556VrL.A00();
            }
            DirectStickerSuggestionsController directStickerSuggestionsController = this.A0K;
            if (directStickerSuggestionsController != null) {
                directStickerSuggestionsController.A04();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0167, code lost:
    
        if (X.AbstractC31270Dos.A00(r11) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0149, code lost:
    
        if (X.C17060sy.A01.A01(r11).A2I() == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x015b, code lost:
    
        if (X.C17060sy.A01.A01(r11).A2I() == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C159737El(android.content.Context r7, android.view.ViewGroup r8, X.C2d4 r9, X.InterfaceC11380iw r10, final com.instagram.common.session.UserSession r11, X.C3I9 r12, com.instagram.direct.fragment.permanentmedia.DirectAggregatedMediaViewerController r13, X.C7VZ r14, X.C163997Vo r15, X.C159727Ek r16, X.C7ZZ r17, X.C98L r18, X.C98N r19, X.C7VF r20, X.C7DZ r21, X.C159547Dp r22, X.C7E0 r23, X.InterfaceC164017Vq r24, X.C7DK r25, X.InterfaceC83713oG r26, X.InterfaceC159557Dq r27, java.lang.Boolean r28, java.lang.String r29, final X.InterfaceC08830cm r30, X.InterfaceC08830cm r31, X.InterfaceC08830cm r32, X.InterfaceC08830cm r33, X.InterfaceC08830cm r34, X.InterfaceC08830cm r35, boolean r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 529
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C159737El.<init>(android.content.Context, android.view.ViewGroup, X.2d4, X.0iw, com.instagram.common.session.UserSession, X.3I9, com.instagram.direct.fragment.permanentmedia.DirectAggregatedMediaViewerController, X.7VZ, X.7Vo, X.7Ek, X.7ZZ, X.98L, X.98N, X.7VF, X.7DZ, X.7Dp, X.7E0, X.7Vq, X.7DK, X.3oG, X.7Dq, java.lang.Boolean, java.lang.String, X.0cm, X.0cm, X.0cm, X.0cm, X.0cm, X.0cm, boolean, boolean):void");
    }
}
