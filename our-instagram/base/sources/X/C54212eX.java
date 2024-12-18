package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.google.common.collect.ImmutableMap;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.2eX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C54212eX {
    public static final Map A0V;
    public int A00;
    public long A01;
    public C58012lH A02;
    public C58012lH A03;
    public C58012lH A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public C54392et A08;
    public boolean A09;
    public final Context A0B;
    public final UserSession A0J;
    public final InterfaceC09390do A0O;
    public final InterfaceC09390do A0P;
    public final InterfaceC09390do A0Q;
    public final InterfaceC09390do A0R;
    public final InterfaceC09390do A0S;
    public final InterfaceC53872dR A0T;
    public final C54412ev A0U;
    public final Handler A0C = new Handler();
    public final List A0M = new ArrayList();
    public final C13400mQ A0K = new C13400mQ(new Handler(Looper.getMainLooper()), new InterfaceC13380mO() { // from class: X.2ef
        @Override // X.InterfaceC13380mO
        public final /* bridge */ /* synthetic */ void onDebouncedValue(Object obj) {
            C54212eX.A00(C54212eX.this);
        }
    }, 2000);
    public boolean A0A = true;
    public final InterfaceC41501vz A0F = new InterfaceC41501vz() { // from class: X.2eg
        @Override // X.InterfaceC41501vz
        public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
            int A03 = C0f9.A03(1876739445);
            int A032 = C0f9.A03(-1226148851);
            C14360o3.A0B(obj, 0);
            Map map = C54212eX.A0V;
            C0f9.A0A(-28524022, A032);
            C0f9.A0A(-1505068517, A03);
        }
    };
    public final InterfaceC41501vz A0E = new InterfaceC41501vz() { // from class: X.2eh
        @Override // X.InterfaceC41501vz
        public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
            int A03 = C0f9.A03(1958596461);
            C71883Kl c71883Kl = (C71883Kl) obj;
            int A032 = C0f9.A03(1648824326);
            C14360o3.A0B(c71883Kl, 0);
            C54212eX c54212eX = C54212eX.this;
            c54212eX.A00 = c71883Kl.A00;
            C54212eX.A01(c54212eX);
            C0f9.A0A(-552030520, A032);
            C0f9.A0A(-1900812901, A03);
        }
    };
    public final InterfaceC41501vz A0I = new InterfaceC41501vz() { // from class: X.2ei
        @Override // X.InterfaceC41501vz
        public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
            int A03 = C0f9.A03(1502921540);
            int A032 = C0f9.A03(-596252099);
            C54212eX.A01(C54212eX.this);
            C0f9.A0A(-100773519, A032);
            C0f9.A0A(2032377816, A03);
        }
    };
    public final InterfaceC41501vz A0H = new InterfaceC41501vz() { // from class: X.2ej
        @Override // X.InterfaceC41501vz
        public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
            int A03 = C0f9.A03(-1897419799);
            C71903Kn c71903Kn = (C71903Kn) obj;
            int A032 = C0f9.A03(1848032013);
            C14360o3.A0B(c71903Kn, 0);
            C54212eX c54212eX = C54212eX.this;
            Map map = C54212eX.A0V;
            c54212eX.A0K.A01(c71903Kn.A00);
            C0f9.A0A(-870508662, A032);
            C0f9.A0A(-863323048, A03);
        }
    };
    public final InterfaceC41501vz A0D = new InterfaceC41501vz() { // from class: X.2ek
        @Override // X.InterfaceC41501vz
        public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
            int A03 = C0f9.A03(-784159759);
            int A032 = C0f9.A03(-393823486);
            C54212eX.A00(C54212eX.this);
            C0f9.A0A(-327721362, A032);
            C0f9.A0A(1469254556, A03);
        }
    };
    public final InterfaceC41501vz A0G = new InterfaceC41501vz() { // from class: X.2el
        @Override // X.InterfaceC41501vz
        public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
            int A03 = C0f9.A03(-1360269112);
            int A032 = C0f9.A03(1559044442);
            C54212eX.A01(C54212eX.this);
            C0f9.A0A(-2103982894, A032);
            C0f9.A0A(1964160308, A03);
        }
    };
    public final C2KV A0L = new C2KV() { // from class: X.2em
        @Override // X.C2KV
        public final void Cz5(C4JH c4jh) {
            C54212eX.this.A07();
        }
    };
    public final java.util.Set A0N = new LinkedHashSet();

    static {
        ImmutableMap.Builder builder = new ImmutableMap.Builder(4);
        builder.put(Integer.valueOf(R.drawable.instagram_alert_filled_16), EnumC54222eY.A0D.toString());
        builder.put(Integer.valueOf(R.drawable.notification_comment_icon), "comments");
        builder.put(Integer.valueOf(R.drawable.notification_like_icon), "likes");
        builder.put(Integer.valueOf(R.drawable.notification_people_icon), EnumC54222eY.A0f.toString());
        builder.put(Integer.valueOf(R.drawable.notification_story_mention_icon), "story_mentions");
        builder.put(Integer.valueOf(R.drawable.notification_tag_icon), EnumC54222eY.A0a.toString());
        builder.put(Integer.valueOf(R.drawable.instagram_shopping_bag_filled_16), "shopping_notifications");
        ImmutableMap buildOrThrow = builder.buildOrThrow();
        C14360o3.A07(buildOrThrow);
        A0V = buildOrThrow;
    }

    public C54212eX(Context context, UserSession userSession, InterfaceC53872dR interfaceC53872dR) {
        C54392et c54392et;
        AbstractC54342eo A00;
        AbstractC54342eo A002;
        this.A0B = context;
        this.A0T = interfaceC53872dR;
        this.A0J = userSession;
        C54412ev c54412ev = null;
        if (userSession != null && (A002 = AbstractC54332en.A00(userSession)) != null) {
            c54392et = A002.A00();
        } else {
            c54392et = null;
        }
        this.A08 = c54392et;
        if (userSession != null && (A00 = AbstractC54332en.A00(userSession)) != null) {
            c54412ev = A00.A01();
        }
        this.A0U = c54412ev;
        this.A0S = AbstractC09440dt.A01(new C9EX(this, 21));
        this.A0O = AbstractC09440dt.A01(new C9EX(this, 19));
        this.A0R = AbstractC09440dt.A01(C54712fT.A00);
        this.A0Q = AbstractC09440dt.A01(new C9EX(this, 20));
        this.A0P = AbstractC09440dt.A01(C54722fU.A00);
    }

    public final void A06() {
        this.A06 = false;
        List list = this.A0M;
        if (!list.isEmpty()) {
            list.get(0);
            list.remove(0);
            this.A0C.postDelayed(new RunnableC36845GLs(this), 500L);
        }
    }

    public static final void A00(C54212eX c54212eX) {
        if (!c54212eX.A05) {
            c54212eX.A07 = true;
            return;
        }
        UserSession userSession = c54212eX.A0J;
        if (userSession != null) {
            if (C18U.A06(C06090Tz.A05, userSession, 36328057455590471L) && c54212eX.A0A) {
                c54212eX.A0A = false;
                return;
            }
            C1ON A00 = AbstractC71463Ik.A00(userSession, C16030qx.A02.A05(c54212eX.A0B));
            A00.A00 = new C54582fG(userSession);
            C1GJ.A03(A00);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A01(C54212eX c54212eX) {
        if (c54212eX.A03 != null) {
            c54212eX.A09 = AbstractC34240F8m.A00(c54212eX.A0J, c54212eX.A00);
            C58012lH c58012lH = c54212eX.A03;
            C14360o3.A0A(c58012lH);
            View view = c58012lH.A03;
            C14360o3.A0A(view);
            int i = 8;
            if (c54212eX.A09) {
                i = 0;
            }
            view.setVisibility(i);
            A02(c54212eX, C1QO.A0E, "impression");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [int] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    public static final void A02(C54212eX c54212eX, C1QO c1qo, String str) {
        EnumC54222eY enumC54222eY;
        ?? r7;
        C54392et c54392et = c54212eX.A08;
        if (c54392et != null && !c54212eX.A0T.CSB(c1qo)) {
            EnumC58122lU enumC58122lU = EnumC58122lU.A03;
            if (C1QO.A0D == c1qo) {
                r7 = 0;
                r7 = 0;
                enumC54222eY = EnumC54222eY.A09;
                if (c54212eX.A06) {
                    enumC58122lU = EnumC58122lU.A08;
                }
            } else {
                if (C1QO.A0E != c1qo) {
                    return;
                }
                boolean z = c54212eX.A09;
                enumC54222eY = EnumC54222eY.A0b;
                r7 = z;
            }
            C54432ex c54432ex = new C54432ex(enumC54222eY, null, r7, r7);
            if (str.equals("impression")) {
                EnumC58162lY enumC58162lY = EnumC58162lY.A06;
                c54392et.A06(enumC58122lU, enumC58162lY, c54432ex, null);
                C54412ev c54412ev = c54212eX.A0U;
                if (c54412ev != null) {
                    C14360o3.A0B(enumC58162lY, 0);
                    c54412ev.A02(new C72053Ld(enumC58122lU, enumC58162lY, null, null), c54432ex);
                    return;
                }
                return;
            }
            if (!str.equals("click")) {
                return;
            }
            EnumC58162lY enumC58162lY2 = EnumC58162lY.A06;
            c54392et.A05(enumC58122lU, enumC58162lY2, c54432ex, null);
            C54412ev c54412ev2 = c54212eX.A0U;
            if (c54412ev2 == null) {
                return;
            }
            C14360o3.A0B(enumC58162lY2, 0);
            c54412ev2.A03(new C72053Ld(enumC58122lU, enumC58162lY2, null, null), c54432ex, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03() {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54212eX.A03():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00fc, code lost:
    
        if (r0 != false) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A04() {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54212eX.A04():void");
    }

    public final void A05() {
        C41451vu.A01.A03(this.A0D, C71913Ko.class);
        C58012lH c58012lH = this.A03;
        if (c58012lH != null) {
            View view = c58012lH.A03;
            C14360o3.A0A(view);
            view.setVisibility(8);
        }
        C58012lH c58012lH2 = this.A04;
        if (c58012lH2 != null) {
            View view2 = c58012lH2.A03;
            C14360o3.A0A(view2);
            view2.setVisibility(8);
        }
        this.A0M.clear();
        this.A06 = false;
        this.A00 = 0;
    }

    public final void A07() {
        UserSession userSession;
        C58012lH c58012lH = this.A02;
        if (c58012lH != null && (userSession = this.A0J) != null) {
            int i = C2IZ.A04.A00(userSession.userId).A00().A00.A02;
            if (i > 0) {
                if (C14360o3.A0K(c58012lH.A07, "notification_type_count")) {
                    View view = c58012lH.A03;
                    C14360o3.A0A(view);
                    view.setVisibility(0);
                    TextView textView = (TextView) view;
                    if (i <= 99) {
                        C14360o3.A0A(textView);
                        textView.setText(String.valueOf(i));
                        return;
                    } else {
                        C14360o3.A0A(textView);
                        textView.setText(2131975127);
                        return;
                    }
                }
                View view2 = c58012lH.A03;
                C14360o3.A0A(view2);
                view2.setVisibility(0);
                return;
            }
            View view3 = c58012lH.A03;
            C14360o3.A0A(view3);
            view3.setVisibility(8);
        }
    }
}
