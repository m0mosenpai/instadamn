package X;

import android.app.Activity;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.api.schemas.MediaControlEventSourceEnum;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.regex.Pattern;

/* renamed from: X.IuB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42654IuB implements InterfaceC50486MQo {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ MediaControlEventSourceEnum A01;
    public final /* synthetic */ InterfaceC11380iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ C38321qM A04;
    public final /* synthetic */ InterfaceC43585JPa A05;
    public final /* synthetic */ C75113Zb A06;

    public C42654IuB(Activity activity, MediaControlEventSourceEnum mediaControlEventSourceEnum, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, InterfaceC43585JPa interfaceC43585JPa, C75113Zb c75113Zb) {
        this.A01 = mediaControlEventSourceEnum;
        this.A05 = interfaceC43585JPa;
        this.A04 = c38321qM;
        this.A06 = c75113Zb;
        this.A00 = activity;
        this.A03 = userSession;
        this.A02 = interfaceC11380iw;
    }

    @Override // X.InterfaceC50486MQo
    public final void D02(AbstractC46470KhU abstractC46470KhU) {
        if (abstractC46470KhU instanceof HLW) {
            HLW hlw = (HLW) abstractC46470KhU;
            InterfaceC88183wS interfaceC88183wS = hlw.A01;
            InterfaceC84443pn interfaceC84443pn = hlw.A00;
            C38321qM c38321qM = this.A04;
            C41737Ie9.A02(interfaceC84443pn, interfaceC88183wS, this.A01, c38321qM, this.A05, this.A06);
            AbstractC40647I0f.A00(this.A02, this.A03, c38321qM);
            return;
        }
        if (!(abstractC46470KhU instanceof HLX)) {
            return;
        }
        HLX hlx = (HLX) abstractC46470KhU;
        InterfaceC88183wS interfaceC88183wS2 = hlx.A01;
        InterfaceC84443pn interfaceC84443pn2 = hlx.A00;
        if (interfaceC88183wS2 != null && !(!AbstractC001800i.A0u(IBF.A00, IQd.A00(interfaceC88183wS2)))) {
            return;
        }
        C41737Ie9.A02(interfaceC84443pn2, interfaceC88183wS2, null, this.A04, this.A05, this.A06);
    }

    @Override // X.InterfaceC50486MQo
    public final void DI2(InterfaceC84443pn interfaceC84443pn, InterfaceC88183wS interfaceC88183wS) {
        Activity activity = this.A00;
        C38321qM c38321qM = this.A04;
        C75113Zb c75113Zb = this.A06;
        InterfaceC43585JPa interfaceC43585JPa = this.A05;
        MediaControlEventSourceEnum mediaControlEventSourceEnum = this.A01;
        EnumC39593He3 A00 = IQd.A00(interfaceC88183wS);
        if (A00 == null) {
            return;
        }
        switch (A00.ordinal()) {
            case 0:
                InterfaceC692739n C9D = interfaceC43585JPa.C9D();
                String str = c75113Zb.A1U;
                Pattern pattern = AbstractC13670mt.A00;
                if (str == null) {
                    str = "";
                }
                C9D.El8(c38321qM, c75113Zb, str);
                return;
            case 10:
                String id = c38321qM.getId();
                if (id != null) {
                    interfaceC43585JPa.ElW(c38321qM, new C42656IuD(activity, interfaceC84443pn, interfaceC88183wS, c38321qM, interfaceC43585JPa, c75113Zb), c75113Zb, VG2.A0d, id);
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            case 11:
                interfaceC43585JPa.E2g(c38321qM, new C42656IuD(activity, interfaceC84443pn, interfaceC88183wS, c38321qM, interfaceC43585JPa, c75113Zb), c75113Zb);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                interfaceC43585JPa.Ekf(c38321qM, new C42656IuD(activity, interfaceC84443pn, interfaceC88183wS, c38321qM, interfaceC43585JPa, c75113Zb), c75113Zb);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                interfaceC43585JPa.C9D().Ekg(c38321qM, c75113Zb);
                return;
            case Process.SIGSTOP /* 19 */:
                interfaceC43585JPa.C9D().E2W(C05F.A01);
                return;
            case 24:
                interfaceC43585JPa.C9D().Cgq(c38321qM, "bottom_sheet");
                return;
            default:
                c75113Zb.A1G = interfaceC88183wS.getId();
                c75113Zb.A1F = interfaceC88183wS.getData();
                InterfaceC692739n C9D2 = interfaceC43585JPa.C9D();
                String id2 = c38321qM.getId();
                if (id2 != null) {
                    String CAR = c38321qM.CAR();
                    int position = c75113Zb.getPosition();
                    C9D2.Dth(c38321qM.B5n(), c38321qM, id2, CAR, interfaceC88183wS.getId(), interfaceC88183wS.getData(), null, c75113Zb.A1U, -1, position, true, false, AbstractC167007dF.A1X(mediaControlEventSourceEnum, MediaControlEventSourceEnum.A05));
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
    
        if (r1 == 5) goto L6;
     */
    @Override // X.InterfaceC50486MQo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Dw9() {
        /*
            r9 = this;
            com.instagram.api.schemas.MediaControlEventSourceEnum r2 = r9.A01
            int r1 = r2.ordinal()
            r0 = 1
            if (r1 == r0) goto Ld
            r0 = 5
            r7 = 0
            if (r1 != r0) goto Le
        Ld:
            r7 = 1
        Le:
            X.JPa r0 = r9.A05
            X.39n r3 = r0.C9D()
            X.1qM r4 = r9.A04
            X.3Zb r5 = r9.A06
            java.lang.String r6 = r2.A00
            r8 = 0
            r3.Dm3(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42654IuB.Dw9():void");
    }
}
