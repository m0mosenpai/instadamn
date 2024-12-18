package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewStub;
import android.widget.EditText;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.ui.text.ConstrainedEditText;
import java.util.Collections;
import java.util.Locale;

/* renamed from: X.9NL, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9NL extends AbstractC65392xb implements View.OnFocusChangeListener, InterfaceC60152ox, InterfaceC25184BCh, InterfaceC25174BBv {
    public int A00;
    public Paint A01;
    public ConstrainedEditText A02;
    public boolean A03;
    public final float A04;
    public final float A05;
    public final View A07;
    public final View A08;
    public final View A09;
    public final ViewStub A0A;
    public final RecyclerView A0B;
    public final UserSession A0C;
    public final C3I9 A0D;
    public final TargetViewSizeProvider A0E;
    public final AnonymousClass840 A0F;
    public final C9UL A0G;
    public final C24035AlU A0H;
    public final A8C A0I;
    public final C190398bx A0J;
    public final C8O8 A0O;
    public final InterfaceC1810081c A0P;
    public final InterfaceC09390do A0M = AbstractC09440dt.A01(new C31651DvH(this, 3));
    public final InputFilter[] A0N = {new InputFilter.AllCaps()};
    public final Rect A06 = AbstractC166987dD.A0U();
    public final java.util.Set A0L = AbstractC166987dD.A1H();
    public final java.util.Set A0K = AbstractC166987dD.A1H();

    public static void A00(Editable editable, C9NL c9nl) {
        for (V78 v78 : (V78[]) C4GL.A06(editable, V78.class)) {
            c9nl.A0K.remove(v78);
            c9nl.A0L.add(v78);
        }
        java.util.Set set = c9nl.A0L;
        java.util.Set set2 = c9nl.A0K;
        set.removeAll(set2);
        set2.clear();
    }

    public final void A01(CharSequence charSequence) {
        ConstrainedEditText constrainedEditText = this.A02;
        constrainedEditText.getClass();
        Editable text = constrainedEditText.getText();
        int length = text.length();
        charSequence.getClass();
        text.replace(0, length, charSequence);
        this.A02.setSelection(text.length());
    }

    public final void A02(boolean z) {
        C9UL c9ul = this.A0G;
        c9ul.unregisterAdapterDataObserver(this);
        c9ul.A01.clear();
        c9ul.notifyDataSetChanged();
        c9ul.registerAdapterDataObserver(this);
        AbstractC166997dE.A1L(this.A08, z);
    }

    @Override // X.InterfaceC25184BCh
    public final void DDv(Object obj) {
        int i;
        final SpannedString A02;
        SpannableStringBuilder spannableStringBuilder;
        EnumC15950qp enumC15950qp;
        final ConstrainedEditText constrainedEditText;
        final InputFilter[] inputFilterArr;
        if (this.A02 == null) {
            ConstrainedEditText constrainedEditText2 = (ConstrainedEditText) this.A0A.inflate();
            this.A02 = constrainedEditText2;
            constrainedEditText2.A07.add(new C24136AnL(this));
            Context context = this.A0B.getContext();
            ConstrainedEditText constrainedEditText3 = this.A02;
            constrainedEditText3.getClass();
            C6QV.A02(constrainedEditText3);
            Resources resources = this.A02.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.action_bar_item_spacing_right);
            UserSession userSession = this.A0C;
            C14360o3.A0B(context, 0);
            C14360o3.A0B(userSession, 3);
            String A0p = AbstractC166997dE.A0p(context, 2131963455);
            if (AbstractC172687md.A01(userSession)) {
                Locale locale = Locale.getDefault();
                C14360o3.A07(locale);
                String lowerCase = A0p.toLowerCase(locale);
                C14360o3.A07(lowerCase);
                i = R.attr.igds_color_creation_tools_pink;
                A02 = AMr.A01(resources, lowerCase, new int[]{AbstractC167007dF.A09(context, R.attr.igds_color_creation_tools_pink), AbstractC167007dF.A09(context, R.attr.igds_color_creation_tools_pink)}, resources.getDimensionPixelSize(R.dimen.action_bar_item_spacing_right));
            } else {
                i = R.attr.igds_color_creation_tools_pink;
                A02 = AMr.A02(resources, A0p, new int[]{AbstractC167007dF.A09(context, R.attr.igds_color_creation_tools_pink), AbstractC167007dF.A09(context, R.attr.igds_color_creation_tools_pink)}, -1, dimensionPixelSize);
            }
            ConstrainedEditText constrainedEditText4 = this.A02;
            constrainedEditText4.getClass();
            constrainedEditText4.setHint(A02);
            this.A03 = true;
            if (AbstractC172687md.A01(userSession)) {
                spannableStringBuilder = AMr.A00(AbstractC166997dE.A0M(context), AbstractC167007dF.A09(context, i), AbstractC167007dF.A09(context, R.attr.igds_color_text_on_white));
            } else {
                spannableStringBuilder = new SpannableStringBuilder("");
                AMr.A09(resources, spannableStringBuilder, dimensionPixelSize, -1, AbstractC167007dF.A09(context, i));
            }
            AbstractC139116Rs.A00(this.A02, dimensionPixelSize, false);
            this.A01 = new TextPaint(this.A02.getPaint());
            this.A02.setText(spannableStringBuilder);
            ConstrainedEditText constrainedEditText5 = this.A02;
            boolean A01 = AbstractC172687md.A01(userSession);
            C15980qs A00 = AbstractC15960qq.A00(context);
            if (A01) {
                enumC15950qp = EnumC15950qp.A0Y;
            } else {
                enumC15950qp = EnumC15950qp.A0V;
            }
            constrainedEditText5.setTypeface(A00.A02(enumC15950qp));
            boolean A012 = AbstractC172687md.A01(userSession);
            ConstrainedEditText constrainedEditText6 = this.A02;
            if (!A012) {
                inputFilterArr = this.A0N;
                constrainedEditText6.setFilters(inputFilterArr);
                constrainedEditText = this.A02;
            } else {
                constrainedEditText6.setFilters(new InputFilter[0]);
                constrainedEditText = this.A02;
                inputFilterArr = new InputFilter[0];
            }
            constrainedEditText.addTextChangedListener(new WKa(A02, constrainedEditText, this, inputFilterArr) { // from class: X.9qK
                public static final InputFilter[] A05 = new InputFilter[0];
                public CharSequence A00 = "";
                public final SpannedString A01;
                public final EditText A02;
                public final C9NL A03;
                public final InputFilter[] A04;

                {
                    this.A02 = constrainedEditText;
                    this.A04 = inputFilterArr;
                    this.A01 = A02;
                    this.A03 = this;
                }

                @Override // X.WKa, android.text.TextWatcher
                public final void afterTextChanged(Editable editable) {
                    C9NL c9nl;
                    if (editable.length() > 0) {
                        if (editable.charAt(0) != '#') {
                            editable.insert(0, "#");
                            return;
                        } else if (editable.length() > 1) {
                            C9NL c9nl2 = this.A03;
                            if (!A16.A00(editable)) {
                                c9nl2.A01(this.A00);
                                return;
                            }
                        }
                    }
                    if (editable.length() <= 1) {
                        EditText editText = this.A02;
                        editText.setFilters(A05);
                        editable.clear();
                        editText.setFilters(this.A04);
                        c9nl = this.A03;
                        SpannedString spannedString = this.A01;
                        ConstrainedEditText constrainedEditText7 = c9nl.A02;
                        constrainedEditText7.getClass();
                        constrainedEditText7.setHint(spannedString);
                        c9nl.A03 = true;
                    } else {
                        c9nl = this.A03;
                        if (c9nl.A03) {
                            ConstrainedEditText constrainedEditText8 = c9nl.A02;
                            constrainedEditText8.getClass();
                            constrainedEditText8.setHint((CharSequence) null);
                            c9nl.A03 = false;
                        }
                    }
                    CharSequence charSequence = this.A00;
                    String charSequence2 = editable.toString();
                    Paint paint = c9nl.A01;
                    paint.getClass();
                    int A0A = AbstractC167007dF.A0A(charSequence2);
                    Rect rect = c9nl.A06;
                    paint.getTextBounds(charSequence2, 0, A0A, rect);
                    ConstrainedEditText constrainedEditText9 = c9nl.A02;
                    constrainedEditText9.getClass();
                    int A0C = AbstractC166997dE.A0C(constrainedEditText9.getResources());
                    ConstrainedEditText constrainedEditText10 = c9nl.A02;
                    constrainedEditText10.getClass();
                    int paddingLeft = constrainedEditText10.getPaddingLeft();
                    ConstrainedEditText constrainedEditText11 = c9nl.A02;
                    constrainedEditText11.getClass();
                    int paddingRight = paddingLeft + constrainedEditText11.getPaddingRight() + (A0C * 2);
                    int width = c9nl.A09.getWidth();
                    int width2 = rect.width() + paddingRight;
                    Paint paint2 = c9nl.A01;
                    paint2.getClass();
                    float textSize = paint2.getTextSize();
                    float f = c9nl.A04;
                    if (width2 <= width) {
                        while (true) {
                            textSize += f * 0.1f;
                            if (textSize > f) {
                                break;
                            }
                            Paint paint3 = c9nl.A01;
                            paint3.getClass();
                            paint3.setTextSize(textSize);
                            Paint paint4 = c9nl.A01;
                            paint4.getClass();
                            paint4.getTextBounds(charSequence2, 0, A0A, rect);
                            if (rect.width() + paddingRight <= width) {
                                ConstrainedEditText constrainedEditText12 = c9nl.A02;
                                constrainedEditText12.getClass();
                                constrainedEditText12.setTextSize(0, textSize);
                            } else {
                                Paint paint5 = c9nl.A01;
                                paint5.getClass();
                                ConstrainedEditText constrainedEditText13 = c9nl.A02;
                                constrainedEditText13.getClass();
                                paint5.setTextSize(constrainedEditText13.getTextSize());
                                break;
                            }
                        }
                        this.A00 = editable.toString();
                    }
                    while (true) {
                        textSize -= f * 0.1f;
                        if (textSize >= c9nl.A05) {
                            Paint paint6 = c9nl.A01;
                            paint6.getClass();
                            paint6.setTextSize(textSize);
                            Paint paint7 = c9nl.A01;
                            paint7.getClass();
                            paint7.getTextBounds(charSequence2, 0, A0A, rect);
                            if (rect.width() + paddingRight <= width) {
                                ConstrainedEditText constrainedEditText14 = c9nl.A02;
                                constrainedEditText14.getClass();
                                constrainedEditText14.setTextSize(0, textSize);
                                break;
                            }
                        } else {
                            c9nl.A01(charSequence);
                            break;
                        }
                    }
                    this.A00 = editable.toString();
                }
            });
        }
        ConstrainedEditText constrainedEditText7 = this.A02;
        constrainedEditText7.getClass();
        constrainedEditText7.setOnFocusChangeListener(this);
        AbstractC167007dF.A0y(this.A08, false);
        this.A0B.A0n(0);
        A8C a8c = this.A0I;
        a8c.A00 = false;
        a8c.A01 = false;
        a8c.A02.Clf();
        a8c.A00 = true;
        AbstractC167007dF.A0y(this.A07, false);
        this.A02.setVisibility(0);
        this.A02.requestFocus();
        String str = ((C8VY) obj).A00;
        if (str != null) {
            A01(str);
        }
        C8O8 c8o8 = this.A0O;
        if (c8o8 != null) {
            C148276lx c148276lx = C148276lx.A0a;
            c8o8.Dom("hashtag_sticker_id");
        }
    }

    @Override // X.InterfaceC25184BCh
    public final void DEy() {
        ConstrainedEditText constrainedEditText = this.A02;
        constrainedEditText.getClass();
        if (constrainedEditText.hasFocus()) {
            this.A02.clearFocus();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        if (r1 != 0) goto L6;
     */
    @Override // X.InterfaceC25174BBv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DK5(com.instagram.model.hashtag.Hashtag r13, int r14) {
        /*
            r12 = this;
            com.instagram.ui.text.ConstrainedEditText r0 = r12.A02
            if (r0 == 0) goto Lb
            int r1 = r0.getVisibility()
            r0 = 1
            if (r1 == 0) goto Lc
        Lb:
            r0 = 0
        Lc:
            java.lang.String r4 = ""
            r5 = r4
            if (r0 == 0) goto L72
            com.instagram.ui.text.ConstrainedEditText r0 = r12.A02
            r0.getClass()
            android.text.Editable r2 = r0.getText()
            int r0 = r2.length()
            r1 = 1
            if (r0 <= r1) goto L2d
            int r0 = r2.length()
            java.lang.CharSequence r0 = r2.subSequence(r1, r0)
            java.lang.String r4 = r0.toString()
        L2d:
            r13.getClass()
            java.lang.String r1 = r13.getName()
            boolean r0 = r4.equalsIgnoreCase(r1)
            if (r0 == 0) goto L6e
            X.81c r1 = r12.A0P
            X.8Vg r0 = new X.8Vg
            r0.<init>()
            r1.E4u(r0)
        L44:
            X.A8C r0 = r12.A0I
            java.lang.String r8 = r13.getId()
            X.8c6 r0 = r0.A02
            r6 = 0
            if (r8 != 0) goto L50
            r8 = r5
        L50:
            java.lang.String r11 = "server"
            java.lang.Integer r2 = X.C05F.A0C
            java.lang.String r9 = "HASHTAG"
            java.lang.String r7 = "server_results"
            r10 = r6
            X.U2h r1 = X.C70108W4f.A00(r6, r7, r8, r9, r10, r11)
            r6 = r14
            r3 = r2
            r0.ClZ(r1, r2, r3, r4, r5, r6)
            X.8O8 r1 = r12.A0O
            if (r1 == 0) goto L6d
            X.6lx r0 = X.C148276lx.A0a
            java.lang.String r0 = "hashtag_sticker_id"
            r1.Doh(r0)
        L6d:
            return
        L6e:
            r12.A01(r1)
            goto L44
        L72:
            X.8bx r3 = r12.A0J
            r13.getClass()
            java.lang.String r2 = r13.getName()
            r2.getClass()
            r1 = 35
            com.instagram.ui.text.ConstrainedEditText r0 = r3.A1j
            X.AbstractC209689Pe.A05(r0, r13, r2, r1)
            X.6pc r1 = r3.A1c
            boolean r0 = r1.A03
            if (r0 == 0) goto L44
            java.lang.Object r0 = r1.get()
            X.ACN r0 = (X.ACN) r0
            com.instagram.ui.text.ConstrainedEditText r1 = r0.A07
            java.lang.Runnable r0 = r0.A08
            r1.post(r0)
            goto L44
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9NL.DK5(com.instagram.model.hashtag.Hashtag, int):void");
    }

    @Override // X.InterfaceC60152ox
    public final void DOK(int i, boolean z) {
        ConstrainedEditText constrainedEditText = this.A02;
        if (constrainedEditText != null) {
            constrainedEditText.DOK(i, z);
        }
        int i2 = C1812982h.A00;
        float f = 0.0f;
        if (z) {
            f = (-i) + i2;
        }
        this.A08.setTranslationY(f);
    }

    @Override // X.AbstractC65392xb
    public final void onChanged() {
        C190398bx c190398bx = this.A0J;
        int itemCount = this.A0G.getItemCount();
        if (c190398bx.A1X.CeK()) {
            int i = c190398bx.A01;
            if (i == 0) {
                if (itemCount > 0) {
                    if (C190398bx.A0T(c190398bx)) {
                        c190398bx.A16.setVisibility(8);
                    }
                    C190398bx.A0J(c190398bx, true);
                    C150286pc c150286pc = c190398bx.A1Y;
                    c150286pc.getClass();
                    C9NL c9nl = (C9NL) c150286pc.get();
                    AbstractC167007dF.A0y(c9nl.A08, true);
                    c9nl.A0B.A0n(0);
                    AbstractC125325le.A05(new View[]{c190398bx.A1m}, true);
                }
            } else if (i > 0 && itemCount == 0) {
                C150286pc c150286pc2 = c190398bx.A1Y;
                c150286pc2.getClass();
                ((C9NL) c150286pc2.get()).A02(true);
                if (C190398bx.A0T(c190398bx)) {
                    c190398bx.A16.setVisibility(0);
                }
                C190398bx.A0D(c190398bx);
                AbstractC125325le.A04(null, new View[]{c190398bx.A1m}, true);
            }
            c190398bx.A01 = itemCount;
        }
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        C3I9 c3i9 = this.A0D;
        if (z) {
            c3i9.A9e(this);
            ConstrainedEditText constrainedEditText = this.A02;
            constrainedEditText.getClass();
            AbstractC13880nE.A0R(constrainedEditText);
            return;
        }
        c3i9.EFx(this);
        A02(false);
        AbstractC166997dE.A1L(this.A07, false);
        C190398bx c190398bx = this.A0J;
        ConstrainedEditText constrainedEditText2 = this.A02;
        constrainedEditText2.getClass();
        String A0g = AbstractC167007dF.A0g(constrainedEditText2);
        ConstrainedEditText constrainedEditText3 = this.A02;
        constrainedEditText3.getClass();
        c190398bx.Dog(new C217879kK(A0g, InterfaceC1812882f.A00(this.A0E), constrainedEditText3.getPaint().getTextSize()), AbstractC111324zv.A00(4562));
        A01("");
        ConstrainedEditText constrainedEditText4 = this.A02;
        constrainedEditText4.getClass();
        constrainedEditText4.setVisibility(8);
        AbstractC13880nE.A0O(this.A02);
    }

    public C9NL(View view, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C3I9 c3i9, C8O8 c8o8, TargetViewSizeProvider targetViewSizeProvider, AnonymousClass840 anonymousClass840, InterfaceC1810081c interfaceC1810081c, C190398bx c190398bx, ConstrainedEditText constrainedEditText) {
        this.A0P = interfaceC1810081c;
        this.A0C = userSession;
        this.A0F = anonymousClass840;
        this.A09 = view;
        this.A0D = c3i9;
        this.A0J = c190398bx;
        this.A07 = view.requireViewById(R.id.text_overlay_edit_text_container);
        this.A0A = (ViewStub) view.requireViewById(R.id.hashtag_edit_text_stub);
        View requireViewById = view.requireViewById(R.id.hashtag_suggestions_container);
        this.A08 = requireViewById;
        RecyclerView recyclerView = (RecyclerView) requireViewById.requireViewById(R.id.hashtag_suggestions_recycler_view);
        this.A0B = recyclerView;
        float A0E = AbstractC166997dE.A0E(view.getResources());
        this.A04 = A0E;
        this.A05 = A0E * 0.5f;
        this.A0E = targetViewSizeProvider;
        Context context = recyclerView.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
        linearLayoutManager.A12(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.A10(new C3YB(0, AbstractC167017dG.A0D(context)));
        this.A0H = new C24035AlU(userSession, this);
        C9UL c9ul = new C9UL(userSession, this);
        this.A0G = c9ul;
        c9ul.registerAdapterDataObserver(this);
        recyclerView.setAdapter(c9ul);
        this.A0I = new A8C(interfaceC11380iw, userSession);
        constrainedEditText.addTextChangedListener(new TextWatcher() { // from class: X.9NJ
            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                C9NL c9nl;
                for (V78 v78 : (V78[]) C4GL.A06(editable, V78.class)) {
                    if (!A16.A00(editable.subSequence(editable.getSpanStart(v78), editable.getSpanEnd(v78)))) {
                        editable.removeSpan(v78);
                    }
                }
                int A00 = C9NK.A00(editable);
                if (A00 == -1) {
                    c9nl = C9NL.this;
                } else {
                    int selectionEnd = Selection.getSelectionEnd(editable);
                    CharSequence subSequence = editable.subSequence(A00, selectionEnd);
                    if (!A16.A00(subSequence)) {
                        return;
                    }
                    for (V78 v782 : (V78[]) editable.getSpans(A00, selectionEnd, V78.class)) {
                        editable.removeSpan(v782);
                    }
                    c9nl = C9NL.this;
                    if (!AbstractC227009zw.A00(c9nl.A0F.A02)) {
                        return;
                    }
                    C9NL.A00(editable, c9nl);
                    if (c9nl.A00 + c9nl.A0L.size() >= 10) {
                        return;
                    }
                    editable.setSpan(new V78(c9nl.A09.getResources(), AbstractC1120253r.A00(subSequence.subSequence(1, subSequence.length()).toString())), A00, selectionEnd, 33);
                }
                C9NL.A00(editable, c9nl);
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (charSequence instanceof Editable) {
                    java.util.Set set = C9NL.this.A0K;
                    set.clear();
                    Collections.addAll(set, C4GL.A06((Spanned) charSequence, V78.class));
                }
            }
        });
        constrainedEditText.A07.add(new C24139AnO(this));
        this.A0O = c8o8;
    }
}
