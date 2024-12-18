package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import java.util.List;

/* renamed from: X.80T, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C80T {
    public int A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final Context A04;
    public final LinearLayoutManager A05;
    public final C80V A06;
    public final RecyclerView A07;
    public final C66362zD A08;
    public final boolean A09;
    public final InterfaceC191008cw A0A;
    public final C2UY A0B;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.3Fc, X.80a] */
    public C80T(Context context, RecyclerView recyclerView, final TargetViewSizeProvider targetViewSizeProvider, InterfaceC191008cw interfaceC191008cw, boolean z) {
        C14360o3.A0B(context, 1);
        C14360o3.A0B(targetViewSizeProvider, 4);
        this.A04 = context;
        this.A0A = interfaceC191008cw;
        this.A07 = recyclerView;
        C2UY c2uy = C2UY.A01;
        C14360o3.A07(c2uy);
        this.A0B = c2uy;
        this.A09 = AbstractC13620mo.A02(context);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
        this.A05 = linearLayoutManager;
        recyclerView.setLayoutManager(linearLayoutManager);
        C80V c80v = new C80V() { // from class: X.80U
            @Override // X.C80V, X.AbstractC61802rh
            public final int A02(AbstractC70663Fe abstractC70663Fe, int i, int i2) {
                C14360o3.A0B(abstractC70663Fe, 0);
                View A03 = A03(abstractC70663Fe);
                if (A03 == null) {
                    return -1;
                }
                int A0C = AbstractC70663Fe.A0C(A03);
                int max = Math.max(0, A0C - 1);
                int min = Math.min(A0C + 1, abstractC70663Fe.A0U() - 1);
                boolean z2 = this.A09;
                if (i < 0) {
                    if (!z2) {
                        return max;
                    }
                } else if (z2) {
                    return max;
                }
                return min;
            }

            @Override // X.C80V, X.AbstractC61802rh
            public final View A03(AbstractC70663Fe abstractC70663Fe) {
                View A03 = super.A03(abstractC70663Fe);
                if ((abstractC70663Fe instanceof LinearLayoutManager) && A03 != null) {
                    int i = A09(A03, abstractC70663Fe)[0];
                    if (Integer.valueOf(i) != null) {
                        View A0d = abstractC70663Fe.A0d(0);
                        if (A0d != null) {
                            int width = A09(A0d, abstractC70663Fe)[0] + ((((NineSixteenLayoutConfigImpl) targetViewSizeProvider).A0K.getWidth() - A0d.getMeasuredWidth()) / 4);
                            if (Integer.valueOf(width) != null && Math.abs(width) < Math.abs(i)) {
                                return A0d;
                            }
                        }
                        View A0d2 = abstractC70663Fe.A0d(abstractC70663Fe.A0U() - 1);
                        if (A0d2 != null) {
                            int width2 = A09(A0d2, abstractC70663Fe)[0] - ((((NineSixteenLayoutConfigImpl) targetViewSizeProvider).A0K.getWidth() - A0d2.getMeasuredWidth()) / 4);
                            if (Integer.valueOf(width2) != null && Math.abs(width2) < Math.abs(i)) {
                                return A0d2;
                            }
                        }
                    }
                }
                return A03;
            }
        };
        this.A06 = c80v;
        final Integer num = null;
        recyclerView.A0E = null;
        c80v.A07(recyclerView);
        C66392zG A00 = C66362zD.A00(context);
        final C80W c80w = new C80W(this);
        A00.A01(new AbstractC66422zJ(c80w) { // from class: X.80X
            public final C80W A00;

            @Override // X.AbstractC66422zJ
            public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
                C14360o3.A0B(viewGroup, 0);
                C14360o3.A0B(layoutInflater, 1);
                View inflate = layoutInflater.inflate(R.layout.text_tool_attribute_picker_item, viewGroup, false);
                int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
                C14360o3.A0A(inflate);
                inflate.setTag(new C203008yI(inflate));
                Object tag = inflate.getTag();
                C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.text.attribute.TextToolAttributeItemViewBinder.Companion.Holder");
                return (C3OO) tag;
            }

            @Override // X.AbstractC66422zJ
            public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
                int dimensionPixelOffset;
                C80Y c80y = (C80Y) interfaceC66482zP;
                final C203008yI c203008yI = (C203008yI) c3oo;
                C14360o3.A0B(c80y, 0);
                C14360o3.A0B(c203008yI, 1);
                final C80W c80w2 = this.A00;
                C14360o3.A0B(c80w2, 2);
                IgTextView igTextView = c203008yI.A01;
                Context context2 = igTextView.getContext();
                float f = context2.getResources().getDisplayMetrics().density;
                Drawable drawable = c80y.A01;
                int i = -16777216;
                IgSimpleImageView igSimpleImageView = c203008yI.A00;
                if (drawable != null) {
                    igSimpleImageView.setImageDrawable(drawable);
                    int i2 = -1;
                    if (c80y.A07) {
                        i2 = -16777216;
                    }
                    igSimpleImageView.setColorFilter(i2);
                    ViewGroup.LayoutParams layoutParams = igSimpleImageView.getLayoutParams();
                    C14360o3.A0C(layoutParams, AbstractC111324zv.A00(0));
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    if (c80y.A06.length() == 0) {
                        dimensionPixelOffset = 0;
                    } else {
                        dimensionPixelOffset = igSimpleImageView.getContext().getResources().getDimensionPixelOffset(R.dimen.abc_button_inset_vertical_material);
                    }
                    marginLayoutParams.setMarginEnd(dimensionPixelOffset);
                    igSimpleImageView.setLayoutParams(marginLayoutParams);
                } else {
                    igSimpleImageView.setVisibility(8);
                }
                String str = c80y.A06;
                igTextView.setText(str);
                Typeface typeface = c80y.A00;
                if (typeface == null) {
                    C14360o3.A07(context2);
                    typeface = AbstractC15960qq.A00(context2).A02(EnumC15950qp.A0Y);
                }
                igTextView.setTypeface(typeface);
                Float f2 = c80y.A03;
                if (f2 != null) {
                    igTextView.setTextSize(1, f2.floatValue());
                }
                Float f3 = c80y.A02;
                if (f3 != null) {
                    igTextView.setTranslationX(f3.floatValue() * f);
                }
                Float f4 = c80y.A04;
                if (f4 != null) {
                    igTextView.setTranslationY(f * f4.floatValue());
                }
                boolean z2 = c80y.A07;
                if (!z2) {
                    i = -1;
                }
                igTextView.setTextColor(i);
                View view = c203008yI.itemView;
                view.setContentDescription(c80y.A05);
                int i3 = R.drawable.text_tool_attribute_picker_item_background_unselected;
                if (z2) {
                    i3 = R.drawable.text_tool_attribute_picker_item_background_selected;
                }
                view.setBackgroundResource(i3);
                C0fQ.A00(new View.OnClickListener() { // from class: X.8yJ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int A05 = C0f9.A05(1439572672);
                        C80W c80w3 = c80w2;
                        int layoutPosition = c203008yI.getLayoutPosition();
                        C80T c80t = c80w3.A00;
                        LinearLayoutManager linearLayoutManager2 = c80t.A05;
                        View A0d = linearLayoutManager2.A0d(layoutPosition);
                        if (A0d != null) {
                            int[] A09 = c80t.A06.A09(A0d, linearLayoutManager2);
                            c80t.A03 = true;
                            C80T.A01(c80t, layoutPosition, true, true);
                            c80t.A07.A0t(A09[0], A09[1]);
                        }
                        C0f9.A0C(293295106, A05);
                    }
                }, view);
                Context context3 = view.getContext();
                int dimensionPixelOffset2 = context3.getResources().getDimensionPixelOffset(R.dimen.abc_button_inset_vertical_material);
                Resources resources = context3.getResources();
                int length = str.length();
                int i4 = R.dimen.action_bar_item_spacing_right;
                if (length == 0) {
                    i4 = R.dimen.abc_edit_text_inset_top_material;
                }
                int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i4);
                view.setPadding(dimensionPixelOffset3, dimensionPixelOffset2, dimensionPixelOffset3, dimensionPixelOffset2);
                AbstractC56952jT.A04(c203008yI.itemView, C05F.A01);
            }

            @Override // X.AbstractC66422zJ
            public final Class modelClass() {
                return C80Y.class;
            }

            {
                this.A00 = c80w;
            }
        });
        C66362zD A002 = A00.A00();
        this.A08 = A002;
        recyclerView.setAdapter(A002);
        recyclerView.A14(new C1I4() { // from class: X.80Z
            @Override // X.C1I4
            public final void onScrollStateChanged(RecyclerView recyclerView2, int i) {
                int i2;
                View A03;
                int A032 = C0f9.A03(-275464653);
                C80T c80t = C80T.this;
                if (!c80t.A01) {
                    i2 = 1362328946;
                } else {
                    if (i == 0) {
                        if (!c80t.A03 && (A03 = c80t.A06.A03(c80t.A05)) != null) {
                            C80T.A01(c80t, AbstractC70663Fe.A0C(A03), true, true);
                        }
                        c80t.A03 = false;
                        c80t.A02 = false;
                    }
                    i2 = 815833933;
                }
                C0f9.A0A(i2, A032);
            }

            @Override // X.C1I4
            public final void onScrolled(RecyclerView recyclerView2, int i, int i2) {
                int i3;
                int A03 = C0f9.A03(566223238);
                C14360o3.A0B(recyclerView2, 0);
                C80T c80t = C80T.this;
                if (!c80t.A01) {
                    i3 = -877138863;
                } else {
                    if (!c80t.A03 && recyclerView2.getScrollState() == 1) {
                        c80t.A02 = true;
                        View A032 = c80t.A06.A03(c80t.A05);
                        if (A032 != null) {
                            C80T.A01(c80t, AbstractC70663Fe.A0C(A032), false, true);
                        }
                    }
                    i3 = 1850435237;
                }
                C0f9.A0A(i3, A03);
            }
        });
        if (z) {
            Context context2 = this.A04;
            num = Integer.valueOf((context2.getResources().getDimensionPixelOffset(R.dimen.abc_edit_text_inset_top_material) * 2) + context2.getResources().getDimensionPixelOffset(R.dimen.abc_select_dialog_padding_start_material));
        }
        final int width = ((NineSixteenLayoutConfigImpl) targetViewSizeProvider).A0K.getWidth();
        final ?? r1 = new AbstractC70653Fc(this) { // from class: X.80a
            public final /* synthetic */ C80T A01;

            /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
            
                r5.right = r1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
            
                r5.left = r1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
            
                if (r4.A01.A09 != false) goto L19;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
            
                if (r4.A01.A09 != false) goto L11;
             */
            @Override // X.AbstractC70653Fc
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void getItemOffsets(android.graphics.Rect r5, android.view.View r6, androidx.recyclerview.widget.RecyclerView r7, X.C3F5 r8) {
                /*
                    r4 = this;
                    r0 = 0
                    X.C14360o3.A0B(r5, r0)
                    r3 = 1
                    X.C14360o3.A0B(r6, r3)
                    r0 = 2
                    X.C14360o3.A0B(r7, r0)
                    r0 = 3
                    X.C14360o3.A0B(r8, r0)
                    super.getItemOffsets(r5, r6, r7, r8)
                    int r2 = androidx.recyclerview.widget.RecyclerView.A02(r6)
                    if (r2 != 0) goto L45
                    java.lang.Integer r0 = r2
                    if (r0 == 0) goto L45
                    int r1 = r0.intValue()
                L21:
                    int r0 = r3
                    int r0 = r0 - r1
                    int r1 = r0 / 2
                    if (r2 != 0) goto L31
                    X.80T r0 = r4.A01
                    boolean r0 = r0.A09
                    if (r0 == 0) goto L42
                L2e:
                    r5.right = r1
                L30:
                    return
                L31:
                    X.2UU r0 = r7.A0A
                    if (r0 == 0) goto L30
                    int r0 = r0.getItemCount()
                    int r0 = r0 - r3
                    if (r2 != r0) goto L30
                    X.80T r0 = r4.A01
                    boolean r0 = r0.A09
                    if (r0 == 0) goto L2e
                L42:
                    r5.left = r1
                    return
                L45:
                    int r1 = r6.getMeasuredWidth()
                    goto L21
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1807280a.getItemOffsets(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, X.3F5):void");
            }

            {
                this.A01 = this;
            }
        };
        if (num != null) {
            recyclerView.A10(r1);
            A01(this, this.A00, true, false);
            A00(this);
        } else if (recyclerView.isLaidOut() && !recyclerView.isLayoutRequested()) {
            this.A07.A10(r1);
            if (!this.A01) {
                AbstractC13880nE.A0u(this.A07, new CallableC203028yK(this));
            }
        } else {
            recyclerView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.8y0
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    view.removeOnLayoutChangeListener(this);
                    C80T c80t = this;
                    RecyclerView recyclerView2 = c80t.A07;
                    recyclerView2.A10(r1);
                    if (!c80t.A01) {
                        AbstractC13880nE.A0u(recyclerView2, new CallableC203028yK(c80t));
                    }
                    c80t.A01 = true;
                }
            });
            return;
        }
        this.A01 = true;
    }

    public static final void A00(final C80T c80t) {
        int i;
        RecyclerView recyclerView = c80t.A07;
        recyclerView.A0h();
        if (recyclerView.isLaidOut() && !recyclerView.isLayoutRequested()) {
            int i2 = -1;
            while (true) {
                int i3 = c80t.A00;
                if (i2 < i3) {
                    LinearLayoutManager linearLayoutManager = c80t.A05;
                    if (linearLayoutManager.A0d(i3) == null) {
                        i = linearLayoutManager.A1b();
                        if (i <= i2) {
                            return;
                        }
                    } else {
                        i = c80t.A00;
                    }
                    i2 = i;
                    View A0d = linearLayoutManager.A0d(i);
                    if (A0d != null) {
                        int[] A09 = c80t.A06.A09(A0d, linearLayoutManager);
                        recyclerView.scrollBy(A09[0], A09[1]);
                    }
                } else {
                    return;
                }
            }
        } else {
            recyclerView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.80b
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
                    int i12;
                    view.removeOnLayoutChangeListener(this);
                    int i13 = -1;
                    while (true) {
                        C80T c80t2 = C80T.this;
                        int i14 = c80t2.A00;
                        if (i13 < i14) {
                            LinearLayoutManager linearLayoutManager2 = c80t2.A05;
                            if (linearLayoutManager2.A0d(i14) == null) {
                                i12 = linearLayoutManager2.A1b();
                                if (i12 <= i13) {
                                    return;
                                }
                            } else {
                                i12 = c80t2.A00;
                            }
                            i13 = i12;
                            View A0d2 = linearLayoutManager2.A0d(i12);
                            if (A0d2 != null) {
                                int[] A092 = c80t2.A06.A09(A0d2, linearLayoutManager2);
                                c80t2.A07.scrollBy(A092[0], A092[1]);
                            }
                        } else {
                            return;
                        }
                    }
                }
            });
        }
    }

    public static final void A01(C80T c80t, int i, boolean z, boolean z2) {
        int i2 = c80t.A00;
        if (i2 == i && !c80t.A02) {
            return;
        }
        if (z2 && i2 != i) {
            c80t.A0B.A05(10L);
        }
        c80t.A00 = i;
        C66362zD c66362zD = c80t.A08;
        List AuX = c66362zD.A04.AuX();
        C14360o3.A07(AuX);
        ViewModelListUpdate viewModelListUpdate = new ViewModelListUpdate();
        int size = AuX.size();
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = AuX.get(i3);
            C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.text.attribute.TextToolAttributeItemViewModel");
            C80Y c80y = (C80Y) obj;
            String str = c80y.A06;
            String str2 = c80y.A05;
            Drawable drawable = c80y.A01;
            Typeface typeface = c80y.A00;
            Float f = c80y.A03;
            Float f2 = c80y.A02;
            Float f3 = c80y.A04;
            boolean z3 = false;
            if (i3 == c80t.A00) {
                z3 = true;
            }
            viewModelListUpdate.A00(new C80Y(typeface, drawable, f, f2, f3, str, str2, z3));
        }
        c66362zD.A05(viewModelListUpdate);
        c66362zD.notifyDataSetChanged();
        c80t.A0A.DNo(c80t.A00, z);
    }
}
