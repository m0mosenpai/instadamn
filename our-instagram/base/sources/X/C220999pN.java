package X;

import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.TypedValue;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.reels.prompt.model.PromptStickerModel;
import java.util.List;

/* renamed from: X.9pN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C220999pN extends AbstractC130945vi implements C8P8, C5RR, InterfaceC133125ze {
    public C180537zh A00;
    public AbstractC216079hQ A01;
    public final int A02;
    public final C6RL A03;
    public final PromptStickerModel A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final Context A0B;
    public final UserSession A0C;
    public final C216129hV A0D;
    public final C180547zi A0E;
    public final C6RB A0F;
    public final C124385ju A0G;
    public final String A0H;

    public C220999pN(Context context, UserSession userSession, PromptStickerModel promptStickerModel, String str) {
        int i;
        C14360o3.A0B(promptStickerModel, 4);
        this.A0B = context;
        this.A0C = userSession;
        this.A0H = str;
        this.A04 = promptStickerModel;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.achievements_list_container_height);
        this.A02 = dimensionPixelSize;
        int A0B = AbstractC167017dG.A0B(context);
        this.A09 = AbstractC167017dG.A06(context);
        this.A0A = AbstractC167017dG.A04(context);
        this.A07 = AbstractC167017dG.A03(context);
        this.A08 = AbstractC167017dG.A0E(context);
        int i2 = 0;
        Integer num = null;
        C221129pa c221129pa = new C221129pa(context, this.A04, str, false);
        c221129pa.setCallback(this);
        this.A01 = c221129pa;
        int A00 = this.A04.A00();
        this.A05 = A00;
        C180537zh c180537zh = new C180537zh(context, A00, R.dimen.abc_select_dialog_padding_start_material, true, false, true);
        c180537zh.setCallback(this);
        this.A00 = c180537zh;
        C6RB A0X = AbstractC167007dF.A0X(context, A0B, dimensionPixelSize);
        Integer num2 = C05F.A0C;
        Context context2 = A0X.A0Z;
        C14360o3.A07(context2);
        AbstractC180577zl.A00(context2, AbstractC15960qq.A00(context2).A02(EnumC15950qp.A11), A0X, num2);
        AbstractC166997dE.A1B(context2.getResources(), A0X, R.dimen.abc_select_dialog_padding_start_material);
        TypedValue typedValue = new TypedValue();
        context2.getResources().getValue(R.dimen.accent_edge_thickness, typedValue, true);
        A0X.A0B(typedValue.getFloat(), 1.0f);
        int i3 = A45.A00;
        String text = this.A04.A00.getText();
        text = text == null ? "" : text;
        int i4 = A45.A01;
        int i5 = A45.A00;
        SpannableString spannableString = new SpannableString(text);
        String A0h = AbstractC167007dF.A0h(text);
        if (AbstractC002300n.A0f(A0h, "me", false)) {
            i = AbstractC001900j.A07(A0h, "me", A0h.length() - 1);
        } else {
            i = -1;
        }
        if (i == -1) {
            spannableString.setSpan(new ForegroundColorSpan(i4), 0, text.length(), 33);
        } else {
            spannableString.setSpan(new ForegroundColorSpan(i4), 0, i, 33);
            spannableString.setSpan(new ForegroundColorSpan(i5), i, text.length(), 33);
        }
        A0X.A0L(spannableString);
        A0X.A0F(i4);
        AbstractC167027dH.A0b(context2, this, A0X, 3);
        this.A0F = A0X;
        this.A0E = new C180547zi(context, this.A04, num, str, i2, i2, 248);
        this.A0G = AE3.A01(context, this, A00);
        C216129hV c216129hV = new C216129hV(context, this.A04.A01(context));
        c216129hV.setCallback(this);
        this.A0D = c216129hV;
        this.A03 = AbstractC180527zg.A01(context, userSession, this).A00();
        this.A06 = this.A01.getIntrinsicHeight();
    }

    @Override // X.C8P8
    public final void EU6(float f) {
    }

    @Override // X.C8P8
    public final void FAk(Integer num) {
        C14360o3.A0B(num, 0);
        boolean A1X = AbstractC167007dF.A1X(num, C05F.A01);
        this.A03.A00();
        Context context = this.A0B;
        C180537zh c180537zh = new C180537zh(context, this.A05, R.dimen.account_discovery_bottom_gap, !A1X, false, true);
        c180537zh.setCallback(this);
        this.A00 = c180537zh;
        C221129pa c221129pa = new C221129pa(context, this.A04, this.A0H, A1X);
        c221129pa.setCallback(this);
        this.A01 = c221129pa;
        AbstractC167027dH.A0g(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        this.A00.draw(canvas);
        this.A0F.draw(canvas);
        this.A0E.draw(canvas);
        if (this.A04.A01 == 0) {
            this.A0G.draw(canvas);
            this.A0D.draw(canvas);
            this.A03.draw(canvas);
        }
        this.A01.draw(canvas);
    }

    @Override // X.C5RN
    public final List A07() {
        return AbstractC16960so.A1Q(this.A00, this.A0F, this.A0E, this.A0G, this.A0D, this.A01);
    }

    @Override // X.AbstractC130945vi
    public final Integer A08() {
        return C05F.A0u;
    }

    @Override // X.C8P8
    public final Integer Aj1() {
        return Integer.valueOf(this.A0D.A00.A06 + (this.A08 * 2));
    }

    @Override // X.C8P8
    public final /* synthetic */ Integer AjE() {
        return null;
    }

    @Override // X.C8P8
    public final PromptStickerModel BUK() {
        return this.A04;
    }

    @Override // X.C5RR
    public final C5NL C0T() {
        return this.A04;
    }

    @Override // X.InterfaceC133125ze
    public final String C5K() {
        if (this.A04.A0H()) {
            return "clips_prompt_sticker_bundle_id";
        }
        return "prompt_sticker_bundle_id";
    }

    @Override // X.C8P8
    public final /* synthetic */ void Ekz() {
        this.A03.A01();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return AbstractC166987dD.A0F(this.A0G, this.A0F.A06 + this.A0E.A01 + this.A0A) + this.A0D.A00.A06 + this.A09 + this.A07 + (this.A08 * 2) + this.A06;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A02;
    }

    @Override // X.C5RN, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A00.setAlpha(i);
        this.A0F.setAlpha(i);
        this.A0E.setAlpha(i);
        this.A0G.setAlpha(i);
        this.A0D.setAlpha(i);
        this.A01.setAlpha(i);
        if (i == 0) {
            this.A03.A00();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        super.setBounds(i, i2, i3, i4);
        float f = (i + i3) / 2.0f;
        float A03 = AbstractC166987dD.A03(i2, i4, 2.0f);
        float f2 = this.A02 / 2.0f;
        float A01 = AbstractC167007dF.A01(this, A03);
        int i9 = (int) (f - f2);
        int i10 = (int) (f2 + f);
        this.A00.setBounds(i9, (int) (this.A01.A08() + A01), i10, (int) (AbstractC166987dD.A05(this) + A03));
        AbstractC216079hQ abstractC216079hQ = this.A01;
        abstractC216079hQ.setBounds(i9, (int) A01, i10, (int) (A01 + AbstractC166987dD.A06(abstractC216079hQ)));
        int A0D = AbstractC166987dD.A0D(this.A01);
        int i11 = this.A04.A01;
        C6RB c6rb = this.A0F;
        if (i11 != 0) {
            int i12 = c6rb.A06;
            float f3 = c6rb.A0A / 2.0f;
            i5 = (int) (f - f3);
            float f4 = A03 - ((i12 + this.A09) / 2.0f);
            i6 = (int) f4;
            i7 = (int) (f3 + f);
            i8 = (int) (f4 + i12);
        } else {
            float f5 = c6rb.A0A / 2.0f;
            i5 = (int) (f - f5);
            i6 = this.A09 + A0D;
            i7 = (int) (f5 + f);
            i8 = c6rb.A06 + i6;
        }
        c6rb.setBounds(i5, i6, i7, i8);
        int A0D2 = AbstractC166987dD.A0D(c6rb);
        C180547zi c180547zi = this.A0E;
        int A032 = (int) AbstractC167007dF.A03(c180547zi, f);
        int i13 = this.A0A + A0D2;
        c180547zi.setBounds(A032, i13, (int) ((c180547zi.getIntrinsicWidth() / 2.0f) + f), c180547zi.A01 + i13);
        int A0D3 = AbstractC166987dD.A0D(c180547zi);
        C124385ju c124385ju = this.A0G;
        int i14 = A0D3 + this.A07;
        c124385ju.setBounds(i9, i14, i10, AbstractC166987dD.A0F(c124385ju, i14));
        C216129hV c216129hV = this.A0D;
        int A033 = (int) AbstractC167007dF.A03(c216129hV, f);
        int A0D4 = AbstractC166987dD.A0D(c124385ju);
        int i15 = this.A08;
        c216129hV.setBounds(A033, A0D4 + i15, (int) AbstractC167007dF.A02(c216129hV, f), AbstractC166987dD.A0D(c124385ju) + i15 + c216129hV.A00.A06);
    }
}
