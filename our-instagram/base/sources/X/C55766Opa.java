package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Opa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55766Opa implements InterfaceC58183Pqo {
    public final long A00;
    public final C1QT A01;
    public final String A02;

    @Override // X.InterfaceC58183Pqo
    public final void Emu(WDI wdi, List list) {
        C1QT c1qt = this.A01;
        long j = this.A00;
        String str = this.A02;
        c1qt.flowStart(j, str, false);
        c1qt.flowMarkPoint(j, "flow_start");
        c1qt.flowAnnotate(j, "upload_id", str);
        c1qt.flowAnnotate(j, "video_segments_size", list.size());
        c1qt.flowAnnotate(j, "target_width", wdi.A0C);
        c1qt.flowAnnotate(j, "target_height", wdi.A0A);
        c1qt.flowAnnotate(j, "target_bitrate", wdi.A01());
        c1qt.flowAnnotate(j, "target_iframe_interval", wdi.A03);
    }

    private final void A00(WDI wdi) {
        String str;
        C70124W5f c70124W5f = wdi.A0G;
        if (c70124W5f != null) {
            C1QT c1qt = this.A01;
            long j = this.A00;
            VE8 ve8 = c70124W5f.A04;
            if (ve8 == null || (str = ve8.toString()) == null) {
                str = "empty";
            }
            c1qt.flowAnnotate(j, "target_codec", str);
            c1qt.flowAnnotate(j, "target_profile", c70124W5f.A03);
            c1qt.flowAnnotate(j, "target_level", c70124W5f.A02);
        }
    }

    @Override // X.InterfaceC58183Pqo
    public final void AGK(WDI wdi, Throwable th) {
        C1QT c1qt = this.A01;
        long j = this.A00;
        c1qt.flowMarkPoint(j, "flow_cancel");
        A00(wdi);
        String message = th.getMessage();
        if (message == null) {
            message = "empty";
        }
        c1qt.flowAnnotate(j, "flow_cancel_reason", message);
        c1qt.flowEndCancel(j, AbstractC50522MSa.A0j(c1qt, th, j));
    }

    @Override // X.InterfaceC58183Pqo
    public final void AUl(WDI wdi, Throwable th) {
        C0w9.A07("videolite_flow_fail", th);
        C1QT c1qt = this.A01;
        long j = this.A00;
        c1qt.flowMarkPoint(j, "flow_fail");
        A00(wdi);
        String message = th.getMessage();
        if (message == null) {
            message = "empty";
        }
        c1qt.flowAnnotate(j, "flow_fail_reason", message);
        c1qt.flowEndFail(j, DialogModule.KEY_MESSAGE, AbstractC50522MSa.A0j(c1qt, th, j));
    }

    @Override // X.InterfaceC58183Pqo
    public final void Duw() {
        this.A01.flowMarkPoint(this.A00, "transcode_cancel");
    }

    @Override // X.InterfaceC58183Pqo
    public final void Dux(C105764pn c105764pn) {
        C0w9.A08("videolite_transcode_fail", c105764pn);
        C1QT c1qt = this.A01;
        long j = this.A00;
        c1qt.flowAnnotate(j, "transcode_fail_reason", MSZ.A0r(c1qt, "transcode_fail", c105764pn, j));
        c1qt.flowAnnotate(j, "stacktrace", C2Ql.A00(c105764pn));
    }

    @Override // X.InterfaceC58183Pqo
    public final void Dv0() {
        this.A01.flowMarkPoint(this.A00, "transcode_start");
    }

    @Override // X.InterfaceC58183Pqo
    public final void Dv2(List list) {
        C1QT c1qt = this.A01;
        long j = this.A00;
        c1qt.flowMarkPoint(j, "transcode_success");
        c1qt.flowAnnotate(j, "result_list_size", list.size());
        C55176Odf c55176Odf = (C55176Odf) AbstractC001800i.A0J(list);
        if (c55176Odf != null) {
            String str = c55176Odf.A0L.A0I;
            if (str == null) {
                str = "empty";
            }
            c1qt.flowAnnotate(j, "encoder_name", str);
            c1qt.flowAnnotate(j, "input_width", c55176Odf.A07);
            c1qt.flowAnnotate(j, "input_height", c55176Odf.A06);
            c1qt.flowAnnotate(j, "input_bitrate", c55176Odf.A0H);
            C55176Odf.A02(c1qt, c55176Odf, c55176Odf.A05, j);
            c1qt.flowAnnotate(j, "target_frame_rate", c55176Odf.A0A);
            c1qt.flowAnnotate(j, "frame_drop_percent", c55176Odf.A03);
        }
    }

    @Override // X.InterfaceC58183Pqo
    public final void EpJ(WDI wdi) {
        C1QT c1qt = this.A01;
        long j = this.A00;
        c1qt.flowMarkPoint(j, "flow_success");
        A00(wdi);
        c1qt.flowEndSuccess(j);
    }

    public C55766Opa(UserSession userSession, String str) {
        this.A02 = str;
        C1QT A00 = C1QS.A00(userSession);
        this.A01 = A00;
        this.A00 = A00.generateFlowId(356984935, AbstractC43593JPy.A0x().hashCode());
    }
}
