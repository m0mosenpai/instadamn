package X;

import android.content.Context;
import android.graphics.Canvas;
import com.instagram.api.schemas.FanClubStoriesTeaserType;
import java.util.List;

/* renamed from: X.9hU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C216119hU extends C5RN {
    public final C6RB A00;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        this.A00.draw(canvas);
    }

    @Override // X.C5RN
    public final List A07() {
        return AbstractC166987dD.A1J(this.A00);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A00.A06;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A00.A0A;
    }

    public C216119hU(Context context, FanClubStoriesTeaserType fanClubStoriesTeaserType) {
        float A04 = AbstractC13880nE.A04(context, 14);
        C6RB A0z = AbstractC166987dD.A0z(context, AbstractC166987dD.A0C(context, 270));
        this.A00 = A0z;
        AbstractC166987dD.A1U(EnumC15950qp.A13, AbstractC15960qq.A00(context), A0z);
        A0z.A0A(A04);
        AbstractC166997dE.A1A(context, A0z, AbstractC53242c7.A0C(context));
        AbstractC166987dD.A1Q(context, A0z, fanClubStoriesTeaserType == FanClubStoriesTeaserType.A04 ? 2131974839 : 2131974838);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float f = (i + i3) / 2.0f;
        float A03 = AbstractC166987dD.A03(i2, i4, 2.0f);
        float f2 = r2.A0A / 2.0f;
        AbstractC167017dG.A1M(this.A00, f - f2, A03, f + f2);
    }
}
