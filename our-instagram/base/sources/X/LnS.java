package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.reliability.CancelReason;
import com.facebook.quicklog.reliability.UserFlowConfig;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;

/* loaded from: classes8.dex */
public final class LnS implements MRJ {
    public boolean A00;
    public final long A01;
    public final UserFlowLogger A02;
    public final InterfaceC11380iw A03;
    public final Integer A04;
    public final Integer A05;
    public final boolean A06;

    @Override // X.MRJ
    public final void DfQ() {
        this.A00 = true;
        this.A02.flowMarkPoint(this.A01, "MEDIA_RENDERED");
    }

    public /* synthetic */ LnS(InterfaceC11380iw interfaceC11380iw, Integer num, Integer num2, boolean z) {
        UserFlowLoggerImpl userFlowLoggerImpl = new UserFlowLoggerImpl(C006802i.A0p);
        this.A05 = num;
        this.A06 = z;
        this.A03 = interfaceC11380iw;
        this.A02 = userFlowLoggerImpl;
        this.A04 = num2;
        this.A01 = userFlowLoggerImpl.generateNewFlowId(584653653);
    }

    @Override // X.MRJ
    public final void DSH(MNL mnl) {
        JUO juo;
        boolean equals = mnl.equals(LnR.A00);
        String str = null;
        if ((mnl instanceof JUO) && (juo = (JUO) mnl) != null) {
            str = juo.A00;
        }
        this.A02.markPointWithEditor(this.A01, "MEDIA_SET").addPointData("is_local", equals).addPointData("cache_key", str).markerEditingCompleted();
    }

    @Override // X.MRJ
    public final void DfP() {
        boolean z = this.A00;
        UserFlowLogger userFlowLogger = this.A02;
        long j = this.A01;
        if (z) {
            userFlowLogger.flowEndSuccess(j);
        } else {
            userFlowLogger.flowEndCancel(j, CancelReason.USER_CANCELLED);
        }
    }

    @Override // X.MRJ
    public final void DfR() {
        UserFlowLogger userFlowLogger = this.A02;
        long j = this.A01;
        userFlowLogger.flowMarkPoint(j, "MEDIA_LOAD_FAILURE");
        userFlowLogger.flowEndFail(j, "MEDIA_LOAD_FAILURE", "");
    }

    @Override // X.MRJ
    public final void DfS(InterfaceC83713oG interfaceC83713oG) {
        String str;
        String str2;
        UserFlowConfig build = new UserFlowConfig.UserFlowConfigBuilder(this.A03.getModuleName(), false).build();
        UserFlowLogger userFlowLogger = this.A02;
        long j = this.A01;
        userFlowLogger.flowStart(j, build);
        switch (this.A05.intValue()) {
            case 0:
                str = "permanent_image";
                break;
            case 1:
                str = "permanent_video";
                break;
            case 2:
                str = "ephemeral_image";
                break;
            default:
                str = "ephemeral_video";
                break;
        }
        userFlowLogger.flowAnnotateWithCrucialData(j, "media_type", str);
        userFlowLogger.flowAnnotateWithCrucialData(j, TraceFieldType.TransportType, AbstractC166987dD.A1A(Boolean.valueOf(this.A06), AbstractC47163Ksy.A00));
        switch (this.A04.intValue()) {
            case 0:
                str2 = "CHAT_THREAD";
                break;
            case 1:
                str2 = "FULL_SCREEN";
                break;
            default:
                str2 = "THREAD_DETAILS";
                break;
        }
        userFlowLogger.flowAnnotateWithCrucialData(j, UserFlowLoggerImpl.SOURCE_ANNOTATION, str2);
        if (interfaceC83713oG != null) {
            String A02 = AbstractC92784Dr.A02(interfaceC83713oG);
            if (A02 != null) {
                userFlowLogger.flowAnnotateWithCrucialData(j, "open_thread_id", A02);
            }
            Long A01 = AbstractC92784Dr.A01(interfaceC83713oG);
            if (A01 != null) {
                userFlowLogger.flowAnnotateWithCrucialData(j, "occamadillo_thread_id", AbstractC43592JPx.A0y(A01));
            }
        }
    }

    @Override // X.MRJ
    public final void E0W() {
        this.A02.flowMarkPoint(this.A01, "VIEW_DISAPPEAR");
    }

    @Override // X.MRJ
    public final void E0X() {
        this.A02.flowMarkPoint(this.A01, "VIEW_DISPLAYED_ON_VIEWPORT");
    }
}
