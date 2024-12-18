package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.quickpromotion.intf.Trigger;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.9ED, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9ED extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9ED(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.2fr, java.lang.Object] */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        String str;
        switch (this.A00) {
            case 0:
                return ((C164667Yf) ((C7XQ) ((C164197Wi) this.A01).A0Q.getValue()).A0O.getValue()).A01;
            case 1:
                return ((C7XQ) ((C164197Wi) this.A01).A0Q.getValue()).A0Z.getValue();
            case 2:
                return ((C7XQ) ((C164197Wi) this.A01).A0Q.getValue()).A0n.getValue();
            case 3:
                C7NH A00 = C7NH.A00(((C164197Wi) this.A01).A0A);
                C14360o3.A07(A00);
                return A00;
            case 4:
                C7DK c7dk = ((C164197Wi) this.A01).A06;
                if (c7dk != null) {
                    return c7dk;
                }
                str = "audioPlayer";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 5:
                return ((C7Z7) ((C7XQ) ((C164197Wi) this.A01).A0Q.getValue()).A0k.getValue()).A00;
            case 6:
                return ((C7XQ) ((C164197Wi) this.A01).A0Q.getValue()).A06;
            case 7:
                return ((C7XQ) ((C164197Wi) this.A01).A0Q.getValue()).A0g.getValue();
            case 8:
            case 9:
                InterfaceC83713oG C7i = ((C7U0) ((InterfaceC16820sZ) this.A01).invoke()).C7r().C7i();
                C14360o3.A07(C7i);
                return C7i;
            case 10:
                return ((C7U6) this.A01).A01;
            case 11:
                Window window = ((C7U6) this.A01).A01.requireActivity().getWindow();
                if (window != null) {
                    View decorView = window.getDecorView();
                    C14360o3.A0C(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
                    return decorView;
                }
                return null;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case 14:
            case Process.SIGTERM /* 15 */:
            case 16:
            case 18:
            default:
                C7TT C7W = ((C7U0) ((C7U6) this.A01).A0A.invoke()).C7r().C7W();
                C14360o3.A07(C7W);
                return C7W;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                C7U6 c7u6 = (C7U6) this.A01;
                ((C7U0) c7u6.A0A.invoke()).BT6().Cyn();
                c7u6.A0C.invoke();
                return C0eB.A00;
            case 17:
                return ((C7U0) ((C7U6) this.A01).A0A.invoke()).BT6();
            case Process.SIGSTOP /* 19 */:
                String C7q = ((C7U0) ((C7U6) this.A01).A0A.invoke()).C7r().C7q();
                if (C7q != null) {
                    return C7q;
                }
                return "";
            case 20:
                C7TT C7W2 = ((C7U0) ((C7ZJ) this.A01).A03.invoke()).C7r().C7W();
                C14360o3.A07(C7W2);
                return C7W2;
            case 21:
                return AbstractC161117Jw.A00(((C7XK) this.A01).A03);
            case 22:
                ((C7XA) this.A01).A09.A00(true);
                return C0eB.A00;
            case 23:
                C27961Xa A002 = AbstractC54912fq.A00();
                final C7YB c7yb = (C7YB) this.A01;
                AbstractC59962oe abstractC59962oe = c7yb.A01;
                InterfaceC11380iw interfaceC11380iw = c7yb.A03;
                UserSession userSession = c7yb.A04;
                QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A0M;
                AbstractC54912fq.A00();
                ?? obj = new Object();
                obj.A04 = new P72(c7yb, 3);
                obj.A08 = new MUU(c7yb, 3);
                obj.A01(new InterfaceC55022g1() { // from class: X.7JE
                    @Override // X.InterfaceC55022g1
                    public final void Dtj(C125715mI c125715mI) {
                        C14360o3.A0B(c125715mI, 0);
                        C7YB c7yb2 = C7YB.this;
                        ((C64742wY) c7yb2.A0C.getValue()).A01((AbstractC55352ga) c7yb2.A0B.getValue(), c125715mI);
                    }

                    @Override // X.InterfaceC55022g1
                    public final void DXC(C125715mI c125715mI) {
                        ((C64742wY) C7YB.this.A0C.getValue()).A02 = c125715mI;
                    }
                }, (C64742wY) c7yb.A0C.getValue());
                obj.A05 = new InterfaceC55132gD() { // from class: X.7JF
                    @Override // X.InterfaceC55132gD
                    public final void DT7(C4NL c4nl) {
                        C14360o3.A0B(c4nl, 0);
                        C7YB.this.A06.A01((C4NJ) c4nl);
                    }
                };
                obj.A00 = new InterfaceC55172gH() { // from class: X.7JG
                    @Override // X.InterfaceC55172gH
                    public final void D0F(C4NL c4nl) {
                        C14360o3.A0B(c4nl, 0);
                        C7YB c7yb2 = C7YB.this;
                        C64752wZ c64752wZ = (C64752wZ) c7yb2.A09.getValue();
                        QuickPromotionSlot quickPromotionSlot2 = QuickPromotionSlot.A0M;
                        C37018GSz c37018GSz = new C37018GSz(18, c7yb2, c4nl);
                        c64752wZ.A00(c7yb2.A01.requireActivity(), c7yb2.A04, c4nl, quickPromotionSlot2, c37018GSz);
                    }
                };
                obj.A01 = new InterfaceC55142gE() { // from class: X.7JH
                    @Override // X.InterfaceC55142gE
                    public final void DHX(C4NL c4nl) {
                        ViewGroup viewGroup;
                        AbstractC46524KiP abstractC46524KiP;
                        C14360o3.A0B(c4nl, 0);
                        C7YB c7yb2 = C7YB.this;
                        C162307Os c162307Os = (C162307Os) c7yb2.A0D.invoke();
                        if (c162307Os != null) {
                            ViewGroup viewGroup2 = c162307Os.A01;
                            if ((viewGroup2 != null && viewGroup2.getVisibility() == 0 && (abstractC46524KiP = c162307Os.A03) != null && abstractC46524KiP.A05()) || (viewGroup = (ViewGroup) c7yb2.A01.requireView().findViewById(R.id.floating_banner_container)) == null) {
                                return;
                            }
                            HashMap hashMap = new HashMap();
                            if (c4nl.CB6().contains(Trigger.A1O)) {
                                AtomicReference atomicReference = c7yb2.A08;
                                if (atomicReference.get() != null) {
                                    Object obj2 = atomicReference.get();
                                    if (obj2 == null) {
                                        obj2 = "";
                                    }
                                    hashMap.put("saved_reply_id", obj2);
                                    atomicReference.set(null);
                                }
                            }
                            ((C1571173q) c7yb2.A0A.getValue()).A01(viewGroup, c4nl, (AbstractC55352ga) c7yb2.A0B.getValue(), hashMap);
                        }
                    }
                };
                return A002.A02(abstractC59962oe, interfaceC11380iw, userSession, obj.A00(), quickPromotionSlot);
            case 24:
                C27961Xa A003 = AbstractC54912fq.A00();
                UserSession userSession2 = ((C7YB) this.A01).A04;
                HashMap hashMap = new HashMap();
                hashMap.put(QPTooltipAnchor.A1L, new InterfaceC64682wS() { // from class: X.7JB
                    public final Integer A00 = C05F.A00;

                    @Override // X.InterfaceC64682wS
                    public final int CI5(Context context, UserSession userSession3) {
                        return 0;
                    }

                    @Override // X.InterfaceC64682wS
                    public final int CIc(Context context) {
                        C14360o3.A0B(context, 0);
                        return context.getResources().getDimensionPixelOffset(R.dimen.album_preview_add_item_margin);
                    }

                    @Override // X.InterfaceC64682wS
                    public final long EM4() {
                        return 0L;
                    }

                    @Override // X.InterfaceC64682wS
                    public final Integer AwQ() {
                        return this.A00;
                    }

                    @Override // X.InterfaceC64682wS
                    public final boolean CV9() {
                        return true;
                    }
                });
                hashMap.put(QPTooltipAnchor.A0c, new InterfaceC64682wS() { // from class: X.7JC
                    public final Integer A00 = C05F.A01;

                    @Override // X.InterfaceC64682wS
                    public final int CI5(Context context, UserSession userSession3) {
                        return 0;
                    }

                    @Override // X.InterfaceC64682wS
                    public final int CIc(Context context) {
                        C14360o3.A0B(context, 0);
                        return context.getResources().getDimensionPixelOffset(R.dimen.account_discovery_bottom_gap);
                    }

                    @Override // X.InterfaceC64682wS
                    public final long EM4() {
                        return 0L;
                    }

                    @Override // X.InterfaceC64682wS
                    public final Integer AwQ() {
                        return this.A00;
                    }

                    @Override // X.InterfaceC64682wS
                    public final boolean CV9() {
                        return true;
                    }
                });
                hashMap.put(QPTooltipAnchor.A0e, new InterfaceC64682wS() { // from class: X.7JD
                    public final Integer A00 = C05F.A00;

                    @Override // X.InterfaceC64682wS
                    public final int CI5(Context context, UserSession userSession3) {
                        return 0;
                    }

                    @Override // X.InterfaceC64682wS
                    public final int CIc(Context context) {
                        C14360o3.A0B(context, 0);
                        return context.getResources().getDimensionPixelOffset(R.dimen.account_discovery_bottom_gap);
                    }

                    @Override // X.InterfaceC64682wS
                    public final long EM4() {
                        return 0L;
                    }

                    @Override // X.InterfaceC64682wS
                    public final Integer AwQ() {
                        return this.A00;
                    }

                    @Override // X.InterfaceC64682wS
                    public final boolean CV9() {
                        return true;
                    }
                });
                return A003.A05(userSession2, hashMap);
            case 25:
                C7YJ c7yj = (C7YJ) this.A01;
                return AbstractC31273Dov.A00(c7yj.A01.requireContext(), c7yj.A03);
            case 26:
                C7YJ c7yj2 = (C7YJ) this.A01;
                return new WD9(c7yj2.A01, c7yj2.A03, c7yj2.A04);
            case 27:
                C7YJ c7yj3 = (C7YJ) this.A01;
                return AbstractC163367Sz.A00(c7yj3.A03, C7YJ.A00(c7yj3).C7r());
            case 28:
                UserSession userSession3 = ((C164477Xm) this.A01).A00;
                if (C7KH.A07(userSession3)) {
                    return C9ME.A00(userSession3);
                }
                return null;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                Context requireContext = ((C7ZK) this.A01).A06.requireContext();
                C6WQ c6wq = new C6WQ(requireContext, true);
                c6wq.A00(requireContext.getString(2131960720));
                return c6wq;
            case 30:
                AnonymousClass983 anonymousClass983 = (AnonymousClass983) this.A01;
                return new A9W(AbstractC12220kQ.A02(anonymousClass983.A10), anonymousClass983.A0r.getString("DirectThreadFragment.DIRECT_THREAD_FRAGMENT_META_AI_SESSION_ID"));
            case 31:
                return ((AnonymousClass983) this.A01).A06;
            case 32:
                AnonymousClass983.A06((AnonymousClass983) this.A01).A1G();
                return C0eB.A00;
            case 33:
                return ((Fragment) this.A01).getViewLifecycleOwner();
            case 34:
                return this.A01;
            case 35:
                AnonymousClass983.A0A((AnonymousClass983) this.A01);
                return C0eB.A00;
            case 36:
                DirectShareTarget A0L = AnonymousClass983.A01((AnonymousClass983) this.A01).A0L();
                C14360o3.A0A(A0L);
                return A0L;
            case 37:
                AnonymousClass983 anonymousClass9832 = (AnonymousClass983) this.A01;
                Context context = anonymousClass9832.A02;
                if (context == null) {
                    str = "context";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                Context applicationContext = context.getApplicationContext();
                C14360o3.A07(applicationContext);
                return new C159457Dg(applicationContext, anonymousClass9832.A0u, anonymousClass9832.A10, anonymousClass9832.A1V);
            case 38:
                return ((AnonymousClass983) this.A01).A0b;
            case 39:
                AnonymousClass983 anonymousClass9833 = (AnonymousClass983) this.A01;
                InterfaceC59992oh interfaceC59992oh = anonymousClass9833.A0y;
                C7DQ c7dq = anonymousClass9833.A0H;
                if (c7dq == null) {
                    str = "octaneThreadLifecycleListener";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                interfaceC59992oh.unregisterLifecycleListener(c7dq);
                return C0eB.A00;
            case 40:
                AnonymousClass983.A06((AnonymousClass983) this.A01).A1R(EnumC160197Gf.A03);
                return C0eB.A00;
            case Seq.NULL_REFNUM /* 41 */:
                final UserSession userSession4 = ((AnonymousClass983) this.A01).A10;
                return new AbstractC61132qb(userSession4) { // from class: X.7Ed
                    public final UserSession A00;

                    @Override // X.AbstractC61132qb
                    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
                        UserSession userSession5 = this.A00;
                        C14360o3.A0B(userSession5, 0);
                        return new C98L(userSession5, (C7Ef) userSession5.A01(C7Ee.class, new C50160MDn(C40121td.A0G.A01(userSession5.deviceSession.A06(), userSession5), 30)));
                    }

                    {
                        this.A00 = userSession4;
                    }
                };
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return ((Fragment) this.A01).requireActivity().getViewModelStore();
            case 43:
                C7KJ c7kj = (C7KJ) this.A01;
                View requireViewById = c7kj.A00.requireViewById(R.id.direct_thread_typing_below_fold_indicator);
                C14360o3.A07(requireViewById);
                ImageView imageView = (ImageView) requireViewById;
                imageView.setImageDrawable(C7KJ.A00(c7kj));
                return imageView;
            case 44:
                C7X7.A00((C7X7) this.A01);
                return C0eB.A00;
            case 45:
                return Boolean.valueOf(C18U.A06(C06090Tz.A05, ((C7X7) this.A01).A05, 2342172634332086727L));
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return Boolean.valueOf(C18U.A06(C06090Tz.A05, ((C7X7) this.A01).A05, 36329625118458312L));
            case 47:
                return Boolean.valueOf(C18U.A06(C06090Tz.A05, ((C7X7) this.A01).A05, 2342172634332021190L));
            case 48:
                final AbstractC59962oe abstractC59962oe2 = (AbstractC59962oe) this.A01;
                return new InterfaceC164977Zm() { // from class: X.7A7
                    @Override // X.InterfaceC164977Zm
                    public final C19L Arw() {
                        return C07Y.A00(AbstractC59962oe.this);
                    }
                };
            case 49:
                return new C23915Aii(((AnonymousClass982) this.A01).A01);
        }
    }
}
