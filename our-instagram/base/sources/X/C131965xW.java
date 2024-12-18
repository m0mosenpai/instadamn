package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.view.ViewConfiguration;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;
import com.instagram.crossposting.feed.graphql.FBToIGDefaultAudienceSettingQueryResponseImpl;
import com.instagram.crossposting.feed.graphql.FetchFBToIGDefaultAudienceApi;

/* renamed from: X.5xW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C131965xW implements InterfaceC13000lm, CallerContextable {
    public static final String __redex_internal_original_name = "FeedCrosspostingAudienceSettingManager";
    public C47Z A00;
    public C130135uJ A01;
    public final UserSession A02;
    public final InterfaceC09390do A03;
    public static final C131975xX A05 = new Object();
    public static final CallerContext A04 = CallerContext.A00(C131965xW.class);

    public C131965xW(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A03 = AbstractC09440dt.A00(EnumC09460dv.A02, new C206959Ea(this, 32));
    }

    public final synchronized C130135uJ A04() {
        return this.A01;
    }

    public final void A06(Context context, FragmentActivity fragmentActivity, UserSession userSession, InterfaceC57943Pmn interfaceC57943Pmn, String str) {
        C14360o3.A0B(userSession, 4);
        N5K A00 = AbstractC53951NtO.A00(str);
        A00.A01 = new C56366P1b(interfaceC57943Pmn, this);
        C189448aO c189448aO = new C189448aO(userSession);
        c189448aO.A0a = false;
        c189448aO.A0U = new C56764PHh(context, fragmentActivity, userSession, interfaceC57943Pmn, this, str);
        c189448aO.A0F = ViewConfiguration.get(fragmentActivity).getScaledPagingTouchSlop();
        c189448aO.A00().A02(fragmentActivity, A00);
    }

    public final synchronized void A07(Context context, String str) {
        AbstractC53952NtP.A00(this.A02, new C56370P1f(context, this, str));
    }

    public final synchronized void A08(final C62m c62m) {
        final String str;
        final InterfaceC1338062l interfaceC1338062l;
        final UserSession userSession = this.A02;
        if (C18U.A06(C06090Tz.A05, userSession, 36322950739143438L)) {
            C126915oV A00 = A00(this);
            if (A00 != null && A00.getOptionalStringField(0, "fb_feed_default_audience") != null) {
                str = A00.getOptionalStringField(0, "fb_feed_default_audience");
                interfaceC1338062l = new C56372P1h(c62m, this);
            }
        } else {
            str = null;
            interfaceC1338062l = new InterfaceC1338062l() { // from class: X.62k
                @Override // X.InterfaceC1338062l
                public final void DFf() {
                    C62m c62m2 = c62m;
                    if (c62m2 != null) {
                        c62m2.DFf();
                    }
                    C131965xW c131965xW = this;
                    C131975xX c131975xX = C131965xW.A05;
                    AbstractC130145uK.A00(c131965xW.A02);
                }

                /* JADX WARN: Code restructure failed: missing block: B:13:0x0022, code lost:
                
                    if (r5 != null) goto L6;
                 */
                @Override // X.InterfaceC1338062l
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void Dpt(X.C130135uJ r5) {
                    /*
                        r4 = this;
                        X.5xW r3 = r2
                        X.5xX r0 = X.C131965xW.A05
                        com.instagram.common.session.UserSession r2 = r3.A02
                        r0 = 0
                        if (r5 == 0) goto L21
                        java.lang.String r1 = r5.A04
                        if (r1 == 0) goto L21
                    Ld:
                        boolean r0 = r5.A00
                        java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                    L13:
                        X.AbstractC130145uK.A01(r2, r0, r1)
                        r3.A0A(r5)
                        X.62m r0 = r1
                        if (r0 == 0) goto L20
                        r0.onSuccess()
                    L20:
                        return
                    L21:
                        r1 = r0
                        if (r5 == 0) goto L13
                        goto Ld
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1337962k.Dpt(X.5uJ):void");
                }
            };
        }
        C40701ud A01 = AbstractC40691uc.A01(userSession);
        C1Dk A002 = FetchFBToIGDefaultAudienceApi.A00(userSession);
        A01.ATV(new InterfaceC48212Jk() { // from class: X.62r
            @Override // X.InterfaceC48212Jk
            public final void invoke(Throwable th) {
                InterfaceC1338062l.this.DFf();
            }
        }, new InterfaceC48192Ji() { // from class: X.62q
            @Override // X.InterfaceC48192Ji
            public final void invoke(AnonymousClass436 anonymousClass436) {
                Object Bos;
                if (anonymousClass436 != null && (Bos = anonymousClass436.Bos()) != null) {
                    interfaceC1338062l.Dpt(FetchFBToIGDefaultAudienceApi.A01(UserSession.this, (FBToIGDefaultAudienceSettingQueryResponseImpl) Bos, str));
                }
            }
        }, A002);
    }

    public final synchronized void A09(C62m c62m, String str) {
        C130135uJ c130135uJ = this.A01;
        if (c130135uJ == null || !c130135uJ.A00) {
            AbstractC53952NtP.A00(this.A02, new C56369P1e(c62m, this, str));
        }
    }

    public final synchronized void A0A(C130135uJ c130135uJ) {
        this.A01 = c130135uJ;
    }

    public final synchronized boolean A0B() {
        boolean z;
        C130135uJ c130135uJ = this.A01;
        z = true;
        if (c130135uJ != null) {
            if (c130135uJ.A00) {
            }
        }
        z = false;
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0010, code lost:
    
        if (A0B() != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean A0C(com.instagram.common.session.UserSession r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            r0 = 0
            X.C14360o3.A0B(r3, r0)     // Catch: java.lang.Throwable -> L15
            boolean r0 = X.C131975xX.A01(r3)     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L12
            boolean r1 = r2.A0B()     // Catch: java.lang.Throwable -> L15
            r0 = 1
            if (r1 == 0) goto L13
        L12:
            r0 = 0
        L13:
            monitor-exit(r2)
            return r0
        L15:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C131965xW.A0C(com.instagram.common.session.UserSession):boolean");
    }

    public static final C126915oV A00(C131965xW c131965xW) {
        C126875oR c126875oR = ((C196058lv) c131965xW.A03.getValue()).A00(A04).A00;
        if (c126875oR != null) {
            return (C126915oV) c126875oR.getOptionalTreeField(1, "fb_feed_privacy_setting_service_data", C126915oV.class, -2058546846);
        }
        return null;
    }

    public static final synchronized void A01(UserSession userSession, Context context, String str) {
        synchronized (C131965xW.class) {
            A05.A03(userSession, context, str);
        }
    }

    public final SpannableStringBuilder A02(Context context, FragmentActivity fragmentActivity) {
        UserSession userSession = this.A02;
        String string = context.getString(2131973763);
        C14360o3.A07(string);
        Spanned A00 = AbstractC07900bA.A00(context.getResources(), new Object[]{string}, 2131962420);
        C14360o3.A07(A00);
        return C50701MZw.A01(A00, fragmentActivity, userSession, string, MSV.A00(1173), MSV.A00(1246));
    }

    public final String A05(Context context, UserSession userSession) {
        InterfaceC09390do interfaceC09390do = this.A03;
        C196058lv c196058lv = (C196058lv) interfaceC09390do.getValue();
        CallerContext callerContext = A04;
        c196058lv.A00(callerContext);
        boolean A02 = C196068lw.A02(((C196058lv) interfaceC09390do.getValue()).A00(callerContext));
        C131975xX.A00(userSession);
        return C50701MZw.A02(context, C131975xX.A00(userSession).A01, A02);
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A02.A03(C131965xW.class);
    }

    public final SpannableStringBuilder A03(Context context, FragmentActivity fragmentActivity, InterfaceC57943Pmn interfaceC57943Pmn, String str) {
        String string = context.getString(2131952013);
        C14360o3.A07(string);
        String string2 = context.getString(2131973883, string);
        C14360o3.A07(string2);
        C52787NXw c52787NXw = new C52787NXw(context, fragmentActivity, interfaceC57943Pmn, this, str, context.getColor(AbstractC53242c7.A06(context)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string2);
        AnonymousClass773.A04(spannableStringBuilder, c52787NXw, string);
        return spannableStringBuilder;
    }
}
