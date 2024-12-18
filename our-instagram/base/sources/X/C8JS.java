package X;

import android.graphics.Matrix;
import com.instagram.common.session.UserSession;

/* renamed from: X.8JS, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8JS extends AbstractC52922bZ {
    public float A00;
    public float A01;
    public float A04;
    public float A05;
    public int A06;
    public int A07;
    public Matrix A0A;
    public boolean A0B;
    public boolean A0C;
    public final C2GT A0D;
    public final C2GS A0E;
    public final UserSession A0F;
    public int A09 = 1080;
    public int A08 = 1920;
    public float A02 = 1.0f;
    public float A03 = 1.0f;

    public final void A00() {
        this.A0A = new Matrix();
        this.A00 = 1.0f;
        this.A01 = 1.0f;
        this.A02 = 1.0f;
        this.A03 = 1.0f;
        this.A04 = 1.0f;
        this.A05 = 1.0f;
        this.A0C = false;
    }

    public final void A01(int i, int i2, int i3, int i4) {
        this.A09 = i;
        this.A08 = i2;
        this.A07 = i3;
        this.A06 = i4;
        this.A00 = 1.0f;
        this.A01 = 1.0f;
        this.A02 = 1.0f;
        this.A03 = 1.0f;
        this.A04 = 1.0f;
        this.A05 = 1.0f;
        this.A0C = false;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.2GT, X.2GS] */
    public C8JS(UserSession userSession) {
        this.A0F = userSession;
        ?? c2gt = new C2GT(null);
        this.A0E = c2gt;
        this.A0D = c2gt;
        this.A0A = new Matrix();
        this.A00 = 1.0f;
        this.A01 = 1.0f;
        this.A04 = 1.0f;
        this.A05 = 1.0f;
    }
}
