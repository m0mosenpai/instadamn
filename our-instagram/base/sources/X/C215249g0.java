package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.9g0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C215249g0 extends C2US implements InterfaceC65242xM, InterfaceC152956uP {
    public C65662y2 A00;
    public List A01;
    public C215269g2 A02;
    public KER A03;
    public C215279g3 A04;
    public C215279g3 A05;
    public final Context A06;
    public final C65662y2 A07;
    public final UserSession A08;
    public final C1810981l A09;
    public final C8NZ A0A;
    public final C172597mT A0B;
    public final C26955Buw A0C;
    public final C26956Bux A0D;
    public final List A0E;
    public final List A0F;
    public final C172587mS A0G;
    public final C172577mR A0H;
    public final C215289g4 A0I;
    public final Map A0J;
    public final boolean A0K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v10, types: [X.9g3] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.9g2] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.9g3] */
    /* JADX WARN: Type inference failed for: r12v1, types: [X.Buw, java.lang.Object, X.2y0] */
    /* JADX WARN: Type inference failed for: r13v1, types: [X.Bux, java.lang.Object, X.2y0] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.2y2, java.lang.Object, X.2y0] */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.2y2, java.lang.Object] */
    public C215249g0(final Context context, InterfaceC11380iw interfaceC11380iw, final UserSession userSession, C1810981l c1810981l, final C8NZ c8nz, int i, boolean z) {
        super(false);
        final boolean z2 = true;
        final boolean z3 = false;
        this.A06 = context;
        this.A08 = userSession;
        this.A0A = c8nz;
        this.A0K = z;
        this.A09 = c1810981l;
        C215289g4 c215289g4 = new C215289g4(interfaceC11380iw, userSession, c8nz, 6, i);
        this.A0I = c215289g4;
        C172577mR c172577mR = new C172577mR(userSession, c1810981l, c8nz, false);
        this.A0H = c172577mR;
        C172587mS c172587mS = new C172587mS(userSession, c1810981l, c8nz);
        this.A0G = c172587mS;
        C172597mT c172597mT = new C172597mT(userSession, c8nz, false);
        this.A0B = c172597mT;
        ?? obj = new Object();
        this.A0C = obj;
        ?? obj2 = new Object();
        obj2.A03 = AbstractC167017dG.A0E(context);
        this.A07 = obj2;
        ?? obj3 = new Object();
        this.A0D = obj3;
        this.A0E = AbstractC166987dD.A1E();
        this.A0F = AbstractC166987dD.A1E();
        this.A0J = AbstractC166987dD.A1G();
        this.A01 = C16930sl.A00;
        this.A03 = new KER(context, c8nz);
        this.A02 = new AbstractC65632xz(userSession, c8nz) { // from class: X.9g2
            public final int A00 = 3;
            public final UserSession A01;
            public final InterfaceC186078Nb A02;

            {
                this.A01 = userSession;
                this.A02 = c8nz;
            }

            @Override // X.InterfaceC65642y0
            public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj4, Object obj5) {
                C14360o3.A0B(anonymousClass306, 0);
                anonymousClass306.A7a(0);
            }

            @Override // X.InterfaceC65642y0
            public final int getViewTypeCount() {
                return 1;
            }

            @Override // X.InterfaceC65642y0
            public final void bindView(int i2, View view, Object obj4, Object obj5) {
                int A03 = C0f9.A03(-1289497599);
                C14360o3.A0B(view, 1);
                C2UU c2uu = ((RecyclerView) view).A0A;
                C14360o3.A0C(c2uu, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.HorizontalScrollingStickerAdapter");
                C9UH c9uh = (C9UH) c2uu;
                C14360o3.A0C(obj4, "null cannot be cast to non-null type kotlin.collections.List<com.instagram.creation.capture.assetpicker.model.StaticSticker>");
                Collection collection = (Collection) obj4;
                C14360o3.A0B(collection, 0);
                List list = c9uh.A00;
                list.clear();
                list.addAll(collection);
                c9uh.notifyDataSetChanged();
                C0f9.A0A(182795031, A03);
            }

            @Override // X.InterfaceC65642y0
            public final View createView(int i2, ViewGroup viewGroup) {
                int A03 = C0f9.A03(-820604114);
                C14360o3.A0B(viewGroup, 1);
                Context context2 = viewGroup.getContext();
                RecyclerView recyclerView = new RecyclerView(context2, null);
                int A0D = AbstractC167017dG.A0D(context2);
                int dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.ad_stories_more_info_footer_width) / this.A00;
                recyclerView.setAdapter(new C9UH(this.A01, this.A02));
                recyclerView.setLayoutManager(new LinearLayoutManager(context2, 0, false));
                AbstractC13880nE.A0l(recyclerView, 0, A0D, 0, A0D);
                recyclerView.A10(new C3YB(dimensionPixelSize, (-dimensionPixelSize) / 2));
                C0f9.A0A(607694201, A03);
                return recyclerView;
            }
        };
        this.A04 = new AbstractC65632xz(context, userSession, c8nz, z3) { // from class: X.9g3
            public final Context A00;
            public final UserSession A01;
            public final InterfaceC186078Nb A02;
            public final boolean A03;

            @Override // X.InterfaceC65642y0
            public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj4, Object obj5) {
                C14360o3.A0B(anonymousClass306, 0);
                anonymousClass306.A7a(0);
            }

            @Override // X.InterfaceC65642y0
            public final int getViewTypeCount() {
                return 1;
            }

            @Override // X.InterfaceC65642y0
            public final void bindView(int i2, View view, Object obj4, Object obj5) {
                int A03 = C0f9.A03(-59345855);
                int A06 = AbstractC167007dF.A06(1, view, obj4);
                Object tag = view.getTag();
                C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.StickerWithContentViewBinder.Holder");
                AAE aae = (AAE) tag;
                boolean z4 = this.A03;
                UserSession userSession2 = this.A01;
                MUD mud = (MUD) obj4;
                InterfaceC186078Nb interfaceC186078Nb = this.A02;
                AbstractC167007dF.A1K(userSession2, aae);
                AbstractC167007dF.A1E(mud, A06, interfaceC186078Nb);
                ADR.A00(mud, userSession2);
                View view2 = aae.A03;
                if (z4) {
                    Object tag2 = view2.getTag();
                    C14360o3.A0C(tag2, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.StickerSheetRedesignItemViewBinder.Holder");
                    C210979Uu c210979Uu = (C210979Uu) tag2;
                    C14360o3.A0B(c210979Uu, 0);
                    c210979Uu.A03.A02();
                    c210979Uu.A00 = null;
                    c210979Uu.A01.setVisibility(8);
                    ADR.A01(aae);
                    C148276lx c148276lx = (C148276lx) mud.A00;
                    ADQ.A00(userSession2, interfaceC186078Nb, c210979Uu, c148276lx, AbstractC167007dF.A0d(), 359.0f);
                    aae.A02 = c148276lx;
                    aae.A01 = c210979Uu.A00;
                    view2.setVisibility(0);
                    TextView textView = aae.A05;
                    textView.setVisibility(0);
                    textView.setText(mud.A02);
                    textView.setGravity(17);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = textView.getResources().getDimensionPixelSize(R.dimen.action_bar_item_spacing_right);
                    textView.setLayoutParams(layoutParams);
                    TextView textView2 = aae.A04;
                    textView2.setVisibility(0);
                    textView2.setText(mud.A01);
                    textView2.setGravity(17);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    Resources resources = textView2.getResources();
                    int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_alert_dialog_button_dimen);
                    layoutParams2.setMarginStart(dimensionPixelSize);
                    layoutParams2.setMarginEnd(dimensionPixelSize);
                    ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = resources.getDimensionPixelSize(R.dimen.action_bar_item_spacing_right);
                    textView2.setLayoutParams(layoutParams2);
                    AnonymousClass229.A01(userSession2).A1k(null, c148276lx.A0Z, AHR.A02(c148276lx, false), AHR.A00(c148276lx));
                } else {
                    Object tag3 = view2.getTag();
                    C14360o3.A0C(tag3, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.StickerSheetItemViewBinder.Holder");
                    C210959Us c210959Us = (C210959Us) tag3;
                    RectF rectF = ALo.A01;
                    C14360o3.A0B(c210959Us, 0);
                    c210959Us.A02.A02();
                    c210959Us.A00 = null;
                    c210959Us.A03.setVisibility(4);
                    ADR.A01(aae);
                    C148276lx c148276lx2 = (C148276lx) mud.A00;
                    ALo.A02(userSession2, null, interfaceC186078Nb, c210959Us, c148276lx2, AbstractC167007dF.A0d());
                    aae.A02 = c148276lx2;
                    aae.A00 = c210959Us.A00;
                    view2.setVisibility(0);
                    TextView textView3 = aae.A05;
                    textView3.setVisibility(0);
                    textView3.setText(mud.A02);
                    TextView textView4 = aae.A04;
                    textView4.setVisibility(0);
                    textView4.setText(mud.A01);
                    AnonymousClass229.A01(userSession2).A1k(null, c148276lx2.A0Z, AHR.A02(c148276lx2, false), AHR.A00(c148276lx2));
                }
                C0f9.A0A(393702720, A03);
            }

            {
                this.A00 = context;
                this.A01 = userSession;
                this.A02 = c8nz;
                this.A03 = z3;
            }

            @Override // X.InterfaceC65642y0
            public final View createView(int i2, ViewGroup viewGroup) {
                int A03 = C0f9.A03(-576805549);
                C14360o3.A0B(viewGroup, 1);
                Context context2 = this.A00;
                UserSession userSession2 = this.A01;
                boolean z4 = this.A03;
                AbstractC167007dF.A1D(context2, 0, userSession2);
                LayoutInflater from = LayoutInflater.from(context2);
                int i3 = R.layout.layout_asset_picker_section_sticker_with_content_horizontal;
                if (z4) {
                    i3 = R.layout.layout_asset_picker_section_sticker_with_content_vertical;
                }
                View inflate = from.inflate(i3, viewGroup, false);
                C14360o3.A0A(inflate);
                AAE aae = new AAE(inflate, viewGroup, z4);
                ((ViewGroup) inflate.requireViewById(R.id.sticker_placeholder)).addView(aae.A03);
                inflate.setTag(aae);
                C0f9.A0A(-168658130, A03);
                return inflate;
            }
        };
        this.A05 = new AbstractC65632xz(context, userSession, c8nz, z2) { // from class: X.9g3
            public final Context A00;
            public final UserSession A01;
            public final InterfaceC186078Nb A02;
            public final boolean A03;

            @Override // X.InterfaceC65642y0
            public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj4, Object obj5) {
                C14360o3.A0B(anonymousClass306, 0);
                anonymousClass306.A7a(0);
            }

            @Override // X.InterfaceC65642y0
            public final int getViewTypeCount() {
                return 1;
            }

            @Override // X.InterfaceC65642y0
            public final void bindView(int i2, View view, Object obj4, Object obj5) {
                int A03 = C0f9.A03(-59345855);
                int A06 = AbstractC167007dF.A06(1, view, obj4);
                Object tag = view.getTag();
                C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.StickerWithContentViewBinder.Holder");
                AAE aae = (AAE) tag;
                boolean z4 = this.A03;
                UserSession userSession2 = this.A01;
                MUD mud = (MUD) obj4;
                InterfaceC186078Nb interfaceC186078Nb = this.A02;
                AbstractC167007dF.A1K(userSession2, aae);
                AbstractC167007dF.A1E(mud, A06, interfaceC186078Nb);
                ADR.A00(mud, userSession2);
                View view2 = aae.A03;
                if (z4) {
                    Object tag2 = view2.getTag();
                    C14360o3.A0C(tag2, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.StickerSheetRedesignItemViewBinder.Holder");
                    C210979Uu c210979Uu = (C210979Uu) tag2;
                    C14360o3.A0B(c210979Uu, 0);
                    c210979Uu.A03.A02();
                    c210979Uu.A00 = null;
                    c210979Uu.A01.setVisibility(8);
                    ADR.A01(aae);
                    C148276lx c148276lx = (C148276lx) mud.A00;
                    ADQ.A00(userSession2, interfaceC186078Nb, c210979Uu, c148276lx, AbstractC167007dF.A0d(), 359.0f);
                    aae.A02 = c148276lx;
                    aae.A01 = c210979Uu.A00;
                    view2.setVisibility(0);
                    TextView textView = aae.A05;
                    textView.setVisibility(0);
                    textView.setText(mud.A02);
                    textView.setGravity(17);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = textView.getResources().getDimensionPixelSize(R.dimen.action_bar_item_spacing_right);
                    textView.setLayoutParams(layoutParams);
                    TextView textView2 = aae.A04;
                    textView2.setVisibility(0);
                    textView2.setText(mud.A01);
                    textView2.setGravity(17);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    Resources resources = textView2.getResources();
                    int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_alert_dialog_button_dimen);
                    layoutParams2.setMarginStart(dimensionPixelSize);
                    layoutParams2.setMarginEnd(dimensionPixelSize);
                    ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = resources.getDimensionPixelSize(R.dimen.action_bar_item_spacing_right);
                    textView2.setLayoutParams(layoutParams2);
                    AnonymousClass229.A01(userSession2).A1k(null, c148276lx.A0Z, AHR.A02(c148276lx, false), AHR.A00(c148276lx));
                } else {
                    Object tag3 = view2.getTag();
                    C14360o3.A0C(tag3, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.StickerSheetItemViewBinder.Holder");
                    C210959Us c210959Us = (C210959Us) tag3;
                    RectF rectF = ALo.A01;
                    C14360o3.A0B(c210959Us, 0);
                    c210959Us.A02.A02();
                    c210959Us.A00 = null;
                    c210959Us.A03.setVisibility(4);
                    ADR.A01(aae);
                    C148276lx c148276lx2 = (C148276lx) mud.A00;
                    ALo.A02(userSession2, null, interfaceC186078Nb, c210959Us, c148276lx2, AbstractC167007dF.A0d());
                    aae.A02 = c148276lx2;
                    aae.A00 = c210959Us.A00;
                    view2.setVisibility(0);
                    TextView textView3 = aae.A05;
                    textView3.setVisibility(0);
                    textView3.setText(mud.A02);
                    TextView textView4 = aae.A04;
                    textView4.setVisibility(0);
                    textView4.setText(mud.A01);
                    AnonymousClass229.A01(userSession2).A1k(null, c148276lx2.A0Z, AHR.A02(c148276lx2, false), AHR.A00(c148276lx2));
                }
                C0f9.A0A(393702720, A03);
            }

            {
                this.A00 = context;
                this.A01 = userSession;
                this.A02 = c8nz;
                this.A03 = z2;
            }

            @Override // X.InterfaceC65642y0
            public final View createView(int i2, ViewGroup viewGroup) {
                int A03 = C0f9.A03(-576805549);
                C14360o3.A0B(viewGroup, 1);
                Context context2 = this.A00;
                UserSession userSession2 = this.A01;
                boolean z4 = this.A03;
                AbstractC167007dF.A1D(context2, 0, userSession2);
                LayoutInflater from = LayoutInflater.from(context2);
                int i3 = R.layout.layout_asset_picker_section_sticker_with_content_horizontal;
                if (z4) {
                    i3 = R.layout.layout_asset_picker_section_sticker_with_content_vertical;
                }
                View inflate = from.inflate(i3, viewGroup, false);
                C14360o3.A0A(inflate);
                AAE aae = new AAE(inflate, viewGroup, z4);
                ((ViewGroup) inflate.requireViewById(R.id.sticker_placeholder)).addView(aae.A03);
                inflate.setTag(aae);
                C0f9.A0A(-168658130, A03);
                return inflate;
            }
        };
        ?? obj4 = new Object();
        this.A00 = obj4;
        obj4.A01 = R.color.grey_2_30_transparent;
        obj4.A04 = true;
        obj4.A02 = context.getResources().getDimensionPixelSize(R.dimen.ad4ad_button_bottom_margin);
        init(this.A03, c215289g4, c172577mR, c172587mS, c172597mT, obj, obj3, this.A02, this.A04, this.A05, this.A00, obj2);
    }

    private final void A00(AbstractC65632xz abstractC65632xz, List list, int i, int i2) {
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = i3 * i2;
            C153126ug c153126ug = new C153126ug(list, i4, i2);
            C153336v2 BQs = BQs(AbstractC166997dE.A0u(c153126ug));
            BQs.A00(i3, AbstractC167007dF.A1P(i3, i - 1));
            BQs.A01 = i4;
            addModel(c153126ug, BQs, abstractC65632xz);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X.6v2, X.9o7, java.lang.Object] */
    @Override // X.InterfaceC152956uP
    public final C153336v2 BQs(String str) {
        C14360o3.A0B(str, 0);
        Map map = this.A0J;
        C153336v2 c153336v2 = (C153336v2) map.get(str);
        if (c153336v2 == null) {
            ?? c153336v22 = new C153336v2();
            c153336v22.A01 = true;
            c153336v22.A00 = false;
            map.put(str, c153336v22);
            return c153336v22;
        }
        return c153336v2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0135, code lost:
    
        if (X.AbstractC172687md.A02(r1, r0) == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0246, code lost:
    
        if (r9.length() == 0) goto L112;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:72:0x01b7. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0255  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C215249g0 r19) {
        /*
            Method dump skipped, instructions count: 766
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C215249g0.A01(X.9g0):void");
    }

    private final void A02(Integer num, List list, boolean z, boolean z2) {
        C55U c55u;
        int ceil;
        int i;
        AbstractC65632xz abstractC65632xz;
        int A01;
        UserSession userSession = this.A08;
        C1810981l c1810981l = this.A09;
        if (c1810981l != null) {
            c55u = C1810981l.A02(c1810981l);
        } else {
            c55u = null;
        }
        if (AbstractC172687md.A02(userSession, c55u)) {
            ArrayList A1E = AbstractC166987dD.A1E();
            ArrayList A1E2 = AbstractC166987dD.A1E();
            for (Object obj : list) {
                C148276lx c148276lx = (C148276lx) obj;
                if (!AbstractC166997dE.A1Z(c148276lx.A09, true) && !c148276lx.A0Y) {
                    A1E2.add(obj);
                } else {
                    A1E.add(obj);
                }
            }
            list = A1E2;
            ArrayList A1E3 = AbstractC166987dD.A1E();
            Iterator it = A1E.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (((C148276lx) next).A00() != EnumC150226pU.A0W) {
                    A1E3.add(next);
                }
            }
            ArrayList A0q = AbstractC167017dG.A0q(A1E3);
            Iterator it2 = A1E3.iterator();
            while (it2.hasNext()) {
                Drawable drawable = AbstractC209799Pp.A02(this.A06, userSession, this.A0A, (C148276lx) it2.next()).A00;
                if (drawable != null) {
                    A0q.add(drawable);
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
            int size = A1E3.size();
            int i2 = 0;
            int i3 = 0;
            while (i2 < size) {
                if (num != null) {
                    A01 = num.intValue();
                } else {
                    A01 = ADW.A01(this.A06, userSession, A0q, i2);
                }
                C153126ug c153126ug = new C153126ug(A1E3, i2, A01);
                C153336v2 BQs = BQs(AbstractC166997dE.A0u(c153126ug));
                int i4 = A01 + i2;
                boolean z3 = false;
                if (i4 >= size) {
                    z3 = true;
                }
                BQs.A00(i3, z3);
                BQs.A01 = i2;
                C220219o7 c220219o7 = (C220219o7) BQs;
                c220219o7.A01 = z;
                c220219o7.A00 = z2;
                addModel(c153126ug, BQs, this.A0B);
                i3++;
                i2 = i4;
            }
            ceil = (int) Math.ceil(A1E2.size() / 4.0d);
            i = 4;
            abstractC65632xz = this.A0G;
        } else {
            ceil = (int) Math.ceil(list.size() / 3.0d);
            i = 3;
            abstractC65632xz = this.A0H;
        }
        A00(abstractC65632xz, list, ceil, i);
    }

    @Override // X.InterfaceC65242xM
    public final /* bridge */ /* synthetic */ Object getAdapter() {
        return this;
    }
}
