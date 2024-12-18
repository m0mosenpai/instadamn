package X;

import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository;
import java.util.ArrayList;

/* renamed from: X.8Ce, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C183558Ce {
    public final /* synthetic */ ClipsCreationDraftViewModel A00;

    public C183558Ce(ClipsCreationDraftViewModel clipsCreationDraftViewModel) {
        this.A00 = clipsCreationDraftViewModel;
    }

    public final EnumC191648eM A00() {
        ArrayList arrayList = this.A00.A0G.A04.A01;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (EnumC191648eM) ((C09530e4) AbstractC001800i.A0K(arrayList)).A00;
    }

    public final C09530e4 A01(boolean z) {
        C09530e4 c09530e4;
        ClipsCreationDraftViewModel clipsCreationDraftViewModel = this.A00;
        ClipsDraftRepository clipsDraftRepository = clipsCreationDraftViewModel.A0G;
        C193658hl c193658hl = clipsDraftRepository.A04;
        ArrayList arrayList = c193658hl.A01;
        if (arrayList.isEmpty()) {
            c09530e4 = null;
        } else {
            c09530e4 = (C09530e4) AnonymousClass016.A15(arrayList);
            c193658hl.A03.Egh(Integer.valueOf(((Number) r1.getValue()).intValue() - 1));
        }
        if (c09530e4 == null) {
            return null;
        }
        if (z) {
            C128175qm A01 = ClipsCreationDraftViewModel.A01(clipsCreationDraftViewModel);
            if (A01 == null) {
                AbstractC12120kG.A07("ClipsCreationDraftViewModel", "Draft Snapshot is null when undo triggers redo snapshot", null);
                return null;
            }
            Object obj = c09530e4.A00;
            C14360o3.A0B(obj, 0);
            ArrayList arrayList2 = c193658hl.A00;
            if (arrayList2.size() >= 20) {
                AnonymousClass016.A13(arrayList2);
                c193658hl.A02.Egh(Integer.valueOf(((Number) r1.getValue()).intValue() - 1));
            }
            arrayList2.add(new C09530e4(obj, A01));
            C05A c05a = c193658hl.A02;
            c05a.Egh(Integer.valueOf(((Number) c05a.getValue()).intValue() + 1));
        }
        clipsDraftRepository.A0N((C128175qm) c09530e4.A01);
        return c09530e4;
    }
}
