package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9hb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C216189hb extends C5RN {
    public C6RB A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final Context A05;
    public final C217859kI A06;
    public final List A07;
    public final List A08;
    public final boolean A09;
    public final int A0A;
    public final String A0B;

    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean, int] */
    public C216189hb(Context context, C217859kI c217859kI, String str) {
        float f;
        this.A05 = context;
        this.A0B = str;
        this.A06 = c217859kI;
        this.A0A = AbstractC167017dG.A07(context);
        this.A02 = AbstractC167017dG.A09(context);
        this.A01 = context.getResources().getDimension(R.dimen.account_recs_header_image_margin);
        List list = c217859kI.A00().A04;
        this.A08 = list;
        ?? r0 = list.size() > 5 ? 1 : 0;
        this.A09 = r0;
        int i = 5 - r0;
        this.A04 = i;
        List A0d = AbstractC001800i.A0d(list, i);
        ArrayList A0q = AbstractC167017dG.A0q(A0d);
        Iterator it = A0d.iterator();
        while (it.hasNext()) {
            C89533yt c89533yt = new C89533yt(((User) it.next()).Bhu(), this.A0B, this.A02, this.A0A, AbstractC22747A1r.A00(this.A06), this.A05.getColor(R.color.fds_transparent));
            c89533yt.setCallback(this);
            A0q.add(c89533yt);
        }
        this.A07 = A0q;
        C6RB c6rb = null;
        if (this.A09) {
            C6RB A0z = AbstractC166987dD.A0z(this.A05, this.A02);
            A0z.A0M(AnonymousClass001.A00('+', this.A08.size() - this.A04));
            AbstractC166997dE.A1B(A0z.A0Z.getResources(), A0z, R.dimen.add_payment_bottom_sheet_row_subtitle_size);
            A0z.A0F(A00(this));
            A0z.A0J(null, 1);
            c6rb = A0z;
        }
        this.A00 = c6rb;
        float size = (this.A02 * A0q.size()) - ((this.A02 * 0.4f) * (A0q.size() - 1));
        if (this.A00 != null) {
            f = Math.max(r0.A0A + this.A01, this.A02 * 0.6f);
        } else {
            f = 0.0f;
        }
        this.A03 = (int) (size + f);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        List A0Y = AbstractC001800i.A0Y(this.A07);
        ArrayList A0q = AbstractC167017dG.A0q(A0Y);
        Iterator it = A0Y.iterator();
        while (it.hasNext()) {
            AbstractC166987dD.A0Z(it).draw(canvas);
            A0q.add(C0eB.A00);
        }
        C6RB c6rb = this.A00;
        if (c6rb != null) {
            c6rb.draw(canvas);
        }
    }

    public static final int A00(C216189hb c216189hb) {
        boolean z = false;
        if (AbstractC13950nL.A01(AbstractC22747A1r.A00(c216189hb.A06)) < 0.25d) {
            z = true;
        }
        Context context = c216189hb.A05;
        int i = R.color.black;
        if (z) {
            i = R.color.design_dark_default_color_on_background;
        }
        return context.getColor(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A02;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A03;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float A03 = AbstractC166987dD.A03(i2, i4, 2.0f);
        int i5 = (int) (((i + i3) / 2.0f) - (this.A03 / 2.0f));
        int i6 = this.A02;
        int i7 = (int) (A03 - (i6 / 2.0f));
        int i8 = i6 + i7;
        List list = this.A07;
        ArrayList A0q = AbstractC167017dG.A0q(list);
        int i9 = 0;
        for (Object obj : list) {
            int i10 = i9 + 1;
            if (i9 < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            int i11 = (int) (i5 + (i9 * i6 * 0.6f));
            ((Drawable) obj).setBounds(i11, i7, i6 + i11, i8);
            A0q.add(C0eB.A00);
            i9 = i10;
        }
        C6RB c6rb = this.A00;
        if (c6rb != null) {
            int ceil = ((Drawable) AbstractC001800i.A0K(list)).getBounds().right + ((int) Math.ceil(this.A01));
            c6rb.setBounds(ceil, (int) (A03 - (c6rb.A06 / 2.0f)), c6rb.A0A + ceil, i8);
        }
    }

    @Override // X.C5RN
    public final List A07() {
        ArrayList A1E = AbstractC166987dD.A1E();
        A1E.addAll(this.A07);
        C6RB c6rb = this.A00;
        if (c6rb != null) {
            A1E.add(c6rb);
        }
        return A1E;
    }
}
