package X;

import android.content.Context;
import com.facebook.odin.model.OdinContext;
import com.facebook.proxygen.TraceFieldType;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: X.2rU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C61672rU {
    public WeakReference A00;
    public final UserSession A01;
    public final InterfaceC09390do A0C = AbstractC09440dt.A01(new C206919Dw(this, 33));
    public final InterfaceC09390do A02 = AbstractC09440dt.A01(new C206919Dw(this, 31));
    public final InterfaceC09390do A04 = AbstractC09440dt.A01(new C206919Dw(this, 34));
    public final InterfaceC09390do A05 = AbstractC09440dt.A01(new C206919Dw(this, 35));
    public final InterfaceC09390do A0A = AbstractC09440dt.A01(new C206919Dw(this, 40));
    public final InterfaceC09390do A07 = AbstractC09440dt.A01(new C206919Dw(this, 37));
    public final InterfaceC09390do A0B = AbstractC09440dt.A01(new C206919Dw(this, 41));
    public final InterfaceC09390do A08 = AbstractC09440dt.A01(new C206919Dw(this, 38));
    public final InterfaceC09390do A09 = AbstractC09440dt.A01(new C206919Dw(this, 39));
    public final InterfaceC09390do A06 = AbstractC09440dt.A01(new C206919Dw(this, 36));
    public final InterfaceC09390do A03 = AbstractC09440dt.A01(new C206919Dw(this, 32));

    public final void A03(final Context context, final C006802i c006802i, final InterfaceC61642rR interfaceC61642rR, final C120595d4 c120595d4, final AnonymousClass320 anonymousClass320, final EnumC37671p4 enumC37671p4, final String str, final String str2, final String str3) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(str, 2);
        C14360o3.A0B(c006802i, 5);
        Object value = this.A0B.getValue();
        C14360o3.A07(value);
        c006802i.markerAnnotate(424097382, "warm_up_enabled", ((Boolean) value).booleanValue());
        Object value2 = this.A07.getValue();
        C14360o3.A07(value2);
        c006802i.markerAnnotate(424097382, "immediate_source_enabled", ((Boolean) value2).booleanValue());
        Object value3 = this.A08.getValue();
        C14360o3.A07(value3);
        c006802i.markerAnnotate(424097382, "server_source_enabled", ((Boolean) value3).booleanValue());
        Object value4 = this.A09.getValue();
        C14360o3.A07(value4);
        c006802i.markerAnnotate(424097382, "system_source_enabled", ((Boolean) value4).booleanValue());
        Object value5 = this.A06.getValue();
        C14360o3.A07(value5);
        c006802i.markerAnnotate(424097382, "prefetch_source_enabled", ((Boolean) value5).booleanValue());
        c006802i.markerAnnotate(424097382, "app_start_type", C1CC.A09.toString());
        Object value6 = this.A04.getValue();
        C14360o3.A07(value6);
        if (((Boolean) value6).booleanValue()) {
            try {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = C14250np.A00().A00;
                C14360o3.A07(scheduledThreadPoolExecutor);
                InterfaceScheduledExecutorServiceC73383Qp listeningDecorator = MoreExecutors.listeningDecorator((ScheduledExecutorService) scheduledThreadPoolExecutor);
                C14360o3.A07(listeningDecorator);
                ListenableFuture submit = listeningDecorator.submit(new Callable() { // from class: X.3Qu
                    @Override // java.util.concurrent.Callable
                    public final /* bridge */ /* synthetic */ Object call() {
                        C55703OoV c55703OoV;
                        C006802i c006802i2 = c006802i;
                        c006802i2.markerPoint(424097382, "future_begin");
                        C61672rU c61672rU = this;
                        c006802i2.markerAnnotate(424097382, "threshold", String.valueOf(C61672rU.A00(c61672rU)));
                        OdinContext odinContext = new OdinContext(str, null, null, 30);
                        Object value7 = c61672rU.A07.getValue();
                        C14360o3.A07(value7);
                        if (((Boolean) value7).booleanValue()) {
                            c55703OoV = new C55703OoV(c120595d4);
                        } else {
                            c55703OoV = null;
                        }
                        UserSession userSession = c61672rU.A01;
                        Context context2 = context;
                        C3SD c3sd = ((C3RS) userSession.A01(C3RS.class, new C57254Pbc(16, context2, userSession))).A00;
                        c006802i2.markerPoint(424097382, "ml_engine_initialization_end");
                        C3SN E59 = c3sd.E59(c55703OoV, odinContext);
                        C06090Tz c06090Tz = C06090Tz.A05;
                        if (C18U.A06(c06090Tz, userSession, 36317753832248876L)) {
                            C18920wW A02 = AbstractC12220kQ.A02(userSession);
                            InterfaceC02590Ai A00 = A02.A00(A02.A00, "dcp_prediction_score");
                            if (A00.isSampled()) {
                                A00.A8I("prediction_score", (Double) E59.A00);
                                A00.A7v("is_success", Boolean.valueOf(E59.A02));
                                A00.AAP(TraceFieldType.FailureReason, E59.A01);
                                A00.AAP("model_version", String.valueOf(C18U.A01(c06090Tz, userSession, 36599228805680606L)));
                                A00.AAP("model_name", C18U.A04(c06090Tz, userSession, 36880703782256989L));
                                A00.AAP("model_asset", C18U.A04(c06090Tz, userSession, 36880703782781281L));
                                A00.Cht();
                            }
                        }
                        boolean z = E59.A02;
                        c006802i2.markerPoint(424097382, "prediction_end", String.valueOf(z));
                        Object value8 = c61672rU.A02.getValue();
                        C14360o3.A07(value8);
                        if (((Number) value8).longValue() > 0) {
                            AbstractC24641Ih.A02.Ep8(new C217549jn(context2, c55703OoV, odinContext, userSession));
                        }
                        if (z) {
                            c006802i2.markerAnnotate(424097382, "score", String.valueOf(((Number) E59.A00).doubleValue()));
                        }
                        return E59;
                    }
                });
                Object value7 = this.A05.getValue();
                C14360o3.A07(value7);
                C2OD.A03(new C2JL() { // from class: X.3R2
                    @Override // X.C2JL
                    public final void onFailure(Throwable th) {
                        C14360o3.A0B(th, 0);
                        C006802i c006802i2 = c006802i;
                        String message = th.getMessage();
                        if (message == null) {
                            message = "future failed";
                        }
                        c006802i2.markerAnnotate(424097382, TraceFieldType.FailureReason, message);
                        C61672rU c61672rU = this;
                        String str4 = str2;
                        String str5 = str3;
                        Double valueOf = Double.valueOf(1.0d);
                        C61672rU.A01(c61672rU, interfaceC61642rR, anonymousClass320, enumC37671p4, valueOf, str4, str5, true);
                    }

                    @Override // X.C2JL
                    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                        String str4;
                        C3SN c3sn = (C3SN) obj;
                        if (c3sn != null && c3sn.A02) {
                            double doubleValue = ((Number) c3sn.A00).doubleValue();
                            C61672rU c61672rU = this;
                            boolean z = false;
                            if (doubleValue >= C61672rU.A00(c61672rU)) {
                                z = true;
                            }
                            String str5 = str2;
                            String str6 = str3;
                            Double valueOf = Double.valueOf(doubleValue);
                            C61672rU.A01(c61672rU, interfaceC61642rR, anonymousClass320, enumC37671p4, valueOf, str5, str6, z);
                            return;
                        }
                        C006802i c006802i2 = c006802i;
                        if (c3sn != null) {
                            str4 = c3sn.A01;
                        } else {
                            str4 = null;
                        }
                        c006802i2.markerAnnotate(424097382, TraceFieldType.FailureReason, str4);
                        C61672rU c61672rU2 = this;
                        String str7 = str2;
                        String str8 = str3;
                        Double valueOf2 = Double.valueOf(1.0d);
                        C61672rU.A01(c61672rU2, interfaceC61642rR, anonymousClass320, enumC37671p4, valueOf2, str7, str8, true);
                    }
                }, C2OD.A01(submit, scheduledThreadPoolExecutor, TimeUnit.MILLISECONDS, ((Number) value7).longValue()), C1M8.A01);
                return;
            } catch (TimeoutException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("timeout: ");
                sb.append(e);
                sb.append(".message");
                c006802i.markerAnnotate(424097382, TraceFieldType.FailureReason, sb.toString());
                A01(this, interfaceC61642rR, anonymousClass320, enumC37671p4, Double.valueOf(1.0d), str2, str3, true);
                return;
            } catch (Exception e2) {
                String message = e2.getMessage();
                if (message == null) {
                    message = "unknown";
                }
                c006802i.markerAnnotate(424097382, TraceFieldType.FailureReason, message);
                A01(this, interfaceC61642rR, anonymousClass320, enumC37671p4, Double.valueOf(1.0d), str2, str3, true);
                return;
            }
        }
        C14120nc.A00().ATO(new C52393NGo(context, c006802i, this, interfaceC61642rR, c120595d4, anonymousClass320, enumC37671p4, str, str2, str3));
    }

    public static final double A00(C61672rU c61672rU) {
        Object value = c61672rU.A0C.getValue();
        C14360o3.A07(value);
        return ((Number) value).doubleValue();
    }

    public static final void A01(final C61672rU c61672rU, final InterfaceC61642rR interfaceC61642rR, final AnonymousClass320 anonymousClass320, final EnumC37671p4 enumC37671p4, final Double d, final String str, final String str2, final boolean z) {
        C11T.A07(false, new Runnable() { // from class: X.3Td
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC61642rR interfaceC61642rR2;
                C61672rU c61672rU2 = C61672rU.this;
                Object value = c61672rU2.A0A.getValue();
                C14360o3.A07(value);
                if (((Boolean) value).booleanValue()) {
                    WeakReference weakReference = c61672rU2.A00;
                    if (weakReference != null) {
                        interfaceC61642rR2 = (InterfaceC61642rR) weakReference.get();
                    } else {
                        return;
                    }
                } else {
                    interfaceC61642rR2 = interfaceC61642rR;
                }
                if (interfaceC61642rR2 != null) {
                    boolean z2 = z;
                    String str3 = str;
                    String str4 = str2;
                    Double d2 = d;
                    interfaceC61642rR2.AJs(anonymousClass320, enumC37671p4, d2, str3, str4, z2);
                }
            }
        });
    }

    public C61672rU(UserSession userSession) {
        this.A01 = userSession;
    }

    public static final void A02(C61672rU c61672rU, String str, long j) {
        if (j >= 0) {
            ((C3SZ) ((C73633Rp) c61672rU.A03.getValue()).A01.getValue()).FEK(str, j, 604800000L);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Collect signal with invalid value: ");
        sb.append(j);
        sb.append(", signal key: ");
        sb.append(str);
        sb.append(' ');
        C55078OaY.A00(null, sb.toString());
    }
}
