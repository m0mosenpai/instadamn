package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import ca.psiphon.PsiphonTunnel;
import com.facebook.android.maps.StaticMapView$StaticMapOptions;
import com.facebook.android.maps.model.CameraPosition;
import com.facebook.android.maps.model.LatLng;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import com.instagram.maps.ui.IgStaticMapView;
import java.util.Comparator;
import java.util.Iterator;

/* renamed from: X.U6y, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC66278U6y implements InterfaceC71945XBu {
    public static int A0D;
    public static final Comparator A0E = new C65903Tw9(3);
    public double A00;
    public double A01;
    public float A02;
    public final int A05;
    public final Context A06;
    public final C70394WTw A07;
    public final WFW A08;
    public final float A0A;
    public final int A0B;
    public final float[] A0C = new float[2];
    public boolean A04 = true;
    public int A03 = 1;
    public final C2TB A09 = new Object();

    public abstract void A0D(Canvas canvas);

    public final void A05() {
        this.A07.A0I.invalidate();
    }

    public final void A06() {
        float f;
        float f2;
        float f3;
        float f4;
        if (this instanceof ULU) {
            ULU ulu = (ULU) this;
            C66356UBx c66356UBx = ((AbstractC66278U6y) ulu).A07.A0I;
            Rect rect = ulu.A03;
            Drawable drawable = ulu.A06;
            rect.set(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            int ordinal = ulu.A07.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        float width = c66356UBx.getWidth() - rect.width();
                        f4 = ulu.A00;
                        f2 = (width - f4) - 0.0f;
                    } else {
                        f4 = ulu.A00;
                        f2 = f4 + 0.0f;
                    }
                    f3 = ((c66356UBx.getHeight() - rect.height()) - f4) - 0.0f;
                    RectF rectF = ulu.A04;
                    rectF.set(rect);
                    rectF.offsetTo(f2, f3);
                    rect.offsetTo((int) f2, (int) f3);
                    float centerX = rectF.centerX();
                    float centerY = rectF.centerY();
                    RectF rectF2 = ulu.A05;
                    float f5 = ulu.A02;
                    rectF2.set(centerX - f5, centerY - f5, centerX + f5, centerY + f5);
                    return;
                }
                float width2 = c66356UBx.getWidth() - rect.width();
                f = ulu.A00;
                f2 = (width2 - f) - 0.0f;
            } else {
                f = ulu.A00;
                f2 = 0.0f + f;
            }
            f3 = f + 0.0f;
            RectF rectF3 = ulu.A04;
            rectF3.set(rect);
            rectF3.offsetTo(f2, f3);
            rect.offsetTo((int) f2, (int) f3);
            float centerX2 = rectF3.centerX();
            float centerY2 = rectF3.centerY();
            RectF rectF22 = ulu.A05;
            float f52 = ulu.A02;
            rectF22.set(centerX2 - f52, centerY2 - f52, centerX2 + f52, centerY2 + f52);
            return;
        }
        if (this instanceof ULY) {
            Iterator A12 = AbstractC43593JPy.A12(((ULY) this).A04);
            while (A12.hasNext()) {
                ((VZu) A12.next()).A00.A06();
            }
        } else {
            if (!(this instanceof ULV)) {
                return;
            }
            ULV ulv = (ULV) this;
            float f6 = ulv.A03 + 0.0f + ulv.A02;
            ulv.A00 = f6;
            ulv.A01 = f6;
        }
    }

    public final void A07() {
        if (this instanceof ULY) {
            ULY uly = (ULY) this;
            VZu vZu = uly.A00;
            if (vZu != null) {
                vZu.A00.A07();
            }
            uly.A00 = null;
        }
    }

    public final void A08() {
        C70394WTw c70394WTw = this.A07;
        if (this instanceof ULY) {
            c70394WTw.A0N.remove(this);
        }
        c70394WTw.A0O.remove(this);
        c70394WTw.A0I.invalidate();
    }

    public void A09(boolean z) {
        this.A04 = z;
        A05();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        if (r8 <= (r1 + r2)) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int A0A(float r7, float r8) {
        /*
            r6 = this;
            boolean r0 = r6 instanceof X.ULT
            if (r0 == 0) goto L1e
            r0 = r6
            X.ULT r0 = (X.ULT) r0
            X.Jiq r0 = r0.A01
            android.graphics.Rect r2 = r0.getBounds()
            int r1 = java.lang.Math.round(r7)
            int r0 = java.lang.Math.round(r8)
            boolean r0 = r2.contains(r1, r0)
            r3 = 0
            if (r0 == 0) goto L1d
        L1c:
            r3 = 2
        L1d:
            return r3
        L1e:
            boolean r0 = r6 instanceof X.ULV
            if (r0 == 0) goto L43
            r3 = r6
            X.ULV r3 = (X.ULV) r3
            float r4 = r3.A00
            float r2 = r3.A02
            float r0 = r4 - r2
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 < 0) goto L90
            float r0 = r4 + r2
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 > 0) goto L90
            float r1 = r3.A01
            float r0 = r1 - r2
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 < 0) goto L90
            float r1 = r1 + r2
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 > 0) goto L90
            goto L1c
        L43:
            boolean r0 = r6 instanceof X.ULU
            if (r0 == 0) goto L5d
            r1 = r6
            X.ULU r1 = (X.ULU) r1
            android.graphics.RectF r0 = r1.A04
            boolean r0 = r0.contains(r7, r8)
            if (r0 != 0) goto L1c
            android.graphics.RectF r0 = r1.A05
            boolean r0 = r0.contains(r7, r8)
            boolean r3 = X.AbstractC167007dF.A1M(r0)
            return r3
        L5d:
            boolean r0 = r6 instanceof X.ULY
            if (r0 == 0) goto Lab
            r5 = r6
            X.ULY r5 = (X.ULY) r5
            r0 = 0
            r5.A01 = r0
            java.util.Map r0 = r5.A04
            java.util.Iterator r4 = X.AbstractC43593JPy.A12(r0)
            r3 = 0
        L6e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L1d
            java.lang.Object r2 = r4.next()
            X.VZu r2 = (X.VZu) r2
            X.U6y r1 = r2.A00
            boolean r0 = r1.A04
            if (r0 == 0) goto L6e
            int r1 = r1.A0A(r7, r8)
            r0 = 2
            if (r1 != r0) goto L8a
            r5.A01 = r2
            goto L1c
        L8a:
            if (r1 <= r3) goto L6e
            r5.A01 = r2
            r3 = r1
            goto L6e
        L90:
            float r2 = r3.A09
            float r0 = r4 - r2
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 < 0) goto Lab
            float r4 = r4 + r2
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 > 0) goto Lab
            float r1 = r3.A01
            float r0 = r1 - r2
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 < 0) goto Lab
            float r1 = r1 + r2
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            r3 = 1
            if (r0 <= 0) goto L1d
        Lab:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC66278U6y.A0A(float, float):int");
    }

    public void A0B(float f, float f2) {
        VZu vZu;
        if ((this instanceof ULY) && (vZu = ((ULY) this).A01) != null) {
            vZu.A00.A0B(f, f2);
        }
    }

    public void A0C(float f, float f2) {
        VZu vZu;
        if ((this instanceof ULY) && (vZu = ((ULY) this).A01) != null) {
            vZu.A00.A0C(f, f2);
        }
    }

    public boolean A0E(float f, float f2) {
        VZu vZu;
        if ((this instanceof ULY) && (vZu = ((ULY) this).A01) != null && vZu.A00.A0E(f, f2)) {
            return true;
        }
        return false;
    }

    public boolean A0F(float f, float f2) {
        VZu vZu;
        if ((this instanceof ULY) && (vZu = ((ULY) this).A01) != null && vZu.A00.A0F(f, f2)) {
            return true;
        }
        return false;
    }

    public boolean A0G(float f, float f2) {
        ULY uly;
        VZu vZu;
        if (this instanceof ULT) {
            WlL wlL = ((ULT) this).A00;
            Activity activity = wlL.A01;
            UserSession userSession = wlL.A03;
            VDJ vdj = VDJ.A0U;
            if (!C1VW.isLocationPermitted(activity, userSession, "STORY_ARCHIVE_MAP")) {
                AbstractC68641VYw.A00.A05(userSession, new C4I7(new C70679Wez(wlL), userSession), "STORY_ARCHIVE_MAP", "CurrentLocationHelper::onCurrentLocationButtonTap");
                wlL.A00 = true;
                C1VW c1vw = C1VW.A00;
                c1vw.getClass();
                c1vw.requestLocationUpdates(userSession, activity, wlL.A04, wlL.A05, "MediaLocationMapMyLocationHelper", vdj);
                return true;
            }
            WlL.A00(wlL);
            return true;
        }
        if (this instanceof ULV) {
            C70394WTw c70394WTw = this.A07;
            C70109W4g c70109W4g = new C70109W4g();
            c70109W4g.A00 = 0.0f;
            c70394WTw.A09(c70109W4g, null, PsiphonTunnel.VPN_INTERFACE_MTU);
            return true;
        }
        if (this instanceof ULU) {
            ULU ulu = (ULU) this;
            C70394WTw c70394WTw2 = ((AbstractC66278U6y) ulu).A07;
            CameraPosition A02 = c70394WTw2.A02();
            C66356UBx c66356UBx = c70394WTw2.A0I;
            W55 w55 = ulu.A01;
            Context context = ((AbstractC66278U6y) ulu).A06;
            int width = c66356UBx.getWidth();
            int height = c66356UBx.getHeight();
            Resources resources = c70394WTw2.A0G.getResources();
            String str = C2TD.A03;
            StaticMapView$StaticMapOptions staticMapView$StaticMapOptions = new StaticMapView$StaticMapOptions(c66356UBx.A0N.A06);
            staticMapView$StaticMapOptions.A04 = "InfoButtonDrawable.java";
            LatLng latLng = A02.A03;
            StringBuilder sb = new StringBuilder();
            sb.append(latLng.A00);
            sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
            sb.append(latLng.A01);
            staticMapView$StaticMapOptions.A02 = sb.toString();
            staticMapView$StaticMapOptions.A03((int) A02.A02);
            w55.A01(context, IgStaticMapView.A00(resources, staticMapView$StaticMapOptions, str, width, height));
            return true;
        }
        if ((this instanceof ULY) && (vZu = (uly = (ULY) this).A01) != null && vZu.A00.A0G(f, f2)) {
            VZu vZu2 = uly.A01;
            VZu vZu3 = uly.A00;
            if (vZu3 != null && vZu3 != vZu2) {
                vZu3.A00.A07();
            }
            uly.A00 = vZu2;
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC71945XBu
    public final LatLng Bea() {
        if (this instanceof ULW) {
            return ((ULW) this).A06;
        }
        return new LatLng(WFW.A03(this.A01), WFW.A02(this.A00));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.2TB, java.lang.Object] */
    public AbstractC66278U6y(C70394WTw c70394WTw) {
        int i = A0D;
        A0D = i + 1;
        this.A05 = i;
        this.A07 = c70394WTw;
        this.A08 = c70394WTw.A0J;
        Context context = c70394WTw.A0I.getContext();
        this.A06 = context;
        this.A0A = AbstractC65702TsY.A00(context);
        this.A0B = c70394WTw.A0F;
    }

    @Override // X.InterfaceC71945XBu
    public String getId() {
        throw C00O.createAndThrow();
    }
}
