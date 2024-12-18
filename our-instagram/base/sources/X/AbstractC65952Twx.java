package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Twx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC65952Twx extends C2UU implements X7B {
    public C65972TxP A00;
    public boolean A01;
    public boolean A02;
    public C65969TxM A03;
    public final C003501a A04;
    public final C003501a A05;
    public final C003501a A06;
    public final AbstractC10360h2 A07;
    public final C07T A08;

    private Long A00(int i) {
        Long l = null;
        int i2 = 0;
        while (true) {
            C003501a c003501a = this.A05;
            if (i2 < c003501a.A00()) {
                if (((Number) c003501a.A04(i2)).intValue() == i) {
                    if (l == null) {
                        l = Long.valueOf(c003501a.A02(i2));
                    } else {
                        throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                    }
                }
                i2++;
            } else {
                return l;
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    private void A01(long j) {
        ViewParent parent;
        C003501a c003501a = this.A04;
        Fragment fragment = (Fragment) c003501a.A05(j);
        if (fragment != null) {
            View view = fragment.mView;
            if (view != null && (parent = view.getParent()) != null) {
                ((ViewGroup) parent).removeAllViews();
            }
            if (!A06(j)) {
                this.A06.A08(j);
            }
            if (!fragment.isAdded()) {
                c003501a.A08(j);
                return;
            }
            AbstractC10360h2 abstractC10360h2 = this.A07;
            if (abstractC10360h2.A11()) {
                this.A01 = true;
                return;
            }
            if (A06(j)) {
                C65972TxP c65972TxP = this.A00;
                ArrayList arrayList = new ArrayList();
                Iterator it = c65972TxP.A00.iterator();
                if (it.hasNext()) {
                    it.next();
                    throw new NullPointerException("onFragmentPreSavedInstanceState");
                }
                Fragment.SavedState A0N = abstractC10360h2.A0N(fragment);
                C65972TxP.A00(arrayList);
                this.A06.A09(j, A0N);
            }
            C65972TxP c65972TxP2 = this.A00;
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = c65972TxP2.A00.iterator();
            if (it2.hasNext()) {
                it2.next();
                throw new NullPointerException("onFragmentPreRemoved");
            }
            try {
                C14240no c14240no = new C14240no(abstractC10360h2);
                c14240no.A03(fragment);
                c14240no.A0K();
                c003501a.A08(j);
                C65972TxP.A00(arrayList2);
            } catch (Throwable th) {
                C65972TxP.A00(arrayList2);
                throw th;
            }
        }
    }

    public Fragment A03(int i) {
        EnumC68134VCs enumC68134VCs;
        if (this instanceof UKJ) {
            UKJ ukj = (UKJ) this;
            AbstractC155756z4.A00().A00.getValue();
            int ordinal = EnumC68134VCs.values()[i].ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        enumC68134VCs = EnumC68134VCs.A03;
                    } else {
                        throw new RuntimeException();
                    }
                } else {
                    enumC68134VCs = EnumC68134VCs.A04;
                }
            } else {
                enumC68134VCs = EnumC68134VCs.A02;
            }
            UserSession userSession = ukj.A00;
            Bundle A0E = AbstractC31174DnI.A0E(userSession, 1);
            A0E.putSerializable("PromoteMediaPickerContentFragment.ARGUMENT_MEDIA_CONTENT_TYPE", enumC68134VCs);
            AbstractC31173DnH.A1C(A0E, userSession);
            V18 v18 = new V18();
            v18.setArguments(A0E);
            return v18;
        }
        UKK ukk = (UKK) this;
        int A04 = JQ0.A04(2, i);
        if (A04 != 0) {
            if (A04 == 1) {
                AbstractC65702TsY.A0q();
                UserSession userSession2 = ukk.A02;
                XIGIGBoostDestination xIGIGBoostDestination = ukk.A01;
                String str = ukk.A04;
                XIGIGBoostCallToAction xIGIGBoostCallToAction = ukk.A00;
                boolean z = ukk.A0B;
                C14360o3.A0B(userSession2, 0);
                C14360o3.A0B(xIGIGBoostDestination, 1);
                AbstractC167007dF.A1E(str, 2, xIGIGBoostCallToAction);
                Bundle A05 = AbstractC31178DnM.A05(userSession2);
                A05.putString("destination", xIGIGBoostDestination.toString());
                A05.putString("media_id", str);
                A05.putString("call_to_action", xIGIGBoostCallToAction.toString());
                A05.putBoolean("is_political_ads", z);
                C52110N4i c52110N4i = new C52110N4i();
                c52110N4i.setArguments(A05);
                return c52110N4i;
            }
            throw new RuntimeException();
        }
        UserSession userSession3 = ukk.A02;
        C14360o3.A0B(userSession3, 0);
        boolean A06 = C18U.A06(C06090Tz.A05, userSession3, 36320859090068428L);
        C69798Vvi A02 = AbstractC155756z4.A00().A02();
        XIGIGBoostDestination xIGIGBoostDestination2 = ukk.A01;
        List list = ukk.A06;
        String str2 = ukk.A04;
        XIGIGBoostCallToAction xIGIGBoostCallToAction2 = ukk.A00;
        boolean z2 = ukk.A09;
        boolean z3 = ukk.A0A;
        boolean z4 = ukk.A08;
        boolean z5 = ukk.A0C;
        boolean z6 = ukk.A0D;
        String str3 = ukk.A05;
        if (A06) {
            return A02.A08(xIGIGBoostCallToAction2, xIGIGBoostDestination2, userSession3, ukk.A03, str2, str3, list, ukk.A07, true, z2, z3, z4, z5, z6);
        }
        return A02.A07(xIGIGBoostCallToAction2, xIGIGBoostDestination2, userSession3, null, ukk.A03, str2, str3, null, list, true, z2, z3, z4, z5, z6);
    }

    public final void A04() {
        C003501a c003501a;
        Fragment fragment;
        View view;
        if (this.A01 && !this.A07.A11()) {
            C012504o c012504o = new C012504o(0);
            int i = 0;
            while (true) {
                c003501a = this.A04;
                if (i >= c003501a.A00()) {
                    break;
                }
                long A02 = c003501a.A02(i);
                if (!A06(A02)) {
                    c012504o.add(Long.valueOf(A02));
                    this.A05.A08(A02);
                }
                i++;
            }
            if (!this.A02) {
                this.A01 = false;
                for (int i2 = 0; i2 < c003501a.A00(); i2++) {
                    long A022 = c003501a.A02(i2);
                    if (this.A05.A01(A022) < 0 && ((fragment = (Fragment) c003501a.A05(A022)) == null || (view = fragment.mView) == null || view.getParent() == null)) {
                        c012504o.add(Long.valueOf(A022));
                    }
                }
            }
            Iterator it = c012504o.iterator();
            while (it.hasNext()) {
                A01(((Number) it.next()).longValue());
            }
        }
    }

    public final void A05(UHT uht) {
        Fragment fragment = (Fragment) this.A04.A05(uht.mItemId);
        if (fragment != null) {
            FrameLayout frameLayout = (FrameLayout) uht.itemView;
            View view = fragment.mView;
            if (!fragment.isAdded()) {
                if (view != null) {
                    throw new IllegalStateException("Design assumption violated.");
                }
            } else if (view == null) {
                this.A07.A0q(new C65982Txb(frameLayout, fragment, this), false);
                return;
            } else if (view.getParent() != null) {
                if (view.getParent() == frameLayout) {
                    return;
                }
                A02(view, frameLayout);
                return;
            }
            if (!fragment.isAdded()) {
                AbstractC10360h2 abstractC10360h2 = this.A07;
                if (!abstractC10360h2.A11()) {
                    abstractC10360h2.A0q(new C65982Txb(frameLayout, fragment, this), false);
                    C65972TxP c65972TxP = this.A00;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = c65972TxP.A00.iterator();
                    if (it.hasNext()) {
                        it.next();
                        throw new NullPointerException("onFragmentPreAdded");
                    }
                    try {
                        fragment.setMenuVisibility(false);
                        C14240no c14240no = new C14240no(abstractC10360h2);
                        c14240no.A0B(fragment, AnonymousClass001.A0Q("f", uht.mItemId));
                        c14240no.A04(fragment, C07S.STARTED);
                        c14240no.A0K();
                        this.A03.A00(false);
                        return;
                    } finally {
                        C65972TxP.A00(arrayList);
                    }
                }
                if (abstractC10360h2.A0G) {
                    return;
                }
                this.A08.A09(new C63610SqI(1, uht, this));
                return;
            }
            A02(view, frameLayout);
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    public boolean A06(long j) {
        if (j >= 0 && j < getItemCount()) {
            return true;
        }
        return false;
    }

    @Override // X.C2UU
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C02R.A05(AbstractC25229BEm.A1Z(this.A03));
        C65969TxM c65969TxM = new C65969TxM(this);
        this.A03 = c65969TxM;
        ViewParent parent = recyclerView.getParent();
        if (parent instanceof ViewPager2) {
            ViewPager2 viewPager2 = (ViewPager2) parent;
            c65969TxM.A03 = viewPager2;
            C43748JWj c43748JWj = new C43748JWj(c65969TxM, 0);
            c65969TxM.A02 = c43748JWj;
            viewPager2.A05(c43748JWj);
            UH2 uh2 = new UH2(c65969TxM, 2);
            c65969TxM.A01 = uh2;
            AbstractC65952Twx abstractC65952Twx = c65969TxM.A05;
            abstractC65952Twx.registerAdapterDataObserver(uh2);
            U7O u7o = new U7O(c65969TxM, 0);
            c65969TxM.A00 = u7o;
            abstractC65952Twx.A08.A09(u7o);
            return;
        }
        throw AbstractC43594JPz.A0o(parent, "Expected ViewPager2 instance. Got: ", new StringBuilder());
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        UHT uht = (UHT) c3oo;
        long j = uht.mItemId;
        int id = uht.itemView.getId();
        Long A00 = A00(id);
        if (A00 != null) {
            long longValue = A00.longValue();
            if (longValue != j) {
                A01(longValue);
                this.A05.A08(longValue);
            }
        }
        this.A05.A09(j, Integer.valueOf(id));
        long itemId = getItemId(i);
        C003501a c003501a = this.A04;
        if (c003501a.A01(itemId) < 0) {
            Fragment A03 = A03(i);
            A03.setInitialSavedState((Fragment.SavedState) this.A06.A05(itemId));
            c003501a.A09(itemId, A03);
        }
        if (uht.itemView.isAttachedToWindow()) {
            A05(uht);
        }
        A04();
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        MSZ.A13(frameLayout);
        frameLayout.setId(View.generateViewId());
        frameLayout.setSaveEnabled(false);
        return new C3OO(frameLayout);
    }

    @Override // X.C2UU
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C65969TxM c65969TxM = this.A03;
        ViewParent parent = recyclerView.getParent();
        if (parent instanceof ViewPager2) {
            ((ViewPager2) parent).A05.A00.remove(c65969TxM.A02);
            AbstractC65952Twx abstractC65952Twx = c65969TxM.A05;
            abstractC65952Twx.unregisterAdapterDataObserver(c65969TxM.A01);
            abstractC65952Twx.A08.A0A(c65969TxM.A00);
            c65969TxM.A03 = null;
            this.A03 = null;
            return;
        }
        throw AbstractC43594JPz.A0o(parent, "Expected ViewPager2 instance. Got: ", new StringBuilder());
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onViewAttachedToWindow(C3OO c3oo) {
        A05((UHT) c3oo);
        A04();
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onViewRecycled(C3OO c3oo) {
        Long A00 = A00(c3oo.itemView.getId());
        if (A00 != null) {
            long longValue = A00.longValue();
            A01(longValue);
            this.A05.A08(longValue);
        }
    }

    @Override // X.C2UU
    public final void setHasStableIds(boolean z) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }

    public AbstractC65952Twx(Fragment fragment) {
        this(fragment.getChildFragmentManager(), fragment.mLifecycleRegistry);
    }

    public static final void A02(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() <= 1) {
            if (view.getParent() != frameLayout) {
                if (frameLayout.getChildCount() > 0) {
                    frameLayout.removeAllViews();
                }
                if (view.getParent() != null) {
                    ((ViewGroup) view.getParent()).removeView(view);
                }
                frameLayout.addView(view);
                return;
            }
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    @Override // X.C2UU, android.widget.Adapter
    public long getItemId(int i) {
        long j = i;
        C0f9.A0A(1079919963, C0f9.A03(1149236248));
        return j;
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ boolean onFailedToRecycleView(C3OO c3oo) {
        return true;
    }

    public AbstractC65952Twx(AbstractC10360h2 abstractC10360h2, C07T c07t) {
        this.A04 = new C003501a();
        this.A06 = new C003501a();
        this.A05 = new C003501a();
        this.A00 = new C65972TxP();
        this.A02 = false;
        this.A01 = false;
        this.A07 = abstractC10360h2;
        this.A08 = c07t;
        super.setHasStableIds(true);
    }
}
