package X;

import android.graphics.drawable.Drawable;
import com.instagram.common.notifications.push.intf.PushChannelType;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.FeW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35129FeW {
    public final long A00;
    public final Drawable A01;
    public final Drawable A02;
    public final PushChannelType A03;
    public final ImageUrl A04;
    public final ImageUrl A05;
    public final ImageUrl A06;
    public final C32053E6f A07;
    public final GZB A08;
    public final GZC A09;
    public final Integer A0A;
    public final Long A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final boolean A0K;

    public static void A01(C34648FOf c34648FOf, C2OG c2og) {
        c2og.A0A(new C35129FeW(c34648FOf));
    }

    public C35129FeW(C34648FOf c34648FOf) {
        this.A0E = c34648FOf.A0J;
        this.A0I = c34648FOf.A0K;
        String str = c34648FOf.A0G;
        this.A0H = str == null ? "unknown_type" : str;
        this.A04 = c34648FOf.A04;
        this.A05 = c34648FOf.A05;
        this.A01 = c34648FOf.A01;
        this.A0A = c34648FOf.A0A;
        this.A06 = c34648FOf.A06;
        this.A02 = c34648FOf.A02;
        this.A0J = c34648FOf.A0H;
        this.A0F = c34648FOf.A0E;
        this.A0C = c34648FOf.A0C;
        this.A0K = c34648FOf.A0I;
        this.A08 = c34648FOf.A08;
        this.A00 = c34648FOf.A00;
        this.A09 = c34648FOf.A09;
        this.A0G = c34648FOf.A0F;
        this.A0D = c34648FOf.A0D;
        this.A03 = c34648FOf.A03;
        this.A0B = c34648FOf.A0B;
        this.A07 = c34648FOf.A07;
    }

    public static C34648FOf A00(String str) {
        return new C34648FOf(AbstractC166997dE.A0n(), str);
    }
}
