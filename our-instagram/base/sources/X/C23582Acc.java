package X;

import com.instagram.creation.drafts.model.clips.ClipsNetworkImportDraftRepository;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Acc, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23582Acc implements BDI {
    public final /* synthetic */ ClipsNetworkImportDraftRepository A00;
    public final /* synthetic */ C5Kv A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ InterfaceC16820sZ A03;

    @Override // X.BDI
    public final /* synthetic */ void DnM(List list) {
    }

    public C23582Acc(ClipsNetworkImportDraftRepository clipsNetworkImportDraftRepository, C5Kv c5Kv, String str, InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = clipsNetworkImportDraftRepository;
        this.A02 = str;
        this.A01 = c5Kv;
        this.A03 = interfaceC16820sZ;
    }

    @Override // X.BDI
    public final void onFailure() {
        this.A03.invoke();
    }

    @Override // X.BDI
    public final void onSuccess() {
        C81X A06;
        C22C A01 = AnonymousClass229.A01(this.A00.A01);
        String str = this.A02;
        Long l = this.A01.A01;
        ArrayList A1E = AbstractC166987dD.A1E();
        if (l != null && (A06 = AbstractC449424y.A06(l)) != null) {
            C0Zx c0Zx = new C0Zx();
            c0Zx.A01(A06, "tool");
            c0Zx.A05("segment_index", AbstractC167007dF.A0d());
            A1E.add(c0Zx);
        }
        C22C.A0D(A01, str, A1E, false);
        this.A03.invoke();
    }
}
