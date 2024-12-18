package X;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import com.facebook.android.maps.model.CameraPosition;
import com.facebook.android.maps.model.LatLng;
import com.facebook.maps.ttrc.common.MapboxTTRC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.WTw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70394WTw implements XD0, X91 {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public InterfaceC71888X8v A04;
    public InterfaceC71889X8w A05;
    public InterfaceC71890X8x A06;
    public AbstractC66278U6y A07;
    public ULV A08;
    public U70 A09;
    public U70 A0A;
    public U70 A0B;
    public U70 A0C;
    public C69271Vkf A0D;
    public final int A0F;
    public final Context A0G;
    public final C66356UBx A0I;
    public final WFW A0J;
    public final VJZ A0K;
    public final ULp A0L;
    public final C69050Vgr A0M;
    public final float[] A0P = new float[2];
    public final Matrix A0H = new Matrix();
    public boolean A0E = false;
    public final ArrayList A0N = new ArrayList();
    public final List A0O = new ArrayList();

    public final float A00() {
        return 0.0f + (this.A0I.A0G / 2.0f);
    }

    public final float A01() {
        return 0.0f + (this.A0I.A0E / 2.0f);
    }

    @Override // X.XD0
    public final void Cwh(U70 u70) {
    }

    public final CameraPosition A02() {
        float[] fArr = this.A0P;
        C66356UBx c66356UBx = this.A0I;
        fArr[0] = c66356UBx.A04 - A00();
        fArr[1] = c66356UBx.A05 - A01();
        c66356UBx.A0h.mapVectors(fArr);
        double d = c66356UBx.A02;
        float f = fArr[0];
        float f2 = (float) c66356UBx.A0K;
        return new CameraPosition(new LatLng(WFW.A03(c66356UBx.A03 - (fArr[1] / f2)), WFW.A02(d - (f / f2))), c66356UBx.getZoom(), 0.0f, c66356UBx.A0B);
    }

    public final void A03() {
        Iterator it = this.A0O.iterator();
        while (it.hasNext()) {
            int i = ((AbstractC66278U6y) it.next()).A03;
            if (i == 1 || i == 2 || i == 4) {
                it.remove();
            }
        }
        this.A0I.invalidate();
    }

    public final void A04() {
        List list = this.A0O;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AbstractC66278U6y abstractC66278U6y = (AbstractC66278U6y) list.get(i);
            if (abstractC66278U6y instanceof ULX) {
                ((ULX) abstractC66278U6y).A0I();
            } else if (abstractC66278U6y instanceof ULY) {
                ((ULY) abstractC66278U6y).A09.clear();
            }
        }
    }

    public final void A05() {
        if (this.A05 == null && this.A0N.isEmpty()) {
            return;
        }
        CameraPosition A02 = A02();
        InterfaceC71889X8w interfaceC71889X8w = this.A05;
        if (interfaceC71889X8w != null) {
            interfaceC71889X8w.D1N(A02);
        }
        ArrayList arrayList = this.A0N;
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC71889X8w) it.next()).D1N(A02);
        }
    }

    public final void A06() {
        C69271Vkf c69271Vkf = this.A0D;
        if (c69271Vkf != null) {
            ArrayList arrayList = c69271Vkf.A00;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next();
                    MapboxTTRC.onMapRendered();
                }
                c69271Vkf.A00 = null;
            }
            this.A0D = null;
        }
    }

    public final void A07() {
        U70 u70 = this.A0A;
        if (u70 != null) {
            u70.A03();
        }
        U70 u702 = this.A0B;
        if (u702 != null) {
            u702.A03();
        }
        U70 u703 = this.A0C;
        if (u703 != null) {
            u703.A03();
        }
        U70 u704 = this.A09;
        if (u704 != null) {
            u704.A03();
        }
    }

    public final void A08(float f) {
        float min = Math.min(Math.max(f, 2.0f), 21.0f);
        this.A01 = min;
        C66356UBx c66356UBx = this.A0I;
        if (c66356UBx.getZoom() < min) {
            c66356UBx.A0G(min, A00(), A01());
            c66356UBx.invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A09(X.C70109W4g r23, X.InterfaceC71888X8v r24, int r25) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70394WTw.A09(X.W4g, X.X8v, int):void");
    }

    public final void A0A(AbstractC66278U6y abstractC66278U6y) {
        List list = this.A0O;
        int binarySearch = Collections.binarySearch(list, abstractC66278U6y, AbstractC66278U6y.A0E);
        if (binarySearch <= 0) {
            list.add((-1) - binarySearch, abstractC66278U6y);
            abstractC66278U6y.A06();
            this.A0I.invalidate();
        }
    }

    @Override // X.XD0
    public final void CwV(U70 u70) {
        if (u70 == this.A0A) {
            this.A0A = null;
        } else if (u70 == this.A0B) {
            this.A0B = null;
        } else if (u70 == this.A0C) {
            this.A0C = null;
        } else if (u70 == this.A09) {
            this.A09 = null;
        }
        u70.A04();
        if (this.A0A == null && this.A0B == null && this.A0C == null && this.A09 == null) {
            this.A0E = false;
            if (this.A04 != null) {
                this.A04 = null;
            }
            A05();
        }
    }

    @Override // X.XD0
    public final void CwZ(U70 u70) {
        if (u70 == this.A0A) {
            this.A0A = null;
        } else if (u70 == this.A0B) {
            this.A0B = null;
        } else if (u70 == this.A0C) {
            this.A0C = null;
        } else if (u70 == this.A09) {
            this.A09 = null;
        }
        u70.A04();
        if (this.A0E && this.A0A == null && this.A0B == null && this.A0C == null && this.A09 == null) {
            this.A0E = false;
            InterfaceC71888X8v interfaceC71888X8v = this.A04;
            if (interfaceC71888X8v != null) {
                this.A04 = null;
                interfaceC71888X8v.onFinish();
            }
            A05();
        }
    }

    @Override // X.X91
    public final void Cwk(U70 u70) {
        C66356UBx c66356UBx;
        double d;
        double d2;
        U70 u702 = this.A0A;
        if (u70 == u702) {
            c66356UBx = this.A0I;
            d = u702.A00;
            d2 = c66356UBx.A03;
        } else {
            U70 u703 = this.A0B;
            if (u70 == u703) {
                c66356UBx = this.A0I;
                d = c66356UBx.A02;
                d2 = u703.A00;
            } else {
                if (u70 == this.A0C) {
                    c66356UBx = this.A0I;
                    c66356UBx.A0G(u70.A00, this.A02, this.A03);
                } else {
                    if (u70 != this.A09) {
                        return;
                    }
                    c66356UBx = this.A0I;
                    c66356UBx.A0E(u70.A00, A00(), A01());
                }
                c66356UBx.invalidate();
            }
        }
        c66356UBx.A02 = C66356UBx.A00(d);
        c66356UBx.A03 = c66356UBx.A0D(c66356UBx.A0K, d2);
        c66356UBx.invalidate();
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.VZv] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, X.VJZ] */
    public C70394WTw(W3L w3l, C66356UBx c66356UBx) {
        PorterDuffColorFilter porterDuffColorFilter;
        String str;
        this.A00 = 21.0f;
        this.A01 = 2.0f;
        this.A0I = c66356UBx;
        Context context = c66356UBx.getContext();
        Context applicationContext = context.getApplicationContext();
        this.A0G = applicationContext;
        this.A0J = new WFW(this);
        ?? obj = new Object();
        obj.A00 = this;
        this.A0K = obj;
        Context applicationContext2 = applicationContext.getApplicationContext();
        VZD.A00 = applicationContext2;
        applicationContext2.getResources().getDisplayMetrics();
        int i = AbstractC167007dF.A0K(applicationContext).densityDpi >= 320 ? 512 : 256;
        this.A0F = i;
        ULp uLp = new ULp(this, new C66535ULq(applicationContext, w3l, i));
        A0A(uLp);
        this.A0L = uLp;
        C69050Vgr c69050Vgr = new C69050Vgr(context);
        this.A0M = c69050Vgr;
        c69050Vgr.A00 = new Object() { // from class: X.VZv
        };
        if (w3l != null) {
            if (w3l.A07) {
                C70394WTw c70394WTw = obj.A00;
                if (c70394WTw.A08 == null) {
                    ULV ulv = new ULV(c70394WTw);
                    c70394WTw.A08 = ulv;
                    c70394WTw.A0A(ulv);
                }
            } else {
                C70394WTw c70394WTw2 = obj.A00;
                ULV ulv2 = c70394WTw2.A08;
                if (ulv2 != null) {
                    c70394WTw2.A0O.remove(ulv2);
                    c70394WTw2.A0I.invalidate();
                    c70394WTw2.A08 = null;
                }
            }
            obj.A01 = w3l.A09;
            obj.A02 = w3l.A0A;
            obj.A03 = w3l.A0E;
            this.A00 = Math.min(Math.max(w3l.A00, 2.0f), 21.0f);
            this.A01 = Math.min(Math.max(w3l.A01, 2.0f), 21.0f);
            int i2 = w3l.A02;
            if (i2 != uLp.A00) {
                uLp.A00 = i2;
                if (i2 == 0) {
                    uLp.A09(false);
                } else {
                    if (!((AbstractC66278U6y) uLp).A04) {
                        uLp.A09(true);
                    }
                    C66535ULq c66535ULq = uLp.A03;
                    switch (i2) {
                        case 5:
                            str = "live_maps";
                            break;
                        case 6:
                            str = "crowdsourcing_osm";
                            break;
                        case 7:
                            str = "indoor_osm";
                            break;
                        case 8:
                            if (c66535ULq.A03.A08) {
                                str = "whatsapp_dark";
                                break;
                            } else {
                                str = AbstractC111324zv.A00(1374);
                                break;
                            }
                        case 9:
                            str = "greatwhite";
                            break;
                        default:
                            if (c66535ULq.A03.A08) {
                                str = "dark";
                                break;
                            } else {
                                str = null;
                                break;
                            }
                    }
                    c66535ULq.A01 = str;
                    C70394WTw c70394WTw3 = ((AbstractC66278U6y) uLp).A07;
                    c70394WTw3.A04();
                    c70394WTw3.A0I.invalidate();
                }
            }
            boolean z = w3l.A08;
            Paint paint = uLp.A02;
            if (z) {
                porterDuffColorFilter = ULp.A05;
                if (porterDuffColorFilter == null) {
                    porterDuffColorFilter = new PorterDuffColorFilter(-526345, PorterDuff.Mode.SRC_ATOP);
                    ULp.A05 = porterDuffColorFilter;
                }
            } else {
                porterDuffColorFilter = null;
            }
            paint.setColorFilter(porterDuffColorFilter);
        }
    }
}
