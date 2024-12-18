package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.NotesRepository;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4FA, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4FA extends C3OO {
    public final RecyclerView A00;
    public final UserSession A01;
    public final C31458Ds2 A02;
    public final C62882tR A03;
    public final C66362zD A04;
    public final NotesRepository A05;
    public final C4FQ A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v17, types: [X.4FQ] */
    public C4FA(LayoutInflater layoutInflater, View view, AbstractC59962oe abstractC59962oe, final InterfaceC11380iw interfaceC11380iw, final UserSession userSession, final C57112jm c57112jm, C31458Ds2 c31458Ds2, final InterfaceC92864Ec interfaceC92864Ec) {
        super(view);
        LinearLayoutManager linearLayoutManager;
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(interfaceC11380iw, 2);
        C14360o3.A0B(abstractC59962oe, 3);
        C14360o3.A0B(c57112jm, 4);
        C14360o3.A0B(interfaceC92864Ec, 5);
        this.A01 = userSession;
        this.A02 = c31458Ds2;
        NotesRepository A00 = C4A5.A00(userSession);
        this.A05 = A00;
        View requireViewById = view.requireViewById(R.id.cf_hub_recycler_view);
        C14360o3.A07(requireViewById);
        final RecyclerView recyclerView = (RecyclerView) requireViewById;
        this.A00 = recyclerView;
        int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        this.A03 = new C62882tR(abstractC59962oe.requireActivity(), new C19270xB("inbox_hub"), userSession, 23607484);
        final FragmentActivity requireActivity = abstractC59962oe.requireActivity();
        C14360o3.A0B(recyclerView, 2);
        C4FC c4fc = new C4FC() { // from class: X.4FB
            @Override // X.C4FC
            public final InterfaceC65452xh AMU(final C2UU c2uu) {
                final RecyclerView recyclerView2 = RecyclerView.this;
                return new InterfaceC65452xh() { // from class: X.4FP
                    @Override // X.InterfaceC65452xh
                    public final void D2j(int i2, int i3, Object obj) {
                        C2UU.this.notifyItemRangeChanged(i2, i3, obj);
                    }

                    @Override // X.InterfaceC65452xh
                    public final void DMJ(int i2, int i3) {
                        C2UU.this.notifyItemRangeInserted(i2, i3);
                        if (i2 <= 1) {
                            final RecyclerView recyclerView3 = recyclerView2;
                            recyclerView3.post(new Runnable() { // from class: X.9Is
                                @Override // java.lang.Runnable
                                public final void run() {
                                    RecyclerView.this.A0n(0);
                                }
                            });
                        }
                    }

                    @Override // X.InterfaceC65452xh
                    public final void DTy(int i2, int i3) {
                        C2UU.this.notifyItemMoved(i2, i3);
                    }

                    @Override // X.InterfaceC65452xh
                    public final void DfC(int i2, int i3) {
                        C2UU.this.notifyItemRangeRemoved(i2, i3);
                    }
                };
            }
        };
        C66392zG c66392zG = new C66392zG(layoutInflater);
        C4F8 Amm = interfaceC92864Ec.Amm();
        C14360o3.A0B(Amm, 2);
        c66392zG.A01(new C4FD(interfaceC11380iw, userSession, Amm, C4AC.A0G(userSession), false));
        c66392zG.A01(new C4FE(interfaceC92864Ec.getLifecycle(), interfaceC11380iw, userSession, c57112jm, Amm, new MHM(interfaceC92864Ec, 11), C4AC.A0G(userSession), false));
        C4AC.A0G(userSession);
        c66392zG.A01(new C4FH(interfaceC11380iw, userSession, c57112jm, Amm));
        C4AC.A0G(userSession);
        final C4F7 BXL = interfaceC92864Ec.BXL();
        c66392zG.A01(new AbstractC66422zJ(requireActivity, interfaceC11380iw, userSession, c57112jm, BXL) { // from class: X.4FI
            public final FragmentActivity A00;
            public final InterfaceC11380iw A01;
            public final UserSession A02;
            public final C57112jm A03;
            public final C4F7 A04;

            {
                C14360o3.A0B(BXL, 6);
                this.A02 = userSession;
                this.A01 = interfaceC11380iw;
                this.A00 = requireActivity;
                this.A03 = c57112jm;
                this.A04 = BXL;
            }

            @Override // X.AbstractC66422zJ
            public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater2) {
                C14360o3.A0B(viewGroup, 0);
                C14360o3.A0B(layoutInflater2, 1);
                View inflate = layoutInflater2.inflate(R.layout.layout_media_note_stack, viewGroup, false);
                int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                C14360o3.A0A(inflate);
                return new C44768Jrp(inflate, this.A00, this.A01, this.A02, this.A04);
            }

            @Override // X.AbstractC66422zJ
            public final /* bridge */ /* synthetic */ void unbind(C3OO c3oo) {
                C14360o3.A0B(c3oo, 0);
                this.A03.A04(c3oo.itemView);
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x0083, code lost:
            
                if (r1.length() == 0) goto L18;
             */
            /* JADX WARN: Code restructure failed: missing block: B:41:0x011f, code lost:
            
                if (r1.length() == 0) goto L41;
             */
            /* JADX WARN: Code restructure failed: missing block: B:82:0x02a6, code lost:
            
                if (r14 < r12) goto L83;
             */
            /* JADX WARN: Removed duplicated region for block: B:19:0x00a2  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x00c8  */
            /* JADX WARN: Removed duplicated region for block: B:44:0x0139  */
            /* JADX WARN: Removed duplicated region for block: B:52:0x0186  */
            /* JADX WARN: Removed duplicated region for block: B:53:0x0169  */
            @Override // X.AbstractC66422zJ
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final /* bridge */ /* synthetic */ void bind(X.InterfaceC66482zP r20, X.C3OO r21) {
                /*
                    Method dump skipped, instructions count: 844
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C4FI.bind(X.2zP, X.3OO):void");
            }

            @Override // X.AbstractC66422zJ
            public final Class modelClass() {
                return C4FM.class;
            }
        });
        c66392zG.A01(new C4FJ(userSession, C4A5.A00(userSession)));
        c66392zG.A01(new AbstractC66422zJ(requireActivity, interfaceC11380iw, userSession) { // from class: X.4FK
            public final FragmentActivity A00;
            public final InterfaceC11380iw A01;
            public final UserSession A02;

            @Override // X.AbstractC66422zJ
            public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
                C14360o3.A0B(null, 0);
                throw C00O.createAndThrow();
            }

            @Override // X.AbstractC66422zJ
            public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater2) {
                C14360o3.A0B(viewGroup, 0);
                C14360o3.A0B(layoutInflater2, 1);
                View inflate = layoutInflater2.inflate(R.layout.layout_spotlight_tray_item, viewGroup, false);
                int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                C14360o3.A0A(inflate);
                return new C51349MmA(inflate, this.A00, this.A01, this.A02);
            }

            @Override // X.AbstractC66422zJ
            public final Class modelClass() {
                return C4FO.class;
            }

            {
                this.A02 = userSession;
                this.A00 = requireActivity;
                this.A01 = interfaceC11380iw;
            }
        });
        c66392zG.A01 = c4fc;
        C66362zD A002 = c66392zG.A00();
        this.A04 = A002;
        this.A06 = new C4FR() { // from class: X.4FQ
            @Override // X.C4FR
            public final void E0Z(C4F5 c4f5) {
            }

            @Override // X.C4FR
            public final void FAD(C4F5 c4f5, boolean z) {
                java.util.Set set;
                String str;
                C14360o3.A0B(c4f5, 0);
                interfaceC92864Ec.FAD(c4f5, z);
                if (z) {
                    C4FA c4fa = this;
                    int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                    C31458Ds2 c31458Ds22 = c4fa.A02;
                    if (c31458Ds22 != null) {
                        String A0g = AnonymousClass001.A0g(c4f5.A0A.getId(), c4f5.A0G, c4f5.A0F);
                        boolean z2 = c4f5.A0P;
                        C14360o3.A0B(A0g, 0);
                        if (z2) {
                            set = c31458Ds22.A00;
                        } else {
                            set = c31458Ds22.A01;
                        }
                        int size = set.size();
                        set.add(A0g);
                        int size2 = set.size();
                        if (size2 != size) {
                            if (z2) {
                                str = "active_now_render_count";
                            } else {
                                str = "notes_render_count";
                            }
                            C2ZI.A00.A03(1060769838, str, size2);
                        }
                    }
                }
            }

            @Override // X.C4FR
            public final void CkM(C4F5 c4f5, long j) {
                if (c4f5 != null) {
                    AbstractC135966Db.A01(this.A01).A0O(c4f5, j);
                }
            }

            @Override // X.C4FR
            public final void DNI(C4F5 c4f5, long j) {
                if (c4f5 != null) {
                    AbstractC135966Db.A01(this.A01).A0P(c4f5, j);
                }
            }

            @Override // X.C4FR
            public final void F89(C4F5 c4f5, long j) {
                if (c4f5 != null) {
                    C135976Dc A01 = AbstractC135966Db.A01(this.A01);
                    if (C14360o3.A0K(c4f5.A0A.getId(), A01.A06.userId) && !c4f5.A0S && !c4f5.A0Q) {
                        return;
                    }
                    A01.A0C.add(new C09530e4(c4f5, Long.valueOf(j)));
                }
            }
        };
        Context context = view.getContext();
        C14360o3.A07(context);
        if (C4AC.A0G(userSession)) {
            linearLayoutManager = new GridLayoutManager(context, 3);
        } else {
            linearLayoutManager = new LinearLayoutManager(context);
            linearLayoutManager.A1o(0);
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(A002);
        c57112jm.A08(recyclerView, new ViewOnAttachStateChangeListenerC56972jY(view), new InterfaceC57142jp[0]);
        abstractC59962oe.mLifecycleRegistry.A09(new InterfaceC65626Tpm() { // from class: X.4FS
            @Override // X.InterfaceC65626Tpm
            public final /* synthetic */ void onCreate(C07X c07x) {
            }

            @Override // X.InterfaceC65626Tpm
            public final /* synthetic */ void onDestroy(C07X c07x) {
            }

            @Override // X.InterfaceC65626Tpm
            public final /* synthetic */ void onStart(C07X c07x) {
            }

            @Override // X.InterfaceC65626Tpm
            public final /* synthetic */ void onStop(C07X c07x) {
            }

            @Override // X.InterfaceC65626Tpm
            public final void onPause(C07X c07x) {
                C4FA c4fa = C4FA.this;
                int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                c4fa.A00.A15(c4fa.A03);
                AbstractC135966Db.A01(c4fa.A01).A07();
            }

            @Override // X.InterfaceC65626Tpm
            public final void onResume(C07X c07x) {
                C4FA c4fa = C4FA.this;
                int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                c4fa.A00.A14(c4fa.A03);
            }
        });
        if (!C18U.A06(C06090Tz.A05, userSession, 36322499767576844L)) {
            A00.A0C();
        }
        interfaceC92864Ec.EdB(new C4FT(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, X.2zP] */
    public final void A00(JWN jwn) {
        int i;
        int i2;
        Integer num;
        int intValue;
        ViewModelListUpdate viewModelListUpdate = new ViewModelListUpdate();
        C4FL c4fl = jwn.A01;
        if (c4fl != null) {
            viewModelListUpdate.A00(c4fl);
        }
        List<C4F5> list = jwn.A03;
        for (C4F5 c4f5 : list) {
            C0eB c0eB = C0eB.A00;
            String A0g = AnonymousClass001.A0g(c4f5.A0A.getId(), c4f5.A0G, c4f5.A0F);
            C59062n7 c59062n7 = C59062n7.A07;
            C59072n8 c59072n8 = new C59072n8(c4f5, c0eB, A0g);
            c59072n8.A00(new JW6(this.A01, this.A06));
            c4f5.A00 = c59072n8;
        }
        Integer num2 = jwn.A02;
        if (num2 != null && (intValue = num2.intValue()) != -1) {
            int size = list.size();
            viewModelListUpdate.A01(list.subList(0, intValue));
            viewModelListUpdate.A00(new Object());
            int i3 = size - 1;
            viewModelListUpdate.A01(list.subList(intValue, i3));
            AbstractC70663Fe abstractC70663Fe = this.A00.A0D;
            if (abstractC70663Fe != null) {
                int i4 = intValue + 3;
                if (c4fl != null) {
                    i4 = intValue + 4;
                }
                if (i4 > i3) {
                    i4 = i3;
                }
                abstractC70663Fe.A1O(i4);
            }
        } else {
            viewModelListUpdate.A01(list);
        }
        if (C4AC.A03(this.A01)) {
            List list2 = viewModelListUpdate.A00;
            List A0a = AbstractC001800i.A0a(list2);
            if ((A0a instanceof Collection) && A0a.isEmpty()) {
                i = 0;
            } else {
                Iterator it = A0a.iterator();
                i = 0;
                while (it.hasNext()) {
                    if ((!(it.next() instanceof C4F5)) && (i = i + 1) < 0) {
                        AbstractC16960so.A1T();
                        throw C00O.createAndThrow();
                    }
                }
            }
            List<C4FM> list3 = jwn.A04;
            if (list3 != null) {
                ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list3, 10));
                for (C4FM c4fm : list3) {
                    C0eB c0eB2 = C0eB.A00;
                    String A0i = AnonymousClass001.A0i("MediaNoteStack-", c4fm.A0B, c4fm.A06.getId(), '-');
                    C59062n7 c59062n72 = C59062n7.A07;
                    C59072n8 c59072n82 = new C59072n8(c4fm, c0eB2, A0i);
                    c59072n82.A00(new C37924GmL(new C206989Ed(this, 22)));
                    c4fm.A00 = c59072n82.A01();
                    int i5 = c4fm.A01 + i;
                    if (i5 > 0 && i5 < list2.size()) {
                        list2.add(i5, c4fm);
                    } else {
                        list2.add(c4fm);
                    }
                    arrayList.add(viewModelListUpdate);
                }
            }
            C4F3 c4f3 = jwn.A00;
            if (c4f3 != null && c4f3.A07) {
                C4F5 c4f52 = (C4F5) AbstractC001800i.A0J(list);
                if (c4f52 != null && (num = c4f52.A01) != null) {
                    i2 = num.intValue();
                } else {
                    i2 = 0;
                }
                c4f3.A01 = i2;
                c4f3.A00 = 0;
                C0eB c0eB3 = C0eB.A00;
                C59062n7 c59062n73 = C59062n7.A07;
                C59072n8 c59072n83 = new C59072n8(c4f3, c0eB3, "FriendMapEntryPoint");
                c59072n83.A00(new C37923GmK(new C9EL(this, 25)));
                c4f3.A02 = c59072n83.A01();
                if (1 < list2.size()) {
                    list2.add(1, c4f3);
                } else {
                    list2.add(c4f3);
                }
            }
        }
        this.A04.A05(viewModelListUpdate);
    }
}
