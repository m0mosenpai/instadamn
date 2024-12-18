package X;

import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.creation.fragment.EditMediaInfoFragment;

/* loaded from: classes9.dex */
public final class PJV implements C8EZ {
    public final /* synthetic */ EditMediaInfoFragment A00;

    public PJV(EditMediaInfoFragment editMediaInfoFragment) {
        this.A00 = editMediaInfoFragment;
    }

    @Override // X.C8EZ
    public final void DJ8(boolean z) {
        MediaGenAIDetectionMethod mediaGenAIDetectionMethod;
        EditMediaInfoFragment editMediaInfoFragment = this.A00;
        if (z) {
            mediaGenAIDetectionMethod = MediaGenAIDetectionMethod.A0C;
        } else {
            mediaGenAIDetectionMethod = MediaGenAIDetectionMethod.A0B;
        }
        editMediaInfoFragment.A06 = mediaGenAIDetectionMethod;
        InterfaceC56392iX interfaceC56392iX = editMediaInfoFragment.mAddGenAILabelStubber;
        int i = 8;
        boolean z2 = false;
        if (interfaceC56392iX != null) {
            interfaceC56392iX.setVisibility(AbstractC31175DnJ.A01(z ? 1 : 0));
            if (!z) {
                EditMediaInfoFragment.A02(editMediaInfoFragment.mAddGenAILabelStubber.getView(), editMediaInfoFragment);
            }
        }
        InterfaceC56392iX interfaceC56392iX2 = editMediaInfoFragment.mReplaceGenAILabelStubber;
        if (interfaceC56392iX2 != null) {
            if (z) {
                i = 0;
            }
            interfaceC56392iX2.setVisibility(i);
            if (z) {
                EditMediaInfoFragment.A02(editMediaInfoFragment.mReplaceGenAILabelStubber.getView(), editMediaInfoFragment);
            }
        }
        C38321qM c38321qM = editMediaInfoFragment.A0I;
        if (c38321qM != null && c38321qM.A1J() != editMediaInfoFragment.A06) {
            z2 = true;
        }
        editMediaInfoFragment.A0p = z2;
        EditMediaInfoFragment.A07(editMediaInfoFragment);
    }
}
