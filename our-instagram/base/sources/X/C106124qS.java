package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.ComponentsSystrace;
import com.facebook.litho.LithoView;
import java.util.List;

/* renamed from: X.4qS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C106124qS extends C2UU {
    public final /* synthetic */ C2Z5 A00;

    public C106124qS(C2Z5 c2z5) {
        this.A00 = c2z5;
        setHasStableIds(c2z5.A0V.hasStableIds());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, X.2Vj] */
    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        int i2;
        String str;
        int i3;
        int i4;
        int i5;
        int i6;
        AbstractC170917ji abstractC170917ji = (AbstractC170917ji) c3oo;
        C2Z5 c2z5 = this.A00;
        int i7 = i;
        if (c2z5.A0o) {
            i7 = i % c2z5.A0i.size();
        }
        C124005jE c124005jE = (C124005jE) c2z5.A0i.get(i7);
        InterfaceC170717jO A02 = c124005jE.A02();
        if (A02.EGw()) {
            LithoView A00 = abstractC170917ji.A00();
            int A01 = C2Z5.A01(c2z5.A0A, c124005jE, c2z5, c2z5.A06);
            int A002 = C2Z5.A00(c2z5.A0A, c124005jE, c2z5, c2z5.A05);
            if (!c124005jE.A0A(A01, A002)) {
                if (C2V3.computeRangeOnSyncLayout && (i5 = c2z5.A01) != -1 && (i6 = c2z5.A02) != -1) {
                    int i8 = i6 - i5;
                    if (i > i6) {
                        C2Z5.A0P(c2z5, InterfaceC170617jE.A01, i, i8 + i);
                    } else if (i < i5) {
                        C2Z5.A0P(c2z5, InterfaceC170617jE.A00, i - i8, i);
                    }
                }
                c124005jE.A07(c2z5.A0R, new Object(), A01, A002);
            }
            boolean z = false;
            if (c2z5.A0T.Bqz() == 1) {
                z = true;
            }
            if (View.MeasureSpec.getMode(A01) == 1073741824) {
                i3 = View.MeasureSpec.getSize(A01);
            } else {
                i3 = -2;
                if (z) {
                    i3 = -1;
                }
            }
            if (View.MeasureSpec.getMode(A002) == 1073741824) {
                i4 = View.MeasureSpec.getSize(A002);
            } else {
                i4 = -1;
                if (z) {
                    i4 = -2;
                }
            }
            abstractC170917ji.A01(A00, i3, i4, A01, A002, A02.CVF());
            A00.A0l(c124005jE.A01(), true);
            if (c124005jE.A02().BmZ() != null && c124005jE.A0D.get() == 0) {
                A00.A02 = new C9II(A00, this, abstractC170917ji);
            }
            c2z5.A0V.CzV(c124005jE.A01(), abstractC170917ji, A02, i7);
            if (c2z5.A0p) {
                ComponentTree A012 = c124005jE.A01();
                Rect rect = C2Z5.A19;
                C14360o3.A0B(A012, 0);
                LithoView lithoView = A012.A07;
                if (lithoView != null) {
                    lithoView.A0c(rect, false);
                    return;
                }
                return;
            }
            return;
        }
        if (!(abstractC170917ji instanceof C169737hn)) {
            return;
        }
        C169737hn c169737hn = (C169737hn) abstractC170917ji;
        int i9 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        if (c169737hn.A01) {
            return;
        }
        C27921CSg CFk = A02.CFk();
        c169737hn.A00 = CFk;
        View view = c169737hn.itemView;
        C14360o3.A0B(view, 0);
        C62a c62a = CFk.A04;
        int En5 = C2UL.A00.En5(c62a.A01().ordinal());
        Object tag = view.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type H of instagram.features.clips.viewer.adapter.ClipsItemLithoViewBinder");
        AbstractC66422zJ abstractC66422zJ = CFk.A01;
        abstractC66422zJ.bind(c62a, (C3OO) tag);
        C13490mb c13490mb = C13490mb.A00;
        C2Z5 c2z52 = CFk.A03.A00.A00;
        if (c2z52 != null) {
            i2 = c2z52.getItemCount();
        } else {
            i2 = 0;
        }
        c13490mb.A01(view, i2, CFk.A00);
        String name = abstractC66422zJ.getClass().getName();
        C14360o3.A07(name);
        C2UL.A00.ASR(AbstractC154506x0.A00(abstractC66422zJ, c62a, name, false, false), En5);
        if (!C18U.A06(C06090Tz.A05, CFk.A02, 36312861865870677L)) {
            return;
        }
        C120985dq c120985dq = c62a.A00;
        C0f5 AEp = C18950wb.A01.AEp("ClipsItemLithoViewBinder", 817904698);
        AEp.ABW("ClipsItemType", c120985dq.A01.name());
        EnumC40111tc enumC40111tc = c120985dq.A0J;
        String str2 = "N/A";
        if (enumC40111tc == null || (str = enumC40111tc.name()) == null) {
            str = "N/A";
        }
        AEp.ABW("MediaType", str);
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            str2 = c38321qM.BqK();
        }
        AEp.ABW("MediaId", str2);
        AEp.ABW("ClipsItemSource", AbstractC37799GkE.A00(c120985dq.A03));
        AEp.report();
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        String canonicalName;
        C2Z5 c2z5 = this.A00;
        C170907jh c170907jh = (C170907jh) c2z5.A0X.A02.get(i);
        if (c170907jh != null) {
            if (viewGroup != null) {
                C13490mb.A00(viewGroup);
                int EnB = C2UL.A00.EnB(c170907jh.A02.A01().ordinal());
                AbstractC1337162c abstractC1337162c = c170907jh.A01;
                C3OO createViewHolder = abstractC1337162c.createViewHolder(viewGroup, c170907jh.A00);
                createViewHolder.itemView.setTag(createViewHolder);
                String name = abstractC1337162c.getClass().getName();
                C14360o3.A07(name);
                C2UL.A00.ASU(AbstractC154506x0.A00(abstractC1337162c, null, name, false, false), EnB);
                View view = createViewHolder.itemView;
                C14360o3.A06(view);
                try {
                    return new C169737hn(view, false);
                } catch (IllegalArgumentException e) {
                    Class<?> cls = c170907jh.getClass();
                    Class<?> enclosingClass = cls.getEnclosingClass();
                    if (enclosingClass == null) {
                        canonicalName = cls.getCanonicalName();
                    } else {
                        canonicalName = enclosingClass.getCanonicalName();
                    }
                    throw new IllegalArgumentException(AnonymousClass001.A0R("createView() may not return null from :", canonicalName), e);
                }
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        return c2z5.A0V.D8W(viewGroup, i);
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onViewRecycled(C3OO c3oo) {
        C27921CSg c27921CSg;
        AbstractC170917ji abstractC170917ji = (AbstractC170917ji) c3oo;
        boolean isTracing = ComponentsSystrace.A00.isTracing();
        if (isTracing) {
            ComponentsSystrace.A02("RecyclerBinder.InternalAdapter#onViewRecycledInternal");
        }
        LithoView A00 = abstractC170917ji.A00();
        if (A00 != null) {
            this.A00.A0V.E0s(abstractC170917ji);
            A00.A0X();
            A00.A0l(null, true);
        } else if (abstractC170917ji instanceof C169737hn) {
            C169737hn c169737hn = (C169737hn) abstractC170917ji;
            if (!c169737hn.A01 && (c27921CSg = c169737hn.A00) != null) {
                View view = c169737hn.itemView;
                C14360o3.A0B(view, 0);
                Object tag = view.getTag();
                C14360o3.A0C(tag, "null cannot be cast to non-null type H of instagram.features.clips.viewer.adapter.ClipsItemLithoViewBinder");
                c27921CSg.A01.unbind((C3OO) tag);
                c169737hn.A00 = null;
            }
        }
        if (isTracing) {
            ComponentsSystrace.A01();
        }
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-262077616);
        C2Z5 c2z5 = this.A00;
        int size = c2z5.A0i.size();
        if (c2z5.A0o && size > 0) {
            size = Integer.MAX_VALUE;
        }
        C0f9.A0A(1274636959, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final long getItemId(int i) {
        long itemId;
        int A03 = C0f9.A03(-1992329452);
        C2Z5 c2z5 = this.A00;
        if (c2z5.A0l) {
            itemId = c2z5.A0V.getItemId(i);
        } else {
            itemId = super.getItemId(i);
        }
        C0f9.A0A(712963406, A03);
        return itemId;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        int CFw;
        int i2;
        int A03 = C0f9.A03(101518395);
        C2Z5 c2z5 = this.A00;
        List list = c2z5.A0i;
        if (c2z5.A0o) {
            i %= list.size();
        }
        InterfaceC170717jO A02 = ((C124005jE) list.get(i)).A02();
        if (A02.EGw()) {
            CFw = c2z5.A0X.A01;
            i2 = 410368958;
        } else {
            CFw = A02.CFw();
            i2 = 1302438175;
        }
        C0f9.A0A(i2, A03);
        return CFw;
    }
}
