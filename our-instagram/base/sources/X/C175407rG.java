package X;

import java.io.File;
import java.io.FileDescriptor;

/* renamed from: X.7rG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C175407rG {
    public int A00;
    public BDG A01;
    public C23106AGs A02;
    public Y1s A03;
    public C175007qa A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final C175007qa A0F;
    public final String A0G;
    public final C1814082s A0D = new C1814082s();
    public final InterfaceC184558Gw A0B = new InterfaceC184558Gw() { // from class: X.7rH
        @Override // X.InterfaceC184558Gw
        public final void Dak() {
            AbstractC175037qd.A01("ConcurrentFrontBackController", "Main camera preview started");
            C175407rG c175407rG = C175407rG.this;
            c175407rG.A09 = true;
            C175407rG.A03(c175407rG);
        }
    };
    public final InterfaceC184558Gw A0A = new InterfaceC184558Gw() { // from class: X.7rI
        @Override // X.InterfaceC184558Gw
        public final void Dak() {
            AbstractC175037qd.A01("ConcurrentFrontBackController", "Auxiliary camera preview started");
            C175407rG c175407rG = C175407rG.this;
            c175407rG.A05 = true;
            C175407rG.A03(c175407rG);
        }
    };
    public final C1814082s A0E = new C1814082s();
    public final InterfaceC174807qG A0C = new InterfaceC174807qG() { // from class: X.7rJ
        @Override // X.InterfaceC174807qG
        public final void Dal() {
            AbstractC175037qd.A01("ConcurrentFrontBackController", "Main camera preview stopped");
            C175407rG c175407rG = C175407rG.this;
            if (!c175407rG.A06) {
                c175407rG.A06 = true;
                if (!c175407rG.A0E.A00.isEmpty() && c175407rG.A06) {
                    c175407rG.A06 = false;
                    C176567tE.A00(new RunnableC24283Apo(c175407rG));
                }
            }
        }
    };

    public static void A00(AbstractC184688Hj abstractC184688Hj, C23106AGs c23106AGs, C175007qa c175007qa) {
        File file = (File) c23106AGs.A00(C23106AGs.A07);
        String str = (String) c23106AGs.A00(C23106AGs.A09);
        FileDescriptor fileDescriptor = (FileDescriptor) c23106AGs.A00(C23106AGs.A08);
        if (file != null) {
            c175007qa.A0N.EoD(abstractC184688Hj, file, null);
        } else if (str != null) {
            c175007qa.A0N.EoF(abstractC184688Hj, str, null);
        } else {
            if (fileDescriptor == null) {
                return;
            }
            c175007qa.A0N.EoE(abstractC184688Hj, fileDescriptor, null);
        }
    }

    public static void A01(AbstractC184688Hj abstractC184688Hj, C175407rG c175407rG, String str) {
        AbstractC175037qd.A01("ConcurrentFrontBackController", "Disconnecting camera");
        c175407rG.A0D.A00();
        if (!c175407rG.A0F.A0I(new C198158pQ(abstractC184688Hj, c175407rG, str), AnonymousClass001.A0R("disconnect_main_for_concurrent_front_back_mode_", str))) {
            AbstractC175037qd.A01("ConcurrentFrontBackController", "Main camera was already disconnected");
            A02(abstractC184688Hj, c175407rG, str);
        }
    }

    public static void A02(AbstractC184688Hj abstractC184688Hj, C175407rG c175407rG, String str) {
        String str2;
        String str3;
        if (c175407rG.A04 != null) {
            if (!r3.A0I(new C198148pP(abstractC184688Hj, c175407rG), AnonymousClass001.A0R("disconnect_auxiliary_for_concurrent_front_back_mode_", str))) {
                str2 = "ConcurrentFrontBackController";
                str3 = "Auxiliary camera was already disconnected";
            } else {
                return;
            }
        } else {
            str2 = "ConcurrentFrontBackController";
            str3 = "No auxiliary instance to disconnect from";
        }
        AbstractC175037qd.A01(str2, str3);
        abstractC184688Hj.A02(null);
    }

    public static void A03(C175407rG c175407rG) {
        if (!c175407rG.A0D.A00.isEmpty() && c175407rG.A09 && c175407rG.A05) {
            c175407rG.A09 = false;
            c175407rG.A05 = false;
            C176567tE.A00(new RunnableC24282Apn(c175407rG));
        }
    }

    public C175407rG(C175007qa c175007qa, String str) {
        this.A0F = c175007qa;
        this.A0G = str;
    }
}
