package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.facebook.react.modules.appstate.AppStateModule;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.eventvisualizer.EventVisualizerLogger;
import java.io.StringWriter;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.143, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass143 extends AbstractC211911v {
    public final Context A00;
    public final C211211o A01;

    public AnonymousClass143(Context context, C211211o c211211o) {
        C14360o3.A0B(context, 1);
        this.A00 = context;
        this.A01 = c211211o;
    }

    /* JADX WARN: Type inference failed for: r23v0, types: [java.lang.Object, X.1of] */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.0xF] */
    public static final void A00(final Context context, final AbstractC12990ll abstractC12990ll) {
        InterfaceC11230ie c37621oz;
        IBY iby;
        AbstractC37391oc abstractC37391oc = AbstractC37391oc.$redex_init_class;
        AbstractC37401od abstractC37401od = AbstractC37401od.$redex_init_class;
        if (!AbstractC37391oc.A00()) {
            String A00 = AbstractC37411oe.A00(abstractC12990ll);
            C14360o3.A0B(context, 0);
            C14360o3.A0B(A00, 1);
            ?? obj = new Object();
            C37431og c37431og = new C37431og();
            final ArrayList arrayList = new ArrayList();
            if (C1RQ.A00().A05(EnumC27091Ti.A0M)) {
                C19700xy c19700xy = C17280tP.A4E;
                C17280tP A002 = c19700xy.A00();
                InterfaceC16530ry interfaceC16530ry = A002.A2A;
                C0YR[] c0yrArr = C17280tP.A4G;
                int intValue = ((Number) interfaceC16530ry.CES(A002, c0yrArr[189])).intValue();
                if (intValue <= 0) {
                    intValue = 100;
                }
                C19320xG.A01 = new C19320xG(intValue);
                arrayList.add(C19320xG.A00());
                c37431og.A00(C19320xG.A00());
                C17280tP A003 = c19700xy.A00();
                if (((Boolean) A003.A2o.CES(A003, c0yrArr[62])).booleanValue()) {
                    arrayList.add(EventVisualizerLogger.getInstance());
                    c37431og.A00(EventVisualizerLogger.getInstance());
                }
            }
            if (AbstractC229319v.A00()) {
                c37431og.A00(new AbstractC37441oh() { // from class: X.0iQ
                    public final boolean A00;

                    @Override // X.AbstractC37441oh
                    public final void onEventReceivedWithParamsCollectionMap(C0CA c0ca, C42751y3 c42751y3) {
                        String str;
                        C14360o3.A0B(c0ca, 0);
                        if (!this.A00) {
                            C0K8.A0D("JestE2EAnalyticsEventListener", "Not enabled, returning early");
                            return;
                        }
                        StringWriter stringWriter = new StringWriter();
                        try {
                            C0C2.A00().A04(c0ca, stringWriter);
                            String obj2 = stringWriter.toString();
                            C14360o3.A07(obj2);
                            int length = obj2.length();
                            int i = length / CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS;
                            int i2 = 0;
                            int i3 = 1;
                            if (length % CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS == 0) {
                                i3 = 0;
                            }
                            int i4 = i + i3;
                            while (i2 < i4) {
                                if (i2 <= 0) {
                                    str = "";
                                } else {
                                    str = "...";
                                }
                                int i5 = i2 * CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS;
                                i2++;
                                String substring = obj2.substring(i5, Math.min(i2 * CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS, length));
                                C14360o3.A07(substring);
                                C0K8.A0D("EndToEnd-AnalyticsEvent#reportEvent", AnonymousClass001.A0R(str, substring));
                            }
                        } catch (Exception unused) {
                            C0K8.A0C("reportEvent", "Can't encode event data");
                        }
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
                    
                        if ("false".equalsIgnoreCase(java.lang.System.getProperty("analytics_logger_to_logcat")) != false) goto L6;
                     */
                    {
                        /*
                            r5 = this;
                            r5.<init>()
                            boolean r0 = X.AbstractC229319v.A00()
                            java.lang.String r4 = "analytics_logger_to_logcat"
                            java.lang.String r3 = "false"
                            if (r0 == 0) goto L19
                            java.lang.String r0 = java.lang.System.getProperty(r4)
                            boolean r1 = r3.equalsIgnoreCase(r0)
                            r0 = 1
                            if (r1 == 0) goto L1a
                        L19:
                            r0 = 0
                        L1a:
                            r5.A00 = r0
                            java.lang.String r2 = "JestE2EAnalyticsEventListener"
                            java.lang.String r1 = java.lang.System.getProperty(r4)
                            boolean r0 = X.AbstractC229319v.A00()
                            if (r0 == 0) goto L2b
                            java.lang.String r3 = "true"
                        L2b:
                            java.lang.Object[] r1 = new java.lang.Object[]{r1, r3}
                            java.lang.String r0 = "WRITE_ANALYTICS_TO_LOGCAT = %s, EndToEnd.isRunningEndToEndTest() = %s"
                            X.C0K8.A0P(r2, r0, r1)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C11090iQ.<init>():void");
                    }
                });
            }
            ?? r6 = new Object(arrayList) { // from class: X.0xF
                public final List A00;

                {
                    this.A00 = arrayList;
                }
            };
            C17280tP A004 = C17280tP.A4E.A00();
            boolean z = !((Boolean) A004.A1A.CES(A004, C17280tP.A4G[190])).booleanValue();
            C37571ou c37571ou = new C37571ou(abstractC12990ll);
            boolean z2 = c37571ou.A1W;
            if (z2) {
                Boolean bool = c37571ou.A0x;
                C006802i c006802i = C006802i.A0p;
                java.util.Set A0k = AbstractC001800i.A0k(AbstractC001900j.A0R(c37571ou.A15, new String[]{";"}, 0));
                java.util.Set A0k2 = AbstractC001800i.A0k(AbstractC001900j.A0R(c37571ou.A16, new String[]{";"}, 0));
                java.util.Set A0k3 = AbstractC001800i.A0k(AbstractC001900j.A0R(c37571ou.A17, new String[]{";"}, 0));
                C14360o3.A0A(bool);
                boolean booleanValue = bool.booleanValue();
                Integer num = c37571ou.A13;
                C14360o3.A06(num);
                int intValue2 = num.intValue();
                Boolean bool2 = c37571ou.A12;
                C14360o3.A06(bool2);
                boolean booleanValue2 = bool2.booleanValue();
                Boolean bool3 = c37571ou.A11;
                C14360o3.A06(bool3);
                boolean booleanValue3 = bool3.booleanValue();
                if (booleanValue) {
                    iby = new IBY();
                } else {
                    iby = null;
                }
                new Handler(Looper.getMainLooper()).postDelayed(new RunnableC43080J2v(new C38654Gyv(iby, c006802i, 910365628, 910370785, 910367814, A0k, A0k2, A0k3, intValue2, z2, booleanValue, booleanValue2, booleanValue3)), 3000L);
            }
            if (AbstractC229319v.A00()) {
                c37621oz = new YE6(context, c37431og, c37571ou, obj, r6);
            } else {
                c37621oz = new C37621oz(context, c37431og, c37571ou, obj, r6, z);
            }
            InterfaceC11230ie interfaceC11230ie = c37621oz;
            C24231Gs A005 = C24231Gs.A00();
            java.util.Set set = AbstractC11060iN.A02;
            final C11110iS A006 = C11120iT.A00();
            A005.A01(new InterfaceC13060ls(A006) { // from class: X.1p0
                public boolean A00;
                public final C11110iS A01;

                @Override // X.InterfaceC13060ls
                public final void Cww(AbstractC12990ll abstractC12990ll2) {
                    C14360o3.A0B(abstractC12990ll2, 0);
                    C106904rr A007 = C106904rr.A00(abstractC12990ll2);
                    C106904rr.A02(A007.A01, AppStateModule.APP_STATE_BACKGROUND);
                    C106904rr.A01(A007, C05F.A0C, System.currentTimeMillis());
                    AbstractC11060iN.A00(abstractC12990ll2);
                    Iterator it = this.A01.A01.iterator();
                    while (it.hasNext()) {
                        InterfaceC11160iX interfaceC11160iX = (InterfaceC11160iX) ((Reference) it.next()).get();
                        if (interfaceC11160iX != null) {
                            interfaceC11160iX.E7d();
                        }
                    }
                }

                @Override // X.InterfaceC13060ls
                public final void Cwy(AbstractC12990ll abstractC12990ll2) {
                    C14360o3.A0B(abstractC12990ll2, 0);
                    AbstractC11060iN.A00(abstractC12990ll2);
                    C11110iS c11110iS = this.A01;
                    C11170iY c11170iY = c11110iS.A00;
                    if (c11170iY != null) {
                        synchronized (c11170iY) {
                            c11170iY.A00.set(0);
                        }
                    }
                    Iterator it = c11110iS.A01.iterator();
                    while (it.hasNext()) {
                        InterfaceC11160iX interfaceC11160iX = (InterfaceC11160iX) ((Reference) it.next()).get();
                        if (interfaceC11160iX != null) {
                            interfaceC11160iX.E7c();
                        }
                    }
                    if (this.A00) {
                        C106904rr A007 = C106904rr.A00(abstractC12990ll2);
                        C106904rr.A02(A007.A01, "foreground");
                        C106904rr.A01(A007, C05F.A00, System.currentTimeMillis());
                    }
                    this.A00 = true;
                }

                {
                    this.A01 = A006;
                }
            });
            synchronized (AbstractC11060iN.A01) {
                if (AbstractC11060iN.A00 == null) {
                    AbstractC11060iN.A00 = interfaceC11230ie;
                } else {
                    throw new IllegalStateException("Should not set the configuration more than once");
                }
            }
            java.util.Set set2 = AbstractC11060iN.A02;
            Iterator it = set2.iterator();
            while (it.hasNext()) {
                ((C11070iO) it.next()).A00(interfaceC11230ie);
            }
            set2.clear();
            Runnable runnable = C006802i.A0p.A0H;
            if (runnable != null) {
                runnable.run();
            }
        }
        if ((abstractC12990ll instanceof UserSession) && C18U.A06(C06090Tz.A05, abstractC12990ll, 36328057456966745L)) {
            InterfaceC14020nS A007 = C14120nc.A00();
            C14360o3.A07(A007);
            A007.ATO(new AbstractRunnableC14200nk() { // from class: X.9ig
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC39791t3.A00(context, abstractC12990ll);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(588907844, 3, false, false);
                }
            });
            return;
        }
        AbstractC39791t3.A00(context, abstractC12990ll);
    }

    @Override // X.AbstractC211911v
    public final String A06() {
        return "AnalyticsInitializer";
    }

    @Override // X.AbstractC211911v
    public final void A07() {
        C211211o c211211o = this.A01;
        if (C18U.A06(C06090Tz.A05, ((AnonymousClass122) c211211o.A00()).A08(), 36328057458932852L)) {
            InterfaceC14020nS A00 = C14120nc.A00();
            C14360o3.A07(A00);
            A00.ATO(new NG9(this));
            return;
        }
        A00(this.A00, ((AnonymousClass122) c211211o.A00()).A08());
    }
}
