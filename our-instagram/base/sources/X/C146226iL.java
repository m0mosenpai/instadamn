package X;

import android.app.Activity;
import android.content.Context;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelViewerConfig;
import instagram.features.stories.fragment.ReelViewerFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.6iL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C146226iL extends AbstractC146236iM implements InterfaceC114805Gn, InterfaceC146256iO {
    public int A00;
    public int A01;
    public C146806jI A02;
    public C146346iX A03;
    public boolean A04;
    public final Context A05;
    public final C80673iw A06;
    public final UserSession A07;
    public final InterfaceC59152nG A08;
    public final InterfaceC60442pS A09;
    public final InterfaceC145396gy A0A;
    public final InterfaceC145376gw A0B;
    public final C146286iR A0C;
    public final InterfaceC144586fe A0D;
    public final InterfaceC145696hS A0E;
    public final C146266iP A0F;
    public final InterfaceC144936gD A0G;
    public final InterfaceC145416h0 A0H;
    public final InterfaceC09390do A0I;
    public final Activity A0J;
    public final InterfaceC62872tQ A0K;
    public final C69433Ad A0L;
    public final ReelViewerConfig A0M;
    public final C3G2 A0N;
    public final C64842wi A0O;
    public final C64742wY A0P;
    public final C145826hf A0Q;
    public final InterfaceC1118853a A0R;
    public final InterfaceC144756fv A0S;
    public final InterfaceC146046i1 A0T;
    public final C145726hV A0U;
    public final C145746hX A0V;
    public final String A0W;
    public final boolean A0X;

    public final ViewGroup A01(ViewGroup viewGroup, EnumC149266na enumC149266na) {
        int ordinal = enumC149266na.ordinal();
        if (ordinal != 1) {
            if (ordinal != 3) {
                if (ordinal != 6) {
                    if (ordinal != 4) {
                        if (ordinal != 2) {
                            if (ordinal == 5) {
                                return AbstractC54895OPq.A00(viewGroup, this.A07);
                            }
                            throw new IllegalStateException(AnonymousClass001.A0R("Invalid item type: ", enumC149266na.name()));
                        }
                        Activity activity = this.A0J;
                        InterfaceC145396gy interfaceC145396gy = this.A0A;
                        return C55162OdQ.A00(activity, viewGroup, this.A06, this.A07, this.A08, interfaceC145396gy);
                    }
                    return C6S6.A00(viewGroup, this.A06, this.A07, this.A08);
                }
                return ((AbstractC65902yS) this.A0F.A01.getValue()).A03();
            }
            return C6TR.A00(viewGroup, this.A06, this.A07, this.A08, this.A0N);
        }
        Activity activity2 = this.A0J;
        InterfaceC59152nG interfaceC59152nG = this.A08;
        return C143546dt.A00(activity2, viewGroup, this.A06, this.A07, interfaceC59152nG, this.A0N, C05F.A01);
    }

    @Override // X.InterfaceC101944i9
    public final C41551w4 Blu(String str) {
        return null;
    }

    @Override // X.InterfaceC114805Gn
    public final C141596ac C00(C41181vS c41181vS) {
        C14360o3.A0B(c41181vS, 0);
        return this.A0C.C00(c41181vS);
    }

    @Override // X.InterfaceC101944i9
    public final int CNR(C41551w4 c41551w4) {
        C14360o3.A0B(c41551w4, 0);
        return this.A0C.A02.indexOf(c41551w4);
    }

    @Override // X.InterfaceC114805Gn
    public final void EcL(List list) {
        C14360o3.A0B(list, 0);
        C146286iR c146286iR = this.A0C;
        List list2 = c146286iR.A02;
        list2.clear();
        c146286iR.A01.clear();
        c146286iR.A04.clear();
        c146286iR.A03.clear();
        c146286iR.A05.set(0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C41551w4 c41551w4 = (C41551w4) it.next();
            C14360o3.A0B(c41551w4, 0);
            c146286iR.A01(c41551w4, list2.size());
        }
        C0fA.A00(this, 1042206859);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter, X.InterfaceC114805Gn
    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        C14360o3.A0B(dataSetObserver, 0);
        super.registerDataSetObserver(dataSetObserver);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter, X.InterfaceC114805Gn
    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        C14360o3.A0B(dataSetObserver, 0);
        super.unregisterDataSetObserver(dataSetObserver);
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x029f, code lost:
    
        if (r7.A0H.A1O == true) goto L88;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x003c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(android.view.View r32, X.C41181vS r33, X.C41551w4 r34, X.C146226iL r35, int r36) {
        /*
            Method dump skipped, instructions count: 870
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C146226iL.A00(android.view.View, X.1vS, X.1w4, X.6iL, int):void");
    }

    @Override // X.InterfaceC101964iB
    public final List AZa() {
        return AbstractC001800i.A0X(AbstractC001800i.A0a(this.A0C.A02));
    }

    @Override // X.InterfaceC101954iA
    public final List AaH() {
        ArrayList arrayList = new ArrayList();
        C146286iR c146286iR = this.A0C;
        int A00 = c146286iR.A00();
        for (int i = 0; i < A00; i++) {
            C41551w4 c41551w4 = (C41551w4) AbstractC001800i.A0O(c146286iR.A02, i);
            if (c41551w4 != null && c41551w4.A0N) {
                arrayList.add(new C09530e4(Integer.valueOf(i), c41551w4));
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC101944i9
    public final C41551w4 Blt(int i) {
        return (C41551w4) AbstractC001800i.A0O(this.A0C.A02, i);
    }

    @Override // X.InterfaceC101944i9
    public final C41551w4 Blv(String str) {
        if (str != null) {
            return (C41551w4) this.A0C.A04.get(str);
        }
        return null;
    }

    @Override // X.InterfaceC101944i9
    public final int CNP(Reel reel) {
        Iterator it = this.A0C.A02.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (!C14360o3.A0K(((C41551w4) it.next()).A0H.getId(), reel.getId())) {
                i++;
            } else {
                return i;
            }
        }
        return -1;
    }

    @Override // X.AbstractC146246iN, X.InterfaceC114805Gn
    public final void CtM() {
        ReelViewerFragment reelViewerFragment = (ReelViewerFragment) this.A0R;
        C41551w4 c41551w4 = reelViewerFragment.A0a;
        if (c41551w4 != null) {
            reelViewerFragment.A1A.A00(c41551w4, null);
            ReelViewerFragment.A0E(reelViewerFragment);
        }
        super.CtM();
    }

    @Override // X.InterfaceC114805Gn
    public final C41551w4 EG9(int i) {
        C146286iR c146286iR = this.A0C;
        if (i >= 0) {
            List list = c146286iR.A02;
            if (i < list.size()) {
                C41551w4 c41551w4 = (C41551w4) list.remove(i);
                ConcurrentHashMap concurrentHashMap = c146286iR.A04;
                Reel reel = c41551w4.A0H;
                String id = reel.getId();
                C14360o3.A07(id);
                concurrentHashMap.remove(id);
                List list2 = c146286iR.A01;
                String id2 = reel.getId();
                C14360o3.A07(id2);
                list2.remove(id2);
                c146286iR.A05.decrementAndGet();
                return c41551w4;
            }
            return null;
        }
        return null;
    }

    @Override // X.InterfaceC114805Gn
    public final void Epc(Reel reel, C41551w4 c41551w4) {
        C146286iR c146286iR = this.A0C;
        C41551w4 c41551w42 = new C41551w4(c146286iR.A00, reel, false, null, null, C16910sj.A00, c41551w4.A0E, System.currentTimeMillis(), false);
        int indexOf = c146286iR.A02.indexOf(c41551w4);
        c146286iR.A02(c41551w4);
        c146286iR.A01(c41551w42, indexOf);
    }

    @Override // android.widget.Adapter, X.InterfaceC114805Gn
    public final int getCount() {
        return this.A0C.A00();
    }

    @Override // android.widget.Adapter, X.InterfaceC114805Gn
    public final Object getItem(int i) {
        return this.A0C.A02.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        C14360o3.A07(((C41551w4) this.A0C.A02.get(i)).A0H.getId());
        return r0.hashCode();
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i) {
        EnumC149266na enumC149266na;
        C146286iR c146286iR = this.A0C;
        Reel reel = ((C41551w4) c146286iR.A02.get(i)).A0H;
        if (reel.A0d()) {
            enumC149266na = EnumC149266na.A04;
        } else if (reel.A0c()) {
            enumC149266na = EnumC149266na.A05;
        } else if (reel.CdW()) {
            enumC149266na = EnumC149266na.A08;
        } else if (reel.A0m()) {
            enumC149266na = EnumC149266na.A06;
        } else if (!reel.A1W && !AbstractC34287FAh.A00(c146286iR.A00, reel)) {
            enumC149266na = EnumC149266na.A07;
        } else {
            enumC149266na = EnumC149266na.A09;
        }
        return enumC149266na.A00;
    }

    @Override // X.InterfaceC101944i9
    public final C41551w4 Bg4(C41551w4 c41551w4) {
        return Blt(CNR(c41551w4) - 1);
    }

    @Override // X.InterfaceC101944i9
    public final boolean CXI(C41551w4 c41551w4) {
        int count = getCount();
        if (count > 0 && c41551w4.equals(Blt(count - 1))) {
            return true;
        }
        return false;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return EnumC149266na.values().length;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [X.2nG, java.lang.Object] */
    public C146226iL(Activity activity, Context context, InterfaceC62872tQ interfaceC62872tQ, UserSession userSession, C69433Ad c69433Ad, InterfaceC60442pS interfaceC60442pS, ReelViewerConfig reelViewerConfig, C3G2 c3g2, final C146206iJ c146206iJ, C64842wi c64842wi, C64742wY c64742wY, C145826hf c145826hf, InterfaceC1118853a interfaceC1118853a, InterfaceC145396gy interfaceC145396gy, InterfaceC145376gw interfaceC145376gw, InterfaceC144756fv interfaceC144756fv, InterfaceC144586fe interfaceC144586fe, InterfaceC145696hS interfaceC145696hS, InterfaceC144936gD interfaceC144936gD, InterfaceC146046i1 interfaceC146046i1, InterfaceC145416h0 interfaceC145416h0, C145726hV c145726hV, C145746hX c145746hX, String str, boolean z) {
        new AbstractC146246iN(c146206iJ) { // from class: X.6iM
            public final C146206iJ A00;

            @Override // X.AbstractC146246iN, android.widget.Adapter
            public final View getView(int i, View view, ViewGroup viewGroup) {
                String str2;
                C14360o3.A0B(viewGroup, 2);
                int itemViewType = getItemViewType(i);
                C146226iL c146226iL = (C146226iL) this;
                EnumC149266na A00 = AbstractC149276nb.A00(c146226iL.getItemViewType(i));
                switch (A00.ordinal()) {
                    case 0:
                        str2 = "broadcast";
                        break;
                    case 1:
                        str2 = "story";
                        break;
                    case 2:
                        str2 = "broadcast_archive";
                        break;
                    case 3:
                        str2 = "story_ad";
                        break;
                    case 4:
                        str2 = "netego";
                        break;
                    case 5:
                        str2 = "story_interstitial";
                        break;
                    case 6:
                        str2 = "litho_story_ad";
                        break;
                    default:
                        throw new IllegalStateException(AnonymousClass001.A0R("Invalid item type: ", A00.name()));
                }
                if (view == null) {
                    C146206iJ c146206iJ2 = this.A00;
                    QuickPerformanceLogger quickPerformanceLogger = c146206iJ2.A01;
                    quickPerformanceLogger.markerStart(539624923);
                    C146206iJ.A00(c146206iJ2, str2, 539624923, itemViewType);
                    quickPerformanceLogger.markerAnnotate(539624923, "is_prefetching", false);
                    C0fO.A01(AnonymousClass001.A0R("onCreateView: ", str2), 1692439988);
                    EnumC149266na A002 = AbstractC149276nb.A00(c146226iL.getItemViewType(i));
                    if (A002 == EnumC149266na.A04) {
                        UserSession userSession2 = c146226iL.A07;
                        InterfaceC145376gw interfaceC145376gw2 = c146226iL.A0B;
                        view = AbstractC50547MTc.A00(viewGroup, c146226iL.A06, userSession2, c146226iL.A08, interfaceC145376gw2);
                    } else {
                        view = c146226iL.A01(viewGroup, A002);
                    }
                    C0fO.A00(513416562);
                    quickPerformanceLogger.markerEnd(539624923, (short) 2);
                }
                C146206iJ c146206iJ3 = this.A00;
                QuickPerformanceLogger quickPerformanceLogger2 = c146206iJ3.A01;
                quickPerformanceLogger2.markerStart(539637512);
                C146206iJ.A00(c146206iJ3, str2, 539637512, itemViewType);
                C0fO.A01(AnonymousClass001.A0R("onBindView: ", str2), 1789622837);
                C41551w4 c41551w4 = (C41551w4) AbstractC001800i.A0O(c146226iL.A0C.A02, i);
                if (c41551w4 != null) {
                    C146226iL.A00(view, c41551w4.A08(c146226iL.A07), c41551w4, c146226iL, i);
                }
                C0fO.A00(986589668);
                quickPerformanceLogger2.markerEnd(539637512, (short) 2);
                return view;
            }

            {
                this.A00 = c146206iJ;
            }
        };
        C14360o3.A0B(userSession, 3);
        C14360o3.A0B(interfaceC144586fe, 5);
        C14360o3.A0B(interfaceC144756fv, 6);
        C14360o3.A0B(interfaceC146046i1, 7);
        C14360o3.A0B(interfaceC145376gw, 8);
        C14360o3.A0B(interfaceC145396gy, 9);
        C14360o3.A0B(interfaceC145416h0, 10);
        C14360o3.A0B(interfaceC144936gD, 11);
        C14360o3.A0B(interfaceC145696hS, 12);
        C14360o3.A0B(reelViewerConfig, 13);
        C14360o3.A0B(c3g2, 14);
        C14360o3.A0B(interfaceC62872tQ, 16);
        C14360o3.A0B(c69433Ad, 20);
        C14360o3.A0B(c146206iJ, 21);
        C14360o3.A0B(str, 22);
        C14360o3.A0B(c145746hX, 26);
        this.A05 = context;
        this.A0J = activity;
        this.A07 = userSession;
        this.A0R = interfaceC1118853a;
        this.A0D = interfaceC144586fe;
        this.A0S = interfaceC144756fv;
        this.A0T = interfaceC146046i1;
        this.A0B = interfaceC145376gw;
        this.A0A = interfaceC145396gy;
        this.A0H = interfaceC145416h0;
        this.A0G = interfaceC144936gD;
        this.A0E = interfaceC145696hS;
        this.A0M = reelViewerConfig;
        this.A0N = c3g2;
        this.A09 = interfaceC60442pS;
        this.A0K = interfaceC62872tQ;
        this.A0X = z;
        this.A0O = c64842wi;
        this.A0P = c64742wY;
        this.A0L = c69433Ad;
        this.A0W = str;
        this.A0Q = c145826hf;
        this.A0V = c145746hX;
        this.A0I = AbstractC09440dt.A00(EnumC09460dv.A02, new C9EH(this, 15));
        this.A0F = new C146266iP(context, (C07X) activity, userSession);
        this.A0I.getValue();
        this.A0C = new C146286iR(userSession, this, false);
        this.A08 = new Object();
        this.A06 = new C80673iw();
        this.A00 = Integer.MAX_VALUE;
        this.A01 = Integer.MIN_VALUE;
        this.A0U = c145726hV;
    }
}
