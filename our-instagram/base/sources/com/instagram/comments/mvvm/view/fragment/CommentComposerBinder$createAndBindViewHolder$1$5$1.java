package com.instagram.comments.mvvm.view.fragment;

import X.ACG;
import X.AKE;
import X.AOU;
import X.AbstractC09440dt;
import X.AbstractC09560e7;
import X.AbstractC111324zv;
import X.AbstractC13100lw;
import X.AbstractC13880nE;
import X.AbstractC166987dD;
import X.AbstractC167027dH;
import X.AbstractC225909y9;
import X.AbstractC23611Dp;
import X.AbstractC23641Du;
import X.AbstractC35239FgY;
import X.AbstractC43591JPw;
import X.AbstractC59962oe;
import X.AbstractC86353t7;
import X.AnonymousClass191;
import X.C05F;
import X.C07S;
import X.C07X;
import X.C07Y;
import X.C0YZ;
import X.C0eB;
import X.C0fJ;
import X.C143266dR;
import X.C14360o3;
import X.C166397c8;
import X.C166617cX;
import X.C166627cY;
import X.C167477e2;
import X.C167487e3;
import X.C167497e4;
import X.C167507e5;
import X.C167517e7;
import X.C167527e8;
import X.C167537e9;
import X.C167547eA;
import X.C167557eB;
import X.C167567eC;
import X.C167577eD;
import X.C167587eE;
import X.C167597eF;
import X.C167987et;
import X.C169287h2;
import X.C169297h3;
import X.C189478aR;
import X.C193328hC;
import X.C1YB;
import X.C206399Bw;
import X.C211829a9;
import X.C23584Ace;
import X.C25814BbV;
import X.C26025BfE;
import X.C26785Bs9;
import X.C29639D5b;
import X.C29906DGu;
import X.C30712DfA;
import X.C33H;
import X.C3DN;
import X.C52116N4o;
import X.C54591O9s;
import X.C56811PJh;
import X.C57312k6;
import X.C60842q8;
import X.C7e6;
import X.C8YB;
import X.C8YH;
import X.C9ZB;
import X.D8L;
import X.EnumC09460dv;
import X.EnumC222569rx;
import X.EnumC222649s5;
import X.EnumC46186KcO;
import X.F86;
import X.InterfaceC09390do;
import X.InterfaceC16620sF;
import X.InterfaceC166407c9;
import X.InterfaceC168087f3;
import X.InterfaceC16820sZ;
import X.InterfaceC23621Ds;
import X.InterfaceC60442pS;
import X.LBJ;
import X.MCR;
import X.ME7;
import X.MSV;
import X.NXQ;
import X.RunnableC168147f9;
import X.RunnableC24585Aug;
import X.RunnableC24745AxT;
import X.RunnableC24833Ayt;
import X.RunnableC24835Ayv;
import X.RunnableC24836Ayw;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.comments.mvvm.view.fragment.CommentComposerBinder$createAndBindViewHolder$1$5$1", f = "CommentComposerBinder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class CommentComposerBinder$createAndBindViewHolder$1$5$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public /* synthetic */ Object A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ AbstractC59962oe A03;
    public final /* synthetic */ InterfaceC168087f3 A04;
    public final /* synthetic */ C26025BfE A05;
    public final /* synthetic */ C166627cY A06;
    public final /* synthetic */ C25814BbV A07;
    public final /* synthetic */ UserSession A08;
    public final /* synthetic */ AbstractC13100lw A09;
    public final /* synthetic */ InterfaceC60442pS A0A;
    public final /* synthetic */ InterfaceC16820sZ A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentComposerBinder$createAndBindViewHolder$1$5$1(Context context, View view, AbstractC59962oe abstractC59962oe, InterfaceC168087f3 interfaceC168087f3, C26025BfE c26025BfE, C166627cY c166627cY, C25814BbV c25814BbV, UserSession userSession, AbstractC13100lw abstractC13100lw, InterfaceC60442pS interfaceC60442pS, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16820sZ interfaceC16820sZ) {
        super(2, interfaceC23621Ds);
        this.A04 = interfaceC168087f3;
        this.A06 = c166627cY;
        this.A0B = interfaceC16820sZ;
        this.A02 = view;
        this.A01 = context;
        this.A08 = userSession;
        this.A07 = c25814BbV;
        this.A03 = abstractC59962oe;
        this.A0A = interfaceC60442pS;
        this.A09 = abstractC13100lw;
        this.A05 = c26025BfE;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        InterfaceC168087f3 interfaceC168087f3 = this.A04;
        C166627cY c166627cY = this.A06;
        InterfaceC16820sZ interfaceC16820sZ = this.A0B;
        View view = this.A02;
        Context context = this.A01;
        UserSession userSession = this.A08;
        C25814BbV c25814BbV = this.A07;
        AbstractC59962oe abstractC59962oe = this.A03;
        InterfaceC60442pS interfaceC60442pS = this.A0A;
        CommentComposerBinder$createAndBindViewHolder$1$5$1 commentComposerBinder$createAndBindViewHolder$1$5$1 = new CommentComposerBinder$createAndBindViewHolder$1$5$1(context, view, abstractC59962oe, interfaceC168087f3, this.A05, c166627cY, c25814BbV, userSession, this.A09, interfaceC60442pS, interfaceC23621Ds, interfaceC16820sZ);
        commentComposerBinder$createAndBindViewHolder$1$5$1.A00 = obj;
        return commentComposerBinder$createAndBindViewHolder$1$5$1;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CommentComposerBinder$createAndBindViewHolder$1$5$1) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v73, types: [X.A33, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v90, types: [X.A33, java.lang.Object] */
    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        ComposerAutoCompleteTextView composerAutoCompleteTextView;
        Runnable runnableC24833Ayt;
        FragmentActivity activity;
        UserSession userSession;
        AbstractC86353t7 nxq;
        C26785Bs9 c26785Bs9;
        AbstractC09560e7.A00(obj);
        InterfaceC166407c9 interfaceC166407c9 = (InterfaceC166407c9) this.A00;
        if (interfaceC166407c9 instanceof C167477e2) {
            InterfaceC168087f3 interfaceC168087f3 = this.A04;
            C167477e2 c167477e2 = (C167477e2) interfaceC166407c9;
            int i = c167477e2.A00;
            String str = c167477e2.A01;
            C14360o3.A0B(str, 1);
            interfaceC168087f3.E5z(new C9ZB(i, str, ""));
        } else if (interfaceC166407c9 instanceof C167487e3) {
            this.A06.A0B.setText("");
        } else if (interfaceC166407c9 instanceof C167497e4) {
            C167497e4 c167497e4 = (C167497e4) interfaceC166407c9;
            C167987et c167987et = c167497e4.A00;
            if (c167987et != null) {
                this.A04.Dgr(c167987et);
            }
            C166617cX.A00.A08(this.A06, c167497e4.A01, this.A0B);
        } else if (interfaceC166407c9 instanceof C167507e5) {
            C166627cY c166627cY = this.A06;
            c166627cY.A0B.post(new RunnableC168147f9(c166627cY, this.A0B));
        } else {
            boolean z = interfaceC166407c9 instanceof C206399Bw;
            if (z && ((C206399Bw) interfaceC166407c9).A00 == 1) {
                AbstractC13880nE.A0O(this.A02);
                LBJ.A01(this.A01, this.A08, EnumC46186KcO.A05, ((C206399Bw) interfaceC166407c9).A02, new C29639D5b(this.A07));
            } else if (interfaceC166407c9 instanceof C7e6) {
                AbstractC13880nE.A0O(this.A02);
                C7e6 c7e6 = (C7e6) interfaceC166407c9;
                if (c7e6.A02) {
                    AbstractC59962oe abstractC59962oe = this.A03;
                    UserSession userSession2 = this.A08;
                    C29906DGu c29906DGu = new C29906DGu(userSession2, 36);
                    InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C29906DGu(new C29906DGu(abstractC59962oe, 37), 38));
                    C60842q8 c60842q8 = new C60842q8(new C29906DGu(A00, 39), c29906DGu, new D8L(27, null, A00), new C0YZ(C143266dR.class));
                    if (((C143266dR) c60842q8.getValue()).A02()) {
                        Object value = c60842q8.getValue();
                        ME7 me7 = new ME7(26, interfaceC166407c9, userSession2, this.A0A, abstractC59962oe);
                        C14360o3.A0B(value, 0);
                        C14360o3.A0B(abstractC59962oe, 1);
                        C14360o3.A0B(userSession2, 2);
                        C07S c07s = C07S.STARTED;
                        C07X viewLifecycleOwner = abstractC59962oe.getViewLifecycleOwner();
                        C57312k6 A002 = C07Y.A00(viewLifecycleOwner);
                        AbstractC23641Du.A05(AnonymousClass191.A00, new MCR(viewLifecycleOwner, c07s, value, abstractC59962oe, userSession2, me7, (InterfaceC23621Ds) null, 13), A002);
                        ((C143266dR) c60842q8.getValue()).A00();
                    }
                } else {
                    UserSession userSession3 = this.A08;
                    C166617cX.A07(this.A03, userSession3, c7e6.A00, this.A0A, c7e6.A01);
                }
            } else if (z && ((C206399Bw) interfaceC166407c9).A00 == 0) {
                AbstractC13880nE.A0O(this.A02);
                activity = this.A03.getActivity();
                if (activity != null) {
                    C206399Bw c206399Bw = (C206399Bw) interfaceC166407c9;
                    final C169287h2 c169287h2 = (C169287h2) c206399Bw.A01;
                    final String str2 = c206399Bw.A02;
                    userSession = this.A08;
                    final C25814BbV c25814BbV = this.A07;
                    C189478aR A003 = F86.A00(C3DN.A00.A00(activity));
                    C1YB A004 = C8YB.A00();
                    if (A004.A00 == null) {
                        A004.A00 = new Object();
                    }
                    boolean z2 = false;
                    if (A003 != null) {
                        z2 = true;
                    }
                    String A005 = AbstractC43591JPw.A00(72);
                    C14360o3.A0B(userSession, 0);
                    C52116N4o c52116N4o = new C52116N4o();
                    Bundle bundle = new Bundle();
                    bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
                    bundle.putString("action_source", A005);
                    bundle.putBoolean(MSV.A00(218), z2);
                    c52116N4o.setArguments(bundle);
                    c52116N4o.A00 = new C54591O9s(c25814BbV, c169287h2, str2);
                    nxq = new AbstractC86353t7() { // from class: X.9q0
                        @Override // X.AbstractC86353t7, X.InterfaceC86363t8
                        public final void DB6() {
                            C25814BbV.this.A0R(c169287h2, str2);
                        }
                    };
                    c26785Bs9 = c52116N4o;
                    AbstractC225909y9.A00(activity, c26785Bs9, userSession, nxq, null, true);
                }
            } else if (interfaceC166407c9 instanceof C167517e7) {
                AbstractC13880nE.A0O(this.A02);
                activity = this.A03.getActivity();
                if (activity != null) {
                    C25814BbV c25814BbV2 = this.A07;
                    AbstractC13100lw abstractC13100lw = this.A09;
                    userSession = this.A08;
                    C167517e7 c167517e7 = (C167517e7) interfaceC166407c9;
                    String str3 = c167517e7.A04;
                    String str4 = c167517e7.A03;
                    C169287h2 c169287h22 = c167517e7.A00;
                    C169297h3 c169297h3 = c167517e7.A01;
                    C8YH c8yh = c167517e7.A02;
                    boolean z3 = false;
                    if (F86.A00(C3DN.A00.A00(activity)) != null) {
                        z3 = true;
                    }
                    C1YB A006 = C8YB.A00();
                    if (A006.A00 == null) {
                        A006.A00 = new Object();
                    }
                    EnumC222649s5 enumC222649s5 = EnumC222649s5.A03;
                    EnumC222569rx enumC222569rx = EnumC222569rx.A02;
                    String A007 = AbstractC43591JPw.A00(72);
                    String str5 = c169287h22.A02;
                    C56811PJh c56811PJh = new C56811PJh(c25814BbV2, abstractC13100lw, c169287h22, c169297h3, c8yh, str3, str4);
                    C14360o3.A0B(userSession, 0);
                    AbstractC167027dH.A13(enumC222649s5, enumC222569rx, A007);
                    C26785Bs9 c26785Bs92 = new C26785Bs9();
                    Bundle A0b = AbstractC166987dD.A0b();
                    A0b.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
                    A0b.putSerializable("warning_type", enumC222649s5);
                    A0b.putSerializable(MSV.A00(419), enumC222569rx);
                    A0b.putString("action_source", A007);
                    A0b.putString("text_language", str5);
                    A0b.putBoolean(MSV.A00(218), z3);
                    c26785Bs92.setArguments(A0b);
                    c26785Bs92.A00 = c56811PJh;
                    nxq = new NXQ(c25814BbV2, abstractC13100lw, c169297h3, c8yh, str3, str4);
                    c26785Bs9 = c26785Bs92;
                    AbstractC225909y9.A00(activity, c26785Bs9, userSession, nxq, null, true);
                }
            } else if (interfaceC166407c9 instanceof C167527e8) {
                AbstractC59962oe abstractC59962oe2 = this.A03;
                FragmentActivity activity2 = abstractC59962oe2.getActivity();
                if (activity2 != null) {
                    AKE ake = AKE.A00;
                    UserSession userSession4 = this.A08;
                    C167527e8 c167527e8 = (C167527e8) interfaceC166407c9;
                    ake.A01(activity2, c167527e8.A00, abstractC59962oe2, c167527e8.A01, userSession4);
                }
            } else if (interfaceC166407c9 instanceof C167537e9) {
                FragmentActivity activity3 = this.A03.getActivity();
                if (activity3 != null) {
                    IgImageView igImageView = this.A06.A0A;
                    UserSession userSession5 = this.A08;
                    C33H c33h = ((C167537e9) interfaceC166407c9).A00;
                    C14360o3.A0B(userSession5, 2);
                    C14360o3.A0B(c33h, 3);
                    igImageView.postDelayed(new RunnableC24835Ayv(activity3, igImageView, userSession5, c33h), 500L);
                }
            } else {
                if (interfaceC166407c9 instanceof C167547eA) {
                    composerAutoCompleteTextView = this.A06.A0B;
                    runnableC24833Ayt = new RunnableC24585Aug(this.A04, interfaceC166407c9);
                } else if (!(interfaceC166407c9 instanceof C167557eB)) {
                    if (interfaceC166407c9 instanceof C167567eC) {
                        FragmentActivity activity4 = this.A03.getActivity();
                        if (activity4 != null) {
                            ComposerAutoCompleteTextView composerAutoCompleteTextView2 = this.A06.A0B;
                            UserSession userSession6 = this.A08;
                            C33H c33h2 = ((C167567eC) interfaceC166407c9).A00;
                            C14360o3.A0B(userSession6, 2);
                            C14360o3.A0B(c33h2, 3);
                            composerAutoCompleteTextView2.postDelayed(new RunnableC24836Ayw(activity4, composerAutoCompleteTextView2, userSession6, c33h2), 500L);
                        }
                    } else if (interfaceC166407c9 instanceof C167577eD) {
                        FragmentActivity activity5 = this.A03.getActivity();
                        if (activity5 != null) {
                            C166627cY c166627cY2 = this.A06;
                            composerAutoCompleteTextView = c166627cY2.A0B;
                            runnableC24833Ayt = new RunnableC24833Ayt(this.A01, activity5, c166627cY2, this.A08);
                        }
                    } else if (interfaceC166407c9 instanceof C167587eE) {
                        FragmentActivity activity6 = this.A03.getActivity();
                        if (activity6 != null) {
                            IgImageView igImageView2 = this.A06.A07;
                            C33H c33h3 = ((C167587eE) interfaceC166407c9).A00;
                            C14360o3.A0B(c33h3, 2);
                            igImageView2.postDelayed(new RunnableC24745AxT(activity6, igImageView2, c33h3), 1000L);
                        }
                    } else if (interfaceC166407c9 instanceof C167597eF) {
                        ComposerAutoCompleteTextView composerAutoCompleteTextView3 = this.A06.A0B;
                        C166617cX.A00(composerAutoCompleteTextView3, ((C167597eF) interfaceC166407c9).A00, composerAutoCompleteTextView3.getSelectionStart(), composerAutoCompleteTextView3.getSelectionEnd());
                    } else if (!(interfaceC166407c9 instanceof C166397c8)) {
                        if (interfaceC166407c9 instanceof C211829a9) {
                            IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig(this.A08);
                            igBloksScreenConfig.A0R = AbstractC111324zv.A00(190);
                            ACG acg = new ACG(this.A01);
                            String A008 = AbstractC43591JPw.A00(387);
                            Map map = acg.A02;
                            map.put("entrypoint", A008);
                            map.put(AbstractC111324zv.A00(2489), ((C211829a9) interfaceC166407c9).A00);
                            acg.A01(new C30712DfA(this.A07, 40));
                            acg.A00(igBloksScreenConfig);
                        } else if (interfaceC166407c9 instanceof C23584Ace) {
                            C23584Ace c23584Ace = (C23584Ace) interfaceC166407c9;
                            List list = c23584Ace.A03;
                            FragmentActivity activity7 = this.A03.getActivity();
                            if (activity7 != null) {
                                Context context = this.A01;
                                UserSession userSession7 = this.A08;
                                C25814BbV c25814BbV3 = this.A07;
                                InterfaceC60442pS interfaceC60442pS = this.A0A;
                                C14360o3.A0A(context);
                                boolean z4 = false;
                                if (c23584Ace.A00 == C05F.A00) {
                                    z4 = true;
                                }
                                C193328hC A009 = AbstractC35239FgY.A00(context, activity7, userSession7, list, z4);
                                A009.A0H(new AOU(interfaceC166407c9, c25814BbV3, userSession7, interfaceC60442pS), 2131966315);
                                A009.A07();
                                C0fJ.A00(A009.A02());
                            }
                        } else {
                            throw new RuntimeException();
                        }
                    }
                }
                composerAutoCompleteTextView.postDelayed(runnableC24833Ayt, 500L);
            }
        }
        this.A07.A0O.Egh(C166397c8.A00);
        return C0eB.A00;
    }
}
