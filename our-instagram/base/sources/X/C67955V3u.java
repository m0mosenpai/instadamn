package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.appstate.AppStateModule;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.V3u, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67955V3u extends C1P1 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public C67955V3u(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A02 = obj;
        this.A03 = str;
        this.A01 = obj2;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N;
        String str;
        int i;
        String str2;
        Long A00;
        if (this.A00 != 0) {
            A0N = C0f9.A03(-462065895);
            super.onFail(abstractC115105If);
            C38274GsJ A002 = AbstractC38267GsC.A00(((ReelDashboardFragment) this.A01).A06);
            String str3 = this.A03;
            C14360o3.A0B(str3, 0);
            if (C38274GsJ.A01(A002) && (A00 = C38274GsJ.A00(A002, str3)) != null) {
                long longValue = A00.longValue();
                C1QT c1qt = A002.A02;
                c1qt.flowAnnotate(longValue, TraceFieldType.FailureReason, "fb_viewers_list_fetch_failure");
                c1qt.flowEndFail(longValue, "fb_viewers_list_fetch_failure", null);
            }
            i = -1727145917;
        } else {
            A0N = AbstractC167017dG.A0N(abstractC115105If, -1419817404);
            V16 v16 = (V16) this.A02;
            InterfaceC70513Em interfaceC70513Em = v16.A0J;
            if (interfaceC70513Em == null) {
                str2 = "pullToRefresh";
            } else {
                if (!(interfaceC70513Em instanceof C71094Wnq)) {
                    SpinnerImageView spinnerImageView = v16.A0K;
                    if (spinnerImageView == null) {
                        str2 = "loadingSpinner";
                    } else {
                        spinnerImageView.setLoadingStatus(C3T1.SUCCESS);
                        C67920V2k c67920V2k = v16.A0B;
                        if (c67920V2k == null) {
                            str2 = "promoteAdToolsAdapter";
                        } else {
                            c67920V2k.A00(v16.A0e);
                        }
                    }
                }
                Throwable A01 = abstractC115105If.A01();
                if (A01 == null || (str = A01.getMessage()) == null) {
                    str = "Unknown error";
                }
                W6I w6i = v16.A07;
                if (w6i == null) {
                    str2 = "adsManagerLogger";
                } else {
                    String str4 = this.A03;
                    C70654Wea c70654Wea = (C70654Wea) this.A01;
                    w6i.A07(str4, AppStateModule.APP_STATE_ACTIVE, c70654Wea.BZZ(), str);
                    v16.A0E = c70654Wea;
                    V16.A07(v16);
                    i = -629396613;
                }
            }
            C14360o3.A0F(str2);
            throw C00O.createAndThrow();
        }
        C0f9.A0A(i, A0N);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03;
        int i;
        String str;
        if (this.A00 != 0) {
            A03 = C0f9.A03(-1222298195);
            C38262Gs5 c38262Gs5 = ((ReelDashboardFragment) this.A01).mListAdapter;
            if (c38262Gs5 != null) {
                c38262Gs5.A0B(this.A03, false);
            }
            i = 726475733;
        } else {
            A03 = C0f9.A03(-1413438475);
            V16 v16 = (V16) this.A02;
            C3FR c3fr = v16.A0H;
            if (c3fr == null) {
                str = "recyclerViewProxy";
            } else {
                c3fr.EWc(false);
                InterfaceC70513Em interfaceC70513Em = v16.A0J;
                if (interfaceC70513Em == null) {
                    str = "pullToRefresh";
                } else {
                    interfaceC70513Em.setIsLoading(false);
                    i = -497347379;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03;
        int i;
        String str;
        if (this.A00 != 0) {
            A03 = C0f9.A03(145469420);
            C38262Gs5 c38262Gs5 = ((ReelDashboardFragment) this.A01).mListAdapter;
            if (c38262Gs5 != null) {
                c38262Gs5.A0B(this.A03, true);
            }
            i = -1990878746;
        } else {
            A03 = C0f9.A03(-1926207206);
            V16 v16 = (V16) this.A02;
            C3FR c3fr = v16.A0H;
            if (c3fr == null) {
                str = "recyclerViewProxy";
            } else {
                c3fr.EWc(true);
                InterfaceC70513Em interfaceC70513Em = v16.A0J;
                if (interfaceC70513Em != null) {
                    interfaceC70513Em.setIsLoading(true);
                    InterfaceC70513Em interfaceC70513Em2 = v16.A0J;
                    if (interfaceC70513Em2 != null) {
                        if (!(interfaceC70513Em2 instanceof C71094Wnq)) {
                            C67920V2k c67920V2k = v16.A0B;
                            if (c67920V2k == null) {
                                str = "promoteAdToolsAdapter";
                            } else {
                                c67920V2k.A00(new ArrayList());
                                SpinnerImageView spinnerImageView = v16.A0K;
                                if (spinnerImageView == null) {
                                    str = "loadingSpinner";
                                } else {
                                    spinnerImageView.setLoadingStatus(C3T1.LOADING);
                                }
                            }
                        }
                        i = 760101095;
                    }
                }
                C14360o3.A0F("pullToRefresh");
                throw C00O.createAndThrow();
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        C0f9.A0A(i, A03);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [X.1P1, X.V3u] */
    /* JADX WARN: Type inference failed for: r5v3, types: [X.XBY] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        Long A00;
        if (this.A00 != 0) {
            int A03 = C0f9.A03(1812221306);
            C66260U6e c66260U6e = (C66260U6e) obj;
            int A032 = C0f9.A03(1264090836);
            super.onSuccess(c66260U6e);
            C38274GsJ A002 = AbstractC38267GsC.A00(((ReelDashboardFragment) this.A01).A06);
            String str2 = this.A03;
            int size = c66260U6e.A0G.size();
            C14360o3.A0B(str2, 0);
            if (C38274GsJ.A01(A002) && (A00 = C38274GsJ.A00(A002, str2)) != null) {
                long longValue = A00.longValue();
                C1QT c1qt = A002.A02;
                c1qt.flowAnnotate(longValue, "fetched_fb_viewers_count", size);
                c1qt.flowMarkPoint(longValue, "fb_viewers_list_fetch_success");
            }
            ?? r5 = (XBY) this.A02;
            ?? r8 = c66260U6e.A0F;
            if (r8 == 0) {
                r8 = new ArrayList();
                Iterator it = c66260U6e.A0G.iterator();
                while (it.hasNext()) {
                    r8.add(((C9C8) it.next()).A05);
                }
            }
            List list = c66260U6e.A0C;
            r5.DGP(c66260U6e.A06, c66260U6e.A07, r8, list, c66260U6e.A0G, c66260U6e.A00, c66260U6e.A01);
            C0f9.A0A(1726262941, A032);
            C0f9.A0A(1059726316, A03);
            return;
        }
        int A033 = C0f9.A03(1759419310);
        C67823Uyw c67823Uyw = (C67823Uyw) obj;
        int A0N = AbstractC167017dG.A0N(c67823Uyw, -1047643067);
        boolean z = c67823Uyw.A01;
        String str3 = "adsManagerLogger";
        V16 v16 = (V16) this.A02;
        if (!z) {
            InterfaceC70513Em interfaceC70513Em = v16.A0J;
            if (interfaceC70513Em == null) {
                str3 = "pullToRefresh";
            } else {
                if (!(interfaceC70513Em instanceof C71094Wnq)) {
                    SpinnerImageView spinnerImageView = v16.A0K;
                    if (spinnerImageView == null) {
                        str3 = "loadingSpinner";
                    } else {
                        spinnerImageView.setLoadingStatus(C3T1.SUCCESS);
                        C67920V2k c67920V2k = v16.A0B;
                        if (c67920V2k == null) {
                            str3 = "promoteAdToolsAdapter";
                        } else {
                            c67920V2k.A00(v16.A0e);
                        }
                    }
                }
                UPA upa = c67823Uyw.A00;
                if (upa == null || (str = upa.A02) == null) {
                    str = "Unknown error";
                }
                W6I w6i = v16.A07;
                if (w6i != null) {
                    String str4 = this.A03;
                    C70654Wea c70654Wea = (C70654Wea) this.A01;
                    w6i.A07(str4, AppStateModule.APP_STATE_ACTIVE, c70654Wea.BZZ(), str);
                    v16.A0E = c70654Wea;
                    V16.A07(v16);
                    C0f9.A0A(64583228, A0N);
                    C0f9.A0A(400809137, A033);
                    return;
                }
            }
            C14360o3.A0F(str3);
            throw C00O.createAndThrow();
        }
        W6I w6i2 = v16.A07;
        if (w6i2 != null) {
            w6i2.A08(this.A03, AppStateModule.APP_STATE_ACTIVE, ((C70654Wea) this.A01).BZZ(), null);
            WGU.A06(v16.getSession());
            C0f9.A0A(64583228, A0N);
            C0f9.A0A(400809137, A033);
            return;
        }
        C14360o3.A0F(str3);
        throw C00O.createAndThrow();
    }
}
