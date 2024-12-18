package X;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.6WR, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6WR extends Drawable implements InterfaceC147106jm {
    public String A00;
    public final List A01;
    public final Map A02;
    public final float A03;
    public final float A04;
    public final Paint A05;
    public final Paint A06;
    public final Rect A07;
    public final UserSession A08;
    public final float[] A09;

    public C6WR(Context context, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        Paint paint = new Paint(1);
        this.A05 = paint;
        this.A01 = new ArrayList();
        this.A02 = new HashMap();
        this.A09 = new float[3];
        paint.setStrokeWidth(AbstractC13880nE.A04(context, 2));
        Paint paint2 = new Paint(1);
        this.A06 = paint2;
        paint2.setColor(-16777216);
        this.A07 = new Rect();
        this.A03 = AbstractC13880nE.A04(context, 9);
        this.A04 = AbstractC13880nE.A04(context, 3);
        this.A08 = userSession;
    }

    @Override // X.InterfaceC147106jm
    public final void DRJ(String str, String str2) {
        C14360o3.A0B(str2, 1);
        this.A02.put(str2, VD3.A02);
        invalidateSelf();
    }

    @Override // X.InterfaceC147106jm
    public final void DRW(String str, String str2) {
        C14360o3.A0B(str2, 1);
        this.A02.put(str2, VD3.A03);
        invalidateSelf();
    }

    @Override // X.InterfaceC147106jm
    public final void DSI(String str, String str2) {
        C14360o3.A0B(str2, 1);
        Map map = this.A02;
        if (map.get(str2) != VD3.A06) {
            map.put(str2, VD3.A04);
            invalidateSelf();
        }
    }

    @Override // X.InterfaceC147106jm
    public final void DSL(String str, String str2) {
        C14360o3.A0B(str2, 1);
        this.A02.put(str2, VD3.A06);
        invalidateSelf();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b2, code lost:
    
        if (r2 != 4) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0162  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r36) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6WR.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // X.InterfaceC147106jm
    public final void DOA(String str) {
        invalidateSelf();
    }

    @Override // X.InterfaceC147106jm
    public final void DOB(String str) {
        invalidateSelf();
    }

    @Override // X.InterfaceC147106jm
    public final void DOC(String str, boolean z) {
        invalidateSelf();
    }
}
