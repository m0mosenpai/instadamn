package X;

import android.util.LruCache;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.ContextChain;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.VBx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C68114VBx extends AbstractC70425WVd implements XDz, InterfaceC71964XCq {
    public final AbstractC71176WpF A00;
    public final /* synthetic */ AbstractC71176WpF A01;
    public final /* synthetic */ AbstractC71176WpF A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68114VBx(LruCache lruCache, AbstractC71176WpF abstractC71176WpF) {
        super(lruCache, abstractC71176WpF);
        C14360o3.A0B(lruCache, 2);
        this.A01 = abstractC71176WpF;
        this.A02 = abstractC71176WpF;
        this.A00 = abstractC71176WpF;
    }

    @Override // X.XDz
    public final boolean BOn() {
        return this.A01.BOn();
    }

    @Override // X.XDz
    public final int BPf() {
        return this.A01.BPf();
    }

    @Override // X.InterfaceC71964XCq
    public final C68867VdN BjL() {
        return this.A02.BjL();
    }

    @Override // X.InterfaceC71964XCq
    public final ExecutorService BtQ() {
        return this.A02.BtQ();
    }

    @Override // X.XDz
    public final boolean CDU() {
        return this.A01.CDU();
    }

    @Override // X.XDz
    public final int getMarkerId() {
        return this.A01.getMarkerId();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002e, code lost:
    
        if (r11.isMarkerOn(r2.BPf(), r13) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C69452Vnb r15, X.C68114VBx r16, java.lang.Integer r17) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68114VBx.A00(X.Vnb, X.VBx, java.lang.Integer):void");
    }

    public static final void A01(C69452Vnb c69452Vnb, C68114VBx c68114VBx, Integer num, String str, String str2, int i, int i2) {
        CallerContext callerContext;
        String str3;
        ContextChain A00;
        if (num.intValue() == 1) {
            QuickPerformanceLogger quickPerformanceLogger = c68114VBx.A02.BjL().A00;
            if (!quickPerformanceLogger.isMarkerOn(i, i2)) {
                long j = c69452Vnb.A05;
                quickPerformanceLogger.markerStart(i, i2, j, TimeUnit.MILLISECONDS);
                W42 w42 = W42.A00;
                Object obj = c69452Vnb.A07;
                if (obj instanceof CallerContext) {
                    callerContext = (CallerContext) obj;
                } else {
                    callerContext = null;
                }
                ContextChain contextChain = null;
                if (callerContext == null || (contextChain = callerContext.A00) == null || (A00 = contextChain.A00()) == null || (str3 = A00.A04) == null) {
                    str3 = "";
                }
                C69536Vr0 c69536Vr0 = new C69536Vr0(quickPerformanceLogger.withMarker(i, i2));
                MarkerEditor markerEditor = c69536Vr0.A00;
                markerEditor.annotate("schema_ver", 108);
                c69536Vr0.A00("cid", c69452Vnb.A09);
                C59232nO.A02();
                markerEditor.annotate("vito_cfg_sf", false);
                markerEditor.annotate("vito_cfg_fallback", false);
                markerEditor.point("view-appeared", j);
                if (callerContext != null) {
                    c69536Vr0.A00("callingClassName", callerContext.A02);
                    if (contextChain != null) {
                        c69536Vr0.A00("rootContextName", str3);
                        String[] split = contextChain.toString().split(String.valueOf('/'));
                        C14360o3.A07(split);
                        markerEditor.annotate("contextChain", split);
                        c69536Vr0.A00("contextChainExtras", str);
                        if (str2 != null) {
                            c69536Vr0.A00("contentId", str2);
                        }
                    }
                }
                C59392ni c59392ni = c69452Vnb.A06;
                if (c59392ni != null) {
                    w42.A00(c59392ni, c69536Vr0);
                    Map map = c59392ni.A08;
                    if (map != null) {
                        c69536Vr0.A00("tag", String.valueOf(map.get("component_tag")));
                    }
                }
                markerEditor.markerEditingCompleted();
            }
            long j2 = c69452Vnb.A02;
            if (j2 != -1) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                C14360o3.A0B("image-requested", 2);
                quickPerformanceLogger.markerPoint(i, i2, "image-requested", j2, timeUnit);
            }
            if (c69452Vnb.A01 == -1) {
                return;
            }
        }
        long j3 = c69452Vnb.A04;
        long max = Math.max(j3, c69452Vnb.A05);
        QuickPerformanceLogger quickPerformanceLogger2 = c68114VBx.A02.BjL().A00;
        C69536Vr0 c69536Vr02 = new C69536Vr0(quickPerformanceLogger2.withMarker(i, i2));
        C59392ni c59392ni2 = c69452Vnb.A06;
        c68114VBx.A03(c59392ni2, c69536Vr02, c68114VBx.A02(c59392ni2));
        MarkerEditor markerEditor2 = c69536Vr02.A00;
        markerEditor2.point("view-disappeared", j3);
        markerEditor2.markerEditingCompleted();
        TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
        C14360o3.A0B(timeUnit2, 4);
        quickPerformanceLogger2.markerEnd(i, i2, (short) 4, max, timeUnit2);
    }
}
