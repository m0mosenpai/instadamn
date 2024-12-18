package X;

import android.app.Application;
import com.meta.metaai.shared.feedback.data.FeedbackRepository;

/* renamed from: X.BcA, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25855BcA extends AbstractC52922bZ {
    public final Application A00;
    public final C27907CRs A01;
    public final FeedbackRepository A02;
    public final C05A A03;
    public final C05A A04;
    public final C0UO A05;
    public final C0UO A06;
    public final boolean A07;

    public C25855BcA(Application application, C27907CRs c27907CRs, FeedbackRepository feedbackRepository, boolean z) {
        this.A07 = z;
        this.A02 = feedbackRepository;
        this.A00 = application;
        this.A01 = c27907CRs;
        C008002u A1H = AbstractC25225BEi.A1H(new C28259Cd4(null, "WriteWithAIFeedbackBottomSheet"));
        this.A03 = A1H;
        this.A05 = AbstractC208910l.A02(A1H);
        C008002u A00 = C10E.A00(C28246Ccq.A00);
        this.A04 = A00;
        this.A06 = A00;
    }

    public final void A01(C7D c7d, String str, String str2) {
        int A06 = AbstractC167007dF.A06(1, str, str2);
        C27907CRs c27907CRs = this.A01;
        C28172CbJ c28172CbJ = c27907CRs.A00;
        EnumC72434Xde A00 = AbstractC72654Xjw.A00(((C27326C4h) c27907CRs.A01).A00);
        C8f c8f = C8f.WRITE;
        C14360o3.A0B(c8f, A06);
        C28172CbJ.A00(c8f, A00, c28172CbJ, "feedback_submitted", "thumbs_down");
        AbstractC166987dD.A1Z(new C50125MBz(this, c7d, str2, str, null, 20), C2SW.A00);
        C05A c05a = this.A04;
        do {
        } while (!c05a.AIi(c05a.getValue(), C28250Ccu.A00));
        do {
        } while (!c05a.AIi(c05a.getValue(), C28245Ccp.A00));
    }

    public final void A03(String str, String str2) {
        AbstractC167017dG.A1N(str, str2);
        C27907CRs c27907CRs = this.A01;
        C28172CbJ c28172CbJ = c27907CRs.A00;
        EnumC72434Xde A00 = AbstractC72654Xjw.A00(((C27326C4h) c27907CRs.A01).A00);
        C8f c8f = C8f.WRITE;
        AbstractC167017dG.A1O(A00, c8f);
        C28172CbJ.A00(c8f, A00, c28172CbJ, "feedback_submitted", "thumbs_up");
        C7D c7d = C7D.A09;
        AbstractC166987dD.A1Z(new C50125MBz(this, c7d, str2, str, null, 20), C2SW.A00);
        C05A c05a = this.A04;
        do {
        } while (!c05a.AIi(c05a.getValue(), C28251Ccv.A00));
        do {
        } while (!c05a.AIi(c05a.getValue(), C28245Ccp.A00));
    }

    public final void A00() {
        C27907CRs c27907CRs = this.A01;
        C28172CbJ c28172CbJ = c27907CRs.A00;
        EnumC72434Xde A00 = AbstractC72654Xjw.A00(((C27326C4h) c27907CRs.A01).A00);
        C8f c8f = C8f.WRITE;
        AbstractC167017dG.A1O(A00, c8f);
        C28172CbJ.A00(c8f, A00, c28172CbJ, "negative_feedback_click", null);
        C05A c05a = this.A03;
        c05a.Egh(new C28259Cd4(((C28259Cd4) c05a.getValue()).A00, "WriteWithAIBadReasonBottomSheet"));
        this.A04.Egh(C28249Cct.A00);
    }

    public final void A02(String str) {
        C05A c05a;
        Object obj;
        if (C14360o3.A0K(str, "WriteWithAIFeedbackBottomSheet") || (C14360o3.A0K(str, "WriteWithAIBadReasonBottomSheet") && this.A07)) {
            c05a = this.A04;
            obj = C28245Ccp.A00;
        } else {
            c05a = this.A04;
            obj = C28247Ccr.A00;
        }
        c05a.Egh(obj);
    }
}
