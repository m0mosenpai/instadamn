package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;

/* renamed from: X.9k5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C217729k5 extends C194808jg implements InterfaceC25211BDj {
    public final double A00;
    public final double A01;
    public final double A02;
    public final double A03;
    public final double A04;

    @Override // X.InterfaceC25211BDj
    public final double Btc() {
        return this.A00;
    }

    @Override // X.InterfaceC25211BDj
    public final double Btd() {
        return this.A01;
    }

    @Override // X.InterfaceC25211BDj
    public final double Bte() {
        return this.A02;
    }

    @Override // X.InterfaceC25211BDj
    public final double Btf() {
        return this.A03;
    }

    @Override // X.InterfaceC25211BDj
    public final double Btg() {
        return this.A04;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.9kH] */
    public C217729k5(Context context, Drawable drawable, UserSession userSession, C148276lx c148276lx, double d, double d2, double d3, double d4, double d5) {
        super(context, userSession, c148276lx.A0I, AbstractC166987dD.A1J(drawable));
        this.A03 = d;
        this.A04 = d2;
        this.A02 = d3;
        this.A00 = d4;
        this.A01 = d5;
        ?? obj = new Object();
        obj.A00 = c148276lx;
        super.A03 = obj;
    }
}
