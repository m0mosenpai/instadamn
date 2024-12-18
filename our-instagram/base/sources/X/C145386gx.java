package X;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import instagram.features.stories.fragment.ReelViewerFragment;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.6gx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C145386gx implements InterfaceC145396gy {
    public InterfaceC42271xH A00;
    public UserSession A01;
    public C147956lR A02;
    public C6WQ A03;
    public final InterfaceC1118853a A04;
    public final WeakReference A05;
    public final InterfaceC60442pS A06;
    public final InterfaceC144586fe A07;

    @Override // X.InterfaceC145396gy
    public final void DMK(C105824pt c105824pt) {
        FragmentActivity activity;
        Fragment fragment = (Fragment) this.A05.get();
        if (fragment != null && (activity = fragment.getActivity()) != null) {
            if (this.A01 != null) {
                C006802i.A0p.markerStart(39133251);
                C38801rC c38801rC = C38321qM.A0h;
                String str = c105824pt.A0e;
                str.getClass();
                String A06 = C38801rC.A06(str);
                this.A04.EJE("insights_bottom_sheet_shown");
                UserSession userSession = this.A01;
                if (userSession != null) {
                    boolean booleanValue = Boolean.valueOf(C18U.A06(C06090Tz.A05, userSession, 36313360077293476L)).booleanValue();
                    String A00 = MSV.A00(504);
                    HashMap hashMap = new HashMap();
                    if (booleanValue) {
                        hashMap.put("target_id", A06);
                        hashMap.put("origin", A00);
                        C66277U6x A01 = C66277U6x.A01("com.instagram.insights.media_refresh.live.core", hashMap);
                        UserSession userSession2 = this.A01;
                        if (userSession2 != null) {
                            IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig(userSession2);
                            igBloksScreenConfig.A0U = fragment.requireContext().getResources().getString(2131965409);
                            A01.A04(activity, igBloksScreenConfig);
                            return;
                        }
                    } else {
                        hashMap.put("media_id", A06);
                        hashMap.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, A00);
                        UserSession userSession3 = this.A01;
                        if (userSession3 != null) {
                            new C34673FPi(userSession3).A00(fragment, activity, hashMap, false);
                            return;
                        }
                    }
                }
            }
            C14360o3.A0F("userSession");
            throw C00O.createAndThrow();
        }
    }

    @Override // X.InterfaceC145396gy
    public final void DQV(float f, float f2) {
        this.A07.DQV(0.0f, 0.0f);
    }

    @Override // X.InterfaceC144626fi, X.InterfaceC144636fj
    public final boolean Drb(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C14360o3.A0B(motionEvent, 0);
        C14360o3.A0B(motionEvent2, 1);
        return this.A07.Drb(motionEvent, motionEvent2, f, f2);
    }

    @Override // X.InterfaceC145396gy
    public final void Dwo(boolean z) {
        this.A07.Dwo(false);
    }

    public static final void A00(C145386gx c145386gx) {
        C6WQ c6wq = c145386gx.A03;
        if (c6wq != null) {
            if (c6wq.isShowing()) {
                c6wq.dismiss();
            }
            c6wq.A00("");
        }
    }

    private final void A01(String str) {
        Context context;
        Fragment fragment = (Fragment) this.A05.get();
        if (fragment != null && (context = fragment.getContext()) != null) {
            C6WQ c6wq = this.A03;
            if (c6wq == null) {
                c6wq = new C6WQ(context, true);
                this.A03 = c6wq;
            }
            if (c6wq.isShowing()) {
                c6wq.dismiss();
            }
            c6wq.A00(str);
            C0fJ.A00(c6wq);
        }
    }

    @Override // X.InterfaceC145396gy
    public final void D9d(C105824pt c105824pt) {
        boolean z;
        UserSession userSession = this.A01;
        if (userSession == null) {
            C14360o3.A0F("userSession");
            throw C00O.createAndThrow();
        }
        InterfaceC60442pS interfaceC60442pS = this.A06;
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC60442pS, userSession);
        InterfaceC02590Ai A00 = A01.A00(A01.A00, "ig_live_archive_delete_click");
        A00.A9K("a_pk", Long.valueOf(Long.parseLong(c105824pt.A03().getId())));
        String str = c105824pt.A0e;
        str.getClass();
        A00.AAP("m_pk", str);
        String str2 = c105824pt.A0X;
        str2.getClass();
        A00.A9K(TraceFieldType.BroadcastId, Long.valueOf(Long.parseLong(str2)));
        C109954xP c109954xP = c105824pt.A07;
        if (c109954xP != null) {
            A00.A9K("archive_id", Long.valueOf(Long.parseLong(c109954xP.A00)));
            C109954xP c109954xP2 = c105824pt.A07;
            if (c109954xP2 != null) {
                z = c109954xP2.A01;
            } else {
                z = false;
            }
            A00.A7v("can_share_to_igtv", Boolean.valueOf(z));
            A00.A9K("published_time", Long.valueOf(c105824pt.A01()));
            A00.AAP("container_module", interfaceC60442pS.getModuleName());
            A00.Cht();
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC145396gy
    public final void D9e(C105824pt c105824pt) {
        Context context;
        boolean z;
        Fragment fragment = (Fragment) this.A05.get();
        if (fragment != null && (context = fragment.getContext()) != null) {
            boolean z2 = false;
            if (c105824pt.A07 != null) {
                z2 = true;
            }
            if (z2) {
                String string = context.getString(2131965314);
                C14360o3.A07(string);
                A01(string);
                UserSession userSession = this.A01;
                if (userSession != null) {
                    C109954xP c109954xP = c105824pt.A07;
                    if (c109954xP != null) {
                        String str = c109954xP.A00;
                        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
                        c25621Ms.A05();
                        c25621Ms.A0B("archive/live/delete/");
                        c25621Ms.A9s("archive_id", str);
                        c25621Ms.A0R(C40781ul.class, C55702hA.class);
                        C1ON A0N = c25621Ms.A0N();
                        A0N.A00 = new ETH(context, c105824pt, this);
                        C1GJ.A03(A0N);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                C14360o3.A0F("userSession");
                throw C00O.createAndThrow();
            }
            UserSession userSession2 = this.A01;
            if (userSession2 != null) {
                InterfaceC60442pS interfaceC60442pS = this.A06;
                C18920wW A01 = AbstractC12220kQ.A01(interfaceC60442pS, userSession2);
                InterfaceC02590Ai A00 = A01.A00(A01.A00, "ig_live_archive_delete_confirm");
                A00.A9K("a_pk", Long.valueOf(Long.parseLong(c105824pt.A03().getId())));
                String str2 = c105824pt.A0e;
                str2.getClass();
                A00.AAP("m_pk", str2);
                String str3 = c105824pt.A0X;
                str3.getClass();
                A00.A9K(TraceFieldType.BroadcastId, Long.valueOf(Long.parseLong(str3)));
                C109954xP c109954xP2 = c105824pt.A07;
                if (c109954xP2 != null) {
                    A00.A9K("archive_id", Long.valueOf(Long.parseLong(c109954xP2.A00)));
                    C109954xP c109954xP3 = c105824pt.A07;
                    if (c109954xP3 != null) {
                        z = c109954xP3.A01;
                    } else {
                        z = false;
                    }
                    A00.A7v("can_share_to_igtv", Boolean.valueOf(z));
                    A00.A9K("published_time", Long.valueOf(c105824pt.A01()));
                    A00.AAP("container_module", interfaceC60442pS.getModuleName());
                    A00.Cht();
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            C14360o3.A0F("userSession");
            throw C00O.createAndThrow();
        }
    }

    @Override // X.InterfaceC145396gy
    public final void DBc(float f) {
        this.A07.DBc(f);
    }

    @Override // X.InterfaceC145396gy
    public final void DBg(C105824pt c105824pt) {
        Context context;
        boolean z;
        Fragment fragment = (Fragment) this.A05.get();
        if (fragment != null && (context = fragment.getContext()) != null) {
            String string = context.getString(2131961152);
            C14360o3.A07(string);
            A01(string);
            C1GJ.A03(new KK3(context, c105824pt, this));
            UserSession userSession = this.A01;
            if (userSession == null) {
                C14360o3.A0F("userSession");
                throw C00O.createAndThrow();
            }
            InterfaceC60442pS interfaceC60442pS = this.A06;
            C18920wW A01 = AbstractC12220kQ.A01(interfaceC60442pS, userSession);
            InterfaceC02590Ai A00 = A01.A00(A01.A00, "ig_live_archive_download_click");
            A00.A9K("a_pk", Long.valueOf(Long.parseLong(c105824pt.A03().getId())));
            String str = c105824pt.A0e;
            str.getClass();
            A00.AAP("m_pk", str);
            String str2 = c105824pt.A0X;
            str2.getClass();
            A00.A9K(TraceFieldType.BroadcastId, Long.valueOf(Long.parseLong(str2)));
            C109954xP c109954xP = c105824pt.A07;
            if (c109954xP != null) {
                A00.A9K("archive_id", Long.valueOf(Long.parseLong(c109954xP.A00)));
                C109954xP c109954xP2 = c105824pt.A07;
                if (c109954xP2 != null) {
                    z = c109954xP2.A01;
                } else {
                    z = false;
                }
                A00.A7v("can_share_to_igtv", Boolean.valueOf(z));
                A00.A9K("published_time", Long.valueOf(c105824pt.A01()));
                A00.AAP("container_module", interfaceC60442pS.getModuleName());
                A00.Cht();
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        if (r0.A00 != r4.A1C.CNP(r7.A0H)) goto L10;
     */
    @Override // X.InterfaceC145396gy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DPH(X.C41181vS r6, X.C41551w4 r7, X.C138246Of r8, boolean r9) {
        /*
            r5 = this;
            X.53a r3 = r5.A04
            r4 = r3
            instagram.features.stories.fragment.ReelViewerFragment r4 = (instagram.features.stories.fragment.ReelViewerFragment) r4
            X.1w4 r0 = r4.A0a
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L27
            X.6lR r0 = r5.A02
            if (r0 != 0) goto L1b
            java.lang.String r0 = "reelChromeAnimationManager"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L1b:
            int r2 = r0.A00
            com.instagram.model.reels.Reel r1 = r7.A0H
            X.5Gn r0 = r4.A1C
            int r0 = r0.CNP(r1)
            if (r2 == r0) goto L2c
        L27:
            r0 = 1065353216(0x3f800000, float:1.0)
            r8.ERN(r0)
        L2c:
            X.1w4 r0 = r4.A0a
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L36
            if (r9 == 0) goto L39
        L36:
            r3.D8u(r6, r8)
        L39:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C145386gx.DPH(X.1vS, X.1w4, X.6Of, boolean):void");
    }

    @Override // X.InterfaceC145396gy
    public final boolean DQo(float f, float f2) {
        Context context;
        String str;
        C145176gc c145176gc = (C145176gc) this.A07;
        Fragment fragment = (Fragment) c145176gc.A1B.get();
        if (fragment == null || (context = fragment.getContext()) == null) {
            return false;
        }
        boolean A02 = AbstractC13620mo.A02(context);
        C148346m4 c148346m4 = c145176gc.A0q;
        if (c148346m4 == null) {
            str = "backAffordanceHelper";
        } else {
            c148346m4.A00(false);
            C142236bg c142236bg = c145176gc.A0g;
            str = "reelScrubberController";
            if (c142236bg != null) {
                if (!c142236bg.A03) {
                    return false;
                }
                if (A02) {
                    f = -f;
                }
                float f3 = f - c142236bg.A00;
                c142236bg.A00 = f;
                ReelViewerFragment reelViewerFragment = c142236bg.A04.A00;
                InterfaceC147516kc interfaceC147516kc = reelViewerFragment.mVideoPlayer;
                int i = ((TextureViewSurfaceTextureListenerC147506ka) interfaceC147516kc).A03;
                int currentPositionMs = interfaceC147516kc.getCurrentPositionMs();
                C145776ha c145776ha = reelViewerFragment.A0y;
                c145776ha.getClass();
                float Bs6 = c145776ha.Bs6();
                float f4 = i;
                float f5 = (currentPositionMs / f4) * Bs6;
                float max = Math.max(-f5, Math.min(Bs6 - f5, c142236bg.A01 + f3));
                c142236bg.A01 = max;
                int min = Math.min(i, Math.max(0, currentPositionMs + ((int) ((max / Bs6) * f4))));
                c142236bg.A02 = min;
                C145776ha c145776ha2 = c142236bg.A05.A00.A0y;
                c145776ha2.getClass();
                c145776ha2.Djs(min, i);
                return true;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC145396gy
    public final void Dik() {
        C145176gc c145176gc = (C145176gc) this.A07;
        c145176gc.A11 = false;
        C148346m4 c148346m4 = c145176gc.A0q;
        if (c148346m4 == null) {
            C14360o3.A0F("backAffordanceHelper");
            throw C00O.createAndThrow();
        }
        c148346m4.A00(false);
    }

    @Override // X.InterfaceC145396gy
    public final void DlI(C105824pt c105824pt) {
        FragmentActivity activity;
        C105824pt c105824pt2;
        boolean z;
        Fragment fragment = (Fragment) this.A05.get();
        if (fragment != null && (activity = fragment.getActivity()) != null) {
            ReelViewerFragment reelViewerFragment = (ReelViewerFragment) this.A04;
            C41551w4 c41551w4 = reelViewerFragment.A0a;
            if (c41551w4 != null) {
                c105824pt2 = c41551w4.A0H.A0H;
            } else {
                c105824pt2 = null;
            }
            if (c105824pt.equals(c105824pt2)) {
                C109954xP c109954xP = c105824pt.A07;
                if (c109954xP != null && !c109954xP.A01) {
                    C193328hC c193328hC = new C193328hC((Activity) activity);
                    c193328hC.A0A(2131965323);
                    c193328hC.A09(2131965322);
                    c193328hC.A07();
                    C0fJ.A00(c193328hC.A02());
                } else {
                    int i = ((TextureViewSurfaceTextureListenerC147506ka) reelViewerFragment.mVideoPlayer).A03;
                    if (i < 60000) {
                        OQZ.A00(activity);
                    } else {
                        C27971Xb c27971Xb = C27971Xb.A00;
                        C14360o3.A0A(c27971Xb);
                        UserSession userSession = this.A01;
                        if (userSession != null) {
                            String valueOf = String.valueOf(System.nanoTime());
                            String str = c105824pt.A0X;
                            str.getClass();
                            long j = i;
                            List A00 = AbstractC54056NvG.A00(c105824pt);
                            C3PO c3po = c105824pt.A0A;
                            if (c3po == null) {
                                c3po = C3PO.A08;
                            }
                            boolean z2 = false;
                            if (c3po == C3PO.A0A) {
                                z2 = true;
                            }
                            c27971Xb.A00(activity, userSession, null, valueOf, str, A00, j, false, z2);
                            UserSession userSession2 = this.A01;
                            if (userSession2 != null) {
                                C25671My A002 = AbstractC25651Mw.A00(userSession2);
                                InterfaceC42271xH interfaceC42271xH = this.A00;
                                if (interfaceC42271xH != null) {
                                    UserSession userSession3 = this.A01;
                                    if (userSession3 != null) {
                                        AbstractC25651Mw.A00(userSession3).A02(interfaceC42271xH, C56011Oti.class);
                                    }
                                }
                                C36120Fwu c36120Fwu = new C36120Fwu(c105824pt, this);
                                this.A00 = c36120Fwu;
                                A002.A01(c36120Fwu, C56011Oti.class);
                            }
                        }
                        C14360o3.A0F("userSession");
                        throw C00O.createAndThrow();
                    }
                }
            }
            UserSession userSession4 = this.A01;
            if (userSession4 != null) {
                InterfaceC60442pS interfaceC60442pS = this.A06;
                C18920wW A01 = AbstractC12220kQ.A01(interfaceC60442pS, userSession4);
                InterfaceC02590Ai A003 = A01.A00(A01.A00, "ig_live_archive_share_click");
                A003.A9K("a_pk", Long.valueOf(Long.parseLong(c105824pt.A03().getId())));
                String str2 = c105824pt.A0e;
                str2.getClass();
                A003.AAP("m_pk", str2);
                String str3 = c105824pt.A0X;
                str3.getClass();
                A003.A9K(TraceFieldType.BroadcastId, Long.valueOf(Long.parseLong(str3)));
                C109954xP c109954xP2 = c105824pt.A07;
                if (c109954xP2 != null) {
                    A003.A9K("archive_id", Long.valueOf(Long.parseLong(c109954xP2.A00)));
                    C109954xP c109954xP3 = c105824pt.A07;
                    if (c109954xP3 != null) {
                        z = c109954xP3.A01;
                    } else {
                        z = false;
                    }
                    A003.A7v("can_share_to_igtv", Boolean.valueOf(z));
                    A003.A9K("published_time", Long.valueOf(c105824pt.A01()));
                    A003.AAP("container_module", interfaceC60442pS.getModuleName());
                    A003.Cht();
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            C14360o3.A0F("userSession");
            throw C00O.createAndThrow();
        }
    }

    @Override // X.InterfaceC144626fi, X.InterfaceC144636fj
    public final boolean DrS(float f, float f2) {
        return this.A07.DrS(f, f2);
    }

    @Override // X.InterfaceC144626fi
    public final boolean DrU() {
        return this.A07.DrU();
    }

    @Override // X.InterfaceC144626fi
    public final boolean DrW() {
        return this.A07.DrW();
    }

    @Override // X.InterfaceC145396gy
    public final void DsB(float f, float f2) {
        this.A07.DsB(f, f2);
    }

    public C145386gx(InterfaceC60442pS interfaceC60442pS, InterfaceC1118853a interfaceC1118853a, InterfaceC144586fe interfaceC144586fe, WeakReference weakReference) {
        this.A05 = weakReference;
        this.A07 = interfaceC144586fe;
        this.A04 = interfaceC1118853a;
        this.A06 = interfaceC60442pS;
    }
}
