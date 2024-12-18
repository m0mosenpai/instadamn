package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Gwl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38525Gwl extends C3OO implements C33R {
    public View A00;
    public C38321qM A01;
    public InterfaceC692739n A02;
    public C75113Zb A03;
    public boolean A04;
    public final int A05;
    public final View A06;
    public final View A07;
    public final View A08;
    public final View A09;
    public final View A0A;
    public final View A0B;
    public final View A0C;
    public final ImageView A0D;
    public final TextView A0E;
    public final TextView A0F;
    public final TextView A0G;
    public final TextView A0H;
    public final TextView A0I;
    public final ArrayList A0J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38525Gwl(View view, int i) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A05 = i;
        this.A08 = AbstractC166997dE.A0S(view, R.id.tombstone_reasons);
        this.A0A = AbstractC166997dE.A0S(view, R.id.tombstone_survey);
        this.A0H = AbstractC167007dF.A0N(view, R.id.tombstone_title);
        this.A0J = AbstractC166987dD.A1E();
        this.A0B = AbstractC166997dE.A0S(view, R.id.tombstone_thanks);
        this.A0D = AbstractC31176DnK.A0D(view, R.id.tombstone_header_image);
        this.A0F = AbstractC167007dF.A0N(view, R.id.tombstone_header_text);
        this.A0E = AbstractC167007dF.A0N(view, R.id.tombstone_feedback_text);
        this.A0I = AbstractC167007dF.A0N(view, R.id.tombstone_undo);
        this.A0G = AbstractC167007dF.A0N(view, R.id.tombstone_show_post);
        this.A06 = AbstractC166997dE.A0S(view, R.id.tombstone_dismiss_button);
        this.A0C = AbstractC166997dE.A0S(view, R.id.undo_divider);
        this.A09 = AbstractC166997dE.A0S(view, R.id.show_post_divider);
        this.A07 = AbstractC166997dE.A0S(view, R.id.tombstone_frame);
    }

    @Override // X.C33R
    public final void DSJ(C75113Zb c75113Zb, int i) {
        C14360o3.A0B(c75113Zb, 0);
        if (i == 6 && c75113Zb.A1x) {
            this.A0F.setText(2131975667);
            this.A0E.setText(2131975664);
            if (this.A05 == 0) {
                IQZ.A01(this, 8);
            }
        }
    }

    public final void A00() {
        View view = this.A08;
        view.setAlpha(1.0f);
        this.A0B.setVisibility(8);
        view.setVisibility(0);
    }

    public final void A02(int i) {
        View view = this.A0A;
        C14360o3.A0C(view, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) view;
        ArrayList arrayList = this.A0J;
        Iterator A13 = AbstractC166997dE.A13(arrayList);
        while (A13.hasNext()) {
            viewGroup.removeView((View) AbstractC166997dE.A0l(A13));
        }
        arrayList.clear();
        for (int i2 = 0; i2 < i; i2++) {
            C14360o3.A0C(view, "null cannot be cast to non-null type android.view.ViewGroup");
            View A0A = AbstractC31172DnG.A0A(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.row_feed_tombstone_reason);
            AbstractC167007dF.A0N(A0A, R.id.survey_tombstone_reason_text).getPaint().setFakeBoldText(true);
            viewGroup.addView(A0A);
            arrayList.add(A0A);
        }
    }

    public final void A01() {
        IQZ.A00(this);
        String str = C693439u.A02;
        this.A08.setVisibility(8);
        if (!C14360o3.A0K(str, "v2") && !C14360o3.A0K(str, "v3")) {
            this.A0B.setVisibility(0);
        } else {
            this.A0B.setVisibility(8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r12.length() == 0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a3, code lost:
    
        if (r9 == com.instagram.api.schemas.UndoStyle.A06) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(android.view.View.OnClickListener r8, com.instagram.api.schemas.UndoStyle r9, java.lang.Integer r10, java.lang.String r11, java.lang.String r12) {
        /*
            r7 = this;
            X.AbstractC167017dG.A1Q(r10, r9)
            r7.A00()
            android.view.View r1 = r7.A00
            if (r1 != 0) goto L17
            android.view.View r1 = r7.A08
            r0 = 2131443044(0x7f0b3d64, float:1.8508145E38)
            android.view.View r1 = X.AbstractC167017dG.A0U(r1, r0)
            r7.A00 = r1
            if (r1 == 0) goto Lb8
        L17:
            r0 = 2131443037(0x7f0b3d5d, float:1.850813E38)
            android.widget.TextView r5 = X.AbstractC167007dF.A0N(r1, r0)
            r3 = 0
            if (r12 == 0) goto L28
            int r2 = r12.length()
            r0 = 0
            if (r2 != 0) goto L29
        L28:
            r0 = 1
        L29:
            r4 = 8
            if (r0 != 0) goto Ld1
            r5.setVisibility(r3)
            r5.setText(r12)
            r0 = 2132018626(0x7f1405c2, float:1.9675564E38)
            r5.setTextAppearance(r0)
        L39:
            r0 = 2131443034(0x7f0b3d5a, float:1.8508125E38)
            android.widget.TextView r2 = X.AbstractC167007dF.A0N(r1, r0)
            if (r11 == 0) goto Lcd
            int r0 = r11.length()
            if (r0 == 0) goto Lcd
            r0 = 63
            android.text.Spanned r0 = android.text.Html.fromHtml(r11, r0)
            r2.setText(r0)
            r2.setVisibility(r3)
        L54:
            r0 = 2131443036(0x7f0b3d5c, float:1.8508129E38)
            android.widget.ImageView r6 = X.AbstractC31176DnK.A0D(r1, r0)
            X.C14360o3.A0B(r6, r3)
            int r5 = r10.intValue()
            switch(r5) {
                case 1: goto Lc1;
                case 2: goto Lc5;
                case 3: goto Lc9;
                default: goto L65;
            }
        L65:
            r0 = 2131238165(0x7f081d15, float:1.80926E38)
        L68:
            android.content.Context r2 = r6.getContext()
            r6.setVisibility(r3)
            X.AbstractC166997dE.A19(r2, r6, r0)
            switch(r5) {
                case 1: goto Lb9;
                case 2: goto Lbd;
                case 3: goto Lb9;
                default: goto L75;
            }
        L75:
            r0 = 2130970334(0x7f0406de, float:1.7549375E38)
        L78:
            int r0 = X.AbstractC53242c7.A0H(r2, r0)
            int r0 = X.AbstractC167007dF.A09(r2, r0)
            android.graphics.ColorFilter r0 = X.C3DY.A00(r0)
            r6.setColorFilter(r0)
        L87:
            r0 = 2131443052(0x7f0b3d6c, float:1.8508161E38)
            android.view.View r5 = X.AbstractC166997dE.A0S(r1, r0)
            r0 = 2131443053(0x7f0b3d6d, float:1.8508163E38)
            android.view.View r2 = X.AbstractC166997dE.A0S(r1, r0)
            X.C0fQ.A00(r8, r5)
            X.C0fQ.A00(r8, r2)
            com.instagram.api.schemas.UndoStyle r0 = com.instagram.api.schemas.UndoStyle.A05
            if (r9 == r0) goto La5
            com.instagram.api.schemas.UndoStyle r1 = com.instagram.api.schemas.UndoStyle.A06
            r0 = 8
            if (r9 != r1) goto La6
        La5:
            r0 = 0
        La6:
            r5.setVisibility(r0)
            com.instagram.api.schemas.UndoStyle r0 = com.instagram.api.schemas.UndoStyle.A07
            if (r9 != r0) goto Lae
            r4 = 0
        Lae:
            r2.setVisibility(r4)
            android.view.View r0 = r7.A00
            if (r0 == 0) goto Lb8
            r0.setVisibility(r3)
        Lb8:
            return
        Lb9:
            r6.clearColorFilter()
            goto L87
        Lbd:
            r0 = 2130970130(0x7f040612, float:1.7548961E38)
            goto L78
        Lc1:
            r0 = 2131239995(0x7f08243b, float:1.8096313E38)
            goto L68
        Lc5:
            r0 = 2131238326(0x7f081db6, float:1.8092928E38)
            goto L68
        Lc9:
            r6.setVisibility(r4)
            goto L87
        Lcd:
            r2.setVisibility(r4)
            goto L54
        Ld1:
            r5.setVisibility(r4)
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38525Gwl.A03(android.view.View$OnClickListener, com.instagram.api.schemas.UndoStyle, java.lang.Integer, java.lang.String, java.lang.String):void");
    }
}
