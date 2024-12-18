package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.reels.prompt.model.PromptStickerModel;
import java.util.List;

/* renamed from: X.9pM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C220989pM extends AbstractC130945vi implements C8P8, C5RR {
    public C180537zh A00;
    public final int A01;
    public final C6RL A02;
    public final PromptStickerModel A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final C216109hT A09;
    public final AbstractC216079hQ A0A;
    public final C6RB A0B;
    public final C124385ju A0C;

    public C220989pM(Context context, UserSession userSession, PromptStickerModel promptStickerModel) {
        C14360o3.A0B(promptStickerModel, 3);
        this.A03 = promptStickerModel;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.imagine_sticker_width);
        this.A01 = dimensionPixelSize;
        this.A04 = context.getResources().getDimensionPixelSize(R.dimen.audio_translations_language_list_cell_row_height);
        this.A05 = context.getResources().getDimensionPixelSize(R.dimen.account_group_management_title_text_horizontal_padding);
        int A0B = AbstractC167017dG.A0B(context);
        this.A08 = AbstractC167017dG.A06(context);
        this.A06 = AbstractC167017dG.A0B(context);
        this.A07 = context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        C221119pZ c221119pZ = new C221119pZ(context);
        c221119pZ.setCallback(this);
        this.A0A = c221119pZ;
        int A00 = this.A03.A00();
        C180537zh c180537zh = new C180537zh(context, A00, R.dimen.account_discovery_bottom_gap, true, false, true);
        c180537zh.setCallback(this);
        this.A00 = c180537zh;
        C6RB A0X = AbstractC167007dF.A0X(context, A0B, dimensionPixelSize);
        AbstractC180577zl.A00(context, AbstractC15960qq.A00(context).A02(EnumC15950qp.A11), A0X, C05F.A0C);
        AbstractC167017dG.A10(context, A0X, R.attr.igds_color_text_on_white);
        AbstractC166997dE.A1B(context.getResources(), A0X, R.dimen.ai_agent_share_profile_sticker_padding);
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(R.dimen.abc_button_inset_vertical_material, typedValue, true);
        A0X.A0B(typedValue.getFloat(), 1.0f);
        AbstractC166987dD.A1Q(context, A0X, 2131964308);
        AbstractC167027dH.A0b(context, this, A0X, 3);
        this.A0B = A0X;
        this.A0C = AE3.A01(context, this, A00);
        C216109hT c216109hT = new C216109hT(context);
        c216109hT.setCallback(this);
        this.A09 = c216109hT;
        this.A02 = AbstractC180527zg.A01(context, userSession, this).A00();
    }

    @Override // X.C8P8
    public final void EU6(float f) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        this.A00.draw(canvas);
        this.A0B.draw(canvas);
        this.A0C.draw(canvas);
        this.A09.draw(canvas);
        this.A02.draw(canvas);
        this.A0A.draw(canvas);
    }

    @Override // X.C5RN
    public final List A07() {
        Drawable[] drawableArr = {this.A00, this.A0B, this.A0C, this.A09, this.A0A};
        C14360o3.A0B(drawableArr, 0);
        return AbstractC009903n.A0I(drawableArr);
    }

    @Override // X.AbstractC130945vi
    public final Integer A08() {
        return C05F.A0u;
    }

    @Override // X.C8P8
    public final /* synthetic */ Integer AjE() {
        return null;
    }

    @Override // X.C8P8
    public final PromptStickerModel BUK() {
        return this.A03;
    }

    @Override // X.C5RR
    public final C5NL C0T() {
        return this.A03;
    }

    @Override // X.C8P8
    public final /* synthetic */ void Ekz() {
        this.A02.A01();
    }

    @Override // X.C8P8
    public final void FAk(Integer num) {
        this.A02.A00();
        AbstractC167027dH.A0g(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A04 + this.A05 + this.A0A.A08();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A01;
    }

    @Override // X.C5RN, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A00.setAlpha(i);
        this.A0B.setAlpha(i);
        this.A0C.setAlpha(i);
        this.A09.setAlpha(i);
        this.A0A.setAlpha(i);
        if (i == 0) {
            this.A02.A00();
        }
    }

    @Override // X.C8P8
    public final Integer Aj1() {
        return Integer.valueOf(getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float f = (i + i3) / 2.0f;
        float A03 = AbstractC166987dD.A03(i2, i4, 2.0f);
        float f2 = this.A01 / 2.0f;
        float A05 = AbstractC166987dD.A05(this);
        float f3 = A03 - A05;
        AbstractC216079hQ abstractC216079hQ = this.A0A;
        int i5 = (int) (f - f2);
        int i6 = (int) (f2 + f);
        this.A00.setBounds(i5, (int) (abstractC216079hQ.A08() + f3), i6, (int) (A03 + A05));
        abstractC216079hQ.setBounds(i5, (int) f3, i6, (int) (f3 + AbstractC166987dD.A06(abstractC216079hQ)));
        C6RB c6rb = this.A0B;
        int A0D = AbstractC166987dD.A0D(abstractC216079hQ);
        int i7 = this.A08;
        c6rb.setBounds((int) (f - (c6rb.A0A / 2.0f)), A0D + i7, (int) ((c6rb.A0A / 2.0f) + f), AbstractC166987dD.A0D(abstractC216079hQ) + i7 + c6rb.A06);
        C124385ju c124385ju = this.A0C;
        int A0D2 = AbstractC166987dD.A0D(c6rb);
        int i8 = this.A06;
        c124385ju.setBounds(i5, A0D2 + i8, i6, AbstractC166987dD.A0F(c124385ju, AbstractC166987dD.A0D(c6rb) + i8));
        C216109hT c216109hT = this.A09;
        C6RB c6rb2 = c216109hT.A00;
        int A0D3 = AbstractC166987dD.A0D(c124385ju);
        int i9 = this.A07;
        c216109hT.setBounds((int) (f - (c6rb2.A0A / 2.0f)), A0D3 + i9, (int) (f + (c6rb2.A0A / 2.0f)), AbstractC166987dD.A0D(c124385ju) + i9 + c6rb2.A06);
    }
}
