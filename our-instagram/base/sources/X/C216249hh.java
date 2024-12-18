package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.9hh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C216249hh extends C5RN implements InterfaceC133125ze {
    public final Context A00;
    public final UserSession A01;
    public final C8F9 A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F;
    public final InterfaceC09390do A0G;
    public final InterfaceC09390do A0H;
    public final InterfaceC09390do A0I;
    public final InterfaceC09390do A0J;

    public C216249hh(Context context, UserSession userSession, C8F9 c8f9) {
        C14360o3.A0B(context, 1);
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = c8f9;
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A0J = A00(this, enumC09460dv, 27);
        this.A0D = A00(this, enumC09460dv, 21);
        this.A0B = A00(this, enumC09460dv, 19);
        this.A04 = A00(this, enumC09460dv, 12);
        this.A0I = A00(this, enumC09460dv, 26);
        this.A07 = A00(this, enumC09460dv, 15);
        this.A09 = A00(this, enumC09460dv, 17);
        this.A0H = A00(this, enumC09460dv, 25);
        this.A0G = A00(this, enumC09460dv, 24);
        this.A0E = A00(this, enumC09460dv, 22);
        this.A0A = AbstractC09440dt.A01(new B8P(this, 18));
        this.A05 = A00(this, enumC09460dv, 13);
        this.A03 = A00(this, enumC09460dv, 11);
        this.A0C = A00(this, enumC09460dv, 20);
        this.A0F = A00(this, enumC09460dv, 23);
        this.A06 = A00(this, enumC09460dv, 14);
        this.A08 = A00(this, enumC09460dv, 16);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        Drawable A0a = AbstractC166987dD.A0a(this.A05);
        if (A0a != null) {
            A0a.draw(canvas);
        }
        AbstractC167007dF.A0v(canvas, this.A03);
        AbstractC167007dF.A0v(canvas, this.A0C);
        Drawable A0a2 = AbstractC166987dD.A0a(this.A0F);
        if (A0a2 != null) {
            A0a2.draw(canvas);
        }
        AbstractC167007dF.A0v(canvas, this.A06);
        AbstractC167007dF.A0v(canvas, this.A08);
    }

    public static InterfaceC09390do A00(Object obj, EnumC09460dv enumC09460dv, int i) {
        return AbstractC09440dt.A00(enumC09460dv, new B8P(obj, i));
    }

    @Override // X.C5RN
    public final List A07() {
        Drawable[] drawableArr = {AbstractC166987dD.A0a(this.A05), AbstractC166987dD.A0a(this.A03), AbstractC166987dD.A0a(this.A0C), AbstractC166987dD.A0a(this.A0F), AbstractC166987dD.A0a(this.A06), AbstractC166987dD.A0a(this.A08)};
        C14360o3.A0B(drawableArr, 0);
        return AbstractC009903n.A0I(drawableArr);
    }

    @Override // X.InterfaceC133125ze
    public final String C5K() {
        return "message_share_sticker_id";
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        int i;
        Drawable A0a = AbstractC166987dD.A0a(this.A0F);
        if (A0a != null) {
            i = A0a.getIntrinsicHeight() + AbstractC167027dH.A01(this.A0H);
        } else {
            i = 0;
        }
        return ((C216229hf) this.A03.getValue()).A00 + AbstractC167027dH.A02(this.A0C) + i + AbstractC167027dH.A02(this.A06) + AbstractC167027dH.A02(this.A08) + (AbstractC167027dH.A01(this.A0B) * 3);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return AbstractC167027dH.A01(this.A0J);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        Drawable A0a = AbstractC166987dD.A0a(this.A05);
        if (A0a != null) {
            A0a.setBounds(i, ((C216229hf) this.A03.getValue()).A00 + i2, i3, i4);
        }
        float f = (i + i3) / 2.0f;
        InterfaceC09390do interfaceC09390do = this.A0C;
        int A03 = (int) AbstractC167007dF.A03(AbstractC166987dD.A0a(interfaceC09390do), f);
        InterfaceC09390do interfaceC09390do2 = this.A03;
        int i5 = ((C216229hf) interfaceC09390do2.getValue()).A00 + i2;
        int A02 = AbstractC167027dH.A02(interfaceC09390do) + i5;
        AbstractC166997dE.A1G(AbstractC166987dD.A0a(interfaceC09390do), A03, i5, AbstractC166987dD.A0a(interfaceC09390do).getIntrinsicWidth() + A03, A02);
        Drawable A0a2 = AbstractC166987dD.A0a(this.A0F);
        if (A0a2 != null) {
            int A032 = (int) AbstractC167007dF.A03(A0a2, f);
            int A01 = A02 + AbstractC167027dH.A01(this.A0H);
            int intrinsicHeight = A0a2.getIntrinsicHeight() + A01;
            A0a2.setBounds(A032, A01, A0a2.getIntrinsicWidth() + A032, intrinsicHeight);
            A02 = intrinsicHeight;
        }
        InterfaceC09390do interfaceC09390do3 = this.A0B;
        int A012 = A02 + AbstractC167027dH.A01(interfaceC09390do3);
        InterfaceC09390do interfaceC09390do4 = this.A06;
        int A022 = AbstractC167027dH.A02(interfaceC09390do4) + A012;
        AbstractC166987dD.A0a(interfaceC09390do2).setBounds(i, i2, i3, A012);
        AbstractC166987dD.A0a(interfaceC09390do4).setBounds(i, A012, i3, A022);
        InterfaceC09390do interfaceC09390do5 = this.A08;
        int A033 = (int) AbstractC167007dF.A03(AbstractC166987dD.A0a(interfaceC09390do5), f);
        int A013 = A022 + AbstractC167027dH.A01(interfaceC09390do3);
        AbstractC166987dD.A0a(interfaceC09390do5).setBounds(A033, A013, AbstractC166987dD.A0a(interfaceC09390do5).getIntrinsicWidth() + A033, AbstractC167027dH.A02(interfaceC09390do5) + A013);
    }
}
