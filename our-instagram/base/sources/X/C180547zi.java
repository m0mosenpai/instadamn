package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import com.facebook.R;
import com.instagram.reels.prompt.model.PromptStickerModel;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7zi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C180547zi extends C5RN {
    public float A00;
    public final int A01;
    public final float A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final Context A06;
    public final Drawable A07;
    public final PromptStickerModel A08;
    public final C6RB A09;
    public final String A0A;
    public final List A0B;

    public C180547zi(Context context, PromptStickerModel promptStickerModel, Integer num, String str, float f, int i, int i2, int i3) {
        int i4;
        C6RB c6rb;
        C14360o3.A0B(context, 1);
        C14360o3.A0B(str, 2);
        C14360o3.A0B(promptStickerModel, 3);
        C14360o3.A0B(num, 4);
        this.A06 = context;
        this.A0A = str;
        this.A08 = promptStickerModel;
        this.A04 = i;
        this.A03 = i2;
        this.A05 = i3;
        this.A02 = f;
        this.A00 = 0.3f;
        Resources resources = context.getResources();
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue == 2) {
                    i4 = R.dimen.asset_picker_section_title_horizontal_padding;
                } else {
                    throw new RuntimeException();
                }
            } else {
                i4 = R.dimen.abc_select_dialog_padding_start_material;
            }
        } else {
            i4 = R.dimen.abc_alert_dialog_button_dimen;
        }
        this.A01 = resources.getDimensionPixelSize(i4);
        C180557zj c180557zj = new C180557zj(context, num, i, R.drawable.instagram_reply_pano_filled_24);
        c180557zj.setCallback(this);
        this.A07 = c180557zj;
        List B48 = promptStickerModel.A00.B48();
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : B48) {
            if (hashSet.add(((User) obj).getId())) {
                arrayList.add(obj);
            }
        }
        List<User> A0d = AbstractC001800i.A0d(arrayList, this.A03);
        ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(A0d, 10));
        for (User user : A0d) {
            int i5 = this.A01;
            int dimensionPixelSize = this.A06.getResources().getDimensionPixelSize(R.dimen.abc_control_corner_material);
            int i6 = this.A04;
            Context context2 = this.A06;
            C89533yt c89533yt = new C89533yt(user.Bhu(), this.A0A, i5, dimensionPixelSize, i6, context2.getColor(AbstractC53242c7.A0H(context2, R.attr.igds_color_secondary_icon)));
            c89533yt.setCallback(this);
            arrayList2.add(c89533yt);
        }
        this.A0B = arrayList2;
        if (this.A08.A00.BbW() > this.A03) {
            Integer valueOf = Integer.valueOf(this.A08.A00.BbW() - this.A03);
            Resources resources2 = this.A06.getResources();
            C14360o3.A07(resources2);
            String A04 = C84963qk.A04(resources2, valueOf, 1000, false, false);
            Spannable spannable = C6RB.A0d;
            Context context3 = this.A06;
            c6rb = new C6RB(context3, context3.getResources().getDimensionPixelSize(R.dimen.browser_error_screen_description_width));
            c6rb.A0M(AnonymousClass001.A0D(A04, '+'));
            Integer num2 = C05F.A01;
            Context context4 = c6rb.A0Z;
            C14360o3.A07(context4);
            AbstractC180577zl.A00(context4, AbstractC15960qq.A00(context4).A02(EnumC15950qp.A13), c6rb, num2);
            c6rb.A0F(context4.getColor(R.color.baseline_neutral_80));
            c6rb.A0A(this.A02);
            c6rb.setCallback(this);
        } else {
            c6rb = null;
        }
        this.A09 = c6rb;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        C6RB c6rb = this.A09;
        if (c6rb != null && c6rb.getBounds().left > this.A07.getBounds().left) {
            c6rb.draw(canvas);
        }
        List A0Y = AbstractC001800i.A0Y(this.A0B);
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(A0Y, 10));
        Iterator it = A0Y.iterator();
        while (it.hasNext()) {
            ((Drawable) it.next()).draw(canvas);
            arrayList.add(C0eB.A00);
        }
        if (!this.A08.A09) {
            this.A07.draw(canvas);
        }
    }

    @Override // X.C5RN
    public final List A07() {
        ArrayList A1N = AbstractC16960so.A1N(this.A07);
        A1N.addAll(this.A0B);
        C6RB c6rb = this.A09;
        if (c6rb != null) {
            A1N.add(c6rb);
        }
        return A1N;
    }

    public final int A08() {
        int i;
        C6RB c6rb = this.A09;
        if (c6rb == null) {
            i = 0;
        } else {
            i = c6rb.A0A + this.A05;
        }
        return (int) ((this.A01 * ((this.A0B.size() * 0.7f) + 1.0f)) + i);
    }

    public final void A09(float f) {
        this.A00 = f;
        setBounds(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A01;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        int i = this.A01;
        List list = this.A0B;
        float size = ((list.size() + 1) * i) - ((i * this.A00) * list.size());
        if (this.A09 != null) {
            size += (this.A05 + r0.A0A) * ((1.0f - this.A00) / 0.7f);
        }
        return (int) size;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float f = (i + i3) / 2.0f;
        float f2 = (i2 + i4) / 2.0f;
        float intrinsicWidth = f - (getIntrinsicWidth() / 2.0f);
        int i5 = this.A01;
        float f3 = i5;
        float f4 = f3 / 2.0f;
        float intrinsicWidth2 = f + (getIntrinsicWidth() / 2.0f);
        int i6 = (int) intrinsicWidth;
        int i7 = (int) (f2 - f4);
        int i8 = (int) (f4 + f2);
        this.A07.setBounds(i6, i7, i5 + i6, i8);
        List list = this.A0B;
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
        int i9 = 0;
        for (Object obj : list) {
            int i10 = i9 + 1;
            if (i9 < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            float f5 = (i10 * i5 * (1.0f - this.A00)) + intrinsicWidth;
            ((Drawable) obj).setBounds((int) f5, i7, (int) (f5 + f3), i8);
            arrayList.add(C0eB.A00);
            i9 = i10;
        }
        C6RB c6rb = this.A09;
        if (c6rb != null) {
            float f6 = c6rb.A06 / 2;
            c6rb.setBounds((int) (intrinsicWidth2 - c6rb.A0A), (int) (f2 - f6), (int) intrinsicWidth2, (int) (f2 + f6));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C180547zi(android.content.Context r12, com.instagram.reels.prompt.model.PromptStickerModel r13, java.lang.Integer r14, java.lang.String r15, int r16, int r17, int r18) {
        /*
            r11 = this;
            r2 = r18
            r9 = r17
            r8 = r16
            r5 = r14
            r0 = r18 & 8
            if (r0 == 0) goto Ld
            java.lang.Integer r5 = X.C05F.A0C
        Ld:
            r0 = r18 & 16
            if (r0 == 0) goto L12
            r8 = -1
        L12:
            r0 = r18 & 32
            r4 = r13
            if (r0 == 0) goto L1f
            boolean r0 = r13.A0M()
            r9 = 3
            if (r0 == 0) goto L1f
            r9 = 2
        L1f:
            r0 = r18 & 64
            r3 = r12
            if (r0 == 0) goto L47
            android.content.res.Resources r1 = r12.getResources()
            r0 = 2131165195(0x7f07000b, float:1.79446E38)
            int r10 = r1.getDimensionPixelSize(r0)
        L2f:
            r0 = r2 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L45
            android.content.res.Resources r1 = r12.getResources()
            r0 = 2131165218(0x7f070022, float:1.7944647E38)
            int r0 = r1.getDimensionPixelSize(r0)
            float r7 = (float) r0
        L3f:
            r2 = r11
            r6 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L45:
            r7 = 0
            goto L3f
        L47:
            r10 = 0
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C180547zi.<init>(android.content.Context, com.instagram.reels.prompt.model.PromptStickerModel, java.lang.Integer, java.lang.String, int, int, int):void");
    }
}
