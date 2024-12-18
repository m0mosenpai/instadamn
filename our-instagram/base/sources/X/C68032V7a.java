package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.mediamap.fragment.MediaMapFragment;
import com.instagram.model.hashtag.HashtagImpl;
import com.instagram.model.mapquery.MapQuery;
import java.util.Iterator;

/* renamed from: X.V7a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C68032V7a extends AbstractC67879V0k implements InterfaceC71921XAf, XLQ, XLS, XLT {
    public static final String __redex_internal_original_name = "LocationSearchHistoryFragment";
    public View A00;
    public C67921V2l A01;
    public View A02;
    public RecyclerView A03;
    public C70727Wft A04;
    public InterfaceC190488c6 A05;
    public C66152U1t A06;
    public String A07;
    public String A08;

    @Override // X.InterfaceC71921XAf
    public final float Bc9() {
        return 0.5f;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    @Override // X.XBC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DAv(X.InterfaceC11380iw r12, X.AbstractC65924TwV r13, X.Tx0 r14) {
        /*
            r11 = this;
            r3 = 0
            boolean r0 = X.AbstractC167007dF.A1R(r3, r13, r14)
            int r2 = r13.A01
            java.lang.String r1 = "hideSearchEntryController"
            if (r2 == r0) goto L6a
            r0 = 2
            if (r2 == r0) goto L78
            r10 = 6
            if (r2 != r10) goto L62
            X.U1t r4 = r11.A06
            if (r4 == 0) goto L9d
            X.NUN r13 = (X.NUN) r13
            com.instagram.model.mapquery.MapQuery r5 = r13.A00
            X.U0K r7 = X.U0K.A06
            X.C14360o3.A0B(r5, r3)
            boolean r0 = r14.A0F
            if (r0 == 0) goto L33
            com.instagram.common.session.UserSession r0 = r4.A01
            X.W61 r1 = X.VWR.A00(r0)
            monitor-enter(r1)
            X.TtE r0 = r1.A01     // Catch: java.lang.Throwable -> L2f
            r0.A05(r5)     // Catch: java.lang.Throwable -> L2f
            goto L32
        L2f:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L32:
            monitor-exit(r1)
        L33:
            java.util.Set r0 = r4.A06
            java.util.Iterator r1 = r0.iterator()
        L39:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L49
            java.lang.Object r0 = r1.next()
            X.Wft r0 = (X.C70727Wft) r0
            X.C70727Wft.A00(r0)
            goto L39
        L49:
            com.instagram.common.session.UserSession r6 = r4.A01
            java.lang.String r8 = r5.A00
            java.lang.String r9 = r14.A08
            android.content.Context r3 = r4.A00
            X.U28 r2 = r4.A02
            r1 = 1
            X.Wmi r0 = new X.Wmi
            r0.<init>(r1, r5, r14, r4)
            X.V3k r5 = new X.V3k
            r5.<init>(r3, r0, r2)
            X.AbstractC68573VWa.A00(r5, r6, r7, r8, r9, r10)
            goto L85
        L62:
            java.lang.String r0 = "Invalid entry type"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L6a:
            X.U1t r2 = r11.A06
            if (r2 == 0) goto L9d
            X.V9z r13 = (X.C68090V9z) r13
            com.instagram.model.hashtag.HashtagImpl r1 = r13.A00
            X.U0K r0 = X.U0K.A06
            r2.A01(r1, r14, r0)
            goto L85
        L78:
            X.U1t r2 = r11.A06
            if (r2 == 0) goto L9d
            X.HYX r13 = (X.HYX) r13
            X.Vvd r1 = r13.A00
            X.U0K r0 = X.U0K.A06
            r2.A03(r1, r14, r0)
        L85:
            com.instagram.common.session.UserSession r0 = r11.getSession()
            X.W61 r0 = X.VWR.A00(r0)
            java.util.List r0 = r0.A00()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Laa
            android.view.View r1 = r11.A00
            if (r1 != 0) goto La5
            java.lang.String r1 = "clearAllButton"
        L9d:
            X.C14360o3.A0F(r1)
            X.00O r1 = X.C00O.createAndThrow()
            throw r1
        La5:
            r0 = 8
            r1.setVisibility(r0)
        Laa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68032V7a.DAv(X.0iw, X.TwV, X.Tx0):void");
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        RecyclerView A0F = AbstractC31176DnK.A0F(view);
        this.A03 = A0F;
        if (A0F != null) {
            AbstractC31174DnI.A15(view.getContext(), A0F);
            RecyclerView recyclerView = this.A03;
            if (recyclerView != null) {
                C67921V2l c67921V2l = this.A01;
                String str = "locationSearchHistoryAdapter";
                if (c67921V2l != null) {
                    recyclerView.setAdapter(c67921V2l);
                    RecyclerView recyclerView2 = this.A03;
                    if (recyclerView2 != null) {
                        recyclerView2.A0S = true;
                        recyclerView2.setItemAnimator(null);
                        C67921V2l c67921V2l2 = this.A01;
                        if (c67921V2l2 != null) {
                            c67921V2l2.A00();
                            View requireViewById = view.requireViewById(R.id.back_button);
                            this.A02 = requireViewById;
                            if (requireViewById == null) {
                                str = "searchCancelButton";
                            } else {
                                WNU.A00(requireViewById, 15, this);
                                View requireViewById2 = view.requireViewById(R.id.clear_action_view);
                                this.A00 = requireViewById2;
                                if (requireViewById2 == null) {
                                    str = "clearAllButton";
                                } else {
                                    WNU.A00(requireViewById2, 16, this);
                                    view.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC66124U0h(this, 6));
                                    return;
                                }
                            }
                        }
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
        }
        C14360o3.A0F("recyclerView");
        throw C00O.createAndThrow();
    }

    @Override // X.XLQ
    public final void DK6(C68090V9z c68090V9z, Tx0 tx0) {
        HashtagImpl hashtagImpl = c68090V9z.A00;
        MediaMapFragment mediaMapFragment = (MediaMapFragment) this.mParentFragment;
        if (mediaMapFragment != null) {
            MediaMapFragment.A08(mediaMapFragment, VEZ.A03, hashtagImpl.A0C, hashtagImpl.A0D);
            WDY.A00(mediaMapFragment);
        }
        VWR.A00(getSession()).A01(c68090V9z.A00);
        AbstractC70050W0k.A00(getSession(), c68090V9z);
        A01(c68090V9z, tx0);
    }

    @Override // X.XLS
    public final void DR1(NUN nun, Tx0 tx0) {
        MapQuery mapQuery = nun.A00;
        MediaMapFragment mediaMapFragment = (MediaMapFragment) this.mParentFragment;
        if (mediaMapFragment != null) {
            MediaMapFragment.A08(mediaMapFragment, VEZ.A02, mapQuery.A00, mapQuery.A01);
            WDY.A00(mediaMapFragment);
        }
        VWR.A00(getSession()).A02(mapQuery);
        AbstractC70050W0k.A00(getSession(), nun);
        A01(nun, tx0);
    }

    @Override // X.XLT
    public final void DYm(HYX hyx, Tx0 tx0) {
        C69794Vvd c69794Vvd = hyx.A00;
        MediaMapFragment mediaMapFragment = (MediaMapFragment) this.mParentFragment;
        if (mediaMapFragment != null) {
            mediaMapFragment.A0J(c69794Vvd);
        }
        VWR.A00(getSession()).A03(hyx.A00);
        AbstractC70050W0k.A00(getSession(), hyx);
        A01(hyx, tx0);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        String str = this.A07;
        if (str != null) {
            return str;
        }
        C14360o3.A0F("moduleName");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        MediaMapFragment mediaMapFragment = (MediaMapFragment) this.mParentFragment;
        if (mediaMapFragment != null) {
            AbstractC10360h2 abstractC10360h2 = mediaMapFragment.A0B.A03;
            if (abstractC10360h2.A0L() > 1) {
                abstractC10360h2.A0b();
                return true;
            }
            return true;
        }
        return true;
    }

    public static final C65956Tx8 A00(C68032V7a c68032V7a) {
        C01L A1I = C0eM.A1I();
        A1I.addAll(VWR.A00(c68032V7a.getSession()).A00());
        C01T.A1C(A1I);
        C01L A1J = C0eM.A1J(A1I);
        C65957Tx9 c65957Tx9 = new C65957Tx9(false);
        Iterator<E> it = A1J.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            C65954Twz c65954Twz = new C65954Twz();
            c65954Twz.A09 = "null_state_recent";
            c65954Twz.A08 = "RECENT";
            c65954Twz.A0F = true;
            c65954Twz.A05 = AbstractC37303Gc4.A0X("RECENT");
            c65957Tx9.A02(c65954Twz, next);
        }
        return c65957Tx9.A00();
    }

    private final void A01(AbstractC65924TwV abstractC65924TwV, Tx0 tx0) {
        C70108W4f A00 = VWT.A00(abstractC65924TwV);
        A00.A07 = tx0.A09;
        A00.A01 = tx0.A05;
        C66166U2h A01 = A00.A01();
        InterfaceC190488c6 interfaceC190488c6 = this.A05;
        if (interfaceC190488c6 == null) {
            C14360o3.A0F("searchLogger");
            throw C00O.createAndThrow();
        }
        int i = tx0.A00;
        interfaceC190488c6.ClZ(A01, C05F.A07, C05F.A0C, "", tx0.A06, i);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1956374135);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A01 = new C67921V2l(requireContext(), this, getSession(), this);
        UserSession session = getSession();
        C14360o3.A0B(session, 1);
        this.A06 = new C66152U1t(null, session, null);
        this.A04 = new C70727Wft(this);
        this.A07 = AnonymousClass001.A0R(AbstractC153636vY.A01(requireArguments, "argument_parent_module_name"), "_edit_recent");
        String A0n = AbstractC166997dE.A0n();
        this.A08 = A0n;
        if (A0n != null) {
            UserSession session2 = getSession();
            String str = this.A08;
            if (str != null) {
                U21 u21 = new U21(this, session2, str);
                UserSession session3 = getSession();
                C14360o3.A0B(session3, 3);
                this.A05 = new U20(this, session3, u21, A0n, null, null, null);
                C0f9.A09(-51112629, A02);
                return;
            }
        }
        C14360o3.A0F("searchSessionId");
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(413654650);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_location_search_history, false);
        C0f9.A09(273302213, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-756525329);
        super.onResume();
        C67921V2l c67921V2l = this.A01;
        if (c67921V2l == null) {
            C14360o3.A0F("locationSearchHistoryAdapter");
            throw C00O.createAndThrow();
        }
        c67921V2l.A00 = A00(this);
        c67921V2l.A00();
        C0f9.A09(287741962, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(-241891450);
        super.onStart();
        C66152U1t c66152U1t = this.A06;
        if (c66152U1t != null) {
            C70727Wft c70727Wft = this.A04;
            if (c70727Wft != null) {
                c66152U1t.A04.add(c70727Wft);
                C66152U1t c66152U1t2 = this.A06;
                if (c66152U1t2 != null) {
                    C70727Wft c70727Wft2 = this.A04;
                    if (c70727Wft2 != null) {
                        c66152U1t2.A07.add(c70727Wft2);
                        C66152U1t c66152U1t3 = this.A06;
                        if (c66152U1t3 != null) {
                            C70727Wft c70727Wft3 = this.A04;
                            if (c70727Wft3 != null) {
                                c66152U1t3.A06.add(c70727Wft3);
                                C25671My A00 = AbstractC25651Mw.A00(getSession());
                                C70727Wft c70727Wft4 = this.A04;
                                if (c70727Wft4 != null) {
                                    A00.A01(c70727Wft4, C70710WfZ.class);
                                    C0f9.A09(162181767, A02);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
            C14360o3.A0F("recentsUpdatedListener");
            throw C00O.createAndThrow();
        }
        C14360o3.A0F("hideSearchEntryController");
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(1165771304);
        super.onStop();
        C66152U1t c66152U1t = this.A06;
        if (c66152U1t != null) {
            C70727Wft c70727Wft = this.A04;
            if (c70727Wft != null) {
                c66152U1t.A04.remove(c70727Wft);
                C66152U1t c66152U1t2 = this.A06;
                if (c66152U1t2 != null) {
                    C70727Wft c70727Wft2 = this.A04;
                    if (c70727Wft2 != null) {
                        c66152U1t2.A07.remove(c70727Wft2);
                        C66152U1t c66152U1t3 = this.A06;
                        if (c66152U1t3 != null) {
                            C70727Wft c70727Wft3 = this.A04;
                            if (c70727Wft3 != null) {
                                c66152U1t3.A06.remove(c70727Wft3);
                                C25671My A00 = AbstractC25651Mw.A00(getSession());
                                C70727Wft c70727Wft4 = this.A04;
                                if (c70727Wft4 != null) {
                                    A00.A02(c70727Wft4, C70710WfZ.class);
                                    C0f9.A09(1411495197, A02);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
            C14360o3.A0F("recentsUpdatedListener");
            throw C00O.createAndThrow();
        }
        C14360o3.A0F("hideSearchEntryController");
        throw C00O.createAndThrow();
    }
}
