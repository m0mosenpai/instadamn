package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.media.MediaActionSound;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.proxygen.LigerSamplePolicy;
import com.google.android.material.appbar.AppBarLayout;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec;
import com.instagram.creation.capture.quickcapture.storydrafts.StoryDraftsCreationViewModel;
import com.instagram.pendingmedia.model.UserStoryTarget;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.sharetofriendsstory.v2.drawer.ShareToFriendsStoryDrawerController;
import java.lang.ref.WeakReference;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.82E, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C82E implements InterfaceC60602pj {
    public final C81Z A01;
    public final Handler A02 = new Handler(Looper.getMainLooper());
    public boolean A00 = true;

    public final void A02(List list) {
        C81Z c81z = this.A01;
        ShareToFriendsStoryDrawerController shareToFriendsStoryDrawerController = c81z.A29;
        Object value = shareToFriendsStoryDrawerController.A03.getValue();
        C14360o3.A07(value);
        ((C70569Wd3) value).A05(true);
        shareToFriendsStoryDrawerController.A01.D5W(shareToFriendsStoryDrawerController);
        c81z.A0Z.A0D(false);
        int ordinal = c81z.A0n.A02.A01().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                c81z.A0f.A0P(new ACA(null, UserStoryTarget.A0C, ShareType.A0X), null, null, null, null, C05F.A00, null, null, null, null, null, list, 1, false);
                return;
            }
            throw new UnsupportedOperationException("Unknown media type");
        }
        C8LZ c8lz = c81z.A0b;
        UserStoryTarget userStoryTarget = UserStoryTarget.A0C;
        C8LZ.A08(c8lz, null, new ACA(null, userStoryTarget, ShareType.A0X), null, null, null, null, null, null, C05F.A00, null, null, null, null, null, list, 1, false, false);
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void D8S(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onCreate() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroy() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    private C193838i4 A00() {
        C188798Xv c188798Xv = this.A01.A1M;
        if (c188798Xv != null) {
            return c188798Xv.A00().A02;
        }
        return null;
    }

    public final void A01() {
        UserSession userSession;
        C8FK c8fk;
        AbstractC13090lv.A02(AnonymousClass001.A0R("QccFragmentLifecycleListener", "#onResumeImpl"));
        C81Z c81z = this.A01;
        AbstractC59962oe abstractC59962oe = c81z.A0J;
        if (abstractC59962oe.isAdded()) {
            try {
                try {
                    this.A00 = false;
                    c81z.A0l.A02 = true;
                    C89P c89p = c81z.A1n;
                    C05A c05a = c89p.A0S;
                    Object value = c05a.getValue();
                    EnumC1828289c enumC1828289c = EnumC1828289c.A06;
                    if (value == enumC1828289c) {
                        EnumC189158Zj enumC189158Zj = (EnumC189158Zj) c89p.A0H.A02();
                        if (enumC189158Zj != null) {
                            int ordinal = enumC189158Zj.ordinal();
                            if (ordinal != 0) {
                                if (ordinal == 1) {
                                    enumC1828289c = EnumC1828289c.A02;
                                }
                            } else {
                                enumC1828289c = EnumC1828289c.A04;
                            }
                        }
                        c05a.Egh(enumC1828289c);
                    }
                    if (c81z.A0u.A3h) {
                        c81z.A0v.A01();
                    }
                    C8FG c8fg = c81z.A1H;
                    if (c8fg != null) {
                        if (C8FG.A0C(c8fg) && !c8fg.A08) {
                            C8FP c8fp = c8fg.A0O;
                            if (c8fp != null) {
                                c8fp.onResume();
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        }
                        C85Z c85z = c8fg.A0J;
                        if (c85z != null && (c8fk = c8fg.A0P) != null) {
                            ((C189698ao) c85z.A00.A00()).A01(c8fk);
                        }
                    }
                    if (A00() != null) {
                        A00().onResume();
                    }
                    C8YY A00 = c81z.A1M.A00();
                    A00.A04 = true;
                    C189058Yv c189058Yv = A00.A03;
                    if (c189058Yv != null) {
                        c189058Yv.A09();
                    }
                    c81z.A0d.onResume();
                    C8XA c8xa = c81z.A17;
                    if (c8xa.A00().A02 != 1) {
                        c81z.A0m.onResume();
                    }
                    c81z.A1V.A00().onResume();
                    c81z.A1i.onResume();
                    C8HB c8hb = c81z.A27;
                    C8HB.A00(c8hb, new C9EO(c8hb, 30));
                    c81z.A1q.A00().onResume();
                    ViewOnTouchListenerC1829389o viewOnTouchListenerC1829389o = c81z.A21;
                    if (viewOnTouchListenerC1829389o != null) {
                        viewOnTouchListenerC1829389o.onResume();
                    }
                    if (c8xa.A00().A02 != 1 || c81z.A2G) {
                        c81z.A0R.Dnr(c81z.A09);
                    }
                    C8GF c8gf = c81z.A1d;
                    if (c8gf != null) {
                        c8gf.A00().onResume();
                    }
                    if (c81z.A1e.Cae()) {
                        C89F c89f = c81z.A0W;
                        if (c89f.A0S.A04 != null) {
                            c89f.A06();
                        } else {
                            c89f.A0P.A01();
                        }
                    }
                    c81z.A0c.A08();
                    userSession = c81z.A0Q;
                    C25671My A002 = AbstractC25651Mw.A00(userSession);
                    A002.A01(c81z.A0m, C190088bR.class);
                    A002.A01(c81z.A0O, C190098bS.class);
                    ((C189698ao) c81z.A0F.A00.A00()).A01(c81z.A0E);
                    if (c8xa.A00().A02 != 1) {
                        c81z.A0V.A0C();
                    }
                    C150286pc c150286pc = c81z.A1x;
                    if (c150286pc != null) {
                        C191478dz c191478dz = (C191478dz) c150286pc.get();
                        IgImageView igImageView = c191478dz.A07;
                        if (c191478dz.A0D == EnumC189218Zt.A04 && igImageView != null && (((C55U) c191478dz.A0d.A08.A00) instanceof C81V)) {
                            igImageView.setImageDrawable(c191478dz.A0S.getDrawable(c191478dz.A00));
                            AbstractC125325le.A02(igImageView, 250L);
                        }
                    }
                    C22C A01 = AnonymousClass229.A01(userSession);
                    A01.A00.A0B(((C22F) A01).A04.A05, "owningFragment.isAdded", Boolean.toString(abstractC59962oe.isAdded()), true);
                    if (!AbstractC46542Bs.A00(userSession).A04.getBoolean("PREFERENCE_AUTO_CROSS_POST_TO_FACEBOOK_STORY_CLOSE_FRIENDS_EDUCATION_HAS_SHOWN", false)) {
                        ((C82L) c81z.A28.A00.A00()).A03(abstractC59962oe.requireContext(), new InterfaceC191748eW() { // from class: X.8eV
                            @Override // X.InterfaceC191748eW
                            public final void Dgk(boolean z) {
                            }
                        });
                    }
                } catch (IllegalStateException e) {
                    userSession = c81z.A0Q;
                    C22C A012 = AnonymousClass229.A01(userSession);
                    String obj = e.toString();
                    C22M c22m = ((C22F) A012).A04;
                    c22m.A05 = A012.A00.A07(obj, "", 316094919, c22m.A05);
                }
                AbstractC13090lv.A01();
                C22C A013 = AnonymousClass229.A01(userSession);
                C22M c22m2 = ((C22F) A013).A04;
                c22m2.A05 = A013.A00.A02(316094919, c22m2.A05);
            } catch (Throwable th) {
                AbstractC13090lv.A01();
                C22C A014 = AnonymousClass229.A01(c81z.A0Q);
                C22M c22m3 = ((C22F) A014).A04;
                c22m3.A05 = A014.A00.A02(316094919, c22m3.A05);
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x0141, code lost:
    
        if (r3.A01.equals(r7) != false) goto L72;
     */
    @Override // X.InterfaceC60602pj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityResult(int r42, int r43, android.content.Intent r44) {
        /*
            Method dump skipped, instructions count: 1472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C82E.onActivityResult(int, int, android.content.Intent):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC60602pj
    public final void onConfigurationChanged(Configuration configuration) {
        Integer num;
        AbstractC13090lv.A02(AnonymousClass001.A0R("QccFragmentLifecycleListener", "#onConfigurationChanged"));
        try {
            C81Z c81z = this.A01;
            Activity activity = c81z.A09;
            if (AbstractC68606VXh.A00(activity.getResources().getConfiguration(), configuration)) {
                C183688Ct c183688Ct = c81z.A0d;
                if (c183688Ct.A19.A3f) {
                    C1810981l c1810981l = c183688Ct.A0x;
                    if (((C55U) c1810981l.A08.A00) == C208509Kk.A00 && !c1810981l.A0W(C81W.A0o, C81W.A0p)) {
                        C1816783z c1816783z = c183688Ct.A15;
                        C1815483h c1815483h = c1816783z.A01;
                        if (c1815483h.A0n.size() == 1 && (((num = c1815483h.A0D) == C05F.A00 || num == C05F.A01) && AbstractC199158rI.A00(c1816783z, ((C8NW) c183688Ct.A1h.get()).A16()))) {
                            C8Y6 c8y6 = (C8Y6) c183688Ct.A1x.get();
                            if (c8y6 != null) {
                                StoryDraftsCreationViewModel storyDraftsCreationViewModel = c183688Ct.A1R;
                                AnonymousClass840 anonymousClass840 = c183688Ct.A14;
                                C199008r1 A04 = c8y6.A08.A04();
                                Bitmap A05 = c8y6.A05();
                                TargetViewSizeProvider targetViewSizeProvider = c183688Ct.A10;
                                Context context = c183688Ct.A0p.getContext();
                                CameraSpec A00 = c8y6.A0Q.A00();
                                boolean z = false;
                                if (c1816783z.A01() == EnumC198268pb.A07) {
                                    z = true;
                                }
                                storyDraftsCreationViewModel.A01(context, A05, targetViewSizeProvider, anonymousClass840, A00, A04, null, true, z);
                            }
                            c183688Ct.A0i = true;
                            c183688Ct.A0o.onBackPressed();
                        }
                    }
                }
                C8RZ c8rz = c81z.A0Z;
                if (c8rz.A04) {
                    c8rz.A0D(false);
                    if (c81z.A0n.A02.A01.A07()) {
                        c81z.A1i.ELn(c8rz.A05());
                    }
                }
                if (A00() != null) {
                    C193838i4 A002 = A00();
                    UserSession userSession = A002.A0c;
                    C80J c80j = C80J.A00;
                    ((C80K) userSession.A01(C80K.class, c80j)).A00.clear();
                    List<C9NH> Bsg = A002.A0z.Bsg();
                    if (Bsg.size() > 0) {
                        for (C9NH c9nh : Bsg) {
                            ((C80K) userSession.A01(C80K.class, c80j)).A00.put(c9nh.A01, c9nh.A00);
                        }
                    }
                }
            }
            c81z.A0J.getViewModelStore().A00();
            try {
                ((InterfaceC018407e) activity).getViewModelStore().A00();
            } catch (ConcurrentModificationException unused) {
            }
            activity.recreate();
        } finally {
            AbstractC13090lv.A01();
        }
    }

    @Override // X.InterfaceC60602pj
    public final void onDestroyView() {
        C81Z c81z = this.A01;
        c81z.A17.A00().A0B(C05F.A0N);
        C8HI c8hi = c81z.A0k;
        MediaActionSound mediaActionSound = c8hi.A0k.A01;
        if (mediaActionSound != null) {
            mediaActionSound.release();
        }
        C6WQ c6wq = c8hi.A0F;
        if (c6wq != null) {
            c6wq.dismiss();
            c8hi.A0F = null;
        }
        AbstractC25651Mw.A00(c8hi.A0f).A02(c8hi.A0d, C191178dG.class);
        C218914p.A06(c8hi.A0e);
        C183688Ct c183688Ct = c81z.A0d;
        C8EJ c8ej = c183688Ct.A1B;
        if (c8ej != null) {
            if (c8ej.A05 != null) {
                c8ej.A05 = null;
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        C183918Ds c183918Ds = c183688Ct.A1E;
        if (c183918Ds.A01 != null) {
            AbstractC25651Mw.A00(c183918Ds.A0C).A02(c183918Ds.A01, C56021Ots.class);
        }
        if (c183918Ds.A02 != null) {
            AbstractC25651Mw.A00(c183918Ds.A0C).A02(c183918Ds.A02, C56023Otu.class);
        }
        C150286pc c150286pc = c183688Ct.A1h;
        if (c150286pc.A03) {
            C8NW c8nw = (C8NW) c150286pc.get();
            C25671My A00 = AbstractC25651Mw.A00(c8nw.A0r);
            A00.A02(c8nw.A0p, C8P9.class);
            A00.A02(c8nw.A0q, C8PB.class);
        }
        if (A00() != null) {
            C193838i4 A002 = A00();
            ViewGroup viewGroup = A002.A0T;
            C14360o3.A0C(viewGroup, "null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout");
            ((AppBarLayout) viewGroup).A03(A002);
            RecyclerView recyclerView = A002.A0X;
            recyclerView.A15(A002.A1B);
            recyclerView.A15(A002.A1A);
            recyclerView.A15(A002.A0W);
            recyclerView.A15(A002.A0j);
        }
        C8LZ c8lz = c81z.A0b;
        C8LZ.A07(c8lz);
        c8lz.A0C.A01();
        C185948Mo c185948Mo = c81z.A0f;
        C185948Mo.A09(c185948Mo);
        c185948Mo.A0b.A01();
        ViewOnTouchListenerC1829389o viewOnTouchListenerC1829389o = c81z.A21;
        if (viewOnTouchListenerC1829389o != null) {
            viewOnTouchListenerC1829389o.A0e = true;
            viewOnTouchListenerC1829389o.A0S.clear();
        }
        C8FG c8fg = c81z.A1H;
        if (c8fg != null) {
            c8fg.A05 = null;
        }
        ((C8JA) c81z.A1I.A00.A00()).F9b();
        AbstractC188508Wp.A02();
        c81z.A0M.A00().A03();
        C172047lZ c172047lZ = c81z.A1R;
        if (c172047lZ != null) {
            c172047lZ.A00().onDestroyView();
        }
        C8JU c8ju = c81z.A1i;
        if (c8ju != null) {
            c8ju.onDestroyView();
        }
        C150286pc c150286pc2 = c81z.A1x;
        if (c150286pc2 != null) {
            C191478dz c191478dz = (C191478dz) c150286pc2.get();
            if (c191478dz.A06 != null) {
                AbstractC25651Mw.A00(c191478dz.A0b).A02(c191478dz.A06, C191708eS.class);
                c191478dz.A06 = null;
            }
        }
        c81z.A1s.A00().onDestroyView();
        c81z.A1t.A00().onDestroyView();
        InterfaceC25179BCc interfaceC25179BCc = c81z.A0u.A0i;
        if (interfaceC25179BCc != null) {
            C1810981l c1810981l = c81z.A0V;
            C171097k0 c171097k0 = new C171097k0(interfaceC25179BCc);
            C14360o3.A0B(c171097k0, 0);
            c1810981l.A08.A01(c171097k0);
            c1810981l.A0I.remove(c171097k0);
        }
        UserSession userSession = c81z.A0Q;
        C14360o3.A0B(userSession, 0);
        if (C18U.A06(C06090Tz.A05, userSession, 36327297246509545L)) {
            C1810981l c1810981l2 = c81z.A0V;
            java.util.Set set = c1810981l2.A0J;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                c1810981l2.A09.A01((AnonymousClass822) it.next());
            }
            set.clear();
            java.util.Set set2 = c1810981l2.A0I;
            Iterator it2 = set2.iterator();
            while (it2.hasNext()) {
                c1810981l2.A08.A01((AnonymousClass822) it2.next());
            }
            set2.clear();
            java.util.Set set3 = c1810981l2.A0G;
            Iterator it3 = set3.iterator();
            while (it3.hasNext()) {
                c1810981l2.A07.A01((AnonymousClass822) it3.next());
            }
            set3.clear();
        }
        C1821786b c1821786b = c81z.A0m;
        c1821786b.A0P.A0D.clear();
        C1810981l c1810981l3 = c1821786b.A0S;
        C1823386x c1823386x = new C1823386x(c1821786b.A0b);
        C14360o3.A0B(c1823386x, 0);
        c1810981l3.A08.A01(c1823386x);
        c1810981l3.A0I.remove(c1823386x);
        C1823386x c1823386x2 = new C1823386x(c1821786b.A0a);
        c1810981l3.A07.A01(c1823386x2);
        c1810981l3.A0G.remove(c1823386x2);
        c81z.A1G.A03();
    }

    @Override // X.InterfaceC60602pj
    public final void onPause() {
        C8FK c8fk;
        this.A02.removeCallbacksAndMessages(null);
        C81Z c81z = this.A01;
        c81z.A0l.A02 = false;
        ((C1809981b) c81z.A1e).A01.A04(new Object());
        AbstractC10360h2 childFragmentManager = c81z.A0J.getChildFragmentManager();
        C189588ad c189588ad = (C189588ad) childFragmentManager.A0O(R.id.feed_gallery_fragment_holder);
        if (c189588ad != null) {
            c189588ad.A09 = null;
            C14240no c14240no = new C14240no(childFragmentManager);
            c14240no.A03(c189588ad);
            c14240no.A00();
        }
        c81z.A0k.onPause();
        C05A c05a = c81z.A1n.A0S;
        if (c05a.getValue() == EnumC1828289c.A02 || c05a.getValue() == EnumC1828289c.A04) {
            c05a.Egh(EnumC1828289c.A06);
        }
        C8FG c8fg = c81z.A1H;
        if (c8fg != null) {
            if (C8FG.A0C(c8fg)) {
                C8FP c8fp = c8fg.A0O;
                if (c8fp != null) {
                    c8fp.onPause();
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            C85Z c85z = c8fg.A0J;
            if (c85z != null && (c8fk = c8fg.A0P) != null) {
                ((C189698ao) c85z.A00.A00()).A02(c8fk);
            }
            AnonymousClass860 anonymousClass860 = c8fg.A0Q;
            anonymousClass860.A07.A00();
            anonymousClass860.A06.D1k("on_camera_pause");
            anonymousClass860.A08.FDP("camera_pause");
        }
        if (A00() != null) {
            A00();
        }
        C188798Xv c188798Xv = c81z.A1M;
        C8YY A00 = c188798Xv.A00();
        A00.A04 = false;
        C189058Yv c189058Yv = A00.A03;
        if (c189058Yv != null) {
            c189058Yv.A08();
        }
        c81z.A0b.onPause();
        c81z.A0f.onPause();
        c81z.A0d.onPause();
        C1821786b c1821786b = c81z.A0m;
        c81z.A1V.A00().onPause();
        c81z.A1i.onPause();
        c81z.A1q.A00().onPause();
        c81z.A0Z.A0E(false);
        ViewOnTouchListenerC1829389o viewOnTouchListenerC1829389o = c81z.A21;
        if (viewOnTouchListenerC1829389o != null) {
            viewOnTouchListenerC1829389o.onPause();
        }
        C8XA c8xa = c81z.A17;
        if (c8xa.A00().A02 != 1) {
            c81z.A0R.onStop();
            if (c188798Xv.A00().A01 != null) {
                C194648jP c194648jP = c188798Xv.A00().A01;
                if (c194648jP.A00 != 0.0f) {
                    double height = c194648jP.A09.getHeight();
                    C55982hj c55982hj = c194648jP.A0E;
                    if (height != c55982hj.A01 && c55982hj.A09.A00 <= r12 / 2.0f) {
                        height = 0.0d;
                    }
                    c55982hj.A08(height, true);
                }
            }
        }
        C85E c85e = c81z.A0N;
        if (c85e != null) {
            c85e.A00();
        }
        C8GF c8gf = c81z.A1d;
        if (c8gf != null) {
            c8gf.A00().onPause();
        }
        c81z.A0r.onPause();
        c81z.A0W.A07();
        AbstractC188508Wp.A02();
        if (!c81z.A0u.A3h && c8xa.A00().A00 != 3) {
            c8xa.A00().A02 = 1;
        }
        C25671My A002 = AbstractC25651Mw.A00(c81z.A0Q);
        A002.A02(c1821786b, C190088bR.class);
        A002.A02(c81z.A0O, C190098bS.class);
        ((C189698ao) c81z.A0F.A00.A00()).A02(c81z.A0E);
    }

    @Override // X.InterfaceC60602pj
    public final void onResume() {
        C22C A01 = AnonymousClass229.A01(this.A01.A0Q);
        ((C22F) A01).A04.A05 = A01.A00.A04(null, null, 316094919, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
        if (this.A00) {
            this.A02.post(new Runnable() { // from class: X.8ab
                @Override // java.lang.Runnable
                public final void run() {
                    C82E c82e = C82E.this;
                    if (c82e.A01.A0J != null) {
                        c82e.A01();
                    }
                }
            });
        } else {
            A01();
        }
    }

    @Override // X.InterfaceC60602pj
    public final void onSaveInstanceState(Bundle bundle) {
        AbstractC13090lv.A02(AnonymousClass001.A0R("QccFragmentLifecycleListener", "#onSaveInstanceState"));
        try {
            C81Z c81z = this.A01;
            C1810981l c1810981l = c81z.A0V;
            if (c1810981l != null) {
                bundle.putString("SAVE_INSTANCE_KEY_LAST_CAMERA_DESTINATION", ((C55U) c1810981l.A08.A00).A02);
            }
            if (((C8ZD) c81z.A0H.A00.A00()).A07()) {
                bundle.putBoolean("SAVE_INSTANCE_KEY_WAS_SHOWING_MG", true);
            }
            c81z.A1i.onSaveInstanceState(bundle);
            C1815283f c1815283f = c81z.A0M;
            if (c1815283f.A00() != null && c1815283f.A00().A05.A09 != null && c1815283f.A00().A05.A09.A0K != null) {
                bundle.putString("SAVE_INSTANCE_KEY_AR_EFFECT_ID", c1815283f.A00().A05.A09.A0K);
            }
            bundle.putBoolean("SAVE_INSTANCE_KEY_DID_USER_CLOSE_FEED_GALLERY_PICKER", c81z.A07);
        } finally {
            AbstractC13090lv.A01();
        }
    }

    @Override // X.InterfaceC60602pj
    public final void onStart() {
        C193408hL c193408hL;
        AbstractC13090lv.A02(AnonymousClass001.A0R("QccFragmentLifecycleListener", "#onStart"));
        try {
            if (A00() != null) {
                C194598jK c194598jK = A00().A0s;
                if (c194598jK.A0A) {
                    A7E a7e = c194598jK.A00;
                    if (a7e != null) {
                        c193408hL = a7e.A00;
                    }
                } else {
                    c193408hL = c194598jK.A07;
                }
                WeakReference weakReference = AbstractC23451Ch.A00;
                AbstractC23451Ch.A00 = new WeakReference(c193408hL);
            }
        } finally {
            AbstractC13090lv.A01();
        }
    }

    public C82E(C81Z c81z) {
        this.A01 = c81z;
    }

    @Override // X.InterfaceC60602pj
    public final void onStop() {
        if (A00() != null) {
            C194598jK c194598jK = A00().A0s;
            if (!c194598jK.A0A || c194598jK.A00 != null) {
                WeakReference weakReference = AbstractC23451Ch.A00;
                AbstractC23451Ch.A00 = new WeakReference(null);
            }
        }
    }
}
