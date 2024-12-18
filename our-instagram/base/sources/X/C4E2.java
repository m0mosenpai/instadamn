package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.instagram.api.schemas.ClipsIFUType;
import com.instagram.api.schemas.RIXUCoverSize;
import com.instagram.common.session.UserSession;
import com.instagram.model.rixu.RIXUChainingBehaviorDefinition;
import java.lang.ref.WeakReference;

/* renamed from: X.4E2, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4E2 extends C2UU implements C4E3 {
    public C125595m5 A00;
    public C60S A01;
    public C125625m8 A02;
    public RIXUChainingBehaviorDefinition A03;
    public final Fragment A04;
    public final C65722yA A05;
    public final UserSession A06;
    public final C62812tK A07;
    public final Context A08;
    public final C4E4 A09;
    public final InterfaceC11380iw A0A;
    public final InterfaceC61782rf A0B;
    public final C62662t5 A0C;
    public final boolean A0D;

    @Override // X.C4E3
    public final void D2V(C120985dq c120985dq, C101544hP c101544hP) {
        C14360o3.A0B(c101544hP, 1);
        C125595m5 c125595m5 = this.A00;
        if (c125595m5 == null) {
            C14360o3.A0F("clipsNetegoCardViewBinderDelegate");
            throw C00O.createAndThrow();
        }
        c125595m5.D2V(c120985dq, c101544hP);
    }

    @Override // X.C4E3
    public final boolean D2W(Context context, MotionEvent motionEvent, View view, C120985dq c120985dq, InterfaceC11380iw interfaceC11380iw, int i) {
        C14360o3.A0B(view, 1);
        C14360o3.A0B(motionEvent, 2);
        C125595m5 c125595m5 = this.A00;
        if (c125595m5 == null) {
            C14360o3.A0F("clipsNetegoCardViewBinderDelegate");
            throw C00O.createAndThrow();
        }
        return c125595m5.D2W(context, motionEvent, view, c120985dq, interfaceC11380iw, i);
    }

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        C38688GzT c38688GzT;
        Integer num;
        C38321qM c38321qM;
        String A2u;
        C14360o3.A0B(c3oo, 0);
        C125625m8 c125625m8 = this.A02;
        if (c125625m8 != null) {
            C76403bk c76403bk = c125625m8.A01;
            if ((c3oo instanceof C101544hP) && (!c125625m8.A00.isEmpty())) {
                C125625m8 c125625m82 = this.A02;
                if (c125625m82 != null) {
                    C120985dq c120985dq = (C120985dq) c125625m82.A00.get(i);
                    C38321qM c38321qM2 = c120985dq.A02;
                    if (c38321qM2 != null) {
                        C75113Zb BRZ = this.A0B.BRZ(c38321qM2);
                        C38688GzT c38688GzT2 = c76403bk.A01;
                        if (c38688GzT2 != null) {
                            c38688GzT = (C38688GzT) c38688GzT2.A00;
                        } else {
                            c38688GzT = null;
                        }
                        Context context = this.A08;
                        UserSession userSession = this.A06;
                        C101544hP c101544hP = (C101544hP) c3oo;
                        C62812tK c62812tK = this.A07;
                        InterfaceC11380iw interfaceC11380iw = this.A0A;
                        if (c76403bk.A0R) {
                            num = C05F.A01;
                        } else {
                            num = C05F.A00;
                        }
                        C60Q c60q = C60Q.A00;
                        boolean A00 = c60q.A00(context, userSession);
                        C60S c60s = this.A01;
                        C125625m8 c125625m83 = this.A02;
                        if (c125625m83 != null) {
                            boolean z = false;
                            if (c125625m83.A01.A03 == ClipsIFUType.A07) {
                                z = true;
                            }
                            AbstractC130345ue.A01(context, c38688GzT, c120985dq, interfaceC11380iw, userSession, BRZ, null, c101544hP, c62812tK, c60s, num, null, A00, z);
                            C62662t5 c62662t5 = this.A0C;
                            View view = c3oo.itemView;
                            C14360o3.A06(view);
                            boolean z2 = !c60q.A00(context, userSession);
                            String id = c120985dq.getId();
                            C38321qM c38321qM3 = c120985dq.A02;
                            if (c38321qM3 != null) {
                                C130405ul c130405ul = new C130405ul(c76403bk.A03, c76403bk, c38321qM3, c76403bk.A0S);
                                Integer valueOf = Integer.valueOf(i);
                                C59062n7 c59062n7 = C59062n7.A07;
                                C59072n8 c59072n8 = new C59072n8(c130405ul, valueOf, id);
                                c59072n8.A00(c62662t5.A02);
                                if (z2) {
                                    final C33P c33p = c62662t5.A00;
                                    if (c33p == null) {
                                        C14360o3.A0F("feedVideoModule");
                                        throw C00O.createAndThrow();
                                    }
                                    c59072n8.A00(new InterfaceC43071ya(c33p) { // from class: X.5um
                                        public final C33P A01;
                                        public final WeakReference A02 = new WeakReference(null);
                                        public final Rect A00 = new Rect();

                                        {
                                            this.A01 = c33p;
                                        }

                                        @Override // X.InterfaceC43071ya
                                        public final void ATP(C59062n7 c59062n72, InterfaceC57162jr interfaceC57162jr) {
                                            C14360o3.A0B(c59062n72, 0);
                                            C14360o3.A0B(interfaceC57162jr, 1);
                                            C130405ul c130405ul2 = (C130405ul) c59062n72.A03;
                                            float CGk = interfaceC57162jr.CGk(c59062n72);
                                            Rect rect = this.A00;
                                            interfaceC57162jr.BA6(rect, c59062n72);
                                            int intValue = interfaceC57162jr.CFq(c59062n72).intValue();
                                            if (intValue != 1) {
                                                if (intValue != 0) {
                                                    if (intValue == 2) {
                                                        this.A01.A06(c130405ul2.A01);
                                                        return;
                                                    }
                                                    throw new RuntimeException();
                                                }
                                                C33P c33p2 = this.A01;
                                                C38321qM c38321qM4 = c130405ul2.A01;
                                                Object obj = c130405ul2.A02;
                                                int i2 = rect.top;
                                                int i3 = rect.left;
                                                View view2 = (View) this.A02.get();
                                                int i4 = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
                                                c33p2.A04(view2, c38321qM4, obj, CGk, i2, i3, false, false, false);
                                                return;
                                            }
                                            this.A01.A03((View) this.A02.get(), c130405ul2.A01, c130405ul2.A02, CGk, rect.top, rect.left);
                                        }
                                    });
                                }
                                c62662t5.A01.A05(view, c59072n8.A01());
                                if (this.A0D && C14360o3.A0K(c76403bk.A0G, "feed_blending")) {
                                    C4E4 c4e4 = this.A09;
                                    View view2 = c3oo.itemView;
                                    C14360o3.A06(view2);
                                    C111034zF c111034zF = (C111034zF) AbstractC001800i.A0O(c76403bk.A0M, i);
                                    if (c111034zF != null && (c38321qM = c111034zF.A00) != null && (A2u = c38321qM.A2u()) != null) {
                                        c4e4.A02.A00(new ICP(C28071Xl.A00(view2.getContext(), c4e4.A00)), new C37882Glc(c4e4, c76403bk, i, true), new BFT(view2, c4e4.A03, "feed_engagement_unit_item", c4e4.A01.getModuleName(), A2u));
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            } else {
                throw new IllegalArgumentException("Either clips or attribution has to be filled");
            }
        }
        C14360o3.A0F("clipsNetegoItemsToRender");
        throw C00O.createAndThrow();
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        Context context = this.A08;
        UserSession userSession = this.A06;
        C125625m8 c125625m8 = this.A02;
        if (c125625m8 == null) {
            C14360o3.A0F("clipsNetegoItemsToRender");
            throw C00O.createAndThrow();
        }
        C76403bk c76403bk = c125625m8.A01;
        ClipsIFUType clipsIFUType = c76403bk.A03;
        boolean z = false;
        if (clipsIFUType == ClipsIFUType.A05) {
            z = true;
        }
        RIXUCoverSize rIXUCoverSize = c76403bk.A07;
        InterfaceC11380iw interfaceC11380iw = this.A0A;
        C60S c60s = this.A01;
        boolean z2 = false;
        if (clipsIFUType == ClipsIFUType.A07) {
            z2 = true;
        }
        return AbstractC130345ue.A00(context, viewGroup, rIXUCoverSize, interfaceC11380iw, userSession, this, c60s, true, z, z2);
    }

    @Override // X.C4E3
    public final void Dae(C73083Pj c73083Pj, C38321qM c38321qM) {
        if (this.A00 == null) {
            C14360o3.A0F("clipsNetegoCardViewBinderDelegate");
            throw C00O.createAndThrow();
        }
    }

    public C4E2(Context context, Fragment fragment, C65722yA c65722yA, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC61782rf interfaceC61782rf, C62812tK c62812tK, C62662t5 c62662t5) {
        this.A08 = context;
        this.A06 = userSession;
        this.A0A = interfaceC11380iw;
        this.A07 = c62812tK;
        this.A0C = c62662t5;
        this.A05 = c65722yA;
        this.A0B = interfaceC61782rf;
        this.A04 = fragment;
        this.A0D = C18U.A06(C06090Tz.A05, userSession, 36327417505135162L);
        this.A09 = new C4E4(userSession, (InterfaceC60442pS) interfaceC11380iw);
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(727923050);
        C125625m8 c125625m8 = this.A02;
        if (c125625m8 == null) {
            C14360o3.A0F("clipsNetegoItemsToRender");
            throw C00O.createAndThrow();
        }
        int size = c125625m8.A00.size();
        C0f9.A0A(226881502, A03);
        return size;
    }
}
