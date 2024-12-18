package X;

import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.PHb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56759PHb implements InterfaceC1119153d {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C56759PHb(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    @Override // X.InterfaceC1119153d
    public final void Czx() {
        switch (this.A00) {
            case 0:
                NOW A0e = MSW.A0e(((C52573NNt) this.A01).A04);
                String str = this.A02;
                C54976OTi c54976OTi = A0e.A0M;
                InterfaceC58268PsC.A00(C54976OTi.A00(c54976OTi, str, null), c54976OTi.A00, c54976OTi.A01, "lead_gen_business_profile_content", "business_profile_bottom_sheet_dismiss");
                return;
            case 1:
                HZ6 hz6 = (HZ6) this.A01;
                if (HZ6.A00(hz6) != null) {
                    return;
                }
                HZ6.A02(hz6, this.A02);
                return;
            default:
                C26861BtN c26861BtN = (C26861BtN) this.A01;
                C28179CbR c28179CbR = (C28179CbR) c26861BtN.A03.getValue();
                String str2 = this.A02;
                String str3 = (String) AbstractC166987dD.A17(c26861BtN.A01);
                C14360o3.A0B(str3, 1);
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c28179CbR.A00, "ig_camera_end_camera_session");
                if (A0f.isSampled()) {
                    AbstractC166997dE.A1N(A0f, "event_type", 2);
                    AbstractC31171DnF.A1D(A0f, "clips_add_derivative_spin");
                    A0f.A8R(EnumC114925Hg.CLIPS_SPIN, "camera_destination");
                    AbstractC166987dD.A1S(A0f, str3);
                    AbstractC166997dE.A1N(A0f, "exit_point", 15);
                    A0f.A8R(C22P.A1a, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                    AbstractC50522MSa.A17(A0f, 3);
                    A0f.AAP("discovery_session_id", "");
                    AbstractC25233BEq.A17(A0f, "search_session_id", "");
                    AbstractC37300Gc1.A0h(A0f, AbstractC166997dE.A0j(str2));
                    A0f.Cht();
                    return;
                }
                return;
        }
    }

    @Override // X.InterfaceC1119153d
    public final void D00() {
    }
}
