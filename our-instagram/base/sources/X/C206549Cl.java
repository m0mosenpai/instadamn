package X;

import com.instagram.comments.mvvm.data.network.MediaParentCommentNetworkFetcherKt;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel;

/* renamed from: X.9Cl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206549Cl extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public boolean A08;
    public final int A09 = 0;

    public C206549Cl(InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        if (this.A09 != 0) {
            this.A06 = obj;
            this.A00 |= Integer.MIN_VALUE;
            return ClipsCreationDraftViewModel.A03((ClipsCreationDraftViewModel) this.A07, null, this, null, false, false, false);
        }
        this.A07 = obj;
        this.A00 |= Integer.MIN_VALUE;
        return MediaParentCommentNetworkFetcherKt.A01(null, null, null, null, null, this, null, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C206549Cl(ClipsCreationDraftViewModel clipsCreationDraftViewModel, InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A07 = clipsCreationDraftViewModel;
    }
}
