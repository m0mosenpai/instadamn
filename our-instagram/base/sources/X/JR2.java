package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.msys.mci.AuthData;
import com.google.android.material.tabs.TabLayout;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.direct.inbox.notes.NotesRepository;
import com.instagram.direct.model.thread.CreatorBroadcastThreadInfo;
import com.instagram.direct.model.thread.DiscoverableThreadInfo;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.camera.DirectCameraViewModel;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes8.dex */
public final class JR2 implements InterfaceC75483aF, InterfaceC72513My {
    public static boolean A31;
    public static final C43937Jbm A32 = new Object();
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public Pair A07;
    public Pair A08;
    public View A09;
    public View A0A;
    public View A0B;
    public View A0C;
    public View A0D;
    public LinearLayoutManager A0E;
    public RecyclerView A0F;
    public C6Eh A0G;
    public TabLayout A0H;
    public C47757L7d A0I;
    public C65911TwI A0J;
    public C5e4 A0K;
    public InterfaceC41501vz A0L;
    public InterfaceC41501vz A0M;
    public InterfaceC41501vz A0N;
    public InterfaceC41501vz A0O;
    public InterfaceC41501vz A0P;
    public InterfaceC41501vz A0Q;
    public InterfaceC41501vz A0R;
    public InterfaceC41501vz A0S;
    public InterfaceC41501vz A0T;
    public InterfaceC41501vz A0U;
    public InterfaceC41501vz A0V;
    public AbstractRunnableC14200nk A0W;
    public AbstractRunnableC14200nk A0X;
    public AbstractRunnableC14200nk A0Y;
    public AbstractRunnableC14200nk A0Z;
    public C31613Duf A0a;
    public L1Q A0b;
    public C44117Jeh A0c;
    public C44113Jed A0d;
    public C31665DvV A0e;
    public C47646L2f A0f;
    public EnumC44049Jda A0g;
    public EHQ A0h;
    public InterfaceC50441MOv A0i;
    public L01 A0j;
    public L02 A0k;
    public C44158JfN A0l;
    public C43777JXq A0m;
    public C31349DqE A0n;
    public C3FR A0o;
    public C1I7 A0p;
    public C31445Drp A0q;
    public C140356Wo A0r;
    public C3CY A0s;
    public InterfaceC169517hR A0t;
    public Long A0u;
    public Long A0v;
    public Long A0w;
    public String A0x;
    public List A0y;
    public List A0z;
    public InterfaceC09390do A10;
    public boolean A11;
    public boolean A12;
    public boolean A13;
    public boolean A14;
    public boolean A15;
    public boolean A16;
    public boolean A17;
    public boolean A18;
    public boolean A19;
    public boolean A1A;
    public boolean A1B;
    public boolean A1C;
    public boolean A1D;
    public boolean A1E;
    public boolean A1F;
    public boolean A1G;
    public boolean A1H;
    public NotesRepository A1I;
    public boolean A1J;
    public final Handler A1K;
    public final AbstractC59962oe A1L;
    public final C41761wQ A1M;
    public final C43942Jbr A1N;
    public final C43935Jbk A1O;
    public final JR3 A1P;
    public final C31600DuS A1Q;
    public final InterfaceC1119353f A1R;
    public final InterfaceC59832oQ A1S;
    public final C61582rL A1T;
    public final MR8 A1U;
    public final Integer A1V;
    public final HashMap A1W;
    public final HashMap A1X;
    public final HashMap A1Y;
    public final HashSet A1Z;
    public final HashSet A1a;
    public final HashSet A1b;
    public final java.util.Set A1c;
    public final java.util.Set A1d;
    public final InterfaceC09390do A1e;
    public final InterfaceC09390do A1f;
    public final InterfaceC09390do A1g;
    public final InterfaceC09390do A1h;
    public final InterfaceC09390do A1i;
    public final InterfaceC09390do A1j;
    public final InterfaceC09390do A1k;
    public final InterfaceC09390do A1l;
    public final InterfaceC09390do A1m;
    public final InterfaceC09390do A1n;
    public final InterfaceC09390do A1o;
    public final InterfaceC09390do A1p;
    public final InterfaceC09390do A1q;
    public final InterfaceC09390do A1r;
    public final InterfaceC09390do A1s;
    public final InterfaceC09390do A1t;
    public final InterfaceC09390do A1u;
    public final InterfaceC09390do A1v;
    public final InterfaceC09390do A1w;
    public final InterfaceC09390do A1x;
    public final InterfaceC09390do A1y;
    public final InterfaceC09390do A1z;
    public final InterfaceC09390do A20;
    public final InterfaceC09390do A21;
    public final InterfaceC09390do A22;
    public final InterfaceC09390do A23;
    public final InterfaceC09390do A24;
    public final InterfaceC09390do A25;
    public final InterfaceC09390do A26;
    public final InterfaceC09390do A27;
    public final InterfaceC09390do A28;
    public final InterfaceC09390do A29;
    public final InterfaceC09390do A2A;
    public final InterfaceC09390do A2B;
    public final InterfaceC09390do A2C;
    public final InterfaceC09390do A2D;
    public final InterfaceC09390do A2E;
    public final InterfaceC09390do A2F;
    public final InterfaceC09390do A2G;
    public final InterfaceC09390do A2H;
    public final InterfaceC09390do A2I;
    public final InterfaceC09390do A2J;
    public final InterfaceC09390do A2K;
    public final InterfaceC09390do A2L;
    public final InterfaceC09390do A2M;
    public final InterfaceC09390do A2N;
    public final InterfaceC09390do A2O;
    public final InterfaceC09390do A2P;
    public final InterfaceC09390do A2Q;
    public final InterfaceC09390do A2R;
    public final InterfaceC09390do A2S;
    public final InterfaceC09390do A2T;
    public final InterfaceC09390do A2U;
    public final InterfaceC09390do A2V;
    public final InterfaceC09390do A2W;
    public final InterfaceC09390do A2X;
    public final InterfaceC09390do A2Y;
    public final InterfaceC09390do A2Z;
    public final InterfaceC09390do A2a;
    public final InterfaceC09390do A2b;
    public final InterfaceC09390do A2c;
    public final InterfaceC09390do A2d;
    public final InterfaceC09390do A2e;
    public final InterfaceC09390do A2f;
    public final InterfaceC09390do A2g;
    public final InterfaceC09390do A2h;
    public final InterfaceC09390do A2i;
    public final InterfaceC09390do A2j;
    public final InterfaceC09390do A2k;
    public final InterfaceC09390do A2l;
    public final InterfaceC09390do A2m;
    public final InterfaceC09390do A2n;
    public final InterfaceC09390do A2o;
    public final InterfaceC09390do A2p;
    public final InterfaceC09390do A2q;
    public final InterfaceC09390do A2r;
    public final InterfaceC09390do A2s;
    public final InterfaceC09390do A2t;
    public final InterfaceC09390do A2u;
    public final InterfaceC09390do A2v;
    public final InterfaceC09390do A2w;
    public final InterfaceC09390do A2x;
    public final boolean A2y;
    public final boolean A2z;
    public final boolean A30;

    public static final void A0C(RectF rectF, InterfaceC50477MQf interfaceC50477MQf, JR2 jr2, C2EC c2ec) {
        if (c2ec != null) {
            String C7I = c2ec.C7I();
            Pair pair = jr2.A08;
            if (pair != null && C14360o3.A0K(pair.first, C7I)) {
                ((C55982hj) pair.second).A08(0.0d, true);
            }
            jr2.A07 = new Pair(C7I, interfaceC50477MQf);
            C83403nh BYi = c2ec.BYi();
            if (BYi == null) {
                C81663kb c81663kb = (C81663kb) c2ec;
                if (AbstractC167007dF.A1Z(c81663kb.A05)) {
                    ReentrantReadWriteLock.ReadLock readLock = c81663kb.A03.readLock();
                    readLock.lock();
                    readLock.unlock();
                }
                C0w9.A01.EmN("DirectInboxPresenter", "attempting to open visual message that is null");
                return;
            }
            C48736Lh4 c48736Lh4 = new C48736Lh4(rectF, interfaceC50477MQf, jr2, c2ec);
            L1Q l1q = new L1Q(jr2.A1K, interfaceC50477MQf);
            jr2.A0b = l1q;
            l1q.A00.postDelayed(l1q.A02, 200L);
            C43945Jbu A0W = AbstractC43593JPy.A0W(jr2);
            DirectThreadKey BKb = c2ec.BKb();
            if (!BKb.equals(A0W.A00)) {
                A0W.A01 = AbstractC166997dE.A0n();
                A0W.A00 = BKb;
            }
            String C7I2 = c2ec.C7I();
            if (C7I2 != null) {
                int C7g = c2ec.C7g();
                UserSession userSession = A0W.A04;
                C14360o3.A0B(userSession, 0);
                new C7M5(userSession).A02(BYi, new C83693oE(C7I2), C7g);
            }
            UserSession userSession2 = A0W.A04;
            Activity activity = A0W.A02;
            User A04 = C4GQ.A04(userSession2, BYi, c2ec);
            A04.getClass();
            C45093JxN A02 = AbstractC101604hV.A02(activity, userSession2, BYi, A04, C4GQ.A06(c2ec));
            C43931Jbg c43931Jbg = A0W.A06;
            String str = A02.A0K;
            str.getClass();
            c43931Jbg.A01(activity, A0W.A03, c48736Lh4, A02, c2ec, str, A02.A0G);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final void A0G(C31446Drq c31446Drq, JR2 jr2, DirectShareTarget directShareTarget, DirectThreadKey directThreadKey, String str) {
        String str2;
        String str3;
        int i;
        String A07 = directShareTarget.A07();
        String str4 = "inbox";
        if (directShareTarget.A01 == 29) {
            C35267Fh2 A00 = F3T.A00(jr2.A0p());
            if (c31446Drq != null) {
                int i2 = c31446Drq.A00;
                C5e4 c5e4 = jr2.A0K;
                if (c5e4 != null) {
                    A00.A0A(directShareTarget, c5e4.A03(AbstractC111324zv.A00(108)), str, i2);
                    CreatorBroadcastThreadInfo creatorBroadcastThreadInfo = directShareTarget.A04;
                    if (creatorBroadcastThreadInfo != null) {
                        i = creatorBroadcastThreadInfo.A00;
                    } else {
                        i = 1;
                    }
                    C28531Zo c28531Zo = C28531Zo.A04;
                    UserSession A0p = jr2.A0p();
                    AbstractC59962oe abstractC59962oe = jr2.A1L;
                    FragmentActivity requireActivity = abstractC59962oe.requireActivity();
                    String A08 = directShareTarget.A08();
                    if (C14360o3.A0K(str, AbstractC111324zv.A00(2532))) {
                        str4 = str;
                    }
                    c28531Zo.A03(requireActivity, abstractC59962oe, A0p, A08, A07, null, str4, i);
                    return;
                }
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        } else if (A07 != null) {
            C35267Fh2 A002 = F3T.A00(jr2.A0p());
            if (c31446Drq != null) {
                int i3 = c31446Drq.A00;
                C5e4 c5e42 = jr2.A0K;
                if (c5e42 != null) {
                    A002.A0A(directShareTarget, c5e42.A03(AbstractC111324zv.A00(108)), str, i3);
                    String A02 = AbstractC35186Ffe.A02(A07, AbstractC16960so.A1Q(new Pair("s", "inbox"), new Pair("st", String.valueOf(directShareTarget.A01))));
                    DiscoverableThreadInfo discoverableThreadInfo = directShareTarget.A06;
                    if (discoverableThreadInfo != null && (str3 = discoverableThreadInfo.A00) != null) {
                        A02 = AbstractC166987dD.A19(android.net.Uri.parse(A02).buildUpon().appendQueryParameter("scid", str3).build());
                    }
                    AbstractC59962oe abstractC59962oe2 = jr2.A1L;
                    AbstractC41776Ies.A0C(abstractC59962oe2.requireActivity(), jr2.A0p(), A02, abstractC59962oe2.getModuleName());
                    C5e4 c5e43 = jr2.A0K;
                    str2 = "banyanClient";
                    if (c5e43 != null) {
                        for (DirectShareTarget directShareTarget2 : c5e43.A01(AbstractC111324zv.A00(2261)).A02) {
                            if (directShareTarget.A08() != null && C14360o3.A0K(directShareTarget2.A08(), directShareTarget.A08())) {
                                C5e4 c5e44 = jr2.A0K;
                                if (c5e44 != null) {
                                    c5e44.A07(directShareTarget.A08());
                                }
                            }
                        }
                        return;
                    }
                    C14360o3.A0F(str2);
                    throw C00O.createAndThrow();
                }
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        } else {
            if (C43687JTw.A03(jr2.A1L.requireContext(), jr2.A0p())) {
                InterfaceC50519MRw.A01(jr2.A1j).EdW(directThreadKey);
            }
            InterfaceC50462MPq BWH = AbstractC43593JPy.A0V(jr2).BWH();
            List A0f = AbstractC31175DnJ.A0f(directShareTarget);
            if (c31446Drq != null) {
                BWH.Crw(c31446Drq, directThreadKey, null, null, str, A0f);
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        str2 = "banyanClient";
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }

    public static final void A0K(JR2 jr2) {
        EnumC44104JeT[] enumC44104JeTArr = {EnumC44104JeT.A06};
        ((C2056598p) jr2.A2i.getValue()).A02(new C43808JYv(jr2), C05F.A00, (EnumC44104JeT[]) Arrays.copyOf(enumC44104JeTArr, 1));
    }

    public static final void A0Z(JR2 jr2, Integer num) {
        C4FT c4ft;
        if (C4AC.A03(jr2.A0p())) {
            if (jr2.A1I == null) {
                jr2.A1I = C4A5.A00(jr2.A0p());
            }
            C43766JXf c43766JXf = (C43766JXf) jr2.A2P.getValue();
            if (c43766JXf != null && (c4ft = c43766JXf.A03) != null) {
                c4ft.A00();
            }
            NotesRepository notesRepository = jr2.A1I;
            if (notesRepository != null) {
                notesRepository.A0N(num, new RunnableC43780JXt(jr2), true, false);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0054, code lost:
    
        if (((com.instagram.user.model.User) r23.BSH().get(0)).CYY() == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A0d(android.graphics.RectF r21, X.JR2 r22, X.C2EC r23) {
        /*
            r1 = 0
            r12 = r23
            boolean r4 = r12.isPending()
            int r2 = r12.BT2()
            r3 = 1
            r6 = r21
            r0 = r22
            if (r4 != 0) goto Lab
            if (r2 != r3) goto Lab
            X.0do r2 = r0.A28
            java.lang.Object r9 = r2.getValue()
            X.DvP r9 = (X.C31659DvP) r9
            X.2Dl r11 = r0.A0u()
            X.Lh7 r10 = new X.Lh7
            r10.<init>(r6, r0, r12)
            boolean r2 = r12.isPending()
            int r0 = r12.BT2()
            if (r2 != 0) goto Lfd
            if (r0 != r3) goto Lfd
            boolean r5 = r12.CVQ()
            boolean r0 = r12.CVQ()
            if (r0 != 0) goto L56
            java.util.List r0 = r12.BSH()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L56
            java.util.List r0 = r12.BSH()
            java.lang.Object r0 = r0.get(r1)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            boolean r0 = r0.CYY()
            r4 = 1
            if (r0 != 0) goto L57
        L56:
            r4 = 0
        L57:
            com.instagram.common.session.UserSession r3 = r9.A02
            java.util.ArrayList r2 = X.AbstractC166987dD.A1E()
            r0 = 2
            if (r5 != 0) goto L69
            X.AbstractC166997dE.A1W(r2, r0)
            r0 = 18
            if (r4 == 0) goto L69
            r0 = 19
        L69:
            X.AbstractC166997dE.A1W(r2, r0)
            boolean r0 = X.C2E9.A0E(r3)
            if (r0 == 0) goto L77
            r0 = 17
            X.AbstractC166997dE.A1W(r2, r0)
        L77:
            android.content.Context r3 = r9.A00
            java.util.List r0 = r12.BSH()
            java.lang.Object r0 = r0.get(r1)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.String r1 = r0.getFullName()
            r0 = 2131960051(0x7f1320f3, float:1.955676E38)
            java.lang.String r15 = X.AbstractC31177DnL.A0b(r3, r1, r0)
            r0 = 2131960105(0x7f132129, float:1.955687E38)
            java.lang.String r16 = X.AbstractC166997dE.A0p(r3, r0)
            com.instagram.model.direct.DirectThreadKey r14 = r12.BKb()
            r7 = 0
            boolean r18 = r12.CX1()
            boolean r19 = r12.CVQ()
            r8 = r7
            r13 = r7
            r17 = r2
            X.C31659DvP.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
        La9:
            r1 = 1
        Laa:
            return r1
        Lab:
            X.0do r2 = r0.A1m
            java.lang.Object r13 = r2.getValue()
            X.Dp8 r13 = (X.C31286Dp8) r13
            X.2oe r3 = r0.A1L
            android.content.Context r14 = r3.requireContext()
            com.instagram.model.direct.DirectThreadKey r16 = r12.BKb()
            java.util.List r18 = r12.BSH()
            java.lang.String r17 = r12.Asv()
            int r19 = r12.BI1()
            int r20 = r12.C7g()
            boolean r22 = r12.CX1()
            r12.BKb()
            X.Lrt r15 = new X.Lrt
            r15.<init>(r6, r0, r12)
            r21 = r1
            r23 = r1
            boolean r2 = r13.A00(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            if (r2 != 0) goto La9
            X.0do r2 = r0.A2U
            java.lang.Object r5 = r2.getValue()
            X.DuM r5 = (X.C31594DuM) r5
            com.instagram.model.direct.DirectThreadKey r4 = r12.BKb()
            X.Lrr r2 = new X.Lrr
            r2.<init>(r1, r6, r0, r12)
            java.lang.String r0 = "inbox"
            boolean r0 = r5.A00(r3, r2, r4, r0)
            if (r0 == 0) goto Laa
            goto La9
        Lfd:
            java.lang.IllegalStateException r0 = X.AbstractC31172DnG.A0u()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JR2.A0d(android.graphics.RectF, X.JR2, X.2EC):boolean");
    }

    public final void A15(Bundle bundle, Integer num, String str, boolean z) {
        C13080lu A00 = AbstractC13090lv.A00("DirectInboxController.navigateToFragment");
        try {
            AbstractC59962oe abstractC59962oe = this.A1L;
            FragmentActivity activity = abstractC59962oe.getActivity();
            if (activity != null) {
                bundle.putString(AbstractC111324zv.A00(1573), "inbox");
                if (str.equals(AbstractC111324zv.A00(391)) && this.A1F) {
                    bundle.putBoolean("DirectInboxFragment.DIRECT_MESSAGE_REQUEST_INBOX_INITIAL_LOAD_COMPLETE_KEY", true);
                }
                C6XJ A0d = AbstractC31176DnK.A0d(activity, bundle, A0p(), ModalActivity.class, str);
                if (z) {
                    A0d.A08();
                }
                if (num != null) {
                    A0d.A0D(abstractC59962oe, num.intValue());
                } else {
                    A0d.A0C(activity);
                }
            }
            A00.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                C20I.A00(A00, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r34v0, types: [java.lang.Object, X.Jf6] */
    public static final JYD A02(JR2 jr2) {
        C09530e4 A1L;
        UserSession A0p = jr2.A0p();
        AbstractC59962oe abstractC59962oe = jr2.A1L;
        C2DS A0w = jr2.A0w();
        AbstractC46972Dl A0s = jr2.A0s();
        C4I3 A04 = A04(jr2);
        C41951wl c41951wl = (C41951wl) jr2.A25.getValue();
        boolean A05 = C2E8.A05(jr2.A0p());
        boolean z = true;
        boolean A1W = AbstractC167007dF.A1W(jr2.A0c);
        if (jr2.A0d == null) {
            z = false;
        }
        C43929Jbe c43929Jbe = (C43929Jbe) jr2.A1t.getValue();
        C18920wW A0C = AbstractC37300Gc1.A0C(jr2.A2t);
        C31594DuM c31594DuM = (C31594DuM) jr2.A2U.getValue();
        C43945Jbu A0W = AbstractC43593JPy.A0W(jr2);
        InterfaceC50423MOd interfaceC50423MOd = (InterfaceC50423MOd) jr2.A2r.getValue();
        InterfaceC59832oQ interfaceC59832oQ = jr2.A1S;
        C43939Jbo A0v = jr2.A0v();
        C31601DuT c31601DuT = new C31601DuT(jr2);
        C14360o3.A0B(A0p, 0);
        AbstractC25233BEq.A0x(2, A0w, A04, c41951wl);
        AbstractC25229BEm.A1J(c43929Jbe, 9, A0C);
        AbstractC25229BEm.A1L(c31594DuM, 11, A0W);
        AbstractC25229BEm.A1O(interfaceC50423MOd, 13, A0v);
        C44013Jd0 c44013Jd0 = (C44013Jd0) A0p.A01(C44013Jd0.class, new C37013GSs(A0p, 27));
        C48748LhG c48748LhG = null;
        if (!C18U.A06(C06090Tz.A05, c44013Jd0.A02, 36329036707807206L)) {
            A1L = AbstractC166987dD.A1L(null, EnumC44014Jd1.A04);
        } else {
            synchronized (c44013Jd0) {
                L1R l1r = c44013Jd0.A01;
                if (l1r != null) {
                    if (A0s.equals(l1r.A01) && A04 == C4I3.A03 && A05 == l1r.A02 && !A1W && !z) {
                        c44013Jd0.A01 = null;
                        A1L = AbstractC166987dD.A1L(l1r.A00, EnumC44014Jd1.A06);
                    } else {
                        c44013Jd0.A01 = null;
                    }
                }
                A1L = AbstractC166987dD.A1L(null, c44013Jd0.A00);
            }
        }
        C43787JYa c43787JYa = (C43787JYa) A1L.A00;
        String name = ((EnumC44014Jd1) A1L.A01).name();
        C14360o3.A0B(name, 1);
        A0v.A0J("inbox_state_store_preload_status", name);
        C28811aJ A00 = C28811aJ.A00(A0p);
        C14360o3.A07(A00);
        C43631JRo c43631JRo = new C43631JRo(interfaceC50423MOd, A00, A0w);
        InterfaceC50513MRq A002 = C9ME.A00(A0p);
        ?? obj = new Object();
        C31603DuV c31603DuV = new C31603DuV(abstractC59962oe.requireActivity(), abstractC59962oe.requireContext(), abstractC59962oe, A0p);
        if (c43787JYa == null) {
            c43787JYa = new C43787JYa(abstractC59962oe.requireContext(), AbstractC31180DnO.A0J(A0p, C4HC.A00), A0p, new JS8(abstractC59962oe.requireContext(), A0p, c43929Jbe, c41951wl), A0s, AbstractC28761aE.A00(A0p), A04, C41951wl.A00(A0p), A05, A1W, z);
        }
        C31606DuY c31606DuY = new C31606DuY(abstractC59962oe, A0C, A0p, c31601DuT, A0W, A0w, c31594DuM, interfaceC59832oQ);
        if (C2E9.A0E(A0p)) {
            c48748LhG = new C48748LhG(A0p, interfaceC50423MOd, A0w);
        }
        JYD jyd = new JYD(c31606DuY, c31603DuV, c43631JRo, c48748LhG, c43787JYa, obj, A002);
        JS8 js8 = jyd.A04.A07;
        MSH msh = (MSH) jr2.A26.getValue();
        C43950Jbz c43950Jbz = new C43950Jbz(jr2.A0v().A0A);
        InterfaceC50516MRt interfaceC50516MRt = (InterfaceC50516MRt) jr2.A2x.getValue();
        js8.A01 = msh;
        js8.A03 = c43950Jbz;
        js8.A00 = interfaceC50516MRt;
        return jyd;
    }

    public static final C44040JdR A03(JR2 jr2) {
        int i;
        AbstractC59962oe abstractC59962oe = jr2.A1L;
        UserSession A0p = jr2.A0p();
        AbstractC46972Dl A0s = jr2.A0s();
        C4I3 A04 = A04(jr2);
        C41951wl c41951wl = (C41951wl) jr2.A25.getValue();
        boolean A05 = C2E8.A05(jr2.A0p());
        boolean A1W = AbstractC167007dF.A1W(jr2.A0c);
        boolean A1W2 = AbstractC167007dF.A1W(jr2.A0d);
        C43929Jbe A00 = AbstractC43930Jbf.A00(jr2.A0p(), AbstractC209129Mu.A00(jr2.A0p()));
        InterfaceC50463MPr interfaceC50463MPr = (InterfaceC50463MPr) jr2.A26.getValue();
        boolean A1X = AbstractC167007dF.A1X(jr2.A1V, C05F.A0C);
        C43630JRn c43630JRn = new C43630JRn(jr2);
        C31594DuM c31594DuM = (C31594DuM) jr2.A2U.getValue();
        int A002 = AbstractC44015Jd2.A00(EnumC31648DvE.A06);
        C43950Jbz c43950Jbz = new C43950Jbz(jr2.A0v().A05);
        AbstractC25233BEq.A0w(1, A0p, A04, c41951wl);
        AbstractC25229BEm.A1L(interfaceC50463MPr, 9, c31594DuM);
        try {
            AbstractC09800fd.A01("InboxClientInfra.createMsys", -1558327602);
            if (AbstractC137186Ix.A00(A0p)) {
                i = A0s.A00;
            } else {
                i = -1;
            }
            boolean z = false;
            if (!A1X) {
                z = true;
            }
            C43632JRq c43632JRq = new C43632JRq(A0p, c43630JRn, A002, i, z);
            C42221xC c42221xC = c43632JRq.A05.A01;
            C43619JRc c43619JRc = C43619JRc.A00;
            C42221xC A0K = c42221xC.A0K(c43619JRc);
            InterfaceC50513MRq A003 = C9ME.A00(A0p);
            C43920JbV c43920JbV = new C43920JbV(A0K, A0p);
            C44040JdR c44040JdR = new C44040JdR(new C31646DvC(abstractC59962oe.requireActivity(), abstractC59962oe, A0p, c31594DuM), new C31644DvA(abstractC59962oe.requireContext(), abstractC59962oe, A0p), c43632JRq, new JRX(c42221xC.A0K(c43619JRc), C41951wl.A00(A0p).A01(), AbstractC31180DnO.A0J(A0p, C4HC.A00), AbstractC142856cl.A00, A0p, new C44043JdU(abstractC59962oe.requireContext(), A0p, interfaceC50463MPr, A00, c43950Jbz, c41951wl), A0s, A04, A05, A1W, A1W2), c43920JbV, A003);
            AbstractC09800fd.A00(-733537834);
            return c44040JdR;
        } catch (Throwable th) {
            AbstractC09800fd.A00(85243977);
            throw th;
        }
    }

    public static final C4I3 A04(JR2 jr2) {
        C4I3 c4i3;
        C44117Jeh c44117Jeh = jr2.A0c;
        if (c44117Jeh == null || (c4i3 = c44117Jeh.A00.A01) == null) {
            return C4I3.A03;
        }
        return c4i3;
    }

    public static final InterfaceC70513Em A05(JR2 jr2) {
        View view = jr2.A0C;
        if (view != null) {
            jr2.A0C = null;
            return AbstractC1571573u.A02(view, jr2.A0p(), new C43924JbZ(jr2), C05F.A01);
        }
        throw AbstractC166997dE.A0g();
    }

    public static InterfaceC09390do A07(C43937Jbm c43937Jbm, JR2 jr2, int i) {
        return c43937Jbm.A00(new C44193Jfw(jr2, i));
    }

    public static InterfaceC09390do A08(C43937Jbm c43937Jbm, Object obj, int i) {
        return c43937Jbm.A00(new C37013GSs(obj, i));
    }

    public static C17050sx A09(Object obj, int i) {
        return AbstractC09440dt.A01(new C37013GSs(obj, i));
    }

    public static final void A0A(RectF rectF, C22P c22p, JR2 jr2, DirectShareTarget directShareTarget, C3o9 c3o9) {
        if (c3o9 instanceof DirectThreadKey) {
            C81663kb B3U = jr2.A0w().B3U(JRE.A01(c3o9));
            if (B3U != null && B3U.C7I() != null && !A0d(rectF, jr2, B3U)) {
                UserSession A0p = jr2.A0p();
                Context context = jr2.A1L.getContext();
                if (context != null) {
                    A0B(rectF, c22p, jr2, LKW.A02(context, A0p, B3U, B3U.C7I()), c3o9);
                    return;
                }
                throw AbstractC166997dE.A0g();
            }
            return;
        }
        if (!(c3o9 instanceof MsysThreadId)) {
            return;
        }
        jr2.A1M.A02(AbstractC43592JPx.A0R(AbstractC43594JPz.A0e(jr2).A01((MsysThreadId) c3o9).A0K(new C36226Fyf(jr2, 0))), new C36798GJx(2, rectF, c22p, jr2, directShareTarget, c3o9));
    }

    public static final void A0B(RectF rectF, C22P c22p, JR2 jr2, DirectCameraViewModel directCameraViewModel, C3o9 c3o9) {
        C81663kb A0h;
        AbstractC59962oe abstractC59962oe;
        AbstractC208269Jl.A00(jr2.A0p()).A07(c22p, true);
        String A00 = directCameraViewModel.A00();
        C83403nh c83403nh = null;
        if (A00 == null) {
            A0h = null;
        } else {
            A0h = AbstractC31172DnG.A0h(jr2.A0w(), A00);
        }
        if (A0h != null && ((MSH) jr2.A26.getValue()).CL8(A0h)) {
            C2DS A0w = jr2.A0w();
            DirectThreadKey BKb = A0h.BKb();
            String str = AbstractC43593JPy.A0W(jr2).A01;
            if (str != null) {
                List CGt = A0w.CGt(BKb, str);
                if (CGt != null && !CGt.isEmpty()) {
                    c83403nh = (C83403nh) CGt.get(AbstractC31172DnG.A03(CGt, 1));
                }
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        }
        if (c83403nh == null) {
            Bundle A0b = AbstractC166987dD.A0b();
            A0b.putParcelable("DirectReplyCameraFragments.ARG_REPLY_VIEW_MODEL", directCameraViewModel);
            AbstractC43826JZo.A01(A0b, c3o9, "DirectStoryViewerFragment.ARGUMENTS_THREAD_KEY");
            AbstractC189688an.A00(c22p);
            A0b.putSerializable("DirectReplyCameraFragments.ARG_REPLY_ENTRY_POINT", c22p);
            if (rectF != null) {
                A0b.putParcelable("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_ENTRY_VIEW_BOUNDS", rectF);
            }
            UserSession A0p = jr2.A0p();
            abstractC59962oe = jr2.A1L;
            C6XJ A02 = C6XJ.A02(abstractC59962oe.requireActivity(), A0b, A0p, TransparentModalActivity.class, AbstractC111324zv.A00(206));
            A02.A0E(jr2.A1R);
            AbstractC31173DnH.A1I(abstractC59962oe, A02);
        } else if (A0h != null) {
            UserSession A0p2 = jr2.A0p();
            abstractC59962oe = jr2.A1L;
            C6XJ A022 = C6XJ.A02(abstractC59962oe.requireActivity(), C28531Zo.A04.A01.A00(rectF, rectF, c22p, null, null, LKW.A02(abstractC59962oe.requireContext(), A0p2, A0h, A0h.C7I()), A0h.BKb(), c83403nh.A0h(), c83403nh.A0g(), null, AbstractC43594JPz.A0f(c83403nh).CGv(), null, c83403nh.A2P, false, false), jr2.A0p(), TransparentModalActivity.class, AbstractC111324zv.A00(110));
            A022.A0E(jr2.A1R);
            A022.A0D(abstractC59962oe, 13366);
        } else {
            throw AbstractC166987dD.A14("Required value was null.");
        }
        abstractC59962oe.requireActivity().overridePendingTransition(0, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A0D(RectF rectF, JR2 jr2, C7TT c7tt, C2EC c2ec, DirectShareTarget directShareTarget, C3o9 c3o9) {
        C83403nh c83403nh;
        ImmutableList A0H;
        String str;
        android.net.Uri A03;
        String queryParameter;
        ArrayList CD3 = jr2.A0w().CD3(directShareTarget.A00());
        if (!CD3.isEmpty() && (A0H = (c83403nh = (C83403nh) CD3.get(0)).A0H()) != null && !A0H.isEmpty() && (str = ((C910143t) A0H.get(0)).A0w) != null && (A03 = AbstractC08820cl.A03(str)) != null && (queryParameter = A03.getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID)) != null) {
            new C49071Lmx(jr2.A1L, jr2.A0p(), c7tt, c2ec, directShareTarget, c3o9).Cqj(rectF, ((C910143t) A0H.get(0)).A0X, null, c83403nh.A0V(), null, false, false, queryParameter, null, null, null, null, null, false);
        }
    }

    public static final void A0E(View view, JR2 jr2) {
        C13080lu A00 = AbstractC13090lv.A00("DirectInboxController.onThreadOrSuggestedRowBind");
        try {
            C57112jm c57112jm = (C57112jm) jr2.A2w.getValue();
            if (c57112jm != null) {
                c57112jm.A04(view);
            }
            A00.close();
        } finally {
        }
    }

    public static final void A0F(EnumC46164Kc2 enumC46164Kc2, JR2 jr2, int i) {
        Integer num;
        String str;
        C3FR c3fr;
        AbstractC59962oe abstractC59962oe = jr2.A1L;
        if (abstractC59962oe.getActivity() != null) {
            C43626JRj A0q = jr2.A0q();
            C48301LZa c48301LZa = new C48301LZa(new C45785KOm(jr2), enumC46164Kc2, Integer.valueOf(i));
            KPM A00 = AbstractC46740Klx.A00(A0q.A0B);
            EnumC46164Kc2 enumC46164Kc22 = c48301LZa.A01;
            Integer num2 = c48301LZa.A02;
            A00.A03();
            int ordinal = enumC46164Kc22.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal == 4) {
                                num = C05F.A15;
                            } else {
                                throw B4Z.A00();
                            }
                        } else {
                            num = C05F.A0u;
                        }
                    } else {
                        num = C05F.A0Y;
                    }
                } else {
                    num = C05F.A0N;
                }
            } else {
                num = C05F.A01;
            }
            JQ1.A0l(A00, num2, "PERIOD", AbstractC46734Klr.A00(num));
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            str = "MEX_EB_LOW_DISK_SPACE_BANNER_IMPRESSION";
                        } else {
                            str = "MEX_EB_UPSELL_BANNER_IMPRESSION";
                        }
                    } else {
                        str = "WARN_BANNER_IMPRESSION";
                    }
                } else {
                    str = "SELL_BANNER_IMPRESSION";
                }
            } else {
                str = "INTRODUCE_BANNER_IMPRESSION";
            }
            A00.A05(str);
            C43970JcJ c43970JcJ = A0q.A0E;
            C48301LZa c48301LZa2 = c43970JcJ.A05;
            if (c48301LZa2 == null || !c48301LZa.isContentSame(c48301LZa2)) {
                c43970JcJ.A05 = c48301LZa;
                C43626JRj.A04(A0q);
            }
            C3FR c3fr2 = jr2.A0o;
            if (c3fr2 == null) {
                C14360o3.A0F("inboxViewProxy");
                throw C00O.createAndThrow();
            }
            if (c3fr2.B6q() <= 1 && (c3fr = jr2.A0o) != null) {
                c3fr.EMU(abstractC59962oe);
            }
        }
    }

    public static final void A0L(JR2 jr2) {
        if (AbstractC167007dF.A1Z(jr2.A2F) && !C6CB.A02(C6CE.A00(jr2.A0p()).A00, 36326549921740756L)) {
            AbstractC43912JbN.A00(jr2.A0p()).A00 = true;
            AbstractC43912JbN.A00(jr2.A0p()).A00(jr2.A1L, jr2.A0p(), new C48677Lg7(jr2), C05F.A01);
        }
    }

    public static final void A0M(JR2 jr2) {
        C1VN c1vn = C1VN.A00;
        UserSession A0p = jr2.A0p();
        if (c1vn != null && A0p != null) {
            c1vn.A00(jr2.A1L.getActivity(), A0p, "1683363615491576", AbstractC06930Yk.A07(AbstractC25230BEn.A1b("logged_in_accounts", String.valueOf(C0BQ.A00(A0p).BOZ()))));
        }
    }

    public static final void A0O(JR2 jr2) {
        Drawable drawable;
        C193328hC A0I;
        int i;
        DialogInterface.OnClickListener A00;
        final L02 l02 = jr2.A0k;
        final View view = jr2.A0A;
        if (l02 != null && view != null) {
            C3FR c3fr = jr2.A0o;
            if (c3fr != null) {
                if (c3fr.AnZ() > 0) {
                    C3FR c3fr2 = jr2.A0o;
                    if (c3fr2 != null) {
                        if (c3fr2.AnU(0).getTop() == 0 && C2E8.A08(jr2.A0p())) {
                            final UserSession A0p = jr2.A0p();
                            AbstractC59962oe abstractC59962oe = jr2.A1L;
                            final FragmentActivity requireActivity = abstractC59962oe.requireActivity();
                            final C23031Ai A002 = AbstractC23021Ah.A00(A0p);
                            if (!AbstractC167017dG.A1b(A002, A002.A3Q, C23031Ai.A8c, 106)) {
                                l02.A00 = view;
                                Runnable runnable = new Runnable() { // from class: X.M6o
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        L02 l022 = l02;
                                        Activity activity = requireActivity;
                                        View view2 = view;
                                        C23031Ai c23031Ai = A002;
                                        UserSession userSession = A0p;
                                        C5SU A0U = AbstractC167007dF.A0U(activity, 2131962561);
                                        A0U.A03(view2);
                                        AbstractC43594JPz.A1L(A0U);
                                        A0U.A04 = new NMB(3, l022, c23031Ai);
                                        A0U.A00().A07(userSession);
                                        l022.A00 = null;
                                        l022.A01 = null;
                                    }
                                };
                                l02.A01 = runnable;
                                view.postDelayed(runnable, 500L);
                                C7P0 c7p0 = new C7P0(abstractC59962oe, A0p);
                                String str = A0p.userId;
                                C14360o3.A0B(str, 0);
                                C7P0.A01(null, C7P1.IMPRESSION, C7P2.FILTER_TOOLTIP, c7p0, null, str);
                                return;
                            }
                        }
                    }
                }
            }
            C14360o3.A0F("inboxViewProxy");
            throw C00O.createAndThrow();
        }
        final View view2 = jr2.A0A;
        final L01 l01 = jr2.A0j;
        if (l01 != null && view2 != null) {
            C3FR c3fr3 = jr2.A0o;
            if (c3fr3 != null) {
                if (c3fr3.AnZ() > 0) {
                    C3FR c3fr4 = jr2.A0o;
                    if (c3fr4 != null) {
                        if (c3fr4.AnU(0).getTop() == 0) {
                            final UserSession A0p2 = jr2.A0p();
                            final FragmentActivity requireActivity2 = jr2.A1L.requireActivity();
                            final C23031Ai A003 = AbstractC23021Ah.A00(A0p2);
                            if (!AbstractC167017dG.A1b(A003, A003.A3P, C23031Ai.A8c, 105)) {
                                l01.A00 = view2;
                                Runnable runnable2 = new Runnable() { // from class: X.M6n
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        L01 l012 = l01;
                                        Activity activity = requireActivity2;
                                        View view3 = view2;
                                        C23031Ai c23031Ai = A003;
                                        UserSession userSession = A0p2;
                                        C5SU A0U = AbstractC167007dF.A0U(activity, 2131962560);
                                        A0U.A03(view3);
                                        AbstractC43594JPz.A1L(A0U);
                                        A0U.A04 = new NMB(2, l012, c23031Ai);
                                        A0U.A00().A07(userSession);
                                        l012.A00 = null;
                                        l012.A01 = null;
                                    }
                                };
                                l01.A01 = runnable2;
                                view2.postDelayed(runnable2, 500L);
                            }
                        }
                    }
                }
            }
            C14360o3.A0F("inboxViewProxy");
            throw C00O.createAndThrow();
        }
        AbstractC59962oe abstractC59962oe2 = jr2.A1L;
        FragmentActivity activity = abstractC59962oe2.getActivity();
        if (activity != null) {
            C43803JYq c43803JYq = new C43803JYq(jr2.A0p());
            UserSession userSession = c43803JYq.A00;
            if (AbstractC41841wY.A00(userSession).A00()) {
                C23031Ai A004 = AbstractC23021Ah.A00(userSession);
                if (JUW.A02(userSession, false) && new C5zZ(userSession).A02.A01(115)) {
                    boolean z = !AbstractC167017dG.A1b(A004, A004.A4K, C23031Ai.A8c, 439);
                    if (z) {
                        boolean A01 = new C5zZ(userSession).A02.A01(1);
                        String A0p3 = AbstractC166997dE.A0p(activity, 2131965052);
                        String A0b = AbstractC31177DnL.A0b(activity, A0p3, 2131968922);
                        C193328hC A0I2 = AbstractC31171DnF.A0I(activity);
                        if (A01) {
                            A0I2.A0A(2131968925);
                            A0I2.A0a(new DialogInterfaceOnClickListenerC48021LMq(18, activity, c43803JYq), A0b, A0p3);
                            A0I2.A0S(DialogInterfaceOnClickListenerC48023LMs.A00(c43803JYq, 49), EnumC193348hE.A03, 2131968923);
                            i = 2131968924;
                            A00 = new DialogInterfaceOnClickListenerC48021LMq(19, activity, c43803JYq);
                        } else {
                            A0I2.A0A(2131968926);
                            A0I2.A0a(new DialogInterfaceOnClickListenerC48021LMq(20, activity, c43803JYq), A0b, A0p3);
                            A0I2.A0S(new DialogInterfaceOnClickListenerC48021LMq(21, activity, c43803JYq), EnumC193348hE.A03, 2131969920);
                            i = 2131973081;
                            A00 = DialogInterfaceOnClickListenerC48023LMs.A00(c43803JYq, 50);
                        }
                        A0I2.A0H(A00, i);
                        AbstractC166987dD.A1W(A0I2);
                        AbstractC23021Ah.A00(userSession).A1X(true);
                    }
                    if (z) {
                        return;
                    }
                } else if (AbstractC167017dG.A1b(A004, A004.A4K, C23031Ai.A8c, 439)) {
                    A004.A1X(false);
                }
            }
        }
        FragmentActivity activity2 = abstractC59962oe2.getActivity();
        if (activity2 != null) {
            C43804JYr c43804JYr = new C43804JYr(AbstractC23021Ah.A00(jr2.A0p()), jr2.A0p());
            UserSession userSession2 = c43804JYr.A00;
            if (!C18U.A06(C06090Tz.A05, userSession2, 36327447569906255L) && AbstractC41841wY.A00(userSession2).A00()) {
                boolean A02 = AbstractC43807JYu.A02(userSession2);
                boolean A005 = AbstractC43807JYu.A00(userSession2);
                boolean A012 = AbstractC43807JYu.A01(userSession2);
                if (A02) {
                    C23031Ai c23031Ai = c43804JYr.A01;
                    AbstractC167007dF.A1L(c23031Ai, c23031Ai.A3e, C23031Ai.A8c, 434, true);
                }
                if (A005) {
                    C23031Ai c23031Ai2 = c43804JYr.A01;
                    AbstractC167007dF.A1L(c23031Ai2, c23031Ai2.A3c, C23031Ai.A8c, 435, true);
                }
                if (A012) {
                    c43804JYr.A01.A1U(true);
                } else if (!A005) {
                    if (A02) {
                        A0I = AbstractC31171DnF.A0I(activity2);
                        A0I.A0A(2131963509);
                        A0I.A09(2131963508);
                        A0I.A0K(new DialogInterfaceOnClickListenerC48022LMr(activity2, abstractC59962oe2, c43804JYr, 7), 2131963510);
                        A0I.A0H(new DialogInterfaceOnClickListenerC48021LMq(22, abstractC59962oe2, c43804JYr), 2131963512);
                        AbstractC166987dD.A1W(A0I);
                        return;
                    }
                }
                A0I = AbstractC31171DnF.A0I(activity2);
                A0I.A0A(2131963507);
                A0I.A09(2131963505);
                A0I.A0K(new DialogInterfaceOnClickListenerC48022LMr(activity2, abstractC59962oe2, c43804JYr, 6), 2131963506);
                AbstractC166987dD.A1W(A0I);
                return;
            }
        }
        UserSession A0p4 = jr2.A0p();
        Context requireContext = abstractC59962oe2.requireContext();
        C14360o3.A0B(A0p4, 0);
        C23031Ai A006 = AbstractC23021Ah.A00(A0p4);
        if (A006.A01.getInt("blend_direct_inbox_nux_seen_count", 0) >= 1 || !C23031Ai.A07(A006, "blend_direct_inbox_nux_last_shown_time_ms", 1L) || !C18U.A06(C06090Tz.A05, A0p4, 36324058840772466L) || !AbstractC2056998t.A00(A0p4).booleanValue() || (drawable = requireContext.getDrawable(R.drawable.instagram_icons_exceptions_illo_blend_refresh_outline_96)) == null) {
            return;
        }
        C54844OMp c54844OMp = new C54844OMp(requireContext);
        c54844OMp.A04(drawable);
        c54844OMp.A06 = C05F.A01;
        c54844OMp.A07 = AbstractC166997dE.A0p(C02G.A01(requireContext), 2131955353);
        c54844OMp.A05 = AbstractC166997dE.A0p(C02G.A01(requireContext), 2131955351);
        c54844OMp.A04 = AbstractC166997dE.A0p(C02G.A01(requireContext), 2131955352);
        c54844OMp.A02(null, AbstractC166997dE.A0p(C02G.A01(requireContext), 2131968948));
        C0fJ.A00(c54844OMp.A00());
        InterfaceC19610xo A0g = AbstractC167017dG.A0g(AbstractC166987dD.A0x(A0p4), "blend_direct_inbox_nux_seen_count");
        A0g.E7G("blend_direct_inbox_nux_last_shown_time_ms", System.currentTimeMillis());
        A0g.apply();
    }

    public static final void A0P(JR2 jr2) {
        if (!C65911TwI.A03) {
            UserSession A0p = jr2.A0p();
            if (!C18U.A06(AbstractC166997dE.A0U(A0p), A0p, 36324767511359945L)) {
                return;
            }
        }
        C14120nc.A00().ATO(new C66052Typ(jr2, A00(jr2)));
    }

    public static final void A0S(JR2 jr2) {
        InterfaceC09390do interfaceC09390do = jr2.A2g;
        JQS jqs = (JQS) interfaceC09390do.getValue();
        AbstractC59962oe abstractC59962oe = jr2.A1L;
        jqs.A0Q(abstractC59962oe.requireContext(), C55772hI.A00(jr2.A0p()), abstractC59962oe);
        ((C98O) interfaceC09390do.getValue()).A05.A04();
        ((C98O) interfaceC09390do.getValue()).A05.A05();
        ((AbstractC69603Au) interfaceC09390do.getValue()).A0K("is_inbox_ia_m2_requests_tab", true);
        ((C98O) interfaceC09390do.getValue()).A08.A00 = false;
        ((JQS) interfaceC09390do.getValue()).A0L();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0U(X.JR2 r11, int r12, boolean r13) {
        /*
            X.5e4 r0 = r11.A0K
            if (r0 == 0) goto Lcd
            if (r13 != 0) goto Lac
            boolean r0 = A0m(r11, r12)
            if (r0 == 0) goto Lcd
            com.instagram.common.session.UserSession r1 = r11.A0p()
            X.2Du r0 = X.C47062Du.A00
            boolean r0 = r11.A1B(r0)
            boolean r0 = X.C2E8.A0B(r1, r0)
            if (r0 != 0) goto Lcd
            com.instagram.common.session.UserSession r2 = r11.A0p()
            X.0Tz r4 = X.C06090Tz.A05
            r0 = 36317908449695417(0x8106f2002116b9, double:3.0309297718420756E-306)
            boolean r0 = X.C18U.A06(r4, r2, r0)
            if (r0 == 0) goto Lcd
            java.lang.String r3 = "direct_ibc_inbox_discovery_nullstate"
        L2f:
            java.util.ArrayList r5 = X.AbstractC166987dD.A1E()
            X.5e4 r0 = r11.A0K
            java.lang.String r10 = "banyanClient"
            if (r0 == 0) goto Lc5
            X.5eT r0 = r0.A01(r3)
            java.lang.Long r0 = r0.A00
            r8 = 0
            long r6 = X.AbstractC25232BEp.A0t(r0)
            long r1 = java.lang.System.currentTimeMillis()
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 >= 0) goto L50
            r5.add(r3)
        L50:
            if (r13 == 0) goto L82
            com.instagram.common.session.UserSession r2 = r11.A0p()
            r0 = 36317908448581291(0x8106f2001016ab, double:3.030929771137498E-306)
            boolean r0 = X.C18U.A06(r4, r2, r0)
            if (r0 == 0) goto L82
            X.5e4 r1 = r11.A0K
            if (r1 == 0) goto Lc5
            r0 = 2261(0x8d5, float:3.168E-42)
            java.lang.String r4 = X.AbstractC111324zv.A00(r0)
            X.5eT r0 = r1.A01(r4)
            java.lang.Long r0 = r0.A00
            if (r0 == 0) goto L77
            long r8 = r0.longValue()
        L77:
            long r1 = java.lang.System.currentTimeMillis()
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 >= 0) goto L82
            r5.add(r4)
        L82:
            boolean r0 = X.AbstractC25226BEj.A1b(r5)
            if (r0 == 0) goto L8f
            X.5e4 r0 = r11.A0K
            if (r0 == 0) goto Lc5
            r0.A08(r5)
        L8f:
            com.instagram.common.session.UserSession r0 = r11.A0p()
            X.5fu r0 = X.AbstractC122015ft.A00(r0)
            r1 = 77014026(0x497240a, float:3.5533026E-36)
            X.02i r0 = r0.A00
            r0.markerStart(r1)
            X.0nS r1 = X.C14120nc.A00()
            X.EZn r0 = new X.EZn
            r0.<init>(r11, r3, r13)
            r1.ATO(r0)
            return
        Lac:
            com.instagram.common.session.UserSession r2 = r11.A0p()
            X.0Tz r4 = X.C06090Tz.A05
            r0 = 36317908447663773(0x8106f20002169d, double:3.030929770557256E-306)
            boolean r0 = X.C18U.A06(r4, r2, r0)
            if (r0 == 0) goto Lcd
            r0 = 108(0x6c, float:1.51E-43)
            java.lang.String r3 = X.AbstractC111324zv.A00(r0)
            goto L2f
        Lc5:
            X.C14360o3.A0F(r10)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        Lcd:
            X.JRj r0 = r11.A0q()
            X.JcJ r2 = r0.A0E
            X.0sl r1 = X.C16930sl.A00
            r0 = 0
            X.C14360o3.A0B(r1, r0)
            r2.A0L = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JR2.A0U(X.JR2, int, boolean):void");
    }

    public static final void A0V(JR2 jr2, EnumC44049Jda enumC44049Jda) {
        C3FR c3fr;
        jr2.A0g = enumC44049Jda;
        C3FR c3fr2 = jr2.A0o;
        if (c3fr2 == null) {
            C14360o3.A0F("inboxViewProxy");
            throw C00O.createAndThrow();
        }
        if (c3fr2.B6q() > 1 && (c3fr = jr2.A0o) != null) {
            c3fr.EMU(jr2.A1L);
        }
        if (enumC44049Jda == EnumC44049Jda.A06) {
            C43626JRj A0q = jr2.A0q();
            A0q.A0E.A0B = null;
            C43626JRj.A03(A0q);
            C43766JXf c43766JXf = (C43766JXf) jr2.A2P.getValue();
            if (c43766JXf != null) {
                AbstractC44023JdA.A00(c43766JXf.A04, new MCO(c43766JXf, (InterfaceC23621Ds) null, 8));
            }
            AbstractC43594JPz.A1J(jr2);
            return;
        }
        EnumC44049Jda enumC44049Jda2 = EnumC44049Jda.A05;
        C43626JRj A0q2 = jr2.A0q();
        if (enumC44049Jda == enumC44049Jda2) {
            A0q2.A0E.A0B = null;
            C43626JRj.A03(A0q2);
            jr2.A0q().A06(null);
        } else {
            A0q2.A0E.A0B = AbstractC46766KmN.A00(jr2.A0p(), AbstractC44116Jeg.A00(A04(jr2)), enumC44049Jda, jr2.A0t());
            C43626JRj.A03(A0q2);
            jr2.A0q().A06(null);
            jr2.A0q().A07((C44096JeL) jr2.A2K.getValue(), false, false);
        }
    }

    public static final void A0W(JR2 jr2, DirectThreadKey directThreadKey) {
        C13080lu A00 = AbstractC13090lv.A00("DirectInboxController.updateThreadRowViewModel");
        try {
            C81663kb B3U = jr2.A0w().B3U(directThreadKey);
            if (B3U != null) {
                InterfaceC50519MRw.A01(jr2.A1j).FD1(B3U);
            }
            A00.close();
        } finally {
        }
    }

    public static final void A0X(JR2 jr2, Integer num) {
        int A00;
        if (jr2.A0J == null && !jr2.A1A) {
            jr2.A1A = true;
            jr2.A0v().A0E("init_ai_agent_start");
            C44060Jdl c44060Jdl = C65911TwI.A04;
            UserSession A0p = jr2.A0p();
            C43922JbX c43922JbX = new C43922JbX(jr2, 12);
            if (num != null) {
                A00 = num.intValue();
            } else {
                A00 = A00(jr2);
            }
            c44060Jdl.A00(A0p, c43922JbX, jr2.A01(), A00);
            UserSession A0p2 = jr2.A0p();
            if (C18U.A06(AbstractC166997dE.A0U(A0p2), A0p2, 36324767511359945L)) {
                A0P(jr2);
            }
        }
    }

    public static final void A0Y(JR2 jr2, Integer num) {
        int A00;
        if (jr2.A0K == null && !jr2.A1B) {
            jr2.A1B = true;
            jr2.A0v().A0E("init_banyan_start");
            UserSession A0p = jr2.A0p();
            C43922JbX c43922JbX = new C43922JbX(jr2, 13);
            if (num != null) {
                A00 = num.intValue();
            } else {
                A00 = A00(jr2);
            }
            C61972ry A01 = jr2.A01();
            C14360o3.A0B(A0p, 0);
            C121275eQ A012 = AbstractC121115e3.A01(A0p, c43922JbX);
            if (A01 != null) {
                A01.schedule(A012, 1967622104, A00, false, false);
            } else {
                C1GJ.A06(A012, 1967622104, A00, false, false);
            }
        }
    }

    public static final void A0b(JR2 jr2, boolean z) {
        EnumC43799JYm enumC43799JYm;
        C44117Jeh c44117Jeh = jr2.A0c;
        if (c44117Jeh != null) {
            enumC43799JYm = c44117Jeh.A00;
        } else {
            enumC43799JYm = null;
        }
        if (enumC43799JYm == EnumC43799JYm.A08 && z) {
            InterfaceC19630xq A0x = AbstractC166987dD.A0x(jr2.A0p());
            if (A0x.getBoolean("should_show_refresh_close_friends_filter_toast", false)) {
                AbstractC59962oe abstractC59962oe = jr2.A1L;
                if (abstractC59962oe.getContext() != null) {
                    C146106i8 A0j = AbstractC25229BEm.A0j();
                    A0j.A0H = "filter_close_friends_list_changed_education";
                    A0j.A06();
                    AbstractC25226BEj.A1N(abstractC59962oe.requireContext(), A0j, 2131962564);
                    AbstractC25233BEq.A1F(A0j);
                    AbstractC31177DnL.A1N(A0x, "should_show_refresh_close_friends_filter_toast", false);
                    jr2.A1E = false;
                }
            }
        }
    }

    public static final boolean A0e(AuthData authData, JR2 jr2, InterfaceC37233Gai interfaceC37233Gai, InterfaceC37121GXg interfaceC37121GXg) {
        User user;
        if (authData != null && interfaceC37233Gai != null && interfaceC37233Gai.getCount() == 2) {
            int count = interfaceC37233Gai.getCount();
            for (int i = 0; i < count; i++) {
                if (!AbstractC31171DnF.A1V(jr2.A0p(), interfaceC37233Gai.BFh(i))) {
                    user = FUZ.A00(authData, interfaceC37233Gai, AnonymousClass189.A00(jr2.A0p()), i);
                    break;
                }
            }
        }
        user = null;
        if (user == null || interfaceC37233Gai == null || interfaceC37233Gai.getCount() != 2) {
            return false;
        }
        return ((C31594DuM) jr2.A2U.getValue()).A01(jr2.A1L, interfaceC37121GXg, user, "inbox", "-1", 0, true, false, false, false, false);
    }

    public static final boolean A0i(JR2 jr2) {
        C44117Jeh c44117Jeh = jr2.A0c;
        if (c44117Jeh != null && c44117Jeh.A00 != EnumC43799JYm.A05) {
            return true;
        }
        return false;
    }

    public static final boolean A0k(JR2 jr2) {
        if (jr2.A06 != 0) {
            if (C18U.A06(C06090Tz.A05, jr2.A0p(), 36328061750885512L) && A0n(jr2, jr2.A06)) {
                return true;
            }
        }
        return false;
    }

    public final int A0o() {
        Integer num = this.A1V;
        if ((num == C05F.A0C || num == C05F.A01) && AbstractC1337462f.A09(A0p())) {
            return this.A00;
        }
        return AbstractC43592JPx.A0g(this).A0C.A07();
    }

    public final UserSession A0p() {
        return (UserSession) this.A2u.getValue();
    }

    public final C43626JRj A0q() {
        return (C43626JRj) this.A2v.getValue();
    }

    public final MRP A0r() {
        InterfaceC09390do interfaceC09390do = this.A1j;
        C48748LhG BcH = ((InterfaceC50519MRw) interfaceC09390do.getValue()).BcH();
        if (BcH != null && C14360o3.A0K(A0t(), C132705yt.A00)) {
            return BcH;
        }
        return ((InterfaceC50519MRw) interfaceC09390do.getValue()).BOD();
    }

    public final AbstractC46972Dl A0s() {
        String string = this.A1L.requireArguments().getString("DirectFragment.INITIAL_MODE");
        if (string != null) {
            AbstractC46972Dl A00 = AbstractC43928Jbd.A00(string);
            if (A00 == null) {
                throw AbstractC166997dE.A0g();
            }
            return A00;
        }
        boolean A07 = C2E8.A07(A0p());
        UserSession A0p = A0p();
        if (A07) {
            if (C2E8.A00(A0p)) {
                UserSession A0p2 = A0p();
                if (!C18U.A06(AbstractC166997dE.A0U(A0p2), A0p2, 36315365827021990L)) {
                    return C47072Dv.A00;
                }
            }
        } else if (!C2E9.A07(A0p)) {
            return C4I1.A00;
        }
        return C47032Dr.A00;
    }

    public final AbstractC46972Dl A0t() {
        C44113Jed c44113Jed = this.A0d;
        if (c44113Jed != null) {
            return c44113Jed.A00;
        }
        return null;
    }

    public final AbstractC46972Dl A0u() {
        C44113Jed c44113Jed = this.A0d;
        if (c44113Jed != null) {
            return c44113Jed.A00;
        }
        return C4I1.A00;
    }

    public final C43939Jbo A0v() {
        return (C43939Jbo) this.A2N.getValue();
    }

    public final C2DS A0w() {
        return (C2DS) this.A2s.getValue();
    }

    public final C51u A0x(int i) {
        C43777JXq c43777JXq = this.A0m;
        if (c43777JXq != null && c43777JXq.A08.get()) {
            return AbstractC43738JVx.A00(AbstractC31177DnL.A09(this.A1L), i, c43777JXq.A09.get(), c43777JXq.A0A.get());
        }
        return AbstractC43710JUv.A00(this.A1L.requireContext(), A0p(), i);
    }

    public final void A0z() {
        Pair pair = this.A07;
        if (pair != null) {
            ((InterfaceC50477MQf) pair.second).DQ6();
            HashMap hashMap = this.A1W;
            Pair pair2 = this.A07;
            C14360o3.A0A(pair2);
            hashMap.remove(pair2.first);
            HashMap hashMap2 = this.A1Y;
            Pair pair3 = this.A07;
            C14360o3.A0A(pair3);
            hashMap2.remove(pair3.first);
            this.A07 = null;
        }
        L1Q l1q = this.A0b;
        if (l1q != null) {
            l1q.A01.DQ6();
            l1q.A00.removeCallbacks(l1q.A02);
        }
        this.A0b = null;
        C43931Jbg c43931Jbg = AbstractC43593JPy.A0W(this).A06;
        c43931Jbg.A01 = null;
        c43931Jbg.A00 = null;
        c43931Jbg.A02 = null;
    }

    public final void A11() {
        if (this.A0K != null) {
            UserSession A0p = A0p();
            if (C18U.A06(AbstractC166997dE.A0U(A0p), A0p, 36317908448581291L)) {
                C14120nc.A00().ATO(new C31676Dvh(this));
            }
        }
    }

    public final void A13() {
        if (this.A1J) {
            ((C2057098u) this.A1q.getValue()).A03();
        }
        InterfaceC09390do interfaceC09390do = this.A2M;
        ((C98O) interfaceC09390do.getValue()).A00 = C17060sy.A01.A01(A0p()).A2I();
        AbstractC43592JPx.A0f(interfaceC09390do).A00 = A0t();
        JQS jqs = (JQS) interfaceC09390do.getValue();
        Context requireContext = this.A1L.requireContext();
        C55782hJ A00 = C55772hI.A00(A0p());
        if (!((AbstractC69603Au) jqs).A01) {
            jqs.A04();
            jqs.A01 = false;
            jqs.A0P(requireContext, A00, null, false);
        }
        ((C98O) interfaceC09390do.getValue()).A08.A00 = false;
        AbstractC43897Jb7.A00(A0p(), (C98O) interfaceC09390do.getValue());
    }

    public final void A16(C31665DvV c31665DvV) {
        if (this.A0e == null && c31665DvV != null) {
            C2DS A0w = A0w();
            C14360o3.A0B(A0w, 0);
            c31665DvV.A02 = A0w;
            if (C31665DvV.A08(c31665DvV)) {
                UserSession userSession = c31665DvV.A0A;
                c31665DvV.A01 = new C44137Jf2(c31665DvV.A08, c31665DvV.A09, userSession, new C44136Jf1(c31665DvV));
            }
        }
        this.A0e = c31665DvV;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        if (r2.equals(r0) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0070, code lost:
    
        if (null == r1.A07) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A17(java.lang.Integer r9) {
        /*
            r8 = this;
            X.2oe r2 = r8.A1L
            boolean r0 = r2.isAdded()
            if (r0 == 0) goto L66
            android.content.Context r0 = r2.getContext()
            if (r0 == 0) goto L66
            int r6 = r8.A0o()
            int r0 = r8.A01
            if (r0 == 0) goto Lbb
            r4 = 1
            if (r0 == r4) goto L73
            int r5 = X.AbstractC25227BEk.A06(r9, r6)
            boolean r7 = A0i(r8)
            if (r7 == 0) goto L67
            X.Jeh r0 = r8.A0c
            if (r0 == 0) goto L59
            X.JRj r6 = r8.A0q()
            android.content.Context r1 = r2.requireContext()
            X.JYm r0 = r0.A00
            int r0 = r0.A00
            java.lang.String r3 = X.AbstractC166997dE.A0p(r1, r0)
            android.content.Context r1 = r2.requireContext()
            r0 = 2131964410(0x7f1331fa, float:1.95656E38)
            java.lang.String r1 = X.AbstractC166997dE.A0p(r1, r0)
            r0 = -1
            X.JTN r2 = new X.JTN
            r2.<init>(r3, r1, r0, r7)
            X.JcJ r1 = r6.A0E
            X.JTN r0 = r1.A07
            if (r0 == 0) goto L54
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L59
        L54:
            r1.A07 = r2
            X.C43626JRj.A04(r6)
        L59:
            boolean r0 = X.AbstractC43593JPy.A1a(r8)
            if (r0 != 0) goto L66
            java.util.ArrayList r0 = A06(r8)
            A0a(r8, r0, r5, r4)
        L66:
            return
        L67:
            X.JRj r6 = r8.A0q()
            r2 = 0
            X.JcJ r1 = r6.A0E
            X.JTN r0 = r1.A07
            if (r2 != r0) goto L54
            goto L59
        L73:
            boolean r5 = A0i(r8)
            android.content.Context r1 = r2.requireContext()
            X.Jeh r0 = r8.A0c
            if (r0 == 0) goto Lb7
            X.JYm r0 = r0.A00
            if (r0 == 0) goto Lb7
            int r0 = r0.A00
        L85:
            java.lang.String r4 = X.AbstractC166997dE.A0p(r1, r0)
            X.JRj r1 = r8.A0q()
            r0 = 0
            r1.A08(r0)
            X.JRj r3 = r8.A0q()
            android.content.Context r1 = r2.requireContext()
            r0 = 2131962574(0x7f132ace, float:1.9561877E38)
            java.lang.String r0 = X.AbstractC166997dE.A0p(r1, r0)
            X.JTN r2 = new X.JTN
            r2.<init>(r4, r0, r6, r5)
            X.JcJ r1 = r3.A0E
            X.JTN r0 = r1.A07
            if (r0 == 0) goto Lb1
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L66
        Lb1:
            r1.A07 = r2
            X.C43626JRj.A04(r3)
            return
        Lb7:
            r0 = 2131959646(0x7f131f5e, float:1.9555938E38)
            goto L85
        Lbb:
            X.JRj r3 = r8.A0q()
            r2 = 0
            X.JcJ r1 = r3.A0E
            X.JTN r0 = r1.A07
            if (r2 == r0) goto Lcb
            r1.A07 = r2
            X.C43626JRj.A04(r3)
        Lcb:
            X.JRj r0 = r8.A0q()
            r0.A08(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JR2.A17(java.lang.Integer):void");
    }

    public final boolean A1A() {
        if (C2E7.A01(C17060sy.A01.A01(A0p()))) {
            if (!A1B(C47062Du.A00)) {
                UserSession A0p = A0p();
                C06090Tz A0U = AbstractC166997dE.A0U(A0p);
                if (C18U.A06(A0U, A0p, 36315833978326632L) || C18U.A06(A0U, A0p(), 36317908447663773L)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static int A00(JR2 jr2) {
        return (int) C18U.A01(C06090Tz.A05, jr2.A0p(), 36603991925593095L);
    }

    private final C61972ry A01() {
        AbstractC59962oe abstractC59962oe;
        Context context;
        if (C14360o3.A0K(Looper.myLooper(), Looper.getMainLooper())) {
            if (C18U.A06(C06090Tz.A05, A0p(), 36327486225463924L) && (context = (abstractC59962oe = this.A1L).getContext()) != null) {
                return new C61972ry(context, AbstractC018607g.A00(abstractC59962oe), null);
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList A06(X.JR2 r5) {
        /*
            java.util.ArrayList r4 = X.AbstractC166987dD.A1E()
            X.Jed r0 = r5.A0d
            if (r0 == 0) goto Lc9
            com.instagram.common.session.UserSession r0 = r5.A0p()
            boolean r0 = X.C2E9.A05(r0)
            if (r0 != 0) goto Lc9
            com.instagram.common.session.UserSession r0 = r5.A0p()
            boolean r0 = X.C2E8.A07(r0)
            com.instagram.common.session.UserSession r2 = r5.A0p()
            if (r0 == 0) goto Lfc
            boolean r0 = X.C2E8.A00(r2)
            if (r0 == 0) goto Ldd
            X.2Dv r0 = X.C47072Dv.A00
        L28:
            r4.add(r0)
        L2b:
            X.2Dr r0 = X.C47032Dr.A00
            r4.add(r0)
            X.2Dx r2 = X.C47092Dx.A00
            boolean r0 = r5.A1B(r2)
            if (r0 == 0) goto L5d
            com.instagram.common.session.UserSession r1 = r5.A0p()
            r0 = 0
            boolean r0 = X.C2E8.A0A(r1, r0)
            if (r0 == 0) goto L5d
            r4.add(r2)
            com.instagram.common.session.UserSession r0 = r5.A0p()
            X.98n r0 = X.AbstractC2056298m.A00(r0)
            r2 = 1
            X.0xq r0 = r0.A00
            X.0xo r1 = r0.ARD()
            java.lang.String r0 = "has_seen_ad_responses_threads"
            r1.E77(r0, r2)
            r1.apply()
        L5d:
            com.instagram.common.session.UserSession r1 = r5.A0p()
            r2 = 0
            X.C14360o3.A0B(r1, r2)
            boolean r0 = X.C2E8.A0A(r1, r2)
            if (r0 == 0) goto Lcd
            X.98n r0 = X.AbstractC2056298m.A00(r1)
            X.0xq r1 = r0.A00
            java.lang.String r0 = "has_seen_ad_responses_threads"
            boolean r0 = r1.getBoolean(r0, r2)
            if (r0 == 0) goto Lcd
        L79:
            boolean r0 = r5.A1A()
            if (r0 == 0) goto L84
            X.2Du r0 = X.C47062Du.A00
            r4.add(r0)
        L84:
            com.instagram.common.session.UserSession r0 = r5.A0p()
            boolean r0 = X.C2E9.A0E(r0)
            if (r0 == 0) goto Lca
            X.5yt r0 = X.C132705yt.A00
        L90:
            r4.add(r0)
            com.instagram.common.session.UserSession r1 = X.AbstractC43592JPx.A0S(r5, r2)
            boolean r0 = X.C2E8.A0A(r1, r2)
            if (r0 == 0) goto Lba
            X.98n r0 = X.AbstractC2056298m.A00(r1)
            X.0xq r1 = r0.A00
            java.lang.String r0 = "has_seen_ad_responses_threads"
            boolean r0 = r1.getBoolean(r0, r2)
            if (r0 == 0) goto Lba
            com.instagram.common.session.UserSession r0 = r5.A0p()
            boolean r0 = X.C2E9.A09(r0)
            if (r0 != 0) goto Lba
            X.2Dk r0 = X.C46962Dk.A00
            r4.add(r0)
        Lba:
            com.instagram.common.session.UserSession r0 = r5.A0p()
            boolean r0 = X.C2E9.A0B(r0)
            if (r0 == 0) goto Lc9
            X.JdM r0 = X.C44035JdM.A00
        Lc6:
            r4.add(r0)
        Lc9:
            return r4
        Lca:
            X.98z r0 = X.C2057498z.A00
            goto L90
        Lcd:
            com.instagram.common.session.UserSession r0 = r5.A0p()
            boolean r0 = X.C2E9.A09(r0)
            if (r0 != 0) goto L79
            X.2Dk r0 = X.C46962Dk.A00
            r4.add(r0)
            goto L79
        Ldd:
            com.instagram.common.session.UserSession r3 = r5.A0p()
            com.instagram.user.model.User r0 = X.AbstractC31178DnM.A0T(r3)
            boolean r0 = X.C2E7.A01(r0)
            if (r0 == 0) goto L2b
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36317908447794847(0x8106f20004169f, double:3.0309297706401475E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L2b
            X.4I1 r0 = X.C4I1.A00
            goto L28
        Lfc:
            X.2Du r1 = X.C47062Du.A00
            boolean r0 = r5.A1B(r1)
            boolean r0 = X.C2E8.A0B(r2, r0)
            if (r0 == 0) goto Lc9
            X.4I1 r0 = X.C4I1.A00
            r4.add(r0)
            r4.add(r1)
            X.98z r0 = X.C2057498z.A00
            goto Lc6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JR2.A06(X.JR2):java.util.ArrayList");
    }

    public static final void A0H(JR2 jr2) {
        boolean z;
        boolean z2;
        List A0F = AbstractC43592JPx.A0g(jr2).A0C.A0F(jr2.A0u());
        C43809JYw A0c = AbstractC43593JPy.A0c(jr2);
        A0c.A02 = A0F;
        boolean z3 = A0F instanceof Collection;
        boolean z4 = true;
        if (!z3 || !A0F.isEmpty()) {
            Iterator it = A0F.iterator();
            while (it.hasNext()) {
                if (((C2EE) it.next()).CWl()) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        A0c.A03 = z;
        if (!z3 || !A0F.isEmpty()) {
            Iterator it2 = A0F.iterator();
            while (it2.hasNext()) {
                if (((C2EE) it2.next()).CWj(((C98O) A0c).A07)) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        A0c.A04 = z2;
        if (!A0c.A03 && !z2) {
            z4 = false;
        }
        A0c.A0K("is_instamadillo", z4);
        C43939Jbo A0v = jr2.A0v();
        boolean z5 = false;
        if (!z3 || !A0F.isEmpty()) {
            Iterator it3 = A0F.iterator();
            while (true) {
                if (it3.hasNext()) {
                    if (((C2EE) it3.next()).CWk(((C98O) A0v).A07)) {
                        z5 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        A0v.A0K("is_instamadillo", z5);
        C31445Drp c31445Drp = jr2.A0q;
        if (c31445Drp != null) {
            HashSet A1H = AbstractC166987dD.A1H();
            ArrayList A1E = AbstractC166987dD.A1E();
            for (Object obj : A0F) {
                if (A1H.add(Integer.valueOf(((C2ED) obj).C7g()))) {
                    A1E.add(obj);
                }
            }
            ArrayList A0i = AbstractC167007dF.A0i(A1E);
            Iterator it4 = A1E.iterator();
            while (it4.hasNext()) {
                A0i.add(Integer.valueOf(((C2ED) it4.next()).C7g()));
            }
            ArrayList A0i2 = AbstractC167007dF.A0i(A0i);
            Iterator it5 = A0i.iterator();
            while (it5.hasNext()) {
                A0i2.add(C4GR.A00(((Number) it5.next()).intValue()));
            }
            List A0a = AbstractC001800i.A0a(A0i2);
            ArrayList A1E2 = AbstractC166987dD.A1E();
            for (Object obj2 : A0F) {
                if (((C2ED) obj2).C7g() == 29) {
                    A1E2.add(obj2);
                }
            }
            ArrayList A0i3 = AbstractC167007dF.A0i(A1E2);
            Iterator it6 = A1E2.iterator();
            while (it6.hasNext()) {
                A0i3.add(((C2ED) it6.next()).C7q());
            }
            List A0a2 = AbstractC001800i.A0a(A0i3);
            boolean z6 = false;
            if (!z3 || !A0F.isEmpty()) {
                Iterator it7 = A0F.iterator();
                while (true) {
                    if (it7.hasNext()) {
                        if (((C2EE) it7.next()).CWl()) {
                            z6 = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            C62882tR c62882tR = c31445Drp.A00;
            c62882tR.A08 = A0i;
            c62882tR.A09 = A0a;
            c62882tR.A07 = A0a2;
            c62882tR.A0A = z6;
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final void A0I(JR2 jr2) {
        UserSession A0p = jr2.A0p();
        C06090Tz c06090Tz = C06090Tz.A06;
        boolean A06 = C18U.A06(c06090Tz, A0p, 36322169055422502L);
        boolean A062 = C18U.A06(c06090Tz, jr2.A0p(), 36322169055946796L);
        jr2.A0v().A0E("recommended_users_fetch_start");
        AbstractC59962oe abstractC59962oe = jr2.A1L;
        UserSession A0p2 = jr2.A0p();
        C14360o3.A0B(A0p2, 0);
        C25621Ms A0M = AbstractC31177DnL.A0M(A0p2);
        A0M.A0B("dynamic_onboarding/get_direct_empty_state/");
        A0M.A9s(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, A0p2.userId);
        A0M.A0I("should_contain_combined_unit", A06);
        A0M.A0I("should_contain_message_unit", A062);
        C1ON A0e = AbstractC25227BEk.A0e(A0M, K84.class, C47824LAh.class);
        C44093JeI.A00(A0e, jr2, 15);
        abstractC59962oe.schedule(A0e);
    }

    public static final void A0J(JR2 jr2) {
        AbstractC59962oe abstractC59962oe;
        Context context;
        String str;
        UserSession A0p = jr2.A0p();
        if (C18U.A06(AbstractC166997dE.A0U(A0p), A0p, 36323294337117331L)) {
            C43935Jbk c43935Jbk = jr2.A1O;
            if (c43935Jbk != null) {
                C31789Dy8 c31789Dy8 = (C31789Dy8) c43935Jbk.A00.A0O.getValue();
                c31789Dy8.A00 = "";
                c31789Dy8.A01.FBt("");
                return;
            }
            throw AbstractC166997dE.A0g();
        }
        if (jr2.A0t == null && (context = (abstractC59962oe = jr2.A1L).getContext()) != null) {
            UserSession A0p2 = jr2.A0p();
            C61972ry c61972ry = new C61972ry(context, AbstractC018607g.A00(abstractC59962oe), null);
            C31641Dv7 c31641Dv7 = jr2.A1Q.A03;
            if (c31641Dv7 != null) {
                str = c31641Dv7.A02;
            } else {
                str = null;
            }
            C169127gl A00 = AbstractC31674Dvf.A00(context, A0p2, c61972ry, "raven", str, true, true, true);
            jr2.A0t = A00;
            A00.EYJ((C31643Dv9) jr2.A2j.getValue());
        }
        InterfaceC169517hR interfaceC169517hR = jr2.A0t;
        if (interfaceC169517hR != null) {
            interfaceC169517hR.Eby("");
        }
        jr2.A0v().A0E("suggested_threads_fetch_start");
    }

    public static final void A0N(JR2 jr2) {
        if (C18U.A06(C06090Tz.A05, jr2.A0p(), 36325227071812505L) && JZM.A00 == null) {
            Looper.myQueue().addIdleHandler(new JZS(jr2));
        }
    }

    public static final void A0Q(JR2 jr2) {
        Integer num;
        int i;
        UserSession A0p = jr2.A0p();
        C14360o3.A0B(A0p, 0);
        AbstractC31175DnJ.A15(AbstractC31181DnP.A07(A0p), "clicked_requests_button");
        if (C2E8.A00(jr2.A0p())) {
            i = 13368;
        } else if (C2E9.A01(jr2.A0p())) {
            i = 13378;
        } else {
            num = null;
            jr2.A18(num, AbstractC111324zv.A00(391), false);
        }
        num = Integer.valueOf(i);
        jr2.A18(num, AbstractC111324zv.A00(391), false);
    }

    public static final void A0R(JR2 jr2) {
        if (!A0k(jr2)) {
            C14120nc.A00().ATO(new C43778JXr((AnonymousClass995) jr2.A2e.getValue(), new C37013GSs(jr2, 10)));
        }
    }

    public static final void A0T(JR2 jr2) {
        if (C18U.A06(C06090Tz.A05, jr2.A0p(), 36324969374102132L)) {
            C11T.A02(new RunnableC49873M0s(jr2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d0, code lost:
    
        if (r0 != null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0040, code lost:
    
        if (X.C2E8.A0B(r2, r1) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0a(X.JR2 r13, java.util.List r14, int r15, boolean r16) {
        /*
            boolean r0 = r14.isEmpty()
            if (r0 == 0) goto Lf
            X.JRj r1 = r13.A0q()
            r0 = 0
            r1.A08(r0)
        Le:
            return
        Lf:
            X.51u r8 = r13.A0x(r15)
            com.instagram.common.session.UserSession r0 = r13.A0p()
            X.3Kr r0 = X.C2KW.A00(r0)
            java.util.Map r7 = r0.A02
            X.2oe r3 = r13.A1L
            android.content.Context r6 = r3.requireContext()
            com.instagram.common.session.UserSession r5 = r13.A0p()
            com.instagram.common.session.UserSession r2 = r13.A0p()
            X.2Du r0 = X.C47062Du.A00
            boolean r1 = r13.A1B(r0)
            r0 = 0
            X.C14360o3.A0B(r2, r0)
            boolean r0 = X.C2E8.A07(r2)
            if (r0 != 0) goto L42
            boolean r0 = X.C2E8.A0B(r2, r1)
            r12 = 0
            if (r0 == 0) goto L43
        L42:
            r12 = 1
        L43:
            int r0 = r7.size()
            java.util.ArrayList r2 = X.AbstractC25225BEi.A17(r0)
            java.util.Iterator r11 = r14.iterator()
        L4f:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto Lc0
            java.lang.Object r4 = r11.next()
            X.2Dl r4 = (X.AbstractC46972Dl) r4
            boolean r0 = r7.containsKey(r4)
            r9 = 0
            r1 = 20
            if (r0 == 0) goto Lbe
            if (r12 == 0) goto Lbe
            java.lang.Object r0 = r7.get(r4)
            X.C14360o3.A0A(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r9 = r0.intValue()
            X.2Dv r0 = X.C47072Dv.A00
            boolean r0 = X.C14360o3.A0K(r4, r0)
            if (r0 != 0) goto L83
            X.5ys r0 = X.C132695ys.A00
            boolean r0 = X.C14360o3.A0K(r4, r0)
            if (r0 == 0) goto L8c
        L83:
            java.lang.Object r0 = r8.A00
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r9 = r9 + r0
        L8c:
            if (r9 <= r1) goto Lbe
            r10 = 1
            r9 = 20
        L91:
            X.98z r0 = X.C2057498z.A00
            boolean r0 = X.C14360o3.A0K(r4, r0)
            if (r0 != 0) goto La1
            X.5yt r0 = X.C132705yt.A00
            boolean r0 = X.C14360o3.A0K(r4, r0)
            if (r0 == 0) goto Lb1
        La1:
            java.lang.Object r0 = r8.A00
            java.lang.Number r0 = (java.lang.Number) r0
            int r9 = r0.intValue()
            java.lang.Object r0 = r8.A01
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r10 = r0.booleanValue()
        Lb1:
            java.lang.String r1 = X.JUR.A00(r6, r5, r4)
            X.BIi r0 = new X.BIi
            r0.<init>(r4, r1, r9, r10)
            r2.add(r0)
            goto L4f
        Lbe:
            r10 = 0
            goto L91
        Lc0:
            com.instagram.common.session.UserSession r0 = r13.A0p()
            boolean r0 = X.C2E9.A09(r0)
            if (r0 == 0) goto Leb
            X.Jda r0 = r13.A0g
            if (r0 == 0) goto Ld2
            X.2Dl r0 = r0.A00
        Ld0:
            if (r0 != 0) goto Ld6
        Ld2:
            X.2Dl r0 = r13.A0s()
        Ld6:
            X.JUS r1 = new X.JUS
            r4 = r16
            r1.<init>(r0, r2, r4)
            boolean r0 = r3.isResumed()
            if (r0 == 0) goto Le
            X.JRj r0 = r13.A0q()
            r0.A08(r1)
            return
        Leb:
            X.Jed r0 = r13.A0d
            if (r0 == 0) goto Ld2
            X.2Dl r0 = r0.A00
            goto Ld0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JR2.A0a(X.JR2, java.util.List, int, boolean):void");
    }

    public static final void A0c(JR2 jr2, boolean z) {
        C3CY c3cy;
        if (AbstractC70443Ed.A00(jr2.A0p()) && (c3cy = jr2.A0s) != null) {
            c3cy.A04(z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.L01, java.lang.Object] */
    public static final boolean A0f(C43626JRj c43626JRj, JR2 jr2, MSJ msj) {
        L02 l02;
        boolean A06 = C2E8.A06(jr2.A0p());
        msj.EWV(A06);
        if (!A06) {
            l02 = 0;
            jr2.A0c = null;
            jr2.A0j = null;
        } else {
            if (jr2.A0c == null) {
                AbstractC59962oe abstractC59962oe = jr2.A1L;
                jr2.A0c = new C44117Jeh(abstractC59962oe.requireContext(), abstractC59962oe, jr2.A0p(), new C44118Jei(c43626JRj, jr2), jr2.A0x, AbstractC167007dF.A1W(jr2.A0d));
                ((C2DU) jr2.A0w()).A00 = jr2.A0c;
            }
            if (jr2.A0j == null) {
                jr2.A0j = new Object();
            }
            if (jr2.A0k == null) {
                l02 = new Object();
            }
            return A06;
        }
        jr2.A0k = l02;
        return A06;
    }

    public static final boolean A0g(C43626JRj c43626JRj, JR2 jr2, MSJ msj) {
        boolean A07 = C2E8.A07(jr2.A0p());
        msj.EWW(A07);
        if (!A07 && !C2E8.A0B(jr2.A0p(), jr2.A1B(C47062Du.A00)) && !C14360o3.A0K(jr2.A0s(), C44037JdO.A00) && !C2E9.A05(jr2.A0p())) {
            jr2.A0d = null;
            return false;
        }
        if (jr2.A0d == null) {
            AbstractC46972Dl A0s = jr2.A0s();
            if (AbstractC43593JPy.A1a(jr2)) {
                InterfaceC50519MRw.A00(jr2).EdV(A0s);
            }
            msj.EdV(A0s);
            C43970JcJ c43970JcJ = c43626JRj.A0E;
            if (A0s != c43970JcJ.A0E) {
                c43970JcJ.A0E = A0s;
                c43626JRj.A0C.A02(c43626JRj.A03, A0s, C4I3.A03);
                C43626JRj.A04(c43626JRj);
            }
            AbstractC43593JPy.A0V(jr2).C0B().EUg(new C51761Mtk(A0s, (Boolean) false));
            jr2.A0d = new C44113Jed(new C44112Jec(c43626JRj, jr2, msj), A0s);
            C162337Ov.A0o(jr2.A0p(), jr2.A0u().A00);
            return true;
        }
        return true;
    }

    public static final boolean A0h(JR2 jr2) {
        UserSession A0p = jr2.A0p();
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, A0p, 36322516949018916L) && !C18U.A06(c06090Tz, jr2.A0p(), 36322516948953379L)) {
            return true;
        }
        return false;
    }

    public static final boolean A0j(JR2 jr2) {
        return C18U.A06(C06090Tz.A05, jr2.A0p(), 36323968647245555L);
    }

    public static final boolean A0l(JR2 jr2) {
        return C18U.A06(C06090Tz.A05, jr2.A0p(), 36317161123484493L);
    }

    public static final boolean A0m(JR2 jr2, int i) {
        if (!jr2.A19() && ((i == 0 || (!JQ0.A1Y(jr2) && i < 10)) && !A0i(jr2) && !C14360o3.A0K(jr2.A0t(), C46962Dk.A00))) {
            return true;
        }
        return false;
    }

    public static final boolean A0n(JR2 jr2, long j) {
        long A01 = C18U.A01(C06090Tz.A05, jr2.A0p(), 36609536727062431L);
        if (A01 == 0 || AbstractC37300Gc1.A00(j) >= A01) {
            return false;
        }
        return true;
    }

    public final void A0y() {
        Long l;
        if ((A0i(this) && !C2E9.A06(A0p()) && (l = this.A0w) != null && System.currentTimeMillis() - l.longValue() > C4GQ.A00) || !A0r().AFj(A0u(), A04(this))) {
            return;
        }
        C62112sC c62112sC = (C62112sC) this.A2o.getValue();
        if (c62112sC != null) {
            c62112sC.A01();
        }
        A10();
    }

    public final void A10() {
        if (AbstractC166987dD.A1b(A0q().A0E.A0O) && !A0r().CLW()) {
            ((C43782JXv) this.A1u.getValue()).A01();
            A0r().Che(A0u(), A04(this));
            AbstractC43594JPz.A1I(this);
            A17(null);
        }
    }

    public final void A12() {
        UserSession A0p = A0p();
        AbstractC59962oe abstractC59962oe = this.A1L;
        C35022Fbv c35022Fbv = new C35022Fbv(A0p, abstractC59962oe.requireContext());
        if (c35022Fbv.A01()) {
            c35022Fbv.A00();
            return;
        }
        C31600DuS c31600DuS = this.A1Q;
        c31600DuS.A04(1);
        UserSession A0p2 = A0p();
        if (c31600DuS.A07 != null) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(abstractC59962oe, A0p2), "direct_new_message_button_tapped");
            if (A0f.isSampled()) {
                A0f.AAP(AbstractC31670Dva.A00(), c31600DuS.A07);
                A0f.Cht();
            }
        }
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putBoolean("direct_is_creating_secret_conversation", false);
        C6XJ A03 = C6XJ.A03(abstractC59962oe.requireActivity(), A0b, A0p(), ModalActivity.class, AbstractC111324zv.A00(2266));
        A03.A08();
        AbstractC31173DnH.A1I(abstractC59962oe, A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x008d, code lost:
    
        if (r3 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0091, code lost:
    
        if (r4 != null) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A14(int r13) {
        /*
            r12 = this;
            com.instagram.common.session.UserSession r0 = r12.A0p()
            boolean r0 = X.C2E9.A04(r0)
            if (r0 == 0) goto Ld3
            com.google.android.material.tabs.TabLayout r8 = r12.A0H
            if (r8 == 0) goto Ld3
            com.instagram.common.session.UserSession r0 = r12.A0p()
            X.3Kr r0 = X.C2KW.A00(r0)
            java.util.Map r7 = r0.A02
            X.L2f r1 = r12.A0f
            if (r1 == 0) goto Ld3
            r0 = 1
            java.util.HashMap r6 = X.AbstractC31174DnI.A11(r7, r0)
            java.util.List r5 = r1.A03
            java.util.Iterator r11 = r5.iterator()
        L27:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto Ld3
            java.lang.Object r2 = r11.next()
            X.Jda r2 = (X.EnumC44049Jda) r2
            X.Jda r0 = X.EnumC44049Jda.A03
            r10 = 0
            if (r2 == r0) goto L94
            X.Jda r0 = X.EnumC44049Jda.A04
            if (r2 == r0) goto L94
            X.Jda r0 = X.EnumC44049Jda.A07
            if (r2 != r0) goto Lb7
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
        L44:
            r6.put(r2, r0)
        L47:
            java.lang.Object r0 = r6.get(r2)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L53
            int r10 = r0.intValue()
        L53:
            r9 = 0
            int r0 = r5.indexOf(r2)
            X.6wf r4 = r8.A07(r0)
            r1 = 0
            if (r4 == 0) goto L90
            android.view.View r2 = r4.A03
            if (r2 == 0) goto L90
            r0 = 2131442470(0x7f0b3b26, float:1.850698E38)
            android.view.View r3 = r2.findViewById(r0)
            android.widget.TextView r3 = (android.widget.TextView) r3
        L6c:
            android.view.View r2 = r4.A03
            if (r2 == 0) goto L77
            r0 = 2131442501(0x7f0b3b45, float:1.8507044E38)
            android.view.View r1 = r2.findViewById(r0)
        L77:
            if (r10 <= 0) goto L8b
            if (r3 == 0) goto L85
            java.lang.String r0 = java.lang.String.valueOf(r10)
            r3.setText(r0)
        L82:
            r3.setVisibility(r9)
        L85:
            if (r1 == 0) goto L27
            r1.setVisibility(r9)
            goto L27
        L8b:
            r9 = 8
            if (r3 == 0) goto L85
            goto L82
        L90:
            r3 = r1
            if (r4 == 0) goto L77
            goto L6c
        L94:
            java.util.Set r0 = r7.keySet()
            java.util.Iterator r3 = r0.iterator()
            r1 = r13
        L9d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto Lcb
            java.lang.Object r0 = r3.next()
            java.lang.Object r0 = r7.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto Lb5
            int r0 = r0.intValue()
        Lb3:
            int r1 = r1 + r0
            goto L9d
        Lb5:
            r0 = 0
            goto Lb3
        Lb7:
            X.2Dl r1 = r2.A00
            boolean r0 = r7.containsKey(r1)
            if (r0 == 0) goto L47
            java.lang.Object r0 = r7.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto Ld1
            int r1 = r0.intValue()
        Lcb:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            goto L44
        Ld1:
            r1 = 0
            goto Lcb
        Ld3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JR2.A14(int):void");
    }

    public final void A18(Integer num, String str, boolean z) {
        A15(AbstractC166987dD.A0b(), num, str, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (A0r().CUG() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A19() {
        /*
            r3 = this;
            boolean r0 = X.JQ0.A1Y(r3)
            r2 = 1
            if (r0 == 0) goto L12
            X.MRP r0 = r3.A0r()
            boolean r0 = r0.CUG()
            r1 = 1
            if (r0 != 0) goto L13
        L12:
            r1 = 0
        L13:
            X.2DU r0 = X.AbstractC43592JPx.A0g(r3)
            X.1aC r0 = r0.A0H
            boolean r0 = r0.A0F
            if (r0 == 0) goto L3a
            X.MRP r0 = r3.A0r()
            boolean r0 = r0.isLoading()
            if (r0 != 0) goto L3a
            if (r1 != 0) goto L3a
            X.0do r0 = r3.A2j
            java.lang.Object r0 = r0.getValue()
            X.Dv9 r0 = (X.C31643Dv9) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L3a
            boolean r0 = r3.A18
            if (r0 == 0) goto L3a
            r2 = 0
        L3a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JR2.A19():boolean");
    }

    public final boolean A1B(AbstractC46972Dl abstractC46972Dl) {
        Boolean bool = (Boolean) AbstractC43592JPx.A0g(this).A0C.A0E.get(abstractC46972Dl);
        if (bool != null && bool.booleanValue()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC75483aF
    public final Map B3w() {
        String str;
        HashMap A1G = AbstractC166987dD.A1G();
        if (this.A1V != C05F.A00) {
            str = "ig_advanced_crypto_transport";
        } else {
            str = "ig_django";
        }
        A1G.put("transport_type_inbox", str);
        InterfaceC50519MRw A0V = AbstractC43593JPy.A0V(this);
        if (A0V != null) {
            A0V.A8d(A1G);
        }
        return A1G;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:?, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x04bd, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x04c2, code lost:
    
        if (com.facebook.systrace.Systrace.A0E(1) != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x04c4, code lost:
    
        r0 = 1572783779;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:?, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0026, code lost:
    
        if (r32 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0330, code lost:
    
        X.C0fO.A01("controller: banyan setup", -901659874);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x033c, code lost:
    
        if (A0h(r20) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x033e, code lost:
    
        A0Y(r20, null);
        A0X(r20, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x034a, code lost:
    
        if (com.facebook.systrace.Systrace.A0E(1) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x034c, code lost:
    
        X.C0fO.A00(-37384961);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0356, code lost:
    
        if (com.facebook.systrace.Systrace.A0E(1) == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0358, code lost:
    
        X.C0fO.A01("controller: account switch logging", -1111588579);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0362, code lost:
    
        if (r20.A2z == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0370, code lost:
    
        X.AbstractC43593JPy.A0d(r20).A08 = X.AbstractC25229BEm.A1a(r20.A1V, X.C05F.A00);
        r1 = X.AbstractC43593JPy.A0d(r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x037c, code lost:
    
        switch(r20.A1V.intValue()) {
            case 1: goto L31;
            case 2: goto L32;
            default: goto L29;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x037f, code lost:
    
        r4 = "DJANGO";
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0381, code lost:
    
        r1.A01.markerAnnotate(31797299, "data_source_type", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x038c, code lost:
    
        r4 = "MSYS";
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x038f, code lost:
    
        r4 = "BLENDED";
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0396, code lost:
    
        if (com.facebook.systrace.Systrace.A0E(1) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0398, code lost:
    
        X.C0fO.A00(-1158204523);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x03a2, code lost:
    
        if (com.facebook.systrace.Systrace.A0E(1) == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x03a4, code lost:
    
        X.C0fO.A01("controller: perf logger setup", -298615685);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x03ac, code lost:
    
        r4 = X.AbstractC43593JPy.A0c(r20);
        r2 = r20.A1L.getContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x03b8, code lost:
    
        if (r2 == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x03ba, code lost:
    
        r4.A0Q(r2, X.C55772hI.A00(A0p()), r20.A1L);
        r4 = A0v();
        r2 = r20.A1L.getContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x03d1, code lost:
    
        if (r2 == null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x03d3, code lost:
    
        r4.A0Q(r2, X.C55772hI.A00(A0p()), r20.A1L);
        r4 = A0v();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x03ea, code lost:
    
        if (r20.A1V == X.C05F.A0C) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x03ec, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x03ed, code lost:
    
        r4.A0K("is_e2ee_ui_enabled", r5);
        r4 = A0v();
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0023, code lost:
    
        if (r32.equals("direct_inbox_account_switch") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x03f6, code lost:
    
        if (r4.A0F == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x03fa, code lost:
    
        if (r4.A0G == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x03fc, code lost:
    
        r1 = r4.A0E;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0408, code lost:
    
        if (((com.instagram.direct.perf.navigation.ttrc.MPLTracker) r1.getValue()).isReady() == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x040a, code lost:
    
        ((com.instagram.direct.perf.navigation.ttrc.MPLTracker) r1.getValue()).trackSyncGroup(r4.A03, ((X.AbstractC69603Au) r4).A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0417, code lost:
    
        X.AbstractC43897Jb7.A00(A0p(), X.AbstractC43593JPy.A0c(r20));
        X.AbstractC43897Jb7.A00(A0p(), A0v());
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0431, code lost:
    
        if (com.facebook.systrace.Systrace.A0E(1) == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0433, code lost:
    
        X.C0fO.A00(-419977292);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0028, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x043d, code lost:
    
        if (com.facebook.systrace.Systrace.A0E(1) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x043f, code lost:
    
        X.C0fO.A01("controller: init tray controllers", 1703269046);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x044b, code lost:
    
        if (com.facebook.systrace.Systrace.A0E(1) == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x044d, code lost:
    
        X.C0fO.A00(2044660384);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0457, code lost:
    
        if (com.facebook.systrace.Systrace.A0E(1) == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0459, code lost:
    
        X.C0fO.A01("controller: config setup", 153239926);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002f, code lost:
    
        if (r32.equals("direct_push_notification") != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0461, code lost:
    
        r2 = A0p();
        r4 = X.C06090Tz.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0470, code lost:
    
        if (X.C18U.A06(r4, r2, 36320021571444646L) == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0472, code lost:
    
        r20.A11 = X.C18U.A06(r4, A0p(), 36320021571510183L);
        r20.A1J = X.C18U.A06(r4, A0p(), 36320021571575720L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0494, code lost:
    
        if (com.facebook.systrace.Systrace.A0E(1) == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0496, code lost:
    
        X.C0fO.A00(-1463981594);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x049c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0031, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x049d, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x04a2, code lost:
    
        if (com.facebook.systrace.Systrace.A0E(1) != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x04a4, code lost:
    
        r0 = 288655095;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x04d2, code lost:
    
        X.C0fO.A00(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x04d5, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:?, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:?, code lost:
    
        throw X.AbstractC166987dD.A14("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0032, code lost:
    
        r5 = true;
        r20.A2u = r4;
        r20.A1M = r22;
        r20.A1L = r21;
        r20.A1R = r26;
        r20.A01 = r33;
        r20.A0x = r31;
        r20.A1U = r29;
        r20.A1V = r30;
        r20.A1P = r24;
        r20.A1T = r28;
        r20.A1S = r27;
        r20.A1Q = r25;
        r20.A1O = r23;
        r20.A2z = r2;
        r20.A30 = r0;
        r0 = X.C43941Jbq.A00;
        r2 = X.JR2.A32;
        r20.A2k = r2.A00(r0);
        r20.A1v = A07(r2, r20, 12);
        r20.A25 = X.C44193Jfw.A00(r20, 20);
        r20.A24 = A07(r2, r20, 19);
        r20.A2y = true;
        r20.A1t = A07(r2, r20, 10);
        r20.A2w = A08(r2, r20, 25);
        r20.A1j = X.C44193Jfw.A00(r20, 1);
        r20.A1e = X.AbstractC09440dt.A01(new X.C37058GUs(r20, 45));
        r20.A04 = -1;
        r20.A02 = -1;
        r20.A1x = r2.A00(X.C43994Jch.A00);
        r20.A2E = A07(r2, r20, 29);
        r20.A1W = X.AbstractC166987dD.A1G();
        r20.A1Y = X.AbstractC166987dD.A1G();
        r20.A1a = X.AbstractC166987dD.A1H();
        r20.A1b = X.AbstractC166987dD.A1H();
        r20.A1Z = X.AbstractC166987dD.A1H();
        r20.A1X = X.AbstractC166987dD.A1G();
        r20.A0y = X.AbstractC166987dD.A1E();
        r20.A2D = A07(r2, r20, 28);
        r20.A2F = A07(r2, r20, 30);
        r20.A1d = X.AbstractC166987dD.A1H();
        r20.A1c = X.AbstractC166987dD.A1H();
        r20.A1K = X.AbstractC167007dF.A0J();
        r20.A2X = A08(r2, r20, 2);
        r20.A2W = A08(r2, r20, 1);
        r20.A2V = r2.A00(X.C44005Jcs.A00);
        r20.A0c = null;
        r20.A2I = X.C44193Jfw.A00(r20, 33);
        r20.A2v = A09(r20, 24);
        r20.A10 = A09(r20, 0);
        r20.A2s = A09(r20, 22);
        r20.A2p = A09(r20, 19);
        r20.A28 = X.C44193Jfw.A00(r20, 23);
        r20.A2T = X.C44193Jfw.A00(r20, 48);
        r20.A2f = r2.A00(X.C44007Jcu.A00);
        r20.A2d = A09(r20, 8);
        r20.A2e = A09(r20, 9);
        r20.A2M = A07(r2, r20, 40);
        r20.A2N = A07(r2, r20, 41);
        r20.A1u = A07(r2, r20, 11);
        r20.A2Z = A09(r20, 4);
        r20.A2g = A09(r20, 11);
        r20.A1n = X.AbstractC09440dt.A01(X.C44006Jct.A00);
        r20.A1f = r2.A00(new X.C37058GUs(r20, 46));
        r20.A2t = A09(r20, 23);
        r20.A2U = A07(r2, r20, 49);
        r20.A1m = A07(r2, r20, 4);
        r20.A1q = A07(r2, r20, 7);
        r20.A2P = A07(r2, r20, 43);
        r20.A2n = A08(r2, r20, 17);
        r20.A2o = A08(r2, r20, 18);
        r20.A0z = X.C16930sl.A00;
        r20.A2O = A07(r2, r20, 42);
        r20.A1k = A07(r2, r20, 2);
        r20.A2x = A08(r2, r20, 26);
        r20.A1h = r2.A00(new X.C37058GUs(r20, 49));
        r20.A1w = r2.A00(X.C44008Jcv.A00);
        r20.A2i = A08(r2, r20, 13);
        r20.A2J = X.C44193Jfw.A00(r20, 34);
        r20.A1y = A07(r2, r20, 13);
        r20.A2h = A08(r2, r20, 12);
        r20.A2Q = A07(r2, r20, 44);
        r20.A29 = A07(r2, r20, 24);
        r20.A2R = A07(r2, r20, 46);
        r20.A1N = new X.C43942Jbr(r20);
        r20.A27 = A07(r2, r20, 22);
        r20.A2q = A08(r2, r20, 20);
        r20.A1i = A07(r2, r20, 0);
        r20.A23 = A07(r2, r20, 18);
        r20.A26 = A07(r2, r20, 21);
        r20.A1p = A07(r2, r20, 6);
        r20.A2B = A07(r2, r20, 26);
        r20.A1s = A07(r2, r20, 9);
        r20.A1r = A07(r2, r20, 8);
        r20.A20 = A07(r2, r20, 15);
        r20.A21 = A07(r2, r20, 16);
        r20.A2l = A08(r2, r20, 15);
        r20.A22 = A07(r2, r20, 17);
        r20.A1o = A07(r2, r20, 5);
        r20.A1g = r2.A00(new X.C37058GUs(r20, 47));
        r20.A2G = A07(r2, r20, 31);
        r20.A2H = A07(r2, r20, 32);
        r20.A2r = A08(r2, r20, 21);
        r20.A2j = A08(r2, r20, 14);
        r20.A2A = A07(r2, r20, 25);
        r20.A2C = A07(r2, r20, 27);
        r20.A2c = A08(r2, r20, 7);
        r20.A2S = A07(r2, r20, 47);
        r20.A2K = A07(r2, r20, 35);
        r20.A2m = A08(r2, r20, 16);
        r20.A1z = A07(r2, r20, 14);
        r20.A2a = A08(r2, r20, 5);
        r20.A2b = A08(r2, r20, 6);
        r20.A1l = A07(r2, r20, 3);
        r20.A2Y = A08(r2, r20, 3);
        r20.A2L = X.C44193Jfw.A00(r20, 39);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x04b1, code lost:
    
        throw X.AbstractC166987dD.A14("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x04c8, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x04cd, code lost:
    
        if (com.facebook.systrace.Systrace.A0E(1) != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x04cf, code lost:
    
        r0 = 1488161949;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:?, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x04b2, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x04b7, code lost:
    
        if (com.facebook.systrace.Systrace.A0E(1) != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x04b9, code lost:
    
        r0 = 1161668615;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x032e, code lost:
    
        if (com.facebook.systrace.Systrace.A0E(1) == false) goto L100;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public JR2(X.AbstractC59962oe r21, X.C41761wQ r22, X.C43935Jbk r23, X.JR3 r24, X.C31600DuS r25, X.InterfaceC1119353f r26, X.InterfaceC59832oQ r27, X.C61582rL r28, X.MR8 r29, java.lang.Integer r30, java.lang.String r31, java.lang.String r32, int r33) {
        /*
            Method dump skipped, instructions count: 1246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JR2.<init>(X.2oe, X.1wQ, X.Jbk, X.JR3, X.DuS, X.53f, X.2oQ, X.2rL, X.MR8, java.lang.Integer, java.lang.String, java.lang.String, int):void");
    }
}
