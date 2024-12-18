package X;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.ViewGroup;
import com.facebook.android.maps.model.CameraPosition;
import com.facebook.android.maps.model.LatLng;
import com.facebook.android.maps.model.LatLngBounds;
import com.facebook.common.dextricks.DexOptimizationMessageHandler;
import com.facebook.maps.delegate.common.interfaces.MapOptions;
import com.instagram.common.session.UserSession;
import java.lang.ref.Reference;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.Vvm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69800Vvm {
    public C69271Vkf A00;
    public C69717VuC A01;
    public final Context A02;
    public final InterfaceC71980XDp A03;
    public final UBT A04;
    public final InterfaceC71981XDq A05;
    public final InterfaceC71982XDr A06;
    public final ViewGroup A07;
    public final UserSession A08;

    public final ULQ A04(InterfaceC72044XLa interfaceC72044XLa) {
        C14360o3.A0B(interfaceC72044XLa, 0);
        C69717VuC c69717VuC = this.A01;
        if (c69717VuC != null) {
            C70374WTc c70374WTc = c69717VuC.A08;
            Reference reference = (Reference) c70374WTc.A01.get(interfaceC72044XLa.getId());
            if (reference == null) {
                return null;
            }
            return (ULQ) reference.get();
        }
        throw AbstractC166997dE.A0g();
    }

    public final HashSet A05(java.util.Set set) {
        Object obj;
        C14360o3.A0B(set, 0);
        C69717VuC c69717VuC = this.A01;
        if (c69717VuC != null) {
            C70374WTc c70374WTc = c69717VuC.A08;
            HashSet hashSet = new HashSet();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                Reference reference = (Reference) c70374WTc.A01.get(((InterfaceC71945XBu) it.next()).getId());
                if (reference != null && (obj = reference.get()) != null) {
                    hashSet.add(obj);
                }
            }
            return hashSet;
        }
        throw AbstractC166997dE.A0g();
    }

    public final void A0A(double d, double d2, float f) {
        A0B(d, d2, f, DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD, false);
    }

    public final void A0C(float f) {
        C69271Vkf c69271Vkf = this.A00;
        if (c69271Vkf != null) {
            CameraPosition A02 = c69271Vkf.A01.A02();
            if (f != 0.0f) {
                LatLng latLng = A02.A03;
                C14360o3.A06(latLng);
                C70394WTw c70394WTw = c69271Vkf.A01;
                double d = (latLng.A01 + 180.0d) / 360.0d;
                double sin = Math.sin((latLng.A00 * 3.141592653589793d) / 180.0d);
                double log = 0.5d - (Math.log((sin + 1.0d) / (1.0d - sin)) / 12.566370614359172d);
                C66356UBx c66356UBx = c70394WTw.A0I;
                float f2 = ((float) c66356UBx.A0K) * c66356UBx.A0C;
                LatLng latLng2 = new LatLng(((Math.atan(Math.exp((1.0d - ((log + (f / f2)) * 2.0d)) * 3.141592653589793d)) * 2.0d) - 1.5707963267948966d) * 57.29577951308232d, ((d + (0.0f / f2)) * 360.0d) - 180.0d);
                C70109W4g c70109W4g = new C70109W4g();
                c70109W4g.A08 = latLng2;
                c70394WTw.A09(c70109W4g, null, 0);
            }
        }
    }

    public final void A0F(java.util.Set set) {
        C14360o3.A0B(set, 0);
        C69717VuC c69717VuC = this.A01;
        if (c69717VuC != null) {
            c69717VuC.A01 = set;
            c69717VuC.A08.A00.A01(set);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public final void A0G(float[] fArr, double d, double d2) {
        C14360o3.A0B(fArr, 2);
        C69271Vkf c69271Vkf = this.A00;
        if (c69271Vkf != null) {
            c69271Vkf.A01.A0J.A06(fArr, WFW.A01(d2), WFW.A00(d));
        }
    }

    public final float A00() {
        C69271Vkf c69271Vkf = this.A00;
        if (c69271Vkf == null) {
            return 0.0f;
        }
        return c69271Vkf.A01.A02().A02;
    }

    public final C69020Vfw A01() {
        C69271Vkf c69271Vkf = this.A00;
        if (c69271Vkf == null) {
            return null;
        }
        C66356UBx c66356UBx = c69271Vkf.A01.A0I;
        PointF pointF = new PointF(c66356UBx.A0G / 2.0f, c66356UBx.A0E / 2.0f);
        LatLng A00 = new W48(c69271Vkf.A01).A00(pointF.x, pointF.y);
        return new C69020Vfw(A00.A00, A00.A01);
    }

    public final C69305VlD A02() {
        C69271Vkf c69271Vkf = this.A00;
        if (c69271Vkf == null) {
            return null;
        }
        C70394WTw c70394WTw = c69271Vkf.A01;
        W48 w48 = new W48(c70394WTw);
        C66356UBx c66356UBx = c70394WTw.A0I;
        int i = c66356UBx.A0G;
        int i2 = c66356UBx.A0E;
        return VVR.A00(new PointF(i / 2.0f, i2 / 2.0f), w48, i, i2);
    }

    public final C69305VlD A03(Rect rect) {
        C69271Vkf c69271Vkf = this.A00;
        if (c69271Vkf == null) {
            return null;
        }
        return VVR.A00(new PointF(rect.exactCenterX(), rect.exactCenterY()), new W48(c69271Vkf.A01), rect.width(), rect.height());
    }

    public final java.util.Set A06() {
        C69717VuC c69717VuC = this.A01;
        if (c69717VuC != null) {
            java.util.Set set = c69717VuC.A01;
            if (set == null) {
                set = Collections.emptySet();
            }
            C14360o3.A07(set);
            return set;
        }
        throw AbstractC166997dE.A0g();
    }

    public final void A07() {
        C69717VuC c69717VuC = this.A01;
        if (c69717VuC != null) {
            c69717VuC.A05.A01.A0A(new C66279U6z(c69717VuC.A02, c69717VuC.A03, new WlK(c69717VuC)));
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public final void A08() {
        C69717VuC c69717VuC = this.A01;
        if (c69717VuC != null) {
            c69717VuC.A04.A0H();
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public final void A09(double d, double d2) {
        C69271Vkf c69271Vkf = this.A00;
        if (c69271Vkf != null) {
            LatLng latLng = new LatLng(d, d2);
            C70394WTw c70394WTw = c69271Vkf.A01;
            C70109W4g c70109W4g = new C70109W4g();
            c70109W4g.A08 = latLng;
            c70394WTw.A09(c70109W4g, null, DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
        }
    }

    public final void A0B(double d, double d2, float f, int i, boolean z) {
        C69271Vkf c69271Vkf = this.A00;
        if (c69271Vkf != null) {
            LatLng latLng = new LatLng(d, d2);
            if (z) {
                C70394WTw c70394WTw = c69271Vkf.A01;
                C70109W4g c70109W4g = new C70109W4g();
                c70109W4g.A08 = latLng;
                c70109W4g.A03 = f;
                c70394WTw.A09(c70109W4g, null, i);
                return;
            }
            C70109W4g.A00(c69271Vkf.A01, latLng, f);
        }
    }

    public final void A0D(Bundle bundle) {
        ViewGroup viewGroup = this.A07;
        UBT ubt = this.A04;
        viewGroup.addView(ubt);
        ubt.A05(this.A08);
        ubt.A03(bundle);
        ubt.A04(new WWl(this, 3));
    }

    public final void A0E(Collection collection, float f, int i, int i2, int i3, boolean z) {
        C69271Vkf c69271Vkf = this.A00;
        if (c69271Vkf != null) {
            UBT ubt = this.A04;
            int width = ubt.getWidth();
            int height = ubt.getHeight();
            if (!collection.isEmpty()) {
                double d = 0.0d;
                double d2 = 0.0d;
                double d3 = 0.0d;
                double d4 = 0.0d;
                boolean z2 = false;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    C69020Vfw c69020Vfw = (C69020Vfw) it.next();
                    double d5 = c69020Vfw.A00;
                    double d6 = c69020Vfw.A01;
                    if (!z2) {
                        d3 = d5;
                        d2 = d5;
                        d = d6;
                        d4 = d6;
                        z2 = true;
                    }
                    if (d5 > d2) {
                        d2 = d5;
                    } else if (d5 < d3) {
                        d3 = d5;
                    }
                    double A00 = LatLngBounds.A00(d, d4);
                    double A002 = LatLngBounds.A00(d6, d4);
                    double A003 = LatLngBounds.A00(d, d6);
                    if (Double.compare(A002, A00) > 0 || Double.compare(A003, A00) > 0) {
                        if (A002 <= A003) {
                            d = d6;
                        } else {
                            d4 = d6;
                        }
                    }
                }
                LatLngBounds A004 = W52.A00(d, d2, d3, d4);
                LatLng latLng = A004.A01;
                double d7 = latLng.A00;
                LatLng latLng2 = A004.A00;
                double d8 = latLng2.A00;
                double d9 = latLng.A01;
                double d10 = latLng2.A01;
                double d11 = ((i2 * (d8 - d7)) / height) + d8;
                double d12 = ((i / 2) * (d10 - d9)) / width;
                double d13 = d10 + d12;
                double d14 = d9 - d12;
                if (!z2) {
                    d3 = d11;
                    d2 = d11;
                    d = d13;
                    d4 = d13;
                }
                if (d11 > d2) {
                    d2 = d11;
                } else if (d11 < d3) {
                    d3 = d11;
                }
                double A005 = LatLngBounds.A00(d, d4);
                double A006 = LatLngBounds.A00(d13, d4);
                double A007 = LatLngBounds.A00(d, d13);
                if (Double.compare(A006, A005) > 0 || Double.compare(A007, A005) > 0) {
                    if (A006 <= A007) {
                        d = d13;
                    } else {
                        d4 = d13;
                    }
                }
                if (d11 > d2) {
                    d2 = d11;
                } else if (d11 < d3) {
                    d3 = d11;
                }
                double A008 = LatLngBounds.A00(d, d4);
                double A009 = LatLngBounds.A00(d14, d4);
                double A0010 = LatLngBounds.A00(d, d14);
                if (Double.compare(A009, A008) > 0 || Double.compare(A0010, A008) > 0) {
                    if (A009 <= A0010) {
                        d = d14;
                    } else {
                        d4 = d14;
                    }
                }
                LatLngBounds A0011 = W52.A00(d, d2, d3, d4);
                int A01 = C1H4.A01(f);
                if (z) {
                    C70394WTw c70394WTw = c69271Vkf.A01;
                    C70109W4g c70109W4g = new C70109W4g();
                    c70109W4g.A09 = A0011;
                    c70109W4g.A07 = A01;
                    c70394WTw.A09(c70109W4g, null, i3);
                    return;
                }
                C70394WTw c70394WTw2 = c69271Vkf.A01;
                C70109W4g c70109W4g2 = new C70109W4g();
                c70109W4g2.A09 = A0011;
                c70109W4g2.A07 = A01;
                c70394WTw2.A09(c70109W4g2, null, 0);
            }
        }
    }

    public C69800Vvm(Context context, ViewGroup viewGroup, UserSession userSession, InterfaceC71980XDp interfaceC71980XDp, InterfaceC71981XDq interfaceC71981XDq, InterfaceC71982XDr interfaceC71982XDr, String str, boolean z) {
        AbstractC167017dG.A1R(userSession, viewGroup);
        this.A02 = context;
        this.A08 = userSession;
        this.A07 = viewGroup;
        this.A03 = interfaceC71980XDp;
        this.A05 = interfaceC71981XDq;
        this.A06 = interfaceC71982XDr;
        MapOptions mapOptions = new MapOptions();
        mapOptions.A05 = EnumC68183VFb.MAPBOX;
        mapOptions.A08 = str;
        mapOptions.A06 = "MapViewController.java";
        mapOptions.A07 = C18U.A04(C06090Tz.A05, userSession, 36875034425360446L);
        mapOptions.A03 = VGB.BOTTOM_LEFT;
        mapOptions.A0A = z;
        this.A04 = new UBT(context, mapOptions);
    }
}
