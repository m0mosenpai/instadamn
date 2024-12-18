package X;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.facebook.R;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.PollType;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsViewerDirectData;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.save.api.SaveApiUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2od, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C59952od extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60082oq, InterfaceC60092or, InterfaceC11480j6, InterfaceC60102os, InterfaceC60112ot, InterfaceC60132ov, InterfaceC60142ow, InterfaceC60152ox, InterfaceC60162oy, InterfaceC60172oz, InterfaceC60182p1, InterfaceC60192p2, InterfaceC60212p4, InterfaceC53912dV, InterfaceC60222p5, InterfaceC60232p6 {
    public static final String __redex_internal_original_name = "ClipsViewerFragment";
    public long A00;
    public SwipeRefreshLayout A01;
    public C62862tP A02;
    public InterfaceC43434JGy A03;
    public C9IC A04;
    public C37840Gku A05;
    public C31349DqE A06;
    public C37596Ggr A07;
    public C37563GgJ A08;
    public C37540Gfw A09;
    public C37628GhN A0A;
    public C37601Ggw A0B;
    public C37546Gg2 A0C;
    public C37598Ggt A0D;
    public C37562GgI A0E;
    public C37555GgB A0F;
    public C37559GgF A0G;
    public C37617GhC A0H;
    public C37578GgZ A0I;
    public IN9 A0J;
    public C41217IMg A0K;
    public C37599Ggu A0L;
    public C37576GgX A0M;
    public C37556GgC A0N;
    public String A0O;
    public boolean A0P;
    public int A0Q;
    public long A0R;
    public Bundle A0S;
    public InterfaceC41501vz A0T;
    public InterfaceC41501vz A0U;
    public C3MJ A0V;
    public C3MT A0W;
    public C3I9 A0X;
    public C62882tR A0Y;
    public C32S A0Z;
    public C676533f A0a;
    public C37595Ggq A0b;
    public C37626GhL A0c;
    public C37629GhO A0d;
    public C37594Ggp A0e;
    public BKT A0f;
    public C37812GkR A0g;
    public C31410DrF A0h;
    public C41699IdS A0i;
    public C37627GhM A0j;
    public C49801Lz8 A0k;
    public final InterfaceC41501vz A0l;
    public final InterfaceC09390do A0m;
    public final InterfaceC09390do A0n;
    public final InterfaceC09390do A0o;
    public final InterfaceC09390do A0p;
    public final InterfaceC09390do A0q;
    public final InterfaceC09390do A0r;
    public final InterfaceC09390do A0s;
    public final InterfaceC09390do A0t;
    public final InterfaceC09390do A0u;
    public final InterfaceC09390do A0v;
    public final InterfaceC09390do A0w;
    public final InterfaceC09390do A0x;
    public final InterfaceC09390do A0y;
    public final InterfaceC09390do A0z;
    public final InterfaceC09390do A10;
    public final InterfaceC09390do A11;
    public final InterfaceC09390do A12;
    public final InterfaceC09390do A13;
    public final InterfaceC09390do A14;
    public final InterfaceC09390do A15;
    public final InterfaceC09390do A16;
    public final InterfaceC09390do A17;
    public final InterfaceC09390do A18;
    public final InterfaceC09390do A19;
    public final InterfaceC09390do A1A;
    public final InterfaceC09390do A1B;
    public final InterfaceC09390do A1C;
    public final InterfaceC09390do A1D;
    public final InterfaceC09390do A1E;
    public final InterfaceC09390do A1F;
    public final InterfaceC09390do A1G;
    public final InterfaceC41501vz A1H;
    public final InterfaceC12870lZ A1I;
    public final EnumC60772q1 A1J;
    public final ILF A1K;
    public final InterfaceC09390do A1L;
    public final InterfaceC09390do A1M = AbstractC60492pY.A02(this);
    public final boolean A1N;

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0141, code lost:
    
        if (r7 > (X.C18U.A01(r3, r2, 36609626922883011L) * 1000)) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x015f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A05() {
        /*
            Method dump skipped, instructions count: 631
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59952od.A05():void");
    }

    private final void A07() {
        UserSession A01 = A01(this);
        C37624GhJ A0O = A0O();
        ClipsViewerConfig A00 = A00(this);
        C37556GgC c37556GgC = this.A0N;
        String str = "clipsViewerViewPager";
        if (c37556GgC != null) {
            ILF ilf = this.A1K;
            List list = (List) this.A13.getValue();
            C37562GgI c37562GgI = this.A0E;
            if (c37562GgI == null) {
                str = "clipsAutoScrollController";
            } else {
                C37540Gfw c37540Gfw = this.A09;
                if (c37540Gfw == null) {
                    str = "clipsViewerFragmentViewModel";
                } else {
                    C37628GhN c37628GhN = new C37628GhN(A00, A01, (AbstractC39700HjW) ((C25363BKg) this.A14.getValue()).A07.getValue(), ilf, this, c37540Gfw, c37562GgI, c37556GgC, A0O, list);
                    this.A0A = c37628GhN;
                    C37626GhL c37626GhL = this.A0c;
                    if (c37626GhL != null) {
                        c37626GhL.A00 = c37628GhN;
                    }
                    C37629GhO c37629GhO = new C37629GhO(c37628GhN);
                    this.A0d = c37629GhO;
                    C37556GgC c37556GgC2 = this.A0N;
                    if (c37556GgC2 != null) {
                        c37556GgC2.A02 = c37629GhO;
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC60172oz
    public final boolean CVP() {
        return false;
    }

    @Override // X.InterfaceC60142ow
    public final void D2E(C38321qM c38321qM) {
    }

    @Override // X.InterfaceC60082oq
    public final /* synthetic */ void DBx() {
    }

    @Override // X.InterfaceC60082oq
    public final /* synthetic */ void DBz() {
    }

    @Override // X.InterfaceC60082oq
    public final /* synthetic */ void DCN() {
    }

    @Override // X.InterfaceC60152ox
    public final void DOK(int i, boolean z) {
    }

    @Override // X.InterfaceC60082oq
    public final /* synthetic */ void DhK() {
    }

    @Override // X.InterfaceC60142ow
    public final void Dlc(C38321qM c38321qM) {
    }

    @Override // X.InterfaceC60082oq
    public final /* synthetic */ boolean DmT(MotionEvent motionEvent) {
        return false;
    }

    @Override // X.InterfaceC60082oq
    public final /* synthetic */ boolean Eis(MotionEvent motionEvent) {
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0416, code lost:
    
        if (r15 == com.instagram.clips.intf.ClipsViewerSource.A0p) goto L198;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:88:0x019e. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a7  */
    @Override // X.InterfaceC60122ou
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void configureActionBar(X.InterfaceC56362iU r32) {
        /*
            Method dump skipped, instructions count: 1442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59952od.configureActionBar(X.2iU):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        C14360o3.A0B(context, 0);
        super.onAttach(context);
        this.A0J = new IN9();
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        C14360o3.A0B(configuration, 0);
        super.onConfigurationChanged(configuration);
        if (AbstractC52812bN.A02(AbstractC52892bV.A00(configuration.screenWidthDp))) {
            AbstractC57322k7.A05(requireActivity(), A01(this), AbstractC53242c7.A0H(getContext(), R.attr.igds_color_clips_tab_bar_icon));
        }
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        Animation A01 = AbstractC140796Yh.A01(this, i2, z, false);
        if (A01 != null) {
            A01.setAnimationListener(new MVX(this, z));
            return A01;
        }
        return null;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        C14360o3.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        C37556GgC c37556GgC = this.A0N;
        String str = "clipsViewerViewPager";
        String str2 = null;
        if (c37556GgC != null) {
            bundle.putInt("ClipsViewerFragment.SAVED_VIEW_PAGER_OFFSET_STATE", c37556GgC.A03());
        }
        bundle.putLong("ClipsViewerFragment.SAVED_CLIPS_TAB_LAST_EXIT_TIME_MS", this.A00);
        if (A0J()) {
            UserSession A01 = A01(this);
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, A01, 36325845548676551L)) {
                C37540Gfw c37540Gfw = this.A09;
                if (c37540Gfw == null) {
                    str = "clipsViewerFragmentViewModel";
                } else {
                    Object[] array = A03(false).toArray(new String[0]);
                    C14360o3.A0B(array, 0);
                    AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, new C57153PYx(array, c37540Gfw, (InterfaceC23621Ds) null, 17), AnonymousClass194.A02(C12L.A00.CPG(480314591, 3)));
                    C37546Gg2 c37546Gg2 = this.A0C;
                    if (c37546Gg2 == null) {
                        str = "viewerAdapter";
                    } else {
                        bundle.putInt("ClipsViewerFragment.SAVED_CLIPS_VIEWER_LIST_SIZE", c37546Gg2.A0A.A0B());
                        C37556GgC c37556GgC2 = this.A0N;
                        if (c37556GgC2 != null) {
                            C120985dq A08 = c37556GgC2.A08();
                            if (A08 != null) {
                                str2 = A08.getId();
                            }
                            bundle.putString("ClipsViewerFragment.SAVED_CLIPS_VIEWER_ITEM_ID", str2);
                            return;
                        }
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            String[] strArr = (String[]) A03(true).toArray(new String[0]);
            int i = 0;
            for (String str3 : strArr) {
                i += str3.length() * 2;
            }
            if (i <= C18U.A01(c06090Tz, A01(this), 36607320525444692L)) {
                bundle.putInt("ClipsViewerFragment.SAVED_VIEW_PAGER_OFFSET_STATE", 0);
                bundle.putStringArray("ClipsViewerFragment.SAVED_CLIPS_VIEWER_ITEM_LIST", strArr);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:259:0x067d, code lost:
    
        if (r1.A0T() == false) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x0b6c, code lost:
    
        if (r5 == null) goto L460;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x0b89, code lost:
    
        if (r2.A0C.BEO() == null) goto L469;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x0b8b, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x0b8c, code lost:
    
        if (r14 != false) goto L470;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x0b8f, code lost:
    
        r14 = r11.A0A;
        r15 = r1.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x0b93, code lost:
    
        if (r15 != null) goto L473;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x0b95, code lost:
    
        r16 = "clipsViewManipulator";
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x0b99, code lost:
    
        r24 = new X.C43030J0v(r2, r6, r2, r2, r10, r1.A0F, r15, r11.A0E);
        r4 = r11.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x0bb2, code lost:
    
        if (r7 == null) goto L476;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x0bb4, code lost:
    
        r7.A00(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x0bb7, code lost:
    
        X.AbstractC41772Ieo.A07(r2, r9, "webclick", r5.CHN());
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x0bc4, code lost:
    
        if (X.C86833tv.A05(r6, r2) == false) goto L526;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x0bc6, code lost:
    
        r12 = new X.SX4(r6, r2, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x0bd1, code lost:
    
        if (r5 == false) goto L525;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x0bd3, code lost:
    
        r7 = X.C2Fb.A2U;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x0bd5, code lost:
    
        r9 = r10.getPosition();
        r15 = r10.A03;
        r11 = r7.toString();
        X.C14360o3.A0B(r11, 6);
        r34 = null;
        r32 = null;
        r33 = null;
        r28 = null;
        r29 = null;
        r42 = 0;
        r10 = X.AbstractC41071vF.A07(r6, r2);
        r35 = r2.A3B(r9);
        r40 = r2.getId();
        r39 = r5.BMm();
        r41 = r2.CAR();
        r30 = X.AbstractC41071vF.A09(r6, r2);
        r7 = r2.A2E(r6);
        r50 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x0c0d, code lost:
    
        if (r7 == null) goto L498;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x0c0f, code lost:
    
        r34 = r7.getUsername();
        r32 = r7.A03.getFbidV2();
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x0c1d, code lost:
    
        if (r7.A2N() != false) goto L486;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x0c1f, code lost:
    
        r33 = r7.getId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x0c23, code lost:
    
        r28 = r7.Bhu();
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x0c27, code lost:
    
        if (r35 == null) goto L494;
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x0c2d, code lost:
    
        if (r2.A5M() == false) goto L494;
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x0c2f, code lost:
    
        r8 = r2.A1e(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x0c33, code lost:
    
        if (r8 == null) goto L494;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x0c35, code lost:
    
        r29 = r8.A1q(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x0c3b, code lost:
    
        if (r29 != null) goto L495;
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x0c43, code lost:
    
        r5 = r7.A03.B7S();
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x0c49, code lost:
    
        if (r5 == null) goto L498;
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x0c4b, code lost:
    
        r42 = r5.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x0c3d, code lost:
    
        r29 = r2.A1q(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x0c4f, code lost:
    
        r47 = X.AbstractC75103Za.A0H(r6, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x0c57, code lost:
    
        if (r2.A5v() != false) goto L502;
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x0c5d, code lost:
    
        if (r2.A5m() == false) goto L503;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x0c61, code lost:
    
        r49 = r2.A5w();
        r51 = r2.A6M();
        r48 = r2.A5t();
        r52 = r2.A6O();
        r13 = new X.C53022Ncu();
        r13.setArguments(X.AbstractC38578Gxh.A00(r6, r28, r29, r30, r10, r32, r33, r34, r35, r11, null, null, r39, r40, r41, r42, r9, r15, true, false, r47, r48, r49, r50, r51, r52));
        r39 = 0.0f;
        r35 = 0.0d;
        r53 = 1023;
        r10 = X.AbstractC06930Yk.A06(new X.C09530e4(4, new X.C27292C2y(r22, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, r35, r35, r39, r53, r3)), new X.C09530e4(3, new X.C27291C2x(null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, r35, r35, r39, r53, r3)), new X.C09530e4(2, new X.C27290C2w(null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, r35, r35, r39, 2047, r3, r3)));
        X.C14360o3.A0B(r10, 2);
        r5 = new X.TH2(new X.J0X(r1), r24);
        r2 = r12.A01;
        r2.add(r5);
        r2.add(r13);
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x0d16, code lost:
    
        if (r10.containsKey(2) == false) goto L524;
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x0d18, code lost:
    
        r5 = r10.get(2);
        X.C14360o3.A0C(r5, "null cannot be cast to non-null type com.instagram.watchandbrowse.model.FullScreenDestinationSheetState");
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x0d29, code lost:
    
        if (((X.C27290C2w) r5).A02 != 1.0f) goto L524;
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x0d2b, code lost:
    
        r10.get(3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x0d32, code lost:
    
        if ((r2 instanceof android.app.Activity) == false) goto L538;
     */
    /* JADX WARN: Code restructure failed: missing block: B:452:0x0d34, code lost:
    
        r2 = (android.app.Activity) r2;
        r2 = new X.C189448aO(r6);
        r2.A0a = java.lang.Boolean.valueOf(r11);
        r2.A1H = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x0d4b, code lost:
    
        if (r10.containsKey(2) == false) goto L512;
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x0d4d, code lost:
    
        X.C14360o3.A0C(r10.get(2), "null cannot be cast to non-null type com.instagram.watchandbrowse.model.FullScreenDestinationSheetState");
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x0d56, code lost:
    
        r2.A1A = false;
        r5 = (X.CAT) r10.get(3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x0d5e, code lost:
    
        if (r5 == null) goto L523;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x0d60, code lost:
    
        r5 = r5.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x0d64, code lost:
    
        r2.A03 = r5;
        r10.get(3);
        r2.A1O = false;
        r2.A0q = true;
        r2.A0k = false;
        r2.A1F = true;
        r2.A1M = true;
        r2.A1L = true;
        r2.A18 = true;
        r2.A1Q = true;
        r2.A1P = true;
        r2.A1I = true;
        r2.A11 = true;
        r2.A1R = true;
        r5 = r12.A00;
        r2.A0U = r5;
        r2.A0s = r10.containsKey(4);
        r4 = (X.CAT) r10.get(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x0d91, code lost:
    
        if (r4 == null) goto L522;
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x0d93, code lost:
    
        r4 = r4.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:461:0x0d97, code lost:
    
        r2.A01 = r4;
        r2.A0X = r5;
        r2.A00().A02(r2, r13);
        r4 = r12.A02.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:463:0x0dae, code lost:
    
        if (r4.hasNext() == false) goto L730;
     */
    /* JADX WARN: Code restructure failed: missing block: B:464:0x0db0, code lost:
    
        r4.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:466:0x0db4, code lost:
    
        r4 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x0db6, code lost:
    
        r5 = new X.C27291C2x(null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, r35, r35, r39, r53, r3).A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:468:0x0e59, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x0e5a, code lost:
    
        r1.A03 = r10;
        r1.A0G.A0B();
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:0x0dc4, code lost:
    
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:471:0x0c5f, code lost:
    
        r50 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:472:0x0dc7, code lost:
    
        r7 = X.C2Fb.A2T;
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x0dcb, code lost:
    
        r10 = true;
        r12 = X.AbstractC41772Ieo.A01(r2, r5, r9, r13);
        r12.A0z = true;
        r12.A0Z = true;
        r12.A0F = new X.J0R(r8);
        r12.A0J = r24;
        r12.A0G = new X.J0X(r1);
        r12.A18 = true;
        r13 = r11.A0H;
        r12.A0k = r13;
        r12.A01 = r11.A03;
        r12.A0c = false;
        r12.A0y = r11.A0L;
        r12.A11 = true;
        r12.A0g = r14;
        r12.A03 = r4;
        r12.A12 = true;
        r12.A13 = true;
        r12.A15 = true;
        r12.A1B = true;
        r12.A0q = true;
        r5 = r11.A0I;
        r4 = X.RiS.WATCH_WITH_OVERLAY;
        r12.A0s = r5;
        r12.A09 = r4;
        r12.A0x = r11.A0K;
        r9 = r11.A0C;
        r12.A0i = r9;
        r12.A0e = r11.A0G;
        r12.A0I = new X.C43023J0o(r11, r2, r1);
        r12.A16 = r9;
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x0e28, code lost:
    
        if (r11.A07 != X.C05F.A01) goto L529;
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x0e2a, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:476:0x0e2b, code lost:
    
        r12.A1A = r2;
        r12.A0K = r7;
        r12.A17 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x0e35, code lost:
    
        if (r11.A0F == false) goto L532;
     */
    /* JADX WARN: Code restructure failed: missing block: B:478:0x0e37, code lost:
    
        r12.A1F = new int[]{com.facebook.R.anim.fragment_slide_left_enter, com.facebook.R.anim.fragment_slide_left_exit, com.facebook.R.anim.fragment_slide_right_enter, com.facebook.R.anim.fragment_slide_right_exit};
     */
    /* JADX WARN: Code restructure failed: missing block: B:479:0x0e49, code lost:
    
        if (r9 == false) goto L537;
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:0x0e4b, code lost:
    
        if (r13 == false) goto L536;
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x0e4d, code lost:
    
        r12.A04 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x0e4f, code lost:
    
        r12.A0A();
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x0e53, code lost:
    
        r12.A04 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x0e56, code lost:
    
        r12.A04 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x0b8e, code lost:
    
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x0b79, code lost:
    
        if (r5 == null) goto L462;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x0e92, code lost:
    
        if (r12 == null) goto L462;
     */
    /* JADX WARN: Code restructure failed: missing block: B:600:0x110a, code lost:
    
        if (r14.A0B != true) goto L651;
     */
    /* JADX WARN: Code restructure failed: missing block: B:601:0x1110, code lost:
    
        r23 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:602:0x1114, code lost:
    
        if (r14.A0F == true) goto L656;
     */
    /* JADX WARN: Code restructure failed: missing block: B:603:0x1116, code lost:
    
        r23 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:604:0x1118, code lost:
    
        X.C14360o3.A0B(r15, 0);
        X.C14360o3.A0B(r2, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:605:0x111f, code lost:
    
        if (r25 != null) goto L664;
     */
    /* JADX WARN: Code restructure failed: missing block: B:606:0x1121, code lost:
    
        X.C0K8.A0D("WatchAndBrowseUtil", "iabHeightRatio is null");
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:607:0x1129, code lost:
    
        r9.A0L = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:608:0x112b, code lost:
    
        if (r1 == false) goto L579;
     */
    /* JADX WARN: Code restructure failed: missing block: B:609:0x112d, code lost:
    
        r25 = r1.A02();
     */
    /* JADX WARN: Code restructure failed: missing block: B:610:0x1131, code lost:
    
        if (r25 == null) goto L676;
     */
    /* JADX WARN: Code restructure failed: missing block: B:611:0x1133, code lost:
    
        r29 = X.C2Fb.A2S.toString();
        r4 = new X.C5SE(r2, r7, r8.A06());
        r1 = r10.A00;
        r27 = java.lang.Float.valueOf(-1.0f);
        X.C32U.A0L(r2, r4, r25, r1, r27, r27, r29, "webclick", r31, r1, X.AbstractC75103Za.A09(r6, r8), X.AbstractC75103Za.A0A(r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:613:0x11db, code lost:
    
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:614:0x1163, code lost:
    
        r1 = new X.C63397SjR(r15, r2, X.C2Fb.A4F, r31, false);
        r1.A0z = true;
        r1.A0c = false;
        r1.A03 = r25.floatValue();
        r1.A0G = r13;
        r1.A0y = true;
        r1.A0J = r12;
        r1.A12 = true;
        r1.A0D(r1);
        r1.A0B(r1);
        r1.A0C(r11);
        r1.A0F(r5);
        r1.A18 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:615:0x1196, code lost:
    
        if (r23 == false) goto L667;
     */
    /* JADX WARN: Code restructure failed: missing block: B:616:0x1198, code lost:
    
        r1.A1F = new int[]{com.facebook.R.anim.fragment_slide_left_enter, com.facebook.R.anim.fragment_slide_left_exit, com.facebook.R.anim.fragment_slide_right_enter, com.facebook.R.anim.fragment_slide_right_exit};
     */
    /* JADX WARN: Code restructure failed: missing block: B:617:0x11aa, code lost:
    
        if (r24 == false) goto L669;
     */
    /* JADX WARN: Code restructure failed: missing block: B:618:0x11ac, code lost:
    
        r1.A0F = new X.PHP();
     */
    /* JADX WARN: Code restructure failed: missing block: B:619:0x11b3, code lost:
    
        r1.A0A();
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:621:0x110e, code lost:
    
        if (r14 != null) goto L653;
     */
    /* JADX WARN: Code restructure failed: missing block: B:709:0x0936, code lost:
    
        if (r4 != null) goto L319;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x0f54  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x027b  */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r67, android.os.Bundle r68) {
        /*
            Method dump skipped, instructions count: 4588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59952od.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final ClipsViewerConfig A00(C59952od c59952od) {
        return (ClipsViewerConfig) c59952od.A1L.getValue();
    }

    public static final UserSession A01(C59952od c59952od) {
        return (UserSession) c59952od.A1M.getValue();
    }

    private final InterfaceC53892dT A02() {
        InterfaceC53892dT interfaceC53892dT;
        InterfaceC08430c6 interfaceC08430c6 = this.mParentFragment;
        if ((interfaceC08430c6 instanceof InterfaceC53892dT) && (interfaceC53892dT = (InterfaceC53892dT) interfaceC08430c6) != null) {
            return interfaceC53892dT;
        }
        ComponentCallbacks2 rootActivity = getRootActivity();
        if (!(rootActivity instanceof InterfaceC53892dT)) {
            return null;
        }
        return (InterfaceC53892dT) rootActivity;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0053 A[Catch: Exception -> 0x0088, TryCatch #0 {Exception -> 0x0088, blocks: (B:4:0x0004, B:6:0x0008, B:9:0x0080, B:10:0x0083, B:11:0x0087, B:13:0x0020, B:15:0x0028, B:17:0x0036, B:18:0x0044, B:19:0x004d, B:21:0x0053, B:24:0x005f, B:30:0x007c, B:31:0x0015, B:33:0x0019), top: B:2:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List A03(boolean r6) {
        /*
            r5 = this;
            java.lang.String r1 = "viewerAdapter"
            if (r6 == 0) goto L15
            X.Gg2 r0 = r5.A0C     // Catch: java.lang.Exception -> L88
            if (r0 == 0) goto L7c
            X.Gg8 r0 = r0.A0A     // Catch: java.lang.Exception -> L88
            java.util.List r4 = r0.A0J()     // Catch: java.lang.Exception -> L88
            X.GgC r0 = r5.A0N     // Catch: java.lang.Exception -> L88
            java.lang.String r3 = "clipsViewerViewPager"
            if (r0 == 0) goto L80
            goto L20
        L15:
            X.Gg2 r0 = r5.A0C     // Catch: java.lang.Exception -> L88
            if (r0 == 0) goto L7c
            X.Gg8 r0 = r0.A0A     // Catch: java.lang.Exception -> L88
            java.util.List r0 = r0.A0J()     // Catch: java.lang.Exception -> L88
            goto L44
        L20:
            int r2 = r0.A03()     // Catch: java.lang.Exception -> L88
            X.Gg2 r0 = r5.A0C     // Catch: java.lang.Exception -> L88
            if (r0 == 0) goto L7c
            X.Gg8 r0 = r0.A0A     // Catch: java.lang.Exception -> L88
            java.util.List r0 = r0.A0J()     // Catch: java.lang.Exception -> L88
            int r1 = r0.size()     // Catch: java.lang.Exception -> L88
            X.GgC r0 = r5.A0N     // Catch: java.lang.Exception -> L88
            if (r0 == 0) goto L80
            int r0 = r0.A03()     // Catch: java.lang.Exception -> L88
            int r0 = r0 + 5
            int r0 = java.lang.Math.min(r1, r0)     // Catch: java.lang.Exception -> L88
            java.util.List r0 = r4.subList(r2, r0)     // Catch: java.lang.Exception -> L88
        L44:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Exception -> L88
            r4.<init>()     // Catch: java.lang.Exception -> L88
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Exception -> L88
        L4d:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Exception -> L88
            if (r0 == 0) goto L7b
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Exception -> L88
            X.5dq r0 = (X.C120985dq) r0     // Catch: java.lang.Exception -> L88
            X.4zF r2 = X.AbstractC128065qa.A00(r0)     // Catch: java.lang.Exception -> L88
            if (r2 == 0) goto L4d
            java.io.StringWriter r1 = new java.io.StringWriter     // Catch: java.lang.Exception -> L88
            r1.<init>()     // Catch: java.lang.Exception -> L88
            X.15v r0 = X.AbstractC221915u.A00     // Catch: java.lang.Exception -> L88
            X.17z r0 = r0.A0A(r1)     // Catch: java.lang.Exception -> L88
            X.AbstractC111024zE.A00(r0, r2)     // Catch: java.lang.Exception -> L88
            r0.close()     // Catch: java.lang.Exception -> L88
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Exception -> L88
            X.C14360o3.A07(r0)     // Catch: java.lang.Exception -> L88
            r4.add(r0)     // Catch: java.lang.Exception -> L88
            goto L4d
        L7b:
            return r4
        L7c:
            X.C14360o3.A0F(r1)     // Catch: java.lang.Exception -> L88
            goto L83
        L80:
            X.C14360o3.A0F(r3)     // Catch: java.lang.Exception -> L88
        L83:
            X.00O r0 = X.C00O.createAndThrow()     // Catch: java.lang.Exception -> L88
            throw r0     // Catch: java.lang.Exception -> L88
        L88:
            X.0wb r2 = X.C18950wb.A01
            r1 = 817892914(0x30c00e32, float:1.3973873E-9)
            java.lang.String r0 = "ClipsViewerFragment: Failed to parse json for viewer items\""
            X.0f5 r0 = r2.AEp(r0, r1)
            r0.report()
            X.0sl r0 = X.C16930sl.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59952od.A03(boolean):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        if (X.AbstractC23451Ch.A07(r78, "android.permission.CAMERA") == false) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:80:0x06bf  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x06ce  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x06f4  */
    /* JADX WARN: Type inference failed for: r0v88, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v9, types: [X.2sP, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v4, types: [X.2sP, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v37, types: [java.lang.Object, X.ITF] */
    /* JADX WARN: Type inference failed for: r48v0, types: [X.Gia] */
    /* JADX WARN: Type inference failed for: r48v1, types: [X.Gia] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A08(android.content.Context r78, X.InterfaceC61522rF r79, X.C37556GgC r80) {
        /*
            Method dump skipped, instructions count: 2112
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59952od.A08(android.content.Context, X.2rF, X.GgC):void");
    }

    private final void A09(Bundle bundle) {
        C37888Gli c37888Gli;
        if (this.A09 == null) {
            this.A0S = bundle;
            return;
        }
        String string = bundle.getString(CacheBehaviorLogger.SOURCE);
        if (string != null) {
            A00(this).A00 = string;
        }
        C37540Gfw c37540Gfw = this.A09;
        if (c37540Gfw == null) {
            C14360o3.A0F("clipsViewerFragmentViewModel");
            throw C00O.createAndThrow();
        }
        ClipsViewerConfig A00 = A00(this);
        C14360o3.A0B(A00, 2);
        ImmutableList immutableList = A00.A0E;
        if (immutableList != null && A00.A0J == ClipsViewerSource.A0U) {
            bundle.putString("media_list", AbstractC13670mt.A05(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, immutableList));
        }
        if (c37540Gfw.A22) {
            if (bundle.containsKey(PublicKeyCredentialControllerUtility.JSON_KEY_ID)) {
                c37888Gli = new C37888Gli(bundle.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ID), null, null);
            } else if (bundle.containsKey("media_list")) {
                c37888Gli = new C37888Gli(null, bundle.getString("media_list"), null);
            } else if (bundle.containsKey("short_url")) {
                c37888Gli = new C37888Gli(null, null, bundle.getString("short_url"));
            } else {
                c37888Gli = null;
            }
            c37540Gfw.A0J = c37888Gli;
        } else {
            C37615GhA c37615GhA = (C37615GhA) c37540Gfw.A1k.getValue();
            if (bundle.containsKey(PublicKeyCredentialControllerUtility.JSON_KEY_ID)) {
                c37615GhA.A00 = bundle.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            } else if (bundle.containsKey("media_list")) {
                c37615GhA.A01 = bundle.getString("media_list");
            } else if (bundle.containsKey("short_url")) {
                c37615GhA.A02 = bundle.getString("short_url");
            }
        }
        C37522Gfe c37522Gfe = c37540Gfw.A19;
        c37522Gfe.A00 = A00;
        c37522Gfe.A02 = null;
    }

    public static final void A0E(C120985dq c120985dq, C59952od c59952od) {
        String str;
        C38321qM c38321qM = c120985dq.A02;
        C37546Gg2 c37546Gg2 = c59952od.A0C;
        if (c37546Gg2 == null) {
            str = "viewerAdapter";
        } else {
            C75113Zb c75113Zb = c37546Gg2.A0A.C09(c120985dq).A0E;
            if (A00(c59952od).A1y && c38321qM != null && c75113Zb != null) {
                FragmentActivity requireActivity = c59952od.requireActivity();
                C37540Gfw c37540Gfw = c59952od.A09;
                str = "clipsViewerFragmentViewModel";
                if (c37540Gfw != null) {
                    C37604Ggz c37604Ggz = c37540Gfw.A1D;
                    C37522Gfe c37522Gfe = c37540Gfw.A19;
                    AbstractC35184Ffb.A00(requireActivity, A01(c59952od), c38321qM, c37522Gfe, c75113Zb, c37604Ggz, null, AbstractC111324zv.A00(3838), 0, SaveApiUtil.A09(A01(c59952od), c38321qM));
                    return;
                }
            } else {
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    private final boolean A0I() {
        C37540Gfw c37540Gfw = this.A09;
        if (c37540Gfw == null) {
            C14360o3.A0F("clipsViewerFragmentViewModel");
            throw C00O.createAndThrow();
        }
        if (((C37634GhT) c37540Gfw.A1g.getValue()).A07 == ClipsViewerSource.A0R) {
            return AbstractC28385Cfo.A03(A01(this));
        }
        return true;
    }

    public final C37675GiC A0L() {
        C37540Gfw c37540Gfw = this.A09;
        if (c37540Gfw == null) {
            C14360o3.A0F("clipsViewerFragmentViewModel");
            throw C00O.createAndThrow();
        }
        C37675GiC c37675GiC = c37540Gfw.A06;
        if (c37675GiC != null) {
            return c37675GiC;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final C37563GgJ A0M() {
        C37563GgJ c37563GgJ = this.A08;
        if (c37563GgJ == null) {
            C14360o3.A0F("videoControllerDelegate");
            throw C00O.createAndThrow();
        }
        return c37563GgJ;
    }

    public final C37556GgC A0N() {
        C37556GgC c37556GgC = this.A0N;
        if (c37556GgC == null) {
            C14360o3.A0F("clipsViewerViewPager");
            throw C00O.createAndThrow();
        }
        return c37556GgC;
    }

    public final C37624GhJ A0O() {
        C37540Gfw c37540Gfw = this.A09;
        if (c37540Gfw == null) {
            C14360o3.A0F("clipsViewerFragmentViewModel");
            throw C00O.createAndThrow();
        }
        return c37540Gfw.A1L;
    }

    public final void A0P(C120985dq c120985dq, Integer num) {
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            UserSession A01 = A01(this);
            String id = c38321qM.getId();
            if (id == null) {
                id = "";
            }
            String A2f = c38321qM.A2f();
            String moduleName = getModuleName();
            LJe.A01(this, A01, new C45000Jvq(EnumC25577BSp.DIRECT_INBOX_TRAY_STACK, c38321qM.A1S(), null, num, null, id, A2f, moduleName, c38321qM.A0C.BJN(), c38321qM.A0C.getLoggingInfoToken(), null, null, false));
        }
    }

    public final void A0Q(List list, boolean z) {
        C37546Gg2 c37546Gg2 = this.A0C;
        if (c37546Gg2 == null) {
            C14360o3.A0F("viewerAdapter");
            throw C00O.createAndThrow();
        }
        c37546Gg2.A0D(list, z);
    }

    public final void A0R(boolean z) {
        String str;
        if (this.A08 != null && A0O().A02() != null) {
            C37563GgJ c37563GgJ = this.A08;
            if (c37563GgJ == null) {
                str = "videoControllerDelegate";
            } else {
                C120985dq A02 = A0O().A02();
                C14360o3.A0C(A02, "null cannot be cast to non-null type com.instagram.clips.model.ClipsItem");
                C37644Ghd A01 = c37563GgJ.A01(A02);
                if (this.A09 == null) {
                    str = "clipsViewerFragmentViewModel";
                } else {
                    C14360o3.A0B(A01, 0);
                    C75113Zb c75113Zb = A01.A0E;
                    if (c75113Zb != null && c75113Zb.A1l != z) {
                        c75113Zb.A1l = z;
                        return;
                    }
                    return;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    @Override // X.InterfaceC60082oq
    public final /* synthetic */ boolean ABG() {
        return true;
    }

    @Override // X.InterfaceC60222p5
    public final String BD9() {
        C37540Gfw c37540Gfw = this.A09;
        if (c37540Gfw == null) {
            C14360o3.A0F("clipsViewerFragmentViewModel");
            throw C00O.createAndThrow();
        }
        return c37540Gfw.BD9();
    }

    @Override // X.InterfaceC60132ov
    public final ViewOnTouchListenerC60632pm BDY() {
        C37617GhC c37617GhC = this.A0H;
        if (c37617GhC != null) {
            return c37617GhC.A03;
        }
        return null;
    }

    @Override // X.InterfaceC60162oy
    public final Integer BRW() {
        return C05F.A0C;
    }

    @Override // X.InterfaceC60112ot
    public final boolean CPM() {
        return this.A1N;
    }

    @Override // X.InterfaceC60082oq
    public final /* synthetic */ boolean CWB() {
        return false;
    }

    @Override // X.InterfaceC60232p6
    public final boolean CXH() {
        C37540Gfw c37540Gfw = this.A09;
        if (c37540Gfw == null) {
            C14360o3.A0F("clipsViewerFragmentViewModel");
            throw C00O.createAndThrow();
        }
        return c37540Gfw.CXH();
    }

    @Override // X.InterfaceC60132ov
    public final boolean CcV() {
        if (this.A0H != null) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC60082oq
    public final void DCM() {
        View view;
        C37540Gfw c37540Gfw = this.A09;
        String str = "clipsViewerFragmentViewModel";
        if (c37540Gfw != null) {
            C37851Gl5 c37851Gl5 = c37540Gfw.A0B;
            if (c37851Gl5 != null && (view = c37851Gl5.A02) != null) {
                view.setVisibility(0);
            }
            C37540Gfw c37540Gfw2 = this.A09;
            if (c37540Gfw2 != null) {
                AbstractC43757JWv abstractC43757JWv = c37540Gfw2.A0H;
                if (abstractC43757JWv != null) {
                    abstractC43757JWv.A0F();
                }
                C37540Gfw c37540Gfw3 = this.A09;
                if (c37540Gfw3 != null) {
                    c37540Gfw3.A0n.A00();
                    C41217IMg c41217IMg = this.A0K;
                    if (c41217IMg == null) {
                        str = "drawerEventsDispatcher";
                    } else {
                        c41217IMg.A00();
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC60082oq
    public final void DCP(C70569Wd3 c70569Wd3, float f, float f2, float f3) {
        C37540Gfw c37540Gfw = this.A09;
        if (c37540Gfw != null) {
            InterfaceC675232r interfaceC675232r = c37540Gfw.A0b;
            boolean z = false;
            if (f2 == f3) {
                z = true;
            }
            if (z) {
                C41217IMg c41217IMg = this.A0K;
                if (c41217IMg != null) {
                    c41217IMg.A01();
                    interfaceC675232r.onPause();
                    unregisterLifecycleListener(interfaceC675232r);
                    C37540Gfw c37540Gfw2 = this.A09;
                    if (c37540Gfw2 != null) {
                        C3AE c3ae = c37540Gfw2.A05;
                        if (c3ae != null) {
                            c3ae.onPause();
                            return;
                        }
                        return;
                    }
                }
                C14360o3.A0F("drawerEventsDispatcher");
            } else {
                if (f2 != 0.0f) {
                    return;
                }
                C41217IMg c41217IMg2 = this.A0K;
                if (c41217IMg2 != null) {
                    c41217IMg2.A00();
                    interfaceC675232r.onResume();
                    C37540Gfw c37540Gfw3 = this.A09;
                    if (c37540Gfw3 != null) {
                        C3AE c3ae2 = c37540Gfw3.A05;
                        if (c3ae2 != null) {
                            c3ae2.onResume();
                        }
                        registerLifecycleListener(interfaceC675232r);
                        return;
                    }
                }
                C14360o3.A0F("drawerEventsDispatcher");
            }
            throw C00O.createAndThrow();
        }
        C14360o3.A0F("clipsViewerFragmentViewModel");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC60212p4
    public final void DeM() {
        SwipeRefreshLayout swipeRefreshLayout;
        C37540Gfw c37540Gfw = this.A09;
        if (c37540Gfw == null) {
            C14360o3.A0F("clipsViewerFragmentViewModel");
            throw C00O.createAndThrow();
        }
        c37540Gfw.A0D();
        if (A00(this).A1q && !A00(this).A1r && (swipeRefreshLayout = this.A01) != null) {
            swipeRefreshLayout.setRefreshing(true);
        }
    }

    @Override // X.InterfaceC11480j6
    public final C11520jB E6b() {
        String str;
        C11520jB c11520jB = new C11520jB();
        if (A00(this).A0J == ClipsViewerSource.A0s || A00(this).A0J == ClipsViewerSource.A0t) {
            if (C18U.A06(C06090Tz.A06, A01(this), 36318604232825178L)) {
                str = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
                c11520jB.A0A("click_point", str);
                return c11520jB;
            }
        }
        str = A00(this).A0J.A00;
        c11520jB.A0A("click_point", str);
        return c11520jB;
    }

    @Override // X.InterfaceC60082oq
    public final /* synthetic */ boolean EiT() {
        return false;
    }

    @Override // X.InterfaceC60082oq
    public final /* synthetic */ boolean EjE() {
        return true;
    }

    @Override // X.InterfaceC60192p2
    public final void F8W() {
        int i;
        SwipeRefreshLayout swipeRefreshLayout = this.A01;
        if (swipeRefreshLayout != null && !swipeRefreshLayout.A0G) {
            C37540Gfw c37540Gfw = this.A09;
            if (c37540Gfw == null) {
                C14360o3.A0F("clipsViewerFragmentViewModel");
                throw C00O.createAndThrow();
            }
            C39466Hbs c39466Hbs = c37540Gfw.A0A;
            if (c39466Hbs != null) {
                boolean A06 = C18U.A06(C06090Tz.A05, c39466Hbs.A01, 36323466136202522L);
                C37556GgC c37556GgC = c39466Hbs.A02;
                if (c37556GgC != null && (i = c39466Hbs.A00 + 1) != c37556GgC.A03() && i >= 0 && i <= c37556GgC.A05()) {
                    c37556GgC.A0F(i, A06);
                }
            }
        }
    }

    @Override // X.AbstractC59962oe, X.InterfaceC60042om
    public final boolean getCanShowVoiceMessageBar() {
        return false;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        C37540Gfw c37540Gfw = this.A09;
        if (c37540Gfw != null) {
            return c37540Gfw.A19.getModuleName();
        }
        return "UNKNOWN";
    }

    @Override // X.AbstractC59962oe
    public final EnumC60772q1 getStatusBarType() {
        return this.A1J;
    }

    public C59952od() {
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A1L = AbstractC09440dt.A00(enumC09460dv, new C9GC(this, "ClipsViewerLauncher.KEY_CONFIG", "ClipsViewerLauncher.KEY_CONFIG", 3));
        this.A0t = C1XM.A00(new C206829Dn(this, 21));
        this.A0x = C1XM.A00(new C206829Dn(this, 25));
        this.A0m = C1XM.A00(new C206829Dn(this, 15));
        this.A18 = C1XM.A00(new C206829Dn(this, 36));
        this.A1A = C1XM.A00(new C206829Dn(this, 38));
        this.A1C = C1XM.A00(new C9EN(this, 10));
        this.A0n = C1XM.A00(new C206829Dn(this, 16));
        this.A0o = C1XM.A00(BKC.A00);
        this.A19 = C1XM.A00(new C206829Dn(this, 37));
        this.A15 = C1XM.A00(new C206829Dn(this, 33));
        this.A1F = C1XM.A00(new C9EN(this, 21));
        this.A17 = C1XM.A00(new C206829Dn(this, 35));
        this.A16 = C1XM.A00(new C206829Dn(this, 34));
        this.A1E = C1XM.A00(new C9EN(this, 20));
        this.A11 = C1XM.A00(new C206829Dn(this, 29));
        this.A1G = C1XM.A00(new C9EN(this, 22));
        C206829Dn c206829Dn = new C206829Dn(this, 32);
        InterfaceC09390do A00 = AbstractC09440dt.A00(enumC09460dv, new C9EN(new C9EN(this, 14), 15));
        this.A14 = new C60842q8(new C9EN(A00, 16), c206829Dn, new C9F7(48, null, A00), new C0YZ(C25363BKg.class));
        this.A0z = C1XM.A00(new C206829Dn(this, 27));
        C206829Dn c206829Dn2 = new C206829Dn(this, 28);
        InterfaceC09390do A002 = AbstractC09440dt.A00(enumC09460dv, new C9EN(new C9EN(this, 17), 18));
        this.A10 = new C60842q8(new C9EN(A002, 19), c206829Dn2, new C9F7(49, null, A002), new C0YZ(C25359BKc.class));
        this.A1B = new C60842q8(new C9EN(this, 12), new C9EN(this, 9), new C9F7(46, null, this), new C0YZ(MVS.class));
        this.A0q = C1XM.A00(new C206829Dn(this, 18));
        this.A0r = C1XM.A00(new C206829Dn(this, 19));
        this.A0s = C1XM.A00(new C206829Dn(this, 20));
        this.A0p = new C60842q8(new C9EN(this, 13), new C206829Dn(this, 17), new C9F7(47, null, this), new C0YZ(C1810981l.class));
        this.A1D = C1XM.A00(new C9EN(this, 11));
        this.A12 = C1XM.A00(new C206829Dn(this, 30));
        this.A0R = System.currentTimeMillis();
        this.A00 = System.currentTimeMillis();
        this.A1H = new C42264Ino(this);
        this.A0y = AbstractC09440dt.A00(enumC09460dv, new C206829Dn(this, 26));
        this.A0v = C1XM.A00(new C206829Dn(this, 23));
        this.A0w = C1XM.A00(new C206829Dn(this, 24));
        this.A0u = C1XM.A00(new C206829Dn(this, 22));
        this.A13 = AbstractC09440dt.A01(new C206829Dn(this, 31));
        this.A1N = true;
        this.A1I = new C42282Io6(this);
        this.A1K = new ILF(this);
        this.A0l = new C37916GmD(this);
        this.A1J = EnumC60772q1.A03;
    }

    private final void A04() {
        if (A00(this).A1z) {
            AbstractC145016gM.A02(requireActivity(), this, A01(this), true, false);
            if (AbstractC52812bN.A00) {
                AbstractC145016gM.A00(requireActivity(), requireContext().getColor(R.color.fds_transparent));
            }
        }
    }

    private final void A06() {
        InterfaceC41501vz interfaceC41501vz;
        C120985dq A02;
        C38321qM c38321qM;
        C3x9 clipsMetadata;
        InterfaceC43434JGy interfaceC43434JGy;
        AbstractC39459Hbl abstractC39459Hbl;
        int A0C;
        Window window = requireActivity().getWindow();
        if (window != null) {
            window.clearFlags(128);
        }
        C37540Gfw c37540Gfw = this.A09;
        if (c37540Gfw == null) {
            C14360o3.A0F("clipsViewerFragmentViewModel");
            throw C00O.createAndThrow();
        }
        C38219GrO c38219GrO = c37540Gfw.A0r;
        if (c38219GrO != null) {
            c38219GrO.A00 = false;
        }
        ((C25372BKp) c37540Gfw.A1W.getValue()).A00 = false;
        ((C25373BKq) c37540Gfw.A1d.getValue()).A00 = false;
        ((C25374BKr) c37540Gfw.A1T.getValue()).A00 = false;
        ((C37588Ggj) c37540Gfw.A1V.getValue()).A00 = false;
        ((BKN) c37540Gfw.A1R.getValue()).A00 = false;
        ((BKO) c37540Gfw.A1X.getValue()).A00 = false;
        ((C37664Ghx) c37540Gfw.A1U.getValue()).A00 = false;
        ((C37589Ggk) c37540Gfw.A1Y.getValue()).A00 = false;
        C37634GhT c37634GhT = (C37634GhT) c37540Gfw.A1g.getValue();
        C75113Zb c75113Zb = c37634GhT.A0C;
        if (c75113Zb != null) {
            c75113Zb.A0M(c37634GhT.A0B, null, false);
        }
        UserSession userSession = c37540Gfw.A0Y;
        if (C1LE.A06(userSession)) {
            C14360o3.A0B(userSession, 0);
            C06090Tz c06090Tz = C06090Tz.A05;
            if (!C18U.A06(c06090Tz, userSession, 36325845547693498L) && (C18U.A06(c06090Tz, userSession, 36325845547627961L) || C18U.A06(c06090Tz, userSession, 36318479681657035L))) {
                AbstractC37696GiX.A00(userSession);
                C120985dq A022 = c37540Gfw.A1L.A02();
                if (A022 != null && (A0C = (abstractC39459Hbl = c37540Gfw.A0q).A0C(A022)) != -1) {
                    List A0J = abstractC39459Hbl.A0J();
                    ArrayList A0U = AbstractC001800i.A0U(A0J.subList(A0C + 1, A0J.size()));
                    C37705Gig c37705Gig = c37540Gfw.A0t;
                    if (!c37705Gig.A01 && c37705Gig.A00) {
                        C62832tM c62832tM = c37540Gfw.A0k;
                        String str = c37540Gfw.A1O;
                        if (str != null) {
                            C125605m6 A023 = c62832tM.A02(str);
                            List list = A023.A03;
                            list.removeAll(A0U);
                            Iterator it = A023.A05.iterator();
                            while (it.hasNext()) {
                                ((InterfaceC62852tO) it.next()).D5D(A023.A01, list, true, true);
                            }
                        }
                    }
                }
            }
        }
        c37540Gfw.A1K.A0S(null, "fragment_paused", false, true);
        C42411xV.A00(userSession);
        C11T.A00();
        C11T.A00();
        C25671My A00 = AbstractC25651Mw.A00(userSession);
        C59952od c59952od = c37540Gfw.A07;
        MusicAttributionConfig musicAttributionConfig = null;
        if (c59952od != null) {
            interfaceC41501vz = c59952od.A0l;
        } else {
            interfaceC41501vz = null;
        }
        A00.A02(interfaceC41501vz, C3MW.class);
        MVO mvo = c37540Gfw.A0c;
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, new PZS(mvo, null, 2), mvo.A0N);
        C59952od c59952od2 = c37540Gfw.A07;
        if (c59952od2 != null && (interfaceC43434JGy = c59952od2.A03) != null) {
            interfaceC43434JGy.E0a();
        }
        if (C14360o3.A0K(C55772hI.A00(userSession).A05, C1QO.A09.toString()) && C18U.A06(C06090Tz.A06, userSession, 36319227002625125L) && (A02 = c37540Gfw.A1L.A02()) != null && (c38321qM = A02.A02) != null && (clipsMetadata = c38321qM.A0C.getClipsMetadata()) != null) {
            if (AbstractC117245Sj.A01(clipsMetadata) != null && !AbstractC117245Sj.A03(clipsMetadata).A05) {
                musicAttributionConfig = AbstractC117245Sj.A03(clipsMetadata);
            }
            C14360o3.A0B(userSession, 0);
            ((O7K) userSession.A01(O7K.class, new C57523Pfx(userSession, 15))).A00 = musicAttributionConfig;
        }
    }

    public static final void A0A(C120985dq c120985dq, C59952od c59952od) {
        Integer num;
        if (A00(c59952od).A23 || A00(c59952od).A1M != null || ((A00(c59952od).A13 != null && A00(c59952od).A0G == PollType.A04) || ((num = A00(c59952od).A0f) != null && num != C05F.A0u))) {
            C37540Gfw c37540Gfw = c59952od.A09;
            if (c37540Gfw == null) {
                C14360o3.A0F("clipsViewerFragmentViewModel");
                throw C00O.createAndThrow();
            }
            C37597Ggs c37597Ggs = (C37597Ggs) c37540Gfw.A1f.getValue();
            FragmentActivity requireActivity = c59952od.requireActivity();
            EnumC120785dO enumC120785dO = A00(c59952od).A0C;
            String str = A00(c59952od).A1M;
            A00(c59952od);
            c37597Ggs.A00(requireActivity, enumC120785dO, c120985dq, null, null, 0, str, false, A00(c59952od).A23, false);
        }
    }

    public static final void A0B(C120985dq c120985dq, C59952od c59952od) {
        String str;
        if (C14360o3.A0K(A00(c59952od).A12, "480")) {
            C37540Gfw c37540Gfw = c59952od.A09;
            if (c37540Gfw == null) {
                str = "clipsViewerFragmentViewModel";
            } else {
                C37546Gg2 c37546Gg2 = c59952od.A0C;
                if (c37546Gg2 == null) {
                    str = "viewerAdapter";
                } else {
                    C37644Ghd C09 = c37546Gg2.A0A.C09(c120985dq);
                    C14360o3.A0B(C09, 1);
                    C37675GiC c37675GiC = c37540Gfw.A06;
                    if (c37675GiC != null) {
                        C37607Gh2 c37607Gh2 = c37675GiC.A0Y;
                        C38321qM c38321qM = c120985dq.A02;
                        if (c38321qM != null) {
                            C37608Gh3 c37608Gh3 = c37607Gh2.A0H;
                            c37608Gh3.A00 = c120985dq;
                            c37608Gh3.A02 = c38321qM;
                            c37608Gh3.A01 = C09;
                            c37608Gh3.A03 = C09.A0E;
                            c37608Gh3.A0D(EnumC39627Hel.A10);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    public static final void A0C(C120985dq c120985dq, C59952od c59952od) {
        C39G c39g;
        String str = A00(c59952od).A1O;
        C38321qM c38321qM = c120985dq.A02;
        C37540Gfw c37540Gfw = c59952od.A09;
        if (c37540Gfw != null) {
            AnonymousClass372 anonymousClass372 = (AnonymousClass372) c37540Gfw.A1c.getValue();
            if (anonymousClass372 != null) {
                c39g = anonymousClass372.Ar3();
            } else {
                c39g = null;
            }
            if (c38321qM != null && str != null && str.length() != 0 && c39g != null) {
                C28195Cbp c28195Cbp = C28195Cbp.A00;
                Context requireContext = c59952od.requireContext();
                UserSession A01 = A01(c59952od);
                C37540Gfw c37540Gfw2 = c59952od.A09;
                if (c37540Gfw2 != null) {
                    c28195Cbp.A00(requireContext, A01, null, c39g, c38321qM, c37540Gfw2.A19, str, true);
                    return;
                }
            } else {
                return;
            }
        }
        C14360o3.A0F("clipsViewerFragmentViewModel");
        throw C00O.createAndThrow();
    }

    public static final void A0D(C120985dq c120985dq, C59952od c59952od) {
        if (A00(c59952od).A1x) {
            C37540Gfw c37540Gfw = c59952od.A09;
            if (c37540Gfw == null) {
                C14360o3.A0F("clipsViewerFragmentViewModel");
                throw C00O.createAndThrow();
            }
            InterfaceC31159Dn3 interfaceC31159Dn3 = (InterfaceC31159Dn3) c37540Gfw.A1c.getValue();
            if (interfaceC31159Dn3 != null) {
                interfaceC31159Dn3.DP0(null, c120985dq, null, true);
            }
        }
    }

    public static final void A0F(C40031tU c40031tU, C59952od c59952od, String str, String str2) {
        C18920wW A02 = AbstractC12220kQ.A02(A01(c59952od));
        String A04 = AbstractC12880la.A04(A01(c59952od).deviceSession.A06());
        String str3 = c40031tU.A03;
        String str4 = c40031tU.A06;
        String str5 = c40031tU.A05;
        String str6 = c40031tU.A00;
        InterfaceC02590Ai A00 = A02.A00(A02.A00, AbstractC111324zv.A00(714));
        if (str3 == null) {
            str3 = "";
        }
        A00.AAP("metric", str3);
        A00.AAP("action", str2);
        if (str == null) {
            str = "";
        }
        A00.AAP("media_id", str);
        A00.AAP("actor_id", A01(c59952od).userId);
        if (str4 == null) {
            str4 = "";
        }
        A00.AAP("tip_stage", str4);
        A00.AAP("interface", "Android");
        A00.AAP(OptSvcAnalyticsStore.LOGGING_KEY_APP_VERSION, A04);
        A00.AAP("tip_id", str5);
        A00.AAP("channel_id", str6);
        A00.Cht();
    }

    public static final void A0G(C59952od c59952od) {
        C31349DqE c31349DqE;
        if (C18U.A06(C06090Tz.A06, A01(c59952od), 36325630798804188L) && (c31349DqE = c59952od.A06) != null) {
            C41451vu.A01.E4s(new C3KF(c31349DqE));
        }
    }

    private final boolean A0H() {
        InterfaceC53892dT A02 = A02();
        boolean z = true;
        if (A02 != null) {
            if (A02.C4b().A01 != 0.0f) {
                z = false;
            }
            this.A0P = z;
        }
        return z;
    }

    private final boolean A0J() {
        UserSession A01 = A01(this);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, A01, 36325845548283331L)) {
            return false;
        }
        return AbstractC001900j.A0Q(C18U.A04(c06090Tz, A01(this), 36888795501757254L), new char[]{','}, 0).contains(A00(this).A0J.name());
    }

    public final View A0K() {
        C37556GgC c37556GgC;
        if (!isAdded() || (c37556GgC = this.A0N) == null) {
            return null;
        }
        return c37556GgC.A07(c37556GgC.A03());
    }

    @Override // X.InterfaceC60162oy
    public final String BkH() {
        C38321qM c38321qM;
        C120985dq A02 = A0O().A02();
        if (A02 != null && (c38321qM = A02.A02) != null) {
            return c38321qM.A0C.getLoggingInfoToken();
        }
        return null;
    }

    @Override // X.InterfaceC60172oz
    public final boolean Cen() {
        return C18U.A06(C06090Tz.A05, A01(this), 36317534785705304L);
    }

    @Override // X.InterfaceC53912dV
    public final void DWU(C54822fg c54822fg) {
        float f;
        int A03 = C0f9.A03(873483314);
        if (this.A0P && !A0H()) {
            if (AbstractC52812bN.A00) {
                AbstractC145016gM.A00(requireActivity(), requireContext().getColor(R.color.fds_transparent));
            }
            this.A0P = false;
        }
        if (A0H()) {
            A05();
        } else {
            InterfaceC53892dT A02 = A02();
            if (A02 != null) {
                float f2 = A02.C4b().A01;
                if (f2 > 0.0f) {
                    f = 1.0f - f2;
                } else {
                    f = 1.0f + f2;
                }
                if (f == 0.0f) {
                    A06();
                    AbstractC145016gM.A00(requireActivity(), requireContext().getColor(R.color.fds_transparent));
                    if (AbstractC54792fc.A07(A01(this))) {
                        A04();
                    }
                }
            }
        }
        C0f9.A0A(1321154200, A03);
    }

    @Override // X.InterfaceC60142ow
    public final void Dlb() {
        C38321qM c38321qM;
        C120985dq A02 = A0O().A02();
        if (A02 != null && (c38321qM = A02.A02) != null) {
            C79923hh.A05(this, C79923hh.A00(C82G.A0Q, new C55875OrP(), A01(this), c38321qM, C05F.A0C), A01(this));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0044, code lost:
    
        if (r0.A03() == 0) goto L26;
     */
    @Override // X.InterfaceC60182p1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean ECu() {
        /*
            r9 = this;
            com.instagram.common.session.UserSession r2 = A01(r9)
            X.0Tz r7 = X.C06090Tz.A05
            r0 = 36323466136136985(0x810c00000e2d19, double:3.03444447512673E-306)
            boolean r0 = X.C18U.A06(r7, r2, r0)
            r8 = 0
            if (r0 != 0) goto L3d
            com.instagram.common.session.UserSession r2 = A01(r9)
            r0 = 36323427480644839(0x810bf700022ce7, double:3.034420029237844E-306)
            boolean r2 = X.C18U.A06(r7, r2, r0)
            java.lang.String r1 = "clipsViewerViewPager"
            r4 = 1
            X.GgC r0 = r9.A0N
            if (r2 == 0) goto L3e
            if (r0 == 0) goto L8f
            int r0 = r0.A04()
            if (r0 != 0) goto L47
            com.instagram.common.session.UserSession r2 = A01(r9)
            r0 = 36323427480513765(0x810bf700002ce5, double:3.034420029154952E-306)
            boolean r0 = X.C18U.A06(r7, r2, r0)
            if (r0 == 0) goto L47
        L3d:
            return r8
        L3e:
            if (r0 == 0) goto L8f
            int r0 = r0.A03()
            if (r0 != 0) goto L3d
            goto L8b
        L47:
            com.instagram.common.session.UserSession r2 = A01(r9)
            r0 = 36323427480579302(0x810bf700012ce6, double:3.034420029196398E-306)
            boolean r0 = X.C18U.A06(r7, r2, r0)
            if (r0 == 0) goto L6f
            com.instagram.common.session.UserSession r2 = A01(r9)
            r0 = 36604902457414829(0x820bf7000314ad, double:3.212425937955943E-306)
            long r5 = X.C18U.A01(r7, r2, r0)
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = r9.A0R
            long r2 = r2 - r0
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 >= 0) goto L6f
            return r8
        L6f:
            long r0 = java.lang.System.currentTimeMillis()
            r9.A0R = r0
            com.instagram.common.session.UserSession r2 = A01(r9)
            r0 = 36328224959118684(0x81105400023d5c, double:3.037453973942599E-306)
            boolean r0 = X.C18U.A06(r7, r2, r0)
            if (r0 == 0) goto L8b
            android.view.View r0 = r9.mView
            if (r0 == 0) goto L8b
            r0.performHapticFeedback(r4)
        L8b:
            r9.DeM()
            return r4
        L8f:
            X.C14360o3.A0F(r1)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59952od.ECu():boolean");
    }

    @Override // X.InterfaceC60092or
    public final void EMT() {
        C3DN A00;
        if (!C18U.A06(C06090Tz.A05, A01(this), 36321834047645539L)) {
            C120985dq A02 = A0O().A02();
            C38321qM c38321qM = null;
            if (A02 != null) {
                c38321qM = A02.A02;
            }
            if (C25375BKs.A03(A01(this), c38321qM) && (A00 = C3DN.A00.A00(requireActivity())) != null) {
                A00.A0B();
            }
            C37556GgC c37556GgC = this.A0N;
            if (c37556GgC == null) {
                C14360o3.A0F("clipsViewerViewPager");
                throw C00O.createAndThrow();
            }
            c37556GgC.A0F(0, true);
        }
    }

    @Override // X.InterfaceC60162oy
    public final String getMediaId() {
        C38321qM c38321qM;
        C120985dq A02 = A0O().A02();
        if (A02 != null && (c38321qM = A02.A02) != null) {
            return c38321qM.getId();
        }
        return null;
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return A01(this);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        C120985dq A02;
        C38321qM c38321qM;
        Integer num;
        Bundle extras;
        Object obj;
        String str;
        super.onActivityResult(i, i2, intent);
        if (i == 9783) {
            if (intent != null && (extras = intent.getExtras()) != null) {
                if (C14360o3.A0K(extras.getString("action_type"), "clips_quality_survey")) {
                    String A00 = AbstractC111324zv.A00(4415);
                    String A01 = AbstractC153636vY.A01(extras, A00);
                    String A012 = AbstractC153636vY.A01(extras, AbstractC111324zv.A00(131));
                    String A013 = AbstractC153636vY.A01(extras, "tracking_token");
                    UserSession A014 = A01(this);
                    C37540Gfw c37540Gfw = this.A09;
                    if (c37540Gfw == null) {
                        str = "clipsViewerFragmentViewModel";
                    } else {
                        C18920wW A015 = AbstractC12220kQ.A01(c37540Gfw.A19, A014);
                        InterfaceC02590Ai A002 = A015.A00(A015.A00, "instagram_organic_reels_survey_exit");
                        A002.AAP(A00, A01);
                        A002.AAP("m_pk", A012);
                        A002.AAP("simple_action_tracking_token", A013);
                        A002.Cht();
                        if (i2 == -1) {
                            C37546Gg2 c37546Gg2 = this.A0C;
                            if (c37546Gg2 == null) {
                                str = "viewerAdapter";
                            } else {
                                C14360o3.A0B(A012, 0);
                                Iterator it = c37546Gg2.A0A.A0L(EnumC129395t1.A0L).iterator();
                                while (true) {
                                    obj = null;
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    Object next = it.next();
                                    C38321qM c38321qM2 = ((C120985dq) next).A02;
                                    if (c38321qM2 != null) {
                                        obj = c38321qM2.getId();
                                    }
                                    if (C14360o3.A0K(obj, A012)) {
                                        obj = next;
                                        break;
                                    }
                                }
                                C120985dq c120985dq = (C120985dq) obj;
                                if (c120985dq != null) {
                                    C14360o3.A0C(c120985dq.A0G, "null cannot be cast to non-null type com.instagram.clips.model.SurveyClipsImpressionItem");
                                }
                            }
                        }
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
            } else {
                return;
            }
        } else if ((i == 4921 || i == 4928) && ((i2 == 1 || i2 == 2) && (A02 = A0O().A02()) != null && (c38321qM = A02.A02) != null)) {
            UserSession A016 = A01(this);
            OEK A003 = C79923hh.A00(C82G.A0Q, new C55875OrP(), A01(this), c38321qM, C05F.A0C);
            Context requireContext = requireContext();
            if (i2 == 1) {
                num = C05F.A00;
            } else {
                num = C05F.A01;
            }
            C79923hh.A03(requireContext, A003, A016, num);
        }
        if (A00(this).A0J == ClipsViewerSource.A0p && i2 == 9683) {
            requireActivity().setResult(9683);
            requireActivity().finish();
        }
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        String str;
        C38321qM c38321qM;
        C49801Lz8 c49801Lz8;
        String str2;
        String str3 = null;
        if (A00(this).A0J == ClipsViewerSource.A20 || A00(this).A0J == ClipsViewerSource.A2E) {
            C37540Gfw c37540Gfw = this.A09;
            str = "clipsViewerFragmentViewModel";
            if (c37540Gfw != null) {
                String str4 = c37540Gfw.A1O;
                if (str4 != null) {
                    C62832tM c62832tM = c37540Gfw.A0k;
                    int A01 = A0O().A01();
                    C125605m6 c125605m6 = (C125605m6) c62832tM.A01.get(str4);
                    if (c125605m6 != null) {
                        c125605m6.A00 = A01;
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        ClipsViewerDirectData clipsViewerDirectData = A00(this).A0I;
        boolean z = true;
        if (clipsViewerDirectData == null || !clipsViewerDirectData.A09) {
            z = false;
        }
        if (z && (c49801Lz8 = this.A0k) != null) {
            Intent intent = new Intent();
            if (clipsViewerDirectData != null && (str2 = clipsViewerDirectData.A02) != null) {
                intent.putExtra(AbstractC43591JPw.A00(564), str2);
            }
            intent.putStringArrayListExtra(AbstractC43591JPw.A00(562), c49801Lz8.A01);
            intent.putStringArrayListExtra(AbstractC43591JPw.A00(563), c49801Lz8.A02);
            intent.putStringArrayListExtra(AbstractC43591JPw.A00(561), c49801Lz8.A00);
            requireActivity().setResult(-1, intent);
        }
        if (A00(this).A0J == ClipsViewerSource.A0p) {
            Intent intent2 = new Intent();
            C120985dq A02 = A0O().A02();
            if (A02 != null && (c38321qM = A02.A02) != null) {
                str3 = c38321qM.getId();
            }
            intent2.putExtra(MSV.A00(323), str3);
            requireActivity().setResult(-1, intent2);
        }
        IN9 in9 = this.A0J;
        if (in9 == null) {
            str = "overlayFragmentController";
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        C189478aR c189478aR = in9.A03;
        boolean z2 = true;
        if (c189478aR == null || !c189478aR.A0T()) {
            z2 = false;
            if (AbstractC52812bN.A00) {
                AbstractC145016gM.A00(requireActivity(), requireContext().getColor(R.color.fds_transparent));
                return false;
            }
        }
        return z2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0990, code lost:
    
        if (X.C59942oc.A0D(A01(r138), A00(r138).A1G, getModuleName()) != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x140d, code lost:
    
        if (r10 == com.instagram.clips.intf.ClipsViewerSource.A2R) goto L441;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x14dd, code lost:
    
        if (r2.length <= 0) goto L476;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x14fa, code lost:
    
        if (r139.getInt("ClipsViewerFragment.SAVED_CLIPS_VIEWER_LIST_SIZE") <= 0) goto L481;
     */
    /* JADX WARN: Code restructure failed: missing block: B:623:0x1cb7, code lost:
    
        if (X.C37680GiH.A00(r5.A0J, r6.A0Y, r3, r1) != false) goto L740;
     */
    /* JADX WARN: Code restructure failed: missing block: B:704:0x21d8, code lost:
    
        if (r7 != null) goto L951;
     */
    /* JADX WARN: Code restructure failed: missing block: B:772:0x2081, code lost:
    
        if (r5 != false) goto L878;
     */
    /* JADX WARN: Code restructure failed: missing block: B:861:0x2155, code lost:
    
        if (r5 != null) goto L868;
     */
    /* JADX WARN: Code restructure failed: missing block: B:901:0x18f2, code lost:
    
        if (r5 == false) goto L545;
     */
    /* JADX WARN: Code restructure failed: missing block: B:913:0x1935, code lost:
    
        if (r3.CUz(true) == false) goto L496;
     */
    /* JADX WARN: Code restructure failed: missing block: B:917:0x1947, code lost:
    
        if (X.C14360o3.A0K(r2.A02, true) != false) goto L496;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0ab9  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x122b  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x149c  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x1502  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x1543  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x1553  */
    /* JADX WARN: Removed duplicated region for block: B:951:0x125d  */
    /* JADX WARN: Type inference failed for: r138v0, types: [X.0iw, X.07X, androidx.fragment.app.Fragment, X.2oh, X.2ow, java.lang.Object, X.2od, X.2p5, X.1GL, X.2oe, X.2p6] */
    /* JADX WARN: Type inference failed for: r19v6, types: [X.Gge] */
    /* JADX WARN: Type inference failed for: r2v449, types: [X.C5I] */
    /* JADX WARN: Type inference failed for: r5v4, types: [X.2gG] */
    /* JADX WARN: Type inference failed for: r65v0, types: [X.0ps, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r66v0, types: [X.0ps, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [X.2fr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v54, types: [androidx.fragment.app.FragmentActivity] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r139) {
        /*
            Method dump skipped, instructions count: 9256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59952od.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-527965818);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_clips_viewer_fragment, viewGroup, false);
        C676533f c676533f = this.A0a;
        if (c676533f == null) {
            C14360o3.A0F("zoomController");
            throw C00O.createAndThrow();
        }
        C14360o3.A0A(inflate);
        c676533f.D8S(inflate);
        C0f9.A09(-1441332735, A02);
        return inflate;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r2 == com.instagram.clips.intf.ClipsViewerSource.A1V) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v107, types: [java.lang.Object, X.1vN] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDestroy() {
        /*
            Method dump skipped, instructions count: 655
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59952od.onDestroy():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0041, code lost:
    
        if (r10 == com.instagram.clips.intf.ClipsViewerSource.A0w) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x014f, code lost:
    
        if (r0.A0T() == false) goto L62;
     */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDestroyView() {
        /*
            Method dump skipped, instructions count: 805
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59952od.onDestroyView():void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        C31561Dtm A00;
        Long l;
        InterfaceC56362iU interfaceC56362iU;
        int A02 = C0f9.A02(734665738);
        super.onPause();
        C37628GhN c37628GhN = this.A0A;
        if (c37628GhN != null && (interfaceC56362iU = c37628GhN.A06) != null) {
            ViewGroup viewGroup = ((C56352iT) interfaceC56362iU).A0O;
            if (viewGroup.getLayerType() != 0) {
                viewGroup.setLayerType(0, null);
            }
        }
        A0G(this);
        C37540Gfw c37540Gfw = this.A09;
        String str = "clipsViewerFragmentViewModel";
        if (c37540Gfw != null) {
            c37540Gfw.A1B.A05.A0E("on_pause");
            C25514BQc c25514BQc = c37540Gfw.A0V;
            if (c25514BQc != null && c25514BQc.A00) {
                C006802i c006802i = c25514BQc.A01;
                String lowerCase = "ON_PAUSE".toLowerCase(Locale.ROOT);
                C14360o3.A07(lowerCase);
                c006802i.markerAnnotate(749808675, "cancel_reason", lowerCase);
                c006802i.markerEnd(749808675, (short) 4);
                c25514BQc.A00 = false;
            }
            C153696ve c153696ve = c37540Gfw.A0U;
            if (c153696ve != null && c153696ve.A00) {
                C006802i c006802i2 = c153696ve.A01;
                String lowerCase2 = "ON_PAUSE".toLowerCase(Locale.ROOT);
                C14360o3.A07(lowerCase2);
                c006802i2.markerAnnotate(749812461, "cancel_reason", lowerCase2);
                c006802i2.markerEnd(749812461, (short) 4);
                c153696ve.A00 = false;
            }
            C3I9 c3i9 = this.A0X;
            if (c3i9 == null) {
                str = "keyboardHeightChangeDetector";
            } else {
                c3i9.onStop();
                C37540Gfw c37540Gfw2 = this.A09;
                if (c37540Gfw2 != null) {
                    AbstractC43757JWv abstractC43757JWv = c37540Gfw2.A0H;
                    if (abstractC43757JWv != null) {
                        abstractC43757JWv.A0D();
                    }
                    InterfaceC53892dT A022 = A02();
                    if (A022 != null) {
                        A022.C4b().A01(this);
                    }
                    if (A00(this).A0J.A01() && (l = (A00 = JWq.A00(A01(this))).A07) != null) {
                        A00.A02 += A00.A08.now() - l.longValue();
                    }
                    C3MJ c3mj = this.A0V;
                    if (c3mj != null) {
                        c3mj.A06(this.A0W);
                        C3MJ c3mj2 = this.A0V;
                        if (c3mj2 == null) {
                            C14360o3.A0F("screenshotDetector");
                            throw C00O.createAndThrow();
                        }
                        c3mj2.A04();
                        this.A0W = null;
                    }
                    this.A00 = System.currentTimeMillis();
                    AbstractC110014xV.A00(A01(this)).A04 = false;
                    A06();
                    C37695GiW c37695GiW = (C37695GiW) this.A0y.getValue();
                    if (c37695GiW != null) {
                        C37540Gfw c37540Gfw3 = this.A09;
                        if (c37540Gfw3 != null) {
                            String moduleName = c37540Gfw3.A19.getModuleName();
                            int A01 = A0O().A01();
                            C37540Gfw c37540Gfw4 = this.A09;
                            if (c37540Gfw4 != null) {
                                C37604Ggz c37604Ggz = c37540Gfw4.A1D;
                                String str2 = c37604Ggz.A01;
                                String str3 = c37604Ggz.A00;
                                C14360o3.A0B(moduleName, 0);
                                C14360o3.A0B(str2, 2);
                                C14360o3.A0B(str3, 3);
                                if (!c37695GiW.A00) {
                                    C0XJ c0xj = new C0XJ();
                                    c0xj.A00("analytics_module", moduleName, 1);
                                    c0xj.A00("exit_index", String.valueOf(A01), 2);
                                    c0xj.A00(AbstractC58346Ptm.A01(9, 10, 62), str2, 1);
                                    c0xj.A00("chaining_session_id", str3, 1);
                                    C37695GiW.A01(c37695GiW).markerPoint(976032351, 0, 7, AnonymousClass001.A0R("exit_viewer_", moduleName), c0xj, System.currentTimeMillis(), TimeUnit.MILLISECONDS, 0);
                                }
                            }
                        }
                    }
                    if (C18U.A06(C06090Tz.A06, A01(this), 36319450340793796L)) {
                        if (this.A0C == null) {
                            str = "viewerAdapter";
                        } else if (C37548Gg4.A09) {
                            C37548Gg4.A00();
                        }
                    }
                    ((C41115IIg) this.A0x.getValue()).A02.A02(false);
                    C0f9.A09(-1129797091, A02);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007b, code lost:
    
        if (A00(r9).A0J == com.instagram.clips.intf.ClipsViewerSource.A0U) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e0  */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59952od.onResume():void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(450315854);
        super.onStart();
        if (A00(this).A0J == ClipsViewerSource.A0g) {
            if (this.A0Q > 0) {
                C226418s A01 = C226218q.A01(AbstractC12960li.A00);
                C37540Gfw c37540Gfw = this.A09;
                if (c37540Gfw == null) {
                    C14360o3.A0F("clipsViewerFragmentViewModel");
                    throw C00O.createAndThrow();
                }
                A01.A0T(c37540Gfw.A0w);
            }
            C77453dV.A01++;
        }
        C0f9.A09(-459361609, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        InterfaceC53712dA interfaceC53712dA;
        int A02 = C0f9.A02(-1175858662);
        super.onStop();
        this.A0Q++;
        C57782kr.A00(A01(this)).A0N();
        C37540Gfw c37540Gfw = this.A09;
        if (c37540Gfw == null) {
            C14360o3.A0F("clipsViewerFragmentViewModel");
            throw C00O.createAndThrow();
        }
        C37560GgG c37560GgG = c37540Gfw.A1K;
        C37706Gih c37706Gih = c37560GgG.A0H;
        Map map = c37706Gih.A01;
        for (JIM jim : map.values()) {
            jim.EE4("fragment_paused");
            jim.EFb(c37560GgG);
        }
        C41230IMv c41230IMv = c37560GgG.A01;
        if (c41230IMv != null) {
            InterfaceC678133v interfaceC678133v = c41230IMv.A00;
            if (interfaceC678133v != null) {
                interfaceC678133v.release();
            }
            c41230IMv.A00 = null;
        }
        c37560GgG.A01 = null;
        map.clear();
        c37706Gih.A00.clear();
        c37560GgG.A0L.getValue();
        c37560GgG.A09.A03(c37560GgG);
        A04();
        if (A00(this).A1w) {
            C1UC activity = getActivity();
            if ((activity instanceof InterfaceC53712dA) && (interfaceC53712dA = (InterfaceC53712dA) activity) != null) {
                interfaceC53712dA.EfL(0);
            }
        }
        C0f9.A09(1667603389, A02);
    }

    @Override // X.InterfaceC60102os
    public final void EU2(Bundle bundle) {
        A09(bundle);
    }
}
