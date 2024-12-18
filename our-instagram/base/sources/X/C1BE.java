package X;

import com.facebook.traffic.nts.CongestionManagerConfigInterface;
import com.facebook.traffic.nts.TrafficNTSIPAssocConfigInterface;
import com.facebook.traffic.nts.TrafficNTSManagerConfigInterface;
import com.facebook.traffic.nts.TrafficNTSNetSeerV1ConfigInterface;
import com.facebook.traffic.nts.TrafficNTSTasosConfigInterface;
import com.facebook.traffic.nts.tasos.bwemanager.BWEManagerV2Config;

/* renamed from: X.1BE, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1BE implements TrafficNTSManagerConfigInterface {
    public final C1BG A03 = new Object();
    public final C1BI A04 = new TrafficNTSTasosConfigInterface() { // from class: X.1BI
        public final C1BK A01 = new CongestionManagerConfigInterface() { // from class: X.1BK
            public double A00;
            public int A01;
            public String A02;
            public boolean A03;
            public boolean A04 = C20150ym.A07(AbstractC20100yh.A00(36325373101028386L));
            public boolean A05;

            @Override // com.facebook.traffic.nts.CongestionManagerConfigInterface
            public final String getCongestionSignalHeader() {
                return this.A02;
            }

            @Override // com.facebook.traffic.nts.CongestionManagerConfigInterface
            public final double getCongestionSignalThreshold() {
                return this.A00;
            }

            @Override // com.facebook.traffic.nts.CongestionManagerConfigInterface
            public final int getCongestionStateExpirySeconds() {
                return this.A01;
            }

            @Override // com.facebook.traffic.nts.CongestionManagerConfigInterface
            public final boolean getEnableCongestionLogging() {
                return this.A03;
            }

            @Override // com.facebook.traffic.nts.CongestionManagerConfigInterface
            public final boolean getEnableCongestionObservability() {
                return this.A04;
            }

            @Override // com.facebook.traffic.nts.CongestionManagerConfigInterface
            public final boolean getEnableCongestionSignalInjection() {
                return this.A05;
            }

            {
                this.A02 = "x-fb-congestion-signal";
                this.A00 = 10.0d;
                this.A01 = 60;
                String A03 = C20150ym.A03(AbstractC20100yh.A00(36888323054109485L));
                C14360o3.A0B(A03, 0);
                this.A02 = A03;
                this.A00 = C20150ym.A00(AbstractC20100yh.A00(37169798030885375L));
                this.A01 = (int) C20150ym.A01(AbstractC20100yh.A00(36606848077534735L));
                this.A05 = C20150ym.A07(AbstractC20100yh.A00(36325373100897312L));
                this.A03 = C20150ym.A07(AbstractC20100yh.A00(36325373100962849L));
            }
        };
        public boolean A00 = C20150ym.A07(AbstractC20100yh.A00(36325368805733407L));

        @Override // com.facebook.traffic.nts.TrafficNTSTasosConfigInterface
        public final BWEManagerV2Config getBweManagerV2Config() {
            return null;
        }

        @Override // com.facebook.traffic.nts.TrafficNTSTasosConfigInterface
        public final boolean getEnableTasosBweManager() {
            return false;
        }

        @Override // com.facebook.traffic.nts.TrafficNTSTasosConfigInterface
        public final boolean getEnableTasosBweManagerV2() {
            return false;
        }

        @Override // com.facebook.traffic.nts.TrafficNTSTasosConfigInterface
        public final boolean getEnableTasosHeaderInjector() {
            return false;
        }

        @Override // com.facebook.traffic.nts.TrafficNTSTasosConfigInterface
        public final /* bridge */ /* synthetic */ CongestionManagerConfigInterface getCongestionManagerConfig() {
            return this.A01;
        }

        @Override // com.facebook.traffic.nts.TrafficNTSTasosConfigInterface
        public final boolean getEnableTasosCongestionManager() {
            return this.A00;
        }
    };
    public boolean A02 = C20150ym.A07(AbstractC20100yh.A00(36325175532204874L));
    public boolean A00 = C20150ym.A07(AbstractC20100yh.A00(36325175532467022L));
    public final boolean A05 = C20150ym.A07(AbstractC20100yh.A00(36325175532860244L));
    public boolean A01 = C20150ym.A07(AbstractC20100yh.A00(36325175533253464L));

    @Override // com.facebook.traffic.nts.TrafficNTSManagerConfigInterface
    public final boolean getEnableAppFgBgStateProvider() {
        return false;
    }

    @Override // com.facebook.traffic.nts.TrafficNTSManagerConfigInterface
    public final boolean getEnableAppLifeCycleObserver() {
        return false;
    }

    @Override // com.facebook.traffic.nts.TrafficNTSManagerConfigInterface
    public final boolean getEnableIpAssoc() {
        return false;
    }

    @Override // com.facebook.traffic.nts.TrafficNTSManagerConfigInterface
    public final boolean getEnableNetSeer() {
        return false;
    }

    @Override // com.facebook.traffic.nts.TrafficNTSManagerConfigInterface
    public final boolean getEnableNetSeerV2() {
        return false;
    }

    @Override // com.facebook.traffic.nts.TrafficNTSManagerConfigInterface
    public final boolean getEnableUserPrefsProvider() {
        return false;
    }

    @Override // com.facebook.traffic.nts.TrafficNTSManagerConfigInterface
    public final TrafficNTSIPAssocConfigInterface getIpAssocConfig() {
        return null;
    }

    @Override // com.facebook.traffic.nts.TrafficNTSManagerConfigInterface
    public final boolean getEnableAmp() {
        return this.A00;
    }

    @Override // com.facebook.traffic.nts.TrafficNTSManagerConfigInterface
    public final boolean getEnableReachabilityProvider() {
        return this.A01;
    }

    @Override // com.facebook.traffic.nts.TrafficNTSManagerConfigInterface
    public final boolean getEnableTasos() {
        return this.A02;
    }

    @Override // com.facebook.traffic.nts.TrafficNTSManagerConfigInterface
    public final /* bridge */ /* synthetic */ TrafficNTSNetSeerV1ConfigInterface getNetSeerV1Config() {
        return this.A03;
    }

    @Override // com.facebook.traffic.nts.TrafficNTSManagerConfigInterface
    public final /* bridge */ /* synthetic */ TrafficNTSTasosConfigInterface getTasosConfig() {
        return this.A04;
    }
}
