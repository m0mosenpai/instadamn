package X;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class X32 extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X32(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        String str;
        Object parcelable;
        String str2;
        String str3;
        View view;
        int i;
        BQL bql;
        switch (this.A00) {
            case 0:
            case 5:
                AbstractC59962oe abstractC59962oe = (AbstractC59962oe) this.A01;
                PromoteData A00 = InterfaceC72021XFj.A00(abstractC59962oe);
                return new C50856Mdn(abstractC59962oe.mArguments, abstractC59962oe, new W6E(abstractC59962oe.requireActivity(), abstractC59962oe, A00.A0y), A00, null, abstractC59962oe);
            case 1:
            case 6:
            case 9:
            case 14:
            case 22:
            case 37:
            case 43:
                return this.A01;
            case 2:
            case 7:
            case 10:
            case Process.SIGTERM /* 15 */:
            case 23:
            case 38:
            case 44:
            case 48:
            case 49:
                return ((InterfaceC16820sZ) this.A01).invoke();
            case 3:
            case 8:
            case 11:
            case 16:
            case 24:
            case 39:
            case 45:
            default:
                return AbstractC167027dH.A0B(this.A01);
            case 4:
                KCN kcn = (KCN) this.A01;
                UserSession session = kcn.getSession();
                PromoteData promoteData = kcn.A09;
                if (promoteData == null) {
                    str = "promoteData";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                String str4 = promoteData.A1A;
                C14360o3.A06(str4);
                return new C45581KFv(session, str4);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                AbstractC59962oe abstractC59962oe2 = (AbstractC59962oe) this.A01;
                return new C50856Mdn(abstractC59962oe2.mArguments, abstractC59962oe2, null, InterfaceC72021XFj.A00(abstractC59962oe2), XFZ.A00(abstractC59962oe2), abstractC59962oe2);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                UserSession userSession = ((C67891V0y) this.A01).A01;
                if (userSession != null) {
                    return C70399WUb.A00(userSession);
                }
                str = "session";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 17:
                Fragment fragment = (Fragment) this.A01;
                Bundle requireArguments = fragment.requireArguments();
                int i2 = Build.VERSION.SDK_INT;
                AudioOverlayTrack audioOverlayTrack = null;
                Bundle bundle = fragment.mArguments;
                if (i2 >= 33) {
                    if (bundle != null) {
                        parcelable = AbstractC53062bn.A01(bundle, AudioOverlayTrack.class, "selected_audio_overlay_track");
                        audioOverlayTrack = (AudioOverlayTrack) parcelable;
                    }
                    return new UFB(requireArguments, fragment, audioOverlayTrack);
                }
                if (bundle != null) {
                    parcelable = bundle.getParcelable("selected_audio_overlay_track");
                    audioOverlayTrack = (AudioOverlayTrack) parcelable;
                }
                return new UFB(requireArguments, fragment, audioOverlayTrack);
            case 18:
            case Process.SIGSTOP /* 19 */:
                C67892V0z.A01((C67892V0z) this.A01);
                return C0eB.A00;
            case 20:
                V09 v09 = (V09) this.A01;
                C70399WUb c70399WUb = v09.A00;
                if (c70399WUb == null) {
                    str = "promoteLogger";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                return new V26(c70399WUb, v09, 13);
            case 21:
                UFH ufh = (UFH) this.A01;
                UserSession userSession2 = ufh.A01;
                String str5 = ufh.A03;
                String str6 = ufh.A02;
                String str7 = C70399WUb.A00(userSession2).A03;
                C14360o3.A07(str7);
                C25621Ms A0c = AbstractC167017dG.A0c(userSession2);
                AbstractC37301Gc2.A1M(A0c, "ads/ads_manager/fetch_promotion_information_v2/", str5);
                A0c.A9s("fb_auth_token", str6);
                A0c.A0H("flow_id", str7);
                A0c.A0R(C67838UzB.class, C69909Vxa.class);
                return A0c.A0N().A03(1010569493);
            case 25:
                return new KFW((UserSession) ((N5J) this.A01).A02.getValue());
            case 26:
                EIM eim = (EIM) this.A01;
                Integer num = eim.A01;
                if (num == null) {
                    str2 = "linkingType";
                } else {
                    int intValue = num.intValue();
                    str2 = "entryPoint";
                    if (intValue != 0 && intValue != 2) {
                        if (intValue == 1) {
                            UserSession userSession3 = (UserSession) eim.A05.getValue();
                            String str8 = eim.A02;
                            if (str8 != null) {
                                C45126Jxv c45126Jxv = eim.A00;
                                if (c45126Jxv == null) {
                                    str2 = "additionalConfig";
                                } else {
                                    return new C35932Ftq(eim, c45126Jxv, userSession3, str8);
                                }
                            }
                        } else {
                            throw new RuntimeException();
                        }
                    } else {
                        UserSession userSession4 = (UserSession) eim.A05.getValue();
                        String str9 = eim.A02;
                        if (str9 != null) {
                            return new C35931Ftp(eim, userSession4, str9);
                        }
                    }
                }
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            case 27:
                C25621Ms A0M = AbstractC31177DnL.A0M(((C25815BbW) this.A01).A00.A00);
                A0M.A0B("business/account/get_story_highlights/");
                A0M.A0D("item_limit", 10);
                A0M.A0R(C38835H8j.class, C41266IOh.class);
                return AbstractC58232lf.A00(AnonymousClass191.A00, new C50540MSt(A0M.A0N().A03(1422754593), 13));
            case 28:
                WIM wim = ((W37) this.A01).A00;
                if (wim == null) {
                    str3 = "framesHandler";
                } else {
                    wim.A0A.A01();
                    Surface surface = wim.A03;
                    if (surface == null) {
                        str3 = "surface";
                    } else {
                        surface.release();
                        wim.A01 = -1.0f;
                        wim.A00 = -1.0f;
                        List list = wim.A0N;
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((C200688uB) it.next()).A01();
                        }
                        list.clear();
                        Surface surface2 = wim.A05;
                        if (surface2 != null) {
                            surface2.release();
                        }
                        wim.A05 = null;
                        AbstractC180277zH abstractC180277zH = wim.A09;
                        if (abstractC180277zH != null) {
                            abstractC180277zH.A02();
                        }
                        wim.A09 = null;
                        Surface surface3 = wim.A04;
                        if (surface3 != null) {
                            surface3.release();
                        }
                        wim.A04 = null;
                        AbstractC180277zH abstractC180277zH2 = wim.A08;
                        if (abstractC180277zH2 != null) {
                            abstractC180277zH2.A02();
                        }
                        wim.A08 = null;
                        AKR akr = wim.A0D;
                        if (akr == null) {
                            str3 = "boomerangFramesGLRenderer";
                        } else {
                            akr.A02();
                            C178927x4 c178927x4 = wim.A06;
                            if (c178927x4 == null) {
                                str3 = "selfEGLCore";
                            } else {
                                c178927x4.release();
                                wim.A0O.set(5);
                                return C0eB.A00;
                            }
                        }
                    }
                }
                C14360o3.A0F(str3);
                throw C00O.createAndThrow();
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                ViewOnKeyListenerC67976V4r viewOnKeyListenerC67976V4r = (ViewOnKeyListenerC67976V4r) this.A01;
                View A0A = AbstractC31172DnG.A0A(LayoutInflater.from(viewOnKeyListenerC67976V4r.A0L.A00), null, R.layout.canvas_main_layout);
                C14360o3.A0A(A0A);
                A0A.setTag(new C69344Vlq(A0A));
                viewOnKeyListenerC67976V4r.A01 = (RecyclerView) A0A.requireViewById(R.id.listview);
                Context context = viewOnKeyListenerC67976V4r.A0F;
                GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 4);
                gridLayoutManager.A01 = new JnN(viewOnKeyListenerC67976V4r, 4);
                RecyclerView recyclerView = viewOnKeyListenerC67976V4r.A01;
                str3 = "recyclerView";
                if (recyclerView != null) {
                    recyclerView.setLayoutManager(gridLayoutManager);
                    RecyclerView recyclerView2 = viewOnKeyListenerC67976V4r.A01;
                    if (recyclerView2 != null) {
                        C66425UGy c66425UGy = viewOnKeyListenerC67976V4r.A0M;
                        recyclerView2.setAdapter(c66425UGy);
                        RecyclerView recyclerView3 = viewOnKeyListenerC67976V4r.A01;
                        if (recyclerView3 != null) {
                            recyclerView3.A0S = true;
                            recyclerView3.requestFocus();
                            RecyclerView recyclerView4 = viewOnKeyListenerC67976V4r.A01;
                            if (recyclerView4 != null) {
                                recyclerView4.setOnKeyListener(viewOnKeyListenerC67976V4r);
                                RecyclerView recyclerView5 = viewOnKeyListenerC67976V4r.A01;
                                if (recyclerView5 != null) {
                                    UserSession userSession5 = viewOnKeyListenerC67976V4r.A0O;
                                    viewOnKeyListenerC67976V4r.A06 = new ViewOnKeyListenerC67971V4l(context, recyclerView5, c66425UGy, viewOnKeyListenerC67976V4r, userSession5);
                                    RecyclerView recyclerView6 = viewOnKeyListenerC67976V4r.A01;
                                    if (recyclerView6 != null) {
                                        C67969V4i c67969V4i = new C67969V4i(context, recyclerView6);
                                        C60462pV c60462pV = viewOnKeyListenerC67976V4r.A0G;
                                        ViewOnKeyListenerC67971V4l viewOnKeyListenerC67971V4l = viewOnKeyListenerC67976V4r.A06;
                                        str = "videoModule";
                                        if (viewOnKeyListenerC67971V4l != null) {
                                            c60462pV.A0E(viewOnKeyListenerC67971V4l);
                                            c60462pV.A0E(c67969V4i);
                                            ViewOnKeyListenerC67971V4l viewOnKeyListenerC67971V4l2 = viewOnKeyListenerC67976V4r.A06;
                                            if (viewOnKeyListenerC67971V4l2 != null) {
                                                c66425UGy.A01 = viewOnKeyListenerC67971V4l2;
                                                C67970V4j c67970V4j = new C67970V4j(userSession5, viewOnKeyListenerC67976V4r, viewOnKeyListenerC67976V4r.A0U);
                                                viewOnKeyListenerC67976V4r.A03 = c67970V4j;
                                                str = "analyticsHelper";
                                                c60462pV.A0E(c67970V4j);
                                                C70909WkC c70909WkC = new C70909WkC(c66425UGy);
                                                RecyclerView recyclerView7 = viewOnKeyListenerC67976V4r.A01;
                                                if (recyclerView7 != null) {
                                                    C67970V4j c67970V4j2 = viewOnKeyListenerC67976V4r.A03;
                                                    if (c67970V4j2 != null) {
                                                        UHI uhi = new UHI(recyclerView7, c70909WkC, new V84(recyclerView7, c67970V4j2, c70909WkC));
                                                        viewOnKeyListenerC67976V4r.A05 = uhi;
                                                        RecyclerView recyclerView8 = viewOnKeyListenerC67976V4r.A01;
                                                        if (recyclerView8 != null) {
                                                            recyclerView8.A14(uhi);
                                                            RecyclerView recyclerView9 = viewOnKeyListenerC67976V4r.A01;
                                                            if (recyclerView9 != null) {
                                                                AbstractC13880nE.A0d(recyclerView9, viewOnKeyListenerC67976V4r.A0C);
                                                                return A0A;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        C14360o3.A0F(str);
                                        throw C00O.createAndThrow();
                                    }
                                }
                            }
                        }
                    }
                }
                C14360o3.A0F(str3);
                throw C00O.createAndThrow();
            case 30:
                ViewGroup viewGroup = ((C69344Vlq) this.A01).A03;
                View A0R = AbstractC25226BEj.A0R(AbstractC31177DnL.A0E(viewGroup, 0), viewGroup, R.layout.canvas_swipe_to_open_block, false);
                viewGroup.addView(A0R);
                return A0R;
            case 31:
                view = (View) ((UHS) this.A01).A0C.getValue();
                i = R.id.chevron;
                return AbstractC166997dE.A0S(view, i);
            case 32:
                view = (View) ((UHS) this.A01).A0C.getValue();
                i = R.id.chevron_fill;
                return AbstractC166997dE.A0S(view, i);
            case 33:
                view = ((UHS) this.A01).A06;
                i = R.id.footer_container;
                return AbstractC166997dE.A0S(view, i);
            case 34:
                view = ((UHS) this.A01).A06;
                i = R.id.swipe_to_open_container;
                return AbstractC166997dE.A0S(view, i);
            case 35:
                view = (View) ((UHS) this.A01).A0C.getValue();
                i = R.id.swipe_to_open_text;
                return AbstractC166997dE.A0S(view, i);
            case 36:
                return ((AbstractC69220Vjn) this.A01).A00;
            case 40:
                return new C26986BvR((UserSession) ((C26767Bro) this.A01).A02.getValue());
            case Seq.NULL_REFNUM /* 41 */:
                C26560BoJ c26560BoJ = (C26560BoJ) this.A01;
                c26560BoJ.A01.invoke(BQL.A0O);
                c26560BoJ.A00.invoke();
                return C0eB.A00;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                C26560BoJ c26560BoJ2 = (C26560BoJ) this.A01;
                boolean z = c26560BoJ2.A04;
                InterfaceC16660sJ interfaceC16660sJ = c26560BoJ2.A01;
                if (z) {
                    bql = BQL.A0P;
                } else {
                    bql = BQL.A0Q;
                }
                interfaceC16660sJ.invoke(bql);
                if (c26560BoJ2.A03) {
                    AbstractC25227BEk.A1Q(c26560BoJ2.A02, !z);
                }
                return C0eB.A00;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return new C32553EVd((UserSession) ((EIY) this.A01).A02.getValue());
            case 47:
                return new G06((AbstractC12990ll) this.A01);
        }
    }
}
