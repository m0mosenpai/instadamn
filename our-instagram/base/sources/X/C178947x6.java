package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.proxygen.LigerSamplePolicy;
import java.util.HashMap;

/* renamed from: X.7x6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C178947x6 implements Handler.Callback {
    public C178957x7 A00;
    public final Handler A01;
    public final Looper A02;
    public final HashMap A03;
    public final HashMap A04;

    public final void A01(InterfaceC178827wu interfaceC178827wu) {
        Handler handler = this.A01;
        if (handler != null) {
            handler.removeMessages(1, interfaceC178827wu);
            HashMap hashMap = this.A03;
            if (C14360o3.A0K(hashMap.get(interfaceC178827wu), true)) {
                hashMap.put(interfaceC178827wu, false);
                handler.sendMessage(handler.obtainMessage(2, interfaceC178827wu));
            }
            handler.sendMessageDelayed(handler.obtainMessage(1, interfaceC178827wu), LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        Number number;
        C14360o3.A0B(message, 0);
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    HashMap hashMap = this.A04;
                    for (Object obj : hashMap.keySet()) {
                        C14360o3.A07(obj);
                        InterfaceC178827wu interfaceC178827wu = (InterfaceC178827wu) obj;
                        if (C14360o3.A0K(this.A03.get(interfaceC178827wu), true) && (number = (Number) hashMap.get(interfaceC178827wu)) != null) {
                            long currentTimeMillis = (System.currentTimeMillis() - number.longValue()) + LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT;
                            C178957x7 c178957x7 = this.A00;
                            if (c178957x7 != null) {
                                C14360o3.A0B(interfaceC178827wu, 0);
                                InterfaceC178407wE interfaceC178407wE = c178957x7.A00.A04;
                                if (interfaceC178407wE != null) {
                                    HashMap hashMap2 = new HashMap();
                                    hashMap2.put("render_stuck_time", String.valueOf(currentTimeMillis));
                                    interfaceC178407wE.CkX(interfaceC178827wu.hashCode(), "media_pipeline_render_stuck_forever", interfaceC178827wu.B0u(), hashMap2);
                                }
                            }
                        }
                    }
                    hashMap.clear();
                    this.A03.clear();
                    return true;
                }
            } else {
                HashMap hashMap3 = this.A04;
                Object obj2 = message.obj;
                C14360o3.A0C(obj2, "null cannot be cast to non-null type com.facebook.onecamera.components.mediapipeline.gl.context.GlRenderMonitorElement");
                Number number2 = (Number) hashMap3.get(obj2);
                if (number2 != null) {
                    long currentTimeMillis2 = (System.currentTimeMillis() - number2.longValue()) + LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT;
                    C178957x7 c178957x72 = this.A00;
                    if (c178957x72 != null) {
                        Object obj3 = message.obj;
                        C14360o3.A0C(obj3, "null cannot be cast to non-null type com.facebook.onecamera.components.mediapipeline.gl.context.GlRenderMonitorElement");
                        InterfaceC178827wu interfaceC178827wu2 = (InterfaceC178827wu) obj3;
                        C14360o3.A0B(interfaceC178827wu2, 0);
                        InterfaceC178407wE interfaceC178407wE2 = c178957x72.A00.A04;
                        if (interfaceC178407wE2 != null) {
                            HashMap hashMap4 = new HashMap();
                            hashMap4.put("render_stuck_time", String.valueOf(currentTimeMillis2));
                            interfaceC178407wE2.CkX(interfaceC178827wu2.hashCode(), "media_pipeline_render_stuck_time", interfaceC178827wu2.B0u(), hashMap4);
                            return true;
                        }
                    }
                }
            }
        } else {
            HashMap hashMap5 = this.A04;
            Object obj4 = message.obj;
            C14360o3.A0C(obj4, "null cannot be cast to non-null type com.facebook.onecamera.components.mediapipeline.gl.context.GlRenderMonitorElement");
            hashMap5.put(obj4, Long.valueOf(System.currentTimeMillis()));
            HashMap hashMap6 = this.A03;
            Object obj5 = message.obj;
            C14360o3.A0C(obj5, "null cannot be cast to non-null type com.facebook.onecamera.components.mediapipeline.gl.context.GlRenderMonitorElement");
            hashMap6.put(obj5, true);
            C178957x7 c178957x73 = this.A00;
            if (c178957x73 != null) {
                Object obj6 = message.obj;
                C14360o3.A0C(obj6, "null cannot be cast to non-null type com.facebook.onecamera.components.mediapipeline.gl.context.GlRenderMonitorElement");
                InterfaceC178827wu interfaceC178827wu3 = (InterfaceC178827wu) obj6;
                C14360o3.A0B(interfaceC178827wu3, 0);
                C178797wr c178797wr = c178957x73.A00;
                InterfaceC178407wE interfaceC178407wE3 = c178797wr.A04;
                if (interfaceC178407wE3 != null) {
                    interfaceC178407wE3.CkX(interfaceC178827wu3.hashCode(), "media_pipeline_render_stuck", interfaceC178827wu3.B0u(), null);
                }
                c178797wr.A03.A00(EnumC200658u8.A0T);
            }
        }
        return true;
    }

    public final void A00(InterfaceC178827wu interfaceC178827wu) {
        Handler handler = this.A01;
        if (handler != null) {
            handler.removeMessages(1, interfaceC178827wu);
        }
    }

    public C178947x6(Looper looper) {
        Handler handler;
        this.A02 = looper;
        if (looper != null) {
            handler = new Handler(looper, this);
        } else {
            handler = null;
        }
        this.A01 = handler;
        this.A04 = new HashMap();
        this.A03 = new HashMap();
    }
}
