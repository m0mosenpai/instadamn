package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.reels.question.constants.QuestionStickerType;
import java.util.List;

/* renamed from: X.9pG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC220929pG extends AbstractC130945vi implements C5RR, InterfaceC133125ze {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final Context A09;
    public final Resources A0A;
    public final Drawable A0B;
    public final Drawable A0C;
    public final AlD A0D;
    public final C6RB A0E;
    public final C6RB A0F;
    public final UserSession A0G;
    public final String A0H;

    @Override // X.C5RN
    public final List A07() {
        if (this instanceof C221179pf) {
            return ((C221179pf) this).A04;
        }
        return ((C221189pg) this).A05;
    }

    public final void A0B() {
        AlD alD = this.A0D;
        if (alD != null) {
            Context context = this.A09;
            int A03 = alD.A03(context);
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(C6ZB.A01(context, A03), PorterDuff.Mode.SRC);
            AbstractC167017dG.A13(porterDuffColorFilter, this.A0B);
            AbstractC167017dG.A13(porterDuffColorFilter, this.A0C);
            C6RB c6rb = this.A0E;
            QuestionStickerType questionStickerType = alD.A00.A00;
            if (questionStickerType == null) {
                questionStickerType = QuestionStickerType.A08;
            }
            C14360o3.A07(questionStickerType);
            AbstractC166987dD.A1Q(context, c6rb, 2131971243);
            c6rb.A0F(C6ZB.A00(context, A03));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
    
        if (r3.length() == 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0C() {
        /*
            r5 = this;
            X.AlD r4 = r5.A0D
            if (r4 == 0) goto L26
            java.lang.String r3 = r4.A05()
            if (r3 == 0) goto L11
            int r0 = r3.length()
            r2 = 0
            if (r0 != 0) goto L12
        L11:
            r2 = 1
        L12:
            java.lang.String r0 = ""
            X.6RB r1 = r5.A0F
            if (r2 == 0) goto L27
            java.lang.String r0 = r5.A0H
        L1a:
            r1.A0M(r0)
            android.content.Context r0 = r5.A09
            int r0 = r4.A04(r0)
            r1.A0F(r0)
        L26:
            return
        L27:
            if (r3 == 0) goto L1a
            r0 = r3
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC220929pG.A0C():void");
    }

    @Override // X.C5RR
    public final C5NL C0T() {
        return this.A0D;
    }

    @Override // X.InterfaceC133125ze
    public final String C5K() {
        AlD alD = this.A0D;
        if (alD != null) {
            QuestionStickerType questionStickerType = alD.A00.A00;
            if (questionStickerType == null) {
                questionStickerType = QuestionStickerType.A08;
            }
            if (questionStickerType.ordinal() == 5) {
                List A06 = alD.A06();
                if (A06 != null && AbstractC166987dD.A1b(A06)) {
                    return "expressive_question_sticker";
                }
                return "question_sticker_ama";
            }
            return "";
        }
        return "";
    }

    public AbstractC220929pG(Context context, UserSession userSession, AlD alD) {
        int A0A;
        this.A0G = userSession;
        this.A09 = context;
        this.A0D = alD;
        Resources A0M = AbstractC166997dE.A0M(context);
        this.A0A = A0M;
        String A0p = AbstractC166997dE.A0p(context, 2131971246);
        this.A0H = A0p;
        int A05 = AbstractC166997dE.A05(A0M);
        this.A04 = A05;
        int dimensionPixelSize = A0M.getDimensionPixelSize(R.dimen.canvas_text_view_input_background_width);
        this.A08 = dimensionPixelSize;
        int i = dimensionPixelSize - (A05 * 2);
        this.A05 = AbstractC166997dE.A0C(A0M);
        this.A02 = A0M.getDimensionPixelSize(R.dimen.ad4ad_button_bottom_margin);
        this.A01 = A0M.getDimensionPixelSize(R.dimen.abc_dialog_padding_material);
        this.A00 = AbstractC166997dE.A08(A0M);
        this.A06 = A0M.getDimensionPixelSize(R.dimen.album_preview_add_item_margin);
        int dimensionPixelSize2 = A0M.getDimensionPixelSize(R.dimen.abc_control_corner_material);
        this.A07 = dimensionPixelSize2;
        int dimensionPixelSize3 = A0M.getDimensionPixelSize(R.dimen.poll_v2_sticker_result_percentage_text_size);
        int dimensionPixelSize4 = A0M.getDimensionPixelSize(R.dimen.challenge_sticker_button_text_size);
        this.A03 = dimensionPixelSize4;
        int color = context.getColor(R.color.clips_remix_camera_outer_container_default_background);
        this.A0B = context.getDrawable(R.drawable.question_sticker_answer_background);
        this.A0C = context.getDrawable(R.drawable.question_sticker_rounded_answer_background);
        C6RB A0z = AbstractC166987dD.A0z(context, dimensionPixelSize);
        Context context2 = A0z.A0Z;
        AbstractC166987dD.A1Q(context2, A0z, 2131971243);
        A0z.A0A(dimensionPixelSize4);
        if (C14640oc.A0H()) {
            A0A = R.color.igds_secondary_text;
        } else {
            A0A = AbstractC53242c7.A0A(context2);
        }
        AbstractC166997dE.A1A(context2, A0z, A0A);
        float f = dimensionPixelSize2;
        A0z.A0C(0.0f, f);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        A0z.A0K(alignment);
        A0z.setCallback(this);
        C15980qs A00 = AbstractC15960qq.A00(context2);
        EnumC15950qp enumC15950qp = EnumC15950qp.A0V;
        AbstractC166987dD.A1U(enumC15950qp, A00, A0z);
        this.A0E = A0z;
        C6RB A0z2 = AbstractC166987dD.A0z(context, i);
        A0z2.A0M(A0p);
        A0z2.A0A(dimensionPixelSize3);
        A0z2.A0F(color);
        A0z2.A0C(0.0f, f);
        Context context3 = A0z2.A0Z;
        C14360o3.A07(context3);
        AEZ.A00(context3, A0z2);
        A0z2.A0K(alignment);
        A0z2.setCallback(this);
        AbstractC166987dD.A1U(enumC15950qp, AbstractC15960qq.A00(context3), A0z2);
        this.A0F = A0z2;
    }
}
