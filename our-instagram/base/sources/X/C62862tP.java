package X;

import android.util.SparseArray;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.2tP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C62862tP implements InterfaceC62872tQ {
    public boolean A00;
    public final SparseArray A01;
    public final Fragment A02;
    public final FragmentActivity A03;
    public final InterfaceC11380iw A04;
    public final InterfaceC63212ty A05;
    public final AbstractC12990ll A06;
    public final C1GL A07;
    public final SparseArray A08;
    public final AbstractC10360h2 A09;
    public final C57112jm A0A;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C62862tP(android.util.SparseArray r12, androidx.fragment.app.Fragment r13, X.InterfaceC62642t3 r14, X.InterfaceC11380iw r15, X.AbstractC12990ll r16, X.C57112jm r17) {
        /*
            r11 = this;
            r3 = r13
            androidx.fragment.app.FragmentActivity r4 = r13.requireActivity()
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 18297527048799042(0x41018100030342, double:1.891966354512778E-307)
            boolean r0 = X.C1AD.A06(r2, r0)
            if (r0 == 0) goto L37
            androidx.fragment.app.FragmentActivity r1 = r13.requireActivity()
            boolean r0 = r1 instanceof X.InterfaceC53802dJ
            if (r0 == 0) goto L32
            r0 = r1
            X.2dJ r0 = (X.InterfaceC53802dJ) r0
            X.0h2 r5 = r0.Auu()
            if (r5 == 0) goto L32
        L23:
            r9 = r3
            X.1GL r9 = (X.C1GL) r9
            r1 = r11
            r2 = r12
            r6 = r14
            r7 = r15
            r8 = r16
            r10 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L32:
            X.0h2 r5 = r1.getSupportFragmentManager()
            goto L23
        L37:
            X.0h2 r5 = r13.getParentFragmentManager()
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62862tP.<init>(android.util.SparseArray, androidx.fragment.app.Fragment, X.2t3, X.0iw, X.0ll, X.2jm):void");
    }

    public static C62862tP A00(SparseArray sparseArray, Fragment fragment, InterfaceC11380iw interfaceC11380iw, AbstractC12990ll abstractC12990ll, C57112jm c57112jm) {
        return new C62862tP(sparseArray, fragment, null, interfaceC11380iw, abstractC12990ll, c57112jm);
    }

    public static C62862tP A01(SparseArray sparseArray, FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, AbstractC12990ll abstractC12990ll) {
        return new C62862tP(sparseArray, null, fragmentActivity, fragmentActivity.getSupportFragmentManager(), null, interfaceC11380iw, abstractC12990ll, new C61972ry(fragmentActivity, AbstractC018607g.A00(fragmentActivity)), null);
    }

    public static C62862tP A02(Fragment fragment, InterfaceC11380iw interfaceC11380iw, AbstractC12990ll abstractC12990ll, C57112jm c57112jm) {
        return new C62862tP(null, fragment, null, interfaceC11380iw, abstractC12990ll, c57112jm);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C62862tP A03(Fragment fragment, AbstractC12990ll abstractC12990ll, C57112jm c57112jm) {
        return new C62862tP(null, fragment, null, (InterfaceC11380iw) fragment, abstractC12990ll, c57112jm);
    }

    public static C62862tP A04(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, AbstractC12990ll abstractC12990ll) {
        return A01(null, fragmentActivity, interfaceC11380iw, abstractC12990ll);
    }

    public final void A05(InterfaceC60602pj interfaceC60602pj) {
        InterfaceC08430c6 interfaceC08430c6 = this.A02;
        interfaceC08430c6.getClass();
        ((InterfaceC59992oh) interfaceC08430c6).registerLifecycleListener(interfaceC60602pj);
    }

    public final void A06(InterfaceC60602pj interfaceC60602pj) {
        InterfaceC08430c6 interfaceC08430c6 = this.A02;
        interfaceC08430c6.getClass();
        ((InterfaceC59992oh) interfaceC08430c6).unregisterLifecycleListener(interfaceC60602pj);
    }

    @Override // X.InterfaceC62872tQ
    public final SparseArray AMf() {
        SparseArray sparseArray = new SparseArray();
        final AbstractC12990ll abstractC12990ll = this.A06;
        final C1339263a A00 = AnonymousClass638.A00(AnonymousClass636.A00(abstractC12990ll));
        sparseArray.put(R.id.bk_context_key_async_component_store, A00);
        final C6Ev c6Ev = (C6Ev) abstractC12990ll.A01(C6Ev.class, new InterfaceC16820sZ() { // from class: X.6Ew
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return new C6Ev(AbstractC12990ll.this);
            }
        });
        final C6F0 c6f0 = (C6F0) abstractC12990ll.A01(C6F0.class, new C50150MDd(abstractC12990ll, 28));
        sparseArray.put(R.id.bk_context_key_legacy_data_modules, new HashMap<String, C6F3>(c6f0) { // from class: X.6F5
            public final /* synthetic */ C6F0 A01;

            {
                this.A01 = c6f0;
                SparseArray sparseArray2 = new SparseArray();
                final AbstractC12990ll abstractC12990ll2 = C62862tP.this.A06;
                sparseArray2.put(R.id.bloks_ig_session, abstractC12990ll2);
                put("ig_api", new C6F3(abstractC12990ll2) { // from class: X.6F6
                    public final AbstractC12990ll A00;

                    {
                        C14360o3.A0B(abstractC12990ll2, 1);
                        this.A00 = abstractC12990ll2;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.AbstractMap, java.util.HashMap] */
                    @Override // X.C6F3
                    public final CQB EgO(C6FG c6fg, C6FQ c6fq, AnonymousClass630 anonymousClass630, InterfaceC102844kL interfaceC102844kL, C63162tt c63162tt) {
                        J4P j4p;
                        J4P j4p2;
                        C14360o3.A0B(interfaceC102844kL, 2);
                        C102834kK c102834kK = (C102834kK) interfaceC102844kL;
                        Map map = c102834kK.A02;
                        String str = (String) map.get("_record");
                        Object obj = map.get("_type");
                        J4P j4p3 = null;
                        if (str != null && obj != null) {
                            try {
                                AbstractC12990ll abstractC12990ll3 = this.A00;
                                if ("media".equals(obj) && (abstractC12990ll3 instanceof UserSession)) {
                                    C38321qM A0B = C38321qM.A0h.A0B(C07950bF.A04.A01((UserSession) abstractC12990ll3, str), true);
                                    if (A0B != null) {
                                        ?? A002 = HxB.A00(A0B);
                                        String str2 = c102834kK.A00;
                                        C14360o3.A07(str2);
                                        Object obj2 = A002.get(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                                        if (obj2 != null) {
                                            C42271Inv c42271Inv = new C42271Inv(anonymousClass630, abstractC12990ll3, str2, (String) obj2);
                                            AbstractC25651Mw.A00(abstractC12990ll3).A01(c42271Inv, C57452kK.class);
                                            j4p3 = new J4P(c42271Inv, abstractC12990ll3);
                                            j4p2 = A002;
                                        } else {
                                            j4p3 = null;
                                            j4p2 = A002;
                                        }
                                    } else {
                                        j4p2 = null;
                                    }
                                    j4p = j4p3;
                                    j4p3 = j4p2;
                                } else {
                                    j4p = null;
                                }
                                return new CQB(j4p, j4p3);
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        }
                        return new CQB(null, null);
                    }
                });
                put("gql", c6f0.A00);
                put("media_store", new C6F7());
            }
        });
        sparseArray.put(R.id.bk_context_key_data_modules, new HashMap<String, InterfaceC136226Ez<?>>(c6Ev, this, A00) { // from class: X.6F9
            public final /* synthetic */ C6Ev A00;
            public final /* synthetic */ C62862tP A01;
            public final /* synthetic */ C1339263a A02;

            {
                this.A01 = this;
                this.A00 = c6Ev;
                this.A02 = A00;
                put("ls", new Object());
                put("gs", c6Ev.A00);
                put("acq", new InterfaceC136226Ez(A00) { // from class: X.6FB
                    public final C1339263a A00;

                    @Override // X.InterfaceC136226Ez
                    public final /* bridge */ /* synthetic */ C6DU BHe(C6FQ c6fq, InterfaceC102844kL interfaceC102844kL, Object obj) {
                        C6Er c6Er;
                        V4W A002;
                        C6FO c6fo = (C6FO) obj;
                        if (c6fo != null) {
                            c6Er = c6fo.A00;
                        } else {
                            c6Er = null;
                        }
                        C14360o3.A0B(interfaceC102844kL, 1);
                        C102834kK c102834kK = (C102834kK) interfaceC102844kL;
                        Map map = c102834kK.A02;
                        C14360o3.A0A(map);
                        String str = (String) VSD.A00(c6fq, "app_id", map);
                        if (str != null) {
                            Number number = (Number) VSD.A00(c6fq, AbstractC58317Pt9.A00(236), map);
                            if (number != null) {
                                long longValue = number.longValue();
                                Map map2 = (Map) VSD.A00(c6fq, "params", map);
                                if (map2 == null) {
                                    map2 = AbstractC06930Yk.A0E();
                                }
                                Map map3 = (Map) VSD.A00(c6fq, MSV.A00(1026), map);
                                if (map3 == null) {
                                    map3 = AbstractC06930Yk.A0E();
                                }
                                C1339263a c1339263a = this.A00;
                                C63I c63i = c1339263a.A02;
                                C63E c63e = null;
                                if (c63i != null) {
                                    c63e = c63i.A00;
                                }
                                String A003 = C58674Pzn.A00(c63e, str, map2);
                                synchronized (c1339263a.A09) {
                                    A002 = C1339263a.A00(c1339263a, c6Er, str, A003, longValue, false);
                                }
                                String str2 = c102834kK.A00;
                                C14360o3.A07(str2);
                                Object obj2 = map.get("query_id");
                                C14360o3.A0C(obj2, "null cannot be cast to non-null type kotlin.String");
                                return new C70694WfH(c1339263a, A002, str2, (String) obj2, str, map2, map3, longValue);
                            }
                            throw new IllegalArgumentException("AsyncComponentQuery data manifest entry must specify a non-null cache TTL.");
                        }
                        throw new IllegalArgumentException("AsyncComponentQuery data manifest entry must specify a non-null appId.");
                    }

                    @Override // X.InterfaceC136226Ez
                    public final C6FM By5(C6FG c6fg, AnonymousClass630 anonymousClass630) {
                        RunnableC1340063i A002;
                        C6FO c6fo;
                        final WeakReference weakReference = new WeakReference(anonymousClass630);
                        C1339263a c1339263a = this.A00;
                        InterfaceC1339663e interfaceC1339663e = new InterfaceC1339663e() { // from class: X.6FN
                            @Override // X.InterfaceC1339663e
                            public final /* bridge */ /* synthetic */ void DnA(Object obj) {
                                C6Er c6Er = ((C6FO) obj).A00;
                                C14360o3.A0B(c6Er, 0);
                                AnonymousClass630 anonymousClass6302 = (AnonymousClass630) weakReference.get();
                                if (anonymousClass6302 != null) {
                                    AnonymousClass630.A03(new C6DV(anonymousClass6302, new C6FO(c6Er), "acq"));
                                }
                            }
                        };
                        synchronized (c1339263a.A0A) {
                            A002 = c1339263a.A08.A00(interfaceC1339663e);
                            c6fo = new C6FO(c1339263a.A00);
                            C14360o3.A0B(A002, 2);
                        }
                        return new C6FM(A002, c6fo);
                    }

                    {
                        this.A00 = A00;
                    }
                });
            }
        });
        sparseArray.put(R.id.bloks_viewpoint_manager, this.A0A);
        Fragment fragment = this.A02;
        sparseArray.put(R.id.bloks_ig_fragment, fragment);
        sparseArray.put(R.id.bloks_ig_session, abstractC12990ll);
        sparseArray.put(R.id.bloks_ig_fragment_activity, this.A03);
        sparseArray.put(R.id.bloks_reel_tray_session_id, UUID.randomUUID().toString());
        sparseArray.put(R.id.bloks_ig_analytics_module, this.A04);
        sparseArray.put(R.id.bloks_ig_precompile_async_actions, false);
        sparseArray.put(R.id.bk_context_key_bloks_config, this.A05);
        sparseArray.put(R.id.bloks_ig_scheduler, this.A07);
        sparseArray.put(R.id.bloks_ig_fragment_manager, this.A09);
        sparseArray.put(R.id.bloks_ig_object_store_deprecated, this.A01);
        if (fragment != null && fragment.getContext() != null) {
            sparseArray.put(R.id.bloks_ig_scrollable_navigation_helper, new C6FC(fragment.getContext()));
        }
        sparseArray.put(R.id.bloks_ig_use_prelogin_json_parser, Boolean.valueOf(this.A00));
        sparseArray.put(R.id.bk_context_key_performance_logger, C63B.A01);
        SparseArray sparseArray2 = this.A08;
        if (sparseArray2 != null) {
            for (int i = 0; i < sparseArray2.size(); i++) {
                if (sparseArray.indexOfKey(sparseArray2.keyAt(i)) < 0) {
                    sparseArray.put(sparseArray2.keyAt(i), sparseArray2.valueAt(i));
                }
            }
        }
        return sparseArray;
    }

    @Override // X.InterfaceC62872tQ
    public final InterfaceC63212ty AgS() {
        return this.A05;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.2tu, java.lang.Object] */
    public C62862tP(SparseArray sparseArray, Fragment fragment, FragmentActivity fragmentActivity, AbstractC10360h2 abstractC10360h2, InterfaceC62642t3 interfaceC62642t3, InterfaceC11380iw interfaceC11380iw, AbstractC12990ll abstractC12990ll, C1GL c1gl, C57112jm c57112jm) {
        C62882tR c62882tR;
        this.A00 = false;
        this.A01 = new SparseArray(0);
        this.A06 = abstractC12990ll;
        this.A03 = fragmentActivity;
        this.A09 = abstractC10360h2;
        this.A0A = c57112jm;
        this.A02 = fragment;
        this.A07 = c1gl;
        this.A04 = interfaceC11380iw;
        this.A08 = sparseArray;
        if (abstractC12990ll instanceof UserSession) {
            c62882tR = new C62882tR(fragmentActivity, interfaceC11380iw, (UserSession) abstractC12990ll, 23607787);
        } else {
            c62882tR = null;
        }
        C63142tr c63142tr = new C63142tr(fragmentActivity, C006802i.A0p);
        C63162tt c63162tt = C63162tt.A00;
        C1VG.A00();
        this.A05 = new C63202tx(new Object(), interfaceC62642t3, new C63182tv(abstractC12990ll), c62882tR, c63162tt, c63142tr);
    }
}
