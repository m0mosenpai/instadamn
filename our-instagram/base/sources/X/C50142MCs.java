package X;

import com.instagram.model.direct.messageid.DirectMessageIdentifier;

/* renamed from: X.MCs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C50142MCs extends C03E implements InterfaceC16620sF {
    public C50142MCs(Object obj) {
        super(2, obj, C1579977j.class, "onTranscriptionButtonClick", "onTranscriptionButtonClick(Lcom/instagram/direct/messagethread/voice/model/VoiceContentViewModel;Lcom/instagram/direct/messagethread/voice/VoiceContentViewHolder;)V", 0);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C38321qM c38321qM;
        Integer num;
        String str;
        Integer num2;
        C7SX c7sx = (C7SX) obj;
        C43678JTm c43678JTm = (C43678JTm) obj2;
        boolean A1a = AbstractC167017dG.A1a(c7sx, c43678JTm);
        C1579977j c1579977j = (C1579977j) this.receiver;
        if (C1579977j.A04(c1579977j, c7sx)) {
            C45117Jxm c45117Jxm = c7sx.A02;
            C45117Jxm c45117Jxm2 = null;
            if (c45117Jxm != null) {
                int A0H = AbstractC166987dD.A0H(c45117Jxm.A01);
                if (A0H != 4 && A0H != 2) {
                    if (A0H == 3 && c45117Jxm.A03 != null) {
                        num2 = C05F.A0Y;
                    }
                } else {
                    num2 = C05F.A0N;
                }
                c45117Jxm2 = new C45117Jxm(num2, c45117Jxm.A03, c45117Jxm.A02, c45117Jxm.A05, c45117Jxm.A04);
            }
            if (c45117Jxm2 != null) {
                C7DM c7dm = c1579977j.A05;
                long j = c7sx.A00 / 1000;
                if (c45117Jxm2.A01 == C05F.A0Y) {
                    num = C05F.A01;
                } else {
                    num = C05F.A0C;
                }
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c7dm.A00, "audio_clips_transcription_button_click");
                if (A0f.isSampled()) {
                    AbstractC43593JPy.A1F(A0f, j);
                    if (1 - num.intValue() != 0) {
                        str = "HIDE";
                    } else {
                        str = "SHOW";
                    }
                    AbstractC31175DnJ.A15(A0f, str);
                }
                InterfaceC165007Zp interfaceC165007Zp = (InterfaceC165007Zp) c1579977j.A02;
                DirectMessageIdentifier directMessageIdentifier = c7sx.A07;
                interfaceC165007Zp.FAT(c45117Jxm2, directMessageIdentifier);
                c43678JTm.A01(c45117Jxm2, directMessageIdentifier);
            } else {
                L1V l1v = new L1V(c1579977j, c43678JTm, c7sx);
                String str2 = c7sx.A0C;
                if (str2 == null && (c38321qM = c7sx.A06) != null && c38321qM.A2G().A0R == A1a) {
                    C5H1 c5h1 = c38321qM.A2G().A07;
                    str2 = c5h1 != null ? c5h1.Ae0() : null;
                }
                long j2 = c7sx.A00 / 1000;
                InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(c1579977j.A05.A00, "audio_clips_transcription_button_click");
                if (A0f2.isSampled()) {
                    AbstractC43593JPy.A1F(A0f2, j2);
                    AbstractC31175DnJ.A15(A0f2, "START");
                }
                ((InterfaceC165007Zp) c1579977j.A02).Eo4(l1v, c7sx.A06, c7sx.A07, str2);
            }
        }
        return C0eB.A00;
    }
}
