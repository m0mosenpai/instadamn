package X;

import com.facebook.quicklog.EventBuilder;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.0IF, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0IF extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ InterfaceC09390do A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0IF(InterfaceC09390do interfaceC09390do) {
        super(0);
        this.A00 = interfaceC09390do;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        final InterfaceC09390do interfaceC09390do = this.A00;
        return new AbstractC211911v(interfaceC09390do) { // from class: X.0wF
            public final InterfaceC09390do A00;

            {
                C14360o3.A0B(interfaceC09390do, 1);
                this.A00 = interfaceC09390do;
            }

            @Override // X.AbstractC211911v
            public final String A06() {
                return "LacrimaHealthInitializer";
            }

            @Override // X.AbstractC211911v
            public final void A07() {
                LightweightQuickPerformanceLogger BjG = ((AnonymousClass127) this.A00.getValue()).BjG();
                if (BjG != null) {
                    C0PC.A00 = new C0P8(BjG) { // from class: X.0I1
                        public static final Random A03 = new Random();
                        public String A00;
                        public final LightweightQuickPerformanceLogger A01;
                        public final AtomicInteger A02 = new AtomicInteger(0);

                        @Override // X.C0P8
                        public final void DY9(int i, Map map) {
                            if (i != -1) {
                                String str = this.A00;
                                if (str != null) {
                                    this.A01.markerAnnotate(21373447, i, "ASLSessionId", str);
                                }
                                if (map != null) {
                                    for (Map.Entry entry : map.entrySet()) {
                                        this.A01.markerAnnotate(21373447, i, (String) entry.getKey(), (String) entry.getValue());
                                    }
                                }
                                this.A01.markerEnd(21373447, i, (short) 2);
                            }
                        }

                        @Override // X.C0P8
                        public final void D2z(String str, Map map) {
                            EventBuilder markEventBuilder = this.A01.markEventBuilder(21375264, this.A02.incrementAndGet(), str);
                            if (markEventBuilder.isSampled()) {
                                String str2 = this.A00;
                                if (str2 != null) {
                                    markEventBuilder.annotate("ASLSessionId", str2);
                                }
                                if (map != null) {
                                    for (Map.Entry entry : map.entrySet()) {
                                        markEventBuilder.annotate((String) entry.getKey(), (String) entry.getValue());
                                    }
                                }
                                markEventBuilder.setActionId((short) 2);
                                markEventBuilder.report();
                            }
                        }

                        @Override // X.C0P8
                        public final void DEh(String str, Throwable th, Map map) {
                            EventBuilder markEventBuilder = this.A01.markEventBuilder(21379005, this.A02.incrementAndGet(), str);
                            if (markEventBuilder.isSampled()) {
                                String str2 = this.A00;
                                if (str2 != null) {
                                    markEventBuilder.annotate("ASLSessionId", str2);
                                }
                                if (th != null) {
                                    markEventBuilder.annotate("Exception", AnonymousClass001.A0g("<cls>", th.getClass().getName(), "</cls>"));
                                    if (A03.nextInt(100) == 0) {
                                        markEventBuilder.annotate("StackTrace", C0LA.A00(C0LA.A01(th), CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS));
                                    }
                                }
                                if (map != null) {
                                    for (Map.Entry entry : map.entrySet()) {
                                        markEventBuilder.annotate((String) entry.getKey(), (String) entry.getValue());
                                    }
                                }
                                markEventBuilder.setActionId((short) 3);
                                markEventBuilder.report();
                            }
                        }

                        @Override // X.C0P8
                        public final int DYB(String str, int i) {
                            if (A03.nextInt(i) != 0) {
                                return -1;
                            }
                            int incrementAndGet = this.A02.incrementAndGet();
                            this.A01.markerStart(21373447, incrementAndGet, "Category", str);
                            return incrementAndGet;
                        }

                        @Override // X.C0P8
                        public final void EP7(String str) {
                            this.A00 = str;
                        }

                        {
                            this.A01 = BjG;
                        }

                        @Override // X.C0P8
                        public final /* synthetic */ int DYA(String str) {
                            return DYB(str, 100000);
                        }
                    };
                }
            }
        };
    }
}
