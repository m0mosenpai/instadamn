package com.instagram.base.activity;

import X.AbstractC09440dt;
import X.AbstractC09800fd;
import X.AbstractC10360h2;
import X.AbstractC110034xX;
import X.AbstractC12960li;
import X.AbstractC12990ll;
import X.AbstractC13880nE;
import X.AbstractC18680vv;
import X.AbstractC225039wS;
import X.AbstractC25651Mw;
import X.AbstractC33651Eu1;
import X.AbstractC50712Us;
import X.AbstractC52802bM;
import X.AbstractC52812bN;
import X.AbstractC52892bV;
import X.AbstractC53242c7;
import X.AbstractC57052jg;
import X.AbstractC57232jy;
import X.AbstractC58327PtK;
import X.AbstractC917648y;
import X.AbstractRunnableC14200nk;
import X.AnonymousClass001;
import X.C006802i;
import X.C00O;
import X.C05F;
import X.C06090Tz;
import X.C06N;
import X.C0L6;
import X.C0YR;
import X.C0b3;
import X.C0f5;
import X.C0f9;
import X.C0fO;
import X.C12180kM;
import X.C12260kU;
import X.C14120nc;
import X.C14360o3;
import X.C17280tP;
import X.C18920wW;
import X.C18950wb;
import X.C18U;
import X.C19700xy;
import X.C1C0;
import X.C1H6;
import X.C226218q;
import X.C2d4;
import X.C2d5;
import X.C2d6;
import X.C2d7;
import X.C2d8;
import X.C2d9;
import X.C3DM;
import X.C3KD;
import X.C3KE;
import X.C3KF;
import X.C3KG;
import X.C3KH;
import X.C3KI;
import X.C3KJ;
import X.C3KK;
import X.C3KL;
import X.C3KN;
import X.C3KV;
import X.C3N3;
import X.C3O0;
import X.C41451vu;
import X.C49632LwP;
import X.C54I;
import X.C56352iT;
import X.C57002jb;
import X.C57012jc;
import X.C57022jd;
import X.C57042jf;
import X.C57112jm;
import X.C57242jz;
import X.C57272k2;
import X.C57982lB;
import X.C60552pe;
import X.C72613Ni;
import X.C9EI;
import X.EnumC09460dv;
import X.GSw;
import X.InterfaceC09390do;
import X.InterfaceC16530ry;
import X.InterfaceC41501vz;
import X.InterfaceC57142jp;
import X.MPE;
import X.ViewOnAttachStateChangeListenerC56972jY;
import X.WFS;
import X.YFX;
import X.YFY;
import X.YFZ;
import android.app.Activity;
import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.view.Window;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.systrace.Systrace;
import com.google.common.collect.ImmutableSet;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.network.DebugNetworkShapingConfigurationFactory$createNetworkShapingServiceLayerConfiguration$1;
import com.instagram.ui.pixelguide.PixelGuideView;
import com.instagram.ui.widget.edittext.AnimatedHintsTextLayout;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes.dex */
public abstract class BaseFragmentActivity extends IgFragmentActivity implements C2d4, C2d5, C2d6, C2d7, C2d8, C2d9 {
    public int A00;
    public TextView A01;
    public C56352iT A02;
    public AnimatedHintsTextLayout A03;
    public InterfaceC09390do A04;
    public boolean A05;
    public boolean A06;
    public TextView A07;
    public TextView A08;
    public TextView A09;
    public C57112jm A0A;
    public C57112jm A0B;
    public C57022jd A0C;
    public C57002jb A0D;
    public ViewOnAttachStateChangeListenerC56972jY A0E;
    public ViewOnAttachStateChangeListenerC56972jY A0F;
    public C57272k2 A0G;
    public boolean A0H;
    public final View.OnClickListener A0I;
    public final C06N A0J;
    public final InterfaceC09390do A0K;
    public final InterfaceC09390do A0L;
    public final InterfaceC09390do A0M;
    public final C006802i A0N;
    public final InterfaceC41501vz A0O;
    public final InterfaceC41501vz A0P;
    public final InterfaceC41501vz A0Q;
    public final InterfaceC41501vz A0R;
    public final InterfaceC41501vz A0S;
    public final InterfaceC41501vz A0T;
    public final InterfaceC41501vz A0U;
    public final InterfaceC41501vz A0V;
    public final InterfaceC41501vz A0W;

    public C3KL A0Y() {
        return null;
    }

    public void A0b() {
    }

    public void A0c() {
    }

    public void A0e() {
    }

    public void A0f() {
    }

    public void A0g() {
    }

    public abstract void A0j(Bundle bundle);

    public final void A0k(AbstractC12990ll abstractC12990ll) {
        int i = 0;
        TextView textView = this.A08;
        if (textView == null) {
            ViewStub viewStub = (ViewStub) findViewById(R.id.network_shaping_stub);
            if (viewStub != null) {
                View inflate = viewStub.inflate();
                C14360o3.A0C(inflate, "null cannot be cast to non-null type android.widget.TextView");
                textView = (TextView) inflate;
                this.A08 = textView;
            } else {
                return;
            }
        }
        if (new DebugNetworkShapingConfigurationFactory$createNetworkShapingServiceLayerConfiguration$1(abstractC12990ll).isNetworkShapingOn()) {
            textView.setText("Slow network enabled (fburl.com/IGBuildEmpathy)");
            textView.setBackgroundColor(getColor(AbstractC53242c7.A03(this)));
        } else {
            i = 8;
        }
        textView.setVisibility(i);
    }

    public boolean A0m() {
        return true;
    }

    @Override // X.C2d7
    public final C57112jm CGS() {
        View findViewById;
        synchronized (this) {
            if (this.A0A == null) {
                this.A0A = AbstractC57052jg.A01(getSession(), AbstractC57052jg.A00());
                this.A0B = AbstractC57052jg.A01(null, AbstractC57052jg.A00());
                Window window = getWindow();
                if (window != null && window.getDecorView() != null && (findViewById = getWindow().getDecorView().findViewById(android.R.id.content)) != null) {
                    if (this.A0E == null) {
                        this.A0E = new ViewOnAttachStateChangeListenerC56972jY(findViewById);
                    }
                    if (this.A0F == null) {
                        this.A0F = new ViewOnAttachStateChangeListenerC56972jY(findViewById);
                    }
                    C57112jm c57112jm = this.A0A;
                    C14360o3.A0A(c57112jm);
                    ViewOnAttachStateChangeListenerC56972jY viewOnAttachStateChangeListenerC56972jY = this.A0E;
                    C14360o3.A0A(viewOnAttachStateChangeListenerC56972jY);
                    c57112jm.A08(findViewById, viewOnAttachStateChangeListenerC56972jY, new InterfaceC57142jp[0]);
                    ViewOnAttachStateChangeListenerC56972jY viewOnAttachStateChangeListenerC56972jY2 = this.A0F;
                    if (viewOnAttachStateChangeListenerC56972jY2 != null) {
                        C57112jm c57112jm2 = this.A0B;
                        if (c57112jm2 == null) {
                            C14360o3.A0F("viperViewpointManager");
                            throw C00O.createAndThrow();
                        }
                        c57112jm2.A08(findViewById, viewOnAttachStateChangeListenerC56972jY2, new InterfaceC57142jp[0]);
                    }
                }
            }
        }
        return this.A0A;
    }

    @Override // X.C2d6
    public final void DA3(C17280tP c17280tP) {
        C14360o3.A0B(c17280tP, 0);
        TextView textView = this.A07;
        if (textView == null) {
            View inflate = ((ViewStub) requireViewById(R.id.devserver_indicator_stub)).inflate();
            C14360o3.A0C(inflate, "null cannot be cast to non-null type android.widget.TextView");
            textView = (TextView) inflate;
            this.A07 = textView;
        }
        if (c17280tP.A0g()) {
            textView.setText(C17280tP.A4E.A00().A05());
            textView.setVisibility(0);
            Object CES = c17280tP.A0r.CES(c17280tP, C17280tP.A4G[52]);
            int i = R.color.red_5;
            if (C14360o3.A0K(CES, "HEALTHY")) {
                i = R.color.green_5;
            } else if (C14360o3.A0K(CES, "CHECKING_HEALTH")) {
                i = R.color.clips_gradient_redesign_color_1;
            }
            textView.setBackgroundColor(getBaseContext().getColor(i));
        } else {
            textView.setVisibility(8);
        }
        textView.setTranslationY(this.A00);
    }

    @Override // X.C2d6
    public final void E20(C17280tP c17280tP) {
        int i = 0;
        C14360o3.A0B(c17280tP, 0);
        TextView textView = this.A09;
        if (textView == null) {
            View inflate = ((ViewStub) requireViewById(R.id.whitehat_indicator_stub)).inflate();
            C14360o3.A0C(inflate, "null cannot be cast to non-null type android.widget.TextView");
            textView = (TextView) inflate;
            this.A09 = textView;
        }
        if (c17280tP.A0K()) {
            textView.setText(2131977094);
        } else {
            i = 8;
        }
        textView.setVisibility(i);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        C14360o3.A0B(configuration, 0);
        super.onConfigurationChanged(configuration);
        if (!this.A05 && this.A0H) {
            AbstractC52802bM.A00(this);
        }
        A0V(configuration);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        C14360o3.A0B(bundle, 0);
        try {
            super.onSaveInstanceState(bundle);
            bundle.putBoolean("BaseFragmentActivity.should_allow_rotation", this.A0H);
        } catch (ArrayStoreException e) {
            C0f5 AEr = C18950wb.A00.AEr(false, "BaseFragmentActivity:onSaveInstanceState", 694553566, 0);
            AEr.ERI(e);
            AEr.report();
        }
    }

    private final void A0V(Configuration configuration) {
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (AbstractC52812bN.A02(AbstractC52892bV.A00(i)) && AbstractC225039wS.A00(i2).intValue() != 0) {
            AbstractC52812bN.A00 = true;
            C57982lB.A09 = true;
        }
        C14120nc.A00().ATO(new AbstractRunnableC14200nk() { // from class: X.2ja
            {
                super(618711119, 3, false, false);
            }

            @Override // java.lang.Runnable
            public final void run() {
                BaseFragmentActivity baseFragmentActivity = BaseFragmentActivity.this;
                C52882bU AIw = ((InterfaceC52852bR) C52822bO.A00.invoke(C52842bQ.A00)).AIw(baseFragmentActivity);
                float f = baseFragmentActivity.getResources().getDisplayMetrics().density;
                int width = AIw.A00().width();
                int height = AIw.A00().height();
                int ceil = (int) Math.ceil(width / f);
                int ceil2 = (int) Math.ceil(height / f);
                if (AbstractC52812bN.A02(AbstractC52892bV.A00(ceil)) && AbstractC225039wS.A00(ceil2).intValue() != 0) {
                    AbstractC52812bN.A00 = true;
                    C57982lB.A09 = true;
                }
            }
        });
    }

    public void A0Z() {
        Fragment A0O;
        AbstractC10360h2 childFragmentManager;
        C56352iT c56352iT = this.A02;
        if (c56352iT != null) {
            AbstractC10360h2 abstractC10360h2 = this.mFragments.A00.A03;
            Fragment fragment = null;
            if (abstractC10360h2 == null) {
                A0O = null;
            } else {
                A0O = abstractC10360h2.A0O(R.id.layout_container_main);
                if (A0O instanceof C60552pe) {
                    A0O = ((C60552pe) A0O).A02(null);
                }
                if (A0O != null && (childFragmentManager = A0O.getChildFragmentManager()) != null) {
                    Fragment A0O2 = childFragmentManager.A0O(R.id.layout_container_main);
                    if (A0O2 instanceof C60552pe) {
                        A0O2 = ((C60552pe) A0O2).A02(null);
                    }
                    fragment = A0O2;
                }
            }
            if (C18U.A06(C06090Tz.A05, getSession(), 36326614346381309L) && fragment != null) {
                C3DM.A00(fragment, c56352iT);
            } else {
                C3DM.A00(A0O, c56352iT);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A0d() {
        /*
            r8 = this;
            X.06A r0 = r8.mFragments
            X.0i8 r0 = r0.A00
            X.0h2 r0 = r0.A03
            r2 = 2131435251(0x7f0b1ef3, float:1.8492339E38)
            r1 = 0
            if (r0 == 0) goto L7f
            androidx.fragment.app.Fragment r5 = r0.A0O(r2)
            boolean r0 = r5 instanceof X.C60552pe
            if (r0 == 0) goto L1a
            X.2pe r5 = (X.C60552pe) r5
            androidx.fragment.app.Fragment r5 = r5.A02(r1)
        L1a:
            if (r5 == 0) goto L7f
            android.view.View r0 = r5.mView
            if (r0 == 0) goto L7f
            X.2iT r1 = r8.A02
            r4 = 0
            if (r1 == 0) goto L80
            boolean r0 = r5 instanceof X.InterfaceC60112ot
            if (r0 == 0) goto L32
            r0 = r5
            X.2ot r0 = (X.InterfaceC60112ot) r0
            boolean r0 = r0.CPM()
            if (r0 != 0) goto L80
        L32:
            boolean r0 = r1.A0A
            if (r0 == 0) goto L80
            boolean r0 = r5 instanceof X.InterfaceC60122ou
            if (r0 == 0) goto L80
            int r0 = X.C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION
            boolean r0 = X.AbstractC60622pl.A01(r5)
            if (r0 != 0) goto L80
            int r7 = X.C3HB.A00(r8)
        L46:
            android.view.View r6 = r8.requireViewById(r2)
            X.C14360o3.A07(r6)
            X.0vv r0 = r8.getSession()
            boolean r0 = r0 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L7c
            X.0vv r3 = r8.getSession()
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36319188347788320(0x81081c00001c20, double:3.0317391845497634E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L7c
            X.0do r0 = r8.A0M
            java.lang.Object r2 = r0.getValue()
            X.2iX r2 = (X.InterfaceC56392iX) r2
            if (r2 == 0) goto L7c
            java.util.List r1 = java.util.Collections.singletonList(r6)
            X.C14360o3.A07(r1)
            X.2iT r0 = r8.A02
            X.AbstractC110034xX.A01(r5, r0, r2, r1)
        L7c:
            r6.setPadding(r4, r7, r4, r4)
        L7f:
            return
        L80:
            r7 = 0
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.base.activity.BaseFragmentActivity.A0d():void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void A0i() {
        MPE yfy;
        C57002jb c57002jb = this.A0D;
        if (c57002jb == null) {
            C14360o3.A0F("pixelGuideManager");
            throw C00O.createAndThrow();
        }
        C17280tP c17280tP = c57002jb.A01;
        InterfaceC16530ry interfaceC16530ry = c17280tP.A1g;
        C0YR[] c0yrArr = C17280tP.A4G;
        boolean booleanValue = ((Boolean) interfaceC16530ry.CES(c17280tP, c0yrArr[24])).booleanValue();
        C57012jc c57012jc = c57002jb.A00;
        if (booleanValue) {
            c57012jc.A03(0);
            PixelGuideView pixelGuideView = (PixelGuideView) c57012jc.A01();
            String str = (String) c17280tP.A2M.CES(c17280tP, c0yrArr[125]);
            if (TextUtils.isEmpty(str)) {
                str = "Pixel Grid";
            }
            int A04 = (int) AbstractC13880nE.A04(pixelGuideView.getContext(), ((Number) c17280tP.A2L.CES(c17280tP, c0yrArr[126])).intValue());
            switch (str.hashCode()) {
                case -1427524836:
                    if (str.equals("Vertical Stripes")) {
                        yfy = new YFZ(A04, pixelGuideView.A04);
                        break;
                    }
                    yfy = new C49632LwP(A04);
                    break;
                case -398112099:
                    if (str.equals("Vertical And Horizontal Stripes")) {
                        yfy = new YFX(A04, pixelGuideView.A04);
                        break;
                    }
                    yfy = new C49632LwP(A04);
                    break;
                case 1895940554:
                    if (str.equals("Horizontal Stripes")) {
                        yfy = new YFY(A04, pixelGuideView.A04);
                        break;
                    }
                    yfy = new C49632LwP(A04);
                    break;
                default:
                    yfy = new C49632LwP(A04);
                    break;
            }
            pixelGuideView.A06 = yfy;
            pixelGuideView.invalidate();
            return;
        }
        c57012jc.A03(8);
    }

    public final void A0l(boolean z) {
        int i;
        if (!this.A05 && this.A0H != z) {
            this.A0H = z;
            if (z) {
                AbstractC52802bM.A00(this);
                return;
            }
            boolean A06 = C18U.A06(C06090Tz.A05, getSession(), 36329702427738613L);
            boolean A01 = AbstractC52802bM.A01(this);
            if (A06) {
                if (!A01) {
                    return;
                } else {
                    i = 14;
                }
            } else if (!A01) {
                return;
            } else {
                i = 1;
            }
            AbstractC917648y.A00(this, i);
        }
    }

    @Override // X.C2d4
    public C56352iT AYT() {
        if (this.A06) {
            InterfaceC09390do interfaceC09390do = this.A04;
            if (interfaceC09390do == null) {
                C14360o3.A0F("actionBarServiceProvider");
                throw C00O.createAndThrow();
            }
            return (C56352iT) interfaceC09390do.getValue();
        }
        return this.A02;
    }

    @Override // X.C2d5
    public final C3O0 By1() {
        return (C3O0) this.A0K.getValue();
    }

    public BaseFragmentActivity() {
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A0K = AbstractC09440dt.A00(enumC09460dv, new C9EI(this, 43));
        this.A0N = C006802i.A0p;
        this.A0M = AbstractC09440dt.A00(enumC09460dv, new C9EI(this, 46));
        this.A0L = AbstractC09440dt.A00(enumC09460dv, new C9EI(this, 45));
        this.A0H = true;
        this.A0J = new C06N() { // from class: X.2do
            @Override // X.C06N
            public final void onBackStackChanged() {
                BaseFragmentActivity.this.A0a();
            }
        };
        this.A0U = new InterfaceC41501vz() { // from class: X.2dt
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                CharSequence charSequence;
                String str;
                int A03 = C0f9.A03(302200983);
                C3KD c3kd = (C3KD) obj;
                int A032 = C0f9.A03(-1745238980);
                C14360o3.A0B(c3kd, 0);
                C31349DqE c31349DqE = c3kd.A01;
                BaseFragmentActivity baseFragmentActivity = BaseFragmentActivity.this;
                baseFragmentActivity.By1().A0A(c31349DqE);
                AbstractC18680vv session = baseFragmentActivity.getSession();
                if (c31349DqE.A0C == EnumC141996bI.A05 && (session instanceof UserSession) && (charSequence = c31349DqE.A0D) != null) {
                    String str2 = c31349DqE.A0H;
                    if (str2 == null) {
                        str2 = "";
                    }
                    String str3 = c3kd.A00;
                    if (str3 == null) {
                        str3 = "unknown_caller";
                    }
                    String str4 = C55772hI.A00(session).A0B;
                    C1ZX A01 = C1ZV.A00((UserSession) session).A01(C05F.A04, C05F.A0D, false);
                    A01.A03(DialogModule.KEY_MESSAGE, String.valueOf(charSequence));
                    if (str4 != null) {
                        str = AnonymousClass001.A0T(str4, str2, ':');
                    } else {
                        str = str2;
                    }
                    A01.A03("error_category", str);
                    A01.A03("logview_group_by", "error_category");
                    A01.A05(new Throwable(AnonymousClass001.A0T(str3, str2, ':')));
                    A01.A00();
                }
                C0f9.A0A(1816800506, A032);
                C0f9.A0A(458519440, A03);
            }
        };
        this.A0V = new InterfaceC41501vz() { // from class: X.2dv
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                String str;
                String str2;
                int A03 = C0f9.A03(1866995675);
                C3KE c3ke = (C3KE) obj;
                int A032 = C0f9.A03(101925368);
                C14360o3.A0B(c3ke, 0);
                AbstractC18680vv session = BaseFragmentActivity.this.getSession();
                if (session instanceof UserSession) {
                    String str3 = C55772hI.A00(session).A0B;
                    C1ZX A01 = C1ZV.A00((UserSession) session).A01(C05F.A04, C05F.A0E, false);
                    A01.A03(DialogModule.KEY_MESSAGE, c3ke.A02);
                    if (str3 != null) {
                        str2 = c3ke.A01;
                        str = AnonymousClass001.A0T(str3, str2, ':');
                    } else {
                        str = c3ke.A01;
                        str2 = str;
                    }
                    A01.A03("error_category", str);
                    A01.A03("logview_group_by", "error_category");
                    A01.A05(new Throwable(AnonymousClass001.A0T(c3ke.A00, str2, ':')));
                    A01.A00();
                }
                C0f9.A0A(-1843808098, A032);
                C0f9.A0A(1118663888, A03);
            }
        };
        this.A0S = new InterfaceC41501vz() { // from class: X.2dw
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(1672816153);
                C3KG c3kg = (C3KG) obj;
                int A032 = C0f9.A03(1274788171);
                C14360o3.A0B(c3kg, 0);
                OEQ oeq = c3kg.A00;
                BaseFragmentActivity baseFragmentActivity = BaseFragmentActivity.this;
                if (!baseFragmentActivity.isFinishing()) {
                    Dialog A02 = AbstractC54025Nub.A00(baseFragmentActivity, oeq).A02();
                    C14360o3.A0B(A02, 0);
                    C0fJ.A00(A02);
                }
                C0f9.A0A(1432343037, A032);
                C0f9.A0A(1230887608, A03);
            }
        };
        this.A0W = new InterfaceC41501vz() { // from class: X.2dx
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(479544451);
                C3KH c3kh = (C3KH) obj;
                int A032 = C0f9.A03(931709039);
                C14360o3.A0B(c3kh, 0);
                BaseFragmentActivity.this.By1().A08(c3kh.A00);
                C0f9.A0A(-1725051915, A032);
                C0f9.A0A(-1917027047, A03);
            }
        };
        this.A0P = new InterfaceC41501vz() { // from class: X.2dz
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(-842635986);
                C3KI c3ki = (C3KI) obj;
                int A032 = C0f9.A03(-1616035649);
                C14360o3.A0B(c3ki, 0);
                C3O0 By1 = BaseFragmentActivity.this.By1();
                C54971OTd c54971OTd = c3ki.A00;
                if (c54971OTd.equals(By1.A06)) {
                    C3O0.A03(By1, true);
                }
                By1.A0L.remove(c54971OTd);
                C0f9.A0A(-18127171, A032);
                C0f9.A0A(1976331379, A03);
            }
        };
        this.A0T = new InterfaceC41501vz() { // from class: X.2e0
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                C0f9.A03(1858113693);
                C0f9.A03(1369037950);
                BaseFragmentActivity.this.By1();
                throw new NullPointerException("hasConnection");
            }
        };
        this.A0O = new InterfaceC41501vz() { // from class: X.2e2
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(-1021032286);
                C3KF c3kf = (C3KF) obj;
                int A032 = C0f9.A03(725832316);
                C14360o3.A0B(c3kf, 0);
                BaseFragmentActivity.this.By1().A09(c3kf.A00);
                C0f9.A0A(1516838788, A032);
                C0f9.A0A(1103718060, A03);
            }
        };
        this.A0R = new InterfaceC41501vz() { // from class: X.2e4
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(-1637889419);
                C3KK c3kk = (C3KK) obj;
                int A032 = C0f9.A03(-1787783457);
                C14360o3.A0B(c3kk, 0);
                C3KL A0Y = BaseFragmentActivity.this.A0Y();
                if (A0Y != null) {
                    A0Y.A08((String) c3kk.A02.getValue(), "", null, (ImmutableSet) c3kk.A00.getValue(), 0L, ((Boolean) c3kk.A01.getValue()).booleanValue());
                }
                C0f9.A0A(-2015045365, A032);
                C0f9.A0A(-1795367975, A03);
            }
        };
        this.A0Q = new InterfaceC41501vz() { // from class: X.2e5
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(1619741907);
                int A032 = C0f9.A03(689741701);
                BaseFragmentActivity.A0W(BaseFragmentActivity.this, C17280tP.A4E.A00(), true);
                C0f9.A0A(1121799406, A032);
                C0f9.A0A(1230304917, A03);
            }
        };
        this.A0I = new View.OnClickListener() { // from class: X.2e7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(618821999);
                BaseFragmentActivity.this.onBackPressed();
                C0f9.A0C(1373048360, A05);
            }
        };
    }

    private final void A0U() {
        AbstractC18680vv session;
        if (C18U.A06(C06090Tz.A05, getSession(), 36325188417368930L) && (session = getSession()) != null) {
            C3KV c3kv = (C3KV) session.A01(C3KV.class, new GSw(session, 19));
            C0b3 c0b3 = C12260kU.A00;
            synchronized (c0b3) {
                c0b3.A00 = c3kv;
            }
        }
    }

    public static final void A0W(BaseFragmentActivity baseFragmentActivity, C17280tP c17280tP, boolean z) {
        if (c17280tP.A0T()) {
            TextView textView = baseFragmentActivity.A01;
            if (textView == null) {
                View inflate = ((ViewStub) baseFragmentActivity.requireViewById(R.id.meta_ai_status_indicator_stub)).inflate();
                C14360o3.A0C(inflate, "null cannot be cast to non-null type android.widget.TextView");
                textView = (TextView) inflate;
                baseFragmentActivity.A01 = textView;
            }
            if (c17280tP.A0T()) {
                textView.setText("Meta AI Status");
                textView.setVisibility(0);
                if (z) {
                    textView.setBackgroundColor(baseFragmentActivity.getBaseContext().getColor(R.color.green_5));
                }
                textView.setTranslationY(baseFragmentActivity.A00);
                return;
            }
            textView.setVisibility(8);
        }
    }

    public int A0X() {
        return R.layout.activity_fragment_host_coordinator_layout;
    }

    public void A0a() {
        A0Z();
        C006802i c006802i = this.A0N;
        if (c006802i != null) {
            c006802i.markerPoint(568727001, "configure_action_bar_end");
        }
        A0d();
        if (c006802i != null) {
            c006802i.markerPoint(568727001, "configure_scrollable_navigation_end");
        }
        A0e();
        if (c006802i != null) {
            c006802i.markerPoint(568727001, "configure_status_bar_offset_end");
        }
        A0c();
        if (c006802i != null) {
            c006802i.markerPoint(568727001, "configure_nav_bar_offset_end");
        }
        A0b();
        if (c006802i != null) {
            c006802i.markerPoint(568727001, "configure_gradient_background_end");
            c006802i.markerEnd(568727001, (short) 2);
        }
    }

    public void A0h() {
        if (A0m()) {
            C1H6.A01(this);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        Window window;
        super.onAttachedToWindow();
        C57022jd c57022jd = this.A0C;
        if (c57022jd != null && (window = getWindow()) != null) {
            c57022jd.A00 = new C72613Ni(window);
        }
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [X.2k2] */
    /* JADX WARN: Type inference failed for: r2v27, types: [X.2k2] */
    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i;
        int i2;
        UserSession userSession;
        Window window;
        View findViewById;
        int i3;
        UserSession userSession2;
        Window window2;
        View findViewById2;
        int A00 = C0f9.A00(955057209);
        String name = getClass().getName();
        C006802i c006802i = C006802i.A0p;
        if (c006802i != null) {
            int A03 = AbstractC50712Us.A01.A03();
            c006802i.markerStart(694558626, A03);
            c006802i.markerAnnotate(694558626, A03, "endpoint", C0L6.A00());
            c006802i.markerAnnotate(694558626, A03, "asl_session_id", C0L6.A01());
            c006802i.markerAnnotate(694558626, A03, "activityClass", AnonymousClass001.A0g("<cls>", name, "</cls>"));
            String name2 = BaseFragmentActivity.class.getName();
            c006802i.markerAnnotate(694558626, A03, "method_class", AnonymousClass001.A0g("<cls>", name2, "</cls>"));
            c006802i.markerAnnotate(694558626, A03, "operation_name", "onCreate");
            try {
                String A0T = AnonymousClass001.A0T(name2, "onCreate", '.');
                if (Systrace.A0E(1L)) {
                    C0fO.A01(A0T, -1909702355);
                }
                try {
                    Bundle A002 = AbstractC58327PtK.A00(bundle);
                    AbstractC09800fd.A01("BaseFragmentActivity.onCreate", -447893372);
                    try {
                        setupColorTheme();
                        A0h();
                        setContentView(A0X());
                        this.A04 = AbstractC09440dt.A01(new C9EI(this, 44));
                        AbstractC09800fd.A01("BaseFragmentActivity.onInflateActionBar", -1343588759);
                        try {
                            if (!this.A06) {
                                InterfaceC09390do interfaceC09390do = this.A04;
                                if (interfaceC09390do == null) {
                                    C14360o3.A0F("actionBarServiceProvider");
                                    throw C00O.createAndThrow();
                                }
                                this.A02 = (C56352iT) interfaceC09390do.getValue();
                            }
                            AbstractC09800fd.A00(896739845);
                            super.onCreate(A002);
                            AbstractC18680vv session = getSession();
                            if (session != null && (window2 = getWindow()) != null && window2.getDecorView() != null && (findViewById2 = getWindow().getDecorView().findViewById(android.R.id.content)) != null) {
                                synchronized (this) {
                                    try {
                                        this.A0E = new ViewOnAttachStateChangeListenerC56972jY(findViewById2);
                                        if (C18U.A06(C06090Tz.A05, session, 36315666474601965L)) {
                                            WFS.A0E.A04(this, new C18920wW(C12180kM.A02, session), session, C3N3.A00(session), AbstractC33651Eu1.A00(session));
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        i3 = 1299380892;
                                        C0f9.A07(i3, A00);
                                        throw th;
                                    }
                                }
                            }
                            Configuration configuration = getResources().getConfiguration();
                            C14360o3.A07(configuration);
                            A0V(configuration);
                            this.mFragments.A00.A03.A0r(this.A0J);
                            A0j(A002);
                            this.A0D = new C57002jb((ViewStub) requireViewById(R.id.pixel_guide_stub), C17280tP.A00());
                            if (session != null && C18U.A06(C06090Tz.A05, session, 36312071587038089L)) {
                                C006802i c006802i2 = C006802i.A0p;
                                C14360o3.A07(c006802i2);
                                this.A0C = new C57022jd(c006802i2);
                            }
                            CGS();
                            if ((session instanceof UserSession) && (userSession2 = (UserSession) session) != null) {
                                C57242jz A003 = AbstractC57232jy.A00(userSession2);
                                C57112jm c57112jm = this.A0B;
                                if (c57112jm == null) {
                                    C14360o3.A0F("viperViewpointManager");
                                    throw C00O.createAndThrow();
                                }
                                A003.A00 = new WeakReference(c57112jm);
                            }
                            ?? r2 = new Object() { // from class: X.2k2
                                public final C48672Ll A00 = new C48672Ll(C12L.A00);

                                public final void A00(final Activity activity, C07X c07x) {
                                    if (C1AD.A06(C06090Tz.A05, 18301731821588485L)) {
                                        this.A00.A00(activity, c07x, new InterfaceC57292k4() { // from class: X.2k3
                                            @Override // X.InterfaceC57292k4
                                            public final void DVZ(C4PX c4px) {
                                                W4D w4d;
                                                String str;
                                                C14360o3.A0B(c4px, 0);
                                                Activity activity2 = activity;
                                                C4PZ A004 = C4PY.A00(c4px);
                                                C23099AGl c23099AGl = null;
                                                if (A004 != null) {
                                                    w4d = ((WTE) A004).A00;
                                                } else {
                                                    w4d = null;
                                                }
                                                AbstractC82683mW.A00 = String.valueOf(w4d);
                                                if (A004 != null) {
                                                    c23099AGl = A004.BZe();
                                                }
                                                AbstractC82673mV.A00 = String.valueOf(c23099AGl);
                                                AbstractC82693mX.A00 = Boolean.valueOf(activity2.isInMultiWindowMode());
                                                switch (AbstractC94954Pb.A01(activity2).intValue()) {
                                                    case 0:
                                                        str = "WIDE";
                                                        break;
                                                    case 1:
                                                        str = "SQUARISH";
                                                        break;
                                                    default:
                                                        str = "TALL";
                                                        break;
                                                }
                                                AbstractC82663mU.A00 = str;
                                            }
                                        }, false);
                                    }
                                }
                            };
                            this.A0G = r2;
                            r2.A00(this, this);
                            if (A002 != null) {
                                this.A0H = A002.getBoolean("BaseFragmentActivity.should_allow_rotation");
                            }
                            if (this.A0H) {
                                AbstractC52802bM.A00(this);
                            }
                            AbstractC09800fd.A00(1906932528);
                            if (Systrace.A0E(1L)) {
                                C0fO.A00(116447021);
                            }
                            c006802i.markerEnd(694558626, A03, (short) 2);
                        } catch (Throwable th2) {
                            th = th2;
                            AbstractC09800fd.A00(-1798023703);
                            i3 = -927139192;
                        }
                    } catch (Throwable th3) {
                        AbstractC09800fd.A00(-247713302);
                        C0f9.A07(-1731007547, A00);
                        throw th3;
                    }
                } catch (Throwable th4) {
                    if (Systrace.A0E(1L)) {
                        C0fO.A00(905115548);
                    }
                    C0f9.A07(-2135562991, A00);
                    throw th4;
                }
            } catch (Throwable th5) {
                try {
                    C0f9.A07(77320781, A00);
                    throw th5;
                } catch (Throwable th6) {
                    th = th6;
                    c006802i.markerEnd(694558626, A03, (short) 87);
                    i = -735848410;
                    C0f9.A07(i, A00);
                    throw th;
                }
            }
        } else {
            Bundle A004 = AbstractC58327PtK.A00(bundle);
            AbstractC09800fd.A01("BaseFragmentActivity.onCreate", -836071782);
            try {
                setupColorTheme();
                A0h();
                setContentView(A0X());
                this.A04 = AbstractC09440dt.A01(new C9EI(this, 44));
                AbstractC09800fd.A01("BaseFragmentActivity.onInflateActionBar", 1753183068);
                try {
                    if (!this.A06) {
                        InterfaceC09390do interfaceC09390do2 = this.A04;
                        if (interfaceC09390do2 == null) {
                            C14360o3.A0F("actionBarServiceProvider");
                            throw C00O.createAndThrow();
                        }
                        this.A02 = (C56352iT) interfaceC09390do2.getValue();
                    }
                    AbstractC09800fd.A00(-428310113);
                    super.onCreate(A004);
                    AbstractC18680vv session2 = getSession();
                    if (session2 != null && (window = getWindow()) != null && window.getDecorView() != null && (findViewById = getWindow().getDecorView().findViewById(android.R.id.content)) != null) {
                        synchronized (this) {
                            try {
                                this.A0E = new ViewOnAttachStateChangeListenerC56972jY(findViewById);
                                if (C18U.A06(C06090Tz.A05, session2, 36315666474601965L)) {
                                    WFS.A0E.A04(this, new C18920wW(C12180kM.A02, session2), session2, C3N3.A00(session2), AbstractC33651Eu1.A00(session2));
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                i2 = -907016705;
                                C0f9.A07(i2, A00);
                                throw th;
                            }
                        }
                    }
                    Configuration configuration2 = getResources().getConfiguration();
                    C14360o3.A07(configuration2);
                    A0V(configuration2);
                    this.mFragments.A00.A03.A0r(this.A0J);
                    A0j(A004);
                    this.A0D = new C57002jb((ViewStub) requireViewById(R.id.pixel_guide_stub), C17280tP.A00());
                    if (session2 != null && C18U.A06(C06090Tz.A05, session2, 36312071587038089L)) {
                        C006802i c006802i3 = C006802i.A0p;
                        C14360o3.A07(c006802i3);
                        this.A0C = new C57022jd(c006802i3);
                    }
                    CGS();
                    if ((session2 instanceof UserSession) && (userSession = (UserSession) session2) != null) {
                        C57242jz A005 = AbstractC57232jy.A00(userSession);
                        C57112jm c57112jm2 = this.A0B;
                        if (c57112jm2 == null) {
                            C14360o3.A0F("viperViewpointManager");
                            throw C00O.createAndThrow();
                        }
                        A005.A00 = new WeakReference(c57112jm2);
                    }
                    ?? r0 = new Object() { // from class: X.2k2
                        public final C48672Ll A00 = new C48672Ll(C12L.A00);

                        public final void A00(final Activity activity, C07X c07x) {
                            if (C1AD.A06(C06090Tz.A05, 18301731821588485L)) {
                                this.A00.A00(activity, c07x, new InterfaceC57292k4() { // from class: X.2k3
                                    @Override // X.InterfaceC57292k4
                                    public final void DVZ(C4PX c4px) {
                                        W4D w4d;
                                        String str;
                                        C14360o3.A0B(c4px, 0);
                                        Activity activity2 = activity;
                                        C4PZ A0042 = C4PY.A00(c4px);
                                        C23099AGl c23099AGl = null;
                                        if (A0042 != null) {
                                            w4d = ((WTE) A0042).A00;
                                        } else {
                                            w4d = null;
                                        }
                                        AbstractC82683mW.A00 = String.valueOf(w4d);
                                        if (A0042 != null) {
                                            c23099AGl = A0042.BZe();
                                        }
                                        AbstractC82673mV.A00 = String.valueOf(c23099AGl);
                                        AbstractC82693mX.A00 = Boolean.valueOf(activity2.isInMultiWindowMode());
                                        switch (AbstractC94954Pb.A01(activity2).intValue()) {
                                            case 0:
                                                str = "WIDE";
                                                break;
                                            case 1:
                                                str = "SQUARISH";
                                                break;
                                            default:
                                                str = "TALL";
                                                break;
                                        }
                                        AbstractC82663mU.A00 = str;
                                    }
                                }, false);
                            }
                        }
                    };
                    this.A0G = r0;
                    r0.A00(this, this);
                    if (A004 != null) {
                        this.A0H = A004.getBoolean("BaseFragmentActivity.should_allow_rotation");
                    }
                    if (this.A0H) {
                        AbstractC52802bM.A00(this);
                    }
                    AbstractC09800fd.A00(779879169);
                } catch (Throwable th8) {
                    th = th8;
                    AbstractC09800fd.A00(1189591248);
                    i2 = -1518758445;
                }
            } catch (Throwable th9) {
                th = th9;
                AbstractC09800fd.A00(-2092196963);
                i = 1444925805;
                C0f9.A07(i, A00);
                throw th;
            }
        }
        C0f9.A07(1609710156, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        int i;
        int A00 = C0f9.A00(-1127661587);
        String name = getClass().getName();
        C006802i c006802i = C006802i.A0p;
        if (c006802i != null) {
            int A03 = AbstractC50712Us.A01.A03();
            c006802i.markerStart(694558626, A03);
            c006802i.markerAnnotate(694558626, A03, "endpoint", C0L6.A00());
            c006802i.markerAnnotate(694558626, A03, "asl_session_id", C0L6.A01());
            c006802i.markerAnnotate(694558626, A03, "activityClass", AnonymousClass001.A0g("<cls>", name, "</cls>"));
            String name2 = BaseFragmentActivity.class.getName();
            c006802i.markerAnnotate(694558626, A03, "method_class", AnonymousClass001.A0g("<cls>", name2, "</cls>"));
            c006802i.markerAnnotate(694558626, A03, "operation_name", "onDestroy");
            try {
                String A0T = AnonymousClass001.A0T(name2, "onDestroy", '.');
                if (Systrace.A0E(1L)) {
                    C0fO.A01(A0T, -966313911);
                }
                try {
                    super.onDestroy();
                    synchronized (this) {
                        try {
                            this.A0A = null;
                        } catch (Throwable th) {
                            C0f9.A07(708735910, A00);
                            throw th;
                        }
                    }
                    if (C18U.A06(C06090Tz.A05, getSession(), 36330720335053799L)) {
                        this.A02 = null;
                    }
                    if (Systrace.A0E(1L)) {
                        C0fO.A00(391500929);
                    }
                    c006802i.markerEnd(694558626, A03, (short) 2);
                } catch (Throwable th2) {
                    if (Systrace.A0E(1L)) {
                        C0fO.A00(1484951552);
                    }
                    C0f9.A07(1120018031, A00);
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    C0f9.A07(-1281020207, A00);
                    throw th3;
                } catch (Throwable th4) {
                    th = th4;
                    c006802i.markerEnd(694558626, A03, (short) 87);
                    i = 1924454978;
                    C0f9.A07(i, A00);
                    throw th;
                }
            }
        } else {
            super.onDestroy();
            synchronized (this) {
                try {
                    this.A0A = null;
                } catch (Throwable th5) {
                    th = th5;
                    i = -1312980215;
                    C0f9.A07(i, A00);
                    throw th;
                }
            }
            if (C18U.A06(C06090Tz.A05, getSession(), 36330720335053799L)) {
                this.A02 = null;
            }
        }
        C0f9.A07(574213189, A00);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C57022jd c57022jd = this.A0C;
        if (c57022jd != null) {
            C72613Ni c72613Ni = c57022jd.A00;
            if (c72613Ni != null) {
                c72613Ni.A00();
            }
            c57022jd.A00 = null;
        }
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        int i;
        UserSession userSession;
        int i2;
        UserSession userSession2;
        int A00 = C0f9.A00(99066112);
        String name = getClass().getName();
        C006802i c006802i = C006802i.A0p;
        if (c006802i != null) {
            int A03 = AbstractC50712Us.A01.A03();
            c006802i.markerStart(694558626, A03);
            c006802i.markerAnnotate(694558626, A03, "endpoint", C0L6.A00());
            c006802i.markerAnnotate(694558626, A03, "asl_session_id", C0L6.A01());
            c006802i.markerAnnotate(694558626, A03, "activityClass", AnonymousClass001.A0g("<cls>", name, "</cls>"));
            String name2 = BaseFragmentActivity.class.getName();
            c006802i.markerAnnotate(694558626, A03, "method_class", AnonymousClass001.A0g("<cls>", name2, "</cls>"));
            c006802i.markerAnnotate(694558626, A03, "operation_name", "onPause");
            try {
                String A0T = AnonymousClass001.A0T(name2, "onPause", '.');
                if (Systrace.A0E(1L)) {
                    C0fO.A01(A0T, -1770846098);
                }
                try {
                    super.onPause();
                    C41451vu c41451vu = C41451vu.A01;
                    c41451vu.A03(this.A0U, C3KD.class);
                    c41451vu.A03(this.A0V, C3KE.class);
                    c41451vu.A03(this.A0O, C3KF.class);
                    c41451vu.A03(this.A0S, C3KG.class);
                    c41451vu.A03(this.A0W, C3KH.class);
                    c41451vu.A03(this.A0P, C3KI.class);
                    c41451vu.A03(this.A0T, C3KJ.class);
                    c41451vu.A03(this.A0R, C3KK.class);
                    AbstractC18680vv session = getSession();
                    if (session != null) {
                        synchronized (this) {
                            try {
                                ViewOnAttachStateChangeListenerC56972jY viewOnAttachStateChangeListenerC56972jY = this.A0E;
                                if (viewOnAttachStateChangeListenerC56972jY != null) {
                                    viewOnAttachStateChangeListenerC56972jY.A02();
                                }
                            } catch (Throwable th) {
                                th = th;
                                i2 = -1442534514;
                                C0f9.A07(i2, A00);
                                throw th;
                            }
                        }
                        AbstractC25651Mw.A00(session).A02(this.A0Q, C54I.class);
                    }
                    synchronized (this) {
                        try {
                            ViewOnAttachStateChangeListenerC56972jY viewOnAttachStateChangeListenerC56972jY2 = this.A0F;
                            if (viewOnAttachStateChangeListenerC56972jY2 != null) {
                                viewOnAttachStateChangeListenerC56972jY2.A02();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            i2 = 1797888698;
                            C0f9.A07(i2, A00);
                            throw th;
                        }
                    }
                    C3KL A0Y = A0Y();
                    if (A0Y != null) {
                        A0Y.A05(C05F.A01);
                    }
                    C57022jd c57022jd = this.A0C;
                    if (c57022jd != null) {
                        C72613Ni c72613Ni = c57022jd.A00;
                        if (c72613Ni != null) {
                            c72613Ni.A00();
                        }
                        C57042jf c57042jf = c57022jd.A02;
                        C14360o3.A0B(c57042jf, 0);
                        C3KN.A02.remove(c57042jf);
                    }
                    if (C18U.A06(C06090Tz.A05, getSession(), 36315181144869980L) && (session instanceof UserSession) && (userSession2 = (UserSession) session) != null) {
                        AbstractC57232jy.A00(userSession2).A05();
                    }
                    if (Systrace.A0E(1L)) {
                        C0fO.A00(1601902837);
                    }
                    c006802i.markerEnd(694558626, A03, (short) 2);
                } catch (Throwable th3) {
                    if (Systrace.A0E(1L)) {
                        C0fO.A00(-254572362);
                    }
                    C0f9.A07(1706362663, A00);
                    throw th3;
                }
            } catch (Throwable th4) {
                try {
                    C0f9.A07(418180014, A00);
                    throw th4;
                } catch (Throwable th5) {
                    th = th5;
                    c006802i.markerEnd(694558626, A03, (short) 87);
                    i = 1611648841;
                    C0f9.A07(i, A00);
                    throw th;
                }
            }
        } else {
            super.onPause();
            C41451vu c41451vu2 = C41451vu.A01;
            c41451vu2.A03(this.A0U, C3KD.class);
            c41451vu2.A03(this.A0V, C3KE.class);
            c41451vu2.A03(this.A0O, C3KF.class);
            c41451vu2.A03(this.A0S, C3KG.class);
            c41451vu2.A03(this.A0W, C3KH.class);
            c41451vu2.A03(this.A0P, C3KI.class);
            c41451vu2.A03(this.A0T, C3KJ.class);
            c41451vu2.A03(this.A0R, C3KK.class);
            AbstractC18680vv session2 = getSession();
            if (session2 != null) {
                synchronized (this) {
                    try {
                        ViewOnAttachStateChangeListenerC56972jY viewOnAttachStateChangeListenerC56972jY3 = this.A0E;
                        if (viewOnAttachStateChangeListenerC56972jY3 != null) {
                            viewOnAttachStateChangeListenerC56972jY3.A02();
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        i = -32842549;
                        C0f9.A07(i, A00);
                        throw th;
                    }
                }
                AbstractC25651Mw.A00(session2).A02(this.A0Q, C54I.class);
            }
            synchronized (this) {
                try {
                    ViewOnAttachStateChangeListenerC56972jY viewOnAttachStateChangeListenerC56972jY4 = this.A0F;
                    if (viewOnAttachStateChangeListenerC56972jY4 != null) {
                        viewOnAttachStateChangeListenerC56972jY4.A02();
                    }
                } catch (Throwable th7) {
                    th = th7;
                    i = 1757113805;
                    C0f9.A07(i, A00);
                    throw th;
                }
            }
            C3KL A0Y2 = A0Y();
            if (A0Y2 != null) {
                A0Y2.A05(C05F.A01);
            }
            C57022jd c57022jd2 = this.A0C;
            if (c57022jd2 != null) {
                C72613Ni c72613Ni2 = c57022jd2.A00;
                if (c72613Ni2 != null) {
                    c72613Ni2.A00();
                }
                C57042jf c57042jf2 = c57022jd2.A02;
                C14360o3.A0B(c57042jf2, 0);
                C3KN.A02.remove(c57042jf2);
            }
            if (C18U.A06(C06090Tz.A05, getSession(), 36315181144869980L) && (session2 instanceof UserSession) && (userSession = (UserSession) session2) != null) {
                AbstractC57232jy.A00(userSession).A05();
            }
        }
        C0f9.A07(-1984118016, A00);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPostResume() {
        A0f();
        super.onPostResume();
        A0g();
        C226218q.A01(AbstractC12960li.A00).A0G();
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        int i;
        UserSession userSession;
        UserSession userSession2;
        int i2;
        UserSession userSession3;
        UserSession userSession4;
        int A00 = C0f9.A00(-278735019);
        String name = getClass().getName();
        C006802i c006802i = C006802i.A0p;
        if (c006802i != null) {
            int A03 = AbstractC50712Us.A01.A03();
            c006802i.markerStart(694558626, A03);
            c006802i.markerAnnotate(694558626, A03, "endpoint", C0L6.A00());
            c006802i.markerAnnotate(694558626, A03, "asl_session_id", C0L6.A01());
            c006802i.markerAnnotate(694558626, A03, "activityClass", AnonymousClass001.A0g("<cls>", name, "</cls>"));
            String name2 = BaseFragmentActivity.class.getName();
            c006802i.markerAnnotate(694558626, A03, "method_class", AnonymousClass001.A0g("<cls>", name2, "</cls>"));
            c006802i.markerAnnotate(694558626, A03, "operation_name", "onResume");
            try {
                String A0T = AnonymousClass001.A0T(name2, "onResume", '.');
                if (Systrace.A0E(1L)) {
                    C0fO.A01(A0T, 1886615718);
                }
                try {
                    super.onResume();
                    A0a();
                    C41451vu c41451vu = C41451vu.A01;
                    c41451vu.A02(this.A0U, C3KD.class);
                    c41451vu.A02(this.A0V, C3KE.class);
                    c41451vu.A02(this.A0O, C3KF.class);
                    c41451vu.A02(this.A0S, C3KG.class);
                    c41451vu.A02(this.A0W, C3KH.class);
                    c41451vu.A02(this.A0P, C3KI.class);
                    c41451vu.A02(this.A0T, C3KJ.class);
                    c41451vu.A02(this.A0R, C3KK.class);
                    AbstractC18680vv session = getSession();
                    if (session != null) {
                        synchronized (this) {
                            try {
                                ViewOnAttachStateChangeListenerC56972jY viewOnAttachStateChangeListenerC56972jY = this.A0E;
                                if (viewOnAttachStateChangeListenerC56972jY != null) {
                                    viewOnAttachStateChangeListenerC56972jY.A01();
                                }
                            } catch (Throwable th) {
                                th = th;
                                i2 = 1301562503;
                                C0f9.A07(i2, A00);
                                throw th;
                            }
                        }
                    }
                    synchronized (this) {
                        try {
                            ViewOnAttachStateChangeListenerC56972jY viewOnAttachStateChangeListenerC56972jY2 = this.A0F;
                            if (viewOnAttachStateChangeListenerC56972jY2 != null) {
                                viewOnAttachStateChangeListenerC56972jY2.A01();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            i2 = -1000855531;
                            C0f9.A07(i2, A00);
                            throw th;
                        }
                    }
                    AbstractC18680vv session2 = getSession();
                    C06090Tz c06090Tz = C06090Tz.A05;
                    if (C18U.A06(c06090Tz, session2, 36315181144542298L)) {
                        CGS();
                        if ((session instanceof UserSession) && (userSession4 = (UserSession) session) != null) {
                            C57242jz A002 = AbstractC57232jy.A00(userSession4);
                            C57112jm c57112jm = this.A0B;
                            if (c57112jm == null) {
                                C14360o3.A0F("viperViewpointManager");
                                throw C00O.createAndThrow();
                            }
                            A002.A00 = new WeakReference(c57112jm);
                        }
                    }
                    A0i();
                    C19700xy c19700xy = C17280tP.A4E;
                    C17280tP A003 = c19700xy.A00();
                    if (A003.A0g()) {
                        DA3(A003);
                    }
                    if (A003.A0K()) {
                        E20(A003);
                    }
                    A0W(this, A003, false);
                    if (!c19700xy.A00().A0O() && !c19700xy.A00().A0P()) {
                        c19700xy.A00().A0Q();
                    }
                    if (session != null) {
                        if ((session instanceof UserSession) && C1C0.A00((UserSession) session)) {
                            A0k(session);
                        }
                        if (A003.A0T()) {
                            AbstractC25651Mw.A00(session).A01(this.A0Q, C54I.class);
                        }
                    }
                    C3KL A0Y = A0Y();
                    if (A0Y != null) {
                        A0Y.A05(C05F.A00);
                    }
                    C57022jd c57022jd = this.A0C;
                    if (c57022jd != null) {
                        C57042jf c57042jf = c57022jd.A02;
                        C14360o3.A0B(c57042jf, 0);
                        List list = C3KN.A02;
                        if (!list.contains(c57042jf)) {
                            list.add(c57042jf);
                        }
                    }
                    if (C18U.A06(c06090Tz, getSession(), 36315181144869980L) && (session instanceof UserSession) && (userSession3 = (UserSession) session) != null) {
                        AbstractC57232jy.A00(userSession3).A04();
                    }
                    A0U();
                    if (Systrace.A0E(1L)) {
                        C0fO.A00(-1530973069);
                    }
                    c006802i.markerEnd(694558626, A03, (short) 2);
                } catch (Throwable th3) {
                    if (Systrace.A0E(1L)) {
                        C0fO.A00(-1300633109);
                    }
                    C0f9.A07(1543365632, A00);
                    throw th3;
                }
            } catch (Throwable th4) {
                try {
                    C0f9.A07(-1547005445, A00);
                    throw th4;
                } catch (Throwable th5) {
                    th = th5;
                    c006802i.markerEnd(694558626, A03, (short) 87);
                    i = 1706688560;
                    C0f9.A07(i, A00);
                    throw th;
                }
            }
        } else {
            super.onResume();
            A0a();
            C41451vu c41451vu2 = C41451vu.A01;
            c41451vu2.A02(this.A0U, C3KD.class);
            c41451vu2.A02(this.A0V, C3KE.class);
            c41451vu2.A02(this.A0O, C3KF.class);
            c41451vu2.A02(this.A0S, C3KG.class);
            c41451vu2.A02(this.A0W, C3KH.class);
            c41451vu2.A02(this.A0P, C3KI.class);
            c41451vu2.A02(this.A0T, C3KJ.class);
            c41451vu2.A02(this.A0R, C3KK.class);
            AbstractC18680vv session3 = getSession();
            if (session3 != null) {
                synchronized (this) {
                    try {
                        ViewOnAttachStateChangeListenerC56972jY viewOnAttachStateChangeListenerC56972jY3 = this.A0E;
                        if (viewOnAttachStateChangeListenerC56972jY3 != null) {
                            viewOnAttachStateChangeListenerC56972jY3.A01();
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        i = -434062451;
                        C0f9.A07(i, A00);
                        throw th;
                    }
                }
            }
            synchronized (this) {
                try {
                    ViewOnAttachStateChangeListenerC56972jY viewOnAttachStateChangeListenerC56972jY4 = this.A0F;
                    if (viewOnAttachStateChangeListenerC56972jY4 != null) {
                        viewOnAttachStateChangeListenerC56972jY4.A01();
                    }
                } catch (Throwable th7) {
                    th = th7;
                    i = 1831300246;
                    C0f9.A07(i, A00);
                    throw th;
                }
            }
            AbstractC18680vv session4 = getSession();
            C06090Tz c06090Tz2 = C06090Tz.A05;
            if (C18U.A06(c06090Tz2, session4, 36315181144542298L)) {
                CGS();
                if ((session3 instanceof UserSession) && (userSession2 = (UserSession) session3) != null) {
                    C57242jz A004 = AbstractC57232jy.A00(userSession2);
                    C57112jm c57112jm2 = this.A0B;
                    if (c57112jm2 == null) {
                        C14360o3.A0F("viperViewpointManager");
                        throw C00O.createAndThrow();
                    }
                    A004.A00 = new WeakReference(c57112jm2);
                }
            }
            A0i();
            C19700xy c19700xy2 = C17280tP.A4E;
            C17280tP A005 = c19700xy2.A00();
            if (A005.A0g()) {
                DA3(A005);
            }
            if (A005.A0K()) {
                E20(A005);
            }
            A0W(this, A005, false);
            if (!c19700xy2.A00().A0O() && !c19700xy2.A00().A0P()) {
                c19700xy2.A00().A0Q();
            }
            if (session3 != null) {
                if ((session3 instanceof UserSession) && C1C0.A00((UserSession) session3)) {
                    A0k(session3);
                }
                if (A005.A0T()) {
                    AbstractC25651Mw.A00(session3).A01(this.A0Q, C54I.class);
                }
            }
            C3KL A0Y2 = A0Y();
            if (A0Y2 != null) {
                A0Y2.A05(C05F.A00);
            }
            C57022jd c57022jd2 = this.A0C;
            if (c57022jd2 != null) {
                C57042jf c57042jf2 = c57022jd2.A02;
                C14360o3.A0B(c57042jf2, 0);
                List list2 = C3KN.A02;
                if (!list2.contains(c57042jf2)) {
                    list2.add(c57042jf2);
                }
            }
            if (C18U.A06(c06090Tz2, getSession(), 36315181144869980L) && (session3 instanceof UserSession) && (userSession = (UserSession) session3) != null) {
                AbstractC57232jy.A00(userSession).A04();
            }
            A0U();
        }
        C0f9.A07(-667573133, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        int A00 = C0f9.A00(-1611647604);
        String name = getClass().getName();
        C006802i c006802i = C006802i.A0p;
        if (c006802i != null) {
            int A03 = AbstractC50712Us.A01.A03();
            c006802i.markerStart(694558626, A03);
            c006802i.markerAnnotate(694558626, A03, "endpoint", C0L6.A00());
            c006802i.markerAnnotate(694558626, A03, "asl_session_id", C0L6.A01());
            c006802i.markerAnnotate(694558626, A03, "activityClass", AnonymousClass001.A0g("<cls>", name, "</cls>"));
            String name2 = BaseFragmentActivity.class.getName();
            c006802i.markerAnnotate(694558626, A03, "method_class", AnonymousClass001.A0g("<cls>", name2, "</cls>"));
            c006802i.markerAnnotate(694558626, A03, "operation_name", "onStop");
            try {
                String A0T = AnonymousClass001.A0T(name2, "onStop", '.');
                if (Systrace.A0E(1L)) {
                    C0fO.A01(A0T, 1665974958);
                }
                try {
                    super.onStop();
                    Fragment A0O = this.mFragments.A00.A03.A0O(R.id.layout_container_main);
                    if (A0O != null) {
                        AbstractC110034xX.A00(A0O);
                    }
                    C3KL A0Y = A0Y();
                    if (A0Y != null) {
                        A0Y.A05(C05F.A0C);
                    }
                    if (Systrace.A0E(1L)) {
                        C0fO.A00(2117513814);
                    }
                    c006802i.markerEnd(694558626, A03, (short) 2);
                } catch (Throwable th) {
                    if (Systrace.A0E(1L)) {
                        C0fO.A00(-1058336110);
                    }
                    C0f9.A07(1164961606, A00);
                    throw th;
                }
            } finally {
            }
        } else {
            super.onStop();
            Fragment A0O2 = this.mFragments.A00.A03.A0O(R.id.layout_container_main);
            if (A0O2 != null) {
                AbstractC110034xX.A00(A0O2);
            }
            C3KL A0Y2 = A0Y();
            if (A0Y2 != null) {
                A0Y2.A05(C05F.A0C);
            }
        }
        C0f9.A07(-2142323604, A00);
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void onAttachFragment(Fragment fragment) {
        A0d();
    }
}
