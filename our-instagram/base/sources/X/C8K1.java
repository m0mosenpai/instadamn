package X;

import android.app.Application;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import java.util.List;

/* renamed from: X.8K1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8K1 {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final TargetViewSizeProvider A02;
    public final C89P A03;
    public final C8K2 A04;
    public final InterfaceC09390do A05;
    public final AnonymousClass840 A06;
    public final C84F A07;
    public final ClipsCreationViewModel A08;
    public final C8A7 A09;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.2ba, java.lang.Object] */
    public C8K1(FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, AnonymousClass840 anonymousClass840, C8K0 c8k0) {
        C14360o3.A0B(anonymousClass840, 6);
        this.A01 = userSession;
        this.A00 = fragmentActivity;
        this.A02 = targetViewSizeProvider;
        this.A06 = anonymousClass840;
        C89P c89p = (C89P) new C52942bb(new C89O(fragmentActivity, userSession), fragmentActivity).A00(C89P.class);
        this.A03 = c89p;
        C8A7 c8a7 = (C8A7) new C52942bb((InterfaceC52932ba) new Object(), fragmentActivity).A00(C8A7.class);
        this.A09 = c8a7;
        ClipsCreationViewModel clipsCreationViewModel = (ClipsCreationViewModel) new C52942bb(new AnonymousClass846(userSession, fragmentActivity), fragmentActivity).A00(ClipsCreationViewModel.class);
        this.A08 = clipsCreationViewModel;
        Application application = fragmentActivity.getApplication();
        C14360o3.A07(application);
        C84F A00 = AnonymousClass849.A00(application, userSession).A00(clipsCreationViewModel.A0S);
        this.A07 = A00;
        this.A04 = new C8K2(fragmentActivity, userSession);
        this.A05 = AbstractC09440dt.A01(new C9ES(this, 36));
        C07X viewLifecycleOwner = abstractC59962oe.getViewLifecycleOwner();
        c89p.A0H.A06(abstractC59962oe, new C8K3(new C207189Ex(9, this, c8k0)));
        A00.A05.A00.A06(abstractC59962oe, new C8K3(new C9EL(this, 1)));
        AbstractC18560vj.A03(C07Y.A00(viewLifecycleOwner), new C15340po(new C9DA(c8k0, this, (InterfaceC23621Ds) null), c8a7.A0A));
    }

    public final int A00() {
        String str;
        List BsT;
        int i;
        InterfaceC110074xc interfaceC110074xc;
        Integer num;
        int intValue;
        C89P c89p = this.A03;
        InterfaceC110214xq interfaceC110214xq = c89p.A04;
        if (interfaceC110214xq != null && (BsT = interfaceC110214xq.BsT()) != null) {
            C2GT c2gt = this.A07.A05.A00;
            C84B c84b = (C84B) c2gt.A02();
            if (c84b != null) {
                i = AbstractC189168Zk.A00(c84b);
            } else {
                C84B c84b2 = (C84B) c2gt.A02();
                if (c84b2 != null) {
                    i = c84b2.A01.size();
                } else {
                    i = 0;
                }
            }
            if (c89p.A0N() && (num = c89p.A0A) != null && (intValue = num.intValue()) < BsT.size()) {
                interfaceC110074xc = (InterfaceC110074xc) AbstractC001800i.A0O(BsT, intValue);
                if (interfaceC110074xc == null) {
                    str = "Index to replace is out of bounds.";
                }
                return (int) interfaceC110074xc.getDurationInMs();
            }
            if (i < BsT.size()) {
                interfaceC110074xc = (InterfaceC110074xc) AbstractC001800i.A0O(BsT, i);
                if (interfaceC110074xc == null) {
                    str = "Segment store size is out of bounds.";
                }
                return (int) interfaceC110074xc.getDurationInMs();
            }
            str = "Getting segment length after all empty segments filled.";
        } else {
            str = "Template segments info is null.";
        }
        AbstractC12120kG.A07("ClipsTemplateCaptureController", str, null);
        return 15000;
    }
}
