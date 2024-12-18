package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.messagethread.collections.model.DirectCollectionArguments;
import com.instagram.save.model.SavedCollection;

/* renamed from: X.ESg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32480ESg extends C1P1 {
    public final /* synthetic */ EMG A00;
    public final /* synthetic */ SavedCollection A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    public C32480ESg(EMG emg, SavedCollection savedCollection, boolean z, boolean z2) {
        this.A00 = emg;
        this.A01 = savedCollection;
        this.A02 = z;
        this.A03 = z2;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        ImageUrl A1S;
        int A03 = C0f9.A03(-2088147153);
        int A032 = C0f9.A03(-349787905);
        EMG emg = this.A00;
        C34682FPt c34682FPt = emg.A07;
        if (c34682FPt != null) {
            SavedCollection savedCollection = this.A01;
            C38321qM A0z = AbstractC25226BEj.A0z(emg.A0K);
            if (A0z != null && (A1S = A0z.A1S()) != null) {
                c34682FPt.A00(A1S, savedCollection);
            } else {
                IllegalStateException A0g = AbstractC166997dE.A0g();
                C0f9.A0A(-2139577609, A032);
                throw A0g;
            }
        }
        InterfaceC09390do interfaceC09390do = emg.A0I;
        C34999FbW c34999FbW = (C34999FbW) interfaceC09390do.getValue();
        boolean z = this.A02;
        if (z && !this.A03) {
            DirectCollectionArguments directCollectionArguments = c34999FbW.A01;
            if (directCollectionArguments.A03 == C05F.A00) {
                C19280xC A01 = C19280xC.A01("instagram_organic_save", directCollectionArguments.A07);
                String str = directCollectionArguments.A04;
                if (str == null) {
                    str = directCollectionArguments.A05;
                }
                A01.A0C("m_pk", str);
                AbstractC31173DnH.A1S(A01, c34999FbW.A00);
            }
        }
        ((C34999FbW) interfaceC09390do.getValue()).A01(this.A01, z);
        C0f9.A0A(954856442, A032);
        C0f9.A0A(1796378541, A03);
    }
}
