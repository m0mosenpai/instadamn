package X;

import androidx.fragment.app.Fragment;
import instagram.features.stories.fragment.ReelMoreOptionsFragment;
import java.lang.ref.Reference;
import java.util.Iterator;

/* renamed from: X.N9z, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52236N9z extends C1P1 {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C52236N9z(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03;
        int i;
        C39033HGj c39033HGj;
        String str;
        switch (this.A00) {
            case 1:
                A03 = C0f9.A03(1313057315);
                OUG oug = (OUG) this.A01;
                String str2 = this.A02;
                C11T.A02(new PSI(oug.A04.A01(C05F.A01, str2), oug, str2));
                i = -793231926;
                break;
            case 2:
                A03 = C0f9.A03(-1753489623);
                OUG oug2 = (OUG) this.A01;
                String str3 = this.A02;
                C11T.A02(new PSI(oug2.A04.A01(C05F.A0C, str3), oug2, str3));
                i = 1516510196;
                break;
            case 3:
                A03 = AbstractC167017dG.A0N(abstractC115105If, -1912867480);
                OZD.A00.remove(this.A02);
                C54689ODp c54689ODp = (C54689ODp) this.A01;
                Throwable A01 = abstractC115105If.A01();
                if (A01 != null) {
                    C0w9.A07("Failed to get LeadGenDeepLinkQueryModel ", A01);
                }
                if ((abstractC115105If instanceof C115115Ig) && (c39033HGj = (C39033HGj) ((C115115Ig) abstractC115105If).A00) != null && (str = c39033HGj.A07) != null) {
                    C0w9.A03("LeadGenDeepLinkQueryModel error message", str);
                }
                Iterator A13 = AbstractC166997dE.A13(c54689ODp.A04);
                while (A13.hasNext()) {
                    InterfaceC58051Poc interfaceC58051Poc = (InterfaceC58051Poc) ((Reference) AbstractC166997dE.A0l(A13)).get();
                    if (interfaceC58051Poc != null) {
                        interfaceC58051Poc.onFailure();
                    }
                }
                i = -1085575826;
                break;
            case 4:
                A03 = C0f9.A03(-2049585601);
                C9GR.A01(AbstractC31172DnG.A06(((ViewOnClickListenerC55468OkN) this.A01).A01), "save_gender_failed", 2131972429, 1);
                i = -1436725543;
                break;
            case 5:
                A03 = C0f9.A03(1967123791);
                ((OJ3) this.A01).A01.A05(this.A02, 0);
                i = -1097922194;
                break;
            case 6:
                A03 = C0f9.A03(467272803);
                Fragment fragment = (Fragment) this.A01;
                C9GR.A03(fragment.getContext(), AbstractC47839LBc.A00(fragment.requireContext(), abstractC115105If), "validateUrlAndSaveOthers_fail", 0);
                i = 1825859781;
                break;
            default:
                super.onFail(abstractC115105If);
                return;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(-1706366164);
                V16.A05((V16) this.A01);
                i = 886633431;
                break;
            case 1:
            case 2:
            case 3:
            case 5:
            default:
                super.onFinish();
                return;
            case 4:
                A03 = C0f9.A03(-218139780);
                ViewOnClickListenerC55468OkN viewOnClickListenerC55468OkN = (ViewOnClickListenerC55468OkN) this.A01;
                ((InterfaceC56362iU) viewOnClickListenerC55468OkN.A02).ETp(true);
                AbstractC31176DnK.A0J((Fragment) viewOnClickListenerC55468OkN.A01).setIsLoading(false);
                i = 83152566;
                break;
            case 6:
                A03 = C0f9.A03(-710374642);
                ReelMoreOptionsFragment reelMoreOptionsFragment = (ReelMoreOptionsFragment) this.A01;
                reelMoreOptionsFragment.A0M = false;
                ReelMoreOptionsFragment.A0A(reelMoreOptionsFragment);
                i = -1771241750;
                break;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(-1486632131);
                V16 v16 = (V16) this.A01;
                V16.A06(v16);
                v16.A0D = null;
                i = -1442758212;
                break;
            case 1:
            case 2:
            case 3:
            case 5:
            default:
                super.onStart();
                return;
            case 4:
                A03 = C0f9.A03(-1879180014);
                ViewOnClickListenerC55468OkN viewOnClickListenerC55468OkN = (ViewOnClickListenerC55468OkN) this.A01;
                ((InterfaceC56362iU) viewOnClickListenerC55468OkN.A02).ETp(false);
                AbstractC31176DnK.A0z(AbstractC31171DnF.A09(viewOnClickListenerC55468OkN.A01), C56352iT.A0t);
                i = 816742932;
                break;
            case 6:
                A03 = C0f9.A03(413469221);
                ReelMoreOptionsFragment reelMoreOptionsFragment = (ReelMoreOptionsFragment) this.A01;
                reelMoreOptionsFragment.A0M = true;
                ReelMoreOptionsFragment.A0A(reelMoreOptionsFragment);
                i = 769381093;
                break;
        }
        C0f9.A0A(i, A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x048c, code lost:
    
        if (r1 == 4) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x04e5, code lost:
    
        if (r0 != 7) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x04a9, code lost:
    
        if (X.AbstractC001900j.A0a(r1, "RESURRECTION", false) == false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bb, code lost:
    
        if (r0.A0S != false) goto L32;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:143:0x0479. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, X.VJl] */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r33) {
        /*
            Method dump skipped, instructions count: 1304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52236N9z.onSuccess(java.lang.Object):void");
    }
}
