package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.reboundhorizontalscrollview.ReboundHorizontalScrollView;
import com.instagram.creation.capture.quickcapture.assethub.viewmodel.ClipsAssetHubViewModel;
import com.instagram.creation.capture.quickcapture.cameradestinationpicker.ui.LegacyCameraDestinationScrollView;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.86b, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1821786b implements InterfaceC1821886c, InterfaceC42271xH {
    public static final List A0h = AbstractC16960so.A1Q(C22P.A0a, C22P.A5b, C22P.A5c, C22P.A5C, C22P.A44);
    public float A00;
    public int A01;
    public FrameLayout A02;
    public C88X A03;
    public C55U A04;
    public C55U A05;
    public InterfaceC1821886c A06;
    public C8KA A07;
    public Integer A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public final ViewGroup A0M;
    public final FrameLayout A0N;
    public final C55982hj A0O;
    public final C55982hj A0P;
    public final AbstractC59962oe A0Q;
    public final UserSession A0R;
    public final C1810981l A0S;
    public final C1822086e A0T;
    public final LegacyCameraDestinationScrollView A0U;
    public final C81J A0V;
    public final C1813582n A0W;
    public final InterfaceC1810081c A0X;
    public final C150286pc A0Y;
    public final java.util.Set A0Z;
    public final InterfaceC16660sJ A0a;
    public final InterfaceC16660sJ A0b;
    public final ClipsAssetHubViewModel A0c;
    public final C1821686a A0d;
    public final AnonymousClass860 A0e;
    public final C86S A0f;
    public final boolean A0g;

    /* JADX WARN: Code restructure failed: missing block: B:35:0x01e9, code lost:
    
        if (r22.A3b != false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1821786b(X.C1810981l r20, com.instagram.creation.capture.quickcapture.assethub.viewmodel.ClipsAssetHubViewModel r21, X.C81J r22, X.C1813582n r23, X.C1821686a r24, X.AnonymousClass860 r25, X.C86S r26, X.InterfaceC1810081c r27) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1821786b.<init>(X.81l, com.instagram.creation.capture.quickcapture.assethub.viewmodel.ClipsAssetHubViewModel, X.81J, X.82n, X.86a, X.860, X.86S, X.81c):void");
    }

    public final void A0C() {
        this.A09 = false;
        C55982hj c55982hj = this.A0O;
        c55982hj.A08(0.01d, true);
        c55982hj.A06(1.0d);
        if (this.A0Q.isResumed()) {
            C1821686a c1821686a = this.A0d;
            C81Z c81z = c1821686a.A01;
            AbstractC59962oe abstractC59962oe = c81z.A0J;
            AbstractC10360h2 childFragmentManager = abstractC59962oe.getChildFragmentManager();
            if (C06P.A01(childFragmentManager) && childFragmentManager.A0O(R.id.feed_gallery_fragment_holder) == null) {
                Activity activity = c81z.A09;
                UserSession userSession = c81z.A0Q;
                C9KS c9ks = new C9KS(activity, abstractC59962oe, userSession);
                C81J c81j = c1821686a.A00;
                MusicAttributionConfig musicAttributionConfig = c81j.A1N;
                boolean z = c81j.A3O;
                C22P c22p = c81z.A01;
                PendingRecipient pendingRecipient = c81j.A1S;
                boolean z2 = c81j.A3c;
                C14360o3.A0B(userSession, 0);
                C14360o3.A0B(c22p, 4);
                Bundle bundle = new Bundle();
                AbstractC03240Dh.A00(bundle, userSession);
                bundle.putBoolean("standalone_mode", false);
                bundle.putParcelable("ARG_MUSIC_ATTRIBUTION_CONFIG", musicAttributionConfig);
                bundle.putBoolean("ARG_IS_EXCLUSIVE_BY_DEFAULT", z);
                bundle.putSerializable("ARG_CAMERA_ENTRY_POINT", c22p);
                bundle.putParcelable("ARG_TARGET_GROUP_PROFILE", pendingRecipient);
                bundle.putBoolean("ARG_IS_QUIET_POSTING_FLOW", z2);
                C189588ad c189588ad = new C189588ad();
                c189588ad.setArguments(bundle);
                c189588ad.A09 = c81j.A0i;
                c189588ad.A04 = c9ks;
                c189588ad.A05 = new C9KU(c1821686a);
                c189588ad.A0C = new C9KV(c1821686a);
                C14240no c14240no = new C14240no(childFragmentManager);
                c14240no.A0D(c189588ad, C189588ad.__redex_internal_original_name, R.id.feed_gallery_fragment_holder);
                c14240no.A00();
                c81z.A07 = false;
                childFragmentManager.A0Z();
            }
        }
    }

    @Override // X.InterfaceC1821886c
    public final /* synthetic */ void onPause() {
    }

    public static final ArrayList A01(C1821786b c1821786b) {
        return new ArrayList((Collection) c1821786b.A0S.A07.A00);
    }

    public static final void A02(final C55U c55u, final C1821786b c1821786b) {
        TextView textView;
        TextView textView2;
        if (!C14360o3.A0K(c1821786b.A04, c55u)) {
            c1821786b.A04 = c55u;
            c1821786b.A0A();
            c1821786b.A0B();
            if (c1821786b.A0F && (c55u instanceof C128535rM)) {
                MX1.A01(c1821786b.A0R).A04(C22P.A5C);
            }
        }
        int A00 = A00(c55u, c1821786b);
        if (A00 >= 0) {
            LegacyCameraDestinationScrollView legacyCameraDestinationScrollView = c1821786b.A0U;
            if (legacyCameraDestinationScrollView.getVisibility() == 0) {
                boolean A08 = AbstractC14710oj.A08();
                ReboundHorizontalScrollView reboundHorizontalScrollView = legacyCameraDestinationScrollView.A06;
                int childCount = reboundHorizontalScrollView.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = reboundHorizontalScrollView.getChildAt(i);
                    if (childAt instanceof IgTextView) {
                        textView2 = (TextView) childAt;
                        if (textView2 != null) {
                            textView2.setAlpha(0.5f);
                        }
                    } else {
                        textView2 = null;
                    }
                    if (A08) {
                        if (textView2 != null) {
                            textView2.setTypeface(AbstractC14710oj.A02(textView2.getContext()));
                        }
                    } else if (textView2 != null) {
                        textView2.setTypeface(null, 0);
                    }
                }
                View childAt2 = reboundHorizontalScrollView.getChildAt(A00);
                if (childAt2 instanceof TextView) {
                    textView = (TextView) childAt2;
                    if (textView != null) {
                        textView.setAlpha(1.0f);
                    }
                } else {
                    textView = null;
                }
                if (A08) {
                    if (textView != null) {
                        textView.setTypeface(AbstractC14710oj.A00(textView.getContext()));
                    }
                } else if (textView != null) {
                    textView.setTypeface(null, 1);
                }
                c1821786b.A0T.A00 = textView;
            }
        }
        if (!c1821786b.A0J) {
            LegacyCameraDestinationScrollView legacyCameraDestinationScrollView2 = c1821786b.A0U;
            if (!legacyCameraDestinationScrollView2.isLaidOut()) {
                AbstractC13880nE.A0r(legacyCameraDestinationScrollView2, new Runnable() { // from class: X.871
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1821786b.A03(c55u, c1821786b, false);
                    }
                });
            } else {
                A03(c55u, c1821786b, true);
            }
        }
    }

    public static final void A04(C1821786b c1821786b) {
        C55U c55u = (C55U) c1821786b.A0S.A08.A00;
        if (!(c55u instanceof C208509Kk) ? !(c55u instanceof C81V) : c1821786b.A0f.A03(c55u)) {
            float f = c1821786b.A00;
            if (f > 0.0f && f <= 1.0f) {
                c1821786b.A08(false);
                return;
            }
        }
        c1821786b.A08(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        if (r5.A09() == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0045, code lost:
    
        if (r5.A00 != 0.0f) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A05(X.C1821786b r5) {
        /*
            X.2hj r0 = r5.A0O
            X.2hk r0 = r0.A09
            double r0 = r0.A00
            float r3 = (float) r0
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L9c
            X.86c r0 = r5.A06
            if (r0 == 0) goto L14
            r0.onPause()
        L14:
            com.instagram.common.session.UserSession r2 = r5.A0R
            X.82n r0 = r5.A0W
            X.81Z r1 = r0.A00
            X.22P r0 = r1.A01
            boolean r0 = X.AbstractC1822486j.A01(r0, r2)
            r4 = 0
            if (r0 != 0) goto L37
            X.22P r1 = r1.A01
            r0 = 1
            X.C14360o3.A0B(r1, r0)
            java.lang.Integer r1 = X.AbstractC1822686m.A00(r1, r2)
            java.lang.Integer r0 = X.C05F.A0C
            if (r1 != r0) goto L37
            boolean r0 = r5.A09()
            if (r0 == 0) goto L47
        L37:
            X.55U r1 = r5.A04
            X.5rM r0 = X.C128535rM.A00
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L47
            float r0 = r5.A00
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L4c
        L47:
            com.instagram.creation.capture.quickcapture.cameradestinationpicker.ui.LegacyCameraDestinationScrollView r0 = r5.A0U
            r0.setLabelBackgroundProgress(r3)
        L4c:
            android.widget.FrameLayout r2 = r5.A0N
            r1 = 0
            int r0 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r0 == 0) goto L55
            r1 = 1065353216(0x3f800000, float:1.0)
        L55:
            r2.setAlpha(r1)
            int r1 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            r0 = 0
            if (r1 != 0) goto L5f
            r0 = 8
        L5f:
            r2.setVisibility(r0)
            int r0 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r0 != 0) goto L90
            X.2oe r1 = r5.A0Q
            boolean r0 = r1.isResumed()
            if (r0 == 0) goto L8f
            X.0h2 r2 = r1.getChildFragmentManager()
            X.C14360o3.A07(r2)
            boolean r0 = X.C06P.A01(r2)
            if (r0 == 0) goto L8f
            r0 = 2131432793(0x7f0b1559, float:1.8487353E38)
            androidx.fragment.app.Fragment r1 = r2.A0O(r0)
            if (r1 == 0) goto L8f
            X.0no r0 = new X.0no
            r0.<init>(r2)
            r0.A03(r1)
            r0.A00()
        L8f:
            return
        L90:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L8f
            r0 = 500(0x1f4, double:2.47E-321)
            X.AbstractC56932jR.A05(r2, r0)
            return
        L9c:
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L14
            X.81c r0 = r5.A0X
            boolean r0 = r0.Cap()
            if (r0 == 0) goto L14
            X.86c r0 = r5.A06
            if (r0 == 0) goto L14
            r0.onResume()
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1821786b.A05(X.86b):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r10.A0R, 36327297246312934L) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
    
        if (r1 == X.C88Z.A0Y) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        if (r0.A00.ordinal() == 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0088, code lost:
    
        if (r0 == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ac, code lost:
    
        if (r10.A0A == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ba, code lost:
    
        if (r9 != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0123, code lost:
    
        if (r7 != false) goto L110;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A06(X.C1821786b r10) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1821786b.A06(X.86b):void");
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [X.01O, X.0w1] */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.0w4, X.01I] */
    public static final void A07(C1821786b c1821786b, List list) {
        Integer num;
        LegacyCameraDestinationScrollView legacyCameraDestinationScrollView = c1821786b.A0U;
        if (!C14360o3.A0K(legacyCameraDestinationScrollView.A01, list)) {
            legacyCameraDestinationScrollView.A01 = list;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C55U c55u = (C55U) it.next();
                linkedHashMap.put(Integer.valueOf(LegacyCameraDestinationScrollView.A00(c55u)), c55u);
            }
            int i = 0;
            ?? c01i = new C01I(16);
            int[] iArr = C01P.A00;
            ?? c01o = new C01O();
            C18590vm c18590vm = AbstractC004701m.A01;
            C18740w1.A02(c01o, 6);
            ReboundHorizontalScrollView reboundHorizontalScrollView = legacyCameraDestinationScrollView.A06;
            int childCount = reboundHorizontalScrollView.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = reboundHorizontalScrollView.getChildAt(i2);
                if (!linkedHashMap.containsKey(Integer.valueOf(childAt.getId()))) {
                    c01i.A02(i2);
                } else {
                    c01o.A06(childAt.getId());
                }
            }
            int[] iArr2 = c01i.A01;
            for (int i3 = c01i.A00 - 1; -1 < i3; i3--) {
                reboundHorizontalScrollView.removeViewAt(iArr2[i3]);
            }
            java.util.Set entrySet = linkedHashMap.entrySet();
            C14360o3.A07(entrySet);
            for (Object obj : entrySet) {
                int i4 = i + 1;
                if (i < 0) {
                    AbstractC16960so.A1U();
                    throw C00O.createAndThrow();
                }
                Map.Entry entry = (Map.Entry) obj;
                C14360o3.A0A(entry);
                Object key = entry.getKey();
                C14360o3.A07(key);
                Number number = (Number) key;
                Object value = entry.getValue();
                C14360o3.A07(value);
                C55U c55u2 = (C55U) value;
                View childAt2 = reboundHorizontalScrollView.getChildAt(i);
                if (childAt2 != null) {
                    num = Integer.valueOf(childAt2.getId());
                } else {
                    num = null;
                }
                if (!C14360o3.A0K(num, number)) {
                    if (c01o.A04(number.intValue())) {
                        reboundHorizontalScrollView.removeAllViews();
                        Iterator it2 = legacyCameraDestinationScrollView.A01.iterator();
                        while (it2.hasNext()) {
                            reboundHorizontalScrollView.addView(legacyCameraDestinationScrollView.A02((C55U) it2.next()));
                        }
                        return;
                    }
                    reboundHorizontalScrollView.addView(legacyCameraDestinationScrollView.A02(c55u2), i);
                }
                i = i4;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0086, code lost:
    
        if (X.AbstractC1822486j.A01(r4.A0W.A00.A01, r4.A0R) == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        if (A09() != false) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A08(boolean r5) {
        /*
            r4 = this;
            X.81l r0 = r4.A0S
            X.81v r0 = r0.A07
            java.lang.Object r1 = r0.A00
            java.util.Set r1 = (java.util.Set) r1
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L5b
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L5b
        L12:
            r3 = 0
        L13:
            com.instagram.common.session.UserSession r2 = r4.A0R
            X.82n r0 = r4.A0W
            X.81Z r0 = r0.A00
            X.22P r1 = r0.A01
            r0 = 1
            X.C14360o3.A0B(r1, r0)
            java.lang.Integer r1 = X.AbstractC1822686m.A00(r1, r2)
            java.lang.Integer r0 = X.C05F.A0C
            if (r1 != r0) goto L2e
            boolean r0 = r4.A09()
            r1 = 0
            if (r0 == 0) goto L2f
        L2e:
            r1 = 1
        L2f:
            if (r3 != 0) goto L33
            if (r1 == 0) goto L5a
        L33:
            boolean r0 = r4.A0L
            if (r5 == r0) goto L5a
            com.instagram.creation.capture.quickcapture.cameradestinationpicker.ui.LegacyCameraDestinationScrollView r2 = r4.A0U
            android.view.ViewGroup r0 = X.AbstractC124845kp.A01(r2)
            r0.removeView(r2)
            android.view.ViewGroup r1 = r4.A0M
            r0 = 2131438125(0x7f0b2a2d, float:1.8498168E38)
            if (r5 == 0) goto L4a
            r0 = 2131433474(0x7f0b1802, float:1.8488735E38)
        L4a:
            android.view.View r0 = r1.requireViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.addView(r2)
            float r0 = r4.A00
            r2.setLabelBackgroundProgress(r0)
            r4.A0L = r5
        L5a:
            return
        L5b:
            java.util.Iterator r2 = r1.iterator()
        L5f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L12
            java.lang.Object r1 = r2.next()
            X.81U r0 = X.C81U.A00
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L5f
            X.81p r0 = X.C1811381p.A00
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L5f
            com.instagram.common.session.UserSession r1 = r4.A0R
            X.82n r0 = r4.A0W
            X.81Z r0 = r0.A00
            X.22P r0 = r0.A01
            boolean r0 = X.AbstractC1822486j.A01(r0, r1)
            r3 = 1
            if (r0 != 0) goto L13
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1821786b.A08(boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0087, code lost:
    
        if (X.C18U.A06(r2, r7, 36321915652417425L) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0030, code lost:
    
        if (X.C18U.A06(r2, r5, 36326296518801211L) == false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean A09() {
        /*
            r12 = this;
            X.81l r0 = r12.A0S
            X.81v r4 = r0.A08
            java.lang.Object r1 = r4.A00
            X.9Kk r0 = X.C208509Kk.A00
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L8a
            X.82n r0 = r12.A0W
            X.81Z r3 = r0.A00
            X.22P r1 = r3.A01
            X.22P r0 = X.C22P.A0a
            if (r1 != r0) goto L32
            com.instagram.common.session.UserSession r5 = r12.A0R
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36321915652220814(0x810a970003278e, double:3.033463942854846E-306)
            boolean r0 = X.C18U.A06(r2, r5, r0)
            if (r0 != 0) goto L60
            r0 = 36326296518801211(0x810e930002373b, double:3.036234420520623E-306)
            boolean r0 = X.C18U.A06(r2, r5, r0)
            if (r0 != 0) goto L60
        L32:
            com.instagram.common.session.UserSession r7 = r12.A0R
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36321915652024203(0x810a970000278b, double:3.0334639427305085E-306)
            boolean r0 = X.C18U.A06(r2, r7, r0)
            if (r0 != 0) goto L60
            X.2oe r6 = r12.A0Q
            X.22P r5 = r3.A01
            java.lang.Object r8 = r4.A00
            X.55U r8 = (X.C55U) r8
            X.81J r0 = r12.A0V
            boolean r11 = r0.A3R
            r9 = 0
            r10 = r9
            boolean r0 = X.C8YW.A00(r5, r6, r7, r8, r9, r10, r11)
            if (r0 == 0) goto L74
            r0 = 36321915652286351(0x810a970004278f, double:3.033463942896292E-306)
            boolean r0 = X.C18U.A06(r2, r7, r0)
            if (r0 == 0) goto L74
        L60:
            r2 = 1
        L61:
            com.instagram.common.session.UserSession r1 = r12.A0R
            X.82n r0 = r12.A0W
            X.81Z r0 = r0.A00
            X.22P r0 = r0.A01
            boolean r1 = X.C8YX.A00(r0, r1)
            if (r2 != 0) goto L72
            r0 = 0
            if (r1 == 0) goto L73
        L72:
            r0 = 1
        L73:
            return r0
        L74:
            X.22P r1 = r3.A01
            java.util.List r0 = X.C1821786b.A0h
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L8a
            r0 = 36321915652417425(0x810a9700062791, double:3.0334639429791837E-306)
            boolean r0 = X.C18U.A06(r2, r7, r0)
            if (r0 == 0) goto L8a
            goto L60
        L8a:
            r2 = 0
            goto L61
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1821786b.A09():boolean");
    }

    public final void A0A() {
        if (this.A0X.Cap() && (this.A0S.A08.A00 instanceof C128535rM)) {
            A0C();
            return;
        }
        C55982hj c55982hj = this.A0O;
        if (c55982hj.A09.A00 > 0.0d) {
            if (c55982hj.A01 == 0.0d) {
                return;
            }
            c55982hj.A06(0.0d);
            return;
        }
        A05(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ef, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r8.A0R, 36324166214889407L) != false) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0B() {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1821786b.A0B():void");
    }

    @Override // X.InterfaceC42271xH
    public final /* bridge */ /* synthetic */ boolean A79(Object obj) {
        C55982hj c55982hj = this.A0O;
        if (c55982hj.A01 != 0.0d) {
            c55982hj.A06(0.0d);
        }
        this.A09 = true;
        return true;
    }

    @Override // X.InterfaceC1821886c
    public final void onResume() {
        if (this.A0O.A01 == 0.0d) {
            A05(this);
        } else {
            A0C();
        }
        A0B();
        this.A0K = false;
        A06(this);
        A04(this);
    }

    public static final int A00(C55U c55u, C1821786b c1821786b) {
        Iterator it = A01(c1821786b).iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().getClass() != c55u.getClass()) {
                i++;
            } else {
                return i;
            }
        }
        return -1;
    }

    public static final void A03(C55U c55u, C1821786b c1821786b, boolean z) {
        int A00 = A00(c55u, c1821786b);
        if (A00 != -1) {
            ReboundHorizontalScrollView reboundHorizontalScrollView = c1821786b.A0U.A06;
            if (A00 < reboundHorizontalScrollView.getChildCount()) {
                if (z) {
                    reboundHorizontalScrollView.A09(A00, 0.0f);
                } else {
                    reboundHorizontalScrollView.A08(A00);
                }
            }
        }
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C0f9.A03(1682241315);
        C0f9.A0A(-690861536, C0f9.A03(-960084162));
        C0f9.A0A(-888328165, A03);
    }
}
