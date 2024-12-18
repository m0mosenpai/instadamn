package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Oyu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C56283Oyu implements InterfaceC58283Psb {
    public RecyclerView A00;
    public InterfaceC58034PoK A01;
    public final UserSession A02;
    public final EnumC53114NeR A03;
    public final InterfaceC09390do A04;
    public final InterfaceC16660sJ A05;
    public final List A06;
    public final InterfaceC16820sZ A07;

    public /* synthetic */ C56283Oyu(UserSession userSession, EnumC53114NeR enumC53114NeR, InterfaceC16660sJ interfaceC16660sJ, int i) {
        this(userSession, (i & 2) != 0 ? EnumC53114NeR.A03 : enumC53114NeR, (i & 4) != 0 ? AbstractC16960so.A1Q(EnumC53256Ngu.A08, EnumC53256Ngu.A09, EnumC53256Ngu.A04) : null, null, interfaceC16660sJ);
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC58283Psb
    public final void AJN() {
        this.A01 = null;
    }

    @Override // X.InterfaceC58283Psb
    public final int B91() {
        return 0;
    }

    @Override // X.InterfaceC58283Psb
    public final void COD(ViewGroup viewGroup) {
        AbstractC70663Fe linearLayoutManager;
        ConstraintLayout constraintLayout;
        View view;
        RecyclerView A0B = AbstractC43592JPx.A0B(viewGroup, R.id.stacked_timeline_bottom_sheet_list_view);
        if (A0B == null) {
            viewGroup.removeAllViews();
            Context context = viewGroup.getContext();
            A0B = new C51383Mmi(context, this);
            A0B.setItemAnimator(null);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            if (this.A03 == EnumC53114NeR.A02) {
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = AbstractC167017dG.A08(context);
            }
            A0B.setId(R.id.stacked_timeline_bottom_sheet_list_view);
            viewGroup.addView(A0B, layoutParams);
            AbstractC13880nE.A0W(viewGroup, -1);
            ViewParent parent = viewGroup.getParent().getParent();
            if ((parent instanceof ConstraintLayout) && (constraintLayout = (ConstraintLayout) parent) != null) {
                Object parent2 = viewGroup.getParent();
                if ((parent2 instanceof View) && (view = (View) parent2) != null) {
                    int id = view.getId();
                    C110964z8 c110964z8 = new C110964z8();
                    c110964z8.A0I(constraintLayout);
                    c110964z8.A0A(id, -1);
                    c110964z8.A0C(id, 4, 0, 4);
                    c110964z8.A0G(constraintLayout);
                }
            }
        }
        this.A00 = A0B;
        Context context2 = A0B.getContext();
        if (context2 == null) {
            linearLayoutManager = null;
        } else {
            int ordinal = this.A03.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    linearLayoutManager = new GridLayoutManager(context2, 3, 1, false);
                } else {
                    throw B4Z.A00();
                }
            } else {
                linearLayoutManager = new LinearLayoutManager(context2, 0, false);
            }
        }
        A0B.setLayoutManager(linearLayoutManager);
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            AbstractC37304Gc5.A10(recyclerView, this.A04);
        }
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void D8S(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onCreate() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroy() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroyView() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onPause() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onResume() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStart() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStop() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public final InterfaceC58034PoK A00(String str) {
        C51147Miq c51147Miq;
        boolean A0K;
        RecyclerView recyclerView = this.A00;
        Object obj = null;
        if (recyclerView == null) {
            return null;
        }
        C2UU c2uu = recyclerView.A0A;
        if (!(c2uu instanceof C51147Miq) || (c51147Miq = (C51147Miq) c2uu) == null) {
            return null;
        }
        Iterator it = c51147Miq.A00.iterator();
        Object obj2 = null;
        boolean z = false;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                InterfaceC58034PoK interfaceC58034PoK = (InterfaceC58034PoK) next;
                if (interfaceC58034PoK instanceof C51827MvV) {
                    A0K = C14360o3.A0K(((C51827MvV) interfaceC58034PoK).A01, str);
                } else if (interfaceC58034PoK instanceof C51829MvX) {
                    A0K = C14360o3.A0K(((C51829MvX) interfaceC58034PoK).A01, str);
                } else if (interfaceC58034PoK instanceof C51828MvW) {
                    A0K = C14360o3.A0K(((C51828MvW) interfaceC58034PoK).A02, str);
                } else if (interfaceC58034PoK instanceof C51826MvU) {
                    A0K = C14360o3.A0K(((C51826MvU) interfaceC58034PoK).A02, str);
                } else {
                    continue;
                }
                if (!A0K) {
                    continue;
                } else {
                    if (z) {
                        break;
                    }
                    z = true;
                    obj2 = next;
                }
            } else if (z) {
                obj = obj2;
            }
        }
        return (InterfaceC58034PoK) obj;
    }

    @Override // X.InterfaceC58283Psb
    public final void AQM(float f) {
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            recyclerView.scrollBy(0, (int) f);
        }
    }

    @Override // X.InterfaceC58283Psb
    public final List Ben() {
        return this.A06;
    }

    @Override // X.InterfaceC58283Psb
    public final boolean CRk() {
        RecyclerView recyclerView = this.A00;
        if (recyclerView == null || !recyclerView.canScrollVertically(1)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC58283Psb
    public final boolean CRl() {
        RecyclerView recyclerView = this.A00;
        if (recyclerView == null || !AbstractC43592JPx.A1X(recyclerView)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC58283Psb
    public final void D0G() {
        String str;
        if (this instanceof C52406NHb) {
            ClipsStackedTimelineFragment clipsStackedTimelineFragment = ((C52406NHb) this).A00;
            C187418Sj c187418Sj = clipsStackedTimelineFragment.A0b;
            if (c187418Sj == null) {
                str = "clipsStackedTimelineVideoPreviewSizeProvider";
            } else {
                C50868Mdz c50868Mdz = clipsStackedTimelineFragment.A0h;
                if (c50868Mdz == null) {
                    str = "stackedTimelineViewModel";
                } else {
                    c187418Sj.A0E(null, MSZ.A0A(c50868Mdz.A0Y));
                    return;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    @Override // X.InterfaceC58283Psb
    public final void DHV(float f, float f2) {
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            recyclerView.A1E(0, (int) f2);
        }
    }

    @Override // X.InterfaceC58283Psb
    public final void DhM() {
        ViewParent parent;
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null && (parent = recyclerView.getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override // X.InterfaceC58283Psb
    public final void cancel() {
        InterfaceC58034PoK A00;
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            C2UU c2uu = (C2UU) this.A04.getValue();
            recyclerView.suppressLayout(false);
            RecyclerView.A0I(c2uu, recyclerView, true);
            recyclerView.A18(true);
            recyclerView.requestLayout();
            InterfaceC58034PoK interfaceC58034PoK = this.A01;
            if (interfaceC58034PoK != null && (A00 = A00(interfaceC58034PoK.getName())) != null && !A00.Cce()) {
                this.A05.invoke(interfaceC58034PoK);
            }
            this.A01 = null;
            InterfaceC16820sZ interfaceC16820sZ = this.A07;
            if (interfaceC16820sZ != null) {
                interfaceC16820sZ.invoke();
            }
        }
    }

    public C56283Oyu(UserSession userSession, EnumC53114NeR enumC53114NeR, List list, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ) {
        AbstractC167027dH.A13(userSession, enumC53114NeR, list);
        this.A02 = userSession;
        this.A03 = enumC53114NeR;
        this.A06 = list;
        this.A07 = interfaceC16820sZ;
        this.A05 = interfaceC16660sJ;
        this.A04 = C57521Pfv.A00(this, 13);
    }
}
