package X;

import com.facebook.browser.lite.BrowserLiteFragment;

/* renamed from: X.TGv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64507TGv implements InterfaceC65577TnB {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C64507TGv(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // X.InterfaceC65577TnB
    public final void D08() {
        SPM spm;
        if (this.A00 == 0) {
            C63397SjR c63397SjR = (C63397SjR) this.A02;
            InterfaceC65577TnB interfaceC65577TnB = c63397SjR.A0I;
            if (interfaceC65577TnB != null) {
                interfaceC65577TnB.D08();
            }
            if (c63397SjR.A00 != 0.0d && (spm = c63397SjR.A0K) != null && !C14360o3.A0K(spm.A02, "secondary_cta")) {
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(spm.A04, "instagram_cnb_partial_sheet_interaction");
                if (A0f.isSampled()) {
                    A0f.AAP("from_size", spm.A02);
                    A0f.AAP("to_size", spm.A02);
                    A0f.A9K("ad_id", AbstractC25233BEq.A0n(spm.A05));
                    A0f.AAP("callsite_session_id", spm.A01);
                    A0f.AAP("action_type", "nudge");
                    A0f.AAP("launch_method", spm.A06);
                    A0f.Cht();
                }
            }
        }
    }

    @Override // X.InterfaceC65577TnB
    public final void DBZ() {
        if (this.A00 == 0) {
            C63397SjR c63397SjR = (C63397SjR) this.A02;
            InterfaceC65577TnB interfaceC65577TnB = c63397SjR.A0I;
            if (interfaceC65577TnB != null) {
                interfaceC65577TnB.DBZ();
            }
            SPM spm = c63397SjR.A0K;
            if (spm != null) {
                spm.A02("full", "expand", "double_tap");
            }
            C172707mf c172707mf = (C172707mf) this.A01;
            if (c63397SjR.A0n) {
                C63397SjR.A03(c172707mf, c63397SjR);
            }
        }
    }

    @Override // X.InterfaceC65577TnB
    public final boolean DQq() {
        C63397SjR c63397SjR;
        InterfaceC65577TnB interfaceC65577TnB;
        if (this.A00 == 0 && (interfaceC65577TnB = (c63397SjR = (C63397SjR) this.A02).A0I) != null) {
            C172707mf c172707mf = (C172707mf) this.A01;
            SPM spm = c63397SjR.A0K;
            if (spm != null) {
                spm.A02("full", "expand", AbstractC111324zv.A00(1084));
            }
            boolean DQq = interfaceC65577TnB.DQq();
            if (c63397SjR.A0n && DQq) {
                C63397SjR.A03(c172707mf, c63397SjR);
            }
            return DQq;
        }
        return false;
    }

    @Override // X.InterfaceC65577TnB
    public final void DWf() {
        SPM spm;
        if (this.A00 == 0) {
            C63397SjR c63397SjR = (C63397SjR) this.A02;
            InterfaceC65577TnB interfaceC65577TnB = c63397SjR.A0I;
            if (interfaceC65577TnB != null) {
                interfaceC65577TnB.DWf();
            }
            if (c63397SjR.A15 && (spm = c63397SjR.A0K) != null) {
                spm.A02("secondary_cta", "dismiss", "interaction_tap");
            }
        }
    }

    @Override // X.InterfaceC65577TnB
    public final void DmX() {
        if (this.A00 != 0) {
            C38321qM c38321qM = (C38321qM) this.A01;
            if (c38321qM != null) {
                HD4 hd4 = (HD4) this.A02;
                C6Qi.A00(HD4.A01(hd4), c38321qM, hd4.A0M, "bottom_sheet_tap_to_expand_fullscreen");
                return;
            }
            return;
        }
        C63397SjR c63397SjR = (C63397SjR) this.A02;
        InterfaceC65577TnB interfaceC65577TnB = c63397SjR.A0I;
        if (interfaceC65577TnB != null) {
            interfaceC65577TnB.DmX();
        }
        SPM spm = c63397SjR.A0K;
        if (spm != null) {
            spm.A02("full", "expand", "tap");
        }
        if (c63397SjR.A0x && !C63397SjR.A08(c63397SjR)) {
            ((BrowserLiteFragment) this.A01).FD0(VD2.A02, C05F.A1F);
        }
        C172707mf c172707mf = (C172707mf) this.A01;
        if (!c63397SjR.A0n) {
            return;
        }
        C63397SjR.A03(c172707mf, c63397SjR);
    }
}
