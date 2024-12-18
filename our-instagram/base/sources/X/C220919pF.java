package X;

import android.content.Context;
import android.graphics.Canvas;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.9pF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C220919pF extends AbstractC130945vi implements C5RR {
    public final AlC A00;
    public final C220799p3 A01;
    public final boolean A02;
    public final boolean A03;
    public final List A04;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C220919pF(Context context, UserSession userSession, AlC alC, String str) {
        this(context, userSession, alC, str, false);
        AbstractC167027dH.A13(userSession, context, alC);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        this.A01.draw(canvas);
    }

    @Override // X.C5RN
    public final List A07() {
        return this.A04;
    }

    @Override // X.C5RR
    public final C5NL C0T() {
        return this.A00;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A01.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A01.A06;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        this.A01.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.A01.setBounds(i, i2, i3, i4);
    }

    public C220919pF(Context context, UserSession userSession, AlC alC, String str, boolean z) {
        C14360o3.A0B(context, 2);
        this.A00 = alC;
        C220799p3 c220799p3 = new C220799p3(context, userSession, alC, str, z);
        this.A01 = c220799p3;
        this.A04 = AbstractC16960so.A1N(c220799p3);
        this.A03 = alC.A02;
        this.A02 = alC.A00.A06 == null;
        c220799p3.setCallback(this);
    }
}
