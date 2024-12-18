package X;

import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.systrace.Systrace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.2US, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C2US extends C2UT {
    public static boolean sDebugHeadViewBinds = false;
    public static boolean sEnableSmartUpdateAsync = false;
    public static boolean sEnableStableIdFix = true;
    public final AbstractC65412xd DIFF_CALLBACK;
    public AnonymousClass303 mBinderGroupCombinator;
    public final boolean mDebugViewBinds;
    public final C65422xe mDiffer;
    public boolean mEnableItemIdFromBinderGroup;
    public final boolean mUseAsyncListDiffer;
    public C3D4 mViewLifecycleListener;

    public final int addModel(Object obj, InterfaceC65642y0 interfaceC65642y0) {
        return addModel(obj, null, interfaceC65642y0);
    }

    public void enableItemIdFromBinderGroup() {
        this.mEnableItemIdFromBinderGroup = true;
    }

    public AnonymousClass302 getLithoPrepareHelperCallback() {
        return null;
    }

    public final Object getModel(Class cls, int i) {
        if (i < 0) {
            return null;
        }
        List distinctItems = getDistinctItems(cls);
        if (i < distinctItems.size()) {
            return distinctItems.get(i);
        }
        return null;
    }

    private void smartUpdate(Configuration configuration) {
        if (this.mUseAsyncListDiffer) {
            boolean A0E = Systrace.A0E(1L);
            if (A0E) {
                C0fO.A01("smartUpdate", 1380360718);
            }
            if (sEnableSmartUpdateAsync) {
                C14120nc.A00().ATO(new EZc(this, configuration));
            } else {
                smartUpdateSync(configuration);
            }
            if (A0E) {
                C0fO.A00(2066559452);
                return;
            }
            return;
        }
        throw new IllegalStateException("Cannot use smart updates without async diffing enabled.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void smartUpdateSync(Configuration configuration) {
        boolean A0E = Systrace.A0E(1L);
        if (A0E) {
            C0fO.A01("smartUpdateSync", -590206737);
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            AnonymousClass303 anonymousClass303 = this.mBinderGroupCombinator;
            if (i >= anonymousClass303.A01) {
                break;
            }
            C3GA c3ga = (C3GA) anonymousClass303.A05.get(i);
            int A00 = this.mBinderGroupCombinator.A00(i);
            int viewModelHash = c3ga.A01.getViewModelHash(c3ga.A00, c3ga.A02, c3ga.A03);
            if (configuration != null) {
                viewModelHash = Arrays.hashCode(new Object[]{new Integer(viewModelHash), configuration});
            }
            int identifier = c3ga.A01.getIdentifier(c3ga.A00, c3ga.A02, c3ga.A03);
            arrayList.add(new C3GF(c3ga.A01, c3ga.A03, c3ga.A02, identifier, viewModelHash, c3ga.A00, A00, c3ga.A04));
            i++;
        }
        if (sEnableSmartUpdateAsync) {
            C11T.A02(new RunnableC36881GNc(this, arrayList));
        } else {
            this.mDiffer.A01(arrayList, null);
        }
        if (A0E) {
            C0fO.A00(-309930314);
        }
    }

    public void addNextUpdateListener(Runnable runnable) {
        C65422xe c65422xe = this.mDiffer;
        c65422xe.A06.add(new C35770Fr8(this, runnable));
    }

    @Override // android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        return this.mBinderGroupCombinator.A03;
    }

    public final void clear() {
        AnonymousClass303 anonymousClass303 = this.mBinderGroupCombinator;
        anonymousClass303.A01 = 0;
        anonymousClass303.A07.clear();
        anonymousClass303.A03 = true;
    }

    public final int getAdapterViewType(InterfaceC65642y0 interfaceC65642y0, int i) {
        return ((Number) this.mBinderGroupCombinator.A06.get(interfaceC65642y0)).intValue() + i;
    }

    public InterfaceC65642y0 getBinderGroup(int i) {
        if (this.mUseAsyncListDiffer) {
            return ((C3GF) this.mDiffer.A02.get(i)).A04;
        }
        return ((C3GA) this.mBinderGroupCombinator.A05.get(i)).A01;
    }

    public int getBinderGroupViewType(int i) {
        if (this.mUseAsyncListDiffer) {
            return ((C3GF) this.mDiffer.A02.get(i)).A01;
        }
        return ((C3GA) this.mBinderGroupCombinator.A05.get(i)).A00;
    }

    public final List getDistinctItems(Class cls) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (this.mUseAsyncListDiffer) {
            Iterator it = this.mDiffer.A02.iterator();
            while (it.hasNext()) {
                Object obj = ((C3GF) it.next()).A05;
                if (cls.isInstance(obj)) {
                    linkedHashSet.add(cls.cast(obj));
                }
            }
        } else {
            int i = 0;
            while (true) {
                AnonymousClass303 anonymousClass303 = this.mBinderGroupCombinator;
                if (i >= anonymousClass303.A01) {
                    break;
                }
                Object obj2 = ((C3GA) anonymousClass303.A05.get(i)).A02;
                if (cls.isInstance(obj2)) {
                    linkedHashSet.add(cls.cast(obj2));
                }
                i++;
            }
        }
        return new ArrayList(linkedHashSet);
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        if (this.mUseAsyncListDiffer) {
            return ((C3GF) this.mDiffer.A02.get(i)).A05;
        }
        return ((C3GA) this.mBinderGroupCombinator.A05.get(i)).A02;
    }

    public final Object getModelForPosition(Class cls, int i) {
        if (i >= 0 && i < getItemCount()) {
            Object item = getItem(i);
            if (!cls.isInstance(item)) {
                return null;
            }
            return cls.cast(item);
        }
        throw new IndexOutOfBoundsException();
    }

    public int[] getModelIndex(Object obj) {
        return (int[]) this.mBinderGroupCombinator.A07.get(obj);
    }

    public int[] getModelIndexForPosition(int i) {
        boolean A0E = Systrace.A0E(1L);
        if (A0E) {
            C0fO.A01("BaseBinderGroupAdapterCompat.getModelRangeForPosition", 232137195);
        }
        try {
            int[] modelIndex = getModelIndex(getModelForPosition(Object.class, i));
            if (A0E) {
                C0fO.A00(466661947);
            }
            return modelIndex;
        } catch (Throwable th) {
            if (A0E) {
                C0fO.A00(314912094);
            }
            throw th;
        }
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View A01;
        if (this.mUseAsyncListDiffer) {
            C3GF c3gf = (C3GF) this.mDiffer.A02.get(i);
            A01 = c3gf.A04.getView(c3gf.A01, view, viewGroup, c3gf.A05, c3gf.A06);
        } else {
            A01 = this.mBinderGroupCombinator.A01(i, view, viewGroup);
        }
        if (this.mDebugViewBinds || sDebugHeadViewBinds) {
            AnonymousClass303 anonymousClass303 = this.mBinderGroupCombinator;
            boolean z = false;
            if (view == null) {
                z = true;
            }
            WFJ.A01(A01, anonymousClass303, i, z);
        }
        C13490mb c13490mb = C13490mb.A00;
        C13490mb.A00(viewGroup);
        c13490mb.A01(A01, getCount(), i);
        return A01;
    }

    public final int getViewCount() {
        if (this.mUseAsyncListDiffer) {
            return this.mDiffer.A02.size();
        }
        return this.mBinderGroupCombinator.A01;
    }

    public C3D4 getViewLifecycleListener() {
        return this.mViewLifecycleListener;
    }

    @Override // android.widget.Adapter
    public final int getViewTypeCount() {
        return this.mBinderGroupCombinator.A00;
    }

    public final void init(List list) {
        if (this.mBinderGroupCombinator == null) {
            this.mBinderGroupCombinator = new AnonymousClass303(getLithoPrepareHelperCallback(), list);
            return;
        }
        throw new RuntimeException("Multi row adapter should only be initialized once.");
    }

    @Override // android.widget.ListAdapter
    public boolean isEnabled(int i) {
        if (this.mUseAsyncListDiffer) {
            return ((C3GF) this.mDiffer.A02.get(i)).A07;
        }
        return ((C3GA) this.mBinderGroupCombinator.A05.get(i)).A04;
    }

    public final void notifyDataSetChangedSmart(Configuration configuration) {
        if (this.mUseAsyncListDiffer) {
            smartUpdate(configuration);
        } else {
            notifyDataSetChanged();
        }
    }

    @Override // X.C2UU
    public void onBindViewHolder(C3OQ c3oq, int i) {
        QuickPerformanceLogger quickPerformanceLogger;
        String str;
        String str2;
        String str3;
        String viewSubTypeName;
        C13080lu A00 = AbstractC13090lv.A00("BaseBinderGroupAdapterCompat.onBindViewHolder");
        try {
            if (this.mViewLifecycleListener != null) {
                int i2 = c3oq.mItemViewType;
                if (this.mUseAsyncListDiffer) {
                    C3GF c3gf = (C3GF) this.mDiffer.A02.get(i);
                    viewSubTypeName = c3gf.A04.getViewSubTypeName(c3gf.A01, c3gf.A05);
                } else {
                    C3GA c3ga = (C3GA) this.mBinderGroupCombinator.A05.get(i);
                    viewSubTypeName = c3ga.A01.getViewSubTypeName(c3ga.A00, c3ga.A02);
                }
                C3D4 c3d4 = this.mViewLifecycleListener;
                String A02 = this.mBinderGroupCombinator.A02(i2);
                C3D3 c3d3 = (C3D3) c3d4;
                C14360o3.A0B(A02, 1);
                QuickPerformanceLogger quickPerformanceLogger2 = c3d3.A02;
                quickPerformanceLogger2.markerStart(248451991);
                C3D3.A00(c3d3, A02, 248451991, i2);
                quickPerformanceLogger2.markerAnnotate(248451991, "position", i);
                quickPerformanceLogger2.markerAnnotate(248451991, "is_litho_view", false);
                if (viewSubTypeName != null) {
                    quickPerformanceLogger2.markerAnnotate(248451991, "view_subtype", viewSubTypeName);
                }
            }
            Object obj = null;
            if (this.mUseAsyncListDiffer) {
                C3GF c3gf2 = (C3GF) this.mDiffer.A02.get(i);
                obj = c3gf2.A05;
                c3gf2.A04.bindView(c3gf2.A01, c3oq.itemView, obj, c3gf2.A06);
                c3oq.A00 = c3gf2;
            } else {
                AnonymousClass303 anonymousClass303 = this.mBinderGroupCombinator;
                View view = c3oq.itemView;
                C3GA c3ga2 = (C3GA) anonymousClass303.A05.get(i);
                c3ga2.A01.bindView(c3ga2.A00, view, c3ga2.A02, c3ga2.A03);
                c3oq.A01 = (C3GA) this.mBinderGroupCombinator.A05.get(i);
            }
            if (this.mDebugViewBinds || sDebugHeadViewBinds) {
                WFJ.A00(c3oq.itemView, i);
            }
            C3D4 c3d42 = this.mViewLifecycleListener;
            if (c3d42 != null) {
                C3D3 c3d32 = (C3D3) c3d42;
                if (obj instanceof C38321qM) {
                    quickPerformanceLogger = c3d32.A02;
                    C38321qM c38321qM = (C38321qM) obj;
                    if (c38321qM.A6E()) {
                        str3 = "showreel_native_ad";
                    } else if (c38321qM.A6D()) {
                        str3 = "bloks_ad";
                    } else if (c38321qM.CdW()) {
                        str3 = "native_ad";
                    } else {
                        str3 = "not_ad";
                    }
                    quickPerformanceLogger.markerAnnotate(248451991, "ad_type", str3);
                    str = "media_type";
                    if (!c38321qM.Cff() && !c38321qM.A5g()) {
                        if (c38321qM.A5M()) {
                            str2 = "carousel";
                        } else if (c38321qM.A4z()) {
                            str2 = "image_with_music";
                        } else {
                            str2 = "image";
                        }
                    } else {
                        str2 = MediaStreamTrack.VIDEO_TRACK_KIND;
                    }
                } else {
                    quickPerformanceLogger = c3d32.A02;
                    str = "ad_type";
                    str2 = "not_applicable";
                }
                quickPerformanceLogger.markerAnnotate(248451991, str, str2);
                quickPerformanceLogger.markerEnd(248451991, (short) 2);
            }
            C13490mb.A00.A01(c3oq.itemView, getItemCount(), i);
            A00.close();
        } catch (Throwable th) {
            try {
                A00.close();
                throw th;
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [X.3OO, X.3OQ] */
    @Override // X.C2UU
    public final C3OQ onCreateViewHolder(ViewGroup viewGroup, int i) {
        C13080lu A00 = AbstractC13090lv.A00("BaseBinderGroupAdapterCompat.onCreateViewHolder");
        try {
            C3D4 c3d4 = this.mViewLifecycleListener;
            if (c3d4 != null) {
                String A02 = this.mBinderGroupCombinator.A02(i);
                C3D3 c3d3 = (C3D3) c3d4;
                C14360o3.A0B(A02, 1);
                QuickPerformanceLogger quickPerformanceLogger = c3d3.A02;
                quickPerformanceLogger.markerStart(248448614);
                C3D3.A00(c3d3, A02, 248448614, i);
                quickPerformanceLogger.markerAnnotate(248448614, "is_prefetching", c3d3.A00);
                quickPerformanceLogger.markerAnnotate(248448614, "is_litho_view", false);
                quickPerformanceLogger.markerAnnotate(248448614, "ad_type", "not_applicable");
            }
            C13490mb.A00(viewGroup);
            int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
            AnonymousClass303 anonymousClass303 = this.mBinderGroupCombinator;
            InterfaceC65642y0 interfaceC65642y0 = (InterfaceC65642y0) anonymousClass303.A08.floorEntry(Integer.valueOf(i)).getValue();
            ?? c3oo = new C3OO(interfaceC65642y0.createView(i - ((Integer) anonymousClass303.A06.get(interfaceC65642y0)).intValue(), viewGroup));
            if (this.mDebugViewBinds || sDebugHeadViewBinds) {
                View view = c3oo.itemView;
                AnonymousClass303 anonymousClass3032 = this.mBinderGroupCombinator;
                WFJ wfj = new WFJ(view, anonymousClass3032.A02(i), WFJ.A0B);
                if (view.getTag(947501445) != null) {
                    wfj.A01 = true;
                }
                view.setTag(-4848503, wfj);
            }
            C3D4 c3d42 = this.mViewLifecycleListener;
            if (c3d42 != null) {
                ((C3D3) c3d42).A02.markerEnd(248448614, (short) 2);
            }
            A00.close();
            return c3oo;
        } catch (Throwable th) {
            try {
                A00.close();
                throw th;
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                throw th;
            }
        }
    }

    @Override // X.C2UU
    public void onViewAttachedToWindow(C3OQ c3oq) {
        C13080lu A00 = AbstractC13090lv.A00("BaseBinderGroupAdapterCompat.onViewAttachedToWindow");
        try {
            int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
            C3GA c3ga = c3oq.A01;
            C3GF c3gf = c3oq.A00;
            if (c3ga != null) {
                c3ga.A01.onViewAttachedToWindow(c3oq.itemView, c3ga.A00, c3ga.A02, c3ga.A03);
            } else if (c3gf != null) {
                c3gf.A04.onViewAttachedToWindow(c3oq.itemView, c3gf.A01, c3gf.A05, c3gf.A06);
            }
            A00.close();
        } catch (Throwable th) {
            try {
                A00.close();
                throw th;
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                throw th;
            }
        }
    }

    @Override // X.C2UU
    public void onViewDetachedFromWindow(C3OQ c3oq) {
        C13080lu A00 = AbstractC13090lv.A00("BaseBinderGroupAdapterCompat.onViewDetachedFromWindow");
        try {
            int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
            C3GA c3ga = c3oq.A01;
            C3GF c3gf = c3oq.A00;
            if (c3ga != null) {
                c3ga.A01.onViewDetachedFromWindow(c3oq.itemView, c3ga.A00, c3ga.A02, c3ga.A03);
            } else if (c3gf != null) {
                c3gf.A04.onViewDetachedFromWindow(c3oq.itemView, c3gf.A01, c3gf.A05, c3gf.A06);
            }
            A00.close();
        } catch (Throwable th) {
            try {
                A00.close();
                throw th;
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                throw th;
            }
        }
    }

    @Override // X.C2UU
    public void onViewRecycled(C3OQ c3oq) {
        C13080lu A00 = AbstractC13090lv.A00("BaseBinderGroupAdapterCompat.onViewRecycled");
        try {
            int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
            C3GA c3ga = c3oq.A01;
            C3GF c3gf = c3oq.A00;
            if (c3ga != null) {
                c3ga.A01.onViewRecycled(c3oq.itemView, c3ga.A00, c3ga.A02, c3ga.A03);
            } else if (c3gf != null) {
                c3gf.A04.onViewRecycled(c3oq.itemView, c3gf.A01, c3gf.A05, c3gf.A06);
            }
            c3oq.A01 = null;
            c3oq.A00 = null;
            A00.close();
        } catch (Throwable th) {
            try {
                A00.close();
                throw th;
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                throw th;
            }
        }
    }

    public final C3OO prefetchViewHolder(RecyclerView recyclerView, int i) {
        C3D4 c3d4 = this.mViewLifecycleListener;
        if (c3d4 != null) {
            ((C3D3) c3d4).A00 = true;
        }
        C3OO createViewHolder = createViewHolder(recyclerView, i);
        if (c3d4 != null) {
            ((C3D3) c3d4).A00 = false;
        }
        if (this.mDebugViewBinds || sDebugHeadViewBinds) {
            View view = createViewHolder.itemView;
            int i2 = WFJ.A0B;
            if (AbstractC65482xk.A01() || sDebugHeadViewBinds) {
                Object tag = view.getTag(-4848503);
                tag.getClass();
                ((WFJ) tag).A00 = true;
            }
        }
        return createViewHolder;
    }

    public void removeModel(int i) {
        AnonymousClass303 anonymousClass303 = this.mBinderGroupCombinator;
        if (i >= 0) {
            List list = anonymousClass303.A05;
            if (i < list.size()) {
                list.remove(i);
                Map map = anonymousClass303.A07;
                map.remove(map.get(Integer.valueOf(i)));
                int i2 = anonymousClass303.A01;
                if (i2 > 0) {
                    anonymousClass303.A01 = i2 - 1;
                }
            }
        }
    }

    public void setViewLifecycleListener(C3D4 c3d4) {
        this.mViewLifecycleListener = c3d4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
    
        if (X.AbstractC65482xk.A00() != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2US(boolean r3) {
        /*
            r2 = this;
            r2.<init>()
            X.2xc r1 = new X.2xc
            r1.<init>()
            r2.DIFF_CALLBACK = r1
            X.2xe r0 = new X.2xe
            r0.<init>(r1, r2)
            r2.mDiffer = r0
            r2.mUseAsyncListDiffer = r3
            boolean r0 = X.AbstractC65482xk.A00()
            if (r0 != 0) goto L26
            boolean r0 = X.AbstractC65482xk.A01()
            if (r0 != 0) goto L26
            boolean r0 = X.AbstractC65482xk.A00()
            r1 = 0
            if (r0 == 0) goto L27
        L26:
            r1 = 1
        L27:
            r2.mDebugViewBinds = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2US.<init>(boolean):void");
    }

    public String getBinderGroupName(int i) {
        return getBinderGroup(i).getBinderGroupName();
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int i;
        int A03 = C0f9.A03(-677975704);
        if (this.mUseAsyncListDiffer) {
            i = this.mDiffer.A02.size();
        } else {
            i = this.mBinderGroupCombinator.A01;
        }
        C0f9.A0A(619988694, A03);
        return i;
    }

    @Override // X.C2UT, X.C2UU, android.widget.Adapter
    public long getItemId(int i) {
        long itemId;
        int i2;
        int identifier;
        int i3;
        int A03 = C0f9.A03(959863297);
        if (this.mEnableItemIdFromBinderGroup) {
            if (this.mUseAsyncListDiffer) {
                identifier = ((C3GF) this.mDiffer.A02.get(i)).A02;
            } else {
                C3GA c3ga = (C3GA) this.mBinderGroupCombinator.A05.get(i);
                identifier = c3ga.A01.getIdentifier(c3ga.A00, c3ga.A02, c3ga.A03);
            }
            itemId = identifier;
            if (itemId == 2147483647L) {
                if (sEnableStableIdFix) {
                    Object item = getItem(i);
                    if (item != null) {
                        itemId = item.hashCode();
                        i2 = -1400236304;
                    } else {
                        i3 = -566102801;
                    }
                } else {
                    i3 = 49802804;
                }
                C0f9.A0A(i3, A03);
                return -1L;
            }
            i2 = 1689710958;
            if (itemId == -2147483648L) {
                i3 = -232995910;
                C0f9.A0A(i3, A03);
                return -1L;
            }
        } else {
            itemId = super.getItemId(i);
            i2 = -666151236;
        }
        C0f9.A0A(i2, A03);
        return itemId;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        int A00;
        int A03 = C0f9.A03(1955874790);
        if (this.mUseAsyncListDiffer) {
            A00 = ((C3GF) this.mDiffer.A02.get(i)).A00;
        } else {
            A00 = this.mBinderGroupCombinator.A00(i);
        }
        C0f9.A0A(-1746512552, A03);
        return A00;
    }

    public void notifyItemChanged(Object obj) {
        int[] modelIndex = getModelIndex(obj);
        if (modelIndex != null) {
            notifyItemRangeChanged(modelIndex[0], modelIndex[1]);
        }
    }

    public C2US() {
        this(false);
    }

    public final int addModel(Object obj, Object obj2, InterfaceC65642y0 interfaceC65642y0) {
        AnonymousClass303 anonymousClass303 = this.mBinderGroupCombinator;
        int i = anonymousClass303.A01;
        anonymousClass303.A03(interfaceC65642y0, obj, obj2);
        return i;
    }

    public int getBinderGroupViewType(int i, int i2) {
        AnonymousClass303 anonymousClass303 = this.mBinderGroupCombinator;
        return i - ((Number) anonymousClass303.A06.get(getBinderGroup(i2))).intValue();
    }

    public void init(InterfaceC65642y0... interfaceC65642y0Arr) {
        init(Arrays.asList(interfaceC65642y0Arr));
    }

    public final void notifyDataSetChangedSmart() {
        boolean A0E = Systrace.A0E(1L);
        if (A0E) {
            C0fO.A01("notifyDataSetChangedSmart", -508710370);
        }
        if (this.mUseAsyncListDiffer) {
            smartUpdate(null);
        } else {
            notifyDataSetChanged();
        }
        if (A0E) {
            C0fO.A00(1228454668);
        }
    }
}
