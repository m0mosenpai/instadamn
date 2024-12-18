package com.facebookpay.widget.accordion;

import X.AbstractC167017dG;
import X.C00O;
import X.C0f9;
import X.C14360o3;
import X.C3OO;
import X.C46g;
import X.C67649Uue;
import X.C68701Vad;
import X.C69333Vlf;
import X.InterfaceC16620sF;
import X.UGL;
import X.UIQ;
import X.UuY;
import X.VG3;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.google.common.collect.HashMultimap;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public class AccordionView extends FrameLayout {
    public FrameLayout A00;
    public LinearLayout A01;
    public ConstraintLayout A02;
    public C3OO A03;
    public VG3 A04;
    public C69333Vlf A05;
    public C68701Vad A06;
    public Map A07;
    public InterfaceC16620sF A08;
    public boolean A09;
    public final int A0A;
    public final C46g A0B;
    public final Map A0C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccordionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A0C = new LinkedHashMap();
        this.A0B = new HashMultimap();
        this.A0A = AbstractC167017dG.A05(context);
        View.inflate(context, R.layout.fbpay_ui_accordion_view, this);
        setImportantForAccessibility(2);
        this.A00 = (FrameLayout) findViewById(R.id.accordion_summary_container);
        this.A01 = (LinearLayout) findViewById(R.id.accordion_expanded_container);
        this.A02 = (ConstraintLayout) findViewById(R.id.accordion_view_container);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        r0.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0025, code lost:
    
        if (r0 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r0 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(com.facebookpay.widget.accordion.AccordionView r5, boolean r6) {
        /*
            r4 = 0
            java.lang.String r3 = "summaryContainer"
            java.lang.String r2 = "expandedContainer"
            r1 = 8
            if (r6 == 0) goto L1c
            android.widget.FrameLayout r0 = r5.A00
            if (r0 == 0) goto L27
            r0.setVisibility(r1)
            android.widget.LinearLayout r0 = r5.A01
            if (r0 != 0) goto L2b
        L14:
            X.C14360o3.A0F(r2)
        L17:
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L1c:
            android.widget.LinearLayout r0 = r5.A01
            if (r0 == 0) goto L14
            r0.setVisibility(r1)
            android.widget.FrameLayout r0 = r5.A00
            if (r0 != 0) goto L2b
        L27:
            X.C14360o3.A0F(r3)
            goto L17
        L2b:
            r0.setVisibility(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.widget.accordion.AccordionView.A00(com.facebookpay.widget.accordion.AccordionView, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001c, code lost:
    
        if (r0.getChildCount() <= 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0032, code lost:
    
        if (X.C14360o3.A0K(java.lang.Boolean.valueOf(r7), r1) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
    
        if (r2 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0101, code lost:
    
        if (r0 == false) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setExpansionState(boolean r13) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.widget.accordion.AccordionView.setExpansionState(boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ca, code lost:
    
        if (X.AbstractC166997dE.A1Z(r1.A0I(), false) != false) goto L40;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAttachedToWindow() {
        /*
            Method dump skipped, instructions count: 676
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.widget.accordion.AccordionView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C67649Uue c67649Uue;
        UuY uuY;
        UuY uuY2;
        int A06 = C0f9.A06(-27158710);
        super.onDetachedFromWindow();
        Collection<Map.Entry> ASw = this.A0B.ASw();
        C14360o3.A07(ASw);
        for (Map.Entry entry : ASw) {
            Map map = this.A07;
            if (map == null) {
                C14360o3.A0F("viewBinders");
                throw C00O.createAndThrow();
            }
            UGL ugl = (UGL) map.get(entry.getKey());
            if ((ugl instanceof UuY) && (uuY2 = (UuY) ugl) != null) {
                Object value = entry.getValue();
                C14360o3.A07(value);
                uuY2.A08((UIQ) ((C3OO) value));
            }
            if ((ugl instanceof C67649Uue) && (c67649Uue = (C67649Uue) ugl) != null) {
                Object value2 = entry.getValue();
                C14360o3.A07(value2);
                UIQ uiq = (UIQ) c67649Uue.A04.get(value2);
                if (uiq != null && (uuY = c67649Uue.A03) != null) {
                    uuY.A08(uiq);
                }
            }
        }
        C0f9.A0D(-674520643, A06);
    }

    public final void setBackground(C69333Vlf c69333Vlf) {
        this.A05 = c69333Vlf;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AccordionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AccordionView(Context context) {
        this(context, null);
        C14360o3.A0B(context, 1);
    }
}
