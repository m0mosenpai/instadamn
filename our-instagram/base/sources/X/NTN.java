package X;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Point;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NTN extends AbstractC55206OeJ {
    public C51873MwH A00;
    public final Activity A01;
    public final UserSession A02;
    public final C23031Ai A03;
    public final OI6 A04;
    public final C55177Odh A05;
    public final PC2 A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;

    @Override // X.AbstractC55206OeJ
    public final void A0K(InterfaceC57858PlO interfaceC57858PlO) {
        C55177Odh c55177Odh;
        InterfaceC57854PlK interfaceC57854PlK;
        InterfaceC57854PlK interfaceC57854PlK2;
        C55177Odh c55177Odh2;
        Point point;
        Display display;
        C55177Odh c55177Odh3;
        InterfaceC57858PlO c56656PDa;
        if (interfaceC57858PlO instanceof PE3) {
            C23031Ai c23031Ai = this.A03;
            InterfaceC16530ry interfaceC16530ry = c23031Ai.A8R;
            C0YR[] c0yrArr = C23031Ai.A8c;
            if (!AbstractC167017dG.A1b(c23031Ai, interfaceC16530ry, c0yrArr, 239)) {
                int ordinal = ((EnumC53142Nev) this.A08.getValue()).ordinal();
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        this.A04.A00(C56592PAo.A00);
                        c55177Odh3 = this.A05;
                        Integer num = C05F.A04;
                        PC2 pc2 = this.A06;
                        C193328hC A0H = AbstractC31171DnF.A0H(this.A01);
                        A0H.A0A(2131972930);
                        A0H.A09(2131972929);
                        AbstractC31173DnH.A15(pc2.A00.getContext(), A0H, R.drawable.ig_illustrations_illo_screen_share_refresh);
                        A0H.A0J(DialogInterfaceOnClickListenerC55320Ogi.A00(pc2, 34), 2131972928);
                        A0H.A03();
                        A0H.A0s(true);
                        A0H.A0t(true);
                        c56656PDa = new PDV(A0H.A02(), num);
                    }
                } else {
                    this.A04.A00(C56592PAo.A00);
                    c55177Odh3 = this.A05;
                    c56656PDa = new C56656PDa(AbstractC167007dF.A0L(this.A06.A02), C05F.A03, C05F.A00, true);
                }
                c55177Odh3.A05(c56656PDa);
                AbstractC167007dF.A1L(c23031Ai, interfaceC16530ry, c0yrArr, 239, true);
                return;
            }
            c55177Odh = this.A05;
            interfaceC57854PlK2 = PFU.A00;
        } else {
            if (interfaceC57858PlO instanceof PDX) {
                PDX pdx = (PDX) interfaceC57858PlO;
                if (pdx.A00 != 322436845) {
                    return;
                }
                int i = pdx.A01;
                Intent intent = pdx.A02;
                if (intent != null && i == -1) {
                    c55177Odh2 = this.A05;
                    if (Build.VERSION.SDK_INT >= 30) {
                        try {
                            display = this.A01.getDisplay();
                        } catch (UnsupportedOperationException e) {
                            C0K8.A0F("RtcScreenSharePresenter", "Error getting display from context", e);
                            new OLI(C18950wb.A01).A02("RtcScreenSharePresenter: Error getting display", e);
                            display = null;
                        }
                    } else {
                        Object systemService = this.A01.getSystemService("window");
                        C14360o3.A0C(systemService, AbstractC58317Pt9.A00(2));
                        display = ((WindowManager) systemService).getDefaultDisplay();
                    }
                    point = new Point();
                    if (display != null) {
                        display.getRealSize(point);
                    }
                } else {
                    c55177Odh2 = this.A05;
                    intent = null;
                    point = new Point();
                }
                c55177Odh2.A03(new PFR(intent, point));
                return;
            }
            if (!(interfaceC57858PlO instanceof C56678PDw) && !(interfaceC57858PlO instanceof C56642PCm)) {
                if (!(interfaceC57858PlO instanceof C56677PDv) && !(interfaceC57858PlO instanceof C56641PCl)) {
                    return;
                }
                c55177Odh = this.A05;
                interfaceC57854PlK = PFT.A00;
            } else {
                c55177Odh = this.A05;
                interfaceC57854PlK = PFS.A00;
            }
            interfaceC57854PlK2 = interfaceC57854PlK;
        }
        c55177Odh.A03(interfaceC57854PlK2);
    }

    public final void A0M() {
        Integer num;
        InterfaceC09390do interfaceC09390do = this.A08;
        Object value = interfaceC09390do.getValue();
        EnumC53142Nev enumC53142Nev = EnumC53142Nev.A02;
        if (value == enumC53142Nev) {
            this.A05.A05(C56673PDr.A00);
        }
        this.A05.A03(PFU.A00);
        if (interfaceC09390do.getValue() == enumC53142Nev) {
            num = C05F.A0C;
        } else {
            num = C05F.A0N;
        }
        this.A04.A00(new C56587PAj(num));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NTN(Activity activity, View view, UserSession userSession, OI6 oi6, C55177Odh c55177Odh) {
        super(AbstractC25225BEi.A1D(C51873MwH.class));
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        AbstractC37302Gc3.A1U(c55177Odh, oi6);
        C14360o3.A0B(A00, 6);
        this.A01 = activity;
        this.A05 = c55177Odh;
        this.A04 = oi6;
        this.A02 = userSession;
        this.A03 = A00;
        this.A06 = new PC2(view, this);
        this.A07 = C57543PgH.A01(this, 30);
        this.A08 = C57543PgH.A01(this, 31);
    }
}
