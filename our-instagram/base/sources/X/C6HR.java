package X;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.util.Base64;
import com.instagram.common.session.UserSession;

/* renamed from: X.6HR, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6HR {
    public Bitmap A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final boolean A09;
    public final byte[] A0A;

    public C6HR(UserSession userSession) {
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A09 = C18U.A06(c06090Tz, userSession, 36322525538887988L);
        this.A0A = Base64.decode(C18U.A04(c06090Tz, userSession, 36885475491709567L), 0);
        int i = 0;
        try {
            i = Color.parseColor(C18U.A04(c06090Tz, userSession, 36885475491775104L));
        } catch (IllegalArgumentException | IndexOutOfBoundsException unused) {
        }
        this.A04 = i;
        int i2 = 0;
        try {
            i2 = Color.parseColor(C18U.A04(c06090Tz, userSession, 36885475492102789L));
        } catch (IllegalArgumentException | IndexOutOfBoundsException unused2) {
        }
        this.A03 = i2;
        int i3 = 0;
        try {
            i3 = Color.parseColor(C18U.A04(c06090Tz, userSession, 36885475491906178L));
        } catch (IllegalArgumentException | IndexOutOfBoundsException unused3) {
        }
        this.A06 = i3;
        int i4 = 0;
        try {
            i4 = Color.parseColor(C18U.A04(c06090Tz, userSession, 36885475491971715L));
        } catch (IllegalArgumentException | IndexOutOfBoundsException unused4) {
        }
        this.A05 = i4;
        int i5 = 0;
        try {
            i5 = Color.parseColor(C18U.A04(c06090Tz, userSession, 36885475491840641L));
        } catch (IllegalArgumentException | IndexOutOfBoundsException unused5) {
        }
        this.A08 = i5;
        int i6 = 0;
        try {
            i6 = Color.parseColor(C18U.A04(c06090Tz, userSession, 36885475492037252L));
        } catch (IllegalArgumentException | IndexOutOfBoundsException unused6) {
        }
        this.A07 = i6;
        this.A01 = (float) C18U.A01(c06090Tz, userSession, 36604000514806796L);
        this.A02 = (float) C18U.A01(c06090Tz, userSession, 36604000514872333L);
        C18U.A04(c06090Tz, userSession, 36885475492430473L);
    }
}
